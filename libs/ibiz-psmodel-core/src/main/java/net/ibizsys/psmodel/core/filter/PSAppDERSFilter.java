package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPDERS 过滤器对象
 */
public class PSAppDERSFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppDERSFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[从应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter cpsappdataentityid__eq(String value){
        this.setFieldCond("cpsappdataentityid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("cpsapplocaldeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[从应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter cpsappdataentityname__eq(String value){
        this.setFieldCond("cpsappdataentityname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("cpsapplocaldename", EQ, value);
        return this;
    }

    /**
     * 设置属性[从应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter cpsappdataentityname__like(String value){
        this.setFieldCond("cpsappdataentityname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("cpsapplocaldename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[父应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter ppsappdataentityid__eq(String value){
        this.setFieldCond("ppsappdataentityid", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[主应用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter ppsappdataentityname__eq(String value){
        this.setFieldCond("ppsappdataentityname", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldename", EQ, value);
        return this;
    }

    /**
     * 设置属性[主应用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter ppsappdataentityname__like(String value){
        this.setFieldCond("ppsappdataentityname", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("ppsapplocaldename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psappdersname__eq(String value){
        this.setFieldCond("psappdersname", EQ, value);
        return this;
    }

    /**
     * 设置属性[关系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psappdersname__like(String value){
        this.setFieldCond("psappdersname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psderid__eq(String value){
        this.setFieldCond("psderid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psdername__eq(String value){
        this.setFieldCond("psdername", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体关系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter psdername__like(String value){
        this.setFieldCond("psdername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppDERSFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

}
