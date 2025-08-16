package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSTUDIOPLUGINDATA 过滤器对象
 */
public class PSStudioPluginDataFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSStudioPluginDataFilter(){
    
    }      

    /**
     * 设置属性[建模工具]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psstudiopluginid__eq(String value){
        this.setFieldCond("psstudiopluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建模工具]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psstudiopluginname__eq(String value){
        this.setFieldCond("psstudiopluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[建模工具]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psstudiopluginname__like(String value){
        this.setFieldCond("psstudiopluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[建模工具插件数据标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psstudioplugindataid__eq(String value){
        this.setFieldCond("psstudioplugindataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psstudioplugindataname__like(String value){
        this.setFieldCond("psstudioplugindataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[操作状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter actionstate__eq(Integer value){
        this.setFieldCond("actionstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发模板标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSStudioPluginDataFilter psdevslntemplid__eq(String value){
        this.setFieldCond("psdevslntemplid", Conditions.EQ, value);
        return this;
    }

}