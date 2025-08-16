package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSTHRESHOLDGROUP 过滤器对象
 */
public class PSThresholdGroupFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSThresholdGroupFilter(){
    
    }      

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter beginvaluepsdefid__eq(String value){
        this.setFieldCond("beginvaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter beginvaluepsdefname__eq(String value){
        this.setFieldCond("beginvaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter beginvaluepsdefname__like(String value){
        this.setFieldCond("beginvaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter bkcolorpsdefid__eq(String value){
        this.setFieldCond("bkcolorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter bkcolorpsdefname__eq(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter bkcolorpsdefname__like(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter colorpsdefid__eq(String value){
        this.setFieldCond("colorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter colorpsdefname__eq(String value){
        this.setFieldCond("colorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter colorpsdefname__like(String value){
        this.setFieldCond("colorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter datapsdefid__eq(String value){
        this.setFieldCond("datapsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter datapsdefname__eq(String value){
        this.setFieldCond("datapsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter datapsdefname__like(String value){
        this.setFieldCond("datapsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter endvaluepsdefid__eq(String value){
        this.setFieldCond("endvaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter endvaluepsdefname__eq(String value){
        this.setFieldCond("endvaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter endvaluepsdefname__like(String value){
        this.setFieldCond("endvaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter iconclspsdefid__eq(String value){
        this.setFieldCond("iconclspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter iconclspsdefname__eq(String value){
        this.setFieldCond("iconclspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter iconclspsdefname__like(String value){
        this.setFieldCond("iconclspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psthresholdgroupname__like(String value){
        this.setFieldCond("psthresholdgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值组类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter thresholdgrouptype__eq(String value){
        this.setFieldCond("thresholdgrouptype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
