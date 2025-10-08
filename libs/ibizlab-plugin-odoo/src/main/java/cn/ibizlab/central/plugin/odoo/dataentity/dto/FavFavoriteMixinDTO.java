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


public class FavFavoriteMixinDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 收藏计数
     */
    public final static String FIELD_FAVORITE_COUNT = "favorite_count";

    /**
     * 属性: 收藏
     */
    public final static String FIELD_IS_FAVORITE = "is_favorite";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 设置「收藏计数」
     * @param val
     */
    @JsonProperty(FIELD_FAVORITE_COUNT)
    public FavFavoriteMixinDTO setFavoriteCount(Integer val) {
        this._set(FIELD_FAVORITE_COUNT, val);
        return this;
    }

    /**
     * 获取「收藏计数」值
     *
     */
    @JsonIgnore
    public Integer getFavoriteCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_FAVORITE_COUNT), null);
    }

    /**
     * 判断 「收藏计数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFavoriteCount() {
        return this._contains(FIELD_FAVORITE_COUNT);
    }

    /**
     * 重置 「收藏计数」
     *
     */
    @JsonIgnore
    public FavFavoriteMixinDTO resetFavoriteCount() {
        this._reset(FIELD_FAVORITE_COUNT);
        return this;
    }

    /**
     * 设置「收藏」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_FAVORITE)
    public FavFavoriteMixinDTO setIsFavorite(Integer val) {
        this._set(FIELD_IS_FAVORITE, val);
        return this;
    }

    /**
     * 获取「收藏」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsFavorite() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_FAVORITE), null);
    }

    /**
     * 判断 「收藏」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsFavorite() {
        return this._contains(FIELD_IS_FAVORITE);
    }

    /**
     * 重置 「收藏」
     *
     */
    @JsonIgnore
    public FavFavoriteMixinDTO resetIsFavorite() {
        this._reset(FIELD_IS_FAVORITE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public FavFavoriteMixinDTO setId(String val) {
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
    public FavFavoriteMixinDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public FavFavoriteMixinDTO setName(String val) {
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
    public FavFavoriteMixinDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

}
