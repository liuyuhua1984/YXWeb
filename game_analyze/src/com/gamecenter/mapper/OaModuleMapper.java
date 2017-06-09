package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OaModule;
import com.gamecenter.model.OaModuleExample;

public interface OaModuleMapper {
	int countByExample(OaModuleExample example);
	
	int deleteByExample(OaModuleExample example);
	
	int deleteByPrimaryKey(Integer mid);
	
	int insert(OaModule record);
	
	int insertSelective(OaModule record);
	
	List<OaModule> selectByExample(OaModuleExample example);
	
	OaModule selectByPrimaryKey(Integer mid);
	
	int updateByExampleSelective(@Param("record") OaModule record, @Param("example") OaModuleExample example);
	
	int updateByExample(@Param("record") OaModule record, @Param("example") OaModuleExample example);
	
	int updateByPrimaryKeySelective(OaModule record);
	
	int updateByPrimaryKey(OaModule record);
	
	/**
	 * 获取模块及对应的权限功能列表
	 * 
	 * @return
	 */
	List<OaModule> getModuleActions();
	
	/**
	 * 根据权限串，获取对于的模块列表
	 * 
	 * @param map permitIds
	 * @return
	 */
	List<OaModule> getModelListByPermitIds(Map map);
	
	/**
	 * 根据mids和深度，获取对于的模块列表
	 * 
	 * @param map permitIds
	 * @return
	 */
	List<OaModule> getModelListByMidsByLevel(Map map);
	
	/**
	 * 根据mids和父ID，获取对于的模块列表
	 * 
	 * @param map permitIds
	 * @return
	 */
	List<OaModule> getModelListByMidsByPid(Map map);
	
}