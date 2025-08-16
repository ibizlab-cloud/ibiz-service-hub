package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEUSERROLE 过滤器对象
 */
public class PSDEUserRoleFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEUserRoleFilter(){
    
    }      

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[操作角色名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter psdeuserrolename__like(String value){
        this.setFieldCond("psdeuserrolename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssysuserdrid__eq(String value){
        this.setFieldCond("pssysuserdrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssysuserdrid2__eq(String value){
        this.setFieldCond("pssysuserdrid2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssysuserdrname__eq(String value){
        this.setFieldCond("pssysuserdrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssysuserdrname__like(String value){
        this.setFieldCond("pssysuserdrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssysuserdrname2__eq(String value){
        this.setFieldCond("pssysuserdrname2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义数据范围2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter pssysuserdrname2__like(String value){
        this.setFieldCond("pssysuserdrname2", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEUserRoleFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
