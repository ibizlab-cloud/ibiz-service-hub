package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBELEVEL 过滤器对象
 */
public class PSSysBICubeLevelFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBICubeLevelFilter(){
    
    }      

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubedimensionid__eq(String value){
        this.setFieldCond("pssysbicubedimensionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubedimensionname__eq(String value){
        this.setFieldCond("pssysbicubedimensionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubedimensionname__like(String value){
        this.setFieldCond("pssysbicubedimensionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体维度层级名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbicubelevelname__like(String value){
        this.setFieldCond("pssysbicubelevelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[维度体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbihierarchyid__eq(String value){
        this.setFieldCond("pssysbihierarchyid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[维度体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbihierarchyname__eq(String value){
        this.setFieldCond("pssysbihierarchyname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[维度体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbihierarchyname__like(String value){
        this.setFieldCond("pssysbihierarchyname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[维度层级]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbilevelid__eq(String value){
        this.setFieldCond("pssysbilevelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[维度层级]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbilevelname__eq(String value){
        this.setFieldCond("pssysbilevelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[维度层级]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter pssysbilevelname__like(String value){
        this.setFieldCond("pssysbilevelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeLevelFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
