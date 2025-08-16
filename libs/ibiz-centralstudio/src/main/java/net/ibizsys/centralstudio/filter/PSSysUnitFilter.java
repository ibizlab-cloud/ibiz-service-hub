package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUNIT 过滤器对象
 */
public class PSSysUnitFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysUnitFilter(){
    
    }      

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter namepslanguageresid__eq(String value){
        this.setFieldCond("namepslanguageresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter namepslanguageresname__eq(String value){
        this.setFieldCond("namepslanguageresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter namepslanguageresname__like(String value){
        this.setFieldCond("namepslanguageresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[单位名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssysunitname__like(String value){
        this.setFieldCond("pssysunitname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psunitid__eq(String value){
        this.setFieldCond("psunitid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psunitname__eq(String value){
        this.setFieldCond("psunitname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置单位]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psunitname__like(String value){
        this.setFieldCond("psunitname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
