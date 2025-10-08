package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class MailMessageReactionDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 内容
     */
    public final static String FIELD_CONTENT = "content";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 反应的访客
     */
    public final static String FIELD_GUEST_ID = "guest_id";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 消息
     */
    public final static String FIELD_MESSAGE_ID = "message_id";

    /**
     * 属性: 反应的伙伴
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 设置「内容」
     * @param val
     */
    @JsonProperty(FIELD_CONTENT)
    public MailMessageReactionDTO setContent(String val) {
        this._set(FIELD_CONTENT, val);
        return this;
    }

    /**
     * 获取「内容」值
     *
     */
    @JsonIgnore
    public String getContent() {
        return DataTypeUtils.asString(this._get(FIELD_CONTENT), null);
    }

    /**
     * 判断 「内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContent() {
        return this._contains(FIELD_CONTENT);
    }

    /**
     * 重置 「内容」
     *
     */
    @JsonIgnore
    public MailMessageReactionDTO resetContent() {
        this._reset(FIELD_CONTENT);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailMessageReactionDTO setDisplayName(String val) {
        this._set(FIELD_DISPLAY_NAME, val);
        return this;
    }

    /**
     * 获取「显示名称」值
     *
     */
    @JsonIgnore
    public String getDisplayName() {
        return DataTypeUtils.asString(this._get(FIELD_DISPLAY_NAME), null);
    }

    /**
     * 判断 「显示名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this._contains(FIELD_DISPLAY_NAME);
    }

    /**
     * 重置 「显示名称」
     *
     */
    @JsonIgnore
    public MailMessageReactionDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「反应的访客」
     * @param val
     */
    @JsonProperty(FIELD_GUEST_ID)
    public MailMessageReactionDTO setGuestId(String val) {
        this._set(FIELD_GUEST_ID, val);
        return this;
    }

    /**
     * 获取「反应的访客」值
     *
     */
    @JsonIgnore
    public String getGuestId() {
        return DataTypeUtils.asString(this._get(FIELD_GUEST_ID), null);
    }

    /**
     * 判断 「反应的访客」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGuestId() {
        return this._contains(FIELD_GUEST_ID);
    }

    /**
     * 重置 「反应的访客」
     *
     */
    @JsonIgnore
    public MailMessageReactionDTO resetGuestId() {
        this._reset(FIELD_GUEST_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailMessageReactionDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public MailMessageReactionDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ID)
    public MailMessageReactionDTO setMessageId(String val) {
        this._set(FIELD_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「消息」值
     *
     */
    @JsonIgnore
    public String getMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_MESSAGE_ID), null);
    }

    /**
     * 判断 「消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageId() {
        return this._contains(FIELD_MESSAGE_ID);
    }

    /**
     * 重置 「消息」
     *
     */
    @JsonIgnore
    public MailMessageReactionDTO resetMessageId() {
        this._reset(FIELD_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「反应的伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public MailMessageReactionDTO setPartnerId(String val) {
        this._set(FIELD_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「反应的伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_ID), null);
    }

    /**
     * 判断 「反应的伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerId() {
        return this._contains(FIELD_PARTNER_ID);
    }

    /**
     * 重置 「反应的伙伴」
     *
     */
    @JsonIgnore
    public MailMessageReactionDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

}
