package net.ibizsys.runtime;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import groovy.text.GStringTemplateEngine;
import groovy.text.Template;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.database.IPSSysDBValueFunc;
import net.ibizsys.model.dts.IPSSysDTSQueue;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.codelist.CodeListTypes;
import net.ibizsys.runtime.codelist.DynamicCodeListRuntime;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.codelist.PredefinedCodeListRuntime;
import net.ibizsys.runtime.codelist.StaticCodeListRuntime;
import net.ibizsys.runtime.dataentity.DynaInstDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.runtime.dataentity.util.DEDataAuditUtilRuntime;
import net.ibizsys.runtime.dataentity.util.IDEDataAuditUtilRuntime;
import net.ibizsys.runtime.dts.ISysDTSQueueRuntime;
import net.ibizsys.runtime.dts.SysDTSQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.msg.SysDEMsgQueueRuntime;
import net.ibizsys.runtime.msg.SysDEMsgTargetRuntime;
import net.ibizsys.runtime.msg.SysMsgQueueTypes;
import net.ibizsys.runtime.msg.SysMsgTargetTypes;
import net.ibizsys.runtime.msg.SysMsgTemplRuntime;
import net.ibizsys.runtime.plugin.IInstantAutowiredObject;
import net.ibizsys.runtime.plugin.IModelRTScript;
import net.ibizsys.runtime.plugin.INonAutowiredObject;
import net.ibizsys.runtime.plugin.IRuntimeObjectFactory;
import net.ibizsys.runtime.plugin.ModelRTScriptBase;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.res.DefaultSysValueFuncRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysNotifyAgentRuntime;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.ISysValueFuncRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.res.SysCodeListTranslatorRuntime;
import net.ibizsys.runtime.res.SysDBSequenceRuntime;
import net.ibizsys.runtime.res.SysDESequenceRuntime;
import net.ibizsys.runtime.res.SysDEStorageTranslatorRuntime;
import net.ibizsys.runtime.res.SysDataSyncAgentTypes;
import net.ibizsys.runtime.res.SysDigestTranslatorRuntime;
import net.ibizsys.runtime.res.SysEncryptTranslatorRuntime;
import net.ibizsys.runtime.res.SysLCaseTranslatorRuntime;
import net.ibizsys.runtime.res.SysMQDataSyncAgentRuntime;
import net.ibizsys.runtime.res.SysNotifyAgentRuntime;
import net.ibizsys.runtime.res.SysRegExValueRuleRuntime;
import net.ibizsys.runtime.res.SysSFPluginRuntime;
import net.ibizsys.runtime.res.SysScriptLogicRuntime;
import net.ibizsys.runtime.res.SysScriptValueRuleRuntime;
import net.ibizsys.runtime.res.SysSequenceTypes;
import net.ibizsys.runtime.res.SysTranslatorTypes;
import net.ibizsys.runtime.res.SysUCaseTranslatorRuntime;
import net.ibizsys.runtime.res.SysUtilTypes;
import net.ibizsys.runtime.res.SysValueRuleTypes;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.system.ISystemModuleUtilRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.groovy.ISystemRTGroovyContext;
import net.ibizsys.runtime.util.script.ISystemRTScriptContext;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

/**
 * 系统运行时辅助功能对象
 * 
 * @author lionlau
 *
 */
