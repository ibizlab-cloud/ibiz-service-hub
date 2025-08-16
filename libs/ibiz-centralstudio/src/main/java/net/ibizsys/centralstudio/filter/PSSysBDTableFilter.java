package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDTABLE 过滤器对象
 */
public class PSSysBDTableFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBDTableFilter(){
    
    }      

    /**
     * 设置属性[大数据表类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter bdtabletype__eq(Integer value){
        this.setFieldCond("bdtabletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdmoduleid__eq(String value){
        this.setFieldCond("pssysbdmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdmodulename__eq(String value){
        this.setFieldCond("pssysbdmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdmodulename__like(String value){
        this.setFieldCond("pssysbdmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据分区]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdpartid__eq(String value){
        this.setFieldCond("pssysbdpartid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据分区]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdpartname__eq(String value){
        this.setFieldCond("pssysbdpartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据分区]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdpartname__like(String value){
        this.setFieldCond("pssysbdpartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdschemeid__eq(String value){
        this.setFieldCond("pssysbdschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdschemename__eq(String value){
        this.setFieldCond("pssysbdschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdschemename__like(String value){
        this.setFieldCond("pssysbdschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
