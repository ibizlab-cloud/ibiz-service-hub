package net.ibizsys.central.plugin.activemq.eai;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.eai.SysEAIAgentRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * ActiveMQ应用集成代理运行时对象
 * @author lionlau
 *
 */
public class ActiveMQEAIAgentRuntime extends SysEAIAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ActiveMQEAIAgentRuntime.class);
	
	public final static String PARAM_TOPICMODE = "TOPICMODE";
	
	public final static String PARAM_ACKNOWLEDGEMODE = "ACKNOWLEDGEMODE";
	
	
	private Connection connection = null;
	private Session session = null;
	private boolean bTopicMode = false;
	private int nAcknowledgeMode = Session.AUTO_ACKNOWLEDGE;
	
	private Map<String, MessageProducer> messageProducerMap = new ConcurrentHashMap<String, MessageProducer>();
	private Map<String, MessageConsumer> messageConsumerMap = new ConcurrentHashMap<String, MessageConsumer>();
	
	@Override
	protected void onInit() throws Exception {
		
		this.setTopicMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".topicmode", DataTypeUtils.getBooleanValue(this.getAgentParam(PARAM_TOPICMODE, null), false)));
		this.setAcknowledgeMode(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".acknowledgemode", DataTypeUtils.getIntegerValue(this.getAgentParam(PARAM_ACKNOWLEDGEMODE, null), Session.AUTO_ACKNOWLEDGE)));
		
		super.onInit();
		
		if(getConnection(true) == null) {
			this.prepareConnection();
			
			if(this.getConnection(true) == null) {
				throw new Exception(String.format("连接对象无效"));
			}
		}
		
		if(getSession(true) == null) {
			this.prepareSession();
			
			if(this.getSession(true) == null) {
				throw new Exception(String.format("会话对象无效"));
			}
		}
		
		String strSyncDir = this.getPSSysDataSyncAgent().getSyncDir();
//		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
//				|| SysDataSyncAgentDirs.OUT.equals(strSyncDir)) {
//			prepareQueue();
//		}
		
		
		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
				|| SysDataSyncAgentDirs.IN.equals(strSyncDir)) {
			
			List<String> list = this.getTopics();
			if(!ObjectUtils.isEmpty(list)) {
				for(String strTopic : list) {
					MessageConsumer messageConsumer = this.getMessageConsumer(strTopic);
					messageConsumer.setMessageListener((message) -> {
						if (null != message && message instanceof TextMessage) {
							String strText;
							try {
								strText = ((TextMessage)message).getText();
							} catch (JMSException ex) {
								log.error(String.format("获取消息内容发生异常，%1$s", ex.getMessage()), ex);
								return;
							}
							recv(strTopic, strText);
						}
					});
				}
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

		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(this.getClientId(), this.getClientSecret(), strServiceUrl);
		Connection connection = activeMQConnectionFactory.createConnection();
		connection.start();
		this.setConnection(connection);
	}
	
	protected void closeConnection() throws Exception{
		Connection connection = this.getConnection(true);
		if(connection != null) {
			connection.close();
			this.setConnection(null);
		}
	}
	
	protected Session getSession() {
		return this.getSession(false);
	}
	
	protected Session getSession(boolean bTryMode) {
		if(this.session != null || bTryMode) {
			return this.session;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定会话对象");
	}
	
	protected void setSession(Session session) {
		this.session = session;
	}
	
	protected void prepareSession() throws Exception{
		Connection connection = this.getConnection(true);
		if(connection == null) {
			throw new Exception("未指定服务连接");
		}

		Session session = connection.createSession(this.isTransacted(), this.getAcknowledgeMode());
		this.setSession(session);
	}
	
	protected void closeSession() throws Exception{
		Session session = this.getSession(true);
		if(session != null) {
			session.close();
			this.setSession(null);
		}
	}
	
	
	protected MessageProducer getMessageProducer(String strTopic) throws Exception{
		MessageProducer messageProducer = this.messageProducerMap.get(strTopic);
		if(messageProducer != null) {
			return messageProducer;
		}
		
		Session session = this.getSession(true);
		if(session == null) {
			throw new Exception("未指定连接会话");
		}
		
		if(this.isTopicMode()) {
			Topic topic = session.createTopic(strTopic);
			messageProducer = session.createProducer(topic);
		}
		else {
			Queue queue = session.createQueue(strTopic);
			messageProducer = session.createProducer(queue);
		}
		
		this.messageProducerMap.put(strTopic, messageProducer);
				
		return messageProducer;
	}
	
	protected MessageConsumer getMessageConsumer(String strTopic) throws Exception{
		MessageConsumer messageConsumer = this.messageConsumerMap.get(strTopic);
		if(messageConsumer != null) {
			return messageConsumer;
		}
		
		Session session = this.getSession(true);
		if(session == null) {
			throw new Exception("未指定连接会话");
		}
		
		if(this.isTopicMode()) {
			Topic topic = session.createTopic(strTopic);
			messageConsumer = session.createConsumer(topic);
		}
		else {
			Queue queue = session.createQueue(strTopic);
			messageConsumer = session.createConsumer(queue);
		}
		
		this.messageConsumerMap.put(strTopic, messageConsumer);
				
		return messageConsumer;
	}
	

	public boolean isTopicMode() {
		return this.bTopicMode;
	}
	
	protected void setTopicMode(boolean bTopicMode) {
		this.bTopicMode = bTopicMode;
	}
	
	public int getAcknowledgeMode() {
		return this.nAcknowledgeMode;
	}
	
	public void setAcknowledgeMode(int nAcknowledgeMode) {
		this.nAcknowledgeMode = nAcknowledgeMode;
	}
	
	@Override
	protected void onSend(String strTopic, String strData) throws Throwable {
		String strRealTopic = StringUtils.hasLength(strTopic)?strTopic:this.getDefaultTopic();
		MessageProducer messageProducer = this.getMessageProducer(strRealTopic);
		TextMessage textMessage = session.createTextMessage(strData);
		messageProducer.send(textMessage);
	}
	
	
	@Override
	protected void onShutdown() throws Exception {
		try {
			this.closeSession();
		}
		catch (Exception ex) {
			log.error(String.format("关闭连接会话发生异常，%1$s", ex.getMessage()), ex);
		}
		
		try {
			this.closeConnection();
		}
		catch (Exception ex) {
			log.error(String.format("关闭连接发生异常，%1$s", ex.getMessage()), ex);
		}
		
		if(!ObjectUtils.isEmpty(messageProducerMap)) {
			messageProducerMap.clear();
		}
		if(!ObjectUtils.isEmpty(messageConsumerMap)) {
			messageConsumerMap.clear();
		}
		
		super.onShutdown();
	}
	
}
