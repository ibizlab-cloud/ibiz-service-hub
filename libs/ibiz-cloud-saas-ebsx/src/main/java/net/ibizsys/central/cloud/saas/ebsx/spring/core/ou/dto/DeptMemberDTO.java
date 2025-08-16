package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 部门成员
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_DEPTMEMBER/.ibizmodel.index
 */
public class DeptMemberDTO extends EntityDTO {

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
    public DeptMemberDTO setMemberId(String val) {
        this._set(FIELD_MEMBERID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getMemberId() {
        return (String) this._get(FIELD_MEMBERID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemberId() {
        return this._contains(FIELD_MEMBERID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public DeptMemberDTO resetMemberId() {
        this._reset(FIELD_MEMBERID);
        return this;
    }

    /**
     * 设置「部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setDeptId(String val) {
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
    public DeptMemberDTO resetDeptId() {
        this._reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setDeptName(String val) {
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
    public DeptMemberDTO resetDeptName() {
        this._reset(FIELD_DEPTNAME);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setUserId(String val) {
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
    public DeptMemberDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「成员」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「成员」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this._get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「成员」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「成员」
     *
    */
    @JsonIgnore
    public DeptMemberDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「岗位标识」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setPostId(String val) {
        this._set(FIELD_POSTID, val);
        return this;
    }

    /**
     * 获取「岗位标识」值
     *
    */
    @JsonIgnore
    public String getPostId() {
        return (String) this._get(FIELD_POSTID);
    }

    /**
     * 判断 「岗位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostId() {
        return this._contains(FIELD_POSTID);
    }

    /**
     * 重置 「岗位标识」
     *
    */
    @JsonIgnore
    public DeptMemberDTO resetPostId() {
        this._reset(FIELD_POSTID);
        return this;
    }

    /**
     * 设置「岗位名称」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setPostName(String val) {
        this._set(FIELD_POSTNAME, val);
        return this;
    }

    /**
     * 获取「岗位名称」值
     *
    */
    @JsonIgnore
    public String getPostName() {
        return (String) this._get(FIELD_POSTNAME);
    }

    /**
     * 判断 「岗位名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostName() {
        return this._contains(FIELD_POSTNAME);
    }

    /**
     * 重置 「岗位名称」
     *
    */
    @JsonIgnore
    public DeptMemberDTO resetPostName() {
        this._reset(FIELD_POSTNAME);
        return this;
    }

    /**
     * 设置「业务条线」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setBCode(String val) {
        this._set(FIELD_BCODE, val);
        return this;
    }

    /**
     * 获取「业务条线」值
     *
    */
    @JsonIgnore
    public String getBCode() {
        return (String) this._get(FIELD_BCODE);
    }

    /**
     * 判断 「业务条线」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBCode() {
        return this._contains(FIELD_BCODE);
    }

    /**
     * 重置 「业务条线」
     *
    */
    @JsonIgnore
    public DeptMemberDTO resetBCode() {
        this._reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public DeptMemberDTO setDomains(String val) {
        this._set(FIELD_DOMAINS, val);
        return this;
    }

    /**
     * 获取「区属」值
     *
    */
    @JsonIgnore
    public String getDomains() {
        return (String) this._get(FIELD_DOMAINS);
    }

    /**
     * 判断 「区属」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomains() {
        return this._contains(FIELD_DOMAINS);
    }

    /**
     * 重置 「区属」
     *
    */
    @JsonIgnore
    public DeptMemberDTO resetDomains() {
        this._reset(FIELD_DOMAINS);
        return this;
    }


}
