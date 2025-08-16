package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSAIPIPELINEWORKER 过滤器对象
 */
public class PSSysAIPipelineWorkerFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysAIPipelineWorkerFilter(){
    
    }      

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaifactoryid__eq(String value){
        this.setFieldCond("pssysaifactoryid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaifactoryname__eq(String value){
        this.setFieldCond("pssysaifactoryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaifactoryname__like(String value){
        this.setFieldCond("pssysaifactoryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI生产线代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaipipelineagentid__eq(String value){
        this.setFieldCond("pssysaipipelineagentid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI生产线代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaipipelineagentname__eq(String value){
        this.setFieldCond("pssysaipipelineagentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI生产线代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaipipelineagentname__like(String value){
        this.setFieldCond("pssysaipipelineagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI生产线工作者名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaipipelineworkername__like(String value){
        this.setFieldCond("pssysaipipelineworkername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI工作者代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaiworkeragentid__eq(String value){
        this.setFieldCond("pssysaiworkeragentid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工作者代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaiworkeragentname__eq(String value){
        this.setFieldCond("pssysaiworkeragentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工作者代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter pssysaiworkeragentname__like(String value){
        this.setFieldCond("pssysaiworkeragentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineWorkerFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
