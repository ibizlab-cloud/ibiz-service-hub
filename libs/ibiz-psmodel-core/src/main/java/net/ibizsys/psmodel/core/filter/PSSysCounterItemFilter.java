package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCOUNTERITEM 过滤器对象
 */
public class PSSysCounterItemFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysCounterItemFilter(){
    
    }      

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCounterItemFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", EQ, value);
        return this;
    }

    /**
     * 设置属性[计数项标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCounterItemFilter pssyscounteritemname__eq(String value){
        this.setFieldCond("pssyscounteritemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[计数项标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCounterItemFilter pssyscounteritemname__like(String value){
        this.setFieldCond("pssyscounteritemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCounterItemFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCounterItemFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", LIKE, value);
        return this;
    }

}
