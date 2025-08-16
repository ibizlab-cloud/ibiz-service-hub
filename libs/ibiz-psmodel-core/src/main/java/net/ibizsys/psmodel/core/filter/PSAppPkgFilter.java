package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPKG 过滤器对象
 */
public class PSAppPkgFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppPkgFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter psapppkgname__eq(String value){
        this.setFieldCond("psapppkgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter psapppkgname__like(String value){
        this.setFieldCond("psapppkgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgid__eq(String value){
        this.setFieldCond("pspfpkgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgname__eq(String value){
        this.setFieldCond("pspfpkgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgname__like(String value){
        this.setFieldCond("pspfpkgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgverid__eq(String value){
        this.setFieldCond("pspfpkgverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgvername__eq(String value){
        this.setFieldCond("pspfpkgvername", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgvername__like(String value){
        this.setFieldCond("pspfpkgvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
