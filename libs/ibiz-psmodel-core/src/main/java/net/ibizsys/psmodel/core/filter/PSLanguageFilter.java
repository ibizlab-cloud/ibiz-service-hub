package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSLANGUAGE 过滤器对象
 */
public class PSLanguageFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSLanguageFilter(){
    
    }      

    /**
     * 设置属性[平台语言名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pslanguagename__eq(String value){
        this.setFieldCond("pslanguagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台语言名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

}
