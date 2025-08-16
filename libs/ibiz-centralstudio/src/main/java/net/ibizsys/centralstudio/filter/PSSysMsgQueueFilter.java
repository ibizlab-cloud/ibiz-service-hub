package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMSGQUEUE 过滤器对象
 */
public class PSSysMsgQueueFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysMsgQueueFilter(){
    
    }      

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[钉钉消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter ddcontentpsdefid__eq(String value){
        this.setFieldCond("ddcontentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter ddcontentpsdefname__eq(String value){
        this.setFieldCond("ddcontentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉消息值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter ddcontentpsdefname__like(String value){
        this.setFieldCond("ddcontentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[文件属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter filepsdefid__eq(String value){
        this.setFieldCond("filepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文件属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter filepsdefname__eq(String value){
        this.setFieldCond("filepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[文件属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter filepsdefname__like(String value){
        this.setFieldCond("filepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[即时消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter imcontentpsdefid__eq(String value){
        this.setFieldCond("imcontentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[即时消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter imcontentpsdefname__eq(String value){
        this.setFieldCond("imcontentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[即时消息值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter imcontentpsdefname__like(String value){
        this.setFieldCond("imcontentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter mobtaskurlpsdefid__eq(String value){
        this.setFieldCond("mobtaskurlpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter mobtaskurlpsdefname__eq(String value){
        this.setFieldCond("mobtaskurlpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端任务路径值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter mobtaskurlpsdefname__like(String value){
        this.setFieldCond("mobtaskurlpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息队列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgqueuetype__eq(String value){
        this.setFieldCond("msgqueuetype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgtypepsdefid__eq(String value){
        this.setFieldCond("msgtypepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgtypepsdefname__eq(String value){
        this.setFieldCond("msgtypepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgtypepsdefname__like(String value){
        this.setFieldCond("msgtypepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息队列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysmsgqueuename__like(String value){
        this.setFieldCond("pssysmsgqueuename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysutildeid__eq(String value){
        this.setFieldCond("pssysutildeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysutildename__eq(String value){
        this.setFieldCond("pssysutildename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysutildename__like(String value){
        this.setFieldCond("pssysutildename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[发送时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter sendtimepsdefid__eq(String value){
        this.setFieldCond("sendtimepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[发送时间值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter sendtimepsdefname__eq(String value){
        this.setFieldCond("sendtimepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[发送时间值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter sendtimepsdefname__like(String value){
        this.setFieldCond("sendtimepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[短内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter smscontentpsdefid__eq(String value){
        this.setFieldCond("smscontentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[短内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter smscontentpsdefname__eq(String value){
        this.setFieldCond("smscontentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[短内容值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter smscontentpsdefname__like(String value){
        this.setFieldCond("smscontentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[状态值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tag2psdefid__eq(String value){
        this.setFieldCond("tag2psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记2值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tag2psdefname__eq(String value){
        this.setFieldCond("tag2psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记2值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tag2psdefname__like(String value){
        this.setFieldCond("tag2psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tagpsdefid__eq(String value){
        this.setFieldCond("tagpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tagpsdefname__eq(String value){
        this.setFieldCond("tagpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[标记值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tagpsdefname__like(String value){
        this.setFieldCond("tagpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targetpsdefid__eq(String value){
        this.setFieldCond("targetpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targetpsdefname__eq(String value){
        this.setFieldCond("targetpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targetpsdefname__like(String value){
        this.setFieldCond("targetpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targettypepsdefid__eq(String value){
        this.setFieldCond("targettypepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targettypepsdefname__eq(String value){
        this.setFieldCond("targettypepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targettypepsdefname__like(String value){
        this.setFieldCond("targettypepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter taskurlpsdefid__eq(String value){
        this.setFieldCond("taskurlpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter taskurlpsdefname__eq(String value){
        this.setFieldCond("taskurlpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[任务路径值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter taskurlpsdefname__like(String value){
        this.setFieldCond("taskurlpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter titlepsdefid__eq(String value){
        this.setFieldCond("titlepsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter titlepsdefname__eq(String value){
        this.setFieldCond("titlepsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter titlepsdefname__like(String value){
        this.setFieldCond("titlepsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter wxcontentpsdefid__eq(String value){
        this.setFieldCond("wxcontentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter wxcontentpsdefname__eq(String value){
        this.setFieldCond("wxcontentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微信消息值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter wxcontentpsdefname__like(String value){
        this.setFieldCond("wxcontentpsdefname", Conditions.LIKE, value);
        return this;
    }

}
