package net.ibizsys.central.plugin.rabbitmq.eai;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import net.ibizsys.central.cloud.core.eai.SysEAIAgentRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;

/**
 * RabbitMQ 应用集成代理运行时对象
 * 
 * @author lionlau
 *
 */
public class RabbitMQEAIAgentRuntime extends SysEAIAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(RabbitMQEAIAgentRuntime.class);

	private Connection connection = null;
	private Channel inChannel = null;
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
		if(getConnection(true) == null) {
			this.prepareConnection();
			
			if(this.getConnection(true) == null) {
				throw new Exception(String.format("连接对象无效"));
			}
		}
		
		String strSyncDir = this.getPSSysDataSyncAgent().getSyncDir();
		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
				|| SysDataSyncAgentDirs.OUT.equals(strSyncDir)) {
			for(String strTopic : this.getTopics()) {
				prepareQueue(strTopic);
			}
		}
		
		
		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
				|| SysDataSyncAgentDirs.IN.equals(strSyncDir)) {
			
			inChannel = getConnection().createChannel();
			for(String strTopic : this.getTopics()) {
				
				//inChannel.
				inChannel.basicConsume(strTopic, true, this.getGroupId(), new DefaultConsumer(inChannel) {
					
					@Override
					public void handleDelivery(String arg0, Envelope arg1, BasicProperties arg2, byte[] arg3) throws IOException {
						recv(strTopic, new String(arg3, StandardCharsets.UTF_8));
					}
				});
			}
		}
		
	}
	
	protected Connection getConnection() {
		return this.getConnection(false);
	}
	
	protected Connection getConnection(boolean bTryMode) {
		if(this.connection != null || bTryMode) {
			return this.connection;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定连接对象");
	}
	
	protected void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	protected void prepareConnection() throws Exception{
		String strServiceUrl = this.getServiceUrl();
		if(!StringUtils.hasLength(strServiceUrl)) {
			throw new Exception("未指定服务地址");
		}
		
		String[] items = strServiceUrl.split("[/]");
		String strUrl = items[0];
		String strVirtualHost = null;
		if(items.length > 1) {
			strVirtualHost = items[1];
		}
		
		
		String[] hosts = strUrl.split("[:]");
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost(hosts[0]);
		if(hosts.length>1) {
			factory.setPort(Integer.parseInt(hosts[1]));
		}
		
		if(StringUtils.hasLength(strVirtualHost)) {
			factory.setVirtualHost(strVirtualHost);
		}
		
		if(StringUtils.hasLength(this.getClientId())) {
			factory.setUsername(this.getClientId());
		}
		
		if(StringUtils.hasLength(this.getClientSecret())) {
			factory.setPassword(this.getClientSecret());
		}
		
		this.setConnection(factory.newConnection());
	}
	
	
	protected void closeConnection() throws Exception{
		Connection connection = this.getConnection(true);
		if(connection != null) {
			connection.close();
			this.setConnection(null);
		}
	}

	protected void prepareQueue(String strTopic) throws Exception{
		//String strTopic = this.getDefaultTopic();
		Assert.hasLength(strTopic, "未传入Queue标识");

		String[] items = strTopic.split("[@]");
		try (Channel channel = getConnection().createChannel()) {
			channel.queueDeclare(items[0], true, false, false, null);
		}
	}
	
	@Override
	protected void onSend(String strTopic, String strData) throws Throwable {
		
		String strRealTopic = StringUtils.hasLength(strTopic)?strTopic:this.getDefaultTopic();
		String[] items = strRealTopic.split("[@]");
		
		try (Channel channel = getConnection().createChannel()) {
			if(items.length == 2) {
				channel.basicPublish(items[1], items[0], null, strData.getBytes(StandardCharsets.UTF_8));
			}
			else {
				channel.basicPublish("", items[0], null, strData.getBytes(StandardCharsets.UTF_8));
			}
		}
	}
	
	
	@Override
	protected void onShutdown() throws Exception {
		try {
			this.closeConnection();
		}
		catch (Exception ex) {
			log.error(String.format("关闭连接对象发生异常，%1$s", ex.getMessage()), ex);
		}
		
		super.onShutdown();
	}
}
