package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 路由
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/.ibizmodel.index
 */
public class DstRouterDTO extends EntityDTO {

  /**.
   * 路径标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/ROUTERID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 路径名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/ROUTERNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/minorpsders/DER1N_DST_ROUTER_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 应用标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/APPID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/minorpsders/DER1N_DST_ROUTER_DST_APP_APPID/.ibizmodel.index
   */
  public final static String FIELD_APPID = "appid";

  /**.
   * 路径
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/ROUTERPATH/.ibizmodel.index
   */
  public final static String FIELD_PATH = "path";

  /**.
   * 父路径标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/PARENTID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/minorpsders/DER1N_DST_ROUTER_DST_ROUTER_PARENTID/.ibizmodel.index
   */
  public final static String FIELD_PARENTID = "parentid";

  /**.
   * meta
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/META/.ibizmodel.index
   */
  public final static String FIELD_META = "meta";

  /**.
   * 组件
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/COMPONENT/.ibizmodel.index
   */
  public final static String FIELD_COMPONENT = "component";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_ROUTER/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";


    /**
     * 设置「路径标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「路径标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「路径标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「路径标识」
     *
    */
    @JsonIgnore
    public DstRouterDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「路径名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「路径名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「路径名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「路径名称」
     *
    */
    @JsonIgnore
    public DstRouterDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setSystemId(String val) {
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
    public DstRouterDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setAppId(String val) {
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
    public DstRouterDTO resetAppId() {
        this._reset(FIELD_APPID);
        return this;
    }

    /**
     * 设置「路径」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setPath(String val) {
        this._set(FIELD_PATH, val);
        return this;
    }

    /**
     * 获取「路径」值
     *
    */
    @JsonIgnore
    public String getPath() {
        return (String) this._get(FIELD_PATH);
    }

    /**
     * 判断 「路径」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPath() {
        return this._contains(FIELD_PATH);
    }

    /**
     * 重置 「路径」
     *
    */
    @JsonIgnore
    public DstRouterDTO resetPath() {
        this._reset(FIELD_PATH);
        return this;
    }

    /**
     * 设置「父路径标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setParentid(String val) {
        this._set(FIELD_PARENTID, val);
        return this;
    }

    /**
     * 获取「父路径标识」值
     *
    */
    @JsonIgnore
    public String getParentid() {
        return (String) this._get(FIELD_PARENTID);
    }

    /**
     * 判断 「父路径标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsParentid() {
        return this._contains(FIELD_PARENTID);
    }

    /**
     * 重置 「父路径标识」
     *
    */
    @JsonIgnore
    public DstRouterDTO resetParentid() {
        this._reset(FIELD_PARENTID);
        return this;
    }

    /**
     * 设置「meta」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setMeta(String val) {
        this._set(FIELD_META, val);
        return this;
    }

    /**
     * 获取「meta」值
     *
    */
    @JsonIgnore
    public String getMeta() {
        return (String) this._get(FIELD_META);
    }

    /**
     * 判断 「meta」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMeta() {
        return this._contains(FIELD_META);
    }

    /**
     * 重置 「meta」
     *
    */
    @JsonIgnore
    public DstRouterDTO resetMeta() {
        this._reset(FIELD_META);
        return this;
    }

    /**
     * 设置「组件」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setComponent(String val) {
        this._set(FIELD_COMPONENT, val);
        return this;
    }

    /**
     * 获取「组件」值
     *
    */
    @JsonIgnore
    public String getComponent() {
        return (String) this._get(FIELD_COMPONENT);
    }

    /**
     * 判断 「组件」是否有值
     *
    */
    @JsonIgnore
    public boolean containsComponent() {
        return this._contains(FIELD_COMPONENT);
    }

    /**
     * 重置 「组件」
     *
    */
    @JsonIgnore
    public DstRouterDTO resetComponent() {
        this._reset(FIELD_COMPONENT);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DstRouterDTO setUpdateDate(Timestamp val) {
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
    public DstRouterDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }


}
