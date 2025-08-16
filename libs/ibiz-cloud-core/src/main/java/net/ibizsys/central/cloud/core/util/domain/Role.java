package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 系统角色
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/.ibizmodel.index
 */
public class Role extends EntityBase {

  /**.
   * 角色标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_ROLEID = "roleid";

  /**.
   * 角色名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/SYS_ROLENAME/.ibizmodel.index
   */
  public final static String FIELD_ROLENAME = "rolename";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 父角色标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/PROLEID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/minorpsders/DER1N_SYS_ROLE_SYS_ROLE_PROLEID/.ibizmodel.index
   */
  public final static String FIELD_PROLEID = "proleid";

  /**.
   * 父角色名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/PROLENAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/minorpsders/DER1N_SYS_ROLE_SYS_ROLE_PROLEID/.ibizmodel.index
   */
  public final static String FIELD_PROLENAME = "prolename";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 授权全部用户
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/AUTHORIZEALL/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_AUTHORIZEALL = "authorizeall";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/minorpsders/DER1N_SYS_ROLE_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/minorpsders/DER1N_SYS_ROLE_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 全局标记
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/GLOBALFLAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_GLOBALFLAG = "globalflag";

  /**.
   * 角色标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/ROLETAG/.ibizmodel.index
   */
  public final static String FIELD_ROLETAG = "roletag";

  /**.
   * 系统标记
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/SYSTEMFLAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SYSTEMFLAG = "systemflag";

  /**.
   * 用户模式
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.UserMode} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE/psdefields/USERMODE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/UserMode.ibizmodel.yaml
   */
  public final static String FIELD_USERMODE = "usermode";


    /**
     * 设置「角色标识」
     *
     * @param val
    */
    @JsonIgnore
    public Role setRoleId(String val) {
        this.set(FIELD_ROLEID, val);
        return this;
    }

    /**
     * 获取「角色标识」值
     *
    */
    @JsonIgnore
    public String getRoleId() {
        return (String) this.get(FIELD_ROLEID);
    }

    /**
     * 判断 「角色标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRoleId() {
        return this.contains(FIELD_ROLEID);
    }

    /**
     * 重置 「角色标识」
     *
    */
    @JsonIgnore
    public Role resetRoleId() {
        this.reset(FIELD_ROLEID);
        return this;
    }

    /**
     * 设置「角色名称」
     *
     * @param val
    */
    @JsonIgnore
    public Role setRoleName(String val) {
        this.set(FIELD_ROLENAME, val);
        return this;
    }

    /**
     * 获取「角色名称」值
     *
    */
    @JsonIgnore
    public String getRoleName() {
        return (String) this.get(FIELD_ROLENAME);
    }

