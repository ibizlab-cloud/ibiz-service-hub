package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 用户角色关系
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/.ibizmodel.index
 */
public class UserRoleDTO extends EntityDTO {

  /**.
   * 用户角色关系标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/SYS_USER_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_USERROLEID = "userroleid";

  /**.
   * 角色
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/SYS_ROLEID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_ROLEID = "roleid";

  /**.
   * 角色名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/SYS_ROLENAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_ROLENAME = "rolename";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/USERID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 用户名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/PERSONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 登录名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/LOGINNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_LOGINNAME = "loginname";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 主部门标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/MDEPTID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTID = "mdeptid";

  /**.
   * 主部门
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/MDEPTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTNAME = "mdeptname";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 创建人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/CREATEMANNAME/.ibizmodel.index
   */
  public final static String FIELD_CREATEMANNAME = "createmanname";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 全局标记
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/GLOBALFLAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_GLOBALFLAG = "globalflag";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 角色标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/ROLETAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_ROLETAG = "roletag";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/SHOWORDER/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/UPDATEMANNAME/.ibizmodel.index
   */
  public final static String FIELD_UPDATEMANNAME = "updatemanname";

  /**.
   * 用户模式
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.UserMode} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/psdefields/USERMODE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/UserMode.ibizmodel.yaml
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER_ROLE/minorpsders/DER1N_SYS_USER_ROLE_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_USERMODE = "usermode";


    /**
     * 设置「用户角色关系标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setUserRoleId(String val) {
        this._set(FIELD_USERROLEID, val);
        return this;
    }

    /**
     * 获取「用户角色关系标识」值
     *
    */
    @JsonIgnore
    public String getUserRoleId() {
        return (String) this._get(FIELD_USERROLEID);
    }

    /**
     * 判断 「用户角色关系标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserRoleId() {
        return this._contains(FIELD_USERROLEID);
    }

    /**
     * 重置 「用户角色关系标识」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetUserRoleId() {
        this._reset(FIELD_USERROLEID);
        return this;
    }

    /**
     * 设置「角色」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setRoleId(String val) {
        this._set(FIELD_ROLEID, val);
        return this;
    }

    /**
     * 获取「角色」值
     *
    */
    @JsonIgnore
    public String getRoleId() {
        return (String) this._get(FIELD_ROLEID);
    }

    /**
     * 判断 「角色」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRoleId() {
        return this._contains(FIELD_ROLEID);
    }

    /**
     * 重置 「角色」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetRoleId() {
        this._reset(FIELD_ROLEID);
        return this;
    }

    /**
     * 设置「角色名称」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setRoleName(String val) {
        this._set(FIELD_ROLENAME, val);
        return this;
    }

    /**
     * 获取「角色名称」值
     *
    */
    @JsonIgnore
    public String getRoleName() {
        return (String) this._get(FIELD_ROLENAME);
    }

    /**
     * 判断 「角色名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRoleName() {
        return this._contains(FIELD_ROLENAME);
    }

    /**
     * 重置 「角色名称」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetRoleName() {
        this._reset(FIELD_ROLENAME);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setUserId(String val) {
        this._set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this._get(FIELD_USERID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USERID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「用户名称」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「用户名称」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this._get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「用户名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「用户名称」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「登录名」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setLoginName(String val) {
        this._set(FIELD_LOGINNAME, val);
        return this;
    }

    /**
     * 获取「登录名」值
     *
    */
    @JsonIgnore
    public String getLoginName() {
        return (String) this._get(FIELD_LOGINNAME);
    }

    /**
     * 判断 「登录名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLoginName() {
        return this._contains(FIELD_LOGINNAME);
    }

    /**
     * 重置 「登录名」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetLoginName() {
        this._reset(FIELD_LOGINNAME);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位标识」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「主部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setMDeptId(String val) {
        this._set(FIELD_MDEPTID, val);
        return this;
    }

    /**
     * 获取「主部门标识」值
     *
    */
    @JsonIgnore
    public String getMDeptId() {
        return (String) this._get(FIELD_MDEPTID);
    }

