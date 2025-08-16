package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 系统数据对象
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/.ibizmodel.index
 */
public class System extends EntityBase {

	/**
	 * . 系统标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/SYSTEMID/.ibizmodel.index
	 */
	public final static String FIELD_SYSTEMID = "pssystemid";

	/**
	 * . 系统名称
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/SYSTEMNAME/.ibizmodel.index
	 */
	public final static String FIELD_SYSTEMNAME = "pssystemname";

	/**
	 * . 结构
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/SYSSTRUCTURE/.ibizmodel.index
	 */
	public final static String FIELD_SYSSTRUCTURE = "sysstructure";

	/**
	 * . 应用
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/APPS/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_APP/minorpsders/DER1N_SYS_APP_SYS_SYSTEM_SYSTEMID/.ibizmodel.index
	 */
	public final static String FIELD_APPS = "apps";

	/**
	 * . 校验
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/MD5CHECK/.ibizmodel.index
	 */
	public final static String FIELD_MD5CHECK = "md5check";

	/**
	 * . 排序
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/SHOWORDER/.ibizmodel.index
	 */
	public final static String FIELD_SHOWORDER = "showorder";

	/**
	 * . IP地址
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/IPADRESS/.ibizmodel.index
	 */
	public final static String FIELD_IPADDRESS = "ipaddress";

	/**
	 * . 回调系统标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/REALPSDEVSLNSYSID/.ibizmodel.index
	 */
	public final static String FIELD_REALPSDEVSLNSYSID = "realpsdevslnsysid";

	/**
	 * . 系统模型（远程仓库）
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/REMOTESYSMODEL/.ibizmodel.index
	 */
	public final static String FIELD_REMOTESYSMODEL = "remotesysmodel";

	/**
	 * . 仓库分支
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/REMOTESYSMODELBRANCH/.ibizmodel.index
	 */
	public final static String FIELD_REMOTESYSMODELBRANCH = "remotesysmodelbranch";

	/**
	 * . 系统模型（远程路径）
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/REMOTESYSMODELPATH/.ibizmodel.index
	 */
	public final static String FIELD_REMOTESYSMODELPATH = "remotesysmodelpath";

	/**
	 * . 远程密码
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/REMOTESYSMODELPWD/.ibizmodel.index
	 */
	public final static String FIELD_REMOTESYSMODELPWD = "remotesysmodelpwd";

	/**
	 * . 远程账户
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/REMOTESYSMODELUSER/.ibizmodel.index
	 */
	public final static String FIELD_REMOTESYSMODELUSER = "remotesysmodeluser";

	/**
	 * . 系统模型
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_SYSTEM/psdefields/SYSMODEL/.ibizmodel.index
	 */
	public final static String FIELD_SYSMODEL = "sysmodel";

	/**
	 * 设置「系统标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setSystemId(String val) {
		this.set(FIELD_SYSTEMID, val);
		return this;
	}

	/**
	 * 获取「系统标识」值
	 *
	 */
	@JsonIgnore
	public String getSystemId() {
		return (String) this.get(FIELD_SYSTEMID);
	}

	/**
	 * 判断 「系统标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSystemId() {
		return this.contains(FIELD_SYSTEMID);
	}

	/**
	 * 重置 「系统标识」
	 *
	 */
	@JsonIgnore
	public System resetSystemId() {
		this.reset(FIELD_SYSTEMID);
		return this;
	}

	/**
	 * 设置「系统名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setSystemName(String val) {
		this.set(FIELD_SYSTEMNAME, val);
		return this;
	}

	/**
	 * 获取「系统名称」值
	 *
	 */
	@JsonIgnore
	public String getSystemName() {
		return (String) this.get(FIELD_SYSTEMNAME);
	}

	/**
	 * 判断 「系统名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSystemName() {
		return this.contains(FIELD_SYSTEMNAME);
	}

	/**
	 * 重置 「系统名称」
	 *
	 */
	@JsonIgnore
	public System resetSystemName() {
		this.reset(FIELD_SYSTEMNAME);
		return this;
	}

	/**
	 * 设置「结构」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setSysStructure(String val) {
		this.set(FIELD_SYSSTRUCTURE, val);
		return this;
	}

	/**
	 * 获取「结构」值
	 *
	 */
	@JsonIgnore
	public String getSysStructure() {
		return (String) this.get(FIELD_SYSSTRUCTURE);
	}

	/**
	 * 判断 「结构」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSysStructure() {
		return this.contains(FIELD_SYSSTRUCTURE);
	}

	/**
	 * 重置 「结构」
	 *
	 */
	@JsonIgnore
	public System resetSysStructure() {
		this.reset(FIELD_SYSSTRUCTURE);
		return this;
	}

	/**
	 * 设置「校验」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setMD5Check(String val) {
		this.set(FIELD_MD5CHECK, val);
		return this;
	}

	/**
	 * 获取「校验」值
	 *
	 */
	@JsonIgnore
	public String getMD5Check() {
		return (String) this.get(FIELD_MD5CHECK);
	}

	/**
	 * 判断 「校验」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMD5Check() {
		return this.contains(FIELD_MD5CHECK);
	}

	/**
	 * 重置 「校验」
	 *
	 */
	@JsonIgnore
	public System resetMD5Check() {
		this.reset(FIELD_MD5CHECK);
		return this;
	}

	/**
	 * 设置「排序」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setShowOrder(Integer val) {
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
	public System resetShowOrder() {
		this.reset(FIELD_SHOWORDER);
		return this;
	}

	/**
	 * 设置「IP地址」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setIPAddress(String val) {
		this.set(FIELD_IPADDRESS, val);
		return this;
	}

	/**
	 * 获取「IP地址」值
	 *
	 */
	@JsonIgnore
	public String getIPAddress() {
		return (String) this.get(FIELD_IPADDRESS);
	}

