package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSVIEWPANELITEM 过滤器对象
 */
public class PSSysViewPanelItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysViewPanelItemFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[按钮行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter btnactiontype__eq(String value){
        this.setFieldCond("btnactiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter captionpos__eq(String value){
        this.setFieldCond("captionpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[折叠模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter collapsibleflag__eq(Integer value){
        this.setFieldCond("collapsibleflag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ctrlpssyscssid__eq(String value){
        this.setFieldCond("ctrlpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ctrlpssyscssname__eq(String value){
        this.setFieldCond("ctrlpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ctrlpssyscssname__like(String value){
        this.setFieldCond("ctrlpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ctrltype__eq(String value){
        this.setFieldCond("ctrltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter detailstyle__eq(String value){
        this.setFieldCond("detailstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter editortype__eq(String value){
        this.setFieldCond("editortype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex横轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter flexalign__eq(String value){
        this.setFieldCond("flexalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex布局方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter flexdir__eq(String value){
        this.setFieldCond("flexdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex纵轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter flexvalign__eq(String value){
        this.setFieldCond("flexvalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter halign__eq(String value){
        this.setFieldCond("halign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter halignself__eq(String value){
        this.setFieldCond("halignself", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[高度模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter heightmode__eq(String value){
        this.setFieldCond("heightmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter iconalign__eq(String value){
        this.setFieldCond("iconalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[忽略输入值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ignoreinput__eq(Integer value){
        this.setFieldCond("ignoreinput", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[成员类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter itemtype__eq(String value){
        this.setFieldCond("itemtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter labelpssyscssid__eq(String value){
        this.setFieldCond("labelpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter labelpssyscssname__eq(String value){
        this.setFieldCond("labelpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter labelpssyscssname__like(String value){
        this.setFieldCond("labelpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpsappviewid__eq(String value){
        this.setFieldCond("openpsappviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpsappviewname__eq(String value){
        this.setFieldCond("openpsappviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpsappviewname__like(String value){
        this.setFieldCond("openpsappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpsdeviewid__eq(String value){
        this.setFieldCond("openpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpsdeviewname__eq(String value){
        this.setFieldCond("openpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpsdeviewname__like(String value){
        this.setFieldCond("openpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[打开系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpssyspdtviewid__eq(String value){
        this.setFieldCond("openpssyspdtviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpssyspdtviewname__eq(String value){
        this.setFieldCond("openpssyspdtviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[打开系统预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter openpssyspdtviewname__like(String value){
        this.setFieldCond("openpssyspdtviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[方向设置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter orientationmode__eq(String value){
        this.setFieldCond("orientationmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter phpslanresid__eq(String value){
        this.setFieldCond("phpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter phpslanresname__eq(String value){
        this.setFieldCond("phpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter phpslanresname__like(String value){
        this.setFieldCond("phpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ppssysviewpanelitemid__eq(String value){
        this.setFieldCond("ppssysviewpanelitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ppssysviewpanelitemname__eq(String value){
        this.setFieldCond("ppssysviewpanelitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter ppssysviewpanelitemname__like(String value){
        this.setFieldCond("ppssysviewpanelitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psappmenuid__eq(String value){
        this.setFieldCond("psappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psappmenuname__eq(String value){
        this.setFieldCond("psappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psappmenuname__like(String value){
        this.setFieldCond("psappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdechartid__eq(String value){
        this.setFieldCond("psdechartid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdechartname__eq(String value){
        this.setFieldCond("psdechartname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体图表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdechartname__like(String value){
        this.setFieldCond("psdechartname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedataviewid__eq(String value){
        this.setFieldCond("psdedataviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedataviewname__eq(String value){
        this.setFieldCond("psdedataviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体卡片视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedataviewname__like(String value){
        this.setFieldCond("psdedataviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedrid__eq(String value){
        this.setFieldCond("psdedrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据关系界面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedritemid__eq(String value){
        this.setFieldCond("psdedritemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据关系界面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedritemname__eq(String value){
        this.setFieldCond("psdedritemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据关系界面]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedritemname__like(String value){
        this.setFieldCond("psdedritemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedrname__eq(String value){
        this.setFieldCond("psdedrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据关系组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdedrname__like(String value){
        this.setFieldCond("psdedrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[云实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[云实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdegridid__eq(String value){
        this.setFieldCond("psdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdelistid__eq(String value){
        this.setFieldCond("psdelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdelistname__eq(String value){
        this.setFieldCond("psdelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdelistname__like(String value){
        this.setFieldCond("psdelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体处理逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdepanelid__eq(String value){
        this.setFieldCond("psdepanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdepanelname__eq(String value){
        this.setFieldCond("psdepanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdepanelname__like(String value){
        this.setFieldCond("psdepanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdereportid__eq(String value){
        this.setFieldCond("psdereportid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdereportname__eq(String value){
        this.setFieldCond("psdereportname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdereportname__like(String value){
        this.setFieldCond("psdereportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体搜索表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdesearchformid__eq(String value){
        this.setFieldCond("psdesearchformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体搜索表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdesearchformname__eq(String value){
        this.setFieldCond("psdesearchformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体搜索表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdesearchformname__like(String value){
        this.setFieldCond("psdesearchformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdetoolbarid__eq(String value){
        this.setFieldCond("psdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdetreeviewid__eq(String value){
        this.setFieldCond("psdetreeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdetreeviewname__eq(String value){
        this.setFieldCond("psdetreeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdetreeviewname__like(String value){
        this.setFieldCond("psdetreeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdewizardid__eq(String value){
        this.setFieldCond("psdewizardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdewizardname__eq(String value){
        this.setFieldCond("psdewizardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体向导]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter psdewizardname__like(String value){
        this.setFieldCond("psdewizardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyscalendarid__eq(String value){
        this.setFieldCond("pssyscalendarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyscalendarname__eq(String value){
        this.setFieldCond("pssyscalendarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[日历部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyscalendarname__like(String value){
        this.setFieldCond("pssyscalendarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[容器样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[容器样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[容器样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据看板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysdashboardid__eq(String value){
        this.setFieldCond("pssysdashboardid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据看板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysdashboardname__eq(String value){
        this.setFieldCond("pssysdashboardname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据看板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysdashboardname__like(String value){
        this.setFieldCond("pssysdashboardname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图片资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图片资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysmapviewid__eq(String value){
        this.setFieldCond("pssysmapviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysmapviewname__eq(String value){
        this.setFieldCond("pssysmapviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[地图部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysmapviewname__like(String value){
        this.setFieldCond("pssysmapviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyssearchbarid__eq(String value){
        this.setFieldCond("pssyssearchbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyssearchbarname__eq(String value){
        this.setFieldCond("pssyssearchbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[搜索栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssyssearchbarname__like(String value){
        this.setFieldCond("pssyssearchbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysviewpanelitemname__eq(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysviewpanelitemname__like(String value){
        this.setFieldCond("pssysviewpanelitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[直接服务请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter rawservicemethod__eq(String value){
        this.setFieldCond("rawservicemethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用部件2用途]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refctrl2usage__eq(String value){
        this.setFieldCond("refctrl2usage", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[挂载界面引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refctrlusage__eq(String value){
        this.setFieldCond("refctrlusage", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter reflinkpsdeviewid__eq(String value){
        this.setFieldCond("reflinkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter reflinkpsdeviewname__eq(String value){
        this.setFieldCond("reflinkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体链接视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter reflinkpsdeviewname__like(String value){
        this.setFieldCond("reflinkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpickuppsdeviewid__eq(String value){
        this.setFieldCond("refpickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体选择视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpickuppsdeviewname__eq(String value){
        this.setFieldCond("refpickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体选择视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpickuppsdeviewname__like(String value){
        this.setFieldCond("refpickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdeacmodeid__eq(String value){
        this.setFieldCond("refpsdeacmodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdeacmodename__eq(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdeacmodename__like(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdedatasetid__eq(String value){
        this.setFieldCond("refpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdedatasetname__eq(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdedatasetname__like(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[下方间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter spacingbottom__eq(String value){
        this.setFieldCond("spacingbottom", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左侧间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter spacingleft__eq(String value){
        this.setFieldCond("spacingleft", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右侧间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter spacingright__eq(String value){
        this.setFieldCond("spacingright", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上方间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter spacingtop__eq(String value){
        this.setFieldCond("spacingtop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter templatemode__eq(Integer value){
        this.setFieldCond("templatemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter titlebarclosemode__eq(Integer value){
        this.setFieldCond("titlebarclosemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter valign__eq(String value){
        this.setFieldCond("valign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter valignself__eq(String value){
        this.setFieldCond("valignself", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[宽度模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysViewPanelItemFilter widthmode__eq(String value){
        this.setFieldCond("widthmode", Conditions.EQ, value);
        return this;
    }

}
