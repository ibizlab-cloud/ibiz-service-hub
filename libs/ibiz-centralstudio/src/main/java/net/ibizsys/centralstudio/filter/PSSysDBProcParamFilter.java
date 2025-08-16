package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDBPROCPARAM 过滤器对象
 */
public class PSSysDBProcParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDBProcParamFilter(){
    
    }      

    /**
     * 设置属性[参数方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter paramdir__eq(Integer value){
        this.setFieldCond("paramdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[存储过程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocid__eq(String value){
        this.setFieldCond("pssysdbprocid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[存储过程]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocname__eq(String value){
        this.setFieldCond("pssysdbprocname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[存储过程]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocname__like(String value){
        this.setFieldCond("pssysdbprocname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter pssysdbprocparamname__like(String value){
        this.setFieldCond("pssysdbprocparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDBProcParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
