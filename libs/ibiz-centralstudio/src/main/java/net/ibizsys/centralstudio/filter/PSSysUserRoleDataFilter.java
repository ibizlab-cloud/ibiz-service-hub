package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUSERROLEDATA 过滤器对象
 */
public class PSSysUserRoleDataFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysUserRoleDataFilter(){
    
    }      

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter psdeuserroleid__eq(String value){
        this.setFieldCond("psdeuserroleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter psdeuserrolename__eq(String value){
        this.setFieldCond("psdeuserrolename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter psdeuserrolename__like(String value){
        this.setFieldCond("psdeuserrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter pssysuserroleid__eq(String value){
        this.setFieldCond("pssysuserroleid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter pssysuserrolename__eq(String value){
        this.setFieldCond("pssysuserrolename", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter pssysuserrolename__like(String value){
        this.setFieldCond("pssysuserrolename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[能力名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter pssysuserroledataname__like(String value){
        this.setFieldCond("pssysuserroledataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleDataFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
