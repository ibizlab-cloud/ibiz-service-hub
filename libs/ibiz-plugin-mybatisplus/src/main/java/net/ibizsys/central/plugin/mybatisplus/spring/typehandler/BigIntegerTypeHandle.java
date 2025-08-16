package net.ibizsys.central.plugin.mybatisplus.spring.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.math.BigInteger;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * BIGINT 转 long
 * 
 */
@MappedTypes({Object.class})
@MappedJdbcTypes(value = {JdbcType.BIGINT})
public class BigIntegerTypeHandle extends BaseTypeHandler<Object> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, parameter);
    }

    @Override
    public Object getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Object result = rs.getObject(columnName);
        return rs.wasNull() ? null : dealResult(result);
    }

    @Override
    public Object getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Object result = rs.getObject(columnIndex);
        return rs.wasNull() ? null : dealResult(result);
    }

    @Override
    public Object getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Object result = cs.getObject(columnIndex);
        return cs.wasNull() ? null : dealResult(result);
    }

    /**
     * @param result
     * @return
     * @throws SQLException
     */
    private Object dealResult(Object result) throws SQLException {
        if (result instanceof BigInteger) {
            return ((BigInteger) result).longValue();
        }  else{
            return result;
        }
    }
}