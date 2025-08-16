package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSAIPIPELINEJOB 过滤器对象
 */
public class PSSysAIPipelineJobFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysAIPipelineJobFilter(){
    
    }      

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter pssysaifactoryid__eq(String value){
        this.setFieldCond("pssysaifactoryid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter pssysaifactoryname__eq(String value){
        this.setFieldCond("pssysaifactoryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI工厂]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter pssysaifactoryname__like(String value){
        this.setFieldCond("pssysaifactoryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[AI生产线代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter pssysaipipelineagentid__eq(String value){
        this.setFieldCond("pssysaipipelineagentid", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI生产线代理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter pssysaipipelineagentname__eq(String value){
        this.setFieldCond("pssysaipipelineagentname", EQ, value);
        return this;
    }

    /**
     * 设置属性[AI生产线代理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter pssysaipipelineagentname__like(String value){
        this.setFieldCond("pssysaipipelineagentname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统AI生产线作业名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter pssysaipipelinejobname__like(String value){
        this.setFieldCond("pssysaipipelinejobname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[作业步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter steppscodelistid__eq(String value){
        this.setFieldCond("steppscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[作业步骤代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter steppscodelistname__eq(String value){
        this.setFieldCond("steppscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[作业步骤代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter steppscodelistname__like(String value){
        this.setFieldCond("steppscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysAIPipelineJobFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

}
