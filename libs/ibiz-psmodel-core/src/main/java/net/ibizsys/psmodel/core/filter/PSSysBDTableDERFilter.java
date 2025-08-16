package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDTABLEDER 过滤器对象
 */
public class PSSysBDTableDERFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDTableDERFilter(){
    
    }      

    /**
     * 设置属性[关系级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter derlevel__eq(Integer value){
        this.setFieldCond("derlevel", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter psderid__eq(String value){
        this.setFieldCond("psderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter pssysbdtabledername__eq(String value){
        this.setFieldCond("pssysbdtabledername", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter pssysbdtabledername__like(String value){
        this.setFieldCond("pssysbdtabledername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDERFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
