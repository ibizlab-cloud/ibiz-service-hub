package net.ibizsys.central.cloud.saas.k8s.addin;

import java.io.StringReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.google.gson.Gson;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ContainerState;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1Service;
import io.kubernetes.client.openapi.models.V1ServiceList;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.KubeConfig;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.CloudConsole;
import net.ibizsys.central.cloud.saas.core.addin.SaaSFuncAgentBase;
import net.ibizsys.central.service.SysServiceAPILevels;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogLevels;

public class K8sSaaSFuncAgent extends SaaSFuncAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(K8sSaaSFuncAgent.class);

	public static final String LOGCAT_K8SSAASFUNCAGENT = "K8SSAASFUNCAGENT";

	public static final int REMOVELOOP_CNT = 120;

	public static final int REMOVELOOP_SLEEP = 500;

	/**
	 * 增加服务
	 */
	public final static String METHOD_ADDSERVICE = "ADDSERVICE";

	/**
	 * 更新服务
	 */
	public final static String METHOD_UPDATESERVICE = "UPDATESERVICE";

	/**
	 * 重启服务
	 */
	public final static String METHOD_RESTARTSERVICE = "RESTARTSERVICE";
	
	/**
	 * 重启服务
	 */
	public final static String METHOD_STOPSERVICE = "STOPSERVICE";
	
	/**
	 * 移除服务
	 */
	public final static String METHOD_REMOVESERVICE = "REMOVESERVICE";
	
	/**
	 * 监控服务
	 */
	public final static String METHOD_MONITORSERVICE = "MONITORSERVICE";
	
	
	/**
	 * 刷新服务
	 */
	public final static String METHOD_REFRESHSERVICES = "REFRESHSERVICES";
	

	/**
	 * 服务参数：v1命名空间
	 */
	public final static String PARAM_SYNCSERVICE_V1NSAMESPACE = "v1namespace";

	/**
	 * 服务参数：v1Pod
	 */
	public final static String PARAM_SYNCSERVICE_V1POD = "v1pod";
	
	/**
	 * 服务参数：v1Pod 集合
	 */
	public final static String PARAM_SYNCSERVICE_V1PODS = "v1pods";

	/**
	 * 服务参数：v1Service
	 */
	public final static String PARAM_SYNCSERVICE_V1SERVICE = "v1service";

	/**
	 * 服务参数：动态参数
	 */
	public final static String PARAM_SYNCSERVICE_PARAM = "param";

	

	private KubeConfig kubeConfig = null;

	@Autowired
	private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
	
	private Map<String, String> servicePodIdMap = new HashMap<String, String>();

	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
		String config = this.getAgentData().getConfig();
		if(!StringUtils.hasLength(config)) {
			throw new Exception("未指定Kube配置");
		}
		this.setKubeConfig(KubeConfig.loadKubeConfig(new StringReader(config)));
		

		// String jenkinsUrl = this.getAgentData().getServiceUrl();
		// String accessKey = this.getAgentData().getAccessKey();
		// String secretKey = this.getAgentData().getSecretKey();
		//
		// if(!StringUtils.hasLength(jenkinsUrl)) {
		// throw new Exception("未指定Jenkins服务路径");
		// }
		//
		// if(!StringUtils.hasLength(accessKey)) {
		// throw new Exception("未指定AccessKey");
		// }
		//
		// if(!StringUtils.hasLength(secretKey)) {
		// throw new Exception("未指定SecretKey");
		// }
	}

	protected KubeConfig getKubeConfig() {
		return this.kubeConfig;
	}

	protected void setKubeConfig(KubeConfig kubeConfig) {
		this.kubeConfig = kubeConfig;
	}
	
	@Override
	public int getFuncLevel() {
		return SysServiceAPILevels.CORE;
	}

	@Override
	protected Object onInvoke(String method, Map<String, Object> params) throws Throwable {

		if (METHOD_ADDSERVICE.equalsIgnoreCase(method)
				|| METHOD_UPDATESERVICE.equalsIgnoreCase(method) 
				|| METHOD_RESTARTSERVICE.equalsIgnoreCase(method)
				|| METHOD_STOPSERVICE.equalsIgnoreCase(method)
				|| METHOD_REMOVESERVICE.equalsIgnoreCase(method)
				|| METHOD_MONITORSERVICE.equalsIgnoreCase(method)
				|| METHOD_REFRESHSERVICES.equalsIgnoreCase(method)) {
			Object objJobParams = params.get(PARAM_SYNCSERVICE_PARAM);
			Map<String, Object> jobParams = null;
			if (objJobParams instanceof Map) {
				jobParams = (Map) objJobParams;
			} else {
				jobParams = new HashMap<String, Object>();
			}

			Gson gson = new Gson();

			V1Namespace namespace = null;
			V1Pod pod = null;
			
			V1Service service = null;
			Object v1namespace = params.get(PARAM_SYNCSERVICE_V1NSAMESPACE);
			if (v1namespace != null) {
				namespace = gson.fromJson(JsonUtils.toString(v1namespace), V1Namespace.class);
			}

			Object v1pod = params.get(PARAM_SYNCSERVICE_V1POD);
			if (v1pod != null) {
				pod = gson.fromJson(JsonUtils.toString(v1pod), V1Pod.class);
			}
			
			List<V1Pod> podList = null;
			Object v1pods = params.get(PARAM_SYNCSERVICE_V1PODS);
			if(v1pods instanceof List) {
				podList = new ArrayList<V1Pod>();
				List list = (List)v1pods;
				for(Object item : list) {
					podList.add(gson.fromJson(JsonUtils.toString(item), V1Pod.class));
				}
			}
			

			Object v1service = params.get(PARAM_SYNCSERVICE_V1SERVICE);
			if (v1service != null) {
				service = gson.fromJson(JsonUtils.toString(v1service), V1Service.class);
			}

			switch (method.toUpperCase()) {
			case METHOD_ADDSERVICE:
				return this.doSyncService(namespace, pod, service, jobParams, true, false);
			case METHOD_UPDATESERVICE:
				return this.doSyncService(namespace, pod, service, jobParams, false, false);
			case METHOD_RESTARTSERVICE:
				return this.doSyncService(namespace, pod, service, jobParams, false, true);
			case METHOD_STOPSERVICE:
			case METHOD_REMOVESERVICE:
				return this.doRemoveService(namespace, pod, jobParams);
			case METHOD_MONITORSERVICE:
				return this.doMonitorService(namespace, pod, jobParams);
			case METHOD_REFRESHSERVICES:
				if(podList == null && pod != null) {
					podList = Arrays.asList(pod);
				}
				return this.doRefreshServices(namespace, podList, jobParams);
			default:
				return this.doSyncService(namespace, pod, service, jobParams, false, true);
			}
		}

		return super.onInvoke(method, params);
	}

	protected Object doSyncService(V1Namespace namespace, V1Pod pod, V1Service service, Map<String, Object> params, boolean bNewMode, boolean bReloadMode) throws Throwable {

		CloudConsole cloudConsole = null;
		if (params != null) {
			Object console = params.get(PARAM_CONSOLE);
			if (console != null) {
				cloudConsole = JsonUtils.as(console, CloudConsole.class);
				if (!StringUtils.hasLength(cloudConsole.getLogCat())) {
					cloudConsole.setLogCat(this.getLogCat());
				}
			}
		}

		String strServiceName = pod.getMetadata().getName();

		String strNamespace = namespace.getMetadata().getName();

		ApiClient client = Config.fromConfig(this.getKubeConfig());
		CoreV1Api api = new CoreV1Api(client);

		V1Namespace v1Namespace = null;
		try {

			V1NamespaceList v1NamespaceList = api.listNamespace(null, null, null, String.format("metadata.name=%1$s", strNamespace), null, 1, null, null, null, null);
			if (!ObjectUtils.isEmpty(v1NamespaceList.getItems())) {
				v1Namespace = v1NamespaceList.getItems().get(0);
			}
			if (v1Namespace == null) {
				v1Namespace = namespace;
				v1Namespace = api.createNamespace(v1Namespace, null, null, null, null);
				// this.getSystemRuntime().log(LogLevels.INFO,
				// cloudConsole.getLogCat(), String.format("建立Namespace[%1$s]成功",
				// strNamespace), null);
				//
				// this.updateCurrentPSDCBKTask(LogLevels.INFO,
				// String.format("建立Namespace[%1$s]成功", strNamespace));
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("建立命名空间发生异常，%1$s", ex.getMessage()), ex);
		}

		// 查询指定名称Pod
		V1Pod v1Pod = null;
		try {
			V1PodList v1PodList = api.listPodForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
			if (!ObjectUtils.isEmpty(v1PodList.getItems())) {
				v1Pod = v1PodList.getItems().get(0);
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("查询指定Pod发生异常，%1$s", ex.getMessage()), ex);
		}

		if (v1Pod != null) {
			if (bNewMode) {
				throw new Exception(String.format("Pod名称[%1$s]已经存在", strServiceName));
			}

			try {
				v1Pod = api.deleteNamespacedPod(strServiceName, strNamespace, null, null, null, null, null, null);
				log.debug(String.format("移除Pod[%1$s][%2$s] ==> \r\n%3$s", strServiceName, strNamespace, v1Pod));

				// this.updateCurrentPSDCBKTask(LogLevels.DEBUG,
				// String.format("移除Pod[%1$s][%2$s]", strServiceName,
				// strNamespace));

				// 等待删除
				for (int i = 0; i < REMOVELOOP_CNT; i++) {
					V1PodList v1PodList = api.listPodForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
					if (ObjectUtils.isEmpty(v1PodList.getItems())) {
						break;
					} else {
						log.debug(String.format("等待移除Pod[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));

						if (cloudConsole != null) {
							iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.DEBUG, cloudConsole.getLogCat(), String.format("等待移除Pod[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));
						}

						Thread.sleep(REMOVELOOP_SLEEP);
					}
				}

				// this.updateCurrentPSDCBKTask(LogLevels.INFO,
				// String.format("移除Pod[%1$s][%2$s]成功", strServiceName,
				// strNamespace));

				// this.getSystemRuntime().log(LogLevels.INFO,
				// cloudConsole.getLogCat(), String.format("移除Pod[%1$s][%2$s]成功",
				// strServiceName, strNamespace), null);

				if (cloudConsole != null) {
					iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.INFO, cloudConsole.getLogCat(), String.format("移除Pod[%1$s][%2$s]成功", strServiceName, strNamespace));
				}
			} catch (Throwable ex) {
				throw new Exception(String.format("移除指定Pod发生异常，%1$s", ex.getMessage()), ex);
			}

			v1Pod = null;
		}

		V1Service v1Service = null;
		try {
			V1ServiceList v1ServiceList = api.listServiceForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
			if (!ObjectUtils.isEmpty(v1ServiceList.getItems())) {
				v1Service = v1ServiceList.getItems().get(0);
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("查询指定Service发生异常，%1$s", ex.getMessage()), ex);
		}

		if (v1Service != null) {
			try {
				try {
					v1Service = api.deleteNamespacedService(strServiceName, strNamespace, null, null, null, null, null, null);
				} catch (Throwable ex) {
					if (ex instanceof IllegalStateException || ex.getCause() instanceof IllegalStateException) {
						log.warn(String.format("移除Service返回值异常，可能是版本原因，%1$s", ex.getMessage()), ex);
					} else {
						throw ex;
					}
				}
				log.debug(String.format("移除Service[%1$s][%2$s] ==> \r\n%3$s", strServiceName, strNamespace, v1Service));
				// this.updateCurrentPSDCBKTask(LogLevels.DEBUG,
				// String.format("移除Service[%1$s][%2$s]", strServiceName,
				// strNamespace));
				// 等待删除
				for (int i = 0; i < REMOVELOOP_CNT; i++) {
					V1ServiceList v1ServiceList = api.listServiceForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
					if (ObjectUtils.isEmpty(v1ServiceList.getItems())) {
						break;
					} else {
						log.debug(String.format("等待移除Service[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));
						if (cloudConsole != null) {
							iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.DEBUG, cloudConsole.getLogCat(), String.format("等待移除Service[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));
						}
						Thread.sleep(REMOVELOOP_SLEEP);
					}
				}

				// this.updateCurrentPSDCBKTask(LogLevels.INFO,
				// String.format("移除Service[%1$s][%2$s]成功", strServiceName,
				// strNamespace));
				//
				// this.getSystemRuntime().log(LogLevels.INFO,
				// cloudConsole.getLogCat(),
				// String.format("移除Service[%1$s][%2$s]成功", strServiceName,
				// strNamespace), null);

				if (cloudConsole != null) {
					iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.INFO, cloudConsole.getLogCat(), String.format("移除Service[%1$s][%2$s]成功", strServiceName, strNamespace));
				}
			} catch (Throwable ex) {
				throw new Exception(String.format("移除指定Service发生异常，%1$s", ex.getMessage()), ex);
			}

			v1Service = null;
		}

		v1Pod = pod;

		try {
			v1Pod = api.createNamespacedPod(strNamespace, v1Pod, null, null, null, null);
			log.debug(String.format("建立Pod[%1$s][%2$s] ==> \r\n%3$s", strServiceName, strNamespace, v1Pod));

			// this.updateCurrentPSDCBKTask(LogLevels.INFO,
			// String.format("建立Pod[%1$s][%2$s]成功", strServiceName,
			// strNamespace));
			// this.getSystemRuntime().log(LogLevels.INFO,
			// cloudConsole.getLogCat(), String.format("建立Pod[%1$s][%2$s]成功",
			// strServiceName, strNamespace), null);

			if (cloudConsole != null) {
				iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.INFO, cloudConsole.getLogCat(), String.format("建立Pod[%1$s][%2$s]成功", strServiceName, strNamespace));
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("建立Pod发生异常，%1$s", ex.getMessage()), ex);
		}

		if (service != null) {

			v1Service = service;

			try {
				v1Service = api.createNamespacedService(strNamespace, v1Service, null, null, null, null);
				log.debug(String.format("建立Service[%1$s][%2$s] ==> \r\n%3$s", strServiceName, strNamespace, v1Service));

				// this.updateCurrentPSDCBKTask(LogLevels.INFO,
				// String.format("建立Service[%1$s][%2$s]成功", strServiceName,
				// strNamespace));
				// this.getSystemRuntime().log(LogLevels.INFO,
				// cloudConsole.getLogCat(),
				// String.format("建立Service[%1$s][%2$s]成功", strServiceName,
				// strNamespace), null);

				if (cloudConsole != null) {
					iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.INFO, cloudConsole.getLogCat(), String.format("建立Service[%1$s][%2$s]成功", strServiceName, strNamespace));
				}
			} catch (Throwable ex) {
				throw new Exception(String.format("建立Service发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		String strUid = v1Pod.getMetadata().getUid();

		if (cloudConsole != null) {
			this.runLogTimer(strNamespace, strServiceName, strUid, cloudConsole, 0);
		}

		Gson gson = new Gson();
		return JsonUtils.toObjectNode(gson.toJson(v1Pod));
	}

	protected Object doRemoveService(V1Namespace namespace, V1Pod pod, Map<String, Object> params) throws Throwable {

		CloudConsole cloudConsole = null;
		if (params != null) {
			Object console = params.get(PARAM_CONSOLE);
			if (console != null) {
				cloudConsole = JsonUtils.as(console, CloudConsole.class);
				if (!StringUtils.hasLength(cloudConsole.getLogCat())) {
					cloudConsole.setLogCat(this.getLogCat());
				}
			}
		}

		String strServiceName = pod.getMetadata().getName();

		String strNamespace = namespace.getMetadata().getName();

		ApiClient client = Config.fromConfig(this.getKubeConfig());
		CoreV1Api api = new CoreV1Api(client);

		// 查询指定名称Pod
		V1Pod v1Pod = null;
		try {
			V1PodList v1PodList = api.listPodForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
			if (!ObjectUtils.isEmpty(v1PodList.getItems())) {
				v1Pod = v1PodList.getItems().get(0);
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("查询指定Pod发生异常，%1$s", ex.getMessage()), ex);
		}

		if (v1Pod != null) {
			try {
				v1Pod = api.deleteNamespacedPod(strServiceName, strNamespace, null, null, null, null, null, null);
				log.debug(String.format("移除Pod[%1$s][%2$s] ==> \r\n%3$s", strServiceName, strNamespace, v1Pod));

				//this.updateCurrentPSDCBKTask(LogLevels.DEBUG, String.format("移除Pod[%1$s][%2$s]", strServiceName, strNamespace));

				if (cloudConsole != null) {
					iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.DEBUG, cloudConsole.getLogCat(), String.format("移除Pod[%1$s][%2$s]", strServiceName, strNamespace));
				}
				
				// 等待删除
				for (int i = 0; i < REMOVELOOP_CNT; i++) {
					V1PodList v1PodList = api.listPodForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
					if (ObjectUtils.isEmpty(v1PodList.getItems())) {
						break;
					} else {
						log.debug(String.format("等待移除Pod[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));

						if (cloudConsole != null) {
							iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.DEBUG, cloudConsole.getLogCat(), String.format("等待移除Pod[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));
						}

						Thread.sleep(REMOVELOOP_SLEEP);
					}
				}

				//this.updateCurrentPSDCBKTask(LogLevels.INFO, String.format("移除Pod[%1$s][%2$s]成功", strServiceName, strNamespace));
				//this.getSystemRuntime().log(LogLevels.INFO, cloudConsole.getLogCat(), String.format("移除Pod[%1$s][%2$s]成功", strServiceName, strNamespace), null);

				if (cloudConsole != null) {
					iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.INFO, cloudConsole.getLogCat(), String.format("移除Pod[%1$s][%2$s]成功", strServiceName, strNamespace));
				}

			} catch (Throwable ex) {

				throw new Exception(String.format("移除指定Pod发生异常，%1$s", ex.getMessage()), ex);

			}
		}

		V1Service v1Service = null;
		try {
			V1ServiceList v1ServiceList = api.listServiceForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
			if (!ObjectUtils.isEmpty(v1ServiceList.getItems())) {
				v1Service = v1ServiceList.getItems().get(0);
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("查询指定Service发生异常，%1$s", ex.getMessage()), ex);
		}

		if (v1Service != null) {
			try {
				try {
					v1Service = api.deleteNamespacedService(strServiceName, strNamespace, null, null, null, null, null, null);
				} catch (Throwable ex) {
					if (ex instanceof IllegalStateException || ex.getCause() instanceof IllegalStateException) {
						log.warn(String.format("移除Service返回值异常，可能是版本原因，%1$s", ex.getMessage()), ex);
					} else {
						throw ex;
					}
				}

				log.debug(String.format("移除Service[%1$s][%2$s] ==> \r\n%3$s", strServiceName, strNamespace, v1Service));
				//this.updateCurrentPSDCBKTask(LogLevels.DEBUG, String.format("移除Service[%1$s][%2$s]", strServiceName, strNamespace));
				if (cloudConsole != null) {
					iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.DEBUG, cloudConsole.getLogCat(), String.format("移除Service[%1$s][%2$s]", strServiceName, strNamespace));
				}
				// 等待删除
				for (int i = 0; i < REMOVELOOP_CNT; i++) {
					V1ServiceList v1ServiceList = api.listServiceForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
					if (ObjectUtils.isEmpty(v1ServiceList.getItems())) {
						break;
					} else {
						log.debug(String.format("等待移除Service[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));

						if (cloudConsole != null) {
							iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.DEBUG, cloudConsole.getLogCat(), String.format("等待移除Service[%1$s][%2$s][%3$s]", strServiceName, strNamespace, i));
						}

						Thread.sleep(REMOVELOOP_SLEEP);
					}
				}

				//this.updateCurrentPSDCBKTask(LogLevels.INFO, String.format("移除Service[%1$s][%2$s]成功", strServiceName, strNamespace));
				//this.getSystemRuntime().log(LogLevels.INFO, cloudConsole.getLogCat(), String.format("移除Service[%1$s][%2$s]成功", strServiceName, strNamespace), null);

				if (cloudConsole != null) {
					iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), cloudConsole.getSender(), true, LogLevels.INFO, cloudConsole.getLogCat(), String.format("移除Service[%1$s][%2$s]成功", strServiceName, strNamespace));
				}

			} catch (Throwable ex) {
				throw new Exception(String.format("移除指定Service发生异常，%1$s", ex.getMessage()), ex);
			}

		}

		return null;
	}
	
	protected Object doMonitorService(V1Namespace namespace, V1Pod pod, Map<String, Object> params) throws Throwable {
		
		CloudConsole cloudConsole = null;
		if (params != null) {
			Object console = params.get(PARAM_CONSOLE);
			if (console != null) {
				cloudConsole = JsonUtils.as(console, CloudConsole.class);
				if (!StringUtils.hasLength(cloudConsole.getLogCat())) {
					cloudConsole.setLogCat(this.getLogCat());
				}
			}
		}
		
		if(cloudConsole == null) {
			return null;
		}
		
		String strServiceName = pod.getMetadata().getName();

		String strNamespace = namespace.getMetadata().getName();

		
		ApiClient client = Config.fromConfig(this.getKubeConfig());
		CoreV1Api api = new CoreV1Api(client);
		
		V1Pod v1Pod = null;
		try {
			V1PodList v1PodList = api.listPodForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
			if (!ObjectUtils.isEmpty(v1PodList.getItems())) {
				v1Pod = v1PodList.getItems().get(0);
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("查询指定Pod发生异常，%1$s", ex.getMessage()), ex);
		}
		
		if(v1Pod == null) {
			log.warn(String.format("未获取指定Pod[metadata.name=%1$s,metadata.namespace=%2$s]，忽略监控", strServiceName, strNamespace));
			return null;
		}
		
		//判断是否已经监控
		String strTag = String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace);
		String strUid = v1Pod.getMetadata().getUid();
		synchronized (servicePodIdMap) {
			String strLastUid = servicePodIdMap.get(strTag);
			if(strUid.equals(strLastUid)) {
				//已经监控
				return null;
			}
			servicePodIdMap.put(strTag, strUid);
		}
		
		this.runLogTimer(strNamespace, strServiceName, strUid, cloudConsole, 0);
		
		
		return null;
	}
	
	protected Object doRefreshServices(V1Namespace namespace, List<V1Pod> pods, Map<String, Object> params) throws Throwable {
		
		CloudConsole cloudConsole = null;
		if (params != null) {
			Object console = params.get(PARAM_CONSOLE);
			if (console != null) {
				cloudConsole = JsonUtils.as(console, CloudConsole.class);
				if (!StringUtils.hasLength(cloudConsole.getLogCat())) {
					cloudConsole.setLogCat(this.getLogCat());
				}
			}
		}
		
		String strNamespace = namespace.getMetadata().getName();
		
		ApiClient client = Config.fromConfig(this.getKubeConfig());
		CoreV1Api api = new CoreV1Api(client);
		
		Map<String, V1Pod> v1PodMap = new HashMap<String, V1Pod>();
		for (V1Pod v1Pod : pods) {
			v1PodMap.put(v1Pod.getMetadata().getName(), v1Pod);
		}

		List<V1Pod> list = new ArrayList<V1Pod>();
		try {
			V1PodList v1PodList = api.listPodForAllNamespaces(null, null, String.format("metadata.namespace=%1$s", strNamespace), null, Integer.MAX_VALUE, null, null, null, null, null);
			if (!ObjectUtils.isEmpty(v1PodList.getItems())) {
				for (V1Pod v1Pod : v1PodList.getItems()) {
					String strName = v1Pod.getMetadata().getName();
					if(!v1PodMap.containsKey(strName)) {
						continue;
					}
					list.add(v1Pod);
				}
			}
		} catch (Throwable ex) {
			throw new Exception(String.format("查询Pod发生异常，%1$s", ex.getMessage()), ex);
		}

		Gson gson = new Gson();
		return JsonUtils.toArrayNode(gson.toJson(list));
	}

	protected void runLogTimer(String strNamespace, String strServiceName, String strPodId, CloudConsole cloudConsole, long nFromTime) {

		try {
			ApiClient client = Config.fromConfig(this.getKubeConfig());
			CoreV1Api api = new CoreV1Api(client);
			V1Pod v1Pod = null;
			try {
				V1PodList v1PodList = api.listPodForAllNamespaces(null, null, String.format("metadata.name=%1$s,metadata.namespace=%2$s", strServiceName, strNamespace), null, 1, null, null, null, null, null);
				if (!ObjectUtils.isEmpty(v1PodList.getItems())) {
					v1Pod = v1PodList.getItems().get(0);
				}
			} catch (Throwable ex) {
				throw new Exception(String.format("查询指定Pod发生异常，%1$s", ex.getMessage()), ex);
			}

			if (v1Pod == null) {
				return;
			}

			if (!strPodId.equalsIgnoreCase(v1Pod.getMetadata().getUid())) {
				// 标识不一致
				return;
			}

			V1ContainerState containerState = v1Pod.getStatus().getContainerStatuses().get(0).getState();
			if (containerState.getRunning() == null && containerState.getTerminated() != null) {
				return;
			}

			Integer sinceSeconds = null;
			long nCurTime = Instant.now().getEpochSecond();
			if (nFromTime == 0l) {
				if (containerState.getRunning() == null) {
					sinceSeconds = 120;
				} else {
					sinceSeconds = (int) (nCurTime - Instant.parse(containerState.getRunning().getStartedAt().toString()).getEpochSecond());
				}
			} else {
				sinceSeconds = (int) (nCurTime - nFromTime);
			}
			nFromTime = nCurTime;
			Integer limitBytes = new Integer(40960); // 每次读取的字节数
			String info = api.readNamespacedPodLog(strServiceName, strNamespace, null, null, null, limitBytes, null, null, sinceSeconds, null, null);
			if (StringUtils.hasLength(info)) {
				info = info.replace("\r\n", "____SRF_RETURN_____").replace("\r", "____SRF_RETURN_____").replace("\n", "____SRF_RETURN_____").replace("____SRF_RETURN_____", "\r\n");
				iSysCloudLogUtilRuntime.sendConsoleMessage(cloudConsole.getTopic(), strServiceName, "\r\n" + info);
			}
		} catch (Exception ex) {
			log.error(ex);
		}

		final long nFromTime2 = nFromTime;
		String strTaskName = String.format("%1$s-%2$s-%3$s@K8sSaaSFuncAgent", strServiceName, strNamespace, strPodId);
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runLogTimer(strNamespace, strServiceName, strPodId, cloudConsole, nFromTime2);
			}
		}, System.currentTimeMillis() + 3000, strTaskName);

	}

	protected String getLogCat() {
		return LOGCAT_K8SSAASFUNCAGENT;
	}

}
