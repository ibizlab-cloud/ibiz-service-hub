package net.ibizsys.central.plugin.eai;

import java.util.List;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.eai.SysEAIAgentRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * MQTT协议应用集成代理运行时对象
 * @author lionlau
 *
 */
public class MqttEAIAgentRuntime extends SysEAIAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MqttEAIAgentRuntime.class);
	
	public final static String PARAM_QOS = "QOS";
	
	public final static String PARAM_RETAINED = "RETAINED";
	
	
	private MqttClient client;
	
	private int nQos = 1;
	
	private boolean bRetained = false;
	
	
	

	@Override
	protected void onInit() throws Exception {
		
		this.setRetained(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".retained", DataTypeUtils.getBooleanValue(this.getAgentParam(PARAM_RETAINED, null), this.isRetained())));
		this.setQos(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".qos", DataTypeUtils.getIntegerValue(this.getAgentParam(PARAM_QOS, null), this.getQos())));
		
		super.onInit();
		
		if(getClient(true) == null) {
			try {
				this.prepareClient();
			}
			catch (Exception ex) {
				throw new Exception(String.format("准备客户端发生异常，%1$s", ex.getMessage()), ex);
			}
			
			if(this.getClient(true) == null) {
				throw new Exception(String.format("客户端对象无效"));
			}
		}
		

		String strSyncDir = this.getPSSysDataSyncAgent().getSyncDir();

		
		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
				|| SysDataSyncAgentDirs.IN.equals(strSyncDir)) {
			try {
				this.prepareSubscribers();	
			}
			catch (Exception ex) {
				throw new Exception(String.format("准备消息订阅发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}
	
	protected MqttClient getClient() {
		return this.getClient(false);
	}
	
	protected MqttClient getClient(boolean bTryMode) {
		if(this.client != null || bTryMode) {
			return this.client;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定客户端对象");
	}
	
	protected void setClient(MqttClient client) {
		this.client = client;
	}
	
	protected void prepareClient() throws Exception{
		String strServiceUrl = this.getServiceUrl();
		if(!StringUtils.hasLength(strServiceUrl)) {
			throw new Exception("未指定服务地址");
		}
		
		MqttClient client = new MqttClient(strServiceUrl, this.isGroupIdDefined()?this.getGroupId():(this.getGroupId() + KeyValueUtils.genUniqueId()), new MemoryPersistence());
        client.setCallback(new MqttCallbackExtended() {

			@Override
			public void connectionLost(Throwable cause) {
				onConnectionLost(cause);
			}

			@Override
			public void messageArrived(String topic, MqttMessage message) throws Exception {
				onMessageArrived(topic, message);
			}

			@Override
			public void deliveryComplete(IMqttDeliveryToken token) {
				onDeliveryComplete(token);
			}

			@Override
			public void connectComplete(boolean reconnect, String serverURI) {
				onConnectComplete(reconnect, serverURI);
			}
        	
        });
        client.connect(getMqttConnectOptions());
	
		this.setClient(client);
	}
	
	protected void closeClient() throws Exception{
		MqttClient client = this.getClient(true);
		if(client != null) {
			client.close(true);
			this.setClient(null);
		}
	}
	
	protected MqttConnectOptions getMqttConnectOptions() {
		MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(false);
        options.setKeepAliveInterval(15);
        options.setConnectionTimeout(30);
        options.setAutomaticReconnect(true);
       
        if(StringUtils.hasLength(this.getClientId())
        		&& StringUtils.hasLength(this.getClientSecret())) {
        	options.setUserName(this.getClientId());
        	options.setPassword(this.getClientSecret().toCharArray());
        }
        return options;
	}
	
	protected void prepareSubscribers() throws Exception{
		List<String> list = this.getTopics();
		if(!ObjectUtils.isEmpty(list)) {
			
			int[] qoses = new int[list.size()];
			for(int i =0;i<qoses.length;i++) {
				qoses[i] = this.getQos();
			}
			this.getClient().subscribe(list.toArray(new String[list.size()]), qoses);
		}
	}

	
	@Override
	protected void onSend(String strTopic, String strData) throws Throwable {
		String strRealTopic = StringUtils.hasLength(strTopic)?strTopic:this.getDefaultTopic();
		this.getClient().publish(strRealTopic, strData.getBytes("UTF-8"), this.getQos(), this.isRetained());
	}
	
	
	protected void onConnectionLost(Throwable cause) {
		log.error(cause);
	}

	protected void onMessageArrived(String topic, MqttMessage message) throws Exception {
		this.recv(topic, new String(message.getPayload(), "UTF-8"));
	}

	protected void onDeliveryComplete(IMqttDeliveryToken token) {
		log.debug(String.format("onDeliveryComplete"));
	}
	
	protected void onConnectComplete(boolean reconnect, String serverURI) {
		log.debug(String.format("onConnectComplete"));

		String strSyncDir = this.getPSSysDataSyncAgent().getSyncDir();

		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
				|| SysDataSyncAgentDirs.IN.equals(strSyncDir)) {
			try {
				this.prepareSubscribers();	
			}
			catch (Exception ex) {
				log.error(String.format("准备消息订阅者发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}
	
	public int getQos() {
		return this.nQos;
	}
	
	protected void setQos(int nQos) {
		this.nQos = nQos;
	}
	
	public boolean isRetained() {
		return this.bRetained;
	}
	
	protected void setRetained(boolean bRetained) {
		this.bRetained = bRetained;
	}
	
	@Override
	protected void onShutdown() throws Exception {
		try {
			this.closeClient();
		}
		catch (Exception ex) {
			log.error(String.format("关闭客户端发生异常，%1$s", ex.getMessage()), ex);
		}
		
		super.onShutdown();
	}
}
