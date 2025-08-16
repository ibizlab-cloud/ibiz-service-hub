package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPVIEW 过滤器对象
 */
public class PSAppViewFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppViewFilter(){
    
    }      

    /**
     * 设置属性[访问用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter accusermode__eq(String value){
        this.setFieldCond("accusermode", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter appviewsn__like(String value){
        this.setFieldCond("appviewsn", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappmoduleid__eq(String value){
        this.setFieldCond("psappmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappmodulename__eq(String value){
        this.setFieldCond("psappmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappmodulename__like(String value){
        this.setFieldCond("psappmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psapptitlebarid__eq(String value){
        this.setFieldCond("psapptitlebarid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psapptitlebarname__eq(String value){
        this.setFieldCond("psapptitlebarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psapptitlebarname__like(String value){
        this.setFieldCond("psapptitlebarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappviewtype__eq(String value){
        this.setFieldCond("psappviewtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdynadeviewtemplid__eq(String value){
        this.setFieldCond("psdynadeviewtemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdynadeviewtemplname__eq(String value){
        this.setFieldCond("psdynadeviewtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdynadeviewtemplname__like(String value){
        this.setFieldCond("psdynadeviewtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pshelpmoduleid__eq(String value){
        this.setFieldCond("pshelpmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pshelpmodulename__eq(String value){
        this.setFieldCond("pshelpmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pshelpmodulename__like(String value){
        this.setFieldCond("pshelpmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssubviewtypeid__eq(String value){
        this.setFieldCond("pssubviewtypeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssubviewtypename__eq(String value){
        this.setFieldCond("pssubviewtypename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssubviewtypename__like(String value){
        this.setFieldCond("pssubviewtypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter subcappslanresid__eq(String value){
        this.setFieldCond("subcappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter subcappslanresname__eq(String value){
        this.setFieldCond("subcappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter subcappslanresname__like(String value){
        this.setFieldCond("subcappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图抬头]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter title__like(String value){
        this.setFieldCond("title", LIKE, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内建界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter uistyle__eq(String value){
        this.setFieldCond("uistyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter userrefflag__eq(Integer value){
        this.setFieldCond("userrefflag", EQ, value);
        return this;
    }

}
