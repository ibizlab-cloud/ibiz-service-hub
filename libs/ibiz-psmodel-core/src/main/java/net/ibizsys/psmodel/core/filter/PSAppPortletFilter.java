package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPORTLET 过滤器对象
 */
public class PSAppPortletFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppPortletFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappdataentityid__eq(String value){
        this.setFieldCond("psappdataentityid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappdataentityname__eq(String value){
        this.setFieldCond("psappdataentityname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappdataentityname__like(String value){
        this.setFieldCond("psappdataentityname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psapplocaldename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用门户部件名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappportletname__eq(String value){
        this.setFieldCond("psappportletname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用门户部件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter psappportletname__like(String value){
        this.setFieldCond("psappportletname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysportletid__eq(String value){
        this.setFieldCond("pssysportletid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysportletname__eq(String value){
        this.setFieldCond("pssysportletname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统门户部件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter pssysportletname__like(String value){
        this.setFieldCond("pssysportletname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPortletFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
