package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDTABLERS 过滤器对象
 */
public class PSSysBDTableRSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBDTableRSFilter(){
    
    }      

    /**
     * 设置属性[主数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter majorpssysbdtableid__eq(String value){
        this.setFieldCond("majorpssysbdtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter majorpssysbdtablename__eq(String value){
        this.setFieldCond("majorpssysbdtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter majorpssysbdtablename__like(String value){
        this.setFieldCond("majorpssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[从数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter minorpssysbdtableid__eq(String value){
        this.setFieldCond("minorpssysbdtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter minorpssysbdtablename__eq(String value){
        this.setFieldCond("minorpssysbdtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter minorpssysbdtablename__like(String value){
        this.setFieldCond("minorpssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdtablersname__like(String value){
        this.setFieldCond("pssysbdtablersname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
