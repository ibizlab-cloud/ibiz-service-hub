package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCODELIST 过滤器对象
 */
public class PSCodeListFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSCodeListFilter(){
    
    }      

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter beginvaluepsdefid__eq(String value){
        this.setFieldCond("beginvaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter beginvaluepsdefname__eq(String value){
        this.setFieldCond("beginvaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter beginvaluepsdefname__like(String value){
        this.setFieldCond("beginvaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter bkcolorpsdefid__eq(String value){
        this.setFieldCond("bkcolorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter bkcolorpsdefname__eq(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter bkcolorpsdefname__like(String value){
        this.setFieldCond("bkcolorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter clspsdefid__eq(String value){
        this.setFieldCond("clspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter clspsdefname__eq(String value){
        this.setFieldCond("clspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter clspsdefname__like(String value){
        this.setFieldCond("clspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码表类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter cltype__eq(String value){
        this.setFieldCond("cltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter codelistsn__like(String value){
        this.setFieldCond("codelistsn", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter colorpsdefid__eq(String value){
        this.setFieldCond("colorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter colorpsdefname__eq(String value){
        this.setFieldCond("colorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter colorpsdefname__like(String value){
        this.setFieldCond("colorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter datapsdefid__eq(String value){
        this.setFieldCond("datapsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter datapsdefname__eq(String value){
        this.setFieldCond("datapsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter datapsdefname__like(String value){
        this.setFieldCond("datapsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[禁止选择属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter disablepsdefid__eq(String value){
        this.setFieldCond("disablepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[禁止选择属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter disablepsdefname__eq(String value){
        this.setFieldCond("disablepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[禁止选择属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter disablepsdefname__like(String value){
        this.setFieldCond("disablepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值文本语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter endvaluepsdefid__eq(String value){
        this.setFieldCond("endvaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter endvaluepsdefname__eq(String value){
        this.setFieldCond("endvaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter endvaluepsdefname__like(String value){
        this.setFieldCond("endvaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclspsdefid__eq(String value){
        this.setFieldCond("iconclspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclspsdefname__eq(String value){
        this.setFieldCond("iconclspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclspsdefname__like(String value){
        this.setFieldCond("iconclspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标样式（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclsxpsdefid__eq(String value){
        this.setFieldCond("iconclsxpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclsxpsdefname__eq(String value){
        this.setFieldCond("iconclsxpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式（X）属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclsxpsdefname__like(String value){
        this.setFieldCond("iconclsxpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标路径属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathpsdefid__eq(String value){
        this.setFieldCond("iconpathpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathpsdefname__eq(String value){
        this.setFieldCond("iconpathpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathpsdefname__like(String value){
        this.setFieldCond("iconpathpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标路径（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathxpsdefid__eq(String value){
        this.setFieldCond("iconpathxpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathxpsdefname__eq(String value){
        this.setFieldCond("iconpathxpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径（X）属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathxpsdefname__like(String value){
        this.setFieldCond("iconpathxpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[包含开始值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter incbeginvalue__eq(Integer value){
        this.setFieldCond("incbeginvalue", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[包含结束值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter incendvalue__eq(Integer value){
        this.setFieldCond("incendvalue", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[多项或模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter ormode__eq(String value){
        this.setFieldCond("ormode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelisttemplid__eq(String value){
        this.setFieldCond("pscodelisttemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelisttemplname__eq(String value){
        this.setFieldCond("pscodelisttemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelisttemplname__like(String value){
        this.setFieldCond("pscodelisttemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynacodelistid__eq(String value){
        this.setFieldCond("psdynacodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynacodelistname__eq(String value){
        this.setFieldCond("psdynacodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynacodelistname__like(String value){
        this.setFieldCond("psdynacodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynainstname__eq(String value){
        this.setFieldCond("psdynainstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynainstname__like(String value){
        this.setFieldCond("psdynainstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[TESTNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmoduleid__testnull(Integer value){
        this.setFieldCond("psmoduleid", Conditions.TESTNULL, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pvaluepsdefid__eq(String value){
        this.setFieldCond("pvaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pvaluepsdefname__eq(String value){
        this.setFieldCond("pvaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pvaluepsdefname__like(String value){
        this.setFieldCond("pvaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter valuepsdefid__eq(String value){
        this.setFieldCond("valuepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter valuepsdefname__eq(String value){
        this.setFieldCond("valuepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter valuepsdefname__like(String value){
        this.setFieldCond("valuepsdefname", Conditions.LIKE, value);
        return this;
    }

}
