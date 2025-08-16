package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEACTIONPARAM 过滤器对象
 */
public class PSDEActionParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEActionParamFilter(){
    
    }      

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter psdeactionparamname__like(String value){
        this.setFieldCond("psdeactionparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpsdefgroupid__eq(String value){
        this.setFieldCond("refpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpsdefgroupname__eq(String value){
        this.setFieldCond("refpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpsdefgroupname__like(String value){
        this.setFieldCond("refpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用动态模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpssysdynamodelid__eq(String value){
        this.setFieldCond("refpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用动态模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpssysdynamodelname__eq(String value){
        this.setFieldCond("refpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用动态模型对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter refpssysdynamodelname__like(String value){
        this.setFieldCond("refpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[设置值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEActionParamFilter valuetype__eq(String value){
        this.setFieldCond("valuetype", Conditions.EQ, value);
        return this;
    }

}
