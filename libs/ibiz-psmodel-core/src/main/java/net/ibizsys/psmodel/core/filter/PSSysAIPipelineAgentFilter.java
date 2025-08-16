package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSAIPIPELINEAGENT 过滤器对象
 */
public class PSSysAIPipelineAgentFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysAIPipelineAgentFilter(){
    
    }      

    /**
     * 设置属性[代理类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter aipipelineagenttype__eq(String value){
        this.setFieldCond("aipipelineagenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter pssysaifactoryid__eq(String value){
        this.setFieldCond("pssysaifactoryid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter pssysaifactoryname__eq(String value){
        this.setFieldCond("pssysaifactoryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter pssysaifactoryname__like(String value){
        this.setFieldCond("pssysaifactoryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter pssysaipipelineagentname__like(String value){
        this.setFieldCond("pssysaipipelineagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineAgentFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
