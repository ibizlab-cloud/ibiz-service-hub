package net.ibizsys.central.cloud.core.util.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.runtime.util.DateUtils;

/**
 * 应用总线配置数据对象
 * @author lionlau
 *
 */
public class AppHub extends ConfigEntity{

	public AppHub(String strContent) {
		super(strContent);
		if(!StringUtils.hasLength(this.getModelStamp())) {
			this.setModelStamp(DateUtils.getCurTimeString());
		}
	}
	
	/**
	 * 应用总线标识
	 */
	public final static String FIELD_APPHUBID = "apphubid";

	@JsonIgnore
	public String getAppHubId() {
		Object objValue = this.get(FIELD_APPHUBID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_APPHUBID)
	public void setAppHubId(String value) {
		this.set(FIELD_APPHUBID, value);
	}

	@JsonIgnore
	public boolean isAppHubIdDirty() {
		return this.contains(FIELD_APPHUBID);
	}
	
	
	/**
	 * 部署应用集合
	 */
	public final static String FIELD_DEPLOYAPPS = "deployapps";
	
	@JsonIgnore
	public List<DeployApp> getDeployApps() {
		
		Object value = this.get(FIELD_DEPLOYAPPS);
		if(value instanceof List) {
			List list = (List)value;
			if(ObjectUtils.isEmpty(list)) {
				return null;
			}
			
			for(Object item : list) {
				if(item instanceof DeployApp) {
					return list;
				}
			}
			
			List<DeployApp> deployAppList = new ArrayList<DeployApp>();
			this.set(FIELD_DEPLOYAPPS, deployAppList);
			for(Object item : list) {
				if(ObjectUtils.isEmpty(item)) {
					continue;
				}
				String strSubApp = item.toString();
				String[] items = strSubApp.split("[:]");
				if(items.length != 2 || !StringUtils.hasLength(items[0]) || !StringUtils.hasLength(items[1])) {
					throw new RuntimeException(String.format("内容[%1$s]格式不正确", strSubApp));
				}
				
				String[] apps = items[1].split("[,]");
				for(String app : apps) {
					if(!StringUtils.hasLength(app)) {
						continue;
					}
					
					String[] menus = app.split("[@]");
					if(menus.length == 2) {
						DeployApp deployApp = new DeployApp();
						deployApp.setDeploySystemId(items[0]);
						deployApp.setSubAppMenuTag(menus[0]);
						deployApp.setAppId(menus[1]);
						deployApp.setDeployAppId(String.format("%1$s__%2$s__%3$s", items[0], menus[1], menus[0]).toLowerCase());
						deployApp.setServiceId(String.format("%1$s__%2$s", items[0], menus[1]).toLowerCase());
						deployAppList.add(deployApp);
					}
					else {
						DeployApp deployApp = new DeployApp();
						deployApp.setDeploySystemId(items[0]);
						deployApp.setAppId(app);
						deployApp.setDeployAppId(String.format("%1$s__%2$s", items[0], app).toLowerCase());
						deployAppList.add(deployApp);
					}
				}
			}
			
			
			return deployAppList;
		}
		
		return null;
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
	
	
}
