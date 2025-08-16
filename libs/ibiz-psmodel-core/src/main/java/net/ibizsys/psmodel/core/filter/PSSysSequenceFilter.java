package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSEQUENCE 过滤器对象
 */
public class PSSysSequenceFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysSequenceFilter(){
    
    }      

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter keypsdefid__eq(String value){
        this.setFieldCond("keypsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter keypsdefname__eq(String value){
        this.setFieldCond("keypsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标识属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter keypsdefname__like(String value){
        this.setFieldCond("keypsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[值序列名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssequencename__eq(String value){
        this.setFieldCond("pssyssequencename", EQ, value);
        return this;
    }

    /**
     * 设置属性[值序列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssequencename__like(String value){
        this.setFieldCond("pssyssequencename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[序列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter sequencetype__eq(String value){
        this.setFieldCond("sequencetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter timepsdefid__eq(String value){
        this.setFieldCond("timepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter timepsdefname__eq(String value){
        this.setFieldCond("timepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter timepsdefname__like(String value){
        this.setFieldCond("timepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter typepsdefid__eq(String value){
        this.setFieldCond("typepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter typepsdefname__eq(String value){
        this.setFieldCond("typepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[类型属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter typepsdefname__like(String value){
        this.setFieldCond("typepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter user2psdefid__eq(String value){
        this.setFieldCond("user2psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter user2psdefname__eq(String value){
        this.setFieldCond("user2psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter user2psdefname__like(String value){
        this.setFieldCond("user2psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter userpsdefid__eq(String value){
        this.setFieldCond("userpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter userpsdefname__eq(String value){
        this.setFieldCond("userpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter userpsdefname__like(String value){
        this.setFieldCond("userpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter valuepsdefid__eq(String value){
        this.setFieldCond("valuepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter valuepsdefname__eq(String value){
        this.setFieldCond("valuepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSequenceFilter valuepsdefname__like(String value){
        this.setFieldCond("valuepsdefname", LIKE, value);
        return this;
    }

}
