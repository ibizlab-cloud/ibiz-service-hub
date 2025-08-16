package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSTUDIOPLUGIN 过滤器对象
 */
public class PSStudioPluginFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSStudioPluginFilter(){
    
    }      

    /**
     * 设置属性[插件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginFilter psstudiopluginname__like(String value){
        this.setFieldCond("psstudiopluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建模工具插件标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginFilter psstudiopluginid__eq(String value){
        this.setFieldCond("psstudiopluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[插件数据2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginFilter plugindata2__eq(String value){
        this.setFieldCond("plugindata2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[插件分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginFilter plugincat__eq(String value){
        this.setFieldCond("plugincat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[插件标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginFilter plugindata__eq(String value){
        this.setFieldCond("plugindata", Conditions.EQ, value);
        return this;
    }

}