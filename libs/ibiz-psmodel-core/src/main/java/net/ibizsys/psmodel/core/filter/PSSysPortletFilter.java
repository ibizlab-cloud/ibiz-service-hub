package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSPORTLET 过滤器对象
 */
public class PSSysPortletFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysPortletFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件应用范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter dashboardscope__eq(Integer value){
        this.setFieldCond("dashboardscope", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[过滤数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter filterpsdedsid__eq(String value){
        this.setFieldCond("filterpsdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter filterpsdedsname__eq(String value){
        this.setFieldCond("filterpsdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter filterpsdedsname__like(String value){
        this.setFieldCond("filterpsdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[行为组展开模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter groupextractmode__eq(String value){
        this.setFieldCond("groupextractmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[HTML显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter htmlshowmode__eq(String value){
        this.setFieldCond("htmlshowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter logicname__like(String value){
        this.setFieldCond("logicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter portletstyle__eq(String value){
        this.setFieldCond("portletstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[门户部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter portlettype__eq(String value){
        this.setFieldCond("portlettype", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdechartid__eq(String value){
        this.setFieldCond("psdechartid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdechartname__eq(String value){
        this.setFieldCond("psdechartname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdechartname__like(String value){
        this.setFieldCond("psdechartname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdedataviewid__eq(String value){
        this.setFieldCond("psdedataviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdedataviewname__eq(String value){
        this.setFieldCond("psdedataviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdedataviewname__like(String value){
        this.setFieldCond("psdedataviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdelistid__eq(String value){
        this.setFieldCond("psdelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdelistname__eq(String value){
        this.setFieldCond("psdelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdelistname__like(String value){
        this.setFieldCond("psdelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdereportid__eq(String value){
        this.setFieldCond("psdereportid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdereportname__eq(String value){
        this.setFieldCond("psdereportname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdereportname__like(String value){
        this.setFieldCond("psdereportname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdetoolbarid__eq(String value){
        this.setFieldCond("psdetoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdeviewid__eq(String value){
        this.setFieldCond("psdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdeviewname__eq(String value){
        this.setFieldCond("psdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psdeviewname__like(String value){
        this.setFieldCond("psdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psportletid__eq(String value){
        this.setFieldCond("psportletid", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psportletname__eq(String value){
        this.setFieldCond("psportletname", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置门户部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter psportletname__like(String value){
        this.setFieldCond("psportletname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyscalendarid__eq(String value){
        this.setFieldCond("pssyscalendarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyscalendarname__eq(String value){
        this.setFieldCond("pssyscalendarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyscalendarname__like(String value){
        this.setFieldCond("pssyscalendarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysmapviewid__eq(String value){
        this.setFieldCond("pssysmapviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysmapviewname__eq(String value){
        this.setFieldCond("pssysmapviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysmapviewname__like(String value){
        this.setFieldCond("pssysmapviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysportletcatid__eq(String value){
        this.setFieldCond("pssysportletcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysportletcatname__eq(String value){
        this.setFieldCond("pssysportletcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysportletcatname__like(String value){
        this.setFieldCond("pssysportletcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[门户部件名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysportletname__eq(String value){
        this.setFieldCond("pssysportletname", EQ, value);
        return this;
    }

    /**
     * 设置属性[门户部件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysportletname__like(String value){
        this.setFieldCond("pssysportletname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模板引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter templengine__eq(String value){
        this.setFieldCond("templengine", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题栏前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter titlepssyspfpluginid__eq(String value){
        this.setFieldCond("titlepssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题栏前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter titlepssyspfpluginname__eq(String value){
        this.setFieldCond("titlepssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题栏前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter titlepssyspfpluginname__like(String value){
        this.setFieldCond("titlepssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPortletFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
