package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDATAVIEW 过滤器对象
 */
public class PSDEDataViewFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDataViewFilter(){
    
    }      

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter batpsdetoolbarid__eq(String value){
        this.setFieldCond("batpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter batpsdetoolbarname__eq(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter batpsdetoolbarname__like(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[卡片视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter dataviewstyle__eq(String value){
        this.setFieldCond("dataviewstyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupbarclosemode__eq(Integer value){
        this.setFieldCond("groupbarclosemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组布局]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouplayout__eq(String value){
        this.setFieldCond("grouplayout", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupmode__eq(String value){
        this.setFieldCond("groupmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdeuagroupid__eq(String value){
        this.setFieldCond("grouppsdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdeuagroupname__eq(String value){
        this.setFieldCond("grouppsdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppsdeuagroupname__like(String value){
        this.setFieldCond("grouppsdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyscssid__eq(String value){
        this.setFieldCond("grouppssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyscssname__eq(String value){
        this.setFieldCond("grouppssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyscssname__like(String value){
        this.setFieldCond("grouppssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyspfpluginid__eq(String value){
        this.setFieldCond("grouppssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyspfpluginname__eq(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter grouppssyspfpluginname__like(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupquickpsdetbid__eq(String value){
        this.setFieldCond("groupquickpsdetbid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupquickpsdetbname__eq(String value){
        this.setFieldCond("groupquickpsdetbname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter groupquickpsdetbname__like(String value){
        this.setFieldCond("groupquickpsdetbname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyscssid__eq(String value){
        this.setFieldCond("itempssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyscssname__eq(String value){
        this.setFieldCond("itempssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyscssname__like(String value){
        this.setFieldCond("itempssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyspfpluginid__eq(String value){
        this.setFieldCond("itempssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyspfpluginname__eq(String value){
        this.setFieldCond("itempssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter itempssyspfpluginname__like(String value){
        this.setFieldCond("itempssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsderid__eq(String value){
        this.setFieldCond("navpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdername__eq(String value){
        this.setFieldCond("navpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdername__like(String value){
        this.setFieldCond("navpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdeviewbaseid__eq(String value){
        this.setFieldCond("navpsdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdeviewbasename__eq(String value){
        this.setFieldCond("navpsdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter navpsdeviewbasename__like(String value){
        this.setFieldCond("navpsdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分页数量]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pagingsize__eq(Integer value){
        this.setFieldCond("pagingsize", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[卡片视图名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedataviewname__eq(String value){
        this.setFieldCond("psdedataviewname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[卡片视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdedataviewname__like(String value){
        this.setFieldCond("psdedataviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[卡片布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[卡片布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[卡片布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter quickpsdetoolbarid__eq(String value){
        this.setFieldCond("quickpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter quickpsdetoolbarname__eq(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDataViewFilter quickpsdetoolbarname__like(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

}
