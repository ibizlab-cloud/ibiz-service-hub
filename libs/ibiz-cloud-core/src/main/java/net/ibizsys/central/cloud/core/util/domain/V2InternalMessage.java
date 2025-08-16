package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2InternalMessage extends EntityBase {

    /**
     * 属性: 发送者
     */
    public final static String FIELD_SENDER = "sender";

    /**
     * 属性: 接收者
     */
    public final static String FIELD_RECEIVER = "receiver";

    /**
     * 属性: 短内容
     */
    public final static String FIELD_SHORT_CONTENT = "short_content";

    /**
     * 属性: 内容
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATUS = "status";

    /**
     * 属性: 消息类型
     */
    public final static String FIELD_MESSAGE_TYPE = "message_type";

    /**
     * 属性: 消息时间戳
     */
    public final static String FIELD_TIMESTAMP = "timestamp";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 标题
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 属性: 系统标记
     */
    public final static String FIELD_SYSTEM_TAG = "system_tag";

    /**
     * 属性: 来源消息标识
     */
    public final static String FIELD_FROM_ID = "from_id";
    
    
    /**
     * 属性: 所有者类型
     */
    public final static String FIELD_OWNER_TYPE = "owner_type";


    /**
     * 属性: 所有者标识
     */
    public final static String FIELD_OWNER_ID = "owner_id";
    
    
    /**
     * 属性: URL
     */
    public final static String FIELD_URL = "url";

    /**
     * 属性: 移动端URL
     */
    public final static String FIELD_MOBILE_URL = "mobile_url";
    
    
    /**
     * 属性: 内容类型
     */
    public final static String FIELD_CONTENT_TYPE = "content_type";
    
    /**
     * 设置「发送者」
     * @param val
     */
    @JsonProperty(FIELD_SENDER)
    public V2InternalMessage setSender(String val) {
        this.set(FIELD_SENDER, val);
        return this;
    }

    /**
     * 获取「发送者」值
     *
     */
    @JsonIgnore
    public String getSender() {
        return DataTypeUtils.asString(this.get(FIELD_SENDER), null);
    }

    /**
     * 判断 「发送者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSender() {
        return this.contains(FIELD_SENDER);
    }

    /**
     * 重置 「发送者」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetSender() {
        this.reset(FIELD_SENDER);
        return this;
    }

    /**
     * 设置「接收者」
     * @param val
     */
    @JsonProperty(FIELD_RECEIVER)
    public V2InternalMessage setReceiver(String val) {
        this.set(FIELD_RECEIVER, val);
        return this;
    }

    /**
     * 获取「接收者」值
     *
     */
    @JsonIgnore
    public String getReceiver() {
        return DataTypeUtils.asString(this.get(FIELD_RECEIVER), null);
    }

    /**
     * 判断 「接收者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReceiver() {
        return this.contains(FIELD_RECEIVER);
    }

    /**
     * 重置 「接收者」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetReceiver() {
        this.reset(FIELD_RECEIVER);
        return this;
    }

    /**
     * 设置「短内容」
     * @param val
     */
    @JsonProperty(FIELD_SHORT_CONTENT)
    public V2InternalMessage setShortContent(String val) {
        this.set(FIELD_SHORT_CONTENT, val);
        return this;
    }

    /**
     * 获取「短内容」值
     *
     */
    @JsonIgnore
    public String getShortContent() {
        return DataTypeUtils.asString(this.get(FIELD_SHORT_CONTENT), null);
    }

    /**
     * 判断 「短内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShortContent() {
        return this.contains(FIELD_SHORT_CONTENT);
    }

    /**
     * 重置 「短内容」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetShortContent() {
        this.reset(FIELD_SHORT_CONTENT);
        return this;
    }

    /**
     * 设置「内容」
     * @param val
     */
    @JsonProperty(FIELD_CONTENT)
    public V2InternalMessage setContent(String val) {
        this.set(FIELD_CONTENT, val);
        return this;
    }

    /**
     * 获取「内容」值
     *
     */
    @JsonIgnore
    public String getContent() {
        return DataTypeUtils.asString(this.get(FIELD_CONTENT), null);
    }

    /**
     * 判断 「内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContent() {
        return this.contains(FIELD_CONTENT);
    }

    /**
     * 重置 「内容」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetContent() {
        this.reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「状态」
     * @param val
     */
    @JsonProperty(FIELD_STATUS)
    public V2InternalMessage setStatus(String val) {
        this.set(FIELD_STATUS, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
     */
    @JsonIgnore
    public String getStatus() {
        return DataTypeUtils.asString(this.get(FIELD_STATUS), null);
    }

    /**
     * 判断 「状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStatus() {
        return this.contains(FIELD_STATUS);
    }

    /**
     * 重置 「状态」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetStatus() {
        this.reset(FIELD_STATUS);
        return this;
    }

    /**
     * 设置「消息类型」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_TYPE)
    public V2InternalMessage setMessageType(String val) {
        this.set(FIELD_MESSAGE_TYPE, val);
        return this;
    }

    /**
     * 获取「消息类型」值
     *
     */
    @JsonIgnore
    public String getMessageType() {
        return DataTypeUtils.asString(this.get(FIELD_MESSAGE_TYPE), null);
    }

    /**
     * 判断 「消息类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageType() {
        return this.contains(FIELD_MESSAGE_TYPE);
    }

    /**
     * 重置 「消息类型」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetMessageType() {
        this.reset(FIELD_MESSAGE_TYPE);
        return this;
    }

    /**
     * 设置「消息时间戳」
     * @param val
     */
    @JsonProperty(FIELD_TIMESTAMP)
    public V2InternalMessage setTimestamp(Timestamp val) {
        this.set(FIELD_TIMESTAMP, val);
        return this;
    }

    /**
     * 获取「消息时间戳」值
     *
     */
    @JsonIgnore
    public Timestamp getTimestamp() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_TIMESTAMP), null);
    }

    /**
     * 判断 「消息时间戳」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTimestamp() {
        return this.contains(FIELD_TIMESTAMP);
    }

    /**
     * 重置 「消息时间戳」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetTimestamp() {
        this.reset(FIELD_TIMESTAMP);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2InternalMessage setCreateMan(String val) {
        this.set(FIELD_CREATE_MAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
     */
    @JsonIgnore
    public String getCreateMan() {
        return DataTypeUtils.asString(this.get(FIELD_CREATE_MAN), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this.contains(FIELD_CREATE_MAN);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2InternalMessage setCreateTime(Timestamp val) {
        this.set(FIELD_CREATE_TIME, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateTime() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_CREATE_TIME), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this.contains(FIELD_CREATE_TIME);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2InternalMessage setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this.get(FIELD_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「标题」
     * @param val
     */
    @JsonProperty(FIELD_TITLE)
    public V2InternalMessage setTitle(String val) {
        this.set(FIELD_TITLE, val);
        return this;
    }

    public V2InternalMessage setName(String val) {
        this.setTitle(val);
        return this;
    }

    /**
     * 获取「标题」值
     *
     */
    @JsonIgnore
    public String getTitle() {
        return DataTypeUtils.asString(this.get(FIELD_TITLE), null);
    }

    @JsonIgnore
    public String getName() {
        return getTitle();
    }

    /**
     * 判断 「标题」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTitle() {
        return this.contains(FIELD_TITLE);
    }

    /**
     * 重置 「标题」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetTitle() {
        this.reset(FIELD_TITLE);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2InternalMessage setUpdateMan(String val) {
        this.set(FIELD_UPDATE_MAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
     */
    @JsonIgnore
    public String getUpdateMan() {
        return DataTypeUtils.asString(this.get(FIELD_UPDATE_MAN), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this.contains(FIELD_UPDATE_MAN);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2InternalMessage setUpdateTime(Timestamp val) {
        this.set(FIELD_UPDATE_TIME, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getUpdateTime() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_UPDATE_TIME), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateTime() {
        return this.contains(FIELD_UPDATE_TIME);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「系统标记」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_TAG)
    public V2InternalMessage setSystemTag(String val) {
        this.set(FIELD_SYSTEM_TAG, val);
        return this;
    }

    /**
     * 获取「系统标记」值
     *
     */
    @JsonIgnore
    public String getSystemTag() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_TAG), null);
    }

    /**
     * 判断 「系统标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemTag() {
        return this.contains(FIELD_SYSTEM_TAG);
    }

    /**
     * 重置 「系统标记」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetSystemTag() {
        this.reset(FIELD_SYSTEM_TAG);
        return this;
    }

    
    /**
     * 设置「来源消息标识」
     * @param val
     */
    @JsonProperty(FIELD_FROM_ID)
    public V2InternalMessage setFromId(String val) {
        this.set(FIELD_FROM_ID, val);
        return this;
    }

    /**
     * 获取「来源消息标识」值
     *
     */
    @JsonIgnore
    public String getFromId() {
        return DataTypeUtils.asString(this.get(FIELD_FROM_ID), null);
    }

    /**
     * 判断 「来源消息标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFromId() {
        return this.contains(FIELD_FROM_ID);
    }

    /**
     * 重置 「来源消息标识」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetFromId() {
        this.reset(FIELD_FROM_ID);
        return this;
    }
    
    
    
    /**
     * 设置「所有者标识」
     * @param val
     */
    @JsonProperty(FIELD_OWNER_ID)
    public V2InternalMessage setOwnerId(String val) {
        this.set(FIELD_OWNER_ID, val);
        return this;
    }

    /**
     * 获取「所有者标识」值
     *
     */
    @JsonIgnore
    public String getOwnerId() {
        return DataTypeUtils.asString(this.get(FIELD_OWNER_ID), null);
    }

    /**
     * 判断 「所有者标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOwnerId() {
        return this.contains(FIELD_OWNER_ID);
    }

    /**
     * 重置 「所有者标识」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetOwnerId() {
        this.reset(FIELD_OWNER_ID);
        return this;
    }
    
    /**
     * 设置「所有者类型」
     * 代码表[内部消息所有者类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.internal_message_owner_type
     * @param val
     */
    @JsonProperty(FIELD_OWNER_TYPE)
    public V2InternalMessage setOwnerType(String val) {
        this.set(FIELD_OWNER_TYPE, val);
        return this;
    }

    /**
     * 获取「所有者类型」值
     * 代码表[内部消息所有者类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.internal_message_owner_type
     *
     */
    @JsonIgnore
    public String getOwnerType() {
        return DataTypeUtils.asString(this.get(FIELD_OWNER_TYPE), null);
    }

    /**
     * 判断 「所有者类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOwnerType() {
        return this.contains(FIELD_OWNER_TYPE);
    }

    /**
     * 重置 「所有者类型」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetOwnerType() {
        this.reset(FIELD_OWNER_TYPE);
        return this;
    }
    
    /**
     * 设置「URL」
     * @param val
     */
    @JsonProperty(FIELD_URL)
    public V2InternalMessage setUrl(String val) {
        this.set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「URL」值
     *
     */
    @JsonIgnore
    public String getUrl() {
        return DataTypeUtils.asString(this.get(FIELD_URL), null);
    }

    /**
     * 判断 「URL」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUrl() {
        return this.contains(FIELD_URL);
    }

    /**
     * 重置 「URL」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetUrl() {
        this.reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「移动端URL」
     * @param val
     */
    @JsonProperty(FIELD_MOBILE_URL)
    public V2InternalMessage setMobileUrl(String val) {
        this.set(FIELD_MOBILE_URL, val);
        return this;
    }

    /**
     * 获取「移动端URL」值
     *
     */
    @JsonIgnore
    public String getMobileUrl() {
        return DataTypeUtils.asString(this.get(FIELD_MOBILE_URL), null);
    }

    /**
     * 判断 「移动端URL」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMobileUrl() {
        return this.contains(FIELD_MOBILE_URL);
    }

    /**
     * 重置 「移动端URL」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetMobileUrl() {
        this.reset(FIELD_MOBILE_URL);
        return this;
    }

    
    /**
     * 设置「内容类型」
     * 代码表[内部消息内容类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.internal_message_content_type
     * @param val
     */
    @JsonProperty(FIELD_CONTENT_TYPE)
    public V2InternalMessage setContentType(String val) {
        this.set(FIELD_CONTENT_TYPE, val);
        return this;
    }

    /**
     * 获取「内容类型」值
     * 代码表[内部消息内容类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.internal_message_content_type
     *
     */
    @JsonIgnore
    public String getContentType() {
        return DataTypeUtils.asString(this.get(FIELD_CONTENT_TYPE), null);
    }

    /**
     * 判断 「内容类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContentType() {
        return this.contains(FIELD_CONTENT_TYPE);
    }

    /**
     * 重置 「内容类型」
     *
     */
    @JsonIgnore
    public V2InternalMessage resetContentType() {
        this.reset(FIELD_CONTENT_TYPE);
        return this;
    }
}
