package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSVIEWPANEL 过滤器对象
 */
public class PSSysViewPanelFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysViewPanelFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getdatamode__eq(Integer value){
        this.setFieldCond("getdatamode", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpos__eq(String value){
        this.setFieldCond("navbarpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpssyscssid__eq(String value){
        this.setFieldCond("navbarpssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpssyscssname__eq(String value){
        this.setFieldCond("navbarpssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpssyscssname__like(String value){
        this.setFieldCond("navbarpssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarstyle__eq(String value){
        this.setFieldCond("navbarstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[面板后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[面板名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[面板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

}
