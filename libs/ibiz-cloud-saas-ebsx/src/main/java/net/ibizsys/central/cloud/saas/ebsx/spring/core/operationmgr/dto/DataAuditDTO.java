package net.ibizsys.central.cloud.saas.ebsx.spring.core.operationmgr.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 访问日志
 * 
 * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/.ibizmodel.index
 */
public class DataAuditDTO extends EntityDTO {

  /**.
   * 审计明细
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/AUDITINFO/.ibizmodel.index
   */
  public final static String FIELD_AUDITINFO = "auditinfo";

  /**.
   * 文件类型
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/AUDITTYPE/.ibizmodel.index
   */
  public final static String FIELD_AUDITTYPE = "audittype";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/minorpsders/DER1N_DATAAUDIT_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/minorpsders/DER1N_DATAAUDIT_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 访问日志标识
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/DATAAUDITID/.ibizmodel.index
   */
  public final static String FIELD_DATAAUDITID = "dataauditid";

  /**.
   * 访问日志名称
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/DATAAUDITNAME/.ibizmodel.index
   */
  public final static String FIELD_DATAAUDITNAME = "dataauditname";

  /**.
   * 访问地址
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/IPADDRESS/.ibizmodel.index
   */
  public final static String FIELD_IPADDRESS = "ipaddress";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/OPPERSONID/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONID = "oppersonid";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/OPPERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONNAME = "oppersonname";

  /**.
   * 对象编号
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/OBJECTID/.ibizmodel.index
   */
  public final static String FIELD_OBJECTID = "objectid";

  /**.
   * 对象类型
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/OBJECTTYPE/.ibizmodel.index
   */
  public final static String FIELD_OBJECTTYPE = "objecttype";

