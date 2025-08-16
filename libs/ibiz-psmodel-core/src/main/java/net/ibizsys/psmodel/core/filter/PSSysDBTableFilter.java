package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBTABLE 过滤器对象
 */
public class PSSysDBTableFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDBTableFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbschemename__eq(String value){
        this.setFieldCond("pssysdbschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[对象名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbtablename__eq(String value){
        this.setFieldCond("pssysdbtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[对象名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[对象类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter tabletype__eq(String value){
        this.setFieldCond("tabletype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBTableFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
