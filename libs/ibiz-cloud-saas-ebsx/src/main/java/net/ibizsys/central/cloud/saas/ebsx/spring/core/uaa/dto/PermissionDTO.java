package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 权限/资源
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/.ibizmodel.index
 */
public class PermissionDTO extends EntityDTO {

  /**.
   * 资源标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/SYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONID = "permissionid";

  /**.
   * 资源名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/SYS_PERMISSIONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONNAME = "permissionname";

  /**.
   * 权限标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/PERMISSIONTAG/.ibizmodel.index
   */
  public final static String FIELD_PERMISSIONTAG = "permissiontag";

  /**.
   * 权限类别
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.PermissionType} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/PERMISSIONTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/PermissionType.ibizmodel.yaml
   */
  public final static String FIELD_PERMISSIONTYPE = "permissiontype";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/PSSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/minorpsders/DER1N_SYS_PERMISSION_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_PSSYSTEMID = "pssystemid";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 业务数据范围
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/BSCOPE/.ibizmodel.index
   */
  public final static String FIELD_BSCOPE = "bscope";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/minorpsders/DER1N_SYS_PERMISSION_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/minorpsders/DER1N_SYS_PERMISSION_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 部门业务代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/DEPTBC/.ibizmodel.index
   */
  public final static String FIELD_DEPTBC = "deptbc";

  /**.
   * 部门数据范围
   * 20210811:bigint->int
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.DR} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/DEPTDR/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/DR.ibizmodel.yaml
   */
  public final static String FIELD_DEPTDR = "deptdr";

  /**.
   * 实例标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/DYNAINSTID/.ibizmodel.index
   */
  public final static String FIELD_DYNAINSTID = "dynainstid";

  /**.
   * 启用部门代码
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/ENABLEDEPTBC/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ENABLEDEPTBC = "enabledeptbc";

  /**.
   * 启用部门范围
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/ENABLEDEPTDR/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ENABLEDEPTDR = "enabledeptdr";

  /**.
   * 启用机构范围
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/ENABLEORGDR/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ENABLEORGDR = "enableorgdr";

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/ENTITYID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/minorpsders/DER1N_SYS_PERMISSION_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 实体名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/ENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/minorpsders/DER1N_SYS_PERMISSION_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 全部数据
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/ISALLDATA/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_ISALLDATA = "isalldata";

  /**.
   * 机构数据范围
   * 20210811:bigint->int
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.DR} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/ORGDR/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/DR.ibizmodel.yaml
   */
  public final static String FIELD_ORGDR = "orgdr";

  /**.
   * 资源标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/PSYS_PERMISSIONID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/minorpsders/DER1N_SYS_PERMISSION_SYS_PERMISSION_PSYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PPERMISSIONID = "ppermissionid";

  /**.
   * 权限名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/PSYS_PERMISSIONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/minorpsders/DER1N_SYS_PERMISSION_SYS_PERMISSION_PSYS_PERMISSIONID/.ibizmodel.index
   */
  public final static String FIELD_PPERMISSIONNAME = "ppermissionname";

  /**.
   * 系统标记
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/SYSTEMFLAG/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SYSTEMFLAG = "systemflag";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_PERMISSION/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「资源标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setPermissionId(String val) {
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
    public PermissionDTO resetPermissionId() {
        this._reset(FIELD_PERMISSIONID);
        return this;
    }

    /**
     * 设置「资源名称」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setPermissionName(String val) {
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
    public PermissionDTO resetPermissionName() {
        this._reset(FIELD_PERMISSIONNAME);
        return this;
    }

    /**
     * 设置「权限标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setPermissionTag(String val) {
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
    public PermissionDTO resetPermissionTag() {
        this._reset(FIELD_PERMISSIONTAG);
        return this;
    }

    /**
     * 设置「权限类别」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setPermissionType(String val) {
        this._set(FIELD_PERMISSIONTYPE, val);
        return this;
    }

    /**
     * 获取「权限类别」值
     *
    */
    @JsonIgnore
    public String getPermissionType() {
        return (String) this._get(FIELD_PERMISSIONTYPE);
    }

