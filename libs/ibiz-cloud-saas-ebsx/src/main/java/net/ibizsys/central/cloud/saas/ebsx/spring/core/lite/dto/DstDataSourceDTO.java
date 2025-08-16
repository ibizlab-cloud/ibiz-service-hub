package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 数据源
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/.ibizmodel.index
 */
public class DstDataSourceDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdefields/DSID/.ibizmodel.index
   */
  public final static String FIELD_DSID = "dsid";

  /**.
   * 数据源名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdefields/DSNAME/.ibizmodel.index
   */
  public final static String FIELD_DSNAME = "dsname";

  /**.
   * 类型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdefields/DSTYPE/.ibizmodel.index
   */
  public final static String FIELD_DSTYPE = "dstype";

  /**.
   * 配置
   *
   * @see ibizmos:/psmodules/lite/psdataentities/DST_DATASOURCE/psdefields/DSCFG/.ibizmodel.index
   */
  public final static String FIELD_DSCFG = "dscfg";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public DstDataSourceDTO setDSId(String val) {
        this._set(FIELD_DSID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getDSId() {
        return (String) this._get(FIELD_DSID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSId() {
        return this._contains(FIELD_DSID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public DstDataSourceDTO resetDSId() {
        this._reset(FIELD_DSID);
        return this;
    }

    /**
     * 设置「数据源名称」
     *
     * @param val
    */
    @JsonIgnore
    public DstDataSourceDTO setDSName(String val) {
        this._set(FIELD_DSNAME, val);
        return this;
    }

    /**
     * 获取「数据源名称」值
     *
    */
    @JsonIgnore
    public String getDSName() {
        return (String) this._get(FIELD_DSNAME);
    }

    /**
     * 判断 「数据源名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSName() {
        return this._contains(FIELD_DSNAME);
    }

    /**
     * 重置 「数据源名称」
     *
    */
    @JsonIgnore
    public DstDataSourceDTO resetDSName() {
        this._reset(FIELD_DSNAME);
        return this;
    }

    /**
     * 设置「类型」
     *
     * @param val
    */
    @JsonIgnore
    public DstDataSourceDTO setDSType(String val) {
        this._set(FIELD_DSTYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     *
    */
    @JsonIgnore
    public String getDSType() {
        return (String) this._get(FIELD_DSTYPE);
    }

    /**
     * 判断 「类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSType() {
        return this._contains(FIELD_DSTYPE);
    }

    /**
     * 重置 「类型」
     *
    */
    @JsonIgnore
    public DstDataSourceDTO resetDSType() {
        this._reset(FIELD_DSTYPE);
        return this;
    }

    /**
     * 设置「配置」
     *
     * @param val
    */
    @JsonIgnore
    public DstDataSourceDTO setDSCfg(String val) {
        this._set(FIELD_DSCFG, val);
        return this;
    }

    /**
     * 获取「配置」值
     *
    */
    @JsonIgnore
    public String getDSCfg() {
        return (String) this._get(FIELD_DSCFG);
    }

    /**
     * 判断 「配置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDSCfg() {
        return this._contains(FIELD_DSCFG);
    }

    /**
     * 重置 「配置」
     *
    */
    @JsonIgnore
    public DstDataSourceDTO resetDSCfg() {
        this._reset(FIELD_DSCFG);
        return this;
    }


}
