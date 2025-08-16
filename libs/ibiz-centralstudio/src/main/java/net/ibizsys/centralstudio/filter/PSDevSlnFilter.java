package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLN 过滤器对象
 */
public class PSDevSlnFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnFilter(){
    
    }      

    /**
     * 设置属性[开发方案标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[方案管理用户]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter adminpsdevusername__eq(String value){
        this.setFieldCond("adminpsdevusername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[方案管理用户]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter adminpsdevusername__like(String value){
        this.setFieldCond("adminpsdevusername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[方案管理用户]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter adminpsdevuserid__eq(String value){
        this.setFieldCond("adminpsdevuserid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中文名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter logicname__like(String value){
        this.setFieldCond("logicname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter codename__eq(String value){
        this.setFieldCond("codename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[部署中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdcdeploycenterid__eq(String value){
        this.setFieldCond("psdcdeploycenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdcdeploycentername__eq(String value){
        this.setFieldCond("psdcdeploycentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnFilter psdcdeploycentername__like(String value){
        this.setFieldCond("psdcdeploycentername", Conditions.LIKE, value);
        return this;
    }

}