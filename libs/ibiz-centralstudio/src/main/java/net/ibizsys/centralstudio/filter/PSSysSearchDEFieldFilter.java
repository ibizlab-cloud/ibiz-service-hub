package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHDEFIELD 过滤器对象
 */
public class PSSysSearchDEFieldFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSearchDEFieldFilter(){
    
    }      

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[检索实体属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdefieldname__like(String value){
        this.setFieldCond("pssyssearchdefieldname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体搜索]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdeid__eq(String value){
        this.setFieldCond("pssyssearchdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdename__eq(String value){
        this.setFieldCond("pssyssearchdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchdename__like(String value){
        this.setFieldCond("pssyssearchdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[索引属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchfieldid__eq(String value){
        this.setFieldCond("pssyssearchfieldid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文档属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchfieldname__eq(String value){
        this.setFieldCond("pssyssearchfieldname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文档属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter pssyssearchfieldname__like(String value){
        this.setFieldCond("pssyssearchfieldname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
