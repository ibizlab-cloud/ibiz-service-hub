package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 第三方用户
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/.ibizmodel.index
 */
public class OpenUser extends EntityBase {

	/**
	 * . 开放平台接入标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ACCESSID/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/minorpsders/DER1N_SYS_OPEN_USER_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
	 */
	public final static String FIELD_ACCESSID = "accessid";

	/**
	 * . 开放平台
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ACCESSNAME/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/minorpsders/DER1N_SYS_OPEN_USER_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
	 */
	public final static String FIELD_ACCESSNAME = "accessname";

	/**
	 * . 建立时间
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/CREATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_CREATEDATE = "createdate";

	/**
	 * . 建立人
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/CREATEMAN/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
	 */
	public final static String FIELD_CREATEMAN = "createman";

	/**
	 * . 所属部门信息
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/DEPTS/.ibizmodel.index
	 */
	public final static String FIELD_DEPTS = "depts";

	/**
	 * . 绑定状态
	 * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo}
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ISBINDING/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
	 */
	public final static String FIELD_ISBINDING = "isbinding";

	/**
	 * . 手机号
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/MOBILE/.ibizmodel.index
	 */
	public final static String FIELD_MOBILE = "mobile";

	/**
	 * . 开放平台类型
	 * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType}
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPEN_TYPE/.ibizmodel.index
	 * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/minorpsders/DER1N_SYS_OPEN_USER_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
	 */
	public final static String FIELD_OPENTYPE = "opentype";

	/**
	 * . 登录名
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPENUSERCODE/.ibizmodel.index
	 */
	public final static String FIELD_OPENUSERCODE = "openusercode";

	/**
	 * . 开放用户标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPENUSERID/.ibizmodel.index
	 */
	public final static String FIELD_OPENUSERID = "openuserid";

	/**
	 * . 用户名称
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/OPENUSERNAME/.ibizmodel.index
	 */
	public final static String FIELD_OPENUSERNAME = "openusername";

	/**
	 * . 单位标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ORGID/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/minorpsders/DER1N_SYS_OPEN_USER_SYS_OPEN_ACCESS_ACCESSID/.ibizmodel.index
	 */
	public final static String FIELD_ORGID = "orgid";

	/**
	 * . 实际用户标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/REALID/.ibizmodel.index
	 */
	public final static String FIELD_REALID = "realid";

	/**
	 * . 系统用户标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/SYSUSERID/.ibizmodel.index
	 */
	public final static String FIELD_SYSUSERID = "sysuserid";

	/**
	 * . 更新时间
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/UPDATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_UPDATEDATE = "updatedate";

	/**
	 * . 更新人
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/UPDATEMAN/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
	 */
	public final static String FIELD_UPDATEMAN = "updateman";

	/**
	 * . 用户标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/USERID/.ibizmodel.index
	 */
	public final static String FIELD_USERID = "userid";

	/**
	 * . AccessKey
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/ACCESS_KEY/.ibizmodel.index
	 */
	public final static String FIELD_ACCESSKEY = "accesskey";

	/**
	 * . SecretKey
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_USER/psdefields/SECRET_KEY/.ibizmodel.index
	 */
	public final static String FIELD_SECRETKEY = "secretkey";

	/**
	 * 设置「开放平台接入标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setAccessId(String val) {
		this.set(FIELD_ACCESSID, val);
		return this;
	}

	/**
	 * 获取「开放平台接入标识」值
	 *
	 */
	@JsonIgnore
	public String getAccessId() {
		return (String) this.get(FIELD_ACCESSID);
	}

	/**
	 * 判断 「开放平台接入标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessId() {
		return this.contains(FIELD_ACCESSID);
	}

	/**
	 * 重置 「开放平台接入标识」
	 *
	 */
	@JsonIgnore
	public OpenUser resetAccessId() {
		this.reset(FIELD_ACCESSID);
		return this;
	}

	/**
	 * 设置「开放平台」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setAccessName(String val) {
		this.set(FIELD_ACCESSNAME, val);
		return this;
	}

	/**
	 * 获取「开放平台」值
	 *
	 */
	@JsonIgnore
	public String getAccessName() {
		return (String) this.get(FIELD_ACCESSNAME);
	}

	/**
	 * 判断 「开放平台」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessName() {
		return this.contains(FIELD_ACCESSNAME);
	}

	/**
	 * 重置 「开放平台」
	 *
	 */
	@JsonIgnore
	public OpenUser resetAccessName() {
		this.reset(FIELD_ACCESSNAME);
		return this;
	}

	/**
	 * 设置「建立时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setCreateDate(Timestamp val) {
		this.set(FIELD_CREATEDATE, val);
		return this;
	}

	/**
	 * 获取「建立时间」值
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
	 * 判断 「建立时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCreateDate() {
		return this.contains(FIELD_CREATEDATE);
	}

	/**
	 * 重置 「建立时间」
	 *
	 */
	@JsonIgnore
	public OpenUser resetCreateDate() {
		this.reset(FIELD_CREATEDATE);
		return this;
	}

