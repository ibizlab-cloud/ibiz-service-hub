package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPUTILPAGE 过滤器对象
 */
public class PSAppUtilPageFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppUtilPageFilter(){
    
    }      

    /**
     * 设置属性[功能页面]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psapputilpagename__eq(String value){
        this.setFieldCond("psapputilpagename", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能页面]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psapputilpagename__like(String value){
        this.setFieldCond("psapputilpagename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[绑定应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[绑定应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[绑定应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysviewpanelid__eq(String value){
        this.setFieldCond("pssysviewpanelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysviewpanelname__eq(String value){
        this.setFieldCond("pssysviewpanelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[布局面板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter pssysviewpanelname__like(String value){
        this.setFieldCond("pssysviewpanelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter targettype__eq(String value){
        this.setFieldCond("targettype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppUtilPageFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
