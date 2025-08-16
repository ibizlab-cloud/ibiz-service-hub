package net.ibizsys.central.cloud.dataflow.spark.addin;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.spark.launcher.SparkAppHandle;
import org.apache.spark.launcher.SparkLauncher;

import net.ibizsys.central.cloud.core.util.ConfigEntityEx;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.dataflow.core.addin.DataFlowAccessAgentBase;

public class SparkDataFlowAccessAgent extends DataFlowAccessAgentBase implements ISparkDataFlowAccessAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SparkDataFlowAccessAgent.class);

	private Map<String, Object> k8sParams = new LinkedHashMap<String, Object>();
	
	@Override
	protected void onInit() throws Exception {
		Object params = this.getAgentData().get(PARAM_K8SPARAMS);
		if(params instanceof Map) {
			Map map = (Map)params;
			ConfigEntityEx configEntityEx = new ConfigEntityEx(map, true);
			k8sParams.putAll(configEntityEx.any());
		}
		else
			throw new Exception(String.format("未指定k8sparams"));
		super.onInit();
	}
	
	protected  Map<String, Object> getK8sParams() {
		return this.k8sParams;
	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}
	
	@Override
	protected void doStart(String id, Map<String, Object> params, PortalAsyncAction portalAsyncAction, String[] args) throws Throwable {
		
		SparkLauncher launcher = new SparkLauncher()
				.setAppName("ibiz-cloud-dataflow-spark");
		if (this.getAgentData().get(PARAM_SPARK_HOME) == null) {
			throw new Exception(String.format("未指定spark.home"));
		}
		if (this.getAgentData().get(PARAM_SPARK_MASTER) == null) {
			throw new Exception(String.format("未指定spark集群"));
		}
		if (this.getAgentData().get(PARAM_SPARK_APPRESOURCE) == null) {
			throw new Exception(String.format("未指定jar包"));
		}
		if (this.getAgentData().get(PARAM_SPARK_MAINCLASS) == null) {
			throw new Exception(String.format("jar对应的mainClass"));
		}

		launcher.setSparkHome(String.valueOf(this.getAgentData().get(PARAM_SPARK_HOME)));
		launcher.setMaster(String.valueOf(this.getAgentData().get(PARAM_SPARK_MASTER)));
		launcher.setAppResource(String.valueOf(this.getAgentData().get(PARAM_SPARK_APPRESOURCE)));
		launcher.setMainClass(String.valueOf(this.getAgentData().get(PARAM_SPARK_MAINCLASS)));

		Map<String, Object> k8sParams = this.getK8sParams();
		if(k8sParams != null) {
			for(java.util.Map.Entry<String, Object> entry : k8sParams.entrySet()) {
				if(entry.getValue() == null) {
					launcher.setConf(entry.getKey(), "");
					continue;
				}
				if(entry.getValue() instanceof String) {
					if ("spark.kubernetes.driver.pod.name".equals(entry.getKey())) {
						launcher.setConf(entry.getKey(), entry.getValue() + "-" + System.currentTimeMillis());
					} else {
						launcher.setConf(entry.getKey(), (String) entry.getValue());
					}
					continue;
				}
				else {
					launcher.setConf(entry.getKey(), entry.getValue().toString());
					continue;
				}
			}
		}
		
		launcher.addAppArgs(args).setDeployMode("cluster");
		
	//	ICloudPortalClient iCloudPortalClient = getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL, ICloudPortalClient.class);
		
        launcher.startApplication(new SparkAppHandle.Listener() {
            @Override
            public void stateChanged(SparkAppHandle handle) {
            	log.info("****************stateChanged " + handle.getAppId() + handle.getState());
                if (SparkAppHandle.State.LOST != handle.getState()) {
//                	try {
//                		PortalAsyncAction portalAsyncAction2 = new PortalAsyncAction(); 
//                    	portalAsyncAction2.setActionResult("处理失败");
//                    	iCloudPortalClient.errorAsyncAction(portalAsyncAction.getAsyncAcitonId(), portalAsyncAction2);
//                	}
//                	catch (Exception ex) {
//						log.error(ex);
//					}
                } else {
//                    mcPipelineDTO.setLastExecuteStatus("Processed");
//                    McPipelineClient.getInstance().feedbackById(mcPipelineDTO.getId(), mcPipelineDTO);
                }
            }

            @Override
            public void infoChanged(SparkAppHandle handle) {
            	log.info("****************infoChanged " + handle.getAppId() + handle.getState());
            }
        });
        
//      .
		

//		  SparkLauncher launcher = new SparkLauncher()
//                .setAppName("java-client-data-process")
//                .setMaster(k8sparams.getOrDefault("_master", ""))
//                .setConf("spark.executor.memory", k8sparams.getOrDefault("spark.executor.executor-memory", "3G"))
//                .setConf("spark.driver.memory", k8sparams.getOrDefault("spark.driver.memory", "2G"))
//                .setConf("spark.executor.instances", k8sparams.getOrDefault("_spark.executor.instances", "1"))
//                .setConf("spark.kubernetes.authenticate.driver.serviceAccountName", k8sparams.getOrDefault("_spark.kubernetes.authenticate.driver.serviceaccountname", "1"))
//                .setConf("spark.kubernetes.driver.pod.name", mcPipelineDTO.getResourceCode().toLowerCase() + "-" + System.currentTimeMillis())
//                .setConf("spark.kubernetes.container.image", k8sparams.getOrDefault("_spark.kubernetes.container.image", ""))
//                .setConf("spark.kubernetes.authenticate.submission.caCertFile", k8sparams.getOrDefault("_spark.kubernetes.authenticate.submission.cacertfile", ""))
//                .setConf("spark.kubernetes.authenticate.submission.oauthToken", k8sparams.getOrDefault("_spark.kubernetes.authenticate.submission.oauthtoken", ""))
//                .setAppResource(k8sparams.getOrDefault("_appresource", ""))
//                .setMainClass(k8sparams.getOrDefault("_mainclass", ""))
//                .addAppArgs(args.toArray(new String[0]))
//                .setDeployMode("cluster");
//		  
//		  
//		  if (StringUtils.isNotEmpty(k8sparams.getOrDefault("_spark.home", ""))) {
//            launcher.setSparkHome(k8sparams.getOrDefault("_spark.home", ""));
//        }

	}
	
	
}
