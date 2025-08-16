package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSUBSYSSADETAILPARAM 过滤器对象
 */
public class PSSubSysSADetailParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSubSysSADetailParamFilter(){
    
    }      

    /**
     * 设置属性[外部系统接口方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailParamFilter pssubsyssadetailid__eq(String value){
        this.setFieldCond("pssubsyssadetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口方法]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailParamFilter pssubsyssadetailname__eq(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[外部系统接口方法]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailParamFilter pssubsyssadetailname__like(String value){
        this.setFieldCond("pssubsyssadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailParamFilter pssubsyssadetailparamname__like(String value){
        this.setFieldCond("pssubsyssadetailparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailParamFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSubSysSADetailParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
