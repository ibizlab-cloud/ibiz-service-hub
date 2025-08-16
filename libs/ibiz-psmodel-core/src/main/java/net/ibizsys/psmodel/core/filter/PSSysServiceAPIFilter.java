package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSERVICEAPI 过滤器对象
 */
public class PSSysServiceAPIFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysServiceAPIFilter(){
    
    }      

    /**
     * 设置属性[接口级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter apilevel__eq(Integer value){
        this.setFieldCond("apilevel", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter apimode__eq(Integer value){
        this.setFieldCond("apimode", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter apitype__eq(String value){
        this.setFieldCond("apitype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defaultpsdeopprivid__eq(String value){
        this.setFieldCond("defaultpsdeopprivid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defaultpsdeopprivname__eq(String value){
        this.setFieldCond("defaultpsdeopprivname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认访问操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defaultpsdeopprivname__like(String value){
        this.setFieldCond("defaultpsdeopprivname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认建立行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defcreatereqmethod__eq(String value){
        this.setFieldCond("defcreatereqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defdeactionreqmethod__eq(String value){
        this.setFieldCond("defdeactionreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认结果集请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defdedatasetreqmethod__eq(String value){
        this.setFieldCond("defdedatasetreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认删除行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defdeletereqmethod__eq(String value){
        this.setFieldCond("defdeletereqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认获取草稿行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defgetdraftreqmethod__eq(String value){
        this.setFieldCond("defgetdraftreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认获取行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defgetreqmethod__eq(String value){
        this.setFieldCond("defgetreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认查询请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defselectreqmethod__eq(String value){
        this.setFieldCond("defselectreqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认更新行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defupdatereqmethod__eq(String value){
        this.setFieldCond("defupdatereqmethod", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter depssyssfpluginid__eq(String value){
        this.setFieldCond("depssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter depssyssfpluginname__eq(String value){
        this.setFieldCond("depssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter depssyssfpluginname__like(String value){
        this.setFieldCond("depssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter outpssystranslatorid__eq(String value){
        this.setFieldCond("outpssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter outpssystranslatorname__eq(String value){
        this.setFieldCond("outpssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[输出转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter outpssystranslatorname__like(String value){
        this.setFieldCond("outpssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预定义类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssahandlerid__eq(String value){
        this.setFieldCond("pssyssahandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssahandlername__eq(String value){
        this.setFieldCond("pssyssahandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssahandlername__like(String value){
        this.setFieldCond("pssyssahandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter servicetype__eq(String value){
        this.setFieldCond("servicetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
