package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 机构用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/.ibizmodel.index
 */
public class DCEmployeeDTO extends EntityDTO {

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 用户全局名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/USERNAME/.ibizmodel.index
   */
  public final static String FIELD_USERNAME = "username";

  /**.
   * 姓名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 用户工号
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/USERCODE/.ibizmodel.index
   */
  public final static String FIELD_USERCODE = "usercode";

  /**.
   * 登录名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/LOGINNAME/.ibizmodel.index
   */
  public final static String FIELD_LOGINNAME = "loginname";

  /**.
   * 密码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/PASSWORD/.ibizmodel.index
   */
  public final static String FIELD_PASSWORD = "password";

  /**.
   * 区属
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAINS = "domains";

  /**.
   * 业务编码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/BCODE/.ibizmodel.index
   */
  public final static String FIELD_BCODE = "bcode";

  /**.
   * 昵称别名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/NICKNAME/.ibizmodel.index
   */
  public final static String FIELD_NICKNAME = "nickname";

  /**.
   * 证件号码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/CERTCODE/.ibizmodel.index
   */
  public final static String FIELD_CERTCODE = "certcode";

  /**.
   * 性别
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.Gender} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/SEX/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/pscodelists/Gender.ibizmodel.yaml
   */
  public final static String FIELD_SEX = "sex";

  /**.
   * 出生日期
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/BIRTHDAY/.ibizmodel.index
   */
  public final static String FIELD_BIRTHDAY = "birthday";

  /**.
   * 联系方式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/PHONE/.ibizmodel.index
   */
  public final static String FIELD_PHONE = "phone";

  /**.
   * 邮件
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/EMAIL/.ibizmodel.index
   */
  public final static String FIELD_EMAIL = "email";

  /**.
   * 社交账号
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/AVATAR/.ibizmodel.index
   */
  public final static String FIELD_AVATAR = "avatar";

  /**.
   * 地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/ADDR/.ibizmodel.index
   */
  public final static String FIELD_ADDR = "addr";

  /**.
   * 照片
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/USERICON/.ibizmodel.index
   */
  public final static String FIELD_USERICON = "usericon";

  /**.
   * ip地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/IPADDR/.ibizmodel.index
   */
  public final static String FIELD_IPADDR = "ipaddr";

  /**.
   * 样式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/THEME/.ibizmodel.index
   */
  public final static String FIELD_THEME = "theme";

  /**.
   * 语言
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/LANG/.ibizmodel.index
   */
  public final static String FIELD_LANG = "lang";

  /**.
   * 字号
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/FONTSIZE/.ibizmodel.index
   */
  public final static String FIELD_FONTSIZE = "fontsize";

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 保留
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/RESERVER/.ibizmodel.index
   */
  public final static String FIELD_RESERVER = "reserver";

  /**.
   * 保留2
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/RESERVER2/.ibizmodel.index
   */
  public final static String FIELD_RESERVER2 = "reserver2";

  /**.
   * 保留3
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/RESERVER3/.ibizmodel.index
   */
  public final static String FIELD_RESERVER3 = "reserver3";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOWORDER = "showorder";

  /**.
   * 超级管理员
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/SUPERUSER/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_SUPERUSER = "superuser";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 钉钉用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/DDUNIONID/.ibizmodel.index
   */
  public final static String FIELD_DDUNIONID = "ddunionid";

  /**.
   * 钉钉用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/DDUSERID/.ibizmodel.index
   */
  public final static String FIELD_DDUSERID = "dduserid";

  /**.
   * 主部门代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/MDEPTCODE/.ibizmodel.index
   */
  public final static String FIELD_MDEPTCODE = "mdeptcode";

  /**.
   * 主部门标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/MDEPTID/.ibizmodel.index
   */
  public final static String FIELD_MDEPTID = "mdeptid";

  /**.
   * 主部门名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/MDEPTNAME/.ibizmodel.index
   */
  public final static String FIELD_MDEPTNAME = "mdeptname";

  /**.
   * 消息类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.MsgType} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/MSGTYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/MsgType.ibizmodel.yaml
   */
  public final static String FIELD_MSGTYPE = "msgtype";

  /**.
   * 组织代码
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/ORGCODE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/minorpsders/DER1N_SYS_DC_EMP_SYS_DC_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGCODE = "orgcode";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/minorpsders/DER1N_SYS_DC_EMP_SYS_DC_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/ORGNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/minorpsders/DER1N_SYS_DC_EMP_SYS_DC_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGNAME = "orgname";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 人员状态
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.UserState} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/STATE/.ibizmodel.index
   * @see ibizmos:/psmodules/ou/pscodelists/UserState.ibizmodel.yaml
   */
  public final static String FIELD_STATE = "state";

