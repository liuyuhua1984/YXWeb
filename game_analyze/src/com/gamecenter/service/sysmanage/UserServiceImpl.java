package com.gamecenter.service.sysmanage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.gamecenter.mapper.OaUserMapper;
import com.gamecenter.mapper.OaUserPermitMapper;
import com.gamecenter.model.OaUser;
import com.gamecenter.model.OaUserExample;
import com.gamecenter.model.OaUserPermit;
import com.gamecenter.model.OaUserPermitExample;

/**
 * Created with IntelliJ IDEA. User: gsb Date: 14-7-3 Time: 下午2:17 To change this template use File | Settings | File Templates.
 */
@Repository
public class UserServiceImpl implements UserService {
	@Resource
	OaUserMapper oaUserMapper;
	@Resource
	OaUserPermitMapper oaUserPermitMapper;
	
	public List<OaUser> getUserList() {
		List<OaUser> oaUsers = oaUserMapper.selectByExample(new OaUserExample());
		return oaUsers;
	}
	
	public OaUser getUser(int uid) {
		OaUser oaUser = oaUserMapper.selectByPrimaryKey(uid);
		return oaUser;
	}
	
	public int savaUser(OaUser oaUser) {
		int num = 0;
		if (oaUser.getUid() != null) {
			num = oaUserMapper.updateByPrimaryKeySelective(oaUser);
		} else {
			num = oaUserMapper.insertSelective(oaUser);
		}
		return num;
	}
	
	public int delUser(String uids) {
		int num = 0;
		String ids[] = uids.split(",");
		for (String uid : ids) {
			num += oaUserMapper.deleteByPrimaryKey(Integer.parseInt(uid));
		}
		return num;
	}
	
	public int shouquan(OaUserPermit oaUserPermit) {
		int num = 0;
		OaUserPermit oaUserPermit1 = oaUserPermitMapper.selectByPrimaryKey(oaUserPermit.getUid());
		if (oaUserPermit1 == null) {
			num = oaUserPermitMapper.insertSelective(oaUserPermit);
		} else {
			num = oaUserPermitMapper.updateByPrimaryKeySelective(oaUserPermit);
		}
		return num;
	}
	
	public OaUserPermit getUserPermit(int uid) {
		OaUserPermit oaUserPermit = oaUserPermitMapper.selectByPrimaryKey(uid);
		return oaUserPermit;
	}
	
	public int validateUser(String passport, String pwd, String ip) {
		OaUserExample oaUserExample = new OaUserExample();
		OaUserExample.Criteria criteria = oaUserExample.createCriteria();
		criteria.andPassportEqualTo(passport);
		criteria.andPwdEqualTo(pwd);
		
		int num = 0;
		List<OaUser> oaUsers = oaUserMapper.selectByExample(oaUserExample);
		for (OaUser oaUser : oaUsers) {
			num = oaUser.getUid();
			break;
		}
		return num;
	}
	
	public int clearUserRoleSet(int roleId) {
		OaUserPermitExample oaUserPermitExample = new OaUserPermitExample();
		OaUserPermitExample.Criteria criteria = oaUserPermitExample.createCriteria();
		criteria.andRoleidEqualTo(roleId);
		
		OaUserPermit oaUserPermit = new OaUserPermit();
		oaUserPermit.setRoleid(0);
		
		int num = oaUserPermitMapper.updateByExampleSelective(oaUserPermit, oaUserPermitExample);
		return num;
	}
	
	public int clearUserRoleSet(List<Integer> roleIds) {
		OaUserPermitExample oaUserPermitExample = new OaUserPermitExample();
		OaUserPermitExample.Criteria criteria = oaUserPermitExample.createCriteria();
		criteria.andRoleidIn(roleIds);
		
		OaUserPermit oaUserPermit = new OaUserPermit();
		oaUserPermit.setRoleid(0);
		
		int num = oaUserPermitMapper.updateByExampleSelective(oaUserPermit, oaUserPermitExample);
		return num;
	}
}
