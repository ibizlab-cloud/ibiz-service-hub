package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSPFPLUGIN 过滤器对象
 */
public class PSSysPFPluginFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysPFPluginFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[插件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter plugintype__eq(String value){
        this.setFieldCond("plugintype", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pspfpluginid__eq(String value){
        this.setFieldCond("pspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pspfpluginname__eq(String value){
        this.setFieldCond("pspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pspfpluginname__like(String value){
        this.setFieldCond("pspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[插件名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[插件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[运行时插件模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter rtobjectmode__eq(Integer value){
        this.setFieldCond("rtobjectmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysPFPluginFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
