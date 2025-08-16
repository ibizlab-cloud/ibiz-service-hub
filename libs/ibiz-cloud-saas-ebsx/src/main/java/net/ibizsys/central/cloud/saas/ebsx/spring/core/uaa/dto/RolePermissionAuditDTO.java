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
public class RolePermissionAuditDTO extends EntityDTO {

  /**.
   * 角色表标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYS_ROLEID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_ROLE_SYS_ROLEID/.ibizmodel.index
   */
  public final static String FIELD_ROLEID = "roleid";

  /**.
   * 权限表标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYS_PERMISSIONID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/minorpsders/DER1N_SYS_ROLE_PERMISSION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONID = "permissionid";

  /**.
   * 启用标志
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/ISVALID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISVALID = "isvalid";

  /**.
   * 系统标记
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ROLE_PERMISSION/psdefields/SYSTEMFLAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SYSTEMFLAG = "systemflag";


    /**
     * 设置「角色表标识」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionAuditDTO setRoleId(String val) {
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
    public RolePermissionAuditDTO resetRoleId() {
        this._reset(FIELD_ROLEID);
        return this;
    }

    /**
     * 设置「权限表标识」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionAuditDTO setPermissionId(String val) {
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
    public RolePermissionAuditDTO resetPermissionId() {
        this._reset(FIELD_PERMISSIONID);
        return this;
    }

    /**
     * 设置「启用标志」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionAuditDTO setIsValid(Integer val) {
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
    public RolePermissionAuditDTO resetIsValid() {
        this._reset(FIELD_ISVALID);
        return this;
    }

    /**
     * 设置「系统标记」
     *
     * @param val
    */
    @JsonIgnore
    public RolePermissionAuditDTO setSystemFlag(Integer val) {
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
    public RolePermissionAuditDTO resetSystemFlag() {
        this._reset(FIELD_SYSTEMFLAG);
        return this;
    }


}
