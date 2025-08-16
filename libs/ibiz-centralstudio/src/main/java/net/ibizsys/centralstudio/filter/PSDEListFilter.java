package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELIST 过滤器对象
 */
public class PSDEListFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEListFilter(){
    
    }      

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter adpsdelogicid__eq(String value){
        this.setFieldCond("adpsdelogicid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter adpsdelogicname__eq(String value){
        this.setFieldCond("adpsdelogicname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[查询转换逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter adpsdelogicname__like(String value){
        this.setFieldCond("adpsdelogicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter batpsdetoolbarid__eq(String value){
        this.setFieldCond("batpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter batpsdetoolbarname__eq(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[批操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter batpsdetoolbarname__like(String value){
        this.setFieldCond("batpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter emptytextpslanresid__eq(String value){
        this.setFieldCond("emptytextpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter emptytextpslanresname__eq(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter emptytextpslanresname__like(String value){
        this.setFieldCond("emptytextpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[即时编辑模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter enableedit__eq(Integer value){
        this.setFieldCond("enableedit", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组栏关闭模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupbarclosemode__eq(Integer value){
        this.setFieldCond("groupbarclosemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter groupmode__eq(String value){
        this.setFieldCond("groupmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdefid__eq(String value){
        this.setFieldCond("grouppsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdefname__eq(String value){
        this.setFieldCond("grouppsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdefname__like(String value){
        this.setFieldCond("grouppsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdeuagroupid__eq(String value){
        this.setFieldCond("grouppsdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdeuagroupname__eq(String value){
        this.setFieldCond("grouppsdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组界面行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppsdeuagroupname__like(String value){
        this.setFieldCond("grouppsdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyscssid__eq(String value){
        this.setFieldCond("grouppssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyscssname__eq(String value){
        this.setFieldCond("grouppssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyscssname__like(String value){
        this.setFieldCond("grouppssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyspfpluginid__eq(String value){
        this.setFieldCond("grouppssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyspfpluginname__eq(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分组前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter grouppssyspfpluginname__like(String value){
        this.setFieldCond("grouppssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyscssid__eq(String value){
        this.setFieldCond("itempssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyscssname__eq(String value){
        this.setFieldCond("itempssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认项样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyscssname__like(String value){
        this.setFieldCond("itempssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyspfpluginid__eq(String value){
        this.setFieldCond("itempssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyspfpluginname__eq(String value){
        this.setFieldCond("itempssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter itempssyspfpluginname__like(String value){
        this.setFieldCond("itempssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortdir__eq(String value){
        this.setFieldCond("minorsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortpsdefid__eq(String value){
        this.setFieldCond("minorsortpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortpsdefname__eq(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认排序属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter minorsortpsdefname__like(String value){
        this.setFieldCond("minorsortpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端列表样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter mobliststyle__eq(String value){
        this.setFieldCond("mobliststyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsderid__eq(String value){
        this.setFieldCond("navpsderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdername__eq(String value){
        this.setFieldCond("navpsdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdername__like(String value){
        this.setFieldCond("navpsdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdeviewbaseid__eq(String value){
        this.setFieldCond("navpsdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdeviewbasename__eq(String value){
        this.setFieldCond("navpsdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[导航视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter navpsdeviewbasename__like(String value){
        this.setFieldCond("navpsdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter no2psdeuagroupid__eq(String value){
        this.setFieldCond("no2psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter no2psdeuagroupname__eq(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter no2psdeuagroupname__like(String value){
        this.setFieldCond("no2psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter ordervaluepsdefid__eq(String value){
        this.setFieldCond("ordervaluepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter ordervaluepsdefname__eq(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter ordervaluepsdefname__like(String value){
        this.setFieldCond("ordervaluepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[列表后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrlmsgid__eq(String value){
        this.setFieldCond("psctrlmsgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrlmsgname__eq(String value){
        this.setFieldCond("psctrlmsgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部件消息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psctrlmsgname__like(String value){
        this.setFieldCond("psctrlmsgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdelistname__eq(String value){
        this.setFieldCond("psdelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体列表标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdelistname__like(String value){
        this.setFieldCond("psdelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeuagroupid__eq(String value){
        this.setFieldCond("psdeuagroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeuagroupname__eq(String value){
        this.setFieldCond("psdeuagroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左滑行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter psdeuagroupname__like(String value){
        this.setFieldCond("psdeuagroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部件样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[项布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter quickpsdetoolbarid__eq(String value){
        this.setFieldCond("quickpsdetoolbarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter quickpsdetoolbarname__eq(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速操作工具栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter quickpsdetoolbarname__like(String value){
        this.setFieldCond("quickpsdetoolbarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEListFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

}
