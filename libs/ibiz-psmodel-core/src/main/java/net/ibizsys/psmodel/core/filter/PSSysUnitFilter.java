package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUNIT 过滤器对象
 */
public class PSSysUnitFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysUnitFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter namepslanguageresid__eq(String value){
        this.setFieldCond("namepslanguageresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter namepslanguageresname__eq(String value){
        this.setFieldCond("namepslanguageresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter namepslanguageresname__like(String value){
        this.setFieldCond("namepslanguageresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[单位名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssysunitname__eq(String value){
        this.setFieldCond("pssysunitname", EQ, value);
        return this;
    }

    /**
     * 设置属性[单位名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter pssysunitname__like(String value){
        this.setFieldCond("pssysunitname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psunitid__eq(String value){
        this.setFieldCond("psunitid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psunitname__eq(String value){
        this.setFieldCond("psunitname", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置单位]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter psunitname__like(String value){
        this.setFieldCond("psunitname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUnitFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
