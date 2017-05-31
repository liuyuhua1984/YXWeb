package com.gamecenter.sysmanage.service;

import com.gamecenter.sysmanage.mapper.OaActionMapper;
import com.gamecenter.sysmanage.mapper.OaModuleMapper;
import com.gamecenter.sysmanage.mapper.OaPermitDetailMapper;
import com.gamecenter.sysmanage.mapper.OaPermitMapper;
import com.gamecenter.sysmanage.model.*;
import com.gamecenter.sysmanage.parBean.PermitAction;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-6-19 Time: 下午8:27 To change this template use File | Settings | File Templates.
 */
@Repository
public class ModuleServiceImpl implements ModuleService {
	@Resource
	OaModuleMapper oaModuleMapper;
	@Resource
	OaActionMapper oaActionMapper;
	@Resource
	OaPermitMapper oaPermitMapper;
	@Resource
	OaPermitDetailMapper oaPermitDetailMapper;
	
	@PostConstruct
	public void init() {
		cacheData();
	}
	
	public boolean cacheData() {
		modules.clear();
		List<OaModule> oaModules = getModuleDetailList();
		for (OaModule oaModule : oaModules) {
			modules.put(oaModule.getModuleurl(), oaModule);
		}
		return true;
	}
	
	public List<OaModule> getModuleList() {
		OaModuleExample oaModuleExample = new OaModuleExample();
		oaModuleExample.setOrderByClause("pid asc");
		List<OaModule> oaModules = oaModuleMapper.selectByExample(oaModuleExample);
		return oaModules;
	}
	
	public int addModule(OaModule oaModule) {
		int num = oaModuleMapper.insertSelective(oaModule);
		// 设置joinid level
		if (oaModule.getMid() != null) {
			if (oaModule.getPid() == null || oaModule.getPid().intValue() == 0) {
				oaModule.setJoinid(oaModule.getMid() + "");
			} else {
				OaModule pmobj = oaModuleMapper.selectByPrimaryKey(oaModule.getPid());
				oaModule.setJoinid(pmobj.getJoinid() + "_" + oaModule.getMid());
				oaModule.setLevel(pmobj.getLevel() + 1);
			}
			oaModuleMapper.updateByPrimaryKeySelective(oaModule);
		}
		
		// 设置模块的入口方法 see
		if (oaModule.getType().equals("0")) { // 确定叶子节点
			OaAction oaAction = new OaAction();
			oaAction.setActioncode("see");
			oaAction.setActionname("查看");
			oaAction.setSort(1);
			oaAction.setInfo("入口方法");
			addAction(oaAction, oaModule.getMid());
		}
		
		return num;
	}
	
	public OaModule getModule(int mid) {
		OaModule oaModule = oaModuleMapper.selectByPrimaryKey(mid);
		return oaModule;
	}
	
	public int updateModule(OaModule oaModule) {
		int num = oaModuleMapper.updateByPrimaryKeySelective(oaModule);
		return num;
	}
	
	public int delModuleAndChild(int mid) {
		int num = oaModuleMapper.deleteByPrimaryKey(mid);
		
		// 删除模块
		List<OaModule> mobjs = new ArrayList<OaModule>();
		getModuleListAndChild(mid, mobjs);
		for (OaModule oaModule : mobjs) {
			num += oaModuleMapper.deleteByPrimaryKey(oaModule.getMid());
		}
		
		// 删除基本权限
		List<Integer> mids = new ArrayList<Integer>();
		for (OaModule oaModule : mobjs) {
			mids.add(oaModule.getMid());
		}
		if (mids.size() > 0) {
			OaPermitExample oaPermitExample = new OaPermitExample();
			OaPermitExample.Criteria criteria = oaPermitExample.createCriteria();
			criteria.andMidIn(mids);
			List<OaPermit> oaPermits = oaPermitMapper.selectByExample(oaPermitExample);
			oaPermitMapper.deleteByExample(oaPermitExample);
			
			// 删除模块功能
			List<Integer> aids = new ArrayList<Integer>();
			List<Integer> permitids = new ArrayList<Integer>();
			for (OaPermit oaPermit : oaPermits) {
				aids.add(oaPermit.getAid());
				permitids.add(oaPermit.getPermitid());
			}
			if (aids.size() > 0) {
				OaActionExample oaActionExample = new OaActionExample();
				OaActionExample.Criteria criteria2 = oaActionExample.createCriteria();
				criteria2.andAidIn(aids);
				oaActionMapper.deleteByExample(oaActionExample);
			}
			// 删除权限关系
			if (permitids.size() > 0) {
				OaPermitDetailExample oaPermitDetailExample = new OaPermitDetailExample();
				OaPermitDetailExample.Criteria criteria1 = oaPermitDetailExample.createCriteria();
				criteria1.andPermitidIn(permitids);
				oaPermitDetailMapper.deleteByExample(oaPermitDetailExample);
			}
		}
		return num;
	}
	
