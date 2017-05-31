package com.gamecenter.mapper;

import com.gamecenter.model.OpOssQlzPassportReg;
import com.gamecenter.model.OpOssQlzPassportRegExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpOssQlzPassportRegMapper {
	int countByExample(OpOssQlzPassportRegExample example);
	
	int deleteByExample(OpOssQlzPassportRegExample example);
	
	int deleteByPrimaryKey(String openid);
	
	int insert(OpOssQlzPassportReg record);
	
	int insertSelective(OpOssQlzPassportReg record);
	
	List<OpOssQlzPassportReg> selectByExample(OpOssQlzPassportRegExample example);
	
	OpOssQlzPassportReg selectByPrimaryKey(String openid);
	
	int updateByExampleSelective(@Param("record") OpOssQlzPassportReg record, @Param("example") OpOssQlzPassportRegExample example);
	
	int updateByExample(@Param("record") OpOssQlzPassportReg record, @Param("example") OpOssQlzPassportRegExample example);
	
	int updateByPrimaryKeySelective(OpOssQlzPassportReg record);
	
	int updateByPrimaryKey(OpOssQlzPassportReg record);
	
	int addLoginCount(String openid);
}