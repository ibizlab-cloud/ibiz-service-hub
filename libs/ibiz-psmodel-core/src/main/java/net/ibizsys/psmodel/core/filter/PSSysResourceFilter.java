package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSRESOURCE 过滤器对象
 */
public class PSSysResourceFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysResourceFilter(){
    
    }      

    /**
     * 设置属性[认证模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter authmode__eq(String value){
        this.setFieldCond("authmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter contentpslanresid__eq(String value){
        this.setFieldCond("contentpslanresid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter contentpslanresname__eq(String value){
        this.setFieldCond("contentpslanresname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter contentpslanresname__like(String value){
        this.setFieldCond("contentpslanresname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter namepsdefid__eq(String value){
        this.setFieldCond("namepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter namepsdefname__eq(String value){
        this.setFieldCond("namepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter namepsdefname__like(String value){
        this.setFieldCond("namepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[路径属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pathpsdefid__eq(String value){
        this.setFieldCond("pathpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[路径属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pathpsdefname__eq(String value){
        this.setFieldCond("pathpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[路径属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pathpsdefname__like(String value){
        this.setFieldCond("pathpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据源数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据源实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssyscontentcatid__eq(String value){
        this.setFieldCond("pssyscontentcatid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssyscontentcatname__eq(String value){
        this.setFieldCond("pssyscontentcatname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统内容分类]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssyscontentcatname__like(String value){
        this.setFieldCond("pssyscontentcatname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[资源名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[资源类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter resourcetype__eq(String value){
        this.setFieldCond("resourcetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[资源标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter restag__like(String value){
        this.setFieldCond("restag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter tagpsdefid__eq(String value){
        this.setFieldCond("tagpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter tagpsdefname__eq(String value){
        this.setFieldCond("tagpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter tagpsdefname__like(String value){
        this.setFieldCond("tagpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter user2psdefid__eq(String value){
        this.setFieldCond("user2psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter user2psdefname__eq(String value){
        this.setFieldCond("user2psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter user2psdefname__like(String value){
        this.setFieldCond("user2psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter userpsdefid__eq(String value){
        this.setFieldCond("userpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter userpsdefname__eq(String value){
        this.setFieldCond("userpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[自定义属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter userpsdefname__like(String value){
        this.setFieldCond("userpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysResourceFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
