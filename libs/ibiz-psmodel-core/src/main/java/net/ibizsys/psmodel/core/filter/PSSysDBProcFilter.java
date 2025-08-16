package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBPROC 过滤器对象
 */
public class PSSysDBProcFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDBProcFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[过程名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbprocname__eq(String value){
        this.setFieldCond("pssysdbprocname", EQ, value);
        return this;
    }

    /**
     * 设置属性[过程名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbprocname__like(String value){
        this.setFieldCond("pssysdbprocname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统数据库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbschemeid__eq(String value){
        this.setFieldCond("pssysdbschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbschemename__eq(String value){
        this.setFieldCond("pssysdbschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter pssysdbschemename__like(String value){
        this.setFieldCond("pssysdbschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
