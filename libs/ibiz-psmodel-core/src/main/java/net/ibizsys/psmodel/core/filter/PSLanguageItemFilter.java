package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSLANGUAGEITEM 过滤器对象
 */
public class PSLanguageItemFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSLanguageItemFilter(){
    
    }      

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageid__eq(String value){
        this.setFieldCond("pslanguageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[语言定义项标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageitemname__eq(String value){
        this.setFieldCond("pslanguageitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[语言定义项标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageitemname__like(String value){
        this.setFieldCond("pslanguageitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguagename__eq(String value){
        this.setFieldCond("pslanguagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageresid__eq(String value){
        this.setFieldCond("pslanguageresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageresname__eq(String value){
        this.setFieldCond("pslanguageresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageresname__like(String value){
        this.setFieldCond("pslanguageresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

}
