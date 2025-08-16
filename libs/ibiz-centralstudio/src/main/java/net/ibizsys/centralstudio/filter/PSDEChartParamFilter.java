package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDECHARTPARAM 过滤器对象
 */
public class PSDEChartParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEChartParamFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[序列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter charttype__eq(String value){
        this.setFieldCond("charttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter coordinatesystem__eq(String value){
        this.setFieldCond("coordinatesystem", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标系索引]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter coordinatesystemid__eq(Integer value){
        this.setFieldCond("coordinatesystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标系动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cspssysdynamodelid__eq(String value){
        this.setFieldCond("cspssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标系动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cspssysdynamodelname__eq(String value){
        this.setFieldCond("cspssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标系动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cspssysdynamodelname__like(String value){
        this.setFieldCond("cspssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[坐标系前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cspssyspfpluginid__eq(String value){
        this.setFieldCond("cspssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标系前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cspssyspfpluginname__eq(String value){
        this.setFieldCond("cspssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[坐标系前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter cspssyspfpluginname__like(String value){
        this.setFieldCond("cspssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdechartid__eq(String value){
        this.setFieldCond("psdechartid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdechartname__eq(String value){
        this.setFieldCond("psdechartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdechartname__like(String value){
        this.setFieldCond("psdechartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[序列标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdechartparamname__like(String value){
        this.setFieldCond("psdechartparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[结果集行列模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter serieslayoutby__eq(String value){
        this.setFieldCond("serieslayoutby", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[序列属性代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter sfpscodelistid__eq(String value){
        this.setFieldCond("sfpscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称属性代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter sfpscodelistname__eq(String value){
        this.setFieldCond("sfpscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称属性代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter sfpscodelistname__like(String value){
        this.setFieldCond("sfpscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter timegroup__eq(String value){
        this.setFieldCond("timegroup", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分类属性代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter xfpscodelistid__eq(String value){
        this.setFieldCond("xfpscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分类属性代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter xfpscodelistname__eq(String value){
        this.setFieldCond("xfpscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分类属性代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter xfpscodelistname__like(String value){
        this.setFieldCond("xfpscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[X坐标轴]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter xpsdechartaxesid__eq(String value){
        this.setFieldCond("xpsdechartaxesid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[X坐标轴]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter xpsdechartaxesname__eq(String value){
        this.setFieldCond("xpsdechartaxesname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[X坐标轴]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter xpsdechartaxesname__like(String value){
        this.setFieldCond("xpsdechartaxesname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[Y坐标轴]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter ypsdechartaxesid__eq(String value){
        this.setFieldCond("ypsdechartaxesid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Y坐标轴]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter ypsdechartaxesname__eq(String value){
        this.setFieldCond("ypsdechartaxesname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Y坐标轴]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEChartParamFilter ypsdechartaxesname__like(String value){
        this.setFieldCond("ypsdechartaxesname", Conditions.LIKE, value);
        return this;
    }

}
