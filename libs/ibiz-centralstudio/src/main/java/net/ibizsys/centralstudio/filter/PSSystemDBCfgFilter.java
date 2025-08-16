package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTEMDBCFG 过滤器对象
 */
public class PSSystemDBCfgFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSystemDBCfgFilter(){
    
    }      

    /**
     * 设置属性[云平台数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdbdevinstid__eq(String value){
        this.setFieldCond("no2psdbdevinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdbdevinstname__eq(String value){
        this.setFieldCond("no2psdbdevinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台数据库实例2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdbdevinstname__like(String value){
        this.setFieldCond("no2psdbdevinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdcdbinstid__eq(String value){
        this.setFieldCond("no2psdcdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdcdbinstname__eq(String value){
        this.setFieldCond("no2psdcdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdcdbinstname__like(String value){
        this.setFieldCond("no2psdcdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[空值排序]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter nullvalorder__eq(String value){
        this.setFieldCond("nullvalorder", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[对象名称转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter objnamecase__eq(String value){
        this.setFieldCond("objnamecase", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdbdevinstid__eq(String value){
        this.setFieldCond("psdbdevinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdbdevinstname__eq(String value){
        this.setFieldCond("psdbdevinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发数据库实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdbdevinstname__like(String value){
        this.setFieldCond("psdbdevinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdevcenterdbinstid__eq(String value){
        this.setFieldCond("psdevcenterdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdevcenterdbinstname__eq(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdevcenterdbinstname__like(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemdbcfgname__eq(String value){
        this.setFieldCond("pssystemdbcfgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemdbcfgname__like(String value){
        this.setFieldCond("pssystemdbcfgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
