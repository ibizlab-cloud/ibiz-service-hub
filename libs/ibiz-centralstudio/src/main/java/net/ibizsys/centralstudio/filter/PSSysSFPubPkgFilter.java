package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSFPUBPKG 过滤器对象
 */
public class PSSysSFPubPkgFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSFPubPkgFilter(){
    
    }      

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgid__eq(String value){
        this.setFieldCond("pssfpkgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgname__eq(String value){
        this.setFieldCond("pssfpkgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgname__like(String value){
        this.setFieldCond("pssfpkgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgverid__eq(String value){
        this.setFieldCond("pssfpkgverid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgvername__eq(String value){
        this.setFieldCond("pssfpkgvername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssfpkgvername__like(String value){
        this.setFieldCond("pssfpkgvername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubid__eq(String value){
        this.setFieldCond("pssyssfpubid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubname__eq(String value){
        this.setFieldCond("pssyssfpubname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后台体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubname__like(String value){
        this.setFieldCond("pssyssfpubname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter pssyssfpubpkgname__like(String value){
        this.setFieldCond("pssyssfpubpkgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSFPubPkgFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
