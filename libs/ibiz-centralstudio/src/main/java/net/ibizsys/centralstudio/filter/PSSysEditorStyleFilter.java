package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSEDITORSTYLE 过滤器对象
 */
public class PSSysEditorStyleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysEditorStyleFilter(){
    
    }      

    /**
     * 设置属性[界面处理模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter ajaxhandler__eq(String value){
        this.setFieldCond("ajaxhandler", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接视图显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter linkviewshowmode__eq(String value){
        this.setFieldCond("linkviewshowmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter psachandlerid__eq(String value){
        this.setFieldCond("psachandlerid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter psachandlername__eq(String value){
        this.setFieldCond("psachandlername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[界面处理对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter psachandlername__like(String value){
        this.setFieldCond("psachandlername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pseditorstyleid__eq(String value){
        this.setFieldCond("pseditorstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pseditorstylename__eq(String value){
        this.setFieldCond("pseditorstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pseditorstylename__like(String value){
        this.setFieldCond("pseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pseditortypeid__eq(String value){
        this.setFieldCond("pseditortypeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pseditortypename__eq(String value){
        this.setFieldCond("pseditortypename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[编辑器类型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pseditortypename__like(String value){
        this.setFieldCond("pseditortypename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssyscssid__eq(String value){
        this.setFieldCond("pssyscssid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssyscssname__eq(String value){
        this.setFieldCond("pssyscssname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统样式表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssyscssname__like(String value){
        this.setFieldCond("pssyscssname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[样式名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssyseditorstylename__like(String value){
        this.setFieldCond("pssyseditorstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用视图显示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter refviewshowmode__eq(String value){
        this.setFieldCond("refviewshowmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysEditorStyleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
