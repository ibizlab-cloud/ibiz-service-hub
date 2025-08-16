package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNTEMPL 过滤器对象
 */
public class PSDevSlnTemplFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnTemplFilter(){
    
    }      

    /**
     * 设置属性[开发模板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevslntemplname__like(String value){
        this.setFieldCond("psdevslntemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发模板标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevslntemplid__eq(String value){
        this.setFieldCond("psdevslntemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pssfname__eq(String value){
        this.setFieldCond("pssfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pssfname__like(String value){
        this.setFieldCond("pssfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pssfid__eq(String value){
        this.setFieldCond("pssfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pspfname__like(String value){
        this.setFieldCond("pspfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发模板状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter devtemplstate__eq(Integer value){
        this.setFieldCond("devtemplstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[样式引擎]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter styleengine__eq(String value){
        this.setFieldCond("styleengine", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[模板类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter templtype__eq(String value){
        this.setFieldCond("templtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pspfstylename__eq(String value){
        this.setFieldCond("pspfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pspfstylename__like(String value){
        this.setFieldCond("pspfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pssfstylename__eq(String value){
        this.setFieldCond("pssfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台模板样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pssfstylename__like(String value){
        this.setFieldCond("pssfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pspfstyleid__eq(String value){
        this.setFieldCond("pspfstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台模板样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter pssfstyleid__eq(String value){
        this.setFieldCond("pssfstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中心版本库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevcentersvnname__eq(String value){
        this.setFieldCond("psdevcentersvnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中心版本库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevcentersvnname__like(String value){
        this.setFieldCond("psdevcentersvnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中心版本库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnTemplFilter psdevcentersvnid__eq(String value){
        this.setFieldCond("psdevcentersvnid", Conditions.EQ, value);
        return this;
    }

}