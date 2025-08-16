package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSTHRESHOLDGROUP 过滤器对象
 */
public class PSThresholdGroupFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSThresholdGroupFilter(){
    
    }      

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter beginvaluepsdefid__eq(String value){
        this.setFieldCond("beginvaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter beginvaluepsdefname__eq(String value){
        this.setFieldCond("beginvaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter beginvaluepsdefname__like(String value){
        this.setFieldCond("beginvaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter bkcolorpsdefid__eq(String value){
        this.setFieldCond("bkcolorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter bkcolorpsdefname__eq(String value){
        this.setFieldCond("bkcolorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter bkcolorpsdefname__like(String value){
        this.setFieldCond("bkcolorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter colorpsdefid__eq(String value){
        this.setFieldCond("colorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter colorpsdefname__eq(String value){
        this.setFieldCond("colorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter colorpsdefname__like(String value){
        this.setFieldCond("colorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter datapsdefid__eq(String value){
        this.setFieldCond("datapsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter datapsdefname__eq(String value){
        this.setFieldCond("datapsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter datapsdefname__like(String value){
        this.setFieldCond("datapsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter endvaluepsdefid__eq(String value){
        this.setFieldCond("endvaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter endvaluepsdefname__eq(String value){
        this.setFieldCond("endvaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter endvaluepsdefname__like(String value){
        this.setFieldCond("endvaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter iconclspsdefid__eq(String value){
        this.setFieldCond("iconclspsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter iconclspsdefname__eq(String value){
        this.setFieldCond("iconclspsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter iconclspsdefname__like(String value){
        this.setFieldCond("iconclspsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值组名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psthresholdgroupname__eq(String value){
        this.setFieldCond("psthresholdgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值组名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter psthresholdgroupname__like(String value){
        this.setFieldCond("psthresholdgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值组类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter thresholdgrouptype__eq(String value){
        this.setFieldCond("thresholdgrouptype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSThresholdGroupFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
