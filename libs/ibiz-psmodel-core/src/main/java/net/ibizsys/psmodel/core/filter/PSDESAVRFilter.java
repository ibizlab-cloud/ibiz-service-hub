package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESAVR 过滤器对象
 */
public class PSDESAVRFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDESAVRFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdefvrid__eq(String value){
        this.setFieldCond("psdefvrid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdefvrname__eq(String value){
        this.setFieldCond("psdefvrname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdefvrname__like(String value){
        this.setFieldCond("psdefvrname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[规则名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdesavrname__eq(String value){
        this.setFieldCond("psdesavrname", EQ, value);
        return this;
    }

    /**
     * 设置属性[规则名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdesavrname__like(String value){
        this.setFieldCond("psdesavrname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdeserviceapiid__eq(String value){
        this.setFieldCond("psdeserviceapiid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter vrtype__eq(String value){
        this.setFieldCond("vrtype", EQ, value);
        return this;
    }

}
