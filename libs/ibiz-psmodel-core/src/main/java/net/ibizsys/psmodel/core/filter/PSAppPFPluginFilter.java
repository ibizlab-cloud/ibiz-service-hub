package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPFPLUGIN 过滤器对象
 */
public class PSAppPFPluginFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppPFPluginFilter(){
    
    }      

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter psapppfpluginname__like(String value){
        this.setFieldCond("psapppfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter pssyspfpluginid__eq(String value){
        this.setFieldCond("pssyspfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统前端插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter pssyspfpluginname__eq(String value){
        this.setFieldCond("pssyspfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统前端插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter pssyspfpluginname__like(String value){
        this.setFieldCond("pssyspfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPFPluginFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
