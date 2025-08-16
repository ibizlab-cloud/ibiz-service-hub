package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTEMDBCFG 过滤器对象
 */
public class PSSystemDBCfgFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSystemDBCfgFilter(){
    
    }      

    /**
     * 设置属性[云平台数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdbdevinstid__eq(String value){
        this.setFieldCond("no2psdbdevinstid", EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdbdevinstname__eq(String value){
        this.setFieldCond("no2psdbdevinstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[云平台数据库实例2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdbdevinstname__like(String value){
        this.setFieldCond("no2psdbdevinstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdcdbinstid__eq(String value){
        this.setFieldCond("no2psdcdbinstid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdcdbinstname__eq(String value){
        this.setFieldCond("no2psdcdbinstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据库实例2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter no2psdcdbinstname__like(String value){
        this.setFieldCond("no2psdcdbinstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[空值排序]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter nullvalorder__eq(String value){
        this.setFieldCond("nullvalorder", EQ, value);
        return this;
    }

    /**
     * 设置属性[对象名称转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter objnamecase__eq(String value){
        this.setFieldCond("objnamecase", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdbdevinstid__eq(String value){
        this.setFieldCond("psdbdevinstid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdbdevinstname__eq(String value){
        this.setFieldCond("psdbdevinstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发数据库实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdbdevinstname__like(String value){
        this.setFieldCond("psdbdevinstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdevcenterdbinstid__eq(String value){
        this.setFieldCond("psdevcenterdbinstid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdevcenterdbinstname__eq(String value){
        this.setFieldCond("psdevcenterdbinstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter psdevcenterdbinstname__like(String value){
        this.setFieldCond("psdevcenterdbinstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemdbcfgname__eq(String value){
        this.setFieldCond("pssystemdbcfgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemdbcfgname__like(String value){
        this.setFieldCond("pssystemdbcfgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSystemDBCfgFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