	/**
	 * 设置「建立人」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setCreateMan(String val) {
		this.set(FIELD_CREATEMAN, val);
		return this;
	}

	/**
	 * 获取「建立人」值
	 *
	 */
	@JsonIgnore
	public String getCreateMan() {
		return (String) this.get(FIELD_CREATEMAN);
	}

	/**
	 * 判断 「建立人」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCreateMan() {
		return this.contains(FIELD_CREATEMAN);
	}

	/**
	 * 重置 「建立人」
	 *
	 */
	@JsonIgnore
	public OpenUser resetCreateMan() {
		this.reset(FIELD_CREATEMAN);
		return this;
	}

	/**
	 * 设置「所属部门信息」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setDepts(String val) {
		this.set(FIELD_DEPTS, val);
		return this;
	}

	/**
	 * 获取「所属部门信息」值
	 *
	 */
	@JsonIgnore
	public String getDepts() {
		return (String) this.get(FIELD_DEPTS);
	}

	/**
	 * 判断 「所属部门信息」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDepts() {
		return this.contains(FIELD_DEPTS);
	}

	/**
	 * 重置 「所属部门信息」
	 *
	 */
	@JsonIgnore
	public OpenUser resetDepts() {
		this.reset(FIELD_DEPTS);
		return this;
	}

