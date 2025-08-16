package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREQITEMDATA 过滤器对象
 */
public class PSSysReqItemDataFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysReqItemDataFilter(){
    
    }      

    /**
     * 设置属性[AI构建状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemDataFilter aibuildstate__eq(Integer value){
        this.setFieldCond("aibuildstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemDataFilter pssysreqitemdataname__eq(String value){
        this.setFieldCond("pssysreqitemdataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemDataFilter pssysreqitemdataname__like(String value){
        this.setFieldCond("pssysreqitemdataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemDataFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemDataFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemDataFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemDataFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
