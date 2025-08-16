package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMODELGROUP 过滤器对象
 */
public class PSSysModelGroupFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysModelGroupFilter(){
    
    }      

    /**
     * 设置属性[系统模型组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssysmodelgroupname__like(String value){
        this.setFieldCond("pssysmodelgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[同步模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter syncmode__eq(String value){
        this.setFieldCond("syncmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模型来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter sysmodelfrom__eq(String value){
        this.setFieldCond("sysmodelfrom", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysModelGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
