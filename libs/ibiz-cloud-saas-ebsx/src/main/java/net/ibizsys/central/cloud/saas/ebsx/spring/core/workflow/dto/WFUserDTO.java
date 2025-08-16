package net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 用户
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/.ibizmodel.index
 */
public class WFUserDTO extends EntityDTO {

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 用户全局名
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/USERNAME/.ibizmodel.index
   */
  public final static String FIELD_FIRSTNAME = "firstname";

  /**.
   * 用户名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_DISPLAYNAME = "displayname";

  /**.
   * 主部门
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/MDEPTID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTID = "mdeptid";

  /**.
   * 主部门代码
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/MDEPTCODE/.ibizmodel.index
   */
  public final static String FIELD_MDEPTCODE = "mdeptcode";

  /**.
   * 主部门名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/MDEPTNAME/.ibizmodel.index
   */
  public final static String FIELD_MDEPTNAME = "mdeptname";

  /**.
   * 业务编码
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/BCODE/.ibizmodel.index
   */
  public final static String FIELD_BCODE = "bcode";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 单位代码
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/ORGCODE/.ibizmodel.index
   */
  public final static String FIELD_ORGCODE = "orgcode";

  /**.
   * 单位名称
   *
   * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/psdefields/ORGNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";


    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public WFUserDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「用户全局名」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setFirstName(String val) {
        this._set(FIELD_FIRSTNAME, val);
        return this;
    }

    /**
     * 获取「用户全局名」值
     *
    */
    @JsonIgnore
    public String getFirstName() {
        return (String) this._get(FIELD_FIRSTNAME);
    }

    /**
     * 判断 「用户全局名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFirstName() {
        return this._contains(FIELD_FIRSTNAME);
    }

    /**
     * 重置 「用户全局名」
     *
    */
    @JsonIgnore
    public WFUserDTO resetFirstName() {
        this._reset(FIELD_FIRSTNAME);
        return this;
    }

    /**
     * 设置「用户名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setDisplayName(String val) {
        this._set(FIELD_DISPLAYNAME, val);
        return this;
    }

    /**
     * 获取「用户名称」值
     *
    */
    @JsonIgnore
    public String getDisplayName() {
        return (String) this._get(FIELD_DISPLAYNAME);
    }

    /**
     * 判断 「用户名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this._contains(FIELD_DISPLAYNAME);
    }

    /**
     * 重置 「用户名称」
     *
    */
    @JsonIgnore
    public WFUserDTO resetDisplayName() {
        this._reset(FIELD_DISPLAYNAME);
        return this;
    }

    /**
     * 设置「主部门」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setMDeptId(String val) {
        this._set(FIELD_MDEPTID, val);
        return this;
    }

    /**
     * 获取「主部门」值
     *
    */
    @JsonIgnore
    public String getMDeptId() {
        return (String) this._get(FIELD_MDEPTID);
    }

    /**
     * 判断 「主部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptId() {
        return this._contains(FIELD_MDEPTID);
    }

    /**
     * 重置 「主部门」
     *
    */
    @JsonIgnore
    public WFUserDTO resetMDeptId() {
        this._reset(FIELD_MDEPTID);
        return this;
    }

    /**
     * 设置「主部门代码」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setMDeptCode(String val) {
        this._set(FIELD_MDEPTCODE, val);
        return this;
    }

    /**
     * 获取「主部门代码」值
     *
    */
    @JsonIgnore
    public String getMDeptCode() {
        return (String) this._get(FIELD_MDEPTCODE);
    }

    /**
     * 判断 「主部门代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptCode() {
        return this._contains(FIELD_MDEPTCODE);
    }

    /**
     * 重置 「主部门代码」
     *
    */
    @JsonIgnore
    public WFUserDTO resetMDeptCode() {
        this._reset(FIELD_MDEPTCODE);
        return this;
    }

    /**
     * 设置「主部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setMDeptName(String val) {
        this._set(FIELD_MDEPTNAME, val);
        return this;
    }

    /**
     * 获取「主部门名称」值
     *
    */
    @JsonIgnore
    public String getMDeptName() {
        return (String) this._get(FIELD_MDEPTNAME);
    }

    /**
     * 判断 「主部门名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptName() {
        return this._contains(FIELD_MDEPTNAME);
    }

    /**
     * 重置 「主部门名称」
     *
    */
    @JsonIgnore
    public WFUserDTO resetMDeptName() {
        this._reset(FIELD_MDEPTNAME);
        return this;
    }

    /**
     * 设置「业务编码」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setBCode(String val) {
        this._set(FIELD_BCODE, val);
        return this;
    }

    /**
     * 获取「业务编码」值
     *
    */
    @JsonIgnore
    public String getBCode() {
        return (String) this._get(FIELD_BCODE);
    }

    /**
     * 判断 「业务编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBCode() {
        return this._contains(FIELD_BCODE);
    }

    /**
     * 重置 「业务编码」
     *
    */
    @JsonIgnore
    public WFUserDTO resetBCode() {
        this._reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public WFUserDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位代码」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setOrgCode(String val) {
        this._set(FIELD_ORGCODE, val);
        return this;
    }

    /**
     * 获取「单位代码」值
     *
    */
    @JsonIgnore
    public String getOrgCode() {
        return (String) this._get(FIELD_ORGCODE);
    }

    /**
     * 判断 「单位代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgCode() {
        return this._contains(FIELD_ORGCODE);
    }

    /**
     * 重置 「单位代码」
     *
    */
    @JsonIgnore
    public WFUserDTO resetOrgCode() {
        this._reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「单位名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFUserDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「单位名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「单位名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「单位名称」
     *
    */
    @JsonIgnore
    public WFUserDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }


}
