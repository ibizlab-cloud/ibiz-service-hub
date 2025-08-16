package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDMODULE 过滤器对象
 */
public class PSSysBDModuleFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDModuleFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模块名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter pssysbdmodulename__eq(String value){
        this.setFieldCond("pssysbdmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[模块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter pssysbdmodulename__like(String value){
        this.setFieldCond("pssysbdmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDModuleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
