package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREQITEMHIS 过滤器对象
 */
public class PSSysReqItemHisFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysReqItemHisFilter(){
    
    }      

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemhisname__like(String value){
        this.setFieldCond("pssysreqitemhisname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysReqItemHisFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
