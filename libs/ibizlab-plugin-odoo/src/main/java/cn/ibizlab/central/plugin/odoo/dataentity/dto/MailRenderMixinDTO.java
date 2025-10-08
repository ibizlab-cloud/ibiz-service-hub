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


public class MailRenderMixinDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 语言
     */
    public final static String FIELD_LANG = "lang";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 渲染模型
     */
    public final static String FIELD_RENDER_MODEL = "render_model";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailRenderMixinDTO setId(String val) {
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
    public MailRenderMixinDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「语言」
     * @param val
     */
    @JsonProperty(FIELD_LANG)
    public MailRenderMixinDTO setLang(String val) {
        this._set(FIELD_LANG, val);
        return this;
    }

    /**
     * 获取「语言」值
     *
     */
    @JsonIgnore
    public String getLang() {
        return DataTypeUtils.asString(this._get(FIELD_LANG), null);
    }

    /**
     * 判断 「语言」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLang() {
        return this._contains(FIELD_LANG);
    }

    /**
     * 重置 「语言」
     *
     */
    @JsonIgnore
    public MailRenderMixinDTO resetLang() {
        this._reset(FIELD_LANG);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailRenderMixinDTO setName(String val) {
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
    public MailRenderMixinDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「渲染模型」
     * @param val
     */
    @JsonProperty(FIELD_RENDER_MODEL)
    public MailRenderMixinDTO setRenderModel(String val) {
        this._set(FIELD_RENDER_MODEL, val);
        return this;
    }

    /**
     * 获取「渲染模型」值
     *
     */
    @JsonIgnore
    public String getRenderModel() {
        return DataTypeUtils.asString(this._get(FIELD_RENDER_MODEL), null);
    }

    /**
     * 判断 「渲染模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRenderModel() {
        return this._contains(FIELD_RENDER_MODEL);
    }

    /**
     * 重置 「渲染模型」
     *
     */
    @JsonIgnore
    public MailRenderMixinDTO resetRenderModel() {
        this._reset(FIELD_RENDER_MODEL);
        return this;
    }

}
