package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEACTIONTEMPL 过滤器对象
 */
public class PSDEActionTemplFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEActionTemplFilter(){
    
    }      

    /**
     * 设置属性[应用中心代码块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter psdccodesnippetid__eq(String value){
        this.setFieldCond("psdccodesnippetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心代码块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter psdccodesnippetname__eq(String value){
        this.setFieldCond("psdccodesnippetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心代码块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter psdccodesnippetname__like(String value){
        this.setFieldCond("psdccodesnippetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为模板名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter psdeactiontemplname__like(String value){
        this.setFieldCond("psdeactiontemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionTemplFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
