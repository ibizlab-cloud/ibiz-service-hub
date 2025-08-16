package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 微服务
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_MS/.ibizmodel.index
 */
public class DstMicroserviceDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_MS/psdefields/MSID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_MS/psdefields/MSNAME/.ibizmodel.index
   */
  public final static String FIELD_LABEL = "label";

  /**.
   * 服务名
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_MS/psdefields/SERVICENAME/.ibizmodel.index
   */
  public final static String FIELD_SERVICENAME = "servicename";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_MS/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_MS/minorpsders/DER1N_DST_MS_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_MS/psdefields/ADDR/.ibizmodel.index
   */
  public final static String FIELD_ADDR = "addr";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstMicroserviceDTO setId(String val) {
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
    public DstMicroserviceDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstMicroserviceDTO setLabel(String val) {
        this._set(FIELD_LABEL, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getLabel() {
        return (String) this._get(FIELD_LABEL);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLabel() {
        return this._contains(FIELD_LABEL);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public DstMicroserviceDTO resetLabel() {
        this._reset(FIELD_LABEL);
        return this;
    }

    /**
     * 设置「服务名」
     *
     * @param val
    */
    @JsonIgnore
    public DstMicroserviceDTO setServiceName(String val) {
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
    public DstMicroserviceDTO resetServiceName() {
        this._reset(FIELD_SERVICENAME);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstMicroserviceDTO setSystemId(String val) {
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
    public DstMicroserviceDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public DstMicroserviceDTO setAddr(String val) {
        this._set(FIELD_ADDR, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getAddr() {
        return (String) this._get(FIELD_ADDR);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddr() {
        return this._contains(FIELD_ADDR);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public DstMicroserviceDTO resetAddr() {
        this._reset(FIELD_ADDR);
        return this;
    }


}
