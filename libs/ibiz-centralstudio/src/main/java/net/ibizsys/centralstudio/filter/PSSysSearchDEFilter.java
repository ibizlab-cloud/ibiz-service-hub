package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHDE 过滤器对象
 */
public class PSSysSearchDEFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSearchDEFilter(){
    
    }      

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[检索实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdename__like(String value){
        this.setFieldCond("pssyssearchdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdocid__eq(String value){
        this.setFieldCond("pssyssearchdocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdocname__eq(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchdocname__like(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchschemeid__eq(String value){
        this.setFieldCond("pssyssearchschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchschemename__eq(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter pssyssearchschemename__like(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDEFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
