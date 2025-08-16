package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXMENUFUNC 过滤器对象
 */
public class PSWXMenuFuncFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWXMenuFuncFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter functype__eq(String value){
        this.setFieldCond("functype", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxentappid__eq(String value){
        this.setFieldCond("pswxentappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[功能名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxmenufuncname__eq(String value){
        this.setFieldCond("pswxmenufuncname", EQ, value);
        return this;
    }

    /**
     * 设置属性[功能名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter pswxmenufuncname__like(String value){
        this.setFieldCond("pswxmenufuncname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXMenuFuncFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
