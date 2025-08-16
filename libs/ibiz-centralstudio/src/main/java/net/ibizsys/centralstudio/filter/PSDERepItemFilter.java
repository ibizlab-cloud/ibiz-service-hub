package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEREPITEM 过滤器对象
 */
public class PSDERepItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDERepItemFilter(){
    
    }      

    /**
     * 设置属性[主实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter majorpsdereportid__eq(String value){
        this.setFieldCond("majorpsdereportid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter majorpsdereportname__eq(String value){
        this.setFieldCond("majorpsdereportname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter majorpsdereportname__like(String value){
        this.setFieldCond("majorpsdereportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[从实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter minorpsdereportid__eq(String value){
        this.setFieldCond("minorpsdereportid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter minorpsdereportname__eq(String value){
        this.setFieldCond("minorpsdereportname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter minorpsdereportname__like(String value){
        this.setFieldCond("minorpsdereportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[报表项标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter psderepitemname__like(String value){
        this.setFieldCond("psderepitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDERepItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
