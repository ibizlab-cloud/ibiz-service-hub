package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 人员
 * 
 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/.ibizmodel.index
 */
public class Employee extends EntityBase {

	/**
	 * . 用户标识
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/USERID/.ibizmodel.index
	 */
	public final static String FIELD_USERID = "userid";

	/**
	 * . 用户全局名
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/USERNAME/.ibizmodel.index
	 */
	public final static String FIELD_USERNAME = "username";

	/**
	 * . 姓名
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/PERSONNAME/.ibizmodel.index
	 */
	public final static String FIELD_PERSONNAME = "personname";

	/**
	 * . 用户工号
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/USERCODE/.ibizmodel.index
	 */
	public final static String FIELD_USERCODE = "usercode";

	/**
	 * . 登录名
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/LOGINNAME/.ibizmodel.index
	 */
	public final static String FIELD_LOGINNAME = "loginname";

	/**
	 * . 密码
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/PASSWORD/.ibizmodel.index
	 */
	public final static String FIELD_PASSWORD = "password";

	/**
	 * . 区属
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/DOMAINS/.ibizmodel.index
	 */
	public final static String FIELD_DOMAINS = "domains";

	/**
	 * . 主部门
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/MDEPTID/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_DEPT_MDEPTID/.ibizmodel.index
	 */
	public final static String FIELD_MDEPTID = "mdeptid";

	/**
	 * . 主部门代码
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/MDEPTCODE/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_DEPT_MDEPTID/.ibizmodel.index
	 */
	public final static String FIELD_MDEPTCODE = "mdeptcode";

	/**
	 * . 主部门名称
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/MDEPTNAME/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_DEPT_MDEPTID/.ibizmodel.index
	 */
	public final static String FIELD_MDEPTNAME = "mdeptname";

	/**
	 * . 业务编码
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/BCODE/.ibizmodel.index
	 */
	public final static String FIELD_BCODE = "bcode";

	/**
	 * . 岗位标识
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/POSTID/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_POST_POSTID/.ibizmodel.index
	 */
	public final static String FIELD_POSTID = "postid";

	/**
	 * . 岗位代码
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/POSTCODE/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_POST_POSTID/.ibizmodel.index
	 */
	public final static String FIELD_POSTCODE = "postcode";

	/**
	 * . 岗位名称
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/POSTNAME/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_POST_POSTID/.ibizmodel.index
	 */
	public final static String FIELD_POSTNAME = "postname";

	/**
	 * . 单位
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/ORGID/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_ORG_ORGID/.ibizmodel.index
	 */
	public final static String FIELD_ORGID = "orgid";

	/**
	 * . 单位代码
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/ORGCODE/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_ORG_ORGID/.ibizmodel.index
	 */
	public final static String FIELD_ORGCODE = "orgcode";

	/**
	 * . 单位名称
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/ORGNAME/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/minorpsders/DER1N_SYS_EMP_SYS_ORG_ORGID/.ibizmodel.index
	 */
	public final static String FIELD_ORGNAME = "orgname";

	/**
	 * . 昵称别名
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/NICKNAME/.ibizmodel.index
	 */
	public final static String FIELD_NICKNAME = "nickname";

	/**
	 * . 证件号码
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/CERTCODE/.ibizmodel.index
	 */
	public final static String FIELD_CERTCODE = "certcode";

	/**
	 * . 性别
	 * {@link net.ibizsys.central.cloud.ebsx.spring.core.runtime.dict.StaticDict.CLSYS_Sex}
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/SEX/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/pscodelists/CLSYS_Sex.ibizmodel.yaml
	 */
	public final static String FIELD_SEX = "sex";

	/**
	 * . 出生日期
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/BIRTHDAY/.ibizmodel.index
	 */
	public final static String FIELD_BIRTHDAY = "birthday";

	/**
	 * . 联系方式
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/PHONE/.ibizmodel.index
	 */
	public final static String FIELD_PHONE = "phone";

