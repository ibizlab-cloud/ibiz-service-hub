package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEGEIVR 过滤器对象
 */
public class PSDEGEIVRFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEGEIVRFilter(){
    
    }      

    /**
     * 设置属性[检查方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter checkmode__eq(Integer value){
        this.setFieldCond("checkmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdefvrid__eq(String value){
        this.setFieldCond("psdefvrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdefvrname__eq(String value){
        this.setFieldCond("psdefvrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdefvrname__like(String value){
        this.setFieldCond("psdefvrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdegeivrname__like(String value){
        this.setFieldCond("psdegeivrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表格列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdegridcolid__eq(String value){
        this.setFieldCond("psdegridcolid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdegridcolname__eq(String value){
        this.setFieldCond("psdegridcolname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdegridcolname__like(String value){
        this.setFieldCond("psdegridcolname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdegridid__eq(String value){
        this.setFieldCond("psdegridid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdegridname__eq(String value){
        this.setFieldCond("psdegridname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体表格]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter psdegridname__like(String value){
        this.setFieldCond("psdegridname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEGEIVRFilter vrtype__eq(String value){
        this.setFieldCond("vrtype", Conditions.EQ, value);
        return this;
    }

}
