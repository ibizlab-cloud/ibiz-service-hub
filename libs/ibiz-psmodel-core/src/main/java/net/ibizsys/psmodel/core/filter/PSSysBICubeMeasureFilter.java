package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBEMEASURE 过滤器对象
 */
public class PSSysBICubeMeasureFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBICubeMeasureFilter(){
    
    }      

    /**
     * 设置属性[聚合类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter aggtype__eq(String value){
        this.setFieldCond("aggtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[指标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter bimeasuretype__eq(String value){
        this.setFieldCond("bimeasuretype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[反查展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter drilldetailpsdeviewid__eq(String value){
        this.setFieldCond("drilldetailpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[反查展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter drilldetailpsdeviewname__eq(String value){
        this.setFieldCond("drilldetailpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[反查展示视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter drilldetailpsdeviewname__like(String value){
        this.setFieldCond("drilldetailpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[下钻展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter drilldownpsdeviewid__eq(String value){
        this.setFieldCond("drilldownpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[下钻展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter drilldownpsdeviewname__eq(String value){
        this.setFieldCond("drilldownpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[下钻展示视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter drilldownpsdeviewname__like(String value){
        this.setFieldCond("drilldownpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter parampsdeuiactionid__eq(String value){
        this.setFieldCond("parampsdeuiactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[参数界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter parampsdeuiactionname__eq(String value){
        this.setFieldCond("parampsdeuiactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[参数界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter parampsdeuiactionname__like(String value){
        this.setFieldCond("parampsdeuiactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[阈值代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[阈值代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubeid__eq(String value){
        this.setFieldCond("pssysbicubeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体指标名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubemeasurename__eq(String value){
        this.setFieldCond("pssysbicubemeasurename", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体指标名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubemeasurename__like(String value){
        this.setFieldCond("pssysbicubemeasurename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssystranslatorid__eq(String value){
        this.setFieldCond("pssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssystranslatorname__eq(String value){
        this.setFieldCond("pssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[值转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter pssystranslatorname__like(String value){
        this.setFieldCond("pssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeMeasureFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
