package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSMODULE 过滤器对象
 */
public class PSModuleFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSModuleFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupid__eq(String value){
        this.setFieldCond("pssysmodelgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[ISNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupid__isnull(String value){
        this.setFieldCond("pssysmodelgroupid", ISNULL, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysrefid__eq(String value){
        this.setFieldCond("pssysrefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysrefname__eq(String value){
        this.setFieldCond("pssysrefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssysrefname__like(String value){
        this.setFieldCond("pssysrefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行时类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter runtimetype__eq(String value){
        this.setFieldCond("runtimetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[服务API模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter serviceapiflag__eq(Integer value){
        this.setFieldCond("serviceapiflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter subsysmodule__eq(Integer value){
        this.setFieldCond("subsysmodule", EQ, value);
        return this;
    }

    /**
     * 设置属性[子系统类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter sysreftype__eq(String value){
        this.setFieldCond("sysreftype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSModuleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
