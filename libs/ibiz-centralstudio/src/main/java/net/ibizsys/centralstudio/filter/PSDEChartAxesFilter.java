package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDECHARTAXES 过滤器对象
 */
public class PSDEChartAxesFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEChartAxesFilter(){
    
    }      

    /**
     * 设置属性[坐标轴位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter axespos__eq(String value){
        this.setFieldCond("axespos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标轴类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter axestype__eq(String value){
        this.setFieldCond("axestype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[坐标系统索引]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter coordinatesystemid__eq(Integer value){
        this.setFieldCond("coordinatesystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据显示方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter datashowmode__eq(Integer value){
        this.setFieldCond("datashowmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标轴名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter psdechartaxesname__like(String value){
        this.setFieldCond("psdechartaxesname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter psdechartid__eq(String value){
        this.setFieldCond("psdechartid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter psdechartname__eq(String value){
        this.setFieldCond("psdechartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter psdechartname__like(String value){
        this.setFieldCond("psdechartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartAxesFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
