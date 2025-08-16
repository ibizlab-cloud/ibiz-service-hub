package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEACTIONVR 过滤器对象
 */
public class PSDEActionVRFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEActionVRFilter(){
    
    }      

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter psdeactionvrname__like(String value){
        this.setFieldCond("psdeactionvrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter psdefvrid__eq(String value){
        this.setFieldCond("psdefvrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter psdefvrname__eq(String value){
        this.setFieldCond("psdefvrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter psdefvrname__like(String value){
        this.setFieldCond("psdefvrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionVRFilter vrtype__eq(String value){
        this.setFieldCond("vrtype", Conditions.EQ, value);
        return this;
    }

}
