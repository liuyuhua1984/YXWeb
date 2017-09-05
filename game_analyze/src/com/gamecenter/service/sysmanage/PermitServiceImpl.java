package com.gamecenter.service.sysmanage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.OaModuleMapper;
import com.gamecenter.mapper.OaPermitDetailMapper;
import com.gamecenter.mapper.OaRoleMapper;
import com.gamecenter.mapper.OpAgentListMapper;
import com.gamecenter.model.OaModule;
import com.gamecenter.model.OaPermitDetail;
import com.gamecenter.model.OaPermitDetailExample;
import com.gamecenter.model.OaRole;
import com.gamecenter.model.OaUserPermit;
import com.gamecenter.sysmanage.parBean.PermitAction;
import com.gamecenter.sysmanage.parBean.PermitSet;


@Repository
public class PermitServiceImpl implements PermitService {
	@Resource
	OaRoleMapper oaRoleMapper;
	@Resource
	OaPermitDetailMapper oaPermitDetailMapper;
	@Resource
	UserService userService;
	@Resource
	OaModuleMapper oaModuleMapper;
	@Resource
	private OpAgentListMapper opAgentListMapper;
	
	private Logger logger = LoggerFactory.getLogger(PermitServiceImpl.class);
	public boolean initUserPermit(int uid) {
		return false;
	}
	
	public String getPrivilegeSourceName(int type, int sourceId) {
		String sourceName = "";
		if (type == 2) {
			OaRole oaRole = oaRoleMapper.selectByPrimaryKey(sourceId);
			if (oaRole != null)
				sourceName = oaRole.getRolename();
		}
		return sourceName;
	}
	
	/**
	 * 待优化的算法 -- 比较差异进行增加删除
	 * 
	 * @param permitSet
	 * @return
	 */
	public int savePermitSet(PermitSet permitSet) {
		int num = 0;
		// 批量删除
		delPermitDetail(permitSet.getType(), permitSet.getSourceid());
		
		// 新增
		if (permitSet.getPermits() != null) {
			for (String pid : permitSet.getPermits()) {
				OaPermitDetail oaPermitDetail = new OaPermitDetail();
				oaPermitDetail.setPermitid(Integer.parseInt(pid));
				oaPermitDetail.setSourceid(permitSet.getSourceid());
				oaPermitDetail.setType(permitSet.getType());
				num += oaPermitDetailMapper.insertSelective(oaPermitDetail);
			}
		}
		return num;
	}
	
	public List<Integer> getPermits(int type, int sourceId) {
		List<Integer> permitIds = new ArrayList<Integer>();
		OaPermitDetailExample oaPermitDetailExample = new OaPermitDetailExample();
		OaPermitDetailExample.Criteria criteria = oaPermitDetailExample.createCriteria();
		criteria.andTypeEqualTo(type);
		criteria.andSourceidEqualTo(sourceId);
		
		List<OaPermitDetail> oaPermitDetails = oaPermitDetailMapper.selectByExample(oaPermitDetailExample);
		for (OaPermitDetail oaPermitDetail : oaPermitDetails) {
			permitIds.add(oaPermitDetail.getPermitid());
		}
		return permitIds;
	}
	
	public int delPermitDetail(int type, int sourceId) {
		int num = 0;
		OaPermitDetailExample oaPermitDetailExample = new OaPermitDetailExample();
		OaPermitDetailExample.Criteria criteria = oaPermitDetailExample.createCriteria();
		criteria.andTypeEqualTo(type);
		criteria.andSourceidEqualTo(sourceId);
		num = oaPermitDetailMapper.deleteByExample(oaPermitDetailExample);
		return num;
	}
	
	public int delPermitDetail(int type, List<Integer> sourceIds) {
		int num = 0;
		OaPermitDetailExample oaPermitDetailExample = new OaPermitDetailExample();
		OaPermitDetailExample.Criteria criteria = oaPermitDetailExample.createCriteria();
		criteria.andTypeEqualTo(type);
		criteria.andSourceidIn(sourceIds);
		num = oaPermitDetailMapper.deleteByExample(oaPermitDetailExample);
		return num;
	}
	
