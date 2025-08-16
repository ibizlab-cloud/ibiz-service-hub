package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHFIELD 过滤器对象
 */
public class PSSysSearchFieldFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSearchFieldFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter fieldtype__eq(String value){
        this.setFieldCond("fieldtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchdocid__eq(String value){
        this.setFieldCond("pssyssearchdocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchdocname__eq(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索文档]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchdocname__like(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[检索属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter pssyssearchfieldname__like(String value){
        this.setFieldCond("pssyssearchfieldname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchFieldFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
