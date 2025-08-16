package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSVIEWPANEL 过滤器对象
 */
public class PSSysViewPanelFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysViewPanelFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getdatamode__eq(Integer value){
        this.setFieldCond("getdatamode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpos__eq(String value){
        this.setFieldCond("navbarpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpssyscssid__eq(String value){
        this.setFieldCond("navbarpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpssyscssname__eq(String value){
        this.setFieldCond("navbarpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarpssyscssname__like(String value){
        this.setFieldCond("navbarpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航栏样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter navbarstyle__eq(String value){
        this.setFieldCond("navbarstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[面板后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[面板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

}
