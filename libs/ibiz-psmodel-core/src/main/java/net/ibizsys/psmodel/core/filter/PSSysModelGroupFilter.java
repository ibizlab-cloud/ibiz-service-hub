package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMODELGROUP 过滤器对象
 */
public class PSSysModelGroupFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysModelGroupFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssysmodelgroupname__eq(String value){
        this.setFieldCond("pssysmodelgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模型组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行时类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter runtimetype__eq(String value){
        this.setFieldCond("runtimetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[同步模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter syncmode__eq(String value){
        this.setFieldCond("syncmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[模型来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter sysmodelfrom__eq(String value){
        this.setFieldCond("sysmodelfrom", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
