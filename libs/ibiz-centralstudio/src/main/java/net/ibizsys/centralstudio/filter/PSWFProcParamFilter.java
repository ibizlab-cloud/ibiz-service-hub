package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSWFPROCPARAM 过滤器对象
 */
public class PSWFProcParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSWFProcParamFilter(){
    
    }      

    /**
     * 设置属性[设置属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[设置属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[设置属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter pswfprocessid__eq(String value){
        this.setFieldCond("pswfprocessid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter pswfprocessname__eq(String value){
        this.setFieldCond("pswfprocessname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[流程处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter pswfprocessname__like(String value){
        this.setFieldCond("pswfprocessname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[流程处理参数信息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter pswfprocparamname__like(String value){
        this.setFieldCond("pswfprocparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter srcvaluetype__eq(String value){
        this.setFieldCond("srcvaluetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSWFProcParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
