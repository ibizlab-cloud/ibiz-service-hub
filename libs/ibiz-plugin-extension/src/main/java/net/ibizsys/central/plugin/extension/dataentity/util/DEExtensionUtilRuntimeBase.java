package net.ibizsys.central.plugin.extension.dataentity.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.DEUtilRuntimeBase;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionField;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionForm;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionMainState;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionNotify;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflow;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflowDefinition;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.central.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.central.dataentity.util.IDEUtilRuntimeContext;
import net.ibizsys.central.plugin.extension.addin.IPSModelTranspilerEx;
import net.ibizsys.central.plugin.extension.dataentity.util.addin.IDEExtensionUtilRTAddin;
import net.ibizsys.central.plugin.extension.dataentity.util.logic.DataEntityOnChangeLogic;
import net.ibizsys.central.plugin.extension.dataentity.util.proxy.DELogicRuntimeProxy;
import net.ibizsys.central.plugin.extension.dataentity.util.proxy.DEMSLogicRuntimeProxy;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.codegen.core.util.StdDataTypeUtils;
import net.ibizsys.codegen.groovy.support.PSDataEntityExtension;
import net.ibizsys.codegen.groovy.util.GroovyUtils;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.DELogicThreadRunMode;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.StdDataType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.app.view.PSAppDEViewImpl;
import net.ibizsys.model.app.view.PSAppViewImpl;
import net.ibizsys.model.app.view.PSAppViewRefImpl;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.form.PSDEFormImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSDEForm;
import net.ibizsys.psmodel.core.domain.PSWFLink;
import net.ibizsys.psmodel.core.domain.PSWFProcess;
import net.ibizsys.psmodel.core.domain.PSWFVersion;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.PSModelEnums.LogicSubType;
import net.ibizsys.psmodel.core.util.PSModelEnums.NotifySubType;
import net.ibizsys.psmodel.core.util.PSModelEnums.WFProcessType;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.Log;

