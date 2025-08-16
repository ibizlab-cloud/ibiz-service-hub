package net.ibizsys.central.cloud.saas.jenkins.addin;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.saas.core.addin.SaaSFuncAgentBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class JenkinsSaaSFuncAgent extends SaaSFuncAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(JenkinsSaaSFuncAgent.class);
	
	/**
	 * 构建作业
	 */
	public final static String METHOD_BUILDJOB = "BUILDJOB";
	
	/**
	 * 构建作业参数：作业名称
	 */
	public final static String PARAM_BUILDJOB_JOB = "job";
	
	/**
	 * 构建作业参数：作业参数
	 */
	public final static String PARAM_BUILDJOB_PARAM = "param";
	
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();

		String jenkinsUrl = this.getAgentData().getServiceUrl();
		String accessKey = this.getAgentData().getAccessKey();
		String secretKey = this.getAgentData().getSecretKey();
		
		if(!StringUtils.hasLength(jenkinsUrl)) {
			throw new Exception("未指定Jenkins服务路径");
		}
		
		if(!StringUtils.hasLength(accessKey)) {
			throw new Exception("未指定AccessKey");
		}
		
		if(!StringUtils.hasLength(secretKey)) {
			throw new Exception("未指定SecretKey");
		}
	}
	
	@Override
	protected Object onInvoke(String method, Map<String, Object> params) throws Throwable {
		
		if(METHOD_BUILDJOB.equalsIgnoreCase(method)) {
			String strJobName = DataTypeUtils.getStringValue(params.get(PARAM_BUILDJOB_JOB), null);
			Object objJobParams = params.get(PARAM_BUILDJOB_PARAM);
			Map<String, Object> jobParams = null;
			if(objJobParams instanceof Map) {
				jobParams = (Map)objJobParams;
			}
			else {
				jobParams = new HashMap<String, Object>();
			}
			return buildJob(strJobName, jobParams);
		}
		
		return super.onInvoke(method, params);
	}

	
	protected ObjectNode buildJob(String strJobName, Map<String, Object> jobParams) throws Throwable {
		String jenkinsUrl = this.getAgentData().getServiceUrl();
		String accessKey = this.getAgentData().getAccessKey();
		String secretKey = this.getAgentData().getSecretKey();
		
		String strQueueUrl = null;

		if (jenkinsUrl.endsWith("/")) {
			jenkinsUrl = jenkinsUrl.substring(0, jenkinsUrl.length() - 1);
		}
		// 执行建立
		CloseableHttpClient httpClient = null;
		try{
			httpClient = HttpClients.createDefault();
			if (true) {
				HttpPost request = new HttpPost(jenkinsUrl + String.format("/job/%1$s/build", strJobName));
				request.setHeader("Authorization", getAuthHeader(accessKey, secretKey));
				request.addHeader("Content-Type", "application/xml");
				String jobXml = "";
				StringEntity entity = new StringEntity(jobXml);
				request.setEntity(entity);
				//
				HttpResponse response = httpClient.execute(request);
				int statusCode = response.getStatusLine().getStatusCode();
				if (statusCode == 200 || statusCode == 201) {
					Header[] headers = response.getHeaders("Location");
					if (headers != null && headers.length > 0) {
						strQueueUrl = headers[0].getValue();
					}
				} else {
					HttpEntity responseEntity = response.getEntity();
					String responseBody = EntityUtils.toString(responseEntity);
					throw new Exception(responseBody);
				}
			}

			int nTimeout = 20;
			while (nTimeout > 0) {
				// HttpGet request = new HttpGet(jenkinsUrl +
				// String.format("/job/%1$s/api/json", strJobName));
				HttpGet request = new HttpGet(String.format("%1$s/api/json", strQueueUrl));
				request.setHeader("Authorization", getAuthHeader(accessKey, secretKey));

				//
				HttpResponse response = httpClient.execute(request);
				int statusCode = response.getStatusLine().getStatusCode();
				if (statusCode == 200 || statusCode == 201) {

					HttpEntity responseEntity = response.getEntity();
					String responseBody = EntityUtils.toString(responseEntity);
					if (StringUtils.hasLength(responseBody)) {
						ObjectNode node = JsonUtils.toObjectNode(responseBody);
						if (node.has("executable")) {
							JsonNode ret = node.get("executable");
							if (ret instanceof ObjectNode) {
								return (ObjectNode) ret;
							}
						}
					}

					nTimeout--;
					Thread.sleep(1000);
				} else {
					HttpEntity responseEntity = response.getEntity();
					String responseBody = EntityUtils.toString(responseEntity);
					throw new Exception(responseBody);
				}
			}

			throw new Exception("无法获取构建信息");
		} catch (Exception ex) {
			throw new Exception(String.format("构建作业发生异常，%1$s", ex.getMessage()), ex);
		}
		finally {
			if(httpClient!=null) {
				try {
					httpClient.close();
				}
				catch(Throwable e){
					log.error(e);
				}
				httpClient = null;
			}
		}
	}
	
	public static String getAuthHeader(String accessKey, String secretKey) {
		String auth = accessKey + ":" + secretKey;
		byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
		return "Basic " + new String(encodedAuth);
	}
}
