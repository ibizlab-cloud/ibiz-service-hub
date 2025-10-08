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


public class ImageMixinDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 图片128
     */
    public final static String FIELD_IMAGE128 = "image128";

    /**
     * 属性: 图片512
     */
    public final static String FIELD_IMAGE512 = "image512";

    /**
     * 属性: 图片256
     */
    public final static String FIELD_IMAGE256 = "image256";

    /**
     * 属性: 图片1024
     */
    public final static String FIELD_IMAGE1024 = "image1024";

    /**
     * 属性: 图片
     */
    public final static String FIELD_IMAGE = "image";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ImageMixinDTO setId(String val) {
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
    public ImageMixinDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ImageMixinDTO setName(String val) {
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
    public ImageMixinDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「图片128」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE128)
    public ImageMixinDTO setImage128(String val) {
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
    public ImageMixinDTO resetImage128() {
        this._reset(FIELD_IMAGE128);
        return this;
    }

    /**
     * 设置「图片512」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE512)
    public ImageMixinDTO setImage512(String val) {
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
    public ImageMixinDTO resetImage512() {
        this._reset(FIELD_IMAGE512);
        return this;
    }

    /**
     * 设置「图片256」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE256)
    public ImageMixinDTO setImage256(String val) {
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
    public ImageMixinDTO resetImage256() {
        this._reset(FIELD_IMAGE256);
        return this;
    }

    /**
     * 设置「图片1024」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE1024)
    public ImageMixinDTO setImage1024(String val) {
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
    public ImageMixinDTO resetImage1024() {
        this._reset(FIELD_IMAGE1024);
        return this;
    }

    /**
     * 设置「图片」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE)
    public ImageMixinDTO setImage(String val) {
        this._set(FIELD_IMAGE, val);
        return this;
    }

    /**
     * 获取「图片」值
     *
     */
    @JsonIgnore
    public String getImage() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE), null);
    }

    /**
     * 判断 「图片」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage() {
        return this._contains(FIELD_IMAGE);
    }

    /**
     * 重置 「图片」
     *
     */
    @JsonIgnore
    public ImageMixinDTO resetImage() {
        this._reset(FIELD_IMAGE);
        return this;
    }

}
