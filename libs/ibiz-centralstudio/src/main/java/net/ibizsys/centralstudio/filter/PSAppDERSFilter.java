package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPDERS 过滤器对象
 */
public class PSAppDERSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppDERSFilter(){
    
    }      

    /**
     * 设置属性[从应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter cpsappdataentityid__eq(String value){
        this.setFieldCond("cpsappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("cpsapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter cpsappdataentityname__eq(String value){
        this.setFieldCond("cpsappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("cpsapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[从应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter cpsappdataentityname__like(String value){
        this.setFieldCond("cpsappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("cpsapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[父应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter ppsappdataentityid__eq(String value){
        this.setFieldCond("ppsappdataentityid", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter ppsappdataentityname__eq(String value){
        this.setFieldCond("ppsappdataentityname", Conditions.EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[主应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter ppsappdataentityname__like(String value){
        this.setFieldCond("ppsappdataentityname", Conditions.LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psappdersname__like(String value){
        this.setFieldCond("psappdersname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psderid__eq(String value){
        this.setFieldCond("psderid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psdername__eq(String value){
        this.setFieldCond("psdername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psdername__like(String value){
        this.setFieldCond("psdername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

}
