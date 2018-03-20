package com.lw.imgdata.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

@MappedTypes(JSONObject.class)
public class JsonTypeHandler extends BaseTypeHandler {

    @Override
    public JSONObject getNullableResult(ResultSet rs,String columnName) throws SQLException {
        return JSON.parseObject(rs.getString(columnName));
    }

    @Override
    public JSONObject getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return JSON.parseObject(cs.getString(columnIndex));
    }
    @Override
	public Object getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
    	return JSON.parseObject(rs.getString(columnIndex));
	}
    /**
     * 插入数据是进行的操作
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i,Object parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.toJSONString(parameter).replace("(", "[").replace(")", "]"));
    }

	
}
/*
public class JsonTypeHandler extends BaseTypeHandler<JSONObject> {

	  @Override
	  public void setNonNullParameter(PreparedStatement ps, int i,JSONObject parameter, JdbcType jdbcType) throws SQLException {
		  if(parameter!=null){
			  ps.setString(i, parameter.toJSONString());
		  }else{
			  ps.setString(i, null);
		  }
	  }

	  @Override
	  public JSONObject getNullableResult(ResultSet rs, String columnName) throws SQLException {
	    return JSON.parseObject(rs.getString(columnName));
	  }

	  @Override
	  public JSONObject getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
	    return JSON.parseObject(rs.getString(columnIndex));
	  }
	  
	  @Override
	  public JSONObject getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
	    return JSON.parseObject(cs.getString(columnIndex));
	  }
}*/
