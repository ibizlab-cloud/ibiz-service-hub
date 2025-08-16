package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBIAGGTABLE 过滤器对象
 */
public class PSSysBIAggTableFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBIAggTableFilter(){
    
    }      

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合数据名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbiaggtablename__like(String value){
        this.setFieldCond("pssysbiaggtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbicubeid__eq(String value){
        this.setFieldCond("pssysbicubeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbischemeid__eq(String value){
        this.setFieldCond("pssysbischemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbischemename__eq(String value){
        this.setFieldCond("pssysbischemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbischemename__like(String value){
        this.setFieldCond("pssysbischemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
