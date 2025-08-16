package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDTABLERS 过滤器对象
 */
public class PSSysBDTableRSFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDTableRSFilter(){
    
    }      

    /**
     * 设置属性[主关系代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter majorpssysbdtableid__eq(String value){
        this.setFieldCond("majorpssysbdtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter majorpssysbdtablename__eq(String value){
        this.setFieldCond("majorpssysbdtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter majorpssysbdtablename__like(String value){
        this.setFieldCond("majorpssysbdtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[从数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter minorpssysbdtableid__eq(String value){
        this.setFieldCond("minorpssysbdtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter minorpssysbdtablename__eq(String value){
        this.setFieldCond("minorpssysbdtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[从数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter minorpssysbdtablename__like(String value){
        this.setFieldCond("minorpssysbdtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter psderid__eq(String value){
        this.setFieldCond("psderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdtablersname__eq(String value){
        this.setFieldCond("pssysbdtablersname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter pssysbdtablersname__like(String value){
        this.setFieldCond("pssysbdtablersname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableRSFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
