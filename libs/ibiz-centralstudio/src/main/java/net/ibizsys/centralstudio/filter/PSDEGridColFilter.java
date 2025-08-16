package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEGRIDCOL 过滤器对象
 */
public class PSDEGridColFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEGridColFilter(){
    
    }      

    /**
     * 设置属性[列聚合模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter aggmode__eq(String value){
        this.setFieldCond("aggmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter align__eq(String value){
        this.setFieldCond("align", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter caption__like(String value){
        this.setFieldCond("caption", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[单元格样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter cellpssyscssid__eq(String value){
        this.setFieldCond("cellpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单元格样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter cellpssyscssname__eq(String value){
        this.setFieldCond("cellpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[单元格样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter cellpssyscssname__like(String value){
        this.setFieldCond("cellpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码值转换模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter clconvertmode__eq(String value){
        this.setFieldCond("clconvertmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输出代码表模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter codelistconfigmode__eq(Integer value){
        this.setFieldCond("codelistconfigmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[新建默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter createdvt__eq(String value){
        this.setFieldCond("createdvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter editortype__eq(String value){
        this.setFieldCond("editortype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter enablecond__eq(Integer value){
        this.setFieldCond("enablecond", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用链接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter enablelink__eq(Integer value){
        this.setFieldCond("enablelink", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制器插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter gcrpssyspfpluginid__eq(String value){
        this.setFieldCond("gcrpssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制器插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter gcrpssyspfpluginname__eq(String value){
        this.setFieldCond("gcrpssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列绘制器插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter gcrpssyspfpluginname__like(String value){
        this.setFieldCond("gcrpssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格列样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter gridcolstyle__eq(String value){
        this.setFieldCond("gridcolstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter gridcoltype__eq(String value){
        this.setFieldCond("gridcoltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter groupitem__eq(String value){
        this.setFieldCond("groupitem", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter headerpssyscssid__eq(String value){
        this.setFieldCond("headerpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter headerpssyscssname__eq(String value){
        this.setFieldCond("headerpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[头部样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter headerpssyscssname__like(String value){
        this.setFieldCond("headerpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[忽略输入值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter ignoreinput__eq(Integer value){
        this.setFieldCond("ignoreinput", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter noprivdm__eq(Integer value){
        this.setFieldCond("noprivdm", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter phpslanresid__eq(String value){
        this.setFieldCond("phpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter phpslanresname__eq(String value){
        this.setFieldCond("phpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter phpslanresname__like(String value){
        this.setFieldCond("phpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pickuppsdeviewid__eq(String value){
        this.setFieldCond("pickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pickuppsdeviewname__eq(String value){
        this.setFieldCond("pickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pickuppsdeviewname__like(String value){
        this.setFieldCond("pickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter ppsdegridcolid__eq(String value){
        this.setFieldCond("ppsdegridcolid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter ppsdegridcolname__eq(String value){
        this.setFieldCond("ppsdegridcolname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter ppsdegridcolname__like(String value){
        this.setFieldCond("ppsdegridcolname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefsfitemid__eq(String value){
        this.setFieldCond("psdefsfitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤器搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefsfitemname__eq(String value){
        this.setFieldCond("psdefsfitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤器搜索模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefsfitemname__like(String value){
        this.setFieldCond("psdefsfitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性界面模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefuimodeid__eq(String value){
        this.setFieldCond("psdefuimodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性界面模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefuimodename__eq(String value){
        this.setFieldCond("psdefuimodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性界面模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdefuimodename__like(String value){
        this.setFieldCond("psdefuimodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格编辑项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdegeiupdateid__eq(String value){
        this.setFieldCond("psdegeiupdateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格编辑项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdegeiupdatename__eq(String value){
        this.setFieldCond("psdegeiupdatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格编辑项更新]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdegeiupdatename__like(String value){
        this.setFieldCond("psdegeiupdatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdegridcolname__like(String value){
        this.setFieldCond("psdegridcolname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdegridid__eq(String value){
        this.setFieldCond("psdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内置界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内置界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内置界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysdictcatid__eq(String value){
        this.setFieldCond("pssysdictcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysdictcatname__eq(String value){
        this.setFieldCond("pssysdictcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysdictcatname__like(String value){
        this.setFieldCond("pssysdictcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统图片]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[直接服务请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter rawservicemethod__eq(String value){
        this.setFieldCond("rawservicemethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdeacmodeid__eq(String value){
        this.setFieldCond("refpsdeacmodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdeacmodename__eq(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdeacmodename__like(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdedatasetid__eq(String value){
        this.setFieldCond("refpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdedatasetname__eq(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdedatasetname__like(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsderid__eq(String value){
        this.setFieldCond("refpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdername__eq(String value){
        this.setFieldCond("refpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter refpsdername__like(String value){
        this.setFieldCond("refpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[树表列模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter treeitem__eq(Integer value){
        this.setFieldCond("treeitem", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter updatedvt__eq(String value){
        this.setFieldCond("updatedvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[宽度单位]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridColFilter widthunit__eq(String value){
        this.setFieldCond("widthunit", Conditions.EQ, value);
        return this;
    }

}
