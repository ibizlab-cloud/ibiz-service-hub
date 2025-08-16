package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDBCFG 过滤器对象
 */
public class PSDEDBCfgFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDBCfgFilter(){
    
    }      

    /**
     * 设置属性[对象名称转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBCfgFilter objnamecase__eq(String value){
        this.setFieldCond("objnamecase", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBCfgFilter psdedbcfgname__eq(String value){
        this.setFieldCond("psdedbcfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBCfgFilter psdedbcfgname__like(String value){
        this.setFieldCond("psdedbcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBCfgFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBCfgFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBCfgFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBCfgFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
