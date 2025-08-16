package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFLINKROLE 过滤器对象
 */
public class PSWFLinkRoleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFLinkRoleFilter(){
    
    }      

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程处理连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pswflinkid__eq(String value){
        this.setFieldCond("pswflinkid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pswflinkname__eq(String value){
        this.setFieldCond("pswflinkname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理连接]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pswflinkname__like(String value){
        this.setFieldCond("pswflinkname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[处理角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pswflinkrolename__like(String value){
        this.setFieldCond("pswflinkrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程处理角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pswfprocroleid__eq(String value){
        this.setFieldCond("pswfprocroleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pswfprocrolename__eq(String value){
        this.setFieldCond("pswfprocrolename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFLinkRoleFilter pswfprocrolename__like(String value){
        this.setFieldCond("pswfprocrolename", Conditions.LIKE, value);
        return this;
    }

}
