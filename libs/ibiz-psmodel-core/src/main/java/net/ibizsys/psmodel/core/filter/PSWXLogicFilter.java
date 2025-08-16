package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWXLOGIC 过滤器对象
 */
public class PSWXLogicFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSWXLogicFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[事件类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter eventtype__eq(String value){
        this.setFieldCond("eventtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体逻辑]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[公众微信号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxaccountid__eq(String value){
        this.setFieldCond("pswxaccountid", EQ, value);
        return this;
    }

    /**
     * 设置属性[公众微信号]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxaccountname__eq(String value){
        this.setFieldCond("pswxaccountname", EQ, value);
        return this;
    }

    /**
     * 设置属性[公众微信号]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxaccountname__like(String value){
        this.setFieldCond("pswxaccountname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxentappid__eq(String value){
        this.setFieldCond("pswxentappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxentappname__eq(String value){
        this.setFieldCond("pswxentappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信企业应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxentappname__like(String value){
        this.setFieldCond("pswxentappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[响应逻辑名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxlogicname__eq(String value){
        this.setFieldCond("pswxlogicname", EQ, value);
        return this;
    }

    /**
     * 设置属性[响应逻辑名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxlogicname__like(String value){
        this.setFieldCond("pswxlogicname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxmenufuncid__eq(String value){
        this.setFieldCond("pswxmenufuncid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxmenufuncname__eq(String value){
        this.setFieldCond("pswxmenufuncname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信菜单功能]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter pswxmenufuncname__like(String value){
        this.setFieldCond("pswxmenufuncname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWXLogicFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
