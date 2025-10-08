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


public class MailComposerMixinDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 内容
     */
    public final static String FIELD_BODY = "body";

    /**
     * 属性: 正文内容与模板相同
     */
    public final static String FIELD_BODY_HAS_TEMPLATE_VALUE = "body_has_template_value";

    /**
     * 属性: 可以编辑主体
     */
    public final static String FIELD_CAN_EDIT_BODY = "can_edit_body";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 是编辑者
     */
    public final static String FIELD_IS_MAIL_TEMPLATE_EDITOR = "is_mail_template_editor";

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
     * 属性: 主旨
     */
    public final static String FIELD_SUBJECT = "subject";

    /**
     * 属性: 邮件模板
     */
    public final static String FIELD_TEMPLATE_ID = "template_id";

    /**
     * 设置「内容」
     * @param val
     */
    @JsonProperty(FIELD_BODY)
    public MailComposerMixinDTO setBody(String val) {
        this._set(FIELD_BODY, val);
        return this;
    }

    /**
     * 获取「内容」值
     *
     */
    @JsonIgnore
    public String getBody() {
        return DataTypeUtils.asString(this._get(FIELD_BODY), null);
    }

    /**
     * 判断 「内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBody() {
        return this._contains(FIELD_BODY);
    }

    /**
     * 重置 「内容」
     *
     */
    @JsonIgnore
    public MailComposerMixinDTO resetBody() {
        this._reset(FIELD_BODY);
        return this;
    }

    /**
     * 设置「正文内容与模板相同」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_BODY_HAS_TEMPLATE_VALUE)
    public MailComposerMixinDTO setBodyHasTemplateValue(Integer val) {
        this._set(FIELD_BODY_HAS_TEMPLATE_VALUE, val);
        return this;
    }

    /**
     * 获取「正文内容与模板相同」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getBodyHasTemplateValue() {
        return DataTypeUtils.asInteger(this._get(FIELD_BODY_HAS_TEMPLATE_VALUE), null);
    }

    /**
     * 判断 「正文内容与模板相同」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBodyHasTemplateValue() {
        return this._contains(FIELD_BODY_HAS_TEMPLATE_VALUE);
    }

    /**
     * 重置 「正文内容与模板相同」
     *
     */
    @JsonIgnore
    public MailComposerMixinDTO resetBodyHasTemplateValue() {
        this._reset(FIELD_BODY_HAS_TEMPLATE_VALUE);
        return this;
    }

    /**
     * 设置「可以编辑主体」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CAN_EDIT_BODY)
    public MailComposerMixinDTO setCanEditBody(Integer val) {
        this._set(FIELD_CAN_EDIT_BODY, val);
        return this;
    }

    /**
     * 获取「可以编辑主体」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCanEditBody() {
        return DataTypeUtils.asInteger(this._get(FIELD_CAN_EDIT_BODY), null);
    }

    /**
     * 判断 「可以编辑主体」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCanEditBody() {
        return this._contains(FIELD_CAN_EDIT_BODY);
    }

    /**
     * 重置 「可以编辑主体」
     *
     */
    @JsonIgnore
    public MailComposerMixinDTO resetCanEditBody() {
        this._reset(FIELD_CAN_EDIT_BODY);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailComposerMixinDTO setId(String val) {
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
    public MailComposerMixinDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「是编辑者」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MAIL_TEMPLATE_EDITOR)
    public MailComposerMixinDTO setIsMailTemplateEditor(Integer val) {
        this._set(FIELD_IS_MAIL_TEMPLATE_EDITOR, val);
        return this;
    }

    /**
     * 获取「是编辑者」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMailTemplateEditor() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MAIL_TEMPLATE_EDITOR), null);
    }

    /**
     * 判断 「是编辑者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMailTemplateEditor() {
        return this._contains(FIELD_IS_MAIL_TEMPLATE_EDITOR);
    }

    /**
     * 重置 「是编辑者」
     *
     */
    @JsonIgnore
    public MailComposerMixinDTO resetIsMailTemplateEditor() {
        this._reset(FIELD_IS_MAIL_TEMPLATE_EDITOR);
        return this;
    }

    /**
     * 设置「语言」
     * @param val
     */
    @JsonProperty(FIELD_LANG)
    public MailComposerMixinDTO setLang(String val) {
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
    public MailComposerMixinDTO resetLang() {
        this._reset(FIELD_LANG);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailComposerMixinDTO setName(String val) {
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
    public MailComposerMixinDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「渲染模型」
     * @param val
     */
    @JsonProperty(FIELD_RENDER_MODEL)
    public MailComposerMixinDTO setRenderModel(String val) {
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
    public MailComposerMixinDTO resetRenderModel() {
        this._reset(FIELD_RENDER_MODEL);
        return this;
    }

    /**
     * 设置「主旨」
     * @param val
     */
    @JsonProperty(FIELD_SUBJECT)
    public MailComposerMixinDTO setSubject(String val) {
        this._set(FIELD_SUBJECT, val);
        return this;
    }

    /**
     * 获取「主旨」值
     *
     */
    @JsonIgnore
    public String getSubject() {
        return DataTypeUtils.asString(this._get(FIELD_SUBJECT), null);
    }

    /**
     * 判断 「主旨」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSubject() {
        return this._contains(FIELD_SUBJECT);
    }

    /**
     * 重置 「主旨」
     *
     */
    @JsonIgnore
    public MailComposerMixinDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「邮件模板」
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATE_ID)
    public MailComposerMixinDTO setTemplateId(String val) {
        this._set(FIELD_TEMPLATE_ID, val);
        return this;
    }

    /**
     * 获取「邮件模板」值
     *
     */
    @JsonIgnore
    public String getTemplateId() {
        return DataTypeUtils.asString(this._get(FIELD_TEMPLATE_ID), null);
    }

    /**
     * 判断 「邮件模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplateId() {
        return this._contains(FIELD_TEMPLATE_ID);
    }

    /**
     * 重置 「邮件模板」
     *
     */
    @JsonIgnore
    public MailComposerMixinDTO resetTemplateId() {
        this._reset(FIELD_TEMPLATE_ID);
        return this;
    }

}
