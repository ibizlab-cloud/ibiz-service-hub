package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELLCOND 过滤器对象
 */
public class PSDELLCondFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDELLCondFilter(){
    
    }      

    /**
     * 设置属性[目标参数名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter dstpsdefid__eq(String value){
        this.setFieldCond("dstpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter dstpsdefname__eq(String value){
        this.setFieldCond("dstpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter dstpsdefname__like(String value){
        this.setFieldCond("dstpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter dstpsdlparamid__eq(String value){
        this.setFieldCond("dstpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter dstpsdlparamname__eq(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter dstpsdlparamname__like(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组合方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter groupop__eq(String value){
        this.setFieldCond("groupop", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter logictype__eq(String value){
        this.setFieldCond("logictype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[条件值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter paramtype__eq(String value){
        this.setFieldCond("paramtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter ppsdellcondid__eq(String value){
        this.setFieldCond("ppsdellcondid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter ppsdellcondname__eq(String value){
        this.setFieldCond("ppsdellcondname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[父条件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter ppsdellcondname__like(String value){
        this.setFieldCond("ppsdellcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter psdbvalueopid__eq(String value){
        this.setFieldCond("psdbvalueopid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值操作]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter psdbvalueopname__eq(String value){
        this.setFieldCond("psdbvalueopname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值操作]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter psdbvalueopname__like(String value){
        this.setFieldCond("psdbvalueopname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[条件名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter psdellcondname__like(String value){
        this.setFieldCond("psdellcondname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter psdelogiclinkid__eq(String value){
        this.setFieldCond("psdelogiclinkid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑连接]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter psdelogiclinkname__eq(String value){
        this.setFieldCond("psdelogiclinkname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑连接]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter psdelogiclinkname__like(String value){
        this.setFieldCond("psdelogiclinkname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter srcpsdlparamid__eq(String value){
        this.setFieldCond("srcpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter srcpsdlparamname__eq(String value){
        this.setFieldCond("srcpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter srcpsdlparamname__like(String value){
        this.setFieldCond("srcpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELLCondFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
