package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREF 过滤器对象
 */
public class PSSysRefFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysRefFilter(){
    
    }      

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsyssrvid__eq(String value){
        this.setFieldCond("psdevslnsyssrvid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsyssrvname__eq(String value){
        this.setFieldCond("psdevslnsyssrvname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsyssrvname__like(String value){
        this.setFieldCond("psdevslnsyssrvname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssubsysid__eq(String value){
        this.setFieldCond("pssubsysid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssubsysname__eq(String value){
        this.setFieldCond("pssubsysname", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台子系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssubsysname__like(String value){
        this.setFieldCond("pssubsysname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssysrefname__eq(String value){
        this.setFieldCond("pssysrefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssysrefname__like(String value){
        this.setFieldCond("pssysrefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter sysreftype__eq(String value){
        this.setFieldCond("sysreftype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
