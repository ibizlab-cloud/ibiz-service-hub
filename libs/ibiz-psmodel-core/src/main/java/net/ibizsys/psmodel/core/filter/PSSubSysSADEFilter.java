package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSADE 过滤器对象
 */
public class PSSubSysSADEFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSubSysSADEFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[预定义类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口实体名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssubsyssadename__eq(String value){
        this.setFieldCond("pssubsyssadename", EQ, value);
        return this;
    }

    /**
     * 设置属性[接口实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssubsyssadename__like(String value){
        this.setFieldCond("pssubsyssadename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssubsysserviceapiid__eq(String value){
        this.setFieldCond("pssubsysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssubsysserviceapiname__eq(String value){
        this.setFieldCond("pssubsysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[外部服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssubsysserviceapiname__like(String value){
        this.setFieldCond("pssubsysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[同步模型模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter syncmodelmode__eq(String value){
        this.setFieldCond("syncmodelmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADEFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
