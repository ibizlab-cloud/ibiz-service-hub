package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETOOLBAR 过滤器对象
 */
public class PSDEToolbarFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEToolbarFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认图标位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter iconalign__eq(String value){
        this.setFieldCond("iconalign", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no3psdeuagroupid__eq(String value){
        this.setFieldCond("no3psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no3psdeuagroupname__eq(String value){
        this.setFieldCond("no3psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no3psdeuagroupname__like(String value){
        this.setFieldCond("no3psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no4psdeuagroupid__eq(String value){
        this.setFieldCond("no4psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no4psdeuagroupname__eq(String value){
        this.setFieldCond("no4psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no4psdeuagroupname__like(String value){
        this.setFieldCond("no4psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no5psdeuagroupid__eq(String value){
        this.setFieldCond("no5psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no5psdeuagroupname__eq(String value){
        this.setFieldCond("no5psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no5psdeuagroupname__like(String value){
        this.setFieldCond("no5psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no6psdeuagroupid__eq(String value){
        this.setFieldCond("no6psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no6psdeuagroupname__eq(String value){
        this.setFieldCond("no6psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no6psdeuagroupname__like(String value){
        this.setFieldCond("no6psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具栏名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工具栏名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystoolbarid__eq(String value){
        this.setFieldCond("pssystoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystoolbarname__eq(String value){
        this.setFieldCond("pssystoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystoolbarname__like(String value){
        this.setFieldCond("pssystoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具栏编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter toolbarsn__like(String value){
        this.setFieldCond("toolbarsn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具栏样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter toolbarstyle__eq(String value){
        this.setFieldCond("toolbarstyle", EQ, value);
        return this;
    }

}
