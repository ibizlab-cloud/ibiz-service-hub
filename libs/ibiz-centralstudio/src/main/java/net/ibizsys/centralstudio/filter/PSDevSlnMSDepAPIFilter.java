package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNMSDEPAPI 过滤器对象
 */
public class PSDevSlnMSDepAPIFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnMSDepAPIFilter(){
    
    }      

    /**
     * 设置属性[开发方案微服务部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnmsdeployid__eq(String value){
        this.setFieldCond("psdevslnmsdeployid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnmsdeployname__eq(String value){
        this.setFieldCond("psdevslnmsdeployname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务部署]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnmsdeployname__like(String value){
        this.setFieldCond("psdevslnmsdeployname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevcenterdbinstid__eq(String value){
        this.setFieldCond("psdevcenterdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevcenterdbinstname__eq(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevcenterdbinstname__like(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案微服务服务部署标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnmsdepapiid__eq(String value){
        this.setFieldCond("psdevslnmsdepapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnmsdepapiname__like(String value){
        this.setFieldCond("psdevslnmsdepapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[HTTP端口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter httpport__eq(Integer value){
        this.setFieldCond("httpport", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdcmsplatformnodename__eq(String value){
        this.setFieldCond("psdcmsplatformnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdcmsplatformnodename__like(String value){
        this.setFieldCond("psdcmsplatformnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微服务平台节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdcmsplatformnodeid__eq(String value){
        this.setFieldCond("psdcmsplatformnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnsysapiname__eq(String value){
        this.setFieldCond("psdevslnsysapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnsysapiname__like(String value){
        this.setFieldCond("psdevslnsysapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter psdevslnsysapiid__eq(String value){
        this.setFieldCond("psdevslnsysapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[认证模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter authmode__eq(String value){
        this.setFieldCond("authmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAPIFilter deploystate__eq(Integer value){
        this.setFieldCond("deploystate", Conditions.EQ, value);
        return this;
    }

}