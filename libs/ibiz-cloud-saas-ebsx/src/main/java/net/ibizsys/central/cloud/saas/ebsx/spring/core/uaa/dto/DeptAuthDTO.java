package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 部门绑定
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/.ibizmodel.index
 */
public class DeptAuthDTO extends EntityDTO {

  /**.
   * 部门绑定标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdefields/DEPTAUTHID/.ibizmodel.index
   */
  public final static String FIELD_DEPTAUTHID = "deptauthid";

  /**.
   * 部门标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdefields/DEPTID/.ibizmodel.index
   */
  public final static String FIELD_DEPTID = "deptid";

  /**.
   * 部门名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdefields/DEPTNAME/.ibizmodel.index
   */
  public final static String FIELD_DEPTNAME = "deptname";

  /**.
   * 系统部门标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DEPT_AUTH/psdefields/SYSDEPTID/.ibizmodel.index
   */
  public final static String FIELD_SYSDEPTID = "sysdeptid";


    /**
     * 设置「部门绑定标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptAuthDTO setDeptAuthId(String val) {
        this._set(FIELD_DEPTAUTHID, val);
        return this;
    }

    /**
     * 获取「部门绑定标识」值
     *
    */
    @JsonIgnore
    public String getDeptAuthId() {
        return (String) this._get(FIELD_DEPTAUTHID);
    }

    /**
     * 判断 「部门绑定标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptAuthId() {
        return this._contains(FIELD_DEPTAUTHID);
    }

    /**
     * 重置 「部门绑定标识」
     *
    */
    @JsonIgnore
    public DeptAuthDTO resetDeptAuthId() {
        this._reset(FIELD_DEPTAUTHID);
        return this;
    }

    /**
     * 设置「部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptAuthDTO setDeptId(String val) {
        this._set(FIELD_DEPTID, val);
        return this;
    }

    /**
     * 获取「部门标识」值
     *
    */
    @JsonIgnore
    public String getDeptId() {
        return (String) this._get(FIELD_DEPTID);
    }

    /**
     * 判断 「部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptId() {
        return this._contains(FIELD_DEPTID);
    }

    /**
     * 重置 「部门标识」
     *
    */
    @JsonIgnore
    public DeptAuthDTO resetDeptId() {
        this._reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public DeptAuthDTO setDeptName(String val) {
        this._set(FIELD_DEPTNAME, val);
        return this;
    }

    /**
     * 获取「部门名称」值
     *
    */
    @JsonIgnore
    public String getDeptName() {
        return (String) this._get(FIELD_DEPTNAME);
    }

    /**
     * 判断 「部门名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptName() {
        return this._contains(FIELD_DEPTNAME);
    }

    /**
     * 重置 「部门名称」
     *
    */
    @JsonIgnore
    public DeptAuthDTO resetDeptName() {
        this._reset(FIELD_DEPTNAME);
        return this;
    }

    /**
     * 设置「系统部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptAuthDTO setSysDeptId(String val) {
        this._set(FIELD_SYSDEPTID, val);
        return this;
    }

    /**
     * 获取「系统部门标识」值
     *
    */
    @JsonIgnore
    public String getSysDeptId() {
        return (String) this._get(FIELD_SYSDEPTID);
    }

    /**
     * 判断 「系统部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysDeptId() {
        return this._contains(FIELD_SYSDEPTID);
    }

    /**
     * 重置 「系统部门标识」
     *
    */
    @JsonIgnore
    public DeptAuthDTO resetSysDeptId() {
        this._reset(FIELD_SYSDEPTID);
        return this;
    }


}