public abstract class SystemUtilRuntimeBase extends SystemRuntimeBaseBase implements ISystemUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SystemUtilRuntimeBase.class);

	private String strTempFolder = null;

	private String strFileFolder = null;

	private String strReportFolder = null;

	private String strFontFolder = null;

	private ThreadPoolExecutor workThreadPoolExecutor = null;
	private ScheduledExecutorService timerThreadPoolExecutor = null;

	private static Map<String, DecimalFormat> DecimalFormatMap = new ConcurrentHashMap<String, DecimalFormat>();
	private static Map<String, DateFormat> DateFormatMap = new ConcurrentHashMap<String, DateFormat>();
	
	private GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
	
	private GStringTemplateEngine engine = new GStringTemplateEngine(groovyClassLoader);
	private Map<String, Template> templateCacheMap = new ConcurrentHashMap<String, Template>();
	
	public static int TEMPLATECACHE_SIZE = 200;

	protected class TimerTask {
		public long time;
		public Runnable runnable;
		public IUserContext userContext;
		public Object tag;
		public String name;
		public Object env;
	}

	private List<TimerTask> timerTaskList = new ArrayList<TimerTask>();
	private List<TimerTask> timerTaskList2 = new ArrayList<TimerTask>();
	private Set<Object> autowareObjectList = new LinkedHashSet<Object>();
	private Set<IModelRuntimeShutdownable> modelRuntimeShutdownableList = new LinkedHashSet<IModelRuntimeShutdownable>();
	private boolean bAutowareObjectList = true;

	private boolean bThreadRun = false;

	protected static boolean registerRuntimeObject(Class<?> cls, String strType, Object strObject) {
		return RuntimeObjectFactory.getInstance().registerObject(cls, strType, strObject);
	}

	protected static boolean registerRuntimeObject(Class<?> cls, Object strObject) {
		return RuntimeObjectFactory.getInstance().registerObject(cls, null, strObject);
	}

	protected static boolean registerRuntimeObjectPrimary(Class<?> cls, String strType, Object strObject) {
		return RuntimeObjectFactory.getInstance().registerObjectPrimary(cls, strType, strObject);
	}

	protected static boolean registerRuntimeObjectPrimary(Class<?> cls, Object strObject) {
		return RuntimeObjectFactory.getInstance().registerObjectPrimary(cls, null, strObject);
	}

	protected static boolean registerRuntimeObject(Class<?> cls, String strType, Object strObject, int nOrderValue) {
		return RuntimeObjectFactory.getInstance().registerObject(cls, strType, strObject, nOrderValue);
	}

	protected static boolean registerRuntimeObject(Class<?> cls, Object strObject, int nOrderValue) {
		return RuntimeObjectFactory.getInstance().registerObject(cls, null, strObject, nOrderValue);
	}

	protected static boolean registerRuntimeObjectIf(Class<?> cls, String strType, Object strObject) {
		return RuntimeObjectFactory.getInstance().registerObjectIf(cls, strType, strObject);
	}

	protected static boolean registerRuntimeObjectIf(Class<?> cls, Object strObject) {
		return RuntimeObjectFactory.getInstance().registerObjectIf(cls, null, strObject);
	}
	
	public static boolean registerSingleInstanceRuntimeObjectIf(Class<?> cls, String strType, Object object) {
		Assert.notNull(cls, "传入运行时对象类型无效");
		Assert.notNull(object, "传入运行时对象无效");
		try {
			if(RuntimeObjectFactory.getInstance().containsObject(cls, strType)) {
				return false;
			}
			
			if(object instanceof String) {
				object = Class.forName((String)object);
			}
			if(object instanceof Class<?>) {
				object = ((Class<?>)object).newInstance();
				return RuntimeObjectFactory.getInstance().registerObjectIf(cls, strType, object);
			}
			if(cls.isAssignableFrom(object.getClass())) {
				return RuntimeObjectFactory.getInstance().registerObjectIf(cls, strType, object);
			}
			return false;
		}
		catch (Throwable ex) {
			return false;
		}
	}

	public static boolean registerSingleInstanceRuntimeObjectIf(Class<?> cls, Object object) {
		Assert.notNull(cls, "传入运行时对象类型无效");
		Assert.notNull(object, "传入运行时对象无效");
		try {
			if(RuntimeObjectFactory.getInstance().containsObject(cls, null)) {
				return false;
			}
			if(object instanceof String) {
				object = Class.forName((String)object);
			}
			if(object instanceof Class<?>) {
				object = ((Class<?>)object).newInstance();
				return RuntimeObjectFactory.getInstance().registerObjectIf(cls, null, object);
			}
			if(cls.isAssignableFrom(object.getClass())) {
				return RuntimeObjectFactory.getInstance().registerObjectIf(cls, null, object);
			}
			return false;
		}
		catch (Throwable ex) {
			return false;
		}
	}

	protected boolean isThreadRun() {
		return this.bThreadRun;
	}

	@Override
	public Object convertValue(int nDataType, String strValue) throws Exception {
		return DataTypeUtils.parse(nDataType, strValue);
	}

	@Override
	public Object convertValue(int nDataType, Object value) throws Exception {
		return DataTypeUtils.convert(nDataType, value);
	}

	@Override
	public List convertListValue(int nDataType, Object value) throws Exception {

		if (ObjectUtils.isEmpty(value)) {
			return null;
		}

		if (value instanceof List) {
			List list = (List) value;
			for (int i = 0; i < list.size(); i++) {
				Object item = list.get(i);
				item = this.convertValue(nDataType, item);
				list.set(i, item);
			}
			return list;
		}

		if (value instanceof String) {
			return this.convertListValue(nDataType, (String) value);
		} else {
			String strValue = JsonUtils.toString(value);
			return this.convertListValue(nDataType, strValue);
		}

	}

	@Override
	public List convertListValue(int nDataType, String strValue) throws Exception {

		if (ObjectUtils.isEmpty(strValue)) {
			return null;
		}

		List list = JsonUtils.asList(strValue);
		if (ObjectUtils.isEmpty(list)) {
			return null;
		}

		for (int i = 0; i < list.size(); i++) {
			Object item = list.get(i);
			item = this.convertValue(nDataType, item);
			list.set(i, item);
		}
		return list;
	}

	@Override
	public boolean testValueCond(Object objSrcValue, String strOp, Object objDstValue, int nSrcValueDataType) {
		try {
			return DataTypeUtils.testCond(objSrcValue, strOp, objDstValue, nSrcValueDataType);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("判断值条件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public long compareValue(Object objSrcValue, Object objDstValue, int nValueDataType) {
		return DataTypeUtils.compare(nValueDataType, objSrcValue, objDstValue);
	}

	

	@Override
	public String writeValue(int nStdDataType, Object value, String strJsonFormat) throws Exception {
		Assert.notNull(value, "传入值无效");
		Assert.hasLength(strJsonFormat, "传入格式化无效");
		
		if(DataTypeUtils.isNumberDataType(nStdDataType)) {
			return getDecimalFormat(strJsonFormat).format(value);
		}
		
		if(DataTypeUtils.isDateTimeDataType(nStdDataType)) {
			return getDateFormat(strJsonFormat).format(value);
		}
		
		throw new Exception(String.format("未支持的标准数据类型[%1$s]", DataTypeUtils.getTypeName(nStdDataType)));
	}

	@Override
	public Object readValue(int nStdDataType, String strValue, String strJsonFormat) throws Exception {
		
		Assert.hasLength(strValue, "传入值无效");
		Assert.hasLength(strJsonFormat, "传入格式化无效");
		
		if(DataTypeUtils.isNumberDataType(nStdDataType)) {
			return getDecimalFormat(strJsonFormat).parseObject(strValue);
		}
		
		if(DataTypeUtils.isDateTimeDataType(nStdDataType)) {
			return getDateFormat(strJsonFormat).parseObject(strValue);
		}
		
		throw new Exception(String.format("未支持的标准数据类型[%1$s]", DataTypeUtils.getTypeName(nStdDataType)));
	}

	public static DecimalFormat getDecimalFormat(String strJsonFormat) throws Exception {
		DecimalFormat decimalFormat = DecimalFormatMap.get(strJsonFormat);
		if (decimalFormat == null) {
			decimalFormat = new DecimalFormat(strJsonFormat);
			DecimalFormatMap.put(strJsonFormat, decimalFormat);
		}
		return decimalFormat;
	}

	public static DateFormat getDateFormat(String strJsonFormat) throws Exception {
		DateFormat dateFormat = DateFormatMap.get(strJsonFormat);
		if (dateFormat == null) {
			dateFormat = new SimpleDateFormat(strJsonFormat);
			DateFormatMap.put(strJsonFormat, dateFormat);
		}
		return dateFormat;
	}

	/**
	 * 建立动态实例运行时对象
	 * 
	 * @return
	 */
	protected IDynaInstRuntime createDynaInstRuntime() {
		return new DynaInstRuntime();
	}

	/**
	 * 建立动态实例实体运行时数据
	 * 
	 * @return
	 */
	protected IDynaInstDataEntityRuntime createDynaInstDataEntityRuntime() {
		return new DynaInstDataEntityRuntime();
	}

	@Override
	public ISysValueRuleRuntime createSysValueRuleRuntime(IPSSysValueRule iPSSysValueRule) {

		Assert.notNull(iPSSysValueRule, "系统值规则模型对象无效");

		ISysValueRuleRuntime iSysValueRuleRuntime = this.getRuntimeObject(iPSSysValueRule.getPSSysSFPlugin(), ISysValueRuleRuntime.class, true);
		if (iSysValueRuleRuntime != null) {
			return iSysValueRuleRuntime;
		}
		
		if(iPSSysValueRule.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysValueRule.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysValueRuleRuntime = iSystemModuleUtilRuntime.createSysValueRuleRuntime(iPSSysValueRule);
				if (iSysValueRuleRuntime != null) {
					return iSysValueRuleRuntime;
				}
			}
		}
		
		if(StringUtils.hasLength(iPSSysValueRule.getRuleType())) {
			iSysValueRuleRuntime = this.getRuntimeObject(ISysValueRuleRuntime.class, iPSSysValueRule.getRuleType());
			if (iSysValueRuleRuntime != null) {
				return iSysValueRuleRuntime;
			}
		}

		return this.onCreateSysValueRuleRuntime(iPSSysValueRule);
	}
	
	protected ISysValueRuleRuntime onCreateSysValueRuleRuntime(IPSSysValueRule iPSSysValueRule) {
		if (SysValueRuleTypes.REGEX.equals(iPSSysValueRule.getRuleType()) || SysValueRuleTypes.REG.equals(iPSSysValueRule.getRuleType())) {
			return new SysRegExValueRuleRuntime();
		}

		if (SysValueRuleTypes.SCRIPT.equals(iPSSysValueRule.getRuleType())) {
			return new SysScriptValueRuleRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法建立值规则[%1$s]运行时对象，类型为[%2$s]", iPSSysValueRule.getName(), iPSSysValueRule.getRuleType()));
	}

	@Override
	public ISysSequenceRuntime createSysSequenceRuntime(IPSSysSequence iPSSysSequence) {

		Assert.notNull(iPSSysSequence, "系统值序列模型对象无效");

		ISysSequenceRuntime iSysSequenceRuntime = this.getRuntimeObject(iPSSysSequence.getPSSysSFPlugin(), ISysSequenceRuntime.class, true);
		if (iSysSequenceRuntime != null) {
			return iSysSequenceRuntime;
		}
		
		if(iPSSysSequence.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysSequence.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysSequenceRuntime = iSystemModuleUtilRuntime.createSysSequenceRuntime(iPSSysSequence);
				if (iSysSequenceRuntime != null) {
					return iSysSequenceRuntime;
				}
			}
		}

		if (StringUtils.hasLength(iPSSysSequence.getSequenceType())) {
			iSysSequenceRuntime = this.getRuntimeObject(ISysSequenceRuntime.class, iPSSysSequence.getSequenceType());
			if (iSysSequenceRuntime != null) {
				return iSysSequenceRuntime;
			}
		}

		return this.onCreateSysSequenceRuntime(iPSSysSequence);
	}

	protected ISysSequenceRuntime onCreateSysSequenceRuntime(IPSSysSequence iPSSysSequence) {
		if (SysSequenceTypes.DB.equals(iPSSysSequence.getSequenceType())) {
			return new SysDBSequenceRuntime();
		}

		if (SysSequenceTypes.DE.equals(iPSSysSequence.getSequenceType())) {
			return new SysDESequenceRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法建立值序列[%1$s]运行时对象，类型为[%2$s]", iPSSysSequence.getName(), iPSSysSequence.getSequenceType()));
	}

	@Override
	public ISysTranslatorRuntime createSysTranslatorRuntime(IPSSysTranslator iPSSysTranslator) {

		Assert.notNull(iPSSysTranslator, "系统值转换器模型对象无效");

		ISysTranslatorRuntime iSysTranslatorRuntime = this.getRuntimeObject(iPSSysTranslator.getPSSysSFPlugin(), ISysTranslatorRuntime.class, true);
		if (iSysTranslatorRuntime != null) {
			return iSysTranslatorRuntime;
		}
		
		if(iPSSysTranslator.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysTranslator.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysTranslatorRuntime = iSystemModuleUtilRuntime.createSysTranslatorRuntime(iPSSysTranslator);
				if (iSysTranslatorRuntime != null) {
					return iSysTranslatorRuntime;
				}
			}
		}
		
		if (StringUtils.hasLength(iPSSysTranslator.getTranslatorType())) {
			iSysTranslatorRuntime = this.getRuntimeObject(ISysTranslatorRuntime.class, iPSSysTranslator.getTranslatorType());
			if(iSysTranslatorRuntime!=null) {
				return iSysTranslatorRuntime;
			}
		}
		
		return this.onCreateSysTranslatorRuntime(iPSSysTranslator);		
	}
	
	protected ISysTranslatorRuntime onCreateSysTranslatorRuntime(IPSSysTranslator iPSSysTranslator) {
		if (SysTranslatorTypes.DIGEST.equals(iPSSysTranslator.getTranslatorType())) {
			return new SysDigestTranslatorRuntime();
		}

		if (SysTranslatorTypes.ENCRYPT.equals(iPSSysTranslator.getTranslatorType())) {
			return new SysEncryptTranslatorRuntime();
		}

		if (SysTranslatorTypes.DESTORAGE.equals(iPSSysTranslator.getTranslatorType())) {
			return new SysDEStorageTranslatorRuntime();
		}
	
		if (SysTranslatorTypes.UCASE.equals(iPSSysTranslator.getTranslatorType())) {
			return new SysUCaseTranslatorRuntime();
		}

		if (SysTranslatorTypes.LCASE.equals(iPSSysTranslator.getTranslatorType())) {
			return new SysLCaseTranslatorRuntime();
		}
		
		if (SysTranslatorTypes.CODELIST.equals(iPSSysTranslator.getTranslatorType())) {
			return new SysCodeListTranslatorRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法建立值转换器[%1$s]运行时对象，类型为[%2$s]", iPSSysTranslator.getName(), iPSSysTranslator.getTranslatorType()));
	}

	@Override
	public ICodeListRuntime createCodeListRuntime(IPSCodeList iPSCodeList) {

		Assert.notNull(iPSCodeList, "系统代码表模型对象无效");

		ICodeListRuntime iCodeListRuntime = this.getRuntimeObject(iPSCodeList.getPSSysSFPlugin(), ICodeListRuntime.class, true);
		if (iCodeListRuntime != null) {
			return iCodeListRuntime;
		}
		
		if(iPSCodeList.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSCodeList.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iCodeListRuntime = iSystemModuleUtilRuntime.createCodeListRuntime(iPSCodeList);
				if (iCodeListRuntime != null) {
					return iCodeListRuntime;
				}
			}
		}

		if (CodeListTypes.STATIC.equals(iPSCodeList.getCodeListType())) {
			return createStaticCodeListRuntime(iPSCodeList);
		}

		if (CodeListTypes.DYNAMIC.equals(iPSCodeList.getCodeListType())) {
			return createDynamicCodeListRuntime(iPSCodeList);
		}

		if (CodeListTypes.PREDEFINED.equals(iPSCodeList.getCodeListType())) {
			return createPredefinedCodeListRuntime(iPSCodeList);
		}
		
		if (CodeListTypes.INLINE.equals(iPSCodeList.getCodeListType())
				|| !StringUtils.hasLength(iPSCodeList.getCodeListType())) {
			return createStaticCodeListRuntime(iPSCodeList);
		}

		throw new SystemRuntimeException(this, String.format("无法建立代码表[%1$s]运行时对象，类型为[%2$s]", iPSCodeList.getName(), iPSCodeList.getCodeListType()));
	}

	protected ICodeListRuntime createStaticCodeListRuntime(IPSCodeList iPSCodeList) {
		return new StaticCodeListRuntime();
	}

	protected ICodeListRuntime createPredefinedCodeListRuntime(IPSCodeList iPSCodeList) {
		if (StringUtils.hasLength(iPSCodeList.getPredefinedType())) {
			String strType = String.format("%1$s:%2$s", iPSCodeList.getCodeListType(), iPSCodeList.getPredefinedType());
			ICodeListRuntime iCodeListRuntime = this.getRuntimeObject(ICodeListRuntime.class, strType);
			if (iCodeListRuntime != null) {
				return iCodeListRuntime;
			}
		}

		return new PredefinedCodeListRuntime();
	}

	protected ICodeListRuntime createDynamicCodeListRuntime(IPSCodeList iPSCodeList) {
		if (iPSCodeList.isUserScope()) {
			throw new SystemRuntimeException(this, String.format("无法建立代码表[%1$s]运行时对象，不支持用户范围", iPSCodeList.getName()));
		}
		if (StringUtils.hasLength(iPSCodeList.getPredefinedType())) {
			String strType = String.format("%1$s:%2$s", iPSCodeList.getCodeListType(), iPSCodeList.getPredefinedType());
			ICodeListRuntime iCodeListRuntime = this.getRuntimeObject(ICodeListRuntime.class, strType);
			if (iCodeListRuntime != null) {
				return iCodeListRuntime;
			}
		}
		return createDefaultDynamicCodeListRuntime(iPSCodeList);
	}
	
	/**
	 * 建立默认动态代码表对象运行时
	 * @param iPSCodeList
	 * @return
	 */
	protected ICodeListRuntime createDefaultDynamicCodeListRuntime(IPSCodeList iPSCodeList) {
		return this.createDefaultDynamicCodeListRuntime();
	}

	/**
	 * 建立默认动态代码表对象运行时
	 * @deprecated
	 * @return
	 */
	protected ICodeListRuntime createDefaultDynamicCodeListRuntime() {
		return new DynamicCodeListRuntime();
	}
	
	@Override
	public ISysUtilRuntime createSysUtilRuntime(IPSSysUtil iPSSysUtil) {
		Assert.notNull(iPSSysUtil, "系统功能模型对象无效");

		ISysUtilRuntime iSysUtilRuntime = this.getRuntimeObject(iPSSysUtil.getPSSysSFPlugin(), ISysUtilRuntime.class, true);
		if (iSysUtilRuntime != null) {
			return iSysUtilRuntime;
		}
		
		if(iPSSysUtil.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysUtil.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysUtilRuntime = iSystemModuleUtilRuntime.createSysUtilRuntime(iPSSysUtil);
				if (iSysUtilRuntime != null) {
					return iSysUtilRuntime;
				}
			}
		}

		if (SysUtilTypes.USER.equals(iPSSysUtil.getUtilType())) {
			iSysUtilRuntime = this.getRuntimeObject(ISysUtilRuntime.class, String.format("%1$s:%2$s", iPSSysUtil.getUtilType(), iPSSysUtil.getUtilTag()));
		} else {
			iSysUtilRuntime = this.getRuntimeObject(ISysUtilRuntime.class, iPSSysUtil.getUtilType());
		}
		if (iSysUtilRuntime != null) {
			return iSysUtilRuntime;
		}

		iSysUtilRuntime = onCreateSysUtilRuntime(iPSSysUtil);
		if (iSysUtilRuntime != null) {
			return iSysUtilRuntime;
		}

		if (SysUtilTypes.USER.equals(iPSSysUtil.getUtilType())) {
			throw new SystemRuntimeException(this, String.format("无法识别的系统预置功能组件[%1$s:%2$s]", iPSSysUtil.getUtilType(), iPSSysUtil.getUtilTag()));
		}
		else {
			throw new SystemRuntimeException(this, String.format("无法识别的系统预置功能组件[%1$s]", iPSSysUtil.getUtilType()));
		}
		
	}

	protected ISysUtilRuntime onCreateSysUtilRuntime(IPSSysUtil iPSSysUtil) {
		/**
		 * 下面代码兼容老写法
		 */
		ISysUtilRuntime iSysUtilRuntime = createDefaultSysUtilRuntime(iPSSysUtil);
		if (iSysUtilRuntime != null) {
			return iSysUtilRuntime;
		}

		String strUtilType = iPSSysUtil.getUtilType();
		if (StringUtils.hasLength(strUtilType)) {
			if (SysUtilTypes.DATAAUDIT.equals(strUtilType)) {
				return createDEDataAuditUtilRuntime();
			}
		}
		return null;
	}

	protected IDEDataAuditUtilRuntime createDEDataAuditUtilRuntime() {
		return new DEDataAuditUtilRuntime();
	}

	protected ISysUtilRuntime createDefaultSysUtilRuntime(IPSSysUtil iPSSysUtil) {

		return null;
	}

	@Override
	public ISysDataSyncAgentRuntime createSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		Assert.notNull(iPSSysDataSyncAgent, "系统数据同步代理模型对象无效");

		ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = this.getRuntimeObject(iPSSysDataSyncAgent.getPSSysSFPlugin(), ISysDataSyncAgentRuntime.class, true);
		if (iSysDataSyncAgentRuntime != null) {
			return iSysDataSyncAgentRuntime;
		}
		
		if(iPSSysDataSyncAgent.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysDataSyncAgent.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysDataSyncAgentRuntime = iSystemModuleUtilRuntime.createSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
				if (iSysDataSyncAgentRuntime != null) {
					return iSysDataSyncAgentRuntime;
				}
			}
		}
		
		return onCreateSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
	}

	protected ISysDataSyncAgentRuntime onCreateSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		if (!StringUtils.hasLength(iPSSysDataSyncAgent.getAgentType())) {
			throw new SystemRuntimeException(this, String.format("无法建立系统数据同步代理[%1$s]运行时对象，未指定代理类型", iPSSysDataSyncAgent.getName()));
		}

		ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = this.getRuntimeObject(ISysDataSyncAgentRuntime.class, iPSSysDataSyncAgent.getAgentType());
		if (iSysDataSyncAgentRuntime != null) {
			return iSysDataSyncAgentRuntime;
		}
		
		if (SysDataSyncAgentTypes.ACTIVEMQ.equals(iPSSysDataSyncAgent.getAgentType())) {
			return new SysMQDataSyncAgentRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法建立系统数据同步代理[%1$s]运行时对象，类型为[%2$s]", iPSSysDataSyncAgent.getName(), iPSSysDataSyncAgent.getAgentType()));
	}

	@Override
	public ISysNotifyAgentRuntime createSysNotifyAgentRuntime() {
		return new SysNotifyAgentRuntime();
	}

	@Override
	public ISysMsgTemplRuntime createSysMsgTemplRuntime(IPSSysMsgTempl iPSSysMsgTempl) {
		Assert.notNull(iPSSysMsgTempl, "系统消息模板模型对象无效");
		ISysMsgTemplRuntime iSysMsgTemplRuntime = this.getRuntimeObject(iPSSysMsgTempl.getPSSysSFPlugin(), ISysMsgTemplRuntime.class, true);
		if (iSysMsgTemplRuntime != null) {
			return iSysMsgTemplRuntime;
		}
		
		if(iPSSysMsgTempl.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysMsgTempl.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysMsgTemplRuntime = iSystemModuleUtilRuntime.createSysMsgTemplRuntime(iPSSysMsgTempl);
				if (iSysMsgTemplRuntime != null) {
					return iSysMsgTemplRuntime;
				}
			}
		}

		return this.onCreateSysMsgTemplRuntime(iPSSysMsgTempl);
	}

	protected ISysMsgTemplRuntime onCreateSysMsgTemplRuntime(IPSSysMsgTempl iPSSysMsgTempl) {
		
		ISysMsgTemplRuntime iSysMsgTemplRuntime = this.getRuntimeObject(ISysMsgTemplRuntime.class, iPSSysMsgTempl.getTemplEngine());
		if (iSysMsgTemplRuntime != null) {
			return iSysMsgTemplRuntime;
		}
		
		return new SysMsgTemplRuntime();
	}

	@Override
	public ISysMsgQueueRuntime createSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue) {
		Assert.notNull(iPSSysMsgQueue, "系统消息队列模型对象无效");

		ISysMsgQueueRuntime iSysMsgQueueRuntime = this.getRuntimeObject(iPSSysMsgQueue.getPSSysSFPlugin(), ISysMsgQueueRuntime.class, true);
		if (iSysMsgQueueRuntime != null) {
			return iSysMsgQueueRuntime;
		}
		
		if(iPSSysMsgQueue.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysMsgQueue.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysMsgQueueRuntime = iSystemModuleUtilRuntime.createSysMsgQueueRuntime(iPSSysMsgQueue);
				if (iSysMsgQueueRuntime != null) {
					return iSysMsgQueueRuntime;
				}
			}
		}

		return this.onCreateSysMsgQueueRuntime(iPSSysMsgQueue);		
	}
	
	protected ISysMsgQueueRuntime onCreateSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue) {
		Assert.notNull(iPSSysMsgQueue.getMsgQueueType(), "系统消息队列模型对象类型无效");

		if (SysMsgQueueTypes.DE.equals(iPSSysMsgQueue.getMsgQueueType())) {
			return new SysDEMsgQueueRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法建立系统消息队列[%1$s]运行时对象，类型为[%2$s]", iPSSysMsgQueue.getName(), iPSSysMsgQueue.getMsgQueueType()));
	}

	@Override
	public ISysMsgTargetRuntime createSysMsgTargetRuntime(IPSSysMsgTarget iPSSysMsgTarget) {
		Assert.notNull(iPSSysMsgTarget, "系统消息目标模型对象无效");

		ISysMsgTargetRuntime iSysMsgTargetRuntime = this.getRuntimeObject(iPSSysMsgTarget.getPSSysSFPlugin(), ISysMsgTargetRuntime.class, true);
		if (iSysMsgTargetRuntime != null) {
			return iSysMsgTargetRuntime;
		}
		
		if(iPSSysMsgTarget.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysMsgTarget.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysMsgTargetRuntime = iSystemModuleUtilRuntime.createSysMsgTargetRuntime(iPSSysMsgTarget);
				if (iSysMsgTargetRuntime != null) {
					return iSysMsgTargetRuntime;
				}
			}
		}

		return this.onCreateSysMsgTargetRuntime(iPSSysMsgTarget);
	}
	
	protected ISysMsgTargetRuntime onCreateSysMsgTargetRuntime(IPSSysMsgTarget iPSSysMsgTarget) {
		Assert.notNull(iPSSysMsgTarget.getMsgTargetType(), "系统消息目标模型对象类型无效");

		if (SysMsgTargetTypes.DE.equals(iPSSysMsgTarget.getMsgTargetType())) {
			return new SysDEMsgTargetRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法建立系统消息目标[%1$s]运行时对象，类型为[%2$s]", iPSSysMsgTarget.getName(), iPSSysMsgTarget.getMsgTargetType()));
	}

	@Override
	public ISysValueFuncRuntime createSysValueFuncRuntime(IPSSysDBValueFunc iPSSysDBValueFunc) {
		Assert.notNull(iPSSysDBValueFunc, "系统值函数模型对象无效");

		ISysValueFuncRuntime iSysValueFuncRuntime = this.getRuntimeObject(iPSSysDBValueFunc.getPSSysSFPlugin(), ISysValueFuncRuntime.class, true);
		if (iSysValueFuncRuntime != null) {
			return iSysValueFuncRuntime;
		}
		
		if(iPSSysDBValueFunc.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysDBValueFunc.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysValueFuncRuntime = iSystemModuleUtilRuntime.createSysValueFuncRuntime(iPSSysDBValueFunc);
				if (iSysValueFuncRuntime != null) {
					return iSysValueFuncRuntime;
				}
			}
		}
		
		return this.onCreateSysValueFuncRuntime(iPSSysDBValueFunc);
	}
	
	protected ISysValueFuncRuntime onCreateSysValueFuncRuntime(IPSSysDBValueFunc iPSSysDBValueFunc) {
		Assert.notNull(iPSSysDBValueFunc.getCodeName(), "系统值函数模型对象代码标识无效");

		if (ISysValueFuncRuntime.PREDEFINED_DATEDIFFNOW.equalsIgnoreCase(iPSSysDBValueFunc.getCodeName()) || ISysValueFuncRuntime.PREDEFINED_DATEDIFFNOW2.equalsIgnoreCase(iPSSysDBValueFunc.getCodeName()) || ISysValueFuncRuntime.PREDEFINED_STRLEN.equalsIgnoreCase(iPSSysDBValueFunc.getCodeName())) {
			return new DefaultSysValueFuncRuntime();
		}

		// 未定义时使用默认值函数对象
		return new DefaultSysValueFuncRuntime();
	}

	@Override
	public ISysLogicRuntime createSysLogicRuntime(IPSSysLogic iPSSysLogic) {
		Assert.notNull(iPSSysLogic, "系统逻辑模型对象无效");

		ISysLogicRuntime iSysLogicRuntime = this.getRuntimeObject(iPSSysLogic.getPSSysSFPlugin(), ISysLogicRuntime.class, true);
		if (iSysLogicRuntime != null) {
			return iSysLogicRuntime;
		}
		
		if(iPSSysLogic.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysLogic.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysLogicRuntime = iSystemModuleUtilRuntime.createSysLogicRuntime(iPSSysLogic);
				if (iSysLogicRuntime != null) {
					return iSysLogicRuntime;
				}
			}
		}

		return this.onCreateSysLogicRuntime(iPSSysLogic);
	}
	
	protected ISysLogicRuntime onCreateSysLogicRuntime(IPSSysLogic iPSSysLogic) {

		if (iPSSysLogic.isCustomCode()) {
			return new SysScriptLogicRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法建立系统逻辑[%1$s]运行时对象", iPSSysLogic.getName()));
	}

	@Override
	public IWFRoleRuntime createWFRoleRuntime(IPSWFRole iPSWFRole) {
		Assert.notNull(iPSWFRole, "工作流角色模型对象无效");
		
		if(iPSWFRole.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSWFRole.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				IWFRoleRuntime iWFRoleRuntime = iSystemModuleUtilRuntime.createWFRoleRuntime(iPSWFRole);
				if (iWFRoleRuntime != null) {
					return iWFRoleRuntime;
				}
			}
		}
		
		return this.onCreateWFRoleRuntime(iPSWFRole);
	}
	
	protected IWFRoleRuntime onCreateWFRoleRuntime(IPSWFRole iPSWFRole) {
		// //
		// IWFRoleRuntime iWFRoleRuntime =
		// this.getRuntimeObject(iPSWFRole.getPSSysSFPlugin(),
		// IWFRoleRuntime.class, true);
		// if (iWFRoleRuntime != null) {
		// return iWFRoleRuntime;
		// }
		//
		// if (iPSWFRole.isCustomCode()) {
		// return new SysScriptLogicRuntime();
		// }
		//
		// throw new SystemRuntimeException(this,
		// String.format("无法建立工作流角色[%1$s]运行时对象", iPSWFRole.getName()));
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public ISysSFPluginRuntime createSysSFPluginRuntime(IPSSysSFPlugin iPSSysSFPlugin) {
		Assert.notNull(iPSSysSFPlugin, "系统后台插件模型对象无效");
		ISysSFPluginRuntime iSysSFPluginRuntime = this.createDefaultSysSFPluginRuntime(iPSSysSFPlugin);
		if (iSysSFPluginRuntime != null) {
			return iSysSFPluginRuntime;
		}

		return new SysSFPluginRuntime();
	}

	protected ISysSFPluginRuntime createDefaultSysSFPluginRuntime(IPSSysSFPlugin iPSSysSFPlugin) {
		return null;
	}

	@Override
	public ISysDTSQueueRuntime createSysDTSQueueRuntime(IPSSysDTSQueue iPSSysDTSQueue) {
		Assert.notNull(iPSSysDTSQueue, "系统异步处理队列模型对象无效");

		ISysDTSQueueRuntime iSysDTSQueueRuntime = createDefaultSysDTSQueueRuntime(iPSSysDTSQueue);
		if (iSysDTSQueueRuntime != null) {
			return iSysDTSQueueRuntime;
		}

		return new SysDTSQueueRuntime();
	}

	protected ISysDTSQueueRuntime createDefaultSysDTSQueueRuntime(IPSSysDTSQueue iPSSysDTSQueue) {
		return null;
	}

	@Override
	public void installBaseDatas(String strMode) {
		onInstallBaseDatas(strMode);
	}

	protected void onInstallBaseDatas(String strMode) {
		List<IPSSysContent> psSysContentList = null;
		try {
			psSysContentList = this.getPSSystem().getInitPSSysContents();
		} catch (Exception ex) {
			log.error(String.format("获取系统初始化数据发生异常，%1$s", ex.getMessage()));
			throw new SystemRuntimeException(this, String.format("获取系统初始化数据发生异常，%1$s", ex.getMessage()), Errors.MODELERROR, ex);
		}
		if (psSysContentList == null) {
			return;
		}

		for (IPSSysContent iPSSysContent : psSysContentList) {
			try {
				executeInstallScript(iPSSysContent);
			} catch (Exception ex) {
				log.error(String.format("安装系统初始化数据[%1$s]发生异常，%2$s", iPSSysContent.getName(), ex.getMessage()));
				throw new SystemRuntimeException(this, String.format("安装系统初始化数据[%1$s]发生异常，%2$s", iPSSysContent.getName(), ex.getMessage()), ex);
			}
		}
	}

	@Override
	public void installSampleDatas(String strMode) {
		onInstallSampleDatas(strMode);
	}

	protected void onInstallSampleDatas(String strMode) {
		List<IPSSysContent> psSysContentList = null;
		try {
			psSysContentList = this.getPSSystem().getSamplePSSysContents();
		} catch (Exception ex) {
			log.error(String.format("获取系统示例数据发生异常，%1$s", ex.getMessage()));
			throw new SystemRuntimeException(this, String.format("获取系统示例数据发生异常，%1$s", ex.getMessage()), Errors.MODELERROR, ex);
		}
		if (psSysContentList == null) {
			return;
		}

		for (IPSSysContent iPSSysContent : psSysContentList) {
			try {
				executeInstallScript(iPSSysContent);
			} catch (Exception ex) {
				log.error(String.format("安装系统示例数据[%1$s]发生异常，%2$s", iPSSysContent.getName(), ex.getMessage()));
				throw new SystemRuntimeException(this, String.format("安装系统示例数据[%1$s]发生异常，%2$s", iPSSysContent.getName(), ex.getMessage()), ex);
			}
		}
	}

	@Override
	public void installTestDatas(String strMode) {
		onInstallTestDatas(strMode);
	}

	protected void onInstallTestDatas(String strMode) {
		List<IPSSysContent> psSysContentList = null;
		try {
			psSysContentList = this.getPSSystem().getTestPSSysContents();
		} catch (Exception ex) {
			log.error(String.format("获取系统测试数据发生异常，%1$s", ex.getMessage()));
			throw new SystemRuntimeException(this, String.format("获取系统测试数据发生异常，%1$s", ex.getMessage()), Errors.MODELERROR, ex);
		}
		if (psSysContentList == null) {
			return;
		}

		for (IPSSysContent iPSSysContent : psSysContentList) {
			try {
				executeInstallScript(iPSSysContent);
			} catch (Exception ex) {
				log.error(String.format("安装系统测试数据[%1$s]发生异常，%2$s", iPSSysContent.getName(), ex.getMessage()));
				throw new SystemRuntimeException(this, String.format("安装系统测试数据[%1$s]发生异常，%2$s", iPSSysContent.getName(), ex.getMessage()), ex);
			}
		}
	}

	/**
	 * 获取系统运行时脚本上下文对象
	 * 
	 * @return
	 */
	public abstract ISystemRTScriptContext getSystemRTScriptContext();

	/**
	 * 执行安装内容
	 * 
	 * @param iPSSysContent
	 * @throws Exception
	 */
	protected void executeInstallScript(IPSSysContent iPSSysContent) throws Exception {
		if (!StringUtils.hasLength(iPSSysContent.getContent())) {
			return;
		}
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String strJSCode = "function main(sys,data){";
		strJSCode += iPSSysContent.getContent();
		strJSCode += "}";
		engine.eval(strJSCode);
		Invocable invocable = (Invocable) engine;
		invocable.invokeFunction("main", this.getSystemRTScriptContext(), iPSSysContent);
	}

	@Override
	public int executeSql(String strDSLink, String strSql, Object param) throws Exception {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public ResultSet executeSqlQuery(String strDSLink, String strSql, Object param) throws Exception {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public boolean testUniRes(String strUniResCode) {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	protected void prepareThreadPoolExecutors() throws Exception {
		this.bThreadRun = true;

		this.workThreadPoolExecutor = this.createWorkThreadPoolExecutor();
		this.timerThreadPoolExecutor = this.createScheduleThreadPoolExecutor();
		this.timerThreadPoolExecutor.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				timerThreadRun();

			}
		}, this.getTimerThreadTimer(), this.getTimerThreadTimer(), TimeUnit.MILLISECONDS);
	}

	protected void shutdownThreadPoolExecutors() throws Exception {
		if (!this.bThreadRun) {
			return;
		}
		this.bThreadRun = false;

		this.shutdownWorkThreadPoolExecutor();

		this.shutdownScheduleThreadPoolExecutor();
	}

	protected ThreadPoolExecutor createWorkThreadPoolExecutor() {
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, getWorkThreadMaximumPoolSize(), 30, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(getWorkThreadBlockingQueueSize()), new ThreadPoolExecutor.AbortPolicy());
		return threadPoolExecutor;
	}

	protected ScheduledExecutorService createScheduleThreadPoolExecutor() {
		return Executors.newScheduledThreadPool(1);
	}

	protected void shutdownWorkThreadPoolExecutor() {
		if (this.workThreadPoolExecutor != null) {
			try {
				this.workThreadPoolExecutor.shutdownNow();
			} catch (Throwable ex) {
				log.error(String.format("关闭工作线程池发生异常，%1$s", ex.getMessage()), ex);
			}
			this.workThreadPoolExecutor = null;
		}
	}

	protected void shutdownScheduleThreadPoolExecutor() {
		if (this.timerThreadPoolExecutor != null) {
			try {
				this.timerThreadPoolExecutor.shutdownNow();
			} catch (Throwable ex) {
				log.error(String.format("关闭定时线程池发生异常，%1$s", ex.getMessage()), ex);
			}
			this.timerThreadPoolExecutor = null;
		}
	}

	protected int getWorkThreadMaximumPoolSize() {
		return 40;
	}

	protected int getWorkThreadBlockingQueueSize() {
		return 2000;
	}

	protected int getTimerThreadTimer() {
		return 1000;
	}

	private void timerThreadRun() {

		if (!this.isThreadRun()) {
			return;
		}

		synchronized (this.timerTaskList) {
			if (this.timerTaskList.size() == 0) {
				return;
			}
			this.timerTaskList2.addAll(this.timerTaskList);
			this.timerTaskList.clear();
		}

		long nCurrentTime = System.currentTimeMillis();

		while (this.timerTaskList2.size() > 0) {
			if (!this.isThreadRun()) {
				break;
			}
			
			TimerTask timerTask = timerTaskList2.remove(0);
			if (nCurrentTime >= timerTask.time) {
				IUserContext last = UserContext.getCurrent();
				UserContext.setCurrent(getThreadTaskUserContext(timerTask.userContext));
				threadRun(timerTask.runnable, -1, timerTask.name, timerTask.env);
				UserContext.setCurrent(last);
			} else {
				synchronized (this.timerTaskList) {
					this.timerTaskList.add(timerTask);
				}
			}
		}
	}

	@Override
	public void threadRun(Runnable runnable) {
		threadRun(runnable, -1, null);
	}

	@Override
	public void threadRun(Runnable runnable, long nTime) {
		threadRun(runnable, nTime, null);
	}

	@Override
	public void threadRun(Runnable runnable, long nTime, String strTaskName) {

		if (!this.isThreadRun()) {
			return;
		}

		Object env = this.backupThreadRunEnv();
		threadRun(runnable, nTime, strTaskName, env);
	}
	
	protected void threadRun(Runnable runnable, long nTime, String strTaskName, Object env) {

		if (nTime <= 0) {
			final IUserContext iUserContext = UserContext.getCurrent();
			Assert.notNull(this.workThreadPoolExecutor, "后台作业线程池对象无效");
			this.workThreadPoolExecutor.execute(new Runnable() {
				@Override
				public void run() {
					IUserContext last = UserContext.getCurrent();
					UserContext.setCurrent(getThreadTaskUserContext(iUserContext));
					doThreadRun(runnable, strTaskName, env);
					UserContext.setCurrent(last);
				}
			});
		} else {
			final IUserContext iUserContext = UserContext.getCurrent();
			TimerTask timerTask = new TimerTask();
			timerTask.runnable = runnable;
			timerTask.time = nTime;
			timerTask.userContext = iUserContext;
			timerTask.name = strTaskName;
			timerTask.env = env;
			synchronized (this.timerTaskList) {
				if (StringUtils.hasLength(strTaskName)) {
					for (int i = 0; i < this.timerTaskList.size(); i++) {
						TimerTask item = timerTaskList.get(i);
						if (StringUtils.hasLength(item.name)) {
							if (item.name.equals(strTaskName)) {
								timerTaskList.remove(i);
								break;
							}
						}
					}
				}
				this.timerTaskList.add(timerTask);
			}
		}
	}
	
	protected Object backupThreadRunEnv() {
		return null;
	}
	
	protected void doThreadRun(Runnable runnable, String strTaskName, Object env) {
		runnable.run();
	}

	@Override
	public void threadCancel(String strTaskName) {

		if (!this.isThreadRun()) {
			return;
		}

		Assert.hasLength(strTaskName, "未传入取消任务的名称");
		synchronized (this.timerTaskList) {
			for (int i = 0; i < this.timerTaskList.size(); i++) {
				TimerTask item = timerTaskList.get(i);
				if (StringUtils.hasLength(item.name)) {
					if (item.name.equals(strTaskName)) {
						timerTaskList.remove(i);
						break;
					}
				}
			}
		}
	}
	
	public Map<String, Object> threadRunAllOf(List<IAction> actions, boolean bIgnoreException) throws Throwable {
		return this.threadRunAllOf(actions, bIgnoreException, null);
	}
	
	@Override
	public Map<String, Object> threadRunAllOf(List<IAction> actions, boolean bIgnoreException, Object env) throws Throwable {
		Assert.notNull(this.workThreadPoolExecutor, "后台作业线程池对象无效");
		Assert.notEmpty(actions, "传入行为数组无效");
		
		Map<String, Object> taskRetMap = new LinkedHashMap<String, Object>();
		List<CompletableFuture<?>> taskList = new ArrayList<CompletableFuture<?>>();
		final IUserContext iUserContext = UserContext.getCurrent();
		
		for(int i = 0; i<actions.size() ;i++) {
			IAction iAction = actions.get(i);
			Assert.notNull(iAction, String.format("#%1$s行为无效", i));
			
			String strActionName = String.format("#%1$s", i);
			if(iAction instanceof INamedAction) {
				String name = ((INamedAction)iAction).getName();
				Assert.hasLength(name, String.format("#%1$s行为名称无效", i));
				strActionName = name;
			}
			
			if(taskRetMap.containsKey(strActionName)) {
				throw new SystemRuntimeException(this, String.format("出现重复的行为名称[%1$s]", strActionName));
			}
			taskRetMap.put(strActionName, null);
			
			final String strActionName2 = strActionName;
			
			CompletableFuture<Void> task = CompletableFuture.runAsync(new Runnable() {

				@Override
				public void run() {
					IUserContext last = UserContext.getCurrent();
					try {
						UserContext.setCurrent(getThreadTaskUserContext(iUserContext));
						doThreadRun(new Runnable() {
							public void run() {
								try {
									Object ret = iAction.execute(null);
									taskRetMap.put(strActionName2, ret);
								}catch (Throwable ex) {
									ExceptionUtils.rethrowRuntimeException(ex);
								}
							}
						}, strActionName2, env);
					}
					catch (Throwable ex) {
						ex= ExceptionUtils.unwrapThrowable(ex);
						log.error(String.format("行为[%1$s]执行发生异常，%2$s", strActionName2, ex.getMessage()), ex);
						taskRetMap.put(strActionName2, ex);
					}
					finally {
						UserContext.setCurrent(last);
					}
				}
				
			}, this.workThreadPoolExecutor);
			
			taskList.add(task);
		}
		
		CompletableFuture.allOf(taskList.toArray(new CompletableFuture<?>[taskList.size()])).get();
		//判断是否存在异常
		if(!bIgnoreException) {
			for(java.util.Map.Entry<String, Object> entry : taskRetMap.entrySet()) {
				if(entry.getValue() instanceof Throwable) {
					Throwable ex = (Throwable)entry.getValue();
					throw new SystemRuntimeException(this, String.format("行为[%1$s]执行发生异常，%2$s", entry.getKey(), ex.getMessage()), ex);
				}
			}
		}
		
		return taskRetMap;
	}

	@Override
	public Object asyncExecute(IAction iAction, Object[] args, Object actionTag) throws Throwable {
		this.threadRun(new Runnable() {
			@Override
			public void run() {
				try {
					iAction.execute(args);
				} catch (Throwable e) {
					log.error(e);
				}
			}
		});
		return null;
	}

	@Override
	public Object sseExecute(IAction iAction, Object[] args, Object actionTag, long nTimeout) throws Throwable {
		return this.asyncExecute(iAction, args, actionTag);
	}
	
	@Override
	public Object executeUserContextAction(IAction iAction, Object[] args) throws Throwable {
		return this.executeUserContextAction(iAction, args, this.createDefaultUserContext());
	}
	
	@Override
	public Object executeUserContextActionIf(IAction iAction, Object[] args) throws Throwable {
		return this.executeUserContextActionIf(iAction, args, this.createDefaultUserContext());
	}
	
	@Override
	public Object executeUserContextAction(IAction iAction, Object[] args, IUserContext iUserContext) throws Throwable {
		IUserContext lastUserContext = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext!=null?iUserContext:this.createDefaultUserContext());
			return iAction.execute(args);
		} catch (Throwable ex) {
			// 直接抛出异常
			throw ex;
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	
	@Override
	public Object executeUserContextActionIf(IAction iAction, Object[] args, IUserContext iUserContext) throws Throwable {
		IUserContext lastUserContext = UserContext.getCurrent();
		try {
			if(lastUserContext == null) {
				UserContext.setCurrent(iUserContext!=null?iUserContext:this.createDefaultUserContext());
			}
			return iAction.execute(args);
		} catch (Throwable ex) {
			// 直接抛出异常
			throw ex;
		} finally {
			UserContext.setCurrent(lastUserContext);
		}
	}
	

	protected IUserContext getThreadTaskUserContext(IUserContext iUserContext) {
		return iUserContext;
	}

	@Override
	public IEntity createEntity() {
		return createEntity(null);
	}

	@Override
	public IEntity createEntity(Object source) {
		return createEntity(source, true);
	}

	@Override
	public IEntity createEntity(Object source, boolean bLowerCaseFieldName) {
		return new Entity(source, bLowerCaseFieldName);
	}

	@Override
	public Object serialize(Object obj) {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public <T> T deserialize(Object objData, Class<T> cls) {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public <T> T deserialize(Object objData, TypeReference<T> type) {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public String getReportFolder() {
		// if(!StringUtils.hasLength(this.strReportFolder)) {
		// throw new SystemRuntimeException(this, String.format("系统未定义报表文件路径"));
		// }
		return this.strReportFolder;
	}

	protected void setReportFolder(String strReportFolder) {
		this.strReportFolder = strReportFolder;
	}

	@Override
	public String getFontFolder() {
		return this.strFontFolder;
	}

	protected void setFontFolder(String strFontFolder) {
		this.strFontFolder = strFontFolder;
	}

	@Override
	public String getFileFolder() {
		return this.strFileFolder;
	}

	protected void setFileFolder(String strFileFolder) {
		this.strFileFolder = strFileFolder;
	}

	@Override
	public String getTempFolder() {
		return this.strTempFolder;
	}

	protected void setTempFolder(String strTempFolder) {
		this.strTempFolder = strTempFolder;
	}

	@Override
	public IUserContext createDefaultUserContext() {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public IUserContext createAnonymousUserContext() {
		throw new SystemRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public <T> T getRuntimeObject(Class<T> cls, String strType) {
		try {
			T t = this.getRuntimeObjectFactory().getObject(cls, strType);
			if (t != null) {
				this.autowareObject(t);
			}
			return t;
		} catch (Exception ex) {
			if (StringUtils.hasLength(strType)) {
				throw new SystemRuntimeException(this, String.format("获取运行时对象[%1$s|%2$s]发生异常，%3$s", cls.getCanonicalName(), strType, ex.getMessage()), ex);
			} else {
				throw new SystemRuntimeException(this, String.format("获取运行时对象[%1$s]发生异常，%2$s", cls.getCanonicalName(), ex.getMessage()), ex);
			}
		}
	}

	@Override
	public <T> Map<String, T> getRuntimeObjects(Class<T> cls) {
		return getRuntimeObjects(cls, null);
	}

	@Override
	public <T> Map<String, T> getRuntimeObjects(Class<T> cls, String strType) {
		try {
			return this.getRuntimeObjectFactory().getObjects(cls, strType);
		} catch (Exception ex) {
			if (StringUtils.hasLength(strType)) {
				throw new SystemRuntimeException(this, String.format("获取运行时对象列表[%1$s|%2$s]发生异常，%3$s", cls.getCanonicalName(), strType, ex.getMessage()), ex);
			} else {
				throw new SystemRuntimeException(this, String.format("获取运行时对象列表[%1$s]发生异常，%2$s", cls.getCanonicalName(), ex.getMessage()), ex);
			}

		}
	}
	
	@Override
	public IRuntimeObjectFactory getRuntimeObjectFactory() {
		return RuntimeObjectFactory.getInstance();
	}

	public abstract boolean isLoaded();

	/**
	 * 增加配置侦听器对象
	 * 
	 * @param listener
	 */
	public abstract void registerSystemEventListener(ISystemEventListener listener);

	/**
	 * 增加配置侦听器对象
	 * 
	 * @param listener
	 * @param events
	 */
	public abstract void registerSystemEventListener(ISystemEventListener listener, String[] events);

	/**
	 * 移除配置侦听器对象
	 * 
	 * @param listener
	 */
	public abstract void unregisterSystemEventListener(ISystemEventListener listener);

	/**
	 * 获取系统运行时Groovy上下文对象
	 * 
	 * @return
	 */
	public abstract ISystemRTGroovyContext getSystemRTGroovyContext();

	@Override
	public <T> T createObject(Class<T> cls, String strObjectName) {
		Class<?> objectCls = null;
		try {
			objectCls = Class.forName(strObjectName);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("建立对象[%1$s]发生异常，%2$s", strObjectName, ex.getMessage()), ex);
		}

		return this.createObject(cls, objectCls);
	}

	@Override
	public <T> T createObject(Class<T> cls, Class<?> objectCls) {
		Object obj = null;
		try {
			obj = objectCls.newInstance();
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("建立对象[%1$s]发生异常，%2$s", objectCls.getName(), ex.getMessage()), ex);
		}

		if (!cls.isAssignableFrom(obj.getClass())) {
			throw new SystemRuntimeException(this, String.format("对象[%1$s]类型不正确", objectCls.getName()));
		}

		this.autowareObject(obj);
		return (T) obj;
	}

	@Override
	public void autowareObject(Object object) {

		Assert.notNull(object, "传入装配对象不能为空");
		
		if(object instanceof INonAutowiredObject) {
			return;
		}

		if (!bAutowareObjectList || object instanceof IInstantAutowiredObject) {
			try {
				this.doAutowareObject(object, object.getClass());
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("装配对象[%1$s]发生异常，%2$s", object, ex.getMessage()), ex);
			}
		} else {
			try {
				doAutowareObjectInstantMode(object, object.getClass());
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("装配对象[%1$s]发生异常，%2$s", object, ex.getMessage()), ex);
			}
			this.autowareObjectList.add(object);
		}
	}

	protected void doAutowareObject(Object object, Class<?> cls) throws Exception {

		if (cls.equals(Object.class)) {
			return;
		}

		if (cls.getSuperclass() != null) {
			this.doAutowareObject(object, cls.getSuperclass());
		}

		Field[] fields = cls.getDeclaredFields();
		if (ObjectUtils.isEmpty(fields)) {
			return;
		}

		try {
			for (Field field : fields) {
				Qualifier qualifier = field.getAnnotation(Qualifier.class);
				Autowired autowired = field.getAnnotation(Autowired.class);
				if (qualifier != null || autowired != null) {
					if(qualifier == null && field.getType().isInterface()) {
						qualifier = field.getType().getAnnotation(Qualifier.class);
					}
					Object value = getObjectFieldValue(object, field, qualifier);
					if (value == null) {
						if (autowired == null || autowired.required()) {
							throw new Exception(String.format("无法计算[%1$s][%2$s]的值", object, field.getName()));
						}
						continue;
					}

					if (!field.isAccessible()) {
						field.setAccessible(true);
					}

					if (value instanceof IModelRuntime) {
						field.set(object, value);
					} else {
						field.set(object, getRealValue(field.getType(), value));
					}
				}
				else {
					if(field.getName().equals("sys")) {
						if(field.getType().isAssignableFrom(this.getClass())) {
							if (!field.isAccessible()) {
								field.setAccessible(true);
							}
							field.set(object, this);
						}
					}
				}
			}
		} catch (Throwable ex) {
			// log.error(ex);
			throw new Exception(ex);
		}
	}
	
	protected void doAutowareObjectInstantMode(Object object, Class<?> cls) throws Exception {

		if (cls.equals(Object.class)) {
			return;
		}

		if (cls.getSuperclass() != null) {
			this.doAutowareObjectInstantMode(object, cls.getSuperclass());
		}

		Field[] fields = cls.getDeclaredFields();
		if (ObjectUtils.isEmpty(fields)) {
			return;
		}

		try {
			for (Field field : fields) {
				Qualifier qualifier = field.getAnnotation(Qualifier.class);
				Autowired autowired = field.getAnnotation(Autowired.class);
				if (qualifier != null || autowired != null) {
//					if(qualifier == null && field.getType().isInterface()) {
//						qualifier = field.getType().getAnnotation(Qualifier.class);
//					}
					if(field.getType().isAssignableFrom(this.getClass())) {
						if (!field.isAccessible()) {
							field.setAccessible(true);
						}
						field.set(object, this);
					}
				}
				else {
					if(field.getName().equals("sys")) {
						if(field.getType().isAssignableFrom(this.getClass())) {
							if (!field.isAccessible()) {
								field.setAccessible(true);
							}
							field.set(object, this);
						}
					}
				}
			}
		} catch (Throwable ex) {
			// log.error(ex);
			throw new Exception(ex);
		}
	}

	protected Object getObjectFieldValue(Object object, Field field, Qualifier qualifier) {

		if (qualifier != null) {
			String name = qualifier.value();
			if (StringUtils.hasLength(name)) {
				String[] items = name.split("[:]");
				if (items.length == 1) {
					if (field.getType().getName().equals("java.lang.Class") || field.getType().getName().equals("java.lang.Object")) {
						return this.getSystemRTGroovyContext().getModelRuntime(items[0], field.getName());
					} else {
						return this.getSystemRTGroovyContext().getModelRuntime(field.getType(), items[0]);
					}

				} else {
					return this.getSystemRTGroovyContext().getModelRuntime(items[0], items[1]);
				}
			} else {
				return this.getSystemRTGroovyContext().getModelRuntime(field.getType(), field.getName());
			}
		} else {
			return this.getSystemRTGroovyContext().getModelRuntime(field.getType(), field.getName());
		}
	}

	protected Object getRealValue(Class<?> type, Object objValue) throws Exception {

		if (type.equals(String.class)) {
			return objValue.toString();
		}

		if (type.equals(BigInteger.class)) {
			return DataTypeUtils.getBigIntegerValue(objValue, null);
		}

		if (type.equals(BigDecimal.class)) {
			return DataTypeUtils.getBigDecimalValue(objValue, null);
		}

		if (type.equals(int.class) || type.equals(Integer.class)) {
			return DataTypeUtils.getIntegerValue(objValue, null);
		}
		if (type.equals(long.class) || type.equals(Long.class)) {
			return DataTypeUtils.getLongValue(objValue, null);
		}

		if (type.equals(double.class) || type.equals(Double.class)) {
			return DataTypeUtils.getDoubleValue(objValue, null);
		}

		if (java.sql.Timestamp.class.isAssignableFrom(type)) {
			return DataTypeUtils.getDateTimeValue(objValue, null);
		}

		if (type.equals(boolean.class) || type.equals(Boolean.class)) {
			String strValue = objValue.toString();
			return strValue.equalsIgnoreCase("1") || strValue.equalsIgnoreCase("true");
		}

		return objValue;
	}

	@Override
	public IModelRTScript createModelRTScript(Object owner, String strScriptCode) {
		return createModelRTScript(owner, strScriptCode, ModelRTScriptBase.class);
	}

	@Override
	public <T> T createModelRTScript(Object owner, String strScriptCode, Class<? extends ModelRTScriptBase> cls) {
		CompilerConfiguration compilerConfiguration = new CompilerConfiguration();
		compilerConfiguration.setScriptBaseClass(cls.getName());
		try (GroovyClassLoader classLoader = new GroovyClassLoader(Thread.currentThread().getContextClassLoader())) {
			GroovyShell groovyShell = new GroovyShell(classLoader, compilerConfiguration);
			Script script = groovyShell.parse(strScriptCode);
			((ModelRTScriptBase) script).setOwner(owner);
			script.run();
			return (T) script;
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("建立模型运行时脚本对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public Object getFieldValue(IEntityBase objEntity, String strFieldName) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");
		
		return getEntity(objEntity).get(strFieldName.toLowerCase());
	}

	@Override
	public void setFieldValue(IEntityBase objEntity, String strFieldName, Object objValue) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");
		
		getEntity(objEntity).set(strFieldName.toLowerCase(), objValue);
	}

	@Override
	public boolean containsFieldValue(IEntityBase objEntity, String strFieldName) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");
		
		return getEntity(objEntity).contains(strFieldName.toLowerCase());
	}

	@Override
	public void resetFieldValue(IEntityBase objEntity, String strFieldName) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");
		
		getEntity(objEntity).reset(strFieldName.toLowerCase());
	}
	
	protected IEntity getEntity(IEntityBase iEntityBase) {
		if (!(iEntityBase instanceof IEntity)) {
			throw new SystemRuntimeException(this, String.format("无法识别的数据对象[%1$s]", iEntityBase.getClass()));
		}
		return (IEntity) iEntityBase;
	}
	
	@Override
	public GroovyClassLoader getGroovyClassLoader() {
		return this.groovyClassLoader;
	}
	
	@Override
	public Template getGroovyTemplate(String strTemplate) throws Exception{
		Template template = templateCacheMap.get(strTemplate);
		if (template == null) {
			StringReader reader = new StringReader(strTemplate);
			template = engine.createTemplate(reader);
			if(templateCacheMap.size() > TEMPLATECACHE_SIZE) {
				templateCacheMap.clear();
			}			
			templateCacheMap.put(strTemplate, template);
		}
		return template;
	}
	
	public ISystemModuleUtilRuntime getSystemModuleUtilRuntime(String strTag, boolean bTryMode) {
		if(bTryMode) {
			return null;
		}
		throw new SystemRuntimeException(this, "没有实现");
	}
	
	@Override
	public void registerModelRuntimeShutdownable(IModelRuntimeShutdownable iModelRuntimeShutdownable) {
		Assert.notNull(iModelRuntimeShutdownable, "传入可关闭模型运行时对象无效");
		synchronized (this.modelRuntimeShutdownableList) {
			modelRuntimeShutdownableList.add(iModelRuntimeShutdownable);
		}
	}
	
	@Override
	public void unregisterModelRuntimeShutdownable(IModelRuntimeShutdownable iModelRuntimeShutdownable) {
		Assert.notNull(iModelRuntimeShutdownable, "传入可关闭模型运行时对象无效");
		synchronized (this.modelRuntimeShutdownableList) {
			modelRuntimeShutdownableList.remove(iModelRuntimeShutdownable);
		}
	}
	
	@Override
	protected void onBeforeStart() throws Exception {
		this.bAutowareObjectList = false;
		if (!ObjectUtils.isEmpty(this.autowareObjectList)) {
			for (Object object : this.autowareObjectList) {
				this.doAutowareObject(object, object.getClass());
			}
			this.autowareObjectList.clear();
		}
		super.onBeforeStart();
	}

	@Override
	protected void onShutdown() throws Exception {
		shutdownThreadPoolExecutors();
		
		synchronized (this.modelRuntimeShutdownableList) {
			for(IModelRuntimeShutdownable iModelRuntimeShutdownable : this.modelRuntimeShutdownableList) {
				try {
					iModelRuntimeShutdownable.shutdown();
				}
				catch (Exception ex) {
					log.error(String.format("关闭模型[%1$s]运行时对象发生异常，%2$s", iModelRuntimeShutdownable, ex.getMessage()), ex);
				}
			}
			this.modelRuntimeShutdownableList.clear();
		}
		
		super.onShutdown();
		
		try {
			if(this.engine != null) {
				this.engine = null;
			}
			if(this.groovyClassLoader != null) {
				this.groovyClassLoader.close();
				this.groovyClassLoader = null;
			}
			if(this.templateCacheMap != null) {
				this.templateCacheMap.clear();
			}
		}
		catch (Exception ex) {
			log.error(String.format("关闭Groovy动态类加载对象发生异常，%1$s", ex.getMessage()), ex);
		}
		
		
		timerTaskList.clear();
		timerTaskList2.clear();
	}
}
