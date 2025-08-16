package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSMSGQUEUE 过滤器对象
 */
public class PSSysMsgQueueFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysMsgQueueFilter(){
    
    }      

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[钉钉消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter ddcontentpsdefid__eq(String value){
        this.setFieldCond("ddcontentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter ddcontentpsdefname__eq(String value){
        this.setFieldCond("ddcontentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[钉钉消息值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter ddcontentpsdefname__like(String value){
        this.setFieldCond("ddcontentpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[文件属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter filepsdefid__eq(String value){
        this.setFieldCond("filepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[文件属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter filepsdefname__eq(String value){
        this.setFieldCond("filepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[文件属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter filepsdefname__like(String value){
        this.setFieldCond("filepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[即时消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter imcontentpsdefid__eq(String value){
        this.setFieldCond("imcontentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[即时消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter imcontentpsdefname__eq(String value){
        this.setFieldCond("imcontentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[即时消息值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter imcontentpsdefname__like(String value){
        this.setFieldCond("imcontentpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[移动端任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter mobtaskurlpsdefid__eq(String value){
        this.setFieldCond("mobtaskurlpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter mobtaskurlpsdefname__eq(String value){
        this.setFieldCond("mobtaskurlpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[移动端任务路径值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter mobtaskurlpsdefname__like(String value){
        this.setFieldCond("mobtaskurlpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息队列标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgqueuetag__eq(String value){
        this.setFieldCond("msgqueuetag", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息队列标记]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgqueuetag__like(String value){
        this.setFieldCond("msgqueuetag", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息队列标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgqueuetag2__eq(String value){
        this.setFieldCond("msgqueuetag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息队列标记2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgqueuetag2__like(String value){
        this.setFieldCond("msgqueuetag2", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息队列类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgqueuetype__eq(String value){
        this.setFieldCond("msgqueuetype", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgtypepsdefid__eq(String value){
        this.setFieldCond("msgtypepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgtypepsdefname__eq(String value){
        this.setFieldCond("msgtypepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息类型值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter msgtypepsdefname__like(String value){
        this.setFieldCond("msgtypepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysdynamodelid__eq(String value){
        this.setFieldCond("pssysdynamodelid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysdynamodelname__eq(String value){
        this.setFieldCond("pssysdynamodelname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统动态模型]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysdynamodelname__like(String value){
        this.setFieldCond("pssysdynamodelname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息队列名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysmsgqueuename__eq(String value){
        this.setFieldCond("pssysmsgqueuename", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息队列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysmsgqueuename__like(String value){
        this.setFieldCond("pssysmsgqueuename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssyssfpluginid__eq(String value){
        this.setFieldCond("pssyssfpluginid", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssyssfpluginname__eq(String value){
        this.setFieldCond("pssyssfpluginname", EQ, value);
        return this;
    }

    /**
     * 设置属性[后端扩展插件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssyssfpluginname__like(String value){
        this.setFieldCond("pssyssfpluginname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysutildeid__eq(String value){
        this.setFieldCond("pssysutildeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysutildename__eq(String value){
        this.setFieldCond("pssysutildename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统功能组件]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter pssysutildename__like(String value){
        this.setFieldCond("pssysutildename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[发送时间属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter sendtimepsdefid__eq(String value){
        this.setFieldCond("sendtimepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[发送时间值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter sendtimepsdefname__eq(String value){
        this.setFieldCond("sendtimepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[发送时间值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter sendtimepsdefname__like(String value){
        this.setFieldCond("sendtimepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[短内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter smscontentpsdefid__eq(String value){
        this.setFieldCond("smscontentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[短内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter smscontentpsdefname__eq(String value){
        this.setFieldCond("smscontentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[短内容值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter smscontentpsdefname__like(String value){
        this.setFieldCond("smscontentpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[状态属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter statepsdefid__eq(String value){
        this.setFieldCond("statepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[状态值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter statepsdefname__eq(String value){
        this.setFieldCond("statepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[状态值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter statepsdefname__like(String value){
        this.setFieldCond("statepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记2属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tag2psdefid__eq(String value){
        this.setFieldCond("tag2psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标记2值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tag2psdefname__eq(String value){
        this.setFieldCond("tag2psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标记2值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tag2psdefname__like(String value){
        this.setFieldCond("tag2psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[标记属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tagpsdefid__eq(String value){
        this.setFieldCond("tagpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[标记值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tagpsdefname__eq(String value){
        this.setFieldCond("tagpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[标记值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter tagpsdefname__like(String value){
        this.setFieldCond("tagpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标标识属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targetpsdefid__eq(String value){
        this.setFieldCond("targetpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targetpsdefname__eq(String value){
        this.setFieldCond("targetpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标标识值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targetpsdefname__like(String value){
        this.setFieldCond("targetpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标类型属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targettypepsdefid__eq(String value){
        this.setFieldCond("targettypepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targettypepsdefname__eq(String value){
        this.setFieldCond("targettypepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[目标类型值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter targettypepsdefname__like(String value){
        this.setFieldCond("targettypepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter taskurlpsdefid__eq(String value){
        this.setFieldCond("taskurlpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[任务路径值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter taskurlpsdefname__eq(String value){
        this.setFieldCond("taskurlpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[任务路径值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter taskurlpsdefname__like(String value){
        this.setFieldCond("taskurlpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter titlepsdefid__eq(String value){
        this.setFieldCond("titlepsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter titlepsdefname__eq(String value){
        this.setFieldCond("titlepsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[消息标题值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter titlepsdefname__like(String value){
        this.setFieldCond("titlepsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter user2psdefid__eq(String value){
        this.setFieldCond("user2psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter user2psdefname__eq(String value){
        this.setFieldCond("user2psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性2]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter user2psdefname__like(String value){
        this.setFieldCond("user2psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter userpsdefid__eq(String value){
        this.setFieldCond("userpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter userpsdefname__eq(String value){
        this.setFieldCond("userpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户自定义属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter userpsdefname__like(String value){
        this.setFieldCond("userpsdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter wxcontentpsdefid__eq(String value){
        this.setFieldCond("wxcontentpsdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信消息值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter wxcontentpsdefname__eq(String value){
        this.setFieldCond("wxcontentpsdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[微信消息值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysMsgQueueFilter wxcontentpsdefname__like(String value){
        this.setFieldCond("wxcontentpsdefname", LIKE, value);
        return this;
    }

}
