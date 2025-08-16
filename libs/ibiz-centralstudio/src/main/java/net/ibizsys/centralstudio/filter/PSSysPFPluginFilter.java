package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSPFPLUGIN 过滤器对象
 */
public class PSSysPFPluginFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysPFPluginFilter(){
    
    }      

    /**
     * 设置属性[插件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter plugintype__eq(String value){
        this.setFieldCond("plugintype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pspfpluginid__eq(String value){
        this.setFieldCond("pspfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pspfpluginname__eq(String value){
        this.setFieldCond("pspfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pspfpluginname__like(String value){
        this.setFieldCond("pspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[插件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行时插件模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter rtobjectmode__eq(Integer value){
        this.setFieldCond("rtobjectmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
