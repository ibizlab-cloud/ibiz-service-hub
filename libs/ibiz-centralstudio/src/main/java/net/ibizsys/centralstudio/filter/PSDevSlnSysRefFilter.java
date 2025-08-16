package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEVSLNSYSREF 过滤器对象
 */
public class PSDevSlnSysRefFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDevSlnSysRefFilter(){
    
    }      

    /**
     * 设置属性[开发系统引用名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter psdevslnsysrefname__like(String value){
        this.setFieldCond("psdevslnsysrefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统引用标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter psdevslnsysrefid__eq(String value){
        this.setFieldCond("psdevslnsysrefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发方案标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter refpsdevslnsysid__eq(String value){
        this.setFieldCond("refpsdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter refpsdevslnsysname__eq(String value){
        this.setFieldCond("refpsdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter refpsdevslnsysname__like(String value){
        this.setFieldCond("refpsdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter refmode__eq(String value){
        this.setFieldCond("refmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[使用方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter usage__eq(String value){
        this.setFieldCond("usage", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter linkstate__eq(Integer value){
        this.setFieldCond("linkstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter refpsdevslnsyssrvname__eq(String value){
        this.setFieldCond("refpsdevslnsyssrvname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter refpsdevslnsyssrvname__like(String value){
        this.setFieldCond("refpsdevslnsyssrvname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用系统服务包]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDevSlnSysRefFilter refpsdevslnsyssrvid__eq(String value){
        this.setFieldCond("refpsdevslnsyssrvid", Conditions.EQ, value);
        return this;
    }

}