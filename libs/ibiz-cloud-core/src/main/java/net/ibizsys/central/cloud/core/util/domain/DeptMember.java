package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 部门成员
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/.ibizmodel.index
 */
public class DeptMember extends EntityBase {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/MEMBERID/.ibizmodel.index
   */
  public final static String FIELD_MEMBERID = "memberid";

  /**.
   * 部门标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/DEPTID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/minorpsders/DER1N_SYS_DEPTMEMBER_SYS_DEPT_DEPTID/.ibizmodel.index
   */
  public final static String FIELD_DEPTID = "deptid";

  /**.
   * 部门名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/DEPTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/minorpsders/DER1N_SYS_DEPTMEMBER_SYS_DEPT_DEPTID/.ibizmodel.index
   */
  public final static String FIELD_DEPTNAME = "deptname";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/USERID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/minorpsders/DER1N_SYS_DEPTMEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 成员
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/PERSONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/minorpsders/DER1N_SYS_DEPTMEMBER_SYS_EMP_USERID/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 岗位标识
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/POSTID/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/minorpsders/DER1N_SYS_DEPTMEMBER_SYS_POST_POSTID/.ibizmodel.index
   */
  public final static String FIELD_POSTID = "postid";

  /**.
   * 岗位名称
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/POSTNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/minorpsders/DER1N_SYS_DEPTMEMBER_SYS_POST_POSTID/.ibizmodel.index
   */
  public final static String FIELD_POSTNAME = "postname";

  /**.
   * 业务条线
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/BCODE/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/minorpsders/DER1N_SYS_DEPTMEMBER_SYS_DEPT_DEPTID/.ibizmodel.index
   */
  public final static String FIELD_BCODE = "bcode";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setMemberId(String val) {
        this.set(FIELD_MEMBERID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getMemberId() {
        return (String) this.get(FIELD_MEMBERID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemberId() {
        return this.contains(FIELD_MEMBERID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public DeptMember resetMemberId() {
        this.reset(FIELD_MEMBERID);
        return this;
    }

    /**
     * 设置「部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setDeptId(String val) {
        this.set(FIELD_DEPTID, val);
        return this;
    }

    /**
     * 获取「部门标识」值
     *
    */
    @JsonIgnore
    public String getDeptId() {
        return (String) this.get(FIELD_DEPTID);
    }

    /**
     * 判断 「部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptId() {
        return this.contains(FIELD_DEPTID);
    }

    /**
     * 重置 「部门标识」
     *
    */
    @JsonIgnore
    public DeptMember resetDeptId() {
        this.reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setDeptName(String val) {
        this.set(FIELD_DEPTNAME, val);
        return this;
    }

    /**
     * 获取「部门名称」值
     *
    */
    @JsonIgnore
    public String getDeptName() {
        return (String) this.get(FIELD_DEPTNAME);
    }

    /**
     * 判断 「部门名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptName() {
        return this.contains(FIELD_DEPTNAME);
    }

    /**
     * 重置 「部门名称」
     *
    */
    @JsonIgnore
    public DeptMember resetDeptName() {
        this.reset(FIELD_DEPTNAME);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setUserId(String val) {
        this.set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getUserId() {
        return (String) this.get(FIELD_USERID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserId() {
        return this.contains(FIELD_USERID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public DeptMember resetUserId() {
        this.reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「成员」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setPersonName(String val) {
        this.set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「成员」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this.get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「成员」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this.contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「成员」
     *
    */
    @JsonIgnore
    public DeptMember resetPersonName() {
        this.reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「岗位标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setPostId(String val) {
        this.set(FIELD_POSTID, val);
        return this;
    }

    /**
     * 获取「岗位标识」值
     *
    */
    @JsonIgnore
    public String getPostId() {
        return (String) this.get(FIELD_POSTID);
    }

    /**
     * 判断 「岗位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostId() {
        return this.contains(FIELD_POSTID);
    }

    /**
     * 重置 「岗位标识」
     *
    */
    @JsonIgnore
    public DeptMember resetPostId() {
        this.reset(FIELD_POSTID);
        return this;
    }

    /**
     * 设置「岗位名称」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setPostName(String val) {
        this.set(FIELD_POSTNAME, val);
        return this;
    }

    /**
     * 获取「岗位名称」值
     *
    */
    @JsonIgnore
    public String getPostName() {
        return (String) this.get(FIELD_POSTNAME);
    }

    /**
     * 判断 「岗位名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostName() {
        return this.contains(FIELD_POSTNAME);
    }

    /**
     * 重置 「岗位名称」
     *
    */
    @JsonIgnore
    public DeptMember resetPostName() {
        this.reset(FIELD_POSTNAME);
        return this;
    }

    /**
     * 设置「业务条线」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setBCode(String val) {
        this.set(FIELD_BCODE, val);
        return this;
    }

    /**
     * 获取「业务条线」值
     *
    */
    @JsonIgnore
    public String getBCode() {
        return (String) this.get(FIELD_BCODE);
    }

    /**
     * 判断 「业务条线」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBCode() {
        return this.contains(FIELD_BCODE);
    }

    /**
     * 重置 「业务条线」
     *
    */
    @JsonIgnore
    public DeptMember resetBCode() {
        this.reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMember setDomains(String val) {
        this.set(FIELD_DOMAINS, val);
        return this;
    }

    /**
     * 获取「区属」值
     *
    */
    @JsonIgnore
    public String getDomains() {
        return (String) this.get(FIELD_DOMAINS);
    }

    /**
     * 判断 「区属」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomains() {
        return this.contains(FIELD_DOMAINS);
    }

    /**
     * 重置 「区属」
     *
    */
    @JsonIgnore
    public DeptMember resetDomains() {
        this.reset(FIELD_DOMAINS);
        return this;
    }


}
