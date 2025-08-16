package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSAPP 过滤器对象
 */
public class PSSysAppFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysAppFilter(){
    
    }      

    /**
     * 设置属性[应用模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter appmode__eq(String value){
        this.setFieldCond("appmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图优先级]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter appviewpriority__eq(Integer value){
        this.setFieldCond("appviewpriority", EQ, value);
        return this;
    }

    /**
     * 设置属性[按钮无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter btnnoprivdm__eq(Integer value){
        this.setFieldCond("btnnoprivdm", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体后端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter depssyssfpluginid__eq(String value){
        this.setFieldCond("depssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体后端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter depssyssfpluginname__eq(String value){
        this.setFieldCond("depssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体后端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter depssyssfpluginname__like(String value){
        this.setFieldCond("depssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[表单项无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter finoprivdm__eq(Integer value){
        this.setFieldCond("finoprivdm", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列无权限显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter gcnoprivdm__eq(Integer value){
        this.setFieldCond("gcnoprivdm", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列启用过滤器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter gridcolenablefilter__eq(Integer value){
        this.setFieldCond("gridcolenablefilter", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格列启用链接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter gridcolenablelink__eq(Integer value){
        this.setFieldCond("gridcolenablelink", EQ, value);
        return this;
    }

    /**
     * 设置属性[表格行激活模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter gridrowactivemode__eq(Integer value){
        this.setFieldCond("gridrowactivemode", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图主菜单位置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter mainmenuside__eq(String value){
        this.setFieldCond("mainmenuside", EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据部件无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter mdctrlemptytextpslanresid__eq(String value){
        this.setFieldCond("mdctrlemptytextpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据部件无值内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter mdctrlemptytextpslanresname__eq(String value){
        this.setFieldCond("mdctrlemptytextpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[多数据部件无值内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter mdctrlemptytextpslanresname__like(String value){
        this.setFieldCond("mdctrlemptytextpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端横竖屏设置]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter orientationmode__eq(String value){
        this.setFieldCond("orientationmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psapptypeid__eq(String value){
        this.setFieldCond("psapptypeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psapptypename__eq(String value){
        this.setFieldCond("psapptypename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psapptypename__like(String value){
        this.setFieldCond("psapptypename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用全局逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pspfname__like(String value){
        this.setFieldCond("pspfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pspfstyleid__eq(String value){
        this.setFieldCond("pspfstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pspfstylename__eq(String value){
        this.setFieldCond("pspfstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pspfstylename__like(String value){
        this.setFieldCond("pspfstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用主题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psstudiothemeid__eq(String value){
        this.setFieldCond("psstudiothemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用主题]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psstudiothemename__eq(String value){
        this.setFieldCond("psstudiothemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用主题]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psstudiothemename__like(String value){
        this.setFieldCond("psstudiothemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用挂载样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用挂载样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用挂载样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[扩展动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用图标]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用图标]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统设计需求]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysserviceapiname__eq(String value){
        this.setFieldCond("pssysserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssysserviceapiname__like(String value){
        this.setFieldCond("pssysserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[删除标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter removeflag__eq(Integer value){
        this.setFieldCond("removeflag", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认视图样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter uistyle__eq(String value){
        this.setFieldCond("uistyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAppFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