	/**
	 * 判断 「IP地址」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIPAddress() {
		return this.contains(FIELD_IPADDRESS);
	}

	/**
	 * 重置 「IP地址」
	 *
	 */
	@JsonIgnore
	public System resetIPAddress() {
		this.reset(FIELD_IPADDRESS);
		return this;
	}

	/**
	 * 设置「回调系统标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setRealPSDevSlnSysId(String val) {
		this.set(FIELD_REALPSDEVSLNSYSID, val);
		return this;
	}

	/**
	 * 获取「回调系统标识」值
	 *
	 */
	@JsonIgnore
	public String getRealPSDevSlnSysId() {
		return (String) this.get(FIELD_REALPSDEVSLNSYSID);
	}

	/**
	 * 判断 「回调系统标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRealPSDevSlnSysId() {
		return this.contains(FIELD_REALPSDEVSLNSYSID);
	}

	/**
	 * 重置 「回调系统标识」
	 *
	 */
	@JsonIgnore
	public System resetRealPSDevSlnSysId() {
		this.reset(FIELD_REALPSDEVSLNSYSID);
		return this;
	}

	/**
	 * 设置「系统模型（远程仓库）」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setRemoteSysModel(String val) {
		this.set(FIELD_REMOTESYSMODEL, val);
		return this;
	}

	/**
	 * 获取「系统模型（远程仓库）」值
	 *
	 */
	@JsonIgnore
	public String getRemoteSysModel() {
		return (String) this.get(FIELD_REMOTESYSMODEL);
	}

	/**
	 * 判断 「系统模型（远程仓库）」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRemoteSysModel() {
		return this.contains(FIELD_REMOTESYSMODEL);
	}

	/**
	 * 重置 「系统模型（远程仓库）」
	 *
	 */
	@JsonIgnore
	public System resetRemoteSysModel() {
		this.reset(FIELD_REMOTESYSMODEL);
		return this;
	}

	/**
	 * 设置「仓库分支」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setRemoteSysModelBranch(String val) {
		this.set(FIELD_REMOTESYSMODELBRANCH, val);
		return this;
	}

	/**
	 * 获取「仓库分支」值
	 *
	 */
	@JsonIgnore
	public String getRemoteSysModelBranch() {
		return (String) this.get(FIELD_REMOTESYSMODELBRANCH);
	}

	/**
	 * 判断 「仓库分支」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRemoteSysModelBranch() {
		return this.contains(FIELD_REMOTESYSMODELBRANCH);
	}

	/**
	 * 重置 「仓库分支」
	 *
	 */
	@JsonIgnore
	public System resetRemoteSysModelBranch() {
		this.reset(FIELD_REMOTESYSMODELBRANCH);
		return this;
	}

	/**
	 * 设置「系统模型（远程路径）」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setRemoteSysModelPath(String val) {
		this.set(FIELD_REMOTESYSMODELPATH, val);
		return this;
	}

	/**
	 * 获取「系统模型（远程路径）」值
	 *
	 */
	@JsonIgnore
	public String getRemoteSysModelPath() {
		return (String) this.get(FIELD_REMOTESYSMODELPATH);
	}

	/**
	 * 判断 「系统模型（远程路径）」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRemoteSysModelPath() {
		return this.contains(FIELD_REMOTESYSMODELPATH);
	}

	/**
	 * 重置 「系统模型（远程路径）」
	 *
	 */
	@JsonIgnore
	public System resetRemoteSysModelPath() {
		this.reset(FIELD_REMOTESYSMODELPATH);
		return this;
	}

	/**
	 * 设置「远程密码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setRemoteSysModelPwd(String val) {
		this.set(FIELD_REMOTESYSMODELPWD, val);
		return this;
	}

	/**
	 * 获取「远程密码」值
	 *
	 */
	@JsonIgnore
	public String getRemoteSysModelPwd() {
		return (String) this.get(FIELD_REMOTESYSMODELPWD);
	}

	/**
	 * 判断 「远程密码」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRemoteSysModelPwd() {
		return this.contains(FIELD_REMOTESYSMODELPWD);
	}

	/**
	 * 重置 「远程密码」
	 *
	 */
	@JsonIgnore
	public System resetRemoteSysModelPwd() {
		this.reset(FIELD_REMOTESYSMODELPWD);
		return this;
	}

	/**
	 * 设置「远程账户」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setRemoteSysModelUser(String val) {
		this.set(FIELD_REMOTESYSMODELUSER, val);
		return this;
	}

	/**
	 * 获取「远程账户」值
	 *
	 */
	@JsonIgnore
	public String getRemoteSysModelUser() {
		return (String) this.get(FIELD_REMOTESYSMODELUSER);
	}

	/**
	 * 判断 「远程账户」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRemoteSysModelUser() {
		return this.contains(FIELD_REMOTESYSMODELUSER);
	}

	/**
	 * 重置 「远程账户」
	 *
	 */
	@JsonIgnore
	public System resetRemoteSysModelUser() {
		this.reset(FIELD_REMOTESYSMODELUSER);
		return this;
	}

	/**
	 * 设置「系统模型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public System setSysModel(String val) {
		this.set(FIELD_SYSMODEL, val);
		return this;
	}

	/**
	 * 获取「系统模型」值
	 *
	 */
	@JsonIgnore
	public String getSysModel() {
		return (String) this.get(FIELD_SYSMODEL);
	}

	/**
	 * 判断 「系统模型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSysModel() {
		return this.contains(FIELD_SYSMODEL);
	}

	/**
	 * 重置 「系统模型」
	 *
	 */
	@JsonIgnore
	public System resetSysModel() {
		this.reset(FIELD_SYSMODEL);
		return this;
	}

}
