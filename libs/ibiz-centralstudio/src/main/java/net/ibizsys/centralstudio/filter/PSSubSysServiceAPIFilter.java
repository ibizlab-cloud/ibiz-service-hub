package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSERVICEAPI 过滤器对象
 */
public class PSSubSysServiceAPIFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSubSysServiceAPIFilter(){
    
    }      

    /**
     * 设置属性[接口来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter apisource__eq(String value){
        this.setFieldCond("apisource", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter apitype__eq(String value){
        this.setFieldCond("apitype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认建立行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defcreatereqmethod__eq(String value){
        this.setFieldCond("defcreatereqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defdeactionreqmethod__eq(String value){
        this.setFieldCond("defdeactionreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认结果集请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defdedatasetreqmethod__eq(String value){
        this.setFieldCond("defdedatasetreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认删除行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defdeletereqmethod__eq(String value){
        this.setFieldCond("defdeletereqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认获取行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defgetreqmethod__eq(String value){
        this.setFieldCond("defgetreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认查询请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defselectreqmethod__eq(String value){
        this.setFieldCond("defselectreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认更新行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defupdatereqmethod__eq(String value){
        this.setFieldCond("defupdatereqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter depssyssfpluginid__eq(String value){
        this.setFieldCond("depssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter depssyssfpluginname__eq(String value){
        this.setFieldCond("depssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter depssyssfpluginname__like(String value){
        this.setFieldCond("depssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预定义类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psdevslnsysapiid__eq(String value){
        this.setFieldCond("psdevslnsysapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psdevslnsysapiname__eq(String value){
        this.setFieldCond("psdevslnsysapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psdevslnsysapiname__like(String value){
        this.setFieldCond("psdevslnsysapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyseaischemeid__eq(String value){
        this.setFieldCond("pssyseaischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyseaischemename__eq(String value){
        this.setFieldCond("pssyseaischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyseaischemename__like(String value){
        this.setFieldCond("pssyseaischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssahandlerid__eq(String value){
        this.setFieldCond("pssyssahandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssahandlername__eq(String value){
        this.setFieldCond("pssyssahandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssahandlername__like(String value){
        this.setFieldCond("pssyssahandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter servicetype__eq(String value){
        this.setFieldCond("servicetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
