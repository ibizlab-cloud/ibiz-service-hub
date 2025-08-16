package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATAVIEW 过滤器对象
 */
public class PSDEDataViewFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDataViewFilter(){
    
    }      

    /**
     * 设置属性[异步实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter asyncpsdedsid__eq(String value){
        this.setFieldCond("asyncpsdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter asyncpsdedsname__eq(String value){
        this.setFieldCond("asyncpsdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter asyncpsdedsname__like(String value){
        this.setFieldCond("asyncpsdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter batpsdetoolbarid__eq(String value){
        this.setFieldCond("batpsdetoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter batpsdetoolbarname__eq(String value){
        this.setFieldCond("batpsdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter batpsdetoolbarname__like(String value){
        this.setFieldCond("batpsdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[卡片视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter dataviewstyle__eq(String value){
        this.setFieldCond("dataviewstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupbarclosemode__eq(Integer value){
        this.setFieldCond("groupbarclosemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组布局]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouplayout__eq(String value){
        this.setFieldCond("grouplayout", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupmode__eq(String value){
        this.setFieldCond("groupmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupmovepsdeactionid__eq(String value){
        this.setFieldCond("groupmovepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupmovepsdeactionname__eq(String value){
        this.setFieldCond("groupmovepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupmovepsdeactionname__like(String value){
        this.setFieldCond("groupmovepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdeid__eq(String value){
        this.setFieldCond("grouppsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdename__eq(String value){
        this.setFieldCond("grouppsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdename__like(String value){
        this.setFieldCond("grouppsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdeuagroupid__eq(String value){
        this.setFieldCond("grouppsdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdeuagroupname__eq(String value){
        this.setFieldCond("grouppsdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdeuagroupname__like(String value){
        this.setFieldCond("grouppsdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyscssid__eq(String value){
        this.setFieldCond("grouppssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyscssname__eq(String value){
        this.setFieldCond("grouppssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyscssname__like(String value){
        this.setFieldCond("grouppssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyspfpluginid__eq(String value){
        this.setFieldCond("grouppssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyspfpluginname__eq(String value){
        this.setFieldCond("grouppssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyspfpluginname__like(String value){
        this.setFieldCond("grouppssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupquickpsdetbid__eq(String value){
        this.setFieldCond("groupquickpsdetbid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupquickpsdetbname__eq(String value){
        this.setFieldCond("groupquickpsdetbname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupquickpsdetbname__like(String value){
        this.setFieldCond("groupquickpsdetbname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupstyle__eq(String value){
        this.setFieldCond("groupstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyscssid__eq(String value){
        this.setFieldCond("itempssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyscssname__eq(String value){
        this.setFieldCond("itempssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyscssname__like(String value){
        this.setFieldCond("itempssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyspfpluginid__eq(String value){
        this.setFieldCond("itempssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyspfpluginname__eq(String value){
        this.setFieldCond("itempssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyspfpluginname__like(String value){
        this.setFieldCond("itempssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter layoutitemtype__eq(String value){
        this.setFieldCond("layoutitemtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter movepsdeactionid__eq(String value){
        this.setFieldCond("movepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter movepsdeactionname__eq(String value){
        this.setFieldCond("movepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter movepsdeactionname__like(String value){
        this.setFieldCond("movepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsderid__eq(String value){
        this.setFieldCond("navpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdername__eq(String value){
        this.setFieldCond("navpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdername__like(String value){
        this.setFieldCond("navpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdeviewbaseid__eq(String value){
        this.setFieldCond("navpsdeviewbaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdeviewbasename__eq(String value){
        this.setFieldCond("navpsdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdeviewbasename__like(String value){
        this.setFieldCond("navpsdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navviewpos__eq(String value){
        this.setFieldCond("navviewpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navviewshowmode__eq(Integer value){
        this.setFieldCond("navviewshowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分页数量]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pagingsize__eq(Integer value){
        this.setFieldCond("pagingsize", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[卡片视图名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedataviewname__eq(String value){
        this.setFieldCond("psdedataviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[卡片视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedataviewname__like(String value){
        this.setFieldCond("psdedataviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据视图项布局表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据视图项布局表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据视图项布局表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[卡片布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[卡片布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[卡片布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter quickpsdetoolbarid__eq(String value){
        this.setFieldCond("quickpsdetoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter quickpsdetoolbarname__eq(String value){
        this.setFieldCond("quickpsdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter quickpsdetoolbarname__like(String value){
        this.setFieldCond("quickpsdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[泳道代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter swimlanepscodelistid__eq(String value){
        this.setFieldCond("swimlanepscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[泳道代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter swimlanepscodelistname__eq(String value){
        this.setFieldCond("swimlanepscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[泳道代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter swimlanepscodelistname__like(String value){
        this.setFieldCond("swimlanepscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", LIKE, value);
        return this;
    }

}
