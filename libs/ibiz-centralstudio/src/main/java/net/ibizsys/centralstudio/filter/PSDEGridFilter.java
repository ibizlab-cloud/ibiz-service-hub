package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEGRID 过滤器对象
 */
public class PSDEGridFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEGridFilter(){
    
    }      

    /**
     * 设置属性[聚合模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggmode__eq(String value){
        this.setFieldCond("aggmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeactionid__eq(String value){
        this.setFieldCond("aggpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeactionname__eq(String value){
        this.setFieldCond("aggpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeactionname__like(String value){
        this.setFieldCond("aggpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdedsid__eq(String value){
        this.setFieldCond("aggpsdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdedsname__eq(String value){
        this.setFieldCond("aggpsdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdedsname__like(String value){
        this.setFieldCond("aggpsdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeid__eq(String value){
        this.setFieldCond("aggpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdename__eq(String value){
        this.setFieldCond("aggpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdename__like(String value){
        this.setFieldCond("aggpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpssysviewpanelid__eq(String value){
        this.setFieldCond("aggpssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpssysviewpanelname__eq(String value){
        this.setFieldCond("aggpssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpssysviewpanelname__like(String value){
        this.setFieldCond("aggpssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter batpsdetoolbarid__eq(String value){
        this.setFieldCond("batpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter batpsdetoolbarname__eq(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter batpsdetoolbarname__like(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[列启用链接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter colenablelink__eq(Integer value){
        this.setFieldCond("colenablelink", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter gridstyle__eq(String value){
        this.setFieldCond("gridstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter groupmode__eq(String value){
        this.setFieldCond("groupmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdeuagroupid__eq(String value){
        this.setFieldCond("grouppsdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdeuagroupname__eq(String value){
        this.setFieldCond("grouppsdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdeuagroupname__like(String value){
        this.setFieldCond("grouppsdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyscssid__eq(String value){
        this.setFieldCond("grouppssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyscssname__eq(String value){
        this.setFieldCond("grouppssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyscssname__like(String value){
        this.setFieldCond("grouppssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyspfpluginid__eq(String value){
        this.setFieldCond("grouppssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyspfpluginname__eq(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyspfpluginname__like(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认行样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter itempssyscssid__eq(String value){
        this.setFieldCond("itempssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认行样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter itempssyscssname__eq(String value){
        this.setFieldCond("itempssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认行样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter itempssyscssname__like(String value){
        this.setFieldCond("itempssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsderid__eq(String value){
        this.setFieldCond("navpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdername__eq(String value){
        this.setFieldCond("navpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdername__like(String value){
        this.setFieldCond("navpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdeviewbaseid__eq(String value){
        this.setFieldCond("navpsdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdeviewbasename__eq(String value){
        this.setFieldCond("navpsdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdeviewbasename__like(String value){
        this.setFieldCond("navpsdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分页数量]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pagingsize__eq(Integer value){
        this.setFieldCond("pagingsize", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter quickpsdetoolbarid__eq(String value){
        this.setFieldCond("quickpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter quickpsdetoolbarname__eq(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter quickpsdetoolbarname__like(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter sortmode__eq(String value){
        this.setFieldCond("sortmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树表父数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter treeppsdefid__eq(String value){
        this.setFieldCond("treeppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树表父数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter treeppsdefname__eq(String value){
        this.setFieldCond("treeppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[树表父数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter treeppsdefname__like(String value){
        this.setFieldCond("treeppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", Conditions.LIKE, value);
        return this;
    }

}
