package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNMSDEPLOY 过滤器对象
 */
public class PSDevSlnMSDeployFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnMSDeployFilter(){
    
    }      

    /**
     * 设置属性[开发方案微服务部署标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdevslnmsdeployid__eq(String value){
        this.setFieldCond("psdevslnmsdeployid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdevslnmsdeployname__like(String value){
        this.setFieldCond("psdevslnmsdeployname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[Cloud平台]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdcmsplatformname__eq(String value){
        this.setFieldCond("psdcmsplatformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Cloud平台]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdcmsplatformname__like(String value){
        this.setFieldCond("psdcmsplatformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中心微服务平台]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdcmsplatformid__eq(String value){
        this.setFieldCond("psdcmsplatformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnMSDeployFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

}