package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFORMDETAIL 过滤器对象
 */
public class PSDEFormDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFormDetailFilter(){
    
    }      

    /**
     * 设置属性[按钮行为类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter btnactiontype__eq(String value){
        this.setFieldCond("btnactiontype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内置操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter buildinaction__eq(Integer value){
        this.setFieldCond("buildinaction", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输出代码表配置模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter codelistconfigmode__eq(Integer value){
        this.setFieldCond("codelistconfigmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter colalign__eq(String value){
        this.setFieldCond("colalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter contenttype__eq(String value){
        this.setFieldCond("contenttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[新建默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter createdvt__eq(String value){
        this.setFieldCond("createdvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ctrlpssyscssid__eq(String value){
        this.setFieldCond("ctrlpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ctrlpssyscssname__eq(String value){
        this.setFieldCond("ctrlpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ctrlpssyscssname__like(String value){
        this.setFieldCond("ctrlpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter detailstyle__eq(String value){
        this.setFieldCond("detailstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter editortype__eq(String value){
        this.setFieldCond("editortype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter enablecond__eq(Integer value){
        this.setFieldCond("enablecond", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex横轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter flexalign__eq(String value){
        this.setFieldCond("flexalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex布局方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter flexdir__eq(String value){
        this.setFieldCond("flexdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Flex纵轴对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter flexvalign__eq(String value){
        this.setFieldCond("flexvalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter halign__eq(String value){
        this.setFieldCond("halign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[水平对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter halignself__eq(String value){
        this.setFieldCond("halignself", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[高度模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter heightmode__eq(String value){
        this.setFieldCond("heightmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter iconalign__eq(String value){
        this.setFieldCond("iconalign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[忽略输入值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ignoreinput__eq(Integer value){
        this.setFieldCond("ignoreinput", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter itempsachandlerid__eq(String value){
        this.setFieldCond("itempsachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter itempsachandlername__eq(String value){
        this.setFieldCond("itempsachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter itempsachandlername__like(String value){
        this.setFieldCond("itempsachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标签位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter labelpos__eq(String value){
        this.setFieldCond("labelpos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter labelpssyscssid__eq(String value){
        this.setFieldCond("labelpssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter labelpssyscssname__eq(String value){
        this.setFieldCond("labelpssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter labelpssyscssname__like(String value){
        this.setFieldCond("labelpssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter layoutmode__eq(String value){
        this.setFieldCond("layoutmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter linkpsdeviewid__eq(String value){
        this.setFieldCond("linkpsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter linkpsdeviewname__eq(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据链接视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter linkpsdeviewname__like(String value){
        this.setFieldCond("linkpsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[遮罩模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter maskmode__eq(Integer value){
        this.setFieldCond("maskmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[遮罩语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter maskpslanresid__eq(String value){
        this.setFieldCond("maskpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[遮罩语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter maskpslanresname__eq(String value){
        this.setFieldCond("maskpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[遮罩语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter maskpslanresname__like(String value){
        this.setFieldCond("maskpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[多数据卡片视图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdedataviewid__eq(String value){
        this.setFieldCond("mdpsdedataviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据卡片视图部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdedataviewname__eq(String value){
        this.setFieldCond("mdpsdedataviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据卡片视图部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdedataviewname__like(String value){
        this.setFieldCond("mdpsdedataviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[多数据表单部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdeformid__eq(String value){
        this.setFieldCond("mdpsdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据表单部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdeformname__eq(String value){
        this.setFieldCond("mdpsdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据表单部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdeformname__like(String value){
        this.setFieldCond("mdpsdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[多数据表格部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdegridid__eq(String value){
        this.setFieldCond("mdpsdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据表格部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdegridname__eq(String value){
        this.setFieldCond("mdpsdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据表格部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdegridname__like(String value){
        this.setFieldCond("mdpsdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[多数据列表部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdelistid__eq(String value){
        this.setFieldCond("mdpsdelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据列表部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdelistname__eq(String value){
        this.setFieldCond("mdpsdelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据列表部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter mdpsdelistname__like(String value){
        this.setFieldCond("mdpsdelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter noprivdm__eq(Integer value){
        this.setFieldCond("noprivdm", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter phpslanresid__eq(String value){
        this.setFieldCond("phpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter phpslanresname__eq(String value){
        this.setFieldCond("phpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[占位内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter phpslanresname__like(String value){
        this.setFieldCond("phpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pickuppsdeviewid__eq(String value){
        this.setFieldCond("pickuppsdeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pickuppsdeviewname__eq(String value){
        this.setFieldCond("pickuppsdeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[选择界面视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pickuppsdeviewname__like(String value){
        this.setFieldCond("pickuppsdeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父表单成员]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ppsdeformdetailid__eq(String value){
        this.setFieldCond("ppsdeformdetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ppsdeformdetailname__eq(String value){
        this.setFieldCond("ppsdeformdetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ppsdeformdetailname__like(String value){
        this.setFieldCond("ppsdeformdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据关系界面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdedritemid__eq(String value){
        this.setFieldCond("psdedritemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据关系界面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdedritemname__eq(String value){
        this.setFieldCond("psdedritemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据关系界面]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdedritemname__like(String value){
        this.setFieldCond("psdedritemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表单项模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefuimodeid__eq(String value){
        this.setFieldCond("psdefuimodeid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdefformitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefuimodename__eq(String value){
        this.setFieldCond("psdefuimodename", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdefformitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefuimodename__like(String value){
        this.setFieldCond("psdefuimodename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdefformitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefiupdateid__eq(String value){
        this.setFieldCond("psdefiupdateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项更新]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefiupdatename__eq(String value){
        this.setFieldCond("psdefiupdatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单项更新]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefiupdatename__like(String value){
        this.setFieldCond("psdefiupdatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformdetailname__eq(String value){
        this.setFieldCond("psdeformdetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformdetailname__like(String value){
        this.setFieldCond("psdeformdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformrfid__eq(String value){
        this.setFieldCond("psdeformrfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformrfname__eq(String value){
        this.setFieldCond("psdeformrfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单引用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeformrfname__like(String value){
        this.setFieldCond("psdeformrfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefsfitemid__eq(String value){
        this.setFieldCond("psdefsfitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefsfitemname__eq(String value){
        this.setFieldCond("psdefsfitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性搜索模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdefsfitemname__like(String value){
        this.setFieldCond("psdefsfitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体编号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeuiactionid__eq(String value){
        this.setFieldCond("psdeuiactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeuiactionname__eq(String value){
        this.setFieldCond("psdeuiactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter psdeuiactionname__like(String value){
        this.setFieldCond("psdeuiactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[容器样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[容器样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[容器样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysdictcatid__eq(String value){
        this.setFieldCond("pssysdictcatid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysdictcatname__eq(String value){
        this.setFieldCond("pssysdictcatname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入词条类别]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysdictcatname__like(String value){
        this.setFieldCond("pssysdictcatname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyseditorstyleid__eq(String value){
        this.setFieldCond("pssyseditorstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyseditorstylename__eq(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[显示图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[直接服务请求方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter rawservicemethod__eq(String value){
        this.setFieldCond("rawservicemethod", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdeacmodeid__eq(String value){
        this.setFieldCond("refpsdeacmodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdeacmodename__eq(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体自填模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdeacmodename__like(String value){
        this.setFieldCond("refpsdeacmodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdedatasetid__eq(String value){
        this.setFieldCond("refpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdedatasetname__eq(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdedatasetname__like(String value){
        this.setFieldCond("refpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表单成员引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdeformdetailid__eq(String value){
        this.setFieldCond("refpsdeformdetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单成员引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdeformdetailname__eq(String value){
        this.setFieldCond("refpsdeformdetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[表单成员引用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdeformdetailname__like(String value){
        this.setFieldCond("refpsdeformdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsderid__eq(String value){
        this.setFieldCond("refpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdername__eq(String value){
        this.setFieldCond("refpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter refpsdername__like(String value){
        this.setFieldCond("refpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[显示更多模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter showmoremode__eq(Integer value){
        this.setFieldCond("showmoremode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[下方间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter spacingbottom__eq(String value){
        this.setFieldCond("spacingbottom", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左侧间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter spacingleft__eq(String value){
        this.setFieldCond("spacingleft", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右侧间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter spacingright__eq(String value){
        this.setFieldCond("spacingright", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上方间隔]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter spacingtop__eq(String value){
        this.setFieldCond("spacingtop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter templatemode__eq(Integer value){
        this.setFieldCond("templatemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter titlebarclosemode__eq(Integer value){
        this.setFieldCond("titlebarclosemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ucpssyspfpluginid__eq(String value){
        this.setFieldCond("ucpssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ucpssyspfpluginname__eq(String value){
        this.setFieldCond("ucpssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter ucpssyspfpluginname__like(String value){
        this.setFieldCond("ucpssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter updatedvt__eq(String value){
        this.setFieldCond("updatedvt", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter valign__eq(String value){
        this.setFieldCond("valign", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[垂直对齐（自身）]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter valignself__eq(String value){
        this.setFieldCond("valignself", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[回写属性值模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter wbdefmode__eq(Integer value){
        this.setFieldCond("wbdefmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[宽度模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFormDetailFilter widthmode__eq(String value){
        this.setFieldCond("widthmode", Conditions.EQ, value);
        return this;
    }

}
