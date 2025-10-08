package net.ibizsys.central.cloud.core.dataentity.logic;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.dataentity.logic.DELogicDebugModes;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatAgentType;
import net.ibizsys.model.PSModelEnums.LogicSubType;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic;
import net.ibizsys.runtime.util.LogLevels;

public class DELogicRuntime extends net.ibizsys.central.dataentity.logic.DELogicRuntime implements IDELogicRuntime {

	private static final Log log = LogFactory.getLog(DELogicRuntime.class);
	public static final String CONSOLESENDER_DELOGICDEBUGGER = "DELogic调试信息";
	private ISysCloudLogUtilRuntime iSysCloudLogUtilRuntime = null;
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	
	
	private LogicSubType logicSubType = LogicSubType.NONE;
	
	@Override
	protected void onInit() throws Exception {
		if(StringUtils.hasLength(this.getPSDELogic().getLogicSubType())) {
			this.logicSubType = LogicSubType.from(this.getPSDELogic().getLogicSubType());
		}
		if(this.getDebugMode() != DELogicDebugModes.NONE) {
			if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
				if(((IServiceSystemRuntime)this.getSystemRuntime()).isEnableProdMode()) {
					String strLogCat = String.format("%1$s|%2$s(%3$s)", this.getDataEntityRuntime().getName(), this.getLogicName(), this.getPSDELogic().getCodeName());
					log.warn(String.format("处理逻辑[%1$s]调试模式在生产模式下禁用", strLogCat));
					this.setDebugMode(DELogicDebugModes.NONE);
				}
			}
		}
		
