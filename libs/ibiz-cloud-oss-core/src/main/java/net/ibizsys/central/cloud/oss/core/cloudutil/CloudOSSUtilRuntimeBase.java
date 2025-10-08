package net.ibizsys.central.cloud.oss.core.cloudutil;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOSSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.oss.core.addin.ICloudOSSUtilRTAddin;
import net.ibizsys.central.cloud.oss.core.addin.IOSSPreviewProvider;
import net.ibizsys.central.cloud.oss.core.addin.IOSSTextProvider;
import net.ibizsys.central.util.SimpleSearchContextDTO;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

public abstract class CloudOSSUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudOSSUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudOSSUtilRuntimeBase.class);
	
	static {
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudOSSUtilRTAddin.class, "OSSPREVIEW:XLSX", "net.ibizsys.central.cloud.oss.poi.addin.XlsxPOIOSSPreviewProvider");
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudOSSUtilRTAddin.class, "OSSPREVIEW:XLS", "net.ibizsys.central.cloud.oss.poi.addin.XlsxPOIOSSPreviewProvider");
		
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudOSSUtilRTAddin.class, "OSSTEXT:PDF", "net.ibizsys.central.cloud.oss.poi.addin.PdfPOIOSSTextProvider");
	}

	private Map<String, IOSSPreviewProvider> ossPreviewProviderMap = null;
	private Map<String, IOSSTextProvider> ossTextProviderMap = null;
	
	private String strCloudOSSUtilRuntimeUniqueTag = null;
	
	private ISysBDSchemeRuntime iSysBDSchemeRuntime = null;
	
	@Override
	protected ICloudOSSUtilRuntimeContext createModelRuntimeContext() {
		return new CloudOSSUtilRuntimeContextBase<ICloudOSSUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	
	@Override
	public String getLogicName() {
		return String.format("Cloud体系OSS功能组件[%1$s]", this.getName());
	}
	
	@Override
	protected String getGlobalConfigId() {
		return CLOUDOSSUTIL_CONFIGFOLDER;
	}
	
	
	@Override
	protected String getCloudConfigId() {
		return CLOUDCONFIGID_OSS;
	}
	
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (this.getSysBDSchemeRuntime(true) == null) {
			this.prepareSysBDSchemeRuntime();

			if (this.getSysBDSchemeRuntime(true) == null) {
				this.getSystemRuntime().logEvent(LogLevels.WARN, this.getLogCat(), String.format("大数据体系对象无效，无法进行对象数据存储操作"), null);
			}
		}
	}
	
	@Override
	protected void onInstall() throws Exception {

		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudOSSUtilRTAddin.class, null);
		super.onInstall();

		this.strCloudOSSUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudOSSUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_OSS);
		this.ossPreviewProviderMap = this.getAddins(IOSSPreviewProvider.class, ADDIN_OSSPREVIEW_PREFIX);
		this.ossTextProviderMap = this.getAddins(IOSSTextProvider.class, ADDIN_OSSTEXT_PREFIX);
	}

	private CloudOSSUtilRuntimeBase getSelf() {
		return this;
	}

	@Override
	protected ICloudOSSUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudOSSUtilRuntimeContext)super.getModelRuntimeContext();
	}

	protected ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		return this.getSysBDSchemeRuntime(false);
	}

	protected ISysBDSchemeRuntime getSysBDSchemeRuntime(boolean bTryMode) {
		if (this.iSysBDSchemeRuntime != null || bTryMode) {
			return this.iSysBDSchemeRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定大数据体系对象");
	}

	protected void setSysBDSchemeRuntime(ISysBDSchemeRuntime iSysBDSchemeRuntime) {
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}

	protected void prepareSysBDSchemeRuntime() throws Exception {

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder() + ".sysbdscheme", null);
		if (ObjectUtils.isEmpty(params)) {
			return;
		}
		
		String strBDType = (String)params.get("bdtype");
		if (!StringUtils.hasLength(strBDType)) {
			throw new Exception("未指定大数据体系类型");
		}

		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSystemRuntime().getRuntimeObject(ISysBDSchemeRuntime.class, strBDType);
		if (iSysBDSchemeRuntime == null) {
			throw new Exception(String.format("无法建立指定类型[%1$s]大数据体系运行时", strBDType));
		}
		
		params.put("name", "CloudOSS大数据体系");
		params.put("codename", "cloudossbdscheme");
		
		IPSSysBDScheme iPSSysBDScheme = SysBDSchemeRuntime.getPSSysBDScheme(this.getSystemRuntimeContext(), params);
		iSysBDSchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysBDScheme);
		this.setSysBDSchemeRuntime(iSysBDSchemeRuntime);

	}
	
	protected ISysBDSchemeRuntime getSysBDSchemeRuntime(String strDBName) {
		return this.getSysBDSchemeRuntime();
	}
	
	@Override
	public String createObject(String strDBName, String strTableName, Map<String, Object> data) {
		return (String) this.executeAction("建立数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateObject(strDBName, strTableName, data);
			}
		}, null);
	}
	
	protected String onCreateObject(String strDBName, String strTableName, Map<String, Object> data) throws Throwable{
		try {
			SysBDSchemeRuntime.setCurrentDBName(strDBName);
			return (String)this.getSysBDSchemeRuntime(strDBName).insert(strTableName, data, null);
		}
		catch (Throwable ex) {
			throw ex;
		}
		finally {
			SysBDSchemeRuntime.setCurrentDBName(null);
		}
	}
	
	@Override
	public int updateObject(String strDBName, String strTableName, String key, Map<String, Object> data, boolean bAppend) {
		return (Integer) this.executeAction("更新数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onUpdateObject(strDBName, strTableName, key, data, bAppend);
			}
		}, null);
	}
	
	protected int onUpdateObject(String strDBName, String strTableName, String key, Map<String, Object> data, boolean bAppend) throws Throwable{
		try {
			SysBDSchemeRuntime.setCurrentDBName(strDBName);
			data.put(OBJECT_UNIQUEKEY, key);
			return (int)this.getSysBDSchemeRuntime(strDBName).update(strTableName, data, null, bAppend);
		}
		catch (Throwable ex) {
			throw ex;
		}
		finally {
			SysBDSchemeRuntime.setCurrentDBName(null);
		}
	}
	
	@Override
	public int deleteObject(String strDBName, String strTableName, String key) {
		return (Integer) this.executeAction("删除数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onDeleteObject(strDBName, strTableName, key);
			}
		}, null);
	}
	
	protected int onDeleteObject(String strDBName, String strTableName, String key) throws Throwable{
		try {
			SysBDSchemeRuntime.setCurrentDBName(strDBName);
			Map<String, Object> data = new LinkedHashMap<String, Object>();
			data.put(OBJECT_UNIQUEKEY, key);
			return (int)this.getSysBDSchemeRuntime(strDBName).delete(strTableName, data, null);
		}
		catch (Throwable ex) {
			throw ex;
		}
		finally {
			SysBDSchemeRuntime.setCurrentDBName(null);
		}
	}
	
	@Override
	public Page fetchObjects(String strDBName, String strTableName, Map<String, Object> data) {
		return (Page) this.executeAction("获取数据集合", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchObjects(strDBName, strTableName, data);
			}
		}, null);
	}
	
	protected Page onFetchObjects(String strDBName, String strTableName, Map<String, Object> data) throws Throwable{
		try {
			SysBDSchemeRuntime.setCurrentDBName(strDBName);
			Object fieldsObject = data.get("fields");
			String[] fields = null;
			if(fieldsObject instanceof List) {
				List<String> list = (List)fieldsObject;
				fields = list.toArray(new String[list.size()]);
			}
			return this.getSysBDSchemeRuntime(strDBName).fetch(strTableName, new SimpleSearchContextDTO(data), fields, null);
		}
		catch (Throwable ex) {
			throw ex;
		}
		finally {
			SysBDSchemeRuntime.setCurrentDBName(null);
		}
	}
	
	
	@Override
	public Map getObject(String strDBName, String strTableName, String key) {
		return (Map) this.executeAction("获取数据", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetObject(strDBName, strTableName, key);
			}
		}, null);
	}
	
	protected Map onGetObject(String strDBName, String strTableName, String key) throws Throwable{
		try {
			SysBDSchemeRuntime.setCurrentDBName(strDBName);
			SimpleSearchContextDTO simpleSearchContextDTO = new SimpleSearchContextDTO();
			simpleSearchContextDTO.setCount(false);
			simpleSearchContextDTO.eq(OBJECT_UNIQUEKEY, key);
			Page page = this.getSysBDSchemeRuntime(strDBName).fetch(strTableName, simpleSearchContextDTO, null, null);
			if(page == null || ObjectUtils.isEmpty(page.getContent())) {
				throw new ErrorException("", Errors.INVALIDDATA);
			}
			return (Map)page.getContent().get(0);
		}
		catch (Throwable ex) {
			throw ex;
		}
		finally {
			SysBDSchemeRuntime.setCurrentDBName(null);
		}
	}
	
	protected IOSSPreviewProvider getOSSPreviewProvider(String strFileExt, boolean tryMode) throws Exception {
		IOSSPreviewProvider iOSSPreviewProvider = this.ossPreviewProviderMap.get(strFileExt.toUpperCase());
		if (iOSSPreviewProvider != null || tryMode) {
			return iOSSPreviewProvider;
		}

		throw new Exception(String.format("无法获取指定OSS预览插件[%1$s]", strFileExt));
	}
	
	protected IOSSTextProvider getOSSTextProvider(String strFileExt, boolean tryMode) throws Exception {
		IOSSTextProvider iOSSTextProvider = this.ossTextProviderMap.get(strFileExt.toUpperCase());
		if (iOSSTextProvider != null || tryMode) {
			return iOSSTextProvider;
		}

		throw new Exception(String.format("无法获取指定OSS文本插件[%1$s]", strFileExt));
	}
}
