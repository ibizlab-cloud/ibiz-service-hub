package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/.ibizmodel.index
 */
public class DstSystemDTO extends EntityDTO {

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdefields/PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMID = "pssystemid";

  /**.
   * 系统名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdefields/PSSYSTEMNAME/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMNAME = "pssystemname";

  /**.
   * 结构
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdefields/SYSSTRUCTURE/.ibizmodel.index
   */
  public final static String FIELD_SYSSTRUCTURE = "sysstructure";

  /**.
   * 应用
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdefields/APPS/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/DST_APP/minorpsders/DER1N_DST_APP_DST_SYSTEM_PSSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_APPS = "apps";

  /**.
   * 校验
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdefields/MD5CHECK/.ibizmodel.index
   */
  public final static String FIELD_MD5CHECK = "md5check";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_SYSTEM/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";


    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstSystemDTO setPSSystemId(String val) {
        this._set(FIELD_PSSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getPSSystemId() {
        return (String) this._get(FIELD_PSSYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemId() {
        return this._contains(FIELD_PSSYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public DstSystemDTO resetPSSystemId() {
        this._reset(FIELD_PSSYSTEMID);
        return this;
    }

    /**
     * 设置「系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstSystemDTO setPSSystemName(String val) {
        this._set(FIELD_PSSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统名称」值
     *
    */
    @JsonIgnore
    public String getPSSystemName() {
        return (String) this._get(FIELD_PSSYSTEMNAME);
    }

    /**
     * 判断 「系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemName() {
        return this._contains(FIELD_PSSYSTEMNAME);
    }

    /**
     * 重置 「系统名称」
     *
    */
    @JsonIgnore
    public DstSystemDTO resetPSSystemName() {
        this._reset(FIELD_PSSYSTEMNAME);
        return this;
    }

    /**
     * 设置「结构」
     *
     * @param val
    */
    @JsonIgnore
    public DstSystemDTO setSysStructure(String val) {
        this._set(FIELD_SYSSTRUCTURE, val);
        return this;
    }

    /**
     * 获取「结构」值
     *
    */
    @JsonIgnore
    public String getSysStructure() {
        return (String) this._get(FIELD_SYSSTRUCTURE);
    }

    /**
     * 判断 「结构」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysStructure() {
        return this._contains(FIELD_SYSSTRUCTURE);
    }

    /**
     * 重置 「结构」
     *
    */
    @JsonIgnore
    public DstSystemDTO resetSysStructure() {
        this._reset(FIELD_SYSSTRUCTURE);
        return this;
    }

    /**
     * 设置「应用」
     *
     * @param val
    */
    @JsonIgnore
    public DstSystemDTO setApps(List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstAppDTO> val) {
        this._set(FIELD_APPS, val);
        return this;
    }

    /**
     * 获取「应用」值
     *
    */
    @JsonIgnore
    public List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstAppDTO> getApps() {
        return (List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.DstAppDTO>) this._get(FIELD_APPS);
    }

    /**
     * 判断 「应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApps() {
        return this._contains(FIELD_APPS);
    }

    /**
     * 重置 「应用」
     *
    */
    @JsonIgnore
    public DstSystemDTO resetApps() {
        this._reset(FIELD_APPS);
        return this;
    }

    /**
     * 设置「校验」
     *
     * @param val
    */
    @JsonIgnore
    public DstSystemDTO setMD5Check(String val) {
        this._set(FIELD_MD5CHECK, val);
        return this;
    }

    /**
     * 获取「校验」值
     *
    */
    @JsonIgnore
    public String getMD5Check() {
        return (String) this._get(FIELD_MD5CHECK);
    }

    /**
     * 判断 「校验」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMD5Check() {
        return this._contains(FIELD_MD5CHECK);
    }

    /**
     * 重置 「校验」
     *
    */
    @JsonIgnore
    public DstSystemDTO resetMD5Check() {
        this._reset(FIELD_MD5CHECK);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public DstSystemDTO setShowOrder(Integer val) {
        this._set(FIELD_SHOWORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShowOrder() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SHOWORDER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「排序」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShowOrder() {
        return this._contains(FIELD_SHOWORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public DstSystemDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }


}
