package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFPROCROLE 过滤器对象
 */
public class PSWFProcRoleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFProcRoleFilter(){
    
    }      

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pswfprocessid__eq(String value){
        this.setFieldCond("pswfprocessid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pswfprocessname__eq(String value){
        this.setFieldCond("pswfprocessname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pswfprocessname__like(String value){
        this.setFieldCond("pswfprocessname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pswfprocrolename__like(String value){
        this.setFieldCond("pswfprocrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pswfroleid__eq(String value){
        this.setFieldCond("pswfroleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pswfrolename__eq(String value){
        this.setFieldCond("pswfrolename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter pswfrolename__like(String value){
        this.setFieldCond("pswfrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[角色类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter roletype__eq(String value){
        this.setFieldCond("roletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcRoleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
