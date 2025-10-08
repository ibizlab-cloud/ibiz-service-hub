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


public class MailLinkPreviewDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 图像哑剧类型
     */
    public final static String FIELD_IMAGE_MIMETYPE = "image_mimetype";

    /**
     * 属性: 已隐藏
     */
    public final static String FIELD_IS_HIDDEN = "is_hidden";

    /**
     * 属性: 消息
     */
    public final static String FIELD_MESSAGE_ID = "message_id";

    /**
     * 属性: 描述
     */
    public final static String FIELD_OG_DESCRIPTION = "og_description";

    /**
     * 属性: 图像
     */
    public final static String FIELD_OG_IMAGE = "og_image";

    /**
     * 属性: MIME 类型
     */
    public final static String FIELD_OG_MIMETYPE = "og_mimetype";

    /**
     * 属性: 网站名称
     */
    public final static String FIELD_OG_SITE_NAME = "og_site_name";

    /**
     * 属性: 标题
     */
    public final static String FIELD_OG_TITLE = "og_title";

    /**
     * 属性: 类型
     */
    public final static String FIELD_OG_TYPE = "og_type";

    /**
     * 属性: 网址
     */
    public final static String FIELD_SOURCE_URL = "source_url";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailLinkPreviewDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATE_DATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CREATE_DATE), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATE_DATE);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailLinkPreviewDTO setCreateUid(String val) {
        this._set(FIELD_CREATE_UID, val);
        return this;
    }

    /**
     * 获取「建立人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getCreateUid() {
        return DataTypeUtils.asString(this._get(FIELD_CREATE_UID), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateUid() {
        return this._contains(FIELD_CREATE_UID);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailLinkPreviewDTO setDisplayName(String val) {
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
    public MailLinkPreviewDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailLinkPreviewDTO setId(String val) {
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
    public MailLinkPreviewDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「图像哑剧类型」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE_MIMETYPE)
    public MailLinkPreviewDTO setImageMimetype(String val) {
        this._set(FIELD_IMAGE_MIMETYPE, val);
        return this;
    }

    /**
     * 获取「图像哑剧类型」值
     *
     */
    @JsonIgnore
    public String getImageMimetype() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE_MIMETYPE), null);
    }

    /**
     * 判断 「图像哑剧类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImageMimetype() {
        return this._contains(FIELD_IMAGE_MIMETYPE);
    }

    /**
     * 重置 「图像哑剧类型」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetImageMimetype() {
        this._reset(FIELD_IMAGE_MIMETYPE);
        return this;
    }

    /**
     * 设置「已隐藏」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_HIDDEN)
    public MailLinkPreviewDTO setIsHidden(Integer val) {
        this._set(FIELD_IS_HIDDEN, val);
        return this;
    }

    /**
     * 获取「已隐藏」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsHidden() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_HIDDEN), null);
    }

    /**
     * 判断 「已隐藏」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsHidden() {
        return this._contains(FIELD_IS_HIDDEN);
    }

    /**
     * 重置 「已隐藏」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetIsHidden() {
        this._reset(FIELD_IS_HIDDEN);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ID)
    public MailLinkPreviewDTO setMessageId(String val) {
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
    public MailLinkPreviewDTO resetMessageId() {
        this._reset(FIELD_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_OG_DESCRIPTION)
    public MailLinkPreviewDTO setOgDescription(String val) {
        this._set(FIELD_OG_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「描述」值
     *
     */
    @JsonIgnore
    public String getOgDescription() {
        return DataTypeUtils.asString(this._get(FIELD_OG_DESCRIPTION), null);
    }

    /**
     * 判断 「描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOgDescription() {
        return this._contains(FIELD_OG_DESCRIPTION);
    }

    /**
     * 重置 「描述」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetOgDescription() {
        this._reset(FIELD_OG_DESCRIPTION);
        return this;
    }

    /**
     * 设置「图像」
     * @param val
     */
    @JsonProperty(FIELD_OG_IMAGE)
    public MailLinkPreviewDTO setOgImage(String val) {
        this._set(FIELD_OG_IMAGE, val);
        return this;
    }

    /**
     * 获取「图像」值
     *
     */
    @JsonIgnore
    public String getOgImage() {
        return DataTypeUtils.asString(this._get(FIELD_OG_IMAGE), null);
    }

    /**
     * 判断 「图像」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOgImage() {
        return this._contains(FIELD_OG_IMAGE);
    }

    /**
     * 重置 「图像」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetOgImage() {
        this._reset(FIELD_OG_IMAGE);
        return this;
    }

    /**
     * 设置「MIME 类型」
     * @param val
     */
    @JsonProperty(FIELD_OG_MIMETYPE)
    public MailLinkPreviewDTO setOgMimetype(String val) {
        this._set(FIELD_OG_MIMETYPE, val);
        return this;
    }

    /**
     * 获取「MIME 类型」值
     *
     */
    @JsonIgnore
    public String getOgMimetype() {
        return DataTypeUtils.asString(this._get(FIELD_OG_MIMETYPE), null);
    }

    /**
     * 判断 「MIME 类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOgMimetype() {
        return this._contains(FIELD_OG_MIMETYPE);
    }

    /**
     * 重置 「MIME 类型」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetOgMimetype() {
        this._reset(FIELD_OG_MIMETYPE);
        return this;
    }

    /**
     * 设置「网站名称」
     * @param val
     */
    @JsonProperty(FIELD_OG_SITE_NAME)
    public MailLinkPreviewDTO setOgSiteName(String val) {
        this._set(FIELD_OG_SITE_NAME, val);
        return this;
    }

    /**
     * 获取「网站名称」值
     *
     */
    @JsonIgnore
    public String getOgSiteName() {
        return DataTypeUtils.asString(this._get(FIELD_OG_SITE_NAME), null);
    }

    /**
     * 判断 「网站名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOgSiteName() {
        return this._contains(FIELD_OG_SITE_NAME);
    }

    /**
     * 重置 「网站名称」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetOgSiteName() {
        this._reset(FIELD_OG_SITE_NAME);
        return this;
    }

    /**
     * 设置「标题」
     * @param val
     */
    @JsonProperty(FIELD_OG_TITLE)
    public MailLinkPreviewDTO setOgTitle(String val) {
        this._set(FIELD_OG_TITLE, val);
        return this;
    }

    /**
     * 获取「标题」值
     *
     */
    @JsonIgnore
    public String getOgTitle() {
        return DataTypeUtils.asString(this._get(FIELD_OG_TITLE), null);
    }

    /**
     * 判断 「标题」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOgTitle() {
        return this._contains(FIELD_OG_TITLE);
    }

    /**
     * 重置 「标题」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetOgTitle() {
        this._reset(FIELD_OG_TITLE);
        return this;
    }

    /**
     * 设置「类型」
     * @param val
     */
    @JsonProperty(FIELD_OG_TYPE)
    public MailLinkPreviewDTO setOgType(String val) {
        this._set(FIELD_OG_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     *
     */
    @JsonIgnore
    public String getOgType() {
        return DataTypeUtils.asString(this._get(FIELD_OG_TYPE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOgType() {
        return this._contains(FIELD_OG_TYPE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetOgType() {
        this._reset(FIELD_OG_TYPE);
        return this;
    }

    /**
     * 设置「网址」
     * @param val
     */
    @JsonProperty(FIELD_SOURCE_URL)
    public MailLinkPreviewDTO setSourceUrl(String val) {
        this._set(FIELD_SOURCE_URL, val);
        return this;
    }

    /**
     * 获取「网址」值
     *
     */
    @JsonIgnore
    public String getSourceUrl() {
        return DataTypeUtils.asString(this._get(FIELD_SOURCE_URL), null);
    }

    /**
     * 判断 「网址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSourceUrl() {
        return this._contains(FIELD_SOURCE_URL);
    }

    /**
     * 重置 「网址」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetSourceUrl() {
        this._reset(FIELD_SOURCE_URL);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailLinkPreviewDTO setWriteDate(Timestamp val) {
        this._set(FIELD_WRITE_DATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getWriteDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_WRITE_DATE), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteDate() {
        return this._contains(FIELD_WRITE_DATE);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailLinkPreviewDTO setWriteUid(String val) {
        this._set(FIELD_WRITE_UID, val);
        return this;
    }

    /**
     * 获取「更新人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getWriteUid() {
        return DataTypeUtils.asString(this._get(FIELD_WRITE_UID), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteUid() {
        return this._contains(FIELD_WRITE_UID);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public MailLinkPreviewDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
