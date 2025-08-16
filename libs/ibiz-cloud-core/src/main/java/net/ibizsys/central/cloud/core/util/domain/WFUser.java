package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 用户
 * 
 * @see ibizmos:/psmodules/workflow/psdataentities/WF_USER/.ibizmodel.index
 */
public class WFUser extends EntityBase {

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
	 * 不默认转化大小属性，兼容旧版本
	 */
	@Override
	protected boolean isLowerCaseName() {
		return false;
	}
	
    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this.get(FIELD_ID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public WFUser resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「用户全局名」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setFirstName(String val) {
        this.set(FIELD_FIRSTNAME, val);
        return this;
    }

    /**
     * 获取「用户全局名」值
     *
    */
    @JsonIgnore
    public String getFirstName() {
        return (String) this.get(FIELD_FIRSTNAME);
    }

    /**
     * 判断 「用户全局名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFirstName() {
        return this.contains(FIELD_FIRSTNAME);
    }

    /**
     * 重置 「用户全局名」
     *
    */
    @JsonIgnore
    public WFUser resetFirstName() {
        this.reset(FIELD_FIRSTNAME);
        return this;
    }

    /**
     * 设置「用户名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setDisplayName(String val) {
        this.set(FIELD_DISPLAYNAME, val);
        return this;
    }

    /**
     * 获取「用户名称」值
     *
    */
    @JsonIgnore
    public String getDisplayName() {
        return (String) this.get(FIELD_DISPLAYNAME);
    }

    /**
     * 判断 「用户名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this.contains(FIELD_DISPLAYNAME);
    }

    /**
     * 重置 「用户名称」
     *
    */
    @JsonIgnore
    public WFUser resetDisplayName() {
        this.reset(FIELD_DISPLAYNAME);
        return this;
    }

    /**
     * 设置「主部门」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setMdeptId(String val) {
        this.set(FIELD_MDEPTID, val);
        return this;
    }

    /**
     * 获取「主部门」值
     *
    */
    @JsonIgnore
    public String getMdeptId() {
        return (String) this.get(FIELD_MDEPTID);
    }

    /**
     * 判断 「主部门」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMdeptId() {
        return this.contains(FIELD_MDEPTID);
    }

    /**
     * 重置 「主部门」
     *
    */
    @JsonIgnore
    public WFUser resetMdeptId() {
        this.reset(FIELD_MDEPTID);
        return this;
    }

    /**
     * 设置「主部门代码」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setMDeptCode(String val) {
        this.set(FIELD_MDEPTCODE, val);
        return this;
    }

    /**
     * 获取「主部门代码」值
     *
    */
    @JsonIgnore
    public String getMDeptCode() {
        return (String) this.get(FIELD_MDEPTCODE);
    }

    /**
     * 判断 「主部门代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptCode() {
        return this.contains(FIELD_MDEPTCODE);
    }

    /**
     * 重置 「主部门代码」
     *
    */
    @JsonIgnore
    public WFUser resetMDeptCode() {
        this.reset(FIELD_MDEPTCODE);
        return this;
    }

    /**
     * 设置「主部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setMDeptName(String val) {
        this.set(FIELD_MDEPTNAME, val);
        return this;
    }

    /**
     * 获取「主部门名称」值
     *
    */
    @JsonIgnore
    public String getMDeptName() {
        return (String) this.get(FIELD_MDEPTNAME);
    }

    /**
     * 判断 「主部门名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptName() {
        return this.contains(FIELD_MDEPTNAME);
    }

    /**
     * 重置 「主部门名称」
     *
    */
    @JsonIgnore
    public WFUser resetMDeptName() {
        this.reset(FIELD_MDEPTNAME);
        return this;
    }

    /**
     * 设置「业务编码」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setBCode(String val) {
        this.set(FIELD_BCODE, val);
        return this;
    }

    /**
     * 获取「业务编码」值
     *
    */
    @JsonIgnore
    public String getBCode() {
        return (String) this.get(FIELD_BCODE);
    }

    /**
     * 判断 「业务编码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBCode() {
        return this.contains(FIELD_BCODE);
    }

    /**
     * 重置 「业务编码」
     *
    */
    @JsonIgnore
    public WFUser resetBCode() {
        this.reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setOrgId(String val) {
        this.set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this.get(FIELD_ORGID);
    }

    /**
     * 判断 「单位」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this.contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位」
     *
    */
    @JsonIgnore
    public WFUser resetOrgId() {
        this.reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位代码」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setOrgCode(String val) {
        this.set(FIELD_ORGCODE, val);
        return this;
    }

    /**
     * 获取「单位代码」值
     *
    */
    @JsonIgnore
    public String getOrgCode() {
        return (String) this.get(FIELD_ORGCODE);
    }

    /**
     * 判断 「单位代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgCode() {
        return this.contains(FIELD_ORGCODE);
    }

    /**
     * 重置 「单位代码」
     *
    */
    @JsonIgnore
    public WFUser resetOrgCode() {
        this.reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「单位名称」
     *
     * @param val
    */
    @JsonIgnore
    public WFUser setOrgName(String val) {
        this.set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「单位名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this.get(FIELD_ORGNAME);
    }

    /**
     * 判断 「单位名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this.contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「单位名称」
     *
    */
    @JsonIgnore
    public WFUser resetOrgName() {
        this.reset(FIELD_ORGNAME);
        return this;
    }


}
