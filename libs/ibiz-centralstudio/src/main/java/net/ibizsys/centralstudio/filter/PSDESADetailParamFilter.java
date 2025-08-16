package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESADETAILPARAM 过滤器对象
 */
public class PSDESADetailParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDESADetailParamFilter(){
    
    }      

    /**
     * 设置属性[服务接口方法参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailParamFilter psdesadetailid__eq(String value){
        this.setFieldCond("psdesadetailid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口方法参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailParamFilter psdesadetailname__eq(String value){
        this.setFieldCond("psdesadetailname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[服务接口方法参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailParamFilter psdesadetailname__like(String value){
        this.setFieldCond("psdesadetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[参数名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailParamFilter psdesadetailparamname__like(String value){
        this.setFieldCond("psdesadetailparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailParamFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESADetailParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
