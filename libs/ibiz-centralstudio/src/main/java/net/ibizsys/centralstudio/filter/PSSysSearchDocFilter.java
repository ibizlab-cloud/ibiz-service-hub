package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEARCHDOC 过滤器对象
 */
public class PSSysSearchDocFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSearchDocFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDocFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[检索文档名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDocFilter pssyssearchdocname__like(String value){
        this.setFieldCond("pssyssearchdocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDocFilter pssyssearchschemeid__eq(String value){
        this.setFieldCond("pssyssearchschemeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDocFilter pssyssearchschemename__eq(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[全文检索体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDocFilter pssyssearchschemename__like(String value){
        this.setFieldCond("pssyssearchschemename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSearchDocFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
