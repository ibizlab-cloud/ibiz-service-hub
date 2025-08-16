package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVCENTERDBINST 过滤器对象
 */
public class PSDevCenterDBInstFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevCenterDBInstFilter(){
    
    }      

    /**
     * 设置属性[应用中心数据库实例标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevcenterdbinstid__eq(String value){
        this.setFieldCond("psdevcenterdbinstid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[云数据库实例名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevcenterdbinstname__like(String value){
        this.setFieldCond("psdevcenterdbinstname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter dbtype__eq(String value){
        this.setFieldCond("dbtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter respos__eq(Integer value){
        this.setFieldCond("respos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分配状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevCenterDBInstFilter assignstatus__eq(String value){
        this.setFieldCond("assignstatus", Conditions.EQ, value);
        return this;
    }

}