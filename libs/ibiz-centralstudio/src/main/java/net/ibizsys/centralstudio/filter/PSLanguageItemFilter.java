package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSLANGUAGEITEM 过滤器对象
 */
public class PSLanguageItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSLanguageItemFilter(){
    
    }      

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageid__eq(String value){
        this.setFieldCond("pslanguageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[语言定义项标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageitemname__like(String value){
        this.setFieldCond("pslanguageitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguagename__eq(String value){
        this.setFieldCond("pslanguagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageresid__eq(String value){
        this.setFieldCond("pslanguageresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageresname__eq(String value){
        this.setFieldCond("pslanguageresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pslanguageresname__like(String value){
        this.setFieldCond("pslanguageresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSLanguageItemFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

}
