package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHFIELD 过滤器对象
 */
public class PSSysSearchFieldFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysSearchFieldFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter fieldtype__eq(String value){
        this.setFieldCond("fieldtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchdocid__eq(String value){
        this.setFieldCond("pssyssearchdocid", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchdocname__eq(String value){
        this.setFieldCond("pssyssearchdocname", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchdocname__like(String value){
        this.setFieldCond("pssyssearchdocname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[检索属性名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchfieldname__eq(String value){
        this.setFieldCond("pssyssearchfieldname", EQ, value);
        return this;
    }

    /**
     * 设置属性[检索属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchfieldname__like(String value){
        this.setFieldCond("pssyssearchfieldname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
