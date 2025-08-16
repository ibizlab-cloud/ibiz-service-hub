package net.ibizsys.central.cloud.log.core.addin;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ConsoleUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.Log;
import net.ibizsys.runtime.util.domain.LogTypes;

public class PSStudioConsoleSender extends ConsoleSenderBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSStudioConsoleSender.class);
	
	public final static String CONSOLETYPE_COMMAND = "COMMAND";
	
	public final static String CONSOLETYPE_CONSOLE = "CONSOLE";
	
	private IWebClient iWebClient = null;
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
		if(!StringUtils.hasLength(this.getServiceUrl())) {
			log.warn(String.format("未配置PSStudio控制台服务路径，无法进行控制台信息发送"));
			this.setEnabled(false);
		}
		else {
			if (getWebClient(true) == null) {
				this.prepareWebClient();

				if (this.getWebClient(true) == null) {
					throw new Exception(String.format("Web客户端对象对象无效"));
				}
			}
		}
		
	}
	
	protected IWebClient getWebClient() {
		return this.getWebClient(false);
	}

	protected IWebClient getWebClient(boolean bTryMode) {
		if (this.iWebClient != null || bTryMode) {
			return this.iWebClient;
		}
		throw new SystemRuntimeException(this.getContext().getCloudLogUtilRuntime().getSystemRuntime(), this.getContext().getCloudLogUtilRuntime(), "未指定Web客户端对象");
	}

	protected void setWebClient(IWebClient iWebClient) {
		this.iWebClient = iWebClient;
	}

	protected void prepareWebClient() throws Exception {
		String strServiceUrl = this.getServiceUrl();
		IWebClient iWebClient = this.getSystemRuntime().createWebClient(strServiceUrl);
		iWebClient.init(this.getSystemRuntime(), strServiceUrl, null);
		this.setWebClient(iWebClient);
	}
	

	@Override
	void onSend(List<Log> logs) throws Throwable {
		if(!this.isEnabled()) {
			return;
		}
		
		for(Log log : logs) {
			if(!StringUtils.hasLength(log.getConsoleId())) {
				continue;
			}
			
			Map<String, Object> contentMap = new LinkedHashMap<String, Object>();
			
			String strConsoleType = log.getConsoleType();
			if(!StringUtils.hasLength(strConsoleType)) {
				strConsoleType = CONSOLETYPE_CONSOLE;
			}
			
			contentMap.put("type", strConsoleType);
			
			if(StringUtils.hasLength(log.getConsoleSender())) {
				contentMap.put("subtype", log.getConsoleSender());
			}
			else {
				if(LogTypes.NORMAL.equals(log.getLogType())) {
					contentMap.put("subtype", "iBizCloud");
				}
				else
					if(LogTypes.AUDIT.equals(log.getLogType())) {
						contentMap.put("subtype", "iBizCloud[AUDIT]");
					}
					else
						if(LogTypes.PO.equals(log.getLogType())) {
							contentMap.put("subtype", "iBizCloud[PO]");
						}
						else
							if(LogTypes.EVENT.equals(log.getLogType())) {
								contentMap.put("subtype", "iBizCloud[EVENT]");
							}
							else
							{
								contentMap.put("subtype", "iBizCloud");
							}
			}
			
			String strInfo = log.getConsoleInfo();
			if(!StringUtils.hasLength(strInfo)){
				if(!StringUtils.hasLength(log.getInfo())) {
					continue;
				}
				StringBuilder sb = new StringBuilder();
				sb.append("\r\n");
				if(log.getLogTime()!=null) {
					sb.append(String.format("%1$tm-%1$td %1$tH:%1$tM:%1$tS ",log.getLogTime()));
				}
				
				
				if(log.getLogLevel()!=null) {
					
					switch(log.getLogLevel()) {
					case LogLevels.INFO:
						sb.append("INFO ");
						break;
					case LogLevels.DEBUG:
						sb.append("DEBUG ");
						break;
					case LogLevels.ERROR:
						sb.append("ERROR ");
						break;
					case LogLevels.FATAL:
						sb.append("FATAL ");
						break;
					case LogLevels.TRACE:
						sb.append("TRACE ");
						break;
					case LogLevels.WARN:
						sb.append("WARN ");
						break;
					}
				}
				
				if(StringUtils.hasLength(log.getLogCat())) {
					sb.append(String.format("[%1$s]", log.getLogCat()));
				}
				
				//加入颜色
				if(log.getLogLevel()!=null) {
					
					switch(log.getLogLevel()) {
					case LogLevels.TRACE:
					case LogLevels.INFO:
					case LogLevels.DEBUG:
						strInfo = sb.toString();
						break;
					case LogLevels.ERROR:
					case LogLevels.FATAL:
						strInfo = ConsoleUtils.getErrorContent(sb.toString());
						break;
					case LogLevels.WARN:
						strInfo = ConsoleUtils.getWarnContent(sb.toString());
						break;
					default:
						strInfo = sb.toString();
						break;
					}
				}
				else {
					strInfo = sb.toString();
				}
				
				strInfo = String.format("%1$s\r\n%2$s", strInfo, log.getInfo());
			}
			contentMap.put("content", strInfo);
			
			//序列化为内容
			String strContent = (String) this.getSystemRuntime().serialize(contentMap);
			
			//复用Map
			contentMap.clear();
			contentMap.put("clientid", "iBizCloud");
			contentMap.put("topic",log.getConsoleId());
			contentMap.put("content", strContent);
			if(StringUtils.hasLength(log.getData())) {
				contentMap.put("data", log.getData());
			}
			
			this.getWebClient().post(null, null, contentMap);
		}
		
	}

	
	
	
}
