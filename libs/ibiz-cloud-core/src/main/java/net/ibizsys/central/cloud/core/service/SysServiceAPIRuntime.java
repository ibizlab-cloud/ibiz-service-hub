package net.ibizsys.central.cloud.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import io.jsonwebtoken.lang.Assert;
import net.ibizsys.central.cloud.core.dataentity.service.DEServiceAPIRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.ISystemAccessManager;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.dataentity.service.DEServiceAPIModes;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.SysServiceAPILevels;
import net.ibizsys.central.service.SysServiceAPIRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.domain.File;

/**
 * Cloud体系服务接口运行时对象
 * 
 * @author lionlau
 *
 */
public class SysServiceAPIRuntime extends net.ibizsys.central.service.SysServiceAPIRuntime implements ISysServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysServiceAPIRuntime.class);

	private int nAPILevel = SysServiceAPILevels.USER;
	private String strBaseUrl = null;
	private boolean bEnableAnonymousUser = false;
	private ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = null;

	@Override
	protected void onInit() throws Exception {

		setAPILevel(this.getPSSysServiceAPI().getAPILevel());
		if (this.getAPILevel() < SysServiceAPILevels.CORE || this.getAPILevel() > SysServiceAPILevels.APIUSER) {
			log.warn(String.format("无法识别的接口访问级别[%1$s]", this.getAPILevel()));
		}

		if (!StringUtils.hasLength(this.getBaseUrl())) {
			prepareBaseUrl();
		}

		if (this.getAPILevel() == SysServiceAPILevels.ANONYMOUSUSER || !ObjectUtils.isEmpty(this.getPSSysServiceAPI().getIgnoreAuthPatterns())) {
			this.setEnableAnonymousUser(true);
		}

		super.onInit();

		this.registerIgnoreAuthPatterns();
	}

	protected void registerIgnoreAuthPatterns() {
		String serviceUrl = this.getBaseUrl();
		if (!StringUtils.hasLength(serviceUrl)) {
			log.warn(String.format("服务接口[%1$s]基础路径无效"));
			return;
		}

		if (this.getAPILevel() == SysServiceAPILevels.ANONYMOUSUSER) {
			serviceUrl = serviceUrl + "/**";
			ServiceHub.getInstance().registerIgnoreAuthPattern(serviceUrl);
			log.debug(String.format("忽略认证路径[%s]", serviceUrl));
		} else {
			List<String> list = this.getPSSysServiceAPI().getIgnoreAuthPatterns();
			if (!ObjectUtils.isEmpty(list)) {
				for (String strPattern : list) {
					String strFullPattern = serviceUrl + strPattern;
					ServiceHub.getInstance().registerIgnoreAuthPattern(strFullPattern);
					log.debug(String.format("忽略认证路径[%s]", strFullPattern));
				}
			}
		}
	}

	@Override
	protected IDEServiceAPIRuntime createDefaultDEServiceAPIRuntime() {
		return new DEServiceAPIRuntime();
	}

	@Override
	public int getAPILevel() {
		return this.nAPILevel;
	}

	protected void setAPILevel(int nAPILevel) {
		this.nAPILevel = nAPILevel;
	}

	protected void prepareBaseUrl() throws Exception {
		this.setBaseUrl(String.format("/%1$s/%2$s", this.getSystemRuntime().getServiceId(), this.getPSSysServiceAPI().getServiceCodeName()).toLowerCase());
	}

	@Override
	public void registerMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		Assert.notNull(iSysServiceAPIRequestMappingAdapter, "未传入服务接口请求映射适配器");
		this.onRegisterMapping(iSysServiceAPIRequestMappingAdapter);
		this.setSysServiceAPIRequestMappingAdapter(iSysServiceAPIRequestMappingAdapter);
	}

	protected void onRegisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		iSysServiceAPIRequestMappingAdapter.registerMapping(this);
	}

	@Override
	public void unregisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		Assert.notNull(iSysServiceAPIRequestMappingAdapter, "未传入服务接口请求映射适配器");
		this.onUnregisterMapping(iSysServiceAPIRequestMappingAdapter);
		this.setSysServiceAPIRequestMappingAdapter(null);
	}

	protected void onUnregisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception {
		iSysServiceAPIRequestMappingAdapter.unregisterMapping(this);
	}
	
	protected ISysServiceAPIRequestMappingAdapter getSysServiceAPIRequestMappingAdapter(boolean bTryMode) throws Exception {
		if(this.iSysServiceAPIRequestMappingAdapter != null || bTryMode) {
			return this.iSysServiceAPIRequestMappingAdapter;
		}
		throw new Exception("服务接口请求映射适配器无效");
	}
	
	protected void setSysServiceAPIRequestMappingAdapter(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) {
		this.iSysServiceAPIRequestMappingAdapter = iSysServiceAPIRequestMappingAdapter;
	}

	@Override
	public Object invokeDEMethod(String strScope, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			return super.invokeDEMethod(strScope, strDataEntityName, strMethodName, objBody, strKey, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEMethod(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			
			return super.invokeDEMethod(strScope, strParentDEName, strParentKey, strDataEntityName, strMethodName, objBody, strKey, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEImportData(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEImportData2(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEAsyncImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEAsyncImportData(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}

	}

	@Override
	public Object invokeDEAsyncImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEAsyncImportData2(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEGetImportTemplate(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEGetImportTemplate(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}

	}

	@Override
	public Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEAsyncExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEAsyncExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEPrintData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEPrintData(strScope, strParentDEName, strParentKey, strDataEntityName, strPrintTag, strPrintType, objBody, strKey, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	
	@Override
	public Object invokeDEReport(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strReportTag, String strReportType, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEReport(strScope, strParentDEName, strParentKey, strDataEntityName, strReportTag, strReportType, objBody, objTag);
		}
		finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	
	@Override
	public Object invokeDEWFStart(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			return super.invokeDEWFStart(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEWFCancel(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEWFCancel(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEDownloadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEDownloadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEUploadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, File file, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEUploadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEAutoComplete(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strACTag, String strMethodName, Object objBody, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			return super.invokeDEAutoComplete(strScope, strParentDEName, strParentKey, strDataEntityName, strACTag, strMethodName, objBody, objTag);
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEChatCompletion(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strACTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable {

		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			
			IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
			if (StringUtils.hasLength(strParentDEName)) {
				iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s", strParentDEName, strDataEntityName).toUpperCase(), false);
				// 重写实体名称
				String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
				if (!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
					log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
					strDataEntityName = strMinorDEServiceAPIName;
				}
			}

			IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
			if (iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
			}
			// IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
			// if(StringUtils.hasLength(strParentDEName)) {
			// iDEServiceAPIRSRuntime =
			// this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s",strParentDEName,
			// iDEServiceAPIRuntime.getName()).toUpperCase(), false);
			// }

			if (iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
			}

			if (iDEServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) {
				return ((net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) iDEServiceAPIRuntime).chatCompletion(strScope, iDEServiceAPIRSRuntime, strParentKey, strACTag, strMethodName, objBody, strKey, objTag);
			}

			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]类型不正确", iDEServiceAPIRuntime.getName()));
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEAsyncImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			
			IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
			if (StringUtils.hasLength(strParentDEName)) {
				iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s", strParentDEName, strDataEntityName).toUpperCase(), false);
				// 重写实体名称
				String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
				if (!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
					log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
					strDataEntityName = strMinorDEServiceAPIName;
				}
			}

			IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
			if (iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
			}

			if (iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
			}

			if (iDEServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) {
				return ((net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) iDEServiceAPIRuntime).asyncImportData(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, strOSSFileId, strImportSchemaId, objTag);
			}

			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]类型不正确", iDEServiceAPIRuntime.getName()));
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	@Override
	public Object invokeDEAsyncImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			
			IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
			if (StringUtils.hasLength(strParentDEName)) {
				iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s", strParentDEName, strDataEntityName).toUpperCase(), false);
				// 重写实体名称
				String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
				if (!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
					log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
					strDataEntityName = strMinorDEServiceAPIName;
				}
			}

			IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
			if (iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
			}

			if (iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
			}

			if (iDEServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) {
				return ((net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) iDEServiceAPIRuntime).asyncImportData2(strScope, iDEServiceAPIRSRuntime, strParentKey, strImportTag, strOSSFileId, strImportSchemaId, objTag);
			}

			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]类型不正确", iDEServiceAPIRuntime.getName()));
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	
	@Override
	public Object invokeDECreateDownloadTicket(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, String strOSSFileId, Object objTag) throws Throwable {
		IUserContext lastUserContext = this.prepareAccessUser();
		try {
			testAccessUser();
			if(StringUtils.hasLength(strParentDEName)) {
				prepareAppContext(strParentDEName);
			}
			
			IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime = null;
			if (StringUtils.hasLength(strParentDEName)) {
				iDEServiceAPIRSRuntime = this.getDEServiceAPIRSRuntime(String.format("%1$s|%2$s", strParentDEName, strDataEntityName).toUpperCase(), false);
				// 重写实体名称
				String strMinorDEServiceAPIName = iDEServiceAPIRSRuntime.getMinorDEServiceAPIRuntime().getName();
				if (!strMinorDEServiceAPIName.equalsIgnoreCase(strDataEntityName)) {
					log.debug(String.format("实体服务接口标识调整[%1$s] => [%2$s]", strDataEntityName, strMinorDEServiceAPIName));
					strDataEntityName = strMinorDEServiceAPIName;
				}
			}

			IDEServiceAPIRuntime iDEServiceAPIRuntime = (IDEServiceAPIRuntime) this.getDEServiceAPIRuntime(strDataEntityName, false);
			if (iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.NESTED) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[嵌套成员]不对外提供服务", iDEServiceAPIRuntime.getName()));
			}

			if (iDEServiceAPIRSRuntime == null && iDEServiceAPIRuntime.getAPIMode() == DEServiceAPIModes.MINOR) {
				throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]模式为[从接口]必须同时指定主接口", iDEServiceAPIRuntime.getName()));
			}

			if (iDEServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) {
				return ((net.ibizsys.central.cloud.core.dataentity.service.IDEServiceAPIRuntime) iDEServiceAPIRuntime).createDownloadTicket(strScope, iDEServiceAPIRSRuntime, strParentKey, strKey, strStorageField, strOSSFileId, objTag);
			}

			throw new SysServiceAPIRuntimeException(this, String.format("实体服务接口[%1$s]类型不正确", iDEServiceAPIRuntime.getName()));
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}

	protected IUserContext prepareAccessUser() throws Throwable {
		IUserContext iUserContext = UserContext.getCurrent();
		if(this.isEnableAnonymousUser()) {
			RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
			if (requestAttributes != null) {
				Object pattern = requestAttributes.getAttribute(ISysUAAUtilRuntime.ATTRIBUTE_IGNOREAUTHPATTERN, RequestAttributes.SCOPE_REQUEST);
				if (pattern != null) {
					//return null;
					UserContext.setCurrent(this.getSystemRuntime().createAnonymousUserContext());
					return UserContext.getCurrent();
				}
			}
		}
		else 
			if(this.getAPILevel() == SysServiceAPILevels.CURSYSTEMUSER && iUserContext instanceof IEmployeeContext) {
				IEmployeeContext iEmployeeContext = (IEmployeeContext)iUserContext;
				if(!this.getSystemRuntime().getDeploySystemId().equalsIgnoreCase(iEmployeeContext.getSystemid())) {
					if(this.getSystemRuntime().getSystemAccessManager() instanceof ISystemAccessManager) {
						return ((ISystemAccessManager)this.getSystemRuntime().getSystemAccessManager()).getCurrentSystemEmployeeContext(iEmployeeContext, true);
					}
				}
			}
		return iUserContext;
	}

	/**
	 * 判断访问用户
	 * 
	 * @throws Throwable
	 */
	protected void testAccessUser() throws Throwable {

		if (this.getAPILevel() == SysServiceAPILevels.CORE) {
			if ((DataTypeUtils.getIntegerValue(AuthenticationUser.getCurrentMust().getSuperuser(), 0) == 1) || (DataTypeUtils.getIntegerValue(AuthenticationUser.getCurrentMust().getApiuser(), 0) == 1)) {
				return;
			}
			throw new SysServiceAPIRuntimeException(this, String.format("仅允许核心用户访问"), Errors.ACCESSDENY);
		}

		if (this.getAPILevel() == SysServiceAPILevels.CLOUDADMIN) {
			if (AuthenticationUser.getCurrentMust().getSuperuser() != 1) {
				throw new SysServiceAPIRuntimeException(this, String.format("仅允许平台管理员访问"), Errors.ACCESSDENY);
			}
			return;
		}
		
		if (this.getAPILevel() == SysServiceAPILevels.APIUSER) {
			if (AuthenticationUser.getCurrentMust().getApiuser() != 1) {
				throw new SysServiceAPIRuntimeException(this, String.format("仅允许接口用户访问"), Errors.ACCESSDENY);
			}
			return;
		}

		if (this.getAPILevel() == SysServiceAPILevels.DCADMIN) {
			if (!EmployeeContext.getCurrentMust().isSuperuser()) {
				throw new SysServiceAPIRuntimeException(this, String.format("仅允许机构管理员访问"), Errors.ACCESSDENY);
			}
			return;
		}

		
		if (this.getAPILevel() == SysServiceAPILevels.ANONYMOUSUSER) {
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
			if (iEmployeeContext != null && !iEmployeeContext.isAnonymoususer()) {
				throw new SysServiceAPIRuntimeException(this, String.format("仅允许匿名用户访问"), Errors.ACCESSDENY);
			}
			return;
		}
		

		if (this.getAPILevel() == SysServiceAPILevels.CURSYSTEMUSER) {
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
			if(!this.getSystemRuntime().getDeploySystemId().equalsIgnoreCase(iEmployeeContext.getSystemid())) {
				throw new SysServiceAPIRuntimeException(this, String.format("仅允许当前系统用户访问"), Errors.ACCESSDENY);
			}
			return;
		}

		// throw new SysServiceAPIRuntimeException(this,
		// String.format("无法识别的接口级别[%1$s]", this.getAPILevel()),
		// Errors.ACCESSDENY);
	}

	@Override
	public String getBaseUrl() {
		return this.strBaseUrl;
	}

	protected void setBaseUrl(String strBaseUrl) {
		this.strBaseUrl = strBaseUrl;
	}

	@Override
	public boolean isEnableAnonymousUser() {
		return this.bEnableAnonymousUser;
	}

	protected void setEnableAnonymousUser(boolean bEnableAnonymousUser) {
		this.bEnableAnonymousUser = bEnableAnonymousUser;
	}
	
	protected void prepareAppContext(String strLastParentDEName) throws Exception {
		
		if(!StringUtils.hasLength(strLastParentDEName)) {
			return;
		}
		
		ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = this.getSysServiceAPIRequestMappingAdapter(true);
		if(iSysServiceAPIRequestMappingAdapter == null) {
			return;
		}
		
		String strUrl = null;
		
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes instanceof ServletRequestAttributes) {
			strUrl = ((ServletRequestAttributes) requestAttributes).getRequest().getRequestURI();
		}
		
		if(!StringUtils.hasLength(strUrl)) {
			return;
		}
		
		Map<String, String> context = iSysServiceAPIRequestMappingAdapter.getAppContext(this, strUrl, strLastParentDEName);
		if(ObjectUtils.isEmpty(context)) {
			return;
		}
		
		IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();
		if (iAppContext == null) {
			iAppContext = new AppContext();
			UserContext.getCurrentMust().setAppContext(iAppContext);
		}
		
		for(java.util.Map.Entry<String, String> entry : context.entrySet()) {
			iAppContext.set(entry.getKey(), entry.getValue());
		}
	}

}
