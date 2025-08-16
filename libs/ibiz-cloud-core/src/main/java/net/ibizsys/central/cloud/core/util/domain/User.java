package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 系统用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/.ibizmodel.index
 */
public class User extends EntityBase {

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 用户全局名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/USERNAME/.ibizmodel.index
   */
  public final static String FIELD_USERNAME = "username";

  /**.
   * 用户姓名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 密码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/PASSWORD/.ibizmodel.index
   */
  public final static String FIELD_PASSWORD = "password";

  /**.
   * 用户工号
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/USERCODE/.ibizmodel.index
   */
  public final static String FIELD_USERCODE = "usercode";

  /**.
   * 登录名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/LOGINNAME/.ibizmodel.index
   */
  public final static String FIELD_LOGINNAME = "loginname";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";

  /**.
   * 主部门
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/MDEPTID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTID = "mdeptid";

  /**.
   * 主部门代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/MDEPTCODE/.ibizmodel.index
   */
  public final static String FIELD_MDEPTCODE = "mdeptcode";

  /**.
   * 主部门名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/MDEPTNAME/.ibizmodel.index
   */
  public final static String FIELD_MDEPTNAME = "mdeptname";

  /**.
   * 业务编码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/BCODE/.ibizmodel.index
   */
  public final static String FIELD_BCODE = "bcode";

  /**.
   * 岗位标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/POSTID/.ibizmodel.index
   */
  public final static String FIELD_POSTID = "postid";

  /**.
   * 岗位代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/POSTCODE/.ibizmodel.index
   */
  public final static String FIELD_POSTCODE = "postcode";

  /**.
   * 岗位名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/POSTNAME/.ibizmodel.index
   */
  public final static String FIELD_POSTNAME = "postname";

  /**.
   * 单位
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 单位代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/ORGCODE/.ibizmodel.index
   */
  public final static String FIELD_ORGCODE = "orgcode";

  /**.
   * 单位名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/ORGNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 昵称别名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/NICKNAME/.ibizmodel.index
   */
  public final static String FIELD_NICKNAME = "nickname";

  /**.
   * 性别
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/SEX/.ibizmodel.index
   */
  public final static String FIELD_SEX = "sex";

  /**.
   * 出生日期
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/BIRTHDAY/.ibizmodel.index
   */
  public final static String FIELD_BIRTHDAY = "birthday";

  /**.
   * 证件号码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/CERTCODE/.ibizmodel.index
   */
  public final static String FIELD_CERTCODE = "certcode";

  /**.
   * 联系方式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/PHONE/.ibizmodel.index
   */
  public final static String FIELD_PHONE = "phone";

  /**.
   * 邮件
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/EMAIL/.ibizmodel.index
   */
  public final static String FIELD_EMAIL = "email";

  /**.
   * 社交账号
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/AVATAR/.ibizmodel.index
   */
  public final static String FIELD_AVATAR = "avatar";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/ADDR/.ibizmodel.index
   */
  public final static String FIELD_ADDR = "addr";

  /**.
   * 照片
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/USERICON/.ibizmodel.index
   */
  public final static String FIELD_USERICON = "usericon";

  /**.
   * 样式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/THEME/.ibizmodel.index
   */
  public final static String FIELD_THEME = "theme";

  /**.
   * 语言
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/LANG/.ibizmodel.index
   */
  public final static String FIELD_LANG = "lang";

  /**.
   * 字号
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/FONTSIZE/.ibizmodel.index
   */
  public final static String FIELD_FONTSIZE = "fontsize";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 保留
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/RESERVER/.ibizmodel.index
   */
  public final static String FIELD_RESERVER = "reserver";

  /**.
   * 接口授权
   * {@link net.ibizsys.central.cloud.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/APIUSER/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_APIUSER = "apiuser";

  /**.
   * 超级管理员
   * {@link net.ibizsys.central.cloud.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/SUPERUSER/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SUPERUSER = "superuser";

  /**.
   * 人员状态
   * {@link net.ibizsys.central.cloud.ebsx.spring.core.runtime.dict.StaticDict.UserState} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/STATE/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/pscodelists/UserState.ibizmodel.yaml
   */
  public final static String FIELD_STATE = "state";

