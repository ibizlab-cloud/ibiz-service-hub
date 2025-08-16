package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSFPUBPKG 过滤器对象
 */
public class PSSysSFPubPkgFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysSFPubPkgFilter(){
    
    }      

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgid__eq(String value){
        this.setFieldCond("pssfpkgid", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgname__eq(String value){
        this.setFieldCond("pssfpkgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgname__like(String value){
        this.setFieldCond("pssfpkgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgverid__eq(String value){
        this.setFieldCond("pssfpkgverid", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgvername__eq(String value){
        this.setFieldCond("pssfpkgvername", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgvername__like(String value){
        this.setFieldCond("pssfpkgvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubpkgname__eq(String value){
        this.setFieldCond("pssyssfpubpkgname", EQ, value);
        return this;
    }

    /**
     * 设置属性[组件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubpkgname__like(String value){
        this.setFieldCond("pssyssfpubpkgname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
