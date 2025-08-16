package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSAIFACTORY 过滤器对象
 */
public class PSSysAIFactoryFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysAIFactoryFilter(){
    
    }      

    /**
     * 设置属性[AI工厂类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter aifactorytype__eq(String value){
        this.setFieldCond("aifactorytype", EQ, value);
        return this;
    }

    /**
     * 设置属性[认证模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter authmode__eq(String value){
        this.setFieldCond("authmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI工厂名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssysaifactoryname__like(String value){
        this.setFieldCond("pssysaifactoryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssysresourceid__eq(String value){
        this.setFieldCond("pssysresourceid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssysresourcename__eq(String value){
        this.setFieldCond("pssysresourcename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssysresourcename__like(String value){
        this.setFieldCond("pssysresourcename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIFactoryFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
