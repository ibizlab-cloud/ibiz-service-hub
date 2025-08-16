package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPTITLEBAR 过滤器对象
 */
public class PSAppTitleBarFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppTitleBarFilter(){
    
    }      

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter cappslanresid__eq(String value){
        this.setFieldCond("cappslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter cappslanresname__eq(String value){
        this.setFieldCond("cappslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标题语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter cappslanresname__like(String value){
        this.setFieldCond("cappslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[左侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter leftpsappmenuid__eq(String value){
        this.setFieldCond("leftpsappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter leftpsappmenuname__eq(String value){
        this.setFieldCond("leftpsappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[左侧菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter leftpsappmenuname__like(String value){
        this.setFieldCond("leftpsappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用标题栏名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psapptitlebarname__like(String value){
        this.setFieldCond("psapptitlebarname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psctrllogicgroupid__eq(String value){
        this.setFieldCond("psctrllogicgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psctrllogicgroupname__eq(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面逻辑组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter psctrllogicgroupname__like(String value){
        this.setFieldCond("psctrllogicgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[界面样式对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[图标资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysimageid__eq(String value){
        this.setFieldCond("pssysimageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysimagename__eq(String value){
        this.setFieldCond("pssysimagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[图标资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssysimagename__like(String value){
        this.setFieldCond("pssysimagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[右侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter rightpsappmenuid__eq(String value){
        this.setFieldCond("rightpsappmenuid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右侧菜单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter rightpsappmenuname__eq(String value){
        this.setFieldCond("rightpsappmenuname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[右侧菜单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter rightpsappmenuname__like(String value){
        this.setFieldCond("rightpsappmenuname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标题栏样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppTitleBarFilter titlebarstyle__eq(String value){
        this.setFieldCond("titlebarstyle", Conditions.EQ, value);
        return this;
    }

}
