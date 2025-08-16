package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHDE 过滤器对象
 */
public class PSSysSearchDEFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysSearchDEFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[检索实体名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdename__eq(String value){
        this.setFieldCond("pssyssearchdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[检索实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdename__like(String value){
        this.setFieldCond("pssyssearchdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdocid__eq(String value){
        this.setFieldCond("pssyssearchdocid", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdocname__eq(String value){
        this.setFieldCond("pssyssearchdocname", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdocname__like(String value){
        this.setFieldCond("pssyssearchdocname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchschemeid__eq(String value){
        this.setFieldCond("pssyssearchschemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchschemename__eq(String value){
        this.setFieldCond("pssyssearchschemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchschemename__like(String value){
        this.setFieldCond("pssyssearchschemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
