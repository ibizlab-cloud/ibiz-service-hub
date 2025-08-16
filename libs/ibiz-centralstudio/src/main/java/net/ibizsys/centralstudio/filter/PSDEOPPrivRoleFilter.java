package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEOPPRIVROLE 过滤器对象
 */
public class PSDEOPPrivRoleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEOPPrivRoleFilter(){
    
    }      

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeopprivid__eq(String value){
        this.setFieldCond("psdeopprivid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeopprivname__eq(String value){
        this.setFieldCond("psdeopprivname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeopprivname__like(String value){
        this.setFieldCond("psdeopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作标识角色名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeopprivrolename__like(String value){
        this.setFieldCond("psdeopprivrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体操作角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeuserroleid__eq(String value){
        this.setFieldCond("psdeuserroleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeuserrolename__eq(String value){
        this.setFieldCond("psdeuserrolename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体操作角色]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter psdeuserrolename__like(String value){
        this.setFieldCond("psdeuserrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统操作角色]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter pssysuserroleid__eq(String value){
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
    public PSDEOPPrivRoleFilter pssysuserrolename__eq(String value){
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
    public PSDEOPPrivRoleFilter pssysuserrolename__like(String value){
        this.setFieldCond("pssysuserrolename", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("pssysopprivname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[角色类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter roletype__eq(String value){
        this.setFieldCond("roletype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEOPPrivRoleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
