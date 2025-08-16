package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 页面
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/.ibizmodel.index
 */
public class DstViewDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/VIEWID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/VIEWNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 视图路径
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/VIEWPATH/.ibizmodel.index
   */
  public final static String FIELD_PATH = "path";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/minorpsders/DER1N_DST_VIEW_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 应用标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/APPID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/minorpsders/DER1N_DST_VIEW_DST_APP_APPID/.ibizmodel.index
   */
  public final static String FIELD_APPID = "appid";

  /**.
   * 实体标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/ENTITYID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/minorpsders/DER1N_DST_VIEW_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 主实体
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/ENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/minorpsders/DER1N_DST_VIEW_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 配置
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/CFG/.ibizmodel.index
   */
  public final static String FIELD_CONFIG = "config";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_VIEW/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
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
    public DstViewDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
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
    public DstViewDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「视图路径」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setPath(String val) {
        this._set(FIELD_PATH, val);
        return this;
    }

    /**
     * 获取「视图路径」值
     *
    */
    @JsonIgnore
    public String getPath() {
        return (String) this._get(FIELD_PATH);
    }

    /**
     * 判断 「视图路径」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPath() {
        return this._contains(FIELD_PATH);
    }

    /**
     * 重置 「视图路径」
     *
    */
    @JsonIgnore
    public DstViewDTO resetPath() {
        this._reset(FIELD_PATH);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setSystemId(String val) {
        this._set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this._get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this._contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public DstViewDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setAppId(String val) {
        this._set(FIELD_APPID, val);
        return this;
    }

    /**
     * 获取「应用标识」值
     *
    */
    @JsonIgnore
    public String getAppId() {
        return (String) this._get(FIELD_APPID);
    }

    /**
     * 判断 「应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAppId() {
        return this._contains(FIELD_APPID);
    }

    /**
     * 重置 「应用标识」
     *
    */
    @JsonIgnore
    public DstViewDTO resetAppId() {
        this._reset(FIELD_APPID);
        return this;
    }

    /**
     * 设置「实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setEntityId(String val) {
        this._set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「实体标识」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this._get(FIELD_ENTITYID);
    }

    /**
     * 判断 「实体标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this._contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「实体标识」
     *
    */
    @JsonIgnore
    public DstViewDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「主实体」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setEntityName(String val) {
        this._set(FIELD_ENTITYNAME, val);
        return this;
    }

    /**
     * 获取「主实体」值
     *
    */
    @JsonIgnore
    public String getEntityName() {
        return (String) this._get(FIELD_ENTITYNAME);
    }

    /**
     * 判断 「主实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityName() {
        return this._contains(FIELD_ENTITYNAME);
    }

    /**
     * 重置 「主实体」
     *
    */
    @JsonIgnore
    public DstViewDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「配置」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setConfig(String val) {
        this._set(FIELD_CONFIG, val);
        return this;
    }

    /**
     * 获取「配置」值
     *
    */
    @JsonIgnore
    public String getConfig() {
        return (String) this._get(FIELD_CONFIG);
    }

    /**
     * 判断 「配置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfig() {
        return this._contains(FIELD_CONFIG);
    }

    /**
     * 重置 「配置」
     *
    */
    @JsonIgnore
    public DstViewDTO resetConfig() {
        this._reset(FIELD_CONFIG);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DstViewDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_UPDATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public DstViewDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }


}
