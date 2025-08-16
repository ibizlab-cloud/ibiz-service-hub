package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNMSDEPAPP 过滤器对象
 */
public class PSDevSlnMSDepAppFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnMSDepAppFilter(){
    
    }      

    /**
     * 设置属性[部署名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnmsdepappname__like(String value){
        this.setFieldCond("psdevslnmsdepappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案微服务应用部署标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnmsdepappid__eq(String value){
        this.setFieldCond("psdevslnmsdepappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微服务平台节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdcmsplatformnodeid__eq(String value){
        this.setFieldCond("psdcmsplatformnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署节点]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdcmsplatformnodename__eq(String value){
        this.setFieldCond("psdcmsplatformnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署节点]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdcmsplatformnodename__like(String value){
        this.setFieldCond("psdcmsplatformnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[HTTP端口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter httpport__eq(Integer value){
        this.setFieldCond("httpport", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnsysappname__eq(String value){
        this.setFieldCond("psdevslnsysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnsysappname__like(String value){
        this.setFieldCond("psdevslnsysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnsysappid__eq(String value){
        this.setFieldCond("psdevslnsysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnmsdeployname__eq(String value){
        this.setFieldCond("psdevslnmsdeployname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务部署]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnmsdeployname__like(String value){
        this.setFieldCond("psdevslnmsdeployname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案微服务部署]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevslnmsdeployid__eq(String value){
        this.setFieldCond("psdevslnmsdeployid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevcenterdbinstname__eq(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库实例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevcenterdbinstname__like(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心数据实例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDepAppFilter psdevcenterdbinstid__eq(String value){
        this.setFieldCond("psdevcenterdbinstid", Conditions.EQ, value);
        return this;
    }

}