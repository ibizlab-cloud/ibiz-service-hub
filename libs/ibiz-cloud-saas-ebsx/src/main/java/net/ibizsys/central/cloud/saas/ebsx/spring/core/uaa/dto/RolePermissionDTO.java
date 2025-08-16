package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 角色权限关系
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/.ibizmodel.index
 */
public class RolePermissionDTO extends EntityDTO {

  /**.
   * 角色权限关系表标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYS_ROLE_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_ROLEPERMISSIONID = "rolepermissionid";

  /**.
   * 角色表标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYS_ROLEID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_ROLEID = "roleid";

  /**.
   * 角色名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYS_ROLENAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_ROLENAME = "rolename";

  /**.
   * 权限表标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYS_PERMISSIONID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONID = "permissionid";

  /**.
   * 权限名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYS_PERMISSIONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONNAME = "permissionname";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 实体名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/ENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 权限标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/PERMISSIONTAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONTAG = "permissiontag";

  /**.
   * 权限类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.PermissionType} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/PERMISSIONTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/PermissionType.ibizmodel.yaml
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONTYPE = "permissiontype";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/PSSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMID = "pssystemid";

  /**.
   * 系统标记
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYSTEMFLAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SYSTEMFLAG = "systemflag";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「角色权限关系表标识」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setRolePermissionId(String val) {
        this._set(FIELD_ROLEPERMISSIONID, val);
        return this;
    }

    /**
     * 获取「角色权限关系表标识」值
     *
    */
    @JsonIgnore
    public String getRolePermissionId() {
        return (String) this._get(FIELD_ROLEPERMISSIONID);
    }

    /**
     * 判断 「角色权限关系表标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRolePermissionId() {
        return this._contains(FIELD_ROLEPERMISSIONID);
    }

    /**
     * 重置 「角色权限关系表标识」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetRolePermissionId() {
        this._reset(FIELD_ROLEPERMISSIONID);
        return this;
    }

    /**
     * 设置「角色表标识」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setRoleId(String val) {
        this._set(FIELD_ROLEID, val);
        return this;
    }

    /**
     * 获取「角色表标识」值
     *
    */
    @JsonIgnore
    public String getRoleId() {
        return (String) this._get(FIELD_ROLEID);
    }

    /**
     * 判断 「角色表标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRoleId() {
        return this._contains(FIELD_ROLEID);
    }

    /**
     * 重置 「角色表标识」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetRoleId() {
        this._reset(FIELD_ROLEID);
        return this;
    }

    /**
     * 设置「角色名称」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setRoleName(String val) {
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
    public RolePermissionDTO resetRoleName() {
        this._reset(FIELD_ROLENAME);
        return this;
    }

    /**
     * 设置「权限表标识」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setPermissionId(String val) {
        this._set(FIELD_PERMISSIONID, val);
        return this;
    }

    /**
     * 获取「权限表标识」值
     *
    */
    @JsonIgnore
    public String getPermissionId() {
        return (String) this._get(FIELD_PERMISSIONID);
    }

    /**
     * 判断 「权限表标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionId() {
        return this._contains(FIELD_PERMISSIONID);
    }

    /**
     * 重置 「权限表标识」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetPermissionId() {
        this._reset(FIELD_PERMISSIONID);
        return this;
    }

    /**
     * 设置「权限名称」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setPermissionName(String val) {
        this._set(FIELD_PERMISSIONNAME, val);
        return this;
    }

    /**
     * 获取「权限名称」值
     *
    */
    @JsonIgnore
    public String getPermissionName() {
        return (String) this._get(FIELD_PERMISSIONNAME);
    }

    /**
     * 判断 「权限名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionName() {
        return this._contains(FIELD_PERMISSIONNAME);
    }

    /**
     * 重置 「权限名称」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetPermissionName() {
        this._reset(FIELD_PERMISSIONNAME);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setDCSystemName(String val) {
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
    public RolePermissionDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「实体名」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setEntityName(String val) {
        this._set(FIELD_ENTITYNAME, val);
        return this;
    }

    /**
     * 获取「实体名」值
     *
    */
    @JsonIgnore
    public String getEntityName() {
        return (String) this._get(FIELD_ENTITYNAME);
    }

    /**
     * 判断 「实体名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityName() {
        return this._contains(FIELD_ENTITYNAME);
    }

    /**
     * 重置 「实体名」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「权限标识」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setPermissionTag(String val) {
        this._set(FIELD_PERMISSIONTAG, val);
        return this;
    }

    /**
     * 获取「权限标识」值
     *
    */
    @JsonIgnore
    public String getPermissionTag() {
        return (String) this._get(FIELD_PERMISSIONTAG);
    }

    /**
     * 判断 「权限标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionTag() {
        return this._contains(FIELD_PERMISSIONTAG);
    }

    /**
     * 重置 「权限标识」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetPermissionTag() {
        this._reset(FIELD_PERMISSIONTAG);
        return this;
    }

    /**
     * 设置「权限类型」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setPermissionType(String val) {
        this._set(FIELD_PERMISSIONTYPE, val);
        return this;
    }

    /**
     * 获取「权限类型」值
     *
    */
    @JsonIgnore
    public String getPermissionType() {
        return (String) this._get(FIELD_PERMISSIONTYPE);
    }

    /**
     * 判断 「权限类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionType() {
        return this._contains(FIELD_PERMISSIONTYPE);
    }

    /**
     * 重置 「权限类型」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetPermissionType() {
        this._reset(FIELD_PERMISSIONTYPE);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setCreateDate(Timestamp val) {
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
    public RolePermissionDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setUpdateDate(Timestamp val) {
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
    public RolePermissionDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setCreateMan(String val) {
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
    public RolePermissionDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setIsValid(Integer val) {
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
    public RolePermissionDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setPSSYSTEMID(String val) {
        this._set(FIELD_PSSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getPSSYSTEMID() {
        return (String) this._get(FIELD_PSSYSTEMID);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSYSTEMID() {
        return this._contains(FIELD_PSSYSTEMID);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetPSSYSTEMID() {
        this._reset(FIELD_PSSYSTEMID);
        return this;
    }

    /**
     * 设置「系统标记」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setSystemFlag(Integer val) {
        this._set(FIELD_SYSTEMFLAG, val);
        return this;
    }

    /**
     * 获取「系统标记」值
     *
    */
    @JsonIgnore
    public Integer getSystemFlag() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SYSTEMFLAG),null);
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
        return this._contains(FIELD_SYSTEMFLAG);
    }

    /**
     * 重置 「系统标记」
     *
    */
    @JsonIgnore
    public RolePermissionDTO resetSystemFlag() {
        this._reset(FIELD_SYSTEMFLAG);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionDTO setUpdateMan(String val) {
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
    public RolePermissionDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
