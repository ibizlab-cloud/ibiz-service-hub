package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMAPITEM 过滤器对象
 */
public class PSSysMapItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysMapItemFilter(){
    
    }      

    /**
     * 设置属性[高度属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter altpsdefid__eq(String value){
        this.setFieldCond("altpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[高度属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter altpsdefname__eq(String value){
        this.setFieldCond("altpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[高度属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter altpsdefname__like(String value){
        this.setFieldCond("altpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[背景颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter bkcolorpsdefid__eq(String value){
        this.setFieldCond("bkcolorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter bkcolorpsdefname__eq(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter bkcolorpsdefname__like(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter clspsdefid__eq(String value){
        this.setFieldCond("clspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter clspsdefname__eq(String value){
        this.setFieldCond("clspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter clspsdefname__like(String value){
        this.setFieldCond("clspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[字体颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter colorpsdefid__eq(String value){
        this.setFieldCond("colorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[字体颜色属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter colorpsdefname__eq(String value){
        this.setFieldCond("colorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[字体颜色属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter colorpsdefname__like(String value){
        this.setFieldCond("colorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter data2psdefid__eq(String value){
        this.setFieldCond("data2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter data2psdefname__eq(String value){
        this.setFieldCond("data2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter data2psdefname__like(String value){
        this.setFieldCond("data2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter datapsdefid__eq(String value){
        this.setFieldCond("datapsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter datapsdefname__eq(String value){
        this.setFieldCond("datapsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter datapsdefname__like(String value){
        this.setFieldCond("datapsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter iconpsdefid__eq(String value){
        this.setFieldCond("iconpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter iconpsdefname__eq(String value){
        this.setFieldCond("iconpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter iconpsdefname__like(String value){
        this.setFieldCond("iconpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表现样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter itemstyle__eq(String value){
        this.setFieldCond("itemstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[纬度属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter latpsdefid__eq(String value){
        this.setFieldCond("latpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[纬度属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter latpsdefname__eq(String value){
        this.setFieldCond("latpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[纬度属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter latpsdefname__like(String value){
        this.setFieldCond("latpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[经度属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter longpsdefid__eq(String value){
        this.setFieldCond("longpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[经度属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter longpsdefname__eq(String value){
        this.setFieldCond("longpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[经度属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter longpsdefname__like(String value){
        this.setFieldCond("longpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdetoolbarid__eq(String value){
        this.setFieldCond("psdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[详细视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssysmapitemname__like(String value){
        this.setFieldCond("pssysmapitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssysmapviewid__eq(String value){
        this.setFieldCond("pssysmapviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssysmapviewname__eq(String value){
        this.setFieldCond("pssysmapviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssysmapviewname__like(String value){
        this.setFieldCond("pssysmapviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter removepsdeopprivid__eq(String value){
        this.setFieldCond("removepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter removepsdeopprivname__eq(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter removepsdeopprivname__like(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tag2psdefid__eq(String value){
        this.setFieldCond("tag2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tag2psdefname__eq(String value){
        this.setFieldCond("tag2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tag2psdefname__like(String value){
        this.setFieldCond("tag2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tagpsdefid__eq(String value){
        this.setFieldCond("tagpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tagpsdefname__eq(String value){
        this.setFieldCond("tagpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tagpsdefname__like(String value){
        this.setFieldCond("tagpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tipspsdefid__eq(String value){
        this.setFieldCond("tipspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tipspsdefname__eq(String value){
        this.setFieldCond("tipspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter tipspsdefname__like(String value){
        this.setFieldCond("tipspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMapItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
