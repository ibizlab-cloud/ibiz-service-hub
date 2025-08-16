package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBPROCPARAM 过滤器对象
 */
public class PSSysDBProcParamFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDBProcParamFilter(){
    
    }      

    /**
     * 设置属性[参数方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter paramdir__eq(Integer value){
        this.setFieldCond("paramdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[存储过程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocid__eq(String value){
        this.setFieldCond("pssysdbprocid", EQ, value);
        return this;
    }

    /**
     * 设置属性[存储过程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocname__eq(String value){
        this.setFieldCond("pssysdbprocname", EQ, value);
        return this;
    }

    /**
     * 设置属性[存储过程]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocname__like(String value){
        this.setFieldCond("pssysdbprocname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocparamname__eq(String value){
        this.setFieldCond("pssysdbprocparamname", EQ, value);
        return this;
    }

    /**
     * 设置属性[参数名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocparamname__like(String value){
        this.setFieldCond("pssysdbprocparamname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
