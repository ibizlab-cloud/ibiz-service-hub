package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class FavFavoriteMixinDTOUtils {

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
    public static void setFavoriteCount(IEntityDTO iEntityDTO, Integer val) {
        iEntityDTO.set(FIELD_FAVORITE_COUNT, val);
    }

    /**
     * 获取「收藏计数」值
     *
     */
    public static Integer getFavoriteCount(IEntityDTO iEntityDTO) {
        return DataTypeUtils.asInteger(iEntityDTO.get(FIELD_FAVORITE_COUNT), null);
    }

    /**
     * 判断 「收藏计数」是否有值
     *
     */
    public static boolean containsFavoriteCount(IEntityDTO iEntityDTO) {
        return iEntityDTO.contains(FIELD_FAVORITE_COUNT);
    }

    /**
     * 重置 「收藏计数」
     *
     */
    public static void resetFavoriteCount(IEntityDTO iEntityDTO) {
        iEntityDTO.reset(FIELD_FAVORITE_COUNT);
    }

    /**
     * 设置「收藏」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    public static void setIsFavorite(IEntityDTO iEntityDTO, Integer val) {
        iEntityDTO.set(FIELD_IS_FAVORITE, val);
    }

    /**
     * 获取「收藏」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    public static Integer getIsFavorite(IEntityDTO iEntityDTO) {
        return DataTypeUtils.asInteger(iEntityDTO.get(FIELD_IS_FAVORITE), null);
    }

    /**
     * 判断 「收藏」是否有值
     *
     */
    public static boolean containsIsFavorite(IEntityDTO iEntityDTO) {
        return iEntityDTO.contains(FIELD_IS_FAVORITE);
    }

    /**
     * 重置 「收藏」
     *
     */
    public static void resetIsFavorite(IEntityDTO iEntityDTO) {
        iEntityDTO.reset(FIELD_IS_FAVORITE);
    }

    /**
     * 设置「标识」
     * @param val
     */
    public static void setId(IEntityDTO iEntityDTO, String val) {
        iEntityDTO.set(FIELD_ID, val);
    }

    /**
     * 获取「标识」值
     *
     */
    public static String getId(IEntityDTO iEntityDTO) {
        return DataTypeUtils.asString(iEntityDTO.get(FIELD_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    public static boolean containsId(IEntityDTO iEntityDTO) {
        return iEntityDTO.contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    public static void resetId(IEntityDTO iEntityDTO) {
        iEntityDTO.reset(FIELD_ID);
    }

    /**
     * 设置「名称」
     * @param val
     */
    public static void setName(IEntityDTO iEntityDTO, String val) {
        iEntityDTO.set(FIELD_NAME, val);
    }

    /**
     * 获取「名称」值
     *
     */
    public static String getName(IEntityDTO iEntityDTO) {
        return DataTypeUtils.asString(iEntityDTO.get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    public static boolean containsName(IEntityDTO iEntityDTO) {
        return iEntityDTO.contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    public static void resetName(IEntityDTO iEntityDTO) {
        iEntityDTO.reset(FIELD_NAME);
    }

}
