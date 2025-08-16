package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSREF 过滤器对象
 */
public class PSSysRefFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysRefFilter(){
    
    }      

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsyssrvid__eq(String value){
        this.setFieldCond("psdevslnsyssrvid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsyssrvname__eq(String value){
        this.setFieldCond("psdevslnsyssrvname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter psdevslnsyssrvname__like(String value){
        this.setFieldCond("psdevslnsyssrvname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssubsysid__eq(String value){
        this.setFieldCond("pssubsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台子系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssubsysname__eq(String value){
        this.setFieldCond("pssubsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台子系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssubsysname__like(String value){
        this.setFieldCond("pssubsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssysrefname__like(String value){
        this.setFieldCond("pssysrefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter sysreftype__eq(String value){
        this.setFieldCond("sysreftype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysRefFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
