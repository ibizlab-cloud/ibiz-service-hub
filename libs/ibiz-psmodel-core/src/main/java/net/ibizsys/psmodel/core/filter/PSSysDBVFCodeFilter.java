package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBVFCODE 过滤器对象
 */
public class PSSysDBVFCodeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDBVFCodeFilter(){
    
    }      

    /**
     * 设置属性[数据库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBVFCodeFilter dbtype__eq(String value){
        this.setFieldCond("dbtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[函数名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBVFCodeFilter pssysdbvfcodename__eq(String value){
        this.setFieldCond("pssysdbvfcodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[函数名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBVFCodeFilter pssysdbvfcodename__like(String value){
        this.setFieldCond("pssysdbvfcodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库值函数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBVFCodeFilter pssysdbvfid__eq(String value){
        this.setFieldCond("pssysdbvfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库值函数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBVFCodeFilter pssysdbvfname__eq(String value){
        this.setFieldCond("pssysdbvfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库值函数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBVFCodeFilter pssysdbvfname__like(String value){
        this.setFieldCond("pssysdbvfname", LIKE, value);
        return this;
    }

}
