package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBSCHEME 过滤器对象
 */
public class PSSysDBSchemeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDBSchemeFilter(){
    
    }      

    /**
     * 设置属性[数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter dslink__eq(String value){
        this.setFieldCond("dslink", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库体系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBSchemeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
