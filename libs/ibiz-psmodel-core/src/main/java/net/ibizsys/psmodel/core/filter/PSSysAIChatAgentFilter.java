package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSAICHATAGENT 过滤器对象
 */
public class PSSysAIChatAgentFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysAIChatAgentFilter(){
    
    }      

    /**
     * 设置属性[代理类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter aichatagenttype__eq(String value){
        this.setFieldCond("aichatagenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter pssysaichatagentname__like(String value){
        this.setFieldCond("pssysaichatagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter pssysaifactoryid__eq(String value){
        this.setFieldCond("pssysaifactoryid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter pssysaifactoryname__eq(String value){
        this.setFieldCond("pssysaifactoryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter pssysaifactoryname__like(String value){
        this.setFieldCond("pssysaifactoryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIChatAgentFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
