package com.gamecenter.parBean;

import org.apache.ibatis.type.JdbcType;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.sql.*;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 13-2-19 Time: 下午5:08 To change this template use File | Settings | File Templates.
 */
public class MyBlobTypeHandler {
	// ###指定字符集
	private static final String DEFAULT_CHARSET = "utf-8";
	
	public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
		ByteArrayInputStream bis;
		try {
			// ###把String转化成byte流
			bis = new ByteArrayInputStream(parameter.getBytes(DEFAULT_CHARSET));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("Blob Encoding Error!");
		}
		ps.setBinaryStream(i, bis, parameter.length());
	}
	
	public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
		Blob blob = rs.getBlob(columnName);
		byte[] returnValue = null;
		if (null != blob) {
			returnValue = blob.getBytes(1, (int) blob.length());
		}
		try {
			// ###把byte转化成string
			return new String(returnValue, DEFAULT_CHARSET);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("Blob Encoding Error!");
		}
	}
	
	public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		Blob blob = cs.getBlob(columnIndex);
		byte[] returnValue = null;
		if (null != blob) {
			returnValue = blob.getBytes(1, (int) blob.length());
		}
		try {
			return new String(returnValue, DEFAULT_CHARSET);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("Blob Encoding Error!");
		}
	}
}