	/**
	 * . 邮件
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/EMAIL/.ibizmodel.index
	 */
	public final static String FIELD_EMAIL = "email";

	/**
	 * . 社交账号
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/AVATAR/.ibizmodel.index
	 */
	public final static String FIELD_AVATAR = "avatar";

	/**
	 * . 地址
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/ADDR/.ibizmodel.index
	 */
	public final static String FIELD_ADDR = "addr";

	/**
	 * . 照片
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/USERICON/.ibizmodel.index
	 */
	public final static String FIELD_USERICON = "usericon";

	/**
	 * . ip地址
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/IPADDR/.ibizmodel.index
	 */
	public final static String FIELD_IPADDR = "ipaddr";

	/**
	 * . 样式
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/THEME/.ibizmodel.index
	 */
	public final static String FIELD_THEME = "theme";

	/**
	 * . 语言
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/LANG/.ibizmodel.index
	 */
	public final static String FIELD_LANG = "lang";

	/**
	 * . 字号
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/FONTSIZE/.ibizmodel.index
	 */
	public final static String FIELD_FONTSIZE = "fontsize";

	/**
	 * . 备注
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/MEMO/.ibizmodel.index
	 */
	public final static String FIELD_MEMO = "memo";

	/**
	 * . 保留
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/RESERVER/.ibizmodel.index
	 */
	public final static String FIELD_RESERVER = "reserver";

	/**
	 * . 保留2
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/RESERVER2/.ibizmodel.index
	 */
	public final static String FIELD_RESERVER2 = "reserver2";

	/**
	 * . 保留3
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/RESERVER3/.ibizmodel.index
	 */
	public final static String FIELD_RESERVER3 = "reserver3";

	/**
	 * . 排序
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/SHOWORDER/.ibizmodel.index
	 */
	public final static String FIELD_SHOWORDER = "showorder";

	/**
	 * . 超级管理员
	 * {@link net.ibizsys.central.cloud.ebsx.spring.core.runtime.dict.StaticDict.YesNo}
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/SUPERUSER/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
	 */
	public final static String FIELD_SUPERUSER = "superuser";

	/**
	 * . 创建时间
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/CREATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_CREATEDATE = "createdate";

	/**
	 * . 最后修改时间
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/UPDATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_UPDATEDATE = "updatedate";

	/**
	 * . 钉钉用户标识
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/DDUNIONID/.ibizmodel.index
	 */
	public final static String FIELD_DDUNIONID = "ddunionid";

	/**
	 * . 钉钉用户标识
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/DDUSERID/.ibizmodel.index
	 */
	public final static String FIELD_DDUSERID = "dduserid";

	/**
	 * . 租户
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/SRFDCID/.ibizmodel.index
	 */
	public final static String FIELD_SRFDCID = "srfdcid";

	/**
	 * . 人员状态
	 * {@link net.ibizsys.central.cloud.ebsx.spring.core.runtime.dict.StaticDict.UserState}
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/STATE/.ibizmodel.index
	 * @see ibizmos:/psmodules/ou/pscodelists/UserState.ibizmodel.yaml
	 */
	public final static String FIELD_STATE = "state";

	/**
	 * . UAA用户标识
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/UAAUSERID/.ibizmodel.index
	 */
	public final static String FIELD_UAAUSERID = "uaauserid";

	// /**.
	// * UAA用户名称
	// *
	// * @see
	// ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/UAAUSERNAME/.ibizmodel.index
	// */
	// public final static String FIELD_UAAUSERNAME = "uaausername";

	/**
	 * . 微信用户标识
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/WXWORKUNIONID/.ibizmodel.index
	 */
	public final static String FIELD_WXWORKUNIONID = "wxworkunionid";

	/**
	 * . 企业微信用户标识
	 *
	 * @see ibizmos:/psmodules/ou/psdataentities/SYS_EMP/psdefields/WXWORKUSERID/.ibizmodel.index
	 */
	public final static String FIELD_WXWORKUSERID = "wxworkuserid";

