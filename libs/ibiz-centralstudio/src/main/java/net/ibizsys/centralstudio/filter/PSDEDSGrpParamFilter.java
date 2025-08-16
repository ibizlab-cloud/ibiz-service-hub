package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDSGRPPARAM 过滤器对象
 */
public class PSDEDSGrpParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDSGrpParamFilter(){
    
    }      

    /**
     * 设置属性[聚合操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter aggmode__eq(String value){
        this.setFieldCond("aggmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter orderdir__eq(String value){
        this.setFieldCond("orderdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter psdedsgrpparamname__like(String value){
        this.setFieldCond("psdedsgrpparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体结果集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSGrpParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
