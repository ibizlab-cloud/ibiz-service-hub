package net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统优化日志
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_PO/.ibizmodel.index
 */
public class SysPOSimpleDTO extends EntityDTO {

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
     * 设置「时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysPOSimpleDTO setCreateDate(Timestamp val) {
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
    public SysPOSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SysPOSimpleDTO setCreateMan(String val) {
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
    public SysPOSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「优化标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysPOSimpleDTO setSysPOId(String val) {
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
    public SysPOSimpleDTO resetSysPOId() {
        this._reset(FIELD_SYSPOID);
        return this;
    }

    /**
     * 设置「优化名称」
     *
     * @param val
    */
    @JsonIgnore
    public SysPOSimpleDTO setSysPOName(String val) {
        this._set(FIELD_SYSPONAME, val);
        return this;
    }

    /**
     * 获取「优化名称」值
     *
    */
    @JsonIgnore
    public String getSysPOName() {
        return (String) this._get(FIELD_SYSPONAME);
    }

    /**
     * 判断 「优化名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysPOName() {
        return this._contains(FIELD_SYSPONAME);
    }

    /**
     * 重置 「优化名称」
     *
    */
    @JsonIgnore
    public SysPOSimpleDTO resetSysPOName() {
        this._reset(FIELD_SYSPONAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysPOSimpleDTO setUpdateDate(Timestamp val) {
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
    public SysPOSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysPOSimpleDTO setUpdateMan(String val) {
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
    public SysPOSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