	public final static String FIELD_DCSYSTEMID = "dcsystemid";

	public final static String FIELD_PDEPTIDS = "pdeptids";

	public final static String FIELD_SDEPTIDS = "sdeptids";

	public final static String FIELD_PORGIDS = "porgids";

	public final static String FIELD_SORGIDS = "sorgids";
	
	public final static String FIELD_MQTTTOPIC = "mqtttopic";
	
	/**
	 * 全局会话标识
	 */
	public final static String FIELD_GLOBALSESSIONID = "globalsessionid";
	
	
	/**
	 * MQTT到期时间
	 */
	public final static String FIELD_MQTTEXPIRATION = "MQTTEXPIRATION";
	

	/**
	 * 设置「用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setUserId(String val) {
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
	public Employee resetUserId() {
		this.reset(FIELD_USERID);
		return this;
	}

	/**
	 * 设置「用户全局名」，等同 setUAAUserName
	 *
	 * @param val
	 */
	@JsonIgnore
	@Deprecated
	public Employee setUserName(String val) {
		this.set(FIELD_USERNAME, val);
		return this;
	}

	/**
	 * 获取「用户全局名」值，等同 getUAAUserName
	 *
	 */
	@JsonIgnore
	@Deprecated
	public String getUserName() {
		return (String) this.get(FIELD_USERNAME);
	}

	/**
	 * 判断 「用户全局名」是否有值，等同 containsUAAUserName
	 *
	 */
	@JsonIgnore
	@Deprecated
	public boolean containsUserName() {
		return this.contains(FIELD_USERNAME);
	}

	/**
	 * 重置 「用户全局名」，等同 resetUAAUserName
	 *
	 */
	@JsonIgnore
	@Deprecated
	public Employee resetUserName() {
		this.reset(FIELD_USERNAME);
		return this;
	}

	/**
	 * 设置「用户全局名」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setUAAUserName(String val) {
		this.set(FIELD_USERNAME, val);
		return this;
	}

	/**
	 * 获取「用户全局名」值
	 *
	 */
	@JsonIgnore
	public String getUAAUserName() {
		return (String) this.get(FIELD_USERNAME);
	}

	/**
	 * 判断 「用户全局名」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUAAUserName() {
		return this.contains(FIELD_USERNAME);
	}

	/**
	 * 重置 「用户全局名」
	 *
	 */
	@JsonIgnore
	public Employee resetUAAUserName() {
		this.reset(FIELD_USERNAME);
		return this;
	}

	/**
	 * 设置「姓名」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPersonName(String val) {
		this.set(FIELD_PERSONNAME, val);
		return this;
	}

	/**
	 * 获取「姓名」值
	 *
	 */
	@JsonIgnore
	public String getPersonName() {
		return (String) this.get(FIELD_PERSONNAME);
	}

	/**
	 * 判断 「姓名」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsPersonName() {
		return this.contains(FIELD_PERSONNAME);
	}

	/**
	 * 重置 「姓名」
	 *
	 */
	@JsonIgnore
	public Employee resetPersonName() {
		this.reset(FIELD_PERSONNAME);
		return this;
	}

	/**
	 * 设置「用户工号」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setUserCode(String val) {
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
	public Employee resetUserCode() {
		this.reset(FIELD_USERCODE);
		return this;
	}

	/**
	 * 设置「登录名」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setLoginName(String val) {
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
	public Employee resetLoginName() {
		this.reset(FIELD_LOGINNAME);
		return this;
	}

	/**
	 * 设置「密码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPassword(String val) {
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
	public Employee resetPassword() {
		this.reset(FIELD_PASSWORD);
		return this;
	}

	/**
	 * 设置「区属」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setDomains(String val) {
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
	public Employee resetDomains() {
		this.reset(FIELD_DOMAINS);
		return this;
	}

	/**
	 * 设置「主部门」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setMDeptId(String val) {
		this.set(FIELD_MDEPTID, val);
		return this;
	}

	/**
	 * 获取「主部门」值
	 *
	 */
	@JsonIgnore
	public String getMDeptId() {
		return (String) this.get(FIELD_MDEPTID);
	}

