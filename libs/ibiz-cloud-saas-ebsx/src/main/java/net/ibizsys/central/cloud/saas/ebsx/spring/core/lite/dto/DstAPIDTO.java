package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 接口
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_API/.ibizmodel.index
 */
public class DstAPIDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/psdefields/APIID/.ibizmodel.index
   */
  public final static String FIELD_APIID = "apiid";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/psdefields/APINAME/.ibizmodel.index
   */
  public final static String FIELD_APINAME = "apiname";

  /**.
   * 路径
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/psdefields/APIPATH/.ibizmodel.index
   */
  public final static String FIELD_PATH = "path";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/minorpsders/DER1N_DST_API_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 微服务标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/psdefields/MSID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/minorpsders/DER1N_DST_API_DST_MS_MSID/.ibizmodel.index
   */
  public final static String FIELD_MSID = "msid";

  /**.
   * 微服务名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/psdefields/MSNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/minorpsders/DER1N_DST_API_DST_MS_MSID/.ibizmodel.index
   */
  public final static String FIELD_MSNAME = "msname";

  /**.
   * 服务名
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/psdefields/SERVICENAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_API/minorpsders/DER1N_DST_API_DST_MS_MSID/.ibizmodel.index
   */
  public final static String FIELD_SERVICENAME = "servicename";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstAPIDTO setAPIId(String val) {
        this._set(FIELD_APIID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getAPIId() {
        return (String) this._get(FIELD_APIID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAPIId() {
        return this._contains(FIELD_APIID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public DstAPIDTO resetAPIId() {
        this._reset(FIELD_APIID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstAPIDTO setAPIName(String val) {
        this._set(FIELD_APINAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getAPIName() {
        return (String) this._get(FIELD_APINAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAPIName() {
        return this._contains(FIELD_APINAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public DstAPIDTO resetAPIName() {
        this._reset(FIELD_APINAME);
        return this;
    }

    /**
     * 设置「路径」
     *
     * @param val
    */
    @JsonIgnore
    public DstAPIDTO setPath(String val) {
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
    public DstAPIDTO resetPath() {
        this._reset(FIELD_PATH);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstAPIDTO setSystemId(String val) {
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
    public DstAPIDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「微服务标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstAPIDTO setMSId(String val) {
        this._set(FIELD_MSID, val);
        return this;
    }

    /**
     * 获取「微服务标识」值
     *
    */
    @JsonIgnore
    public String getMSId() {
        return (String) this._get(FIELD_MSID);
    }

    /**
     * 判断 「微服务标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMSId() {
        return this._contains(FIELD_MSID);
    }

    /**
     * 重置 「微服务标识」
     *
    */
    @JsonIgnore
    public DstAPIDTO resetMSId() {
        this._reset(FIELD_MSID);
        return this;
    }

    /**
     * 设置「微服务名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstAPIDTO setMSName(String val) {
        this._set(FIELD_MSNAME, val);
        return this;
    }

    /**
     * 获取「微服务名称」值
     *
    */
    @JsonIgnore
    public String getMSName() {
        return (String) this._get(FIELD_MSNAME);
    }

    /**
     * 判断 「微服务名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMSName() {
        return this._contains(FIELD_MSNAME);
    }

    /**
     * 重置 「微服务名称」
     *
    */
    @JsonIgnore
    public DstAPIDTO resetMSName() {
        this._reset(FIELD_MSNAME);
        return this;
    }

    /**
     * 设置「服务名」
     *
     * @param val
    */
    @JsonIgnore
    public DstAPIDTO setServiceName(String val) {
        this._set(FIELD_SERVICENAME, val);
        return this;
    }

    /**
     * 获取「服务名」值
     *
    */
    @JsonIgnore
    public String getServiceName() {
        return (String) this._get(FIELD_SERVICENAME);
    }

    /**
     * 判断 「服务名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsServiceName() {
        return this._contains(FIELD_SERVICENAME);
    }

    /**
     * 重置 「服务名」
     *
    */
    @JsonIgnore
    public DstAPIDTO resetServiceName() {
        this._reset(FIELD_SERVICENAME);
        return this;
    }


}
