package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 组织系统
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/.ibizmodel.index
 */
public class DCSystem extends EntityBase {

	/**
	 * . 备注
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/MEMO/.ibizmodel.index
	 */
	public final static String FIELD_MEMO = "memo";

	/**
	 * . 建立时间
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/CREATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_CREATEDATE = "createdate";

	/**
	 * . 建立人
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/CREATEMAN/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
	 */
	public final static String FIELD_CREATEMAN = "createman";

	/**
	 * . 租户系统标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/DCSYSTEMID/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/minorpsders/DER1N_SYS_ORG_SYSTEM_SYS_DC_SYSTEM_DC_SYSTEM_ID_55BE22/.ibizmodel.index
	 */
	public final static String FIELD_DCSYSTEMID = "dcsystemid";

	/**
	 * . 动态实例标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/DYNAINSTID/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/minorpsders/DER1N_SYS_ORG_SYSTEM_SYS_DYNAINST_DYNAINSTID_55BE22/.ibizmodel.index
	 */
	public final static String FIELD_DYNAINSTID = "dynainstid";

	/**
	 * . 动态实例
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/DYNAINSTNAME/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/minorpsders/DER1N_SYS_ORG_SYSTEM_SYS_DYNAINST_DYNAINSTID_55BE22/.ibizmodel.index
	 */
	public final static String FIELD_DYNAINSTNAME = "dynainstname";

	/**
	 * . 启用标志
	 * {@link net.ibizsys.central.cloud.ebsx.spring.core.runtime.dict.StaticDict.YesNo}
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/ISVALID/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
	 */
	public final static String FIELD_ISVALID = "isvalid";

	/**
	 * . 单位标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/ORGID/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/minorpsders/DER1N_SYS_ORG_SYSTEM_SYS_ORG_ORGID_55BE22/.ibizmodel.index
	 */
	public final static String FIELD_ORGID = "orgid";

	/**
	 * . 单位名称
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/ORGNAME/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/minorpsders/DER1N_SYS_ORG_SYSTEM_SYS_ORG_ORGID_55BE22/.ibizmodel.index
	 */
	public final static String FIELD_ORGNAME = "orgname";

	/**
	 * . 组织系统标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/ORGSYSTEMID/.ibizmodel.index
	 */
	public final static String FIELD_ORGSYSTEMID = "orgsystemid";

	/**
	 * . 组织系统名称
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/ORGSYSTEMNAME/.ibizmodel.index
	 */
	public final static String FIELD_ORGSYSTEMNAME = "orgsystemname";

	/**
	 * . 租户
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/SRFDCID/.ibizmodel.index
	 */
	public final static String FIELD_SRFDCID = "srfdcid";

	/**
	 * . 系统
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/SYSTEMID/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/minorpsders/DER1N_SYS_ORG_SYSTEM_SYS_DC_SYSTEM_DC_SYSTEM_ID_55BE22/.ibizmodel.index
	 */
	public final static String FIELD_SYSTEMID = "systemid";

	/**
	 * . 更新时间
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/UPDATEDATE/.ibizmodel.index
	 */
	public final static String FIELD_UPDATEDATE = "updatedate";

	/**
	 * . 更新人
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEM/psdefields/UPDATEMAN/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
	 */
	public final static String FIELD_UPDATEMAN = "updateman";

	/**
	 * . 开放平台访问标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/ACCESSID/.ibizmodel.index
	 */
	public final static String FIELD_ACCESSID = "accessid";

	/**
	 * . 租户系统名称
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_DC_SYSTEM/psdefields/DCSYSTEMNAME/.ibizmodel.index
	 */
	public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

	/**
	 * 设置「备注」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setMemo(String val) {
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
	public DCSystem resetMemo() {
		this.reset(FIELD_MEMO);
		return this;
	}

	/**
	 * 设置「建立时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setCreateDate(Timestamp val) {
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
	public DCSystem resetCreateDate() {
		this.reset(FIELD_CREATEDATE);
		return this;
	}

	/**
	 * 设置「建立人」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setCreateMan(String val) {
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
	public DCSystem resetCreateMan() {
		this.reset(FIELD_CREATEMAN);
		return this;
	}

	/**
	 * 设置「租户系统标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setDCSystemId(String val) {
		this.set(FIELD_DCSYSTEMID, val);
		return this;
	}

	/**
	 * 获取「租户系统标识」值
	 *
	 */
	@JsonIgnore
	public String getDCSystemId() {
		return (String) this.get(FIELD_DCSYSTEMID);
	}

	/**
	 * 判断 「租户系统标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDCSystemId() {
		return this.contains(FIELD_DCSYSTEMID);
	}

	/**
	 * 重置 「租户系统标识」
	 *
	 */
	@JsonIgnore
	public DCSystem resetDCSystemId() {
		this.reset(FIELD_DCSYSTEMID);
		return this;
	}

	/**
	 * 设置「动态实例标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setDynaInstId(String val) {
		this.set(FIELD_DYNAINSTID, val);
		return this;
	}

	/**
	 * 获取「动态实例标识」值
	 *
	 */
	@JsonIgnore
	public String getDynaInstId() {
		return (String) this.get(FIELD_DYNAINSTID);
	}

	/**
	 * 判断 「动态实例标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDynaInstId() {
		return this.contains(FIELD_DYNAINSTID);
	}

	/**
	 * 重置 「动态实例标识」
	 *
	 */
	@JsonIgnore
	public DCSystem resetDynaInstId() {
		this.reset(FIELD_DYNAINSTID);
		return this;
	}

