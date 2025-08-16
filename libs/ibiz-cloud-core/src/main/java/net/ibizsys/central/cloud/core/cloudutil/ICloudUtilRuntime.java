package net.ibizsys.central.cloud.core.cloudutil;

import net.ibizsys.central.sysutil.ISysUtilRuntime;

/**
 * 提供云测服务能力的系统功能组件运行时对象接口
 * @author lionlau
 *
 */
public interface ICloudUtilRuntime extends ISysUtilRuntime{

	public final static String CLOUDSERVICE_UAA = "UAA";
	public final static String CLOUDSERVICE_WF = "WF";
	public final static String CLOUDSERVICE_CONF = "CONF";
	public final static String CLOUDSERVICE_SAAS = "SAAS";
	public final static String CLOUDSERVICE_OU = "OU";
	public final static String CLOUDSERVICE_OSS = "OSS";
	public final static String CLOUDSERVICE_DEVOPS = "DEVOPS";
	public final static String CLOUDSERVICE_LOG = "LOG";
	public final static String CLOUDSERVICE_PORTAL = "PORTAL";
	public final static String CLOUDSERVICE_NOTIFY = "NOTIFY";
	public final static String CLOUDSERVICE_TASK = "TASK";
	public final static String CLOUDSERVICE_OPEN = "OPEN";
	public final static String CLOUDSERVICE_REPORT = "REPORT";
	public final static String CLOUDSERVICE_AI = "AI";
	public final static String CLOUDSERVICE_KB = "KB";
	public final static String CLOUDSERVICE_DATAFLOW = "DATAFLOW";
	public final static String CLOUDSERVICE_EXTENSION = "EXTENSION";
	
	
	public final static String CLOUDSERVICEURL_UAA = "ibizcloud-uaa";
	public final static String CLOUDSERVICEURL_WF = "ibizcloud-wf";
	public final static String CLOUDSERVICEURL_CONF = "ibizcloud-conf";
	public final static String CLOUDSERVICEURL_SAAS = "ibizcloud-saas";
	public final static String CLOUDSERVICEURL_OU = "ibizcloud-ou";
	public final static String CLOUDSERVICEURL_OSS = "ibizcloud-oss";
	public final static String CLOUDSERVICEURL_DEVOPS = "ibizcloud-devops";
	public final static String CLOUDSERVICEURL_LOG = "ibizcloud-log";
	public final static String CLOUDSERVICEURL_PORTAL = "ibizcloud-portal";
	public final static String CLOUDSERVICEURL_PORTAL_MQTT = "ibizcloud-portal-mqtt";
	public final static String CLOUDSERVICEURL_PORTAL_WS = "ibizcloud-portal-ws";
	public final static String CLOUDSERVICEURL_NOTIFY = "ibizcloud-notify";
	public final static String CLOUDSERVICEURL_TASK = "ibizcloud-task";
	public final static String CLOUDSERVICEURL_OPEN = "ibizcloud-open";
	public final static String CLOUDSERVICEURL_REPORT = "ibizcloud-report";
	public final static String CLOUDSERVICEURL_AI = "ibizcloud-ai";
	public final static String CLOUDSERVICEURL_KB = "ibizcloud-kb";
	public final static String CLOUDSERVICEURL_DATAFLOW = "ibizcloud-dataflow";
	
	
	public final static String CLOUDSERVICEURL_EXTENSION = "extension-api";
	
	
	/**
	 * 配置项：Cloud前缀
	 */
	public final static String CONFIGID_CLOUD_PREFIX = "cloud-";
	
	
	public final static String CLOUDCONFIGID_UAA = "cloud-uaa";
	public final static String CLOUDCONFIGID_WF = "cloud-wf";
	public final static String CLOUDCONFIGID_CONF = "cloud-conf";
	public final static String CLOUDCONFIGID_SAAS = "cloud-saas";
	public final static String CLOUDCONFIGID_OU = "cloud-ou";
	public final static String CLOUDCONFIGID_OSS = "cloud-oss";
	public final static String CLOUDCONFIGID_DEVOPS = "cloud-devops";
	public final static String CLOUDCONFIGID_LOG = "cloud-log";
	public final static String CLOUDCONFIGID_PORTAL = "cloud-portal";
	public final static String CLOUDCONFIGID_NOTIFY = "cloud-notify";
	public final static String CLOUDCONFIGID_TASK = "cloud-task";
	public final static String CLOUDCONFIGID_OPEN = "cloud-open";
	public final static String CLOUDCONFIGID_REPORT = "cloud-report";
	public final static String CLOUDCONFIGID_AI = "cloud-ai";
	public final static String CLOUDCONFIGID_KB = "cloud-kb";
	public final static String CLOUDCONFIGID_DATAFLOW = "cloud-dataflow";
	
	/**
	 * 服务总线全局配置目录
	 */
	public final static String CLOUDUAAUTIL_CONFIGFOLDER = "clouduaautil";
	public final static String CLOUDWFUTIL_CONFIGFOLDER = "cloudwfutil";
	public final static String CLOUDCONFUTIL_CONFIGFOLDER = "cloudconfutil";
	public final static String CLOUDSAASUTIL_CONFIGFOLDER = "cloudsaasutil";
	public final static String CLOUDOUUTIL_CONFIGFOLDER = "cloudouutil";
	public final static String CLOUDOSSUTIL_CONFIGFOLDER = "cloudossutil";
	public final static String CLOUDDEVOPSUTIL_CONFIGFOLDER = "clouddevopsutil";
	public final static String CLOUDLOGUTIL_CONFIGFOLDER = "cloudlogutil";
	public final static String CLOUDPORTALUTIL_CONFIGFOLDER = "cloudportalutil";
	public final static String CLOUDNOTIFYUTIL_CONFIGFOLDER = "cloudnotifyutil";
	public final static String CLOUDTASKUTIL_CONFIGFOLDER = "cloudtaskutil";
	public final static String CLOUDOPENUTIL_CONFIGFOLDER = "cloudopenutil";
	public final static String CLOUDREPORTUTIL_CONFIGFOLDER = "cloudreportutil";
	public final static String CLOUDAIUTIL_CONFIGFOLDER = "cloudaiutil";
	public final static String CLOUDKBUTIL_CONFIGFOLDER = "cloudkbutil";
	public final static String CLOUDDATAFLOWUTIL_CONFIGFOLDER = "clouddataflowutil";
	
}
