package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETOOLBAR 过滤器对象
 */
public class PSDEToolbarFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEToolbarFilter(){
    
    }      

    /**
     * 设置属性[默认图标位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter iconalign__eq(String value){
        this.setFieldCond("iconalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no3psdeuagroupid__eq(String value){
        this.setFieldCond("no3psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no3psdeuagroupname__eq(String value){
        this.setFieldCond("no3psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组3]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no3psdeuagroupname__like(String value){
        this.setFieldCond("no3psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no4psdeuagroupid__eq(String value){
        this.setFieldCond("no4psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no4psdeuagroupname__eq(String value){
        this.setFieldCond("no4psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组4]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no4psdeuagroupname__like(String value){
        this.setFieldCond("no4psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no5psdeuagroupid__eq(String value){
        this.setFieldCond("no5psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no5psdeuagroupname__eq(String value){
        this.setFieldCond("no5psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组5]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no5psdeuagroupname__like(String value){
        this.setFieldCond("no5psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no6psdeuagroupid__eq(String value){
        this.setFieldCond("no6psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no6psdeuagroupname__eq(String value){
        this.setFieldCond("no6psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组6]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter no6psdeuagroupname__like(String value){
        this.setFieldCond("no6psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具栏名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystoolbarid__eq(String value){
        this.setFieldCond("pssystoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystoolbarname__eq(String value){
        this.setFieldCond("pssystoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter pssystoolbarname__like(String value){
        this.setFieldCond("pssystoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具栏编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter toolbarsn__like(String value){
        this.setFieldCond("toolbarsn", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工具栏样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEToolbarFilter toolbarstyle__eq(String value){
        this.setFieldCond("toolbarstyle", Conditions.EQ, value);
        return this;
    }

}
