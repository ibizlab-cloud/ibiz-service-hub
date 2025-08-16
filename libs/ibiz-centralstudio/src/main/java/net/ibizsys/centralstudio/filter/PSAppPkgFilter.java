package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPPKG 过滤器对象
 */
public class PSAppPkgFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppPkgFilter(){
    
    }      

    /**
     * 设置属性[组件包名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter psapppkgname__like(String value){
        this.setFieldCond("psapppkgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgid__eq(String value){
        this.setFieldCond("pspfpkgid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgname__eq(String value){
        this.setFieldCond("pspfpkgname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgname__like(String value){
        this.setFieldCond("pspfpkgname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgverid__eq(String value){
        this.setFieldCond("pspfpkgverid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgvername__eq(String value){
        this.setFieldCond("pspfpkgvername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[组件包版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pspfpkgvername__like(String value){
        this.setFieldCond("pspfpkgvername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppPkgFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
