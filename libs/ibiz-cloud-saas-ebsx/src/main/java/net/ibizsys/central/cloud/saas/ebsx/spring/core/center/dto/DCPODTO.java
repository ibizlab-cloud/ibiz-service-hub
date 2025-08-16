package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统性能日志
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_PO/.ibizmodel.index
 */
public class DCPODTO extends EntityDTO {

  /**.
   * 操作
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/ACTION/.ibizmodel.index
   */
  public final static String FIELD_ACTION = "action";

  /**.
   * 时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/minorpsders/DER1N_DC_PO_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/minorpsders/DER1N_DC_PO_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 实体
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/DENAME/.ibizmodel.index
   */
  public final static String FIELD_DENAME = "dename";

  /**.
   * 日志级别
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/LOGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_LOGLEVEL = "loglevel";

  /**.
   * 性能记录类别
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/POCAT/.ibizmodel.index
   */
  public final static String FIELD_POCAT = "pocat";

  /**.
   * 优化信息
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/POINFO/.ibizmodel.index
   */
  public final static String FIELD_POINFO = "poinfo";

  /**.
   * 优化标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/SYSPOID/.ibizmodel.index
   */
  public final static String FIELD_SYSPOID = "syspoid";

  /**.
   * 性能记录名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/SYSPONAME/.ibizmodel.index
   */
  public final static String FIELD_SYSPONAME = "sysponame";

  /**.
   * 执行时间（ms）
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/TIME/.ibizmodel.index
   */
  public final static String FIELD_TIME = "time";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_PO/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「操作」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setAction(String val) {
        this._set(FIELD_ACTION, val);
        return this;
    }

    /**
     * 获取「操作」值
     *
    */
    @JsonIgnore
    public String getAction() {
        return (String) this._get(FIELD_ACTION);
    }

    /**
     * 判断 「操作」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAction() {
        return this._contains(FIELD_ACTION);
    }

    /**
     * 重置 「操作」
     *
    */
    @JsonIgnore
    public DCPODTO resetAction() {
        this._reset(FIELD_ACTION);
        return this;
    }

    /**
     * 设置「时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「时间」
     *
    */
    @JsonIgnore
    public DCPODTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public DCPODTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public DCPODTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setDCSystemName(String val) {
        this._set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this._get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this._contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public DCPODTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「实体」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setDEName(String val) {
        this._set(FIELD_DENAME, val);
        return this;
    }

    /**
     * 获取「实体」值
     *
    */
    @JsonIgnore
    public String getDEName() {
        return (String) this._get(FIELD_DENAME);
    }

    /**
     * 判断 「实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDEName() {
        return this._contains(FIELD_DENAME);
    }

    /**
     * 重置 「实体」
     *
    */
    @JsonIgnore
    public DCPODTO resetDEName() {
        this._reset(FIELD_DENAME);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setLogLevel(Integer val) {
        this._set(FIELD_LOGLEVEL, val);
        return this;
    }

    /**
     * 获取「日志级别」值
     *
    */
    @JsonIgnore
    public Integer getLogLevel() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_LOGLEVEL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「日志级别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLogLevel() {
        return this._contains(FIELD_LOGLEVEL);
    }

    /**
     * 重置 「日志级别」
     *
    */
    @JsonIgnore
    public DCPODTO resetLogLevel() {
        this._reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「性能记录类别」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setPOCat(String val) {
        this._set(FIELD_POCAT, val);
        return this;
    }

    /**
     * 获取「性能记录类别」值
     *
    */
    @JsonIgnore
    public String getPOCat() {
        return (String) this._get(FIELD_POCAT);
    }

    /**
     * 判断 「性能记录类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPOCat() {
        return this._contains(FIELD_POCAT);
    }

    /**
     * 重置 「性能记录类别」
     *
    */
    @JsonIgnore
    public DCPODTO resetPOCat() {
        this._reset(FIELD_POCAT);
        return this;
    }

    /**
     * 设置「优化信息」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setPOInfo(String val) {
        this._set(FIELD_POINFO, val);
        return this;
    }

    /**
     * 获取「优化信息」值
     *
    */
    @JsonIgnore
    public String getPOInfo() {
        return (String) this._get(FIELD_POINFO);
    }

    /**
     * 判断 「优化信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPOInfo() {
        return this._contains(FIELD_POINFO);
    }

    /**
     * 重置 「优化信息」
     *
    */
    @JsonIgnore
    public DCPODTO resetPOInfo() {
        this._reset(FIELD_POINFO);
        return this;
    }

    /**
     * 设置「优化标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setSysPOId(String val) {
        this._set(FIELD_SYSPOID, val);
        return this;
    }

    /**
     * 获取「优化标识」值
     *
    */
    @JsonIgnore
    public String getSysPOId() {
        return (String) this._get(FIELD_SYSPOID);
    }

    /**
     * 判断 「优化标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysPOId() {
        return this._contains(FIELD_SYSPOID);
    }

    /**
     * 重置 「优化标识」
     *
    */
    @JsonIgnore
    public DCPODTO resetSysPOId() {
        this._reset(FIELD_SYSPOID);
        return this;
    }

    /**
     * 设置「性能记录名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setSysPOName(String val) {
        this._set(FIELD_SYSPONAME, val);
        return this;
    }

    /**
     * 获取「性能记录名称」值
     *
    */
    @JsonIgnore
    public String getSysPOName() {
        return (String) this._get(FIELD_SYSPONAME);
    }

    /**
     * 判断 「性能记录名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysPOName() {
        return this._contains(FIELD_SYSPONAME);
    }

    /**
     * 重置 「性能记录名称」
     *
    */
    @JsonIgnore
    public DCPODTO resetSysPOName() {
        this._reset(FIELD_SYSPONAME);
        return this;
    }

    /**
     * 设置「执行时间（ms）」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setTime(Long val) {
        this._set(FIELD_TIME, val);
        return this;
    }

    /**
     * 获取「执行时间（ms）」值
     *
    */
    @JsonIgnore
    public Long getTime() {
        try{
            return DataTypeUtils.getLongValue(this._get(FIELD_TIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「执行时间（ms）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTime() {
        return this._contains(FIELD_TIME);
    }

    /**
     * 重置 「执行时间（ms）」
     *
    */
    @JsonIgnore
    public DCPODTO resetTime() {
        this._reset(FIELD_TIME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
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
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public DCPODTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCPODTO setUpdateMan(String val) {
        this._set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this._get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public DCPODTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
