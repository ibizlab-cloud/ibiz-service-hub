package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBCOLUMN 过滤器对象
 */
public class PSSysDBColumnFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDBColumnFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主键]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pkey__eq(Integer value){
        this.setFieldCond("pkey", EQ, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbcolumnname__eq(String value){
        this.setFieldCond("pssysdbcolumnname", EQ, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbcolumnname__like(String value){
        this.setFieldCond("pssysdbcolumnname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库体系标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbtableid__eq(String value){
        this.setFieldCond("pssysdbtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbtablename__eq(String value){
        this.setFieldCond("pssysdbtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbcolumnid__eq(String value){
        this.setFieldCond("refpssysdbcolumnid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbcolumnname__eq(String value){
        this.setFieldCond("refpssysdbcolumnname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbcolumnname__like(String value){
        this.setFieldCond("refpssysdbcolumnname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbtableid__eq(String value){
        this.setFieldCond("refpssysdbtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbtablename__eq(String value){
        this.setFieldCond("refpssysdbtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用数据表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter refpssysdbtablename__like(String value){
        this.setFieldCond("refpssysdbtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBColumnFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
