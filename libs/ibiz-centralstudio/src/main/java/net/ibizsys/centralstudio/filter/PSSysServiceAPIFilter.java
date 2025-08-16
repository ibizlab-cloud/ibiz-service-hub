package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSERVICEAPI 过滤器对象
 */
public class PSSysServiceAPIFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysServiceAPIFilter(){
    
    }      

    /**
     * 设置属性[接口级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter apilevel__eq(Integer value){
        this.setFieldCond("apilevel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter apimode__eq(Integer value){
        this.setFieldCond("apimode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter apitype__eq(String value){
        this.setFieldCond("apitype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defaultpsdeopprivid__eq(String value){
        this.setFieldCond("defaultpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认访问操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defaultpsdeopprivname__eq(String value){
        this.setFieldCond("defaultpsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认访问操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defaultpsdeopprivname__like(String value){
        this.setFieldCond("defaultpsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认建立行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defcreatereqmethod__eq(String value){
        this.setFieldCond("defcreatereqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defdeactionreqmethod__eq(String value){
        this.setFieldCond("defdeactionreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认结果集请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defdedatasetreqmethod__eq(String value){
        this.setFieldCond("defdedatasetreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认删除行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defdeletereqmethod__eq(String value){
        this.setFieldCond("defdeletereqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认获取行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defgetreqmethod__eq(String value){
        this.setFieldCond("defgetreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认查询请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defselectreqmethod__eq(String value){
        this.setFieldCond("defselectreqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认更新行为请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter defupdatereqmethod__eq(String value){
        this.setFieldCond("defupdatereqmethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter depssyssfpluginid__eq(String value){
        this.setFieldCond("depssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter depssyssfpluginname__eq(String value){
        this.setFieldCond("depssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter depssyssfpluginname__like(String value){
        this.setFieldCond("depssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预定义类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssahandlerid__eq(String value){
        this.setFieldCond("pssyssahandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssahandlername__eq(String value){
        this.setFieldCond("pssyssahandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口处理器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssahandlername__like(String value){
        this.setFieldCond("pssyssahandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[服务类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter servicetype__eq(String value){
        this.setFieldCond("servicetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysServiceAPIFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
