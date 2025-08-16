package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHDEFIELD 过滤器对象
 */
public class PSSysSearchDEFieldFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysSearchDEFieldFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[默认值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter defaultvaluetype__eq(String value){
        this.setFieldCond("defaultvaluetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[检索实体属性名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdefieldname__eq(String value){
        this.setFieldCond("pssyssearchdefieldname", EQ, value);
        return this;
    }

    /**
     * 设置属性[检索实体属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdefieldname__like(String value){
        this.setFieldCond("pssyssearchdefieldname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体搜索]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdeid__eq(String value){
        this.setFieldCond("pssyssearchdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdename__eq(String value){
        this.setFieldCond("pssyssearchdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdename__like(String value){
        this.setFieldCond("pssyssearchdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[索引属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchfieldid__eq(String value){
        this.setFieldCond("pssyssearchfieldid", EQ, value);
        return this;
    }

    /**
     * 设置属性[文档属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchfieldname__eq(String value){
        this.setFieldCond("pssyssearchfieldname", EQ, value);
        return this;
    }

    /**
     * 设置属性[文档属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchfieldname__like(String value){
        this.setFieldCond("pssyssearchfieldname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssystranslatorid__eq(String value){
        this.setFieldCond("pssystranslatorid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssystranslatorname__eq(String value){
        this.setFieldCond("pssystranslatorname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssystranslatorname__like(String value){
        this.setFieldCond("pssystranslatorname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
