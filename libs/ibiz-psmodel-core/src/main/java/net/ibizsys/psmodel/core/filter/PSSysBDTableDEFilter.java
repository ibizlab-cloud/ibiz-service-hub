package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDTABLEDE 过滤器对象
 */
public class PSSysBDTableDEFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDTableDEFilter(){
    
    }      

    /**
     * 设置属性[列添加模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter addcolmode__eq(Integer value){
        this.setFieldCond("addcolmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdcolsetid__eq(String value){
        this.setFieldCond("pssysbdcolsetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdcolsetname__eq(String value){
        this.setFieldCond("pssysbdcolsetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认列族]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdcolsetname__like(String value){
        this.setFieldCond("pssysbdcolsetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtabledename__eq(String value){
        this.setFieldCond("pssysbdtabledename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtabledename__like(String value){
        this.setFieldCond("pssysbdtabledename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