    /**
     * 判断 「权限类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPermissionType() {
        return this._contains(FIELD_PERMISSIONTYPE);
    }

    /**
     * 重置 「权限类别」
     *
    */
    @JsonIgnore
    public PermissionDTO resetPermissionType() {
        this._reset(FIELD_PERMISSIONTYPE);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setPSSystemId(String val) {
        this._set(FIELD_PSSYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getPSSystemId() {
        return (String) this._get(FIELD_PSSYSTEMID);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPSSystemId() {
        return this._contains(FIELD_PSSYSTEMID);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public PermissionDTO resetPSSystemId() {
        this._reset(FIELD_PSSYSTEMID);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setCreateDate(Timestamp val) {
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
    public PermissionDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setUpdateDate(Timestamp val) {
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
    public PermissionDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「业务数据范围」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setBScope(String val) {
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
    public PermissionDTO resetBScope() {
        this._reset(FIELD_BSCOPE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setCreateMan(String val) {
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
    public PermissionDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setDCSystemId(String val) {
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
    public PermissionDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setDCSystemName(String val) {
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
    public PermissionDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「部门业务代码」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setDeptBC(String val) {
        this._set(FIELD_DEPTBC, val);
        return this;
    }

    /**
     * 获取「部门业务代码」值
     *
    */
    @JsonIgnore
    public String getDeptBC() {
        return (String) this._get(FIELD_DEPTBC);
    }

    /**
     * 判断 「部门业务代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptBC() {
        return this._contains(FIELD_DEPTBC);
    }

    /**
     * 重置 「部门业务代码」
     *
    */
    @JsonIgnore
    public PermissionDTO resetDeptBC() {
        this._reset(FIELD_DEPTBC);
        return this;
    }

    /**
     * 设置「部门数据范围」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setDeptDR(Long val) {
        this._set(FIELD_DEPTDR, val);
        return this;
    }

    /**
     * 获取「部门数据范围」值
     *
    */
    @JsonIgnore
    public Long getDeptDR() {
        try{
            return DataTypeUtils.getLongValue(this._get(FIELD_DEPTDR),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「部门数据范围」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptDR() {
        return this._contains(FIELD_DEPTDR);
    }

    /**
     * 重置 「部门数据范围」
     *
    */
    @JsonIgnore
    public PermissionDTO resetDeptDR() {
        this._reset(FIELD_DEPTDR);
        return this;
    }

    /**
     * 设置「实例标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setDynaInstId(String val) {
        this._set(FIELD_DYNAINSTID, val);
        return this;
    }

    /**
     * 获取「实例标识」值
     *
    */
    @JsonIgnore
    public String getDynaInstId() {
        return (String) this._get(FIELD_DYNAINSTID);
    }

    /**
     * 判断 「实例标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDynaInstId() {
        return this._contains(FIELD_DYNAINSTID);
    }

    /**
     * 重置 「实例标识」
     *
    */
    @JsonIgnore
    public PermissionDTO resetDynaInstId() {
        this._reset(FIELD_DYNAINSTID);
        return this;
    }

    /**
     * 设置「启用部门代码」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setEnableDeptBC(Integer val) {
        this._set(FIELD_ENABLEDEPTBC, val);
        return this;
    }

    /**
     * 获取「启用部门代码」值
     *
    */
    @JsonIgnore
    public Integer getEnableDeptBC() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ENABLEDEPTBC),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用部门代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEnableDeptBC() {
        return this._contains(FIELD_ENABLEDEPTBC);
    }

    /**
     * 重置 「启用部门代码」
     *
    */
    @JsonIgnore
    public PermissionDTO resetEnableDeptBC() {
        this._reset(FIELD_ENABLEDEPTBC);
        return this;
    }

    /**
     * 设置「启用部门范围」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setEnableDeptDR(Integer val) {
        this._set(FIELD_ENABLEDEPTDR, val);
        return this;
    }

    /**
     * 获取「启用部门范围」值
     *
    */
    @JsonIgnore
    public Integer getEnableDeptDR() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ENABLEDEPTDR),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用部门范围」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEnableDeptDR() {
        return this._contains(FIELD_ENABLEDEPTDR);
    }

    /**
     * 重置 「启用部门范围」
     *
    */
    @JsonIgnore
    public PermissionDTO resetEnableDeptDR() {
        this._reset(FIELD_ENABLEDEPTDR);
        return this;
    }

    /**
     * 设置「启用机构范围」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setEnableOrgDR(Integer val) {
        this._set(FIELD_ENABLEORGDR, val);
        return this;
    }

    /**
     * 获取「启用机构范围」值
     *
    */
    @JsonIgnore
    public Integer getEnableOrgDR() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ENABLEORGDR),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「启用机构范围」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEnableOrgDR() {
        return this._contains(FIELD_ENABLEORGDR);
    }

    /**
     * 重置 「启用机构范围」
     *
    */
    @JsonIgnore
    public PermissionDTO resetEnableOrgDR() {
        this._reset(FIELD_ENABLEORGDR);
        return this;
    }

    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setEntityId(String val) {
        this._set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this._get(FIELD_ENTITYID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this._contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public PermissionDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「实体名」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setEntityName(String val) {
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
    public PermissionDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「全部数据」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setIsAllData(Integer val) {
        this._set(FIELD_ISALLDATA, val);
        return this;
    }

    /**
     * 获取「全部数据」值
     *
    */
    @JsonIgnore
    public Integer getIsAllData() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_ISALLDATA),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「全部数据」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIsAllData() {
        return this._contains(FIELD_ISALLDATA);
    }

    /**
     * 重置 「全部数据」
     *
    */
    @JsonIgnore
    public PermissionDTO resetIsAllData() {
        this._reset(FIELD_ISALLDATA);
        return this;
    }

    /**
     * 设置「机构数据范围」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setOrgDR(Long val) {
        this._set(FIELD_ORGDR, val);
        return this;
    }

    /**
     * 获取「机构数据范围」值
     *
    */
    @JsonIgnore
    public Long getOrgDR() {
        try{
            return DataTypeUtils.getLongValue(this._get(FIELD_ORGDR),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「机构数据范围」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgDR() {
        return this._contains(FIELD_ORGDR);
    }

    /**
     * 重置 「机构数据范围」
     *
    */
    @JsonIgnore
    public PermissionDTO resetOrgDR() {
        this._reset(FIELD_ORGDR);
        return this;
    }

    /**
     * 设置「资源标识」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setPPermissionId(String val) {
        this._set(FIELD_PPERMISSIONID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
    */
    @JsonIgnore
    public String getPPermissionId() {
        return (String) this._get(FIELD_PPERMISSIONID);
    }

    /**
     * 判断 「资源标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPPermissionId() {
        return this._contains(FIELD_PPERMISSIONID);
    }

    /**
     * 重置 「资源标识」
     *
    */
    @JsonIgnore
    public PermissionDTO resetPPermissionId() {
        this._reset(FIELD_PPERMISSIONID);
        return this;
    }

    /**
     * 设置「权限名称」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setPPermissionName(String val) {
        this._set(FIELD_PPERMISSIONNAME, val);
        return this;
    }

    /**
     * 获取「权限名称」值
     *
    */
    @JsonIgnore
    public String getPPermissionName() {
        return (String) this._get(FIELD_PPERMISSIONNAME);
    }

    /**
     * 判断 「权限名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPPermissionName() {
        return this._contains(FIELD_PPERMISSIONNAME);
    }

    /**
     * 重置 「权限名称」
     *
    */
    @JsonIgnore
    public PermissionDTO resetPPermissionName() {
        this._reset(FIELD_PPERMISSIONNAME);
        return this;
    }

    /**
     * 设置「系统标记」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setSystemFlag(Integer val) {
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
    public PermissionDTO resetSystemFlag() {
        this._reset(FIELD_SYSTEMFLAG);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public PermissionDTO setUpdateMan(String val) {
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
    public PermissionDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
