package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBEDIMENSION 过滤器对象
 */
public class PSSysBICubeDimensionFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBICubeDimensionFilter(){
    
    }      

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体维度名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubedimensionname__like(String value){
        this.setFieldCond("pssysbicubedimensionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubeid__eq(String value){
        this.setFieldCond("pssysbicubeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbidimensionid__eq(String value){
        this.setFieldCond("pssysbidimensionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbidimensionname__eq(String value){
        this.setFieldCond("pssysbidimensionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter pssysbidimensionname__like(String value){
        this.setFieldCond("pssysbidimensionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeDimensionFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
