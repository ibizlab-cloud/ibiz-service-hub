package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSERVICEAPI 过滤器对象
 */
public class PSSubSysServiceAPIFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSubSysServiceAPIFilter(){
    
    }      

    /**
     * 设置属性[接口来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter apisource__eq(String value){
        this.setFieldCond("apisource", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter apitype__eq(String value){
        this.setFieldCond("apitype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认建立行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defcreatereqmethod__eq(String value){
        this.setFieldCond("defcreatereqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defdeactionreqmethod__eq(String value){
        this.setFieldCond("defdeactionreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认结果集请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defdedatasetreqmethod__eq(String value){
        this.setFieldCond("defdedatasetreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认删除行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defdeletereqmethod__eq(String value){
        this.setFieldCond("defdeletereqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认获取草稿行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defgetdraftreqmethod__eq(String value){
        this.setFieldCond("defgetdraftreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认获取行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defgetreqmethod__eq(String value){
        this.setFieldCond("defgetreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认查询请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defselectreqmethod__eq(String value){
        this.setFieldCond("defselectreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认更新行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter defupdatereqmethod__eq(String value){
        this.setFieldCond("defupdatereqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter depssyssfpluginid__eq(String value){
        this.setFieldCond("depssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter depssyssfpluginname__eq(String value){
        this.setFieldCond("depssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter depssyssfpluginname__like(String value){
        this.setFieldCond("depssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预定义类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psdevslnsysapiid__eq(String value){
        this.setFieldCond("psdevslnsysapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psdevslnsysapiname__eq(String value){
        this.setFieldCond("psdevslnsysapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psdevslnsysapiname__like(String value){
        this.setFieldCond("psdevslnsysapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyseaischemeid__eq(String value){
        this.setFieldCond("pssyseaischemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyseaischemename__eq(String value){
        this.setFieldCond("pssyseaischemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统集成体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyseaischemename__like(String value){
        this.setFieldCond("pssyseaischemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssahandlerid__eq(String value){
        this.setFieldCond("pssyssahandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssahandlername__eq(String value){
        this.setFieldCond("pssyssahandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssahandlername__like(String value){
        this.setFieldCond("pssyssahandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter servicetype__eq(String value){
        this.setFieldCond("servicetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysServiceAPIFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
