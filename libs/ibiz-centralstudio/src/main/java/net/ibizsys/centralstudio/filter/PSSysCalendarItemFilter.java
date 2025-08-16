package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCALENDARITEM 过滤器对象
 */
public class PSSysCalendarItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysCalendarItemFilter(){
    
    }      

    /**
     * 设置属性[开始时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter beginpsdefid__eq(String value){
        this.setFieldCond("beginpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter beginpsdefname__eq(String value){
        this.setFieldCond("beginpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter beginpsdefname__like(String value){
        this.setFieldCond("beginpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[背景颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter bkcolorpsdefid__eq(String value){
        this.setFieldCond("bkcolorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter bkcolorpsdefname__eq(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter bkcolorpsdefname__like(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter clspsdefid__eq(String value){
        this.setFieldCond("clspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter clspsdefname__eq(String value){
        this.setFieldCond("clspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter clspsdefname__like(String value){
        this.setFieldCond("clspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[字体颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter colorpsdefid__eq(String value){
        this.setFieldCond("colorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[字体颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter colorpsdefname__eq(String value){
        this.setFieldCond("colorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[字体颜色属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter colorpsdefname__like(String value){
        this.setFieldCond("colorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter createpsdeopprivid__eq(String value){
        this.setFieldCond("createpsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter createpsdeopprivname__eq(String value){
        this.setFieldCond("createpsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter createpsdeopprivname__like(String value){
        this.setFieldCond("createpsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter data2psdefid__eq(String value){
        this.setFieldCond("data2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter data2psdefname__eq(String value){
        this.setFieldCond("data2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据2属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter data2psdefname__like(String value){
        this.setFieldCond("data2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter datapsdefid__eq(String value){
        this.setFieldCond("datapsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter datapsdefname__eq(String value){
        this.setFieldCond("datapsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter datapsdefname__like(String value){
        this.setFieldCond("datapsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter endpsdefid__eq(String value){
        this.setFieldCond("endpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter endpsdefname__eq(String value){
        this.setFieldCond("endpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter endpsdefname__like(String value){
        this.setFieldCond("endpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[完成量属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter finishpsdefid__eq(String value){
        this.setFieldCond("finishpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成量属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter finishpsdefname__eq(String value){
        this.setFieldCond("finishpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成量属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter finishpsdefname__like(String value){
        this.setFieldCond("finishpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[甘特前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter ganttpssyspfpluginid__eq(String value){
        this.setFieldCond("ganttpssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[甘特前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter ganttpssyspfpluginname__eq(String value){
        this.setFieldCond("ganttpssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[甘特前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter ganttpssyspfpluginname__like(String value){
        this.setFieldCond("ganttpssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter iconpsdefid__eq(String value){
        this.setFieldCond("iconpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter iconpsdefname__eq(String value){
        this.setFieldCond("iconpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter iconpsdefname__like(String value){
        this.setFieldCond("iconpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter itemstyle__eq(String value){
        this.setFieldCond("itemstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[级别属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter levelpsdefid__eq(String value){
        this.setFieldCond("levelpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[级别属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter levelpsdefname__eq(String value){
        this.setFieldCond("levelpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[级别属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter levelpsdefname__like(String value){
        this.setFieldCond("levelpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pkeypsdefid__eq(String value){
        this.setFieldCond("pkeypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pkeypsdefname__eq(String value){
        this.setFieldCond("pkeypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pkeypsdefname__like(String value){
        this.setFieldCond("pkeypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航关系参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdetoolbarid__eq(String value){
        this.setFieldCond("psdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[详细视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyscalendarid__eq(String value){
        this.setFieldCond("pssyscalendarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyscalendaritemname__like(String value){
        this.setFieldCond("pssyscalendaritemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyscalendarname__eq(String value){
        this.setFieldCond("pssyscalendarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统日历部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyscalendarname__like(String value){
        this.setFieldCond("pssyscalendarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter removepsdeopprivid__eq(String value){
        this.setFieldCond("removepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter removepsdeopprivname__eq(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter removepsdeopprivname__like(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tag2psdefid__eq(String value){
        this.setFieldCond("tag2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tag2psdefname__eq(String value){
        this.setFieldCond("tag2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tag2psdefname__like(String value){
        this.setFieldCond("tag2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tagpsdefid__eq(String value){
        this.setFieldCond("tagpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tagpsdefname__eq(String value){
        this.setFieldCond("tagpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tagpsdefname__like(String value){
        this.setFieldCond("tagpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tipspsdefid__eq(String value){
        this.setFieldCond("tipspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tipspsdefname__eq(String value){
        this.setFieldCond("tipspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter tipspsdefname__like(String value){
        this.setFieldCond("tipspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[总量属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter totalpsdefid__eq(String value){
        this.setFieldCond("totalpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[总量属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter totalpsdefname__eq(String value){
        this.setFieldCond("totalpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[总量属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter totalpsdefname__like(String value){
        this.setFieldCond("totalpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter updatepsdeopprivid__eq(String value){
        this.setFieldCond("updatepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter updatepsdeopprivname__eq(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter updatepsdeopprivname__like(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCalendarItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
