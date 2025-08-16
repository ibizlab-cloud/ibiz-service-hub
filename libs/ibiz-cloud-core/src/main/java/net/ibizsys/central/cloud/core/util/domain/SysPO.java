package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 系统优化日志
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/.ibizmodel.index
 */
public class SysPO extends EntityBase {

  /**.
   * 操作
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/ACTION/.ibizmodel.index
   */
  public final static String FIELD_ACTION = "action";

  /**.
   * 时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/minorpsders/DER1N_SYS_PO_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/minorpsders/DER1N_SYS_PO_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 实体
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/DE/.ibizmodel.index
   */
  public final static String FIELD_DE = "de";

  /**.
   * 日志级别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/LOGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_LOGLEVEL = "loglevel";

  /**.
   * 优化类别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/CAT/.ibizmodel.index
   */
  public final static String FIELD_CAT = "cat";

  /**.
   * 优化信息
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/INFO/.ibizmodel.index
   */
  public final static String FIELD_INFO = "info";

  /**.
   * 优化标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/SYSPOID/.ibizmodel.index
   */
  public final static String FIELD_SYSPOID = "syspoid";

  /**.
   * 优化名称
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/SYSPONAME/.ibizmodel.index
   */
  public final static String FIELD_SYSPONAME = "sysponame";

  /**.
   * 优化时间（ms）
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/TIME/.ibizmodel.index
   */
  public final static String FIELD_TIME = "time";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「操作」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setAction(String val) {
        this.set(FIELD_ACTION, val);
        return this;
    }

    /**
     * 获取「操作」值
     *
    */
    @JsonIgnore
    public String getAction() {
        return (String) this.get(FIELD_ACTION);
    }

    /**
     * 判断 「操作」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAction() {
        return this.contains(FIELD_ACTION);
    }

    /**
     * 重置 「操作」
     *
    */
    @JsonIgnore
    public SysPO resetAction() {
        this.reset(FIELD_ACTION);
        return this;
    }

    /**
     * 设置「时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATEDATE),null);
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
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「时间」
     *
    */
    @JsonIgnore
    public SysPO resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setCreateMan(String val) {
        this.set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this.get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this.contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public SysPO resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setDCSystemId(String val) {
        this.set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this.get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this.contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public SysPO resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setDCSystemName(String val) {
        this.set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this.get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this.contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public SysPO resetDCSystemName() {
        this.reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「实体」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setDE(String val) {
        this.set(FIELD_DE, val);
        return this;
    }

    /**
     * 获取「实体」值
     *
    */
    @JsonIgnore
    public String getDE() {
        return (String) this.get(FIELD_DE);
    }

    /**
     * 判断 「实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDE() {
        return this.contains(FIELD_DE);
    }

    /**
     * 重置 「实体」
     *
    */
    @JsonIgnore
    public SysPO resetDE() {
        this.reset(FIELD_DE);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setLogLevel(Integer val) {
        this.set(FIELD_LOGLEVEL, val);
        return this;
    }

    /**
     * 获取「日志级别」值
     *
    */
    @JsonIgnore
    public Integer getLogLevel() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_LOGLEVEL),null);
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
        return this.contains(FIELD_LOGLEVEL);
    }

    /**
     * 重置 「日志级别」
     *
    */
    @JsonIgnore
    public SysPO resetLogLevel() {
        this.reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「优化类别」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setCat(String val) {
        this.set(FIELD_CAT, val);
        return this;
    }

    /**
     * 获取「优化类别」值
     *
    */
    @JsonIgnore
    public String getCat() {
        return (String) this.get(FIELD_CAT);
    }

    /**
     * 判断 「优化类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCat() {
        return this.contains(FIELD_CAT);
    }

    /**
     * 重置 「优化类别」
     *
    */
    @JsonIgnore
    public SysPO resetCat() {
        this.reset(FIELD_CAT);
        return this;
    }

    /**
     * 设置「优化信息」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setInfo(String val) {
        this.set(FIELD_INFO, val);
        return this;
    }

    /**
     * 获取「优化信息」值
     *
    */
    @JsonIgnore
    public String getInfo() {
        return (String) this.get(FIELD_INFO);
    }

    /**
     * 判断 「优化信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInfo() {
        return this.contains(FIELD_INFO);
    }

    /**
     * 重置 「优化信息」
     *
    */
    @JsonIgnore
    public SysPO resetInfo() {
        this.reset(FIELD_INFO);
        return this;
    }

    /**
     * 设置「优化标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setSysPOId(String val) {
        this.set(FIELD_SYSPOID, val);
        return this;
    }

    /**
     * 获取「优化标识」值
     *
    */
    @JsonIgnore
    public String getSysPOId() {
        return (String) this.get(FIELD_SYSPOID);
    }

    /**
     * 判断 「优化标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysPOId() {
        return this.contains(FIELD_SYSPOID);
    }

    /**
     * 重置 「优化标识」
     *
    */
    @JsonIgnore
    public SysPO resetSysPOId() {
        this.reset(FIELD_SYSPOID);
        return this;
    }

    /**
     * 设置「优化名称」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setSysPOName(String val) {
        this.set(FIELD_SYSPONAME, val);
        return this;
    }

    /**
     * 获取「优化名称」值
     *
    */
    @JsonIgnore
    public String getSysPOName() {
        return (String) this.get(FIELD_SYSPONAME);
    }

    /**
     * 判断 「优化名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysPOName() {
        return this.contains(FIELD_SYSPONAME);
    }

    /**
     * 重置 「优化名称」
     *
    */
    @JsonIgnore
    public SysPO resetSysPOName() {
        this.reset(FIELD_SYSPONAME);
        return this;
    }

    /**
     * 设置「优化时间（ms）」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setTime(Long val) {
        this.set(FIELD_TIME, val);
        return this;
    }

    /**
     * 获取「优化时间（ms）」值
     *
    */
    @JsonIgnore
    public Long getTime() {
        try{
            return DataTypeUtils.getLongValue(this.get(FIELD_TIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「优化时间（ms）」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTime() {
        return this.contains(FIELD_TIME);
    }

    /**
     * 重置 「优化时间（ms）」
     *
    */
    @JsonIgnore
    public SysPO resetTime() {
        this.reset(FIELD_TIME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATEDATE),null);
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
        return this.contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public SysPO resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysPO setUpdateMan(String val) {
        this.set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this.get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this.contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public SysPO resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }


}
