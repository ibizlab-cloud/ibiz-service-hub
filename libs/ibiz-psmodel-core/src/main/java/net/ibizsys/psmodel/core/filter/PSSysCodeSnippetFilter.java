package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCODESNIPPET 过滤器对象
 */
public class PSSysCodeSnippetFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysCodeSnippetFilter(){
    
    }      

    /**
     * 设置属性[中心代码片段]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter psdccodesnippetid__eq(String value){
        this.setFieldCond("psdccodesnippetid", EQ, value);
        return this;
    }

    /**
     * 设置属性[中心代码片段]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter psdccodesnippetname__eq(String value){
        this.setFieldCond("psdccodesnippetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[中心代码片段]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter psdccodesnippetname__like(String value){
        this.setFieldCond("psdccodesnippetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfname__like(String value){
        this.setFieldCond("pspfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用框架样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfstyleid__eq(String value){
        this.setFieldCond("pspfstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用框架样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfstylename__eq(String value){
        this.setFieldCond("pspfstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用框架样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfstylename__like(String value){
        this.setFieldCond("pspfstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfid__eq(String value){
        this.setFieldCond("pssfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfname__eq(String value){
        this.setFieldCond("pssfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfname__like(String value){
        this.setFieldCond("pssfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfstyleid__eq(String value){
        this.setFieldCond("pssfstyleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfstylename__eq(String value){
        this.setFieldCond("pssfstylename", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台服务框架]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfstylename__like(String value){
        this.setFieldCond("pssfstylename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码块名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssyscodesnippetname__eq(String value){
        this.setFieldCond("pssyscodesnippetname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统代码块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssyscodesnippetname__like(String value){
        this.setFieldCond("pssyscodesnippetname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[模板类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter templtype__eq(String value){
        this.setFieldCond("templtype", EQ, value);
        return this;
    }

}
