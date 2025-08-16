package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESAVR 过滤器对象
 */
public class PSDESAVRFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDESAVRFilter(){
    
    }      

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdefvrid__eq(String value){
        this.setFieldCond("psdefvrid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdefvrname__eq(String value){
        this.setFieldCond("psdefvrname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdefvrname__like(String value){
        this.setFieldCond("psdefvrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[规则名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdesavrname__like(String value){
        this.setFieldCond("psdesavrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdeserviceapiid__eq(String value){
        this.setFieldCond("psdeserviceapiid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdeserviceapiname__eq(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体服务接口]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter psdeserviceapiname__like(String value){
        this.setFieldCond("psdeserviceapiname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESAVRFilter vrtype__eq(String value){
        this.setFieldCond("vrtype", Conditions.EQ, value);
        return this;
    }

}