    /**
     * 判断 「角色名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRoleName() {
        return this.contains(FIELD_ROLENAME);
    }

    /**
     * 重置 「角色名称」
     *
    */
    @JsonIgnore
    public Role resetRoleName() {
        this.reset(FIELD_ROLENAME);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public Role setMemo(String val) {
        this.set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this.get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this.contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public Role resetMemo() {
        this.reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「父角色标识」
     *
     * @param val
    */
    @JsonIgnore
    public Role setPRoleId(String val) {
        this.set(FIELD_PROLEID, val);
        return this;
    }

    /**
     * 获取「父角色标识」值
     *
    */
    @JsonIgnore
    public String getPRoleId() {
        return (String) this.get(FIELD_PROLEID);
    }

    /**
     * 判断 「父角色标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPRoleId() {
        return this.contains(FIELD_PROLEID);
    }

    /**
     * 重置 「父角色标识」
     *
    */
    @JsonIgnore
    public Role resetPRoleId() {
        this.reset(FIELD_PROLEID);
        return this;
    }

    /**
     * 设置「父角色名称」
     *
     * @param val
    */
    @JsonIgnore
    public Role setPRoleName(String val) {
        this.set(FIELD_PROLENAME, val);
        return this;
    }

    /**
     * 获取「父角色名称」值
     *
    */
    @JsonIgnore
    public String getPRoleName() {
        return (String) this.get(FIELD_PROLENAME);
    }

    /**
     * 判断 「父角色名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPRoleName() {
        return this.contains(FIELD_PROLENAME);
    }

    /**
     * 重置 「父角色名称」
     *
    */
    @JsonIgnore
    public Role resetPRoleName() {
        this.reset(FIELD_PROLENAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public Role setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
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
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public Role resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public Role setUpdateDate(Timestamp val) {
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
    public Role resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public Role setCreateMan(String val) {
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
    public Role resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public Role setUpdateMan(String val) {
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
    public Role resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「授权全部用户」
     *
     * @param val
    */
    @JsonIgnore
    public Role setAuthorizeAll(Integer val) {
        this.set(FIELD_AUTHORIZEALL, val);
        return this;
    }

    /**
     * 获取「授权全部用户」值
     *
    */
    @JsonIgnore
    public Integer getAuthorizeAll() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_AUTHORIZEALL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「授权全部用户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuthorizeAll() {
        return this.contains(FIELD_AUTHORIZEALL);
    }

    /**
     * 重置 「授权全部用户」
     *
    */
    @JsonIgnore
    public Role resetAuthorizeAll() {
        this.reset(FIELD_AUTHORIZEALL);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public Role setDCSystemId(String val) {
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
    public Role resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public Role setDCSystemName(String val) {
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
    public Role resetDCSystemName() {
        this.reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「全局标记」
     *
     * @param val
    */
    @JsonIgnore
    public Role setGlobalFlag(Integer val) {
        this.set(FIELD_GLOBALFLAG, val);
        return this;
    }

    /**
     * 获取「全局标记」值
     *
    */
    @JsonIgnore
    public Integer getGlobalFlag() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_GLOBALFLAG),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「全局标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsGlobalFlag() {
        return this.contains(FIELD_GLOBALFLAG);
    }

    /**
     * 重置 「全局标记」
     *
    */
    @JsonIgnore
    public Role resetGlobalFlag() {
        this.reset(FIELD_GLOBALFLAG);
        return this;
    }

    /**
     * 设置「角色标识」
     *
     * @param val
    */
    @JsonIgnore
    public Role setRoleTag(String val) {
        this.set(FIELD_ROLETAG, val);
        return this;
    }

    /**
     * 获取「角色标识」值
     *
    */
    @JsonIgnore
    public String getRoleTag() {
        return (String) this.get(FIELD_ROLETAG);
    }

    /**
     * 判断 「角色标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRoleTag() {
        return this.contains(FIELD_ROLETAG);
    }

    /**
     * 重置 「角色标识」
     *
    */
    @JsonIgnore
    public Role resetRoleTag() {
        this.reset(FIELD_ROLETAG);
        return this;
    }

    /**
     * 设置「系统标记」
     *
     * @param val
    */
    @JsonIgnore
    public Role setSystemFlag(Integer val) {
        this.set(FIELD_SYSTEMFLAG, val);
        return this;
    }

    /**
     * 获取「系统标记」值
     *
    */
    @JsonIgnore
    public Integer getSystemFlag() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_SYSTEMFLAG),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「系统标记」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemFlag() {
        return this.contains(FIELD_SYSTEMFLAG);
    }

    /**
     * 重置 「系统标记」
     *
    */
    @JsonIgnore
    public Role resetSystemFlag() {
        this.reset(FIELD_SYSTEMFLAG);
        return this;
    }

    /**
     * 设置「用户模式」
     *
     * @param val
    */
    @JsonIgnore
    public Role setUserMode(String val) {
        this.set(FIELD_USERMODE, val);
        return this;
    }

    /**
     * 获取「用户模式」值
     *
    */
    @JsonIgnore
    public String getUserMode() {
        return (String) this.get(FIELD_USERMODE);
    }

    /**
     * 判断 「用户模式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserMode() {
        return this.contains(FIELD_USERMODE);
    }

    /**
     * 重置 「用户模式」
     *
    */
    @JsonIgnore
    public Role resetUserMode() {
        this.reset(FIELD_USERMODE);
        return this;
    }


}
