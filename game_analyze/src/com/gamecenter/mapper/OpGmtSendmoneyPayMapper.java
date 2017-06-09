package com.gamecenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpGmtSendmoneyPay;
import com.gamecenter.model.OpGmtSendmoneyPayExample;

public interface OpGmtSendmoneyPayMapper {
	int countByExample(OpGmtSendmoneyPayExample example);
	
	int deleteByExample(OpGmtSendmoneyPayExample example);
	
	int deleteByPrimaryKey(String orderid);
	
	int insert(OpGmtSendmoneyPay record);
	
	int insertSelective(OpGmtSendmoneyPay record);
	
	List<OpGmtSendmoneyPay> selectByExample(OpGmtSendmoneyPayExample example);
	
	OpGmtSendmoneyPay selectByPrimaryKey(String orderid);
	
	int updateByExampleSelective(@Param("record") OpGmtSendmoneyPay record, @Param("example") OpGmtSendmoneyPayExample example);
	
	int updateByExample(@Param("record") OpGmtSendmoneyPay record, @Param("example") OpGmtSendmoneyPayExample example);
	
	int updateByPrimaryKeySelective(OpGmtSendmoneyPay record);
	
	int updateByPrimaryKey(OpGmtSendmoneyPay record);
	
	// 分页
	List<OpGmtSendmoneyPay> getPageList(OpGmtSendmoneyPayExample example);
	
	// 充值汇总
	double paycount(OpGmtSendmoneyPayExample example);
}