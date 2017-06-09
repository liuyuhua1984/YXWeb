package com.gamecenter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gamecenter.model.OpOssQlzPassport;
import com.gamecenter.model.OpOssQlzPassportExample;

public interface OpOssQlzPassportMapper {
    long countByExample(OpOssQlzPassportExample example);

    int deleteByExample(OpOssQlzPassportExample example);

    int deleteByPrimaryKey(String openid);

    int insert(OpOssQlzPassport record);

    int insertSelective(OpOssQlzPassport record);

    List<OpOssQlzPassport> selectByExample(OpOssQlzPassportExample example);

    OpOssQlzPassport selectByPrimaryKey(String openid);

    int updateByExampleSelective(@Param("record") OpOssQlzPassport record, @Param("example") OpOssQlzPassportExample example);

    int updateByExample(@Param("record") OpOssQlzPassport record, @Param("example") OpOssQlzPassportExample example);

    int updateByPrimaryKeySelective(OpOssQlzPassport record);

    int updateByPrimaryKey(OpOssQlzPassport record);

	/**
	 * 分页获取
	 * 
	 * @param example
	 * @return
	 */
	List<OpOssQlzPassport> getPageList(OpOssQlzPassportExample example);
	
	/**
	 * 新增登陆次数
	 * 
	 * @param openid
	 * @return
	 */
	int addLoginCount(String openid);
	
	/**
	 * 累计在线时长
	 * 
	 * @param map
	 * @return
	 */
	int addOnlineTime(Map map);
	
	/**
	 * 充值金币的累计
	 * 
	 * @param map
	 * @return
	 */
	int addTotalMoney(Map map);
	
	/**
	 * 累计消耗金币
	 * 
	 * @param map
	 * @return
	 */
	int addConsumeMoney(Map map);
	
	/**
	 * 获取账号openids列表
	 * 
	 * @return
	 */
	List<String> getPassportIdsStr(String wid);
	
	/**
	 * 加载所有的活跃账号(近7天内登录过的)
	 * 
	 * @return
	 */
	List<OpOssQlzPassport> getActivePassportList(String lastTime);
}