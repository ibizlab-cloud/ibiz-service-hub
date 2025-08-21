package net.ibizsys.central.dataentity;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.ba.ISysBDPersistentAdapter;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.database.ISysDBPersistentAdapter;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.database.ISysDBTableRuntime;
import net.ibizsys.central.dataentity.ac.DEAutoCompleteRuntime;
import net.ibizsys.central.dataentity.ac.IDEAutoCompleteRuntime;
import net.ibizsys.central.dataentity.ac.IDEAutoCompleteRuntimeBase;
import net.ibizsys.central.dataentity.action.DEActionInputDTORuntime;
import net.ibizsys.central.dataentity.action.DEActionPluginRuntime2Proxy;
import net.ibizsys.central.dataentity.action.DEActionPluginRuntimeBase;
import net.ibizsys.central.dataentity.action.IDEActionInputDTORuntime;
import net.ibizsys.central.dataentity.action.IDEActionLogicRuntimeBase;
import net.ibizsys.central.dataentity.action.IDEActionPluginRuntime2;
import net.ibizsys.central.dataentity.dataexport.DEDataExportRuntime;
import net.ibizsys.central.dataentity.dataflow.DEDataFlowRuntime;
import net.ibizsys.central.dataentity.dataflow.IDEDataFlowRuntime;
import net.ibizsys.central.dataentity.dataimport.DEDataImportRuntime;
import net.ibizsys.central.dataentity.dataimport.IDEDataImportRuntime2;
import net.ibizsys.central.dataentity.datasync.IDEDataSyncOutRuntimeBase;
import net.ibizsys.central.dataentity.defield.DEFGroupRuntime;
import net.ibizsys.central.dataentity.defield.IDEFGroupRuntime;
import net.ibizsys.central.dataentity.defield.IDEFValueRuleRuntimeBase;
import net.ibizsys.central.dataentity.demap.IDEMapRuntime;
import net.ibizsys.central.dataentity.der.DERAggDataRuntime;
import net.ibizsys.central.dataentity.der.IDERRuntime;
import net.ibizsys.central.dataentity.der.IDERRuntimeBase;
import net.ibizsys.central.dataentity.ds.DECodeListDataSetRuntime;
import net.ibizsys.central.dataentity.ds.DEDataQueryCodeRuntime;
import net.ibizsys.central.dataentity.ds.DEDataSetPluginRuntimeBase;
import net.ibizsys.central.dataentity.ds.DEFilterDTORuntime;
import net.ibizsys.central.dataentity.ds.DELogicDataSetRuntime;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.dataentity.ds.IDEDataSetLogicRuntimeBase;
import net.ibizsys.central.dataentity.ds.IDEFilterDTORuntime;
import net.ibizsys.central.dataentity.logic.DELogicRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSubTypes;
import net.ibizsys.central.dataentity.logic.DEMSLogicRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.notify.DENotifyRuntime;
import net.ibizsys.central.dataentity.search.DESearchRuntime;
import net.ibizsys.central.dataentity.search.IDESearchRuntime;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.dataentity.service.DEMethodDTORuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTO;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.dataentity.service.IDEServiceInitable;
import net.ibizsys.central.dataentity.state.IDEUniStateRuntimeBase;
import net.ibizsys.central.dataentity.testing.IDETestCaseRuntime;
import net.ibizsys.central.dataentity.util.DECacheUtilRuntime;
import net.ibizsys.central.dataentity.util.DEDynaStorageUtilRuntime;
import net.ibizsys.central.dataentity.util.DENotifySettingUtilRuntime;
import net.ibizsys.central.dataentity.util.DEVersionControlUtilRuntime;
import net.ibizsys.central.dataentity.util.DEVersionStorageUtilRuntime;
import net.ibizsys.central.dataentity.util.IDEDynaStorageUtilRuntime;
import net.ibizsys.central.dataentity.util.IDENotifySettingUtilRuntime;
import net.ibizsys.central.dataentity.util.IDEPersistentUtilRuntime;
import net.ibizsys.central.dataentity.util.IDEVersionControlUtilRuntime;
import net.ibizsys.central.dataentity.util.IDEVersionStorageUtilRuntime;
import net.ibizsys.central.dataentity.wf.DEWFRuntime;
import net.ibizsys.central.dataentity.wf.IDEWFRuntime;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.res.ISysDEUniStateRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.system.ISystemModuleRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntime;
import net.ibizsys.central.testing.ISysTestCaseRuntime;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.ISearchGroupCond;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.annotation.DEAction;
import net.ibizsys.central.util.annotation.DEDataSet;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.central.util.script.ScriptEntity;
import net.ibizsys.central.util.script.ScriptSearchContext;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.PSModelEnums.DEActionBatchMode;
import net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode;
import net.ibizsys.model.PSModelEnums.DEActionMode;
import net.ibizsys.model.PSModelEnums.DEDataAccCtrlMode;
import net.ibizsys.model.PSModelEnums.DEDataQueryViewLevel;
import net.ibizsys.model.PSModelEnums.DEDataSetGroupMode;
import net.ibizsys.model.PSModelEnums.DEDataSetOption;
import net.ibizsys.model.PSModelEnums.DEExtendMode;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.DEFType;
import net.ibizsys.model.PSModelEnums.DEMethodInputType;
import net.ibizsys.model.PSModelEnums.DER1NDEFMapType;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.DEType;
import net.ibizsys.model.PSModelEnums.DEUtilType;
import net.ibizsys.model.PSModelEnums.LogicSubType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.PSModelEnums.SortDir;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.database.IPSDEDBConfig;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.ac.IPSDEACMode;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionInput;
import net.ibizsys.model.dataentity.action.IPSDEActionInputDTO;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.action.IPSDEActionParam;
import net.ibizsys.model.dataentity.action.IPSDELogicAction;
import net.ibizsys.model.dataentity.action.IPSDEScriptAction;
import net.ibizsys.model.dataentity.action.IPSDESelectByKeyAction;
import net.ibizsys.model.dataentity.action.IPSDEUserCustomAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.datamap.IPSDEMap;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupObjectDEField;
import net.ibizsys.model.dataentity.defield.PSDEFieldImpl;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRQueryCountCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRangeCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRecursionCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetInput;
import net.ibizsys.model.dataentity.ds.IPSDEFilterDTO;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.mainstate.IPSDEMainState;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.priv.IPSDEOPPriv;
import net.ibizsys.model.dataentity.search.IPSDESearch;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.dataentity.unistate.IPSDEUniState;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.model.testing.IPSSysTestCase;
import net.ibizsys.model.wf.IPSWFDE;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.runtime.DynaInstModes;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DEStorageModes;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.DEVirtualModes;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.action.CheckKeyStates;
import net.ibizsys.runtime.dataentity.action.DEActionLogicTypes;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.action.DEActionParamModes;
import net.ibizsys.runtime.dataentity.action.DEActionTypes;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.action.IDEActionLogicRuntime;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncEvents;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;
import net.ibizsys.runtime.dataentity.ds.DEDataSetTypes;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;
import net.ibizsys.runtime.dataentity.service.DEMethodDTOFieldTypes;
import net.ibizsys.runtime.dataentity.service.DEMethodDTOTypes;
import net.ibizsys.runtime.dataentity.service.DEMethodInputTypes;
import net.ibizsys.runtime.dataentity.service.DEMethodReturnTypes;
import net.ibizsys.runtime.dataentity.util.DEUtilTypes;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionBackup;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DBTypes;
import net.ibizsys.runtime.util.DataEntityRuntimeHolder;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.EntityException;
import net.ibizsys.runtime.util.EntityListUtils;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IActionSessionLog;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.ModelRuntimeUtils;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.IScriptSearchContext;

/**
 * 默认实体运行时对象
 *
 * @author lionlau
 *
 */
public class DataEntityRuntime extends DataEntityRuntimeBase implements IDataEntityRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRuntime.class);

	public final static String DEFAULTTAG = "DEFAULT";
	
	public static final String ACTIONSESSIONPARAM_COPYSOURCE_X = "_COPYSOURCE__%1$s__%2$s";

	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private String strId = null;
	private String strName = null;
	private Object data = null;

	private Map<String, Object> methodMap = null;
	private Map<String, IDEMethodDTORuntime> deMethodDTORuntimeMap = new HashMap<String, IDEMethodDTORuntime>();
	private Map<String, IDEDataQueryCodeRuntime> deDataQueryCodeRuntimeMap = null;
	private Map<String, IPSDEFSearchMode> psDEFSearchModeMap = new HashMap<String, IPSDEFSearchMode>();
	private Map<String, IPSDEField> psDEFieldMap2 = new HashMap<String, IPSDEField>();

	private Map<String, IDERRuntime> derRuntimeMap = null;
	private Map<String, IDEWFRuntime> deWFRuntimeMap = null;
	private List<ISysDEUniStateRuntime> deUniStateRuntimeList = null;
	private List<IPSDEField> quickSearchPSDEFieldList = null;
	private Map<String, IDEMapRuntime> deMapRuntimeMap = null;
	private Map<String, IDEAutoCompleteRuntime> deAutoCompleteRuntimeMap = null;
	private Map<String, IDEDataFlowRuntime> deDataFlowRuntimeMap = null;
	private Map<String, IDEFGroupRuntime> defGroupRuntimeMap = null;

	private Map<String, List<IDEActionLogicRuntime>> deActionLogicRuntimeListMap = null;
	private Map<IPSDEActionLogic, IDEActionLogicRuntime> deActionLogicRuntimeMap = null;

	private Map<String, List<IDEDataSetLogicRuntimeBase>> deDataSetLogicRuntimeBaseListMap = null;
	private Map<String, List<IDEActionLogicRuntimeBase>> deActionLogicRuntimeBaseListMap = null;

	private Map<String, List<IDEDataSyncOutRuntimeBase>> deDataSyncOutRuntimeBaseListMap = null;
	private Map<String, List<IDEUniStateRuntimeBase>> deUniStateRuntimeBaseListMap = null;

	private Map<String, List<IDEAutoCompleteRuntimeBase>> deAutoCompleteRuntimeBaseListMap = null;

	private Map<String, List<IDEFValueRuleRuntimeBase>> defValueRuleRuntimeBaseListMap = null;

	private Map<String, List<IDataEntityInheritLogic>> dataEntityInheritLogicListMap = null;

	private Map<String, List<IDataEntityExtendLogic>> dataEntityExtendLogicListMap = null;

	private Map<String, List<IDERRuntimeBase>> derRuntimeBaseListMap = null;

	private IDEMethodDTORuntime defaultDEMethodDTORuntime = null;
	private IDEFilterDTORuntime defaultDEFilterDTORuntime = null;
	private ISystemPersistentAdapter iSystemPersistentAdapter = null;
	private ISysDBSchemeRuntime iSysDBSchemeRuntime = null;
	private IPSDEDBConfig defaultPSDEDBConfig = null;
	private ISysBDSchemeRuntime iSysBDSchemeRuntime = null;
	private IDataEntityAccessManager iDataEntityAccessManager = null;
	private IDEService iDEService = null;
	private boolean bEnableDEService = false;
	private ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = null;
	private ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = null;
	private ISystemModuleUtilRuntime iSystemModuleUtilRuntime = null;
	private ISystemModuleRuntime iSystemModuleRuntime = null;
	private boolean bEnableVersionControl = false;
	private IDEVersionControlUtilRuntime iDEVersionControlUtilRuntime = null;

	private boolean bEnableVersionStorage = false;
	private IDEVersionStorageUtilRuntime iDEVersionStorageUtilRuntime = null;

	private boolean bEnableNotifySetting = false;
	private IDENotifySettingUtilRuntime iDENotifySettingUtilRuntime = null;

	private List<IDETestCaseRuntime> deTestCaseRuntimeList = null;
	private List<IDESearchRuntime> deSearchRuntimeList = null;
	private List<IDELogicRuntime> deOPPrivLogicRuntimeList = null;
	private boolean bEnableDEOPPrivLogic = false;
	private Boolean bEnableDEOPPrivLogicIncludeMaster = null;

	private boolean bTranslateSearchFieldCondBeforeProceed = false;

	private List<IPSDEField> extendedPSDEFieldList = null;

	private List<IPSDEField> dynaStoragePSDEFieldList = null;

	private List<IPSDEField> extendedDynaStoragePSDEFieldList = null;
	
	private List<IPSDEField> attachmentPSDEFieldList = null;

	private List<IPSDEField> extendedAttachmentPSDEFieldList = null;
	

	private static ThreadLocal<Boolean> IgnoreExecuteDEOPPrivLogics = new ThreadLocal<Boolean>() {
		protected Boolean initialValue() {
			return false;
		}
	};

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = new IDataEntityRuntimeContext() {

		@Override
		public IDataEntityRuntime getDataEntityRuntime() {
			return getSelf();
		}

		@Override
		public ISysDBSchemeRuntime getSysDBSchemeRuntime() {
			return getSelf().getSysDBSchemeRuntime();
		}

		@Override
		public Object executeActionReal(IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
			return getSelf().doExecuteActionReal(iPSDEAction.getName(), iPSDEAction, args, actionData);
		}

		@Override
		public Object fetchDataSetReal(IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
			return getSelf().doFetchDataSetReal(iPSDEDataSet.getName(), iPSDEDataSet, args, actionData);
		}

		@Override
		public Object executeActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
			if (!StringUtils.hasLength(strActionName) && iPSDEAction != null) {
				strActionName = iPSDEAction.getName();
			}

			return getSelf().doExecuteActionReal(strActionName, iPSDEAction, args, actionData);
		}

		@Override
		public Object fetchDataSetReal(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
			if (!StringUtils.hasLength(strDataSetName) && iPSDEDataSet != null) {
				strDataSetName = iPSDEDataSet.getName();
			}
			return getSelf().doFetchDataSetReal(strDataSetName, iPSDEDataSet, args, actionData);
		}

		@Override
		public void fireDataEntityEvent(String event, Object[] params) {
			getSelf().fireDataEntityEvent(event, params);
		}
	};

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSDataEntity iPSDataEntity, Object data) throws Exception {
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.strId = iPSDataEntity.getId();
		this.strName = iPSDataEntity.getName();
		this.data = data;
		this.bEnableDEService = iSystemRuntimeContext.getSystemRuntime().isEnableDEService(iPSDataEntity);
		// 实体为延迟加载，不调用 onInit();
	}

	@Override
	protected void onInit() throws Exception {

		if (this.getPSDataEntity().getPSSystemModule() != null) {
			this.iSystemModuleRuntime = this.getSystemRuntime().getSystemModuleRuntime(this.getPSDataEntity().getPSSystemModule().getId(), false);
			if (this.iSystemModuleRuntime instanceof ISystemModuleUtilRuntime) {
				this.iSystemModuleUtilRuntime = (ISystemModuleUtilRuntime) this.iSystemModuleRuntime;
			}
		}

		super.onInit();

		// 缓存搜索模式
		List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
		if (psDEFieldList != null) {
			ArrayList<IPSDEField> dynaStoragePSDEFieldList = new ArrayList<IPSDEField>();
			ArrayList<IPSDEField> attachmentPSDEFieldList = new ArrayList<IPSDEField>();
			for (IPSDEField iPSDEField : psDEFieldList) {
				List<IPSDEFSearchMode> psDEFSearchModeList = iPSDEField.getAllPSDEFSearchModes();
				if (psDEFSearchModeList != null) {
					for (IPSDEFSearchMode iPSDEFSearchMode : psDEFSearchModeList) {
						psDEFSearchModeMap.put(iPSDEFSearchMode.getLowerCaseName(), iPSDEFSearchMode);
						if (!this.bTranslateSearchFieldCondBeforeProceed && iPSDEFSearchMode.getPSSysTranslator() != null) {
							this.bTranslateSearchFieldCondBeforeProceed = true;
						}
						// psDEFSearchModeMap.put(String.format("codename:%1$s",
						// iPSDEFSearchMode.getCodeName().toLowerCase()),
						// iPSDEFSearchMode);
					}
				}
				if (StringUtils.hasLength(iPSDEField.getCodeName())) {
					this.psDEFieldMap2.put(iPSDEField.getCodeName().toLowerCase(), iPSDEField);
				}

				if(this.isDynaStoragePSDEField(iPSDEField, true)) {
					dynaStoragePSDEFieldList.add(iPSDEField);
				}
				
				if(this.isAttachmentPSDEField(iPSDEField, true)) {
					attachmentPSDEFieldList.add(iPSDEField);
				}
			}
			this.dynaStoragePSDEFieldList = Collections.unmodifiableList(dynaStoragePSDEFieldList);
			this.attachmentPSDEFieldList = Collections.unmodifiableList(attachmentPSDEFieldList);
		}

		List<IPSDERBase> psDERBases = this.getPSDataEntity().getMinorPSDERs();
		if (psDERBases != null) {
			for (IPSDERBase iPSDERBase : psDERBases) {
				IDERRuntime iDERRuntime = this.createDERRuntime(iPSDERBase);
				if (iDERRuntime == null) {
					continue;
				}
				try {
					iDERRuntime.init(this.getDataEntityRuntimeContext(), iPSDERBase);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化实体关系[%1$s]运行时对象发生异常，%2$s", iPSDERBase.getName(), ex.getMessage()), ex);
				}
				if (this.derRuntimeMap == null) {
					this.derRuntimeMap = new HashMap<String, IDERRuntime>();
				}
				this.derRuntimeMap.put(iPSDERBase.getId(), iDERRuntime);
			}
		}

		List<IPSDEUniState> psDEUniStateList = this.getPSDataEntity().getAllPSDEUniStates();
		if (!ObjectUtils.isEmpty(psDEUniStateList)) {
			for (IPSDEUniState iPSDEUniState : psDEUniStateList) {
				ISysDEUniStateRuntime iSysDEUniStateRuntime = (ISysDEUniStateRuntime) this.getSystemRuntime().getSysUniStateRuntime(iPSDEUniState.getPSSysUniStateMust());
				if (iSysDEUniStateRuntime == null) {
					continue;
				}
				if (this.deUniStateRuntimeList == null) {
					this.deUniStateRuntimeList = new ArrayList<ISysDEUniStateRuntime>();
				}
				this.deUniStateRuntimeList.add(iSysDEUniStateRuntime);
			}
		}

		List<IPSDEMap> psDEMapList = this.getPSDataEntity().getAllPSDEMaps();
		if (!ObjectUtils.isEmpty(psDEMapList)) {
			for (IPSDEMap iPSDEMap : psDEMapList) {

				if (!iPSDEMap.isEnableBackend()) {
					continue;
				}

				String strConfig = String.format("%1$s.%2$s.valid", ISystemRuntimeSetting.CONFIGFOLDER_DEMAP, iPSDEMap.getCodeName()).toLowerCase();
				if (!this.getSystemRuntime().getSystemRuntimeSetting().getParam(strConfig, iPSDEMap.isValid())) {
					continue;
				}
				// if(!iPSDEMap.isValid()) {
				// continue;
				// }
				IDEMapRuntime iDEMapRuntime = this.createDEMapRuntime(iPSDEMap);
				if (iDEMapRuntime == null) {
					continue;
				}
				try {
					iDEMapRuntime.init(this.getDataEntityRuntimeContext(), iPSDEMap);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化实体映射[%1$s]运行时对象发生异常，%2$s", iPSDEMap.getName(), ex.getMessage()), ex);
				}
				if (this.deMapRuntimeMap == null) {
					this.deMapRuntimeMap = new LinkedHashMap<String, IDEMapRuntime>();
				}
				this.deMapRuntimeMap.put(iPSDEMap.getCodeName().toLowerCase(), iDEMapRuntime);
			}
		}

		List<IPSDEACMode> psDEAutoCompleteList = this.getPSDataEntity().getAllPSDEACModes();
		if (!ObjectUtils.isEmpty(psDEAutoCompleteList)) {
			for (IPSDEACMode iPSDEAutoComplete : psDEAutoCompleteList) {

				if (!iPSDEAutoComplete.isEnableBackend()) {
					continue;
				}

				IDEAutoCompleteRuntime iDEAutoCompleteRuntime = this.createDEAutoCompleteRuntime(iPSDEAutoComplete);
				if (iDEAutoCompleteRuntime == null) {
					continue;
				}
				try {
					iDEAutoCompleteRuntime.init(this.getDataEntityRuntimeContext(), iPSDEAutoComplete);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化实体自动填充[%1$s]运行时对象发生异常，%2$s", iPSDEAutoComplete.getName(), ex.getMessage()), ex);
				}
				if (this.deAutoCompleteRuntimeMap == null) {
					this.deAutoCompleteRuntimeMap = new LinkedHashMap<String, IDEAutoCompleteRuntime>();
				}
				this.deAutoCompleteRuntimeMap.put(iPSDEAutoComplete.getCodeName().toLowerCase(), iDEAutoCompleteRuntime);
			}
		}

		if (this.getDataAccCtrlMode() == DEDataAccCtrlMode.SELF.value || this.getDataAccCtrlMode() == DEDataAccCtrlMode.MASTER_SELF.value) {
			List<IPSDELogic> psDELogicList = this.getPSDataEntity().getAllPSDELogics();
			if (!ObjectUtils.isEmpty(psDELogicList)) {
				for (IPSDELogic iPSDELogic : psDELogicList) {
					if (!DELogicSubTypes.DEOPPRIV.equals(iPSDELogic.getLogicSubType())) {
						continue;
					}
					IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(iPSDELogic);
					if (this.deOPPrivLogicRuntimeList == null) {
						this.deOPPrivLogicRuntimeList = new ArrayList<IDELogicRuntime>();
					}
					this.deOPPrivLogicRuntimeList.add(iDELogicRuntime);
					this.bEnableDEOPPrivLogic = true;
				}
			}
		}

		List<IPSDESearch> psDESearchList = this.getPSDataEntity().getAllPSDESearches();
		if (!ObjectUtils.isEmpty(psDESearchList)) {
			for (IPSDESearch iPSDESearch : psDESearchList) {
				if (iPSDESearch.isNoSQLStorage()) {
					continue;
				}
				IDESearchRuntime iDESearchRuntime = this.createDESearchRuntime(iPSDESearch);
				if (iDESearchRuntime == null) {
					continue;
				}
				try {
					iDESearchRuntime.init(this.getDataEntityRuntimeContext(), iPSDESearch);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化实体搜索[%1$s]运行时对象发生异常，%2$s", iPSDESearch.getName(), ex.getMessage()), ex);
				}
				if (this.deSearchRuntimeList == null) {
					this.deSearchRuntimeList = new ArrayList<IDESearchRuntime>();
				}
				this.deSearchRuntimeList.add(iDESearchRuntime);
			}
		}

		List<IPSDEDataFlow> psDEDataFlowList = this.getPSDataEntity().getAllPSDEDataFlows();
		if (!ObjectUtils.isEmpty(psDEDataFlowList)) {
			for (IPSDEDataFlow iPSDEDataFlow : psDEDataFlowList) {

				IDEDataFlowRuntime iDEDataFlowRuntime = this.createDEDataFlowRuntime(iPSDEDataFlow);
				if (iDEDataFlowRuntime == null) {
					continue;
				}
				try {
					iDEDataFlowRuntime.init(this.getDataEntityRuntimeContext(), iPSDEDataFlow);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化实体数据流[%1$s]运行时对象发生异常，%2$s", iPSDEDataFlow.getName(), ex.getMessage()), ex);
				}
				if (this.deDataFlowRuntimeMap == null) {
					this.deDataFlowRuntimeMap = new LinkedHashMap<String, IDEDataFlowRuntime>();
				}
				this.deDataFlowRuntimeMap.put(iPSDEDataFlow.getCodeName().toLowerCase(), iDEDataFlowRuntime);
			}
		}

		List<IPSDEFGroup> psDEFGroupList = this.getPSDataEntity().getAllPSDEFGroups();
		if (!ObjectUtils.isEmpty(psDEFGroupList)) {
			for (IPSDEFGroup iPSDEFGroup : psDEFGroupList) {

				IDEFGroupRuntime iDEFGroupRuntime = this.createDEFGroupRuntime(iPSDEFGroup);
				if (iDEFGroupRuntime == null) {
					continue;
				}
				try {
					iDEFGroupRuntime.init(this.getDataEntityRuntimeContext(), iPSDEFGroup);
				} catch (Exception ex) {
					throw new Exception(String.format("初始化实体属性组[%1$s]运行时对象发生异常，%2$s", iPSDEFGroup.getName(), ex.getMessage()), ex);
				}
				if (this.defGroupRuntimeMap == null) {
					this.defGroupRuntimeMap = new LinkedHashMap<String, IDEFGroupRuntime>();
				}
				this.defGroupRuntimeMap.put(iPSDEFGroup.getId(), iDEFGroupRuntime);
			}
		}

		prepareDEMethods();

		prepareDEWFs();

		prepareQuickSearchPSDEFields();

		IDataEntityAccessManager iDataEntityAccessManager = this.createDataEntityAccessManager();
		iDataEntityAccessManager.init(this.getDataEntityRuntimeContext(), this.getSystemRuntime().getSystemAccessManager());
		this.iDataEntityAccessManager = iDataEntityAccessManager;

		if (this.getStorageMode() != DEStorageModes.NONE) {
			if (this.getStorageMode() == DEStorageModes.SERVICEAPI) {
				this.iSubSysServiceAPIRuntime = this.getSystemRuntime().getSubSysServiceAPIRuntime(this.getPSDataEntity().getPSSubSysServiceAPIMust().getId(), false);
				this.iSubSysServiceAPIDERuntime = this.iSubSysServiceAPIRuntime.getSubSysServiceAPIDERuntime(this.getPSDataEntity().getPSSubSysServiceAPIDEMust().getId(), false);
			}

			// 获取当前实体持久化对象
			if (this.getPSDataEntity().isEnableSQLStorage() || this.getPSDataEntity().isEnableNoSQLStorage()) {
				if (this.getSystemModuleUtilRuntime() != null) {
					this.iSystemPersistentAdapter = this.getSystemModuleUtilRuntime().getSystemPersistentAdapter(this.getPSDataEntity());
				} else {
					this.iSystemPersistentAdapter = ((ISystemRuntimeContext) this.getSystemRuntimeContext()).getSystemPersistentAdapter(this.getPSDataEntity());
				}
			}

			if (this.getPSDataEntity().isEnableSQLStorage()) {
				if (this.getPSDataEntity().getPSSysDBScheme() != null) {
					this.iSysDBSchemeRuntime = this.getSystemRuntime().getSysDBSchemeRuntime(this.getPSDataEntity().getPSSysDBScheme().getId(), false);
				}
				if (this.getSysDBSchemeRuntime() != null) {
					String strDBType = this.getSysDBSchemeRuntime().getDBType();
					if (!StringUtils.hasLength(strDBType)) {
						strDBType = DBTypes.MYSQL5;
					}
					List<IPSDEDBConfig> psDEDBConfigList = this.getPSDataEntity().getAllPSDEDBConfigs();
					if (psDEDBConfigList != null) {
						for (IPSDEDBConfig iPSDEDBConfig : psDEDBConfigList) {
							if (strDBType.equals(iPSDEDBConfig.getDBType())) {
								this.defaultPSDEDBConfig = iPSDEDBConfig;
								break;
							}
						}
					}
					String strTableName = this.getTableName();
					if (StringUtils.hasLength(strTableName)) {
						ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBSchemeRuntime().getSysDBTableRuntime(strTableName, true);
						if (iSysDBTableRuntime != null) {
							iSysDBTableRuntime.setDataEntityRuntime(this);
						}
					}
				}
			}
		} else {
			if (this.isVirtual()) {
				if (this.getVirtualMode() == DEVirtualModes.MINHERIT) {
					if (getPSDERMultiInherits() != null && this.getPSDERMultiInherits().size() > 0) {
						IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDERMultiInherits().get(0).getMajorPSDataEntityMust().getId());
						this.iSystemPersistentAdapter = majorDataEntityRuntime.getSystemPersistentAdapter();
						this.iSysDBSchemeRuntime = majorDataEntityRuntime.getSysDBSchemeRuntime();
					}
				} else if (this.getVirtualMode() == DEVirtualModes.INDEXMAJOR) {
					if (this.getPSDataEntity().getMajorPSDERs() != null && this.getPSDataEntity().getMajorPSDERs().size() > 0) {
						for (IPSDERBase iPSDERBase : this.getPSDataEntity().getMajorPSDERs()) {
							if (DERTypes.DERINDEX.equals(iPSDERBase.getDERType())) {
								IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());
								if (minorDataEntityRuntime.getSystemPersistentAdapter() != null) {
									this.iSystemPersistentAdapter = minorDataEntityRuntime.getSystemPersistentAdapter();
									this.iSysDBSchemeRuntime = minorDataEntityRuntime.getSysDBSchemeRuntime();
									break;
								}
							}
						}
					}
				}
			}
		}

		prepareSystemPersistentAdapter();
	}

	protected void prepareSystemPersistentAdapter() throws Exception {
		IDEPersistentUtilRuntime iDEPersistentUtil = this.getDEUtilRuntime(IDEPersistentUtilRuntime.class, true);
		if (iDEPersistentUtil != null) {
			ISystemPersistentAdapter iSystemPersistentAdapter = iDEPersistentUtil.getSystemPersistentAdapter();
			if (iSystemPersistentAdapter != null) {
				this.setSystemPersistentAdapter(iSystemPersistentAdapter);
				if (iSystemPersistentAdapter instanceof ISysDBPersistentAdapter) {
					this.setSysDBSchemeRuntime(((ISysDBPersistentAdapter) iSystemPersistentAdapter).getSysDBSchemeRuntime());
				} else if (iSystemPersistentAdapter instanceof ISysBDPersistentAdapter) {
					this.setSysBDSchemeRuntime(((ISysBDPersistentAdapter) iSystemPersistentAdapter).getSysBDSchemeRuntime());
				}
			} else {
				log.warn(String.format("实体持久化组件未提供系统持久化适配器"));
			}
		}
	}

	private DataEntityRuntime getSelf() {
		return this;
	}

	@Override
	public List<IPSDEField> getPSDEFields(boolean bExtension) {
		if (bExtension && this.extendedPSDEFieldList != null) {
			return this.extendedPSDEFieldList;
		}
		return this.getPSDEFields();
	}

	@Override
	public List<IPSDEField> getDynaStoragePSDEFields() {
		this.prepare();
		return this.dynaStoragePSDEFieldList;
	}

	@Override
	public List<IPSDEField> getDynaStoragePSDEFields(boolean bExtension) {
		if (bExtension && this.extendedDynaStoragePSDEFieldList != null) {
			return this.extendedDynaStoragePSDEFieldList;
		}
		return this.getDynaStoragePSDEFields();
	}

	@Override
	public List<IPSDEField> getAttachmentPSDEFields() {
		this.prepare();
		return this.attachmentPSDEFieldList;
	}

	@Override
	public List<IPSDEField> getAttachmentPSDEFields(boolean bExtension) {
		if (bExtension && this.extendedAttachmentPSDEFieldList != null) {
			return this.extendedAttachmentPSDEFieldList;
		}
		return this.getAttachmentPSDEFields();
	}
	
	@Override
	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}

	@Override
	public IDEService getDEService() {
		if (this.isEnableRuntimeServiceMode()) {
			return null;
		}

		if (!this.isEnableDEService() || this.iDEService != null) {
			return this.iDEService;
		}
		IDEService iDEService = this.createDEService();
		if (iDEService instanceof IDEServiceInitable) {
			try {
				((IDEServiceInitable) iDEService).init(this.getDataEntityRuntimeContext());
			} catch (Exception ex) {
				log.debug(String.format("初始化实体服务对象发生异常，%1$s", ex.getMessage()), ex);
				throw new DataEntityRuntimeException(this, String.format("初始化实体服务对象发生异常，%1$s", ex.getMessage()), ex);
			}
		} else {
			iDEService.prepare();
		}

		this.iDEService = iDEService;
		return this.iDEService;
	}

	protected IDEService createDEService() {
		return this.getSystemRuntime().getDEService(this);
	}

	/**
	 * 是否启用运行时对象的服务重写模式
	 *
	 * @return
	 */
	protected boolean isEnableRuntimeServiceMode() {
		return false;
	}

	/**
	 * 准备实体方法
	 *
	 * @throws Exception
	 */
	protected void prepareDEMethods() throws Exception {

		if (this.methodMap != null) {
			return;
		}

		Map<String, Object> methodMap = new HashMap<String, Object>();

		// 准备实体方法
		List<IPSDEAction> psDEActionList = this.getPSDataEntity().getAllPSDEActions();
		if (psDEActionList != null) {
			for (IPSDEAction iPSDEAction : psDEActionList) {
				String strCodeName = iPSDEAction.getCodeName();
				if (!StringUtils.hasLength(strCodeName)) {
					throw new ModelException(iPSDEAction, String.format("实体行为[%1$s]没有指定代码标识", iPSDEAction.getName()));
				}
				String strCodeNameFormat = this.getSystemRuntime().getSystemRuntimeSetting().getDEActionCodeNameFormat();
				if (StringUtils.hasLength(strCodeNameFormat)) {
					strCodeName = String.format(strCodeNameFormat, strCodeName);
				}

				if (!StringUtils.hasLength(strCodeName)) {
					throw new ModelException(iPSDEAction, String.format("实体行为[%1$s]无法计算代码标识", iPSDEAction.getName()));
				}
				methodMap.put(strCodeName.toLowerCase(), iPSDEAction);

				// 注册插件模型的附加逻辑
				java.util.List<IPSDEActionLogic> psDEActionLogicList = iPSDEAction.getPreparePSDEActionLogics();
				if (!ObjectUtils.isEmpty(psDEActionLogicList)) {
					for (IPSDEActionLogic iPSDEActionLogic : psDEActionLogicList) {
						this.registerPSDEActionLogic(iPSDEActionLogic);
					}
				}

				psDEActionLogicList = iPSDEAction.getCheckPSDEActionLogics();
				if (!ObjectUtils.isEmpty(psDEActionLogicList)) {
					for (IPSDEActionLogic iPSDEActionLogic : psDEActionLogicList) {
						this.registerPSDEActionLogic(iPSDEActionLogic);
					}
				}

				psDEActionLogicList = iPSDEAction.getBeforePSDEActionLogics();
				if (!ObjectUtils.isEmpty(psDEActionLogicList)) {
					for (IPSDEActionLogic iPSDEActionLogic : psDEActionLogicList) {
						this.registerPSDEActionLogic(iPSDEActionLogic);
					}
				}

				psDEActionLogicList = iPSDEAction.getAfterPSDEActionLogics();
				if (!ObjectUtils.isEmpty(psDEActionLogicList)) {
					for (IPSDEActionLogic iPSDEActionLogic : psDEActionLogicList) {
						this.registerPSDEActionLogic(iPSDEActionLogic);
					}
				}
			}
		}

		// 准备实体数据集
		List<IPSDEDataSet> psDEDataSetList = this.getPSDataEntity().getAllPSDEDataSets();
		if (psDEDataSetList != null) {
			for (IPSDEDataSet iPSDEDataSet : psDEDataSetList) {
				String strCodeName = iPSDEDataSet.getCodeName();
				if (!StringUtils.hasLength(strCodeName)) {
					throw new ModelException(iPSDEDataSet, String.format("实体数据集[%1$s]没有指定代码标识", iPSDEDataSet.getName()));
				}
				String strCodeNameFormat = this.getSystemRuntime().getSystemRuntimeSetting().getDEDataSetCodeNameFormat();
				if (StringUtils.hasLength(strCodeNameFormat)) {
					strCodeName = String.format(strCodeNameFormat, strCodeName);
				}

				if (!StringUtils.hasLength(strCodeName)) {
					throw new ModelException(iPSDEDataSet, String.format("实体数据集[%1$s]无法计算代码标识", iPSDEDataSet.getName()));
				}
				methodMap.put(strCodeName.toLowerCase(), iPSDEDataSet);
			}
		}

		List<IPSDEDataQuery> psDEDataQueryList = this.getPSDataEntity().getAllPSDEDataQueries();
		if (psDEDataQueryList != null) {
			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
				List<IPSDEDataQueryCode> psDEDataQueryCodeList = iPSDEDataQuery.getAllPSDEDataQueryCodes();
				if (psDEDataQueryCodeList != null) {
					for (IPSDEDataQueryCode iPSDEDataQueryCode : psDEDataQueryCodeList) {
						IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = this.createDEDataQueryCodeRuntime(iPSDEDataQueryCode);
						iDEDataQueryCodeRuntime.init(this.getDataEntityRuntimeContext(), iPSDEDataQuery, iPSDEDataQueryCode);
						String strTag = String.format("%1$s|%2$s", iPSDEDataQuery.getId(), iPSDEDataQueryCode.getDBType());
						if (this.deDataQueryCodeRuntimeMap == null) {
							this.deDataQueryCodeRuntimeMap = new HashMap<>();
						}
						this.deDataQueryCodeRuntimeMap.put(strTag, iDEDataQueryCodeRuntime);
					}
				}
			}
		}

		IDEMethodDTORuntime defaultDEMethodDTORuntime = null;
		IDEFilterDTORuntime defaultDEFilterDTORuntime = null;
		List<IPSDEMethodDTO> psDEMethodDTOList = this.getPSDataEntity().getAllPSDEMethodDTOs();
		if (psDEMethodDTOList != null) {
			for (IPSDEMethodDTO iPSDEMethodDTO : psDEMethodDTOList) {

				IDEMethodDTORuntime iDEMethodDTORuntime = this.createDEMethodDTORuntime(iPSDEMethodDTO);
				iDEMethodDTORuntime.init(this.getDataEntityRuntimeContext(), iPSDEMethodDTO);
				this.deMethodDTORuntimeMap.put(iDEMethodDTORuntime.getId(), iDEMethodDTORuntime);

				if (!iPSDEMethodDTO.isDefaultMode()) {
					continue;
				}
				// 根据类型判断
				if (DEMethodDTOTypes.DEFAULT.equals(iPSDEMethodDTO.getType())) {
					defaultDEMethodDTORuntime = iDEMethodDTORuntime;
					continue;
				}

				if (DEMethodDTOTypes.DEFILTER.equals(iPSDEMethodDTO.getType())) {
					if (!(iDEMethodDTORuntime instanceof IDEFilterDTORuntime)) {
						throw new ModelException(iPSDEMethodDTO, String.format("实体方法DTO[%1$s]类型不正确", iPSDEMethodDTO.getName()));
					}
					defaultDEFilterDTORuntime = (IDEFilterDTORuntime) iDEMethodDTORuntime;
					continue;
				}
			}
		}

		if (this.methodMap == null) {
			this.methodMap = methodMap;
			this.defaultDEMethodDTORuntime = defaultDEMethodDTORuntime;
			this.defaultDEFilterDTORuntime = defaultDEFilterDTORuntime;
		}

		this.onPrepareDEMethods();
	}

	protected void onPrepareDEMethods() throws Exception {

		Method[] methods = this.getClass().getDeclaredMethods();
		if (ObjectUtils.isEmpty(methods)) {
			return;
		}

		for (Method method : methods) {
			DEAction deAction = method.getAnnotation(DEAction.class);
			if (deAction != null) {
				String name = deAction.name();
				if (!StringUtils.hasLength(name)) {
					name = deAction.value();
				}

				if (!StringUtils.hasLength(name)) {
					throw new Exception(String.format("代码方法[%1$s]实体行为注解未指定行为标识", method.getName()));
				}

				IPSDEAction iPSDEAction = this.getPSDEAction(name);
				if (iPSDEAction == null) {
					// throw new
					// Exception(String.format("代码方法[%1$s]实体行为注解行为[%2$s]不存在",
					// method.getName(), name));
					log.error(String.format("代码方法[%1$s]实体行为注解行为[%2$s]不存在", method.getName(), name));
					continue;
				}

				this.registerDEActionPluginRuntime(iPSDEAction.getName(), new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						if (!method.isAccessible()) {
							method.setAccessible(true);
						}
						try {
							return method.invoke(getSelf(), args);
						} catch (InvocationTargetException e) {
							Throwable ex = ExceptionUtils.unwrapThrowable(e);
							throw ex;
						}
					}
				});

				continue;
			}

			DEDataSet deDataSet = method.getAnnotation(DEDataSet.class);
			if (deDataSet != null) {
				String name = deDataSet.name();
				if (!StringUtils.hasLength(name)) {
					name = deDataSet.value();
				}

				if (!StringUtils.hasLength(name)) {
					throw new Exception(String.format("代码方法[%1$s]实体数据集注解未指定数据集标识", method.getName()));
				}

				IPSDEDataSet iPSDEDataSet = this.getPSDEDataSet(name);
				if (iPSDEDataSet == null) {
					// throw new
					// Exception(String.format("代码方法[%1$s]实体数据集注解数据集[%2$s]不存在",
					// method.getName(), name));
					log.error(String.format("代码方法[%1$s]实体数据集注解数据集[%2$s]不存在", method.getName(), name));
					continue;
				}

				this.registerDEDataSetPluginRuntime(iPSDEDataSet.getName(), new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						if (!method.isAccessible()) {
							method.setAccessible(true);
						}
						try {
							return method.invoke(getSelf(), args);
						} catch (InvocationTargetException e) {
							Throwable ex = ExceptionUtils.unwrapThrowable(e);
							throw ex;
						}
					}
				});

				continue;
			}

		}
	}

	@Override
	public ISystemModuleUtilRuntime getSystemModuleUtilRuntime() {
		this.prepare();
		return this.iSystemModuleUtilRuntime;
	}

	@Override
	public ISystemModuleRuntime getSystemModuleRuntime() {
		this.prepare();
		return this.iSystemModuleRuntime;
	}

	@Override
	public IPSDEMethodDTO getDefaultPSDEMethodDTO() {
		this.prepare();
		if (this.defaultDEMethodDTORuntime != null) {
			return this.defaultDEMethodDTORuntime.getPSDEMethodDTO();
		}
		return null;
	}

	@Override
	public IDEMethodDTORuntime getDEMethodDTORuntime(IPSDEMethodDTO iPSDEMethodDTO, boolean bTryMode) {

		Assert.notNull(iPSDEMethodDTO, "传入实体方法DTO模型对象无效");

		this.prepare();
		IDEMethodDTORuntime iDEMethodDTORuntime = this.deMethodDTORuntimeMap.get(iPSDEMethodDTO.getId());
		if (iDEMethodDTORuntime != null || bTryMode) {
			return iDEMethodDTORuntime;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定实体方法DTO运行时对象[%1$s]", iPSDEMethodDTO.getId()));
	}

	@Override
	public java.util.List<Object> getAncestorIds(java.lang.Object key, boolean recursive) {
		Assert.notNull(key, "传入键值无效");
		List<Object> idList = new ArrayList<Object>();
		if (this.getRecursivePSDER1N() == null || this.getRecursivePSDER1N().getPSPickupDEField() == null) {
			return idList;
		}

		IPSDEField pickupPSDEField = this.getRecursivePSDER1N().getPSPickupDEField();

		List<Object> totalList = new ArrayList<Object>();

		idList.add(key);
		while (idList.size() > 0) {
			ISearchContextDTO iSearchContextDTO = this.createSearchContext().count(false).all();
			iSearchContextDTO.eq(this.getKeyPSDEField().getName(), idList.get(0));
			List<IEntityDTO> list = this.selectDataQuery(this.getSimplePSDEDataQuery(), iSearchContextDTO);
			if (ObjectUtils.isEmpty(list)) {
				break;
			}

			idList.clear();
			for (IEntityDTO iEntityDTO : list) {
				Object parentId = iEntityDTO.get(pickupPSDEField.getLowerCaseName());
				if (!ObjectUtils.isEmpty(parentId)) {
					idList.add(parentId);
				}
			}
			if (!ObjectUtils.isEmpty(idList)) {
				totalList.addAll(idList);
			}

			if (!recursive) {
				break;
			}
		}

		return totalList;
	}

	@Override
	public List<Object> getDescendantIds(Object key, boolean recursive) {
		Assert.notNull(key, "传入键值无效");
		List<Object> totalList = new ArrayList<Object>();
		if (this.getRecursivePSDER1N() == null || this.getRecursivePSDER1N().getPSPickupDEField() == null) {
			return totalList;
		}

		IPSDEField pickupPSDEField = this.getRecursivePSDER1N().getPSPickupDEField();

		List<Object> parentIdList = new ArrayList<Object>();
		parentIdList.add(key);
		while (parentIdList.size() > 0) {
			ISearchContextDTO iSearchContextDTO = this.createSearchContext().count(false).all();
			iSearchContextDTO.in(pickupPSDEField.getName(), parentIdList);
			List<IEntityDTO> list = this.selectDataQuery(this.getSimplePSDEDataQuery(), iSearchContextDTO);
			if (ObjectUtils.isEmpty(list)) {
				break;
			}

			parentIdList.clear();
			for (IEntityDTO iEntityDTO : list) {
				parentIdList.add(iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName()));
			}
			totalList.addAll(parentIdList);

			if (!recursive) {
				break;
			}
		}

		return totalList;
	}

	/**
	 * 准备实体工作流
	 *
	 * @throws Exception
	 */
	protected void prepareDEWFs() throws Exception {

		if (this.deWFRuntimeMap != null) {
			return;
		}

		Map<String, IDEWFRuntime> deWFRuntimeMap = new HashMap<String, IDEWFRuntime>();

		// 准备实体工作流
		List<IPSDEWF> psDEWFList = this.getPSDataEntity().getAllPSDEWFs();
		if (psDEWFList != null) {
			for (IPSDEWF iPSDEWF : psDEWFList) {
				IDEWFRuntime iDEWFRuntime = this.createDEWFRuntime(iPSDEWF);
				iDEWFRuntime.init(this.getDataEntityRuntimeContext(), iPSDEWF);
				deWFRuntimeMap.put(iPSDEWF.getId(), iDEWFRuntime);
				if (iPSDEWF.getPSWorkflow() != null) {
					deWFRuntimeMap.put(iPSDEWF.getPSWorkflow().getId(), iDEWFRuntime);
				}
			}
		}

		if (this.deWFRuntimeMap == null && deWFRuntimeMap.size() != 0) {
			this.deWFRuntimeMap = deWFRuntimeMap;
		}
	}

	/**
	 * 准备支持快速搜索的属性集合
	 *
	 * @throws Exception
	 */
	protected void prepareQuickSearchPSDEFields() throws Exception {

		if (this.quickSearchPSDEFieldList != null) {
			return;
		}
		List<IPSDEField> quickSearchPSDEFieldList = new ArrayList<IPSDEField>();

		List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
		if (psDEFieldList != null) {
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (iPSDEField.isEnableQuickSearch()) {
					quickSearchPSDEFieldList.add(iPSDEField);
				}
			}
		}

		if (this.quickSearchPSDEFieldList == null && quickSearchPSDEFieldList.size() != 0) {
			this.quickSearchPSDEFieldList = quickSearchPSDEFieldList;
		}
	}

	@Override
	public IPSDEDBConfig getDefaultPSDEDBConfig() {
		this.prepare();
		return this.defaultPSDEDBConfig;
	}

	@Override
	public String getTableName() {
		this.prepare();
		if (getDefaultPSDEDBConfig() != null) {
			return getDefaultPSDEDBConfig().getTableName();
		}
		try {
			return this.getPSDataEntity().getTableName();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体默认数据表名称发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public IPSDEFilterDTO getDefaultPSDEFilterDTO() {
		this.prepare();
		if (this.defaultDEFilterDTORuntime != null) {
			return this.defaultDEFilterDTORuntime.getPSDEFilterDTO();
		}
		return null;
	}

	protected IDEMethodDTORuntime createDEMethodDTORuntime(IPSDEMethodDTO iPSDEMethodDTO) {
		// 根据对象类型进行建立
		if (DEMethodDTOTypes.DEFAULT.equals(iPSDEMethodDTO.getType())) {
			return createDEMethodDTORuntime();
		}

		if (DEMethodDTOTypes.DEACTIONINPUT.equals(iPSDEMethodDTO.getType())) {
			return createDEActionInputDTORuntime();
		}

		if (DEMethodDTOTypes.DEFILTER.equals(iPSDEMethodDTO.getType())) {
			return createDEFilterDTORuntime();
		}

		if (DEMethodDTOTypes.DEDATASETINPUT.equals(iPSDEMethodDTO.getType())) {
			return createDEFilterDTORuntime();
		}

		throw new DataEntityRuntimeException(this, String.format("无法识别的实体方法DTO类型[%1$s][%2$s]", iPSDEMethodDTO.getName(), iPSDEMethodDTO.getType()));
	}

	@Override
	public IDEMethodDTO getDEMethodDTO(IPSDEMethodDTO iPSDEMethodDTO, Object objData) throws Exception {

		return getDEMethodDTO(iPSDEMethodDTO, objData, true);
	}

	@Override
	public IDEMethodDTO getDEMethodDTO(IPSDEMethodDTO iPSDEMethodDTO, Object objData, boolean bDTOMode) throws Exception {
		Assert.notNull(iPSDEMethodDTO, "实体方法DTO模型对象无效");
		this.prepare();

		return this.onGetDEMethodDTO(iPSDEMethodDTO, objData, bDTOMode);
	}

	protected IDEMethodDTO onGetDEMethodDTO(IPSDEMethodDTO iPSDEMethodDTO, Object objData, boolean bDTOMode) throws Exception {
		// 根据对象类型进行建立
		if (DEMethodDTOTypes.DEFAULT.equals(iPSDEMethodDTO.getType())) {
			IEntityDTO iEntityDTO = createEntityDTO(iPSDEMethodDTO);
			iEntityDTO.init(this.getDEMethodDTORuntime(iPSDEMethodDTO, false), objData, bDTOMode);
			return iEntityDTO;
		}

		if (DEMethodDTOTypes.DEACTIONINPUT.equals(iPSDEMethodDTO.getType())) {
			IEntityDTO iEntityDTO = createEntityDTO(iPSDEMethodDTO);
			iEntityDTO.init(this.getDEMethodDTORuntime(iPSDEMethodDTO, false), objData, bDTOMode);
			return iEntityDTO;
		}

		if (DEMethodDTOTypes.DEFILTER.equals(iPSDEMethodDTO.getType())) {
			ISearchContextDTO iSearchContextDTO = createSearchContextDTO(iPSDEMethodDTO);
			iSearchContextDTO.init(this.getDEMethodDTORuntime(iPSDEMethodDTO, false), objData, bDTOMode);
			return iSearchContextDTO;
		}

		if (DEMethodDTOTypes.DEDATASETINPUT.equals(iPSDEMethodDTO.getType())) {
			ISearchContextDTO iSearchContextDTO = createSearchContextDTO(iPSDEMethodDTO);
			iSearchContextDTO.init(this.getDEMethodDTORuntime(iPSDEMethodDTO, false), objData, bDTOMode);
			return iSearchContextDTO;
		}

		throw new DataEntityRuntimeException(this, String.format("无法识别的实体方法DTO类型[%1$s][%2$s]", iPSDEMethodDTO.getName(), iPSDEMethodDTO.getType()));
	}

	protected IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
		if (!this.isEnableRuntimeServiceMode() && this.getDEService() != null) {
			IEntityDTO iEntityDTO = this.getDEService().createEntityDTO(iPSDEMethodDTO);
			if (iEntityDTO != null) {
				return iEntityDTO;
			}
		}
		return new EntityDTO();
	}

	protected List<IEntityDTO> createEntityDTOList(IPSDEMethodDTO iPSDEMethodDTO) {
		if (!this.isEnableRuntimeServiceMode() && this.getDEService() != null) {
			List<IEntityDTO> entityDTOList = this.getDEService().createEntityDTOList(iPSDEMethodDTO);
			if (entityDTOList != null) {
				return entityDTOList;
			}
		}
		return new ArrayList<IEntityDTO>();
	}

	protected ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
		if (!this.isEnableRuntimeServiceMode() && this.getDEService() != null) {
			ISearchContextDTO iSearchContextDTO = this.getDEService().createSearchContextDTO(iPSDEMethodDTO);
			if (iSearchContextDTO != null) {
				return iSearchContextDTO;
			}
		}
		return new SearchContextDTO();
	}

	/**
	 * 建立实体方法DTO运行时对象
	 *
	 * @return
	 */
	protected IDEMethodDTORuntime createDEMethodDTORuntime() {
		return new DEMethodDTORuntime();
	}

	/**
	 * 建立实体行为DTO运行时对象
	 *
	 * @return
	 */
	protected IDEActionInputDTORuntime createDEActionInputDTORuntime() {
		return new DEActionInputDTORuntime();
	}

	/**
	 * 建立实体过滤器DTO运行时对象
	 *
	 * @return
	 */
	protected IDEFilterDTORuntime createDEFilterDTORuntime() {
		return new DEFilterDTORuntime();
	}

	protected IDEDataQueryCodeRuntime createDEDataQueryCodeRuntime(IPSDEDataQueryCode iPSDEDataQueryCode) {

		if (this.getSystemModuleUtilRuntime() != null) {
			IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = this.getSystemModuleUtilRuntime().createDEDataQueryCodeRuntime(iPSDEDataQueryCode);
			if (iDEDataQueryCodeRuntime != null) {
				return iDEDataQueryCodeRuntime;
			}
		}

		return this.createDefaultDEDataQueryCodeRuntime(iPSDEDataQueryCode);
	}

	protected IDEDataQueryCodeRuntime createDefaultDEDataQueryCodeRuntime(IPSDEDataQueryCode iPSDEDataQueryCode) {

		return new DEDataQueryCodeRuntime();
	}

	/**
	 * 获取实体方法对象
	 *
	 * @param strMethodName
	 * @return
	 * @throws Exception
	 */
	protected Object getMethod(String strMethodName) {
		return this.methodMap.get(strMethodName.toLowerCase());
	}

	@Override
	public String getId() {
		return this.strId;
	}

	@Override
	public String getName() {
		return this.strName;
	}

	@Override
	public String getDERParentType() {
		if (this.getDEType() == DEType.ABSTRACT.value) {
			IDataEntityRuntime childDataEntityRuntime = (IDataEntityRuntime) DataEntityRuntimeHolder.peekChildDataEntityRuntime();
			if (childDataEntityRuntime != null) {
				return childDataEntityRuntime.getDERParentType();
			}
		}
		return super.getDERParentType();
	}

	@Override
	public IDataEntityAccessManager getDataEntityAccessManager() {
		this.prepare();
		return this.iDataEntityAccessManager;
	}

	protected IDataEntityAccessManager createDataEntityAccessManager() {
		final ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime();
		if (iSystemModuleUtilRuntime != null) {
			IDataEntityAccessManager iDataEntityAccessManager = iSystemModuleUtilRuntime.createDataEntityAccessManager(this);
			if (iDataEntityAccessManager != null) {
				return iDataEntityAccessManager;
			}
		}
		return this.getSystemRuntime().getSystemAccessManager().createDataEntityAccessManager(this);
	}

	/**
	 * 获取系统模型运行时上下文对象
	 *
	 * @return
	 */
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	protected Object getData() {
		return this.data;
	}

	@Override
	public net.ibizsys.central.ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}

	@Override
	public Object invokeMethod(String strMethodName, Object objArg, Object objTag) throws Throwable {
		this.prepare();
		Object objMethod = this.getMethod(strMethodName);
		if (objMethod == null) {
			throw new Exception(String.format("无法获取指定实体方法[%1$s]", strMethodName));
		}
		if (objMethod instanceof IPSDEAction) {
			IPSDEAction iPSDEAction = (IPSDEAction) objMethod;
			// 获取输入参数
			Object[] args = this.getActionArgs(iPSDEAction, objArg);
			Object objRet = executeAction(iPSDEAction.getName(), iPSDEAction, args);

			return objRet;
		}

		if (objMethod instanceof IPSDEDataSet) {
			IPSDEDataSet iPSDEDataSet = (IPSDEDataSet) objMethod;
			// 获取输入参数
			Object[] args = this.getDataSetArgs(iPSDEDataSet, objArg);
			Object objRet = fetchDataSet(iPSDEDataSet.getName(), iPSDEDataSet, args);

			return objRet;
		}

		throw new DataEntityRuntimeException(this, String.format("无法识别的实体方法[%1$s][%2$s]", strMethodName, objMethod));
	}

	@Override
	public Object invokeMethod(String strMethodName, Object[] args, Object objTag) throws Throwable {
		this.prepare();
		Object objMethod = this.getMethod(strMethodName);
		if (objMethod == null) {
			throw new Exception(String.format("无法获取指定实体方法[%1$s]", strMethodName));
		}
		if (objMethod instanceof IPSDEAction) {
			IPSDEAction iPSDEAction = (IPSDEAction) objMethod;
			// 获取输入参数
			Object objRet = executeAction(iPSDEAction.getName(), iPSDEAction, args);

			return objRet;
		}

		if (objMethod instanceof IPSDEDataSet) {
			IPSDEDataSet iPSDEDataSet = (IPSDEDataSet) objMethod;
			// 获取输入参数
			Object objRet = fetchDataSet(iPSDEDataSet.getName(), iPSDEDataSet, args);

			return objRet;
		}

		throw new DataEntityRuntimeException(this, String.format("无法识别的实体方法[%1$s][%2$s]", strMethodName, objMethod));
	}

	protected Object[] getActionArgs(IPSDEAction iPSDEAction, Object objArg) throws Exception {
		IPSDEActionInput iPSDEActionInput = iPSDEAction.getPSDEActionInput();
		if (iPSDEActionInput == null) {
			throw new ModelException(iPSDEAction, String.format("实体行为[%1$s]没有指定输入对象", iPSDEAction.getName()));
		}
		if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.DTO.equals(iPSDEActionInput.getType()) || DEMethodInputTypes.DTOS.equals(iPSDEActionInput.getType())) {

			if (ObjectUtils.isEmpty(objArg)) {
				throw new Exception("没有指定输入参数");
			}

			if (DEMethodInputTypes.KEYFIELD.equals(iPSDEActionInput.getType())) {
				if (objArg instanceof String) {
					Object objValue = this.getSystemRuntime().convertValue(this.getKeyPSDEField().getStdDataType(), (String) objArg);
					return new Object[] { objValue };
				} else {
					return new Object[] { objArg };
				}
			}

			if (DEMethodInputTypes.KEYFIELDS.equals(iPSDEActionInput.getType())) {
				if (objArg instanceof String) {
					// 进行分隔
					String strValue = (String) objArg;
					String[] items = strValue.trim().split("[;]");
					List list = new ArrayList();
					for (int i = 0; i < items.length; i++) {
						Object objValue = this.getSystemRuntime().convertValue(this.getKeyPSDEField().getStdDataType(), items[i]);
						list.add(objValue);
					}
					return new Object[] { list };
				} else {
					if (objArg.getClass().isArray()) {
						return new Object[] { Arrays.asList((Object[]) objArg) };
					} else {
						return new Object[] { objArg };
					}
				}
			}
			if (DEMethodInputTypes.DTO.equals(iPSDEActionInput.getType())) {
				if (objArg instanceof IEntityDTO) {
					return new Object[] { objArg };
				}
				return new Object[] { this.getDEMethodDTO(iPSDEActionInput.getPSDEMethodDTOMust(), objArg) };
			}
		}

		throw new DataEntityRuntimeException(this, String.format("无法识别的实体行为输入类型[%1$s][%2$s]", iPSDEAction.getName(), iPSDEActionInput.getType()));
	}

	protected Object[] getDataSetArgs(IPSDEDataSet iPSDEDataSet, Object objArg) throws Exception {
		IPSDEDataSetInput iPSDEDataSetInput = iPSDEDataSet.getPSDEDataSetInput();
		if (iPSDEDataSetInput == null) {
			throw new ModelException(iPSDEDataSet, String.format("实体数据集[%1$s]没有指定输入对象", iPSDEDataSet.getName()));
		}
		if (DEMethodInputTypes.DTO.equals(iPSDEDataSetInput.getType())) {
			if (objArg instanceof ISearchContextDTO) {
				return new Object[] { objArg };
			}
			return new Object[] { this.getDEMethodDTO(iPSDEDataSetInput.getPSDEFilterDTOMust(), objArg) };
		}

		throw new DataEntityRuntimeException(this, String.format("无法识别的实体数据集输入类型[%1$s][%2$s]", iPSDEDataSet.getName(), iPSDEDataSetInput.getType()));
	}

	@Override
	protected boolean isEnableExecuteAction(String strActionName, IPSDEAction iPSDEAction) {
		return true;
	}

	@Override
	protected boolean isEnableFetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet) {
		return true;
	}

	@Override
	protected Object onExecuteActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {

		IDEMapRuntime iDEMapRuntime = this.getDEMapRuntime(strActionName, iPSDEAction, PSModelEnums.DEMapObjectMapMode.INNER.value);
		if (iDEMapRuntime != null) {
			log.debug(String.format("使用实体映射[%1$s]处理行为[%2$s]", iDEMapRuntime.getName(), (iPSDEAction != null ? iPSDEAction.getName() : strActionName)));
			return iDEMapRuntime.executeAction(strActionName, iPSDEAction, args, null);
		}

		if (isEnableRuntimeServiceMode()) {
			if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
				if (args[0] instanceof IEntityDTO) {
					doCreateReal((IEntityDTO) args[0], args, actionData);
					return null;
				}
			} else if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
				if (args[0] instanceof IEntityDTO) {
					doUpdateReal((IEntityDTO) args[0], args, actionData);
					return null;
				}
			} else if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
				doRemoveReal(args[0], args, actionData);
				return null;
			} else if (DEActions.GET.equalsIgnoreCase(strActionName)) {
				return doGetReal(args[0], args, actionData);
			} else if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
				if (args[0] instanceof IEntityDTO) {
					return doGetDraftReal((IEntityDTO) args[0], args, actionData);
				}
			}
		} else {
			IDEService iDEService = this.getDEService();
			if (iDEService != null) {
				return iDEService.executeActionReal(this.getDataEntityRuntimeContext(), strActionName, iPSDEAction, args, actionData);
			}
		}

		return this.doExecuteActionReal(strActionName, iPSDEAction, args, actionData);
	}

	protected void doCreateReal(IEntityDTO iEntityDTO, Object[] args, Object actionData) throws Throwable {
		if (args == null) {
			args = new Object[] { iEntityDTO };
		}
		this.doExecuteActionReal(DEActions.CREATE, null, args, actionData);
		return;
	}

	protected void doUpdateReal(IEntityDTO iEntityDTO, Object[] args, Object actionData) throws Throwable {
		if (args == null) {
			args = new Object[] { iEntityDTO };
		}
		this.doExecuteActionReal(DEActions.UPDATE, null, args, actionData);
		return;
	}

	protected void doRemoveReal(Object objKey, Object[] args, Object actionData) throws Throwable {
		if (args == null) {
			args = new Object[] { objKey };
		}
		this.doExecuteActionReal(DEActions.REMOVE, null, args, actionData);
		return;
	}

	protected IEntityDTO doGetReal(Object objKey, Object[] args, Object actionData) throws Throwable {
		if (args == null) {
			args = new Object[] { objKey };
		}
		Object objRet = this.doExecuteActionReal(DEActions.GET, null, args, actionData);
		if (objRet instanceof IEntityDTO) {
			return (IEntityDTO) objRet;
		}
		return null;
	}

	protected IEntityDTO doGetDraftReal(IEntityDTO iEntityDTO, Object[] args, Object actionData) throws Throwable {
		if (args == null) {
			args = new Object[] { iEntityDTO };
		}
		Object objRet = this.doExecuteActionReal(DEActions.GETDRAFT, null, args, actionData);
		if (objRet instanceof IEntityDTO) {
			return (IEntityDTO) objRet;
		}
		return null;
	}

	protected Object doExecuteActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {

		if (iPSDEAction == null) {
			iPSDEAction = this.getPSDEAction(strActionName);
		}

		IDEActionRuntime iDEActionRuntime = getDEActionRuntime(iPSDEAction);
		if (iDEActionRuntime != null && iDEActionRuntime.isValid(args)) {
			return iDEActionRuntime.execute(args);
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		/**
		 * 进行工作流回调行为相关处理
		 */
		if (this.getDefaultPSDEWF() != null && strActionName.toLowerCase().indexOf("wf") == 0) {

			IPSDEWF iPSDEWF = null;
			if (args.length >= 2 && (args[1] instanceof IPSDEWF)) {
				iPSDEWF = (IPSDEWF) args[1];
			}
			if (iPSDEWF == null) {
				iPSDEWF = this.getDefaultPSDEWF();
			}

			if (args[0] instanceof IEntityDTO) {
				if (DEActions.WFSTART.equalsIgnoreCase(strActionName)) {
					this.onWFStart((IEntityDTO) args[0], iPSDEAction, iPSDEWF, ActionSessionManager.getCurrentSession().getDynaInstRuntime(), actionData);
				} else if (DEActions.WFSUBMIT.equalsIgnoreCase(strActionName)) {
					String strWFAction = null;
					Map<String, Object> params = null;
					if (args.length >= 3 && (args[2] instanceof String)) {
						strWFAction = (String) args[2];
					}

					if (!StringUtils.hasLength(strWFAction)) {
						throw new Exception("未指定流程提交操作");
					}

					if (args.length >= 4 && (args[3] instanceof Map)) {
						params = (Map) args[3];
					}
					return this.onWFSubmit(args[0], strWFAction, params, iPSDEAction, iPSDEWF, ActionSessionManager.getCurrentSession().getDynaInstRuntime(), actionData);
				} else {
					this.onWFActionReal(strActionName, (IEntityDTO) args[0], iPSDEAction, iPSDEWF, actionData);
				}
			}
			return null;
		}

		if (iPSDEAction == null) {
			if(DEActions.COPY.equalsIgnoreCase(strActionName)) {
				if(args!=null && args.length > 0 && args[0] instanceof IEntityDTO) {
					return this.onCopy((IEntityDTO)args[0]);
				}
				else {
					throw new Exception("拷贝操作传入参数不正确");
				}
			}
			
			return super.onExecuteActionReal(strActionName, iPSDEAction, args, actionData);
		}

		String strActionMode = iPSDEAction.getActionMode();

		// 执行处理逻辑及脚本行为
		if (DEActionTypes.DELOGIC.equals(iPSDEAction.getActionType())) {
			IPSDELogicAction iPSDELogicAction = (IPSDELogicAction) iPSDEAction;
			if (args[0] instanceof IEntityDTO) {
				return this.executeDELogic((IEntityDTO) args[0], iPSDEAction, iPSDELogicAction.getPSDELogic(), ActionSessionManager.getCurrentSession().getDynaInstRuntime(), actionData);
			} else {
				Object key = DataTypeUtils.asSimple(args[0]);
				if (key != null) {
					IEntityDTO iEntityDTO = this.createEntity();
					iEntityDTO.set(this.getKeyPSDEField().getLowerCaseName(), key);
					return this.executeDELogic(iEntityDTO, iPSDEAction, iPSDELogicAction.getPSDELogic(), ActionSessionManager.getCurrentSession().getDynaInstRuntime(), actionData);
				}

				throw new Exception(String.format("未支持的输入参数[%1$s]", args[0]));
			}

		} else if (DEActionTypes.SCRIPT.equals(iPSDEAction.getActionType())) {
			IPSDEScriptAction iPSDEScriptAction = (IPSDEScriptAction) iPSDEAction;
			if (args[0] instanceof IEntityDTO) {
				return this.executeDEScriptLogic((IEntityDTO) args[0], iPSDEScriptAction, null, ActionSessionManager.getCurrentSession().getDynaInstRuntime(), actionData);
			} else {
				Object key = DataTypeUtils.asSimple(args[0]);
				if (key != null) {
					IEntityDTO iEntityDTO = this.createEntity();
					iEntityDTO.set(this.getKeyPSDEField().getLowerCaseName(), key);
					return this.executeDEScriptLogic((IEntityDTO) args[0], iPSDEScriptAction, null, ActionSessionManager.getCurrentSession().getDynaInstRuntime(), actionData);
				}

				throw new Exception(String.format("未支持的输入参数[%1$s]", args[0]));
			}
		}

		if (this.getStorageMode() == DEStorageModes.SERVICEAPI) {
			IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod = iPSDEAction.getPSSubSysServiceAPIDEMethod();
			if (iPSSubSysServiceAPIDEMethod != null) {
				Object objData = this.executeSubSysServiceAPIDEMethod(iPSSubSysServiceAPIDEMethod, iPSDEAction, args);
				if (DEActionModes.CREATE.equals(strActionMode) || DEActionModes.UPDATE.equals(strActionMode)) {
					if (args[0] instanceof IEntityDTO) {
						if (objData instanceof IEntityDTO) {
							((IEntityDTO) args[0]).reload(((IEntityDTO) objData).any(), true);
						} else {
							((IEntityDTO) args[0]).reload(objData, false);
						}
						return null;
					}
				}
				return objData;
			}
		}

		if (this.getSystemPersistentAdapter() != null) {

			if (DEActionModes.CREATE.equals(strActionMode)) {
				if (args[0] instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) args[0];
					// 循环属性，去除不支持新建的属性
					java.util.List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
					if (!ObjectUtils.isEmpty(psDEFieldList)) {
						for (IPSDEField iPSDEField : psDEFieldList) {
							if (!iPSDEField.isEnableCreate()) {
								iEntityDTO.reset(iPSDEField.getLowerCaseName());
							}
						}
					}

					boolean bGet = true;
					if (args.length >= 2 && args[1] instanceof Boolean) {
						bGet = DataTypeUtils.asBoolean(args[1], bGet);
					}

					if (!bGet) {
						actionSession.setIgnoreTranslateEntityNestedDERsAfterProceed(true);
					}

					Object key = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
					if (!ObjectUtils.isEmpty(key)) {
						actionSession.setActionParam(String.format(ACTIONSESSIONPARAM_FILLENTITYFULLINFO_EXIST_X, this.getId(), key), CheckKeyStates.EXIST);
					}

					Object objData = getSystemPersistentAdapter().create(this, iPSDEAction, iEntityDTO, null, bGet, null, false);
					if (bGet) {
						if (objData instanceof IEntityDTO) {
							((IEntityDTO) args[0]).reload(((IEntityDTO) objData).any(), true);
						} else {
							((IEntityDTO) args[0]).reload(objData, false);
						}
					}

				} else {
					throw new Exception(String.format("不支持的新建数据对象[%1$s]", args[0]));
				}
				return null;
			}

			if (DEActionModes.UPDATE.equals(strActionMode)) {
				if (args[0] instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) args[0];
					// 循环属性，去除不支持更新属性
					java.util.List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
					if (!ObjectUtils.isEmpty(psDEFieldList)) {
						for (IPSDEField iPSDEField : psDEFieldList) {
							if (!iPSDEField.isEnableModify()) {
								iEntityDTO.reset(iPSDEField.getLowerCaseName());
							}
						}
					}

					boolean bGet = true;
					if (args.length >= 2 && args[1] instanceof Boolean) {
						bGet = DataTypeUtils.asBoolean(args[1], bGet);
					}

					if (!bGet) {
						actionSession.setIgnoreTranslateEntityNestedDERsAfterProceed(true);
					}

					Object key = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
					if (!ObjectUtils.isEmpty(key)) {
						actionSession.setActionParam(String.format(ACTIONSESSIONPARAM_FILLENTITYFULLINFO_EXIST_X, this.getId(), key), CheckKeyStates.EXIST);
					}

					Object objData = getSystemPersistentAdapter().update(this, iPSDEAction, iEntityDTO, null, bGet, null, false);
					if (bGet) {
						if (objData instanceof IEntityDTO) {
							((IEntityDTO) args[0]).reload(((IEntityDTO) objData).any(), true);
						} else {
							((IEntityDTO) args[0]).reload(objData, false);
						}
					}

				} else {
					throw new Exception(String.format("不支持的更新数据对象[%1$s]", args[0]));
				}
				return null;
			}

			if (DEActionModes.DELETE.equals(strActionMode) || DEActionModes.REMOVE.equals(strActionMode)) {
				if (args[0] instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) args[0];
					Object objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
					getSystemPersistentAdapter().remove(this, iPSDEAction, objKey, false);

				} else {
					getSystemPersistentAdapter().remove(this, iPSDEAction, args[0], false);
				}

				return null;
			}

			if (DEActionModes.READ.equals(strActionMode)) {

				// 进一步判断是否为通过主键查询
				if (DEActionTypes.SELECTBYKEY.equals(iPSDEAction.getActionType())) {
					ISearchContextDTO iSearchContextDTO = this.createSearchContext();
					SearchContextDTO.addSearchFieldCond(iSearchContextDTO, this.getKeyPSDEField().getLowerCaseName(), Conditions.EQ, args[0], null);
					IEntityDTO iEntityDTO = null;
					if (iPSDEAction instanceof IPSDESelectByKeyAction) {
						IPSDESelectByKeyAction iPSDESelectByKeyAction = (IPSDESelectByKeyAction) iPSDEAction;
						if (iPSDESelectByKeyAction.getPSDEDataQuery() == null) {
							iEntityDTO = this.selectOne(iSearchContextDTO, false);
						} else {
							List<IEntityDTO> list = this.selectDataQuery(iPSDESelectByKeyAction.getPSDEDataQuery(), iSearchContextDTO);
							if (list == null || list.size() == 0) {
								throw new DataEntityRuntimeException(this, String.format("无法获取指定数据[%1$s]", args[0]), Errors.INVALIDDATA);
							}
							iEntityDTO = list.get(0);
						}
					} else
						iEntityDTO = this.selectOne(iSearchContextDTO, false);

					IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionReturnMust().getPSDEMethodDTO();
					if (iPSDEMethodDTO == null) {
						iPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
					}
					if (iPSDEMethodDTO == null) {
						return iEntityDTO;
					}

					if (iEntityDTO.getDEMethodDTORuntime() == null || iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() == null || !(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getId().equals(iPSDEMethodDTO.getId()))) {
						IEntityDTO retEntityDTO = this.createEntityDTO(iPSDEMethodDTO);
						retEntityDTO.init(this.getDEMethodDTORuntime(iPSDEMethodDTO, false), iEntityDTO, true);
						return retEntityDTO;
					}
					return iEntityDTO;
				} else {
					// 判断参数是否为对象
					if (args[0] instanceof IEntityDTO) {
						IEntityDTO iEntityDTO = (IEntityDTO) args[0];
						Object objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
						Object objData = getSystemPersistentAdapter().get(this, iPSDEAction, objKey, null, false);
						if (objData == null) {
							return objData;
						}

						iEntityDTO.resetAll();
						if (objData instanceof IEntityDTO) {
							iEntityDTO.reload(objData, true);
						} else {
							iEntityDTO.reload(objData, false);
						}

						return iEntityDTO;
					} else {
						Object objData = getSystemPersistentAdapter().get(this, iPSDEAction, args[0], null, false);
						if (objData == null || (objData instanceof IEntityDTO)) {
							return objData;
						}

						IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionReturnMust().getPSDEMethodDTO();
						if (iPSDEMethodDTO == null) {
							iPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
						}
						IEntityDTO iEntityDTO = this.createEntityDTO(iPSDEMethodDTO);
						iEntityDTO.init(this.getDEMethodDTORuntime(iPSDEMethodDTO, false), objData, false);
						return iEntityDTO;
					}
				}
			}
		}

		if (DEActionModes.GETDRAFT.equals(strActionMode)) {
			String strRetType = iPSDEAction.getPSDEActionReturnMust().getType();
			if (DEMethodReturnTypes.VOID.equals(strRetType)) {
				return null;
			}

			if (DEMethodReturnTypes.DTO.equals(strRetType)) {
				IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionReturnMust().getPSDEMethodDTO();
				if (iPSDEMethodDTO == null) {
					iPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
				}
				IEntityDTO iEntityDTO = this.createEntityDTO(iPSDEMethodDTO);
				iEntityDTO.init(this.getDEMethodDTORuntime(iPSDEMethodDTO, false), args[0], true);
				return iEntityDTO;
			}

			return null;
		}

		if (DEActionModes.CHECKKEY.equals(strActionMode)) {

			if (this.getUniTagPSDEField() != null) {
				Object objKey = null;
				if (args[0] instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) args[0];
					objKey = iEntityDTO.get(this.getUniTagPSDEField().getLowerCaseName());
					if (ObjectUtils.isEmpty(objKey)) {
						if (!this.fillEntityKeyValue(iEntityDTO)) {
							return CheckKeyStates.OK;
						}
						objKey = iEntityDTO.get(this.getUniTagPSDEField().getLowerCaseName());
					}
				} else {
					objKey = args[0];
				}
				return this.checkKeyState(objKey);
			} else {
				Object objKey = null;
				if (args[0] instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) args[0];
					objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
					if (ObjectUtils.isEmpty(objKey)) {
						if (!this.fillEntityKeyValue(iEntityDTO)) {
							return CheckKeyStates.OK;
						}
						objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
					}
				} else {
					objKey = args[0];
				}
				return this.checkKeyState(objKey);
			}
		}

		if (DEActionModes.MOVEORDER.equals(strActionMode)) {

			IPSDEField orderValuePSDEField = this.getOrderValuePSDEField();
			if (orderValuePSDEField == null) {
				throw new Exception("未定义排序值属性");
			}
			if (args[0] instanceof IEntityDTO) {
				IEntityDTO iEntityDTO = (IEntityDTO) args[0];

				String strCurrentKey = iEntityDTO.getString(this.getKeyPSDEField().getLowerCaseName(), null);
				if (!StringUtils.hasLength(strCurrentKey)) {
					throw new Exception("未指定移动操作的数据");
				}

				String strTargetKey = iEntityDTO.getString(DEActionModes.PARAM_MOVEORDER_TARGETKEY, null);
				if (!StringUtils.hasLength(strTargetKey)) {
					throw new Exception("未指定移动操作的目标数据");
				}

				if (strCurrentKey.equals(strTargetKey)) {
					throw new Exception("指定移动操作的数据与目标数据不能一致");
				}

				String strMoveType = iEntityDTO.getString(DEActionModes.PARAM_MOVEORDER_MOVETYPE, null);
				if (!StringUtils.hasLength(strMoveType)) {
					throw new Exception("未指定移动操作的类型");
				}

				if (!DEActionModes.MOVETYPE_MOVEAFTER.equalsIgnoreCase(strMoveType) && !DEActionModes.MOVETYPE_MOVEBEFORE.equalsIgnoreCase(strMoveType) && !DEActionModes.MOVETYPE_SWITCHPOS.equalsIgnoreCase(strMoveType)) {
					throw new Exception(String.format("无法识别的移动操作类型[%1$s]", strMoveType));
				}

				IPSDEDataSet iPSDEDataSet = null;
				if (iPSDEAction instanceof IPSDEUserCustomAction) {
					IPSDEUserCustomAction iPSDEUserCustomAction = (IPSDEUserCustomAction) iPSDEAction;
					iPSDEDataSet = iPSDEUserCustomAction.getPSDEDataSet();
				}
				if (iPSDEDataSet == null) {
					iPSDEDataSet = this.getOrderScopePSDEDataSet();
				}
				if (iPSDEDataSet == null) {
					throw new Exception("未指定移动操作的相关数据集");
				}

				ISearchContextDTO iSearchContextDTO = this.createSearchContext();
				iSearchContextDTO.putAll(iEntityDTO.any());
				iSearchContextDTO.count(false).all();

				this.setSearchSort(iSearchContextDTO, orderValuePSDEField, "ASC");

				// 查出数据
				List<IEntityDTO> list = this.selectDataSet(iPSDEDataSet, iSearchContextDTO);
				if (ObjectUtils.isEmpty(list)) {
					throw new Exception("无法获取移动的数据集");
				}

				Map<String, Integer> map = new LinkedHashMap<String, Integer>();
				for (IEntityDTO item : list) {
					map.put(item.getString(this.getKeyPSDEField().getLowerCaseName(), null), item.getInteger(orderValuePSDEField.getLowerCaseName(), Integer.MAX_VALUE));
				}

				if (!map.containsKey(strCurrentKey)) {
					throw new Exception("未指定移动操作的数据");
				}

				if (!map.containsKey(strTargetKey)) {
					throw new Exception("未指定移动操作的目标数据");
				}

				List<String> keyList = new ArrayList<String>();
				keyList.addAll(map.keySet());

				int nTargetPos = keyList.indexOf(strTargetKey);
				int nCurrentPos = keyList.indexOf(strCurrentKey);

				List<IEntityDTO> changedList = new ArrayList<IEntityDTO>();

				if (DEActionModes.MOVETYPE_MOVEAFTER.equalsIgnoreCase(strMoveType)) {
					if (nTargetPos + 1 == nCurrentPos) {
						return changedList;
					}

					keyList.remove(strCurrentKey);
					nTargetPos = keyList.indexOf(strTargetKey);
					keyList.add(nTargetPos + 1, strCurrentKey);
				} else if (DEActionModes.MOVETYPE_MOVEBEFORE.equalsIgnoreCase(strMoveType)) {
					if (nTargetPos - 1 == nCurrentPos) {
						return changedList;
					}

					keyList.remove(strCurrentKey);
					nTargetPos = keyList.indexOf(strTargetKey);
					keyList.add(nTargetPos, strCurrentKey);
				} else if (DEActionModes.MOVETYPE_SWITCHPOS.equalsIgnoreCase(strMoveType)) {
					keyList.remove(strCurrentKey);
					keyList.remove(strTargetKey);
					if (nCurrentPos < nTargetPos) {
						// 之前
						keyList.add(nCurrentPos, strTargetKey);
						keyList.add(nTargetPos, strCurrentKey);
					} else {
						keyList.add(nTargetPos, strCurrentKey);
						keyList.add(nCurrentPos, strTargetKey);
					}
				}

				// 重新排序

				for (int i = 0; i < keyList.size(); i++) {
					String strKey = keyList.get(i);
					int nNewOrder = this.getOrderInitialValue(1) + i * this.getOrderStepValue(1);
					int nLastOrder = map.get(strKey);
					if (nNewOrder == nLastOrder) {
						continue;
					}

					IEntityDTO item = this.createEntity();
					item.set(this.getKeyPSDEField().getLowerCaseName(), strKey);
					item.set(orderValuePSDEField.getLowerCaseName(), nNewOrder);
					changedList.add(item);
				}

				if (!ObjectUtils.isEmpty(changedList)) {
					// 执行批更新
					this.rawUpdate(changedList, false);
					// for(IEntityDTO item : changedList) {
					// this.syncEntityAfterProceed(DEDataSyncEvents.UPDATE,
					// item, null, DEActions.SYSUPDATE, null, null, null, null);
					// }
				}

				if (changedList.size() > SearchContextDTO.getMaxSize() * 10) {
					return null;
				}

				return changedList;
			} else {
				throw new Exception(String.format("不支持的移动数据对象[%1$s]", args[0]));
			}
		}

		if (DEActionModes.GETDRAFTFROM.equals(strActionMode)) {
			Object ret = this.executeAction(DEActions.GET, null, args);
			if (ret instanceof IEntityDTO) {
				IEntityDTO iEntityDTO = (IEntityDTO) ret;
				Object srfsourcekey = this.getKeyFieldValue(iEntityDTO);
				java.util.List<IPSDEField> psDEFields = this.getPSDEFields();
				if (!ObjectUtils.isEmpty(psDEFields)) {
					for (IPSDEField iPSDEField : psDEFields) {
						if (iPSDEField.isKeyDEField() || iPSDEField.isUniTagField() || iPSDEField.isPasteReset()) {
							iEntityDTO.reset(iPSDEField.getLowerCaseName());
							continue;
						}
					}
				}
				iEntityDTO.set(EntityBase.SOURCEKEY, srfsourcekey);
				return iEntityDTO;
			}
			return null;
		}
		
		if (DEActionModes.COPY.equals(strActionMode)) {
			if(args!=null && args.length > 0 && args[0] instanceof IEntityDTO) {
				return this.onCopy((IEntityDTO)args[0]);
			}
			else {
				throw new Exception("拷贝操作传入参数不正确");
			}
		}
		
		return super.onExecuteActionReal(strActionName, iPSDEAction, args, actionData);
	}

	@Override
	protected boolean isEnableExecutePredefinedAction() {
		return false;
	}

	@Override
	protected Object onFetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {

		IDEMapRuntime iDEMapRuntime = this.getDEMapRuntime(strDataSetName, iPSDEDataSet, PSModelEnums.DEMapObjectMapMode.DEFAULT.value);
		if (iDEMapRuntime != null) {
			log.debug(String.format("使用实体映射[%1$s]处理结果集[%2$s]", iDEMapRuntime.getName(), (iPSDEDataSet != null ? iPSDEDataSet.getName() : strDataSetName)));
			return iDEMapRuntime.fetchDataSet(strDataSetName, iPSDEDataSet, args, null);
		}

		if (this.isEnableVersionStorage()) {
			final IDEVersionStorageUtilRuntime iDEVersionStorageUtilRuntime = this.getDEVersionStorageUtilRuntime();
			if (iDEVersionStorageUtilRuntime.isEnableDataSet(strDataSetName, iPSDEDataSet, args)) {
				return iDEVersionStorageUtilRuntime.fetchDataSet(strDataSetName, iPSDEDataSet, args, actionData);
			}
		}

		return super.onFetchDataSet(strDataSetName, iPSDEDataSet, args, actionData);
	}

	@Override
	protected Object onFetchDataSetReal(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {

		IDEMapRuntime iDEMapRuntime = this.getDEMapRuntime(strDataSetName, iPSDEDataSet, PSModelEnums.DEMapObjectMapMode.INNER.value);
		if (iDEMapRuntime != null) {
			log.debug(String.format("使用实体映射[%1$s]处理结果集[%2$s]", iDEMapRuntime.getName(), (iPSDEDataSet != null ? iPSDEDataSet.getName() : strDataSetName)));
			return iDEMapRuntime.fetchDataSet(strDataSetName, iPSDEDataSet, args, null);
		}

		if (!this.isEnableRuntimeServiceMode()) {
			IDEService iDEService = this.getDEService();
			if (iDEService != null) {
				return iDEService.fetchDataSetReal(this.getDataEntityRuntimeContext(), strDataSetName, iPSDEDataSet, args, actionData);
			}
		}

		return this.doFetchDataSetReal(strDataSetName, iPSDEDataSet, args, actionData);
	}

	protected Object doFetchDataSetReal(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {

		if (iPSDEDataSet == null) {
			iPSDEDataSet = this.getPSDEDataSet(strDataSetName);
			if (iPSDEDataSet == null) {
				throw new DataEntityRuntimeException(this, String.format("无法获取实体数据集[%1$s]，无法获取对应的数据集模型", strDataSetName));
			}
		}

		IDEDataSetRuntime iDEDataSetRuntime = getDEDataSetRuntime(iPSDEDataSet);
		if (iDEDataSetRuntime != null && iDEDataSetRuntime.isValid(args)) {
			return iDEDataSetRuntime.fetch(args);
		}

		if (this.getStorageMode() == DEStorageModes.SERVICEAPI) {
			IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod = iPSDEDataSet.getPSSubSysServiceAPIDEMethod();
			if (iPSSubSysServiceAPIDEMethod != null) {
				return this.executeSubSysServiceAPIDEMethod(iPSSubSysServiceAPIDEMethod, iPSDEDataSet, args);
			}
		}

		if (this.getSystemPersistentAdapter() != null) {
			if (args != null && args.length > 0 && args[0] instanceof ISearchContext) {
				ISearchContext iSearchContext = (ISearchContext) args[0];
				Page<?> ret = this.getSystemPersistentAdapter().fetchDataSet(this, iPSDEDataSet, iSearchContext, null);
				Page<IEntityDTO> page = this.getEntityDTOPage(ret, iPSDEDataSet, iSearchContext.getPageable());

				if (iSearchContext.isFillNestedFields()) {
					this.fillEntityDTOPageNestedFields(page, iPSDEDataSet);
				}

				if (iSearchContext.isCount() && (iPSDEDataSet.getDataSetOption() & DEDataSetOption.TOTALX.value) == DEDataSetOption.TOTALX.value) {

					ISearchGroupCond iSearchGroupCond = SearchContextDTO.getSearchGroupCondByCat(iSearchContext, ISearchGroupCond.CAT_AUTHORITY);
					if (iSearchGroupCond != null) {
						iSearchContext.getSearchCondsIf().remove(iSearchGroupCond);
						// 再次查询
						Page<?> ret2 = this.getSystemPersistentAdapter().fetchDataSet(this, iPSDEDataSet, iSearchContext, null);
						iSearchContext.getSearchCondsIf().add(iSearchGroupCond);
						if (ret2 != null) {
							return new net.ibizsys.central.util.PageImpl<IEntityDTO>(page.getContent(), page.getPageable(), page.getTotalElements(), page.getTotalPages(), ret2.getTotalElements());
						}
					}
				}

				return page;
			}
		}

		return super.onFetchDataSetReal(strDataSetName, iPSDEDataSet, args, actionData);
	}

	@Override
	public Page<IEntityDTO> getEntityDTOPage(Page<?> page, IPSDEDataSet iPSDEDataSet, Pageable pagable) throws Throwable {
		if (page == null || page.getNumberOfElements() == 0) {
			return (Page<IEntityDTO>) page;
		}
		// 判断是否需要进行DTO转化
		if (page.getContent().get(0) instanceof IEntityDTO) {
			return (Page<IEntityDTO>) page;
		}

		List<IEntityDTO> entityDTOList = getEntityDTOList(page.getContent(), iPSDEDataSet);
		if (pagable == null) {
			return new PageImpl<IEntityDTO>(entityDTOList);
		} else {
			return new PageImpl<IEntityDTO>(entityDTOList, pagable, page.getTotalElements());
		}
	}

	@Override
	public List<IEntityDTO> getEntityDTOList(List<?> list, IPSDEDataSet iPSDEDataSet) throws Throwable {

		if (ObjectUtils.isEmpty(list)) {
			return (List<IEntityDTO>) list;
		}

		if (list.get(0) instanceof IEntityDTO) {
			return (List<IEntityDTO>) list;
		}

		IPSDEMethodDTO iPSDEMethodDTO = (iPSDEDataSet == null) ? getDefaultPSDEMethodDTO() : iPSDEDataSet.getPSDEDataSetReturnMust().getPSDEMethodDTOMust();
		IDEMethodDTORuntime iDEMethodDTORuntime = this.getDEMethodDTORuntime(iPSDEMethodDTO, false);

		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		for (Object objItem : list) {
			IEntityDTO iEntityDTO = this.createEntityDTO(iPSDEMethodDTO);
			iEntityDTO.init(iDEMethodDTORuntime, objItem, false);
			entityDTOList.add(iEntityDTO);
		}

		return entityDTOList;
	}

	@Override
	public Page<IEntityDTO> getEntityDTOPage(Page<?> page, IPSDEDataQuery iPSDEDataQuery, Pageable pagable) throws Throwable {
		if (page == null || page.getNumberOfElements() == 0) {
			return (Page<IEntityDTO>) page;
		}
		// 判断是否需要进行DTO转化
		if (page.getContent().get(0) instanceof IEntityDTO) {
			return (Page<IEntityDTO>) page;
		}

		List<IEntityDTO> entityDTOList = getEntityDTOList(page.getContent(), iPSDEDataQuery);
		if (pagable == null) {
			return new PageImpl<IEntityDTO>(entityDTOList);
		} else {
			return new PageImpl<IEntityDTO>(entityDTOList, pagable, page.getTotalElements());
		}

	}

	@Override
	public List<IEntityDTO> getEntityDTOList(List<?> list, IPSDEDataQuery iPSDEDataQuery) throws Throwable {

		if (ObjectUtils.isEmpty(list)) {
			return (List<IEntityDTO>) list;
		}

		if (list.get(0) instanceof IEntityDTO) {
			return (List<IEntityDTO>) list;
		}

		IPSDEMethodDTO iPSDEMethodDTO = (iPSDEDataQuery == null) ? getDefaultPSDEMethodDTO() : iPSDEDataQuery.getPSDEDataQueryReturnMust().getPSDEMethodDTOMust();
		IDEMethodDTORuntime iDEMethodDTORuntime = this.getDEMethodDTORuntime(iPSDEMethodDTO, false);

		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		for (Object objItem : list) {
			IEntityDTO iEntityDTO = this.createEntityDTO(iPSDEMethodDTO);
			iEntityDTO.init(iDEMethodDTORuntime, objItem, false);
			entityDTOList.add(iEntityDTO);
		}

		return entityDTOList;
	}

	protected Object executeSubSysServiceAPIDEMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		return onExecuteSubSysServiceAPIDEMethod(iPSSubSysServiceAPIDEMethod, iPSDEAction, args);
	}

	protected Object onExecuteSubSysServiceAPIDEMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = this.getSubSysServiceAPIDERuntime();
		if (iSubSysServiceAPIDERuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("实体不存在外部服务接口实体运行时对象"));
		}

		return iSubSysServiceAPIDERuntime.invokeMethod(iPSSubSysServiceAPIDEMethod, this, iPSDEAction, args);
	}

	protected Object executeSubSysServiceAPIDEMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		return onExecuteSubSysServiceAPIDEMethod(iPSSubSysServiceAPIDEMethod, iPSDEDataSet, args);
	}

	protected Object onExecuteSubSysServiceAPIDEMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		ISubSysServiceAPIDERuntime iSubSysServiceAPIDERuntime = this.getSubSysServiceAPIDERuntime();
		if (iSubSysServiceAPIDERuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("实体不存在外部服务接口实体运行时对象"));
		}

		return iSubSysServiceAPIDERuntime.invokeMethod(iPSSubSysServiceAPIDEMethod, this, iPSDEDataSet, args);
	}

	@Override
	public IEntityDTO createEntity() {
		return this.createEntity(null, false);
	}

	@Override
	public IEntityDTO createEntity(Map<String, Object> params) {
		return createEntity(params, false);
	}

	@Override
	public IEntityDTO createEntity(Map<String, Object> params, boolean bDTOData) {
		IPSDEMethodDTO defaultPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
		if (defaultPSDEMethodDTO == null) {
			throw new DataEntityRuntimeException(this, String.format("实体未定义默认方法DTO模型"));
		}
		try {
			IEntityDTO iEntityDTO = this.createEntityDTO(defaultPSDEMethodDTO);
			iEntityDTO.init(this.getDEMethodDTORuntime(defaultPSDEMethodDTO, false), params, bDTOData);
			return iEntityDTO;
		} catch (Exception e) {
			throw new DataEntityRuntimeException(this, String.format("建立实体默认DTO对象发生异常，%1$s", e.getMessage()), e);
		}
	}

	@Override
	public List<IEntityDTO> createEntityList() {
		IPSDEMethodDTO defaultPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
		if (defaultPSDEMethodDTO == null) {
			throw new DataEntityRuntimeException(this, String.format("实体未定义默认方法DTO模型"));
		}
		try {
			List<IEntityDTO> list = this.createEntityDTOList(defaultPSDEMethodDTO);
			return list;
		} catch (Exception e) {
			throw new DataEntityRuntimeException(this, String.format("建立实体默认DTO对象列表发生异常，%1$s", e.getMessage()), e);
		}
	}

	@Override
	public IDEDataQueryCodeRuntime getDEDataQueryCodeRuntime(IPSDEDataQuery iPSDEDataQuery, String strDBType, boolean bTryMode) {
		this.prepare();

		String strTag = String.format("%1$s|%2$s", iPSDEDataQuery.getId(), strDBType);
		IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = null;
		if (this.deDataQueryCodeRuntimeMap != null) {
			iDEDataQueryCodeRuntime = this.deDataQueryCodeRuntimeMap.get(strTag);
		}
		if (iDEDataQueryCodeRuntime != null || bTryMode) {
			return iDEDataQueryCodeRuntime;
		}

		throw new DataEntityRuntimeException(this, String.format("无法获取指定数据查询[%1$s][%2$s]运行时对象", iPSDEDataQuery.getName(), strDBType));
	}

	/**
	 * 获取系统持久化设配器
	 */
	@Override
	public ISystemPersistentAdapter getSystemPersistentAdapter() {
		this.prepare();
		return this.iSystemPersistentAdapter;
	}

	protected void setSystemPersistentAdapter(ISystemPersistentAdapter iSystemPersistentAdapter) {
		this.iSystemPersistentAdapter = iSystemPersistentAdapter;
	}

	@Override
	public ISysDBSchemeRuntime getSysDBSchemeRuntime() {
		this.prepare();
		return this.iSysDBSchemeRuntime;
	}

	protected void setSysDBSchemeRuntime(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
		this.iSysDBSchemeRuntime = iSysDBSchemeRuntime;
	}

	@Override
	public ISysDBSchemeRuntime getSysDBSchemeRuntimeMust() {
		ISysDBSchemeRuntime iSysDBSchemeRuntime = this.getSysDBSchemeRuntime();
		if (iSysDBSchemeRuntime == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "系统数据库运行时对象无效");
		}
		return iSysDBSchemeRuntime;
	}

	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		this.prepare();
		return this.iSubSysServiceAPIRuntime;
	}

	// protected void setSubSysServiceAPIRuntime(ISubSysServiceAPIRuntime
	// iSubSysServiceAPIRuntime) {
	// this.iSubSysServiceAPIRuntime = iSubSysServiceAPIRuntime;
	// }

	@Override
	public ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime() {
		this.prepare();
		return this.iSubSysServiceAPIDERuntime;
	}

	// protected void setSubSysServiceAPIDERuntime(ISubSysServiceAPIDERuntime
	// iSubSysServiceAPIDERuntime) {
	// this.iSubSysServiceAPIDERuntime = iSubSysServiceAPIDERuntime;
	// }

	@Override
	public ISearchContextDTO createSearchContext(Map<String, Object> params) {
		IPSDEFilterDTO defaultPSDEFilterDTO = this.getDefaultPSDEFilterDTO();
		if (defaultPSDEFilterDTO == null) {
			throw new DataEntityRuntimeException(this, String.format("实体未定义默认过滤器DTO模型"));
		}
		try {
			ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) this.getDEMethodDTO(defaultPSDEFilterDTO, params);
			return iSearchContextDTO;
		} catch (Exception e) {
			throw new DataEntityRuntimeException(this, String.format("建立实体过滤器对象发生异常，%1$s", e.getMessage()), e);
		}
	}

	@Override
	public ISearchContextDTO createSearchContext() {
		return createSearchContext(null);
	}

	@Override
	public IScriptSearchContext createScriptSearchContext(ISearchContextBase iSearchContextBase) {
		ISearchContextDTO iSearchContextDTO = null;
		if (iSearchContextBase != null) {
			iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		} else {
			iSearchContextDTO = createSearchContext();
		}
		return new ScriptSearchContext(this, iSearchContextDTO);
	}

	@Override
	public IScriptEntity createScriptEntity(IEntityBase iEntityBase) {
		return new ScriptEntity(this, iEntityBase);
	}

	@Override
	public IPSDEField getPSDEField(String strName, boolean bTryMode) {
		IPSDEField iPSDEField = super.getPSDEField(strName);
		if (iPSDEField != null || bTryMode) {
			return iPSDEField;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定属性[%1$s]模型对象", strName));
	}

	@Override
	public IPSDEField getPSDEField(boolean bExtension, String strName, boolean bTryMode) {
		return this.getPSDEField(strName, bTryMode);
	}

	@Override
	public IPSDEFSearchMode getPSDEFSearchMode(String strName, boolean bTryMode) {
		this.prepare();
		IPSDEFSearchMode iPSDEFSearchMode = this.psDEFSearchModeMap.get(strName.toLowerCase());
		if (iPSDEFSearchMode != null || bTryMode) {
			return iPSDEFSearchMode;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定属性搜索模式[%1$s]模型对象", strName));
	}

	@Override
	public IPSDEFSearchMode getPSDEFSearchMode(ISearchFieldCond iSearchFieldCond, boolean bTryMode) {
		Assert.notNull(iSearchFieldCond, "传入搜索属性条件对象无效");

		if (StringUtils.hasLength(iSearchFieldCond.getSource())) {
			return this.getPSDEFSearchMode(iSearchFieldCond.getSource(), bTryMode);
		}

		StringBuilder sb = new StringBuilder();
		if (!ObjectUtils.isEmpty(iSearchFieldCond.getValueFunc())) {
			sb.append(String.format("F_%1$s_%2$s_%3$s", iSearchFieldCond.getFieldName(), iSearchFieldCond.getValueFunc(), iSearchFieldCond.getCondOp()).toUpperCase());
		} else {
			sb.append(String.format("N_%1$s_%2$s", iSearchFieldCond.getFieldName(), iSearchFieldCond.getCondOp()).toUpperCase());
		}

		// 忽略 EXISTS 及 NOTEXISTS 处理

		if (!ObjectUtils.isEmpty(iSearchFieldCond.getMode())) {
			sb.append(String.format("#%1$s", iSearchFieldCond.getMode()).toUpperCase());
		}

		return this.getPSDEFSearchMode(sb.toString(), bTryMode);
	}

	@Override
	public int checkKeyState(Object objKey) {

		if (objKey instanceof IEntityBase) {
			IEntityBase iEntityBase = (IEntityBase) objKey;
			objKey = this.getKeyFieldValue(iEntityBase);
			if (ObjectUtils.isEmpty(objKey)) {
				// 填充默认主键
				if (this.fillEntityKeyValue(iEntityBase)) {
					// 有填充业务键
					objKey = this.getKeyFieldValue(iEntityBase);
				} else {
					return CheckKeyStates.OK;
				}
			}
		}

		if (this.getSystemPersistentAdapter() == null) {
			// throw new DataEntityRuntimeException(this,
			// String.format("检查主键[%1$s]状态发生错误，未指定实体持久化对象", objKey));
			IEntityDTO iEntityDTO = this.get(objKey, true);
			if (iEntityDTO == null) {
				return CheckKeyStates.OK;
			}
			return CheckKeyStates.EXIST;
		}

		try {
			this.pushDataSource();
			return this.getSystemPersistentAdapter().checkKeyState(this, null, objKey);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("检查数据键值[%1$s]发生异常，%2$s", objKey, ex.getMessage()), ex);
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public boolean containsForeignKey(IPSDEField iPSDEField, Object objKey, IPSDERBase iPSDERBase) {

		Assert.notNull(iPSDEField, "未传入外键属性");

		if (this.getDEType() == DEType.ABSTRACT.value) {
			// 列出继承关系
			java.util.List<IPSDERBase> psDERBaseList = null;
			try {
				psDERBaseList = this.getPSDataEntity().getMajorPSDERs();
			} catch (Exception ex) {
				throw new DataEntityRuntimeException(this, String.format("获取实体主关系发生异常，%1$s", ex.getMessage()), ex);
			}

			if (!ObjectUtils.isEmpty(psDERBaseList)) {
				for (IPSDERBase item : psDERBaseList) {
					if (!(item instanceof IPSDERMultiInherit)) {
						continue;
					}

					IPSDERMultiInherit iPSDERMultiInherit = (IPSDERMultiInherit) item;
					IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERMultiInherit.getMinorPSDataEntityMust().getId());
					IPSDEField inheritPSDEField = minorDataEntityRuntime.getPSDEField(iPSDEField.getName(), true);
					if (inheritPSDEField == null) {
						continue;
					}

					// 需要为继承属性
					if (!(inheritPSDEField instanceof IPSInheritDEField)) {
						continue;
					}

					IPSInheritDEField iPSInheritDEField = (IPSInheritDEField) inheritPSDEField;
					if (!iPSDERMultiInherit.getId().equals(iPSInheritDEField.getPSDERMust().getId())) {
						continue;
					}

					if (minorDataEntityRuntime.containsForeignKey(iPSInheritDEField, objKey, iPSDERBase)) {
						return true;
					}
				}
			}

			return false;

		} else {
			ISearchContextDTO iSearchContextDTO = this.createSearchContext();
			SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSDEField.getName(), Conditions.EQ, objKey);
			if (this.getDEType() == DETypes.DYNAATTACHED && iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				IPSDEField parentTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
				IPSDEField parentSubTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
				String strParentType = iPSDERCustom.getParentType();
				if (!StringUtils.hasLength(strParentType)) {
					// strParentType = this.getName();
					strParentType = this.getDERParentType();
				}
				String strParentSubType = null;

				if (parentSubTypePSDEField != null) {
					strParentSubType = iPSDERCustom.getParentSubType();
					if (!StringUtils.hasLength(strParentSubType)) {
						strParentSubType = iPSDERCustom.getMinorCodeName();
					}
				}
				if (parentTypePSDEField != null) {
					this.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
				}
				if (parentSubTypePSDEField != null) {
					if (StringUtils.hasLength(strParentSubType)) {
						try {
							this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
						} catch (Exception ex) {
							log.error(ex);
						}
					} else {
						this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
					}
				}
			}
			// 设置页数
			this.setSearchPaging(iSearchContextDTO, ISearchContext.STARTPAGE, 1, Sort.unsorted());
			iSearchContextDTO.setCount(false);

			try {
				List list = null;
				if (this.getSystemPersistentAdapter() == null) {
					if (this.getDefaultPSDEDataSet() != null) {
						list = this.selectDataSet(this.getDefaultPSDEDataSet(), iSearchContextDTO);
					} else
						throw new Exception("未指定默认数据集");
				} else {
					list = this.getSystemPersistentAdapter().query(this, this.getDefaultPSDEDataQuery(), iSearchContextDTO, null);
				}
				if (list == null || list.size() == 0) {
					return false;
				}
				return true;
			} catch (Throwable ex) {
				throw new DataEntityRuntimeException(this, String.format("检查是否引用指定数据[%1$s][%2$s]发生异常，%3$s", iPSDEField.getName(), objKey, ex.getMessage()), ex);
			}
		}
	}

	@Override
	public void resetByForeignKey(IPSDEField iPSDEField, Object objKey, IPSDERBase iPSDERBase) {

		Assert.notNull(iPSDEField, "未传入外键属性");

		if (this.getDEType() == DEType.ABSTRACT.value) {
			// 列出继承关系
			java.util.List<IPSDERBase> psDERBaseList = null;
			try {
				psDERBaseList = this.getPSDataEntity().getMajorPSDERs();
			} catch (Exception ex) {
				throw new DataEntityRuntimeException(this, String.format("获取实体主关系发生异常，%1$s", ex.getMessage()), ex);
			}

			if (!ObjectUtils.isEmpty(psDERBaseList)) {
				for (IPSDERBase item : psDERBaseList) {
					if (!(item instanceof IPSDERMultiInherit)) {
						continue;
					}

					IPSDERMultiInherit iPSDERMultiInherit = (IPSDERMultiInherit) item;
					IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERMultiInherit.getMinorPSDataEntityMust().getId());
					IPSDEField inheritPSDEField = minorDataEntityRuntime.getPSDEField(iPSDEField.getName(), true);
					if (inheritPSDEField == null) {
						continue;
					}

					// 需要为继承属性
					if (!(inheritPSDEField instanceof IPSInheritDEField)) {
						continue;
					}

					IPSInheritDEField iPSInheritDEField = (IPSInheritDEField) inheritPSDEField;
					if (!iPSDERMultiInherit.getId().equals(iPSInheritDEField.getPSDERMust().getId())) {
						continue;
					}

					minorDataEntityRuntime.resetByForeignKey(iPSInheritDEField, objKey, iPSDERBase);
				}
			}
		} else {
			ISearchContextDTO iSearchContextDTO = this.createSearchContext();
			SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSDEField.getName(), Conditions.EQ, objKey);
			if (this.getDEType() == DETypes.DYNAATTACHED && iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				IPSDEField parentTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
				IPSDEField parentSubTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
				String strParentSubType = null;
				String strParentType = iPSDERCustom.getParentType();
				if (!StringUtils.hasLength(strParentType)) {
					// strParentType = this.getName();
					strParentType = this.getDERParentType();
				}
				if (parentSubTypePSDEField != null) {
					strParentSubType = iPSDERCustom.getParentSubType();
					if (!StringUtils.hasLength(strParentSubType)) {
						strParentSubType = iPSDERCustom.getMinorCodeName();
					}
				}
				if (parentTypePSDEField != null) {
					this.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
				}
				if (parentSubTypePSDEField != null) {
					if (StringUtils.hasLength(strParentSubType)) {
						try {
							this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
						} catch (Exception ex) {
							log.error(ex);
						}
					} else {
						this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
					}
				}
			}
			iSearchContextDTO.all();
			iSearchContextDTO.setCount(false);
			try {

				List list = null;
				if (this.getSystemPersistentAdapter() == null) {
					if (this.getDefaultPSDEDataSet() != null) {
						list = this.selectDataSet(this.getDefaultPSDEDataSet(), iSearchContextDTO);
					} else
						throw new Exception("未指定默认数据集");
				} else {
					list = this.getSystemPersistentAdapter().query(this, this.getDefaultPSDEDataQuery(), iSearchContextDTO, null);
				}

				if (list == null || list.size() == 0) {
					return;
				}

				for (Object item : list) {
					Object key = null;
					if (item instanceof Map) {
						key = ((Map) item).get(this.getKeyPSDEField().getName());
					} else if (item instanceof net.ibizsys.central.util.IEntity) {
						key = ((net.ibizsys.central.util.IEntity) item).get(this.getKeyPSDEField().getName());
					} else {
						throw new Exception(String.format("无法识别的数据对象[%1$s]", item));
					}

					IEntity iEntity = this.createEntity();
					iEntity.set(this.getKeyPSDEField().getName(), key);
					iEntity.set(iPSDEField.getName(), null);
					this.update(iEntity);
				}

			} catch (Throwable ex) {
				throw new DataEntityRuntimeException(this, String.format("重置指定引用[%1$s][%2$s]相关数据发生异常，%3$s", iPSDEField.getName(), objKey, ex.getMessage()), ex);
			}
		}

	}

	@Override
	public void removeByForeignKey(IPSDEField iPSDEField, Object objKey, IPSDERBase iPSDERBase) {

		Assert.notNull(iPSDEField, "未传入外键属性");
		if (this.getDEType() == DEType.ABSTRACT.value) {
			// 列出继承关系
			java.util.List<IPSDERBase> psDERBaseList = null;
			try {
				psDERBaseList = this.getPSDataEntity().getMajorPSDERs();
			} catch (Exception ex) {
				throw new DataEntityRuntimeException(this, String.format("获取实体主关系发生异常，%1$s", ex.getMessage()), ex);
			}

			if (!ObjectUtils.isEmpty(psDERBaseList)) {
				for (IPSDERBase item : psDERBaseList) {
					if (!(item instanceof IPSDERMultiInherit)) {
						continue;
					}

					IPSDERMultiInherit iPSDERMultiInherit = (IPSDERMultiInherit) item;
					IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERMultiInherit.getMinorPSDataEntityMust().getId());
					IPSDEField inheritPSDEField = minorDataEntityRuntime.getPSDEField(iPSDEField.getName(), true);
					if (inheritPSDEField == null) {
						continue;
					}

					// 需要为继承属性
					if (!(inheritPSDEField instanceof IPSInheritDEField)) {
						continue;
					}

					IPSInheritDEField iPSInheritDEField = (IPSInheritDEField) inheritPSDEField;
					if (!iPSDERMultiInherit.getId().equals(iPSInheritDEField.getPSDERMust().getId())) {
						continue;
					}

					minorDataEntityRuntime.resetByForeignKey(iPSInheritDEField, objKey, iPSDERBase);
				}
			}
		} else {

			ISearchContextDTO iSearchContextDTO = this.createSearchContext();
			SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSDEField.getName(), Conditions.EQ, objKey);
			if (this.getDEType() == DETypes.DYNAATTACHED && iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				IPSDEField parentTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
				IPSDEField parentSubTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
				String strParentType = iPSDERCustom.getParentType();
				if (!StringUtils.hasLength(strParentType)) {
					// strParentType = this.getName();
					strParentType = this.getDERParentType();
				}
				String strParentSubType = null;
				if (parentSubTypePSDEField != null) {
					strParentSubType = iPSDERCustom.getParentSubType();
					if (!StringUtils.hasLength(strParentSubType)) {
						strParentSubType = iPSDERCustom.getMinorCodeName();
					}
				}
				if (parentTypePSDEField != null) {
					this.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
				}
				if (parentSubTypePSDEField != null) {
					if (StringUtils.hasLength(strParentSubType)) {
						try {
							this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
						} catch (Exception ex) {
							log.error(ex);
						}
					} else {
						this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
					}
				}
			}

			iSearchContextDTO.all();
			iSearchContextDTO.setCount(false);

			try {

				List list = null;
				if (this.getSystemPersistentAdapter() == null) {
					if (this.getDefaultPSDEDataSet() != null) {
						list = this.selectDataSet(this.getDefaultPSDEDataSet(), iSearchContextDTO);
					} else
						throw new Exception("未指定默认数据集");
				} else {
					list = this.getSystemPersistentAdapter().query(this, this.getDefaultPSDEDataQuery(), iSearchContextDTO, null);
					if (list == null || list.size() == 0) {
						return;
					}
				}

				for (Object item : list) {
					Object key = null;
					if (item instanceof Map) {
						key = ((Map) item).get(this.getKeyPSDEField().getName());
					} else if (item instanceof net.ibizsys.central.util.IEntity) {
						key = ((net.ibizsys.central.util.IEntity) item).get(this.getKeyPSDEField().getName());
					} else {
						throw new Exception(String.format("无法识别的数据对象[%1$s]", item));
					}

					this.remove(key);
				}

			} catch (Throwable ex) {
				throw new DataEntityRuntimeException(this, String.format("删除指定引用[%1$s][%2$s]相关数据发生异常，%3$s", iPSDEField.getName(), objKey, ex.getMessage()), ex);
			}
		}
	}

	@Override
	public boolean existsData(ISearchContextBase iSearchContextBase) {

		Assert.notNull(iSearchContextBase, "未传入搜索上下文对象");

		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		// 设置页数
		this.setSearchPaging(iSearchContextDTO, ISearchContext.STARTPAGE, 1, Sort.unsorted());
		iSearchContextDTO.setCount(false);
		//
		// if (this.getSystemPersistentAdapter() == null) {
		// throw new DataEntityRuntimeException(this,
		// String.format("执行数据存在判断发生错误，未指定实体持久化对象"));
		// }
		//

		try {
			List list = null;
			if (this.getSystemPersistentAdapter() == null) {
				if (this.getDefaultPSDEDataSet() != null) {
					list = this.selectDataSet(this.getDefaultPSDEDataSet(), iSearchContextDTO);
				} else
					throw new Exception("未指定默认数据集");

			} else {
				list = this.getSystemPersistentAdapter().query(this, this.getDefaultPSDEDataQuery(), iSearchContextDTO, null);
			}
			if (list == null || list.size() == 0) {
				return false;
			}
			return true;
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("检查是否存在指定数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public boolean existsData(IPSDEDataSet iPSDEDataSet, ISearchContextDTO iSearchContextDTO) {

		Assert.notNull(iPSDEDataSet, "未传入数据集模型对象");
		Assert.notNull(iSearchContextDTO, "未传入搜索上下文对象");

		// 设置页数
		this.setSearchPaging(iSearchContextDTO, ISearchContext.STARTPAGE, 1, Sort.unsorted());
		iSearchContextDTO.setCount(false);

		try {
			List list = null;
			if (this.getSystemPersistentAdapter() == null) {
				list = this.selectDataSet(iPSDEDataSet, iSearchContextDTO);
			} else {
				Page page = this.getSystemPersistentAdapter().fetchDataSet(this, iPSDEDataSet, iSearchContextDTO, null);
				if (page != null) {
					list = page.getContent();
				}
			}
			if (list == null || list.size() == 0) {
				return false;
			}
			return true;
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("检查是否存在指定数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public Page<? extends IEntityBase> searchDataSet(IPSDEDataSet iPSDEDataSet, ISearchContextBase iSearchContextBase) {
		Assert.notNull(iPSDEDataSet, "传入数据集合模型对象无效");
		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);

		try {
			Object ret = this.fetchDataSet(iPSDEDataSet.getName(), iPSDEDataSet, new Object[] { iSearchContextBase });
			if (ret == null) {
				throw new Exception(String.format("未返回结果对象"));
			}

			return (Page<? extends IEntityBase>) ret;

		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("搜索结果集[%1$s]发生异常，%2$s", iPSDEDataSet.getName(), ex.getMessage()), ex);
		}
	}

	@Override
	public List<? extends IEntityBase> selectDataQuery(IPSDEDataQuery iPSDataQuery, ISearchContextBase iSearchContextBase) {
		Assert.notNull(iPSDataQuery, "传入数据查询模型对象无效");
		if (this.getSystemPersistentAdapter() == null) {
			throw new DataEntityRuntimeException(this, String.format("搜索数据查询[%1$s]发生错误，未指定实体持久化对象", iPSDataQuery.getName()));
		}

		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		try {
			this.pushDataSource();
			List list = this.getSystemPersistentAdapter().query(this, iPSDataQuery, iSearchContextDTO, null);

			List<IEntityDTO> entityDTOList = this.getEntityDTOList(list, iPSDataQuery);
			if (!ObjectUtils.isEmpty(entityDTOList)) {
				this.translateEntitiesAfterProceed(iSearchContextDTO, entityDTOList, iPSDataQuery.getName(), iPSDataQuery, this.getPSDataEntity(), null, null);
				// for (IEntityDTO iEntityDTO : entityDTOList) {
				// this.translateEntityAfterProceed(iEntityDTO,
				// iPSDataQuery.getName(), iPSDataQuery, this.getPSDataEntity(),
				// null, null);
				// }
			}

			return entityDTOList;

		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("搜索数据查询[%1$s]发生异常，%2$s", iPSDataQuery.getName(), ex.getMessage()), ex);
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public List<IEntityDTO> selectDataQuery(String strDataQueryName, ISearchContextDTO iSearchContextDTO) {
		IPSDEDataQuery iPSDEDataQuery = this.getPSDEDataQuery(strDataQueryName);
		if (iPSDEDataQuery == null) {
			throw new DataEntityRuntimeException(this, String.format("无法获取指定数据查询[%1$s]", strDataQueryName));
		}
		return selectDataQuery(iPSDEDataQuery, iSearchContextDTO);
	}

	@Override
	public List<IEntityDTO> selectDataQuery(IPSDEDataQuery iPSDEDataQuery, ISearchContextDTO iSearchContextDTO) {
		Assert.notNull(iPSDEDataQuery, "传入数据查询模型对象无效");
		if (this.getSystemPersistentAdapter() == null) {
			throw new DataEntityRuntimeException(this, String.format("搜索数据查询[%1$s]发生错误，未指定实体持久化对象", iPSDEDataQuery.getName()));
		}

		try {
			this.pushDataSource();
			List list = this.getSystemPersistentAdapter().query(this, iPSDEDataQuery, iSearchContextDTO, null);

			List<IEntityDTO> entityDTOList = this.getEntityDTOList(list, iPSDEDataQuery);
			if (!ObjectUtils.isEmpty(entityDTOList)) {
				this.translateEntitiesAfterProceed(iSearchContextDTO, entityDTOList, iPSDEDataQuery.getName(), iPSDEDataQuery, this.getPSDataEntity(), null, null);
				// for (IEntityDTO iEntityDTO : entityDTOList) {
				// this.translateEntityAfterProceed(iEntityDTO,
				// iPSDEDataQuery.getName(), iPSDEDataQuery,
				// this.getPSDataEntity(), null, null);
				// }
			}

			return entityDTOList;

		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("搜索数据查询[%1$s]发生异常，%2$s", iPSDEDataQuery.getName(), ex.getMessage()), ex);
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public Page<IEntityDTO> searchDataQuery(IPSDEDataQuery iPSDataQuery, ISearchContextDTO iSearchContextDTO) {
		Assert.notNull(iPSDataQuery, "传入数据查询模型对象无效");
		if (this.getSystemPersistentAdapter() == null) {
			throw new DataEntityRuntimeException(this, String.format("搜索数据查询[%1$s]发生错误，未指定实体持久化对象", iPSDataQuery.getName()));
		}

		try {
			this.pushDataSource();
			Page page = this.getSystemPersistentAdapter().query2(this, iPSDataQuery, iSearchContextDTO, null);
			page = getEntityDTOPage(page, iPSDataQuery, iSearchContextDTO.getPageable());
			if (page != null && !ObjectUtils.isEmpty(page.getContent())) {
				this.translateEntitiesAfterProceed(iSearchContextDTO, page.getContent(), iPSDataQuery.getName(), iPSDataQuery, this.getPSDataEntity(), null, null);
				// for (Object item : page.getContent()) {
				// this.translateEntityAfterProceed(item,
				// iPSDataQuery.getName(), iPSDataQuery, this.getPSDataEntity(),
				// null, null);
				// }
			}
			return page;

		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("搜索数据查询[%1$s]发生异常，%2$s", iPSDataQuery.getName(), ex.getMessage()), ex);
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public List<IEntityDTO> selectDataSet(String strDataSetName, ISearchContextDTO iSearchContextDTO) {
		IPSDEDataSet iPSDEDataSet = this.getPSDEDataSet(strDataSetName);
		if (iPSDEDataSet == null) {
			throw new DataEntityRuntimeException(this, String.format("无法获取指定数据集[%1$s]", strDataSetName));
		}
		return selectDataSet(iPSDEDataSet, iSearchContextDTO);
	}

	@Override
	public List<IEntityDTO> selectDataSet(IPSDEDataSet iPSDataSet, ISearchContextDTO iSearchContextDTO) {
		Assert.notNull(iPSDataSet, "传入数据集模型对象无效");
		Object objRet;
		try {
			iSearchContextDTO.setCount(false);
			objRet = this.fetchDataSet(iPSDataSet.getName(), iPSDataSet, new Object[] { iSearchContextDTO });
			if (objRet instanceof Page) {
				Page<IEntityDTO> page = getEntityDTOPage((Page) objRet, iPSDataSet, iSearchContextDTO.getPageable());
				return page.getContent();
			}
			throw new Exception("调用返回结果不正确");
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("查询结果集[%1$s]发生异常，%2$s", iPSDataSet.getName(), ex.getMessage()), ex);
		}
	}

	@Override
	public List<IEntityDTO> selectSimple(ISearchContextDTO iSearchContextDTO) {
		if (this.getSystemPersistentAdapter() == null) {
			if (this.getDefaultPSDEDataSet() != null) {
				return this.selectDataSet(this.getDefaultPSDEDataSet(), iSearchContextDTO);
			}
		} else {
			try {
				this.pushDataSource();
				if (this.getSimplePSDEDataQuery() != null) {
					List ret = this.getSystemPersistentAdapter().query(this, this.getSimplePSDEDataQuery(), iSearchContextDTO, null);
					return this.getEntityDTOList(ret, this.getSimplePSDEDataQuery());
				}
			} catch (Throwable ex) {
				throw new DataEntityRuntimeException(this, String.format("搜索简单数据查询发生异常，%1$s", ex.getMessage()), ex);
			} finally {
				this.pollDataSource();
			}
		}

		throw new DataEntityRuntimeException(this, String.format("搜索简单数据查询发生异常，无法选择合适的数据查询"));
	}

	@Override
	public boolean select(IEntityDTO iEntityDTO, boolean bTryMode) {
		java.util.List<IPSDEField> psDEFieldList = this.getPSDEFields(false);
		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		if (!ObjectUtils.isEmpty(psDEFieldList)) {
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
					continue;
				}
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if (ObjectUtils.isEmpty(value)) {
					iSearchContextDTO.nvl(iPSDEField.getLowerCaseName());
				} else {
					iSearchContextDTO.eq(iPSDEField.getLowerCaseName(), value);
				}
			}
		}

		IEntityDTO ret = this.selectOne(iSearchContextDTO, bTryMode);
		if (ret == null) {
			return false;
		}
		try {
			iEntityDTO.reload(ret, true);
			return true;
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("数据对象重新加载数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public boolean rawSelect(IEntityDTO iEntityDTO, boolean bTryMode) {
		java.util.List<IPSDEField> psDEFieldList = this.getPSDEFields(false);
		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		if (!ObjectUtils.isEmpty(psDEFieldList)) {
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
					continue;
				}
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if (ObjectUtils.isEmpty(value)) {
					iSearchContextDTO.nvl(iPSDEField.getLowerCaseName());
				} else {
					iSearchContextDTO.eq(iPSDEField.getLowerCaseName(), value);
				}
			}
		}

		IEntityDTO ret = this.rawSelectOne(iSearchContextDTO, bTryMode);
		if (ret == null) {
			return false;
		}
		try {
			iEntityDTO.reload(ret, true);
			return true;
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("数据对象重新加载数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public boolean existsData(IEntityDTO iEntityDTO) {
		java.util.List<IPSDEField> psDEFieldList = this.getPSDEFields(false);
		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		if (!ObjectUtils.isEmpty(psDEFieldList)) {
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
					continue;
				}
				Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				if (ObjectUtils.isEmpty(value)) {
					iSearchContextDTO.nvl(iPSDEField.getLowerCaseName());
				} else {
					iSearchContextDTO.eq(iPSDEField.getLowerCaseName(), value);
				}
			}
		}

		return this.existsData(iSearchContextDTO);
	}

	@Override
	public IEntityDTO selectOne(ISearchContextDTO iSearchContextDTO, boolean bTryMode) {
		try {
			return (IEntityDTO) selectOne(iSearchContextDTO);
		} catch (DataEntityRuntimeException ex) {
			if (bTryMode && ex.getErrorCode() == Errors.INVALIDDATA) {
				return null;
			}
			throw ex;
		}
	}

	@Override
	public IEntityBase selectOne(ISearchContextBase iSearchContextBase) {
		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		this.setSearchPaging(iSearchContextDTO, ISearchContext.STARTPAGE, 1);
		iSearchContextDTO.count(false);

		List<? extends IEntityBase> list = null;
		if (this.getSystemPersistentAdapter() == null) {
			if (this.getDefaultPSDEDataSet() != null) {
				list = this.selectDataSet(this.getDefaultPSDEDataSet(), getSearchContextDTO(iSearchContextBase));
			}
		} else {
			list = this.selectDataQuery(this.getViewPSDEDataQuery(), iSearchContextDTO);
		}

		if (list == null || list.size() == 0) {
			throw new DataEntityRuntimeException(this, String.format("无法获取指定条件数据"), Errors.INVALIDDATA);
		}
		return (IEntityDTO) list.get(0);
	}

	@Override
	public List<? extends IEntityBase> select(ISearchContextBase iSearchContextBase) {
		if (this.getSystemPersistentAdapter() == null) {
			if (this.getDefaultPSDEDataSet() != null) {
				return this.selectDataSet(this.getDefaultPSDEDataSet(), getSearchContextDTO(iSearchContextBase));
			}
		}
		return this.selectDataQuery(this.getViewPSDEDataQuery(), iSearchContextBase);
	}

	@Override
	public List<IEntityDTO> select(ISearchContextDTO iSearchContextDTO) {
		if (this.getSystemPersistentAdapter() == null) {
			if (this.getDefaultPSDEDataSet() != null) {
				return this.selectDataSet(this.getDefaultPSDEDataSet(), iSearchContextDTO);
			}
		}
		return this.selectDataQuery(this.getViewPSDEDataQuery(), iSearchContextDTO);
	}

	@Override
	public IEntityBase selectOne(String strCondition) {
		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		this.setSearchCustomCondition(iSearchContextDTO, strCondition);
		return selectOne(iSearchContextDTO);
	}

	@Override
	public List<? extends IEntityBase> select(String strCondition) {
		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		this.setSearchCustomCondition(iSearchContextDTO, strCondition);
		return select(iSearchContextDTO);
	}

	@Override
	public IEntityDTO getSimpleEntity(Object objKey) {

		if (objKey instanceof IEntityDTO) {
			return (IEntityDTO) objKey;
		}

		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		SearchContextDTO.addSearchFieldCond(iSearchContextDTO, this.getKeyPSDEField().getLowerCaseName(), Conditions.EQ, objKey, null);
		this.setSearchPaging(iSearchContextDTO, ISearchContext.STARTPAGE, 1);

		List<? extends IEntityDTO> list = null;
		if (this.getSystemPersistentAdapter() == null) {
			try {
				if (this.getDefaultPSDEDataSet() != null) {
					list = this.selectDataSet(this.getDefaultPSDEDataSet(), iSearchContextDTO);
				} else {
					throw new Exception("未指定默认数据集对象");
				}
			} catch (Throwable ex) {
				throw new DataEntityRuntimeException(this, String.format("获取指定数据[%1$s]发生异常，%2$s", objKey, ex.getMessage()), ex);
			}
		} else {
			try {
				this.pushDataSource();
				List ret = this.getSystemPersistentAdapter().query(this, this.getSimplePSDEDataQuery(), iSearchContextDTO, null);
				list = this.getEntityDTOList(ret, this.getSimplePSDEDataQuery());
			} catch (Throwable ex) {
				throw new DataEntityRuntimeException(this, String.format("获取指定数据[%1$s]发生异常，%2$s", objKey, ex.getMessage()), ex);
			} finally {
				this.pollDataSource();
			}
		}

		if (list == null || list.size() == 0) {
			throw new DataEntityRuntimeException(this, String.format("无法获取指定数据[%1$s]", objKey), Errors.INVALIDDATA);
		}
		return list.get(0);
	}

	@Override
	public IEntityDTO getSessionEntityIf(Object objKey) throws Throwable {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		String strCacheTag = String.format("__SESSIONENTITY_%1$s_%2$s", this.getId(), objKey);
		if (actionSession != null) {
			Object item = actionSession.getActionParam(strCacheTag);
			if (item instanceof IEntityDTO) {
				return (IEntityDTO) item;
			}
		}

		IEntityDTO iEntityDTO = this.get(objKey);
		if (actionSession != null) {
			actionSession.setActionParam(strCacheTag, iEntityDTO);
		}
		return iEntityDTO;
	}

	@Override
	public IEntityDTO resetSessionEntity(Object objKey) {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession == null) {
			return null;
		}
		String strCacheTag = String.format("__SESSIONENTITY_%1$s_%2$s", this.getId(), objKey);
		return (IEntityDTO) actionSession.removeActionParam(strCacheTag);
	}

	@Override
	protected void onWFAction(String strActionName, IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		// super.onWFAction(strActionName, arg0, iPSDEAction, iPSDEWF,
		// actionData);
	}

	protected void onWFActionReal(String strActionName, IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		super.onWFAction(strActionName, arg0, iPSDEAction, iPSDEWF, actionData);
	}

	@Override
	protected void onWFStart(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).start(arg0, iPSDEAction, iDynaInstRuntime, actionData);
	}

	protected Object onWFSubmit(Object keyOrEntity, String strWFAction, Map<String, Object> params, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		return this.getDEWFRuntime(iPSDEWF).submit(keyOrEntity, strWFAction, params, iPSDEAction, iDynaInstRuntime, actionData);
	}

	@Override
	protected void onWFCancel(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).cancel(arg0, iPSDEAction, iDynaInstRuntime, actionData);
	}

	@Override
	protected void onWFError(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).error(arg0, iPSDEAction, actionData);
	}

	@Override
	protected void onWFFinish(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).finish(arg0, iPSDEAction, actionData);
	}

	@Override
	protected void onWFInit(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).init(arg0, iPSDEAction, actionData);
	}

	@Override
	protected void onWFRegister(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).register(arg0, iPSDEAction, iDynaInstRuntime, actionData);
	}

	@Override
	protected void onWFUnregister(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).unregister(arg0, iPSDEAction, iDynaInstRuntime, actionData);
	}

	@Override
	protected void onFillWFTag(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).fillWFTag(arg0, iPSDEAction, iDynaInstRuntime, actionData);
	}

	@Override
	protected void onWFUpdate(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).update(arg0, iPSDEAction, actionData);
	}

	@Override
	protected void onWFRollback(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		this.getDEWFRuntime(iPSDEWF).rollback(arg0, iPSDEAction, actionData);
	}

	@Override
	protected void onExecuteActionLogics(Object arg0, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// 此函数为Runtime提供的早期BPMN引擎介入入口，Central包不做任何处理
	}

	@Override
	public String getDynaInstId(Object objEntity) {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null && actionSession.getUserContext() != null) {
			return actionSession.getUserContext().getDynainstid();
		}

		if (this.getUserContext() != null) {
			return this.getUserContext().getDynainstid();
		}

		return null;
	}

	@Override
	protected IUserContext getUserContext() {
		// return UserContext.getCurrent();
		return ActionSessionManager.getUserContext();
	}

	@Override
	public Object getFieldValue(IEntityBase objEntity, IPSDEField iPSDEField) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.notNull(iPSDEField, "传入属性模型对象无效");

		return getEntity(objEntity).get(iPSDEField.getLowerCaseName());
	}

	@Override
	public void setFieldValue(IEntityBase objEntity, IPSDEField iPSDEField, Object objValue) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.notNull(iPSDEField, "传入属性模型对象无效");

		getEntity(objEntity).set(iPSDEField.getLowerCaseName(), objValue);
	}

	@Override
	public boolean containsFieldValue(IEntityBase objEntity, IPSDEField iPSDEField) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.notNull(iPSDEField, "传入属性模型对象无效");

		return getEntity(objEntity).contains(iPSDEField.getLowerCaseName());
	}

	@Override
	public void resetFieldValue(IEntityBase objEntity, IPSDEField iPSDEField) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.notNull(iPSDEField, "传入属性模型对象无效");

		getEntity(objEntity).reset(iPSDEField.getLowerCaseName());
	}

	@Override
	public Object getFieldValue(IEntityBase objEntity, String strFieldName) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");

		IPSDEField iPSDEField = this.getPSDEField(strFieldName);
		if (iPSDEField != null) {
			return this.getFieldValue(objEntity, iPSDEField);
		}
		return getEntity(objEntity).get(strFieldName.toLowerCase());
	}

	@Override
	public void setFieldValue(IEntityBase objEntity, String strFieldName, Object objValue) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");

		IPSDEField iPSDEField = this.getPSDEField(strFieldName);
		if (iPSDEField != null) {
			this.setFieldValue(objEntity, iPSDEField, objValue);
			return;
		}
		getEntity(objEntity).set(strFieldName.toLowerCase(), objValue);
	}

	@Override
	public boolean containsFieldValue(IEntityBase objEntity, String strFieldName) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");

		IPSDEField iPSDEField = this.getPSDEField(strFieldName);
		if (iPSDEField != null) {
			return this.containsFieldValue(objEntity, iPSDEField);
		}
		return getEntity(objEntity).contains(strFieldName.toLowerCase());
	}

	@Override
	public void resetFieldValue(IEntityBase objEntity, String strFieldName) {
		Assert.notNull(objEntity, "传入数据对象无效");
		Assert.hasLength(strFieldName, "传入属性名称无效");

		IPSDEField iPSDEField = this.getPSDEField(strFieldName);
		if (iPSDEField != null) {
			this.resetFieldValue(objEntity, iPSDEField);
			return;
		}
		getEntity(objEntity).reset(strFieldName.toLowerCase());
	}

	@Override
	public IEntityBase[] getNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase) {
		if (iEntityBase instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) iEntityBase;
			if (iEntityDTO.getDEMethodDTORuntime() != null) {
				IPSDEMethodDTOField iPSDEMethodDTOField = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDER(iPSDERBase.getId(), true);
				if (iPSDEMethodDTOField != null) {
					Object data = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
					if (data == null) {
						return null;
					}

					Collection list = null;
					if (iPSDEMethodDTOField.isListMap()) {
						if (!(data instanceof Map)) {
							throw new DataEntityRuntimeException(this, String.format("DTO属性[%1$s]值类型不正确", iPSDEMethodDTOField.getLowerCaseName()));
						}
						list = ((Map) data).values();
					} else {
						if (!(data instanceof List)) {
							throw new DataEntityRuntimeException(this, String.format("DTO属性[%1$s]值类型不正确", iPSDEMethodDTOField.getLowerCaseName()));
						}
						list = (Collection) data;
					}

					if (list.size() == 0) {
						return null;
					}

					IEntityBase[] arr = new IEntityBase[list.size()];
					java.util.Iterator it = list.iterator();
					int i = 0;
					while (it.hasNext()) {
						Object item = it.next();
						if (!(item instanceof IEntityBase)) {
							throw new DataEntityRuntimeException(this, String.format("DTO属性[%1$s]值类型不正确", iPSDEMethodDTOField.getLowerCaseName()));
						}

						arr[i] = (IEntityBase) item;
						i++;
					}
					return arr;
				}
			}
		}
		return null;
	}

	@Override
	public void setNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase, IEntityBase[] value) {
		// TODO Auto-generated method stub
		// throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public boolean containsNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase) {
		if (iEntityBase instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) iEntityBase;
			if (iEntityDTO.getDEMethodDTORuntime() != null) {
				IPSDEMethodDTOField iPSDEMethodDTOField = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDER(iPSDERBase.getId(), true);
				if (iPSDEMethodDTOField != null) {
					return iEntityDTO.contains(iPSDEMethodDTOField.getLowerCaseName());
				}
			}
		}
		return false;
	}

	@Override
	public void resetNestedDERValue(IEntityBase iEntityBase, IPSDERBase iPSDERBase) {
		if (iEntityBase instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) iEntityBase;
			if (iEntityDTO.getDEMethodDTORuntime() != null) {
				IPSDEMethodDTOField iPSDEMethodDTOField = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDER(iPSDERBase.getId(), true);
				if (iPSDEMethodDTOField != null) {
					iEntityDTO.reset(iPSDEMethodDTOField.getLowerCaseName());
				}
			}
		}
	}

	@Override
	public void setSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, String strCondition, Object objValue) {
		ISearchContextDTO iSearchContextDTO = this.getSearchContextDTO(iSearchContextBase);
		SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSDEField.getLowerCaseName(), strCondition, objValue, null);
	}

	@Override
	public void setSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode, Object objValue) {

		Assert.notNull(iSearchContextBase, "传入搜索上下文对象无效");
		Assert.notNull(iPSDEField, "传入实体属性对象无效");
		Assert.notNull(iPSDEFSearchMode, "传入实体属性搜索模式对象无效");

		ISearchContextDTO iSearchContextDTO = this.getSearchContextDTO(iSearchContextBase);
		SearchContextDTO.addSearchFieldCond(iSearchContextDTO, iPSDEField.getLowerCaseName(), iPSDEFSearchMode.getValueOP(), objValue, null);
	}

	@Override
	public Object getSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode) {

		Assert.notNull(iSearchContextBase, "传入搜索上下文对象无效");
		Assert.notNull(iPSDEField, "传入实体属性对象无效");
		Assert.notNull(iPSDEFSearchMode, "传入实体属性搜索模式对象无效");

		ISearchContextDTO iSearchContextDTO = this.getSearchContextDTO(iSearchContextBase);
		return iSearchContextDTO.get(iPSDEFSearchMode.getLowerCaseName());
	}

	@Override
	public Object getSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, String strCondition) {

		Assert.notNull(iSearchContextBase, "传入搜索上下文对象无效");
		Assert.notNull(iPSDEField, "传入实体属性对象无效");

		ISearchContextDTO iSearchContextDTO = this.getSearchContextDTO(iSearchContextBase);
		String strName = String.format("n_%1$s_%2$s", iPSDEField.getLowerCaseName(), strCondition).toLowerCase();
		return iSearchContextDTO.get(strName);
	}

	@Override
	public void setSearchCustomCondition(ISearchContextBase iSearchContextBase, String strCustomCondition) {
		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		SearchContextDTO.addSearchCustomCond(iSearchContextDTO, strCustomCondition);
	}

	@Override
	public void setSearchPaging(ISearchContextDTO iSearchContextDTO, int nPageIndex, int nPageSize) {
		iSearchContextDTO.setPageable(PageRequest.of(nPageIndex, nPageSize));
	}

	@Override
	public void setSearchPaging(ISearchContextBase iSearchContextBase, int nPageIndex, int nPageSize, Sort sort) {
		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		iSearchContextDTO.setPageable(PageRequest.of(nPageIndex, nPageSize));
		iSearchContextDTO.setPageSort(sort);
	}

	@Override
	public void setSearchSort(ISearchContextDTO iSearchContextDTO, IPSDEField sortPSDEField, String strSortDir) {
		List<Sort.Order> list = new ArrayList<Sort.Order>();
		if ("DESC".equalsIgnoreCase(strSortDir)) {
			list.add(Sort.Order.desc(sortPSDEField.getLowerCaseName()));
		} else {
			list.add(Sort.Order.asc(sortPSDEField.getLowerCaseName()));
		}
		Sort sort = Sort.by(list);
		iSearchContextDTO.setPageSort(sort);
	}

	@Override
	public void setSearchPaging(ISearchContextDTO iSearchContextDTO, int nPageIndex, int nPageSize, IPSDEField sortPSDEField, String strSortDir) {
		Sort sort = Sort.unsorted();
		if (sortPSDEField != null) {
			List<Sort.Order> list = new ArrayList<Sort.Order>();
			if ("DESC".equalsIgnoreCase(strSortDir)) {
				list.add(Sort.Order.desc(sortPSDEField.getLowerCaseName()));
			} else {
				list.add(Sort.Order.asc(sortPSDEField.getLowerCaseName()));
			}
			sort = Sort.by(list);
		}
		this.setSearchPaging(iSearchContextDTO, nPageIndex, nPageSize, sort);
	}

	@Override
	public void setSearchDataContext(ISearchContextBase iSearchContextBase, String strParam, Object objValue) {

		// IPSDEFSearchMode iPSDEFSearchMode = this.getPSDEFSearchMode(strParam,
		// false);
		//
		// IPSDEField iPSDEField =
		// iPSDEFSearchMode.getParentPSModelObject(IPSDEField.class, false);
		//
		// this.setSearchCondition(iSearchContextBase, iPSDEField,
		// iPSDEFSearchMode, objValue);

		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		iSearchContextDTO.set(strParam, objValue);
	}

	@Override
	public Object getSearchDataContext(ISearchContextBase iSearchContextBase, String strParam) {
		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		return iSearchContextDTO.get(strParam);
	}

	@Override
	public void setSearchMode(ISearchContextBase iSearchContextBase, boolean bData, boolean bCount) {
		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		iSearchContextDTO.setCount(bCount);
		if (!bData) {
			throw new DataEntityRuntimeException(this, String.format("未支持无数据模式"), Errors.NOTIMPL);
		}
	}

	@Override
	public void resetSearchCondition(ISearchContextBase iSearchContextBase, IPSDEField iPSDEField, IPSDEFSearchMode iPSDEFSearchMode) {

		Assert.notNull(iSearchContextBase, "传入搜索上下文对象无效");
		Assert.notNull(iPSDEField, "传入实体属性对象无效");
		Assert.notNull(iPSDEFSearchMode, "传入实体属性搜索模式对象无效");

		ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
		List<ISearchCond> searchConds = iSearchContextDTO.getSearchConds();
		if (ObjectUtils.isEmpty(searchConds)) {
			return;
		}
		for (ISearchCond iSearchCond : searchConds) {
			if (!(iSearchCond instanceof ISearchFieldCond)) {
				continue;
			}

			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
			if (StringUtils.hasLength(iSearchFieldCond.getSource())) {
				if (!iSearchFieldCond.getSource().equalsIgnoreCase(iPSDEFSearchMode.getName())) {
					continue;
				}
			} else {
				if (!iPSDEField.getName().equalsIgnoreCase(iSearchFieldCond.getFieldName())) {
					continue;
				}

				if (!iPSDEFSearchMode.getValueOP().equalsIgnoreCase(iSearchFieldCond.getCondOp())) {
					continue;
				}
			}

			searchConds.remove(iSearchCond);
			break;
		}
	}

	protected ISearchContextDTO getSearchContextDTO(ISearchContextBase iSearchContextBase) {
		if (!(iSearchContextBase instanceof ISearchContextDTO)) {
			throw new DataEntityRuntimeException(this, String.format("无法识别的搜索上下文对象[%1$s]", iSearchContextBase));
		}
		return (ISearchContextDTO) iSearchContextBase;
	}

	protected IEntityDTO getEntityDTO(IEntityBase iEntityBase) {
		if (!(iEntityBase instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this, String.format("无法识别的数据对象[%1$s]", iEntityBase));
		}
		return (IEntityDTO) iEntityBase;
	}

	protected IEntity getEntity(IEntityBase iEntityBase) {
		if (!(iEntityBase instanceof IEntity)) {
			throw new DataEntityRuntimeException(this, String.format("无法识别的数据对象[%1$s]", iEntityBase));
		}
		return (IEntity) iEntityBase;
	}

	@Override
	protected String getDBType() {
		if (this.getSysDBSchemeRuntime() != null) {
			return this.getSysDBSchemeRuntime().getDBType();
		}
		return super.getDBType();
	}

	@Override
	public String getFieldQueryExp(String strFieldName) {
		if (this.getViewPSDEDataQuery() != null) {
			IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = this.getDEDataQueryCodeRuntime(this.getViewPSDEDataQuery(), getDBType(), true);
			if (iDEDataQueryCodeRuntime != null) {
				IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(strFieldName, true);
				if (iPSDEDataQueryCodeExp != null) {
					return iPSDEDataQueryCodeExp.getExpression();
				}
			}
		}
		return super.getFieldQueryExp(strFieldName);
	}

	@Override
	protected void inheritMajorDataEntityCreateOrUpdate(IEntityBase arg0, boolean bCreate, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// 存在实体持久化对象忽略单项处理
		if (this.getSystemPersistentAdapter() != null) {
			return;
		}
		super.inheritMajorDataEntityCreateOrUpdate(arg0, bCreate, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	protected void inheritMajorDataEntityRemove(Object arg0, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// 存在实体持久化对象忽略单项处理
		if (this.getSystemPersistentAdapter() != null) {
			return;
		}
		super.inheritMajorDataEntityRemove(arg0, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	public IDEWFRuntime getDEWFRuntime(IPSDEWF iPSDEWF) {
		this.prepare();
		IDEWFRuntime iDEWFRuntime = null;
		if (this.deWFRuntimeMap != null) {
			iDEWFRuntime = this.deWFRuntimeMap.get(iPSDEWF.getId());
		}
		if (iDEWFRuntime == null && iPSDEWF instanceof IPSWFDE) {
			if (iPSDEWF.getPSWorkflow() != null) {
				iDEWFRuntime = this.deWFRuntimeMap.get(iPSDEWF.getPSWorkflow().getId());
			} else if (iPSDEWF.getParentPSModelObject() instanceof IPSWorkflow) {
				iDEWFRuntime = this.deWFRuntimeMap.get(iPSDEWF.getParentPSModelObject().getId());
			}

		}
		if (iDEWFRuntime != null) {
			return iDEWFRuntime;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定实体工作流[%1$s]运行时对象", iPSDEWF.getId()));
	}

	@Override
	public IDEWFRuntime getDefaultDEWFRuntime() {
		this.prepare();
		IPSDEWF defaultPSDEWF = this.getDefaultPSDEWF();
		if (defaultPSDEWF == null) {
			throw new DataEntityRuntimeException(this, String.format("未定义默认实体工作流"));
		}
		return getDEWFRuntime(defaultPSDEWF);
	}

	/**
	 * 建立实体工作流运行时
	 *
	 * @return
	 */
	protected IDEWFRuntime createDEWFRuntime(IPSDEWF iPSDEWF) {
		IDEWFRuntime iDEWFRuntime = this.getSystemRuntime().getRuntimeObject(IDEWFRuntime.class, null);
		if (iDEWFRuntime != null) {
			return iDEWFRuntime;
		}

		return new DEWFRuntime();
	}

	@Override
	public ISysDEUniStateRuntime getDefaultSysDEUniStateRuntime() {
		return this.getDefaultSysDEUniStateRuntime(false);
	}

	@Override
	public ISysDEUniStateRuntime getDefaultSysDEUniStateRuntime(boolean bTryMode) {
		this.prepare();
		IPSDEUniState defaultPSSysDEUniState = this.getDefaultPSDEUniState();
		if (defaultPSSysDEUniState == null) {
			if (bTryMode) {
				return null;
			}
			throw new DataEntityRuntimeException(this, String.format("未定义默认实体统一状态"));
		}
		return getSysDEUniStateRuntime(defaultPSSysDEUniState);
	}

	@Override
	public List<ISysDEUniStateRuntime> getSysDEUniStateRuntimes() {
		this.prepare();
		return this.deUniStateRuntimeList;
	}

	@Override
	public ISysDEUniStateRuntime getSysDEUniStateRuntime(IPSDEUniState iPSDEUniState) {
		Assert.notNull(iPSDEUniState, "未传入实体统一状态模型对象");
		this.prepare();
		return (ISysDEUniStateRuntime) this.getSystemRuntime().getSysUniStateRuntime(iPSDEUniState.getPSSysUniStateMust());
	}

	@Override
	public List<IPSDEField> getQuickSearchPSDEFields() {
		this.prepare();
		return this.quickSearchPSDEFieldList;
	}

	/**
	 * 填充实体行为参数
	 *
	 * @param iPSDEAction
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	@Override
	protected void fillActionParams(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Exception {
		List<IPSDEActionParam> psDEActionParams = iPSDEAction.getPSDEActionParams();
		//
		if (!ObjectUtils.isEmpty(psDEActionParams)) {
			// 判断参数模式
			int nParamMode = iPSDEAction.getParamMode();
			if (nParamMode == DEActionParamModes.ALL) {
				// 全部参数
				for (IPSDEActionParam iPSDEActionParam : psDEActionParams) {
					setActionParamValue(arg0, iPSDEActionParam, this.getPSDEField(iPSDEActionParam.getName()));
				}
				if (log.isDebugEnabled()) {
					log.debug(String.format("行为[%1$s]参数处理：%2$s", iPSDEAction.getName(), this.getSystemRuntime().serialize(arg0)));
				}
			} else if (nParamMode == DEActionParamModes.SOME) {

				IPSDEActionInputDTO iPSDEActionInputDTO = null;
				/**
				 * 判断输入对象类型
				 */
				if (iPSDEAction.getPSDEActionInput() != null && iPSDEAction.getPSDEActionInput().getPSDEMethodDTO() instanceof IPSDEActionInputDTO) {
					iPSDEActionInputDTO = (IPSDEActionInputDTO) iPSDEAction.getPSDEActionInput().getPSDEMethodDTO();
				}

				if (iPSDEActionInputDTO == null) {
					// 指定限定参数
					List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
					if (psDEFields != null) {
						for (IPSDEField iPSDEField : psDEFields) {
							boolean bReset = !iPSDEField.isKeyDEField(); // 主键保留
							for (IPSDEActionParam iPSDEActionParam : psDEActionParams) {
								if (iPSDEField.getName().equalsIgnoreCase(iPSDEActionParam.getName())) {
									setActionParamValue(arg0, iPSDEActionParam, iPSDEField);
									bReset = false;
								}
							}
							if (bReset) {
								this.resetFieldValue(arg0, iPSDEField);
							}
						}
					}
				} else {
					for (IPSDEActionParam iPSDEActionParam : psDEActionParams) {
						setActionParamValue(arg0, iPSDEActionParam);
					}
				}
				//
				if (log.isDebugEnabled()) {
					log.debug(String.format("行为[%1$s]参数处理：%2$s", iPSDEAction.getName(), this.getSystemRuntime().serialize(arg0)));
				}
			} else {
				log.warn(String.format("无法识别的实体行为参数模式[%1$s]", nParamMode));
			}
		}
	}
	//
	// @Override
	// protected void fillDataSetParams(ISearchContextBase iSearchContextBase,
	// IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime
	// iDynaInstRuntime, Object actionData) throws Exception {
	// List<IPSDEDataSetParam> psDEDataSetParams =
	// iPSDEDataSet.getPSDEDataSetParams();
	// //
	// if (!ObjectUtils.isEmpty(psDEDataSetParams)) {
	// // 判断参数模式
	// int nParamMode = iPSDEDataSet.getParamMode();
	// if (nParamMode == DEDataSetParamModes.ALL) {
	// // 全部参数
	// for (IPSDEDataSetParam iPSDEDataSetParam : psDEDataSetParams) {
	// setActionParamValue(arg0, iPSDEDataSetParam,
	// this.getPSDEField(iPSDEDataSetParam.getName()));
	// }
	// if (log.isDebugEnabled()) {
	// log.debug(String.format("数据集[%1$s]参数处理：%2$s", iPSDEDataSet.getName(),
	// this.getSystemRuntime().serialize(arg0)));
	// }
	// } else if (nParamMode == DEDataSetParamModes.SOME) {
	//
	// IPSDEDataSetInputDTO iPSDEDataSetInputDTO = null;
	// /**
	// * 判断输入对象类型
	// */
	// if (iPSDEDataSet.getPSDEDataSetInput() != null &&
	// iPSDEDataSet.getPSDEDataSetInput().getPSDEMethodDTO() instanceof
	// IPSDEDataSetInputDTO) {
	// iPSDEDataSetInputDTO = (IPSDEDataSetInputDTO)
	// iPSDEDataSet.getPSDEDataSetInput().getPSDEMethodDTO();
	// }
	//
	// if (iPSDEDataSetInputDTO == null) {
	// // 指定限定参数
	// List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
	// if (psDEFields != null) {
	// for (IPSDEField iPSDEField : psDEFields) {
	// boolean bReset = !iPSDEField.isKeyDEField(); // 主键保留
	// for (IPSDEDataSetParam iPSDEDataSetParam : psDEDataSetParams) {
	// if (iPSDEField.getName().equalsIgnoreCase(iPSDEDataSetParam.getName())) {
	// setActionParamValue(arg0, iPSDEDataSetParam, iPSDEField);
	// bReset = false;
	// }
	// }
	// if (bReset) {
	// this.resetFieldValue(arg0, iPSDEField);
	// }
	// }
	// }
	// } else {
	// for (IPSDEDataSetParam iPSDEDataSetParam : psDEDataSetParams) {
	// setActionParamValue(arg0, iPSDEDataSetParam);
	// }
	// }
	// //
	// if (log.isDebugEnabled()) {
	// log.debug(String.format("数据集[%1$s]参数处理：%2$s", iPSDEDataSet.getName(),
	// this.getSystemRuntime().serialize(arg0)));
	// }
	// } else {
	// log.warn(String.format("无法识别的实体数据集参数模式[%1$s]", nParamMode));
	// }
	// }
	// }

	@Override
	public IEntityDTO get(Object objKey, boolean bTryMode) {
		try {
			IEntityBase iEntityBase = super.get(objKey);
			return (IEntityDTO) iEntityBase;
		} catch (Throwable e) {
			if (e instanceof DataEntityRuntimeException) {
				if (bTryMode && ((DataEntityRuntimeException) e).getErrorCode() == Errors.INVALIDDATA) {
					return null;
				}
				throw (DataEntityRuntimeException) e;
			}
			throw new DataEntityRuntimeException(this, String.format("获取数据[%1$s]发生异常，%2$s", objKey, e.getMessage()), e);
		}
	}

	@Override
	public Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, boolean bIgnoreDEService) throws Throwable {

		prepare();

		if (StringUtils.hasLength(strDataSetName)) {
			iPSDEDataSet = this.getPSDEDataSet(strDataSetName);
		} else if (iPSDEDataSet != null) {
			strDataSetName = iPSDEDataSet.getName();
			iPSDEDataSet = this.getPSDEDataSet(strDataSetName);
		}

		if (iPSDEDataSet == null) {
			throw new DataEntityRuntimeException(this, String.format("无法获取实体数据集[%1$s]，无法获取对应的数据集模型", strDataSetName));
		}

		if (args.length > 0 && args[0] instanceof ISearchContextDTO) {
			// 判断DTO对象是否有运行时
			ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) args[0];
			if (iSearchContextDTO.getDEMethodDTORuntime() == null) {

				if (iPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO() != null) {
					iSearchContextDTO.setDEMethodDTORuntime((IDEFilterDTORuntime) this.getDEMethodDTORuntime(iPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), false));
				}
			}
		}

		if (!this.isEnableRuntimeServiceMode()) {
			if (!bIgnoreDEService && this.getDEService() != null) {
				return this.getDEService().fetchDataSet(strDataSetName, iPSDEDataSet, args);
			} else {
				getDEService();
			}
		}

		return super.fetchDataSet(strDataSetName, iPSDEDataSet, args);
	}

	@Override
	public Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		return fetchDataSet(strDataSetName, iPSDEDataSet, args, false);
	}

	@Override
	public Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		return executeAction(strActionName, iPSDEAction, args, false);
	}

	@Override
	public Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, boolean bIgnoreDEService) throws Throwable {

		prepare();

		// 判断行为是否支持
		if (StringUtils.hasLength(strActionName)) {
			iPSDEAction = this.getPSDEAction(strActionName);
		} else if (iPSDEAction != null) {
			strActionName = iPSDEAction.getName();
			iPSDEAction = this.getPSDEAction(strActionName);
		}

		if (args != null && args.length > 0 && iPSDEAction != null) {
			if (this.getSystemPersistentAdapter() != null && ((DEActions.SAVE.equalsIgnoreCase(iPSDEAction.getName()) && DEActionModes.UNKNOWN.equals(iPSDEAction.getActionMode())) || (DEActionModes.SAVE.equals(iPSDEAction.getActionMode())))) {

				boolean bGet = true;
				if (args.length >= 2 && args[1] instanceof Boolean) {
					bGet = DataTypeUtils.asBoolean(args[1], bGet);
				}

				// 判断数据是否存在
				if (args[0] instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) args[0];
					if (iEntityDTO.getDEMethodDTORuntime() == null) {
						iEntityDTO.setDEMethodDTORuntime(this.getDEMethodDTORuntime(iPSDEAction.getPSDEActionInputMust().getPSDEMethodDTO(), false));
					}

					Object objKey = this.getFieldValue(iEntityDTO, this.getKeyPSDEField());
					if (ObjectUtils.isEmpty(objKey)) {
						if (!ObjectUtils.isEmpty(this.getUnionKeyValuePSDEFields())) {
							this.fillEntityKeyValue(iEntityDTO);
							objKey = this.getFieldValue(iEntityDTO, this.getKeyPSDEField());
						}
					}
					boolean bCreate = true;
					if (!ObjectUtils.isEmpty(objKey)) {
						if (this.checkKeyState(objKey) == CheckKeyStates.EXIST) {
							bCreate = false;
						}
					}
					if (bCreate) {
						return executeAction(DEActions.CREATE, null, new Object[] { iEntityDTO, bGet });
					} else {
						return executeAction(DEActions.UPDATE, null, new Object[] { iEntityDTO, bGet });
					}
				} else if (args[0] instanceof List) {
					List list = (List) args[0];
					for (Object item : list) {
						if (item instanceof IEntityDTO) {
							IEntityDTO iEntityDTO = (IEntityDTO) item;
							if (iEntityDTO.getDEMethodDTORuntime() == null) {
								iEntityDTO.setDEMethodDTORuntime(this.getDEMethodDTORuntime(iPSDEAction.getPSDEActionInputMust().getPSDEMethodDTO(), false));
							}

							Object objKey = this.getFieldValue(iEntityDTO, this.getKeyPSDEField());
							if (ObjectUtils.isEmpty(objKey)) {
								if (!ObjectUtils.isEmpty(this.getUnionKeyValuePSDEFields())) {
									this.fillEntityKeyValue(iEntityDTO);
									objKey = this.getFieldValue(iEntityDTO, this.getKeyPSDEField());
								}
							}
							boolean bCreate = true;
							if (!ObjectUtils.isEmpty(objKey)) {
								if (this.checkKeyState(objKey) == CheckKeyStates.EXIST) {
									bCreate = false;
								}
							}
							if (bCreate) {
								executeAction(DEActions.CREATE, null, new Object[] { iEntityDTO, bGet });
							} else {
								executeAction(DEActions.UPDATE, null, new Object[] { iEntityDTO, bGet });
							}
						} else {
							throw new DataEntityRuntimeException(this, String.format("无法执行实体行为[%1$s]，传入参数无效", strActionName), Errors.INPUTERROR);
						}
					}
					return null;
				} else
					throw new DataEntityRuntimeException(this, String.format("无法执行实体行为[%1$s]，传入参数无效", strActionName), Errors.INPUTERROR);
			}
			

			if (iPSDEAction.getPSDEActionInputMust().getPSDEMethodDTO() != null) {
				// 判断参数DTO对象是否有运行时
				if (args[0] instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) args[0];
					if (iEntityDTO.getDEMethodDTORuntime() == null) {
						iEntityDTO.setDEMethodDTORuntime(this.getDEMethodDTORuntime(iPSDEAction.getPSDEActionInputMust().getPSDEMethodDTO(), false));
					}
				} else if (args[0] instanceof List) {
					List list = (List) args[0];
					for (Object item : list) {
						if (item instanceof IEntityDTO) {
							IEntityDTO iEntityDTO = (IEntityDTO) item;
							if (iEntityDTO.getDEMethodDTORuntime() == null) {
								iEntityDTO.setDEMethodDTORuntime(this.getDEMethodDTORuntime(iPSDEAction.getPSDEActionInputMust().getPSDEMethodDTO(), false));
							}
						}
					}
				}
			}

			if (args[0] instanceof List) {
				List list = (List) args[0];
				if (DEMethodInputTypes.DTOS.equals(iPSDEAction.getPSDEActionInputMust().getType()) || DEMethodInputTypes.KEYFIELDS.equals(iPSDEAction.getPSDEActionInputMust().getType())) {
					boolean bConvert = false;
					if (DEMethodInputTypes.KEYFIELDS.equals(iPSDEAction.getPSDEActionInputMust().getType())) {
						for (Object item : list) {
							if (item instanceof IEntityDTO) {
								bConvert = true;
								break;
							}
						}
						if (bConvert) {
							List keyList = new ArrayList<>();
							for (Object item : list) {
								IEntityDTO iEntityDTO = (IEntityDTO) item;
								Object objKey = this.getFieldValue(iEntityDTO, this.getKeyPSDEField());
								keyList.add(objKey);
							}
							args[0] = keyList;
						}
					}
					if (bConvert) {
						Object objRet = executeAction(strActionName, iPSDEAction, args, bIgnoreDEService);
						args[0] = list;
						return objRet;
					}
				}
			} else {
				if (DEMethodInputTypes.DTOS.equals(iPSDEAction.getPSDEActionInputMust().getType()) || DEMethodInputTypes.KEYFIELDS.equals(iPSDEAction.getPSDEActionInputMust().getType())) {
					// 需要列表
					Object arg0 = args[0];
					List list = new ArrayList<>();
					list.add(arg0);
					args[0] = list;

					Object objRet = executeAction(strActionName, iPSDEAction, args, bIgnoreDEService);

					args[0] = arg0;

					return objRet;
				} else if (DEMethodInputTypes.KEYFIELD.equals(iPSDEAction.getPSDEActionInputMust().getType()) && args[0] instanceof IEntityDTO) {
					Object arg0 = args[0];
					Object objKey = this.getFieldValue((IEntityDTO) arg0, this.getKeyPSDEField());

					args[0] = objKey;

					Object objRet = executeAction(strActionName, iPSDEAction, args, bIgnoreDEService);
					args[0] = arg0;
					if (objRet != null && objRet instanceof IEntityDTO) {
						// if(objRet != null && objRet instanceof IEntityDTO &&
						// iPSDEAction.getPSDEActionInputMust().isOutput()) {
						((IEntityDTO) arg0).reload(objRet, true);
						return arg0;
					}
					return objRet;
				}
			}
		}

		return this.executeActionReal(strActionName, iPSDEAction, args, bIgnoreDEService);

	}

	/**
	 * 实际执行操作
	 * 
	 * @param strActionName
	 * @param iPSDEAction
	 * @param args
	 * @param bIgnoreDEService
	 * @return
	 * @throws Throwable
	 */
	protected Object executeActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, boolean bIgnoreDEService) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		if (iPSDEAction == null) {
			iPSDEAction = this.getPSDEAction(strActionName);
		}

		try {
			this.pushDataSource();
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			int nTransactionalPropagation = getTransactionalPropagation(strActionName, iPSDEAction);
			final IPSDEAction iPSDEAction2 = iPSDEAction;
			// 此代码必须独立调用，全局准备实体服务对象
			final IDEService iDEService = this.getDEService();
			Object objRet = null;
			if (!this.isEnableRuntimeServiceMode() && !bIgnoreDEService && iDEService != null && iPSDEAction != null && args != null && args.length != 0) {
				ActionSessionManager.getCurrentSession().beginLog(this.getName(), strActionName + "@DEService");

				objRet = ActionSessionManager.getCurrentSession().execute(this, new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return iDEService.executeAction(strActionName, iPSDEAction2, args);
					}
				}, args, nTransactionalPropagation);

			} else {

				ActionSessionManager.getCurrentSession().beginLog(this.getName(), strActionName);

				if (!this.isEnableRuntimeServiceMode() && bIgnoreDEService && iDEService != null) {
					objRet = onExecuteAction(strActionName, iPSDEAction2, args, null);
				} else {
					objRet = ActionSessionManager.getCurrentSession().execute(this, new IAction() {
						@Override
						public Object execute(Object[] args) throws Throwable {
							return onExecuteAction(strActionName, iPSDEAction2, args, null);
						}
					}, args, nTransactionalPropagation);
				}
			}

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);

			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= 200) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEACTION, iActionSessionLog.toString(true), this.getName(), strActionName, iActionSessionLog.getTime(), iActionSessionLog);
					}
				}
				ActionSessionManager.closeSession(true);
			}

			return objRet;

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				IActionSessionLog iActionSessionLog = actionSession.endLog(ex.getMessage(), true, ex);
				if (iActionSessionLog != null) {
					String strInfo = String.format("实体[%1$s]行为[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strActionName, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEACTION, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}

	}

	@Override
	public Object rawExecute(IAction iAction, Object[] args) throws Throwable {
		return this.rawExecute(iAction, args, ITransactionalUtil.PROPAGATION_REQUIRED);
	}

	@Override
	public Object rawExecute(IAction iAction, Object[] args, int nTransactionalPropagation) throws Throwable {

		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		String strActionName = "未知行为";
		if (iAction instanceof INamedAction) {
			strActionName = ((INamedAction) iAction).getName();
		}

		try {
			this.pushDataSource();
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			actionSession.beginLog(this.getName(), strActionName);

			Object objRet = ActionSessionManager.getCurrentSession().execute(this, iAction, args, nTransactionalPropagation);

			// Object objRet = this.onExecuteAction(strActionName, iPSDEAction,
			// args, null);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);
			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEACTION, iActionSessionLog.toString(true), this.getName(), strActionName, iActionSessionLog.getTime(), iActionSessionLog);
					}
				}
				ActionSessionManager.closeSession(true);
			}

			return objRet;

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				IActionSessionLog iActionSessionLog = actionSession.endLog(ex.getMessage(), true, ex);
				if (iActionSessionLog != null) {
					String strInfo = String.format("实体[%1$s]行为[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strActionName, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEACTION, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public void wfStart(IEntityBase iEntityBase, IPSDEWF iPSDEWF) throws Throwable {
		wfStart(iEntityBase, iPSDEWF, false);
	}

	@Override
	public void wfStart(IEntityBase iEntityBase, IPSDEWF iPSDEWF, boolean bIgnoreDEService) throws Throwable {
		if (!this.isEnableRuntimeServiceMode() && !bIgnoreDEService && this.getDEService() != null) {
			this.getDEService().wfStart(iEntityBase, iPSDEWF);
			return;
		}
		super.wfStart(iEntityBase, iPSDEWF);
	}

	@Override
	public void checkNestedEntities(IEntityBase parentEntity, IEntityBase[] entities, IDynaInstRuntime iDynaInstRuntime) throws Throwable {

		Assert.notEmpty(entities, "传入数据对象数组无效");

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		String strParamKey = null;
		if (actionSession != null) {
			strParamKey = String.format("__CHECKNESTEDENTITIES__%1$s__%2$s", this.getId(), actionSession.getSessionId());
			actionSession.setActionParam(strParamKey, entities);
		}

		try {
			net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
			if (iDynaInstRuntime != null) {
				iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
			}
			for (IEntityBase iEntityBase : entities) {
				String strAction = DEActions.CREATE;
				// Object key = this.getKeyFieldValue(iEntityBase);
				// if(!ObjectUtils.isEmpty(key)) {
				// if(this.checkKeyState(key)==CheckKeyStates.EXIST) {
				// strAction = DEActions.UPDATE;
				// }
				// }
				this.checkEntityBeforeProceed(iEntityBase, strAction, null, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, entities);
			}

			super.checkNestedEntities(parentEntity, entities, iDynaInstRuntime);
		} finally {
			if (actionSession != null && StringUtils.hasLength(strParamKey)) {
				actionSession.removeActionParam(strParamKey);
			}
		}

	}

	@Override
	protected boolean checkFieldDuplicateCondition(Object objValue, IEntityBase arg0, IPSDEField iPSDEField) throws Throwable {

		Assert.notNull(iPSDEField, "未传入属性模型对象");

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		String strParamKey = null;
		if (actionSession != null) {
			strParamKey = String.format("__CHECKNESTEDENTITIES__%1$s__%2$s", this.getId(), actionSession.getSessionId());
			Object data = actionSession.getActionParam(strParamKey);
			if (data != null) {
				IEntityBase[] entities = (IEntityBase[]) data;
				for (IEntityBase iEntityBase : entities) {
					if (iEntityBase == arg0) {
						continue;
					}

					Object objValueDst = this.getFieldValue(iEntityBase, iPSDEField);
					// 对比值
					if (this.getSystemRuntime().compareValue(objValue, objValueDst, iPSDEField.getStdDataType()) != 0) {
						continue;
					}
					// 检查范围
					boolean bMatchRange = true;
					List<IPSDEField> dupCheckPSDEFields = iPSDEField.getDupCheckPSDEFields();
					if (dupCheckPSDEFields != null) {
						for (IPSDEField dupCheckPSDEField : dupCheckPSDEFields) {
							Object value = this.getFieldValue(arg0, dupCheckPSDEField);
							Object valueDst = this.getFieldValue(iEntityBase, dupCheckPSDEField);
							if (this.getSystemRuntime().compareValue(value, valueDst, dupCheckPSDEField.getStdDataType()) != 0) {
								bMatchRange = false;
								break;
							}
						}
					}
					return !bMatchRange;
				}
				return true;
			}
		}
		return super.checkFieldDuplicateCondition(objValue, arg0, iPSDEField);
	}

	@Override
	protected boolean isFillEntityFullInfo(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null && this.getStorageMode() == DEStorageModes.SERVICEAPI) {
			if (iPSDEAction.getPSSubSysServiceAPIDEMethod() != null) {
				return false;
			}
		}
		return super.isFillEntityFullInfo(strActionName, iPSDEAction);
	}

	@Override
	protected void fillEntityFullInfo(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		// 嵌套数据中存在传入父数据对象
		if (arg0 instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) arg0;
			// this.removeInvalidUserInput(iPSDEAction,iEntityDTO);
			if (iEntityDTO.getDEMethodDTORuntime() != null) {
				List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
				if (psDEMethodDTOFieldList != null) {
					for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
						if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) && iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupObjectDEField) {

							if (DEActions.CREATE.equalsIgnoreCase(iPSDEAction.getName()) || DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
								if (!iPSDEMethodDTOField.getPSDEField().isEnableCreate()) {
									continue;
								}
							} else if (DEActions.UPDATE.equalsIgnoreCase(iPSDEAction.getName()) || DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
								if (!iPSDEMethodDTOField.getPSDEField().isEnableModify()) {
									continue;
								}
							} else
								continue;

							Object dtoData = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
							if (dtoData != null) {

								if (!(dtoData instanceof IEntityBase)) {
									throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
								}

								IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField) iPSDEMethodDTOField.getPSDEField();
								IPSDERBase iPSDERBase = iPSPickupObjectDEField.getPSDERMust();
								// 从实体中获取指定关系的属性
								IPSDEField pickupPSDEField = null;
								if (iPSDERBase instanceof IPSDER1N) {
									pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
								} else if (iPSDERBase instanceof IPSDERCustom) {
									pickupPSDEField = ((IPSDERCustom) iPSDERBase).getPickupPSDEField();
								}
								if (pickupPSDEField == null) {
									// throw new
									// DataEntityRuntimeException(this,
									// iEntityDTO.getDEMethodDTORuntime(),
									// String.format("属性[%1$s]没有定义DTO连接属性",
									// iPSDEMethodDTOField.getName()));
									log.warn(String.format("属性[%1$s]没有定义DTO连接属性，忽略默认处理", iPSDEMethodDTOField.getName()));
									continue;
								}

								IEntityBase iEntityBase = (IEntityBase) dtoData;
								IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
								// 判断是否存在主键
								Object objKeyValue = refDataEntityRuntime.getKeyFieldValue(iEntityBase);
								if (ObjectUtils.isEmpty(objKeyValue)) {
									refDataEntityRuntime.create(iEntityBase);
								} else {
									refDataEntityRuntime.update(iEntityBase);
								}

								objKeyValue = refDataEntityRuntime.getKeyFieldValue(iEntityBase);
								// 回填至主数据
								this.setFieldValue(arg0, pickupPSDEField, objKeyValue);
							}
						}
					}
				}
			}
		}

		super.fillEntityFullInfo(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = (IEntityDTO) arg0;
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.fillEntityFullInfo(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void translateEntityBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.translateEntityBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = (IEntityDTO) arg0;
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.translateEntityBeforeProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void resetReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.resetReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.resetReferenceBeforeRemove(this.getDataEntityRuntimeContext(), arg0, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void removeReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.removeReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.removeReferenceBeforeRemove(this.getDataEntityRuntimeContext(), arg0, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void translateEntityNestedDERsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			return;
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iEntityDTO.getDEMethodDTORuntime() != null) {
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if (psDEMethodDTOFieldList != null) {
				for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

						if (iPSDEMethodDTOField.getRefPSDataEntity() == null) {
							continue;
						}

						Object dtoData = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
						if (dtoData != null) {
							IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
							// 同一外部服务接口，忽略
							if (this.getStorageMode() == DEStorageModes.SERVICEAPI && refDataEntityRuntime.getStorageMode() == DEStorageModes.SERVICEAPI) {
								if (this.getSubSysServiceAPIRuntime() == refDataEntityRuntime.getSubSysServiceAPIRuntime()) {
									continue;
								}
							}
							if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

								if (iPSDEMethodDTOField.isListMap()) {
									if (!(dtoData instanceof Map)) {
										throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
									}
								} else {
									// 列表模式
									if (!(dtoData instanceof List)) {
										throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
									}
								}

								IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
								if (iPSDERBase == null) {
									if (iPSDEMethodDTOField.getRelatedPSDEMethodDTOField() != null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER() != null) {
										if (iPSDEMethodDTOField.getPSDEField() != null && DEFDataTypes.INHERIT.equals(iPSDEMethodDTOField.getPSDEField().getDataType())) {
											iPSDERBase = iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER();
										} else {
											// 其它场景暂时不支持
											continue;
										}
									}
									if (iPSDERBase == null) {
										iPSDERBase = iPSDEMethodDTOField.getPSDERMust();
									}
								}

								IEntityBase[] minorEntities = this.getNestedDERValue(arg0, iPSDERBase);

								// 执行数据映射处理
								if (iPSDERBase instanceof IPSDER1N) {
									IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
									if (iPSDER1N.getPSDER1NDEFieldMaps() != null) {
										for (IPSDER1NDEFieldMap iPSDER1NDEFieldMap : iPSDER1N.getPSDER1NDEFieldMaps()) {
											Object objCalcValue = EntityListUtils.calc(iPSDER1NDEFieldMap.getMapType(), minorEntities, iPSDER1NDEFieldMap.getMinorPSDEField(), refDataEntityRuntime);
											this.setFieldValue(arg0, iPSDER1NDEFieldMap.getMajorPSDEField(), objCalcValue);
										}
									}
								}
							}
						}
					}
				}
			}
		}

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.translateEntityNestedDERsBeforeProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void checkEntityNestedDERsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			return;
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iEntityDTO.getDEMethodDTORuntime() != null) {
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if (!ObjectUtils.isEmpty(psDEMethodDTOFieldList)) {
				for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

						if (iPSDEMethodDTOField.getRefPSDataEntity() == null) {
							continue;
						}

						Object dtoData = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
						if (dtoData != null) {
							IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
							// 同一外部服务接口，忽略
							if (this.getStorageMode() == DEStorageModes.SERVICEAPI && refDataEntityRuntime.getStorageMode() == DEStorageModes.SERVICEAPI) {
								if (this.getSubSysServiceAPIRuntime() == refDataEntityRuntime.getSubSysServiceAPIRuntime()) {
									continue;
								}
							}
							if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

								if (iPSDEMethodDTOField.isListMap()) {
									if (!(dtoData instanceof Map)) {
										throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
									}
								} else {
									// 列表模式
									if (!(dtoData instanceof List)) {
										throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
									}
								}

								IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
								if (iPSDERBase == null) {
									if (iPSDEMethodDTOField.getPSDEField() != null && DEFDataTypes.INHERIT.equals(iPSDEMethodDTOField.getPSDEField().getDataType()) && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField() != null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER() != null) {
										iPSDERBase = iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER();
									}
								}

								if (iPSDERBase == null) {
									continue;
								}

								IEntityBase[] minorEntities = this.getNestedDERValue(arg0, iPSDERBase);
								// 检查嵌套数据
								if (minorEntities != null && minorEntities.length > 0) {

									IPSDEField pickupPSDEField = null;
									IPSDEField parentTypePSDEField = null;
									IPSDEField parentNamePSDEField = null;
									IPSDEField parentSubTypePSDEField = null;
									String strParentType = null;
									String strParentSubType = null;
									Object parentId = null;
									Object parentName = null;

									parentId = getFieldValue(iEntityDTO, this.getKeyPSDEField());

									if (refDataEntityRuntime.getStorageMode() != DEStorageModes.NONE) {

										if (this.getMajorPSDEField() != null) {
											parentName = this.getFieldValue(iEntityDTO, this.getMajorPSDEField());
										}

										if (iPSDERBase instanceof IPSDER1N) {
											pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
											parentNamePSDEField = ((IPSDER1N) iPSDERBase).getPSPickupTextDEField();
										} else if (iPSDERBase instanceof IPSDERCustom) {
											IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
											pickupPSDEField = iPSDERCustom.getPickupPSDEField();
											if (refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType())) {
												parentTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, refDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
												if (parentTypePSDEField != null) {
													strParentType = iPSDERCustom.getParentType();
													if (!StringUtils.hasLength(strParentType)) {
														// strParentType =
														// this.getName();
														strParentType = this.getDERParentType();
													}
												}
												parentNamePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTNAME, true);
												parentSubTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
												if (parentSubTypePSDEField != null) {
													strParentSubType = iPSDERCustom.getParentSubType();
													if (!StringUtils.hasLength(strParentSubType)) {
														strParentSubType = iPSDERBase.getMinorCodeName();
													}
												}
											}
										}
									}

									refDataEntityRuntime.fillNestedEntitiesOrderValue(arg0, minorEntities, iPSDERBase, iDynaInstRuntime);
									// IPSDEField orderValuePSDEField =
									// refDataEntityRuntime.getOrderValuePSDEField();
									// int nOrderValue = 1;

									// 填充外键
									for (IEntityBase item : minorEntities) {

										if (pickupPSDEField != null && parentId != null) {
											refDataEntityRuntime.setFieldValue(item, pickupPSDEField, parentId);
										}

										// if(orderValuePSDEField!=null) {
										// refDataEntityRuntime.setFieldValue((IEntity)
										// item, orderValuePSDEField,
										// nOrderValue);
										// nOrderValue ++;
										// }

										if (parentNamePSDEField != null) {
											refDataEntityRuntime.setFieldValue(item, parentNamePSDEField, parentName);
										}

										if (parentTypePSDEField != null) {
											refDataEntityRuntime.setFieldValue(item, parentTypePSDEField, strParentType);
										}

										if (parentSubTypePSDEField != null) {
											refDataEntityRuntime.setFieldValue(item, parentSubTypePSDEField, strParentSubType);
										}

										Object objKey = refDataEntityRuntime.getFieldValue(item, refDataEntityRuntime.getKeyPSDEField());
										if (ObjectUtils.isEmpty(objKey)) {
											refDataEntityRuntime.fillEntityKeyValue(item);
										}
									}

									refDataEntityRuntime.checkNestedEntities(arg0, minorEntities, iDynaInstRuntime);
								}

							} else {

								if (iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupObjectDEField) {
									continue;
								}

								if (!(dtoData instanceof IEntityBase)) {
									throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
								}

								refDataEntityRuntime.checkNestedEntities(arg0, new IEntityBase[] { (IEntityBase) dtoData }, iDynaInstRuntime);
							}
						}
					}
				}
			}
		}

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.checkEntityNestedDERsBeforeProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void translateEntityNestedDERsAfterProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			return;
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iEntityDTO.getDEMethodDTORuntime() != null) {
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if (!ObjectUtils.isEmpty(psDEMethodDTOFieldList)) {
				for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
						this.translateEntityNestedDERAfterProceed(iEntityDTO, iPSDEMethodDTOField, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
					}
				}
			}
		}

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.translateEntityNestedDERsAfterProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	protected void translateEntityNestedDERAfterProceed(IEntityDTO iEntityDTO, IPSDEMethodDTOField iPSDEMethodDTOField, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (iPSDEMethodDTOField.getRefPSDataEntity() == null) {
			return;
		}

		// 查出原有数据
		IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
		if (refDataEntityRuntime.getStorageMode() == DEStorageModes.NONE && refDataEntityRuntime.getVirtualMode() != DEVirtualModes.MINHERIT) {
			// //判断是否物理化
			return;
		}

		// 同一外部服务接口，忽略
		if (this.getStorageMode() == DEStorageModes.SERVICEAPI && refDataEntityRuntime.getStorageMode() == DEStorageModes.SERVICEAPI) {
			if (this.getSubSysServiceAPIRuntime() == refDataEntityRuntime.getSubSysServiceAPIRuntime()) {
				return;
			}
		}

		if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) && iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupObjectDEField) {

			IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField) iPSDEMethodDTOField.getPSDEField();
			IPSDERBase iPSDERBase = iPSPickupObjectDEField.getPSDERMust();
			// 从实体中获取指定关系的属性
			IPSDEField pickupPSDEField = null;
			IPSDEDataSet refPSDEDataSet = null;
			if (iPSDERBase instanceof IPSDER1N) {
				pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
				refPSDEDataSet = ((IPSDER1N) iPSDERBase).getRefPSDEDataSet();
			} else if (iPSDERBase instanceof IPSDERCustom) {
				pickupPSDEField = ((IPSDERCustom) iPSDERBase).getPickupPSDEField();
				refPSDEDataSet = ((IPSDERCustom) iPSDERBase).getRefPSDEDataSet();
			}
			if (pickupPSDEField == null) {
				// throw new DataEntityRuntimeException(this,
				// iEntityDTO.getDEMethodDTORuntime(),
				// String.format("属性[%1$s]没有定义DTO连接属性",
				// iPSDEMethodDTOField.getName()));
				log.warn(String.format("属性[%1$s]没有定义DTO连接属性，忽略默认处理", iPSDEMethodDTOField.getName()));
				return;
			}

			Object objKeyValue = iEntityDTO.get(pickupPSDEField.getLowerCaseName());
			if (ObjectUtils.isEmpty(objKeyValue)) {
				return;
			}

			ISearchContextDTO iSearchContextDTO = refDataEntityRuntime.createSearchContext();
			iSearchContextDTO.count(false).limit(1);
			refDataEntityRuntime.setSearchCondition(iSearchContextDTO, refDataEntityRuntime.getKeyPSDEField(), Conditions.EQ, objKeyValue);
			List<IEntityDTO> lastList = null;
			if (refPSDEDataSet != null) {
				lastList = refDataEntityRuntime.selectDataSet(refPSDEDataSet, iSearchContextDTO);
			} else {
				lastList = refDataEntityRuntime.select(iSearchContextDTO);
			}

			if (!ObjectUtils.isEmpty(lastList)) {
				iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), lastList.get(0));
			} else {
				iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), null);
			}

			return;
		}

		// 找到外键
		IPSDEField relatedPickupPSDEField = null;
		IPSDERBase relatedPSDERBase = null;
		IPSDEField pickupPSDEField = null;
		IPSDEField parentTypePSDEField = null;
		IPSDEField parentSubTypePSDEField = null;

		String strParentSubType = null;
		String strParentType = null;

		IPSDEDataSet nestedPSDEDataSet = null;
		IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
		if (iPSDERBase == null) {
			if (iPSDEMethodDTOField.getRelatedPSDEMethodDTOField() != null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER() != null) {
				iPSDERBase = iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER();
				if (iPSDEMethodDTOField.getPSDEField() instanceof IPSLinkDEField) {
					relatedPSDERBase = ((IPSLinkDEField) iPSDEMethodDTOField.getPSDEField()).getPSDER();
					if (relatedPSDERBase instanceof IPSDER1NBase) {
						IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) relatedPSDERBase;
						relatedPickupPSDEField = iPSDER1NBase.getPickupPSDEFieldMust();
					}
				}
			}
			if (iPSDEMethodDTOField.getPSDEField() != null && DEFDataTypes.INHERIT.equals(iPSDEMethodDTOField.getPSDEField().getDataType()) && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField() != null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER() != null) {
				iPSDERBase = iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER();
			}
		}

		if (iPSDERBase == null) {
			return;
		}
		if (iPSDERBase instanceof IPSDER1N) {
			pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
			nestedPSDEDataSet = ((IPSDER1N) iPSDERBase).getNestedPSDEDataSet();
		} else if (iPSDERBase instanceof IPSDERCustom) {
			IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
			pickupPSDEField = iPSDERCustom.getPickupPSDEField();
			nestedPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
			if (refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType())) {
				parentTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, refDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
				if (parentTypePSDEField != null) {
					strParentType = iPSDERCustom.getParentType();
					if (!StringUtils.hasLength(strParentType)) {
						// strParentType = this.getName();
						strParentType = this.getDERParentType();
					}
				}
				parentSubTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
				if (parentSubTypePSDEField != null) {
					strParentSubType = iPSDERCustom.getParentSubType();
					if (!StringUtils.hasLength(strParentSubType)) {
						strParentSubType = iPSDERBase.getMinorCodeName();
					}
				}
			}
		}
		if (pickupPSDEField == null) {
			if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType())) {
				pickupPSDEField = refDataEntityRuntime.getKeyPSDEField();
			} else {
				// throw new DataEntityRuntimeException(this,
				// iEntityDTO.getDEMethodDTORuntime(),
				// String.format("属性[%1$s]没有定义DTO连接属性",
				// iPSDEMethodDTOField.getName()));
				log.warn(String.format("属性[%1$s]没有定义DTO连接属性，忽略默认处理", iPSDEMethodDTOField.getName()));
				return;
			}
		}
		Object objKeyValue = iEntityDTO.get(getKeyPSDEField().getLowerCaseName());

		// 重新计算外键
		if (relatedPickupPSDEField != null) {
			objKeyValue = iEntityDTO.get(relatedPickupPSDEField.getLowerCaseName());
		}

		ISearchContextDTO iSearchContextDTO = refDataEntityRuntime.createSearchContext();
		iSearchContextDTO.all().count(false);
		refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, objKeyValue);
		if (parentTypePSDEField != null) {
			refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
		}
		if (parentSubTypePSDEField != null) {
			if (StringUtils.hasLength(strParentSubType)) {
				refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
			} else {
				refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
			}
		}

		// 设置排序信息
		IPSDEField orderValuePSDEField = refDataEntityRuntime.getOrderValuePSDEField();
		if (orderValuePSDEField != null) {
			refDataEntityRuntime.setSearchSort(iSearchContextDTO, orderValuePSDEField, SortDir.ASC.value);
		}
		List<IEntityDTO> lastList = null;
		if (nestedPSDEDataSet != null) {
			lastList = refDataEntityRuntime.selectDataSet(nestedPSDEDataSet, iSearchContextDTO);
		} else {
			lastList = refDataEntityRuntime.select(iSearchContextDTO);
		}

		if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
			if (iPSDEMethodDTOField.isListMap()) {
				if (!ObjectUtils.isEmpty(lastList)) {
					String strKeyName = "name";
					if (refDataEntityRuntime.getKeyNamePSDEField() != null) {
						strKeyName = refDataEntityRuntime.getKeyNamePSDEField().getLowerCaseName();
					}

					Map map = new LinkedHashMap();
					for (IEntityDTO item : lastList) {
						Object key = item.get(strKeyName);
						if (ObjectUtils.isEmpty(key)) {
							throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]成员数据未提供键名[%2$s]", iPSDEMethodDTOField.getName(), strKeyName));
						}

						if (map.containsKey(key)) {
							throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]成员数据键名[%2$s]重复", iPSDEMethodDTOField.getName(), key));
						} else {
							map.put(key, item);
						}
					}

					iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), map);
				} else {
					iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), null);
				}
			} else {
				iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), lastList);
			}

		} else {
			if (!ObjectUtils.isEmpty(lastList)) {
				iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), lastList.get(0));
			} else {
				iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), null);
			}
		}
	}

	@Override
	protected void checkEntityAfterProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.checkEntityAfterProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = (IEntityDTO) arg0;
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.checkEntityAfterProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void translateEntityAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.translateEntityAfterProceed(arg0, objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (objRet instanceof IEntityDTO || arg0 instanceof IEntityDTO)) {
			IEntityDTO iEntityDTO = null;
			if (objRet instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO) objRet;
			} else {
				iEntityDTO = (IEntityDTO) arg0;
			}
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.translateEntityAfterProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void translateEntityAfterProceed(Object arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.translateEntityAfterProceed(arg0, strDataSetName, iPSDEDataSet, iPSDataEntity, iDynaInstRuntime, actionData);

	}

	@Override
	protected void translateEntityAfterProceed(Object arg0, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.translateEntityAfterProceed(arg0, strDataQueryName, iPSDEDataQuery, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	protected void translateEntitiesAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.translateEntitiesAfterProceed(arg0, list, strDataQueryName, iPSDEDataQuery, iPSDataEntity, iDynaInstRuntime, actionData);

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && !ObjectUtils.isEmpty(list) && (arg0 instanceof ISearchContextDTO) && list.get(0) instanceof IEntityDTO) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.translateEntitiesAfterProceed(this.getDataEntityRuntimeContext(), (ISearchContextDTO) arg0, (List<? extends IEntityDTO>) list, strDataQueryName, iPSDEDataQuery);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}

	}

	@Override
	protected void translateEntitiesAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.translateEntitiesAfterProceed(arg0, list, strDataSetName, iPSDEDataSet, iPSDataEntity, iDynaInstRuntime, actionData);

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && !ObjectUtils.isEmpty(list) && (arg0 instanceof ISearchContextDTO) && list.get(0) instanceof IEntityDTO) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.translateEntitiesAfterProceed(this.getDataEntityRuntimeContext(), (ISearchContextDTO) arg0, (List<? extends IEntityDTO>) list, strDataSetName, iPSDEDataSet);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected boolean isEnableBPMNExecuteMode() {
		return false;
	}

	@Override
	protected boolean onExecuteActionLogic(IEntityBase arg0, IPSDEActionLogic iPSDEActionLogic, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this, String.format("无法执行行为附加逻辑，传入参数[%1$s]类型不正确", arg0));
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		try {
			ActionSessionManager.getCurrentSession().beginLog(this.getName(), String.format("%1$s[%2$s]", strAttachMode, iPSDEActionLogic.getName()));

			boolean bRet = this.onExecuteActionLogicReal(iEntityDTO, iPSDEActionLogic, iPSDEAction, strAttachMode, iDynaInstRuntime, actionData);

			ActionSessionManager.getCurrentSession().endLog(null);
			return bRet;
		} catch (Throwable ex) {
			if (!iPSDEActionLogic.isIgnoreException()) {
				throw ex;
			} else {
				ActionSessionManager.getCurrentSession().endLog(String.format("忽略异常：%1$s", ex.getMessage()), true, ex);
				this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEACTION, String.format("实体[%1$s]行为[%2$s]附加逻辑[%3$s]发生异常，%4$s", this.getName(), iPSDEAction.getName(), iPSDEActionLogic.getName(), ex.getMessage()), ex);
				log.error(String.format("实体[%1$s]行为[%2$s]附加逻辑[%3$s]发生异常，%4$s", this.getName(), iPSDEAction.getName(), iPSDEActionLogic.getName(), ex.getMessage()), ex);
			}
		}

		return true;

	}

	protected boolean onExecuteActionLogicReal(IEntityDTO iEntityDTO, IPSDEActionLogic iPSDEActionLogic, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		boolean bCloneParam = iPSDEActionLogic.isCloneParam();

		IDEActionLogicRuntime iDEActionLogicRuntime = this.getDEActionLogicRuntime(iPSDEActionLogic);
		if (iDEActionLogicRuntime != null) {
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) this.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = this.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}

			iDEActionLogicRuntime.execute(iEntityDTO);
			return true;
		}

		int nActionLogicType = iPSDEActionLogic.getActionLogicType();
		if (nActionLogicType == DEActionLogicTypes.EXTERNAL) {

			// 直接调用外部行为
			IDataEntityRuntime dstDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());
			IPSDEAction dstPSDEAction = iPSDEActionLogic.getDstPSDEActionMust();
			IPSDEMethodDTO dstPSDEMethodDTO = null;
			if (!DEMethodInputTypes.DTO.equals(dstPSDEAction.getPSDEActionInputMust().getType())) {
				// throw new DataEntityRuntimeException(this,
				// String.format("实体[%1$s]行为[%2$s]输入类型必须为[DTO]",
				// dstDataEntityRuntime.getName(), dstPSDEAction.getName()));
				throw new Exception(String.format("实体[%1$s]行为[%2$s]输入类型必须为[DTO]", dstDataEntityRuntime.getName(), dstPSDEAction.getName()));
			}
			dstPSDEMethodDTO = dstPSDEAction.getPSDEActionInput().getPSDEMethodDTOMust();
			if (!bCloneParam) {
				if (!this.getId().equals(iPSDEActionLogic.getDstPSDEMust().getId())) {
					bCloneParam = true;
				} else {
					// 判断行为使用的DTO是否一致
					if (iEntityDTO.getDEMethodDTORuntime() == null || iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() == null || !(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getId().equals(dstPSDEMethodDTO.getId()))) {
						bCloneParam = true;
					}
				}
			}
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				dstEntityDTO = (IEntityDTO) dstDataEntityRuntime.getDEMethodDTO(dstPSDEMethodDTO, null);
				iEntityDTO.copyTo(dstEntityDTO);
			} else {
				dstEntityDTO = iEntityDTO;
			}

			dstDataEntityRuntime.executeAction(dstPSDEAction.getName(), dstPSDEAction, new Object[] { dstEntityDTO });
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.INTERNAL) {
			if (iPSDEActionLogic.getPSDELogic() != null && iPSDEActionLogic.getPSDELogic().isCustomCode()) {
				if (StringUtils.hasLength(iPSDEActionLogic.getPSDELogic().getScriptCode())) {
					IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getPSDELogic().getScriptCode(), iDynaInstRuntime != null);
					if (iDEScriptActionRuntime == null) {
						iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getPSDELogic().getScriptCode());
					}
					iDEScriptActionRuntime.execute(new Object[] { iEntityDTO });
				}
			} else {
				IDELogicRuntime iDELogicRuntime = null;
				if (iDynaInstRuntime == null) {
					iDELogicRuntime = this.getDELogicRuntime(iPSDEActionLogic.getPSDELogicMust());
				} else {
					iDELogicRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDELogicRuntime(iPSDEActionLogic.getPSDELogicMust());
				}

				IEntityDTO dstEntityDTO = null;
				if (bCloneParam) {
					if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
						dstEntityDTO = (IEntityDTO) this.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
						iEntityDTO.copyTo(dstEntityDTO);
					} else {
						dstEntityDTO = this.createEntity();
						iEntityDTO.copyTo(dstEntityDTO);
					}
				} else {
					dstEntityDTO = iEntityDTO;
				}

				iDELogicRuntime.execute(new Object[] { dstEntityDTO });

			}
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.DSTDELOGIC) {
			IDataEntityRuntime dstDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());

			if (!bCloneParam) {
				net.ibizsys.central.dataentity.logic.IDELogicRuntime dstDELogicRuntime = dstDataEntityRuntime.getDELogicRuntime(iPSDEActionLogic.getDstPSDELogicMust());
				IDELogicParamRuntime iDELogicParamRuntime = dstDELogicRuntime.getDefaultDELogicParamRuntime();
				if (iDELogicParamRuntime != null) {
					if (iDELogicParamRuntime.getDataEntityRuntime() != null && !iDELogicParamRuntime.getDataEntityRuntime().getId().equals(this.getId())) {
						bCloneParam = true;
					}
				}
			}

			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (dstDataEntityRuntime.getId().equals(this.getId())) {
					if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
						dstEntityDTO = (IEntityDTO) this.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
						iEntityDTO.copyTo(dstEntityDTO);
					} else {
						dstEntityDTO = this.createEntity();
						iEntityDTO.copyTo(dstEntityDTO);
					}
				} else {
					dstEntityDTO = dstDataEntityRuntime.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}
			// 直接调用外部处理逻辑
			dstDataEntityRuntime.executeLogic(iPSDEActionLogic.getDstPSDELogicMust(), new Object[] { dstEntityDTO });
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.SCRIPT) {
			if (StringUtils.hasLength(iPSDEActionLogic.getScriptCode())) {
				IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getScriptCode(), iDynaInstRuntime != null);
				if (iDEScriptActionRuntime == null) {
					iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getScriptCode());
				}

				IEntityDTO dstEntityDTO = null;
				if (bCloneParam) {
					if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
						dstEntityDTO = (IEntityDTO) this.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
						iEntityDTO.copyTo(dstEntityDTO);
					} else {
						dstEntityDTO = this.createEntity();
						iEntityDTO.copyTo(dstEntityDTO);
					}
				} else {
					dstEntityDTO = iEntityDTO;
				}

				iDEScriptActionRuntime.execute(new Object[] { dstEntityDTO });
			}
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.NOTIFY) {
			IPSDENotify iPSDENotify = iPSDEActionLogic.getPSDENotifyMust();
			IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
			if (iDynaInstRuntime != null) {
				iDynaInstDataEntityRuntime = (IDynaInstDataEntityRuntime) iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
			}
			IDENotifyRuntime iDENotifyRuntime = (iDynaInstDataEntityRuntime != null) ? iDynaInstDataEntityRuntime.getDENotifyRuntime(iPSDENotify) : this.getDENotifyRuntime(iPSDENotify);

			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) this.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = this.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}

			if (iDENotifyRuntime instanceof net.ibizsys.central.dataentity.notify.IDENotifyRuntime) {
				Map<String, Object> notifyParams = new LinkedHashMap<String, Object>();
				notifyParams.put(ISysMsgTemplRuntime.TEMPLPARAM_LAST, this.getLastEntity());
				((net.ibizsys.central.dataentity.notify.IDENotifyRuntime) iDENotifyRuntime).send(dstEntityDTO, notifyParams);
			} else {
				iDENotifyRuntime.send(dstEntityDTO);
			}

			return true;
		}

		// if (nActionLogicType == DEActionLogicTypes.FILLMAINSTATE) {
		// IPSDEMainState iPSDEMainState =
		// iPSDEActionLogic.getPSDEMainStateMust();
		// List<IPSDEMainStateField> psDEMainStateFieldList =
		// iPSDEMainState.getPSDEMainStateFields();
		// if(!ObjectUtils.isEmpty(psDEMainStateFieldList)) {
		// for(IPSDEMainStateField iPSDEMainStateField : psDEMainStateFieldList)
		// {
		// if(iPSDEMainStateField.isAllowMode()) {
		//
		// String strDefaultValueType =
		// iPSDEMainStateField.getDefaultValueType();
		//
		//
		// }
		// else {
		// iEntityDTO.reset(iPSDEMainStateField.getPSDEFieldMust().getLowerCaseName());
		// }
		// }
		// }
		//
		// return true;
		// }

		if (nActionLogicType == DEActionLogicTypes.DATASYNC) {
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) this.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = this.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}
			this.getDEDataSyncOutRuntime(iPSDEActionLogic.getPSDEDataSyncMust()).sendDirect(iPSDEActionLogic.getDataSyncEvent(), dstEntityDTO);
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.DSTDATAACTION) {
			Object objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
			IPSDERBase iPSDERBase = iPSDEActionLogic.getMajorPSDERMust();
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());

			IPSDEDataSet minorPSDEDataSet = null;
			String strPickupFieldName = null;
			if (iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				minorPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
				strPickupFieldName = iPSDER1N.getPSPickupDEFieldMust().getLowerCaseName();
			} else if (iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				minorPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
				if (iPSDERCustom.getPickupPSDEField() != null) {
					strPickupFieldName = iPSDERCustom.getPickupPSDEField().getLowerCaseName();
				}
			}
			if (minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if (minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO() != null) {
				iSearchContextDTO = (ISearchContextDTO) minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			} else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(this.getKeyPSDEField().getLowerCaseName(), objKey);
			if (StringUtils.hasLength(strPickupFieldName)) {
				iSearchContextDTO.eq(strPickupFieldName, objKey);
			}
			iSearchContextDTO.all().count(false);
			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if (!ObjectUtils.isEmpty(entityDTOList)) {
				for (IEntityDTO dstEntity : entityDTOList) {
					minorDataEntityRuntime.executeAction(iPSDEActionLogic.getDstPSDEActionMust().getName(), iPSDEActionLogic.getDstPSDEActionMust(), new Object[] { dstEntity });
				}
			}
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.DSTDATAACTION2) {
			Object objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());
			IPSDEDataSet minorPSDEDataSet = iPSDEActionLogic.getDstPSDEDataSetMust();

			if (minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if (minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO() != null) {
				iSearchContextDTO = (ISearchContextDTO) minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			} else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(this.getKeyPSDEField().getLowerCaseName(), objKey);

			iSearchContextDTO.all().count(false);
			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if (!ObjectUtils.isEmpty(entityDTOList)) {
				for (IEntityDTO dstEntity : entityDTOList) {
					minorDataEntityRuntime.executeAction(iPSDEActionLogic.getDstPSDEActionMust().getName(), iPSDEActionLogic.getDstPSDEActionMust(), new Object[] { dstEntity });
				}
			}
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.SYSLOGIC) {
			IEntityDTO dstEntityDTO = null;
			if (bCloneParam) {
				if (iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO() != null) {
					dstEntityDTO = (IEntityDTO) this.getDEMethodDTO(iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO(), null);
					iEntityDTO.copyTo(dstEntityDTO);
				} else {
					dstEntityDTO = this.createEntity();
					iEntityDTO.copyTo(dstEntityDTO);
				}
			} else {
				dstEntityDTO = iEntityDTO;
			}
			this.getSystemRuntime().getSysLogicRuntime(iPSDEActionLogic.getPSSysLogicMust()).execute(dstEntityDTO);
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.SYSTRANSLATOR) {
			String strFieldName = iPSDEActionLogic.getPSDEFieldMust().getLowerCaseName();
			if (iEntityDTO.contains(strFieldName)) {
				Object value = iEntityDTO.get(strFieldName);
				// 目前按照输入模式处理
				value = this.getSystemRuntime().getSysTranslatorRuntime(iPSDEActionLogic.getPSSysTranslatorMust()).translate(value, true, iEntityDTO, iPSDEActionLogic.getPSDEFieldMust(), this);
				iEntityDTO.set(strFieldName, value);
			}
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.SYSSEQUENCE) {
			String strFieldName = iPSDEActionLogic.getPSDEFieldMust().getLowerCaseName();
			Object value = this.getSystemRuntime().getSysSequenceRuntime(iPSDEActionLogic.getPSSysSequenceMust()).get(iEntityDTO, iPSDEActionLogic.getPSDEFieldMust(), this);
			iEntityDTO.set(strFieldName, value);
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKDEFVALUERULE) {
			String strFieldName = iPSDEActionLogic.getPSDEFieldMust().getLowerCaseName();
			if (iEntityDTO.contains(strFieldName)) {
				Object value = iEntityDTO.get(strFieldName);
				EntityError entityError = new EntityError();
				this.checkFieldValueRule(value, iEntityDTO, iPSDEActionLogic.getPSDEFValueRuleMust(), iPSDEActionLogic.getPSDEFieldMust(), this.getPSDataEntity(), entityError);
				if (entityError.hasError()) {
					throw new EntityException(entityError, this);
				}
			}
			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKMAINSTATE || nActionLogicType == DEActionLogicTypes.CHECKNOTMAINSTATE) {

			Object objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
			IPSDEMainState lastPSDEMainState = this.getPSDEMainState(objKey);
			if (!StringUtils.hasLength(iPSDEActionLogic.getPSDEMainStateMust().getMSTag())) {
				throw new Exception(String.format("主状态[%1$s]未指定标记", iPSDEActionLogic.getPSDEMainStateMust().getName()));
			}

			int nErrorCode = iPSDEActionLogic.getErrorCode();
			if (nErrorCode == Errors.OK) {
				nErrorCode = Errors.INPUTERROR;
			}
			EntityError entityError = new EntityError();
			String strErrorInfo = iPSDEActionLogic.getErrorInfo();
			String strErrorLanResTag = null;
			if (iPSDEActionLogic.getErrorInfoPSLanguageRes() != null) {
				strErrorLanResTag = iPSDEActionLogic.getErrorInfoPSLanguageRes().getLanResTag();
			}

			if (nActionLogicType == DEActionLogicTypes.CHECKMAINSTATE) {
				if (lastPSDEMainState == null || !iPSDEActionLogic.getPSDEMainStateMust().getMSTag().equals(lastPSDEMainState.getMSTag())) {
					if (!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = String.format("数据不处在主状态[%1$s]", iPSDEActionLogic.getPSDEMainStateMust().getName());
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			} else if (nActionLogicType == DEActionLogicTypes.CHECKNOTMAINSTATE) {
				if (lastPSDEMainState != null && iPSDEActionLogic.getPSDEMainStateMust().getMSTag().equals(lastPSDEMainState.getMSTag())) {
					if (!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = String.format("数据已处在主状态[%1$s]", iPSDEActionLogic.getPSDEMainStateMust().getName());
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}

			if (entityError.hasError()) {
				throw new EntityException(entityError, this);
			}

			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS || nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS) {

			Object objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
			IPSDERBase iPSDERBase = iPSDEActionLogic.getMajorPSDERMust();
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());

			IPSDEDataSet minorPSDEDataSet = null;
			String strPickupFieldName = null;
			if (iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				minorPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
				strPickupFieldName = iPSDER1N.getPSPickupDEFieldMust().getLowerCaseName();
			} else if (iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				minorPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
				if (iPSDERCustom.getPickupPSDEField() != null) {
					strPickupFieldName = iPSDERCustom.getPickupPSDEField().getLowerCaseName();
				}
			}
			if (minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if (minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO() != null) {
				iSearchContextDTO = (ISearchContextDTO) minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			} else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(this.getKeyPSDEField().getLowerCaseName(), objKey);
			if (StringUtils.hasLength(strPickupFieldName)) {
				iSearchContextDTO.eq(strPickupFieldName, objKey);
			}
			iSearchContextDTO.limit(1).count(false);

			int nErrorCode = iPSDEActionLogic.getErrorCode();
			if (nErrorCode == Errors.OK) {
				nErrorCode = Errors.INPUTERROR;
			}
			EntityError entityError = new EntityError();
			String strErrorInfo = iPSDEActionLogic.getErrorInfo();
			String strErrorLanResTag = null;
			if (iPSDEActionLogic.getErrorInfoPSLanguageRes() != null) {
				strErrorLanResTag = iPSDEActionLogic.getErrorInfoPSLanguageRes().getLanResTag();
			}

			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if (!ObjectUtils.isEmpty(entityDTOList)) {
				if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS) {
					if (!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据已存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			} else {
				if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS) {
					if (!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据不存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}
			if (entityError.hasError()) {
				throw new EntityException(entityError, this);
			}

			return true;
		}

		if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS2 || nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS2) {

			Object objKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
			IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEActionLogic.getDstPSDEMust().getId());
			IPSDEDataSet minorPSDEDataSet = iPSDEActionLogic.getDstPSDEDataSetMust();

			if (minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}
			ISearchContextDTO iSearchContextDTO = null;
			if (minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO() != null) {
				iSearchContextDTO = (ISearchContextDTO) minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
			} else {
				iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
			}

			iSearchContextDTO.set(this.getKeyPSDEField().getLowerCaseName(), objKey);
			iSearchContextDTO.limit(1).count(false);

			int nErrorCode = iPSDEActionLogic.getErrorCode();
			if (nErrorCode == Errors.OK) {
				nErrorCode = Errors.INPUTERROR;
			}
			EntityError entityError = new EntityError();
			String strErrorInfo = iPSDEActionLogic.getErrorInfo();
			String strErrorLanResTag = null;
			if (iPSDEActionLogic.getErrorInfoPSLanguageRes() != null) {
				strErrorLanResTag = iPSDEActionLogic.getErrorInfoPSLanguageRes().getLanResTag();
			}

			List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
			if (!ObjectUtils.isEmpty(entityDTOList)) {
				if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATANOTEXISTS2) {
					if (!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据已存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			} else {
				if (nActionLogicType == DEActionLogicTypes.CHECKDSTDATAEXISTS2) {
					if (!StringUtils.hasLength(strErrorInfo)) {
						strErrorInfo = "目标数据不存在";
					}
					entityError.register(null, null, null, nErrorCode, strErrorInfo);
				}
			}
			if (entityError.hasError()) {
				throw new EntityException(entityError, this);
			}

			return true;
		}

		return super.onExecuteActionLogic(iEntityDTO, iPSDEActionLogic, iPSDEAction, strAttachMode, iDynaInstRuntime, actionData);
	}

	@Override
	protected void fillEntityDefaultValues(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.fillEntityDefaultValues(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = (IEntityDTO) arg0;
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.fillEntityDefaultValues(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void fillEntitySequenceValues(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.fillEntitySequenceValues(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = (IEntityDTO) arg0;
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.fillEntitySequenceValues(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void checkReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.checkReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);

		final List<IDERRuntimeBase> derRuntimeBaseList = this.getDERRuntimeBases();
		if (!ObjectUtils.isEmpty(derRuntimeBaseList)) {
			for (IDERRuntimeBase iDERRuntimeBase : derRuntimeBaseList) {
				this.checkReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iDERRuntimeBase, actionData);
			}
		}

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.checkReferenceBeforeRemove(this.getDataEntityRuntimeContext(), arg0, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	protected void checkReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IDERRuntimeBase iDERRuntimeBase, Object actionData) throws Throwable {

	}

	@Override
	protected void buildParentPathBeforeProceed(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.buildParentPathBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = (IEntityDTO) arg0;
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.buildParentPathBeforeProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void checkEntityBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.checkEntityBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = (IEntityDTO) arg0;
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.checkEntityBeforeProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected void buildParentPathAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.buildParentPathAfterProceed(arg0, objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList) && (objRet instanceof IEntityDTO || arg0 instanceof IEntityDTO)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				IEntityDTO iEntityDTO = null;
				if (objRet instanceof IEntityDTO) {
					iEntityDTO = (IEntityDTO) objRet;
				} else {
					iEntityDTO = (IEntityDTO) arg0;
				}

				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.buildParentPathAfterProceed(this.getDataEntityRuntimeContext(), iEntityDTO, strActionName, iPSDEAction);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	@Override
	protected Object onExecuteActionUnknown(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					if (iDataEntityInheritLogic.isEnableAction(this.getDataEntityRuntimeContext(), strActionName, iPSDEAction, args)) {
						return iDataEntityInheritLogic.executeAction(this.getDataEntityRuntimeContext(), strActionName, iPSDEAction, args);
					}
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
		return super.onExecuteActionUnknown(strActionName, iPSDEAction, args, actionData);
	}

	@Override
	protected Object onExecuteDELogic(Object arg0, IPSDEAction iPSDEAction, IPSDELogic iPSDELogic, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		IDELogicRuntime iDELogicRuntime = null;
		if (iDynaInstRuntime == null) {
			iDELogicRuntime = this.getDELogicRuntime(iPSDELogic);
		} else {
			iDELogicRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDELogicRuntime(iPSDELogic);
		}
		return iDELogicRuntime.execute(new Object[] { arg0 });
	}

	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime(IEntityBase iEntityBase, boolean bModuleInst) {
		if (this.getDynaInstMode() != DynaInstModes.DISABLE) {
			String strDynainstid = getDynaInstId(iEntityBase);
			if (StringUtils.hasLength(strDynainstid)) {
				IDynaInstRuntime iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynainstid);
				if (bModuleInst && this.getDynaInstMode() == DynaInstModes.ENABLEINST) {
					// 计算对应的实例
					IUserContext iUserContext = null;
					if (ActionSessionManager.getCurrentSession() != null) {
						iUserContext = ActionSessionManager.getCurrentSession().getUserContext();
					}
					if (iUserContext == null) {
						iUserContext = this.getUserContext();
					}
					if (iUserContext != null) {
						Object objDataType = null;
						if (StringUtils.hasLength(this.getDynaInstTag()) && StringUtils.hasLength(iUserContext.getDynainsttag()) && StringUtils.hasLength(iUserContext.getDynainsttag2()) && this.getDynaInstTag().equals(iUserContext.getDynainsttag())) {
							try {
								objDataType = this.getSystemRuntime().convertValue(this.getDataTypePSDEField().getStdDataType(), iUserContext.getDynainsttag2());
							} catch (Exception ex) {
								throw new DataEntityRuntimeException(this, String.format("转化动态实例标记值2发生异常，%2$s", ex.getMessage()), ex);
							}
						}
						if (objDataType != null) {
							String strChildDynaInstId = iDynaInstRuntime.getChildDynaInstId(this.getDynaInstTag(), objDataType.toString());
							if (StringUtils.hasLength(strChildDynaInstId)) {
								iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strChildDynaInstId);
							}
						}
					}

				}
				if (iDynaInstRuntime != null) {
					return (IDynaInstDataEntityRuntime) iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		return null;
	}

	@Override
	public boolean isEnableDEService() {
		return this.bEnableDEService;
	}

	@Override
	protected int onGetStorageMode() throws Exception {
		if (this.getSystemModuleUtilRuntime() != null) {
			return this.getSystemModuleUtilRuntime().getStorageMode(this.getPSDataEntity());
		}
		return this.getSystemRuntimeContext().getStorageMode(this.getPSDataEntity());
	}

	@Override
	protected Object onExecuteAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {

		// 判断输入是否为列表（LIST），如列表则循环处理
		if (args != null && args.length > 0 && args[0] instanceof List) {

			if (iPSDEAction != null) {
				// 判断是否仅支持批处理
				if (iPSDEAction.getBatchActionMode() == DEActionBatchMode.BATCHONLY.value || iPSDEAction.getBatchActionMode() == DEActionBatchMode.BATCHONLYEX.value) {

					IDEMapRuntime iDEMapRuntime = this.getDEMapRuntime(strActionName, iPSDEAction, PSModelEnums.DEMapObjectMapMode.DEFAULT.value);
					if (iDEMapRuntime != null) {
						log.debug(String.format("使用实体映射[%1$s]处理行为[%2$s]", iDEMapRuntime.getName(), (iPSDEAction != null ? iPSDEAction.getName() : strActionName)));
						return iDEMapRuntime.executeAction(strActionName, iPSDEAction, args, null);
					}

					// 获取是否有插件
					IDEActionPluginRuntime iDEActionPluginRuntime = this.getDEActionPluginRuntime(iPSDEAction);
					if (iDEActionPluginRuntime != null) {
						return iDEActionPluginRuntime.execute(this.getDataEntityRuntimeContext(), iPSDEAction, args, actionData);
					}

					IDEActionRuntime iDEActionRuntime = this.getDEActionRuntime(iPSDEAction);
					if (iDEActionRuntime != null && iDEActionRuntime.isValid(args)) {
						return iDEActionRuntime.execute(args);
					}

					if (iPSDEAction.isAsyncAction()) {
						IPSDEAction realPSDEAction = iPSDEAction.getRealPSDEAction();
						if (realPSDEAction != null) {

							if (DEMethodReturnTypes.SSE.equals(realPSDEAction.getPSDEActionReturnMust().getType())) {
								return this.getSystemRuntime().sseExecute(new INamedAction() {

									@Override
									public Object execute(Object[] args) throws Throwable {
										return executeAction(realPSDEAction.getName(), realPSDEAction, args);
									}

									@Override
									public String getName() {
										if (StringUtils.hasLength(realPSDEAction.getLogicName())) {
											return realPSDEAction.getLogicName();
										}
										return realPSDEAction.getName();
									}
								}, args, null, 0l);
							}

							return this.getSystemRuntime().asyncExecute(new INamedAction() {

								@Override
								public Object execute(Object[] args) throws Throwable {
									return executeAction(realPSDEAction.getName(), realPSDEAction, args);
								}

								@Override
								public String getName() {
									if (StringUtils.hasLength(realPSDEAction.getLogicName())) {
										return realPSDEAction.getLogicName();
									}
									return realPSDEAction.getName();
								}
							}, args, null);
						}
					}

					// 判断是否为外部服务接口，如外部服务接口支持集合参数，则直接调用外部接口
					if (this.getStorageMode() == DEStorageModes.SERVICEAPI) {
						IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod = iPSDEAction.getPSSubSysServiceAPIDEMethod();
						if (iPSSubSysServiceAPIDEMethod != null) {
							String strType = iPSSubSysServiceAPIDEMethod.getPSSubSysServiceAPIMethodInputMust().getType();
							if (DEMethodInputType.DTOS.value.equals(strType) || DEMethodInputType.KEYFIELDS.value.equals(strType)) {
								return this.executeSubSysServiceAPIDEMethod(iPSSubSysServiceAPIDEMethod, iPSDEAction, args);
							}
						}
					}

					log.warn(String.format("实体行为[%1$s]仅支持批操作，但未提供自定义处理，使用常规处理", iPSDEAction.getName()));
				}
			}

			List retList = null;
			if (iPSDEAction != null && !DEMethodReturnTypes.VOID.equals(iPSDEAction.getPSDEActionReturnMust().getType())) {
				retList = new ArrayList();
			}
			List list = (List) args[0];
			for (Object item : list) {
				args[0] = item;
				Object objRet = this.onExecuteActionSingle(strActionName, iPSDEAction, args, actionData);
				if (retList != null) {
					retList.add(objRet);
				}
			}
			args[0] = list;
			return retList;
		}

		return onExecuteActionSingle(strActionName, iPSDEAction, args, actionData);
	}

	protected Object onExecuteActionSingle(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {

		IDEMapRuntime iDEMapRuntime = this.getDEMapRuntime(strActionName, iPSDEAction, PSModelEnums.DEMapObjectMapMode.DEFAULT.value);
		if (iDEMapRuntime != null) {
			log.debug(String.format("使用实体映射[%1$s]处理行为[%2$s]", iDEMapRuntime.getName(), (iPSDEAction != null ? iPSDEAction.getName() : strActionName)));
			return iDEMapRuntime.executeAction(strActionName, iPSDEAction, args, null);
		}

		if (this.isEnableVersionControl()) {
			final IDEVersionControlUtilRuntime iDEVersionControlUtilRuntime = this.getDEVersionControlUtilRuntime();
			if (iDEVersionControlUtilRuntime.isEnableAction(strActionName, iPSDEAction, args)) {
				return iDEVersionControlUtilRuntime.executeAction(strActionName, iPSDEAction, args, actionData);
			}
		} else if (this.isEnableVersionStorage()) {
			final IDEVersionStorageUtilRuntime iDEVersionStorageUtilRuntime = this.getDEVersionStorageUtilRuntime();
			if (iDEVersionStorageUtilRuntime.isEnableAction(strActionName, iPSDEAction, args)) {
				return iDEVersionStorageUtilRuntime.executeAction(strActionName, iPSDEAction, args, actionData);
			}
		}
		
		
		

		return super.onExecuteAction(strActionName, iPSDEAction, args, actionData);
	}
	
	
	protected IEntityDTO onCopy(IEntityDTO iEntityDTO) throws Throwable {
		
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		
		Object objKeyValue = this.getKeyFieldValue(iEntityDTO);
		if(ObjectUtils.isEmpty(objKeyValue)) {
			throw new Exception("传入数据键值无效");
		}
		
		IEntityDTO ret = this.get(objKeyValue);
		
		this.rebuildCopyEntityDTO(ret, true, true);
		
		java.util.List<IPSDEField> psDEFields = this.getPSDEFields(true);
		if (psDEFields != null) {
			for (IPSDEField iPSDEField : psDEFields) {
				if(iPSDEField.isKeyDEField()) {
					continue;
				}
				if(iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
					ret.set(iPSDEField.getLowerCaseName(), iEntityDTO.get(iPSDEField.getLowerCaseName()));
				}
			}
		}
		
		//进一步填充外键
		List<IPSDERBase> psDERBaseList = this.getPSDERBases(true);
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				if(!(iPSDERBase instanceof IPSDER1NBase)) {
					continue;
				}
				
				IPSDER1NBase iPSDER1NBase = (IPSDER1NBase)iPSDERBase;
				if(iPSDER1NBase.getCloneOrder() < 0) {
					continue;
				}
				
				IPSDEField pickupPSDEField = iPSDER1NBase.getPickupPSDEFieldMust();
				//IPSDEMethodDTOField field = iDEMethodDTORuntime.getPSDEMethodDTOFieldByDEField(pickupPSDEField.getName(), true);
				Object value = ret.get(pickupPSDEField.getLowerCaseName());
				
				if(value == null) {
					continue;
				}
				
				String strTag = String.format(ACTIONSESSIONPARAM_COPYSOURCE_X, iPSDER1NBase.getMajorPSDataEntityMust().getId(), value);
				Object cache = actionSession.getActionParam(strTag);
				if(cache instanceof IEntityDTO) {
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1NBase.getMajorPSDataEntityMust().getId());
					IEntityDTO cacheEntityDTO = (IEntityDTO)cache;
					ret.set(pickupPSDEField.getLowerCaseName(), majorDataEntityRuntime.getKeyFieldValue(cacheEntityDTO));
				}
			}
		}
		
		//建立新数据
		this.create(ret);
		
		Object newKeyValue = this.getKeyFieldValue(ret);
		
		//放入缓存
		String strTag = String.format(ACTIONSESSIONPARAM_COPYSOURCE_X, this.getId(), objKeyValue);
		actionSession.setActionParam(strTag, ret);
		
		//获取全部克隆关系
		List<IPSDER1NBase> clonelist = this.getClonePSDER1Ns(true);
		if(!ObjectUtils.isEmpty(clonelist)) {
			for(IPSDER1NBase iPSDERBase : clonelist) {
				IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());
				// 找到外键
				IPSDEField pickupPSDEField = null;
				IPSDEField parentTypePSDEField = null;
				IPSDEField parentSubTypePSDEField = null;

				String strParentSubType = null;
				String strParentType = null;

				IPSDEDataSet nestedPSDEDataSet = null;
				
				if (iPSDERBase instanceof IPSDER1N) {
					pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
					nestedPSDEDataSet = ((IPSDER1N) iPSDERBase).getNestedPSDEDataSet();
				} else if (iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
					pickupPSDEField = iPSDERCustom.getPickupPSDEField();
					nestedPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
					if (refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType())) {
						parentTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, refDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
						if (parentTypePSDEField != null) {
							strParentType = iPSDERCustom.getParentType();
							if (!StringUtils.hasLength(strParentType)) {
								// strParentType = this.getName();
								strParentType = this.getDERParentType();
							}
						}
						parentSubTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
						if (parentSubTypePSDEField != null) {
							strParentSubType = iPSDERCustom.getParentSubType();
							if (!StringUtils.hasLength(strParentSubType)) {
								strParentSubType = iPSDERBase.getMinorCodeName();
							}
						}
					}
				}
				if (pickupPSDEField == null) {
					throw new Exception(String.format("克隆关系[%1$s]未定义连接属性", iPSDERBase.getName()));
				}
				

				ISearchContextDTO iSearchContextDTO = refDataEntityRuntime.createSearchContext();
				iSearchContextDTO.all().count(false);
				refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, objKeyValue);
				if (parentTypePSDEField != null) {
					refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
				}
				if (parentSubTypePSDEField != null) {
					if (StringUtils.hasLength(strParentSubType)) {
						refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
					} else {
						refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
					}
				}

				// 设置排序信息
				IPSDEField orderValuePSDEField = refDataEntityRuntime.getOrderValuePSDEField();
				if (orderValuePSDEField != null) {
					refDataEntityRuntime.setSearchSort(iSearchContextDTO, orderValuePSDEField, SortDir.ASC.value);
				}
				List<IEntityDTO> lastList = null;
				if (nestedPSDEDataSet != null) {
					lastList = refDataEntityRuntime.selectDataSet(nestedPSDEDataSet, iSearchContextDTO);
				} else {
					lastList = refDataEntityRuntime.select(iSearchContextDTO);
				}
				
				if(!ObjectUtils.isEmpty(lastList)) {
					for(IEntityDTO item : lastList) {
						IEntityDTO newItem = refDataEntityRuntime.createEntity();
						newItem.set(refDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), refDataEntityRuntime.getKeyFieldValue(item));
						//newItem.set(pickupPSDEField.getLowerCaseName(), objValue);
						refDataEntityRuntime.copy(newItem);
					}
				}
			}
		}
		
		return ret;
	}

	@Override
	protected boolean isConvertDataSetSortFieldExp() {
		return false;
	}

	@Override
	public IDEDataSetRuntime createDEDataSetRuntime(IPSDEDataSet iPSDEDataSet) {

		IDEDataSetRuntime iDEDataSetRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEDataSet.getPSSysSFPlugin(), IDEDataSetRuntime.class, true);
		if (iDEDataSetRuntime != null) {
			return iDEDataSetRuntime;
		}

		if (this.getSystemModuleUtilRuntime() != null) {
			iDEDataSetRuntime = this.getSystemModuleUtilRuntime().createDEDataSetRuntime(iPSDEDataSet);
			if (iDEDataSetRuntime != null) {
				return iDEDataSetRuntime;
			}
		}

		return this.onCreateDEDataSetRuntime(iPSDEDataSet);
	}

	protected IDEDataSetRuntime onCreateDEDataSetRuntime(IPSDEDataSet iPSDEDataSet) {
		if (iPSDEDataSet.getPSCodeList() != null) {
			if (DEDataSetTypes.CODELIST.equals(iPSDEDataSet.getDataSetType()) || DEDataSetTypes.INDEXDE.equals(iPSDEDataSet.getDataSetType()) || DEDataSetTypes.MULTIFORM.equals(iPSDEDataSet.getDataSetType())) {
				return new DECodeListDataSetRuntime();
			}
		}

		if (iPSDEDataSet.getPSDELogic() != null) {
			if (DEDataSetTypes.DELOGIC.equals(iPSDEDataSet.getDataSetType())) {
				return new DELogicDataSetRuntime();
			}
		}

		return super.createDEDataSetRuntime(iPSDEDataSet);
	}

	@Override
	public IDEActionRuntime createDEActionRuntime(IPSDEAction iPSDEAction) {

		IDEActionRuntime iDEActionRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEAction.getPSSysSFPlugin(), IDEActionRuntime.class, true);
		if (iDEActionRuntime != null) {
			return iDEActionRuntime;
		}

		if (this.getSystemModuleUtilRuntime() != null) {
			iDEActionRuntime = this.getSystemModuleUtilRuntime().createDEActionRuntime(iPSDEAction);
			if (iDEActionRuntime != null) {
				return iDEActionRuntime;
			}
		}

		return this.onCreateDEActionRuntime(iPSDEAction);
	}

	protected IDEActionRuntime onCreateDEActionRuntime(IPSDEAction iPSDEAction) {
		return super.createDEActionRuntime(iPSDEAction);
	}

	@Override
	public IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic) {

		IDELogicRuntime iDELogicRuntime = this.getSystemRuntime().getRuntimeObject(iPSDELogic.getPSSysSFPlugin(), IDELogicRuntime.class, true);
		if (iDELogicRuntime != null) {
			return iDELogicRuntime;
		}

		if (this.getSystemModuleUtilRuntime() != null) {
			iDELogicRuntime = this.getSystemModuleUtilRuntime().createDELogicRuntime(iPSDELogic);
			if (iDELogicRuntime != null) {
				return iDELogicRuntime;
			}
		}

		return this.onCreateDELogicRuntime(iPSDELogic);
	}

	protected IDELogicRuntime onCreateDELogicRuntime(IPSDELogic iPSDELogic) {
		String strSubType = iPSDELogic.getLogicSubType();
		if (StringUtils.hasLength(strSubType) && LogicSubType.NONE.value.equals(strSubType)) {
			strSubType = null;
		}

		IDELogicRuntime iDELogicRuntime = this.getSystemRuntime().getRuntimeObject(IDELogicRuntime.class, StringUtils.hasLength(strSubType) ? strSubType : "*");
		if (iDELogicRuntime != null) {
			return iDELogicRuntime;
		}

		if (StringUtils.hasLength(strSubType)) {
			iDELogicRuntime = this.getSystemRuntime().getRuntimeObject(IDELogicRuntime.class, "*");
			if (iDELogicRuntime != null) {
				return iDELogicRuntime;
			}
		}

		return createDefaultDELogicRuntime(iPSDELogic);
	}

	protected IDELogicRuntime createDefaultDELogicRuntime(IPSDELogic iPSDELogic) {
		return new DELogicRuntime();
	}

	@Override
	public IDEMSLogicRuntime createDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic) {

		IDEMSLogicRuntime iDEMSLogicRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEMSLogic.getPSSysSFPlugin(), IDEMSLogicRuntime.class, true);
		if (iDEMSLogicRuntime != null) {
			return iDEMSLogicRuntime;
		}

		if (this.getSystemModuleUtilRuntime() != null) {
			iDEMSLogicRuntime = this.getSystemModuleUtilRuntime().createDEMSLogicRuntime(iPSDEMSLogic);
			if (iDEMSLogicRuntime != null) {
				return iDEMSLogicRuntime;
			}
		}
		return createDefaultDEMSLogicRuntime(iPSDEMSLogic);
	}

	protected IDEMSLogicRuntime createDefaultDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic) {
		return new DEMSLogicRuntime();
	}

	@Override
	public IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport) {
		IDEDataExportRuntime iDEDataExportRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEDataExport.getPSSysSFPlugin(), IDEDataExportRuntime.class, true);
		if (iDEDataExportRuntime != null) {
			return iDEDataExportRuntime;
		}

		if (this.getSystemModuleUtilRuntime() != null) {
			iDEDataExportRuntime = this.getSystemModuleUtilRuntime().createDEDataExportRuntime(iPSDEDataExport);
			if (iDEDataExportRuntime != null) {
				return iDEDataExportRuntime;
			}
		}

		iDEDataExportRuntime = this.getSystemRuntime().getRuntimeObject(IDEDataExportRuntime.class, null);
		if (iDEDataExportRuntime != null) {
			return iDEDataExportRuntime;
		}

		return createDefaultDEDataExportRuntime(iPSDEDataExport);
	}

	protected IDEDataExportRuntime createDefaultDEDataExportRuntime(IPSDEDataExport iPSDEDataExport) {
		return new DEDataExportRuntime();
	}

	@Override
	public IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport) {
		IDEDataImportRuntime iDEDataImportRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEDataImport.getPSSysSFPlugin(), IDEDataImportRuntime.class, true);
		if (iDEDataImportRuntime != null) {
			return iDEDataImportRuntime;
		}

		if (this.getSystemModuleUtilRuntime() != null) {
			iDEDataImportRuntime = this.getSystemModuleUtilRuntime().createDEDataImportRuntime(iPSDEDataImport);
			if (iDEDataImportRuntime != null) {
				return iDEDataImportRuntime;
			}
		}

		iDEDataImportRuntime = this.getSystemRuntime().getRuntimeObject(IDEDataImportRuntime.class, null);
		if (iDEDataImportRuntime != null) {
			return iDEDataImportRuntime;
		}

		return createDefaultDEDataImportRuntime(iPSDEDataImport);
	}

	protected IDEDataImportRuntime createDefaultDEDataImportRuntime(IPSDEDataImport iPSDEDataImport) {
		return new DEDataImportRuntime();
	}

	public IDERRuntime createDERRuntime(IPSDERBase iPSDERBase) {

		IDERRuntime iDERRuntime = null;
		if (this.getSystemModuleUtilRuntime() != null) {
			iDERRuntime = this.getSystemModuleUtilRuntime().createDERRuntime(iPSDERBase);
			if (iDERRuntime != null) {
				return iDERRuntime;
			}
		}

		if (DERTypes.DERAGGDATA.equals(iPSDERBase.getDERType())) {
			return new DERAggDataRuntime();
		}

		return null;
	}

	@Override
	public IDERRuntime getDERRuntime(IPSDERBase iPSDERBase, boolean bTryMode) {
		this.prepare();
		Assert.notNull(iPSDERBase, "传入实体关系模型对象无效");
		IDERRuntime iDERRuntime = null;
		if (this.derRuntimeMap != null) {
			iDERRuntime = this.derRuntimeMap.get(iPSDERBase.getId());
		}
		if (iDERRuntime != null || bTryMode) {
			return iDERRuntime;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取实体关系[%1$s]运行时对象", iPSDERBase.getId()));
	}

	@Override
	public IDEMapRuntime getDEMapRuntime(String strCodeName, boolean bTryMode) {
		this.prepare();
		Assert.hasLength(strCodeName, "传入实体映射代码标识无效");

		IDEMapRuntime iDEMapRuntime = null;
		if (this.deMapRuntimeMap != null) {
			iDEMapRuntime = this.deMapRuntimeMap.get(strCodeName.toLowerCase());
		}
		if (iDEMapRuntime != null || bTryMode) {
			return iDEMapRuntime;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取实体映射[%1$s]运行时对象", strCodeName));
	}

	public IDEMapRuntime createDEMapRuntime(IPSDEMap iPSDEMap) {

		IDEMapRuntime iDEMapRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEMap.getPSSysSFPlugin(), IDEMapRuntime.class, true);
		if (iDEMapRuntime != null) {
			return iDEMapRuntime;
		}

		iDEMapRuntime = this.getSystemRuntime().getRuntimeObject(IDEMapRuntime.class, null);
		if (iDEMapRuntime != null) {
			return iDEMapRuntime;
		}

		return createDefaultDEMapRuntime(iPSDEMap);
	}

	protected IDEMapRuntime createDefaultDEMapRuntime(IPSDEMap iPSDEMap) {
		// return new DEMapRuntime();
		return this.getSystemRuntime().createDefaultDEMapRuntime();
	}

	public IDEMapRuntime getDEMapRuntime(String strActionName, IPSDEAction iPSDEAction) {
		return this.getDEMapRuntime(strActionName, iPSDEAction, null);
	}

	/**
	 * 获取支持指定行为的映射对象
	 *
	 * @param strActionName
	 * @param iPSDEAction
	 * @param strMode
	 * @return
	 */
	public IDEMapRuntime getDEMapRuntime(String strActionName, IPSDEAction iPSDEAction, String strMode) {
		this.prepare();
		if (ObjectUtils.isEmpty(this.deMapRuntimeMap)) {
			return null;
		}
		for (IDEMapRuntime iDEMapRuntime : this.deMapRuntimeMap.values()) {
			if (iDEMapRuntime.isEnableAction(strActionName, iPSDEAction, strMode)) {
				return iDEMapRuntime;
			}
		}
		return null;
	}

	public IDEMapRuntime getDEMapRuntime(String strDataSetName, IPSDEDataSet iPSDEDataSet) {
		return this.getDEMapRuntime(strDataSetName, iPSDEDataSet, null);
	}

	/**
	 * 获取支持指定结果集的映射对象
	 *
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param strMode
	 * @return
	 */
	public IDEMapRuntime getDEMapRuntime(String strDataSetName, IPSDEDataSet iPSDEDataSet, String strMode) {
		this.prepare();
		if (ObjectUtils.isEmpty(this.deMapRuntimeMap)) {
			return null;
		}
		for (IDEMapRuntime iDEMapRuntime : this.deMapRuntimeMap.values()) {
			if (iDEMapRuntime.isEnableDataSet(strDataSetName, iPSDEDataSet, strMode)) {
				return iDEMapRuntime;
			}
		}
		return null;
	}

	@Override
	public IDEAutoCompleteRuntime getDEAutoCompleteRuntime(String strCodeName, boolean bTryMode) {
		this.prepare();
		Assert.hasLength(strCodeName, "传入实体自动填充标识无效");

		IDEAutoCompleteRuntime iDEAutoCompleteRuntime = null;
		if (this.deAutoCompleteRuntimeMap != null) {
			iDEAutoCompleteRuntime = this.deAutoCompleteRuntimeMap.get(strCodeName.toLowerCase());
		}
		if (iDEAutoCompleteRuntime != null || bTryMode) {
			return iDEAutoCompleteRuntime;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取自动填充[%1$s]运行时对象", strCodeName));
	}

	public IDEAutoCompleteRuntime createDEAutoCompleteRuntime(IPSDEACMode iPSDEAutoComplete) {
		IDEAutoCompleteRuntime iDEAutoCompleteRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEAutoComplete.getPSSysSFPlugin(), IDEAutoCompleteRuntime.class, true);
		if (iDEAutoCompleteRuntime != null) {
			return iDEAutoCompleteRuntime;
		}

		iDEAutoCompleteRuntime = this.getSystemRuntime().getRuntimeObject(IDEAutoCompleteRuntime.class, iPSDEAutoComplete.getACType());
		if (iDEAutoCompleteRuntime != null) {
			return iDEAutoCompleteRuntime;
		}

		return createDefaultDEAutoCompleteRuntime(iPSDEAutoComplete);
	}

	protected IDEAutoCompleteRuntime createDefaultDEAutoCompleteRuntime(IPSDEACMode iPSDEAutoComplete) {
		return new DEAutoCompleteRuntime();
	}

	public IDESearchRuntime createDESearchRuntime(IPSDESearch iPSDESearch) {
		// IDESearchRuntime iDESearchRuntime =
		// this.getSystemRuntime().getRuntimeObject(iPSDESearch.getPSSysSFPlugin(),
		// IDESearchRuntime.class, true);
		// if (iDESearchRuntime != null) {
		// return iDESearchRuntime;
		// }

		IDESearchRuntime iDESearchRuntime = this.getSystemRuntime().getRuntimeObject(IDESearchRuntime.class, null);
		if (iDESearchRuntime != null) {
			return iDESearchRuntime;
		}

		return createDefaultDESearchRuntime(iPSDESearch);
	}

	protected IDESearchRuntime createDefaultDESearchRuntime(IPSDESearch iPSDESearch) {
		return new DESearchRuntime();
	}

	@Override
	public IDEDataFlowRuntime getDEDataFlowRuntime(String strCodeName, boolean bTryMode) {
		this.prepare();
		Assert.hasLength(strCodeName, "传入实体数据流标识无效");

		IDEDataFlowRuntime iDEDataFlowRuntime = null;
		if (this.deDataFlowRuntimeMap != null) {
			iDEDataFlowRuntime = this.deDataFlowRuntimeMap.get(strCodeName.toLowerCase());
		}
		if (iDEDataFlowRuntime != null || bTryMode) {
			return iDEDataFlowRuntime;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取数据流[%1$s]运行时对象", strCodeName));
	}

	public IDEDataFlowRuntime createDEDataFlowRuntime(IPSDEDataFlow iPSDEDataFlow) {

		IDEDataFlowRuntime iDEDataFlowRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEDataFlow.getPSSysSFPlugin(), IDEDataFlowRuntime.class, true);
		if (iDEDataFlowRuntime != null) {
			return iDEDataFlowRuntime;
		}

		iDEDataFlowRuntime = this.getSystemRuntime().getRuntimeObject(IDEDataFlowRuntime.class, null);
		if (iDEDataFlowRuntime != null) {
			return iDEDataFlowRuntime;
		}

		return createDefaultDEDataFlowRuntime(iPSDEDataFlow);
	}

	protected IDEDataFlowRuntime createDefaultDEDataFlowRuntime(IPSDEDataFlow iPSDEDataFlow) {
		return new DEDataFlowRuntime();
	}

	public IDEFGroupRuntime createDEFGroupRuntime(IPSDEFGroup iPSDEFGroup) {

		IDEFGroupRuntime iDEFGroupRuntime = this.getSystemRuntime().getRuntimeObject(iPSDEFGroup.getPSSysSFPlugin(), IDEFGroupRuntime.class, true);
		if (iDEFGroupRuntime != null) {
			return iDEFGroupRuntime;
		}

		iDEFGroupRuntime = this.getSystemRuntime().getRuntimeObject(IDEFGroupRuntime.class, null);
		if (iDEFGroupRuntime != null) {
			return iDEFGroupRuntime;
		}

		return createDefaultDEFGroupRuntime(iPSDEFGroup);
	}

	protected IDEFGroupRuntime createDefaultDEFGroupRuntime(IPSDEFGroup iPSDEFGroup) {
		return new DEFGroupRuntime();
	}

	@Override
	public IDEFGroupRuntime getDEFGroupRuntime(IPSDEFGroup iPSDEFGroup, boolean bTryMode) {
		this.prepare();
		Assert.notNull(iPSDEFGroup, "传入实体属性组模型对象无效");
		IDEFGroupRuntime iDEFGroupRuntime = null;
		if (this.defGroupRuntimeMap != null) {
			iDEFGroupRuntime = this.defGroupRuntimeMap.get(iPSDEFGroup.getId());
		}
		if (iDEFGroupRuntime != null || bTryMode) {
			return iDEFGroupRuntime;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取实体属性组[%1$s]运行时对象", iPSDEFGroup.getId()));
	}

	@Override
	public void rawCreate(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable {
		Assert.notEmpty(list, "传入数据列表无效");
		boolean bPrepareDTORuntime = false;
		for (IEntityDTO t : list) {
			if (t.getDEMethodDTORuntime() == null) {
				bPrepareDTORuntime = true;
				break;
			}
		}
		if (bPrepareDTORuntime) {
			IPSDEMethodDTO iPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
			if (iPSDEMethodDTO != null) {
				IDEMethodDTORuntime iDEMethodDTORuntime = this.getDEMethodDTORuntime(iPSDEMethodDTO, false);
				for (IEntityDTO t : list) {
					if (t.getDEMethodDTORuntime() == null) {
						t.setDEMethodDTORuntime(iDEMethodDTORuntime);
					}
				}
			}
		}

		try {
			this.pushDataSource();
			final IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime = this.isEnableDynaStorage() ? this.getDEDynaStorageUtilRuntime() : null;
			if (iDEDynaStorageUtilRuntime != null) {
				for (IEntityDTO iEntity : list) {
					this.getDEDynaStorageUtilRuntime().translateEntityDynaFieldsBeforeProceed(iEntity, DEActions.CREATE, this.getPSDEAction(DEActions.CREATE));
					getSystemPersistentAdapterMust().create(this, null, iEntity, null, false, null, bSysMode);
					this.getDEDynaStorageUtilRuntime().translateEntityDynaFieldsAfterProceed(iEntity, null, DEActions.CREATE, this.getPSDEAction(DEActions.CREATE));
				}
			} else {
				getSystemPersistentAdapterMust().create(this, null, list, null, false, null, bSysMode);
			}

		} finally {
			this.pollDataSource();
		}

	}

	@Override
	public void rawUpdate(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable {
		Assert.notEmpty(list, "传入数据列表无效");

		boolean bPrepareDTORuntime = false;
		for (IEntityDTO t : list) {
			if (t.getDEMethodDTORuntime() == null) {
				bPrepareDTORuntime = true;
				break;
			}
		}
		if (bPrepareDTORuntime) {
			IPSDEMethodDTO iPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
			if (iPSDEMethodDTO != null) {
				IDEMethodDTORuntime iDEMethodDTORuntime = this.getDEMethodDTORuntime(iPSDEMethodDTO, false);
				for (IEntityDTO t : list) {
					if (t.getDEMethodDTORuntime() == null) {
						t.setDEMethodDTORuntime(iDEMethodDTORuntime);
					}
				}
			}
		}

		try {
			this.pushDataSource();
			final IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime = this.isEnableDynaStorage() ? this.getDEDynaStorageUtilRuntime() : null;
			if (iDEDynaStorageUtilRuntime != null) {
				for (IEntityDTO iEntity : list) {
					iDEDynaStorageUtilRuntime.translateEntityDynaFieldsBeforeProceed(iEntity, DEActions.UPDATE, this.getPSDEAction(DEActions.UPDATE));
					getSystemPersistentAdapterMust().update(this, null, iEntity, null, false, null, bSysMode);
					iDEDynaStorageUtilRuntime.translateEntityDynaFieldsAfterProceed(iEntity, null, DEActions.UPDATE, this.getPSDEAction(DEActions.UPDATE));
				}
			} else {
				getSystemPersistentAdapterMust().update(this, null, list, null, false, null, bSysMode);
			}

		} finally {
			this.pollDataSource();
		}

	}

	@Override
	public void rawSave(List<? extends IEntityDTO> list, boolean bSysMode) throws Throwable {
		Assert.notEmpty(list, "传入数据列表无效");

		boolean bPrepareDTORuntime = false;
		for (IEntityDTO t : list) {
			if (t.getDEMethodDTORuntime() == null) {
				bPrepareDTORuntime = true;
				break;
			}
		}

		if (bPrepareDTORuntime) {
			IPSDEMethodDTO iPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
			if (iPSDEMethodDTO != null) {
				IDEMethodDTORuntime iDEMethodDTORuntime = this.getDEMethodDTORuntime(iPSDEMethodDTO, false);
				for (IEntityDTO t : list) {
					if (t.getDEMethodDTORuntime() == null) {
						t.setDEMethodDTORuntime(iDEMethodDTORuntime);
					}
				}
			}
		}

		List<IEntityDTO> createList = new ArrayList<>();
		List<IEntityDTO> updateList = new ArrayList<>();
		for (IEntityDTO t : list) {
			Object objKey = this.getDataEntityRuntime().getFieldValue(t, this.getDataEntityRuntime().getKeyPSDEField());
			if (ObjectUtils.isEmpty(objKey)) {
				// 新建
				if (!this.getDataEntityRuntime().fillEntityKeyValue(t)) {
					createList.add(t);
					continue;
				}
				objKey = this.getDataEntityRuntime().getFieldValue(t, this.getDataEntityRuntime().getKeyPSDEField());
			}
			int nRet = this.checkKeyState(objKey);
			if (nRet == CheckKeyStates.DELETE) {
				throw new DataEntityRuntimeException(this, String.format("数据[%1$s]已经被删除", objKey), Errors.INVALIDDATAKEYS);
			}
			if (nRet == CheckKeyStates.OK) {
				createList.add(t);
			} else {
				updateList.add(t);
			}
		}
		if (!ObjectUtils.isEmpty(createList)) {
			this.rawCreate(createList, bSysMode);
		}
		if (!ObjectUtils.isEmpty(updateList)) {
			this.rawUpdate(updateList, bSysMode);
		}
	}

	@Override
	public void rawRemove(List<Object> list, boolean bSysMode) throws Throwable {
		Assert.notEmpty(list, "传入数据列表无效");

		try {
			this.pushDataSource();
			final IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime = this.isEnableDynaStorage() ? this.getDEDynaStorageUtilRuntime() : null;
			if (iDEDynaStorageUtilRuntime != null) {
				for (Object key : list) {
					iDEDynaStorageUtilRuntime.removeEntityDynaFieldsBeforeRemove(key, DEActions.REMOVE, this.getPSDEAction(DEActions.REMOVE));
					getSystemPersistentAdapterMust().remove(this, null, key, bSysMode);
				}
			} else {
				getSystemPersistentAdapterMust().remove(this, null, list, bSysMode);
			}

		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public IEntityDTO rawGet(Object key) throws Throwable {
		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		iSearchContextDTO.eq(this.getKeyPSDEField().getLowerCaseName(), key);
		iSearchContextDTO.count(false).limit(1);

		List<IEntityDTO> list = this.rawSelect(iSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			return list.get(0);
		}

		throw new DataEntityRuntimeException(this, String.format("无法获取指定数据[%1$s]", key), Errors.INVALIDDATA);
	}

	@Override
	public List<IEntityDTO> rawSelect(ISearchContextDTO iSearchContextDTO) {
		return this.rawSelect(this.getViewPSDEDataQuery(), iSearchContextDTO);
	}

	@Override
	public List<IEntityDTO> rawSelect(IPSDEDataQuery iPSDEDataQuery, ISearchContextDTO iSearchContextDTO) {
		Assert.notNull(iPSDEDataQuery, "传入数据查询模型对象无效");
		if (this.getSystemPersistentAdapter() == null) {
			throw new DataEntityRuntimeException(this, String.format("直接搜索数据查询[%1$s]发生错误，未指定实体持久化对象", iPSDEDataQuery.getName()));
		}

		try {
			this.pushDataSource();
			List list = this.getSystemPersistentAdapter().query(this, iPSDEDataQuery, iSearchContextDTO, null);

			List<IEntityDTO> entityDTOList = new ArrayList<>();
			if (list != null) {
				IPSDEMethodDTO iPSDEMethodDTO = this.getDefaultPSDEMethodDTO();
				IDEMethodDTORuntime iDEMethodDTORuntime = this.getDEMethodDTORuntime(iPSDEMethodDTO, false);
				for (Object item : list) {
					if (item instanceof IEntityDTO) {
						entityDTOList.add((IEntityDTO) item);
					} else {
						IEntityDTO iEntityDTO = this.createEntityDTO(iPSDEMethodDTO);
						iEntityDTO.init(iDEMethodDTORuntime, item, false);
						entityDTOList.add(iEntityDTO);
					}
				}
			}

			return entityDTOList;

		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("直接搜索数据查询[%1$s]发生异常，%2$s", iPSDEDataQuery.getName(), ex.getMessage()), ex);
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public IEntityDTO rawSelectOne(ISearchContextDTO iSearchContextDTO, boolean bTryMode) {
		iSearchContextDTO.count(false).limit(1);
		List<IEntityDTO> list = this.rawSelect(iSearchContextDTO);
		IEntityDTO iEntityDTO = ObjectUtils.isEmpty(list) ? null : list.get(0);
		if (iEntityDTO != null || bTryMode) {
			return iEntityDTO;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定条件数据"), Errors.INVALIDDATA);
	}

	@Override
	public ISystemPersistentAdapter getSystemPersistentAdapterMust() {
		ISystemPersistentAdapter iSystemPersistentAdapter = this.getSystemPersistentAdapter();
		if (iSystemPersistentAdapter == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "系统持久化对象无效");
		}
		return iSystemPersistentAdapter;
	}

	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		if (this.getStorageMode() != DEStorageModes.NOSQL || this.iSysBDSchemeRuntime != null) {
			return this.iSysBDSchemeRuntime;
		}

		this.iSysBDSchemeRuntime = this.getSystemRuntime().getSysBDSchemeRuntime(this);
		if (this.iSysBDSchemeRuntime == null) {
			log.warn(String.format("实体[%1$s]配置大数据存储，但未获取对应的大数据库运行时对象", this.getName()));
		}

		return this.iSysBDSchemeRuntime;
	}

	protected void setSysBDSchemeRuntime(ISysBDSchemeRuntime iSysBDSchemeRuntime) {
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}

	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntimeMust() {
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime();
		if (iSysBDSchemeRuntime == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "系统大数据库运行时对象无效");
		}
		return iSysBDSchemeRuntime;
	}

	@Override
	protected void translateSearchContextBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		ISearchContextDTO iSearchContextDTO = this.getSearchContextDTO(arg0);
		if (!ObjectUtils.isEmpty(iSearchContextDTO.getSearchConds())) {
			for (ISearchCond iSearchCond : iSearchContextDTO.getSearchConds()) {
				this.translateSearchCondBeforeProceed(iSearchContextDTO, iSearchCond, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}

		if (iPSDEDataSet.getActiveDataPSDELogic() != null) {
			// 进行查询上下文值逻辑转换
			IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(iPSDEDataSet.getActiveDataPSDELogic());
			iDELogicRuntime.execute(new Object[] { arg0 });
		}
		super.translateSearchContextBeforeProceed(arg0, strDataSetName, iPSDEDataSet, iPSDataEntity, iDynaInstRuntime, actionData);

		final List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					iDataEntityInheritLogic.translateSearchContextBeforeProceed(this.getDataEntityRuntimeContext(), iSearchContextDTO, strDataSetName, iPSDEDataSet);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}
	}

	protected void translateSearchCondBeforeProceed(ISearchContextDTO iSearchContextDTO, ISearchCond iSearchCond, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (iSearchCond instanceof ISearchGroupCond) {
			ISearchGroupCond iSearchGroupCond = (ISearchGroupCond) iSearchCond;
			if (!ObjectUtils.isEmpty(iSearchGroupCond.getSearchConds())) {
				for (ISearchCond item : iSearchGroupCond.getSearchConds()) {
					this.translateSearchCondBeforeProceed(iSearchContextDTO, item, iPSDataEntity, iDynaInstRuntime, actionData);
				}
			}
			return;
		}

		if (iSearchCond instanceof ISearchFieldCond) {
			ISearchFieldCond iSearchFieldCond = (ISearchFieldCond) iSearchCond;
			if (this.isTranslateSearchFieldCondBeforeProceed()) {
				IPSDEFSearchMode iPSDEFSearchMode = this.getPSDEFSearchMode(iSearchFieldCond, true);
				if (iPSDEFSearchMode != null) {
					final IPSSysTranslator iPSSysTranslator = iPSDEFSearchMode.getPSSysTranslator();
					if (iPSSysTranslator != null) {
						// 进行值转化
						Object value = iSearchFieldCond.isParamMode() ? iSearchContextDTO.get((String) iSearchFieldCond.getValue()) : iSearchFieldCond.getValue();
						if (value == null) {
							return;
						}

						ISysTranslatorRuntime iSysTranslatorRuntime = this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator);
						Object newValue = iSysTranslatorRuntime.translate(value, true);
						if (iSearchFieldCond.isParamMode()) {
							iSearchContextDTO.set((String) iSearchFieldCond.getValue(), newValue);
						} else {
							iSearchFieldCond.setValue(newValue);
						}
					}
					return;
				}
			}

			if (Conditions.CHILDOF.equalsIgnoreCase(iSearchFieldCond.getCondOp())) {
				Object value = iSearchFieldCond.isParamMode() ? iSearchContextDTO.get((String) iSearchFieldCond.getValue()) : iSearchFieldCond.getValue();
				if (value != null) {
					value = DataTypeUtils.asSimple(value);
				}
				if (value == null) {
					return;
				}

				if (this.getSystemPersistentAdapter() != null) {
					IPSDEField iPSDEField = this.getPSDEField(iSearchFieldCond.getFieldName());
					if (iPSDEField != null) {
						IPSPickupDEField iPSPickupDEField = null;
						if (iPSDEField instanceof IPSPickupDEField) {
							iPSPickupDEField = (IPSPickupDEField) iPSDEField;
						} else if (iPSDEField instanceof IPSLinkDEField) {
							iPSDEField = ((IPSLinkDEField) iPSDEField).getRelatedPSDEFieldMust();
							if (iPSDEField instanceof IPSPickupDEField) {
								iPSPickupDEField = (IPSPickupDEField) iPSDEField;
							}
						}

						if (iPSPickupDEField != null) {
							IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSPickupDEField.getPSDERMust().getMajorPSDataEntityMust().getId());
							List<Object> idList = refDataEntityRuntime.getDescendantIds(value, true);
							if (idList == null) {
								idList = new ArrayList<Object>();
							}
							idList.add(0, value);
							// 调整为IN操作
							iSearchFieldCond.setCondOp(Conditions.IN);
							if (iSearchFieldCond.isParamMode()) {
								iSearchContextDTO.set((String) iSearchFieldCond.getValue(), idList);
							} else {
								iSearchFieldCond.setValue(idList);
							}
						}
					}
				}
				return;
			}

			return;
		}
	}

	protected boolean isTranslateSearchFieldCondBeforeProceed() {
		return this.bTranslateSearchFieldCondBeforeProceed;
	}

	@Override
	public Object serializeEntityList(List<? extends IEntityDTO> list) {
		Assert.notNull(list, "不能传入空对象");
		try {
			return JsonUtils.MAPPER.writeValueAsString(list);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public List<IEntityDTO> deserializeEntityList(Object objData) {
		if (!(objData instanceof String)) {
			throw new DataEntityRuntimeException(this, String.format("反序列化数据对象列表发生异常，传入值类型不正确"));
		}

		Assert.hasLength((String) objData, "不能传入空数据");

		try {
			List list = JsonUtils.MAPPER.readValue((String) objData, List.class);
			if (list != null) {
				List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
				for (Object map : list) {
					if (map instanceof Map) {
						IEntityDTO iEntityDTO = this.createEntity();
						iEntityDTO.reload(map, true);
						entityDTOList.add(iEntityDTO);
					} else {
						throw new Exception("成员类型不正确");
					}
				}
				return entityDTOList;
			}
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("反序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}
		return null;
	}

	@Override
	public Object serializeEntity(IEntityBase iEntityBase) {
		Assert.notNull(iEntityBase, "不能传入空对象");
		try {
			return JsonUtils.MAPPER.writeValueAsString(iEntityBase);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("序列化数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public IEntityBase deserializeEntity(Object objData) {
		if (!(objData instanceof String)) {
			throw new DataEntityRuntimeException(this, String.format("反序列化数据对象发生异常，传入值类型不正确"));
		}

		Assert.hasLength((String) objData, "不能传入空数据");

		try {
			Map map = JsonUtils.MAPPER.readValue((String) objData, Map.class);
			if (map != null) {
				IEntityDTO iEntityDTO = this.createEntity();
				iEntityDTO.reload(map, true);
				return iEntityDTO;
			}
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("反序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}
		return null;
	}

	@Override
	public IEntityBase[] deserializeEntities(Object objData) {
		List<IEntityDTO> list = deserializeEntityList(objData);
		if (list == null || list.size() == 0) {
			return null;
		}

		return list.toArray(new IEntityBase[list.size()]);
	}

	@Override
	public Object serializeEntities(IEntityBase[] list) {
		Assert.notNull(list, "不能传入空对象");
		try {
			return JsonUtils.MAPPER.writeValueAsString(list);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	protected void onPushDataSource() {
		if (this.getSysDBSchemeRuntime() != null) {
			this.getSysDBSchemeRuntime().push();
		}
		super.onPushDataSource();
	}

	@Override
	protected void onPollDataSource() {

		super.onPollDataSource();

		if (this.getSysDBSchemeRuntime() != null) {
			this.getSysDBSchemeRuntime().poll();
		}
	}

	@Override
	public void getImportTemplate(String strImportTag, OutputStream outputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			this.pushDataSource();
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());
			actionSession.beginLog(this.getName(), String.format("获取导入数据模板[%1$s]", strImportTag));

			this.onGetImportTemplate(strImportTag, outputStream, bTestPriv, parentDataEntityRuntime, strParentKey);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);
			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEDATAIMPTEMPL, iActionSessionLog.toString(true), this.getName(), String.format("获取导入数据模板[%1$s]", strImportTag), iActionSessionLog.getTime(), iActionSessionLog);
					}
				}
				ActionSessionManager.closeSession(true);
			}

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				IActionSessionLog iActionSessionLog = actionSession.endLog(ex.getMessage(), true, ex);
				if (iActionSessionLog != null) {
					String strInfo = String.format("实体[%1$s]获取导入数据模板[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strImportTag, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEDATAIMPTEMPL, strInfo, ex);
				}
				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}
	}

	protected void onGetImportTemplate(String strImportTag, OutputStream outputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		/**
		 * 计算动态实例实体运行时
		 */
		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
		IDynaInstRuntime iDynaInstRuntime = null;
		if (this.getDynaInstMode() != DynaInstModes.DISABLE) {
			String strDynainstid = getDynaInstId(null);
			if (StringUtils.hasLength(strDynainstid)) {
				iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynainstid);
				// 设置当前会话的动态实例运行时
				ActionSessionManager.getCurrentSession().setDynaInstRuntime(iDynaInstRuntime);
				if (iDynaInstRuntime != null) {
					iDynaInstDataEntityRuntime = (IDynaInstDataEntityRuntime) iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		IDEDataImportRuntime iDEDataImportRuntime = null;
		if (iDynaInstDataEntityRuntime != null) {
			iDEDataImportRuntime = iDynaInstDataEntityRuntime.getDEDataImportRuntime(strImportTag);
		} else {
			iDEDataImportRuntime = this.getDEDataImportRuntime(strImportTag);
		}

		((net.ibizsys.central.dataentity.dataimport.IDEDataImportRuntime) iDEDataImportRuntime).getImportTemplate(strImportTag, outputStream, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	@Override
	public List<IDETestCaseRuntime> getDETestCaseRuntimes() {
		prepare();

		try {
			if (!ObjectUtils.isEmpty(this.deTestCaseRuntimeList)) {
				return this.deTestCaseRuntimeList;
			}
			List<IPSSysTestCase> psSysTestCaseList = this.getPSDataEntity().getAllPSSysTestCases();
			if (!ObjectUtils.isEmpty(psSysTestCaseList)) {
				List<IDETestCaseRuntime> list = new ArrayList<IDETestCaseRuntime>();
				for (IPSSysTestCase iPSSysTestCase : psSysTestCaseList) {
					ISysTestCaseRuntime iSysTestCaseRuntime = this.getSystemRuntime().createSysTestCaseRuntime(iPSSysTestCase);
					if (!(iSysTestCaseRuntime instanceof IDETestCaseRuntime)) {
						throw new Exception(String.format("建立测试用例[%1$s]运行时对象不正确", iPSSysTestCase.getName()));
					}
					try {
						iSysTestCaseRuntime.init(this.getSystemRuntimeContext(), iPSSysTestCase);
					} catch (Exception ex) {
						throw new Exception(String.format("初始化测试用例[%1$s]运行时对象发生异常，%2$s", iPSSysTestCase.getName(), ex.getMessage()), ex);
					}
					list.add((IDETestCaseRuntime) iSysTestCaseRuntime);
				}
				if (this.deTestCaseRuntimeList == null) {
					this.deTestCaseRuntimeList = list;
				}
			}

			return this.deTestCaseRuntimeList;
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体测试用例运行时对象集合发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public void fillEntityCodeListTexts(IEntity iEntity, String strSuffix) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Assert.hasLength(strSuffix, "传入附加后缀无效");

		prepare();

		try {

			// 进一步填充代码表值
			List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
			if (!ObjectUtils.isEmpty(psDEFieldList)) {
				for (IPSDEField iPSDEField : psDEFieldList) {

					if (!iEntity.contains(iPSDEField.getLowerCaseName())) {
						continue;
					}

					Object objValue = iEntity.get(iPSDEField.getLowerCaseName());

					if (!ObjectUtils.isEmpty(objValue)) {

						if (iPSDEField instanceof IPSInheritDEField) {
							IPSDEField relatedPSDEField = ((IPSInheritDEField) iPSDEField).getRelatedPSDEFieldMust();
							if (relatedPSDEField instanceof IPSPickupObjectDEField || relatedPSDEField instanceof IPSOne2ManyDataDEField || relatedPSDEField instanceof IPSOne2OneDataDEField) {
								iPSDEField = relatedPSDEField;
							}
						}

						// 进一步处理关系关系数据
						if (iPSDEField instanceof IPSPickupObjectDEField) {
							IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField) iPSDEField;
							if (iPSPickupObjectDEField.getPSDER() != null) {
								IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSPickupObjectDEField.getPSDERMust().getMajorPSDataEntityMust().getId(), false);
								if (objValue instanceof IEntity) {
									refDataEntityRuntime.fillEntityCodeListTexts((IEntity) objValue, strSuffix);
								}
							}
							continue;
						}

						if (iPSDEField instanceof IPSOne2ManyDataDEField) {
							IPSOne2ManyDataDEField iPSOne2ManyDataDEField = (IPSOne2ManyDataDEField) iPSDEField;
							if (iPSOne2ManyDataDEField.getPSDER() != null) {
								IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSOne2ManyDataDEField.getPSDERMust().getMinorPSDataEntityMust().getId(), false);
								if (iPSOne2ManyDataDEField.isMap()) {
									if (objValue instanceof Map) {
										Map map = (Map) objValue;
										for (Object value : map.values()) {
											if (value instanceof IEntity) {
												refDataEntityRuntime.fillEntityCodeListTexts((IEntity) value, strSuffix);
											}
										}
									}
								} else {
									if (objValue instanceof List) {
										List list = (List) objValue;
										for (Object value : list) {
											if (value instanceof IEntity) {
												refDataEntityRuntime.fillEntityCodeListTexts((IEntity) value, strSuffix);
											}
										}
									}
								}
							}
							continue;
						}

						if (iPSDEField instanceof IPSOne2OneDataDEField) {
							IPSOne2OneDataDEField iPSOne2OneDataDEField = (IPSOne2OneDataDEField) iPSDEField;
							if (iPSOne2OneDataDEField.getPSDER() != null) {
								IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSOne2OneDataDEField.getPSDERMust().getMinorPSDataEntityMust().getId(), false);
								if (objValue instanceof IEntity) {
									refDataEntityRuntime.fillEntityCodeListTexts((IEntity) objValue, strSuffix);
								}
							}
							continue;
						}
					}

					IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
					if (iPSCodeList == null) {
						continue;
					}

					String strTextItemName = String.format("%1$s%2$s", iPSDEField.getLowerCaseName(), strSuffix);
					if (iEntity.contains(strTextItemName)) {
						continue;
					}

					ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(iPSCodeList);

					try {
						if (ObjectUtils.isEmpty(objValue)) {
							iEntity.set(strTextItemName, iCodeListRuntime.getEmptyText());
						} else {
							iEntity.set(strTextItemName, iCodeListRuntime.getText(objValue));
						}
					} catch (Throwable ex) {
						log.error(String.format("获取代码表[%1$s]值[%2$s]文本发生异常，%3$s", iPSCodeList.getId(), objValue, ex.getMessage()));
						iEntity.set(strTextItemName, ex.getMessage());
					}
				}
			}

		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体数据对象代码表值文本发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public void fillEntityCodeListTexts(IEntity iEntity) {
		this.fillEntityCodeListTexts(iEntity, "text");
	}

	@Override
	public void create(IEntityDTO iEntityDTO) throws Throwable {
		super.create(iEntityDTO);
	}

	@Override
	public void update(IEntityDTO iEntityDTO) throws Throwable {
		super.update(iEntityDTO);
	}

	@Override
	public void sysUpdate(IEntityDTO iEntityDTO) throws Throwable {
		this.sysUpdate(iEntityDTO, false);
	}

	@Override
	public void sysUpdate(IEntityDTO iEntityDTO, boolean bUpdateOnly) throws Throwable {

		Assert.notNull(iEntityDTO, "未传入数据对象");

		if (this.getSystemPersistentAdapter() == null) {
			throw new DataEntityRuntimeException(this, String.format("执行系统更新发生错误，未指定实体持久化对象"));
		}

		// IEntityDTO iEntityDTO = this.getEntityDTO(iEntityBase);
		try {
			this.pushDataSource();
			this.getSystemPersistentAdapter().update(this, null, iEntityDTO, null, false, null, true);
			if (!bUpdateOnly) {
				this.syncEntityAfterProceed(DEDataSyncEvents.UPDATE, iEntityDTO, null, DEActions.SYSUPDATE, null, null, null, null);
			}
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("执行系统更新发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public void sysUpdate(IEntityBase iEntityBase) throws Throwable {
		this.sysUpdate((IEntityDTO) iEntityBase);
	}

	@Override
	public void sysUpdate(IEntityBase iEntityBase, boolean bUpdateOnly) throws Throwable {
		this.sysUpdate((IEntityDTO) iEntityBase, bUpdateOnly);
	}

	@Override
	public void sysUpdate(IEntityDTO[] entityDTOs, boolean bUpdateOnly) throws Throwable {

		Assert.notNull(entityDTOs, "未传入数据对象");
		if (entityDTOs.length == 0) {
			return;
		}

		if (this.getSystemPersistentAdapter() == null) {
			throw new DataEntityRuntimeException(this, String.format("执行系统更新发生错误，未指定实体持久化对象"));
		}

		// IEntityDTO iEntityDTO = this.getEntityDTO(iEntityBase);
		try {
			this.pushDataSource();
			this.getSystemPersistentAdapter().update(this, null, Arrays.asList(entityDTOs), null, false, null, true);
			if (!bUpdateOnly) {
				for (IEntityDTO iEntityDTO : entityDTOs) {
					this.syncEntityAfterProceed(DEDataSyncEvents.UPDATE, iEntityDTO, null, DEActions.SYSUPDATE, null, null, null, null);
				}
			}
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("执行系统批更新发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			this.pollDataSource();
		}
	}

	@Override
	public void sysUpdate(IEntityBase[] entityBases, boolean bUpdateOnly) throws Throwable {
		Assert.notNull(entityBases, "未传入数据对象");
		if (entityBases.length == 0) {
			return;
		}
		IEntityDTO[] entityDTOs = new IEntityDTO[entityBases.length];
		System.arraycopy(entityBases, 0, entityDTOs, 0, entityBases.length);
		this.sysUpdate(entityDTOs, bUpdateOnly);
	}

	@Override
	public IEntityDTO get(Object objKey) throws Throwable {
		return (IEntityDTO) super.get(objKey);
	}

	@Override
	public void removeInvalidUserInput(IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) {
		prepare();
		try {
			onRemoveInvalidUserInput(iPSDEAction, iEntityDTO);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("移除无效用户输入发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onRemoveInvalidUserInput(IPSDEAction iPSDEAction, IEntityDTO iEntityDTO) throws Throwable {
		// 判断模式
		if (DEActions.CREATE.equalsIgnoreCase(iPSDEAction.getName()) || DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {

			List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
			if (!ObjectUtils.isEmpty(psDEFieldList)) {
				for (IPSDEField iPSDEField : psDEFieldList) {
					if (iPSDEField.isKeyDEField()) {
						if (iPSDEField.isEnableUICreate() && ObjectUtils.isEmpty(this.getUnionKeyValuePSDEFields())) {
							continue;
						}
						iEntityDTO.reset(iPSDEField.getLowerCaseName());
						continue;
					}

					if (!iPSDEField.isEnableUICreate()) {
						// 属性不支持界面建立
						iEntityDTO.reset(iPSDEField.getLowerCaseName());
					}
				}
			}
		} else if (DEActions.UPDATE.equalsIgnoreCase(iPSDEAction.getName()) || DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {

			List<IPSDEField> psDEFieldList = this.getPSDataEntity().getAllPSDEFields();
			if (!ObjectUtils.isEmpty(psDEFieldList)) {
				for (IPSDEField iPSDEField : psDEFieldList) {
					if (iPSDEField.isKeyDEField()) {
						continue;
					}

					if (!iPSDEField.isEnableUIModify()) {
						// 属性不支持界面修改
						iEntityDTO.reset(iPSDEField.getLowerCaseName());
					}
				}
			}
		}
	}

	@Override
	public Map<String, Set<Object>> fillEntityDTORefCheckData(Map<String, Set<Object>> map, IEntityDTO iEntityDTO) {
		Assert.notNull(iEntityDTO, "未传入DTO数据对象");
		prepare();
		try {
			if (map == null) {
				map = new HashMap<String, Set<Object>>();
			}
			onFillEntityDTORefCheckData(map, iEntityDTO);
			return map;
		} catch (Throwable ex) {

			DataEntityRuntimeException.rethrow(this, ex);

			throw new DataEntityRuntimeException(this, String.format("填充数据对象引用检查数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onFillEntityDTORefCheckData(Map<String, Set<Object>> checkData, IEntityDTO iEntityDTO) throws Throwable {

		IDEMethodDTORuntime iDEMethodDTORuntime = iEntityDTO.getDEMethodDTORuntime();
		if (iDEMethodDTORuntime == null) {
			return;
		}

		List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iDEMethodDTORuntime.getPSDEMethodDTO().getPSDEMethodDTOFields();
		if (ObjectUtils.isEmpty(psDEMethodDTOFieldList)) {
			return;
		}

		for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {

			Object value = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
			if (ObjectUtils.isEmpty(value)) {
				continue;
			}

			if (iPSDEMethodDTOField.getPSDEField() != null) {
				// 判断是否为引用值
				if (iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupDEField) {
					IPSPickupDEField iPSPickupDEField = (IPSPickupDEField) iPSDEMethodDTOField.getPSDEField();
					if (iPSPickupDEField.getPSDERMust() instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSPickupDEField.getPSDERMust();
						if ((iPSDER1N.getMasterRS() & DER1NMasterRS.REFCHECK.value) == DER1NMasterRS.REFCHECK.value) {
							// 需要校验
							Set<Object> set = checkData.get(iPSDER1N.getMajorPSDataEntityMust().getId());
							if (set == null) {
								set = new HashSet<Object>();
								checkData.put(iPSDER1N.getMajorPSDataEntityMust().getId(), set);
							}
							set.add(value);
						}
					}
					continue;
				}

				if (iPSDEMethodDTOField.getPSDEField() instanceof IPSLinkDEField) {

					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEMethodDTOField.getPSDEField();
					if (iPSLinkDEField.getRelatedPSDEFieldMust() instanceof IPSPickupDEField) {
						IPSPickupDEField iPSPickupDEField = (IPSPickupDEField) iPSLinkDEField.getRelatedPSDEFieldMust();
						if (iPSPickupDEField.getPSDERMust() instanceof IPSDER1N) {
							IPSDER1N iPSDER1N = (IPSDER1N) iPSPickupDEField.getPSDERMust();
							if ((iPSDER1N.getMasterRS() & DER1NMasterRS.REFCHECK.value) == DER1NMasterRS.REFCHECK.value) {
								// 需要校验
								Set<Object> set = checkData.get(iPSDER1N.getMajorPSDataEntityMust().getId());
								if (set == null) {
									set = new HashSet<Object>();
									checkData.put(iPSDER1N.getMajorPSDataEntityMust().getId(), set);
								}
								set.add(value);
							}
						}
					}

					continue;
				}
			}

			if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

				if (iPSDEMethodDTOField.getRefPSDataEntity() == null) {
					continue;
				}

				IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
				if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) && iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupObjectDEField) {
					if (value instanceof IEntityDTO) {
						refDataEntityRuntime.fillEntityDTORefCheckData(checkData, (IEntityDTO) value);
					}
					continue;
				}

				Collection<?> collection = null;

				if (value instanceof List) {
					collection = (List) value;
				} else if (value instanceof Map) {
					collection = ((Map) value).values();
				}

				if (!ObjectUtils.isEmpty(collection)) {
					for (Object item : collection) {
						if (!(item instanceof IEntityDTO)) {
							continue;
						}

						refDataEntityRuntime.fillEntityDTORefCheckData(checkData, (IEntityDTO) item);
					}
				}

				continue;

			}
		}
	}

	/**
	 * 是否启用继承逻辑处理
	 *
	 * @return
	 */
	protected boolean isEnableInheritLogic() {
		if (this.isInheritMajor() || this.isInheritMinor()) {
			// 判断
			if (this.getStorageMode() == DEStorageModes.SERVICEAPI) {
				if (this.isInheritMinor() && this.getInheritDataEntityRuntime() != null) {
					// 判断主实体模式
					if (this.getInheritDataEntityRuntime().getStorageMode() == DEStorageModes.SERVICEAPI) {
						ISubSysServiceAPIRuntime subSysServiceAPIRuntime = ((IDataEntityRuntime) this.getInheritDataEntityRuntime()).getSubSysServiceAPIRuntime();
						ISubSysServiceAPIRuntime subSysServiceAPIRuntime2 = this.getSubSysServiceAPIRuntime();
						if (subSysServiceAPIRuntime != null && subSysServiceAPIRuntime2 != null) {
							return !subSysServiceAPIRuntime.getId().equals(subSysServiceAPIRuntime2.getId());
						}
					}
				}
			}

			return true;
		}
		return false;
	}

	@Override
	public ImportDataResult importData2(String strImportTag, IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			this.pushDataSource();
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			actionSession.beginLog(this.getName(), String.format("导入数据[%1$s]", strImportTag));

			ImportDataResult ret = this.onImportData2(strImportTag, baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);

			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getImportDataLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEDATAIMP, iActionSessionLog.toString(true), this.getName(), String.format("导入数据[%1$s]", strImportTag), iActionSessionLog.getTime(), iActionSessionLog);
					}
				}
				ActionSessionManager.closeSession(true);
			}

			return ret;

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				IActionSessionLog iActionSessionLog = actionSession.endLog(ex.getMessage(), true, ex);
				if (iActionSessionLog != null) {
					String strInfo = String.format("实体[%1$s]数据导入[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strImportTag, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEDATAIMP, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}
	}

	protected ImportDataResult onImportData2(String strImportTag, IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {

		IDEDataImportRuntime iDEDataImportRuntime = this.getDEDataImportRuntime(strImportTag);
		if (iDEDataImportRuntime instanceof IDEDataImportRuntime2) {
			return ((IDEDataImportRuntime2) iDEDataImportRuntime).importStream2(baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);
		}

		throw new Exception(String.format("对象[%1$s]未支持增强导入数据", iDEDataImportRuntime));
	}

	// @Override
	// protected int getDataSyncEvent(String strActionName, IPSDEAction
	// iPSDEAction) {
	// if(this.getSystemPersistentAdapter() == null) {
	// return DEDataSyncEvents.NONE;
	// }
	// return super.getDataSyncEvent(strActionName, iPSDEAction);
	// }

	/**
	 * 注册实体行为插件运行时对象接口
	 *
	 * @param strAction
	 * @param iAction
	 * @return
	 */
	protected IDEActionPluginRuntime registerDEActionPluginRuntime(String strAction, IAction iAction) {
		IDEActionPluginRuntime iDEActionPluginRuntime = new DEActionPluginRuntimeBase() {
			@Override
			protected Object onExecute(Object[] args) throws Throwable {
				return iAction.execute(args);
			}
		};

		this.registerDEActionPluginRuntime(strAction, iDEActionPluginRuntime);
		return iDEActionPluginRuntime;
	}

	/**
	 * 注册实体结果集插件运行时对象接口
	 *
	 * @param strDataSet
	 * @param iDataSet
	 * @return
	 */
	protected IDEDataSetPluginRuntime registerDEDataSetPluginRuntime(String strDataSet, IAction iAction) {
		IDEDataSetPluginRuntime iDEDataSetPluginRuntime = new DEDataSetPluginRuntimeBase() {
			@Override
			protected Object onFetch(Object[] args) throws Throwable {
				return iAction.execute(args);
			}
		};

		this.registerDEDataSetPluginRuntime(strDataSet, iDEDataSetPluginRuntime);
		return iDEDataSetPluginRuntime;
	}

	@Override
	public IPSDEAction getPSDEActionByCodeName(String actionCodeName, boolean bTryMode) {
		prepare();
		Object method = this.getMethod(actionCodeName);
		if (method instanceof IPSDEAction) {
			return (IPSDEAction) method;
		}
		if (bTryMode) {
			return null;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定代码名称[%1$s]实体行为", actionCodeName));
	}

	@Override
	public IPSDEDataSet getPSDEDataSetByCodeName(String dataSetCodeName, boolean bTryMode) {
		prepare();
		Object method = this.getMethod(dataSetCodeName);
		if (method instanceof IPSDEDataSet) {
			return (IPSDEDataSet) method;
		}
		if (bTryMode) {
			return null;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定代码名称[%1$s]实体数据集", dataSetCodeName));
	}

	@Override
	public IPSDEField getPSDEFieldByCodeName(String fieldCodeName, boolean bTryMode) {
		prepare();
		IPSDEField iPSDEField = this.psDEFieldMap2.get(fieldCodeName.toLowerCase());
		if (bTryMode || iPSDEField != null) {
			return iPSDEField;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定代码名称[%1$s]实体属性", fieldCodeName));
	}

	@Override
	protected boolean checkFieldValueRangeCondition(Object objValue, IEntityBase arg0, IPSDEFVRValueRangeCondition iPSDEFVRValueRangeCondition, IPSDEField iPSDEField) throws Throwable {

		if (ObjectUtils.isEmpty(objValue)) {
			return true;
		}

		String strRuleInfo = iPSDEFVRValueRangeCondition.getRuleInfo();
		boolean bTryMode = !iPSDEFVRValueRangeCondition.isKeyCond();

		IDataEntityRuntime dsDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEFVRValueRangeCondition.getMajorPSDataEntityMust().getId());

		ISearchContextDTO iSearchContextDTO = dsDataEntityRuntime.createSearchContext();
		iSearchContextDTO.count(false);
		iSearchContextDTO.limit(1);
		iSearchContextDTO.eq(dsDataEntityRuntime.getKeyPSDEField().getName(), objValue);
		if (iPSDEFVRValueRangeCondition.getExtMajorPSDEField() != null) {
			iSearchContextDTO.eq(iPSDEFVRValueRangeCondition.getExtMajorPSDEField().getName(), ((IEntityDTO) arg0).get(iPSDEFVRValueRangeCondition.getExtPSDEFieldMust().getName()));
		}

		Page page = (Page) dsDataEntityRuntime.fetchDataSet(iPSDEFVRValueRangeCondition.getMajorPSDEDataSetMust().getName(), iPSDEFVRValueRangeCondition.getMajorPSDEDataSetMust(), new Object[] { iSearchContextDTO });
		if (page != null && !ObjectUtils.isEmpty(page.getTotalElements())) {
			return true;
		}

		if (bTryMode) {
			return false;
		}

		throw createDEFVRConditionException(iPSDEFVRValueRangeCondition, strRuleInfo, MSG_CHECKFIELDDATASETRULE_INFO, iPSDEField);

	}

	@Override
	protected boolean checkFieldQueryCountCondition(Object objValue, IEntityBase arg0, IPSDEFVRQueryCountCondition iPSDEFVRQueryCountCondition, IPSDEField iPSDEField) throws Throwable {

		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		iEntityDTO.copyTo(iSearchContextDTO, false);

		Page<IEntityDTO> page = this.searchDataQuery(iPSDEFVRQueryCountCondition.getPSDEDataQueryMust(), iSearchContextDTO);
		int total = (int) ((page != null) ? page.getTotalElements() : 0);

		Integer nMinValue = iPSDEFVRQueryCountCondition.getMinValue();
		Integer nMaxValue = iPSDEFVRQueryCountCondition.getMaxValue();
		boolean bIncMinValue = iPSDEFVRQueryCountCondition.isIncludeMinValue();
		boolean bIncMaxValue = iPSDEFVRQueryCountCondition.isIncludeMaxValue();
		boolean bTryMode = !iPSDEFVRQueryCountCondition.isKeyCond();
		String strRuleInfo = iPSDEFVRQueryCountCondition.getRuleInfo();

		if (nMinValue != null) {
			if (bIncMinValue) {
				if (total < nMinValue) {
					if (bTryMode)
						return false;

					throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
				}
			} else {
				if (total <= nMinValue) {
					if (bTryMode)
						return false;

					throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
				}
			}
		}

		if (nMaxValue != null) {
			if (bIncMaxValue) {
				if (total > nMaxValue) {
					if (bTryMode)
						return false;

					throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
				}
			} else {
				if (total >= nMaxValue) {
					if (bTryMode)
						return false;

					throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
				}
			}
		}

		return true;

	}

	@Override
	protected boolean checkFieldValueRecursionCondition(Object objValue, IEntityBase arg0, IPSDEFVRValueRecursionCondition iPSDEFVRValueRecursionCondition, IPSDEField iPSDEField) throws Throwable {

		Assert.notNull(iPSDEField, "未传入属性模型对象");

		String strRuleInfo = iPSDEFVRValueRecursionCondition.getRuleInfo();
		boolean bTryMode = !iPSDEFVRValueRecursionCondition.isKeyCond();
		if (ObjectUtils.isEmpty(objValue)) {
			return true;
		}

		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		Object objKey = iEntityDTO.get(this.getKeyPSDEField().getName());
		if (ObjectUtils.isEmpty(objKey)) {
			return true;
		}

		if (DataTypeUtils.compare(this.getKeyPSDEField().getStdDataType(), objValue, objKey) == 0) {
			if (bTryMode) {
				return false;
			}
			throw createDEFVRConditionException(iPSDEFVRValueRecursionCondition, strRuleInfo, MSG_CHECKFIELDRECURSIONRULE_INFO, iPSDEField);
		}

		while (true) {
			IEntityDTO parentEntity = this.get(objValue);
			objValue = parentEntity.get(iPSDEField.getName());
			if (ObjectUtils.isEmpty(objValue)) {
				return true;
			}

			if (DataTypeUtils.compare(this.getKeyPSDEField().getStdDataType(), objValue, objKey) == 0) {
				if (bTryMode) {
					return false;
				}
				throw createDEFVRConditionException(iPSDEFVRValueRecursionCondition, strRuleInfo, MSG_CHECKFIELDRECURSIONRULE_INFO, iPSDEField);
			}
		}
	}

	@Override
	public synchronized void registerDEActionLogicRuntime(String strAction, IDEActionLogicRuntime iDEActionLogicRuntime) {

		Assert.hasLength(strAction, "未传入附加的行为标识");
		Assert.notNull(iDEActionLogicRuntime, "未传入附加的行为逻辑运行时对象");

		if (this.deActionLogicRuntimeListMap == null) {
			this.deActionLogicRuntimeListMap = new ConcurrentHashMap<String, List<IDEActionLogicRuntime>>();
		}

		List<IDEActionLogicRuntime> newList = new ArrayList<IDEActionLogicRuntime>();
		List<IDEActionLogicRuntime> list = this.deActionLogicRuntimeListMap.get(strAction.toUpperCase());
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDEActionLogicRuntime);
		this.deActionLogicRuntimeListMap.put(strAction.toUpperCase(), newList);
	}

	@Override
	public synchronized boolean unregisterDEActionLogicRuntime(String strAction, IDEActionLogicRuntime iDEActionLogicRuntime) {
		Assert.hasLength(strAction, "未传入附加的行为标识");
		Assert.notNull(iDEActionLogicRuntime, "未传入附加的行为逻辑运行时对象");

		if (this.deActionLogicRuntimeListMap != null) {
			List<IDEActionLogicRuntime> newList = new ArrayList<IDEActionLogicRuntime>();
			List<IDEActionLogicRuntime> list = this.deActionLogicRuntimeListMap.get(strAction.toUpperCase());
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDEActionLogicRuntime);
			this.deActionLogicRuntimeListMap.put(strAction.toUpperCase(), newList);
			return bRet;
		}

		return false;
	}

	protected List<IDEActionLogicRuntime> getDEActionLogicRuntimes(String strAction) {
		if (this.deActionLogicRuntimeListMap != null) {
			return this.deActionLogicRuntimeListMap.get(strAction.toUpperCase());
		}
		return null;
	}

	protected IDEActionLogicRuntime registerPSDEActionLogic(IPSDEActionLogic iPSDEActionLogic) throws Exception {

		IDEActionLogicRuntime iDEActionLogicRuntime = this.createDEActionLogicRuntime(iPSDEActionLogic);
		if (iDEActionLogicRuntime == null) {
			return null;
		}

		iDEActionLogicRuntime.init(this.getDataEntityRuntimeContext(), iPSDEActionLogic);
		if (this.deActionLogicRuntimeMap == null) {
			this.deActionLogicRuntimeMap = new ConcurrentHashMap<IPSDEActionLogic, IDEActionLogicRuntime>();
		}
		this.deActionLogicRuntimeMap.put(iPSDEActionLogic, iDEActionLogicRuntime);
		return iDEActionLogicRuntime;
	}

	protected IDEActionLogicRuntime createDEActionLogicRuntime(IPSDEActionLogic iPSDEActionLogic) {
		IPSSysSFPlugin iPSSysSFPlugin = iPSDEActionLogic.getPSSysSFPlugin();
		if (iPSSysSFPlugin == null) {
			return null;
		}

		return this.getSystemRuntime().getRuntimeObject(iPSSysSFPlugin, IDEActionLogicRuntime.class, true);
	}

	protected IDEActionLogicRuntime getDEActionLogicRuntime(IPSDEActionLogic iPSDEActionLogic) {
		if (this.deActionLogicRuntimeMap != null) {
			return this.deActionLogicRuntimeMap.get(iPSDEActionLogic);
		}
		return null;
	}

	@Override
	public synchronized void registerDEActionLogicRuntimeBase(String strAction, IDEActionLogicRuntimeBase iDEActionLogicRuntime) {

		Assert.hasLength(strAction, "未传入附加的行为标识");
		Assert.notNull(iDEActionLogicRuntime, "未传入附加的行为逻辑运行时对象");

		if (this.deActionLogicRuntimeBaseListMap == null) {
			this.deActionLogicRuntimeBaseListMap = new ConcurrentHashMap<String, List<IDEActionLogicRuntimeBase>>();
		}

		List<IDEActionLogicRuntimeBase> newList = new ArrayList<IDEActionLogicRuntimeBase>();
		List<IDEActionLogicRuntimeBase> list = this.deActionLogicRuntimeBaseListMap.get(strAction.toUpperCase());
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDEActionLogicRuntime);
		this.deActionLogicRuntimeBaseListMap.put(strAction.toUpperCase(), newList);
	}

	@Override
	public synchronized boolean unregisterDEActionLogicRuntimeBase(String strAction, IDEActionLogicRuntimeBase iDEActionLogicRuntime) {
		Assert.hasLength(strAction, "未传入附加的行为标识");
		Assert.notNull(iDEActionLogicRuntime, "未传入附加的行为逻辑运行时对象");

		if (this.deActionLogicRuntimeBaseListMap != null) {
			List<IDEActionLogicRuntimeBase> newList = new ArrayList<IDEActionLogicRuntimeBase>();
			List<IDEActionLogicRuntimeBase> list = this.deActionLogicRuntimeBaseListMap.get(strAction.toUpperCase());
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDEActionLogicRuntime);
			this.deActionLogicRuntimeBaseListMap.put(strAction.toUpperCase(), newList);
			return bRet;
		}

		return false;
	}

	protected List<IDEActionLogicRuntimeBase> getDEActionLogicRuntimeBases(String strAction) {
		if (this.deActionLogicRuntimeBaseListMap != null) {
			return this.deActionLogicRuntimeBaseListMap.get(strAction.toUpperCase());
		}
		return null;
	}

	@Override
	public synchronized void registerDEDataSetLogicRuntimeBase(String strDataSet, IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntime) {

		Assert.hasLength(strDataSet, "未传入附加的数据集标识");
		Assert.notNull(iDEDataSetLogicRuntime, "未传入附加的数据集逻辑运行时对象");

		if (this.deDataSetLogicRuntimeBaseListMap == null) {
			this.deDataSetLogicRuntimeBaseListMap = new ConcurrentHashMap<String, List<IDEDataSetLogicRuntimeBase>>();
		}

		List<IDEDataSetLogicRuntimeBase> newList = new ArrayList<IDEDataSetLogicRuntimeBase>();
		List<IDEDataSetLogicRuntimeBase> list = this.deDataSetLogicRuntimeBaseListMap.get(strDataSet.toUpperCase());
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDEDataSetLogicRuntime);
		this.deDataSetLogicRuntimeBaseListMap.put(strDataSet.toUpperCase(), newList);
	}

	@Override
	public synchronized boolean unregisterDEDataSetLogicRuntimeBase(String strDataSet, IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntime) {
		Assert.hasLength(strDataSet, "未传入附加的数据集标识");
		Assert.notNull(iDEDataSetLogicRuntime, "未传入附加的数据集逻辑运行时对象");

		if (this.deDataSetLogicRuntimeBaseListMap != null) {
			List<IDEDataSetLogicRuntimeBase> newList = new ArrayList<IDEDataSetLogicRuntimeBase>();
			List<IDEDataSetLogicRuntimeBase> list = this.deDataSetLogicRuntimeBaseListMap.get(strDataSet.toUpperCase());
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDEDataSetLogicRuntime);
			this.deDataSetLogicRuntimeBaseListMap.put(strDataSet.toUpperCase(), newList);
			return bRet;
		}

		return false;
	}

	protected List<IDEDataSetLogicRuntimeBase> getDEDataSetLogicRuntimeBases(String strDataSet) {
		if (this.deDataSetLogicRuntimeBaseListMap != null) {
			return this.deDataSetLogicRuntimeBaseListMap.get(strDataSet.toUpperCase());
		}
		return null;
	}

	@Override
	public synchronized void registerDEDataSyncOutRuntimeBase(IDEDataSyncOutRuntimeBase iDEDataSyncOutRuntime) {

		Assert.notNull(iDEDataSyncOutRuntime, "未传入实体数据同步输出运行时对象");

		if (this.deDataSyncOutRuntimeBaseListMap == null) {
			this.deDataSyncOutRuntimeBaseListMap = new ConcurrentHashMap<String, List<IDEDataSyncOutRuntimeBase>>();
		}

		List<IDEDataSyncOutRuntimeBase> newList = new ArrayList<IDEDataSyncOutRuntimeBase>();
		List<IDEDataSyncOutRuntimeBase> list = this.deDataSyncOutRuntimeBaseListMap.get(DEFAULTTAG);
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDEDataSyncOutRuntime);
		this.deDataSyncOutRuntimeBaseListMap.put(DEFAULTTAG, newList);
	}

	@Override
	public synchronized boolean unregisterDEDataSyncOutRuntimeBase(IDEDataSyncOutRuntimeBase iDEDataSyncOutRuntime) {

		Assert.notNull(iDEDataSyncOutRuntime, "未传入实体数据同步输出运行时对象");

		if (this.deDataSyncOutRuntimeBaseListMap != null) {
			List<IDEDataSyncOutRuntimeBase> newList = new ArrayList<IDEDataSyncOutRuntimeBase>();
			List<IDEDataSyncOutRuntimeBase> list = this.deDataSyncOutRuntimeBaseListMap.get(DEFAULTTAG);
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDEDataSyncOutRuntime);
			this.deDataSyncOutRuntimeBaseListMap.put(DEFAULTTAG, newList);
			return bRet;
		}

		return false;
	}

	protected List<IDEDataSyncOutRuntimeBase> getDEDataSyncOutRuntimeBases() {
		if (this.deDataSyncOutRuntimeBaseListMap != null) {
			return this.deDataSyncOutRuntimeBaseListMap.get(DEFAULTTAG);
		}
		return null;
	}

	@Override
	public synchronized void registerDEUniStateRuntimeBase(IDEUniStateRuntimeBase iDEUniStateRuntime) {

		Assert.notNull(iDEUniStateRuntime, "未传入实体统一状态运行时对象");

		if (this.deUniStateRuntimeBaseListMap == null) {
			this.deUniStateRuntimeBaseListMap = new ConcurrentHashMap<String, List<IDEUniStateRuntimeBase>>();
		}

		List<IDEUniStateRuntimeBase> newList = new ArrayList<IDEUniStateRuntimeBase>();
		List<IDEUniStateRuntimeBase> list = this.deUniStateRuntimeBaseListMap.get(DEFAULTTAG);
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDEUniStateRuntime);
		this.deUniStateRuntimeBaseListMap.put(DEFAULTTAG, newList);
	}

	@Override
	public synchronized boolean unregisterDEUniStateRuntimeBase(IDEUniStateRuntimeBase iDEUniStateRuntime) {

		Assert.notNull(iDEUniStateRuntime, "未传入实体统一状态运行时对象");

		if (this.deUniStateRuntimeBaseListMap != null) {
			List<IDEUniStateRuntimeBase> newList = new ArrayList<IDEUniStateRuntimeBase>();
			List<IDEUniStateRuntimeBase> list = this.deUniStateRuntimeBaseListMap.get(DEFAULTTAG);
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDEUniStateRuntime);
			this.deUniStateRuntimeBaseListMap.put(DEFAULTTAG, newList);
			return bRet;
		}

		return false;
	}

	protected List<IDEUniStateRuntimeBase> getDEUniStateRuntimeBases() {
		if (this.deUniStateRuntimeBaseListMap != null) {
			return this.deUniStateRuntimeBaseListMap.get(DEFAULTTAG);
		}
		return null;
	}

	@Override
	public synchronized void registerDataEntityInheritLogic(IDataEntityInheritLogic iDataEntityInheritLogic) {

		Assert.notNull(iDataEntityInheritLogic, "未传入实体继承逻辑对象");

		if (this.dataEntityInheritLogicListMap == null) {
			this.dataEntityInheritLogicListMap = new ConcurrentHashMap<String, List<IDataEntityInheritLogic>>();
		}

		List<IDataEntityInheritLogic> newList = new ArrayList<IDataEntityInheritLogic>();
		List<IDataEntityInheritLogic> list = this.dataEntityInheritLogicListMap.get(DEFAULTTAG);
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDataEntityInheritLogic);
		this.dataEntityInheritLogicListMap.put(DEFAULTTAG, Collections.unmodifiableList(newList));
	}

	@Override
	public synchronized boolean unregisterDataEntityInheritLogic(IDataEntityInheritLogic iDataEntityInheritLogic) {

		Assert.notNull(iDataEntityInheritLogic, "未传入实体继承逻辑对象");

		if (this.dataEntityInheritLogicListMap != null) {
			List<IDataEntityInheritLogic> newList = new ArrayList<IDataEntityInheritLogic>();
			List<IDataEntityInheritLogic> list = this.dataEntityInheritLogicListMap.get(DEFAULTTAG);
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDataEntityInheritLogic);
			this.dataEntityInheritLogicListMap.put(DEFAULTTAG, Collections.unmodifiableList(newList));
			return bRet;
		}

		return false;
	}

	@Override
	public List<IDataEntityInheritLogic> getDataEntityInheritLogics() {
		if (this.dataEntityInheritLogicListMap != null) {
			return this.dataEntityInheritLogicListMap.get(DEFAULTTAG);
		}
		return null;
	}

	@Override
	public synchronized void registerDataEntityExtendLogic(IDataEntityExtendLogic iDataEntityExtendLogic) {

		Assert.notNull(iDataEntityExtendLogic, "未传入实体扩展逻辑对象");

		if (this.dataEntityExtendLogicListMap == null) {
			this.dataEntityExtendLogicListMap = new ConcurrentHashMap<String, List<IDataEntityExtendLogic>>();
		}

		List<IDataEntityExtendLogic> newList = new ArrayList<IDataEntityExtendLogic>();
		List<IDataEntityExtendLogic> list = this.dataEntityExtendLogicListMap.get(DEFAULTTAG);
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDataEntityExtendLogic);
		this.dataEntityExtendLogicListMap.put(DEFAULTTAG, Collections.unmodifiableList(newList));
		try {
			this.prepareExtendedPSDEFieldList(list);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("准备实体扩展属性列表发生异常， %1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public synchronized boolean unregisterDataEntityExtendLogic(IDataEntityExtendLogic iDataEntityExtendLogic) {

		Assert.notNull(iDataEntityExtendLogic, "未传入实体扩展逻辑对象");

		if (this.dataEntityExtendLogicListMap != null) {
			List<IDataEntityExtendLogic> newList = new ArrayList<IDataEntityExtendLogic>();
			List<IDataEntityExtendLogic> list = this.dataEntityExtendLogicListMap.get(DEFAULTTAG);
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDataEntityExtendLogic);
			this.dataEntityExtendLogicListMap.put(DEFAULTTAG, Collections.unmodifiableList(newList));
			if (bRet) {
				try {
					this.prepareExtendedPSDEFieldList(list);
				} catch (Exception ex) {
					throw new DataEntityRuntimeException(this, String.format("准备实体扩展属性列表发生异常， %1$s", ex.getMessage()), ex);
				}
			}
			return bRet;
		}

		return false;
	}

	@Override
	public List<IDataEntityExtendLogic> getDataEntityExtendLogics() {
		if (this.dataEntityExtendLogicListMap != null) {
			return this.dataEntityExtendLogicListMap.get(DEFAULTTAG);
		}
		return null;
	}

	protected void prepareExtendedPSDEFieldList(List<IDataEntityExtendLogic> list) throws Exception {
		// 加入
		Map<String, IPSDEField> psDEFieldMap = new LinkedHashMap<String, IPSDEField>();
		Map<String, IPSDEField> dynaStoragePSDEFieldMap = new LinkedHashMap<String, IPSDEField>();
		Map<String, IPSDEField> attachmentPSDEFieldMap = new LinkedHashMap<String, IPSDEField>();
		List<IPSDEField> psDEFieldList = this.getPSDEFields();
		for (IPSDEField iPSDEField : psDEFieldList) {
			psDEFieldMap.put(iPSDEField.getName(), iPSDEField);
		}

		List<IPSDEField> dynaStoragePSDEFieldList = this.getDynaStoragePSDEFields();
		if (!ObjectUtils.isEmpty(dynaStoragePSDEFieldList)) {
			for (IPSDEField iPSDEField : dynaStoragePSDEFieldList) {
				dynaStoragePSDEFieldMap.put(iPSDEField.getName(), iPSDEField);
			}
		}
		
		List<IPSDEField> attachmentPSDEFieldList = this.getAttachmentPSDEFields();
		if (!ObjectUtils.isEmpty(attachmentPSDEFieldList)) {
			for (IPSDEField iPSDEField : attachmentPSDEFieldList) {
				attachmentPSDEFieldMap.put(iPSDEField.getName(), iPSDEField);
			}
		}
		

		final List<IDataEntityExtendLogic> dataEntityExtendLogicList = this.getDataEntityExtendLogics();
		if (!ObjectUtils.isEmpty(dataEntityExtendLogicList)) {
			for (IDataEntityExtendLogic iDataEntityExtendLogic : dataEntityExtendLogicList) {
				List<IPSDEField> psDEFieldList2 = iDataEntityExtendLogic.getPSDEFields();
				if (!ObjectUtils.isEmpty(psDEFieldList2)) {
					for (IPSDEField iPSDEField : psDEFieldList2) {
						if (psDEFieldMap.containsKey(iPSDEField.getName())) {
							continue;
						}

						IPSDEField iPSDEField2 = this.cloneExtendedPSDEField(iDataEntityExtendLogic, iPSDEField, null);
						if (iPSDEField2 == null) {
							continue;
						}

						// 判断类型，构建新属性
						psDEFieldMap.put(iPSDEField2.getName(), iPSDEField2);
						if(this.isDynaStoragePSDEField(iPSDEField2, false)) {
							dynaStoragePSDEFieldMap.put(iPSDEField.getName(), iPSDEField2);
						}
						if(this.isAttachmentPSDEField(iPSDEField2, false)) {
							attachmentPSDEFieldMap.put(iPSDEField.getName(), iPSDEField2);
						}
					}
				}
			}
		}

		this.extendedPSDEFieldList = java.util.Collections.unmodifiableList(new ArrayList<IPSDEField>(psDEFieldMap.values()));
		this.extendedDynaStoragePSDEFieldList = java.util.Collections.unmodifiableList(new ArrayList<IPSDEField>(dynaStoragePSDEFieldMap.values()));
		this.extendedAttachmentPSDEFieldList = java.util.Collections.unmodifiableList(new ArrayList<IPSDEField>(attachmentPSDEFieldMap.values()));
	}
	
	/**
	 * 是否附件存储属性
	 * @param iPSDEField
	 * @return
	 */
	protected boolean isAttachmentPSDEField(IPSDEField iPSDEField, boolean bInherit) {
		IPSDEField realPSDEField = iPSDEField;
		if(bInherit) {
			while (realPSDEField instanceof IPSInheritDEField) {
				realPSDEField = ((IPSInheritDEField) realPSDEField).getRelatedPSDEFieldMust();
			}
		}
		String strDataType = realPSDEField.getDataType();
		if(DEFDataType.FILE.value.equals(strDataType)
				|| DEFDataType.FILELIST.value.equals(strDataType)
				|| DEFDataType.LONGFILELIST.value.equals(strDataType)
				|| DEFDataType.PICTURE.value.equals(strDataType)
				|| DEFDataType.PICTURELIST.value.equals(strDataType)
				|| DEFDataType.LONGPICTURELIST.value.equals(strDataType)) {
			return true;
		}
		return false;
	}
	
	protected boolean isDynaStoragePSDEField(IPSDEField iPSDEField, boolean bInherit) {
		IPSDEField realPSDEField = iPSDEField;
		if(bInherit) {
			while (realPSDEField instanceof IPSInheritDEField) {
				realPSDEField = ((IPSInheritDEField) realPSDEField).getRelatedPSDEFieldMust();
			}
		}
		return realPSDEField.isDynaStorageDEField();
	}

	protected IPSDEField cloneExtendedPSDEField(IDataEntityExtendLogic iDataEntityExtendLogic, IPSDEField iPSDEField, ObjectNode psDEFieldNode) throws Exception {
		if (psDEFieldNode == null) {
			if (iPSDEField.getDEFType() != DEFType.DYNASTORAGE.value && iPSDEField.getDEFType() != DEFType.PHISICAL.value) {
				return null;
			}
			psDEFieldNode = iPSDEField.getObjectNode().deepCopy();
			psDEFieldNode.put(PSDEFieldImpl.ATTR_GETDEFTYPE, DEFType.DYNASTORAGE.value);
			psDEFieldNode.put(PSDEFieldImpl.ATTR_ISDYNASTORAGEDEFIELD, true);
			psDEFieldNode.put(PSDEFieldImpl.ATTR_GETEXTENDMODE, DEExtendMode.SUBSYSEXTEND.value);
		}

		return this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getPSDataEntity(), IPSDEField.class, psDEFieldNode);
	}

	@Override
	public synchronized void registerDERRuntimeBase(IDERRuntimeBase iDERRuntime) {

		Assert.notNull(iDERRuntime, "未传入实体关系运行时对象");

		if (this.derRuntimeBaseListMap == null) {
			this.derRuntimeBaseListMap = new ConcurrentHashMap<String, List<IDERRuntimeBase>>();
		}

		List<IDERRuntimeBase> newList = new ArrayList<IDERRuntimeBase>();
		List<IDERRuntimeBase> list = this.derRuntimeBaseListMap.get(DEFAULTTAG);
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDERRuntime);
		this.derRuntimeBaseListMap.put(DEFAULTTAG, newList);
	}

	@Override
	public synchronized boolean unregisterDERRuntimeBase(IDERRuntimeBase iDERRuntime) {

		Assert.notNull(iDERRuntime, "未传入实体关系运行时对象");

		if (this.derRuntimeBaseListMap != null) {
			List<IDERRuntimeBase> newList = new ArrayList<IDERRuntimeBase>();
			List<IDERRuntimeBase> list = this.derRuntimeBaseListMap.get(DEFAULTTAG);
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDERRuntime);
			this.derRuntimeBaseListMap.put(DEFAULTTAG, newList);
			return bRet;
		}

		return false;
	}

	protected List<IDERRuntimeBase> getDERRuntimeBases() {
		if (this.derRuntimeBaseListMap != null) {
			return this.derRuntimeBaseListMap.get(DEFAULTTAG);
		}
		return null;
	}

	@Override
	protected Object executeActionLogics(Object[] args, Object ret, IPSDEAction iPSDEAction, String strAttachMode, net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		ret = super.executeActionLogics(args, ret, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);

		// 获取附加逻辑
		List<IDEActionLogicRuntimeBase> list = this.getDEActionLogicRuntimeBases(iPSDEAction.getName());
		if (!ObjectUtils.isEmpty(list)) {
			for (IDEActionLogicRuntimeBase iDEActionLogicRuntimeBase : list) {
				if (!strAttachMode.equalsIgnoreCase(iDEActionLogicRuntimeBase.getAttachMode())) {
					continue;
				}

				ret = iDEActionLogicRuntimeBase.execute(this.getDataEntityRuntimeContext(), iPSDEAction, args, ret);
			}
		}

		List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			try {
				DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
				for (IDataEntityInheritLogic iDataEntityInheritLogic : dataEntityInheritLogicList) {
					ret = iDataEntityInheritLogic.executeActionLogics(this.getDataEntityRuntimeContext(), args, ret, iPSDEAction, strAttachMode);
				}
			} finally {
				DataEntityRuntimeHolder.pollChildDataEntityRuntime();
			}
		}

		return ret;
	}

	@Override
	protected void executeActionLogics(IEntityBase arg0, IPSDEAction iPSDEAction, String strAttachMode, net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.executeActionLogics(arg0, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);

		// 获取附加逻辑
		List<IDEActionLogicRuntime> list = this.getDEActionLogicRuntimes(iPSDEAction.getName());
		if (ObjectUtils.isEmpty(list)) {
			return;
		}

		for (IDEActionLogicRuntime iDEActionLogicRuntime : list) {
			if (!strAttachMode.equalsIgnoreCase(iDEActionLogicRuntime.getAttachMode())) {
				continue;
			}

			iDEActionLogicRuntime.execute(arg0);
		}
	}

	@Override
	protected boolean isEnableActionLogic(IPSDEAction iPSDEAction, String strAttachMode) {
		if (super.isEnableActionLogic(iPSDEAction, strAttachMode)) {
			return true;
		}

		List<IDataEntityInheritLogic> dataEntityInheritLogicList = this.getDataEntityInheritLogics();
		if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
			return true;
		}

		List<IDEActionLogicRuntime> list = this.getDEActionLogicRuntimes(iPSDEAction.getName());
		if (!ObjectUtils.isEmpty(list)) {
			for (IDEActionLogicRuntime iDEActionLogicRuntime : list) {
				if (strAttachMode.equals(iDEActionLogicRuntime.getAttachMode())) {
					return true;
				}
			}
		}

		List<IDEActionLogicRuntimeBase> list2 = this.getDEActionLogicRuntimeBases(iPSDEAction.getName());
		if (!ObjectUtils.isEmpty(list2)) {
			for (IDEActionLogicRuntimeBase iDEActionLogicRuntimeBase : list2) {
				if (strAttachMode.equals(iDEActionLogicRuntimeBase.getAttachMode())) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	protected Object executeDataSetLogics(Object[] args, Object ret, IPSDEDataSet iPSDEDataSet, String strAttachMode, net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		ret = super.executeDataSetLogics(args, ret, iPSDEDataSet, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);

		// 获取附加逻辑
		List<IDEDataSetLogicRuntimeBase> list = this.getDEDataSetLogicRuntimeBases(iPSDEDataSet.getName());
		if (!ObjectUtils.isEmpty(list)) {
			for (IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntime : list) {
				if (!strAttachMode.equalsIgnoreCase(iDEDataSetLogicRuntime.getAttachMode())) {
					continue;
				}

				ret = iDEDataSetLogicRuntime.execute(this.getDataEntityRuntimeContext(), iPSDEDataSet, args, ret);
			}
		}
		return ret;
	}

	@Override
	protected boolean isEnableDataSetLogic(IPSDEDataSet iPSDEDataSet, String strAttachMode) {

		if (super.isEnableDataSetLogic(iPSDEDataSet, strAttachMode)) {
			return true;
		}

		List<IDEDataSetLogicRuntimeBase> list = this.getDEDataSetLogicRuntimeBases(iPSDEDataSet.getName());
		if (ObjectUtils.isEmpty(list)) {
			return false;
		}

		for (IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntimeBase : list) {
			if (strAttachMode.equals(iDEDataSetLogicRuntimeBase.getAttachMode())) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 填充EntityDTO分页对象嵌套属性
	 * 
	 * @param page
	 * @param iPSDEDataSet
	 * @throws Throwable
	 */
	@Override
	public void fillEntityDTOPageNestedFields(Page<? extends IEntityDTO> page, IPSDEDataSet iPSDEDataSet) throws Throwable {
		Assert.notNull(page, "传入数据分页对象无效");
		this.fillEntityDTONestedFields(page.getContent(), iPSDEDataSet);
	}

	/**
	 * 填充EntityDTO分页对象嵌套属性
	 * 
	 * @param list
	 * @param iPSDEDataSet
	 * @throws Throwable
	 */
	@Override
	public void fillEntityDTONestedFields(List<? extends IEntityDTO> list, IPSDEDataSet iPSDEDataSet) throws Throwable {
		Assert.notNull(iPSDEDataSet, "传入数据集合模型对象无效");

		if (iPSDEDataSet.getGroupMode() != DEDataSetGroupMode.NONE.value) {
			return;
		}

		if (iPSDEDataSet.getViewLevel() == DEDataQueryViewLevel.DEFGROUP.value && iPSDEDataSet.getPSDEFGroup() != null) {
			this.fillEntityDTONestedFields(list, iPSDEDataSet.getPSDEFGroup());
			return;
		}

		if (iPSDEDataSet.getViewLevel() == DEDataQueryViewLevel.ALL.value) {
			this.fillEntityDTONestedFields(list, (IPSDEFGroup) null);
			return;
		}
	}

	@Override
	public void fillEntityDTONestedFields(List<? extends IEntityDTO> list, IPSDEFGroup iPSDEFGroup) throws Throwable {

		if (ObjectUtils.isEmpty(list)) {
			return;
		}

		IEntityDTO firstEntityDTO = list.get(0);
		if (firstEntityDTO.getDEMethodDTORuntime() != null) {
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = firstEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
			if (psDEMethodDTOFieldList != null) {

				IDEFGroupRuntime iDEFGroupRuntime = null;
				if (iPSDEFGroup != null && !ObjectUtils.isEmpty(iPSDEFGroup.getPSDEFGroupDetails())) {
					iDEFGroupRuntime = this.getDEFGroupRuntime(iPSDEFGroup, false);
				}

				for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {

					if (iDEFGroupRuntime != null) {
						if (iPSDEMethodDTOField.getPSDEField() == null) {
							continue;
						}
						if (!iDEFGroupRuntime.contains(iPSDEMethodDTOField.getPSDEField())) {
							continue;
						}
					}

					if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

						if (iPSDEMethodDTOField.getRefPSDataEntity() == null) {
							// iPSDEMethodDTOField.getPSDEField()
							continue;
						}

						IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
						if (refDataEntityRuntime.getStorageMode() == DEStorageModes.NONE && refDataEntityRuntime.getVirtualMode() != DEVirtualModes.MINHERIT) {
							continue;
						}

						if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) && iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupObjectDEField) {

							IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField) iPSDEMethodDTOField.getPSDEField();
							IPSDERBase iPSDERBase = iPSPickupObjectDEField.getPSDERMust();
							// 从实体中获取指定关系的属性
							IPSDEField pickupPSDEField = null;
							IPSDEDataSet refPSDEDataSet = null;
							IPSDEField parentTypePSDEField = null;
							IPSDEField parentSubTypePSDEField = null;
							String strParentType = null;
							String strParentSubType = null;

							if (iPSDERBase instanceof IPSDER1N) {
								pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
								refPSDEDataSet = ((IPSDER1N) iPSDERBase).getRefPSDEDataSet();
							} else if (iPSDERBase instanceof IPSDERCustom) {
								pickupPSDEField = ((IPSDERCustom) iPSDERBase).getPickupPSDEField();
								refPSDEDataSet = ((IPSDERCustom) iPSDERBase).getRefPSDEDataSet();

								parentTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, true);
								if (parentTypePSDEField != null) {
									strParentType = ((IPSDERCustom) iPSDERBase).getParentType();
									if (!StringUtils.hasLength(strParentType)) {
										// strParentType =
										// refDataEntityRuntime.getName();
										strParentType = refDataEntityRuntime.getDERParentType();
									}
								}
								parentSubTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
								if (parentSubTypePSDEField != null) {
									strParentSubType = ((IPSDERCustom) iPSDERBase).getParentSubType();
									if (!StringUtils.hasLength(strParentSubType)) {
										strParentSubType = iPSDERBase.getMinorCodeName();
									}
								}

							}
							if (pickupPSDEField == null) {
								// throw new DataEntityRuntimeException(this,
								// iEntityDTO.getDEMethodDTORuntime(),
								// String.format("属性[%1$s]没有定义DTO连接属性",
								// iPSDEMethodDTOField.getName()));
								log.warn(String.format("属性[%1$s]没有定义DTO连接属性，忽略默认处理", iPSDEMethodDTOField.getName()));
								continue;
							}

							MultiValueMap<Object, IEntityDTO> entityDTOMap = new LinkedMultiValueMap<Object, IEntityDTO>();
							for (IEntityDTO iEntityDTO : list) {
								Object objKeyValue = iEntityDTO.get(pickupPSDEField.getLowerCaseName());
								if (ObjectUtils.isEmpty(objKeyValue)) {
									continue;
								}
								if (parentTypePSDEField != null) {
									Object parentType = iEntityDTO.get(parentTypePSDEField.getLowerCaseName());
									if (!strParentType.equals(parentType)) {
										continue;
									}
								}

								if (parentSubTypePSDEField != null && StringUtils.hasLength(strParentSubType)) {
									Object parentSubType = iEntityDTO.get(parentSubTypePSDEField.getLowerCaseName());
									if (!strParentSubType.equals(parentSubType)) {
										continue;
									}
								}
								entityDTOMap.add(objKeyValue, iEntityDTO);
							}

							if (ObjectUtils.isEmpty(entityDTOMap)) {
								continue;
							}

							ISearchContextDTO iSearchContextDTO = refDataEntityRuntime.createSearchContext();
							iSearchContextDTO.all().count(false);
							if (entityDTOMap.size() == 1) {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, refDataEntityRuntime.getKeyPSDEField(), Conditions.EQ, entityDTOMap.keySet().iterator().next());
							} else {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, refDataEntityRuntime.getKeyPSDEField(), Conditions.IN, entityDTOMap.keySet());
							}

							List<IEntityDTO> allList = null;
							if (refPSDEDataSet != null) {
								allList = refDataEntityRuntime.selectDataSet(refPSDEDataSet, iSearchContextDTO);
							} else {
								allList = refDataEntityRuntime.select(iSearchContextDTO);
							}

							if (!ObjectUtils.isEmpty(allList)) {
								// 逐个放入
								for (IEntityDTO item : allList) {
									Object objKey = item.get(refDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
									List<IEntityDTO> lastList = entityDTOMap.get(objKey);
									if (lastList == null) {
										continue;
									}
									for (IEntityDTO iEntityDTO : lastList) {
										iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), item);
									}
								}
							}
							continue;
						}

						// 找到外键
						IPSDEField relatedPickupPSDEField = null;
						IPSDERBase relatedPSDERBase = null;
						IPSDEField pickupPSDEField = null;
						IPSDEField parentTypePSDEField = null;
						IPSDEField parentSubTypePSDEField = null;
						String strParentType = null;
						String strParentSubType = null;
						IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
						if (iPSDERBase == null) {
							if (iPSDEMethodDTOField.getRelatedPSDEMethodDTOField() != null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER() != null) {
								iPSDERBase = iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER();
								if (iPSDEMethodDTOField.getPSDEField() instanceof IPSLinkDEField) {
									relatedPSDERBase = ((IPSLinkDEField) iPSDEMethodDTOField.getPSDEField()).getPSDER();
									if (relatedPSDERBase instanceof IPSDER1NBase) {
										IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) relatedPSDERBase;
										relatedPickupPSDEField = iPSDER1NBase.getPickupPSDEFieldMust();
									}
								}
							}

							if (iPSDERBase == null || relatedPSDERBase == null) {
								iPSDERBase = iPSDEMethodDTOField.getPSDERMust();
							}
						}
						IPSDEDataSet nestedPSDEDataSet = null;
						if (iPSDERBase instanceof IPSDER1N) {
							pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
							nestedPSDEDataSet = ((IPSDER1N) iPSDERBase).getNestedPSDEDataSet();
						} else if (iPSDERBase instanceof IPSDERCustom) {
							IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
							pickupPSDEField = iPSDERCustom.getPickupPSDEField();
							nestedPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
							if (refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType())) {
								parentTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, refDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
								if (parentTypePSDEField != null) {
									strParentType = ((IPSDERCustom) iPSDERBase).getParentType();
									if (!StringUtils.hasLength(strParentType)) {
										// strParentType =
										// iPSDERBase.getMajorPSDataEntityMust().getName();
										strParentType = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId(), false).getDERParentType();
									}
								}
								parentSubTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
								if (parentSubTypePSDEField != null) {
									strParentSubType = ((IPSDERCustom) iPSDERBase).getParentSubType();
									if (!StringUtils.hasLength(strParentSubType)) {
										strParentSubType = iPSDERBase.getMinorCodeName();
									}
								}
							}
						}

						if (pickupPSDEField == null) {
							// throw new DataEntityRuntimeException(this,
							// firstEntityDTO.getDEMethodDTORuntime(),
							// String.format("属性[%1$s]没有定义DTO连接属性",
							// iPSDEMethodDTOField.getName()));
							log.warn(String.format("属性[%1$s]没有定义DTO连接属性，忽略默认处理", iPSDEMethodDTOField.getName()));
							continue;
						}

						// 查出原有数据
						Map<Object, IEntityDTO> entityDTOMap = new LinkedHashMap<Object, IEntityDTO>();
						for (IEntityDTO iEntityDTO : list) {
							Object objKeyValue = iEntityDTO.get(getKeyPSDEField().getLowerCaseName());
							if (ObjectUtils.isEmpty(objKeyValue)) {
								throw new DataEntityRuntimeException(this, String.format("填充数据对象嵌套数据发生异常，传入数据未指定主键"));
							}
							entityDTOMap.put(objKeyValue, iEntityDTO);
						}

						ISearchContextDTO iSearchContextDTO = refDataEntityRuntime.createSearchContext();
						iSearchContextDTO.all().count(false);

						if (relatedPickupPSDEField != null) {
							// 重新计算主键
							Set<Object> keys = new LinkedHashSet<Object>();
							for (IEntityDTO iEntityDTO : list) {
								Object objKeyValue = iEntityDTO.get(relatedPickupPSDEField.getLowerCaseName());
								if (ObjectUtils.isEmpty(objKeyValue)) {
									continue;
								}
								keys.add(objKeyValue);
							}

							if (keys.size() == 0) {
								continue;
							}

							if (keys.size() == 1) {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, keys.iterator().next());
							} else {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.IN, keys);
							}
						} else {
							if (entityDTOMap.size() == 1) {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, entityDTOMap.keySet().iterator().next());
							} else {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.IN, entityDTOMap.keySet());
							}

							if (parentTypePSDEField != null) {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
							}
						}

						if (parentSubTypePSDEField != null) {
							if (StringUtils.hasLength(strParentSubType)) {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
							} else {
								refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
							}
						}

						List<IEntityDTO> allList = null;
						if (nestedPSDEDataSet != null) {
							allList = refDataEntityRuntime.selectDataSet(nestedPSDEDataSet, iSearchContextDTO);
						} else {
							allList = refDataEntityRuntime.select(iSearchContextDTO);
						}

						if (!ObjectUtils.isEmpty(allList)) {
							Map<Object, List<IEntityDTO>> lastListMap = new HashMap<Object, List<IEntityDTO>>();
							for (IEntityDTO item : allList) {
								Object objKey = item.get(pickupPSDEField.getLowerCaseName());
								List<IEntityDTO> lastList = lastListMap.get(objKey);
								if (lastList == null) {
									lastList = new ArrayList<IEntityDTO>();
									lastListMap.put(objKey, lastList);
								}
								lastList.add(item);
							}

							for (Map.Entry<Object, List<IEntityDTO>> entry : lastListMap.entrySet()) {

								List<IEntityDTO> tempList = new ArrayList<IEntityDTO>();
								if (relatedPickupPSDEField != null) {
									for (IEntityDTO iEntityDTO : list) {
										Object objKeyValue = iEntityDTO.get(relatedPickupPSDEField.getLowerCaseName());
										if (ObjectUtils.isEmpty(objKeyValue)) {
											continue;
										}
										if (objKeyValue.equals(entry.getKey())) {
											tempList.add(iEntityDTO);
										}
									}
								} else {
									IEntityDTO iEntityDTO = entityDTOMap.get(entry.getKey());
									if (iEntityDTO != null) {
										tempList.add(iEntityDTO);
									}
								}
								for (IEntityDTO iEntityDTO : tempList) {
									// 判断属性类型
									List<IEntityDTO> lastList = entry.getValue();
									if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
										if (iPSDEMethodDTOField.isListMap()) {
											if (!ObjectUtils.isEmpty(lastList)) {
												String strKeyName = "name";
												if (refDataEntityRuntime.getKeyNamePSDEField() != null) {
													strKeyName = refDataEntityRuntime.getKeyNamePSDEField().getLowerCaseName();
												}

												Map map = new LinkedHashMap();
												for (IEntityDTO item : lastList) {
													Object key = item.get(strKeyName);
													if (ObjectUtils.isEmpty(key)) {
														throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]成员数据未提供键名[%2$s]", iPSDEMethodDTOField.getName(), strKeyName));
													}

													if (map.containsKey(key)) {
														throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]成员数据键名[%2$s]重复", iPSDEMethodDTOField.getName(), key));
													} else {
														map.put(key, item);
													}
												}

												iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), map);
											} else {
												iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), null);
											}
										} else {
											iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), lastList);
										}
									} else {
										if (ObjectUtils.isEmpty(lastList)) {
											iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), null);
										} else {
											iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), lastList.get(0));
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

	@Override
	public void outputReport(String strReportId, ServletResponse servletResponse, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable {
		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			this.pushDataSource();
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			actionSession.beginLog(this.getName(), String.format("输出报表[%1$s]", strReportId));

			onOutputReport(strReportId, servletResponse, iSearchContext, strType, bTestPriv);
			// Object objRet = this.onFetchDataSet(strDataSetName,
			// this.getPSDEDataSet(strDataSetName), joinPoint.getArgs(),
			// joinPoint);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);

			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getReportLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEREPORT, iActionSessionLog.toString(true), this.getName(), String.format("输出报表[%1$s]", strReportId), iActionSessionLog.getTime(), iActionSessionLog);
					}
				}
				ActionSessionManager.closeSession(true);
			}

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				IActionSessionLog iActionSessionLog = actionSession.endLog(ex.getMessage(), true, ex);
				if (iActionSessionLog != null) {
					String strInfo = String.format("实体[%1$s]报表[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strReportId, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEREPORT, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}
	}

	protected void onOutputReport(String strReportId, ServletResponse servletResponse, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable {
		/**
		 * 计算动态实例实体运行时
		 */
		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
		IDynaInstRuntime iDynaInstRuntime = null;
		if (this.getDynaInstMode() != DynaInstModes.DISABLE) {
			String strDynainstid = getDynaInstId(null);
			if (StringUtils.hasLength(strDynainstid)) {
				iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynainstid);
				// 设置当前会话的动态实例运行时
				ActionSessionManager.getCurrentSession().setDynaInstRuntime(iDynaInstRuntime);
				if (iDynaInstRuntime != null) {
					iDynaInstDataEntityRuntime = (IDynaInstDataEntityRuntime) iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		IDEReportRuntime iDEReportRuntime = null;
		if (iDynaInstDataEntityRuntime != null) {
			iDEReportRuntime = iDynaInstDataEntityRuntime.getDEReportRuntime(strReportId);
		} else {
			iDEReportRuntime = this.getDEReportRuntime(strReportId);
		}

		if (iDEReportRuntime instanceof net.ibizsys.central.dataentity.report.IDEReportRuntime) {
			((net.ibizsys.central.dataentity.report.IDEReportRuntime) iDEReportRuntime).output(servletResponse, iSearchContext, strType, bTestPriv);
			return;
		}

		throw new Exception(String.format("对象[%1$s]未支持接口", iDEReportRuntime));
	}

	@Override
	public void outputPrint(String strPrintId, ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			this.pushDataSource();
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			actionSession.beginLog(this.getName(), String.format("输出打印[%1$s]", strPrintId));

			onOutputPrint(strPrintId, servletResponse, keys, strType, bTestPriv);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);
			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getReportLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEPRINT, iActionSessionLog.toString(true), this.getName(), String.format("输出打印[%1$s]", strPrintId), iActionSessionLog.getTime(), iActionSessionLog);
					}
				}
				ActionSessionManager.closeSession(true);
			}
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				IActionSessionLog iActionSessionLog = actionSession.endLog(ex.getMessage(), true, ex);
				if (iActionSessionLog != null) {
					String strInfo = String.format("实体[%1$s]打印[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strPrintId, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEPRINT, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}
	}

	protected void onOutputPrint(String strPrintId, ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		/**
		 * 计算动态实例实体运行时
		 */
		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
		IDynaInstRuntime iDynaInstRuntime = null;
		if (this.getDynaInstMode() != DynaInstModes.DISABLE) {
			String strDynainstid = getDynaInstId(null);
			if (StringUtils.hasLength(strDynainstid)) {
				iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynainstid);
				// 设置当前会话的动态实例运行时
				ActionSessionManager.getCurrentSession().setDynaInstRuntime(iDynaInstRuntime);
				if (iDynaInstRuntime != null) {
					iDynaInstDataEntityRuntime = (IDynaInstDataEntityRuntime) iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		IDEPrintRuntime iDEPrintRuntime = null;
		if (iDynaInstDataEntityRuntime != null) {
			iDEPrintRuntime = iDynaInstDataEntityRuntime.getDEPrintRuntime(strPrintId);
		} else {
			iDEPrintRuntime = this.getDEPrintRuntime(strPrintId);
		}

		if (iDEPrintRuntime instanceof net.ibizsys.central.dataentity.print.IDEPrintRuntime) {
			((net.ibizsys.central.dataentity.print.IDEPrintRuntime) iDEPrintRuntime).output(servletResponse, keys, strType, bTestPriv);
			return;
		}

		throw new Exception(String.format("对象[%1$s]未支持接口", iDEPrintRuntime));
	}

	@Override
	public String getDataSourceTag() {
		if (this.getStorageMode() != DEStorageModes.SERVICEAPI) {
			ISysDBSchemeRuntime iSysDBSchemeRuntime = getSysDBSchemeRuntime();
			if (iSysDBSchemeRuntime != null) {
				Object dataSourceTag = iSysDBSchemeRuntime.getDataSourceTag();
				if (dataSourceTag != null) {
					return String.format("DB:%1$s", dataSourceTag);
				} else {
					return String.format("DB:%1$s", "DEFAULT");
				}
			}
			//
			// ISysBDSchemeRuntime iSysBDSchemeRuntime =
			// getSysBDSchemeRuntime();
			// if(iSysBDSchemeRuntime != null) {
			// Object dataSourceTag = iSysBDSchemeRuntime.getDataSourceTag();
			// if(dataSourceTag!=null) {
			// return String.format("BD:%1$s", dataSourceTag);
			// }
			// }
		}

		return null;
	}

	@Override
	protected IDEUtilRuntime createDefaultDEUtilRuntime(IPSDEUtil iPSDEUtil) {
		switch (iPSDEUtil.getUtilType()) {
		case DEUtilTypes.DYNASTORAGE:
			return new DEDynaStorageUtilRuntime();
		case DEUtilTypes.VERSIONSTORAGE:
			return new DEVersionStorageUtilRuntime();
		case DEUtilTypes.VERSIONCONTROL:
			return new DEVersionControlUtilRuntime();
		case DEUtilTypes.NOTIFYSETTING:
			return new DENotifySettingUtilRuntime();
		case DEUtilTypes.CACHE:
			return new DECacheUtilRuntime();
		default:
			return super.createDefaultDEUtilRuntime(iPSDEUtil);
		}
	}

	@Override
	public IDEDynaStorageUtilRuntime getDEDynaStorageUtilRuntime() {
		return (IDEDynaStorageUtilRuntime) super.getDEDynaStorageUtilRuntime();
	}

	@Override
	protected void checkEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (this.isEnableDynaStorage() && this.getDEDynaStorageUtilRuntime() != null) {
			this.getDEDynaStorageUtilRuntime().checkEntityDynaFieldsBeforeProceed(arg0, strActionName, iPSDEAction);
		}

		// final List<IDataEntityInheritLogic> dataEntityInheritLogicList =
		// this.getDataEntityInheritLogics();
		// if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
		// try {
		// DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
		// for (IDataEntityInheritLogic iDataEntityInheritLogic :
		// dataEntityInheritLogicList) {
		// iDataEntityInheritLogic.checkEntityDynaFieldsBeforeProceed(this.getDataEntityRuntimeContext(),
		// arg0, strActionName, iPSDEAction);
		// }
		// }
		// finally {
		// DataEntityRuntimeHolder.pollChildDataEntityRuntime();
		// }
		// }

		// super.checkEntityDynaFieldsBeforeProceed(arg0, strActionName,
		// iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	protected void translateEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (this.isEnableDynaStorage() && this.getDEDynaStorageUtilRuntime() != null) {
			this.getDEDynaStorageUtilRuntime().translateEntityDynaFieldsBeforeProceed(arg0, strActionName, iPSDEAction);
		}

		// final List<IDataEntityInheritLogic> dataEntityInheritLogicList =
		// this.getDataEntityInheritLogics();
		// if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
		// try {
		// DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
		// for (IDataEntityInheritLogic iDataEntityInheritLogic :
		// dataEntityInheritLogicList) {
		// iDataEntityInheritLogic.translateEntityDynaFieldsBeforeProceed(this.getDataEntityRuntimeContext(),
		// arg0, strActionName, iPSDEAction);
		// }
		// }
		// finally {
		// DataEntityRuntimeHolder.pollChildDataEntityRuntime();
		// }
		// }

		// super.translateEntityDynaFieldsBeforeProceed(arg0, strActionName,
		// iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	protected void translateEntityDynaFieldsAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (this.isEnableDynaStorage() && this.getDEDynaStorageUtilRuntime() != null) {
			this.getDEDynaStorageUtilRuntime().translateEntityDynaFieldsAfterProceed(arg0, objRet, strActionName, iPSDEAction);
		}

		// final List<IDataEntityInheritLogic> dataEntityInheritLogicList =
		// this.getDataEntityInheritLogics();
		// if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
		// try {
		// DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
		// for (IDataEntityInheritLogic iDataEntityInheritLogic :
		// dataEntityInheritLogicList) {
		// iDataEntityInheritLogic.translateEntityDynaFieldsAfterProceed(this.getDataEntityRuntimeContext(),
		// arg0, objRet, strActionName, iPSDEAction);
		// }
		// }
		// finally {
		// DataEntityRuntimeHolder.pollChildDataEntityRuntime();
		// }
		// }

		// super.translateEntityDynaFieldsAfterProceed(arg0, objRet,
		// strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime,
		// actionData);
	}

	@Override
	protected void removeEntityDynaFieldsBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (this.isEnableDynaStorage() && this.getDEDynaStorageUtilRuntime() != null) {
			this.getDEDynaStorageUtilRuntime().removeEntityDynaFieldsBeforeRemove(arg0, strActionName, iPSDEAction);
		}

		// final List<IDataEntityInheritLogic> dataEntityInheritLogicList =
		// this.getDataEntityInheritLogics();
		// if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
		// try {
		// DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
		// for (IDataEntityInheritLogic iDataEntityInheritLogic :
		// dataEntityInheritLogicList) {
		// iDataEntityInheritLogic.removeEntityDynaFieldsBeforeRemove(this.getDataEntityRuntimeContext(),
		// arg0, strActionName, iPSDEAction);
		// }
		// }
		// finally {
		// DataEntityRuntimeHolder.pollChildDataEntityRuntime();
		// }
		// }

		// super.removeEntityDynaFieldsBeforeRemove(arg0, strActionName,
		// iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	protected void translateSearchContextDynaFieldsBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (this.isEnableDynaStorage() && this.getDEDynaStorageUtilRuntime() != null) {
			this.getDEDynaStorageUtilRuntime().translateSearchContextDynaFieldsBeforeProceed(arg0, strDataSetName, iPSDEDataSet);
		}

		// final List<IDataEntityInheritLogic> dataEntityInheritLogicList =
		// this.getDataEntityInheritLogics();
		// if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
		// try {
		// DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
		// for (IDataEntityInheritLogic iDataEntityInheritLogic :
		// dataEntityInheritLogicList) {
		// iDataEntityInheritLogic.translateSearchContextDynaFieldsBeforeProceed(this.getDataEntityRuntimeContext(),
		// arg0, strDataSetName, iPSDEDataSet);
		// }
		// }
		// finally {
		// DataEntityRuntimeHolder.pollChildDataEntityRuntime();
		// }
		// }

		// super.translateSearchContextDynaFieldsBeforeProceed(arg0,
		// strDataSetName, iPSDEDataSet, iPSDataEntity, iDynaInstRuntime,
		// actionData);
	}

	@Override
	protected void translateEntityDynaFieldsAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		if (this.isEnableDynaStorage() && this.getDEDynaStorageUtilRuntime() != null) {
			this.getDEDynaStorageUtilRuntime().translateEntityDynaFieldsAfterProceed(arg0, list, strDataSetName, iPSDEDataSet);
		}

		// final List<IDataEntityInheritLogic> dataEntityInheritLogicList =
		// this.getDataEntityInheritLogics();
		// if (!ObjectUtils.isEmpty(dataEntityInheritLogicList)) {
		// try {
		// DataEntityRuntimeHolder.pushChildDataEntityRuntime(this);
		// for (IDataEntityInheritLogic iDataEntityInheritLogic :
		// dataEntityInheritLogicList) {
		// iDataEntityInheritLogic.translateEntityDynaFieldsAfterProceed(this.getDataEntityRuntimeContext(),
		// arg0, list, strDataSetName, iPSDEDataSet);
		// }
		// }
		// finally {
		// DataEntityRuntimeHolder.pollChildDataEntityRuntime();
		// }
		// }

		// super.translatePageDynaFieldsAfterProceed(arg0, page, strDataSetName,
		// iPSDEDataSet, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	public IDENotifyRuntime createDENotifyRuntime(IPSDENotify iPSDENotify) {
		Assert.notNull(iPSDENotify, "实体通知模型对象无效");

		IDENotifyRuntime iDENotifyRuntime = this.getSystemRuntime().getRuntimeObject(iPSDENotify.getPSSysSFPlugin(), IDENotifyRuntime.class, true);
		if (iDENotifyRuntime != null) {
			return iDENotifyRuntime;
		}

		if (this.getSystemModuleUtilRuntime() != null) {
			iDENotifyRuntime = this.getSystemModuleUtilRuntime().createDENotifyRuntime(iPSDENotify);
			if (iDENotifyRuntime != null) {
				return iDENotifyRuntime;
			}
		}

		return onCreateDENotifyRuntime(iPSDENotify);
	}

	@Override
	protected IDENotifyRuntime onCreateDENotifyRuntime(IPSDENotify iPSDENotify) {

		String strSubType = iPSDENotify.getNotifySubType();
		if (StringUtils.hasLength(strSubType) && PSModelEnums.NotifySubType.NONE.value.equals(strSubType)) {
			strSubType = null;
		}
		IDENotifyRuntime iDENotifyRuntime = this.getSystemRuntime().getRuntimeObject(IDENotifyRuntime.class, StringUtils.hasLength(strSubType) ? strSubType : "*");
		if (iDENotifyRuntime != null) {
			return iDENotifyRuntime;
		}

		if (StringUtils.hasLength(strSubType)) {
			iDENotifyRuntime = this.getSystemRuntime().getRuntimeObject(IDENotifyRuntime.class, "*");
			if (iDENotifyRuntime != null) {
				return iDENotifyRuntime;
			}
		}

		return createDefaultDENotifyRuntime(iPSDENotify);
	}

	@Override
	protected IDENotifyRuntime createDefaultDENotifyRuntime(IPSDENotify iPSDENotify) {
		return new DENotifyRuntime();
	}

	@Override
	public net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime getDEMSLogicRuntime(IEntity iEntity, boolean bTryMode) {
		Assert.notNull(iEntity, "未传入数据对象");
		this.prepare();

		try {
			return this.onGetDEMSLogicRuntime(iEntity, bTryMode);

		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("获取指定数据主状态运行时对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime onGetDEMSLogicRuntime(IEntity iEntity, boolean bTryMode) throws Throwable {
		if (ObjectUtils.isEmpty(this.getPSDataEntity().getMainStatePSDEFields())) {
			throw new Exception(String.format("未定义主状态属性"));
		}

		for (IPSDEField iPSDEField : this.getPSDataEntity().getMainStatePSDEFields()) {
			if (!this.containsFieldValue(iEntity, iPSDEField)) {
				log.warn(String.format("数据对象不包含属性[%1$s]，可能会发生错误", iPSDEField.getName()));
				break;
			}
		}

		String strTag = "";
		for (int i = 0; i <= 1; i++) {
			strTag = String.format("%1$s", ((i == 0) ? this.getFieldValue(iEntity, this.getPSDataEntity().getMainStatePSDEFields().get(0)) : "*"));
			if (this.getPSDataEntity().getMainStatePSDEFields().size() >= 2) {
				for (int j = 0; j <= 1; j++) {
					String strTag2 = String.format("%1$s__%2$s", strTag, ((j == 0) ? this.getFieldValue(iEntity, this.getPSDataEntity().getMainStatePSDEFields().get(1)) : "*"));
					if (this.getPSDataEntity().getMainStatePSDEFields().size() >= 3) {
						for (int k = 0; k <= 1; k++) {
							String strTag3 = String.format("%1$s__%2$s", strTag2, ((k == 0) ? this.getFieldValue(iEntity, this.getPSDataEntity().getMainStatePSDEFields().get(2)) : "*"));
							// 判断是否存在
							IDEMSLogicRuntime iDEMSLogicRuntime = this.getDEMSLogicRuntime(strTag3, true);
							if (iDEMSLogicRuntime != null) {
								return (net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime) iDEMSLogicRuntime;
							}
						}
					} else {
						IDEMSLogicRuntime iDEMSLogicRuntime = this.getDEMSLogicRuntime(strTag2, true);
						if (iDEMSLogicRuntime != null) {
							return (net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime) iDEMSLogicRuntime;
						}
					}
				}
			} else {
				IDEMSLogicRuntime iDEMSLogicRuntime = this.getDEMSLogicRuntime(strTag, true);
				if (iDEMSLogicRuntime != null) {
					return (net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime) iDEMSLogicRuntime;
				}
			}
		}

		if (bTryMode) {
			return null;
		}

		throw new Exception(String.format("未存在指定数据主状态运行时对象"));
	}

	@Override
	public void notify(Object key, String strEvent, Object eventData, Object eventData2, Object eventData3, Object eventData4) throws Throwable {

		super.notify(key, strEvent, eventData, eventData2, eventData3, eventData4);

		// 判断是否计算相关聚合属性
		if (eventData2 instanceof IPSDER1N && eventData4 instanceof IPSDEAction) {
			IPSDER1N iPSDER1N = (IPSDER1N) eventData2;

			if ((iPSDER1N.getMasterRS() & DER1NMasterRS.NESTED.value) == DER1NMasterRS.NESTED.value) {
				return;
			}

			List<IPSDER1NDEFieldMap> list = iPSDER1N.getPSDER1NDEFieldMaps();
			if (ObjectUtils.isEmpty(list)) {
				return;
			}

			String[] events = strEvent.split("[:]");
			if (events.length != 2) {
				return;
			}

			String strAttachMode = events[1];
			if (!strAttachMode.equalsIgnoreCase(DEActionLogicAttachMode.AFTER.value)) {
				return;
			}

			IPSDEAction iPSDEAction = (IPSDEAction) eventData4;
			Object lastKey = null;
			if (DEActionMode.UPDATE.value.equals(iPSDEAction.getActionMode())) {
				IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMinorPSDataEntityMust().getId());
				// 判断是否有上一次数据
				if (eventData3 instanceof IEntityBase) {
					lastKey = minorDataEntityRuntime.getFieldValue((IEntityBase) eventData3, iPSDER1N.getPSPickupDEFieldMust());
				}
			}

			if (!ObjectUtils.isEmpty(key) || !ObjectUtils.isEmpty(lastKey)) {
				this.aggregateDER1N(key, iPSDER1N, iPSDEAction.getActionMode(), lastKey);
			}

			return;
		}

	}

	protected void aggregateDER1N(Object key, IPSDER1N iPSDER1N, String strActionMode, Object lastKey) throws Throwable {
		List<IPSDER1NDEFieldMap> list = iPSDER1N.getPSDER1NDEFieldMaps();
		if (ObjectUtils.isEmpty(list)) {
			return;
		}

		boolean bAdvanceAggregate = false;
		// IPSDER1NDEFieldMap countPSDER1NDEFieldMap = null;
		IPSDER1NDEFieldMap existsPSDER1NDEFieldMap = null;
		IPSDER1NDEFieldMap notExistsPSDER1NDEFieldMap = null;
		for (IPSDER1NDEFieldMap iPSDER1NDEFieldMap : list) {
			// 判断类型
			if (DER1NDEFMapType.EXISTS.value.equalsIgnoreCase(iPSDER1NDEFieldMap.getMapType())) {
				existsPSDER1NDEFieldMap = iPSDER1NDEFieldMap;
				continue;
			}

			if (DER1NDEFMapType.NOTEXISTS.value.equalsIgnoreCase(iPSDER1NDEFieldMap.getMapType())) {
				notExistsPSDER1NDEFieldMap = iPSDER1NDEFieldMap;
				continue;
			}

			bAdvanceAggregate = true;
		}

		if (existsPSDER1NDEFieldMap == null && notExistsPSDER1NDEFieldMap == null && !bAdvanceAggregate) {
			return;
		}

		IEntityBase[] minorEntities = null;
		IEntityBase[] lastMinorEntities = null;
		IDataEntityRuntime minorDataEntityRuntime = null;
		if (bAdvanceAggregate) {
			minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMinorPSDataEntityMust().getId());

			IPSDEDataSet minorPSDEDataSet = null;
			String strPickupFieldName = null;
			minorPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
			strPickupFieldName = iPSDER1N.getPSPickupDEFieldMust().getLowerCaseName();

			if (minorPSDEDataSet == null) {
				minorPSDEDataSet = minorDataEntityRuntime.getDefaultPSDEDataSet();
			}

			if (true) {
				ISearchContextDTO iSearchContextDTO = null;
				if (minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO() != null) {
					iSearchContextDTO = (ISearchContextDTO) minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
				} else {
					iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
				}

				iSearchContextDTO.eq(strPickupFieldName, key);

				iSearchContextDTO.all().raw().count(false);
				List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
				if (!ObjectUtils.isEmpty(entityDTOList)) {
					minorEntities = entityDTOList.toArray(new IEntityBase[entityDTOList.size()]);
				} else {
					minorEntities = new IEntityBase[0];
				}
			}

			if (!ObjectUtils.isEmpty(lastKey) && DataTypeUtils.compare(iPSDER1N.getPSPickupDEFieldMust().getStdDataType(), key, lastKey) != 0) {
				ISearchContextDTO iSearchContextDTO = null;
				if (minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO() != null) {
					iSearchContextDTO = (ISearchContextDTO) minorDataEntityRuntime.getDEMethodDTO(minorPSDEDataSet.getPSDEDataSetInputMust().getPSDEFilterDTO(), null);
				} else {
					iSearchContextDTO = minorDataEntityRuntime.createSearchContext();
				}

				iSearchContextDTO.eq(strPickupFieldName, lastKey);

				iSearchContextDTO.all().raw().count(false);
				List<IEntityDTO> entityDTOList = minorDataEntityRuntime.selectDataSet(minorPSDEDataSet, iSearchContextDTO);
				if (!ObjectUtils.isEmpty(entityDTOList)) {
					lastMinorEntities = entityDTOList.toArray(new IEntityBase[entityDTOList.size()]);
				} else {
					lastMinorEntities = new IEntityBase[0];
				}
			}
		}

		IEntityDTO iEntityDTO = this.createEntity();
		if (minorEntities != null) {
			for (IPSDER1NDEFieldMap iPSDER1NDEFieldMap : list) {
				// 判断类型
				if (DER1NDEFMapType.EXISTS.value.equalsIgnoreCase(iPSDER1NDEFieldMap.getMapType())) {
					continue;
				}

				if (DER1NDEFMapType.NOTEXISTS.value.equalsIgnoreCase(iPSDER1NDEFieldMap.getMapType())) {
					continue;
				}

				Object objCalcValue = EntityListUtils.calc(iPSDER1NDEFieldMap.getMapType(), minorEntities, iPSDER1NDEFieldMap.getMinorPSDEField(), minorDataEntityRuntime);
				this.setFieldValue(iEntityDTO, iPSDER1NDEFieldMap.getMajorPSDEField(), objCalcValue);
			}
		}

		IEntityDTO lastEntityDTO = this.createEntity();
		if (lastMinorEntities != null) {
			for (IPSDER1NDEFieldMap iPSDER1NDEFieldMap : list) {
				// 判断类型
				if (DER1NDEFMapType.EXISTS.value.equalsIgnoreCase(iPSDER1NDEFieldMap.getMapType())) {
					continue;
				}

				if (DER1NDEFMapType.NOTEXISTS.value.equalsIgnoreCase(iPSDER1NDEFieldMap.getMapType())) {
					continue;
				}

				Object objCalcValue = EntityListUtils.calc(iPSDER1NDEFieldMap.getMapType(), lastMinorEntities, iPSDER1NDEFieldMap.getMinorPSDEField(), minorDataEntityRuntime);
				this.setFieldValue(lastEntityDTO, iPSDER1NDEFieldMap.getMajorPSDEField(), objCalcValue);
			}
		}

		if (DEActionMode.CREATE.value.equals(strActionMode)) {
			// 新建数据
			if (!ObjectUtils.isEmpty(key)) {
				// 将数据标记为1
				// IDataEntityRuntime minorDataEntityRuntime =
				// this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMinorPSDataEntityMust().getId());
				this.setFieldValue(iEntityDTO, this.getKeyPSDEField(), key);
				if (existsPSDER1NDEFieldMap != null) {
					this.setFieldValue(iEntityDTO, existsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 1);
				}
				if (notExistsPSDER1NDEFieldMap != null) {
					this.setFieldValue(iEntityDTO, notExistsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 0);
				}

				this.rawUpdate(Arrays.asList(iEntityDTO), false);
			}
			return;
		}

		if (DEActionMode.UPDATE.value.equals(strActionMode)) {
			// 判断数据是否一致
			if (!bAdvanceAggregate && DataTypeUtils.compare(iPSDER1N.getPSPickupDEFieldMust().getStdDataType(), key, lastKey) == 0) {
				return;
			}

			if (!ObjectUtils.isEmpty(key)) {
				// 将数据标记为1
				this.setFieldValue(iEntityDTO, this.getKeyPSDEField(), key);
				if (existsPSDER1NDEFieldMap != null) {
					this.setFieldValue(iEntityDTO, existsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 1);
				}
				if (notExistsPSDER1NDEFieldMap != null) {
					this.setFieldValue(iEntityDTO, notExistsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 0);
				}
				this.rawUpdate(Arrays.asList(iEntityDTO), false);
			}

			if (!ObjectUtils.isEmpty(lastKey)) {
				if (minorDataEntityRuntime == null)
					minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMinorPSDataEntityMust().getId());
				if (!minorDataEntityRuntime.containsForeignKey(iPSDER1N.getPSPickupDEFieldMust(), lastKey, iPSDER1N)) {

					this.setFieldValue(lastEntityDTO, this.getKeyPSDEField(), lastKey);
					if (existsPSDER1NDEFieldMap != null) {
						this.setFieldValue(lastEntityDTO, existsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 0);
					}
					if (notExistsPSDER1NDEFieldMap != null) {
						this.setFieldValue(lastEntityDTO, notExistsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 1);
					}
					this.rawUpdate(Arrays.asList(lastEntityDTO), false);
				}
			}

			return;
		}

		if (DEActionMode.DELETE.value.equals(strActionMode)) {
			// 删除数据
			if (!ObjectUtils.isEmpty(key)) {
				if (minorDataEntityRuntime == null)
					minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMinorPSDataEntityMust().getId());
				if (!minorDataEntityRuntime.containsForeignKey(iPSDER1N.getPSPickupDEFieldMust(), key, iPSDER1N)) {
					this.setFieldValue(iEntityDTO, this.getKeyPSDEField(), key);
					if (existsPSDER1NDEFieldMap != null) {
						this.setFieldValue(iEntityDTO, existsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 0);
					}
					if (notExistsPSDER1NDEFieldMap != null) {
						this.setFieldValue(iEntityDTO, notExistsPSDER1NDEFieldMap.getMajorPSDEFieldMust(), 1);
					}
					this.rawUpdate(Arrays.asList(iEntityDTO), false);
				}
			}
			return;
		}

		return;
	}

	@Override
	public void fillDataAccessActions(IEntityDTO iEntityDTO, Map<String, Object> map) {
		this.fillDataAccessActions(iEntityDTO, map, false, false);
	}

	@Override
	public void fillDataAccessActions(IEntityDTO iEntityDTO, Map<String, Object> map, boolean bIncludeMasterDE, boolean bDEOPPrivLogicOnly) {
		Assert.notEmpty(map, "未传入判断数据访问操作标识数据");
		Assert.notNull(iEntityDTO, "未传入数据对象");

		Map<String, Object> masterMap = null;
		if (bIncludeMasterDE) {
			if (this.getDataAccCtrlMode() == DEDataAccCtrlMode.MASTER.value || this.getDataAccCtrlMode() == DEDataAccCtrlMode.MASTER_SELF.value) {

				Map<String, String> map2 = new LinkedHashMap<String, String>();
				// 获取数据的主控关系
				IPSDERBase masterPSDERBase = this.getMasterPSDER(iEntityDTO, true);
				if (masterPSDERBase instanceof IPSDER1NBase) {
					IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) masterPSDERBase;
					IDataEntityRuntime parentDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(masterPSDERBase.getMajorPSDataEntityMust().getId());
					if (!bDEOPPrivLogicOnly || parentDataEntityRuntime.isEnableDEOPPrivLogic(bIncludeMasterDE)) {
						for (String strAccessAction : map.keySet()) {
							IPSDEOPPriv iPSDEOPPriv = this.getDataEntityAccessManager().getPSDEOPPriv(parentDataEntityRuntime, strAccessAction, true);
							if (iPSDEOPPriv == null) {
								continue;
							}

							map2.put(strAccessAction, iPSDEOPPriv.getName());
						}

						if (!ObjectUtils.isEmpty(map2)) {
							Map<String, Object> parentMap = new LinkedHashMap<String, Object>();
							masterMap = new LinkedHashMap<String, Object>();
							for (String strParentAccessAction : map2.values()) {
								parentMap.put(strParentAccessAction, null);
							}
							try {
								IEntityDTO parentEntityDTO = parentDataEntityRuntime.getSimpleEntity(iEntityDTO.get(iPSDER1NBase.getPickupPSDEFieldMust().getLowerCaseName()));
								parentDataEntityRuntime.fillDataAccessActions(parentEntityDTO, parentMap, bIncludeMasterDE, bDEOPPrivLogicOnly);

							} catch (Throwable ex) {
								throw new DataEntityRuntimeException(this, String.format("通过父实体填充操作标识发生异常，%1$s", ex.getMessage()), ex);
							}

							for (String strAccessAction : map2.keySet()) {
								String strParentAccessAction = map2.get(strAccessAction);
								boolean bOk = DataTypeUtils.getBooleanValue(parentMap.get(strParentAccessAction), true);
								masterMap.put(strAccessAction, bOk);
							}

							map.putAll(masterMap);
						}
					}
				}
			}
		}

		Boolean last = IgnoreExecuteDEOPPrivLogics.get();
		try {
			IgnoreExecuteDEOPPrivLogics.set(true);

			if (!bDEOPPrivLogicOnly) {
				for (String strAccessAction : map.keySet()) {
					if (masterMap != null && masterMap.containsKey(strAccessAction)) {
						continue;
					}
					Object ret = this.testDataAccessAction(iEntityDTO, strAccessAction);
					map.put(strAccessAction, ret);
				}
			}

			// 进一步调用操作标识检查逻辑，此处并没有排除父已校验
			if (!DataTypeUtils.getBooleanValue(last, false)) {
				this.executeDEOPPrivLogics(iEntityDTO, map, true);
			}
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("填充数据访问操作标识发生异常，%1$s", ex.getMessage()));
		} finally {
			IgnoreExecuteDEOPPrivLogics.set(last);
		}
	}

	@Override
	protected boolean onTestDataAccessAction(Object objKeyOrEntity, String strAccessAction) throws Exception {
		boolean bRet = super.onTestDataAccessAction(objKeyOrEntity, strAccessAction);
		if (bRet && isEnableDEOPPrivLogic()) {
			if (!DataTypeUtils.getBooleanValue(IgnoreExecuteDEOPPrivLogics.get(), false)) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put(strAccessAction, null);
				IEntityDTO iEntityDTO = this.getSimpleEntity(objKeyOrEntity);
				try {
					this.executeDEOPPrivLogics(iEntityDTO, map, true);
					return DataTypeUtils.getBooleanValue(map.get(strAccessAction), true);
				} catch (Throwable ex) {
					throw new Exception(String.format("判断操作标识[%1$s]发生异常，%2$s", strAccessAction, ex.getMessage()), ex);
				}
			}
		}
		return bRet;
	}

	/**
	 * 执行实体操作标识判断逻辑
	 * 
	 * @param iEntityDTO
	 * @param map
	 * @param bOnlyTestKeys
	 *            仅判断传入的值
	 * @throws Throwable
	 */
	protected void executeDEOPPrivLogics(IEntityDTO iEntityDTO, Map<String, Object> map, boolean bOnlyTestKeys) throws Throwable {

		if (bOnlyTestKeys && ObjectUtils.isEmpty(map)) {
			return;
		}

		final List<IDELogicRuntime> list = this.getDEOPPrivLogicRuntimes();
		if (!ObjectUtils.isEmpty(list)) {
			for (IDELogicRuntime iDELogicRuntime : list) {

				if (bOnlyTestKeys) {
					// 判断是否已经满足要求
					boolean bBreak = true;
					for (Object value : map.values()) {
						if (DataTypeUtils.getBooleanValue(value, true)) {
							bBreak = false;
							break;
						}
					}
					if (bBreak) {
						return;
					}
				}

				Map testMap = null;
				Object ret = this.executeLogic(iDELogicRuntime, new Object[] { iEntityDTO });
				if (ret instanceof IEntity) {
					testMap = ((IEntity) ret).any();
				} else if (ret instanceof Map) {
					testMap = (Map) ret;
				} else
					throw new Exception(String.format("实体操作标识判断逻辑[%1$s]返回值无效", iDELogicRuntime.getName()));

				if (ObjectUtils.isEmpty(testMap)) {
					continue;
				}

				for (Object key : testMap.keySet()) {

					boolean bRet = DataTypeUtils.getBooleanValue(testMap.get(key), false);
					String strDEOPPriv = String.valueOf(key).toUpperCase();

					if (map.containsKey(strDEOPPriv)) {
						boolean bLast = DataTypeUtils.getBooleanValue(map.get(strDEOPPriv), true);
						if (bLast && !bRet) {
							map.put(strDEOPPriv, bRet);
						}
					} else {
						if (!bOnlyTestKeys) {
							map.put(strDEOPPriv, bRet);
						}
					}
				}
			}
		}
	}

	@Override
	protected void checkDEMainState(Object arg, IPSDEAction iPSDEAction) throws Exception {

		final String strDataAccessAction = iPSDEAction != null ? iPSDEAction.getDataAccessAction() : null;
		if (arg != null && StringUtils.hasLength(strDataAccessAction) && isEnableDEOPPrivLogic(true)) {
			if (!isGetDraftOrCreateAction(iPSDEAction.getName(), iPSDEAction) && !DataAccessActions.READ.equalsIgnoreCase(strDataAccessAction) && !DataAccessActions.DENY.equalsIgnoreCase(strDataAccessAction) && !DataAccessActions.NONE.equalsIgnoreCase(strDataAccessAction)) {
				// 获取最后的数据
				try {
					this.prepareLastBeforeProceed(arg, iPSDEAction.getName(), iPSDEAction, this.getPSDataEntity(), null, null);
				} catch (Throwable ex) {
					throw new Exception(String.format("准备上一次数据发生异常，%1$s", ex.getMessage()), ex);
				}
				IEntityBase last = this.getLastEntity();
				if (last instanceof IEntityDTO) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put(iPSDEAction.getDataAccessAction(), null);
					try {
						this.fillDataAccessActions((IEntityDTO) last, map, true, true);
					} catch (Throwable ex) {
						throw new Exception(String.format("执行实体操作标识逻辑发生异常，%1$s", ex.getMessage()), ex);
					}
					if (!DataTypeUtils.getBooleanValue(map.get(iPSDEAction.getDataAccessAction()), true)) {
						throw new Exception("数据状态限制行为操作");
					}
				}
			}
		}

		super.checkDEMainState(arg, iPSDEAction);
	}

	@Override
	protected IEntityBase getLastDEMainStateEntity(Object objKey) {
		if (ActionSessionManager.getCurrentSession() != null) {
			IEntityBase last = this.getLastEntity();
			if (last != null) {
				return last;
			}
		}

		return super.getLastDEMainStateEntity(objKey);
	}

	protected List<IDELogicRuntime> getDEOPPrivLogicRuntimes() {
		this.prepare();
		return this.deOPPrivLogicRuntimeList;
	}

	protected boolean isEnableDEOPPrivLogic() {
		return isEnableDEOPPrivLogic(false);
	}

	@Override
	public boolean isEnableDEOPPrivLogic(boolean bIncludeMasterDE) {
		this.prepare();
		if (bIncludeMasterDE) {
			if (this.bEnableDEOPPrivLogicIncludeMaster == null) {
				boolean bEnableDEOPPrivLogic = false;
				if (this.getDataAccCtrlMode() == DEDataAccCtrlMode.MASTER.value || this.getDataAccCtrlMode() == DEDataAccCtrlMode.MASTER_SELF.value) {
					List<IPSDERBase> masterPSDERs = this.getMasterPSDERs();
					if (!ObjectUtils.isEmpty(masterPSDERs)) {
						for (IPSDERBase iPSDERBase : masterPSDERs) {
							if (iPSDERBase.getMajorPSDataEntityMust().getId().equals(this.getId())) {
								continue;
							}

							IDataEntityRuntime masterDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
							if (masterDataEntityRuntime.isEnableDEOPPrivLogic(true)) {
								bEnableDEOPPrivLogic = true;
								break;
							}
						}
					}
				}

				if (!bEnableDEOPPrivLogic) {
					if (this.getDataAccCtrlMode() == DEDataAccCtrlMode.SELF.value || this.getDataAccCtrlMode() == DEDataAccCtrlMode.MASTER_SELF.value) {
						bEnableDEOPPrivLogic = this.bEnableDEOPPrivLogic;
					}
				}
				this.bEnableDEOPPrivLogicIncludeMaster = bEnableDEOPPrivLogic;
			}
			return this.bEnableDEOPPrivLogicIncludeMaster;
		} else {
			return this.bEnableDEOPPrivLogic;
		}
	}

	@Override
	public Object testDataAccessAction(IEntityDTO iEntityDTO, String strAccessAction) {
		if (!StringUtils.hasLength(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.DENY.equalsIgnoreCase(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.NONE.equalsIgnoreCase(strAccessAction)) {
			return true;
		}

		// 映射到统一资源等处理忽略
		try {
			return this.onTestDataAccessAction(iEntityDTO, strAccessAction);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("判断数据访问操作标识发生异常，%1$s", ex.getMessage()));
		}

	}

	@Override
	protected void fillLastEntity(IEntityBase last, Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.fillLastEntity(last, arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);

	}

	@Override
	public boolean isEnableVersionControl() {
		this.prepare();
		return this.bEnableVersionControl;
	}

	@Override
	public IDEVersionControlUtilRuntime getDEVersionControlUtilRuntime() {
		// this.prepare();
		if (isEnableVersionControl()) {
			if (this.iDEVersionControlUtilRuntime == null) {
				throw new DataEntityRuntimeException(this, String.format("启用实体版本控制但未指定版本控制组件对象"));
			}
			return this.iDEVersionControlUtilRuntime;
		} else
			return null;
	}

	@Override
	public boolean isEnableVersionStorage() {
		this.prepare();
		return this.bEnableVersionStorage;
	}

	@Override
	public IDEVersionStorageUtilRuntime getDEVersionStorageUtilRuntime() {
		// this.prepare();
		if (isEnableVersionStorage()) {
			if (this.iDEVersionStorageUtilRuntime == null) {
				throw new DataEntityRuntimeException(this, String.format("启用实体版本存储但未指定版本存储组件对象"));
			}
			return this.iDEVersionStorageUtilRuntime;
		} else
			return null;
	}

	@Override
	public boolean isEnableNotifySetting() {
		this.prepare();
		return this.bEnableNotifySetting;
	}

	@Override
	public IDENotifySettingUtilRuntime getDENotifySettingUtilRuntime() {
		// this.prepare();
		if (isEnableNotifySetting()) {
			if (this.iDENotifySettingUtilRuntime == null) {
				throw new DataEntityRuntimeException(this, String.format("启用实体通知设置但未指定通知设置组件对象"));
			}
			return this.iDENotifySettingUtilRuntime;
		} else
			return null;
	}

	@Override
	public boolean isEnableDynaStorage() {
		return super.isEnableDynaStorage();
	}

	@Override
	protected IDEUtilRuntime registerPSDEUtil(IPSDEUtil iPSDEUtil) throws Exception {
		IDEUtilRuntime iDEUtilRuntime = super.registerPSDEUtil(iPSDEUtil);
		if (DEUtilType.VERSIONCONTROL.value.equals(iPSDEUtil.getUtilType())) {
			if (iDEUtilRuntime instanceof IDEVersionControlUtilRuntime) {
				this.iDEVersionControlUtilRuntime = (IDEVersionControlUtilRuntime) iDEUtilRuntime;
				this.bEnableVersionControl = true;
				return iDEUtilRuntime;
			} else {
				throw new Exception(String.format("实体版本控制功能组件未实现指定接口"));
			}
		}

		if (DEUtilType.VERSIONSTORAGE.value.equals(iPSDEUtil.getUtilType())) {
			if (iDEUtilRuntime instanceof IDEVersionStorageUtilRuntime) {
				this.iDEVersionStorageUtilRuntime = (IDEVersionStorageUtilRuntime) iDEUtilRuntime;
				this.bEnableVersionStorage = true;
				return iDEUtilRuntime;
			} else {
				throw new Exception(String.format("实体版本存储功能组件未实现指定接口"));
			}
		}

		if (DEUtilType.NOTIFYSETTING.value.equals(iPSDEUtil.getUtilType())) {
			if (iDEUtilRuntime instanceof IDENotifySettingUtilRuntime) {
				this.iDENotifySettingUtilRuntime = (IDENotifySettingUtilRuntime) iDEUtilRuntime;
				this.bEnableNotifySetting = true;
				return iDEUtilRuntime;
			} else {
				throw new Exception(String.format("实体通知设置组件未实现指定接口"));
			}
		}

		return iDEUtilRuntime;
	}

	@Override
	public List<IDESearchRuntime> getDESearchRuntimes() {
		this.prepare();
		return this.deSearchRuntimeList;
	}

	@Override
	protected void syncEntityAfterProceed(int nEvent, Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.syncEntityAfterProceed(nEvent, arg0, objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		final List<IDESearchRuntime> deSearchRuntimeList = this.getDESearchRuntimes();
		if (!ObjectUtils.isEmpty(deSearchRuntimeList)) {
			for (IDESearchRuntime iDESearchRuntime : deSearchRuntimeList) {
				iDESearchRuntime.syncEntity(nEvent, arg0);
			}
		}

		final List<ISysDEUniStateRuntime> deUniStateRuntimeList = this.getSysDEUniStateRuntimes();
		if (!ObjectUtils.isEmpty(deUniStateRuntimeList)) {
			for (ISysDEUniStateRuntime iDEUniStateRuntime : deUniStateRuntimeList) {
				iDEUniStateRuntime.syncEntity(nEvent, arg0);
			}
		}

		final List<IDEUniStateRuntimeBase> deUniStateRuntimeBaseList = this.getDEUniStateRuntimeBases();
		if (!ObjectUtils.isEmpty(deUniStateRuntimeBaseList)) {
			for (IDEUniStateRuntimeBase iDEUniStateRuntimeBase : deUniStateRuntimeBaseList) {
				iDEUniStateRuntimeBase.syncEntity(nEvent, arg0);
			}
		}
	}

	@Override
	protected boolean isCommitVersionBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (this.isEnableVersionControl()) {
			final IDEVersionControlUtilRuntime iDEVersionControlUtilRuntime = this.getDEVersionControlUtilRuntime();
			if (iDEVersionControlUtilRuntime != null) {
				return iDEVersionControlUtilRuntime.isCommit(strActionName, iPSDEAction);
			}
		}
		return false;
	}

	@Override
	protected Object prepareVersionBeforeProceed(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (this.isEnableVersionControl()) {
			final IDEVersionControlUtilRuntime iDEVersionControlUtilRuntime = this.getDEVersionControlUtilRuntime();
			if (iDEVersionControlUtilRuntime != null && arg0 instanceof IEntityBase) {
				return iDEVersionControlUtilRuntime.prepare((IEntityBase) arg0, strActionName, iPSDEAction);
			}
		}
		return super.prepareVersionBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	protected Object commitVersionBeforeProceed(Object arg0, Object versionData, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// super.commitVersionAfterProceed(arg0, objRet, strActionName,
		// iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		if (this.isEnableVersionControl()) {
			final IDEVersionControlUtilRuntime iDEVersionControlUtilRuntime = this.getDEVersionControlUtilRuntime();
			if (iDEVersionControlUtilRuntime != null && arg0 instanceof IEntityBase) {
				return iDEVersionControlUtilRuntime.commit((IEntityBase) arg0, versionData);
			}
		}
		return super.commitVersionBeforeProceed(arg0, versionData, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	public Object execute(IAction iAction, Object[] args) throws Throwable {
		return this.execute(iAction, args, ITransactionalUtil.PROPAGATION_UNKNOWN);
	}

	@Override
	public Object execute(IAction iAction, Object[] args, int nPropagation) throws Throwable {
		return this.execute(iAction, args, null, null, nPropagation);
	}

	@Override
	public Object execute(IAction iAction, Object[] args, String strInterProcessLock, String strSessionId, int nPropagation) throws Throwable {
		return this.execute(iAction, args, strInterProcessLock, strSessionId, -1, null, nPropagation);
	}

	@Override
	public Object execute(IAction iAction, Object[] args, String strInterProcessLock, String strSessionId, long time, TimeUnit unit, int nPropagation) throws Throwable {
		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			this.pushDataSource();
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			String strActionName = null;
			if (iAction instanceof INamedAction) {
				strActionName = ((INamedAction) iAction).getName();
			} else {
				strActionName = "未知行为";
			}

			actionSession.beginLog(this.getName(), strActionName);

			Object objRet = this.onExecute(iAction, args, strInterProcessLock, strSessionId, time, unit, nPropagation);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			actionSession.endLog(null);
			if (bOpenActionSession) {
				ActionSessionManager.closeSession(true);
			}

			return objRet;

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				actionSession.endLog(ex.getMessage(), true, ex);
				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}
	}

	protected Object onExecute(IAction iAction, Object[] args, String strInterProcessLock, String strSessionId, long time, TimeUnit unit, int nPropagation) throws Throwable {
		if (StringUtils.hasLength(strInterProcessLock)) {
			return ActionSessionManager.execute(iAction, args, strInterProcessLock, strSessionId, time, unit, nPropagation);
		} else {
			return ActionSessionManager.execute(iAction, args, nPropagation);
		}
	}

	@Override
	public boolean isEnableDEMapping() {
		this.prepare();
		return !ObjectUtils.isEmpty(this.deMapRuntimeMap);
	}

	@Override
	public Object wfSubmit(Object keyOrEntity, IPSDEWF iPSDEWF, String strWFAction, Map<String, Object> params) throws Throwable {
		return this.executeAction(DEActions.WFSUBMIT, null, new Object[] { keyOrEntity, iPSDEWF, strWFAction, params });
	}

	@Override
	public Object executeLogic(String strLogicTag, Object[] args) throws Throwable {
		IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(strLogicTag, false);
		return this.executeLogic(iDELogicRuntime, args);
	}

	@Override
	public Object executeLogic(IPSDELogic iPSDELogic, Object[] args) throws Throwable {
		IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(iPSDELogic, false);
		return this.executeLogic(iDELogicRuntime, args);
	}

	@Override
	public Object executeLogic(IDELogicRuntime iDELogicRuntime, Object[] args) throws Throwable {
		Assert.notNull(iDELogicRuntime, "传入实体逻辑运行时对象无效");
		return this.execute(new INamedAction() {

			@Override
			public Object execute(Object[] args) throws Throwable {
				return iDELogicRuntime.execute(args);
			}

			@Override
			public String getName() {
				return String.format("执行实体逻辑[%1$s]", iDELogicRuntime.getName());
			}
		}, args);
	}

	@Override
	public void fillEntityDefaultValues(IEntity arg0) {
		this.fillEntityDefaultValues(arg0, DEActions.CREATE);
	}

	@Override
	public void fillEntityDefaultValues(IEntity arg0, String strActionName) {
		Assert.notNull(arg0, "传入数据对象无效");
		Assert.hasLength(strActionName, "传入行为名称无效");

		prepare();

		try {
			this.fillEntityDefaultValues(arg0, strActionName, null, this.getPSDataEntity(), null, null);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this, String.format("填充数据对象默认值发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public int getOrderInitialValue(int nDefaultVale) {
		Integer value = this.getOrderInitialValue();
		return value != null ? value : nDefaultVale;
	}

	@Override
	public int getOrderStepValue(int nDefaultVale) {
		Integer value = this.getOrderStepValue();
		return value != null ? value : nDefaultVale;
	}

	@Override
	protected Object calcOrderValue(IEntityBase iEntityBase, IPSDEField iPSDEField, String strDefaultValue) throws Exception {
		if (StringUtils.hasLength(strDefaultValue)) {
			String[] items = strDefaultValue.split("[,]");
			if (items.length == 2) {
				return this.calcOrderValue(iEntityBase, iPSDEField, DataTypeUtils.asInteger(items[0], 1), DataTypeUtils.asInteger(items[1], 1));
			} else {
				return this.calcOrderValue(iEntityBase, iPSDEField, 1, DataTypeUtils.asInteger(items[0], 1));
			}
		} else {
			return this.calcOrderValue(iEntityBase, iPSDEField, getOrderInitialValue(1), getOrderStepValue(1));
		}
	}

	protected Object calcOrderValue(IEntityBase iEntityBase, IPSDEField iPSDEField, int initialValue, int nStepValue) throws Exception {

		if (iPSDEField == null) {
			iPSDEField = this.getOrderValuePSDEField();
			if (iPSDEField == null) {
				throw new Exception("未指定排序值属性");
			}
		}
		IEntity iEntity = null;
		if (iEntityBase instanceof IEntity) {
			iEntity = (IEntity) iEntityBase;
		}

		ISearchContextDTO iSearchContextDTO = this.createSearchContext();
		if (iEntity != null) {
			iSearchContextDTO.putAll(iEntity.any());
		}

		iSearchContextDTO.count(false).limit(1);

		IPSDEDataSet iPSDEDataSet = this.getOrderScopePSDEDataSet();
		if (iPSDEDataSet == null) {
			iPSDEDataSet = this.getDefaultPSDEDataSet();
		}

		this.setSearchSort(iSearchContextDTO, iPSDEField, "DESC");

		List<IEntityDTO> list = this.selectDataSet(iPSDEDataSet, iSearchContextDTO);
		if (ObjectUtils.isEmpty(list)) {
			return initialValue;
		}

		return DataTypeUtils.getIntegerValue(list.get(0).get(iPSDEField.getLowerCaseName()), initialValue).intValue() + nStepValue;

	}

	@Override
	public synchronized void registerDEActionPluginRuntime(String strAction, IDEActionPluginRuntime iDEActionPluginRuntime) {
		if (iDEActionPluginRuntime instanceof IDEActionPluginRuntime2) {
			IDEActionPluginRuntime2 iDEActionPluginRuntime2 = (IDEActionPluginRuntime2) iDEActionPluginRuntime;
			IDEActionPluginRuntime last = this.getDEActionPluginRuntime(strAction);
			if (last instanceof DEActionPluginRuntime2Proxy) {
				((DEActionPluginRuntime2Proxy) last).register(iDEActionPluginRuntime2);
			} else {
				DEActionPluginRuntime2Proxy proxy = new DEActionPluginRuntime2Proxy();
				proxy.register((iDEActionPluginRuntime2));
				super.registerDEActionPluginRuntime(strAction, proxy);
			}
			return;
		}
		super.registerDEActionPluginRuntime(strAction, iDEActionPluginRuntime);
	}

	@Override
	public synchronized boolean unregisterDEActionPluginRuntime(String strAction, IDEActionPluginRuntime iDEActionPluginRuntime) {
		if (iDEActionPluginRuntime instanceof IDEActionPluginRuntime2) {
			IDEActionPluginRuntime2 iDEActionPluginRuntime2 = (IDEActionPluginRuntime2) iDEActionPluginRuntime;
			IDEActionPluginRuntime last = this.getDEActionPluginRuntime(strAction);
			if (last instanceof DEActionPluginRuntime2Proxy) {
				return ((DEActionPluginRuntime2Proxy) last).unregister(iDEActionPluginRuntime2);
			}
			return false;
		}
		return super.unregisterDEActionPluginRuntime(strAction, iDEActionPluginRuntime);
	}

	@Override
	public synchronized boolean containsDEActionPluginRuntime(String strAction) {

		return super.containsDEActionPluginRuntime(strAction);
	}

	@Override
	public net.ibizsys.central.dataentity.logic.IDELogicRuntime getDELogicRuntime(IPSDELogic iPSDELogic) {
		return (net.ibizsys.central.dataentity.logic.IDELogicRuntime) super.getDELogicRuntime(iPSDELogic);
	}

	@Override
	public net.ibizsys.central.dataentity.logic.IDELogicRuntime getDELogicRuntime(String strId) {
		return this.getDELogicRuntime(strId, false);
	}

	@Override
	public net.ibizsys.central.dataentity.logic.IDELogicRuntime getDELogicRuntime(String strId, boolean bTryMode) {
		return (net.ibizsys.central.dataentity.logic.IDELogicRuntime) super.getDELogicRuntime(strId, bTryMode);
	}

	@Override
	public boolean checkFieldValueRule(Object objValue, IEntityDTO arg0, IPSDEFValueRule iPSDEFValueRule, EntityError entityError) {
		Assert.notNull(iPSDEFValueRule, "未传入实体属性值规则模型对象");
		IPSDEField iPSDEField = iPSDEFValueRule.getParentPSModelObject(IPSDEField.class);
		return this.checkFieldValueRule(objValue, arg0, iPSDEFValueRule, iPSDEField, entityError);
	}

	@Override
	public boolean checkFieldValueRule(Object objValue, IEntityDTO arg0, IPSDEFValueRule iPSDEFValueRule, IPSDEField iPSDEField, EntityError entityError) {
		Assert.notNull(iPSDEFValueRule, "未传入实体属性值规则模型对象");
		Assert.notNull(iPSDEField, "未传入实体属性模型对象");
		try {
			return this.checkFieldValueRule(objValue, arg0, iPSDEFValueRule, iPSDEField, this.getPSDataEntity(), entityError);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this, String.format("检查属性值规则[%1$s]发生异常，%2$s", iPSDEFValueRule.getName(), ex.getMessage()), ex);
		}
	}

	@Override
	public IEntityDTO getLastEntity() {
		return (IEntityDTO) super.getLastEntity();
	}

	@Override
	public IEntityDTO getLastEntityMust() {
		IEntityDTO last = this.getLastEntity();
		if (last != null) {
			return last;
		}
		throw new DataEntityRuntimeException(this, String.format("操作之前数据对象不存在"));
	}

	@Override
	public List<IEntityDTO> selectByDER1N(IPSDER1NBase iPSDER1NBase, Object pickupValue) {
		return this.selectByDER1N(iPSDER1NBase, pickupValue, null);
	}

	@Override
	public List<IEntityDTO> selectByDER1N(IPSDER1NBase iPSDER1NBase, Object pickupValue, ISearchContextDTO iSearchContextDTO) {
		Assert.notNull(iPSDER1NBase, "未传入实体1：N关系模型对象");
		Assert.notNull(pickupValue, "未传入外键拾取值");

		if (!iPSDER1NBase.getMinorPSDataEntityMust().getId().equals(this.getId())) {
			throw new DataEntityRuntimeException(this, String.format("关系[%1$s]从实体不正确", iPSDER1NBase.getName()));
		}

		if (iSearchContextDTO == null) {
			iSearchContextDTO = this.createSearchContext().all().count(false);
			if (this.getOrderValuePSDEField() != null) {
				iSearchContextDTO.sort(this.getOrderValuePSDEField().getName());
			}
		}

		IPSDEField pickupPSDEField = null;
		IPSDEField parentTypePSDEField = null;
		IPSDEField parentSubTypePSDEField = null;

		String strParentSubType = null;
		String strParentType = null;
		IPSDEDataSet nestedPSDEDataSet = null;
		if (iPSDER1NBase instanceof IPSDER1N) {
			IPSDER1N iPSDER1N = (IPSDER1N) iPSDER1NBase;
			pickupPSDEField = iPSDER1N.getPSPickupDEFieldMust();
			nestedPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
		} else if (iPSDER1NBase instanceof IPSDERCustom) {
			IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDER1NBase;
			pickupPSDEField = iPSDERCustom.getPickupPSDEField();
			nestedPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
			parentTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, this.getDEType() != DETypes.DYNAATTACHED);
			if (parentTypePSDEField != null) {
				strParentType = iPSDERCustom.getParentType();
				if (!StringUtils.hasLength(strParentType)) {
					// strParentType =
					// iPSDER1NBase.getMajorPSDataEntityMust().getName();
					strParentType = this.getSystemRuntime().getDataEntityRuntime(iPSDER1NBase.getMajorPSDataEntityMust().getId(), false).getDERParentType();
				}
			}
			parentSubTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
			if (parentSubTypePSDEField != null) {
				strParentSubType = iPSDERCustom.getParentSubType();
				if (!StringUtils.hasLength(strParentSubType)) {
					strParentSubType = iPSDERCustom.getMinorCodeName();
				}
			}
		}

		if (pickupPSDEField == null) {
			throw new DataEntityRuntimeException(this, String.format("关系[%1$s]未定义DTO连接属性", iPSDER1NBase.getName()));
		}

		// 查出原有数据
		this.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, pickupValue);
		if (parentTypePSDEField != null) {
			this.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
		}
		if (parentSubTypePSDEField != null) {
			if (StringUtils.hasLength(strParentSubType)) {
				Object parentSubType;
				try {
					parentSubType = DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType);
					this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, parentSubType);
				} catch (Exception ex) {
					throw new DataEntityRuntimeException(this, String.format("转换父数据子类型[%1$s]发生异常，%2$s", strParentSubType, ex.getMessage()), ex);
				}

			} else {
				this.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
			}
		}

		if (nestedPSDEDataSet != null) {
			return this.selectDataSet(nestedPSDEDataSet, iSearchContextDTO);
		} else {
			return this.select(iSearchContextDTO);
		}
	}

	@Override
	public void create(IEntityDTO iEntityDTO, boolean bGet) throws Throwable {
		Assert.notNull(iEntityDTO, "未传入建立数据对象");
		this.executeAction(DEActions.CREATE, null, new Object[] { iEntityDTO, bGet });
	}

	@Override
	public void update(IEntityDTO iEntityDTO, boolean bGet) throws Throwable {
		Assert.notNull(iEntityDTO, "未传入更新数据对象");
		this.executeAction(DEActions.UPDATE, null, new Object[] { iEntityDTO, bGet });
	}

	@Override
	public synchronized void registerDEAutoCompleteRuntimeBase(String strACTag, IDEAutoCompleteRuntimeBase iDEAutoCompleteRuntime) {

		Assert.hasLength(strACTag, "未传入自填标记");
		Assert.notNull(iDEAutoCompleteRuntime, "未传入实体自填运行时对象");

		if (this.deAutoCompleteRuntimeBaseListMap == null) {
			this.deAutoCompleteRuntimeBaseListMap = new ConcurrentHashMap<String, List<IDEAutoCompleteRuntimeBase>>();
		}

		strACTag = strACTag.toLowerCase();

		List<IDEAutoCompleteRuntimeBase> newList = new ArrayList<IDEAutoCompleteRuntimeBase>();
		List<IDEAutoCompleteRuntimeBase> list = this.deAutoCompleteRuntimeBaseListMap.get(strACTag);
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDEAutoCompleteRuntime);

		Collections.sort(newList, new Comparator<IDEAutoCompleteRuntimeBase>() {
			@Override
			public int compare(IDEAutoCompleteRuntimeBase o1, IDEAutoCompleteRuntimeBase o2) {
				return Integer.valueOf(o1.getPriority()).compareTo(o2.getPriority());
			}
		});

		this.deAutoCompleteRuntimeBaseListMap.put(strACTag, newList);
	}

	@Override
	public synchronized boolean unregisterDEAutoCompleteRuntimeBase(String strACTag, IDEAutoCompleteRuntimeBase iDEAutoCompleteRuntime) {

		Assert.hasLength(strACTag, "未传入自填标记");
		Assert.notNull(iDEAutoCompleteRuntime, "未传入实体自填运行时对象");

		strACTag = strACTag.toLowerCase();

		if (this.deAutoCompleteRuntimeBaseListMap != null) {
			List<IDEAutoCompleteRuntimeBase> newList = new ArrayList<IDEAutoCompleteRuntimeBase>();
			List<IDEAutoCompleteRuntimeBase> list = this.deAutoCompleteRuntimeBaseListMap.get(strACTag);
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDEAutoCompleteRuntime);
			this.deAutoCompleteRuntimeBaseListMap.put(strACTag, newList);
			return bRet;
		}

		return false;
	}

	@Override
	public IDEAutoCompleteRuntimeBase getDEAutoCompleteRuntimeBase(String strACTag, boolean bTryMode) {
		Assert.hasLength(strACTag, "未传入自填标记");

		strACTag = strACTag.toLowerCase();

		if (this.deAutoCompleteRuntimeBaseListMap != null) {
			List<IDEAutoCompleteRuntimeBase> list = this.deAutoCompleteRuntimeBaseListMap.get(strACTag);
			if (!ObjectUtils.isEmpty(list)) {
				return list.get(0);
			}
		}

		return this.getDEAutoCompleteRuntime(strACTag, bTryMode);
	}

	@Override
	public synchronized void registerDEFValueRuleRuntimeBase(String strDEFieldName, IDEFValueRuleRuntimeBase iDEFValueRuleRuntimeBase) {

		Assert.hasLength(strDEFieldName, "未传入附加的属性名称");
		Assert.notNull(iDEFValueRuleRuntimeBase, "未传入附加的属性值规则运行时对象");

		if (this.defValueRuleRuntimeBaseListMap == null) {
			this.defValueRuleRuntimeBaseListMap = new ConcurrentHashMap<String, List<IDEFValueRuleRuntimeBase>>();
		}

		List<IDEFValueRuleRuntimeBase> newList = new ArrayList<IDEFValueRuleRuntimeBase>();
		List<IDEFValueRuleRuntimeBase> list = this.defValueRuleRuntimeBaseListMap.get(strDEFieldName.toUpperCase());
		if (list != null) {
			newList.addAll(list);
		}

		newList.add(iDEFValueRuleRuntimeBase);
		this.defValueRuleRuntimeBaseListMap.put(strDEFieldName.toUpperCase(), newList);
	}

	@Override
	public synchronized boolean unregisterDEFValueRuleRuntimeBase(String strDEFieldName, IDEFValueRuleRuntimeBase iDEFValueRuleRuntimeBase) {
		Assert.hasLength(strDEFieldName, "未传入附加的属性名称");
		Assert.notNull(iDEFValueRuleRuntimeBase, "未传入附加的属性值规则运行时对象");

		if (this.defValueRuleRuntimeBaseListMap != null) {
			List<IDEFValueRuleRuntimeBase> newList = new ArrayList<IDEFValueRuleRuntimeBase>();
			List<IDEFValueRuleRuntimeBase> list = this.defValueRuleRuntimeBaseListMap.get(strDEFieldName.toUpperCase());
			if (list != null) {
				newList.addAll(list);
			}

			boolean bRet = newList.remove(iDEFValueRuleRuntimeBase);
			this.defValueRuleRuntimeBaseListMap.put(strDEFieldName.toUpperCase(), newList);
			return bRet;
		}

		return false;
	}

	protected List<IDEFValueRuleRuntimeBase> getDEFValueRuleRuntimeBases(String strDEFieldName) {
		if (this.defValueRuleRuntimeBaseListMap != null) {
			return this.defValueRuleRuntimeBaseListMap.get(strDEFieldName.toUpperCase());
		}
		return null;
	}

	@Override
	protected boolean checkFieldValueRule(IEntityBase arg0, IPSDEField iPSDEField, boolean bCheckEmpty, boolean bCheckDup, boolean bCheckDEFValueRule, boolean bDynaInstMode, EntityError entityError) throws Throwable {
		boolean bRet = super.checkFieldValueRule(arg0, iPSDEField, bCheckEmpty, bCheckDup, bCheckDEFValueRule, bDynaInstMode, entityError);
		if (!bRet) {
			return bRet;
		}

		// 进一步获取注册的动态值规则
		final List<IDEFValueRuleRuntimeBase> list = this.getDEFValueRuleRuntimeBases(iPSDEField.getName());
		if (!ObjectUtils.isEmpty(list)) {
			Object objValue = this.getFieldValue(arg0, iPSDEField);
			if (objValue instanceof String) {
				objValue = ((String) objValue).trim();
				if (ObjectUtils.isEmpty(objValue)) {
					objValue = null;
				}
			}
			for (IDEFValueRuleRuntimeBase iDEFValueRuleRuntimeBase : list) {
				if (!iDEFValueRuleRuntimeBase.test(objValue, arg0, entityError)) {
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public Object convertEntityDTOFieldValue(String strFieldName, Object value) {
		Assert.hasLength(strFieldName, "传入DTO属性名称无效");
		if (value == null) {
			return value;
		}
		IPSDEMethodDTOField iPSDEMethodDTOField = this.getDEMethodDTORuntime(this.getDefaultPSDEMethodDTO(), false).getPSDEMethodDTOField(strFieldName, true);
		if (iPSDEMethodDTOField == null) {
			iPSDEMethodDTOField = this.getDEMethodDTORuntime(this.getDefaultPSDEMethodDTO(), false).getPSDEMethodDTOFieldByDEField(strFieldName, true);
		}
		if (iPSDEMethodDTOField == null) {
			return value;
		}
		return this.convertEntityDTOFieldValue(iPSDEMethodDTOField, value);
	}

	@Override
	public Object convertEntityDTOFieldValue(IPSDEMethodDTOField iPSDEMethodDTOField, Object value) {
		Assert.notNull(iPSDEMethodDTOField, "传入DTO属性模型对象无效");
		if (value == null) {
			return value;
		}
		if ((DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType()))) {
			if (iPSDEMethodDTOField.getRefPSDataEntity() != null) {
				IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
				if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
					if (iPSDEMethodDTOField.isListMap()) {

						if (!(value instanceof Map)) {
							// 执行序列化，此处代码有问题
							value = refDataEntityRuntime.getSystemRuntime().deserialize(value, Map.class);
						}

						Map srcMap = (Map) value;
						if(ObjectUtils.isEmpty(srcMap)) {
							return value;
						}
						
						for (Object key : srcMap.keySet()) {
							Object item = srcMap.get(key);
							if(item instanceof IEntityDTO) {
								return value;
							}
							else
								break;
						}
						
						Map dtoMap = new LinkedHashMap();
						for (Object key : srcMap.keySet()) {
							try {
								IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), srcMap.get(key));
								dtoMap.put(key, iDEMethodDTO);
							} catch (Exception ex) {
								throw new DataEntityRuntimeException(this, String.format("转化数据[%1$s]至[%2$s]对象发生异常，%3$s", value, refDataEntityRuntime.getName(), ex.getMessage())	,ex);
							}
						}

						return dtoMap;
					} else {
						// 列表模式
						if (!(value instanceof List)) {
							value = refDataEntityRuntime.getSystemRuntime().deserialize(value, List.class);
						}

						List list = (List) value;
						if(ObjectUtils.isEmpty(list)) {
							return value;
						}
						
						for (Object item : list) {
							if(item instanceof IEntityDTO) {
								return value;
							}
							else
								break;
						}
						
						List dtoList = new ArrayList();
						for (Object item : list) {
							try {
								IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), item);
								dtoList.add(iDEMethodDTO);
							} catch (Exception ex) {
								throw new DataEntityRuntimeException(this, String.format("转化数据[%1$s]至[%2$s]对象发生异常，%3$s", value, refDataEntityRuntime.getName(), ex.getMessage())	,ex);
							}
						}
						return dtoList;
					}
				} else {

					if (!(value instanceof Map) && !(value instanceof IEntityDTO)) {
						// 执行序列化，此处代码有问题
						value = refDataEntityRuntime.getSystemRuntime().deserialize(value, Map.class);
					}
					
					if(value instanceof IEntityDTO) {
						return value;
					}
					try {
						return refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), value);
					} catch (Exception ex) {
						throw new DataEntityRuntimeException(this, String.format("转化数据[%1$s]至[%2$s]对象发生异常，%3$s", value, refDataEntityRuntime.getName(), ex.getMessage())	,ex);
					}
				}
			}
		}
		else
			if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())
					||DEMethodDTOFieldTypes.SIMPLES.equals(iPSDEMethodDTOField.getType())) {
				int nStdDataType = iPSDEMethodDTOField.getStdDataType();
				if(nStdDataType != DataTypes.UNKNOWN){
					try {
						if(DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())) {
							return this.getSystemRuntime().convertValue(nStdDataType, value);
						}
						else {
							return this.getSystemRuntime().convertListValue(nStdDataType, value);
						}
					} catch (Exception ex) {
						throw new DataEntityRuntimeException(this, String.format("转化数据[%1$s]至[%2$s]发生异常，%3$s", value, DataTypeUtils.getTypeName(nStdDataType), ex.getMessage())	,ex);
					}
				}
			}
		return value;
	}
	
	@Override
	public void rebuildCopyEntityDTO(IEntityDTO iEntityDTO, boolean bResetUncopyValues, boolean bFillDefaultValues) throws Throwable {
		Assert.notNull(iEntityDTO, "未传入DTO数据对象");
		prepare();
		
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setDEName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}
		
		try {
			onRebuildCopyEntityDTO(iEntityDTO, bResetUncopyValues, bFillDefaultValues);
			if(bOpenActionSession) {
				ActionSessionManager.closeSession(true);
			}
		} catch (Throwable ex) {

			DataEntityRuntimeException.rethrow(this, ex);
			if(bOpenActionSession) {
				ActionSessionManager.closeSession(false);
			}
			
			throw new DataEntityRuntimeException(this, String.format("重建拷贝数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onRebuildCopyEntityDTO(IEntityDTO iEntityDTO, boolean bResetUncopyValues, boolean bFillDefaultValues) throws Throwable {

		IDEMethodDTORuntime iDEMethodDTORuntime = iEntityDTO.getDEMethodDTORuntime();
		if (iDEMethodDTORuntime == null) {
			return;
		}

		List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iDEMethodDTORuntime.getPSDEMethodDTO().getPSDEMethodDTOFields();
		if (ObjectUtils.isEmpty(psDEMethodDTOFieldList)) {
			return;
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		Object originKey = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
		iEntityDTO.reset(this.getKeyPSDEField().getLowerCaseName());
		
		if(bResetUncopyValues) {
			java.util.List<IPSDEField> psDEFields = this.getPSDEFields(true);
			if (psDEFields != null) {
				for (IPSDEField iPSDEField : psDEFields) {
					if (iPSDEField.isKeyDEField() || iPSDEField.isUniTagField()) {
						iEntityDTO.reset(iPSDEField.getLowerCaseName());
						continue;
					}
					
					if(iPSDEField.isPasteReset()) {
						iEntityDTO.reset(iPSDEField.getLowerCaseName());
					}
				}
			}
		}
		
		if(bFillDefaultValues) {
			this.fillEntityDefaultValues(iEntityDTO, DEActions.COPY);
		}
	
		
//		for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
//
//			if (DEMethodDTOFieldTypes.SIMPLE.equals(iPSDEMethodDTOField.getType())) {
//				Object value = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
//				if (ObjectUtils.isEmpty(value)) {
//					continue;
//				}
//
//				if (iPSDEMethodDTOField.getPSDEField() != null) {
//					// 判断是否为引用值
//					if (iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupDEField) {
//						IPSPickupDEField iPSPickupDEField = (IPSPickupDEField) iPSDEMethodDTOField.getPSDEField();
//						if (iPSPickupDEField.getPSDERMust() instanceof IPSDER1N) {
//							IPSDER1N iPSDER1N = (IPSDER1N) iPSPickupDEField.getPSDERMust();
//							String strTag = String.format(ACTIONSESSIONPARAM_COPYSOURCE_X, iPSDER1N.getMajorPSDataEntityMust().getId(), value);
//							Object cache = actionSession.getActionParam(strTag);
//							if(cache instanceof IEntityDTO) {
//								IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntityMust().getId());
//								IEntityDTO cacheEntityDTO = (IEntityDTO)cache;
//								iEntityDTO.set(iPSDEMethodDTOField.getLowerCaseName(), majorDataEntityRuntime.getKeyFieldValue(cacheEntityDTO));
//							}
//						}
//						continue;
//					}
//				}
//			}
//		}

		if (!ObjectUtils.isEmpty(this.getPSDERBases())){
			for(IPSDERBase ipsderBase: this.getPSDERBases()){
				if(ipsderBase instanceof  IPSDER1NBase) {
					IPSDER1NBase iPSDER1N = (IPSDER1NBase) ipsderBase;
					if (iPSDER1N.getPickupPSDEField() != null) {
						Object value = iEntityDTO.get(iPSDER1N.getPickupPSDEField().getLowerCaseName());
						if (ObjectUtils.isEmpty(value)) {
							continue;
						}
						String strTag = String.format(ACTIONSESSIONPARAM_COPYSOURCE_X, iPSDER1N.getMajorPSDataEntityMust().getId(), value);
						Object cache = actionSession.getActionParam(strTag);
						if (cache instanceof IEntityDTO) {
							IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntityMust().getId());
							IEntityDTO cacheEntityDTO = (IEntityDTO) cache;
							iEntityDTO.set(iPSDER1N.getPickupPSDEField().getLowerCaseName(), majorDataEntityRuntime.getKeyFieldValue(cacheEntityDTO));
						}
					}
				}
			}
		}
		
		//重新填充键值
		this.fillEntityKeyValue(iEntityDTO);
		
		String strTag = String.format(ACTIONSESSIONPARAM_COPYSOURCE_X, this.getId(), originKey);
		actionSession.setActionParam(strTag, iEntityDTO);
		
		
		for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
			if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

				Object value = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
				if (ObjectUtils.isEmpty(value)) {
					continue;
				}
				
				if (iPSDEMethodDTOField.getRefPSDataEntity() == null) {
					continue;
				}

				IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
				if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) && iPSDEMethodDTOField.getPSDEField() instanceof IPSPickupObjectDEField) {
					if (value instanceof IEntityDTO) {
						refDataEntityRuntime.rebuildCopyEntityDTO((IEntityDTO) value, bResetUncopyValues, bFillDefaultValues);
					}
					continue;
				}

				Collection<?> collection = null;

				if (value instanceof List) {
					collection = (List) value;
				} else if (value instanceof Map) {
					collection = ((Map) value).values();
				}

				if (!ObjectUtils.isEmpty(collection)) {
					for (Object item : collection) {
						if (!(item instanceof IEntityDTO)) {
							continue;
						}
						refDataEntityRuntime.rebuildCopyEntityDTO((IEntityDTO) item, bResetUncopyValues, bFillDefaultValues);
					}
				}

				continue;

			}
		}
	}

	@Override
	protected void onShutdown() throws Exception {

		this.defaultDEMethodDTORuntime = null;
		this.defaultDEFilterDTORuntime = null;
		this.iSystemPersistentAdapter = null;
		this.iSysDBSchemeRuntime = null;
		this.defaultPSDEDBConfig = null;
		this.iSysBDSchemeRuntime = null;
		this.iDataEntityAccessManager = null;
		this.iDEService = null;
		this.iSubSysServiceAPIRuntime = null;
		this.iSubSysServiceAPIDERuntime = null;
		this.iSystemModuleUtilRuntime = null;
		this.iSystemModuleRuntime = null;
		this.iDEVersionControlUtilRuntime = null;
		this.iDEVersionStorageUtilRuntime = null;
		this.iDENotifySettingUtilRuntime = null;

		if (!ObjectUtils.isEmpty(this.methodMap)) {
			this.methodMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.psDEFSearchModeMap)) {
			this.psDEFSearchModeMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.psDEFieldMap2)) {
			this.psDEFieldMap2.clear();
		}

		if (!ObjectUtils.isEmpty(this.quickSearchPSDEFieldList)) {
			this.quickSearchPSDEFieldList.clear();
		}

		ModelRuntimeUtils.shutdownModelRuntimes(this.deMethodDTORuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataQueryCodeRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.derRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deWFRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deUniStateRuntimeList);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deMapRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deAutoCompleteRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataFlowRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.defGroupRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deTestCaseRuntimeList);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deSearchRuntimeList);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deOPPrivLogicRuntimeList);

		if (!ObjectUtils.isEmpty(this.deActionLogicRuntimeListMap)) {
			for (List<IDEActionLogicRuntime> list : this.deActionLogicRuntimeListMap.values()) {
				ModelRuntimeUtils.shutdownModelRuntimes(list);
			}
			this.deActionLogicRuntimeListMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.deActionLogicRuntimeMap)) {
			for (IDEActionLogicRuntime item : this.deActionLogicRuntimeMap.values()) {
				ModelRuntimeUtils.shutdownModelRuntime(item);
			}
			this.deActionLogicRuntimeMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.deDataSetLogicRuntimeBaseListMap)) {
			this.deDataSetLogicRuntimeBaseListMap.clear();
		}
		if (!ObjectUtils.isEmpty(this.deActionLogicRuntimeBaseListMap)) {
			this.deActionLogicRuntimeBaseListMap.clear();
		}
		if (!ObjectUtils.isEmpty(this.deDataSyncOutRuntimeBaseListMap)) {
			this.deDataSyncOutRuntimeBaseListMap.clear();
		}
		if (!ObjectUtils.isEmpty(this.deUniStateRuntimeBaseListMap)) {
			this.deUniStateRuntimeBaseListMap.clear();
		}
		if (!ObjectUtils.isEmpty(this.deAutoCompleteRuntimeBaseListMap)) {
			this.deAutoCompleteRuntimeBaseListMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.defValueRuleRuntimeBaseListMap)) {
			this.defValueRuleRuntimeBaseListMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.defValueRuleRuntimeBaseListMap)) {
			this.defValueRuleRuntimeBaseListMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.dataEntityInheritLogicListMap)) {
			this.dataEntityInheritLogicListMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.dataEntityExtendLogicListMap)) {
			this.dataEntityExtendLogicListMap.clear();
		}

		if (!ObjectUtils.isEmpty(this.derRuntimeBaseListMap)) {
			this.derRuntimeBaseListMap.clear();
		}

		super.onShutdown();
	}

}
