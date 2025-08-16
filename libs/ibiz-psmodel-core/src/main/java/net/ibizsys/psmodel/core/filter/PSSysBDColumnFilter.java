package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBDCOLUMN 过滤器对象
 */
public class PSSysBDColumnFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBDColumnFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolsetid__eq(String value){
        this.setFieldCond("pssysbdcolsetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[列族]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolsetname__eq(String value){
        this.setFieldCond("pssysbdcolsetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[列族]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolsetname__like(String value){
        this.setFieldCond("pssysbdcolsetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolumnname__eq(String value){
        this.setFieldCond("pssysbdcolumnname", EQ, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdcolumnname__like(String value){
        this.setFieldCond("pssysbdcolumnname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtabledeid__eq(String value){
        this.setFieldCond("pssysbdtabledeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtabledename__eq(String value){
        this.setFieldCond("pssysbdtabledename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtabledename__like(String value){
        this.setFieldCond("pssysbdtabledename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtableid__eq(String value){
        this.setFieldCond("pssysbdtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtablename__eq(String value){
        this.setFieldCond("pssysbdtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[大数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter pssysbdtablename__like(String value){
        this.setFieldCond("pssysbdtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[联合键值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter unionkeyvalue__eq(String value){
        this.setFieldCond("unionkeyvalue", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBDColumnFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
