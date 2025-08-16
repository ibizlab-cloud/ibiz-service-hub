package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBEMEASURE 过滤器对象
 */
public class PSSysBICubeMeasureFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBICubeMeasureFilter(){
    
    }      

    /**
     * 设置属性[指标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter bimeasuretype__eq(String value){
        this.setFieldCond("bimeasuretype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubeid__eq(String value){
        this.setFieldCond("pssysbicubeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体指标名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubemeasurename__like(String value){
        this.setFieldCond("pssysbicubemeasurename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psthresholdgroupid__eq(String value){
        this.setFieldCond("psthresholdgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psthresholdgroupname__eq(String value){
        this.setFieldCond("psthresholdgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psthresholdgroupname__like(String value){
        this.setFieldCond("psthresholdgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
