package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPLAN 过滤器对象
 */
public class PSAppLanFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppLanFilter(){
    
    }      

    /**
     * 设置属性[应用多语言名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter psapplanname__eq(String value){
        this.setFieldCond("psapplanname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用多语言名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter psapplanname__like(String value){
        this.setFieldCond("psapplanname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pslanguageid__eq(String value){
        this.setFieldCond("pslanguageid", EQ, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pslanguagename__eq(String value){
        this.setFieldCond("pslanguagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
