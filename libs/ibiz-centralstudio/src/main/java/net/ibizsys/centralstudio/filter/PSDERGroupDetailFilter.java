package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDERGROUPDETAIL 过滤器对象
 */
public class PSDERGroupDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDERGroupDetailFilter(){
    
    }      

    /**
     * 设置属性[成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter psdergroupdetailname__like(String value){
        this.setFieldCond("psdergroupdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter psdergroupid__eq(String value){
        this.setFieldCond("psdergroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter psdergroupname__eq(String value){
        this.setFieldCond("psdergroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter psdergroupname__like(String value){
        this.setFieldCond("psdergroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERGroupDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
