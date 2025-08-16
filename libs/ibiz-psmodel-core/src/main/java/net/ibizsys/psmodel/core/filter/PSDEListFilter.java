package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELIST 过滤器对象
 */
public class PSDEListFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEListFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter asyncpsdedsid__eq(String value){
        this.setFieldCond("asyncpsdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter asyncpsdedsname__eq(String value){
        this.setFieldCond("asyncpsdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[异步实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter asyncpsdedsname__like(String value){
        this.setFieldCond("asyncpsdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter batpsdetoolbarid__eq(String value){
        this.setFieldCond("batpsdetoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter batpsdetoolbarname__eq(String value){
        this.setFieldCond("batpsdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter batpsdetoolbarname__like(String value){
        this.setFieldCond("batpsdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter copypsdeactionid__eq(String value){
        this.setFieldCond("copypsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter copypsdeactionname__eq(String value){
        this.setFieldCond("copypsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[复制数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter copypsdeactionname__like(String value){
        this.setFieldCond("copypsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter createpsdeactionid__eq(String value){
        this.setFieldCond("createpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter createpsdeactionname__eq(String value){
        this.setFieldCond("createpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[建立数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter createpsdeactionname__like(String value){
        this.setFieldCond("createpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[即时编辑模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter enableedit__eq(Integer value){
        this.setFieldCond("enableedit", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter getdraftpsdeactionid__eq(String value){
        this.setFieldCond("getdraftpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter getdraftpsdeactionname__eq(String value){
        this.setFieldCond("getdraftpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取草稿数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter getdraftpsdeactionname__like(String value){
        this.setFieldCond("getdraftpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter getpsdeactionid__eq(String value){
        this.setFieldCond("getpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter getpsdeactionname__eq(String value){
        this.setFieldCond("getpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[获取数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter getpsdeactionname__like(String value){
        this.setFieldCond("getpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupbarclosemode__eq(Integer value){
        this.setFieldCond("groupbarclosemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupmode__eq(String value){
        this.setFieldCond("groupmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupmovepsdeactionid__eq(String value){
        this.setFieldCond("groupmovepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupmovepsdeactionname__eq(String value){
        this.setFieldCond("groupmovepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组移动数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupmovepsdeactionname__like(String value){
        this.setFieldCond("groupmovepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdeid__eq(String value){
        this.setFieldCond("grouppsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdename__eq(String value){
        this.setFieldCond("grouppsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdename__like(String value){
        this.setFieldCond("grouppsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdeuagroupid__eq(String value){
        this.setFieldCond("grouppsdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdeuagroupname__eq(String value){
        this.setFieldCond("grouppsdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdeuagroupname__like(String value){
        this.setFieldCond("grouppsdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyscssid__eq(String value){
        this.setFieldCond("grouppssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyscssname__eq(String value){
        this.setFieldCond("grouppssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyscssname__like(String value){
        this.setFieldCond("grouppssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyspfpluginid__eq(String value){
        this.setFieldCond("grouppssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyspfpluginname__eq(String value){
        this.setFieldCond("grouppssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyspfpluginname__like(String value){
        this.setFieldCond("grouppssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupstyle__eq(String value){
        this.setFieldCond("groupstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyscssid__eq(String value){
        this.setFieldCond("itempssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyscssname__eq(String value){
        this.setFieldCond("itempssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyscssname__like(String value){
        this.setFieldCond("itempssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyspfpluginid__eq(String value){
        this.setFieldCond("itempssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyspfpluginname__eq(String value){
        this.setFieldCond("itempssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyspfpluginname__like(String value){
        this.setFieldCond("itempssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端列表样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter mobliststyle__eq(String value){
        this.setFieldCond("mobliststyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter movepsdeactionid__eq(String value){
        this.setFieldCond("movepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter movepsdeactionname__eq(String value){
        this.setFieldCond("movepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter movepsdeactionname__like(String value){
        this.setFieldCond("movepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsderid__eq(String value){
        this.setFieldCond("navpsderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdername__eq(String value){
        this.setFieldCond("navpsdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdername__like(String value){
        this.setFieldCond("navpsdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdeviewbaseid__eq(String value){
        this.setFieldCond("navpsdeviewbaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdeviewbasename__eq(String value){
        this.setFieldCond("navpsdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdeviewbasename__like(String value){
        this.setFieldCond("navpsdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navviewpos__eq(String value){
        this.setFieldCond("navviewpos", EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navviewshowmode__eq(Integer value){
        this.setFieldCond("navviewshowmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[列表后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdelistname__eq(String value){
        this.setFieldCond("psdelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdelistname__like(String value){
        this.setFieldCond("psdelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter quickpsdetoolbarid__eq(String value){
        this.setFieldCond("quickpsdetoolbarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter quickpsdetoolbarname__eq(String value){
        this.setFieldCond("quickpsdetoolbarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter quickpsdetoolbarname__like(String value){
        this.setFieldCond("quickpsdetoolbarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter removepsdeactionid__eq(String value){
        this.setFieldCond("removepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter removepsdeactionname__eq(String value){
        this.setFieldCond("removepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[删除数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter removepsdeactionname__like(String value){
        this.setFieldCond("removepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[泳道代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter swimlanepscodelistid__eq(String value){
        this.setFieldCond("swimlanepscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[泳道代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter swimlanepscodelistname__eq(String value){
        this.setFieldCond("swimlanepscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[泳道代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter swimlanepscodelistname__like(String value){
        this.setFieldCond("swimlanepscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter updatepsdeactionid__eq(String value){
        this.setFieldCond("updatepsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter updatepsdeactionname__eq(String value){
        this.setFieldCond("updatepsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[更新数据实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter updatepsdeactionname__like(String value){
        this.setFieldCond("updatepsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter user2psdeactionid__eq(String value){
        this.setFieldCond("user2psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter user2psdeactionname__eq(String value){
        this.setFieldCond("user2psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义实体行为2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter user2psdeactionname__like(String value){
        this.setFieldCond("user2psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter userpsdeactionid__eq(String value){
        this.setFieldCond("userpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter userpsdeactionname__eq(String value){
        this.setFieldCond("userpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter userpsdeactionname__like(String value){
        this.setFieldCond("userpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
