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


public class FavFavoriteDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 收藏者
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 属性: 资源标识
     */
    public final static String FIELD_RES_ID = "res_id";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 描述
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 资源模型
     */
    public final static String FIELD_RES_MODEL = "res_model";

    /**
     * 设置「收藏者」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public FavFavoriteDTO setPartnerId(String val) {
        this._set(FIELD_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「收藏者」值
     *
     */
    @JsonIgnore
    public String getPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_ID), null);
    }

    /**
     * 判断 「收藏者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerId() {
        return this._contains(FIELD_PARTNER_ID);
    }

    /**
     * 重置 「收藏者」
     *
     */
    @JsonIgnore
    public FavFavoriteDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

    /**
     * 设置「资源标识」
     * @param val
     */
    @JsonProperty(FIELD_RES_ID)
    public FavFavoriteDTO setResId(String val) {
        this._set(FIELD_RES_ID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
     */
    @JsonIgnore
    public String getResId() {
        return DataTypeUtils.asString(this._get(FIELD_RES_ID), null);
    }

    /**
     * 判断 「资源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResId() {
        return this._contains(FIELD_RES_ID);
    }

    /**
     * 重置 「资源标识」
     *
     */
    @JsonIgnore
    public FavFavoriteDTO resetResId() {
        this._reset(FIELD_RES_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public FavFavoriteDTO setCreateDate(Timestamp val) {
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
    public FavFavoriteDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「描述」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public FavFavoriteDTO setDescription(String val) {
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
    public FavFavoriteDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public FavFavoriteDTO setId(String val) {
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
    public FavFavoriteDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public FavFavoriteDTO setName(String val) {
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
    public FavFavoriteDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「资源模型」
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL)
    public FavFavoriteDTO setResModel(String val) {
        this._set(FIELD_RES_MODEL, val);
        return this;
    }

    /**
     * 获取「资源模型」值
     *
     */
    @JsonIgnore
    public String getResModel() {
        return DataTypeUtils.asString(this._get(FIELD_RES_MODEL), null);
    }

    /**
     * 判断 「资源模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResModel() {
        return this._contains(FIELD_RES_MODEL);
    }

    /**
     * 重置 「资源模型」
     *
     */
    @JsonIgnore
    public FavFavoriteDTO resetResModel() {
        this._reset(FIELD_RES_MODEL);
        return this;
    }

}