  /**.
   * UAA用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/UAAUSERID/.ibizmodel.index
   */
  public final static String FIELD_UAAUSERID = "uaauserid";

  /**.
   * 微信用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/WXWORKUNIONID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKUNIONID = "wxworkunionid";

  /**.
   * 企业微信用户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_EMP/psdefields/WXWORKUSERID/.ibizmodel.index
   */
  public final static String FIELD_WXWORKUSERID = "wxworkuserid";


    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setUserId(String val) {
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
    public DCEmployeeDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「用户全局名」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setUserName(String val) {
        this._set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「用户全局名」值
     *
    */
    @JsonIgnore
    public String getUserName() {
        return (String) this._get(FIELD_USERNAME);
    }

    /**
     * 判断 「用户全局名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USERNAME);
    }

    /**
     * 重置 「用户全局名」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetUserName() {
        this._reset(FIELD_USERNAME);
        return this;
    }

    /**
     * 设置「姓名」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「姓名」值
     *
    */
    @JsonIgnore
    public String getPersonName() {
        return (String) this._get(FIELD_PERSONNAME);
    }

    /**
     * 判断 「姓名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「姓名」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「用户工号」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setUserCode(String val) {
        this._set(FIELD_USERCODE, val);
        return this;
    }

    /**
     * 获取「用户工号」值
     *
    */
    @JsonIgnore
    public String getUserCode() {
        return (String) this._get(FIELD_USERCODE);
    }

    /**
     * 判断 「用户工号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserCode() {
        return this._contains(FIELD_USERCODE);
    }

    /**
     * 重置 「用户工号」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetUserCode() {
        this._reset(FIELD_USERCODE);
        return this;
    }

    /**
     * 设置「登录名」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setLoginName(String val) {
        this._set(FIELD_LOGINNAME, val);
        return this;
    }

    /**
     * 获取「登录名」值
     *
    */
    @JsonIgnore
    public String getLoginName() {
        return (String) this._get(FIELD_LOGINNAME);
    }

    /**
     * 判断 「登录名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLoginName() {
        return this._contains(FIELD_LOGINNAME);
    }

    /**
     * 重置 「登录名」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetLoginName() {
        this._reset(FIELD_LOGINNAME);
        return this;
    }

    /**
     * 设置「密码」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setPassword(String val) {
        this._set(FIELD_PASSWORD, val);
        return this;
    }

    /**
     * 获取「密码」值
     *
    */
    @JsonIgnore
    public String getPassword() {
        return (String) this._get(FIELD_PASSWORD);
    }

    /**
     * 判断 「密码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPassword() {
        return this._contains(FIELD_PASSWORD);
    }

    /**
     * 重置 「密码」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetPassword() {
        this._reset(FIELD_PASSWORD);
        return this;
    }

    /**
     * 设置「区属」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setDomains(String val) {
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
    public DCEmployeeDTO resetDomains() {
        this._reset(FIELD_DOMAINS);
        return this;
    }

    /**
     * 设置「业务编码」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setBCode(String val) {
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
    public DCEmployeeDTO resetBCode() {
        this._reset(FIELD_BCODE);
        return this;
    }

    /**
     * 设置「昵称别名」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setNickName(String val) {
        this._set(FIELD_NICKNAME, val);
        return this;
    }

    /**
     * 获取「昵称别名」值
     *
    */
    @JsonIgnore
    public String getNickName() {
        return (String) this._get(FIELD_NICKNAME);
    }

    /**
     * 判断 「昵称别名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNickName() {
        return this._contains(FIELD_NICKNAME);
    }

    /**
     * 重置 「昵称别名」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetNickName() {
        this._reset(FIELD_NICKNAME);
        return this;
    }

    /**
     * 设置「证件号码」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setCertCode(String val) {
        this._set(FIELD_CERTCODE, val);
        return this;
    }

    /**
     * 获取「证件号码」值
     *
    */
    @JsonIgnore
    public String getCertCode() {
        return (String) this._get(FIELD_CERTCODE);
    }

    /**
     * 判断 「证件号码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCertCode() {
        return this._contains(FIELD_CERTCODE);
    }

    /**
     * 重置 「证件号码」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetCertCode() {
        this._reset(FIELD_CERTCODE);
        return this;
    }

    /**
     * 设置「性别」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setSex(String val) {
        this._set(FIELD_SEX, val);
        return this;
    }

    /**
     * 获取「性别」值
     *
    */
    @JsonIgnore
    public String getSex() {
        return (String) this._get(FIELD_SEX);
    }

    /**
     * 判断 「性别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSex() {
        return this._contains(FIELD_SEX);
    }

    /**
     * 重置 「性别」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetSex() {
        this._reset(FIELD_SEX);
        return this;
    }

    /**
     * 设置「出生日期」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setBirthday(Timestamp val) {
        this._set(FIELD_BIRTHDAY, val);
        return this;
    }

    /**
     * 获取「出生日期」值
     *
    */
    @JsonIgnore
    public Timestamp getBirthday() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_BIRTHDAY),null);
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
        return this._contains(FIELD_BIRTHDAY);
    }

    /**
     * 重置 「出生日期」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetBirthday() {
        this._reset(FIELD_BIRTHDAY);
        return this;
    }

    /**
     * 设置「联系方式」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setPhone(String val) {
        this._set(FIELD_PHONE, val);
        return this;
    }

    /**
     * 获取「联系方式」值
     *
    */
    @JsonIgnore
    public String getPhone() {
        return (String) this._get(FIELD_PHONE);
    }

    /**
     * 判断 「联系方式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPhone() {
        return this._contains(FIELD_PHONE);
    }

    /**
     * 重置 「联系方式」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetPhone() {
        this._reset(FIELD_PHONE);
        return this;
    }

    /**
     * 设置「邮件」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setEmail(String val) {
        this._set(FIELD_EMAIL, val);
        return this;
    }

    /**
     * 获取「邮件」值
     *
    */
    @JsonIgnore
    public String getEmail() {
        return (String) this._get(FIELD_EMAIL);
    }

    /**
     * 判断 「邮件」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmail() {
        return this._contains(FIELD_EMAIL);
    }

    /**
     * 重置 「邮件」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetEmail() {
        this._reset(FIELD_EMAIL);
        return this;
    }

    /**
     * 设置「社交账号」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setAvatar(String val) {
        this._set(FIELD_AVATAR, val);
        return this;
    }

    /**
     * 获取「社交账号」值
     *
    */
    @JsonIgnore
    public String getAvatar() {
        return (String) this._get(FIELD_AVATAR);
    }

    /**
     * 判断 「社交账号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAvatar() {
        return this._contains(FIELD_AVATAR);
    }

    /**
     * 重置 「社交账号」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetAvatar() {
        this._reset(FIELD_AVATAR);
        return this;
    }

    /**
     * 设置「地址」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setAddr(String val) {
        this._set(FIELD_ADDR, val);
        return this;
    }

    /**
     * 获取「地址」值
     *
    */
    @JsonIgnore
    public String getAddr() {
        return (String) this._get(FIELD_ADDR);
    }

    /**
     * 判断 「地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddr() {
        return this._contains(FIELD_ADDR);
    }

    /**
     * 重置 「地址」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetAddr() {
        this._reset(FIELD_ADDR);
        return this;
    }

    /**
     * 设置「照片」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setUserIcon(String val) {
        this._set(FIELD_USERICON, val);
        return this;
    }

    /**
     * 获取「照片」值
     *
    */
    @JsonIgnore
    public String getUserIcon() {
        return (String) this._get(FIELD_USERICON);
    }

    /**
     * 判断 「照片」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserIcon() {
        return this._contains(FIELD_USERICON);
    }

    /**
     * 重置 「照片」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetUserIcon() {
        this._reset(FIELD_USERICON);
        return this;
    }

    /**
     * 设置「ip地址」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setIPAddr(String val) {
        this._set(FIELD_IPADDR, val);
        return this;
    }

    /**
     * 获取「ip地址」值
     *
    */
    @JsonIgnore
    public String getIPAddr() {
        return (String) this._get(FIELD_IPADDR);
    }

    /**
     * 判断 「ip地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIPAddr() {
        return this._contains(FIELD_IPADDR);
    }

    /**
     * 重置 「ip地址」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetIPAddr() {
        this._reset(FIELD_IPADDR);
        return this;
    }

    /**
     * 设置「样式」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setTheme(String val) {
        this._set(FIELD_THEME, val);
        return this;
    }

    /**
     * 获取「样式」值
     *
    */
    @JsonIgnore
    public String getTheme() {
        return (String) this._get(FIELD_THEME);
    }

    /**
     * 判断 「样式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTheme() {
        return this._contains(FIELD_THEME);
    }

    /**
     * 重置 「样式」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetTheme() {
        this._reset(FIELD_THEME);
        return this;
    }

    /**
     * 设置「语言」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setLang(String val) {
        this._set(FIELD_LANG, val);
        return this;
    }

    /**
     * 获取「语言」值
     *
    */
    @JsonIgnore
    public String getLang() {
        return (String) this._get(FIELD_LANG);
    }

    /**
     * 判断 「语言」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLang() {
        return this._contains(FIELD_LANG);
    }

    /**
     * 重置 「语言」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetLang() {
        this._reset(FIELD_LANG);
        return this;
    }

    /**
     * 设置「字号」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setFontSize(String val) {
        this._set(FIELD_FONTSIZE, val);
        return this;
    }

    /**
     * 获取「字号」值
     *
    */
    @JsonIgnore
    public String getFontSize() {
        return (String) this._get(FIELD_FONTSIZE);
    }

    /**
     * 判断 「字号」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFontSize() {
        return this._contains(FIELD_FONTSIZE);
    }

    /**
     * 重置 「字号」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetFontSize() {
        this._reset(FIELD_FONTSIZE);
        return this;
    }

    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setMemo(String val) {
        this._set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this._get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this._contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「保留」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setReserver(String val) {
        this._set(FIELD_RESERVER, val);
        return this;
    }

    /**
     * 获取「保留」值
     *
    */
    @JsonIgnore
    public String getReserver() {
        return (String) this._get(FIELD_RESERVER);
    }

    /**
     * 判断 「保留」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver() {
        return this._contains(FIELD_RESERVER);
    }

    /**
     * 重置 「保留」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetReserver() {
        this._reset(FIELD_RESERVER);
        return this;
    }

    /**
     * 设置「保留2」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setReserver2(String val) {
        this._set(FIELD_RESERVER2, val);
        return this;
    }

    /**
     * 获取「保留2」值
     *
    */
    @JsonIgnore
    public String getReserver2() {
        return (String) this._get(FIELD_RESERVER2);
    }

    /**
     * 判断 「保留2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver2() {
        return this._contains(FIELD_RESERVER2);
    }

    /**
     * 重置 「保留2」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetReserver2() {
        this._reset(FIELD_RESERVER2);
        return this;
    }

    /**
     * 设置「保留3」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setReserver3(String val) {
        this._set(FIELD_RESERVER3, val);
        return this;
    }

    /**
     * 获取「保留3」值
     *
    */
    @JsonIgnore
    public String getReserver3() {
        return (String) this._get(FIELD_RESERVER3);
    }

    /**
     * 判断 「保留3」是否有值
     *
    */
    @JsonIgnore
    public boolean containsReserver3() {
        return this._contains(FIELD_RESERVER3);
    }

    /**
     * 重置 「保留3」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetReserver3() {
        this._reset(FIELD_RESERVER3);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setShowOrder(Integer val) {
        this._set(FIELD_SHOWORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShowOrder() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SHOWORDER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「排序」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShowOrder() {
        return this._contains(FIELD_SHOWORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetShowOrder() {
        this._reset(FIELD_SHOWORDER);
        return this;
    }

    /**
     * 设置「超级管理员」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setSuperUser(Integer val) {
        this._set(FIELD_SUPERUSER, val);
        return this;
    }

    /**
     * 获取「超级管理员」值
     *
    */
    @JsonIgnore
    public Integer getSuperUser() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SUPERUSER),null);
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
        return this._contains(FIELD_SUPERUSER);
    }

    /**
     * 重置 「超级管理员」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetSuperUser() {
        this._reset(FIELD_SUPERUSER);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
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
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
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
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「钉钉用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setDDUnionId(String val) {
        this._set(FIELD_DDUNIONID, val);
        return this;
    }

    /**
     * 获取「钉钉用户标识」值
     *
    */
    @JsonIgnore
    public String getDDUnionId() {
        return (String) this._get(FIELD_DDUNIONID);
    }

    /**
     * 判断 「钉钉用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDUnionId() {
        return this._contains(FIELD_DDUNIONID);
    }

    /**
     * 重置 「钉钉用户标识」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetDDUnionId() {
        this._reset(FIELD_DDUNIONID);
        return this;
    }

    /**
     * 设置「钉钉用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setDDUserId(String val) {
        this._set(FIELD_DDUSERID, val);
        return this;
    }

    /**
     * 获取「钉钉用户标识」值
     *
    */
    @JsonIgnore
    public String getDDUserId() {
        return (String) this._get(FIELD_DDUSERID);
    }

    /**
     * 判断 「钉钉用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDDUserId() {
        return this._contains(FIELD_DDUSERID);
    }

    /**
     * 重置 「钉钉用户标识」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetDDUserId() {
        this._reset(FIELD_DDUSERID);
        return this;
    }

    /**
     * 设置「主部门代码」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setMDeptCode(String val) {
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
    public DCEmployeeDTO resetMDeptCode() {
        this._reset(FIELD_MDEPTCODE);
        return this;
    }

    /**
     * 设置「主部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setMDeptId(String val) {
        this._set(FIELD_MDEPTID, val);
        return this;
    }

    /**
     * 获取「主部门标识」值
     *
    */
    @JsonIgnore
    public String getMDeptId() {
        return (String) this._get(FIELD_MDEPTID);
    }

    /**
     * 判断 「主部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMDeptId() {
        return this._contains(FIELD_MDEPTID);
    }

    /**
     * 重置 「主部门标识」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetMDeptId() {
        this._reset(FIELD_MDEPTID);
        return this;
    }

    /**
     * 设置「主部门名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setMDeptName(String val) {
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
    public DCEmployeeDTO resetMDeptName() {
        this._reset(FIELD_MDEPTNAME);
        return this;
    }

    /**
     * 设置「消息类型」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setMsgType(Integer val) {
        this._set(FIELD_MSGTYPE, val);
        return this;
    }

    /**
     * 获取「消息类型」值
     *
    */
    @JsonIgnore
    public Integer getMsgType() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_MSGTYPE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「消息类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMsgType() {
        return this._contains(FIELD_MSGTYPE);
    }

    /**
     * 重置 「消息类型」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetMsgType() {
        this._reset(FIELD_MSGTYPE);
        return this;
    }

    /**
     * 设置「组织代码」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setOrgCode(String val) {
        this._set(FIELD_ORGCODE, val);
        return this;
    }

    /**
     * 获取「组织代码」值
     *
    */
    @JsonIgnore
    public String getOrgCode() {
        return (String) this._get(FIELD_ORGCODE);
    }

    /**
     * 判断 「组织代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgCode() {
        return this._contains(FIELD_ORGCODE);
    }

    /**
     * 重置 「组织代码」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetOrgCode() {
        this._reset(FIELD_ORGCODE);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位标识」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setOrgName(String val) {
        this._set(FIELD_ORGNAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getOrgName() {
        return (String) this._get(FIELD_ORGNAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgName() {
        return this._contains(FIELD_ORGNAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetOrgName() {
        this._reset(FIELD_ORGNAME);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「人员状态」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「人员状态」值
     *
    */
    @JsonIgnore
    public String getState() {
        return (String) this._get(FIELD_STATE);
    }

    /**
     * 判断 「人员状态」是否有值
     *
    */
    @JsonIgnore
    public boolean containsState() {
        return this._contains(FIELD_STATE);
    }

    /**
     * 重置 「人员状态」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「UAA用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setUAAUserId(String val) {
        this._set(FIELD_UAAUSERID, val);
        return this;
    }

    /**
     * 获取「UAA用户标识」值
     *
    */
    @JsonIgnore
    public String getUAAUserId() {
        return (String) this._get(FIELD_UAAUSERID);
    }

    /**
     * 判断 「UAA用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUAAUserId() {
        return this._contains(FIELD_UAAUSERID);
    }

    /**
     * 重置 「UAA用户标识」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetUAAUserId() {
        this._reset(FIELD_UAAUSERID);
        return this;
    }

    /**
     * 设置「微信用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setWXWorkUnionId(String val) {
        this._set(FIELD_WXWORKUNIONID, val);
        return this;
    }

    /**
     * 获取「微信用户标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkUnionId() {
        return (String) this._get(FIELD_WXWORKUNIONID);
    }

    /**
     * 判断 「微信用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkUnionId() {
        return this._contains(FIELD_WXWORKUNIONID);
    }

    /**
     * 重置 「微信用户标识」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetWXWorkUnionId() {
        this._reset(FIELD_WXWORKUNIONID);
        return this;
    }

    /**
     * 设置「企业微信用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEmployeeDTO setWXWorkUserId(String val) {
        this._set(FIELD_WXWORKUSERID, val);
        return this;
    }

    /**
     * 获取「企业微信用户标识」值
     *
    */
    @JsonIgnore
    public String getWXWorkUserId() {
        return (String) this._get(FIELD_WXWORKUSERID);
    }

    /**
     * 判断 「企业微信用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsWXWorkUserId() {
        return this._contains(FIELD_WXWORKUSERID);
    }

    /**
     * 重置 「企业微信用户标识」
     *
    */
    @JsonIgnore
    public DCEmployeeDTO resetWXWorkUserId() {
        this._reset(FIELD_WXWORKUSERID);
        return this;
    }


}
