package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDENOTIFY 过滤器对象
 */
public class PSDENotifyFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDENotifyFilter(){
    
    }      

    /**
     * 设置属性[开始时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter beginpsdefid__eq(String value){
        this.setFieldCond("beginpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[开始时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter beginpsdefname__eq(String value){
        this.setFieldCond("beginpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[开始时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter beginpsdefname__like(String value){
        this.setFieldCond("beginpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter endpsdefid__eq(String value){
        this.setFieldCond("endpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter endpsdefname__eq(String value){
        this.setFieldCond("endpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter endpsdefname__like(String value){
        this.setFieldCond("endpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体通知名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdenotifyname__eq(String value){
        this.setFieldCond("psdenotifyname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体通知名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdenotifyname__like(String value){
        this.setFieldCond("psdenotifyname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeprintid__eq(String value){
        this.setFieldCond("psdeprintid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeprintname__eq(String value){
        this.setFieldCond("psdeprintname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeprintname__like(String value){
        this.setFieldCond("psdeprintname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdereportid__eq(String value){
        this.setFieldCond("psdereportid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdereportname__eq(String value){
        this.setFieldCond("psdereportname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdereportname__like(String value){
        this.setFieldCond("psdereportname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息队列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgqueueid__eq(String value){
        this.setFieldCond("pssysmsgqueueid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息队列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgqueuename__eq(String value){
        this.setFieldCond("pssysmsgqueuename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息队列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgqueuename__like(String value){
        this.setFieldCond("pssysmsgqueuename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[附加任务模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter taskmode__eq(Integer value){
        this.setFieldCond("taskmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
