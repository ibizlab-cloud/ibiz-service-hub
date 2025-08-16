package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSAIWORKERAGENT 过滤器对象
 */
public class PSSysAIWorkerAgentFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysAIWorkerAgentFilter(){
    
    }      

    /**
     * 设置属性[代理类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter aiworkeragenttype__eq(String value){
        this.setFieldCond("aiworkeragenttype", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter pssysaifactoryid__eq(String value){
        this.setFieldCond("pssysaifactoryid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter pssysaifactoryname__eq(String value){
        this.setFieldCond("pssysaifactoryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter pssysaifactoryname__like(String value){
        this.setFieldCond("pssysaifactoryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代理名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter pssysaiworkeragentname__like(String value){
        this.setFieldCond("pssysaiworkeragentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIWorkerAgentFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