	/**
	 * 判断 「主部门」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMDeptId() {
		return this.contains(FIELD_MDEPTID);
	}

	/**
	 * 重置 「主部门」
	 *
	 */
	@JsonIgnore
	public Employee resetMDeptId() {
		this.reset(FIELD_MDEPTID);
		return this;
	}

	/**
	 * 设置「主部门代码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setMDeptCode(String val) {
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
	public Employee resetMDeptCode() {
		this.reset(FIELD_MDEPTCODE);
		return this;
	}

	/**
	 * 设置「主部门名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setMDeptName(String val) {
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
	public Employee resetMDeptName() {
		this.reset(FIELD_MDEPTNAME);
		return this;
	}

	/**
	 * 设置「业务编码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setBCode(String val) {
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
	public Employee resetBCode() {
		this.reset(FIELD_BCODE);
		return this;
	}

	/**
	 * 设置「岗位标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPostId(String val) {
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
	public Employee resetPostId() {
		this.reset(FIELD_POSTID);
		return this;
	}

	/**
	 * 设置「岗位代码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPostCode(String val) {
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
	public Employee resetPostCode() {
		this.reset(FIELD_POSTCODE);
		return this;
	}

	/**
	 * 设置「岗位名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPostName(String val) {
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
	public Employee resetPostName() {
		this.reset(FIELD_POSTNAME);
		return this;
	}

	/**
	 * 设置「单位」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setOrgId(String val) {
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
	public Employee resetOrgId() {
		this.reset(FIELD_ORGID);
		return this;
	}

	/**
	 * 设置「单位代码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setOrgCode(String val) {
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
	public Employee resetOrgCode() {
		this.reset(FIELD_ORGCODE);
		return this;
	}

	/**
	 * 设置「单位名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setOrgName(String val) {
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
	public Employee resetOrgName() {
		this.reset(FIELD_ORGNAME);
		return this;
	}

	/**
	 * 设置「昵称别名」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setNickName(String val) {
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
	public Employee resetNickName() {
		this.reset(FIELD_NICKNAME);
		return this;
	}

	/**
	 * 设置「证件号码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setCertCode(String val) {
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
	public Employee resetCertCode() {
		this.reset(FIELD_CERTCODE);
		return this;
	}

	/**
	 * 设置「性别」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setSex(String val) {
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
	public Employee resetSex() {
		this.reset(FIELD_SEX);
		return this;
	}

	/**
	 * 设置「出生日期」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setBirthday(Timestamp val) {
		this.set(FIELD_BIRTHDAY, val);
		return this;
	}

	/**
	 * 获取「出生日期」值
	 *
	 */
	@JsonIgnore
	public Timestamp getBirthday() {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(FIELD_BIRTHDAY), null);
		} catch (Exception e) {
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
	public Employee resetBirthday() {
		this.reset(FIELD_BIRTHDAY);
		return this;
	}

	/**
	 * 设置「联系方式」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPhone(String val) {
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
	public Employee resetPhone() {
		this.reset(FIELD_PHONE);
		return this;
	}

	/**
	 * 设置「邮件」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setEmail(String val) {
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
	public Employee resetEmail() {
		this.reset(FIELD_EMAIL);
		return this;
	}

	/**
	 * 设置「社交账号」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setAvatar(String val) {
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
	public Employee resetAvatar() {
		this.reset(FIELD_AVATAR);
		return this;
	}

	/**
	 * 设置「地址」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setAddr(String val) {
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
	public Employee resetAddr() {
		this.reset(FIELD_ADDR);
		return this;
	}

	/**
	 * 设置「照片」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setUserIcon(String val) {
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
	public Employee resetUserIcon() {
		this.reset(FIELD_USERICON);
		return this;
	}

	/**
	 * 设置「ip地址」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setIPAddr(String val) {
		this.set(FIELD_IPADDR, val);
		return this;
	}

	/**
	 * 获取「ip地址」值
	 *
	 */
	@JsonIgnore
	public String getIPAddr() {
		return (String) this.get(FIELD_IPADDR);
	}

	/**
	 * 判断 「ip地址」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIPAddr() {
		return this.contains(FIELD_IPADDR);
	}

	/**
	 * 重置 「ip地址」
	 *
	 */
	@JsonIgnore
	public Employee resetIPAddr() {
		this.reset(FIELD_IPADDR);
		return this;
	}

	/**
	 * 设置「样式」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setTheme(String val) {
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
	public Employee resetTheme() {
		this.reset(FIELD_THEME);
		return this;
	}

	/**
	 * 设置「语言」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setLang(String val) {
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
	public Employee resetLang() {
		this.reset(FIELD_LANG);
		return this;
	}

	/**
	 * 设置「字号」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setFontSize(String val) {
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
	public Employee resetFontSize() {
		this.reset(FIELD_FONTSIZE);
		return this;
	}

	/**
	 * 设置「备注」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setMemo(String val) {
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
	public Employee resetMemo() {
		this.reset(FIELD_MEMO);
		return this;
	}

	/**
	 * 设置「保留」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setReserver(String val) {
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
	public Employee resetReserver() {
		this.reset(FIELD_RESERVER);
		return this;
	}

	/**
	 * 设置「保留2」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setReserver2(String val) {
		this.set(FIELD_RESERVER2, val);
		return this;
	}

	/**
	 * 获取「保留2」值
	 *
	 */
	@JsonIgnore
	public String getReserver2() {
		return (String) this.get(FIELD_RESERVER2);
	}

	/**
	 * 判断 「保留2」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsReserver2() {
		return this.contains(FIELD_RESERVER2);
	}

	/**
	 * 重置 「保留2」
	 *
	 */
	@JsonIgnore
	public Employee resetReserver2() {
		this.reset(FIELD_RESERVER2);
		return this;
	}

	/**
	 * 设置「保留3」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setReserver3(String val) {
		this.set(FIELD_RESERVER3, val);
		return this;
	}

	/**
	 * 获取「保留3」值
	 *
	 */
	@JsonIgnore
	public String getReserver3() {
		return (String) this.get(FIELD_RESERVER3);
	}

	/**
	 * 判断 「保留3」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsReserver3() {
		return this.contains(FIELD_RESERVER3);
	}

	/**
	 * 重置 「保留3」
	 *
	 */
	@JsonIgnore
	public Employee resetReserver3() {
		this.reset(FIELD_RESERVER3);
		return this;
	}

	/**
	 * 设置「排序」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setShowOrder(Integer val) {
		this.set(FIELD_SHOWORDER, val);
		return this;
	}

	/**
	 * 获取「排序」值
	 *
	 */
	@JsonIgnore
	public Integer getShowOrder() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_SHOWORDER), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「排序」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsShowOrder() {
		return this.contains(FIELD_SHOWORDER);
	}

	/**
	 * 重置 「排序」
	 *
	 */
	@JsonIgnore
	public Employee resetShowOrder() {
		this.reset(FIELD_SHOWORDER);
		return this;
	}

	/**
	 * 设置「超级管理员」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setSuperUser(Integer val) {
		this.set(FIELD_SUPERUSER, val);
		return this;
	}

	/**
	 * 获取「超级管理员」值
	 *
	 */
	@JsonIgnore
	public Integer getSuperUser() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_SUPERUSER), null);
		} catch (Exception e) {
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
	public Employee resetSuperUser() {
		this.reset(FIELD_SUPERUSER);
		return this;
	}

	/**
	 * 设置「创建时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setCreateDate(Timestamp val) {
		this.set(FIELD_CREATEDATE, val);
		return this;
	}

	/**
	 * 获取「创建时间」值
	 *
	 */
	@JsonIgnore
	public Timestamp getCreateDate() {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATEDATE), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「创建时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCreateDate() {
		return this.contains(FIELD_CREATEDATE);
	}

	/**
	 * 重置 「创建时间」
	 *
	 */
	@JsonIgnore
	public Employee resetCreateDate() {
		this.reset(FIELD_CREATEDATE);
		return this;
	}

	/**
	 * 设置「最后修改时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setUpdateDate(Timestamp val) {
		this.set(FIELD_UPDATEDATE, val);
		return this;
	}

	/**
	 * 获取「最后修改时间」值
	 *
	 */
	@JsonIgnore
	public Timestamp getUpdateDate() {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATEDATE), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「最后修改时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUpdateDate() {
		return this.contains(FIELD_UPDATEDATE);
	}

	/**
	 * 重置 「最后修改时间」
	 *
	 */
	@JsonIgnore
	public Employee resetUpdateDate() {
		this.reset(FIELD_UPDATEDATE);
		return this;
	}

	/**
	 * 设置「钉钉用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setDDUnionId(String val) {
		this.set(FIELD_DDUNIONID, val);
		return this;
	}

	/**
	 * 获取「钉钉用户标识」值
	 *
	 */
	@JsonIgnore
	public String getDDUnionId() {
		return (String) this.get(FIELD_DDUNIONID);
	}

	/**
	 * 判断 「钉钉用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDDUnionId() {
		return this.contains(FIELD_DDUNIONID);
	}

	/**
	 * 重置 「钉钉用户标识」
	 *
	 */
	@JsonIgnore
	public Employee resetDDUnionId() {
		this.reset(FIELD_DDUNIONID);
		return this;
	}

	/**
	 * 设置「钉钉用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setDDUserId(String val) {
		this.set(FIELD_DDUSERID, val);
		return this;
	}

	/**
	 * 获取「钉钉用户标识」值
	 *
	 */
	@JsonIgnore
	public String getDDUserId() {
		return (String) this.get(FIELD_DDUSERID);
	}

	/**
	 * 判断 「钉钉用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDDUserId() {
		return this.contains(FIELD_DDUSERID);
	}

	/**
	 * 重置 「钉钉用户标识」
	 *
	 */
	@JsonIgnore
	public Employee resetDDUserId() {
		this.reset(FIELD_DDUSERID);
		return this;
	}

	/**
	 * 设置「租户」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setSrfdcid(String val) {
		this.set(FIELD_SRFDCID, val);
		return this;
	}

	/**
	 * 获取「租户」值
	 *
	 */
	@JsonIgnore
	public String getSrfdcid() {
		return (String) this.get(FIELD_SRFDCID);
	}

	/**
	 * 判断 「租户」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSrfdcid() {
		return this.contains(FIELD_SRFDCID);
	}

	/**
	 * 重置 「租户」
	 *
	 */
	@JsonIgnore
	public Employee resetSrfdcid() {
		this.reset(FIELD_SRFDCID);
		return this;
	}

	/**
	 * 设置「人员状态」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setState(String val) {
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
	public Employee resetState() {
		this.reset(FIELD_STATE);
		return this;
	}

	/**
	 * 设置「UAA用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setUAAUserId(String val) {
		this.set(FIELD_UAAUSERID, val);
		return this;
	}

	/**
	 * 获取「UAA用户标识」值
	 *
	 */
	@JsonIgnore
	public String getUAAUserId() {
		return (String) this.get(FIELD_UAAUSERID);
	}

	/**
	 * 判断 「UAA用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUAAUserId() {
		return this.contains(FIELD_UAAUSERID);
	}

	/**
	 * 重置 「UAA用户标识」
	 *
	 */
	@JsonIgnore
	public Employee resetUAAUserId() {
		this.reset(FIELD_UAAUSERID);
		return this;
	}

	//
	// /**
	// * 设置「UAA用户名称」
	// *
	// * @param val
	// */
	// @JsonIgnore
	// public Employee setUAAUserName(String val) {
	// this.set(FIELD_UAAUSERNAME, val);
	// return this;
	// }
	//
	// /**
	// * 获取「UAA用户名称」值
	// *
	// */
	// @JsonIgnore
	// public String getUAAUserName() {
	// return (String) this.get(FIELD_UAAUSERNAME);
	// }
	//
	// /**
	// * 判断 「UAA用户名称」是否有值
	// *
	// */
	// @JsonIgnore
	// public boolean containsUAAUserName() {
	// return this.contains(FIELD_UAAUSERNAME);
	// }
	//
	// /**
	// * 重置 「UAA用户名称」
	// *
	// */
	// @JsonIgnore
	// public Employee resetUAAUserName() {
	// this.reset(FIELD_UAAUSERNAME);
	// return this;
	// }
	//

	/**
	 * 设置「微信用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setWXWorkUnionId(String val) {
		this.set(FIELD_WXWORKUNIONID, val);
		return this;
	}

	/**
	 * 获取「微信用户标识」值
	 *
	 */
	@JsonIgnore
	public String getWXWorkUnionId() {
		return (String) this.get(FIELD_WXWORKUNIONID);
	}

	/**
	 * 判断 「微信用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsWXWorkUnionId() {
		return this.contains(FIELD_WXWORKUNIONID);
	}

	/**
	 * 重置 「微信用户标识」
	 *
	 */
	@JsonIgnore
	public Employee resetWXWorkUnionId() {
		this.reset(FIELD_WXWORKUNIONID);
		return this;
	}

	/**
	 * 设置「企业微信用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setWXWorkUserId(String val) {
		this.set(FIELD_WXWORKUSERID, val);
		return this;
	}

	/**
	 * 获取「企业微信用户标识」值
	 *
	 */
	@JsonIgnore
	public String getWXWorkUserId() {
		return (String) this.get(FIELD_WXWORKUSERID);
	}

	/**
	 * 判断 「企业微信用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsWXWorkUserId() {
		return this.contains(FIELD_WXWORKUSERID);
	}

	/**
	 * 重置 「企业微信用户标识」
	 *
	 */
	@JsonIgnore
	public Employee resetWXWorkUserId() {
		this.reset(FIELD_WXWORKUSERID);
		return this;
	}

	/**
	 * 设置「机构系统标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setDCSystemId(String val) {
		this.set(FIELD_DCSYSTEMID, val);
		return this;
	}

	/**
	 * 获取「机构系统标识」值
	 *
	 */
	@JsonIgnore
	public String getDCSystemId() {
		return (String) this.get(FIELD_DCSYSTEMID);
	}

	/**
	 * 判断 「机构系统标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDCSystemId() {
		return this.contains(FIELD_DCSYSTEMID);
	}

	/**
	 * 重置 「机构系统标识」
	 *
	 */
	@JsonIgnore
	public Employee resetDCSystemId() {
		this.reset(FIELD_DCSYSTEMID);
		return this;
	}

	/**
	 * 设置「父部门集合」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPDeptIds(String val) {
		this.set(FIELD_PDEPTIDS, val);
		return this;
	}

	/**
	 * 获取「父部门集合」值
	 *
	 */
	@JsonIgnore
	public String getPDeptIds() {
		return (String) this.get(FIELD_PDEPTIDS);
	}

	/**
	 * 判断 「父部门集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsPDeptIds() {
		return this.contains(FIELD_PDEPTIDS);
	}

	/**
	 * 重置 「父部门集合」
	 *
	 */
	@JsonIgnore
	public Employee resetPDeptIds() {
		this.reset(FIELD_PDEPTIDS);
		return this;
	}

	/**
	 * 设置「子部门集合」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setSDeptIds(String val) {
		this.set(FIELD_SDEPTIDS, val);
		return this;
	}

	/**
	 * 获取「子部门集合」值
	 *
	 */
	@JsonIgnore
	public String getSDeptIds() {
		return (String) this.get(FIELD_SDEPTIDS);
	}

	/**
	 * 判断 「子部门集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSDeptIds() {
		return this.contains(FIELD_SDEPTIDS);
	}

	/**
	 * 重置 「子部门集合」
	 *
	 */
	@JsonIgnore
	public Employee resetSDeptIds() {
		this.reset(FIELD_SDEPTIDS);
		return this;
	}

	/**
	 * 设置「父组织集合」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setPOrgIds(String val) {
		this.set(FIELD_PORGIDS, val);
		return this;
	}

	/**
	 * 获取「父组织集合」值
	 *
	 */
	@JsonIgnore
	public String getPOrgIds() {
		return (String) this.get(FIELD_PORGIDS);
	}

	/**
	 * 判断 「父组织集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsPOrgIds() {
		return this.contains(FIELD_PORGIDS);
	}

	/**
	 * 重置 「父组织集合」
	 *
	 */
	@JsonIgnore
	public Employee resetPOrgIds() {
		this.reset(FIELD_PORGIDS);
		return this;
	}

	/**
	 * 设置「子组织集合」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setSOrgIds(String val) {
		this.set(FIELD_SORGIDS, val);
		return this;
	}

	/**
	 * 获取「子组织集合」值
	 *
	 */
	@JsonIgnore
	public String getSOrgIds() {
		return (String) this.get(FIELD_SORGIDS);
	}

	/**
	 * 判断 「子组织集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSOrgIds() {
		return this.contains(FIELD_SORGIDS);
	}

	/**
	 * 重置 「子组织集合」
	 *
	 */
	@JsonIgnore
	public Employee resetSOrgIds() {
		this.reset(FIELD_SORGIDS);
		return this;
	}

	
	/**
	 * 设置「MQTT Topic」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setMqttTopic(String val) {
		this.set(FIELD_MQTTTOPIC, val);
		return this;
	}

	/**
	 * 获取「MQTT Topic」值
	 *
	 */
	@JsonIgnore
	public String getMqttTopic() {
		return (String) this.get(FIELD_MQTTTOPIC);
	}

	/**
	 * 判断 「MQTT Topic」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMqttTopic() {
		return this.contains(FIELD_MQTTTOPIC);
	}

	/**
	 * 重置 「MQTT Topic」
	 *
	 */
	@JsonIgnore
	public Employee resetMqttTopic() {
		this.reset(FIELD_MQTTTOPIC);
		return this;
	}
	
	
	/**
	 * 设置「全局会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setGlobalSessionId(String val) {
		this.set(FIELD_GLOBALSESSIONID, val);
		return this;
	}

	/**
	 * 获取「全局会话标识」值
	 *
	 */
	@JsonIgnore
	public String getGlobalSessionId() {
		return (String) this.get(FIELD_GLOBALSESSIONID);
	}

	/**
	 * 判断 「全局会话标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsGlobalSessionId() {
		return this.contains(FIELD_GLOBALSESSIONID);
	}

	/**
	 * 重置 「全局会话标识」
	 *
	 */
	@JsonIgnore
	public Employee resetGlobalSessionId() {
		this.reset(FIELD_GLOBALSESSIONID);
		return this;
	}
	
	
	/**
	 * 设置「MQTT Expiration」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Employee setMqttExpiration(Long val) {
		this.set(FIELD_MQTTEXPIRATION, val);
		return this;
	}

	/**
	 * 获取「MQTT Expiration」值
	 *
	 */
	@JsonIgnore
	public Long getMqttExpiration() {
		return DataTypeUtils.asLong(this.get(FIELD_MQTTEXPIRATION), null);
	}

	/**
	 * 判断 「MQTT Expiration」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMqttExpiration() {
		return this.contains(FIELD_MQTTEXPIRATION);
	}

	/**
	 * 重置 「MQTT Expiration」
	 *
	 */
	@JsonIgnore
	public Employee resetMqttExpiration() {
		this.reset(FIELD_MQTTEXPIRATION);
		return this;
	}
	
}
