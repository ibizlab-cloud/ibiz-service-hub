package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETREECOL 过滤器对象
 */
public class PSDETreeColFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDETreeColFilter(){
    
    }      

    /**
     * 设置属性[水平对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter align__eq(String value){
        this.setFieldCond("align", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter caption__like(String value){
        this.setFieldCond("caption", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[单元格样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter cellpssyscssid__eq(String value){
        this.setFieldCond("cellpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单元格样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter cellpssyscssname__eq(String value){
        this.setFieldCond("cellpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单元格样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter cellpssyscssname__like(String value){
        this.setFieldCond("cellpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制器插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter gcrpssyspfpluginid__eq(String value){
        this.setFieldCond("gcrpssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制器插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter gcrpssyspfpluginname__eq(String value){
        this.setFieldCond("gcrpssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制器插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter gcrpssyspfpluginname__like(String value){
        this.setFieldCond("gcrpssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格列样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter gridcolstyle__eq(String value){
        this.setFieldCond("gridcolstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter gridcoltype__eq(String value){
        this.setFieldCond("gridcoltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter headerpssyscssid__eq(String value){
        this.setFieldCond("headerpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter headerpssyscssname__eq(String value){
        this.setFieldCond("headerpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter headerpssyscssname__like(String value){
        this.setFieldCond("headerpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[树表格列标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdetreecolname__like(String value){
        this.setFieldCond("psdetreecolname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdetreeviewid__eq(String value){
        this.setFieldCond("psdetreeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdetreeviewname__eq(String value){
        this.setFieldCond("psdetreeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdetreeviewname__like(String value){
        this.setFieldCond("psdetreeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[宽度单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeColFilter widthunit__eq(String value){
        this.setFieldCond("widthunit", Conditions.EQ, value);
        return this;
    }

}