	public List<OaModule> getModuleListAndChild(int pid, List<OaModule> lists) {
		OaModuleExample oaModuleExample = new OaModuleExample();
		OaModuleExample.Criteria criteria = oaModuleExample.createCriteria();
		criteria.andPidEqualTo(pid);
		List<OaModule> oaModules = oaModuleMapper.selectByExample(oaModuleExample);
		for (OaModule obj : oaModules) {
			lists.add(obj);
			getModuleListAndChild(obj.getMid(), lists);
		}
		return lists;
	}
	
	public List<OaAction> getActionList(int mid) {
		List<OaAction> oaActions = oaPermitMapper.getActionListByMid(mid);
		return oaActions;
	}
	
	public OaAction getAction(int aid) {
		OaAction oaAction = oaActionMapper.selectByPrimaryKey(aid);
		
		OaPermitExample oaPermitExample = new OaPermitExample();
		OaPermitExample.Criteria criteria = oaPermitExample.createCriteria();
		criteria.andAidEqualTo(aid);
		List<OaPermit> oaPermits = oaPermitMapper.selectByExample(oaPermitExample);
		for (OaPermit oaPermit : oaPermits) {
			oaAction.setMid(oaPermit.getMid());
			break;
		}
		return oaAction;
	}
	
	public int addAction(OaAction oaAction, int mid) {
		int num = oaActionMapper.insertSelective(oaAction);
		OaPermit oaPermit = new OaPermit();
		oaPermit.setAid(oaAction.getAid());
		oaPermit.setMid(mid);
		num = oaPermitMapper.insertSelective(oaPermit);
		return num;
	}
	
	public int updateAction(OaAction oaAction) {
		int num = oaActionMapper.updateByPrimaryKeySelective(oaAction);
		return num;
	}
	
	public int delAction(int aid) {
		return 0; // To change body of implemented methods use File | Settings | File Templates.
	}
	
	public int delAction(String aids) {
		List<Integer> vals = new ArrayList<Integer>();
		String[] ids = aids.split(",");
		for (String aid : ids) {
			vals.add(Integer.parseInt(aid));
		}
		
		OaPermitExample oaPermitExample = new OaPermitExample();
		OaPermitExample.Criteria criteria = oaPermitExample.createCriteria();
		criteria.andAidIn(vals);
		int num = oaPermitMapper.deleteByExample(oaPermitExample);
		return num;
	}
	
	public List<OaModule> getModuleDetailList() {
		List<OaModule> oaModules = oaModuleMapper.getModuleActions();
		for (OaModule oaModule : oaModules) {
			if (oaModule.getActions() == null)
				continue;
			String[] actions = oaModule.getActions().split("#");
			for (String actstr : actions) {
				String str[] = actstr.split(",");
				PermitAction permitAction = new PermitAction();
				permitAction.setPermitid(str[0]);
				permitAction.setAid(str[1]);
				permitAction.setActionname(str[2]);
				permitAction.setActioncode(str[3]);
				oaModule.getActionList().add(permitAction);
			}
		}
		return oaModules;
	}
	
	public List<OaModule> getModelListByLevel(int level) {
		OaModuleExample oaModuleExample = new OaModuleExample();
		OaModuleExample.Criteria criteria = oaModuleExample.createCriteria();
		criteria.andLevelEqualTo(level);
		List<OaModule> oaModules = oaModuleMapper.selectByExample(oaModuleExample);
		return oaModules;
	}
	
}
