package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBCOLUMN 过滤器对象
 */
public class PSSysDBColumnFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDBColumnFilter(){
    
    }      

    /**
     * 设置属性[主键]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pkey__eq(Integer value){
        this.setFieldCond("pkey", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbcolumnname__like(String value){
        this.setFieldCond("pssysdbcolumnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库体系标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbtableid__eq(String value){
        this.setFieldCond("pssysdbtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbtablename__eq(String value){
        this.setFieldCond("pssysdbtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbcolumnid__eq(String value){
        this.setFieldCond("refpssysdbcolumnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbcolumnname__eq(String value){
        this.setFieldCond("refpssysdbcolumnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbcolumnname__like(String value){
        this.setFieldCond("refpssysdbcolumnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbtableid__eq(String value){
        this.setFieldCond("refpssysdbtableid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbtablename__eq(String value){
        this.setFieldCond("refpssysdbtablename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbtablename__like(String value){
        this.setFieldCond("refpssysdbtablename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
