package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBIAGGCOLUMN 过滤器对象
 */
public class PSSysBIAggColumnFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBIAggColumnFilter(){
    
    }      

    /**
     * 设置属性[聚合列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter biaggcolumntype__eq(String value){
        this.setFieldCond("biaggcolumntype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合数据列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbiaggcolumnname__like(String value){
        this.setFieldCond("pssysbiaggcolumnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表聚合数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbiaggtableid__eq(String value){
        this.setFieldCond("pssysbiaggtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表聚合数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbiaggtablename__eq(String value){
        this.setFieldCond("pssysbiaggtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表聚合数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbiaggtablename__like(String value){
        this.setFieldCond("pssysbiaggtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbicubedimensionid__eq(String value){
        this.setFieldCond("pssysbicubedimensionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbicubedimensionname__eq(String value){
        this.setFieldCond("pssysbicubedimensionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体维度]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbicubedimensionname__like(String value){
        this.setFieldCond("pssysbicubedimensionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表指标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbicubemeasureid__eq(String value){
        this.setFieldCond("pssysbicubemeasureid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体指标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbicubemeasurename__eq(String value){
        this.setFieldCond("pssysbicubemeasurename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体指标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter pssysbicubemeasurename__like(String value){
        this.setFieldCond("pssysbicubemeasurename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggColumnFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
