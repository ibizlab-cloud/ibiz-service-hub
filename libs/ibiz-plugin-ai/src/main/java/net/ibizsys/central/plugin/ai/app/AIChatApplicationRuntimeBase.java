package net.ibizsys.central.plugin.ai.app;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import net.ibizsys.central.app.ApplicationRuntimeException;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.ac.IDEChatCompletionRuntime;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;
import net.ibizsys.central.cloud.core.service.util.MethodHandlerBase;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.plugin.ai.agent.IAIChatAgent;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.model.PSModelEnums.DEACType;
import net.ibizsys.model.app.dataentity.IPSAppDEACMode;
import net.ibizsys.model.app.dataentity.IPSAppDERS;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * AI 交谈应用运行时对象接口
 * @author lionlau
 *
 */
public abstract class AIChatApplicationRuntimeBase extends AIApplicationRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIChatApplicationRuntimeBase.class);
	
	
	@Override
	protected void onRegisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		super.onRegisterMapping(iSysServiceAPIRequestMappingAdapter);
		
		
		this.registerAIChatCompletionMapping(iSysServiceAPIRequestMappingAdapter);
	}
	
	protected void registerAIChatCompletionMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		//循环应用实体
		java.util.List<IPSAppDataEntity> psAppDataEntityList = this.getPSApplication().getAllPSAppDataEntities();
		if(ObjectUtils.isEmpty(psAppDataEntityList)) {
			return;
		}
		
		for(IPSAppDataEntity iPSAppDataEntity : psAppDataEntityList) {
			this.registerAIChatCompletionMapping(iPSAppDataEntity, iSysServiceAPIRequestMappingAdapter);
		}
	}
	
	protected void registerAIChatCompletionMapping(IPSAppDataEntity iPSAppDataEntity, ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		
		
		java.util.List<IPSAppDEACMode> psAppDEACModeList = iPSAppDataEntity.getAllPSAppDEACModes();
		if(ObjectUtils.isEmpty(psAppDEACModeList)) {
			return;
		}
		else {
			boolean bAIChat = false;
			for(IPSAppDEACMode iPSAppDEACMode : psAppDEACModeList) {
				if(DEACType.CHATCOMPLETION.value.equals(iPSAppDEACMode.getACType())) {
					bAIChat = true;
					break;
				}
			}
			if(!bAIChat) {
				return;
			}
		}
		
		List<IPSAppDERS> psAppDERSList = this.getPSApplication().getAllPSAppDERSs();
		if(!ObjectUtils.isEmpty(psAppDERSList)) {
			for(IPSAppDERS iPSAppDERS : psAppDERSList) {
				if(!iPSAppDERS.getMinorPSAppDataEntityMust().getId().equals(iPSAppDataEntity.getId())) {
					continue;
				}
				
				String strPath = String.format("%1$s/aichat/%2$s/{pkey}/%3$s", this.getBaseUrl(), Inflector.getInstance().pluralize(iPSAppDERS.getMajorPSAppDataEntityMust().getCodeName()).toLowerCase(), Inflector.getInstance().pluralize(iPSAppDataEntity.getCodeName()).toLowerCase());

				// 支持多层父
				String strPath2 = String.format("%1$s/aichat/**/%2$s/{pkey}/%3$s", this.getBaseUrl(), Inflector.getInstance().pluralize(iPSAppDERS.getMajorPSAppDataEntityMust().getCodeName()).toLowerCase(), Inflector.getInstance().pluralize(iPSAppDataEntity.getCodeName()).toLowerCase());

				if (true) {
					String strRequestPath = strPath + "/ssechatcompletion";
					String strRequestPath2 = strPath + "/ssechatcompletion/{key}";
					String strRequestPath3 = strPath2 + "/ssechatcompletion";
					String strRequestPath4 = strPath2 + "/ssechatcompletion/{key}";
					
					RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

					iSysServiceAPIRequestMappingAdapter.registerMapping(this, requestMappingInfo, new MethodHandlerBase() {
						@Override
						protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
							
							String strACTag = null;
							
							// 从请求中构建参数对象
							String strQueryString = httpServletRequest.getQueryString();
							Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
							if (map != null) {
								strACTag = (String) map.get("srfactag");
							}
							
							return invokeAIChatCompletion(null, iPSAppDERS, pkey, iPSAppDataEntity, strACTag, IDEChatCompletionRuntime.METHOD_SSECHATCOMPLETION, requestData, key, null);
						}
					}, MethodHandlerBase.getExecuteMethod());
				}
				
				if (true) {
					String strRequestPath = strPath + "/ssechatcompletion/histories";
					String strRequestPath2 = strPath + "/chatcompletion/histories";
					String strRequestPath3 = strPath + "/ssechatcompletion/histories/{key}";
					String strRequestPath4 = strPath + "/chatcompletion/histories/{key}";
					
					String strRequestPath5 = strPath2 + "/ssechatcompletion/histories";
					String strRequestPath6 = strPath2 + "/chatcompletion/histories";
					String strRequestPath7 = strPath2 + "/ssechatcompletion/histories/{key}";
					String strRequestPath8 = strPath2 + "/chatcompletion/histories/{key}";
					
					
					RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4
							,strRequestPath5, strRequestPath6, strRequestPath7, strRequestPath8).methods(RequestMethod.POST).build();

					iSysServiceAPIRequestMappingAdapter.registerMapping(this, requestMappingInfo, new MethodHandlerBase() {
						@Override
						protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
							
							String strACTag = null;
							
							// 从请求中构建参数对象
							String strQueryString = httpServletRequest.getQueryString();
							Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
							if (map != null) {
								strACTag = (String) map.get("srfactag");
							}
							
							return invokeAIChatCompletion(null, iPSAppDERS, pkey, iPSAppDataEntity, strACTag, IDEChatCompletionRuntime.METHOD_HISTORIES, requestData, key, null);
						}
					}, MethodHandlerBase.getExecuteMethod());
				}
			}
		}
		
		
		
		String strPath = String.format("%1$s/aichat/%2$s", this.getBaseUrl(), Inflector.getInstance().pluralize(iPSAppDataEntity.getCodeName()).toLowerCase());
		
		
		if (true) {
			String strRequestPath = strPath + "/ssechatcompletion";
			String strRequestPath2 = strPath + "/ssechatcompletion/{key}";
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath, strRequestPath2).methods(RequestMethod.POST).build();

			iSysServiceAPIRequestMappingAdapter.registerMapping(this, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					return invokeAIChatCompletion(null, null, null, iPSAppDataEntity, strACTag, IDEChatCompletionRuntime.METHOD_SSECHATCOMPLETION, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
		if (true) {
			String strRequestPath = strPath + "/ssechatcompletion/histories";
			String strRequestPath2 = strPath + "/chatcompletion/histories";
			String strRequestPath3 = strPath + "/ssechatcompletion/histories/{key}";
			String strRequestPath4 = strPath + "/chatcompletion/histories/{key}";
			
			RequestMappingInfo requestMappingInfo = RequestMappingInfo.paths(strRequestPath, strRequestPath2, strRequestPath3, strRequestPath4).methods(RequestMethod.POST).build();

			iSysServiceAPIRequestMappingAdapter.registerMapping(this, requestMappingInfo, new MethodHandlerBase() {
				@Override
				protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable {
					
					String strACTag = null;
					
					// 从请求中构建参数对象
					String strQueryString = httpServletRequest.getQueryString();
					Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
					if (map != null) {
						strACTag = (String) map.get("srfactag");
					}
					
					return invokeAIChatCompletion(null, null, null, iPSAppDataEntity, strACTag, IDEChatCompletionRuntime.METHOD_HISTORIES, requestData, key, null);
				}
			}, MethodHandlerBase.getExecuteMethod());
		}
		
	}

	/**
	 * 实体交互补全操作
	 * @param strScope
	 * @param iPSAppDataEntity
	 * @param strACTag
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	protected Object invokeAIChatCompletion(String strScope, IPSAppDERS iPSAppDERS, String strParentKey, IPSAppDataEntity iPSAppDataEntity, String strACTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable{
		
		IDataEntityRuntime parentDataEntityRuntime = null;
		if(iPSAppDERS!=null) {
			parentDataEntityRuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(iPSAppDERS.getMajorPSAppDataEntityMust().getPSDataEntityMust().getId());
			
			IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();
			if (iAppContext == null) {
				iAppContext = new AppContext();
				UserContext.getCurrentMust().setAppContext(iAppContext);
			}
			iAppContext.set(iPSAppDERS.getMajorPSAppDataEntityMust().getName(), strParentKey);
		}
		
		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(iPSAppDataEntity.getPSDataEntityMust().getId());
		
		// 判断数据访问
		if(StringUtils.hasLength(strKey)) {
			if (!iDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), parentDataEntityRuntime, strParentKey, strKey, null, DataAccessActions.READ)) {
				throw new ApplicationRuntimeException(this, String.format("%1$s[%2$s]不具备操作能力[%3$s]", iDataEntityRuntime.getLogicName(), strKey, DataAccessActions.READ), Errors.ACCESSDENY);
			}
		}
		else {
			if (!iDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), parentDataEntityRuntime, strParentKey, null, null, DataAccessActions.CREATE)) {
				throw new ApplicationRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", iDataEntityRuntime.getLogicName(), DataAccessActions.CREATE), Errors.ACCESSDENY);
			}
		}
		
		
		IPSAppDEACMode iPSAppDEACMode = null;
		
		java.util.List<IPSAppDEACMode> psAppDEACModeList = iPSAppDataEntity.getAllPSAppDEACModes();
		if(!ObjectUtils.isEmpty(psAppDEACModeList)) {
			for(IPSAppDEACMode item : psAppDEACModeList) {
				if(strACTag.equalsIgnoreCase(item.getCodeName())) {
					iPSAppDEACMode = item;
					break;
				}
			}
		}
		
		if(iPSAppDEACMode == null) {
			throw new ApplicationRuntimeException(this, String.format("%1$s不具备交互补全[%2$s]", iDataEntityRuntime.getLogicName(), strACTag));
		}
		
		IAIChatAgent iAIChatAgent = this.getSysAIFactoryUtilRuntime().getAIChatAgent(iPSAppDEACMode);

//		
//		IAIChatCompletionRuntime iAIChatCompletionRuntime = this.aiChatCompletionRuntimeMap.get(strAIChatCompletionTag);
//		if(iAIChatCompletionRuntime == null) {
//			try {
//				iAIChatCompletionRuntime = this.createAIChatCompletionRuntime(iPSAppDataEntity, iDEChatCompletionRuntime);
//				if(iAIChatCompletionRuntime == null) {
//					throw new Exception("无法建立运行时对象");
//				}
//				
//				iAIChatCompletionRuntime.init(this, iPSAppDataEntity, iDEChatCompletionRuntime);
//				this.aiChatCompletionRuntimeMap.put(strAIChatCompletionTag, iAIChatCompletionRuntime);
//			}
//			catch (Exception ex) {
//				throw new Exception(String.format("建立AIChat运行时对象发生异常，%1$s", ex.getMessage()), ex);
//			}
//		}
//
		Object key = iDataEntityRuntime.convertValue(iDataEntityRuntime.getKeyPSDEField().getStdDataType(), strKey);

		// 判断行为模式，增强ChatCompletion
		if (IDEChatCompletionRuntime.METHOD_SSECHATCOMPLETION.equalsIgnoreCase(strMethodName)) {
			return iAIChatAgent.sseChatCompletion(key, JsonUtils.as(objBody, ChatCompletionRequest.class), null);
		}

		if (IDEChatCompletionRuntime.METHOD_CHATCOMPLETION.equalsIgnoreCase(strMethodName)) {
			return iAIChatAgent.chatCompletion(key, JsonUtils.as(objBody, ChatCompletionRequest.class), null);
		}

		if (IDEChatCompletionRuntime.METHOD_ASYNCCHATCOMPLETION.equalsIgnoreCase(strMethodName)) {
			return iAIChatAgent.asyncChatCompletion(key, JsonUtils.as(objBody, ChatCompletionRequest.class), null);
		}

		if (IDEChatCompletionRuntime.METHOD_HISTORIES.equalsIgnoreCase(strMethodName)) {
			return iAIChatAgent.getHistories(key, objBody, null);
		}

		throw new Exception(String.format("未识别的请求方法[%1$s]", strMethodName));
	}
	
	
}
