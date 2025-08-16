package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDYNAMODELATTR 过滤器对象
 */
public class PSSysDynaModelAttrFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysDynaModelAttrFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelattrname__eq(String value){
        this.setFieldCond("pssysdynamodelattrname", EQ, value);
        return this;
    }

    /**
     * 设置属性[属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelattrname__like(String value){
        this.setFieldCond("pssysdynamodelattrname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdefgroupid__eq(String value){
        this.setFieldCond("refpsdefgroupid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdefgroupname__eq(String value){
        this.setFieldCond("refpsdefgroupname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdefgroupname__like(String value){
        this.setFieldCond("refpsdefgroupname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpssysdynamodelid__eq(String value){
        this.setFieldCond("refpssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpssysdynamodelname__eq(String value){
        this.setFieldCond("refpssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[引用模型对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpssysdynamodelname__like(String value){
        this.setFieldCond("refpssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter valuetype__eq(String value){
        this.setFieldCond("valuetype", EQ, value);
        return this;
    }

}
