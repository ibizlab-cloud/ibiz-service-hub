package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDATASYNCAGENT 过滤器对象
 */
public class PSSysDataSyncAgentFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDataSyncAgentFilter(){
    
    }      

    /**
     * 设置属性[代理类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter agenttype__eq(String value){
        this.setFieldCond("agenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[认证模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter authmode__eq(String value){
        this.setFieldCond("authmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[同步代理名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssysdatasyncagentname__like(String value){
        this.setFieldCond("pssysdatasyncagentname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据同步方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter syncdir__eq(String value){
        this.setFieldCond("syncdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDataSyncAgentFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