	public List<Integer> getAllPermits(int uid) {
		List<Integer> permitIds = new ArrayList<Integer>();
		
		// 获取综合权限叠加
		List<Integer> tempIds = null;
		OaUserPermit oaUserPermit = userService.getUserPermit(uid);
		if (oaUserPermit != null) {
			if (oaUserPermit.getPgid() != null && oaUserPermit.getPgid().intValue() != 0) {
				tempIds = getPermits(1, oaUserPermit.getPgid());//sourceid
				permitIds.addAll(tempIds);
			}
			if (oaUserPermit.getRoleid() != null && oaUserPermit.getRoleid().intValue() != 0) {
				tempIds = getPermits(2, oaUserPermit.getRoleid());
				permitIds.addAll(tempIds);
			}
			if (oaUserPermit.getDeptid() != null && oaUserPermit.getDeptid().intValue() != 0) {
				tempIds = getPermits(3, oaUserPermit.getDeptid());
				permitIds.addAll(tempIds);
			}
			if (oaUserPermit.getPosid() != null && oaUserPermit.getPosid().intValue() != 0) {
				tempIds = getPermits(4, oaUserPermit.getPosid());
				permitIds.addAll(tempIds);
			}
		}
		tempIds = getPermits(5, uid); // 账号权限
		permitIds.addAll(tempIds);
		
		return permitIds;
	}
	
	public boolean checkUserPermit(String url, String actionCode, int uid) {
		boolean res = false;
		OaModule oaModule = ModuleService.modules.get(url);
		
		int permitId = 0;
		for (PermitAction permitAction : oaModule.getActionList()) {
			if (permitAction.getActioncode().equals(actionCode)) {
				permitId = Integer.parseInt(permitAction.getPermitid());
				break;
			}
		}
		List<Integer> permitIds = getAllPermits(uid);
		if (permitIds.contains(permitId)) {
			return true;
		}
		return res;
	}
	
	public List<OaModule> getModuleListByUser(int uid, int level) {
		
		List<OaModule> oaModules = new ArrayList<OaModule>();
		// 获取用户权限IDs
		List<Integer> permitIds = getAllPermits(uid);
		String str = "";
		for (int id : permitIds) {
			str += id + ",";
		}
		if (str.length() > 0)
			str = str.substring(0, str.length() - 1);
		
		if (str.length() > 0) {
			// 获取权限对于的模块列表
			Map map = new HashMap();
			map.put("permitIds", str);
			oaModules = oaModuleMapper.getModelListByPermitIds(map);
			
			// 处理的权限的模块的父模块
			List<String> mids = new ArrayList<String>();
			String tempJoinIds = "";
			for (OaModule oaModule : oaModules) {
				tempJoinIds = oaModule.getJoinid();
				String ids[] = tempJoinIds.split("_");
				for (String id : ids) {
					if (!mids.contains(id))
						mids.add(id);
				}
			}
			
			str = "";
			for (String id : mids) {
				str += id + ",";
			}
			if (str.length() > 0)
				str = str.substring(0, str.length() - 1);
			if (str.length() > 0) {
				// 获取对应深度的模块列表
				map.clear();
				map.put("level", level);
				map.put("mids", str);
				oaModules = oaModuleMapper.getModelListByMidsByLevel(map);
			} else {
				oaModules = null;
			}
		}
		
		return oaModules;
	}
	
	public List<OaModule> getModuleListByUserByPid(int uid, int pid) {
		// 获取用户权限IDs
		List<Integer> permitIds = getAllPermits(uid);
		String str = "";
		for (int id : permitIds) {
			str += id + ",";
		}
		if (str.length() > 0)
			str = str.substring(0, str.length() - 1);
		
		// 获取权限对于的模块列表
		Map map = new HashMap();
		map.put("permitIds", str);
		List<OaModule> oaModules = oaModuleMapper.getModelListByPermitIds(map);
		
		// 处理的权限的模块的父模块
		List<String> mids = new ArrayList<String>();
		String tempJoinIds = "";
		for (OaModule oaModule : oaModules) {
			tempJoinIds = oaModule.getJoinid();
			String ids[] = tempJoinIds.split("_");
			for (String id : ids) {
				if (!mids.contains(id))
					mids.add(id);
			}
		}
		
		str = "";
		for (String id : mids) {
			str += id + ",";
		}
		if (str.length() > 0)
			str = str.substring(0, str.length() - 1);
		
		// 获取对应深度的模块列表
		map.clear();
		map.put("pid", "'" + pid + "%'");
		map.put("mids", str);
		oaModules = oaModuleMapper.getModelListByMidsByPid(map);
		//logger.error("map::"+map.toString());
		return oaModules;
	}
}
