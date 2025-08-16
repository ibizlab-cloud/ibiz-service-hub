package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVIEWBASE 过滤器对象
 */
public class PSDEViewBaseFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEViewBaseFilter(){
    
    }      

    /**
     * 设置属性[访问用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter accusermode__eq(String value){
        this.setFieldCond("accusermode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[快速分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter grouppscodelistid__eq(String value){
        this.setFieldCond("grouppscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速分组代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter grouppscodelistname__eq(String value){
        this.setFieldCond("grouppscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[快速分组代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter grouppscodelistname__like(String value){
        this.setFieldCond("grouppscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认打开方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter openmode__eq(String value){
        this.setFieldCond("openmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能视图模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter predefinedviewtype__eq(String value){
        this.setFieldCond("predefinedviewtype", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("predefineviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作向导组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeawgroupid__eq(String value){
        this.setFieldCond("psdeawgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作向导组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeawgroupname__eq(String value){
        this.setFieldCond("psdeawgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作向导组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeawgroupname__like(String value){
        this.setFieldCond("psdeawgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[控制关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[控制关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[控制关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdeviewbasetype__eq(String value){
        this.setFieldCond("psdeviewbasetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体视图模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdynadeviewtemplid__eq(String value){
        this.setFieldCond("psdynadeviewtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体视图模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdynadeviewtemplname__eq(String value){
        this.setFieldCond("psdynadeviewtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体视图模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psdynadeviewtemplname__like(String value){
        this.setFieldCond("psdynadeviewtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pshelpmoduleid__eq(String value){
        this.setFieldCond("pshelpmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pshelpmodulename__eq(String value){
        this.setFieldCond("pshelpmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pshelpmodulename__like(String value){
        this.setFieldCond("pshelpmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssubviewtypeid__eq(String value){
        this.setFieldCond("pssubviewtypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssubviewtypename__eq(String value){
        this.setFieldCond("pssubviewtypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssubviewtypename__like(String value){
        this.setFieldCond("pssubviewtypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscounterid__eq(String value){
        this.setFieldCond("pssyscounterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscountername__eq(String value){
        this.setFieldCond("pssyscountername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统计数器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscountername__like(String value){
        this.setFieldCond("pssyscountername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewengineid__eq(String value){
        this.setFieldCond("psviewengineid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewenginename__eq(String value){
        this.setFieldCond("psviewenginename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图引擎]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewenginename__like(String value){
        this.setFieldCond("psviewenginename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfdeid__eq(String value){
        this.setFieldCond("pswfdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfdename__eq(String value){
        this.setFieldCond("pswfdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfdename__like(String value){
        this.setFieldCond("pswfdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter subcappslanresid__eq(String value){
        this.setFieldCond("subcappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter subcappslanresname__eq(String value){
        this.setFieldCond("subcappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter subcappslanresname__like(String value){
        this.setFieldCond("subcappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[临时数据模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter tempmode__eq(Integer value){
        this.setFieldCond("tempmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图抬头]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter title__like(String value){
        this.setFieldCond("title", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEViewBaseFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", Conditions.LIKE, value);
        return this;
    }

}
