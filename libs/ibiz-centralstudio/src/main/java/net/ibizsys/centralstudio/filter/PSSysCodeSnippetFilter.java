package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSCODESNIPPET 过滤器对象
 */
public class PSSysCodeSnippetFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysCodeSnippetFilter(){
    
    }      

    /**
     * 设置属性[中心代码片段]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter psdccodesnippetid__eq(String value){
        this.setFieldCond("psdccodesnippetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中心代码片段]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter psdccodesnippetname__eq(String value){
        this.setFieldCond("psdccodesnippetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中心代码片段]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter psdccodesnippetname__like(String value){
        this.setFieldCond("psdccodesnippetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfid__eq(String value){
        this.setFieldCond("pspfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfname__eq(String value){
        this.setFieldCond("pspfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfname__like(String value){
        this.setFieldCond("pspfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用框架样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfstyleid__eq(String value){
        this.setFieldCond("pspfstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用框架样式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfstylename__eq(String value){
        this.setFieldCond("pspfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用框架样式]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pspfstylename__like(String value){
        this.setFieldCond("pspfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统服务体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfid__eq(String value){
        this.setFieldCond("pssfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfname__eq(String value){
        this.setFieldCond("pssfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统服务体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfname__like(String value){
        this.setFieldCond("pssfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfstyleid__eq(String value){
        this.setFieldCond("pssfstyleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfstylename__eq(String value){
        this.setFieldCond("pssfstylename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台服务框架]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssfstylename__like(String value){
        this.setFieldCond("pssfstylename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统代码块名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssyscodesnippetname__like(String value){
        this.setFieldCond("pssyscodesnippetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[模板类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysCodeSnippetFilter templtype__eq(String value){
        this.setFieldCond("templtype", Conditions.EQ, value);
        return this;
    }

}
