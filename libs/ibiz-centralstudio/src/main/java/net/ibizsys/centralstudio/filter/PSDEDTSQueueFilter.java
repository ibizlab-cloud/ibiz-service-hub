package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDTSQUEUE 过滤器对象
 */
public class PSDEDTSQueueFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDTSQueueFilter(){
    
    }      

    /**
     * 设置属性[取消行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter cancelpsdeactionid__eq(String value){
        this.setFieldCond("cancelpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[取消行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter cancelpsdeactionname__eq(String value){
        this.setFieldCond("cancelpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[取消行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter cancelpsdeactionname__like(String value){
        this.setFieldCond("cancelpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[错误属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter errorpsdefid__eq(String value){
        this.setFieldCond("errorpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[错误属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter errorpsdefname__eq(String value){
        this.setFieldCond("errorpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[错误属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter errorpsdefname__like(String value){
        this.setFieldCond("errorpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[完成行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter finishpsdeactionid__eq(String value){
        this.setFieldCond("finishpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter finishpsdeactionname__eq(String value){
        this.setFieldCond("finishpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[完成行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter finishpsdeactionname__like(String value){
        this.setFieldCond("finishpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[历史队列实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter historypsdeid__eq(String value){
        this.setFieldCond("historypsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[历史队列实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter historypsdename__eq(String value){
        this.setFieldCond("historypsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[历史队列实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter historypsdename__like(String value){
        this.setFieldCond("historypsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[队列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdedtsqueuename__like(String value){
        this.setFieldCond("psdedtsqueuename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[推送行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pushpsdeactionid__eq(String value){
        this.setFieldCond("pushpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[推送行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pushpsdeactionname__eq(String value){
        this.setFieldCond("pushpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[推送行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pushpsdeactionname__like(String value){
        this.setFieldCond("pushpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[刷新行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter refreshpsdeactionid__eq(String value){
        this.setFieldCond("refreshpsdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[刷新行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter refreshpsdeactionname__eq(String value){
        this.setFieldCond("refreshpsdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[刷新行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter refreshpsdeactionname__like(String value){
        this.setFieldCond("refreshpsdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter timepsdefid__eq(String value){
        this.setFieldCond("timepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter timepsdefname__eq(String value){
        this.setFieldCond("timepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter timepsdefname__like(String value){
        this.setFieldCond("timepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", Conditions.EQ, value);
        return this;
    }

}
