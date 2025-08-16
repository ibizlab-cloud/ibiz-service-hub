package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDENOTIFY 过滤器对象
 */
public class PSDENotifyFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDENotifyFilter(){
    
    }      

    /**
     * 设置属性[开始时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter beginpsdefid__eq(String value){
        this.setFieldCond("beginpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter beginpsdefname__eq(String value){
        this.setFieldCond("beginpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开始时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter beginpsdefname__like(String value){
        this.setFieldCond("beginpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter endpsdefid__eq(String value){
        this.setFieldCond("endpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter endpsdefname__eq(String value){
        this.setFieldCond("endpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[结束时间属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter endpsdefname__like(String value){
        this.setFieldCond("endpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdedsid__eq(String value){
        this.setFieldCond("psdedsid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdedsname__eq(String value){
        this.setFieldCond("psdedsname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdedsname__like(String value){
        this.setFieldCond("psdedsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体通知名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdenotifyname__like(String value){
        this.setFieldCond("psdenotifyname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeprintid__eq(String value){
        this.setFieldCond("psdeprintid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeprintname__eq(String value){
        this.setFieldCond("psdeprintname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体打印]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdeprintname__like(String value){
        this.setFieldCond("psdeprintname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdereportid__eq(String value){
        this.setFieldCond("psdereportid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdereportname__eq(String value){
        this.setFieldCond("psdereportname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体报表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter psdereportname__like(String value){
        this.setFieldCond("psdereportname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息队列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgqueueid__eq(String value){
        this.setFieldCond("pssysmsgqueueid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息队列]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgqueuename__eq(String value){
        this.setFieldCond("pssysmsgqueuename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息队列]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgqueuename__like(String value){
        this.setFieldCond("pssysmsgqueuename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgtemplid__eq(String value){
        this.setFieldCond("pssysmsgtemplid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgtemplname__eq(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统消息模板]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssysmsgtemplname__like(String value){
        this.setFieldCond("pssysmsgtemplname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[附加任务模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter taskmode__eq(Integer value){
        this.setFieldCond("taskmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDENotifyFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
