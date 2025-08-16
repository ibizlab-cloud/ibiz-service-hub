package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFROLE 过滤器对象
 */
public class PSWFRoleFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWFRoleFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[角色名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pswfrolename__eq(String value){
        this.setFieldCond("pswfrolename", EQ, value);
        return this;
    }

    /**
     * 设置属性[角色名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter pswfrolename__like(String value){
        this.setFieldCond("pswfrolename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[角色类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfroletype__eq(String value){
        this.setFieldCond("wfroletype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfuseridpsdefid__eq(String value){
        this.setFieldCond("wfuseridpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfuseridpsdefname__eq(String value){
        this.setFieldCond("wfuseridpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfuseridpsdefname__like(String value){
        this.setFieldCond("wfuseridpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户名称属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfusernamepsdefid__eq(String value){
        this.setFieldCond("wfusernamepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户名称属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfusernamepsdefname__eq(String value){
        this.setFieldCond("wfusernamepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户名称属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFRoleFilter wfusernamepsdefname__like(String value){
        this.setFieldCond("wfusernamepsdefname", LIKE, value);
        return this;
    }

}
