package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDSPARAM 过滤器对象
 */
public class PSDEDSParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDSParamFilter(){
    
    }      

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdedsparamname__like(String value){
        this.setFieldCond("psdedsparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdefsfitemid__eq(String value){
        this.setFieldCond("psdefsfitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性搜索模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdefsfitemname__eq(String value){
        this.setFieldCond("psdefsfitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性搜索模式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdefsfitemname__like(String value){
        this.setFieldCond("psdefsfitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdefvalueruleid__eq(String value){
        this.setFieldCond("psdefvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdefvaluerulename__eq(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter psdefvaluerulename__like(String value){
        this.setFieldCond("psdefvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSParamFilter valuetype__eq(String value){
        this.setFieldCond("valuetype", Conditions.EQ, value);
        return this;
    }

}
