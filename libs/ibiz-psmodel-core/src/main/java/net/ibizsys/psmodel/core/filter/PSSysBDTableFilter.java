package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDTABLE 过滤器对象
 */
public class PSSysBDTableFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDTableFilter(){
    
    }      

    /**
     * 设置属性[大数据表类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter bdtabletype__eq(Integer value){
        this.setFieldCond("bdtabletype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdmoduleid__eq(String value){
        this.setFieldCond("pssysbdmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdmodulename__eq(String value){
        this.setFieldCond("pssysbdmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdmodulename__like(String value){
        this.setFieldCond("pssysbdmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据分区]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdpartid__eq(String value){
        this.setFieldCond("pssysbdpartid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据分区]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdpartname__eq(String value){
        this.setFieldCond("pssysbdpartname", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据分区]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdpartname__like(String value){
        this.setFieldCond("pssysbdpartname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
