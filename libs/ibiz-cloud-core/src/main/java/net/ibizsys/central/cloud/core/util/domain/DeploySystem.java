package net.ibizsys.central.cloud.core.util.domain;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 服务总线部署系统数据对象
 * @author lionlau
 *
 */
public class DeploySystem extends EntityBase{

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
	 * 调试模型路径
	 */
	public final static String FIELD_DEBUGMODELPATH = "debugmodelpath";

	@JsonIgnore
	public String getDebugModelPath() {
		Object objValue = this.get(FIELD_DEBUGMODELPATH);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DEBUGMODELPATH)
	public void setDebugModelPath(String value) {
		this.set(FIELD_DEBUGMODELPATH, value);
	}

	@JsonIgnore
	public boolean isDebugModelPathDirty() {
		return this.contains(FIELD_DEBUGMODELPATH);
	}
	
	/**
	 *运行时对象类
	 */
	public final static String FIELD_RUNTIMECLASSNAME = "runtimeclassname";

	@JsonIgnore
	public String getRuntimeClassName() {
		Object objValue = this.get(FIELD_RUNTIMECLASSNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_RUNTIMECLASSNAME)
	public void setRuntimeClassName(String value) {
		this.set(FIELD_RUNTIMECLASSNAME, value);
	}

	@JsonIgnore
	public boolean isRuntimeClassNameDirty() {
		return this.contains(FIELD_RUNTIMECLASSNAME);
	}
	
	
	/**
	 * 配置
	 */
	public final static String FIELD_SETTINGS = "settings";

	@JsonIgnore
	public Map<String, Object> getSettings() {
		Object objValue = this.get(FIELD_SETTINGS);
		if (objValue == null) {
			return null;
		}
		return (Map<String, Object>) objValue;
	}

	@JsonProperty(FIELD_SETTINGS)
	public void setSettings(Map<String, Object> value) {
		this.set(FIELD_SETTINGS, value);
	}

	@JsonIgnore
	public boolean isSettingsDirty() {
		return this.contains(FIELD_SETTINGS);
	}
	
	@JsonIgnore
	public Map<String, Object> getSettingsIf() {
		Object objValue = this.get(FIELD_SETTINGS);
		if (objValue == null) {
			objValue = new LinkedHashMap<String, Object>();
			this.set(FIELD_SETTINGS, objValue);
		}
		return (Map<String, Object>) objValue;
	}
	
	/**
	 * 更新数据库模型: true : false
	 */
	public final static String FIELD_UPDATEDBSCHEMA = "updatedbschema";

	@JsonIgnore
	public String getUpdateDBSchema() {
		Object objValue = this.get(FIELD_UPDATEDBSCHEMA);
		if (objValue == null) {
			return null;
		}
		return DataTypeUtils.getStringValue(objValue, null);
	}

	@JsonProperty(FIELD_UPDATEDBSCHEMA)
	public void setUpdateDBSchema(Boolean value) {
		this.set(FIELD_UPDATEDBSCHEMA, value);
	}

	@JsonIgnore
	public boolean isUpdateDBSchemaDirty() {
		return this.contains(FIELD_UPDATEDBSCHEMA);
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
	 * 系统扩展：: true : false
	 */
	public final static String FIELD_EXTENSION = "extension";

	@JsonIgnore
	public String getExtension() {
		Object objValue = this.get(FIELD_EXTENSION);
		if (objValue == null) {
			return null;
		}
		return DataTypeUtils.getStringValue(objValue, null);
	}

	@JsonProperty(FIELD_EXTENSION)
	public void setExtension(Boolean value) {
		this.set(FIELD_EXTENSION, value);
	}

	@JsonIgnore
	public boolean isExtensionDirty() {
		return this.contains(FIELD_EXTENSION);
	}
	
	
	
	/**
	 * 合并系统集合
	 */
	public final static String FIELD_MERGESYSTEMS = "mergesystems";

	@JsonIgnore
	public List<String> getMergeSystems() {
		Object objValue = this.get(FIELD_MERGESYSTEMS);
		if (objValue == null) {
			return null;
		}
		return (List<String>) objValue;
	}

	@JsonProperty(FIELD_MERGESYSTEMS)
	public void setMergeSystems(List<String> value) {
		this.set(FIELD_MERGESYSTEMS, value);
	}

	@JsonIgnore
	public boolean isMergeSystemsDirty() {
		return this.contains(FIELD_MERGESYSTEMS);
	}
	
	
	
	/**
	 * 安装数据: true : false
	 */
	public final static String FIELD_INSTALLDATA = "installdata";

	@JsonIgnore
	public String getInstallData() {
		Object objValue = this.get(FIELD_INSTALLDATA);
		if (objValue == null) {
			return null;
		}
		return DataTypeUtils.getStringValue(objValue, null);
	}

	@JsonProperty(FIELD_INSTALLDATA)
	public void setInstallData(String value) {
		this.set(FIELD_INSTALLDATA, value);
	}

	@JsonIgnore
	public boolean isInstallDataDirty() {
		return this.contains(FIELD_INSTALLDATA);
	}
	
	
	/**
	 * 主系统标识
	 */
	public final static String FIELD_MAINSYSTEMID = "mainsystemid";

	@JsonIgnore
	public String getMainSystemId() {
		Object objValue = this.get(FIELD_MAINSYSTEMID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_MAINSYSTEMID)
	public void setMainSystemId(String value) {
		this.set(FIELD_MAINSYSTEMID, value);
	}

	@JsonIgnore
	public boolean isMainSystemIdDirty() {
		return this.contains(FIELD_MAINSYSTEMID);
	}
	
	
//	/**
//	 * 启用的服务接口清单
//	 */
//	public final static String FIELD_APIS = "apis";
//
//	@JsonIgnore
//	public List<String> getAPIs() {
//		Object objValue = this.get(FIELD_APIS);
//		if (objValue == null) {
//			return null;
//		}
//		return (List<String>)objValue;
//	}
//
//	@JsonProperty(FIELD_APIS)
//	public void setAPIs(List<String> value) {
//		this.set(FIELD_APIS, value);
//	}
//
//	@JsonIgnore
//	public boolean isAPIsDirty() {
//		return this.contains(FIELD_APIS);
//	}
}