  /**.
   * 访问标识
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/SESSIONID/.ibizmodel.index
   */
  public final static String FIELD_SESSIONID = "sessionid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/OperationMgr/psdataentities/DATAAUDIT/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「审计明细」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setAuditInfo(String val) {
        this._set(FIELD_AUDITINFO, val);
        return this;
    }

    /**
     * 获取「审计明细」值
     *
    */
    @JsonIgnore
    public String getAuditInfo() {
        return (String) this._get(FIELD_AUDITINFO);
    }

    /**
     * 判断 「审计明细」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuditInfo() {
        return this._contains(FIELD_AUDITINFO);
    }

    /**
     * 重置 「审计明细」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetAuditInfo() {
        this._reset(FIELD_AUDITINFO);
        return this;
    }

    /**
     * 设置「文件类型」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setAuditType(String val) {
        this._set(FIELD_AUDITTYPE, val);
        return this;
    }

    /**
     * 获取「文件类型」值
     *
    */
    @JsonIgnore
    public String getAuditType() {
        return (String) this._get(FIELD_AUDITTYPE);
    }

    /**
     * 判断 「文件类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuditType() {
        return this._contains(FIELD_AUDITTYPE);
    }

    /**
     * 重置 「文件类型」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetAuditType() {
        this._reset(FIELD_AUDITTYPE);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
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
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setCreateMan(String val) {
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
    public DataAuditDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setDCSystemId(String val) {
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
    public DataAuditDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setDCSystemName(String val) {
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
    public DataAuditDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「访问日志标识」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setDataAuditId(String val) {
        this._set(FIELD_DATAAUDITID, val);
        return this;
    }

    /**
     * 获取「访问日志标识」值
     *
    */
    @JsonIgnore
    public String getDataAuditId() {
        return (String) this._get(FIELD_DATAAUDITID);
    }

    /**
     * 判断 「访问日志标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDataAuditId() {
        return this._contains(FIELD_DATAAUDITID);
    }

    /**
     * 重置 「访问日志标识」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetDataAuditId() {
        this._reset(FIELD_DATAAUDITID);
        return this;
    }

    /**
     * 设置「访问日志名称」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setDataAuditName(String val) {
        this._set(FIELD_DATAAUDITNAME, val);
        return this;
    }

    /**
     * 获取「访问日志名称」值
     *
    */
    @JsonIgnore
    public String getDataAuditName() {
        return (String) this._get(FIELD_DATAAUDITNAME);
    }

    /**
     * 判断 「访问日志名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDataAuditName() {
        return this._contains(FIELD_DATAAUDITNAME);
    }

    /**
     * 重置 「访问日志名称」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetDataAuditName() {
        this._reset(FIELD_DATAAUDITNAME);
        return this;
    }

    /**
     * 设置「访问地址」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setIPAddress(String val) {
        this._set(FIELD_IPADDRESS, val);
        return this;
    }

    /**
     * 获取「访问地址」值
     *
    */
    @JsonIgnore
    public String getIPAddress() {
        return (String) this._get(FIELD_IPADDRESS);
    }

    /**
     * 判断 「访问地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIPAddress() {
        return this._contains(FIELD_IPADDRESS);
    }

    /**
     * 重置 「访问地址」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetIPAddress() {
        this._reset(FIELD_IPADDRESS);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setOPPersonId(String val) {
        this._set(FIELD_OPPERSONID, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
    */
    @JsonIgnore
    public String getOPPersonId() {
        return (String) this._get(FIELD_OPPERSONID);
    }

    /**
     * 判断 「操作人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOPPersonId() {
        return this._contains(FIELD_OPPERSONID);
    }

    /**
     * 重置 「操作人」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetOPPersonId() {
        this._reset(FIELD_OPPERSONID);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setOPPersonName(String val) {
        this._set(FIELD_OPPERSONNAME, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
    */
    @JsonIgnore
    public String getOPPersonName() {
        return (String) this._get(FIELD_OPPERSONNAME);
    }

    /**
     * 判断 「操作人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOPPersonName() {
        return this._contains(FIELD_OPPERSONNAME);
    }

    /**
     * 重置 「操作人」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetOPPersonName() {
        this._reset(FIELD_OPPERSONNAME);
        return this;
    }

    /**
     * 设置「对象编号」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setObjectId(String val) {
        this._set(FIELD_OBJECTID, val);
        return this;
    }

    /**
     * 获取「对象编号」值
     *
    */
    @JsonIgnore
    public String getObjectId() {
        return (String) this._get(FIELD_OBJECTID);
    }

    /**
     * 判断 「对象编号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsObjectId() {
        return this._contains(FIELD_OBJECTID);
    }

    /**
     * 重置 「对象编号」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetObjectId() {
        this._reset(FIELD_OBJECTID);
        return this;
    }

    /**
     * 设置「对象类型」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setObjectType(String val) {
        this._set(FIELD_OBJECTTYPE, val);
        return this;
    }

    /**
     * 获取「对象类型」值
     *
    */
    @JsonIgnore
    public String getObjectType() {
        return (String) this._get(FIELD_OBJECTTYPE);
    }

    /**
     * 判断 「对象类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsObjectType() {
        return this._contains(FIELD_OBJECTTYPE);
    }

    /**
     * 重置 「对象类型」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetObjectType() {
        this._reset(FIELD_OBJECTTYPE);
        return this;
    }

    /**
     * 设置「访问标识」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setSessionId(String val) {
        this._set(FIELD_SESSIONID, val);
        return this;
    }

    /**
     * 获取「访问标识」值
     *
    */
    @JsonIgnore
    public String getSessionId() {
        return (String) this._get(FIELD_SESSIONID);
    }

    /**
     * 判断 「访问标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSessionId() {
        return this._contains(FIELD_SESSIONID);
    }

    /**
     * 重置 「访问标识」
     *
    */
    @JsonIgnore
    public DataAuditDTO resetSessionId() {
        this._reset(FIELD_SESSIONID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setUpdateDate(Timestamp val) {
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
    public DataAuditDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DataAuditDTO setUpdateMan(String val) {
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
    public DataAuditDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
