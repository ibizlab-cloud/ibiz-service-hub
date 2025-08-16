package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPVIEW 过滤器对象
 */
public class PSAppViewFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppViewFilter(){
    
    }      

    /**
     * 设置属性[访问用户模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter accusermode__eq(String value){
        this.setFieldCond("accusermode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图编号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter appviewsn__like(String value){
        this.setFieldCond("appviewsn", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter layoutpanelmode__eq(Integer value){
        this.setFieldCond("layoutpanelmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图后台处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappmoduleid__eq(String value){
        this.setFieldCond("psappmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappmodulename__eq(String value){
        this.setFieldCond("psappmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappmodulename__like(String value){
        this.setFieldCond("psappmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psapptitlebarid__eq(String value){
        this.setFieldCond("psapptitlebarid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psapptitlebarname__eq(String value){
        this.setFieldCond("psapptitlebarname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psapptitlebarname__like(String value){
        this.setFieldCond("psapptitlebarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psappviewtype__eq(String value){
        this.setFieldCond("psappviewtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdeviewbaseid__eq(String value){
        this.setFieldCond("psdeviewbaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdeviewbasename__eq(String value){
        this.setFieldCond("psdeviewbasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdeviewbasename__like(String value){
        this.setFieldCond("psdeviewbasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdynadeviewtemplid__eq(String value){
        this.setFieldCond("psdynadeviewtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdynadeviewtemplname__eq(String value){
        this.setFieldCond("psdynadeviewtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态实体模板视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psdynadeviewtemplname__like(String value){
        this.setFieldCond("psdynadeviewtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pshelpmoduleid__eq(String value){
        this.setFieldCond("pshelpmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pshelpmodulename__eq(String value){
        this.setFieldCond("pshelpmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图帮助]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pshelpmodulename__like(String value){
        this.setFieldCond("pshelpmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssubviewtypeid__eq(String value){
        this.setFieldCond("pssubviewtypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssubviewtypename__eq(String value){
        this.setFieldCond("pssubviewtypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统视图样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssubviewtypename__like(String value){
        this.setFieldCond("pssubviewtypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter subcappslanresid__eq(String value){
        this.setFieldCond("subcappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter subcappslanresname__eq(String value){
        this.setFieldCond("subcappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[子标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter subcappslanresname__like(String value){
        this.setFieldCond("subcappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图抬头]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter title__like(String value){
        this.setFieldCond("title", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter titlepslanresid__eq(String value){
        this.setFieldCond("titlepslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter titlepslanresname__eq(String value){
        this.setFieldCond("titlepslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[抬头语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter titlepslanresname__like(String value){
        this.setFieldCond("titlepslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[内建界面样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter uistyle__eq(String value){
        this.setFieldCond("uistyle", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户引用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppViewFilter userrefflag__eq(Integer value){
        this.setFieldCond("userrefflag", Conditions.EQ, value);
        return this;
    }

}
