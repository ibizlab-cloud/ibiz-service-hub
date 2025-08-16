package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDTABLEDE 过滤器对象
 */
public class PSSysBDTableDEFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBDTableDEFilter(){
    
    }      

    /**
     * 设置属性[列添加模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter addcolmode__eq(Integer value){
        this.setFieldCond("addcolmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[默认列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdcolsetid__eq(String value){
        this.setFieldCond("pssysbdcolsetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdcolsetname__eq(String value){
        this.setFieldCond("pssysbdcolsetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[默认列族]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdcolsetname__like(String value){
        this.setFieldCond("pssysbdcolsetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtabledename__like(String value){
        this.setFieldCond("pssysbdtabledename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDTableDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