	/**
	 * 设置「动态实例」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setDynaInstName(String val) {
		this.set(FIELD_DYNAINSTNAME, val);
		return this;
	}

	/**
	 * 获取「动态实例」值
	 *
	 */
	@JsonIgnore
	public String getDynaInstName() {
		return (String) this.get(FIELD_DYNAINSTNAME);
	}

	/**
	 * 判断 「动态实例」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDynaInstName() {
		return this.contains(FIELD_DYNAINSTNAME);
	}

	/**
	 * 重置 「动态实例」
	 *
	 */
	@JsonIgnore
	public DCSystem resetDynaInstName() {
		this.reset(FIELD_DYNAINSTNAME);
		return this;
	}

	/**
	 * 设置「启用标志」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setIsValid(Integer val) {
		this.set(FIELD_ISVALID, val);
		return this;
	}

	/**
	 * 获取「启用标志」值
	 *
	 */
	@JsonIgnore
	public Integer getIsValid() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_ISVALID), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「启用标志」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIsValid() {
		return this.contains(FIELD_ISVALID);
	}

	/**
	 * 重置 「启用标志」
	 *
	 */
	@JsonIgnore
	public DCSystem resetIsValid() {
		this.reset(FIELD_ISVALID);
		return this;
	}

	/**
	 * 设置「单位标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setOrgId(String val) {
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
	public DCSystem resetOrgId() {
		this.reset(FIELD_ORGID);
		return this;
	}

	/**
	 * 设置「单位名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setOrgName(String val) {
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
	public DCSystem resetOrgName() {
		this.reset(FIELD_ORGNAME);
		return this;
	}

	/**
	 * 设置「组织系统标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setOrgSystemId(String val) {
		this.set(FIELD_ORGSYSTEMID, val);
		return this;
	}

	/**
	 * 获取「组织系统标识」值
	 *
	 */
	@JsonIgnore
	public String getOrgSystemId() {
		return (String) this.get(FIELD_ORGSYSTEMID);
	}

	/**
	 * 判断 「组织系统标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOrgSystemId() {
		return this.contains(FIELD_ORGSYSTEMID);
	}

	/**
	 * 重置 「组织系统标识」
	 *
	 */
	@JsonIgnore
	public DCSystem resetOrgSystemId() {
		this.reset(FIELD_ORGSYSTEMID);
		return this;
	}

	/**
	 * 设置「组织系统名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setOrgSystemName(String val) {
		this.set(FIELD_ORGSYSTEMNAME, val);
		return this;
	}

	/**
	 * 获取「组织系统名称」值
	 *
	 */
	@JsonIgnore
	public String getOrgSystemName() {
		return (String) this.get(FIELD_ORGSYSTEMNAME);
	}

	/**
	 * 判断 「组织系统名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOrgSystemName() {
		return this.contains(FIELD_ORGSYSTEMNAME);
	}

	/**
	 * 重置 「组织系统名称」
	 *
	 */
	@JsonIgnore
	public DCSystem resetOrgSystemName() {
		this.reset(FIELD_ORGSYSTEMNAME);
		return this;
	}

	/**
	 * 设置「租户」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setSrfdcid(String val) {
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
	public DCSystem resetSrfdcid() {
		this.reset(FIELD_SRFDCID);
		return this;
	}

	/**
	 * 设置「系统」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setSystemId(String val) {
		this.set(FIELD_SYSTEMID, val);
		return this;
	}

	/**
	 * 获取「系统」值
	 *
	 */
	@JsonIgnore
	public String getSystemId() {
		return (String) this.get(FIELD_SYSTEMID);
	}

	/**
	 * 判断 「系统」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSystemId() {
		return this.contains(FIELD_SYSTEMID);
	}

	/**
	 * 重置 「系统」
	 *
	 */
	@JsonIgnore
	public DCSystem resetSystemId() {
		this.reset(FIELD_SYSTEMID);
		return this;
	}

	/**
	 * 设置「更新时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setUpdateDate(Timestamp val) {
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
	public DCSystem resetUpdateDate() {
		this.reset(FIELD_UPDATEDATE);
		return this;
	}

	/**
	 * 设置「更新人」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setUpdateMan(String val) {
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
	public DCSystem resetUpdateMan() {
		this.reset(FIELD_UPDATEMAN);
		return this;
	}

	/**
	 * 设置「开放平台访问标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setAccessId(String val) {
		this.set(FIELD_ACCESSID, val);
		return this;
	}

	/**
	 * 获取「开放平台访问标识」值
	 *
	 */
	@JsonIgnore
	public String getAccessId() {
		return (String) this.get(FIELD_ACCESSID);
	}

	/**
	 * 判断 「开放平台访问标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessId() {
		return this.contains(FIELD_ACCESSID);
	}

	/**
	 * 重置 「开放平台访问标识」
	 *
	 */
	@JsonIgnore
	public DCSystem resetAccessId() {
		this.reset(FIELD_ACCESSID);
		return this;
	}

	/**
	 * 设置「租户系统名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DCSystem setDCSystemName(String val) {
		this.set(FIELD_DCSYSTEMNAME, val);
		return this;
	}

	/**
	 * 获取「租户系统名称」值
	 *
	 */
	@JsonIgnore
	public String getDCSystemName() {
		return (String) this.get(FIELD_DCSYSTEMNAME);
	}

	/**
	 * 判断 「租户系统名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDCSystemName() {
		return this.contains(FIELD_DCSYSTEMNAME);
	}

	/**
	 * 重置 「租户系统名称」
	 *
	 */
	@JsonIgnore
	public DCSystem resetDCSystemName() {
		this.reset(FIELD_DCSYSTEMNAME);
		return this;
	}

}
