package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFIVR 过滤器对象
 */
public class PSDEFIVRFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFIVRFilter(){
    
    }      

    /**
     * 设置属性[检查方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter checkmode__eq(Integer value){
        this.setFieldCond("checkmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdefiid__eq(String value){
        this.setFieldCond("psdefiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdefiname__eq(String value){
        this.setFieldCond("psdefiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdefiname__like(String value){
        this.setFieldCond("psdefiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdefivrname__like(String value){
        this.setFieldCond("psdefivrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdeformid__eq(String value){
        this.setFieldCond("psdeformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdeformname__eq(String value){
        this.setFieldCond("psdeformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表单]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdeformname__like(String value){
        this.setFieldCond("psdeformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdefvrid__eq(String value){
        this.setFieldCond("psdefvrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdefvrname__eq(String value){
        this.setFieldCond("psdefvrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter psdefvrname__like(String value){
        this.setFieldCond("psdefvrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFIVRFilter vrtype__eq(String value){
        this.setFieldCond("vrtype", Conditions.EQ, value);
        return this;
    }

}
