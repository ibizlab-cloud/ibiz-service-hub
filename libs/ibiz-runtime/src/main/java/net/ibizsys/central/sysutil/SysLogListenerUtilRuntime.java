package net.ibizsys.central.sysutil;

import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemLogListener;
import net.ibizsys.runtime.util.ObjectNodeUtils;
import net.ibizsys.runtime.util.domain.Log;
import net.ibizsys.runtime.util.domain.LogTypes;

/**
 * 系统日志侦听器组件运行时对象
 * @author lionlau
 *
 */
public class SysLogListenerUtilRuntime extends SysUtilRuntimeBase implements ISystemLogListener {

	private static final org.apache.commons.logging.Log logger = LogFactory.getLog(SysLogListenerUtilRuntime.class);
	
	private String strTopic = null;
	private String strEventTopic = null;
	private String strAuditTopic = null;
	private String strPOTopic = null;
	
	@Override
	protected void onInit() throws Exception {
	
		if(this.getOutSysEAIAgentRuntime() == null) {
			throw new Exception(String.format("未指定输出系统应用集成代理对象"));
		}
		
		super.onInit();
		
		//读取配置
		ObjectNode utilParams = this.getPSSysUtil().getUtilParams();
		if(utilParams != null) {
			this.setDefaultTopic(ObjectNodeUtils.getFieldValue(utilParams, "topic", null));
			this.setEventTopic(ObjectNodeUtils.getFieldValue(utilParams, "topic.event", null));
			this.setAuditTopic(ObjectNodeUtils.getFieldValue(utilParams, "topic.audit", null));
			this.setPOTopic(ObjectNodeUtils.getFieldValue(utilParams, "topic.po", null));
		}
		
		this.getSystemRuntime().registerSystemLogListener(this);
		
	}
	
	/**
	 * 获取常规日志消息主题
	 * @return
	 */
	protected String getDefaultTopic() {
		return strTopic;
	}
	
	protected void setDefaultTopic(String strTopic) {
		this.strTopic = strTopic;
	}
	
	
	/**
	 * 获取事件日志消息主题
	 * @return
	 */
	protected String getEventTopic() {
		return strEventTopic;
	}
	
	
	protected void setEventTopic(String strEventTopic) {
		this.strEventTopic = strEventTopic;
	}
	
	/**
	 * 获取审计日志消息主题
	 * @return
	 */
	protected String getAuditTopic() {
		return strAuditTopic;
	}
	
	protected void setAuditTopic(String strAuditTopic) {
		this.strAuditTopic = strAuditTopic;
	}
	
	
	/**
	 * 获取性能日志消息主题
	 * @return
	 */
	protected String getPOTopic() {
		return strPOTopic;
	}
	
	protected void setPOTopic(String strPOTopic) {
		this.strPOTopic = strPOTopic;
	}
	
	/**
	 * 获取传入日志的发送消息主题
	 * @param log
	 * @return
	 */
	protected String getTopic(Log log) {
		if(LogTypes.EVENT.equals(log.getLogType())) {
			return this.getEventTopic();
		}
		
		if(LogTypes.AUDIT.equals(log.getLogType())) {
			return this.getAuditTopic();
		}
		
		if(LogTypes.PO.equals(log.getLogType())) {
			return this.getPOTopic();
		}
		return this.getDefaultTopic();
	}

	@Override
	public void log(Log log) {
		this.onLog(log);
	}
	
	protected void onLog(Log log) {
		
		String strTopic = this.getTopic(log);
		if(strTopic != null && strTopic.length() == 0) {
			//忽略
			return;
		}
		
		String strData = (String) this.getSystemRuntime().serialize(log);
		try {
			this.getOutSysEAIAgentRuntime().send(strTopic, strData);
		}
		catch(Throwable ex) {
			logger.error(String.format("输出日志发生异常，%1$s", ex.getMessage()), ex);
		}
	}
}