public abstract class DEExtensionUtilRuntimeBase extends DEUtilRuntimeBase implements IDEExtensionUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEExtensionUtilRuntimeBase.class);
	public final static String EXTENSION_FIELD = "FIELD";
	public final static String EXTENSION_MAINSTATE = "MAINSTATE";
	public final static String EXTENSION_LOGIC = "LOGIC";
	public final static String EXTENSION_LOGIC_PREFIX = "LOGIC_";
	public final static String EXTENSION_LOGIC_ATTACHTODEACTION = "LOGIC_ATTACHTODEACTION";
	public final static String EXTENSION_LOGIC_ATTACHTODEDATASET = "LOGIC_ATTACHTODEDATASET";
	public final static String EXTENSION_LOGIC_WEBHOOK = "LOGIC_WEBHOOK";
	public final static String EXTENSION_LOGIC_TIMERTASK = "LOGIC_TIMERTASK";
	public final static String EXTENSION_LOGIC_EVENTHOOK = "LOGIC_EVENTHOOK";
	public final static String EXTENSION_LOGIC_FIELDCHANGEHOOK = "LOGIC_FIELDCHANGEHOOK";


	public final static String EXTENSION_NOTIFY_EVENTHOOK = "NOTIFY_EVENTHOOK";
	public final static String EXTENSION_NOTIFY_FIELDCHANGEHOOK = "NOTIFY_FIELDCHANGEHOOK";

	public final static String FIELD_EXTENSION_FORMAT = "FIELD__%1$s__%2$s";

	final static String APPDEVIEWTYPE_DEMOBWFDYNAACTIONVIEW = "DEMOBWFDYNAACTIONVIEW";//实体移动端工作流动态操作视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW = "DEMOBWFDYNAEDITVIEW";//实体移动端工作流动态编辑视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW3 = "DEMOBWFDYNAEDITVIEW3";//实体移动端工作流动态编辑视图（分页关系）
	//final static String APPDEVIEWTYPE_DEMOBWFDYNAEXPMDVIEW = "DEMOBWFDYNAEXPMDVIEW";//实体移动端工作流动态导航多数据视图
	final static String APPDEVIEWTYPE_DEMOBWFDYNASTARTVIEW = "DEMOBWFDYNASTARTVIEW";//实体移动端工作流动态启动视图

	final static String APPDEVIEWTYPE_DEWFDYNAACTIONVIEW = "DEWFDYNAACTIONVIEW";//实体工作流动态操作视图
	final static String APPDEVIEWTYPE_DEWFDYNAEDITVIEW = "DEWFDYNAEDITVIEW";//实体工作流动态编辑视图
	final static String APPDEVIEWTYPE_DEWFDYNAEDITVIEW3 = "DEWFDYNAEDITVIEW3";//实体工作流动态视图（分页关系）
	//final static String APPDEVIEWTYPE_DEWFDYNAEXPGRIDVIEW = "DEWFDYNAEXPGRIDVIEW";//实体工作流动态导航表格视图
	final static String APPDEVIEWTYPE_DEWFDYNASTARTVIEW = "DEWFDYNASTARTVIEW";//实体工作流动态启动视图

	final static String APPDEVIEWTYPE_DEEDITVIEW = "DEEDITVIEW";//实体编辑视图
	final static String APPDEVIEWTYPE_DEEDITVIEW2 = "DEEDITVIEW2";//实体编辑视图（左右关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW3 = "DEEDITVIEW3";//实体编辑视图（分页关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW4 = "DEEDITVIEW4";//实体编辑视图（上下关系）
	final static String APPDEVIEWTYPE_DEEDITVIEW9 = "DEEDITVIEW9";//实体编辑视图（部件视图）

	final static String APPDEVIEWTYPE_DEMOBEDITVIEW = "DEMOBEDITVIEW";//实体移动端编辑视图
	final static String APPDEVIEWTYPE_DEMOBEDITVIEW3 = "DEMOBEDITVIEW3";//实体移动端编辑视图（分页关系）
	final static String APPDEVIEWTYPE_DEMOBEDITVIEW9 = "DEMOBEDITVIEW9";//实体移动端编辑视图（部件视图）

	final static String APPDEVIEWTYPE_DEMOBOPTVIEW = "DEMOBOPTVIEW";//实体移动端选项操作视图
	final static String APPDEVIEWTYPE_DEOPTVIEW = "DEOPTVIEW";//实体选项操作视图


	/**
	 * 动态视图模式：实体工作流视图
	 */
	public final static String DYNAVIEWMODE_DEWFVIEW = "DEWFVIEW";

	/**
	 * 动态视图模式：实体编辑视图
	 */
	public final static String DYNAVIEWMODE_DEEDITVIEW = "DEEDITVIEW";

	public final static String DYNAVIEWMODE_DEOPTVIEW = "DEOPTVIEW";


	private final static Map<String, String> DynaViewModeMap = new HashMap<String, String>();
	static {
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAACTIONVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNAEDITVIEW3, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBWFDYNASTARTVIEW, DYNAVIEWMODE_DEWFVIEW);

		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNAACTIONVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNAEDITVIEW, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNAEDITVIEW3, DYNAVIEWMODE_DEWFVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEWFDYNASTARTVIEW, DYNAVIEWMODE_DEWFVIEW);


		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW2, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW3, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW4, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEEDITVIEW9, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW3, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBEDITVIEW9, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEMOBOPTVIEW, DYNAVIEWMODE_DEEDITVIEW);
		DynaViewModeMap.put(APPDEVIEWTYPE_DEOPTVIEW, DYNAVIEWMODE_DEEDITVIEW);
	}




	private Map<String, Map<String, ? extends IEntity>> extensionBackupMap = new ConcurrentHashMap<String, Map<String, ? extends IEntity>>();

	private Map<String, DELogicRuntimeProxy> deLogicRuntimeProxyMap = new HashMap<String, DELogicRuntimeProxy>();
	private Map<String, DEMSLogicRuntimeProxy> deMSLogicRuntimeProxyMap = new HashMap<String, DEMSLogicRuntimeProxy>();

	private Map<String, List<IPSDEField>> psDEFieldListMap = new ConcurrentHashMap<String, List<IPSDEField>>();
	private Map<String, IDEMSLogicRuntime> deMSLogicRuntimeMap = new ConcurrentHashMap<String, IDEMSLogicRuntime>();

	private Map<String, List<IDELogicRuntime>> deLogicAttachToDEActionRuntimeMap = new ConcurrentHashMap<String, List<IDELogicRuntime>>();

	private Map<String, String> deActionLogicMap = new ConcurrentHashMap<String, String>();
	private Map<String, String> deDataSetLogicMap = new ConcurrentHashMap<String, String>();

	private Map<String, List<IDELogicRuntime>> deLogicEventHookRuntimeMap = new ConcurrentHashMap<String, List<IDELogicRuntime>>();
	private List<DataEntityOnChangeLogic> deLogicDEFieldHookRuntimeList = new ArrayList<DataEntityOnChangeLogic>();

	// private Map<String, String> deActionLogicMap = new
	// ConcurrentHashMap<String, String>();

	private Map<V2SystemExtensionLogic, IDELogicRuntime> timerTaskDELogicRuntimeMap = new ConcurrentHashMap<V2SystemExtensionLogic, IDELogicRuntime>();
	private Map<V2SystemExtensionLogic, IDELogicRuntime> webHookDELogicRuntimeMap = new ConcurrentHashMap<V2SystemExtensionLogic, IDELogicRuntime>();

	private Map<String, List<IDENotifyRuntime>> deNotifyEventHookRuntimeMap = new ConcurrentHashMap<String, List<IDENotifyRuntime>>();
	private Map<String, List<IDENotifyRuntime>> deNotifyFieldChangeHookRuntimeMap = new ConcurrentHashMap<String, List<IDENotifyRuntime>>();

	private IDataEntityRuntime logDataEntityRuntime = null;

	private String strDataEntityTag = null;

	private Map<String, IPSDEField> logPSDEFieldMap = new HashMap<String, IPSDEField>();
	private IPSDataEntity iPSDataEntity = null;
	private Map<String, IPSDERBase> extendPSDERMap = new LinkedHashMap<String, IPSDERBase>();
	private V2SystemExtensionSuite v2SystemExtensionSuite;

	private ISysCloudExtensionUtilRuntime iSysCloudExtensionUtilRuntime = null;


	private String strLastSystemExtensionFieldCacheData = null;
	private String strLastSystemExtensionFormCacheData = null;

	@Override
	protected IDEUtilRuntimeContext createModelRuntimeContext() {
		return new DEExtensionUtilRuntimeContextBase<IDEExtensionUtilRuntime, IDEUtilRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public V2SystemExtensionSuite getV2SystemExtensionSuite(boolean bTryMode) throws Exception {
				return getSelf().getV2SystemExtensionSuite(bTryMode);
			}

			@Override
			public Object executeLogic(IDELogicRuntime iDELogicRuntime, Object[] args, Object tag) throws Throwable {
				return getSelf().executeLogic(iDELogicRuntime, args, tag);
			}
		};
	}

	@Override
	protected IDEExtensionUtilRuntimeContext getModelRuntimeContext() {
		return (IDEExtensionUtilRuntimeContext)super.getModelRuntimeContext();
	}

	@Override
	protected void onInit() throws Exception {
		this.iPSDataEntity = this.getDataEntityRuntime().getPSDataEntity();
		this.strDataEntityTag = PSModelUtils.calcFullUniqueTag2(this.iPSDataEntity);

		if (this.getLogDataEntityRuntime(true) == null) {
			prepareLogDataEntityRuntime();
		}

		fillLogPSDEFieldMap(this.logPSDEFieldMap);

		List<IPSDERBase> minorPSDERs = this.iPSDataEntity.getMinorPSDERs();
		if (!ObjectUtils.isEmpty(minorPSDERs)) {
			for (IPSDERBase iPSDERBase : minorPSDERs) {
				if (iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
					if ((iPSDER1N.getMasterRS() & DER1NMasterRS.EXTENSION.value) == DER1NMasterRS.EXTENSION.value) {
						extendPSDERMap.put(iPSDER1N.getPSPickupDEFieldMust().getName(), iPSDERBase);
					}
					continue;
				}

				if (iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
					if (DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType()) || DERSubType.DER11.value.equals(iPSDERCustom.getDERSubType())) {
						if (iPSDERCustom.getPickupPSDEField() != null && ((iPSDERCustom.getMasterRS() & DER1NMasterRS.EXTENSION.value) == DER1NMasterRS.EXTENSION.value)) {
							extendPSDERMap.put(iPSDERCustom.getPickupPSDEField().getName(), iPSDERBase);
						}
					}
					continue;
				}
			}
		}

		super.onInit();
	}

	@Override
	protected void prepareAddinRepo() throws Exception {
		this.prepareAddinRepo(this.getModelRuntimeContext(), IDEExtensionUtilRTAddin.class, String.format("%1$s:",this.getDataEntityTag()));
	}

	private DEExtensionUtilRuntimeBase getSelf() {
		return this;
	}

	protected ISysCloudExtensionUtilRuntime getSysCloudExtensionUtilRuntime(){
		if(this.iSysCloudExtensionUtilRuntime == null) {
			this.iSysCloudExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudExtensionUtilRuntime.class, false);
		}
		return this.iSysCloudExtensionUtilRuntime;
	}

	protected void prepareLogDataEntityRuntime() throws Exception {
		if (this.getPSDEUtil().getUtilPSDE() != null) {
			IDataEntityRuntime logDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDEUtil().getUtilPSDE().getId());
			this.setLogDataEntityRuntime(logDataEntityRuntime);
		}
	}

	protected void fillLogPSDEFieldMap(Map<String, IPSDEField> logPSDEFieldMap) throws Exception {
		IDataEntityRuntime logDataEntityRuntime = this.getLogDataEntityRuntime(true);
		if (logDataEntityRuntime == null) {
			return;
		}

		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_TYPE, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_SUBTYPE, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_ID, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_END_AT, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_START_AT, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_INFO, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_STATE, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_LEVEL, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_CATEGORY, null);
		logPSDEFieldMap.put(EXTENSIONLOG_PREDEFINEDFIELD_ELAPSED_TIME, null);

		java.util.List<IPSDEField> psDEFieldList = logDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		if (!ObjectUtils.isEmpty(psDEFieldList)) {
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!StringUtils.hasLength(iPSDEField.getFieldTag())) {
					continue;
				}
				String strTag = iPSDEField.getFieldTag().toUpperCase();
				if (!logPSDEFieldMap.containsKey(strTag)) {
					continue;
				}

				if (logPSDEFieldMap.get(strTag) == null) {
					logPSDEFieldMap.put(strTag, iPSDEField);
				}
			}

			for (IPSDEField iPSDEField : psDEFieldList) {
				String strTag = iPSDEField.getName().toUpperCase();
				if (!logPSDEFieldMap.containsKey(strTag)) {
					continue;
				}

				if (logPSDEFieldMap.get(strTag) == null) {
					logPSDEFieldMap.put(strTag, iPSDEField);
				}
			}
		}

	}

	protected String getDataEntityTag() {
		return this.strDataEntityTag;
	}

	protected final IPSDataEntity getPSDataEntity() {
		return this.iPSDataEntity;
	}

	protected Map<String, IPSDERBase> getExtendPSDERMap() {
		return this.extendPSDERMap;
	}

	protected Map<String, IPSDEField> getLogPSDEFieldMap() {
		return this.logPSDEFieldMap;
	}

	protected IDataEntityRuntime getLogDataEntityRuntime(boolean bTryMode) throws Exception {
		if (this.logDataEntityRuntime != null || bTryMode) {
			return this.logDataEntityRuntime;
		}
		throw new Exception("日志实体运行时对象无效");
	}

	protected void setLogDataEntityRuntime(IDataEntityRuntime logDataEntityRuntime) {
		this.logDataEntityRuntime = logDataEntityRuntime;
	}

	@Override
	public void reloadExtension(V2SystemExtensionSuite v2SystemExtensionSuite) {
		try {
			this.v2SystemExtensionSuite = v2SystemExtensionSuite;
			onReloadExtension(v2SystemExtensionSuite);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("重新加载扩展发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReloadExtension(V2SystemExtensionSuite v2SystemExtensionSuite) throws Throwable {
		java.util.List<V2SystemExtensionField> v2SystemExtensionFieldList = null;
		if (v2SystemExtensionSuite != null) {
			java.util.List<V2SystemExtensionField> list = v2SystemExtensionSuite.getFields();
			if (!ObjectUtils.isEmpty(list)) {
				v2SystemExtensionFieldList = new ArrayList<V2SystemExtensionField>();
				for (V2SystemExtensionField v2SystemExtensionField : list) {
					if (this.getDataEntityTag().equalsIgnoreCase(v2SystemExtensionField.getDataEntityTag())) {
						v2SystemExtensionFieldList.add(v2SystemExtensionField);
					}
				}
			}
		}

		java.util.List<V2SystemExtensionMainState> v2SystemExtensionMainStateList = null;
		if (v2SystemExtensionSuite != null) {
			java.util.List<V2SystemExtensionMainState> list = v2SystemExtensionSuite.getMainStates();
			if (!ObjectUtils.isEmpty(list)) {
				v2SystemExtensionMainStateList = new ArrayList<V2SystemExtensionMainState>();
				for (V2SystemExtensionMainState v2SystemExtensionMainState : list) {
					if (this.getDataEntityTag().equalsIgnoreCase(v2SystemExtensionMainState.getDataEntityTag())) {
						v2SystemExtensionMainStateList.add(v2SystemExtensionMainState);
					}
				}
			}
		}

		java.util.List<V2SystemExtensionLogic> v2SystemExtensionLogicList = null;
		if (v2SystemExtensionSuite != null) {
			java.util.List<V2SystemExtensionLogic> list = v2SystemExtensionSuite.getLogics();
			if (!ObjectUtils.isEmpty(list)) {
				v2SystemExtensionLogicList = new ArrayList<V2SystemExtensionLogic>();
				for (V2SystemExtensionLogic v2SystemExtensionLogic : list) {
					if (this.getDataEntityTag().equalsIgnoreCase(v2SystemExtensionLogic.getDataEntityTag())) {
						v2SystemExtensionLogicList.add(v2SystemExtensionLogic);
					}
				}
			}
		}

		java.util.List<V2SystemExtensionNotify> v2SystemExtensionNotifyList = null;
		if (v2SystemExtensionSuite != null) {
			java.util.List<V2SystemExtensionNotify> list = v2SystemExtensionSuite.getNotifies();
			if (!ObjectUtils.isEmpty(list)) {
				v2SystemExtensionNotifyList = new ArrayList<V2SystemExtensionNotify>();
				for (V2SystemExtensionNotify v2SystemExtensionNotify : list) {
					if (this.getDataEntityTag().equalsIgnoreCase(v2SystemExtensionNotify.getDataEntityTag())) {
						v2SystemExtensionNotifyList.add(v2SystemExtensionNotify);
					}
				}
			}
		}

		//this.reloadSystemExtensionFields(v2SystemExtensionFieldList);
		this.reloadSystemExtensionMainStates(v2SystemExtensionMainStateList);
		this.reloadSystemExtensionLogics(v2SystemExtensionLogicList);
		this.reloadSystemExtensionNotifies(v2SystemExtensionNotifyList);
	}

	protected V2SystemExtensionSuite getV2SystemExtensionSuite(boolean bTryMode) throws Exception {
		V2SystemExtensionSuite v2SystemExtensionSuite = this.v2SystemExtensionSuite;
		if (v2SystemExtensionSuite != null || bTryMode) {
			return v2SystemExtensionSuite;
		}
		throw new Exception(String.format("无法获取系统扩展配置"));
	}

	protected void reloadSystemExtensionFields(java.util.List<V2SystemExtensionField> v2SystemExtensionFieldList) throws Throwable {
		Map<String, List<IPSDEField>> psDEFieldListMap = new HashMap<String, List<IPSDEField>>();

		Map<String, V2SystemExtensionField> lastData = (Map<String, V2SystemExtensionField>) this.extensionBackupMap.get(EXTENSION_FIELD);
		Map<String, V2SystemExtensionField> curData = new LinkedHashMap<String, V2SystemExtensionField>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionFieldList)) {
			for (V2SystemExtensionField v2SystemExtensionField : v2SystemExtensionFieldList) {
				if (!StringUtils.hasLength(v2SystemExtensionField.getRuntimeModel())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionField.getScopeTag())) {
					continue;
				}

				curData.put(v2SystemExtensionField.getId(), v2SystemExtensionField);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		for (V2SystemExtensionField v2SystemExtensionField : curData.values()) {
			ObjectNode fieldNode = JsonUtils.toObjectNode(v2SystemExtensionField.getRuntimeModel());
			IPSDEField iPSDEField = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDEField.class, fieldNode);
			List<IPSDEField> psDEFieldList = psDEFieldListMap.get(v2SystemExtensionField.getScopeTag().toLowerCase());
			if (psDEFieldList == null) {
				psDEFieldList = new ArrayList<IPSDEField>();
				psDEFieldListMap.put(v2SystemExtensionField.getScopeTag().toLowerCase(), psDEFieldList);
			}

			psDEFieldList.add(iPSDEField);
		}

		synchronized (this.psDEFieldListMap) {
			this.psDEFieldListMap.clear();
			this.psDEFieldListMap.putAll(psDEFieldListMap);
		}

		this.extensionBackupMap.put(EXTENSION_FIELD, curData);
	}

	protected void reloadSystemExtensionMainStates(java.util.List<V2SystemExtensionMainState> v2SystemExtensionMainStateList) throws Throwable {

		Map<String, IDEMSLogicRuntime> deMSLogicRuntimeMap = new HashMap<String, IDEMSLogicRuntime>();

		Map<String, V2SystemExtensionMainState> lastData = (Map<String, V2SystemExtensionMainState>) this.extensionBackupMap.get(EXTENSION_MAINSTATE);
		Map<String, V2SystemExtensionMainState> curData = new LinkedHashMap<String, V2SystemExtensionMainState>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionMainStateList)) {
			for (V2SystemExtensionMainState v2SystemExtensionMainState : v2SystemExtensionMainStateList) {
				if (!StringUtils.hasLength(v2SystemExtensionMainState.getRuntimeModel())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionMainState.getScopeTag())) {
					continue;
				}

				curData.put(v2SystemExtensionMainState.getId(), v2SystemExtensionMainState);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		for (V2SystemExtensionMainState v2SystemExtensionMainState : curData.values()) {
			ObjectNode deMSLogicNode = JsonUtils.toObjectNode(v2SystemExtensionMainState.getRuntimeModel());
			IPSDEMSLogic iPSDEMSLogic = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDEMSLogic.class, deMSLogicNode);

			try {
				IDEMSLogicRuntime iDEMSLogicRuntime = (IDEMSLogicRuntime) this.getDataEntityRuntime().createDEMSLogicRuntime(iPSDEMSLogic);
				if (iDEMSLogicRuntime == null) {
					throw new Exception(String.format("无法建立实体主状态逻辑运行时对象"));
				}

				iDEMSLogicRuntime.init(this.getDataEntityRuntimeContext(), iPSDEMSLogic);
				deMSLogicRuntimeMap.put(v2SystemExtensionMainState.getMainStateLogicTag().toLowerCase(), iDEMSLogicRuntime);

				String strMSTag = null;
				if (StringUtils.hasLength(iPSDEMSLogic.getLogicTag2())) {
					if (StringUtils.hasLength(iPSDEMSLogic.getLogicTag())) {
						strMSTag = String.format("%1$s__%2$s__%3$s", iPSDEMSLogic.getLogicTag(), iPSDEMSLogic.getLogicTag2(), "*");
					} else {
						strMSTag = String.format("%1$s__%2$s__%3$s", "*", iPSDEMSLogic.getLogicTag2(), "*");
					}
				} else {
					if (StringUtils.hasLength(iPSDEMSLogic.getLogicTag())) {
						strMSTag = String.format("%1$s__%2$s", iPSDEMSLogic.getLogicTag(), "*");
					}
				}
				if (!StringUtils.hasLength(strMSTag)) {
					logEvent(LogLevels.WARN, String.format("扩展主状态迁移逻辑[%1$s][%3$s@%2$s]未定义逻辑标记", iPSDEMSLogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDEMSLogic)));
					log.warn(String.format("主状态逻辑[%1$s]未定义逻辑标记", iPSDEMSLogic.getName()));
				} else {
					// 需要进一步设置上下文数据
					String[] items = v2SystemExtensionMainState.getMainStateLogicTag().split("[@]");
					if (items.length == 1) {
						deMSLogicRuntimeMap.put(strMSTag.toLowerCase(), iDEMSLogicRuntime);
					} else {
						deMSLogicRuntimeMap.put(String.format("%1$s|%2$s", items[0], strMSTag).toLowerCase(), iDEMSLogicRuntime);
					}
				}
			} catch (Throwable ex) {
				log.error(String.format("应用主状态迁移逻辑[%1$s]发生异常，%2$s", v2SystemExtensionMainState.getName(), ex.getMessage()), ex);
				// 更新状态
				logEvent(LogLevels.ERROR, String.format("扩展主状态迁移逻辑[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDEMSLogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDEMSLogic), ex.getMessage()));
			}
		}

		synchronized (this.deMSLogicRuntimeMap) {
			this.deMSLogicRuntimeMap.clear();
			this.deMSLogicRuntimeMap.putAll(deMSLogicRuntimeMap);
		}

		this.extensionBackupMap.put(EXTENSION_MAINSTATE, curData);

	}

	protected void reloadSystemExtensionLogics(java.util.List<V2SystemExtensionLogic> v2SystemExtensionLogicList) throws Throwable {

		// 按类别加载
		String[] logicSubTypes = new String[] { LogicSubType.ATTACHTODEACTION.value, LogicSubType.ATTACHTODEDATASET.value, LogicSubType.WEBHOOK.value, LogicSubType.TIMERTASK.value, LogicSubType.EVENTHOOK.value, LogicSubType.FIELDCHANGEHOOK.value };

		java.util.List<V2SystemExtensionLogic> leaveV2SystemExtensionLogicList = new ArrayList<V2SystemExtensionLogic>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionLogicList)) {
			for (V2SystemExtensionLogic v2SystemExtensionLogic : v2SystemExtensionLogicList) {
				if (!StringUtils.hasLength(v2SystemExtensionLogic.getRuntimeModel())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionLogic.getScopeTag())) {
					continue;
				}

				leaveV2SystemExtensionLogicList.add(v2SystemExtensionLogic);
			}
		}

		java.util.List<V2SystemExtensionLogic> tempV2SystemExtensionLogicList = new ArrayList<V2SystemExtensionLogic>();

		for (String strLogicSubType : logicSubTypes) {
			tempV2SystemExtensionLogicList.clear();
			tempV2SystemExtensionLogicList.addAll(leaveV2SystemExtensionLogicList);
			leaveV2SystemExtensionLogicList.clear();

			java.util.List<V2SystemExtensionLogic> subTypeV2SystemExtensionLogicList = new ArrayList<V2SystemExtensionLogic>();

			for (V2SystemExtensionLogic v2SystemExtensionLogic : tempV2SystemExtensionLogicList) {
				if (strLogicSubType.equalsIgnoreCase(v2SystemExtensionLogic.getExtensionTag4())) {
					subTypeV2SystemExtensionLogicList.add(v2SystemExtensionLogic);
				} else {
					leaveV2SystemExtensionLogicList.add(v2SystemExtensionLogic);
				}
			}

			if (LogicSubType.ATTACHTODEACTION.value.equals(strLogicSubType)) {
				reloadSystemExtensionLogics_AttachToDEAction(subTypeV2SystemExtensionLogicList);
				continue;
			}

			if (LogicSubType.TIMERTASK.value.equals(strLogicSubType)) {
				reloadSystemExtensionLogics_TimerTask(subTypeV2SystemExtensionLogicList);
				continue;
			}

			if (LogicSubType.EVENTHOOK.value.equals(strLogicSubType)) {
				reloadSystemExtensionLogics_EventHook(subTypeV2SystemExtensionLogicList);
				continue;
			}

			if (LogicSubType.FIELDCHANGEHOOK.value.equals(strLogicSubType)) {
				reloadSystemExtensionLogics_DEFieldHook(subTypeV2SystemExtensionLogicList);
				continue;
			}

			if (LogicSubType.WEBHOOK.value.equals(strLogicSubType)) {
				reloadSystemExtensionLogics_WebHook(subTypeV2SystemExtensionLogicList);
				continue;
			}
		}

		// 默认
		//
		//
		//
		//
		// Map<String, IDEMSLogicRuntime> deMSLogicRuntimeMap = new
		// HashMap<String, IDEMSLogicRuntime>();
		//
		// Map<String, V2SystemExtensionLogic> lastData = (Map<String,
		// V2SystemExtensionLogic>)this.extensionBackupMap.get(EXTENSION_LOGIC);
		// Map<String, V2SystemExtensionLogic> curData = new
		// LinkedHashMap<String, V2SystemExtensionLogic>();
		// if (!ObjectUtils.isEmpty(v2SystemExtensionLogicList)) {
		// for (V2SystemExtensionLogic v2SystemExtensionLogic :
		// v2SystemExtensionLogicList) {
		// if (!StringUtils.hasLength(v2SystemExtensionLogic.getRuntimeModel()))
		// {
		// continue;
		// }
		//
		// if (!StringUtils.hasLength(v2SystemExtensionLogic.getScopeTag())) {
		// continue;
		// }
		//
		// curData.put(v2SystemExtensionLogic.getId(), v2SystemExtensionLogic);
		// }
		// }
		//
		// //判断是否一致
		// if(ExtensionUtils.compareExtensions(curData, lastData)) {
		// return;
		// }
		//
		// for(V2SystemExtensionLogic v2SystemExtensionLogic : curData.values())
		// {
		// ObjectNode deMSLogicNode =
		// JsonUtils.toObjectNode(v2SystemExtensionLogic.getRuntimeModel());
		// IPSDEMSLogic iPSDEMSLogic =
		// this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)
		// this.getDataEntityRuntime().getPSDataEntity(), IPSDEMSLogic.class,
		// deMSLogicNode);
		// IDEMSLogicRuntime iDEMSLogicRuntime = (IDEMSLogicRuntime)
		// this.getDataEntityRuntime().createDEMSLogicRuntime(iPSDEMSLogic);
		// if (iDEMSLogicRuntime == null) {
		// throw new Exception(String.format("无法建立实体逻辑[%1$s]运行时对象",
		// iPSDEMSLogic.getName()));
		// }
		//
		// iDEMSLogicRuntime.init(this.getDataEntityRuntimeContext(),
		// iPSDEMSLogic);
		// deMSLogicRuntimeMap.put(v2SystemExtensionLogic.getLogicLogicTag().toLowerCase(),
		// iDEMSLogicRuntime);
		// }
		//
		// synchronized (this.deMSLogicRuntimeMap) {
		// this.deMSLogicRuntimeMap.clear();
		// this.deMSLogicRuntimeMap.putAll(deMSLogicRuntimeMap);
		// }
	}

	protected void reloadSystemExtensionNotifies(java.util.List<V2SystemExtensionNotify> v2SystemExtensionNotifyList) throws Throwable {

		// 按类别加载
		String[] notifySubTypes = new String[] { NotifySubType.EVENTHOOK.value, NotifySubType.FIELDCHANGEHOOK.value };

		java.util.List<V2SystemExtensionNotify> leaveV2SystemExtensionNotifyList = new ArrayList<V2SystemExtensionNotify>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionNotifyList)) {
			for (V2SystemExtensionNotify v2SystemExtensionNotify : v2SystemExtensionNotifyList) {
				if (!StringUtils.hasLength(v2SystemExtensionNotify.getRuntimeModel())) {
					continue;
				}

				if (!StringUtils.hasLength(v2SystemExtensionNotify.getScopeTag())) {
					continue;
				}

				leaveV2SystemExtensionNotifyList.add(v2SystemExtensionNotify);
			}
		}

		java.util.List<V2SystemExtensionNotify> tempV2SystemExtensionNotifyList = new ArrayList<V2SystemExtensionNotify>();

		for (String strNotifySubType : notifySubTypes) {
			tempV2SystemExtensionNotifyList.clear();
			tempV2SystemExtensionNotifyList.addAll(leaveV2SystemExtensionNotifyList);
			leaveV2SystemExtensionNotifyList.clear();

			java.util.List<V2SystemExtensionNotify> subTypeV2SystemExtensionNotifyList = new ArrayList<V2SystemExtensionNotify>();

			for (V2SystemExtensionNotify v2SystemExtensionNotify : tempV2SystemExtensionNotifyList) {
				if (strNotifySubType.equalsIgnoreCase(v2SystemExtensionNotify.getExtensionTag4())) {
					subTypeV2SystemExtensionNotifyList.add(v2SystemExtensionNotify);
				} else {
					leaveV2SystemExtensionNotifyList.add(v2SystemExtensionNotify);
				}
			}

			if (NotifySubType.EVENTHOOK.value.equals(strNotifySubType)) {
				reloadSystemExtensionNotifies_EventHook(subTypeV2SystemExtensionNotifyList);
				continue;
			}

			if (NotifySubType.FIELDCHANGEHOOK.value.equals(strNotifySubType)) {
				reloadSystemExtensionNotifies_FieldChangeHook(subTypeV2SystemExtensionNotifyList);
				continue;
			}

		}

	}

	protected void reloadSystemExtensionLogics_AttachToDEAction(java.util.List<V2SystemExtensionLogic> v2SystemExtensionLogicList) throws Throwable {

		Map<String, V2SystemExtensionLogic> lastData = (Map<String, V2SystemExtensionLogic>) this.extensionBackupMap.get(EXTENSION_LOGIC_ATTACHTODEACTION);
		Map<String, V2SystemExtensionLogic> curData = new LinkedHashMap<String, V2SystemExtensionLogic>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionLogicList)) {
			for (V2SystemExtensionLogic v2SystemExtensionLogic : v2SystemExtensionLogicList) {
				curData.put(v2SystemExtensionLogic.getId(), v2SystemExtensionLogic);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		Map<String, List<IDELogicRuntime>> deLogicAttachToDEActionRuntimeMap = new HashMap<String, List<IDELogicRuntime>>();
		Map<String, String> deActionLogicMap = new HashMap<String, String>();

		for (V2SystemExtensionLogic v2SystemExtensionLogic : curData.values()) {
			ObjectNode deLogicNode = JsonUtils.toObjectNode(v2SystemExtensionLogic.getRuntimeModel());
			IPSDELogic iPSDELogic = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDELogic.class, deLogicNode);
			if (!iPSDELogic.isValid()) {
				continue;
			}

			try {
				IPSDEAction iPSDEAction = iPSDELogic.getAttachToPSDEActionMust();

				IDELogicRuntime iDELogicRuntime = this.createDELogicRuntime(iPSDELogic);
				if (iDELogicRuntime == null) {
					throw new Exception(String.format("无法建立实体逻辑运行时对象"));
				}

				iDELogicRuntime.init(this.getDataEntityRuntimeContext(), iPSDELogic);

				String strTag = String.format("%1$s|%2$s", v2SystemExtensionLogic.getScopeTag(), iPSDEAction.getName()).toLowerCase();
				List<IDELogicRuntime> list = deLogicAttachToDEActionRuntimeMap.get(strTag);
				if (list == null) {
					list = new ArrayList<IDELogicRuntime>();
					deLogicAttachToDEActionRuntimeMap.put(strTag, list);
				}
				list.add(iDELogicRuntime);

				deActionLogicMap.put(String.format("%1$s|%2$s", iPSDEAction.getName(), iPSDELogic.getAttachMode()).toLowerCase(), "");
			} catch (Throwable ex) {
				log.error(String.format("应用附加行为逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
				// 更新状态
				logEvent(LogLevels.ERROR, String.format("扩展附加行为逻辑[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic), ex.getMessage()));
			}
		}

		synchronized (this.deLogicAttachToDEActionRuntimeMap) {
			this.deLogicAttachToDEActionRuntimeMap.clear();
			this.deLogicAttachToDEActionRuntimeMap.putAll(deLogicAttachToDEActionRuntimeMap);

			this.deActionLogicMap.clear();
			this.deActionLogicMap.putAll(deActionLogicMap);
		}

		this.extensionBackupMap.put(EXTENSION_LOGIC_ATTACHTODEACTION, curData);
	}

	protected void reloadSystemExtensionLogics_TimerTask(java.util.List<V2SystemExtensionLogic> v2SystemExtensionLogicList) throws Throwable {

		Map<String, V2SystemExtensionLogic> lastData = (Map<String, V2SystemExtensionLogic>) this.extensionBackupMap.get(EXTENSION_LOGIC_TIMERTASK);
		Map<String, V2SystemExtensionLogic> curData = new LinkedHashMap<String, V2SystemExtensionLogic>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionLogicList)) {
			for (V2SystemExtensionLogic v2SystemExtensionLogic : v2SystemExtensionLogicList) {
				curData.put(v2SystemExtensionLogic.getId(), v2SystemExtensionLogic);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		Map<V2SystemExtensionLogic, IDELogicRuntime> timerTaskDELogicRuntimeMap = new HashMap<V2SystemExtensionLogic, IDELogicRuntime>();

		for (V2SystemExtensionLogic v2SystemExtensionLogic : curData.values()) {
			ObjectNode deLogicNode = JsonUtils.toObjectNode(v2SystemExtensionLogic.getRuntimeModel());
			IPSDELogic iPSDELogic = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDELogic.class, deLogicNode);
			if (!iPSDELogic.isValid()) {
				logEvent(LogLevels.WARN, String.format("扩展定时逻辑[%1$s][%3$s@%2$s]未被启用，忽略加载", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
				continue;
			}

			try {
				if (!StringUtils.hasLength(iPSDELogic.getTimerPolicy())) {
					log.warn(String.format("实体逻辑[%1$s]未指定定时策略", iPSDELogic.getName()));
					continue;
				}
				IDELogicRuntime iDELogicRuntime = this.createDELogicRuntime(iPSDELogic);
				if (iDELogicRuntime == null) {
					throw new Exception(String.format("无法建立实体逻辑运行时对象"));
				}

				iDELogicRuntime.init(this.getDataEntityRuntimeContext(), iPSDELogic);
				v2SystemExtensionLogic.set("timerpolicy", iPSDELogic.getTimerPolicy());
				v2SystemExtensionLogic.set("validflag", true);
				timerTaskDELogicRuntimeMap.put(v2SystemExtensionLogic, iDELogicRuntime);

				logEvent(LogLevels.INFO, String.format("扩展定时逻辑[%1$s][%3$s@%2$s]加载成功", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
			} catch (Throwable ex) {
				log.error(String.format("应用定时处理逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
				logEvent(LogLevels.ERROR, String.format("扩展定时逻辑[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic), ex.getMessage()));
			}
		}

		synchronized (this.timerTaskDELogicRuntimeMap) {
			this.timerTaskDELogicRuntimeMap.clear();
			this.timerTaskDELogicRuntimeMap.putAll(timerTaskDELogicRuntimeMap);
		}
		this.extensionBackupMap.put(EXTENSION_LOGIC_TIMERTASK, curData);
	}

	protected void reloadSystemExtensionLogics_EventHook(java.util.List<V2SystemExtensionLogic> v2SystemExtensionLogicList) throws Throwable {

		Map<String, V2SystemExtensionLogic> lastData = (Map<String, V2SystemExtensionLogic>) this.extensionBackupMap.get(EXTENSION_LOGIC_EVENTHOOK);
		Map<String, V2SystemExtensionLogic> curData = new LinkedHashMap<String, V2SystemExtensionLogic>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionLogicList)) {
			for (V2SystemExtensionLogic v2SystemExtensionLogic : v2SystemExtensionLogicList) {
				curData.put(v2SystemExtensionLogic.getId(), v2SystemExtensionLogic);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		Map<String, List<IDELogicRuntime>> deLogicEventHookRuntimeMap = new HashMap<String, List<IDELogicRuntime>>();

		for (V2SystemExtensionLogic v2SystemExtensionLogic : curData.values()) {
			ObjectNode deLogicNode = JsonUtils.toObjectNode(v2SystemExtensionLogic.getRuntimeModel());

			IPSDELogic iPSDELogic = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDELogic.class, deLogicNode);
			if (!iPSDELogic.isValid()) {
				logEvent(LogLevels.WARN, String.format("扩展事件逻辑[%1$s][%3$s@%2$s]未被启用，忽略加载", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
				continue;
			}

			try {
				String strEvents = iPSDELogic.getEvents();
				if (!StringUtils.hasLength(strEvents)) {
					throw new Exception(String.format("未指定监控事件"));
				}

				IDELogicRuntime iDELogicRuntime = this.createDELogicRuntime(iPSDELogic);
				if (iDELogicRuntime == null) {
					throw new Exception(String.format("无法建立运行时对象"));
				}

				iDELogicRuntime.init(this.getDataEntityRuntimeContext(), iPSDELogic);

				String[] events = strEvents.replace(",", ";").split("[;]");
				for (String strEvent : events) {
					String strTag = String.format("%1$s|%2$s", v2SystemExtensionLogic.getScopeTag(), strEvent).toLowerCase();
					List<IDELogicRuntime> list = deLogicEventHookRuntimeMap.get(strTag);
					if (list == null) {
						list = new ArrayList<IDELogicRuntime>();
						deLogicEventHookRuntimeMap.put(strTag, list);
					}
					list.add(iDELogicRuntime);
				}

				logEvent(LogLevels.INFO, String.format("扩展事件逻辑[%1$s][%3$s@%2$s]加载成功", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
			} catch (Throwable ex) {
				log.error(String.format("应用事件逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
				// 更新状态
				logEvent(LogLevels.ERROR, String.format("扩展事件逻辑[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic), ex.getMessage()));
			}
		}

		synchronized (this.deLogicEventHookRuntimeMap) {
			this.deLogicEventHookRuntimeMap.clear();
			this.deLogicEventHookRuntimeMap.putAll(deLogicEventHookRuntimeMap);
		}

		this.extensionBackupMap.put(EXTENSION_LOGIC_EVENTHOOK, curData);
	}

	protected void reloadSystemExtensionLogics_DEFieldHook(java.util.List<V2SystemExtensionLogic> v2SystemExtensionLogicList) throws Throwable {

		Map<String, V2SystemExtensionLogic> lastData = (Map<String, V2SystemExtensionLogic>) this.extensionBackupMap.get(EXTENSION_LOGIC_FIELDCHANGEHOOK);
		Map<String, V2SystemExtensionLogic> curData = new LinkedHashMap<String, V2SystemExtensionLogic>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionLogicList)) {
			for (V2SystemExtensionLogic v2SystemExtensionLogic : v2SystemExtensionLogicList) {
				curData.put(v2SystemExtensionLogic.getId(), v2SystemExtensionLogic);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		List<DataEntityOnChangeLogic> deLogicDEFieldHookRuntimeList = new ArrayList<DataEntityOnChangeLogic>();

		for (V2SystemExtensionLogic v2SystemExtensionLogic : curData.values()) {
			ObjectNode deLogicNode = JsonUtils.toObjectNode(v2SystemExtensionLogic.getRuntimeModel());

			IPSDELogic iPSDELogic = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDELogic.class, deLogicNode);
			if (!iPSDELogic.isValid()) {
				logEvent(LogLevels.WARN, String.format("扩展属性变更逻辑[%1$s][%3$s@%2$s]未被启用，忽略加载", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
				continue;
			}

			try {

				IDELogicRuntime iDELogicRuntime = this.createDELogicRuntime(iPSDELogic);
				if (iDELogicRuntime == null) {
					throw new Exception(String.format("无法建立运行时对象"));
				}

				iDELogicRuntime.init(this.getDataEntityRuntimeContext(), iPSDELogic);

				DataEntityOnChangeLogic dataEntityOnChangeLogic = new DataEntityOnChangeLogic(this.getModelRuntimeContext(), iDELogicRuntime);
				dataEntityOnChangeLogic.install();

				deLogicDEFieldHookRuntimeList.add(dataEntityOnChangeLogic);

				logEvent(LogLevels.INFO, String.format("扩展属性变更逻辑[%1$s][%3$s@%2$s]加载成功", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
			} catch (Throwable ex) {
				log.error(String.format("应用属性变更逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
				// 更新状态
				logEvent(LogLevels.ERROR, String.format("扩展属性变更逻辑[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic), ex.getMessage()));
			}
		}

		synchronized (this.deLogicDEFieldHookRuntimeList) {
			for(DataEntityOnChangeLogic dataEntityOnChangeLogic : this.deLogicDEFieldHookRuntimeList) {
				try {
					dataEntityOnChangeLogic.uninstall();
				}
				catch (Throwable ex) {
					log.error(String.format("应用属性变更逻辑[%1$s]卸载发生异常，%2$s", dataEntityOnChangeLogic.getDELogicRuntime().getName(), ex.getMessage()), ex);
				}
			}
			this.deLogicDEFieldHookRuntimeList.clear();
			this.deLogicDEFieldHookRuntimeList.addAll(deLogicDEFieldHookRuntimeList);
		}

		this.extensionBackupMap.put(EXTENSION_LOGIC_FIELDCHANGEHOOK, curData);
	}

	protected IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic) throws Exception{
		return (IDELogicRuntime) this.getDataEntityRuntime().createDELogicRuntime(iPSDELogic);
	}

	protected void reloadSystemExtensionNotifies_EventHook(java.util.List<V2SystemExtensionNotify> v2SystemExtensionNotifyList) throws Throwable {

		Map<String, V2SystemExtensionNotify> lastData = (Map<String, V2SystemExtensionNotify>) this.extensionBackupMap.get(EXTENSION_NOTIFY_EVENTHOOK);
		Map<String, V2SystemExtensionNotify> curData = new LinkedHashMap<String, V2SystemExtensionNotify>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionNotifyList)) {
			for (V2SystemExtensionNotify v2SystemExtensionNotify : v2SystemExtensionNotifyList) {
				curData.put(v2SystemExtensionNotify.getId(), v2SystemExtensionNotify);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		Map<String, List<IDENotifyRuntime>> deNotifyEventHookRuntimeMap = new HashMap<String, List<IDENotifyRuntime>>();

		for (V2SystemExtensionNotify v2SystemExtensionNotify : curData.values()) {
			ObjectNode deNotifyNode = JsonUtils.toObjectNode(v2SystemExtensionNotify.getRuntimeModel());

			IPSDENotify iPSDENotify = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDENotify.class, deNotifyNode);
			if (!iPSDENotify.isValid()) {
				logEvent(LogLevels.WARN, String.format("扩展事件通知[%1$s][%3$s@%2$s]未被启用，忽略加载", iPSDENotify.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDENotify)));
				continue;
			}

			try {
				String strEvents = iPSDENotify.getEvents();
				if (!StringUtils.hasLength(strEvents)) {
					throw new Exception(String.format("未指定监控事件"));
				}

				IDENotifyRuntime iDENotifyRuntime = this.createDENotifyRuntime(iPSDENotify);
				if (iDENotifyRuntime == null) {
					throw new Exception(String.format("无法建立运行时对象"));
				}

				iDENotifyRuntime.init(this.getDataEntityRuntime(), iPSDENotify);

				String[] events = strEvents.replace(",", ";").split("[;]");
				for (String strEvent : events) {
					String strTag = String.format("%1$s|%2$s", v2SystemExtensionNotify.getScopeTag(), strEvent).toLowerCase();
					List<IDENotifyRuntime> list = deNotifyEventHookRuntimeMap.get(strTag);
					if (list == null) {
						list = new ArrayList<IDENotifyRuntime>();
						deNotifyEventHookRuntimeMap.put(strTag, list);
					}
					list.add(iDENotifyRuntime);
				}

				logEvent(LogLevels.INFO, String.format("扩展事件通知[%1$s][%3$s@%2$s]加载成功", iPSDENotify.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDENotify)));
			} catch (Throwable ex) {
				log.error(String.format("应用事件通知[%1$s]发生异常，%2$s", v2SystemExtensionNotify.getName(), ex.getMessage()), ex);
				// 更新状态
				logEvent(LogLevels.ERROR, String.format("扩展事件通知[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDENotify.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDENotify), ex.getMessage()));
			}
		}

		synchronized (this.deNotifyEventHookRuntimeMap) {
			this.deNotifyEventHookRuntimeMap.clear();
			this.deNotifyEventHookRuntimeMap.putAll(deNotifyEventHookRuntimeMap);
		}

		this.extensionBackupMap.put(EXTENSION_NOTIFY_EVENTHOOK, curData);
	}

	protected void reloadSystemExtensionNotifies_FieldChangeHook(java.util.List<V2SystemExtensionNotify> v2SystemExtensionNotifyList) throws Throwable {

		Map<String, V2SystemExtensionNotify> lastData = (Map<String, V2SystemExtensionNotify>) this.extensionBackupMap.get(EXTENSION_NOTIFY_FIELDCHANGEHOOK);
		Map<String, V2SystemExtensionNotify> curData = new LinkedHashMap<String, V2SystemExtensionNotify>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionNotifyList)) {
			for (V2SystemExtensionNotify v2SystemExtensionNotify : v2SystemExtensionNotifyList) {
				curData.put(v2SystemExtensionNotify.getId(), v2SystemExtensionNotify);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		Map<String, List<IDENotifyRuntime>> deNotifyFieldChangeHookRuntimeMap = new HashMap<String, List<IDENotifyRuntime>>();

		for (V2SystemExtensionNotify v2SystemExtensionNotify : curData.values()) {
			ObjectNode deNotifyNode = JsonUtils.toObjectNode(v2SystemExtensionNotify.getRuntimeModel());

			IPSDENotify iPSDENotify = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDENotify.class, deNotifyNode);
			if (!iPSDENotify.isValid()) {
				logEvent(LogLevels.WARN, String.format("扩展属性变更通知[%1$s][%3$s@%2$s]未被启用，忽略加载", iPSDENotify.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDENotify)));
				continue;
			}

			try {
				String strFields = iPSDENotify.getFields();
				if (!StringUtils.hasLength(strFields)) {
					throw new Exception(String.format("未指定监控属性"));
				}

				IDENotifyRuntime iDENotifyRuntime = this.createDENotifyRuntime(iPSDENotify);
				if (iDENotifyRuntime == null) {
					throw new Exception(String.format("无法建立运行时对象"));
				}

				iDENotifyRuntime.init(this.getDataEntityRuntime(), iPSDENotify);

				String[] fields = strFields.replace(",", ";").split("[;]");
				for (String strField : fields) {
					String strEvent = String.format("%1$s.update:AFTER", PSModelUtils.getParentId(strField));
					String strTag = String.format("%1$s|%2$s", v2SystemExtensionNotify.getScopeTag(), strEvent).toLowerCase();
					List<IDENotifyRuntime> list = deNotifyFieldChangeHookRuntimeMap.get(strTag);
					if (list == null) {
						list = new ArrayList<IDENotifyRuntime>();
						deNotifyFieldChangeHookRuntimeMap.put(strTag, list);
					}
					if (!list.contains(iDENotifyRuntime)) {
						list.add(iDENotifyRuntime);
					}
				}

				logEvent(LogLevels.INFO, String.format("扩展属性变更通知[%1$s][%3$s@%2$s]加载成功", iPSDENotify.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDENotify)));
			} catch (Throwable ex) {
				log.error(String.format("应用属性变更通知[%1$s]发生异常，%2$s", v2SystemExtensionNotify.getName(), ex.getMessage()), ex);
				// 更新状态
				logEvent(LogLevels.ERROR, String.format("扩展属性变更通知[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDENotify.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDENotify), ex.getMessage()));
			}
		}

		synchronized (this.deNotifyFieldChangeHookRuntimeMap) {
			this.deNotifyFieldChangeHookRuntimeMap.clear();
			this.deNotifyFieldChangeHookRuntimeMap.putAll(deNotifyFieldChangeHookRuntimeMap);
		}

		this.extensionBackupMap.put(EXTENSION_NOTIFY_FIELDCHANGEHOOK, curData);
	}

	protected void reloadSystemExtensionLogics_WebHook(java.util.List<V2SystemExtensionLogic> v2SystemExtensionLogicList) throws Throwable {
		Map<String, V2SystemExtensionLogic> lastData = (Map<String, V2SystemExtensionLogic>) this.extensionBackupMap.get(EXTENSION_LOGIC_WEBHOOK);
		Map<String, V2SystemExtensionLogic> curData = new LinkedHashMap<String, V2SystemExtensionLogic>();
		if (!ObjectUtils.isEmpty(v2SystemExtensionLogicList)) {
			for (V2SystemExtensionLogic v2SystemExtensionLogic : v2SystemExtensionLogicList) {
				curData.put(v2SystemExtensionLogic.getId(), v2SystemExtensionLogic);
			}
		}

		// 判断是否一致
		if (ExtensionUtils.compareExtensions(curData, lastData)) {
			return;
		}

		Map<V2SystemExtensionLogic, IDELogicRuntime> webHookDELogicRuntimeMap = new HashMap<V2SystemExtensionLogic, IDELogicRuntime>();

		for (V2SystemExtensionLogic v2SystemExtensionLogic : curData.values()) {
			ObjectNode deLogicNode = JsonUtils.toObjectNode(v2SystemExtensionLogic.getRuntimeModel());

			IPSDELogic iPSDELogic = this.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDELogic.class, deLogicNode);
			if (!iPSDELogic.isValid()) {
				logEvent(LogLevels.WARN, String.format("扩展WebHook[%1$s][%3$s@%2$s]未被启用，忽略加载", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
				continue;
			}

			try {
				IDELogicRuntime iDELogicRuntime = this.createDELogicRuntime(iPSDELogic);
				if (iDELogicRuntime == null) {
					throw new Exception(String.format("无法建立运行时对象"));
				}

				iDELogicRuntime.init(this.getDataEntityRuntimeContext(), iPSDELogic);
				v2SystemExtensionLogic.set("validflag", true);
				webHookDELogicRuntimeMap.put(v2SystemExtensionLogic, iDELogicRuntime);

				logEvent(LogLevels.INFO, String.format("扩展WebHook[%1$s][%3$s@%2$s]加载成功", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic)));
			} catch (Throwable ex) {
				log.error(String.format("应用WebHook[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
				// 更新状态
				logEvent(LogLevels.ERROR, String.format("扩展WebHook[%1$s][%3$s@%2$s]加载失败，%4$s", iPSDELogic.getName(), ServiceHub.getInstance().getId(), PSModelUtils.calcFullUniqueTag2(iPSDELogic), ex.getMessage()));
			}
		}

		synchronized (this.webHookDELogicRuntimeMap) {
			this.webHookDELogicRuntimeMap.clear();
			this.webHookDELogicRuntimeMap.putAll(webHookDELogicRuntimeMap);
		}

		this.extensionBackupMap.put(EXTENSION_LOGIC_WEBHOOK, curData);
	}

	protected IDENotifyRuntime createDENotifyRuntime(IPSDENotify iPSDENotify) throws Exception {
		return (IDENotifyRuntime) this.getDataEntityRuntime().createDENotifyRuntime(iPSDENotify);
	}


	@Override
	public V2SystemExtensionLogic[] getExtensionLogics(String strLogicType) {
		if (EXTENSIONLOGIC_TIMERTASK.equalsIgnoreCase(strLogicType)) {
			return this.timerTaskDELogicRuntimeMap.keySet().toArray(new V2SystemExtensionLogic[this.timerTaskDELogicRuntimeMap.size()]);
		}
		if (EXTENSIONLOGIC_WEBHOOK.equalsIgnoreCase(strLogicType)) {
			return this.webHookDELogicRuntimeMap.keySet().toArray(new V2SystemExtensionLogic[this.webHookDELogicRuntimeMap.size()]);
		}
		return null;
	}

	@Override
	public IDELogicRuntime getDELogicRuntime(String strLogicTag, boolean bProxyMode, boolean bTryMode) {

		return null;
	}

	@Override
	public IDELogicRuntime getDELogicRuntime(IDELogicRuntime iDELogicRuntime) {
		Assert.notNull(iDELogicRuntime, "传入实体逻辑运行时对象无效");
		try {
			return this.onGetDELogicRuntime(iDELogicRuntime);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取实体逻辑运行时扩展代理对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IDELogicRuntime onGetDELogicRuntime(IDELogicRuntime iDELogicRuntime) throws Throwable {
		Assert.notNull(iDELogicRuntime, "传入实体逻辑运行时对象无效");
		DELogicRuntimeProxy deLogicRuntimeProxy = deLogicRuntimeProxyMap.get(iDELogicRuntime.getId());
		if (deLogicRuntimeProxy == null) {
			deLogicRuntimeProxy = new DELogicRuntimeProxy(this.getModelRuntimeContext(), iDELogicRuntime);
			deLogicRuntimeProxyMap.put(iDELogicRuntime.getId(), deLogicRuntimeProxy);
		}
		return deLogicRuntimeProxy.getProxyObject();
	}

	@Override
	public IDEMSLogicRuntime getDEMSLogicRuntime(String strMSLogicTag, boolean bProxyMode, boolean bTryMode) {
		IDEMSLogicRuntime iDEMSLogicRuntime = this.deMSLogicRuntimeMap.get(strMSLogicTag.toLowerCase());
		if (iDEMSLogicRuntime == null) {
			if (bTryMode) {
				return null;
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("无法获取指定实体主状态逻辑[%1$s]", strMSLogicTag));
		}
		return bProxyMode ? this.getDEMSLogicRuntime(iDEMSLogicRuntime) : iDEMSLogicRuntime;
	}

	@Override
	public IDEMSLogicRuntime getDEMSLogicRuntime(IDEMSLogicRuntime iDEMSLogicRuntime) {
		Assert.notNull(iDEMSLogicRuntime, "传入实体主状态逻辑运行时对象无效");
		try {
			return this.onGetDEMSLogicRuntime(iDEMSLogicRuntime);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取实体主状态逻辑运行时扩展代理对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IDEMSLogicRuntime onGetDEMSLogicRuntime(IDEMSLogicRuntime iDEMSLogicRuntime) throws Throwable {
		Assert.notNull(iDEMSLogicRuntime, "传入实体主状态逻辑运行时对象无效");
		DEMSLogicRuntimeProxy deMSLogicRuntimeProxy = deMSLogicRuntimeProxyMap.get(iDEMSLogicRuntime.getId());
		if (deMSLogicRuntimeProxy == null) {
			deMSLogicRuntimeProxy = new DEMSLogicRuntimeProxy(this.getModelRuntimeContext(), iDEMSLogicRuntime);
			deMSLogicRuntimeProxyMap.put(iDEMSLogicRuntime.getId(), deMSLogicRuntimeProxy);
		}
		return deMSLogicRuntimeProxy.getProxyObject();
	}

	@Override
	public IDEMSLogicRuntime getDEMSLogicRuntime(IEntity iEntity, boolean bTryMode) {
		Assert.notNull(iEntity, "未传入数据对象");
		try {
			return this.onGetDEMSLogicRuntime(iEntity, bTryMode);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取传入数据的主状态逻辑运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	@Override
	public boolean isEnableDEMSLogic() {
		return !ObjectUtils.isEmpty(deMSLogicRuntimeMap);
	}
	

	protected IDEMSLogicRuntime onGetDEMSLogicRuntime(IEntity iEntity, boolean bTryMode) throws Throwable {
		if (ObjectUtils.isEmpty(this.getPSDataEntity().getMainStatePSDEFields())) {
			throw new Exception(String.format("实体未定义主状态属性"));
		}

		for (IPSDEField iPSDEField : this.getPSDataEntity().getMainStatePSDEFields()) {
			if (!this.getDataEntityRuntime().containsFieldValue(iEntity, iPSDEField)) {
				log.warn(String.format("数据对象不包含属性[%1$s]，可能会发生错误", iPSDEField.getName()));
				break;
			}
		}

		String strTag = "";
		for (int i = 0; i <= 1; i++) {
			strTag = String.format("%1$s", ((i == 0) ? this.getDataEntityRuntime().getFieldValue(iEntity, this.getPSDataEntity().getMainStatePSDEFields().get(0)) : "*"));
			if (this.getPSDataEntity().getMainStatePSDEFields().size() >= 2) {
				for (int j = 0; j <= 1; j++) {
					String strTag2 = String.format("%1$s__%2$s", strTag, ((j == 0) ? this.getDataEntityRuntime().getFieldValue(iEntity, this.getPSDataEntity().getMainStatePSDEFields().get(1)) : "*"));
					if (this.getPSDataEntity().getMainStatePSDEFields().size() >= 3) {
						for (int k = 0; k <= 1; k++) {
							String strTag3 = String.format("%1$s__%2$s", strTag2, ((k == 0) ? this.getDataEntityRuntime().getFieldValue(iEntity, this.getPSDataEntity().getMainStatePSDEFields().get(2)) : "*"));
							String[] items = this.getMainStateLogicExtensionTags(strTag3, iEntity);
							if (items != null) {
								for (String strMSTag : items) {
									// 判断是否存在
									IDEMSLogicRuntime iDEMSLogicRuntime = this.getDEMSLogicRuntime(strMSTag, false, true);
									if (iDEMSLogicRuntime != null) {
										return (net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime) iDEMSLogicRuntime;
									}
								}
							}

						}
					} else {
						String[] items = this.getMainStateLogicExtensionTags(strTag2, iEntity);
						if (items != null) {
							for (String strMSTag : items) {
								// 判断是否存在
								IDEMSLogicRuntime iDEMSLogicRuntime = this.getDEMSLogicRuntime(strMSTag, false, true);
								if (iDEMSLogicRuntime != null) {
									return (net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime) iDEMSLogicRuntime;
								}
							}
						}
					}
				}
			} else {
				String[] items = this.getMainStateLogicExtensionTags(strTag, iEntity);
				if (items != null) {
					for (String strMSTag : items) {
						// 判断是否存在
						IDEMSLogicRuntime iDEMSLogicRuntime = this.getDEMSLogicRuntime(strMSTag, false, true);
						if (iDEMSLogicRuntime != null) {
							return (net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime) iDEMSLogicRuntime;
						}
					}
				}
			}
		}

		if (bTryMode) {
			return null;
		}

		throw new Exception(String.format("未存在指定数据主状态运行时对象"));
	}

	@Override
	public List<IPSDEField> getPSDEFields(Object dataOrKey) {
		try {
			this.prepareSystemExtensionFields();
			return this.onGetPSDEFields(dataOrKey);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取传入数据扩展属性发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected List<IPSDEField> onGetPSDEFields(Object dataOrKey) throws Throwable {
		if (ObjectUtils.isEmpty(this.psDEFieldListMap)) {
			return null;
		}

		Object key = null;
		List<String> extendParentKeys = new ArrayList<String>();
		if (dataOrKey instanceof IEntity) {
			key = this.getDataEntityRuntime().getFieldValue((IEntityBase) dataOrKey, this.getDataEntityRuntime().getKeyPSDEField());
			Collection<IPSDERBase> psDERBases = this.getExtendPSDERMap() != null ? this.getExtendPSDERMap().values() : null;
			if (!ObjectUtils.isEmpty(psDERBases)) {
				for (IPSDERBase iPSDERBase : psDERBases) {
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						Object value = this.getDataEntityRuntime().getFieldValue((IEntityBase) dataOrKey, iPSDER1N.getPSPickupDEFieldMust());
						if (!ObjectUtils.isEmpty(value)) {
							extendParentKeys.add(String.format(FIELD_EXTENSION_FORMAT, iPSDER1N.getPSPickupDEFieldMust().getName(), value));
						}
						continue;
					}

					if (iPSDERBase instanceof IPSDERCustom) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
						Object value = this.getDataEntityRuntime().getFieldValue((IEntityBase) dataOrKey, iPSDERCustom.getPickupPSDEFieldMust());
						if (!ObjectUtils.isEmpty(value)) {
							extendParentKeys.add(String.format(FIELD_EXTENSION_FORMAT, iPSDERCustom.getPickupPSDEFieldMust().getName(), value));
						}
						continue;
					}
				}
			}
		} else if (dataOrKey instanceof Map) {
			key = this.getDataEntityRuntime().getFieldValue(this.getSystemRuntime().createEntity(dataOrKey), this.getDataEntityRuntime().getKeyPSDEField());
			Collection<IPSDERBase> psDERBases = this.getExtendPSDERMap() != null ? this.getExtendPSDERMap().values() : null;
			if (!ObjectUtils.isEmpty(psDERBases)) {
				for (IPSDERBase iPSDERBase : psDERBases) {
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						Object value = this.getDataEntityRuntime().getFieldValue(this.getSystemRuntime().createEntity(dataOrKey), iPSDER1N.getPSPickupDEFieldMust());
						if (!ObjectUtils.isEmpty(value)) {
							extendParentKeys.add(String.format(FIELD_EXTENSION_FORMAT, iPSDER1N.getPSPickupDEFieldMust().getName(), value));
						}
						continue;
					}

					if (iPSDERBase instanceof IPSDERCustom) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
						Object value = this.getDataEntityRuntime().getFieldValue(this.getSystemRuntime().createEntity(dataOrKey), iPSDERCustom.getPickupPSDEFieldMust());
						if (!ObjectUtils.isEmpty(value)) {
							extendParentKeys.add(String.format(FIELD_EXTENSION_FORMAT, iPSDERCustom.getPickupPSDEFieldMust().getName(), value));
						}
						continue;
					}
				}
			}
		} else
			key = DataTypeUtils.asSimple(dataOrKey);

		List<IPSDEField> psDEFieldList = psDEFieldListMap.get(this.getDataEntityTag().toLowerCase());
		if (!ObjectUtils.isEmpty(key)) {
			List<IPSDEField> psDEFieldList2 = psDEFieldListMap.get(String.format("%1$s@%2$s", key, this.strDataEntityTag).toLowerCase());
			if(ObjectUtils.isEmpty(extendParentKeys)) {
				if (ObjectUtils.isEmpty(psDEFieldList2)) {
					return psDEFieldList;
				}
				if (ObjectUtils.isEmpty(psDEFieldList)) {
					return psDEFieldList2;
				}
			}
			List<IPSDEField> allPSDEFieldList = new ArrayList<IPSDEField>();
			if(!ObjectUtils.isEmpty(extendParentKeys)){
				for (String extendParentKey : extendParentKeys){
					List<IPSDEField> psDEFieldList3 = psDEFieldListMap.get(String.format("%1$s@%2$s", extendParentKey, this.strDataEntityTag).toLowerCase());
					if(!ObjectUtils.isEmpty(psDEFieldList3)) {
						allPSDEFieldList.addAll(psDEFieldList3);
					}
				}
			}
			if(!ObjectUtils.isEmpty(psDEFieldList2)){
				allPSDEFieldList.addAll(psDEFieldList2);
			}
			if(!ObjectUtils.isEmpty(psDEFieldList)){
				allPSDEFieldList.addAll(psDEFieldList);
			}
			Map<String, IPSDEField> psDEFieldMap = new LinkedHashMap<String, IPSDEField>();
			for (IPSDEField iPSDEField : allPSDEFieldList) {
				if (psDEFieldMap.containsKey(iPSDEField.getName().toUpperCase())) {
					continue;
				}
				psDEFieldMap.put(iPSDEField.getName().toUpperCase(), iPSDEField);
			}

			allPSDEFieldList.clear();
			allPSDEFieldList.addAll(psDEFieldMap.values());
			return allPSDEFieldList;
		}else {
			if(ObjectUtils.isEmpty(extendParentKeys)) {
				return psDEFieldList;
			}

			List<IPSDEField> allPSDEFieldList = new ArrayList<IPSDEField>();
			for (String extendParentKey : extendParentKeys){
				List<IPSDEField> psDEFieldList3 = psDEFieldListMap.get(String.format("%1$s@%2$s", extendParentKey, this.strDataEntityTag).toLowerCase());
				if(!ObjectUtils.isEmpty(psDEFieldList3)) {
					allPSDEFieldList.addAll(psDEFieldList3);
				}
			}
			if(!ObjectUtils.isEmpty(psDEFieldList)){
				allPSDEFieldList.addAll(psDEFieldList);
			}
			Map<String, IPSDEField> psDEFieldMap = new LinkedHashMap<String, IPSDEField>();
			for (IPSDEField iPSDEField : allPSDEFieldList) {
				if (psDEFieldMap.containsKey(iPSDEField.getName().toUpperCase())) {
					continue;
				}
				psDEFieldMap.put(iPSDEField.getName().toUpperCase(), iPSDEField);
			}

			allPSDEFieldList.clear();
			allPSDEFieldList.addAll(psDEFieldMap.values());
			return allPSDEFieldList;
		}
	}

	protected void prepareSystemExtensionFields() throws Throwable {
		onPrepareSystemExtensionFields(this.getV2SystemExtensionSuite(true));
	}

	protected synchronized void onPrepareSystemExtensionFields(V2SystemExtensionSuite v2SystemExtensionSuite) throws Throwable {
		if(v2SystemExtensionSuite == null) {
			this.reloadSystemExtensionFields(null);
		}
		else {
			String strCurrentSystemExtensionFieldCacheData = getCurrentSystemExtensionFieldCacheData(v2SystemExtensionSuite.getId());
			if(this.strLastSystemExtensionFieldCacheData == null || !this.strLastSystemExtensionFieldCacheData.equals(strCurrentSystemExtensionFieldCacheData)) {
				//查询相关数据
				List<V2SystemExtensionField> v2SystemExtensionFieldList = this.getSysCloudExtensionUtilRuntime().getSystemExtensionFields(v2SystemExtensionSuite.getId(), this.getDataEntityTag());
				this.reloadSystemExtensionFields(v2SystemExtensionFieldList);
				this.strLastSystemExtensionFieldCacheData = strCurrentSystemExtensionFieldCacheData;
			}
		}
	}

	protected String getCurrentSystemExtensionFieldCacheData(String strExtensionId) throws Exception {
		return this.getSysCloudExtensionUtilRuntime().getSystemExtensionFieldCacheData(strExtensionId, this.getDataEntityTag());

	}

	protected String getLastSystemExtensionFieldCacheData() {
		return this.strLastSystemExtensionFieldCacheData;
	}

	protected void prepareSystemExtensionForms() throws Throwable {
		onPrepareSystemExtensionForms(this.getV2SystemExtensionSuite(true));
	}

	protected synchronized void onPrepareSystemExtensionForms(V2SystemExtensionSuite v2SystemExtensionSuite) throws Throwable {
		if(v2SystemExtensionSuite == null) {
			//this.reloadSystemExtensionForms(null);
		}
		else {
			String strCurrentSystemExtensionFormCacheData = getCurrentSystemExtensionFormCacheData(v2SystemExtensionSuite.getId());
			if(this.strLastSystemExtensionFormCacheData == null || !this.strLastSystemExtensionFormCacheData.equals(strCurrentSystemExtensionFormCacheData)) {
				//查询相关数据
				List<V2SystemExtensionForm> v2SystemExtensionFormList = this.getSysCloudExtensionUtilRuntime().getSystemExtensionForms(v2SystemExtensionSuite.getId(), this.getDataEntityTag());
				//this.reloadSystemExtensionForms(v2SystemExtensionFormList);

				this.strLastSystemExtensionFormCacheData = strCurrentSystemExtensionFormCacheData;
			}
		}

	}

	protected String getCurrentSystemExtensionFormCacheData(String strExtensionId) throws Exception {
		return this.getSysCloudExtensionUtilRuntime().getSystemExtensionFormCacheData(strExtensionId, this.getDataEntityTag());

	}

	protected String getLastSystemExtensionFormCacheData() {
		return this.strLastSystemExtensionFormCacheData;
	}

	@Override
	public String getExtensionSessionId() {
		try {
			return this.onExtensionSessionId();
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取扩展会话标识发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected String onExtensionSessionId() throws Throwable {
		final IServiceSystemRuntime iServiceSystemRuntime = this.getServiceSystemRuntime(false);
		String strExtensionSessionId = iServiceSystemRuntime.getExtensionSessionId();
		String strExtensionId = iServiceSystemRuntime.getExtensionId();
		if(!StringUtils.hasLength(strExtensionSessionId)
				|| !StringUtils.hasLength(strExtensionId)) {
			return strExtensionSessionId;
		}

		return KeyValueUtils.genUniqueId(strExtensionSessionId, getCurrentSystemExtensionFieldCacheData(strExtensionId), this.getCurrentSystemExtensionFormCacheData(strExtensionId));
	}

	@Override
	public boolean isEnableActionLogic(IPSDEAction iPSDEAction, String strAttachMode) {
		Assert.notNull(iPSDEAction, "传入实体行为模型对象无效");
		Assert.hasLength(strAttachMode, "传入实体行为附加模式无效");
		return this.deActionLogicMap.containsKey(String.format("%1$s|%2$s", iPSDEAction.getName(), strAttachMode).toLowerCase());
	}

	@Override
	public void executeActionLogics(Object dataOrKey, IPSDEAction iPSDEAction, String strAttachMode) {
		Assert.notNull(dataOrKey, "传入数据对象无效");
		Assert.notNull(iPSDEAction, "传入实体行为模型对象无效");
		Assert.hasLength(strAttachMode, "传入实体行为附加模式无效");
		try {
			this.onExecuteActionLogics(dataOrKey, iPSDEAction, strAttachMode);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("执行行为[%1$s]附加逻辑[%2$s]发生异常，%3$s", iPSDEAction.getName(), strAttachMode, ex.getMessage()), ex);
		}
	}

	protected void onExecuteActionLogics(Object dataOrKey, IPSDEAction iPSDEAction, String strAttachMode) throws Throwable {
		IEntity iEntity = this.getEntity(dataOrKey);
		// 获取标记
		String[] tags = this.getActionLogicExtensionTags(iPSDEAction, iEntity);
		if (tags == null) {
			return;
		}
		for (String strTag : tags) {
			List<IDELogicRuntime> list = this.deLogicAttachToDEActionRuntimeMap.get(strTag);
			if (ObjectUtils.isEmpty(list)) {
				continue;
			}

			for (IDELogicRuntime iDELogicRuntime : list) {
				if (!strAttachMode.equalsIgnoreCase(iDELogicRuntime.getPSDELogic().getAttachMode())) {
					continue;
				}

				boolean bThreadMode = iDELogicRuntime.getPSDELogic().getThreadMode() != 0;
				boolean bIgnoreException = iDELogicRuntime.getPSDELogic().isIgnoreException();
				// 判断是否线程模式，是否忽略异常

				if (bThreadMode) {
					this.getSystemRuntime().threadRun(new Runnable() {
						@Override
						public void run() {
							try {
								executeLogic(iDELogicRuntime, new Object[] { iEntity }, null);
							} catch (Throwable ex) {
								log.error(String.format("执行行为附加逻辑[%1$s]发生异常，%2$s", iDELogicRuntime.getPSDELogic().getName(), ex.getMessage()), ex);
							}
						}
					});
				} else {
					try {
						executeLogic(iDELogicRuntime, new Object[] { iEntity }, null);
					} catch (Throwable ex) {
						log.error(String.format("执行行为附加逻辑[%1$s]发生异常，%2$s", iDELogicRuntime.getPSDELogic().getName(), ex.getMessage()), ex);
						if (bIgnoreException) {
							continue;
						}
						throw ex;
					}
				}
			}
		}
	}

	@Override
	public Object executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData) {
		Assert.notNull(v2SystemExtensionLogic, "未传入扩展逻辑");
		try {
			return this.onExecuteExtensionLogic(v2SystemExtensionLogic, objData);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("执行附加逻辑[%1$s]发生异常，%2$s", v2SystemExtensionLogic.getName(), ex.getMessage()), ex);
		}
	}

	protected Object onExecuteExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData) throws Throwable {
		IDELogicRuntime iDELogicRuntime = null;
		if (EXTENSIONLOGIC_TIMERTASK.equalsIgnoreCase(v2SystemExtensionLogic.getExtensionTag4())) {
			iDELogicRuntime = timerTaskDELogicRuntimeMap.get(v2SystemExtensionLogic);
		} else if (EXTENSIONLOGIC_WEBHOOK.equalsIgnoreCase(v2SystemExtensionLogic.getExtensionTag4())) {
			iDELogicRuntime = webHookDELogicRuntimeMap.get(v2SystemExtensionLogic);
		}

		if (iDELogicRuntime == null) {
			throw new Exception(String.format("无法获取指定扩展逻辑[%1$s]运行时对象", v2SystemExtensionLogic.getName()));
		}

		IEntity iEntity = this.getEntity(objData);
		
		IDELogicRuntime iDELogicRuntime2 = iDELogicRuntime;
		if(iDELogicRuntime.getPSDELogic().getThreadMode() == DELogicThreadRunMode.THREAD.value) {
			this.getSystemRuntime().threadRun(new Runnable() {
				
				@Override
				public void run() {
					try {
						executeLogic(iDELogicRuntime2, new Object[] { iEntity }, v2SystemExtensionLogic);
					} catch (Throwable ex) {
						log.error(ex);
					}
				}
			});
			return null;
		}
		else {
			return this.executeLogic(iDELogicRuntime, new Object[] { iEntity }, v2SystemExtensionLogic);
		}
	}

	@Override
	public void notify(Object key, String strEvent, Object eventData, Object eventData2, Object eventData3, Object eventData4) {
		// Assert.notNull(key, "传入数据键值无效");
		Assert.hasLength(strEvent, "传入事件名称无效");
		try {
			this.onNotify(key, strEvent, eventData, eventData2, eventData3, eventData4);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("执行事件钩子[%1$s]发生异常，%2$s", strEvent, ex.getMessage()), ex);
		}
	}

	protected void onNotify(Object key, String strEvent, Object eventData, Object eventData2, Object eventData3, Object eventData4) throws Throwable {

		if (ObjectUtils.isEmpty(this.deLogicEventHookRuntimeMap) || ObjectUtils.isEmpty(key)) {
			return;
		}

		// 获取标记
		String[] tags = this.getEventHookExtensionTags(strEvent, key);
		if (tags == null || tags.length == 0) {
			return;
		}

		for (String strTag : tags) {
			List<IDELogicRuntime> list = this.deLogicEventHookRuntimeMap.get(strTag);
			if (ObjectUtils.isEmpty(list)) {
				continue;
			}

			IEntity iEntity = getEntity(key);

			Map<String, Object> logicParamMap = new HashMap<String, Object>();
			logicParamMap.put(DELOGIC_EVENTHOOK_PARAM_EVENTNAME, strEvent);
			logicParamMap.put(DELOGIC_EVENTHOOK_PARAM_EVENTDATA, eventData);
			logicParamMap.put(DELOGIC_EVENTHOOK_PARAM_EVENTDATA2, eventData2);
			logicParamMap.put(DELOGIC_EVENTHOOK_PARAM_EVENTDATA3, eventData3);
			logicParamMap.put(DELOGIC_EVENTHOOK_PARAM_EVENTDATA4, eventData4);

			for (IDELogicRuntime iDELogicRuntime : list) {

				boolean bThreadMode = iDELogicRuntime.getPSDELogic().getThreadMode() != 0;
				boolean bIgnoreException = iDELogicRuntime.getPSDELogic().isIgnoreException();
				// 判断是否线程模式，是否忽略异常

				if (bThreadMode) {
					this.getSystemRuntime().threadRun(new Runnable() {
						@Override
						public void run() {
							try {
								executeLogic(iDELogicRuntime, new Object[] { iEntity, logicParamMap }, null);
							} catch (Throwable ex) {
								log.error(String.format("执行事件逻辑[%1$s]发生异常，%2$s", iDELogicRuntime.getPSDELogic().getName(), ex.getMessage()), ex);
							}
						}
					});
				} else {
					try {
						executeLogic(iDELogicRuntime, new Object[] { iEntity, logicParamMap }, null);
					} catch (Throwable ex) {
						log.error(String.format("执行事件逻辑[%1$s]发生异常，%2$s", iDELogicRuntime.getPSDELogic().getName(), ex.getMessage()), ex);
						if (bIgnoreException) {
							continue;
						}
						throw ex;
					}
				}
			}
		}

		// 触发事件通知
		for (String strTag : tags) {
			List<IDENotifyRuntime> list = this.deNotifyEventHookRuntimeMap.get(strTag);
			if (ObjectUtils.isEmpty(list)) {
				continue;
			}

			IEntity iEntity = getEntity(key);

			Map<String, Object> logicParamMap = new HashMap<String, Object>();
			logicParamMap.put(IDENotifyRuntime.NOTIFY_PARAM_EVENTNAME, strEvent);
			logicParamMap.put(IDENotifyRuntime.NOTIFY_PARAM_EVENTDATA, eventData);
			logicParamMap.put(IDENotifyRuntime.NOTIFY_PARAM_LASTEVENTDATA, eventData3);

			for (IDENotifyRuntime iDENotifyRuntime : list) {

				boolean bThreadMode = iDENotifyRuntime.getPSDENotify().getThreadMode() != 0;
				boolean bIgnoreException = iDENotifyRuntime.getPSDENotify().isIgnoreException();
				// 判断是否线程模式，是否忽略异常

				if (bThreadMode) {
					this.getSystemRuntime().threadRun(new Runnable() {
						@Override
						public void run() {
							try {
								executeNotify(iDENotifyRuntime, iEntity, logicParamMap, null);
							} catch (Throwable ex) {
								log.error(String.format("执行事件通知[%1$s]发生异常，%2$s", iDENotifyRuntime.getPSDENotify().getName(), ex.getMessage()), ex);
							}
						}
					});
				} else {
					try {
						executeNotify(iDENotifyRuntime, iEntity, logicParamMap, null);
					} catch (Throwable ex) {
						log.error(String.format("执行事件通知[%1$s]发生异常，%2$s", iDENotifyRuntime.getPSDENotify().getName(), ex.getMessage()), ex);
						if (bIgnoreException) {
							continue;
						}
						throw ex;
					}
				}
			}
		}

		// 触发属性变更通知
		if ((eventData instanceof IEntity) && (eventData3 instanceof IEntity)) {
			for (String strTag : tags) {
				List<IDENotifyRuntime> list = this.deNotifyFieldChangeHookRuntimeMap.get(strTag);
				if (ObjectUtils.isEmpty(list)) {
					continue;
				}

				for (IDENotifyRuntime iDENotifyRuntime : list) {

					// 判断属性是否变化
					String strFields = iDENotifyRuntime.getPSDENotify().getFields();

					String strChangeField = null;
					String[] fields = strFields.replace(",", ";").split("[;]");
					for (String strField : fields) {
						String strDETag = PSModelUtils.getParentId(strField);
						String strDETag2 = PSModelUtils.getParentId(strEvent);
						if (!StringUtils.hasLength(strDETag) || !StringUtils.hasLength(strDETag2) || !strDETag.equalsIgnoreCase(strDETag2)) {
							continue;
						}

						String strRealFieldName = PSModelUtils.getSimpleId(strField);
						IEntity eventEntity = (IEntity) eventData;
						IEntity lastEventEntity = (IEntity) eventData3;
						if (!eventEntity.contains(strRealFieldName)) {
							continue;
						}

						Object value = eventEntity.get(strRealFieldName);
						Object value2 = lastEventEntity.get(strRealFieldName);
						if (value == null && value2 == null) {
							continue;
						}

						if (value != null && value2 != null) {
							if (DataTypeUtils.compare(DataTypeUtils.getObjectDataType(value), value, value2) == 0) {
								continue;
							}
						}

						strChangeField = strField;
						break;
					}

					if (!StringUtils.hasLength(strChangeField)) {
						continue;
					}

					IEntity iEntity = getEntity(key);

					Map<String, Object> logicParamMap = new HashMap<String, Object>();
					logicParamMap.put(IDENotifyRuntime.NOTIFY_PARAM_EVENTNAME, strChangeField);
					logicParamMap.put(IDENotifyRuntime.NOTIFY_PARAM_EVENTDATA, eventData);
					logicParamMap.put(IDENotifyRuntime.NOTIFY_PARAM_LASTEVENTDATA, eventData3);

					boolean bThreadMode = iDENotifyRuntime.getPSDENotify().getThreadMode() != 0;
					boolean bIgnoreException = iDENotifyRuntime.getPSDENotify().isIgnoreException();
					// 判断是否线程模式，是否忽略异常

					if (bThreadMode) {
						this.getSystemRuntime().threadRun(new Runnable() {
							@Override
							public void run() {
								try {
									executeNotify(iDENotifyRuntime, iEntity, logicParamMap, null);
								} catch (Throwable ex) {
									log.error(String.format("执行属性变更通知[%1$s]发生异常，%2$s", iDENotifyRuntime.getPSDENotify().getName(), ex.getMessage()), ex);
								}
							}
						});
					} else {
						try {
							executeNotify(iDENotifyRuntime, iEntity, logicParamMap, null);
						} catch (Throwable ex) {
							log.error(String.format("执行属性变更通知[%1$s]发生异常，%2$s", iDENotifyRuntime.getPSDENotify().getName(), ex.getMessage()), ex);
							if (bIgnoreException) {
								continue;
							}
							throw ex;
						}
					}
				}
			}
		}
	}

	@Override
	public String[] getExtensionModes(String strPSModel) {
		// TODO Auto-generated method stub
		return null;
	}

	protected String[] getActionLogicExtensionTags(IPSDEAction iPSDEAction, IEntity iEntity) {
		return new String[] { String.format("%1$s|%2$s", this.getDataEntityTag(), iPSDEAction.getName()).toLowerCase() };
	}

	protected String[] getEventHookExtensionTags(String strEvent, Object key) {
		String strTag = String.format("%1$s|%2$s", this.getDataEntityTag(), strEvent).toLowerCase();
		if (key != null) {
			return new String[] { String.format("%1$s@%2$s", key, strTag).toLowerCase(), strTag };
		} else {
			return new String[] { strTag };
		}
	}

	protected String[] getMainStateLogicExtensionTags(String strMSTag, IEntity iEntity) {
		// 判断是否有数据主键
		List<String> list = new ArrayList<String>();
		Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntity);
		if (!ObjectUtils.isEmpty(key)) {
			list.add(String.format("%1$s|%2$s", key, strMSTag));
		}

		// 循环父
		Collection<IPSDERBase> psDERBases = this.getExtendPSDERMap() != null ? this.getExtendPSDERMap().values() : null;
		if (!ObjectUtils.isEmpty(psDERBases)) {
			for (IPSDERBase iPSDERBase : psDERBases) {
				if (iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
					Object value = this.getDataEntityRuntime().getFieldValue(iEntity, iPSDER1N.getPSPickupDEFieldMust());
					if (!ObjectUtils.isEmpty(value)) {
						list.add(String.format("%1$s|%2$s", String.format(FIELD_EXTENSION_FORMAT, iPSDER1N.getPSPickupDEFieldMust().getName(), value), strMSTag));
					}
					continue;
				}

				if (iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
					Object value = this.getDataEntityRuntime().getFieldValue(iEntity, iPSDERCustom.getPickupPSDEFieldMust());
					if (!ObjectUtils.isEmpty(value)) {
						list.add(String.format("%1$s|%2$s", String.format(FIELD_EXTENSION_FORMAT, iPSDERCustom.getPickupPSDEFieldMust().getName(), value), strMSTag));
					}
					continue;
				}
			}
		}

		list.add(strMSTag);
		return list.toArray(new String[list.size()]);
	}

	protected IEntity getEntity(Object dataOrKey) throws Exception {
		if (dataOrKey instanceof IEntity) {
			return (IEntity) dataOrKey;
		}
		if (dataOrKey instanceof Map) {
			return this.getDataEntityRuntime().createEntity((Map) dataOrKey, false);
		}

		Object objKeyValue = DataTypeUtils.asSimple(dataOrKey);
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		iEntityDTO.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), objKeyValue);
		return iEntityDTO;
	}

	protected Object executeLogic(IDELogicRuntime iDELogicRuntime, Object[] args, Object tag) throws Throwable {
		Date startAt = new Date();
		Throwable error = null;
		try {
			return this.executeAction(String.format("执行扩展逻辑[%1$s]", iDELogicRuntime.getName()), new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return getDataEntityRuntime().executeLogic(iDELogicRuntime, args);
				}
			}, args);
		} catch (Throwable ex) {
			error = ex;
			throw ex;
		} finally {
			Date endAt = new Date();
			Map<String, Object> logParams = new LinkedHashMap<String, Object>();
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_TYPE, this.getDataEntityTag());
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_SUBTYPE, PSModels.PSDELOGIC);
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_ID, PSModelUtils.calcFullUniqueTag2(iDELogicRuntime.getPSDELogic()));
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_START_AT, new java.sql.Timestamp(startAt.getTime()));
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_END_AT, new java.sql.Timestamp(endAt.getTime()));
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_ELAPSED_TIME, endAt.getTime() - startAt.getTime());
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_CATEGORY, iDELogicRuntime.getPSDELogic().getLogicSubType());
			if (error == null) {
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_LEVEL, EXTENSIONLOG_LEVEL_INFO);
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_STATE, EXTENSIONLOG_STATE_SUCCESS);
			} else {
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_LEVEL, EXTENSIONLOG_LEVEL_ERROR);
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_STATE, EXTENSIONLOG_STATE_FAILURE);
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_INFO, error.getMessage());
			}
			this.doLog(logParams);
		}
	}

	protected void doLog(Map<String, Object> params) {
		if (ObjectUtils.isEmpty(params)) {
			return;
		}

		try {
			IDataEntityRuntime logDataEntityRuntime = this.getLogDataEntityRuntime(true);
			if (logDataEntityRuntime == null) {
				return;
			}

			IEntityDTO logEntity = logDataEntityRuntime.createEntity();
			for (java.util.Map.Entry<String, Object> entry : params.entrySet()) {
				IPSDEField iPSDEField = this.getLogPSDEFieldMap().get(entry.getKey());
				if (iPSDEField != null) {
					logEntity.set(iPSDEField.getName(), entry.getValue());
				}
			}

			logDataEntityRuntime.fillEntityKeyValue(logEntity);
			logDataEntityRuntime.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					logDataEntityRuntime.rawCreate(Arrays.asList(logEntity), false);
					return null;
				}
			}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

		} catch (Throwable ex) {
			log.error(String.format("日志处理逻辑发生异常，%1$s", ex.getMessage()), ex);
		}

	}

	protected Object executeNotify(IDENotifyRuntime iDENotifyRuntime, IEntity iEntity, Map<String, Object> params, Object tag) throws Throwable {
		Date startAt = new Date();
		Throwable error = null;
		try {
			return this.executeAction(String.format("执行扩展通知[%1$s]", iDENotifyRuntime.getName()), new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					iDENotifyRuntime.send(iEntity, params);
					return null;
				}
			}, null);
		} catch (Throwable ex) {
			error = ex;
			throw ex;
		} finally {
			Date endAt = new Date();
			Map<String, Object> logParams = new LinkedHashMap<String, Object>();
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_TYPE, this.getDataEntityTag());
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_SUBTYPE, PSModels.PSDENOTIFY);
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_OWNER_ID, PSModelUtils.calcFullUniqueTag2(iDENotifyRuntime.getPSDENotify()));
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_START_AT, new java.sql.Timestamp(startAt.getTime()));
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_END_AT, new java.sql.Timestamp(endAt.getTime()));
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_ELAPSED_TIME, endAt.getTime() - startAt.getTime());
			logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_CATEGORY, iDENotifyRuntime.getPSDENotify().getNotifySubType());
			if (error == null) {
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_LEVEL, EXTENSIONLOG_LEVEL_INFO);
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_STATE, EXTENSIONLOG_STATE_SUCCESS);
			} else {
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_LEVEL, EXTENSIONLOG_LEVEL_ERROR);
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_STATE, EXTENSIONLOG_STATE_FAILURE);
				logParams.put(EXTENSIONLOG_PREDEFINEDFIELD_INFO, error.getMessage());
			}
			this.doLog(logParams);
		}
	}

	@Override
	public void checkDEMainState(Object dataOrKey, IPSDEAction iPSDEAction) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean testDataAccessAction(Object dataOrKey, String strAccessAction) {
		return true;
	}

	@Override
	public ObjectNode getJsonSchemaModel(IPSAppDataEntity iPSAppDataEntity, Object param) {
		Assert.notNull(iPSAppDataEntity, "未传入应用实体模型");
		Assert.notNull(iPSAppDataEntity.getPSDataEntity(), "传入应用实体实体模型无效");
		Assert.isTrue(this.getPSDataEntity().getId().equals(iPSAppDataEntity.getPSDataEntity().getId()), "传入应用实体实体模型标识不一致");
		try {
			return this.onGetJsonSchemaModel(iPSAppDataEntity, param);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取应用实体JsonSchema发生异常，%1$s", ex.getMessage()), ex);
		}
	}


	@Override
	public ObjectNode getJsonSchemaModel(Object param) {
		try {
			return this.onGetJsonSchemaModel(null, param);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取实体JsonSchema发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected ObjectNode onGetJsonSchemaModel(IPSAppDataEntity iPSAppDataEntity, Object param) throws Throwable {
		ObjectNode objectNode = iPSAppDataEntity!=null? JsonUtils.toObjectNode(PSDataEntityExtension.getJsonSchema(iPSAppDataEntity)) : JsonUtils.toObjectNode(PSDataEntityExtension.getJsonSchema(this.getPSDataEntity()));
		List<IPSDEField> psDEFieldList = this.getPSDEFields(param);
		if (!ObjectUtils.isEmpty(psDEFieldList)) {
			JsonNode node = objectNode.get("properties");
			if (node instanceof ObjectNode) {
				ObjectNode propertiesNode = (ObjectNode) node;
				for (IPSDEField iPSDEField : psDEFieldList) {

					String strCodeName = iPSDEField.getCodeName();
					if (!StringUtils.hasLength(strCodeName)) {
						strCodeName = iPSDEField.getName();
					}

					if (!StringUtils.hasLength(strCodeName)) {
						continue;
					}

					strCodeName = strCodeName.toLowerCase();
					if (propertiesNode.get(strCodeName) != null) {
						continue;
					}
					ObjectNode property = propertiesNode.putObject(strCodeName.toLowerCase());

					int nStdDataType = iPSDEField.getStdDataType();
					if (nStdDataType <= 0) {
						nStdDataType = DataTypes.VARCHAR;
					}
					StdDataType stdDataType = StdDataType.from(nStdDataType);
					String strDataType = iPSDEField.getDataType();
					
					if (StdDataTypeUtils.isBigDecimalDataType(stdDataType) || StdDataTypeUtils.isBigIntDataType(stdDataType)) {
						property.put("type", "number");
					} else {
						property.put("type", GroovyUtils.getJavaScriptType(stdDataType));
					}

					if (StringUtils.hasLength(iPSDEField.getLogicName())) {
						property.put("description", iPSDEField.getLogicName());
					}

					if (StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
						if(StringUtils.hasLength(strDataType)) {
							if(DEFDataType.DATE.value.equals(strDataType)) {
								property.put("format", "date");
							}
							else
								if(DEFDataType.TIME.value.equals(strDataType)) {
									property.put("format", "time");
								}
								else {
									property.put("format", "date-time");
								}
						}
						else {
							if (stdDataType == StdDataType.DATE) {
								property.put("format", "date");
							}
							else
							if (stdDataType == StdDataType.TIME) {
								property.put("format", "time");
							}
							else {
								property.put("format", "date-time");
							}
						}
					}
					
					if(iPSDEField.getInlinePSCodeList() != null) {
						ObjectNode enumOptions = property.putObject("enumOptions");
						if(!ObjectUtils.isEmpty(iPSDEField.getInlinePSCodeList().getPSCodeItems())) {
							for(IPSCodeItem iPSCodeItem : iPSDEField.getInlinePSCodeList().getPSCodeItems()) {
								enumOptions.put(iPSCodeItem.getValue(), iPSCodeItem.getText());
							}
						}
					}
					else
						if(iPSDEField.getPSCodeList()!=null) {
							property.put("enumSource", iPSDEField.getPSCodeList().getCodeListTag());
						}
					
					// 标识为扩展属性
					property.put("extension", true);
				}
			}

		}
		return objectNode;
	}


	@Override
	public ObjectNode getPSAppViewModel(IPSAppView iPSAppView, Object param) {
		Assert.notNull(iPSAppView, "未传入应用视图模型");
		Assert.hasLength(iPSAppView.getViewType(), "传入应用视图应用模型视图类型无效");
		Assert.notNull(iPSAppView.getPSAppDataEntity(), "传入应用视图应用实体模型无效");
		Assert.notNull(iPSAppView.getPSAppDataEntity().getPSDataEntity(), "传入应用视图应用实体实体模型无效");
		Assert.isTrue(this.getPSDataEntity().getId().equals(iPSAppView.getPSAppDataEntity().getPSDataEntity().getId()), "传入应用视图应用实体实体模型标识不一致");
		try {
			return this.onGetPSAppViewModel(iPSAppView, param);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取应用视图模型发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected ObjectNode onGetPSAppViewModel(IPSAppView iPSAppView, Object param) throws Throwable {

		String strMode = this.getDynaViewMode(iPSAppView.getViewType());
		if(!StringUtils.hasLength(strMode)) {
			return null;
		}

		//获取工作流编辑
		String strWFTag = null;
		if(param instanceof Map) {
			Map map = (Map)param;
			strWFTag = (String)map.get("srfwftag");
		}

		if(strMode.equalsIgnoreCase(DYNAVIEWMODE_DEWFVIEW)) {
			return getPSAppDEWFViewModel((IPSAppDEView)iPSAppView, strWFTag, param);
		}

		if(strMode.equalsIgnoreCase(DYNAVIEWMODE_DEEDITVIEW)||strMode.equalsIgnoreCase(DYNAVIEWMODE_DEOPTVIEW)) {
			return getPSAppDEEditViewModel((IPSAppDEView)iPSAppView, strWFTag, param);
		}

		log.warn(String.format("动态视图模式[%1$s]未支持", strMode));

		return null;
	}

	protected ObjectNode getPSAppDEWFViewModel(IPSAppDEView iPSAppDEView, String strWFTag, Object param) throws Throwable {
		//查出相关实体工作流
		V2SystemExtensionSuite v2SystemExtensionSuite = this.getV2SystemExtensionSuite(false);

		boolean bMobile = iPSAppDEView.getViewType().indexOf("DEMOB") != -1;

		boolean bDynaEditView = iPSAppDEView.getViewType().indexOf("DYNAEDITVIEW") != -1;

		IPSApplication iPSApplication = iPSAppDEView.getParentPSModelObject(IPSApplication.class);
		//根据流程标记，查出全部版本
		IPSDEWF iPSDEWF = null;
		IPSDataEntity iPSDataEntity = this.getPSDataEntity();
		List<IPSDEWF> psDEWFs = iPSDataEntity.getAllPSDEWFs();
		if(!ObjectUtils.isEmpty(psDEWFs)) {
			for(IPSDEWF item : psDEWFs) {
				if(StringUtils.hasLength(strWFTag) && strWFTag.equalsIgnoreCase(item.getPSWorkflowMust().getCodeName())) {
					iPSDEWF = item;
					break;
				}
			}
		}

		List<IPSWFVersion> psWFVersionList = new ArrayList<IPSWFVersion>();
		String strFullWFTag = null;
		String strDEWFTag = null;
		String strWFName = null;
		Map<String, IPSAppDEView> psAppViewRefMap = new LinkedHashMap<String, IPSAppDEView>();

		if(iPSDEWF != null) {

			IPSWorkflow iPSWorkflow = iPSDEWF.getPSWorkflowMust();
			if(!ObjectUtils.isEmpty(iPSWorkflow.getPSWFDEs())) {
				strDEWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow.getPSWFDEs().get(0));
			}
			if(!StringUtils.hasLength(strDEWFTag)){
				return null;
			}
			strFullWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow);
			//现有流程
			if(iPSWorkflow.getPSWFVersions()!=null) {
				psWFVersionList.addAll(iPSWorkflow.getPSWFVersions());
			}

			//现有流程
			strWFName = iPSWorkflow.getName();
		}
		else {
			String strDETag = PSModelUtils.calcUniqueTag2(iPSDataEntity);
			strFullWFTag = String.format("%1$s.%2$s",PSModelUtils.getParentId(strDETag), strWFTag);
			strDEWFTag = String.format("%1$s.%2$s", strFullWFTag, "default");

			List<V2SystemExtensionWorkflow> v2SystemExtensionWorkflowList = v2SystemExtensionSuite.getWorkflows();
			if(!ObjectUtils.isEmpty(v2SystemExtensionWorkflowList)) {
				for(V2SystemExtensionWorkflow v2SystemExtensionWorkflow : v2SystemExtensionWorkflowList) {
					if(strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflow.getWorkflowTag())) {

						String strModel = v2SystemExtensionWorkflow.getPendingExtensionModel();
						if(!StringUtils.hasLength(strModel)) {
							strModel = v2SystemExtensionWorkflow.getExtensionModel();
						}

						if(StringUtils.hasLength(strModel)) {
							PSWorkflow psWorkflow = JsonUtils.as(strModel, PSWorkflow.class);
							strWFName = psWorkflow.getName();
							break;
						}

					}
				}
			}
		}

		if(!StringUtils.hasLength(strFullWFTag)
				|| !StringUtils.hasLength(strDEWFTag)) {
			return null;
		}

		Map<String, String> formCodeNameMap = new HashMap<String, String>();
		//
		List<V2SystemExtensionWorkflowDefinition> v2SystemExtensionWorkflowDefinitionList = v2SystemExtensionSuite.getWorkflowDefinitions();
		if(!ObjectUtils.isEmpty(v2SystemExtensionWorkflowDefinitionList)) {
			for(V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition : v2SystemExtensionWorkflowDefinitionList) {
				if(!strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflowDefinition.getWorkflowTag())) {
					continue;
				}

				if(!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getRuntimeModel())) {
					continue;
				}

				if(!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getExtensionModel())) {
					continue;
				}

				PSWFVersion psWFVersion = JsonUtils.as(v2SystemExtensionWorkflowDefinition.getExtensionModel(), PSWFVersion.class);
				//枚举处理节点及连接
				if(!ObjectUtils.isEmpty(psWFVersion.getPSWFProcesses())) {
					for(PSWFProcess psWFProcess : psWFVersion.getPSWFProcesses()) {
						if(!bMobile) {
							//合成表单标识
							if(StringUtils.hasLength(psWFProcess.getPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getPSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getUtilPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtilPSDEFormId()).toLowerCase(), "");

							}

							if(StringUtils.hasLength(psWFProcess.getUtil2PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil2PSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getUtil3PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil3PSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getUtil4PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil4PSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getUtil5PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getUtil5PSDEFormId()).toLowerCase(), "");
							}
						}
						else {
							if(StringUtils.hasLength(psWFProcess.getMobPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobPSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getMobUtilPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtilPSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getMobUtil2PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil2PSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getMobUtil3PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil3PSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getMobUtil4PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil4PSDEFormId()).toLowerCase(), "");
							}

							if(StringUtils.hasLength(psWFProcess.getMobUtil5PSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFProcess.getMobUtil5PSDEFormId()).toLowerCase(), "");
							}
						}
					}
				}

				if(!ObjectUtils.isEmpty(psWFVersion.getPSWFLinks())) {
					for(PSWFLink psWFLink : psWFVersion.getPSWFLinks()) {
						if(!bMobile) {
							//合成表单标识
							if(StringUtils.hasLength(psWFLink.getPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFLink.getPSDEFormId()).toLowerCase(), "");
							}
						}
						else {
							if(StringUtils.hasLength(psWFLink.getMobPSDEFormId())) {
								formCodeNameMap.put(PSModelUtils.getSimpleId(psWFLink.getMobPSDEFormId()).toLowerCase(), "");
							}
						}

						if(bDynaEditView) {
							String strViewCodeName = null;
							if(!bMobile) {
								if(StringUtils.hasLength(psWFLink.getPSDEViewBaseId())) {
									strViewCodeName = PSModelUtils.getSimpleId(psWFLink.getPSDEViewBaseId());
								}
							}
							else {
								if(StringUtils.hasLength(psWFLink.getMobPSDEViewId())) {
									strViewCodeName = PSModelUtils.getSimpleId(psWFLink.getMobPSDEViewId());
								}
							}

							if(StringUtils.hasLength(strViewCodeName)) {
								java.util.List<IPSAppView> psAppViewList = iPSApplication.getAllPSAppViews();
								if(!ObjectUtils.isEmpty(psAppViewList)) {
									for(IPSAppView iPSAppView : psAppViewList) {
										if(iPSAppView instanceof IPSAppDEView) {
											IPSAppDEView iPSAppDEView2 = (IPSAppDEView)iPSAppView;
											if(!iPSAppDEView2.getPSAppDataEntityMust().getPSDataEntityMust().getId().equals(iPSDataEntity.getId())) {
												continue;
											}
											if(strViewCodeName.equalsIgnoreCase(iPSAppDEView2.getPSDEViewCodeName())) {
												String strViewRefMode = String.format("%1$s@%2$s","WFACTION", strViewCodeName);
												psAppViewRefMap.put(strViewRefMode, iPSAppDEView2);
												break;
											}
										}
										else {
											continue;
										}
									}
								}
							}
						}

					}
				}
			}
		}

		ObjectNode originViewNode = iPSAppDEView.getObjectNode().deepCopy();
		JsonNode node = originViewNode.get(PSAppViewImpl.ATTR_GETPSCONTROLS);
		if(node == null) {
			//尝试从视图面板中获取
			JsonNode viewLayoutPanelNode = originViewNode.get(PSAppViewImpl.ATTR_GETPSVIEWLAYOUTPANEL);
			if(viewLayoutPanelNode instanceof ObjectNode) {
				node = ((ObjectNode)viewLayoutPanelNode).get(PSAppViewImpl.ATTR_GETPSCONTROLS);
			}
		}
		if(node instanceof ArrayNode) {
			//循环表单
			ArrayNode arrayNode = (ArrayNode)node;
			for(int i = 0 ;i<arrayNode.size();i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if(strName.indexOf("wfform_") == 0){
					formCodeNameMap.put(strName.substring(7).toLowerCase(), "");
				}
			}
		}

		Map<String, V2SystemExtensionForm> v2SystemExtensionFormMap = new HashMap<String, V2SystemExtensionForm>();

		//查出表单
		List<V2SystemExtensionForm> v2SystemExtensionFormList = v2SystemExtensionSuite.getForms();
		if(!ObjectUtils.isEmpty(v2SystemExtensionFormList)) {
			for(V2SystemExtensionForm v2SystemExtensionForm : v2SystemExtensionFormList) {
				if(!StringUtils.hasLength(v2SystemExtensionForm.getRuntimeModel())) {
					continue;
				}

				if(!StringUtils.hasLength(v2SystemExtensionForm.getExtensionModel())) {
					continue;
				}

				if(!this.getDataEntityTag().equals(v2SystemExtensionForm.getDataEntityTag())){
					continue;
				}
				PSDEForm psDEForm = JsonUtils.as(v2SystemExtensionForm.getExtensionModel(), PSDEForm.class);
				if(strDEWFTag.equalsIgnoreCase(psDEForm.getPSWFDEId())) {
					if(!formCodeNameMap.containsKey(psDEForm.getCodeName().toLowerCase())) {
						continue;
					}

					v2SystemExtensionFormMap.put("wfform_"+psDEForm.getCodeName().toLowerCase(), v2SystemExtensionForm);
				}
			}
		}

		//执行替换操作
		if(node instanceof ArrayNode) {

			List<ObjectNode> list = new ArrayList<ObjectNode>();
			//循环表单
			ArrayNode arrayNode = (ArrayNode)node;
			ObjectNode formNode  = null;
			for(int i = 0 ;i<arrayNode.size();i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if(strName.indexOf("wfform_") == 0){
					formNode = ctrlNode;
					break;
				}
			}
			for(int i = 0 ;i<arrayNode.size();i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				V2SystemExtensionForm v2SystemExtensionForm = v2SystemExtensionFormMap.remove(strName);
				if(v2SystemExtensionForm == null) {
					list.add(ctrlNode);
					continue;
				}

				String strRuntimeModel = ExtensionUtils.replaceRuntimeModel(v2SystemExtensionForm.getRuntimeModel(), iPSApplication, false);
				ObjectNode form = JsonUtils.toObjectNode(strRuntimeModel);
				//有新的，准备替换
				ObjectNode newForm = ctrlNode.deepCopy();// JsonUtils.toObjectNode(ctrlNode.toString());
				newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES));
				newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMPAGES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMPAGES));
				newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS));
				newForm.set(PSDEFormImpl.ATTR_GETCODENAME, form.get(PSDEFormImpl.ATTR_GETCODENAME));
				newForm.set(PSDEFormImpl.ATTR_GETLOGICNAME, form.get(PSDEFormImpl.ATTR_GETLOGICNAME));
				if(form.get(PSDEFormImpl.ATTR_ISNOTABHEADER)!=null) {
					newForm.set(PSDEFormImpl.ATTR_ISNOTABHEADER, form.get(PSDEFormImpl.ATTR_ISNOTABHEADER));
				}

				//合入计数器节点
				ArrayNode newPSAppCounterRefNodes = null;
				if(newForm.has(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS)) {
					newPSAppCounterRefNodes = (ArrayNode)newForm.get(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
				}
				else {
					newPSAppCounterRefNodes = newForm.putArray(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
				}

				if(form.has(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS)) {
					ArrayNode psAppCounterRefNodes = (ArrayNode)form.get(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
					newPSAppCounterRefNodes.addAll(psAppCounterRefNodes);
				}



				newForm.remove(PSDEFormImpl.ATTR_GETPSDEFORMITEMS);
				newForm.remove(PSDEFormImpl.ATTR_GETDYNAMODELFILEPATH);

				list.add(newForm);

			}

			for(java.util.Map.Entry<String, V2SystemExtensionForm> entry : v2SystemExtensionFormMap.entrySet()) {
				ObjectNode form = JsonUtils.toObjectNode(entry.getValue().getRuntimeModel());
				ObjectNode newForm = null;
				if(formNode != null) {
					newForm = formNode.deepCopy();// JsonUtils.toObjectNode(formNode.toString());
					newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES));
					newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMPAGES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMPAGES));
					newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS));
					newForm.set(PSDEFormImpl.ATTR_GETCODENAME, form.get(PSDEFormImpl.ATTR_GETCODENAME));
					newForm.set(PSDEFormImpl.ATTR_GETLOGICNAME, form.get(PSDEFormImpl.ATTR_GETLOGICNAME));
					if(form.get(PSDEFormImpl.ATTR_ISNOTABHEADER)!=null) {
						newForm.set(PSDEFormImpl.ATTR_ISNOTABHEADER, form.get(PSDEFormImpl.ATTR_ISNOTABHEADER));
					}

					ArrayNode newPSAppCounterRefNodes = null;
					if(newForm.has(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS)) {
						newPSAppCounterRefNodes = (ArrayNode)newForm.get(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
					}
					else {
						newPSAppCounterRefNodes = newForm.putArray(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
					}

					if(form.has(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS)) {
						ArrayNode psAppCounterRefNodes = (ArrayNode)form.get(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
						newPSAppCounterRefNodes.addAll(psAppCounterRefNodes);
					}


					newForm.remove(PSDEFormImpl.ATTR_GETPSDEFORMITEMS);
					newForm.remove(PSDEFormImpl.ATTR_GETDYNAMODELFILEPATH);

				}
				else {
					newForm = form;
				}
				newForm.put("name", entry.getKey());
				list.add(newForm);

			}

			arrayNode.removeAll();
			arrayNode.addAll(list);

			if(!ObjectUtils.isEmpty(psAppViewRefMap)) {
				JsonNode node2 = originViewNode.get(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				ArrayNode psAppViewRefsNode = null;
				if(node2 instanceof ArrayNode) {
					psAppViewRefsNode = (ArrayNode)node2;
				}
				else {
					psAppViewRefsNode = originViewNode.putArray(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				}

				Map<String, String> map = new LinkedHashMap<String, String>();
				for(int i =0; i<psAppViewRefsNode.size(); i++) {
					ObjectNode objectNode = (ObjectNode)psAppViewRefsNode.get(i);
					JsonNode jsonNode = objectNode.get(PSAppViewRefImpl.ATTR_GETNAME);
					if(jsonNode != null) {
						map.put(jsonNode.asText(), null);
					}
				}


				for(java.util.Map.Entry<String, IPSAppDEView> entry : psAppViewRefMap.entrySet()) {

					if(map.containsKey(entry.getKey())) {
						continue;
					}

					ObjectNode psAppViewRefNode = psAppViewRefsNode.addObject();
					IPSAppDEView refPSAppDEView = entry.getValue();

					psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETNAME, entry.getKey());
					if(StringUtils.hasLength(refPSAppDEView.getOpenMode())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALOPENMODE, refPSAppDEView.getOpenMode());
					}
					if(StringUtils.hasLength(refPSAppDEView.getTitle())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALTITLE, refPSAppDEView.getTitle());
					}

					ObjectNode refNode = psAppViewRefNode.putObject(PSAppViewRefImpl.ATTR_GETREFPSAPPVIEW);
					refNode.put("modelref", true);
					refNode.put("path", refPSAppDEView.getDynaModelFilePath());
					refNode.put("viewType", refPSAppDEView.getViewType());
				}
			}

			//修复名称
			if(StringUtils.hasLength(strWFName)) {
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETCAPPSLANGUAGERES);
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETTITLEPSLANGUAGERES);

				originViewNode.put(PSAppDEViewImpl.ATTR_GETCAPTION, strWFName);
				originViewNode.put(PSAppDEViewImpl.ATTR_GETTITLE, strWFName);
			}

			return originViewNode;
		}

		return null;
	}


	protected ObjectNode getPSAppDEEditViewModel(IPSAppDEView iPSAppDEView, String strWFTag, Object param) throws Throwable {
		//查出相关实体工作流
		V2SystemExtensionSuite v2SystemExtensionSuite = this.getV2SystemExtensionSuite(false);

		boolean bMobile = iPSAppDEView.getViewType().indexOf("DEMOB") != -1;
		String strFullWFTag = null;
		String strDEWFTag = null;
		String strWFName = null;
		String srfParentDEName = null;
		String srfParentKey = null;
		String strFormTagPrefix = null;
		String strDataType;
		if(param instanceof Map){
			Map map = (Map)param;
			srfParentDEName = (String)map.get("srfparentdename");
			srfParentKey = (String)map.get("srfparentkey");
			strDataType = (String)map.get("srfdatatype");
		} else {
			strDataType = null;
		}
		//计算关系字段
		if(StringUtils.hasLength(srfParentDEName) && StringUtils.hasLength(srfParentKey)) {
			List<IPSDERBase> psDERBases = this.getPSDataEntity().getMinorPSDERs();
			if (psDERBases != null) {
				for (IPSDERBase iPSDERBase : psDERBases) {
					if(!iPSDERBase.getMajorPSDataEntity().getName().equalsIgnoreCase(srfParentDEName)){
						continue;
					}
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						strFormTagPrefix = String.format(FIELD_EXTENSION_FORMAT, iPSDER1N.getPSPickupDEFieldMust().getName().toUpperCase(), srfParentKey);
						break;
					} else if (iPSDERBase instanceof IPSDERCustom) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
						IPSDEField iPSDEField = iPSDERCustom.getPickupPSDEField();
						if (iPSDEField != null) {
							strFormTagPrefix = String.format(FIELD_EXTENSION_FORMAT, iPSDEField.getName().toUpperCase(), srfParentKey);
							break;
						}
					}
				}
			}
		}
		IPSApplication iPSApplication = iPSAppDEView.getParentPSModelObject(IPSApplication.class);
		IPSDataEntity iPSDataEntity = this.getPSDataEntity();

		Map<String, IPSAppDEView> psAppViewRefMap = new LinkedHashMap<String, IPSAppDEView>();

		if(StringUtils.hasLength(strWFTag)) {
			//根据流程标记，查出全部版本
			IPSDEWF iPSDEWF = null;
			List<IPSDEWF> psDEWFs = iPSDataEntity.getAllPSDEWFs();
			if(!ObjectUtils.isEmpty(psDEWFs)) {
				for(IPSDEWF item : psDEWFs) {
					if(strWFTag.equalsIgnoreCase(item.getPSWorkflowMust().getCodeName())) {
						iPSDEWF = item;
						break;
					}
				}
			}

			if(iPSDEWF != null) {

				IPSWorkflow iPSWorkflow = iPSDEWF.getPSWorkflowMust();
				if(!ObjectUtils.isEmpty(iPSWorkflow.getPSWFDEs())) {
					strDEWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow.getPSWFDEs().get(0));
				}
				if(!StringUtils.hasLength(strDEWFTag)){
					return null;
				}
				strFullWFTag = PSModelUtils.calcUniqueTag2(iPSWorkflow);
				//现有流程
				strWFName = iPSWorkflow.getName();
			}
			else {
				String strDETag = PSModelUtils.calcUniqueTag2(iPSDataEntity);
				strFullWFTag = String.format("%1$s.%2$s",PSModelUtils.getParentId(strDETag), strWFTag);
				strDEWFTag = String.format("%1$s.%2$s", strFullWFTag, "default");

				List<V2SystemExtensionWorkflow> v2SystemExtensionWorkflowList = v2SystemExtensionSuite.getWorkflows();
				if(!ObjectUtils.isEmpty(v2SystemExtensionWorkflowList)) {
					for(V2SystemExtensionWorkflow v2SystemExtensionWorkflow : v2SystemExtensionWorkflowList) {
						if(strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflow.getWorkflowTag())) {

							String strModel = v2SystemExtensionWorkflow.getPendingExtensionModel();
							if(!StringUtils.hasLength(strModel)) {
								strModel = v2SystemExtensionWorkflow.getExtensionModel();
							}

							if(StringUtils.hasLength(strModel)) {
								PSWorkflow psWorkflow = JsonUtils.as(strModel, PSWorkflow.class);
								strWFName = psWorkflow.getName();
								break;
							}

						}
					}
				}
			}

			if(!StringUtils.hasLength(strFullWFTag)
					|| !StringUtils.hasLength(strDEWFTag)) {
				return null;
			}

			//
			List<V2SystemExtensionWorkflowDefinition> v2SystemExtensionWorkflowDefinitionList = v2SystemExtensionSuite.getWorkflowDefinitions();
			if(!ObjectUtils.isEmpty(v2SystemExtensionWorkflowDefinitionList)) {
				for(V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition : v2SystemExtensionWorkflowDefinitionList) {
					if(!strFullWFTag.equalsIgnoreCase(v2SystemExtensionWorkflowDefinition.getWorkflowTag())) {
						continue;
					}

					if(!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getRuntimeModel())) {
						continue;
					}

					if(!StringUtils.hasLength(v2SystemExtensionWorkflowDefinition.getExtensionModel())) {
						continue;
					}

					PSWFVersion psWFVersion = JsonUtils.as(v2SystemExtensionWorkflowDefinition.getExtensionModel(), PSWFVersion.class);
					List<PSWFProcess> psWFProcessList = psWFVersion.getPSWFProcesses();
					if(!ObjectUtils.isEmpty(psWFProcessList)) {

						for(PSWFProcess psWFProcess : psWFProcessList) {
							if(WFProcessType.START.value.equalsIgnoreCase(psWFProcess.getWFProcessType())) {
								String strViewCodeName = null;
								if(!bMobile) {
									if(StringUtils.hasLength(psWFProcess.getPSDEViewBaseId())) {
										strViewCodeName = PSModelUtils.getSimpleId(psWFProcess.getPSDEViewBaseId());

									}
								}
								else {
									if(StringUtils.hasLength(psWFProcess.getMobPSDEViewId())) {
										strViewCodeName = PSModelUtils.getSimpleId(psWFProcess.getMobPSDEViewId());
									}
								}

								if(StringUtils.hasLength(strViewCodeName)) {
									java.util.List<IPSAppView> psAppViewList = iPSApplication.getAllPSAppViews();
									if(!ObjectUtils.isEmpty(psAppViewList)) {
										for(IPSAppView iPSAppView : psAppViewList) {
											if(iPSAppView instanceof IPSAppDEView) {
												IPSAppDEView iPSAppDEView2 = (IPSAppDEView)iPSAppView;
												if(!iPSAppDEView2.getPSAppDataEntityMust().getPSDataEntityMust().getId().equals(iPSDataEntity.getId())) {
													continue;
												}
												if(strViewCodeName.equalsIgnoreCase(iPSAppDEView2.getPSDEViewCodeName())) {
													String strViewRefMode = String.format("%1$s@%2$s","WFSTART",psWFVersion.getWFVersion());
													psAppViewRefMap.put(strViewRefMode, iPSAppDEView2);
													break;
												}
											}
											else {
												continue;
											}
										}
									}
								}
							}
						}
					}

				}
			}
		}

		Map<String, String> formCodeNameMap = new HashMap<String, String>();

		ObjectNode originViewNode = iPSAppDEView.getObjectNode().deepCopy();// JsonUtils.toObjectNode(iPSAppDEView.getObjectNode().toString());
		JsonNode node = originViewNode.get(PSAppViewImpl.ATTR_GETPSCONTROLS);
		if(node == null) {
			//尝试从视图面板中获取
			JsonNode viewLayoutPanelNode = originViewNode.get(PSAppViewImpl.ATTR_GETPSVIEWLAYOUTPANEL);
			if(viewLayoutPanelNode instanceof ObjectNode) {
				node = ((ObjectNode)viewLayoutPanelNode).get(PSAppViewImpl.ATTR_GETPSCONTROLS);
			}
		}
		if(node instanceof ArrayNode) {
			//循环表单
			ArrayNode arrayNode = (ArrayNode)node;
			for(int i = 0 ;i<arrayNode.size();i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if(strName.equals("form") || strName.startsWith("_form_")){
					JsonNode codeNameNode = ctrlNode.get("codeName");
					if(codeNameNode != null) {
						String strCodeName = codeNameNode.asText();
						if(StringUtils.hasLength(strCodeName)) {
							formCodeNameMap.put(strCodeName.toLowerCase(), "");
						}
					}
				}
			}
		}

		Map<String, V2SystemExtensionForm> v2SystemExtensionFormMap = new HashMap<String, V2SystemExtensionForm>();

		//查出表单
		List<V2SystemExtensionForm> v2SystemExtensionFormList = v2SystemExtensionSuite.getForms();
		if(!ObjectUtils.isEmpty(v2SystemExtensionFormList)) {
			for(V2SystemExtensionForm v2SystemExtensionForm : v2SystemExtensionFormList) {
				if(!StringUtils.hasLength(v2SystemExtensionForm.getRuntimeModel())) {
					continue;
				}

				if(!StringUtils.hasLength(v2SystemExtensionForm.getExtensionModel())) {
					continue;
				}

				if(!this.getDataEntityTag().equals(v2SystemExtensionForm.getDataEntityTag())){
					continue;
				}
				//过滤参数，非当前视图实体表单计算可能会出现异常
				String[] formTags = v2SystemExtensionForm.getFormTag().split("[@]");
				if(formTags != null && formTags.length > 1){
					if(!formTags[0].equalsIgnoreCase(strFormTagPrefix)){
						continue;
					}
				}
				PSDEForm psDEForm = JsonUtils.as(v2SystemExtensionForm.getExtensionModel(), PSDEForm.class);
				if(( StringUtils.hasLength(strDEWFTag) && strDEWFTag.equalsIgnoreCase(psDEForm.getPSWFDEId()))
						|| (!StringUtils.hasLength(strDEWFTag) && !StringUtils.hasLength(psDEForm.getPSWFDEId()))) {
					if(!formCodeNameMap.containsKey(psDEForm.getCodeName().toLowerCase())) {
						continue;
					}
					//避免重复写入覆盖
					if(!v2SystemExtensionFormMap.containsKey(psDEForm.getCodeName().toLowerCase()) || v2SystemExtensionForm.getFormTag().contains("@")){
						v2SystemExtensionFormMap.put(psDEForm.getCodeName().toLowerCase(), v2SystemExtensionForm);
					}
				}
			}
		}

		//执行替换操作
		if(node instanceof ArrayNode) {

			List<ObjectNode> list = new ArrayList<ObjectNode>();
			//循环表单
			ArrayNode arrayNode = (ArrayNode)node;
			int dynaSysMode = 1;
			for(int i = 0 ;i<arrayNode.size();i++) {
				ObjectNode ctrlNode = (ObjectNode) arrayNode.get(i);
				String strName = ctrlNode.get("name").asText();
				if(!(strName.equals("form")||strName.startsWith("_form_"))){
					list.add(ctrlNode);
				}
				else {
					String strCodeName = null;
					JsonNode codeNameNode = ctrlNode.get("codeName");
					if(codeNameNode != null) {
						strCodeName = codeNameNode.asText();
					}

					JsonNode dynaSysModeNode = ctrlNode.get("dynaSysMode");
					if(dynaSysModeNode != null && dynaSysModeNode.asInt() > 1){
						dynaSysMode = dynaSysModeNode.asInt();
					}
					V2SystemExtensionForm v2SystemExtensionForm = StringUtils.hasLength(strCodeName)? v2SystemExtensionFormMap.remove(strCodeName.toLowerCase()): null;
					if(v2SystemExtensionForm == null) {
						list.add(ctrlNode);
					}
					else {
						String strRuntimeModel = ExtensionUtils.replaceRuntimeModel(v2SystemExtensionForm.getRuntimeModel(), iPSApplication, false);
						ObjectNode form = JsonUtils.toObjectNode(strRuntimeModel);
						//ObjectNode form = JsonUtils.toObjectNode(v2SystemExtensionForm.getRuntimeModel());
						ObjectNode newForm = ctrlNode.deepCopy();// JsonUtils.toObjectNode(ctrlNode.toString());
						newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMUPDATES));
						newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMPAGES, form.get(PSDEFormImpl.ATTR_GETPSDEFORMPAGES));
						newForm.set(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS, form.get(PSDEFormImpl.ATTR_GETPSDEFORMITEMVRS));
						newForm.set(PSDEFormImpl.ATTR_GETCODENAME, form.get(PSDEFormImpl.ATTR_GETCODENAME));
						newForm.set(PSDEFormImpl.ATTR_GETLOGICNAME, form.get(PSDEFormImpl.ATTR_GETLOGICNAME));
						if(form.get(PSDEFormImpl.ATTR_ISNOTABHEADER)!=null) {
							newForm.set(PSDEFormImpl.ATTR_ISNOTABHEADER, form.get(PSDEFormImpl.ATTR_ISNOTABHEADER));
						}

						ArrayNode newPSAppCounterRefNodes = null;
						if(newForm.has(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS)) {
							newPSAppCounterRefNodes = (ArrayNode)newForm.get(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
						}
						else {
							newPSAppCounterRefNodes = newForm.putArray(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
						}

						if(form.has(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS)) {
							ArrayNode psAppCounterRefNodes = (ArrayNode)form.get(PSDEFormImpl.ATTR_GETPSAPPCOUNTERREFS);
							newPSAppCounterRefNodes.addAll(psAppCounterRefNodes);
						}


						newForm.remove(PSDEFormImpl.ATTR_GETPSDEFORMITEMS);
						newForm.remove(PSDEFormImpl.ATTR_GETDYNAMODELFILEPATH);

						list.add(newForm);
					}
				}
			}
			//高级动态模式
			if(dynaSysMode == 2){
				list = list.stream().filter(item -> (item.get("dataType") !=null && item.get("dataType").asText().equals(strDataType)) || item.get("dataType") == null).collect(Collectors.toList());
			}
			arrayNode.removeAll();
			arrayNode.addAll(list);

			if(!ObjectUtils.isEmpty(psAppViewRefMap)) {
				JsonNode node2 = originViewNode.get(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				ArrayNode psAppViewRefsNode = null;
				if(node2 instanceof ArrayNode) {
					psAppViewRefsNode = (ArrayNode)node2;
				}
				else {
					psAppViewRefsNode = originViewNode.putArray(PSAppViewImpl.ATTR_GETPSAPPVIEWREFS);
				}

				for(java.util.Map.Entry<String, IPSAppDEView> entry : psAppViewRefMap.entrySet()) {
					ObjectNode psAppViewRefNode = psAppViewRefsNode.addObject();
					IPSAppDEView refPSAppDEView = entry.getValue();

					psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETNAME, entry.getKey());
					if(StringUtils.hasLength(refPSAppDEView.getOpenMode())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALOPENMODE, refPSAppDEView.getOpenMode());
					}
					if(StringUtils.hasLength(refPSAppDEView.getTitle())) {
						psAppViewRefNode.put(PSAppViewRefImpl.ATTR_GETREALTITLE, refPSAppDEView.getTitle());
					}

					ObjectNode refNode = psAppViewRefNode.putObject(PSAppViewRefImpl.ATTR_GETREFPSAPPVIEW);
					refNode.put("modelref", true);
					refNode.put("path", refPSAppDEView.getDynaModelFilePath());
					refNode.put("viewType", refPSAppDEView.getViewType());
				}
			}

			//修复名称
			if(StringUtils.hasLength(strWFName)) {
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETCAPPSLANGUAGERES);
				originViewNode.remove(PSAppDEViewImpl.ATTR_GETTITLEPSLANGUAGERES);

				originViewNode.put(PSAppDEViewImpl.ATTR_GETCAPTION, strWFName);
				originViewNode.put(PSAppDEViewImpl.ATTR_GETTITLE, strWFName);
			}

			return originViewNode;
		}

		return null;
	}


	protected String getDynaViewMode(String strViewType) {
		return DynaViewModeMap.get(strViewType);
	}

	@Override
	public ObjectNode getPSControlModel(IPSControl iPSControl, Object param) {
		// TODO Auto-generated method stub
		return null;
	}

	protected void logEvent(int nLogLevel, String strInfo) {
		logEvent(nLogLevel, strInfo, null);
	}

	protected void logEvent(int nLogLevel, String strInfo, Object objData) {
		this.logEvent(nLogLevel, getLogCat(), strInfo, objData);
	}

	/**
	 * 日志服务总线事件信息
	 *
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param objData
	 */
	protected void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {
		boolean bDisabled = EmployeeContext.isCurrentDisabled();
		try {
			EmployeeContext.setCurrentDisabled(true);
			if (objData == null) {
				ISystemRuntime iSystemRuntime = this.getSystemRuntime();
				Log log = new Log();
				log.setSystemId(iSystemRuntime.getServiceId());
				log.set("dcsystemid", iSystemRuntime.getServiceId());
				objData = log;
			}
			this.getSystemRuntime().logEvent(nLogLevel, strCat, strInfo, objData);
		} catch (Throwable ex) {
			log.error(String.format("日志事件发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			EmployeeContext.setCurrentDisabled(bDisabled);
		}
	}

	@Override
	public IPSModelTranspilerEx getPSModelTranspilerEx(Class<?> cls, IPSModel iPSModel, boolean bTryMode) {
		return null;
	}

	// @Override
	protected String getLogCat() {
		return LogCats.EXTENSION;
	}
}
