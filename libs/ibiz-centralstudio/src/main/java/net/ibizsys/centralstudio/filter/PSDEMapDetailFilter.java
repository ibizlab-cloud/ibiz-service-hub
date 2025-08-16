package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAPDETAIL 过滤器对象
 */
public class PSDEMapDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMapDetailFilter(){
    
    }      

    /**
     * 设置属性[映射操作]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter psdemapdetailname__like(String value){
        this.setFieldCond("psdemapdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter psdemapid__eq(String value){
        this.setFieldCond("psdemapid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter psdemapname__eq(String value){
        this.setFieldCond("psdemapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter psdemapname__like(String value){
        this.setFieldCond("psdemapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter srcpsdefid__eq(String value){
        this.setFieldCond("srcpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter srcpsdefname__eq(String value){
        this.setFieldCond("srcpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter srcpsdefname__like(String value){
        this.setFieldCond("srcpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[映射类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter srctype__eq(String value){
        this.setFieldCond("srctype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
