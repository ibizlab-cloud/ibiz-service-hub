package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETBITEM 过滤器对象
 */
public class PSDETBItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDETBItemFilter(){
    
    }      

    /**
     * 设置属性[行为级别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter actionlevel__eq(Integer value){
        this.setFieldCond("actionlevel", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[按钮行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter btnactiontype__eq(String value){
        this.setFieldCond("btnactiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[行为组展开模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter groupextractmode__eq(String value){
        this.setFieldCond("groupextractmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter noprivdm__eq(Integer value){
        this.setFieldCond("noprivdm", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpsappviewid__eq(String value){
        this.setFieldCond("openpsappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpsappviewname__eq(String value){
        this.setFieldCond("openpsappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpsappviewname__like(String value){
        this.setFieldCond("openpsappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpsdeviewid__eq(String value){
        this.setFieldCond("openpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpsdeviewname__eq(String value){
        this.setFieldCond("openpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpsdeviewname__like(String value){
        this.setFieldCond("openpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpssyspdtviewid__eq(String value){
        this.setFieldCond("openpssyspdtviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpssyspdtviewname__eq(String value){
        this.setFieldCond("openpssyspdtviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开系统预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter openpssyspdtviewname__like(String value){
        this.setFieldCond("openpssyspdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父工具栏项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter ppsdetbitemid__eq(String value){
        this.setFieldCond("ppsdetbitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父工具栏项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter ppsdetbitemname__eq(String value){
        this.setFieldCond("ppsdetbitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父工具栏项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter ppsdetbitemname__like(String value){
        this.setFieldCond("ppsdetbitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdetbitemname__eq(String value){
        this.setFieldCond("psdetbitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdetbitemname__like(String value){
        this.setFieldCond("psdetbitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdetoolbarid__eq(String value){
        this.setFieldCond("psdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter showmode__eq(String value){
        this.setFieldCond("showmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter tbitemtype__eq(String value){
        this.setFieldCond("tbitemtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter templatemode__eq(Integer value){
        this.setFieldCond("templatemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETBItemFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

}