	/**
	 * 设置「绑定状态」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setIsBinding(Integer val) {
		this.set(FIELD_ISBINDING, val);
		return this;
	}

	/**
	 * 获取「绑定状态」值
	 *
	 */
	@JsonIgnore
	public Integer getIsBinding() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_ISBINDING), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「绑定状态」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIsBinding() {
		return this.contains(FIELD_ISBINDING);
	}

	/**
	 * 重置 「绑定状态」
	 *
	 */
	@JsonIgnore
	public OpenUser resetIsBinding() {
		this.reset(FIELD_ISBINDING);
		return this;
	}

	/**
	 * 设置「手机号」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setMobile(String val) {
		this.set(FIELD_MOBILE, val);
		return this;
	}

	/**
	 * 获取「手机号」值
	 *
	 */
	@JsonIgnore
	public String getMobile() {
		return (String) this.get(FIELD_MOBILE);
	}

	/**
	 * 判断 「手机号」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMobile() {
		return this.contains(FIELD_MOBILE);
	}

	/**
	 * 重置 「手机号」
	 *
	 */
	@JsonIgnore
	public OpenUser resetMobile() {
		this.reset(FIELD_MOBILE);
		return this;
	}

	/**
	 * 设置「开放平台类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setOpenType(String val) {
		this.set(FIELD_OPENTYPE, val);
		return this;
	}

	/**
	 * 获取「开放平台类型」值
	 *
	 */
	@JsonIgnore
	public String getOpenType() {
		return (String) this.get(FIELD_OPENTYPE);
	}

	/**
	 * 判断 「开放平台类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOpenType() {
		return this.contains(FIELD_OPENTYPE);
	}

	/**
	 * 重置 「开放平台类型」
	 *
	 */
	@JsonIgnore
	public OpenUser resetOpenType() {
		this.reset(FIELD_OPENTYPE);
		return this;
	}

	/**
	 * 设置「登录名」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setOpenUserCode(String val) {
		this.set(FIELD_OPENUSERCODE, val);
		return this;
	}

	/**
	 * 获取「登录名」值
	 *
	 */
	@JsonIgnore
	public String getOpenUserCode() {
		return (String) this.get(FIELD_OPENUSERCODE);
	}

	/**
	 * 判断 「登录名」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOpenUserCode() {
		return this.contains(FIELD_OPENUSERCODE);
	}

	/**
	 * 重置 「登录名」
	 *
	 */
	@JsonIgnore
	public OpenUser resetOpenUserCode() {
		this.reset(FIELD_OPENUSERCODE);
		return this;
	}

	/**
	 * 设置「开放用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setOpenUserId(String val) {
		this.set(FIELD_OPENUSERID, val);
		return this;
	}

	/**
	 * 获取「开放用户标识」值
	 *
	 */
	@JsonIgnore
	public String getOpenUserId() {
		return (String) this.get(FIELD_OPENUSERID);
	}

	/**
	 * 判断 「开放用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOpenUserId() {
		return this.contains(FIELD_OPENUSERID);
	}

	/**
	 * 重置 「开放用户标识」
	 *
	 */
	@JsonIgnore
	public OpenUser resetOpenUserId() {
		this.reset(FIELD_OPENUSERID);
		return this;
	}

	/**
	 * 设置「用户名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setOpenUserName(String val) {
		this.set(FIELD_OPENUSERNAME, val);
		return this;
	}

	/**
	 * 获取「用户名称」值
	 *
	 */
	@JsonIgnore
	public String getOpenUserName() {
		return (String) this.get(FIELD_OPENUSERNAME);
	}

	/**
	 * 判断 「用户名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOpenUserName() {
		return this.contains(FIELD_OPENUSERNAME);
	}

	/**
	 * 重置 「用户名称」
	 *
	 */
	@JsonIgnore
	public OpenUser resetOpenUserName() {
		this.reset(FIELD_OPENUSERNAME);
		return this;
	}

	/**
	 * 设置「单位标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setOrgId(String val) {
		this.set(FIELD_ORGID, val);
		return this;
	}

	/**
	 * 获取「单位标识」值
	 *
	 */
	@JsonIgnore
	public String getOrgId() {
		return (String) this.get(FIELD_ORGID);
	}

	/**
	 * 判断 「单位标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOrgId() {
		return this.contains(FIELD_ORGID);
	}

	/**
	 * 重置 「单位标识」
	 *
	 */
	@JsonIgnore
	public OpenUser resetOrgId() {
		this.reset(FIELD_ORGID);
		return this;
	}

	/**
	 * 设置「实际用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setRealId(String val) {
		this.set(FIELD_REALID, val);
		return this;
	}

	/**
	 * 获取「实际用户标识」值
	 *
	 */
	@JsonIgnore
	public String getRealId() {
		return (String) this.get(FIELD_REALID);
	}

	/**
	 * 判断 「实际用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRealId() {
		return this.contains(FIELD_REALID);
	}

	/**
	 * 重置 「实际用户标识」
	 *
	 */
	@JsonIgnore
	public OpenUser resetRealId() {
		this.reset(FIELD_REALID);
		return this;
	}

	/**
	 * 设置「系统用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setSysUserId(String val) {
		this.set(FIELD_SYSUSERID, val);
		return this;
	}

	/**
	 * 获取「系统用户标识」值
	 *
	 */
	@JsonIgnore
	public String getSysUserId() {
		return (String) this.get(FIELD_SYSUSERID);
	}

	/**
	 * 判断 「系统用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSysUserId() {
		return this.contains(FIELD_SYSUSERID);
	}

	/**
	 * 重置 「系统用户标识」
	 *
	 */
	@JsonIgnore
	public OpenUser resetSysUserId() {
		this.reset(FIELD_SYSUSERID);
		return this;
	}

	/**
	 * 设置「更新时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setUpdateDate(Timestamp val) {
		this.set(FIELD_UPDATEDATE, val);
		return this;
	}

	/**
	 * 获取「更新时间」值
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
	 * 判断 「更新时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUpdateDate() {
		return this.contains(FIELD_UPDATEDATE);
	}

	/**
	 * 重置 「更新时间」
	 *
	 */
	@JsonIgnore
	public OpenUser resetUpdateDate() {
		this.reset(FIELD_UPDATEDATE);
		return this;
	}

	/**
	 * 设置「更新人」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setUpdateMan(String val) {
		this.set(FIELD_UPDATEMAN, val);
		return this;
	}

	/**
	 * 获取「更新人」值
	 *
	 */
	@JsonIgnore
	public String getUpdateMan() {
		return (String) this.get(FIELD_UPDATEMAN);
	}

	/**
	 * 判断 「更新人」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUpdateMan() {
		return this.contains(FIELD_UPDATEMAN);
	}

	/**
	 * 重置 「更新人」
	 *
	 */
	@JsonIgnore
	public OpenUser resetUpdateMan() {
		this.reset(FIELD_UPDATEMAN);
		return this;
	}

	/**
	 * 设置「用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setUserId(String val) {
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
	public OpenUser resetUserId() {
		this.reset(FIELD_USERID);
		return this;
	}
	
	
	/**
	 * 设置「AccessKey(AppId)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setAccessKey(String val) {
		this.set(FIELD_ACCESSKEY, val);
		return this;
	}

	/**
	 * 获取「AccessKey(AppId)」值
	 *
	 */
	@JsonIgnore
	public String getAccessKey() {
		return (String) this.get(FIELD_ACCESSKEY);
	}

	/**
	 * 判断 「AccessKey(AppId)」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessKey() {
		return this.contains(FIELD_ACCESSKEY);
	}

	/**
	 * 重置 「AccessKey(AppId)」
	 *
	 */
	@JsonIgnore
	public OpenUser resetAccessKey() {
		this.reset(FIELD_ACCESSKEY);
		return this;
	}

	/**
	 * 设置「SecretKey(AppSecret)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenUser setSecretKey(String val) {
		this.set(FIELD_SECRETKEY, val);
		return this;
	}

	/**
	 * 获取「SecretKey(AppSecret)」值
	 *
	 */
	@JsonIgnore
	public String getSecretKey() {
		return (String) this.get(FIELD_SECRETKEY);
	}

	/**
	 * 判断 「SecretKey(AppSecret)」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSecretKey() {
		return this.contains(FIELD_SECRETKEY);
	}

	/**
	 * 重置 「SecretKey(AppSecret)」
	 *
	 */
	@JsonIgnore
	public OpenUser resetSecretKey() {
		this.reset(FIELD_SECRETKEY);
		return this;
	}

}
