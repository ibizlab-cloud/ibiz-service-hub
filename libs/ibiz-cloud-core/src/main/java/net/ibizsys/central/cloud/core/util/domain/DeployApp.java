package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 应用总线部署应用数据对象
 * @author lionlau
 *
 */
public class DeployApp extends EntityBase{

	/**
	 * 部署系统标识
	 */
	public final static String FIELD_DEPLOYSYSTEMID = "deploysystemid";

	@JsonIgnore
	public String getDeploySystemId() {
		Object objValue = this.get(FIELD_DEPLOYSYSTEMID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DEPLOYSYSTEMID)
	public void setDeploySystemId(String value) {
		this.set(FIELD_DEPLOYSYSTEMID, value);
	}

	@JsonIgnore
	public boolean isDeploySystemIdDirty() {
		return this.contains(FIELD_DEPLOYSYSTEMID);
	}

	
	/**
	 * 部署应用标识
	 */
	public final static String FIELD_DEPLOYAPPID = "deployappid";

	@JsonIgnore
	public String getDeployAppId() {
		Object objValue = this.get(FIELD_DEPLOYAPPID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DEPLOYAPPID)
	public void setDeployAppId(String value) {
		this.set(FIELD_DEPLOYAPPID, value);
	}

	@JsonIgnore
	public boolean isDeployAppIdDirty() {
		return this.contains(FIELD_DEPLOYAPPID);
	}
	
	/**
	 * 应用标识
	 */
	public final static String FIELD_APPID = "appid";

	@JsonIgnore
	public String getAppId() {
		Object objValue = this.get(FIELD_APPID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_APPID)
	public void setAppId(String value) {
		this.set(FIELD_APPID, value);
	}

	@JsonIgnore
	public boolean isAppIdDirty() {
		return this.contains(FIELD_APPID);
	}
	
	/**
	 * 模型路径
	 */
	public final static String FIELD_MODELPATH = "modelpath";

	@JsonIgnore
	public String getModelPath() {
		Object objValue = this.get(FIELD_MODELPATH);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_MODELPATH)
	public void setModelPath(String value) {
		this.set(FIELD_MODELPATH, value);
	}

	@JsonIgnore
	public boolean isModelPathDirty() {
		return this.contains(FIELD_MODELPATH);
	}
	
	
	/**
	 * 模型印迹
	 */
	public final static String FIELD_MODELSTAMP = "modelstamp";

	@JsonIgnore
	public String getModelStamp() {
		Object objValue = this.get(FIELD_MODELSTAMP);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_MODELSTAMP)
	public void setModelStamp(String value) {
		this.set(FIELD_MODELSTAMP, value);
	}

	@JsonIgnore
	public boolean isModelStampDirty() {
		return this.contains(FIELD_MODELSTAMP);
	}
	
	
	/**
	 * 支持重新加载模型: true : false
	 */
	public final static String FIELD_ENABLERELOAD = "enablereload";

	@JsonIgnore
	public String getEnableReload() {
		Object objValue = this.get(FIELD_ENABLERELOAD);
		if (objValue == null) {
			return null;
		}
		return DataTypeUtils.getStringValue(objValue, null);
	}

	@JsonProperty(FIELD_ENABLERELOAD)
	public void setEnableReload(Boolean value) {
		this.set(FIELD_ENABLERELOAD, value);
	}

	@JsonIgnore
	public boolean isEnableReloadDirty() {
		return this.contains(FIELD_ENABLERELOAD);
	}
	
	
	/**
	 * 合入子应用菜单标记
	 */
	public final static String FIELD_SUBAPPMENUTAG = "subappmenutag";

	@JsonIgnore
	public String getSubAppMenuTag() {
		Object objValue = this.get(FIELD_SUBAPPMENUTAG);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_SUBAPPMENUTAG)
	public void setSubAppMenuTag(String value) {
		this.set(FIELD_SUBAPPMENUTAG, value);
	}

	@JsonIgnore
	public boolean isSubAppMenuTagDirty() {
		return this.contains(FIELD_SUBAPPMENUTAG);
	}
	
	
	/**
	 * 服务标识，未指定时使用部署应用标识
	 */
	public final static String FIELD_SERVICEID = "serviceid";

	@JsonIgnore
	public String getServiceId() {
		Object objValue = this.get(FIELD_SERVICEID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_SERVICEID)
	public void setServiceId(String value) {
		this.set(FIELD_SERVICEID, value);
	}

	@JsonIgnore
	public boolean isServiceIdDirty() {
		return this.contains(FIELD_SERVICEID);
	}
	

}
