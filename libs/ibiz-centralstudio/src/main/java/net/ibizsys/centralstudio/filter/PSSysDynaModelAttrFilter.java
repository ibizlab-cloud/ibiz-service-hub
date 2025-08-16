package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSDYNAMODELATTR 过滤器对象
 */
public class PSSysDynaModelAttrFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysDynaModelAttrFilter(){
    
    }      

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelattrname__like(String value){
        this.setFieldCond("pssysdynamodelattrname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[动态模型对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysvalueruleid__eq(String value){
        this.setFieldCond("pssysvalueruleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysvaluerulename__eq(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值规则]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter pssysvaluerulename__like(String value){
        this.setFieldCond("pssysvaluerulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdefgroupid__eq(String value){
        this.setFieldCond("refpsdefgroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体属性组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdefgroupname__eq(String value){
        this.setFieldCond("refpsdefgroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体属性组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdefgroupname__like(String value){
        this.setFieldCond("refpsdefgroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpssysdynamodelid__eq(String value){
        this.setFieldCond("refpssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用模型对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpssysdynamodelname__eq(String value){
        this.setFieldCond("refpssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用模型对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter refpssysdynamodelname__like(String value){
        this.setFieldCond("refpssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标准数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter stddatatype__eq(Integer value){
        this.setFieldCond("stddatatype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysDynaModelAttrFilter valuetype__eq(String value){
        this.setFieldCond("valuetype", Conditions.EQ, value);
        return this;
    }

}
