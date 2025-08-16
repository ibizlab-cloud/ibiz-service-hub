package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEQUENCE 过滤器对象
 */
public class PSSysSequenceFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSequenceFilter(){
    
    }      

    /**
     * 设置属性[代码名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[值序列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssequencename__like(String value){
        this.setFieldCond("pssyssequencename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[序列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter sequencetype__eq(String value){
        this.setFieldCond("sequencetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter timepsdefid__eq(String value){
        this.setFieldCond("timepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter timepsdefname__eq(String value){
        this.setFieldCond("timepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter timepsdefname__like(String value){
        this.setFieldCond("timepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter typepsdefid__eq(String value){
        this.setFieldCond("typepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter typepsdefname__eq(String value){
        this.setFieldCond("typepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter typepsdefname__like(String value){
        this.setFieldCond("typepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter valuepsdefid__eq(String value){
        this.setFieldCond("valuepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter valuepsdefname__eq(String value){
        this.setFieldCond("valuepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter valuepsdefname__like(String value){
        this.setFieldCond("valuepsdefname", Conditions.LIKE, value);
        return this;
    }

}
