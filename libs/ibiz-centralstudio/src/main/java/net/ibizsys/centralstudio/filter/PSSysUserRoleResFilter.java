package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSUSERROLERES 过滤器对象
 */
public class PSSysUserRoleResFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysUserRoleResFilter(){
    
    }      

    /**
     * 设置属性[系统操作角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter pssysuserroleid__eq(String value){
        this.setFieldCond("pssysuserroleid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统操作角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter pssysuserrolename__eq(String value){
        this.setFieldCond("pssysuserrolename", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统操作角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter pssysuserrolename__like(String value){
        this.setFieldCond("pssysuserrolename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter pssysuniresid__eq(String value){
        this.setFieldCond("pssysuniresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter pssysuniresname__eq(String value){
        this.setFieldCond("pssysuniresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统统一资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter pssysuniresname__like(String value){
        this.setFieldCond("pssysuniresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统角色资源名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter pssysuserroleresname__like(String value){
        this.setFieldCond("pssysuserroleresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysUserRoleResFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
