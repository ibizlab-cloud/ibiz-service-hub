package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELISTITEM 过滤器对象
 */
public class PSDEListItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEListItemFilter(){
    
    }      

    /**
     * 设置属性[水平对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter align__eq(String value){
        this.setFieldCond("align", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码值转换模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter clconvertmode__eq(String value){
        this.setFieldCond("clconvertmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter groupitem__eq(String value){
        this.setFieldCond("groupitem", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter itemtype__eq(String value){
        this.setFieldCond("itemtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列表项绘制插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter lcrpssyspfpluginid__eq(String value){
        this.setFieldCond("lcrpssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列表项绘制插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter lcrpssyspfpluginname__eq(String value){
        this.setFieldCond("lcrpssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列表项绘制插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter lcrpssyspfpluginname__like(String value){
        this.setFieldCond("lcrpssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdedataviewid__eq(String value){
        this.setFieldCond("psdedataviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdedataviewname__eq(String value){
        this.setFieldCond("psdedataviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdedataviewname__like(String value){
        this.setFieldCond("psdedataviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdelistid__eq(String value){
        this.setFieldCond("psdelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdelistitemname__like(String value){
        this.setFieldCond("psdelistitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdelistname__eq(String value){
        this.setFieldCond("psdelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdelistname__like(String value){
        this.setFieldCond("psdelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[宽度单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListItemFilter widthunit__eq(String value){
        this.setFieldCond("widthunit", Conditions.EQ, value);
        return this;
    }

}
