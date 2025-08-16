package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXENTAPP 过滤器对象
 */
public class PSWXEntAppFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWXEntAppFilter(){
    
    }      

    /**
     * 设置属性[应用类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter apptype__eq(String value){
        this.setFieldCond("apptype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信公众号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXEntAppFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
