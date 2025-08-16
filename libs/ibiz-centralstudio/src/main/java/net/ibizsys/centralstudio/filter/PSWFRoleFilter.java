package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFROLE 过滤器对象
 */
public class PSWFRoleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFRoleFilter(){
    
    }      

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[角色名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pswfrolename__like(String value){
        this.setFieldCond("pswfrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[角色类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfroletype__eq(String value){
        this.setFieldCond("wfroletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfuseridpsdefid__eq(String value){
        this.setFieldCond("wfuseridpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfuseridpsdefname__eq(String value){
        this.setFieldCond("wfuseridpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfuseridpsdefname__like(String value){
        this.setFieldCond("wfuseridpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户名称属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfusernamepsdefid__eq(String value){
        this.setFieldCond("wfusernamepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户名称属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfusernamepsdefname__eq(String value){
        this.setFieldCond("wfusernamepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户名称属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfusernamepsdefname__like(String value){
        this.setFieldCond("wfusernamepsdefname", Conditions.LIKE, value);
        return this;
    }

}
