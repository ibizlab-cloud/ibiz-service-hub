package net.ibizsys.central.plugin.mybatisplus.spring.typehandler.oracle;

import oracle.sql.DATE;
import oracle.sql.TIMESTAMP;
import oracle.sql.TIMESTAMPLTZ;
import oracle.sql.TIMESTAMPTZ;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * 处理 Oracle timestamp 报错问题
 * 
 */
@MappedTypes({Object.class})
@MappedJdbcTypes(value = {JdbcType.TIMESTAMP})
public class OracleDateTypeHandle extends BaseTypeHandler<Object> {

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
        if (result instanceof TIMESTAMP) {
            return new Date(((TIMESTAMP) result).dateValue().getTime());
        } else if (result instanceof DATE) {
            return new Date(((DATE) result).dateValue().getTime());
        } else if (result instanceof TIMESTAMPLTZ) {
            return new Date(((TIMESTAMPLTZ) result).dateValue().getTime());
        } else if (result instanceof TIMESTAMPTZ) {
            return new Date(((TIMESTAMPTZ) result).dateValue().getTime());
        } else{
            return result;
        }
    }
}