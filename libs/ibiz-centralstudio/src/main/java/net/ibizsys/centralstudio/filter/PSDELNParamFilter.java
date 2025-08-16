package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDELNPARAM 过滤器对象
 */
public class PSDELNParamFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDELNParamFilter(){
    
    }      

    /**
     * 设置属性[聚合模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter aggmode__eq(String value){
        this.setFieldCond("aggmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter dstpsdefid__eq(String value){
        this.setFieldCond("dstpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter dstpsdefname__eq(String value){
        this.setFieldCond("dstpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter dstpsdefname__like(String value){
        this.setFieldCond("dstpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter dstpsdlparamid__eq(String value){
        this.setFieldCond("dstpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter dstpsdlparamname__eq(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter dstpsdlparamname__like(String value){
        this.setFieldCond("dstpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标属性排序方向]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter dstsortdir__eq(String value){
        this.setFieldCond("dstsortdir", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[参数操作类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter paramtype__eq(String value){
        this.setFieldCond("paramtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[详细信息]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdelnparamname__eq(String value){
        this.setFieldCond("psdelnparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[详细信息]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdelnparamname__like(String value){
        this.setFieldCond("psdelnparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[逻辑处理参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdelogicnodeid__eq(String value){
        this.setFieldCond("psdelogicnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑处理]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdelogicnodename__eq(String value){
        this.setFieldCond("psdelogicnodename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑处理]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdelogicnodename__like(String value){
        this.setFieldCond("psdelogicnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssyssequenceid__eq(String value){
        this.setFieldCond("pssyssequenceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值序列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssyssequencename__eq(String value){
        this.setFieldCond("pssyssequencename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值序列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssyssequencename__like(String value){
        this.setFieldCond("pssyssequencename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssystranslatorid__eq(String value){
        this.setFieldCond("pssystranslatorid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值转换器]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssystranslatorname__eq(String value){
        this.setFieldCond("pssystranslatorname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值转换器]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter pssystranslatorname__like(String value){
        this.setFieldCond("pssystranslatorname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter srcpsdefid__eq(String value){
        this.setFieldCond("srcpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter srcpsdefname__eq(String value){
        this.setFieldCond("srcpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter srcpsdefname__like(String value){
        this.setFieldCond("srcpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter srcpsdlparamid__eq(String value){
        this.setFieldCond("srcpsdlparamid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter srcpsdlparamname__eq(String value){
        this.setFieldCond("srcpsdlparamname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源参数]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter srcpsdlparamname__like(String value){
        this.setFieldCond("srcpsdlparamname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter srcvaluetype__eq(String value){
        this.setFieldCond("srcvaluetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter usertag__eq(String value){
        this.setFieldCond("usertag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDELNParamFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", Conditions.EQ, value);
        return this;
    }

}
