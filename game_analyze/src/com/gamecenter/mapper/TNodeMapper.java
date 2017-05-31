package com.gamecenter.mapper;

import com.gamecenter.model.TNode;
import com.gamecenter.model.TNodeExample;
import com.gamecenter.parBean.Par_node;
import com.gamecenter.parBean.Par_userNode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TNodeMapper {
	int countByExample(TNodeExample example);
	
	int deleteByExample(TNodeExample example);
	
	int deleteByPrimaryKey(Integer nodeid);
	
	int insert(TNode record);
	
	int insertSelective(TNode record);
	
	List<TNode> selectByExample(TNodeExample example);
	
	TNode selectByPrimaryKey(Integer nodeid);
	
	int updateByExampleSelective(@Param("record") TNode record, @Param("example") TNodeExample example);
	
	int updateByExample(@Param("record") TNode record, @Param("example") TNodeExample example);
	
	int updateByPrimaryKeySelective(TNode record);
	
	int updateByPrimaryKey(TNode record);
	
	List<Par_node> selectByExampleGetPag(TNodeExample example);
	
	List<Par_node> selectListNode();
	
	/**
	 * 获取用户权限范围的节点
	 * 
	 * @param par_userNode
	 * @return
	 */
	List<TNode> selectUserNode(Par_userNode par_userNode);
}