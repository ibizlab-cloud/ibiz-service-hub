package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDTSQUEUE 过滤器对象
 */
public class PSDEDTSQueueFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDTSQueueFilter(){
    
    }      

    /**
     * 设置属性[取消行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter cancelpsdeactionid__eq(String value){
        this.setFieldCond("cancelpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[取消行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter cancelpsdeactionname__eq(String value){
        this.setFieldCond("cancelpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[取消行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter cancelpsdeactionname__like(String value){
        this.setFieldCond("cancelpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[错误属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter errorpsdefid__eq(String value){
        this.setFieldCond("errorpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[错误属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter errorpsdefname__eq(String value){
        this.setFieldCond("errorpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[错误属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter errorpsdefname__like(String value){
        this.setFieldCond("errorpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[完成行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter finishpsdeactionid__eq(String value){
        this.setFieldCond("finishpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter finishpsdeactionname__eq(String value){
        this.setFieldCond("finishpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[完成行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter finishpsdeactionname__like(String value){
        this.setFieldCond("finishpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[历史队列实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter historypsdeid__eq(String value){
        this.setFieldCond("historypsdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[历史队列实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter historypsdename__eq(String value){
        this.setFieldCond("historypsdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[历史队列实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter historypsdename__like(String value){
        this.setFieldCond("historypsdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[队列名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdedtsqueuename__eq(String value){
        this.setFieldCond("psdedtsqueuename", EQ, value);
        return this;
    }

    /**
     * 设置属性[队列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdedtsqueuename__like(String value){
        this.setFieldCond("psdedtsqueuename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端模板插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[推送行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pushpsdeactionid__eq(String value){
        this.setFieldCond("pushpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[推送行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pushpsdeactionname__eq(String value){
        this.setFieldCond("pushpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[推送行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter pushpsdeactionname__like(String value){
        this.setFieldCond("pushpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[刷新行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter refreshpsdeactionid__eq(String value){
        this.setFieldCond("refreshpsdeactionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[刷新行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter refreshpsdeactionname__eq(String value){
        this.setFieldCond("refreshpsdeactionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[刷新行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter refreshpsdeactionname__like(String value){
        this.setFieldCond("refreshpsdeactionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter timepsdefid__eq(String value){
        this.setFieldCond("timepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter timepsdefname__eq(String value){
        this.setFieldCond("timepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter timepsdefname__like(String value){
        this.setFieldCond("timepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[启用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDTSQueueFilter validflag__eq(Integer value){
        this.setFieldCond("validflag", EQ, value);
        return this;
    }

}
