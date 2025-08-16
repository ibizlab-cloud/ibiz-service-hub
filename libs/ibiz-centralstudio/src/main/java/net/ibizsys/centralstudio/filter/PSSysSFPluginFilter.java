package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSFPLUGIN 过滤器对象
 */
public class PSSysSFPluginFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSFPluginFilter(){
    
    }      

    /**
     * 设置属性[关键字]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter keywords__like(String value){
        this.setFieldCond("keywords", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[插件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter plugintype__eq(String value){
        this.setFieldCond("plugintype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预置模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter pssfpluginid__eq(String value){
        this.setFieldCond("pssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter pssfpluginname__eq(String value){
        this.setFieldCond("pssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预置模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter pssfpluginname__like(String value){
        this.setFieldCond("pssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[插件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行时插件模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter rtobjectmode__eq(Integer value){
        this.setFieldCond("rtobjectmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPluginFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
