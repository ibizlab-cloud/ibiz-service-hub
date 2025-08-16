package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 权限操作
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/.ibizmodel.index
 */
public class PermissionActionDTO extends EntityDTO {

  /**.
   * 操作标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdefields/SYS_PERMISSION_ACTIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONACTIONID = "permissionactionid";

  /**.
   * 操作名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdefields/SYS_PERMISSION_ACTIONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONACTIONNAME = "permissionactionname";

  /**.
   * 业务数据范围
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdefields/BSCOPE/.ibizmodel.index
   */
  public final static String FIELD_BSCOPE = "bscope";

  /**.
   * 操作标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdefields/OPPRIV/.ibizmodel.index
   */
  public final static String FIELD_OPPRIV = "oppriv";

  /**.
   * 资源标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdefields/SYS_PERMISSIONID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/minorpsders/DER1N_SYS_PERMISSION_ACTION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONID = "permissionid";

  /**.
   * 资源名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdefields/SYS_PERMISSIONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/minorpsders/DER1N_SYS_PERMISSION_ACTION_SYS_PERMISSION_SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONNAME = "permissionname";

  /**.
   * 系统标记
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION_ACTION/psdefields/SYSTEMFLAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SYSTEMFLAG = "systemflag";


    /**
     * 设置「操作标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionActionDTO setPermissionActionId(String val) {
        this._set(FIELD_PERMISSIONACTIONID, val);
        return this;
    }

    /**
     * 获取「操作标识」值
     *
    */
    @JsonIgnore
    public String getPermissionActionId() {
        return (String) this._get(FIELD_PERMISSIONACTIONID);
    }

    /**
     * 判断 「操作标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionActionId() {
        return this._contains(FIELD_PERMISSIONACTIONID);
    }

    /**
     * 重置 「操作标识」
     *
    */
    @JsonIgnore
    public PermissionActionDTO resetPermissionActionId() {
        this._reset(FIELD_PERMISSIONACTIONID);
        return this;
    }

    /**
     * 设置「操作名称」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionActionDTO setPermissionActionName(String val) {
        this._set(FIELD_PERMISSIONACTIONNAME, val);
        return this;
    }

    /**
     * 获取「操作名称」值
     *
    */
    @JsonIgnore
    public String getPermissionActionName() {
        return (String) this._get(FIELD_PERMISSIONACTIONNAME);
    }

    /**
     * 判断 「操作名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionActionName() {
        return this._contains(FIELD_PERMISSIONACTIONNAME);
    }

    /**
     * 重置 「操作名称」
     *
    */
    @JsonIgnore
    public PermissionActionDTO resetPermissionActionName() {
        this._reset(FIELD_PERMISSIONACTIONNAME);
        return this;
    }

    /**
     * 设置「业务数据范围」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionActionDTO setBScope(String val) {
        this._set(FIELD_BSCOPE, val);
        return this;
    }

    /**
     * 获取「业务数据范围」值
     *
    */
    @JsonIgnore
    public String getBScope() {
        return (String) this._get(FIELD_BSCOPE);
    }

    /**
     * 判断 「业务数据范围」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBScope() {
        return this._contains(FIELD_BSCOPE);
    }

    /**
     * 重置 「业务数据范围」
     *
    */
    @JsonIgnore
    public PermissionActionDTO resetBScope() {
        this._reset(FIELD_BSCOPE);
        return this;
    }

    /**
     * 设置「操作标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionActionDTO setOPPriv(String val) {
        this._set(FIELD_OPPRIV, val);
        return this;
    }

    /**
     * 获取「操作标识」值
     *
    */
    @JsonIgnore
    public String getOPPriv() {
        return (String) this._get(FIELD_OPPRIV);
    }

    /**
     * 判断 「操作标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOPPriv() {
        return this._contains(FIELD_OPPRIV);
    }

    /**
     * 重置 「操作标识」
     *
    */
    @JsonIgnore
    public PermissionActionDTO resetOPPriv() {
        this._reset(FIELD_OPPRIV);
        return this;
    }

    /**
     * 设置「资源标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionActionDTO setPermissionId(String val) {
        this._set(FIELD_PERMISSIONID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
    */
    @JsonIgnore
    public String getPermissionId() {
        return (String) this._get(FIELD_PERMISSIONID);
    }

    /**
     * 判断 「资源标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionId() {
        return this._contains(FIELD_PERMISSIONID);
    }

    /**
     * 重置 「资源标识」
     *
    */
    @JsonIgnore
    public PermissionActionDTO resetPermissionId() {
        this._reset(FIELD_PERMISSIONID);
        return this;
    }

    /**
     * 设置「资源名称」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionActionDTO setPermissionName(String val) {
        this._set(FIELD_PERMISSIONNAME, val);
        return this;
    }

    /**
     * 获取「资源名称」值
     *
    */
    @JsonIgnore
    public String getPermissionName() {
        return (String) this._get(FIELD_PERMISSIONNAME);
    }

    /**
     * 判断 「资源名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionName() {
        return this._contains(FIELD_PERMISSIONNAME);
    }

    /**
     * 重置 「资源名称」
     *
    */
    @JsonIgnore
    public PermissionActionDTO resetPermissionName() {
        this._reset(FIELD_PERMISSIONNAME);
        return this;
    }

    /**
     * 设置「系统标记」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionActionDTO setSystemFlag(Integer val) {
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
    public PermissionActionDTO resetSystemFlag() {
        this._reset(FIELD_SYSTEMFLAG);
        return this;
    }


}
