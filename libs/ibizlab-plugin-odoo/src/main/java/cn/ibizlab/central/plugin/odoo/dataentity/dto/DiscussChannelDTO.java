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


public class DiscussChannelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 附件集合
     */
    public final static String FIELD_ATTACHMENTS = "attachments";

    /**
     * 属性: 关注者
     */
    public final static String FIELD_FOLLOWERS = "followers";

    /**
     * 属性: 成员
     */
    public final static String FIELD_MEMBERS = "members";

    /**
     * 属性: 频道成员
     */
    public final static String FIELD_CHANNEL_MEMBERS = "channel_members";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 允许公开上传
     */
    public final static String FIELD_ALLOW_PUBLIC_UPLOAD = "allow_public_upload";

    /**
     * 属性: 头像缓存键
     */
    public final static String FIELD_AVATAR_CACHE_KEY = "avatar_cache_key";

    /**
     * 属性: 频道类型
     */
    public final static String FIELD_CHANNEL_TYPE = "channel_type";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 默认显示模式
     */
    public final static String FIELD_DEFAULT_DISPLAY_MODE = "default_display_mode";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 来自消息
     */
    public final static String FIELD_FROM_MESSAGE_ID = "from_message_id";

    /**
     * 属性: 授权群组
     */
    public final static String FIELD_GROUP_PUBLIC_ID = "group_public_id";

    /**
     * 属性: 授权群组
     */
    public final static String FIELD_GROUP_PUBLIC_NAME = "group_public_name";

    /**
     * 属性: 有消息
     */
    public final static String FIELD_HAS_MESSAGE = "has_message";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 邀请URL
     */
    public final static String FIELD_INVITATION_URL = "invitation_url";

    /**
     * 属性: 能编辑
     */
    public final static String FIELD_IS_EDITABLE = "is_editable";

    /**
     * 属性: 是会员
     */
    public final static String FIELD_IS_MEMBER = "is_member";

    /**
     * 属性: 持续的兴趣
     */
    public final static String FIELD_LAST_INTEREST_DT = "last_interest_dt";

    /**
     * 属性: 成员计数
     */
    public final static String FIELD_MEMBER_COUNT = "member_count";

    /**
     * 属性: 附件数量
     */
    public final static String FIELD_MESSAGE_ATTACHMENT_COUNT = "message_attachment_count";

    /**
     * 属性: 消息发送错误
     */
    public final static String FIELD_MESSAGE_HAS_ERROR = "message_has_error";

    /**
     * 属性: 错误数量
     */
    public final static String FIELD_MESSAGE_HAS_ERROR_COUNTER = "message_has_error_counter";

    /**
     * 属性: 短信发送错误
     */
    public final static String FIELD_MESSAGE_HAS_SMS_ERROR = "message_has_sms_error";

    /**
     * 属性: 是关注者
     */
    public final static String FIELD_MESSAGE_IS_FOLLOWER = "message_is_follower";

    /**
     * 属性: 待处理
     */
    public final static String FIELD_MESSAGE_NEEDACTION = "message_needaction";

    /**
     * 属性: 操作数量
     */
    public final static String FIELD_MESSAGE_NEEDACTION_COUNTER = "message_needaction_counter";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 父频道
     */
    public final static String FIELD_PARENT_CHANNEL_ID = "parent_channel_id";

    /**
     * 属性: 父频道名称
     */
    public final static String FIELD_PARENT_CHANNEL_NAME = "parent_channel_name";

    /**
     * 属性: Sfu 频道 Uuid
     */
    public final static String FIELD_SFU_CHANNEL_UUID = "sfu_channel_uuid";

    /**
     * 属性: Sfu 服务器网址
     */
    public final static String FIELD_SFU_SERVER_URL = "sfu_server_url";

    /**
     * 属性: UUID
     */
    public final static String FIELD_UUID = "uuid";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「附件集合」
     * @param val
     */
    @JsonProperty(FIELD_ATTACHMENTS)
    public DiscussChannelDTO setAttachments(List<IrAttachmentDTO> val) {
        this._set(FIELD_ATTACHMENTS, val);
        return this;
    }

    /**
     * 获取「附件集合」值
     *
     */
    @JsonIgnore
    public List<IrAttachmentDTO> getAttachments() {
        return (List<IrAttachmentDTO>) this._get(FIELD_ATTACHMENTS);
    }

    /**
     * 判断 「附件集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttachments() {
        return this._contains(FIELD_ATTACHMENTS);
    }

    /**
     * 重置 「附件集合」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetAttachments() {
        this._reset(FIELD_ATTACHMENTS);
        return this;
    }

    /**
     * 设置「关注者」
     * @param val
     */
    @JsonProperty(FIELD_FOLLOWERS)
    public DiscussChannelDTO setFollowers(List<MailFollowersDTO> val) {
        this._set(FIELD_FOLLOWERS, val);
        return this;
    }

    /**
     * 获取「关注者」值
     *
     */
    @JsonIgnore
    public List<MailFollowersDTO> getFollowers() {
        return (List<MailFollowersDTO>) this._get(FIELD_FOLLOWERS);
    }

    /**
     * 判断 「关注者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFollowers() {
        return this._contains(FIELD_FOLLOWERS);
    }

    /**
     * 重置 「关注者」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetFollowers() {
        this._reset(FIELD_FOLLOWERS);
        return this;
    }

    /**
     * 设置「成员」
     * @param val
     */
    @JsonProperty(FIELD_MEMBERS)
    public DiscussChannelDTO setMembers(String val) {
        this._set(FIELD_MEMBERS, val);
        return this;
    }

    /**
     * 获取「成员」值
     *
     */
    @JsonIgnore
    public String getMembers() {
        return DataTypeUtils.asString(this._get(FIELD_MEMBERS), null);
    }

    /**
     * 判断 「成员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMembers() {
        return this._contains(FIELD_MEMBERS);
    }

    /**
     * 重置 「成员」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMembers() {
        this._reset(FIELD_MEMBERS);
        return this;
    }

    /**
     * 设置「频道成员」
     * @param val
     */
    @JsonProperty(FIELD_CHANNEL_MEMBERS)
    public DiscussChannelDTO setChannelMembers(List<DiscussChannelMemberDTO> val) {
        this._set(FIELD_CHANNEL_MEMBERS, val);
        return this;
    }

    /**
     * 获取「频道成员」值
     *
     */
    @JsonIgnore
    public List<DiscussChannelMemberDTO> getChannelMembers() {
        return (List<DiscussChannelMemberDTO>) this._get(FIELD_CHANNEL_MEMBERS);
    }

    /**
     * 判断 「频道成员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChannelMembers() {
        return this._contains(FIELD_CHANNEL_MEMBERS);
    }

    /**
     * 重置 「频道成员」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetChannelMembers() {
        this._reset(FIELD_CHANNEL_MEMBERS);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public DiscussChannelDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「有效」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「有效」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「有效」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「允许公开上传」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ALLOW_PUBLIC_UPLOAD)
    public DiscussChannelDTO setAllowPublicUpload(Integer val) {
        this._set(FIELD_ALLOW_PUBLIC_UPLOAD, val);
        return this;
    }

    /**
     * 获取「允许公开上传」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAllowPublicUpload() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALLOW_PUBLIC_UPLOAD), null);
    }

    /**
     * 判断 「允许公开上传」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllowPublicUpload() {
        return this._contains(FIELD_ALLOW_PUBLIC_UPLOAD);
    }

    /**
     * 重置 「允许公开上传」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetAllowPublicUpload() {
        this._reset(FIELD_ALLOW_PUBLIC_UPLOAD);
        return this;
    }

    /**
     * 设置「头像缓存键」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR_CACHE_KEY)
    public DiscussChannelDTO setAvatarCacheKey(String val) {
        this._set(FIELD_AVATAR_CACHE_KEY, val);
        return this;
    }

    /**
     * 获取「头像缓存键」值
     *
     */
    @JsonIgnore
    public String getAvatarCacheKey() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR_CACHE_KEY), null);
    }

    /**
     * 判断 「头像缓存键」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatarCacheKey() {
        return this._contains(FIELD_AVATAR_CACHE_KEY);
    }

    /**
     * 重置 「头像缓存键」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetAvatarCacheKey() {
        this._reset(FIELD_AVATAR_CACHE_KEY);
        return this;
    }

    /**
     * 设置「频道类型」
     * 代码表[频道类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_channel_type
     * @param val
     */
    @JsonProperty(FIELD_CHANNEL_TYPE)
    public DiscussChannelDTO setChannelType(String val) {
        this._set(FIELD_CHANNEL_TYPE, val);
        return this;
    }

    /**
     * 获取「频道类型」值
     * 代码表[频道类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_channel_type
     *
     */
    @JsonIgnore
    public String getChannelType() {
        return DataTypeUtils.asString(this._get(FIELD_CHANNEL_TYPE), null);
    }

    /**
     * 判断 「频道类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChannelType() {
        return this._contains(FIELD_CHANNEL_TYPE);
    }

    /**
     * 重置 「频道类型」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetChannelType() {
        this._reset(FIELD_CHANNEL_TYPE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public DiscussChannelDTO setCreateDate(Timestamp val) {
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
    public DiscussChannelDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public DiscussChannelDTO setCreateUid(String val) {
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
    public DiscussChannelDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「默认显示模式」
     * 代码表[默认显示模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_default_display_mode
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_DISPLAY_MODE)
    public DiscussChannelDTO setDefaultDisplayMode(String val) {
        this._set(FIELD_DEFAULT_DISPLAY_MODE, val);
        return this;
    }

    /**
     * 获取「默认显示模式」值
     * 代码表[默认显示模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.discuss_channel_default_display_mode
     *
     */
    @JsonIgnore
    public String getDefaultDisplayMode() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_DISPLAY_MODE), null);
    }

    /**
     * 判断 「默认显示模式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultDisplayMode() {
        return this._contains(FIELD_DEFAULT_DISPLAY_MODE);
    }

    /**
     * 重置 「默认显示模式」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetDefaultDisplayMode() {
        this._reset(FIELD_DEFAULT_DISPLAY_MODE);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public DiscussChannelDTO setDescription(String val) {
        this._set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「描述」值
     *
     */
    @JsonIgnore
    public String getDescription() {
        return DataTypeUtils.asString(this._get(FIELD_DESCRIPTION), null);
    }

    /**
     * 判断 「描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDescription() {
        return this._contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「描述」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public DiscussChannelDTO setDisplayName(String val) {
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
    public DiscussChannelDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「来自消息」
     * @param val
     */
    @JsonProperty(FIELD_FROM_MESSAGE_ID)
    public DiscussChannelDTO setFromMessageId(String val) {
        this._set(FIELD_FROM_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「来自消息」值
     *
     */
    @JsonIgnore
    public String getFromMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_FROM_MESSAGE_ID), null);
    }

    /**
     * 判断 「来自消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFromMessageId() {
        return this._contains(FIELD_FROM_MESSAGE_ID);
    }

    /**
     * 重置 「来自消息」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetFromMessageId() {
        this._reset(FIELD_FROM_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「授权群组」
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PUBLIC_ID)
    public DiscussChannelDTO setGroupPublicId(String val) {
        this._set(FIELD_GROUP_PUBLIC_ID, val);
        return this;
    }

    /**
     * 获取「授权群组」值
     *
     */
    @JsonIgnore
    public String getGroupPublicId() {
        return DataTypeUtils.asString(this._get(FIELD_GROUP_PUBLIC_ID), null);
    }

    /**
     * 判断 「授权群组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupPublicId() {
        return this._contains(FIELD_GROUP_PUBLIC_ID);
    }

    /**
     * 重置 「授权群组」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetGroupPublicId() {
        this._reset(FIELD_GROUP_PUBLIC_ID);
        return this;
    }

    /**
     * 设置「授权群组」
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PUBLIC_NAME)
    public DiscussChannelDTO setGroupPublicName(String val) {
        this._set(FIELD_GROUP_PUBLIC_NAME, val);
        return this;
    }

    /**
     * 获取「授权群组」值
     *
     */
    @JsonIgnore
    public String getGroupPublicName() {
        return DataTypeUtils.asString(this._get(FIELD_GROUP_PUBLIC_NAME), null);
    }

    /**
     * 判断 「授权群组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupPublicName() {
        return this._contains(FIELD_GROUP_PUBLIC_NAME);
    }

    /**
     * 重置 「授权群组」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetGroupPublicName() {
        this._reset(FIELD_GROUP_PUBLIC_NAME);
        return this;
    }

    /**
     * 设置「有消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MESSAGE)
    public DiscussChannelDTO setHasMessage(Integer val) {
        this._set(FIELD_HAS_MESSAGE, val);
        return this;
    }

    /**
     * 获取「有消息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasMessage() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_MESSAGE), null);
    }

    /**
     * 判断 「有消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasMessage() {
        return this._contains(FIELD_HAS_MESSAGE);
    }

    /**
     * 重置 「有消息」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetHasMessage() {
        this._reset(FIELD_HAS_MESSAGE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public DiscussChannelDTO setId(String val) {
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
    public DiscussChannelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「邀请URL」
     * @param val
     */
    @JsonProperty(FIELD_INVITATION_URL)
    public DiscussChannelDTO setInvitationUrl(String val) {
        this._set(FIELD_INVITATION_URL, val);
        return this;
    }

    /**
     * 获取「邀请URL」值
     *
     */
    @JsonIgnore
    public String getInvitationUrl() {
        return DataTypeUtils.asString(this._get(FIELD_INVITATION_URL), null);
    }

    /**
     * 判断 「邀请URL」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvitationUrl() {
        return this._contains(FIELD_INVITATION_URL);
    }

    /**
     * 重置 「邀请URL」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetInvitationUrl() {
        this._reset(FIELD_INVITATION_URL);
        return this;
    }

    /**
     * 设置「能编辑」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_EDITABLE)
    public DiscussChannelDTO setIsEditable(Integer val) {
        this._set(FIELD_IS_EDITABLE, val);
        return this;
    }

    /**
     * 获取「能编辑」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsEditable() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_EDITABLE), null);
    }

    /**
     * 判断 「能编辑」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsEditable() {
        return this._contains(FIELD_IS_EDITABLE);
    }

    /**
     * 重置 「能编辑」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetIsEditable() {
        this._reset(FIELD_IS_EDITABLE);
        return this;
    }

    /**
     * 设置「是会员」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MEMBER)
    public DiscussChannelDTO setIsMember(Integer val) {
        this._set(FIELD_IS_MEMBER, val);
        return this;
    }

    /**
     * 获取「是会员」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMember() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MEMBER), null);
    }

    /**
     * 判断 「是会员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMember() {
        return this._contains(FIELD_IS_MEMBER);
    }

    /**
     * 重置 「是会员」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetIsMember() {
        this._reset(FIELD_IS_MEMBER);
        return this;
    }

    /**
     * 设置「持续的兴趣」
     * @param val
     */
    @JsonProperty(FIELD_LAST_INTEREST_DT)
    public DiscussChannelDTO setLastInterestDt(Timestamp val) {
        this._set(FIELD_LAST_INTEREST_DT, val);
        return this;
    }

    /**
     * 获取「持续的兴趣」值
     *
     */
    @JsonIgnore
    public Timestamp getLastInterestDt() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LAST_INTEREST_DT), null);
    }

    /**
     * 判断 「持续的兴趣」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastInterestDt() {
        return this._contains(FIELD_LAST_INTEREST_DT);
    }

    /**
     * 重置 「持续的兴趣」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetLastInterestDt() {
        this._reset(FIELD_LAST_INTEREST_DT);
        return this;
    }

    /**
     * 设置「成员计数」
     * @param val
     */
    @JsonProperty(FIELD_MEMBER_COUNT)
    public DiscussChannelDTO setMemberCount(Integer val) {
        this._set(FIELD_MEMBER_COUNT, val);
        return this;
    }

    /**
     * 获取「成员计数」值
     *
     */
    @JsonIgnore
    public Integer getMemberCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MEMBER_COUNT), null);
    }

    /**
     * 判断 「成员计数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMemberCount() {
        return this._contains(FIELD_MEMBER_COUNT);
    }

    /**
     * 重置 「成员计数」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMemberCount() {
        this._reset(FIELD_MEMBER_COUNT);
        return this;
    }

    /**
     * 设置「附件数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public DiscussChannelDTO setMessageAttachmentCount(Integer val) {
        this._set(FIELD_MESSAGE_ATTACHMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「附件数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageAttachmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_ATTACHMENT_COUNT), null);
    }

    /**
     * 判断 「附件数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageAttachmentCount() {
        return this._contains(FIELD_MESSAGE_ATTACHMENT_COUNT);
    }

    /**
     * 重置 「附件数量」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMessageAttachmentCount() {
        this._reset(FIELD_MESSAGE_ATTACHMENT_COUNT);
        return this;
    }

    /**
     * 设置「消息发送错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR)
    public DiscussChannelDTO setMessageHasError(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR, val);
        return this;
    }

    /**
     * 获取「消息发送错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageHasError() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR), null);
    }

    /**
     * 判断 「消息发送错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasError() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR);
    }

    /**
     * 重置 「消息发送错误」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMessageHasError() {
        this._reset(FIELD_MESSAGE_HAS_ERROR);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public DiscussChannelDTO setMessageHasErrorCounter(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR_COUNTER, val);
        return this;
    }

    /**
     * 获取「错误数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageHasErrorCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR_COUNTER), null);
    }

    /**
     * 判断 「错误数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasErrorCounter() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR_COUNTER);
    }

    /**
     * 重置 「错误数量」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMessageHasErrorCounter() {
        this._reset(FIELD_MESSAGE_HAS_ERROR_COUNTER);
        return this;
    }

    /**
     * 设置「短信发送错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_SMS_ERROR)
    public DiscussChannelDTO setMessageHasSmsError(Integer val) {
        this._set(FIELD_MESSAGE_HAS_SMS_ERROR, val);
        return this;
    }

    /**
     * 获取「短信发送错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageHasSmsError() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_SMS_ERROR), null);
    }

    /**
     * 判断 「短信发送错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasSmsError() {
        return this._contains(FIELD_MESSAGE_HAS_SMS_ERROR);
    }

    /**
     * 重置 「短信发送错误」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMessageHasSmsError() {
        this._reset(FIELD_MESSAGE_HAS_SMS_ERROR);
        return this;
    }

    /**
     * 设置「是关注者」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_IS_FOLLOWER)
    public DiscussChannelDTO setMessageIsFollower(Integer val) {
        this._set(FIELD_MESSAGE_IS_FOLLOWER, val);
        return this;
    }

    /**
     * 获取「是关注者」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageIsFollower() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_IS_FOLLOWER), null);
    }

    /**
     * 判断 「是关注者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageIsFollower() {
        return this._contains(FIELD_MESSAGE_IS_FOLLOWER);
    }

    /**
     * 重置 「是关注者」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMessageIsFollower() {
        this._reset(FIELD_MESSAGE_IS_FOLLOWER);
        return this;
    }

    /**
     * 设置「待处理」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION)
    public DiscussChannelDTO setMessageNeedaction(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION, val);
        return this;
    }

    /**
     * 获取「待处理」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageNeedaction() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION), null);
    }

    /**
     * 判断 「待处理」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedaction() {
        return this._contains(FIELD_MESSAGE_NEEDACTION);
    }

    /**
     * 重置 「待处理」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMessageNeedaction() {
        this._reset(FIELD_MESSAGE_NEEDACTION);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public DiscussChannelDTO setMessageNeedactionCounter(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION_COUNTER, val);
        return this;
    }

    /**
     * 获取「操作数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageNeedactionCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION_COUNTER), null);
    }

    /**
     * 判断 「操作数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedactionCounter() {
        return this._contains(FIELD_MESSAGE_NEEDACTION_COUNTER);
    }

    /**
     * 重置 「操作数量」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public DiscussChannelDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「父频道」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_CHANNEL_ID)
    public DiscussChannelDTO setParentChannelId(String val) {
        this._set(FIELD_PARENT_CHANNEL_ID, val);
        return this;
    }

    /**
     * 获取「父频道」值
     *
     */
    @JsonIgnore
    public String getParentChannelId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_CHANNEL_ID), null);
    }

    /**
     * 判断 「父频道」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentChannelId() {
        return this._contains(FIELD_PARENT_CHANNEL_ID);
    }

    /**
     * 重置 「父频道」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetParentChannelId() {
        this._reset(FIELD_PARENT_CHANNEL_ID);
        return this;
    }

    /**
     * 设置「父频道名称」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_CHANNEL_NAME)
    public DiscussChannelDTO setParentChannelName(String val) {
        this._set(FIELD_PARENT_CHANNEL_NAME, val);
        return this;
    }

    /**
     * 获取「父频道名称」值
     *
     */
    @JsonIgnore
    public String getParentChannelName() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_CHANNEL_NAME), null);
    }

    /**
     * 判断 「父频道名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentChannelName() {
        return this._contains(FIELD_PARENT_CHANNEL_NAME);
    }

    /**
     * 重置 「父频道名称」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetParentChannelName() {
        this._reset(FIELD_PARENT_CHANNEL_NAME);
        return this;
    }

    /**
     * 设置「Sfu 频道 Uuid」
     * @param val
     */
    @JsonProperty(FIELD_SFU_CHANNEL_UUID)
    public DiscussChannelDTO setSfuChannelUuid(String val) {
        this._set(FIELD_SFU_CHANNEL_UUID, val);
        return this;
    }

    /**
     * 获取「Sfu 频道 Uuid」值
     *
     */
    @JsonIgnore
    public String getSfuChannelUuid() {
        return DataTypeUtils.asString(this._get(FIELD_SFU_CHANNEL_UUID), null);
    }

    /**
     * 判断 「Sfu 频道 Uuid」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSfuChannelUuid() {
        return this._contains(FIELD_SFU_CHANNEL_UUID);
    }

    /**
     * 重置 「Sfu 频道 Uuid」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetSfuChannelUuid() {
        this._reset(FIELD_SFU_CHANNEL_UUID);
        return this;
    }

    /**
     * 设置「Sfu 服务器网址」
     * @param val
     */
    @JsonProperty(FIELD_SFU_SERVER_URL)
    public DiscussChannelDTO setSfuServerUrl(String val) {
        this._set(FIELD_SFU_SERVER_URL, val);
        return this;
    }

    /**
     * 获取「Sfu 服务器网址」值
     *
     */
    @JsonIgnore
    public String getSfuServerUrl() {
        return DataTypeUtils.asString(this._get(FIELD_SFU_SERVER_URL), null);
    }

    /**
     * 判断 「Sfu 服务器网址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSfuServerUrl() {
        return this._contains(FIELD_SFU_SERVER_URL);
    }

    /**
     * 重置 「Sfu 服务器网址」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetSfuServerUrl() {
        this._reset(FIELD_SFU_SERVER_URL);
        return this;
    }

    /**
     * 设置「UUID」
     * @param val
     */
    @JsonProperty(FIELD_UUID)
    public DiscussChannelDTO setUuid(String val) {
        this._set(FIELD_UUID, val);
        return this;
    }

    /**
     * 获取「UUID」值
     *
     */
    @JsonIgnore
    public String getUuid() {
        return DataTypeUtils.asString(this._get(FIELD_UUID), null);
    }

    /**
     * 判断 「UUID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUuid() {
        return this._contains(FIELD_UUID);
    }

    /**
     * 重置 「UUID」
     *
     */
    @JsonIgnore
    public DiscussChannelDTO resetUuid() {
        this._reset(FIELD_UUID);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public DiscussChannelDTO setWriteDate(Timestamp val) {
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
    public DiscussChannelDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public DiscussChannelDTO setWriteUid(String val) {
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
    public DiscussChannelDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
