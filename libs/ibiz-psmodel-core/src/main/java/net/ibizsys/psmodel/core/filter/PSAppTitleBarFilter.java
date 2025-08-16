package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPTITLEBAR 过滤器对象
 */
public class PSAppTitleBarFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppTitleBarFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[左侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter leftpsappmenuid__eq(String value){
        this.setFieldCond("leftpsappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[左侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter leftpsappmenuname__eq(String value){
        this.setFieldCond("leftpsappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[左侧菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter leftpsappmenuname__like(String value){
        this.setFieldCond("leftpsappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psapptitlebarname__eq(String value){
        this.setFieldCond("psapptitlebarname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psapptitlebarname__like(String value){
        this.setFieldCond("psapptitlebarname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面样式对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[图标资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psviewmsggroupid__eq(String value){
        this.setFieldCond("psviewmsggroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psviewmsggroupname__eq(String value){
        this.setFieldCond("psviewmsggroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[视图消息组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psviewmsggroupname__like(String value){
        this.setFieldCond("psviewmsggroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[右侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter rightpsappmenuid__eq(String value){
        this.setFieldCond("rightpsappmenuid", EQ, value);
        return this;
    }

    /**
     * 设置属性[右侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter rightpsappmenuname__eq(String value){
        this.setFieldCond("rightpsappmenuname", EQ, value);
        return this;
    }

    /**
     * 设置属性[右侧菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter rightpsappmenuname__like(String value){
        this.setFieldCond("rightpsappmenuname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题栏样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter titlebarstyle__eq(String value){
        this.setFieldCond("titlebarstyle", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
