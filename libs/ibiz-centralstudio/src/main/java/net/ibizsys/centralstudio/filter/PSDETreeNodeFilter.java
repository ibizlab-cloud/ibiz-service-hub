package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDETREENODE 过滤器对象
 */
public class PSDETreeNodeFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDETreeNodeFilter(){
    
    }      

    /**
     * 设置属性[子节点计数属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter childcntpsdefid__eq(String value){
        this.setFieldCond("childcntpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子节点计数属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter childcntpsdefname__eq(String value){
        this.setFieldCond("childcntpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子节点计数属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter childcntpsdefname__like(String value){
        this.setFieldCond("childcntpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter clspsdefid__eq(String value){
        this.setFieldCond("clspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter clspsdefname__eq(String value){
        this.setFieldCond("clspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式表属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter clspsdefname__like(String value){
        this.setFieldCond("clspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[计数显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter countermode__eq(Integer value){
        this.setFieldCond("countermode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类别属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter datatypepsdefid__eq(String value){
        this.setFieldCond("datatypepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类别属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter datatypepsdefname__eq(String value){
        this.setFieldCond("datatypepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类别属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter datatypepsdefname__like(String value){
        this.setFieldCond("datatypepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter editdatamode__eq(String value){
        this.setFieldCond("editdatamode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter filterpsdedsid__eq(String value){
        this.setFieldCond("filterpsdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter filterpsdedsname__eq(String value){
        this.setFieldCond("filterpsdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[过滤数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter filterpsdedsname__like(String value){
        this.setFieldCond("filterpsdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter iconpsdefid__eq(String value){
        this.setFieldCond("iconpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter iconpsdefname__eq(String value){
        this.setFieldCond("iconpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter iconpsdefname__like(String value){
        this.setFieldCond("iconpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[叶子节点标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter leafflagpsdefid__eq(String value){
        this.setFieldCond("leafflagpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[叶子节点标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter leafflagpsdefname__eq(String value){
        this.setFieldCond("leafflagpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[叶子节点标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter leafflagpsdefname__like(String value){
        this.setFieldCond("leafflagpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter namepslanresid__eq(String value){
        this.setFieldCond("namepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter namepslanresname__eq(String value){
        this.setFieldCond("namepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter namepslanresname__like(String value){
        this.setFieldCond("namepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[新建数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter newdatamode__eq(String value){
        this.setFieldCond("newdatamode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父标识2绑定属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter nodeid2psdefid__eq(String value){
        this.setFieldCond("nodeid2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父标识3绑定属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter nodeid3psdefid__eq(String value){
        this.setFieldCond("nodeid3psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父标识4绑定属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter nodeid4psdefid__eq(String value){
        this.setFieldCond("nodeid4psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父标识绑定属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter nodeidpsdefid__eq(String value){
        this.setFieldCond("nodeidpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树节点标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter nodetype__like(String value){
        this.setFieldCond("nodetype", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdegridid__eq(String value){
        this.setFieldCond("psdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树表格]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdelogicid__eq(String value){
        this.setFieldCond("psdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdelogicname__eq(String value){
        this.setFieldCond("psdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文数据逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdelogicname__like(String value){
        this.setFieldCond("psdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[附加关系参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加导航关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[附加导航关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdetoolbarid__eq(String value){
        this.setFieldCond("psdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdetoolbarname__eq(String value){
        this.setFieldCond("psdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上下文菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdetoolbarname__like(String value){
        this.setFieldCond("psdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[树节点名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdetreenodename__like(String value){
        this.setFieldCond("psdetreenodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdetreeviewid__eq(String value){
        this.setFieldCond("psdetreeviewid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdetreeviewname__eq(String value){
        this.setFieldCond("psdetreeviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体树视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdetreeviewname__like(String value){
        this.setFieldCond("psdetreeviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[节点界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[节点样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[节点样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[节点图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[节点图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[节点图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[节点前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[节点前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[节点前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[树节点布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树节点布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树节点布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter removepsdeopprivid__eq(String value){
        this.setFieldCond("removepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter removepsdeopprivname__eq(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter removepsdeopprivname__like(String value){
        this.setFieldCond("removepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter sortdir__eq(String value){
        this.setFieldCond("sortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter sortpsdefid__eq(String value){
        this.setFieldCond("sortpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter sortpsdefname__eq(String value){
        this.setFieldCond("sortpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter sortpsdefname__like(String value){
        this.setFieldCond("sortpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[节点提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter tippslanresid__eq(String value){
        this.setFieldCond("tippslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter tippslanresname__eq(String value){
        this.setFieldCond("tippslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter tippslanresname__like(String value){
        this.setFieldCond("tippslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter tipspsdefid__eq(String value){
        this.setFieldCond("tipspsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter tipspsdefname__eq(String value){
        this.setFieldCond("tipspsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[提示属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter tipspsdefname__like(String value){
        this.setFieldCond("tipspsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[树节点类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter treenodetype__eq(String value){
        this.setFieldCond("treenodetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter updatepsdeopprivid__eq(String value){
        this.setFieldCond("updatepsdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter updatepsdeopprivname__eq(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter updatepsdeopprivname__like(String value){
        this.setFieldCond("updatepsdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDETreeNodeFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
