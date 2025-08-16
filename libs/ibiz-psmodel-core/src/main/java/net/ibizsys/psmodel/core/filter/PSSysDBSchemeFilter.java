package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBSCHEME 过滤器对象
 */
public class PSSysDBSchemeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDBSchemeFilter(){
    
    }      

    /**
     * 设置属性[认证模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter authmode__eq(String value){
        this.setFieldCond("authmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter dslink__eq(String value){
        this.setFieldCond("dslink", EQ, value);
        return this;
    }

    /**
     * 设置属性[对象名称转换]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter objnamecase__eq(String value){
        this.setFieldCond("objnamecase", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库体系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdbschemename__eq(String value){
        this.setFieldCond("pssysdbschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