    /**
     * 判断 「主部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptId() {
        return this._contains(FIELD_MDEPTID);
    }

    /**
     * 重置 「主部门标识」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetMDeptId() {
        this._reset(FIELD_MDEPTID);
        return this;
    }

    /**
     * 设置「主部门」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setMDeptName(String val) {
        this._set(FIELD_MDEPTNAME, val);
        return this;
    }

    /**
     * 获取「主部门」值
     *
    */
    @JsonIgnore
    public String getMDeptName() {
        return (String) this._get(FIELD_MDEPTNAME);
    }

    /**
     * 判断 「主部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptName() {
        return this._contains(FIELD_MDEPTNAME);
    }

    /**
     * 重置 「主部门」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetMDeptName() {
        this._reset(FIELD_MDEPTNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setCreateDate(Timestamp val) {
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
    public UserRoleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setUpdateDate(Timestamp val) {
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
    public UserRoleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setCreateMan(String val) {
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
    public UserRoleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「创建人」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setCreateManName(String val) {
        this._set(FIELD_CREATEMANNAME, val);
        return this;
    }

    /**
     * 获取「创建人」值
     *
    */
    @JsonIgnore
    public String getCreateManName() {
        return (String) this._get(FIELD_CREATEMANNAME);
    }

    /**
     * 判断 「创建人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateManName() {
        return this._contains(FIELD_CREATEMANNAME);
    }

    /**
     * 重置 「创建人」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetCreateManName() {
        this._reset(FIELD_CREATEMANNAME);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setDCSystemName(String val) {
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
    public UserRoleDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「全局标记」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setGlobalFlag(Integer val) {
        this._set(FIELD_GLOBALFLAG, val);
        return this;
    }

    /**
     * 获取「全局标记」值
     *
    */
    @JsonIgnore
    public Integer getGlobalFlag() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_GLOBALFLAG),null);
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
        return this._contains(FIELD_GLOBALFLAG);
    }

    /**
     * 重置 「全局标记」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetGlobalFlag() {
        this._reset(FIELD_GLOBALFLAG);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setIsValid(Integer val) {
        this._set(FIELD_ISVALID, val);
        return this;
    }

    /**
     * 获取「启用标志」值
     *
    */
    @JsonIgnore
    public Integer getIsValid() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISVALID),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用标志」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsValid() {
        return this._contains(FIELD_ISVALID);
    }

    /**
     * 重置 「启用标志」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「角色标识」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setRoleTag(String val) {
        this._set(FIELD_ROLETAG, val);
        return this;
    }

    /**
     * 获取「角色标识」值
     *
    */
    @JsonIgnore
    public String getRoleTag() {
        return (String) this._get(FIELD_ROLETAG);
    }

    /**
     * 判断 「角色标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRoleTag() {
        return this._contains(FIELD_ROLETAG);
    }

    /**
     * 重置 「角色标识」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetRoleTag() {
        this._reset(FIELD_ROLETAG);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setShowOrder(Integer val) {
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
    public UserRoleDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setUpdateMan(String val) {
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
    public UserRoleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setUpdateManName(String val) {
        this._set(FIELD_UPDATEMANNAME, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateManName() {
        return (String) this._get(FIELD_UPDATEMANNAME);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateManName() {
        return this._contains(FIELD_UPDATEMANNAME);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetUpdateManName() {
        this._reset(FIELD_UPDATEMANNAME);
        return this;
    }

    /**
     * 设置「用户模式」
     *
     * @param val
    */
    @JsonIgnore
    public UserRoleDTO setUserMode(String val) {
        this._set(FIELD_USERMODE, val);
        return this;
    }

    /**
     * 获取「用户模式」值
     *
    */
    @JsonIgnore
    public String getUserMode() {
        return (String) this._get(FIELD_USERMODE);
    }

    /**
     * 判断 「用户模式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserMode() {
        return this._contains(FIELD_USERMODE);
    }

    /**
     * 重置 「用户模式」
     *
    */
    @JsonIgnore
    public UserRoleDTO resetUserMode() {
        this._reset(FIELD_USERMODE);
        return this;
    }


}
