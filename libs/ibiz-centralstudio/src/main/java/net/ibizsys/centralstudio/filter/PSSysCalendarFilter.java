package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCALENDAR 过滤器对象
 */
public class PSSysCalendarFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysCalendarFilter(){
    
    }      

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter batpsdetoolbarid__eq(String value){
        this.setFieldCond("batpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter batpsdetoolbarname__eq(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter batpsdetoolbarname__like(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[日历部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter calendarstyle__eq(String value){
        this.setFieldCond("calendarstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[甘特前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter ganttpssyspfpluginid__eq(String value){
        this.setFieldCond("ganttpssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[甘特前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter ganttpssyspfpluginname__eq(String value){
        this.setFieldCond("ganttpssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[甘特前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter ganttpssyspfpluginname__like(String value){
        this.setFieldCond("ganttpssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[甘特部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter ganttstyle__eq(String value){
        this.setFieldCond("ganttstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组布局]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouplayout__eq(String value){
        this.setFieldCond("grouplayout", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter groupmode__eq(String value){
        this.setFieldCond("groupmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppssyscssid__eq(String value){
        this.setFieldCond("grouppssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppssyscssname__eq(String value){
        this.setFieldCond("grouppssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppssyscssname__like(String value){
        this.setFieldCond("grouppssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppssyspfpluginid__eq(String value){
        this.setFieldCond("grouppssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppssyspfpluginname__eq(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter grouppssyspfpluginname__like(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[日历部件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssyscalendarname__like(String value){
        this.setFieldCond("pssyscalendarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter quickpsdetoolbarid__eq(String value){
        this.setFieldCond("quickpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter quickpsdetoolbarname__eq(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarFilter quickpsdetoolbarname__like(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

}