		super.onInit();
	}
	
	protected ISysCloudLogUtilRuntime getSysCloudLogUtilRuntime() {
		if(this.iSysCloudLogUtilRuntime == null) {
			this.iSysCloudLogUtilRuntime = this.getDELogicRuntimeContext().getSystemRuntime().getSysUtilRuntime(ISysCloudLogUtilRuntime.class, false);
		}
		return this.iSysCloudLogUtilRuntime;
	}
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		if(this.iSysCacheUtilRuntime == null) {
			this.iSysCacheUtilRuntime = this.getDELogicRuntimeContext().getSystemRuntime().getSysUtilRuntime(ISysCacheUtilRuntime.class, false);
		}
		return this.iSysCacheUtilRuntime;
	}
	
	public LogicSubType getLogicSubType() {
		return this.logicSubType;
	}
	
	
	@Override
	protected IDELogicSession createDELogicSession(Map<String, Object> params) {
		if(params != null) {
			return new DELogicSession(this.getDELogicRuntimeContext(), params);
		}
		return createDELogicSession();
	}
	 
	
	@Override
	protected IDELogicSession createDELogicSession() {
		return new DELogicSession(this.getDELogicRuntimeContext());
	}
	
	@Override
	protected void onExecute(IDELogicSession iDELogicSession, Object[] args) throws Throwable {
		//判断是否为AI聊天逻辑
		if(LogicSubType.AICHAT == getLogicSubType()) {
			Object req = iDELogicSession.getParamObject(DELOGIC_AICHAT_PARAM_CHATREQUEST);
			if(req instanceof ChatCompletionRequest) {
				ChatCompletionRequest chatCompletionRequest = (ChatCompletionRequest)req;
				String strCacheKey = String.format("ibiz-cloud-delogic-%1$s--%2$s-%3$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), chatCompletionRequest.getSessionId());
				Map<String, String> sessionParams = this.getSysCacheUtilRuntime().getAll(strCacheKey);
				//清除
				if(!ObjectUtils.isEmpty(sessionParams)) {
					this.getSysCacheUtilRuntime().reset(strCacheKey);
					String strNextId = sessionParams.get("srfnextid");
					if(StringUtils.hasLength(strNextId)) {
						IPSDELogicNode nextPSDELogicNode = this.getPSDELogicNode(strNextId, true);
						if(nextPSDELogicNode != null) {
							this.onExecutePSDELogicNode(iDELogicSession, nextPSDELogicNode);
							return;
						}
					}
				}				
			}
		}
		
		super.onExecute(iDELogicSession, args);
	}
	
	@Override
	protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode, boolean bExecuteLink) throws Throwable {
		super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, bExecuteLink);
		if(LogicSubType.AICHAT == getLogicSubType() && iDELogicSession.getNext() == IDELogicSession.NEXT_END) {
			if(iPSDELogicNode instanceof IPSDESysAIChatAgentLogic) {
				IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic = (IPSDESysAIChatAgentLogic)iPSDELogicNode;
				if(DELogicSysAIChatAgentType.CHATOUTPUT.value.equals(iPSDESysAIChatAgentLogic.getSubType()) || DELogicSysAIChatAgentType.CHATAGGREGATIONOUTPUT.value.equals(iPSDESysAIChatAgentLogic.getSubType())) {
					if(!ObjectUtils.isEmpty(iPSDESysAIChatAgentLogic.getPSDELogicLinks()) && iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
						Object value = this.getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParam().getCodeName(), false).getReal(iDELogicSession);
						if(value instanceof ChatCompletionRequest) {
							ChatCompletionRequest chatCompletionRequest = (ChatCompletionRequest)value;
							if(StringUtils.hasLength(chatCompletionRequest.getSessionId())) {
								IPSDELogicNode dstPSDELogicNode = null;
								for(IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
									if(iPSDELogicLink.isSubCallLink()) {
										continue;
									}
									
									dstPSDELogicNode = iPSDELogicLink.getDstPSDELogicNodeMust();
									break;
								}
								
								if(dstPSDELogicNode != null) {
									String strCacheKey = String.format("ibiz-cloud-delogic-%1$s--%2$s-%3$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), chatCompletionRequest.getSessionId());
									Map<String, String> sessionParams = new HashMap<String, String>();
									//备份
									List<IPSDELogicParam> params = this.getPSDELogic().getPSDELogicParams();
									if(!ObjectUtils.isEmpty(params)) {
										
									}
									
									sessionParams.put("srfnextid", dstPSDELogicNode.getCodeName());
									this.getSysCacheUtilRuntime().set(strCacheKey, sessionParams, 3600);
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Override
	protected void outputDebugInfo(IDELogicSession iDELogicSession, Throwable ex) {
		super.outputDebugInfo(iDELogicSession, ex);
		
		if(this.isOutputDebugInfo()) {
			
			//格式化Console信息
			String strLogCat = String.format("%1$s|%2$s(%3$s)", this.getDataEntityRuntime().getName(), this.getLogicName(), this.getPSDELogic().getCodeName());
			
			String strInfo = getDebugConsoleInfo(iDELogicSession, ex);
			if(StringUtils.hasLength(strInfo)) {
				String[] infos = splitByLength(strInfo, 20480);
				for(String strPart: infos) {
					if(ex == null) {
						this.getSysCloudLogUtilRuntime().sendConsoleMessage(null, CONSOLESENDER_DELOGICDEBUGGER, false, LogLevels.INFO, strLogCat, strPart);
					}
					else {
						this.getSysCloudLogUtilRuntime().sendConsoleMessage(null, CONSOLESENDER_DELOGICDEBUGGER, false, LogLevels.ERROR, strLogCat, strPart);
					}
				}
			}
		}
	}
	
	public static String[] splitByLength(String str, int length) {
	    int strLength = str.length();
	    int arrayLength = (int) Math.ceil((double) strLength / length);
	    String[] result = new String[arrayLength];
	    for (int i = 0; i < arrayLength; i++) {
	        int beginIndex = i * length;
	        int endIndex = Math.min(beginIndex + length, strLength);
	        result[i] = str.substring(beginIndex, endIndex);
	    }
	    return result;
	}
	
	protected String getDebugConsoleInfo(IDELogicSession iDELogicSession, Throwable ex) {
		if(iDELogicSession.getDebugArrayNode() != null) {
			StringBuilder sb = new StringBuilder();
			int nSize = iDELogicSession.getDebugArrayNode().size();
			int nBlank = 0;
			int nBlankLevel = 2;
			
			for(int i= 0;i<nSize;i++) {
				JsonNode jsonNode = iDELogicSession.getDebugArrayNode().get(i);
				if(!(jsonNode instanceof ObjectNode)) {
					continue;
				}
				
				ObjectNode objectNode = (ObjectNode)jsonNode;
				JsonNode type = objectNode.get("type");
				JsonNode time = objectNode.get("time");
				JsonNode name = objectNode.get("name");
				JsonNode info = objectNode.get("info");
				JsonNode data = objectNode.get("data");
				JsonNode codeName = objectNode.get("codeName");
				
				if(type == null) {
					continue;
				}
				sb.append("\r\n");
				for(int j=0;j<nBlank;j++) {
					sb.append(" ");
				}
				if(time!=null) {
					sb.append(time.asText());
					sb.append(" ");
				}
				String strType = type.asText();
				sb.append(String.format("[%1$s]", strType));
				if(name!=null) {
					sb.append(String.format(" %1$s",name.asText()));
					if(codeName!=null) {
						sb.append(String.format("(%1$s)", codeName.asText()));
					}
					if(info!=null) {
						sb.append(String.format("， %1$s", info.asText()));
					}
				}
				else {
					if(info!=null) {
						sb.append(String.format(" %1$s",info.asText()));
					}
				}
				
				
				if(data!=null) {
					sb.append("\r\n");
					for(int j=0;j<nBlank;j++) {
						sb.append(" ");
					}
					sb.append(" ");
					sb.append(data.toPrettyString());
				}
				
				if(IDELogicSession.DEBUGTYPE_ENTERNODE.equals(strType)) {
					nBlank += nBlankLevel;
				}
				else
					if(IDELogicSession.DEBUGTYPE_EXITNODE.equals(strType)) {
						nBlank -= nBlankLevel;
						if(nBlank<0) {
							nBlank = 0;
						}
					}
			}
			sb.append("\r\n");
			sb.append("\r\n");
			return sb.toString();
		}
		
		return null;
	}
	
	
}
