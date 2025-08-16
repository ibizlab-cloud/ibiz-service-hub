package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBILEVEL 过滤器对象
 */
public class PSSysBILevelFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBILevelFilter(){
    
    }      

    /**
     * 设置属性[层级类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter bileveltype__eq(String value){
        this.setFieldCond("bileveltype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter pssysbihierarchyid__eq(String value){
        this.setFieldCond("pssysbihierarchyid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter pssysbihierarchyname__eq(String value){
        this.setFieldCond("pssysbihierarchyname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter pssysbihierarchyname__like(String value){
        this.setFieldCond("pssysbihierarchyname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[维度层级名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter pssysbilevelname__like(String value){
        this.setFieldCond("pssysbilevelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter textpsdefid__eq(String value){
        this.setFieldCond("textpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter textpsdefname__eq(String value){
        this.setFieldCond("textpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文本属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter textpsdefname__like(String value){
        this.setFieldCond("textpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter valuepsdefid__eq(String value){
        this.setFieldCond("valuepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter valuepsdefname__eq(String value){
        this.setFieldCond("valuepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBILevelFilter valuepsdefname__like(String value){
        this.setFieldCond("valuepsdefname", Conditions.LIKE, value);
        return this;
    }

}
