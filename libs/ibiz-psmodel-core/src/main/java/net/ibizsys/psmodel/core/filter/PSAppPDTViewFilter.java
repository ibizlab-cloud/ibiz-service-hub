package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPDTVIEW 过滤器对象
 */
public class PSAppPDTViewFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppPDTViewFilter(){
    
    }      

    /**
     * 设置属性[预置视图名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psapppdtviewname__eq(String value){
        this.setFieldCond("psapppdtviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[预置视图名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psapppdtviewname__like(String value){
        this.setFieldCond("psapppdtviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psappviewid__eq(String value){
        this.setFieldCond("psappviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psappviewname__eq(String value){
        this.setFieldCond("psappviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter psappviewname__like(String value){
        this.setFieldCond("psappviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssyspdtviewid__eq(String value){
        this.setFieldCond("pssyspdtviewid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssyspdtviewname__eq(String value){
        this.setFieldCond("pssyspdtviewname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统预置视图]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter pssyspdtviewname__like(String value){
        this.setFieldCond("pssyspdtviewname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPDTViewFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
