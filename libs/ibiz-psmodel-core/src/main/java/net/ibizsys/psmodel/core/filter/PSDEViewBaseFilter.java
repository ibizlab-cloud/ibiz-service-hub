package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVIEWBASE 过滤器对象
 */
public class PSDEViewBaseFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEViewBaseFilter(){
    
    }      

    /**
     * 设置属性[访问用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter accusermode__eq(String value){
        this.setFieldCond("accusermode", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[快速分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认打开方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter openmode__eq(String value){
        this.setFieldCond("openmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能视图模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter predefinedviewtype__eq(String value){
        this.setFieldCond("predefinedviewtype", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("predefineviewtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作向导组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeawgroupid__eq(String value){
        this.setFieldCond("psdeawgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作向导组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeawgroupname__eq(String value){
        this.setFieldCond("psdeawgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作向导组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeawgroupname__like(String value){
        this.setFieldCond("psdeawgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[控制关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psderid__eq(String value){
        this.setFieldCond("psderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[控制关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[控制关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeviewbasetype__eq(String value){
        this.setFieldCond("psdeviewbasetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体视图模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdynadeviewtemplid__eq(String value){
        this.setFieldCond("psdynadeviewtemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体视图模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdynadeviewtemplname__eq(String value){
        this.setFieldCond("psdynadeviewtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体视图模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdynadeviewtemplname__like(String value){
        this.setFieldCond("psdynadeviewtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pshelpmoduleid__eq(String value){
        this.setFieldCond("pshelpmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pshelpmodulename__eq(String value){
        this.setFieldCond("pshelpmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pshelpmodulename__like(String value){
        this.setFieldCond("pshelpmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssubviewtypeid__eq(String value){
        this.setFieldCond("pssubviewtypeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssubviewtypename__eq(String value){
        this.setFieldCond("pssubviewtypename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssubviewtypename__like(String value){
        this.setFieldCond("pssubviewtypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewengineid__eq(String value){
        this.setFieldCond("psviewengineid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewenginename__eq(String value){
        this.setFieldCond("psviewenginename", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewenginename__like(String value){
        this.setFieldCond("psviewenginename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfdeid__eq(String value){
        this.setFieldCond("pswfdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfdename__eq(String value){
        this.setFieldCond("pswfdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfdename__like(String value){
        this.setFieldCond("pswfdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter subcappslanresid__eq(String value){
        this.setFieldCond("subcappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter subcappslanresname__eq(String value){
        this.setFieldCond("subcappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter subcappslanresname__like(String value){
        this.setFieldCond("subcappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[临时数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter tempmode__eq(Integer value){
        this.setFieldCond("tempmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图抬头]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter title__like(String value){
        this.setFieldCond("title", LIKE, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", LIKE, value);
        return this;
    }

}
