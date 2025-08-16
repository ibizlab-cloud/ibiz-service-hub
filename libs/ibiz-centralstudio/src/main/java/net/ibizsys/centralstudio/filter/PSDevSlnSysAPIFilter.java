package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNSYSAPI 过滤器对象
 */
public class PSDevSlnSysAPIFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnSysAPIFilter(){
    
    }      

    /**
     * 设置属性[开发系统服务接口标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter psdevslnsysapiid__eq(String value){
        this.setFieldCond("psdevslnsysapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统服务接口名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter psdevslnsysapiname__like(String value){
        this.setFieldCond("psdevslnsysapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter pssysserviceapiid__eq(String value){
        this.setFieldCond("pssysserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[接口类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter apitype__eq(String value){
        this.setFieldCond("apitype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysAPIFilter devsysstate__eq(String value){
        this.setFieldCond("devsysstate", Conditions.EQ, value);
        return this;
    }

}