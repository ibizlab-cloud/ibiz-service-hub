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


public class AvatarMixinDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 头像128
     */
    public final static String FIELD_AVATAR128 = "avatar128";

    /**
     * 属性: 图片128
     */
    public final static String FIELD_IMAGE128 = "image128";

    /**
     * 属性: 头像512
     */
    public final static String FIELD_AVATAR512 = "avatar512";

    /**
     * 属性: 图片512
     */
    public final static String FIELD_IMAGE512 = "image512";

    /**
     * 属性: 头像256
     */
    public final static String FIELD_AVATAR256 = "avatar256";

    /**
     * 属性: 图片256
     */
    public final static String FIELD_IMAGE256 = "image256";

    /**
     * 属性: 头像1024
     */
    public final static String FIELD_AVATAR1024 = "avatar1024";

    /**
     * 属性: 图片1024
     */
    public final static String FIELD_IMAGE1024 = "image1024";

    /**
     * 属性: 头像
     */
    public final static String FIELD_AVATAR = "avatar";

    /**
     * 属性: 头像
     */
    public final static String FIELD_IMAGE = "image";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public AvatarMixinDTO setId(String val) {
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
    public AvatarMixinDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public AvatarMixinDTO setName(String val) {
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
    public AvatarMixinDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「头像128」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR128)
    public AvatarMixinDTO setAvatar128(String val) {
        this._set(FIELD_AVATAR128, val);
        return this;
    }

    /**
     * 获取「头像128」值
     *
     */
    @JsonIgnore
    public String getAvatar128() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR128), null);
    }

    /**
     * 判断 「头像128」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar128() {
        return this._contains(FIELD_AVATAR128);
    }

    /**
     * 重置 「头像128」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetAvatar128() {
        this._reset(FIELD_AVATAR128);
        return this;
    }

    /**
     * 设置「图片128」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE128)
    public AvatarMixinDTO setImage128(String val) {
        this._set(FIELD_IMAGE128, val);
        return this;
    }

    /**
     * 获取「图片128」值
     *
     */
    @JsonIgnore
    public String getImage128() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE128), null);
    }

    /**
     * 判断 「图片128」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage128() {
        return this._contains(FIELD_IMAGE128);
    }

    /**
     * 重置 「图片128」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetImage128() {
        this._reset(FIELD_IMAGE128);
        return this;
    }

    /**
     * 设置「头像512」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR512)
    public AvatarMixinDTO setAvatar512(String val) {
        this._set(FIELD_AVATAR512, val);
        return this;
    }

    /**
     * 获取「头像512」值
     *
     */
    @JsonIgnore
    public String getAvatar512() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR512), null);
    }

    /**
     * 判断 「头像512」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar512() {
        return this._contains(FIELD_AVATAR512);
    }

    /**
     * 重置 「头像512」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetAvatar512() {
        this._reset(FIELD_AVATAR512);
        return this;
    }

    /**
     * 设置「图片512」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE512)
    public AvatarMixinDTO setImage512(String val) {
        this._set(FIELD_IMAGE512, val);
        return this;
    }

    /**
     * 获取「图片512」值
     *
     */
    @JsonIgnore
    public String getImage512() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE512), null);
    }

    /**
     * 判断 「图片512」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage512() {
        return this._contains(FIELD_IMAGE512);
    }

    /**
     * 重置 「图片512」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetImage512() {
        this._reset(FIELD_IMAGE512);
        return this;
    }

    /**
     * 设置「头像256」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR256)
    public AvatarMixinDTO setAvatar256(String val) {
        this._set(FIELD_AVATAR256, val);
        return this;
    }

    /**
     * 获取「头像256」值
     *
     */
    @JsonIgnore
    public String getAvatar256() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR256), null);
    }

    /**
     * 判断 「头像256」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar256() {
        return this._contains(FIELD_AVATAR256);
    }

    /**
     * 重置 「头像256」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetAvatar256() {
        this._reset(FIELD_AVATAR256);
        return this;
    }

    /**
     * 设置「图片256」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE256)
    public AvatarMixinDTO setImage256(String val) {
        this._set(FIELD_IMAGE256, val);
        return this;
    }

    /**
     * 获取「图片256」值
     *
     */
    @JsonIgnore
    public String getImage256() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE256), null);
    }

    /**
     * 判断 「图片256」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage256() {
        return this._contains(FIELD_IMAGE256);
    }

    /**
     * 重置 「图片256」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetImage256() {
        this._reset(FIELD_IMAGE256);
        return this;
    }

    /**
     * 设置「头像1024」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR1024)
    public AvatarMixinDTO setAvatar1024(String val) {
        this._set(FIELD_AVATAR1024, val);
        return this;
    }

    /**
     * 获取「头像1024」值
     *
     */
    @JsonIgnore
    public String getAvatar1024() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR1024), null);
    }

    /**
     * 判断 「头像1024」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar1024() {
        return this._contains(FIELD_AVATAR1024);
    }

    /**
     * 重置 「头像1024」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetAvatar1024() {
        this._reset(FIELD_AVATAR1024);
        return this;
    }

    /**
     * 设置「图片1024」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE1024)
    public AvatarMixinDTO setImage1024(String val) {
        this._set(FIELD_IMAGE1024, val);
        return this;
    }

    /**
     * 获取「图片1024」值
     *
     */
    @JsonIgnore
    public String getImage1024() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE1024), null);
    }

    /**
     * 判断 「图片1024」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage1024() {
        return this._contains(FIELD_IMAGE1024);
    }

    /**
     * 重置 「图片1024」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetImage1024() {
        this._reset(FIELD_IMAGE1024);
        return this;
    }

    /**
     * 设置「头像」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR)
    public AvatarMixinDTO setAvatar(String val) {
        this._set(FIELD_AVATAR, val);
        return this;
    }

    /**
     * 获取「头像」值
     *
     */
    @JsonIgnore
    public String getAvatar() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR), null);
    }

    /**
     * 判断 「头像」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar() {
        return this._contains(FIELD_AVATAR);
    }

    /**
     * 重置 「头像」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetAvatar() {
        this._reset(FIELD_AVATAR);
        return this;
    }

    /**
     * 设置「头像」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE)
    public AvatarMixinDTO setImage(String val) {
        this._set(FIELD_IMAGE, val);
        return this;
    }

    /**
     * 获取「头像」值
     *
     */
    @JsonIgnore
    public String getImage() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE), null);
    }

    /**
     * 判断 「头像」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage() {
        return this._contains(FIELD_IMAGE);
    }

    /**
     * 重置 「头像」
     *
     */
    @JsonIgnore
    public AvatarMixinDTO resetImage() {
        this._reset(FIELD_IMAGE);
        return this;
    }

}
