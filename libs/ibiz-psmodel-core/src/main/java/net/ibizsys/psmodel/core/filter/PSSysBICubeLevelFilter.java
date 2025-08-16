package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBELEVEL 过滤器对象
 */
public class PSSysBICubeLevelFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBICubeLevelFilter(){
    
    }      

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubedimensionid__eq(String value){
        this.setFieldCond("pssysbicubedimensionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubedimensionname__eq(String value){
        this.setFieldCond("pssysbicubedimensionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubedimensionname__like(String value){
        this.setFieldCond("pssysbicubedimensionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体维度层级名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubelevelname__eq(String value){
        this.setFieldCond("pssysbicubelevelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度层级名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubelevelname__like(String value){
        this.setFieldCond("pssysbicubelevelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[维度体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbihierarchyid__eq(String value){
        this.setFieldCond("pssysbihierarchyid", EQ, value);
        return this;
    }

    /**
     * 设置属性[维度体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbihierarchyname__eq(String value){
        this.setFieldCond("pssysbihierarchyname", EQ, value);
        return this;
    }

    /**
     * 设置属性[维度体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbihierarchyname__like(String value){
        this.setFieldCond("pssysbihierarchyname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[维度层级]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbilevelid__eq(String value){
        this.setFieldCond("pssysbilevelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[维度层级]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbilevelname__eq(String value){
        this.setFieldCond("pssysbilevelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[维度层级]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbilevelname__like(String value){
        this.setFieldCond("pssysbilevelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
