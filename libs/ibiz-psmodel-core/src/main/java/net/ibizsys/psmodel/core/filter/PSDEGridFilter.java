package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEGRID 过滤器对象
 */
public class PSDEGridFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEGridFilter(){
    
    }      

    /**
     * 设置属性[聚合模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggmode__eq(String value){
        this.setFieldCond("aggmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeactionid__eq(String value){
        this.setFieldCond("aggpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeactionname__eq(String value){
        this.setFieldCond("aggpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeactionname__like(String value){
        this.setFieldCond("aggpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdedsid__eq(String value){
        this.setFieldCond("aggpsdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdedsname__eq(String value){
        this.setFieldCond("aggpsdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdedsname__like(String value){
        this.setFieldCond("aggpsdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdeid__eq(String value){
        this.setFieldCond("aggpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdename__eq(String value){
        this.setFieldCond("aggpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpsdename__like(String value){
        this.setFieldCond("aggpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpssysviewpanelid__eq(String value){
        this.setFieldCond("aggpssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpssysviewpanelname__eq(String value){
        this.setFieldCond("aggpssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter aggpssysviewpanelname__like(String value){
        this.setFieldCond("aggpssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter asyncpsdedsid__eq(String value){
        this.setFieldCond("asyncpsdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter asyncpsdedsname__eq(String value){
        this.setFieldCond("asyncpsdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter asyncpsdedsname__like(String value){
        this.setFieldCond("asyncpsdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter batpsdetoolbarid__eq(String value){
        this.setFieldCond("batpsdetoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter batpsdetoolbarname__eq(String value){
        this.setFieldCond("batpsdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter batpsdetoolbarname__like(String value){
        this.setFieldCond("batpsdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[列启用链接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter colenablelink__eq(Integer value){
        this.setFieldCond("colenablelink", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter gridstyle__eq(String value){
        this.setFieldCond("gridstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter groupmode__eq(String value){
        this.setFieldCond("groupmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdeuagroupid__eq(String value){
        this.setFieldCond("grouppsdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdeuagroupname__eq(String value){
        this.setFieldCond("grouppsdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppsdeuagroupname__like(String value){
        this.setFieldCond("grouppsdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyscssid__eq(String value){
        this.setFieldCond("grouppssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyscssname__eq(String value){
        this.setFieldCond("grouppssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyscssname__like(String value){
        this.setFieldCond("grouppssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyspfpluginid__eq(String value){
        this.setFieldCond("grouppssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyspfpluginname__eq(String value){
        this.setFieldCond("grouppssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter grouppssyspfpluginname__like(String value){
        this.setFieldCond("grouppssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter groupstyle__eq(String value){
        this.setFieldCond("groupstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认行样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter itempssyscssid__eq(String value){
        this.setFieldCond("itempssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认行样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter itempssyscssname__eq(String value){
        this.setFieldCond("itempssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认行样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter itempssyscssname__like(String value){
        this.setFieldCond("itempssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter movepsdeactionid__eq(String value){
        this.setFieldCond("movepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter movepsdeactionname__eq(String value){
        this.setFieldCond("movepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter movepsdeactionname__like(String value){
        this.setFieldCond("movepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsderid__eq(String value){
        this.setFieldCond("navpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdername__eq(String value){
        this.setFieldCond("navpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdername__like(String value){
        this.setFieldCond("navpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdeviewbaseid__eq(String value){
        this.setFieldCond("navpsdeviewbaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdeviewbasename__eq(String value){
        this.setFieldCond("navpsdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navpsdeviewbasename__like(String value){
        this.setFieldCond("navpsdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navviewpos__eq(String value){
        this.setFieldCond("navviewpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter navviewshowmode__eq(Integer value){
        this.setFieldCond("navviewshowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分页数量]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pagingsize__eq(Integer value){
        this.setFieldCond("pagingsize", EQ, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[表格名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态系统模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter quickpsdetoolbarid__eq(String value){
        this.setFieldCond("quickpsdetoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter quickpsdetoolbarname__eq(String value){
        this.setFieldCond("quickpsdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter quickpsdetoolbarname__like(String value){
        this.setFieldCond("quickpsdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter sortmode__eq(String value){
        this.setFieldCond("sortmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[树表父数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter treeppsdefid__eq(String value){
        this.setFieldCond("treeppsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[树表父数据属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter treeppsdefname__eq(String value){
        this.setFieldCond("treeppsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[树表父数据属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter treeppsdefname__like(String value){
        this.setFieldCond("treeppsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGridFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", LIKE, value);
        return this;
    }

}
