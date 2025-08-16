package net.ibizsys.central.cloud.core.dataentity.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.dataentity.ac.IDEChatCompletionRuntime;
import net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.central.dataentity.service.DEServiceAPIRuntimeException;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.util.IDEVersionControlUtilRuntime;
import net.ibizsys.central.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.File;

public class DEServiceAPIRuntime extends net.ibizsys.central.dataentity.service.DEServiceAPIRuntime implements IDEServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEServiceAPIRuntime.class);

	public final static String HEADER_DATAACCACTION = "srfdataaccaction";
	public final static String HEADER_EXTENSIONSESSIONID = "srfextensionsessionid";
	
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ICloudExtensionClient iCloudExtensionClient = null;
	
	private boolean bEnableExtensionSessionId = false;
	private String strExtensionSessionIdHeader = null;
	
	@Override
	protected void onInit() throws Exception {
		if(this.getDataEntityRuntime() instanceof net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime) {
			this.bEnableExtensionSessionId = ((net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime)this.getDataEntityRuntime()).isEnableExtension();
			if(this.bEnableExtensionSessionId) {
				this.strExtensionSessionIdHeader = String.format("%1$s-%2$s-%3$s", HEADER_EXTENSIONSESSIONID, this.getSysServiceAPIRuntime().getPSSysServiceAPI().getCodeName(), this.getPSDEServiceAPI().getCodeName());
			}
		}
		super.onInit();
	}
	
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if(this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
	
	protected ICloudExtensionClient getCloudExtensionClient() {
		if (this.iCloudExtensionClient == null) {
			this.iCloudExtensionClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_EXTENSION, ICloudExtensionClient.class, true);
		}
		return this.iCloudExtensionClient;
	}
	
	@Override
	public Object chatCompletion(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strACTag, String strMethod, Object objBody, String strKey, Object objTag) throws Throwable {
		testAccessUser();
		try {
			if (ObjectUtils.isEmpty(strKey)) {
				throw new Exception("没有指定输入参数");
			}
			
			return this.onChatCompletion(strScope, iDEServiceAPIRSRuntime, strParentKey, strACTag, strMethod, objBody, strKey, objTag);
		} catch (Throwable ex) {
			if (ex instanceof DEServiceAPIRuntimeException) {
				throw (DEServiceAPIRuntimeException) ex;
			}

			throw new DEServiceAPIRuntimeException(this, String.format("交谈补全发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onChatCompletion(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strACTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		

		IDEChatCompletionRuntime iDEChatCompletionRuntime = (IDEChatCompletionRuntime) this.getDataEntityRuntime().getDEAutoCompleteRuntime(strACTag, false);

		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, strKey, null, DataAccessActions.READ)) {

			// if
			// (!StringUtils.hasLength(iDEPrintRuntime.getPSDEPrint().getDataAccessAction()))
			// {
			// throw new DEServiceAPIRuntimeException(this,
			// String.format("聊天补全[%1$s]未定义访问操作标识",
			// iDEPrintRuntime.getPSDEPrint().getName()), Errors.ACCESSDENY);
			// }

			throw new DEServiceAPIRuntimeException(this, String.format("%1$s[%2$s]不具备操作能力[%3$s]", this.getLogicName(), strKey, DataAccessActions.READ), Errors.ACCESSDENY);

		}
		

		Object key = this.getDataEntityRuntime().convertValue(this.getDataEntityRuntime().getKeyPSDEField().getStdDataType(), strKey);

		// 判断行为模式，增强ChatCompletion
		if (IDEChatCompletionRuntime.METHOD_SSECHATCOMPLETION.equalsIgnoreCase(strMethodName)) {
			return iDEChatCompletionRuntime.sseChatCompletion(key, JsonUtils.as(objBody, ChatCompletionRequest.class));
		}

		if (IDEChatCompletionRuntime.METHOD_CHATCOMPLETION.equalsIgnoreCase(strMethodName)) {
			return iDEChatCompletionRuntime.chatCompletion(key, JsonUtils.as(objBody, ChatCompletionRequest.class));
		}

		if (IDEChatCompletionRuntime.METHOD_ASYNCCHATCOMPLETION.equalsIgnoreCase(strMethodName)) {
			return iDEChatCompletionRuntime.asyncChatCompletion(key, JsonUtils.as(objBody, ChatCompletionRequest.class));
		}

		if (IDEChatCompletionRuntime.METHOD_HISTORIES.equalsIgnoreCase(strMethodName)) {
			return iDEChatCompletionRuntime.getHistories(key, objBody, null);
		}

		if (IDEChatCompletionRuntime.METHOD_RESOURCES.equalsIgnoreCase(strMethodName)) {
			return iDEChatCompletionRuntime.getResource(key, (Map)objBody);
		}
		
		if (IDEChatCompletionRuntime.METHOD_CHATSUGGESTION.equalsIgnoreCase(strMethodName)) {
			return iDEChatCompletionRuntime.chatSuggestion(key, JsonUtils.as(objBody, ChatCompletionRequest.class));
		}
		
		throw new Exception(String.format("未识别的请求方法[%1$s]", strMethodName));
	}

	@Override
	public Object importData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable {
		testAccessUser();
		return null;
	}

	@Override
	public Object importData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable {
		testAccessUser();
		return null;
	}

	@Override
	public Object asyncImportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable {
		testAccessUser();
		return null;
	}

	@Override
	public Object asyncImportData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable {
		testAccessUser();
		try {
			return this.onAsyncImportData2(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, strOSSFileId, strImportSchemaId, objTag);
		} catch (Throwable ex) {
			if (ex instanceof DEServiceAPIRuntimeException) {
				throw (DEServiceAPIRuntimeException) ex;
			}

			throw new DEServiceAPIRuntimeException(this, String.format("异步导入数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onAsyncImportData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable {
		
		if(!(this.getDataEntityRuntime() instanceof net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime)) {
			throw new Exception("实体运行时对象类型不正确");
		}
		
		net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime realDataEntityRuntime = (net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime)this.getDataEntityRuntime();
		
		// 判断数据访问
		if (!this.getDataEntityRuntime().getDataEntityAccessManager().testDataAccessAction(UserContext.getCurrent(), ((iDEServiceAPIRSRuntime == null) ? null : iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime()), strParentKey, null, null, DataAccessActions.CREATE)) {
			throw new DEServiceAPIRuntimeException(this, String.format("%1$s不具备操作能力[%2$s]", this.getLogicName(), DataAccessActions.CREATE), Errors.ACCESSDENY);
		}

		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		
		Object objValue = null;
		if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
			IPSDEField parentIdPSDEField = iDEServiceAPIRSRuntime.getPSDEServiceAPIRS().getParentIdPSDEField();
			if (parentIdPSDEField != null) {
				objValue = this.getSystemRuntime().convertValue(parentIdPSDEField.getStdDataType(), strParentKey);
				iEntityDTO.set(parentIdPSDEField.getLowerCaseName(), objValue);
			} else {
				throw new DEServiceAPIRuntimeException(this, "解析导入Excel发生异常：缺少关系属性");
			}
		}
		
		V2ImportSchema v2ImportSchema2 = null;
		if(StringUtils.hasLength(strImportSchemaId)) {
			try {
				v2ImportSchema2 = getImportSchema(strImportSchemaId);
			} catch (Exception ex) {
				throw new DEServiceAPIRuntimeException(this, String.format("获取导入体系发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		

		InputStream inputStream2 = null;
		try {
			inputStream2 = getImportDataInputStream(strOSSFileId, iEntityDTO);
		} catch (Exception ex) {
			throw new DEServiceAPIRuntimeException(this, String.format("获取输入流发生异常，%1$s", ex.getMessage()), ex);
		}
		
		String strValue = (objValue == null) ? null : String.valueOf(objValue);

		Map<String, Object> actionTagMap = new HashMap<String, Object>();
		actionTagMap.put("actiontype", "DEIMPORTDATA2");
		actionTagMap.put("actionparam", getDataEntityRuntime().getName());
		actionTagMap.put("actionparam2", strImportTag);

		InputStream inputStream = inputStream2;
		V2ImportSchema v2ImportSchema = v2ImportSchema2;
		return this.getSystemRuntime().asyncExecute(new INamedAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if (iDEServiceAPIRSRuntime != null && StringUtils.hasLength(strParentKey)) {
					return realDataEntityRuntime.importData2(strImportTag, iEntityDTO, inputStream, v2ImportSchema, true, (net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime) iDEServiceAPIRSRuntime.getMajorDEServiceAPIRuntime().getDataEntityRuntime(), strValue);
				} else {
					return realDataEntityRuntime.importData2(strImportTag, iEntityDTO, inputStream, v2ImportSchema, true, null, null);
				}
			}

			@Override
			public String getName() {
				if(StringUtils.hasLength(strImportTag)) {
					return String.format("[%1$s]数据导入作业[%2$s]", getDataEntityRuntime().getLogicName(), strImportTag);
				}
				else {
					return String.format("[%1$s]数据导入作业", getDataEntityRuntime().getLogicName());
				}
				
			}
		}, null, actionTagMap);
	}

	@Override
	protected InputStream getImportDataInputStream(Object objBody, IEntityDTO iEntityDTO) throws Exception {
		if (objBody instanceof String) {
			// 尝试从Cloud下载文件
			String strFileId = (String) objBody;

			ISysOSSUtilRuntime iSysOSSUtilRuntime = (ISysOSSUtilRuntime) this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class, false);

			File file = iSysOSSUtilRuntime.getOSSFile(strFileId, ISysFileUtilRuntime.FILECAT_TEMP, true);
//			if( file == null) {
//				file = iSysOSSUtilRuntime.getOSSFile(strFileId, null, true);
//			}
			if (file == null) {
				throw new Exception(String.format("无法下载指定OSS文件[%1$s]", strFileId));
			}

			if (iEntityDTO != null && !ObjectUtils.isEmpty(file.getFileName())) {
				iEntityDTO.set(IDEDataImportRuntime.FIELD_IMPORTFILENAME, file.getFileName());
			}

			return new FileInputStream(new java.io.File(file.getLocalPath()));
		}
		return super.getImportDataInputStream(objBody, iEntityDTO);
	}
	
	protected  V2ImportSchema getImportSchema(String strImportSchemaId) throws Exception {
		return getCloudExtensionClient().getImportSchema(strImportSchemaId);
	}
	
	
	@Override
	protected Object onFetchDataSet(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, Object objBody, String strKey, Object objTag) throws Throwable {
		Object ret = super.onFetchDataSet(strScope, iDEServiceAPIRSRuntime, strParentKey, iPSDEServiceAPIMethod, objBody, strKey, objTag);
		
		if(this.isEnableExtensionSessionId()) {
			this.addExtensionSessionIdHeader();
		}
		
		if(ret == null || !(ret instanceof Page) || EmployeeContext.getCurrent() == null) {
			return ret;
		}
	
		Page page = (Page)ret;
		if(ObjectUtils.isEmpty(page.getContent())) {
			return ret;
		}
		
		if(!(page.getContent().get(0) instanceof IEntityDTO)) {
			return ret;
		}
		
		String strVersionId = null;
		if(this.getDataEntityRuntime().isEnableVersionControl()
				|| this.getDataEntityRuntime().isEnableVersionStorage()) {
			IWebContext iWebContext = UserContext.getCurrentMust().getWebContext();
			if(iWebContext!=null) {
				strVersionId = iWebContext.getParameter(IDEVersionControlUtilRuntime.ACTION_ARG_VERSIONID);
			}
		}
		if(ObjectUtils.isEmpty(strVersionId)) {
			String strRequestDataAccessAction = this.getRequestDataAccessAction();
			if(StringUtils.hasLength(strRequestDataAccessAction)) {
				if("false".equalsIgnoreCase(strRequestDataAccessAction)) {
					return ret;
				}
				if("true".equalsIgnoreCase(strRequestDataAccessAction)) {
					strRequestDataAccessAction = "";
				}
				
				IDataEntityAccessManager iDataEntityAccessManager = (IDataEntityAccessManager)this.getDataEntityRuntime().getDataEntityAccessManager();
				iDataEntityAccessManager.fillDataAccessActions(EmployeeContext.getCurrent(), page.getContent(), strRequestDataAccessAction, null);
			}
		}
		
		return ret;
	}
	
	@Override
	protected Object onExecuteAction(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, Object objBody, String strKey, Object objTag) throws Throwable {
		Object ret = super.onExecuteAction(strScope, iDEServiceAPIRSRuntime, strParentKey, iPSDEServiceAPIMethod, objBody, strKey, objTag);
		
		if(this.isEnableExtensionSessionId()) {
			this.addExtensionSessionIdHeader();
		}
		
		if(ret == null || !(ret instanceof IEntityDTO) || EmployeeContext.getCurrent() == null) {
			return ret;
		}
		
		String strVersionId = null;
		if(this.getDataEntityRuntime().isEnableVersionControl()
				|| this.getDataEntityRuntime().isEnableVersionStorage()) {
			IWebContext iWebContext = UserContext.getCurrentMust().getWebContext();
			if(iWebContext!=null) {
				strVersionId = iWebContext.getParameter(IDEVersionControlUtilRuntime.ACTION_ARG_VERSIONID);
			}
		}
		if(ObjectUtils.isEmpty(strVersionId)) {
			String strRequestDataAccessAction = this.getRequestDataAccessAction();
			if(StringUtils.hasLength(strRequestDataAccessAction)) {
				if("false".equalsIgnoreCase(strRequestDataAccessAction)) {
					return ret;
				}
				if("true".equalsIgnoreCase(strRequestDataAccessAction)) {
					strRequestDataAccessAction = "";
				}
				
				IDataEntityAccessManager iDataEntityAccessManager = (IDataEntityAccessManager)this.getDataEntityRuntime().getDataEntityAccessManager();
				iDataEntityAccessManager.fillDataAccessActions(EmployeeContext.getCurrent(), Arrays.asList((IEntityDTO)ret), strRequestDataAccessAction, null);
			}
		}
		
		return ret;
	}
	
	/**
	 * 获取请求的数据访问操作标识
	 * @return
	 */
	protected String getRequestDataAccessAction() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes instanceof ServletRequestAttributes) {
			HttpServletRequest httpServletRequest = ((ServletRequestAttributes) requestAttributes).getRequest();
			return httpServletRequest.getHeader(HEADER_DATAACCACTION);
		}
		
		return null;
	}
	
	protected boolean isEnableExtensionSessionId() {
		return this.bEnableExtensionSessionId;
	}
	
	protected String getExtensionSessionIdHeader() {
		return this.strExtensionSessionIdHeader;
	}
	
	protected void addExtensionSessionIdHeader() {
		ActionSessionManager.getResponseHeadersIf().add(getExtensionSessionIdHeader(), ((net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime)this.getDataEntityRuntime()).getExtensionSessionId());
	}
}
