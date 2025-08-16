package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDCOLUMN 过滤器对象
 */
public class PSSysBDColumnFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBDColumnFilter(){
    
    }      

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolsetid__eq(String value){
        this.setFieldCond("pssysbdcolsetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolsetname__eq(String value){
        this.setFieldCond("pssysbdcolsetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列族]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolsetname__like(String value){
        this.setFieldCond("pssysbdcolsetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolumnname__like(String value){
        this.setFieldCond("pssysbdcolumnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtabledeid__eq(String value){
        this.setFieldCond("pssysbdtabledeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtabledename__eq(String value){
        this.setFieldCond("pssysbdtabledename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtabledename__like(String value){
        this.setFieldCond("pssysbdtabledename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[联合键值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter unionkeyvalue__eq(String value){
        this.setFieldCond("unionkeyvalue", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