  /**.
   * 钉钉用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/DDUSERID/.ibizmodel.index
   */
  public final static String FIELD_DDUSERID = "dduserid";

  /**.
   * 企业微信用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_USER/psdefields/WXWORKID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKID = "wxworkid";


    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public User setUserId(String val) {
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
    public User resetUserId() {
        this.reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「用户全局名」
     *
     * @param val
    */
    @JsonIgnore
    public User setUserName(String val) {
        this.set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「用户全局名」值
     *
    */
    @JsonIgnore
    public String getUserName() {
        return (String) this.get(FIELD_USERNAME);
    }

    /**
     * 判断 「用户全局名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserName() {
        return this.contains(FIELD_USERNAME);
    }

    /**
     * 重置 「用户全局名」
     *
    */
    @JsonIgnore
    public User resetUserName() {
        this.reset(FIELD_USERNAME);
        return this;
    }

    /**
     * 设置「用户姓名」
     *
     * @param val
    */
    @JsonIgnore
    public User setPersonName(String val) {
        this.set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「用户姓名」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this.get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「用户姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this.contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「用户姓名」
     *
    */
    @JsonIgnore
    public User resetPersonName() {
        this.reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「密码」
     *
     * @param val
    */
    @JsonIgnore
    public User setPassword(String val) {
        this.set(FIELD_PASSWORD, val);
        return this;
    }

    /**
     * 获取「密码」值
     *
    */
    @JsonIgnore
    public String getPassword() {
        return (String) this.get(FIELD_PASSWORD);
    }

    /**
     * 判断 「密码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPassword() {
        return this.contains(FIELD_PASSWORD);
    }

    /**
     * 重置 「密码」
     *
    */
    @JsonIgnore
    public User resetPassword() {
        this.reset(FIELD_PASSWORD);
        return this;
    }

    /**
     * 设置「用户工号」
     *
     * @param val
    */
    @JsonIgnore
    public User setUserCode(String val) {
        this.set(FIELD_USERCODE, val);
        return this;
    }

    /**
     * 获取「用户工号」值
     *
    */
    @JsonIgnore
    public String getUserCode() {
        return (String) this.get(FIELD_USERCODE);
    }

    /**
     * 判断 「用户工号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserCode() {
        return this.contains(FIELD_USERCODE);
    }

    /**
     * 重置 「用户工号」
     *
    */
    @JsonIgnore
    public User resetUserCode() {
        this.reset(FIELD_USERCODE);
        return this;
    }

    /**
     * 设置「登录名」
     *
     * @param val
    */
    @JsonIgnore
    public User setLoginName(String val) {
        this.set(FIELD_LOGINNAME, val);
        return this;
    }

    /**
     * 获取「登录名」值
     *
    */
    @JsonIgnore
    public String getLoginName() {
        return (String) this.get(FIELD_LOGINNAME);
    }

    /**
     * 判断 「登录名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLoginName() {
        return this.contains(FIELD_LOGINNAME);
    }

    /**
     * 重置 「登录名」
     *
    */
    @JsonIgnore
    public User resetLoginName() {
        this.reset(FIELD_LOGINNAME);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public User setDomains(String val) {
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
    public User resetDomains() {
        this.reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「主部门」
     *
     * @param val
    */
    @JsonIgnore
    public User setMdeptId(String val) {
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
    public User resetMdeptId() {
        this.reset(FIELD_MDEPTID);
        return this;
    }

    /**
     * 设置「主部门代码」
     *
     * @param val
    */
    @JsonIgnore
    public User setMDeptCode(String val) {
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
    public User resetMDeptCode() {
        this.reset(FIELD_MDEPTCODE);
        return this;
    }

    /**
     * 设置「主部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public User setMDeptName(String val) {
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
    public User resetMDeptName() {
        this.reset(FIELD_MDEPTNAME);
        return this;
    }

    /**
     * 设置「业务编码」
     *
     * @param val
    */
    @JsonIgnore
    public User setBCode(String val) {
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
    public User resetBCode() {
        this.reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「岗位标识」
     *
     * @param val
    */
    @JsonIgnore
    public User setPostId(String val) {
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
    public User resetPostId() {
        this.reset(FIELD_POSTID);
        return this;
    }

    /**
     * 设置「岗位代码」
     *
     * @param val
    */
    @JsonIgnore
    public User setPostCode(String val) {
        this.set(FIELD_POSTCODE, val);
        return this;
    }

    /**
     * 获取「岗位代码」值
     *
    */
    @JsonIgnore
    public String getPostCode() {
        return (String) this.get(FIELD_POSTCODE);
    }

    /**
     * 判断 「岗位代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPostCode() {
        return this.contains(FIELD_POSTCODE);
    }

    /**
     * 重置 「岗位代码」
     *
    */
    @JsonIgnore
    public User resetPostCode() {
        this.reset(FIELD_POSTCODE);
        return this;
    }

    /**
     * 设置「岗位名称」
     *
     * @param val
    */
    @JsonIgnore
    public User setPostName(String val) {
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
    public User resetPostName() {
        this.reset(FIELD_POSTNAME);
        return this;
    }

    /**
     * 设置「单位」
     *
     * @param val
    */
    @JsonIgnore
    public User setOrgId(String val) {
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
    public User resetOrgId() {
        this.reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「单位代码」
     *
     * @param val
    */
    @JsonIgnore
    public User setOrgCode(String val) {
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
    public User resetOrgCode() {
        this.reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「单位名称」
     *
     * @param val
    */
    @JsonIgnore
    public User setOrgName(String val) {
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
    public User resetOrgName() {
        this.reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「昵称别名」
     *
     * @param val
    */
    @JsonIgnore
    public User setNickName(String val) {
        this.set(FIELD_NICKNAME, val);
        return this;
    }

    /**
     * 获取「昵称别名」值
     *
    */
    @JsonIgnore
    public String getNickName() {
        return (String) this.get(FIELD_NICKNAME);
    }

    /**
     * 判断 「昵称别名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNickName() {
        return this.contains(FIELD_NICKNAME);
    }

    /**
     * 重置 「昵称别名」
     *
    */
    @JsonIgnore
    public User resetNickName() {
        this.reset(FIELD_NICKNAME);
        return this;
    }

    /**
     * 设置「性别」
     *
     * @param val
    */
    @JsonIgnore
    public User setSex(String val) {
        this.set(FIELD_SEX, val);
        return this;
    }

    /**
     * 获取「性别」值
     *
    */
    @JsonIgnore
    public String getSex() {
        return (String) this.get(FIELD_SEX);
    }

    /**
     * 判断 「性别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSex() {
        return this.contains(FIELD_SEX);
    }

    /**
     * 重置 「性别」
     *
    */
    @JsonIgnore
    public User resetSex() {
        this.reset(FIELD_SEX);
        return this;
    }

    /**
     * 设置「出生日期」
     *
     * @param val
    */
    @JsonIgnore
    public User setBirthday(Timestamp val) {
        this.set(FIELD_BIRTHDAY, val);
        return this;
    }

    /**
     * 获取「出生日期」值
     *
    */
    @JsonIgnore
    public Timestamp getBirthday() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_BIRTHDAY),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「出生日期」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBirthday() {
        return this.contains(FIELD_BIRTHDAY);
    }

    /**
     * 重置 「出生日期」
     *
    */
    @JsonIgnore
    public User resetBirthday() {
        this.reset(FIELD_BIRTHDAY);
        return this;
    }

    /**
     * 设置「证件号码」
     *
     * @param val
    */
    @JsonIgnore
    public User setCertCode(String val) {
        this.set(FIELD_CERTCODE, val);
        return this;
    }

    /**
     * 获取「证件号码」值
     *
    */
    @JsonIgnore
    public String getCertCode() {
        return (String) this.get(FIELD_CERTCODE);
    }

    /**
     * 判断 「证件号码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCertCode() {
        return this.contains(FIELD_CERTCODE);
    }

    /**
     * 重置 「证件号码」
     *
    */
    @JsonIgnore
    public User resetCertCode() {
        this.reset(FIELD_CERTCODE);
        return this;
    }

    /**
     * 设置「联系方式」
     *
     * @param val
    */
    @JsonIgnore
    public User setPhone(String val) {
        this.set(FIELD_PHONE, val);
        return this;
    }

    /**
     * 获取「联系方式」值
     *
    */
    @JsonIgnore
    public String getPhone() {
        return (String) this.get(FIELD_PHONE);
    }

    /**
     * 判断 「联系方式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPhone() {
        return this.contains(FIELD_PHONE);
    }

    /**
     * 重置 「联系方式」
     *
    */
    @JsonIgnore
    public User resetPhone() {
        this.reset(FIELD_PHONE);
        return this;
    }

    /**
     * 设置「邮件」
     *
     * @param val
    */
    @JsonIgnore
    public User setEmail(String val) {
        this.set(FIELD_EMAIL, val);
        return this;
    }

    /**
     * 获取「邮件」值
     *
    */
    @JsonIgnore
    public String getEmail() {
        return (String) this.get(FIELD_EMAIL);
    }

    /**
     * 判断 「邮件」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmail() {
        return this.contains(FIELD_EMAIL);
    }

    /**
     * 重置 「邮件」
     *
    */
    @JsonIgnore
    public User resetEmail() {
        this.reset(FIELD_EMAIL);
        return this;
    }

    /**
     * 设置「社交账号」
     *
     * @param val
    */
    @JsonIgnore
    public User setAvatar(String val) {
        this.set(FIELD_AVATAR, val);
        return this;
    }

    /**
     * 获取「社交账号」值
     *
    */
    @JsonIgnore
    public String getAvatar() {
        return (String) this.get(FIELD_AVATAR);
    }

    /**
     * 判断 「社交账号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAvatar() {
        return this.contains(FIELD_AVATAR);
    }

    /**
     * 重置 「社交账号」
     *
    */
    @JsonIgnore
    public User resetAvatar() {
        this.reset(FIELD_AVATAR);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public User setAddr(String val) {
        this.set(FIELD_ADDR, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getAddr() {
        return (String) this.get(FIELD_ADDR);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddr() {
        return this.contains(FIELD_ADDR);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public User resetAddr() {
        this.reset(FIELD_ADDR);
        return this;
    }

    /**
     * 设置「照片」
     *
     * @param val
    */
    @JsonIgnore
    public User setUserIcon(String val) {
        this.set(FIELD_USERICON, val);
        return this;
    }

    /**
     * 获取「照片」值
     *
    */
    @JsonIgnore
    public String getUserIcon() {
        return (String) this.get(FIELD_USERICON);
    }

    /**
     * 判断 「照片」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserIcon() {
        return this.contains(FIELD_USERICON);
    }

    /**
     * 重置 「照片」
     *
    */
    @JsonIgnore
    public User resetUserIcon() {
        this.reset(FIELD_USERICON);
        return this;
    }

    /**
     * 设置「样式」
     *
     * @param val
    */
    @JsonIgnore
    public User setTheme(String val) {
        this.set(FIELD_THEME, val);
        return this;
    }

    /**
     * 获取「样式」值
     *
    */
    @JsonIgnore
    public String getTheme() {
        return (String) this.get(FIELD_THEME);
    }

    /**
     * 判断 「样式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTheme() {
        return this.contains(FIELD_THEME);
    }

    /**
     * 重置 「样式」
     *
    */
    @JsonIgnore
    public User resetTheme() {
        this.reset(FIELD_THEME);
        return this;
    }

    /**
     * 设置「语言」
     *
     * @param val
    */
    @JsonIgnore
    public User setLang(String val) {
        this.set(FIELD_LANG, val);
        return this;
    }

    /**
     * 获取「语言」值
     *
    */
    @JsonIgnore
    public String getLang() {
        return (String) this.get(FIELD_LANG);
    }

    /**
     * 判断 「语言」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLang() {
        return this.contains(FIELD_LANG);
    }

    /**
     * 重置 「语言」
     *
    */
    @JsonIgnore
    public User resetLang() {
        this.reset(FIELD_LANG);
        return this;
    }

    /**
     * 设置「字号」
     *
     * @param val
    */
    @JsonIgnore
    public User setFontSize(String val) {
        this.set(FIELD_FONTSIZE, val);
        return this;
    }

    /**
     * 获取「字号」值
     *
    */
    @JsonIgnore
    public String getFontSize() {
        return (String) this.get(FIELD_FONTSIZE);
    }

    /**
     * 判断 「字号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFontSize() {
        return this.contains(FIELD_FONTSIZE);
    }

    /**
     * 重置 「字号」
     *
    */
    @JsonIgnore
    public User resetFontSize() {
        this.reset(FIELD_FONTSIZE);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public User setMemo(String val) {
        this.set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this.get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this.contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public User resetMemo() {
        this.reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「保留」
     *
     * @param val
    */
    @JsonIgnore
    public User setReserver(String val) {
        this.set(FIELD_RESERVER, val);
        return this;
    }

    /**
     * 获取「保留」值
     *
    */
    @JsonIgnore
    public String getReserver() {
        return (String) this.get(FIELD_RESERVER);
    }

    /**
     * 判断 「保留」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver() {
        return this.contains(FIELD_RESERVER);
    }

    /**
     * 重置 「保留」
     *
    */
    @JsonIgnore
    public User resetReserver() {
        this.reset(FIELD_RESERVER);
        return this;
    }

    /**
     * 设置「接口授权」
     *
     * @param val
    */
    @JsonIgnore
    public User setApiUser(Integer val) {
        this.set(FIELD_APIUSER, val);
        return this;
    }

    /**
     * 获取「接口授权」值
     *
    */
    @JsonIgnore
    public Integer getApiUser() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_APIUSER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「接口授权」是否有值
     *
    */
    @JsonIgnore
    public boolean containsApiUser() {
        return this.contains(FIELD_APIUSER);
    }

    /**
     * 重置 「接口授权」
     *
    */
    @JsonIgnore
    public User resetApiUser() {
        this.reset(FIELD_APIUSER);
        return this;
    }

    /**
     * 设置「超级管理员」
     *
     * @param val
    */
    @JsonIgnore
    public User setSuperUser(Integer val) {
        this.set(FIELD_SUPERUSER, val);
        return this;
    }

    /**
     * 获取「超级管理员」值
     *
    */
    @JsonIgnore
    public Integer getSuperUser() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_SUPERUSER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「超级管理员」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSuperUser() {
        return this.contains(FIELD_SUPERUSER);
    }

    /**
     * 重置 「超级管理员」
     *
    */
    @JsonIgnore
    public User resetSuperUser() {
        this.reset(FIELD_SUPERUSER);
        return this;
    }

    /**
     * 设置「人员状态」
     *
     * @param val
    */
    @JsonIgnore
    public User setState(String val) {
        this.set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「人员状态」值
     *
    */
    @JsonIgnore
    public String getState() {
        return (String) this.get(FIELD_STATE);
    }

    /**
     * 判断 「人员状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsState() {
        return this.contains(FIELD_STATE);
    }

    /**
     * 重置 「人员状态」
     *
    */
    @JsonIgnore
    public User resetState() {
        this.reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「钉钉用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public User setDduserid(String val) {
        this.set(FIELD_DDUSERID, val);
        return this;
    }

    /**
     * 获取「钉钉用户标识」值
     *
    */
    @JsonIgnore
    public String getDduserid() {
        return (String) this.get(FIELD_DDUSERID);
    }

    /**
     * 判断 「钉钉用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDduserid() {
        return this.contains(FIELD_DDUSERID);
    }

    /**
     * 重置 「钉钉用户标识」
     *
    */
    @JsonIgnore
    public User resetDduserid() {
        this.reset(FIELD_DDUSERID);
        return this;
    }

    /**
     * 设置「企业微信用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public User setWXWorkId(String val) {
        this.set(FIELD_WXWORKID, val);
        return this;
    }

    /**
     * 获取「企业微信用户标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkId() {
        return (String) this.get(FIELD_WXWORKID);
    }

    /**
     * 判断 「企业微信用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkId() {
        return this.contains(FIELD_WXWORKID);
    }

    /**
     * 重置 「企业微信用户标识」
     *
    */
    @JsonIgnore
    public User resetWXWorkId() {
        this.reset(FIELD_WXWORKID);
        return this;
    }


}
