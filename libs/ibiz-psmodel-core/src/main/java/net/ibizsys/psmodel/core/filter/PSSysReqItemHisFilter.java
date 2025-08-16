package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREQITEMHIS 过滤器对象
 */
public class PSSysReqItemHisFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysReqItemHisFilter(){
    
    }      

    /**
     * 设置属性[标题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemhisname__eq(String value){
        this.setFieldCond("pssysreqitemhisname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemhisname__like(String value){
        this.setFieldCond("pssysreqitemhisname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
