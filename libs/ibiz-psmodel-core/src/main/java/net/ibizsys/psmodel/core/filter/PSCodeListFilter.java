package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSCODELIST 过滤器对象
 */
public class PSCodeListFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSCodeListFilter(){
    
    }      

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter beginvaluepsdefid__eq(String value){
        this.setFieldCond("beginvaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter beginvaluepsdefname__eq(String value){
        this.setFieldCond("beginvaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开始值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter beginvaluepsdefname__like(String value){
        this.setFieldCond("beginvaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter bkcolorpsdefid__eq(String value){
        this.setFieldCond("bkcolorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter bkcolorpsdefname__eq(String value){
        this.setFieldCond("bkcolorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[背景颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter bkcolorpsdefname__like(String value){
        this.setFieldCond("bkcolorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter clspsdefid__eq(String value){
        this.setFieldCond("clspsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter clspsdefname__eq(String value){
        this.setFieldCond("clspsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter clspsdefname__like(String value){
        this.setFieldCond("clspsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码表类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter cltype__eq(String value){
        this.setFieldCond("cltype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter codelistsn__like(String value){
        this.setFieldCond("codelistsn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter colorpsdefid__eq(String value){
        this.setFieldCond("colorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter colorpsdefname__eq(String value){
        this.setFieldCond("colorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[颜色值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter colorpsdefname__like(String value){
        this.setFieldCond("colorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter datapsdefid__eq(String value){
        this.setFieldCond("datapsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter datapsdefname__eq(String value){
        this.setFieldCond("datapsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter datapsdefname__like(String value){
        this.setFieldCond("datapsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[禁止选择属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter disablepsdefid__eq(String value){
        this.setFieldCond("disablepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[禁止选择属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter disablepsdefname__eq(String value){
        this.setFieldCond("disablepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[禁止选择属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter disablepsdefname__like(String value){
        this.setFieldCond("disablepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值文本语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值文本语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter endvaluepsdefid__eq(String value){
        this.setFieldCond("endvaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter endvaluepsdefname__eq(String value){
        this.setFieldCond("endvaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[结束值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter endvaluepsdefname__like(String value){
        this.setFieldCond("endvaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter extendmode__eq(Integer value){
        this.setFieldCond("extendmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclspsdefid__eq(String value){
        this.setFieldCond("iconclspsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclspsdefname__eq(String value){
        this.setFieldCond("iconclspsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclspsdefname__like(String value){
        this.setFieldCond("iconclspsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标样式（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclsxpsdefid__eq(String value){
        this.setFieldCond("iconclsxpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclsxpsdefname__eq(String value){
        this.setFieldCond("iconclsxpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标样式（X）属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconclsxpsdefname__like(String value){
        this.setFieldCond("iconclsxpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标路径属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathpsdefid__eq(String value){
        this.setFieldCond("iconpathpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathpsdefname__eq(String value){
        this.setFieldCond("iconpathpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathpsdefname__like(String value){
        this.setFieldCond("iconpathpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标路径（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathxpsdefid__eq(String value){
        this.setFieldCond("iconpathxpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径（X）属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathxpsdefname__eq(String value){
        this.setFieldCond("iconpathxpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标路径（X）属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter iconpathxpsdefname__like(String value){
        this.setFieldCond("iconpathxpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[包含开始值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter incbeginvalue__eq(Integer value){
        this.setFieldCond("incbeginvalue", EQ, value);
        return this;
    }

    /**
     * 设置属性[包含结束值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter incendvalue__eq(Integer value){
        this.setFieldCond("incendvalue", EQ, value);
        return this;
    }

    /**
     * 设置属性[链接实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[链接实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[链接实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[多项或模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter ormode__eq(String value){
        this.setFieldCond("ormode", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter predefinedtype__eq(String value){
        this.setFieldCond("predefinedtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelisttemplid__eq(String value){
        this.setFieldCond("pscodelisttemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelisttemplname__eq(String value){
        this.setFieldCond("pscodelisttemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pscodelisttemplname__like(String value){
        this.setFieldCond("pscodelisttemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynacodelistid__eq(String value){
        this.setFieldCond("psdynacodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynacodelistname__eq(String value){
        this.setFieldCond("psdynacodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynacodelistname__like(String value){
        this.setFieldCond("psdynacodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynainstname__eq(String value){
        this.setFieldCond("psdynainstname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psdynainstname__like(String value){
        this.setFieldCond("psdynainstname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[TESTNULL]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmoduleid__testnull(Integer value){
        this.setFieldCond("psmoduleid", TESTNULL, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[父值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pvaluepsdefid__eq(String value){
        this.setFieldCond("pvaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[父值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pvaluepsdefname__eq(String value){
        this.setFieldCond("pvaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[父值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter pvaluepsdefname__like(String value){
        this.setFieldCond("pvaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter valuepsdefid__eq(String value){
        this.setFieldCond("valuepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter valuepsdefname__eq(String value){
        this.setFieldCond("valuepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSCodeListFilter valuepsdefname__like(String value){
        this.setFieldCond("valuepsdefname", LIKE, value);
        return this;
    }

}
