package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBICUBE 过滤器对象
 */
public class PSSysBICubeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBICubeFilter(){
    
    }      

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[反查展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter drilldetailpsdeviewid__eq(String value){
        this.setFieldCond("drilldetailpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[反查展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter drilldetailpsdeviewname__eq(String value){
        this.setFieldCond("drilldetailpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[反查展示视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter drilldetailpsdeviewname__like(String value){
        this.setFieldCond("drilldetailpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[下钻展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter drilldownpsdeviewid__eq(String value){
        this.setFieldCond("drilldownpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[下钻展示视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter drilldownpsdeviewname__eq(String value){
        this.setFieldCond("drilldownpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[下钻展示视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter drilldownpsdeviewname__like(String value){
        this.setFieldCond("drilldownpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[键值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[键值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[键值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[门户部件界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter portletpsdeuagroupid__eq(String value){
        this.setFieldCond("portletpsdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[门户部件界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter portletpsdeuagroupname__eq(String value){
        this.setFieldCond("portletpsdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[门户部件界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter portletpsdeuagroupname__like(String value){
        this.setFieldCond("portletpsdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[立方体名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", EQ, value);
        return this;
    }

    /**
     * 设置属性[立方体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbischemeid__eq(String value){
        this.setFieldCond("pssysbischemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbischemename__eq(String value){
        this.setFieldCond("pssysbischemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysbischemename__like(String value){
        this.setFieldCond("pssysbischemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter typepsdefid__eq(String value){
        this.setFieldCond("typepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter typepsdefname__eq(String value){
        this.setFieldCond("typepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter typepsdefname__like(String value){
        this.setFieldCond("typepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBICubeFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
