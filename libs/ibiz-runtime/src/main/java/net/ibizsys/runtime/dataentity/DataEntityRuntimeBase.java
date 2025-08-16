package net.ibizsys.runtime.dataentity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.DEActionPrepareLastMode;
import net.ibizsys.model.PSModelEnums.DEMainStateType;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.DEUnionKeyMode;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.database.IPSDEFDTColumn;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.action.IPSDELogicAction;
import net.ibizsys.model.dataentity.action.IPSDEScriptAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.datamap.IPSDEMap;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.dataentity.der.IPSDER11;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.der.IPSDERIndex;
import net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap;
import net.ibizsys.model.dataentity.der.IPSDERInherit;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.dts.IPSDEDTSQueue;
import net.ibizsys.model.dataentity.logic.IPSDEFLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.mainstate.IPSDEMainState;
import net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction;
import net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.unistate.IPSDEUniState;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.DynaInstModes;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.IModelRuntimeSetting;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeSetting;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.ModelRuntimeSetting;
import net.ibizsys.runtime.dataentity.action.CheckKeyStates;
import net.ibizsys.runtime.dataentity.action.DEActionLogicAttachModes;
import net.ibizsys.runtime.dataentity.action.DEActionLogicTypes;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.action.DEActionTypes;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncEvents;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.dataentity.defield.DEFDupCheckModes;
import net.ibizsys.runtime.dataentity.defield.DEFGroupTypes;
import net.ibizsys.runtime.dataentity.defield.DEFPredefinedTypes;
import net.ibizsys.runtime.dataentity.der.DER1NMasterRSTypes;
import net.ibizsys.runtime.dataentity.der.DERRemoveActionTypes;
import net.ibizsys.runtime.dataentity.der.DERSubTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;
import net.ibizsys.runtime.dataentity.ds.DEDataQueryViewLevels;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.mainstate.DEMainStateActionDenyException;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;
import net.ibizsys.runtime.dataentity.security.DEDataAccCtrlModes;
import net.ibizsys.runtime.dataentity.security.DEDataAuditModes;
import net.ibizsys.runtime.dataentity.util.DEUtilTypes;
import net.ibizsys.runtime.dataentity.util.IDEDataAuditUtilRuntime;
import net.ibizsys.runtime.dataentity.util.IDEDynaStorageUtilRuntime;
import net.ibizsys.runtime.dataentity.util.IDEFileUtilRuntime;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.ISysValueFuncRuntime;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionBackup;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DBTypes;
import net.ibizsys.runtime.util.DataEntityRuntimeHolder;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.EntityException;
import net.ibizsys.runtime.util.EntityFieldError;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IActionSessionLog;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.ModelRuntimeUtils;
import net.ibizsys.runtime.util.TransactionModes;

/**
 * 实体运行时对象实现基类
 * @author lionlau
 *
 */
public abstract class DataEntityRuntimeBase extends DataEntityUtilRuntimeBase implements IDataEntityRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRuntimeBase.class);

	private static final Map<String, String> MSCtrlActionModeMap = new HashMap<String, String>();
	private static final Map<String, String> IgnoreCheckDEFPredefinedTypeMap = new HashMap<String, String>();

	/**
	 * 递归操作类型：继承实体操作
	 */
	public static final String RECURSION_INHERITACTION = "INHERITACTION";
	
	static {
		MSCtrlActionModeMap.put(DEActionModes.UPDATE, "");
		MSCtrlActionModeMap.put(DEActionModes.DELETE, "");
		MSCtrlActionModeMap.put(DEActionModes.CUSTOM, "");

		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.LOGICVALID, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.CREATEMAN, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.CREATEMANNAME, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.CREATEDATE, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.UPDATEMAN, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.UPDATEMANNAME, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.UPDATEDATE, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.ORGID, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.ORGNAME, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.ORGSECTORID, "");
		IgnoreCheckDEFPredefinedTypeMap.put(DEFPredefinedTypes.ORGSECTORNAME, "");
	}
	
	protected static final String DEMAINSTATE_LOCK = "{%%LOCK%%}";
	
	protected static final String DEMAINSTATE_CLOSE = "{%%CLOSE%%}";
	

	private IPSDataEntity iPSDataEntity = null;
	private boolean bPreparePSDataEntity = false;
	private Map<String, IPSDEMainState> psDEMainStateMap = null;
	private Map<String, IPSDEDataSet> psDEDataSetMap = new HashMap<String, IPSDEDataSet>();
	private Map<String, IDEDataSetRuntime> deDataSetRuntimeMap = null;
	private Map<String, IPSDEDataQuery> psDEDataQueryMap = new HashMap<String, IPSDEDataQuery>();
	private Map<String, IDEActionRuntime> deActionRuntimeMap = null;


	private IPSDEMap defaultPSDEMap = null;
	private Map<String, List<IPSDEMainState>> psDEActionDenyMainStateMap = null;
	private IPSDEField keyPSDEField = null;
	private IPSDEField majorPSDEField = null;
	private IPSDEField keyNamePSDEField = null;
	private IPSDEField uniTagPSDEField = null;
	private IPSDEField orgIdPSDEField = null;
	private IPSDEField deptIdPSDEField = null;
	// private IPSDEField bcPSDEField = null;
	private IPSDEField dataTypePSDEField = null;
	private String strOrgIdQueryExp = null;
	private String strDeptIdQueryExp = null;
	private String strKeyQueryExp = null;
	private String strMajorQueryExp = null;
	private String strDataTypeQueryExp = null;
	private int nDynaInstMode = DynaInstModes.DISABLE;
	private String strDynaInstTag = null;
	private IPSDEWF defaultPSDEWF = null;
	private IPSDEUniState defaultPSDEUniState = null;
	private IPSDEDTSQueue defaultPSDEDTSQueue = null;

	private boolean bInheritMajor = false;
	private boolean bInheritMinor = false;
	private boolean bIndexMajor = false;
	private boolean bIndexMinor = false;
	private IPSDERInherit iPSDERInherit = null;
	private IDataEntityRuntime inheritDataEntityRuntime = null;
	//private IPSDEDataQuery privPSDEDataQuery = null;
	private IPSDEDataQuery simplePSDEDataQuery = null;
	private IPSDEDataQuery auditPSDEDataQuery = null;
	private IPSDEDataQuery defaultPSDEDataQuery = null;
	private IPSDEDataSet defaultPSDEDataSet = null;
	private IPSDEDataQuery viewPSDEDataQuery = null;
	private IPSDEDataSet viewPSDEDataSet = null;
	private IPSDEDataImport defaultPSDEDataImport = null;
	private IPSDEDataExport defaultPSDEDataExport = null;

	private List<IPSDEUserRole> defaultPSDEUserRoleList = null;
	private List<IPSDEField> unionKeyValuePSDEFieldList = null;
	private List<IPSDEField> valueFuncPSDEFieldList = null;

	private int nStorageMode = DEStorageModes.SQL;

	private int nDataAuditMode = DEDataAuditModes.NONE;
	private int nDataAccCtrlMode = DEDataAccCtrlModes.SELF;

	private Map<String, IDEUtilRuntime> deUtilRuntimeMap = null;
	private IDEDataAuditUtilRuntime iDEDataAuditUtilRuntime = null;

	private boolean bEnableDynaStorage = true;
	private IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime = null;

	private Map<String, String> deFieldQueryExpMap = new HashMap<String, String>();

	private IPSDEField udStatePSDEField = null;

	private Object objEntityWFState = null;

	private int nSaaSMode = DESaaSModes.NONE;

	private IPSDER1N recursivePSDER1N = null;

	private IPSDEField parentIdPathPSDEField = null;

	private IPSDEField parentNamePathPSDEField = null;

	private IPSDEField orderValuePSDEField = null;

	private IPSDEField dynaStoragePSDEField = null;
	
	private IPSDEField closeFlagPSDEField = null;
	
	private IPSDEField lockFlagPSDEField = null;

	private Map<String, IPSDEField> predefinedPSDEFieldMap = new HashMap<String, IPSDEField>();
	
	private Map<String, IPSDEField> tagPSDEFieldMap = null;

	private boolean bEnableLogicValid = false;

	private Object logicValidValue = null;

	private Object logicInvalidValue = null;

	private IPSDEField logicValidPSDEField = null;

	private Map<String, IDEActionPluginRuntime> deActionPluginRuntimeMap = null;

	private Map<String, IDEDataSetPluginRuntime> deDataSetPluginRuntimeMap = null;

	private boolean bVirtual = false;

	private int nVirtualMode = DEVirtualModes.NONE;

	private List<IPSDERMultiInherit> psDERMultiInheritList = null;

	private Map<String, IPSDERBase> masterPSDERMap = null;

	private List<IPSDERBase> masterPSDERList = null;

	private List<IPSDERBase> notifyPSDERList = null;
	
	private List<IPSDER1NBase> clonePSDER1NList = null;
	
	private List<IPSDERBase> allMasterPSDERList = null;

	private List<IPSDERBase> allNotifyPSDERList = null;
	
	private List<IPSDER1NBase> allClonePSDER1NList = null;
	
	private List<IPSDERBase> allPSDERList = null;
	

	//private boolean bEnableParentMainState = false;
	
	private int nDEType = DETypes.MAJOR;

	private String strLogicName = null;

	private IModelRuntimeSetting iModelRuntimeSetting = null;

	private String strUnionKeyMode = null;

	private String strUnionKeyParam = null;

	private boolean bEnableEntityOnChangeLogic = false;
	
	private Map<IDataEntityEventListener, String[]> dataEntityEventListenerMap = new LinkedHashMap<IDataEntityEventListener, String[]>();
	
	private Set<IDataEntityOnChangeLogic> dataEntityOnChangeLogicSet = new LinkedHashSet<IDataEntityOnChangeLogic>();
	
	/**
	 * 排序范围数据集
	 */
	private IPSDEDataSet orderScopePSDEDataSet = null;
	
	/**
	 * 排序初始化值
	 */
	private Integer orderInitialValue = null;
	
	
	/**
	 * 排序步进值
	 */
	private Integer orderStepValue = null;
	

	// private List<IPSDEDataQueryCode> defaultPSDEUserRoleQueryCodeList = null;

	/**
	 * 实体运行时上下文对象
	 */
	private IDataEntityRuntimeContext iDataEntityRuntimeContext = new IDataEntityRuntimeContext() {

		@Override
		public IDataEntityRuntime getDataEntityRuntime() {
			return getSelf();
		}

		@Override
		public Object executeActionReal(IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
			return getSelf().onExecuteActionReal(iPSDEAction.getName(), iPSDEAction, args, actionData);
		}

		@Override
		public Object fetchDataSetReal(IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
			return getSelf().onFetchDataSetReal(iPSDEDataSet.getName(), iPSDEDataSet, args, actionData);
		}
		
		@Override
		public void fireDataEntityEvent(String event, Object[] params) {
			getSelf().fireDataEntityEvent(event, params);
		}

	};

	/**
	 * 获取简单数据对象
	 *
	 * @param objKey
	 *            可能是主键，也可能是数据对象
	 * @return
	 */
	protected abstract IEntityBase getSimpleEntity(Object objKey);

	private DataEntityRuntimeBase getSelf() {
		return this;
	}

	/**
	 * 获取当前用户上下文
	 *
	 * @return
	 */
	protected IUserContext getUserContext() {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}

	@Override
	protected IDataEntityRuntimeBaseContext getDataEntityRuntimeBaseContext() {
		return getDataEntityRuntimeContext();
	}

	/**
	 * 获取最后的数据（此方法后续将调整）
	 *
	 * @param arg0
	 * @return
	 */
	@Deprecated
	protected IEntityBase getLastEntity(Object arg0) {
		// 获取数据主键
		Object objKey = null;
		if (arg0 instanceof IEntityBase) {
			objKey = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKey = arg0;
		}

		return getSimpleEntity(objKey);
	}

	@Override
	public final IPSDataEntity getPSDataEntity() throws Exception {
		if (this.iPSDataEntity == null || this.bPreparePSDataEntity) {
			return internalGetPSDataEntity();
		}
		return this.iPSDataEntity;
	}

	/**
	 * 内部获取实体模型对象
	 *
	 * @return
	 * @throws Exception
	 */
	protected synchronized IPSDataEntity internalGetPSDataEntity() throws Exception {
		if (this.iPSDataEntity == null) {
			this.bPreparePSDataEntity = true;
			long nTime = System.currentTimeMillis();
			IPSDataEntity iPSDataEntity = getSystemRuntime().getPSSystem().getPSDataEntity(this.getId(), false);

			iPSDataEntity.getAllPSDEFields();
			iPSDataEntity.getMainStatePSDEFields();
			iPSDataEntity.getAllPSDEMainStates();
			iPSDataEntity.getAllPSDEActions();
			iPSDataEntity.getAllPSDEDataSets();
			iPSDataEntity.getAllPSDEDataQueries();
			this.iPSDataEntity = iPSDataEntity;

			// 设置实体配置目录
			String strConfigFolder = ISystemRuntimeSetting.CONFIGFOLDER_DATAENTITY + "." + PSModelUtils.calcUniqueTag(iPSDataEntity.getPSSystemModule(), iPSDataEntity.getName());
			this.setSetting(new ModelRuntimeSetting(this, getSystemRuntime().getSystemRuntimeSetting(), strConfigFolder));
			try {
				onInit();
				this.bPreparePSDataEntity = false;
			} catch (Exception ex) {
				this.bPreparePSDataEntity = false;
				this.iPSDataEntity = null;
				log.error(String.format("初始化实体[%1$s][%2$s]发生异常，%3$s", this.getName(), this.getId(), ex.getMessage()));
				throw ex;
			}
			nTime = System.currentTimeMillis() - nTime;
			log.debug(String.format("实体[%1$s][%2$s]运行时加载耗时[%3$s]ms", this.getName(), this.getId(), nTime));
		}
		return this.iPSDataEntity;
	}

	protected void prepare() {
		if (this.iPSDataEntity != null && !this.bPreparePSDataEntity) {
			return;
		}
		try {
			getPSDataEntity();
		} catch (Exception e) {
			log.error(String.format("加载实体模型发生异常，%1$s", e.getMessage()));
			throw new DataEntityRuntimeException(this, String.format("加载实体模型发生异常，%1$s", e.getMessage()), e);
		}
	}

	protected void onInit() throws Exception {

		this.nStorageMode = this.onGetStorageMode();// this.getPSDataEntity().getStorageMode();
		this.nDynaInstMode = this.getPSDataEntity().getDynaInstMode();
		this.strDynaInstTag = this.getPSDataEntity().getDynaInstTag();
		this.nDataAuditMode = this.getPSDataEntity().getAuditMode();
		this.nDataAccCtrlMode = this.getPSDataEntity().getDataAccCtrlMode();
		this.nDEType = this.getPSDataEntity().getDEType();
		this.nSaaSMode = this.getPSDataEntity().getSaaSMode();
		this.strLogicName = this.getPSDataEntity().getLogicName();

		this.bVirtual = this.getPSDataEntity().isVirtual();
		if (this.bVirtual) {
			this.nVirtualMode = this.getPSDataEntity().getVirtualMode();
			this.psDERMultiInheritList = new ArrayList<>();
		}

		String strIndexDEType = this.getPSDataEntity().getIndexDEType();
		if (StringUtils.hasLength(strIndexDEType)) {
			if (DEIndexTypes.INHERIT.equals(strIndexDEType)) {
				this.bInheritMajor = true;
			} else if (DEIndexTypes.INDEX.equals(strIndexDEType)) {
				this.bIndexMajor = true;
			}
		}
		if (!this.isInheritMajor()) {
			// 判断是否有继承关系
			this.iPSDERInherit = this.getPSDataEntity().getPSDERInherit();
			if (this.iPSDERInherit != null) {
				this.bInheritMinor = true;
			}
		}

		super.onInit();

		this.psDEDataSetMap.clear();
		java.util.List<IPSDEDataSet> psDEDataSets = this.getPSDataEntity().getAllPSDEDataSets();
		if (psDEDataSets != null) {
			for (IPSDEDataSet iPSDEDataSet : psDEDataSets) {
				if (iPSDEDataSet.isDefaultMode()) {
					this.defaultPSDEDataSet = iPSDEDataSet;
				}
				this.psDEDataSetMap.put(iPSDEDataSet.getName().toLowerCase(), iPSDEDataSet);
				IDEDataSetRuntime iDEDataSetRuntime = this.createDEDataSetRuntime(iPSDEDataSet);
				if (iDEDataSetRuntime != null) {
					try {
						iDEDataSetRuntime.init(this.getDataEntityRuntimeContext(), iPSDEDataSet);
					} catch (Exception ex) {
						throw new Exception(String.format("初始化实体数据集[%1$s]运行时对象发生异常，%2$s", iPSDEDataSet.getName(), ex.getMessage()), ex);
					}
					if (this.deDataSetRuntimeMap == null) {
						this.deDataSetRuntimeMap = new HashMap<>();
					}
					this.deDataSetRuntimeMap.put(iPSDEDataSet.getId(), iDEDataSetRuntime);
				}
			}

			if (this.defaultPSDEDataSet == null) {
				for (IPSDEDataSet iPSDEDataSet : psDEDataSets) {
					if ("DEFAULT".equalsIgnoreCase(iPSDEDataSet.getName())) {
						this.defaultPSDEDataSet = iPSDEDataSet;
						break;
					}
				}
			}
			
			for (IPSDEDataSet iPSDEDataSet : psDEDataSets) {
				if (iPSDEDataSet.getViewLevel() == DEDataQueryViewLevels.ALL) {
					if ("VIEW".equalsIgnoreCase(iPSDEDataSet.getName())) {
						this.viewPSDEDataSet = iPSDEDataSet;
						break;
					} else {
						this.viewPSDEDataSet = iPSDEDataSet;
					}
				}
			}

			if (this.viewPSDEDataSet == null) {
				this.viewPSDEDataSet = defaultPSDEDataSet;
			}
		}

		this.unionKeyValuePSDEFieldList = this.getPSDataEntity().getUnionKeyValuePSDEFields();
		if (!ObjectUtils.isEmpty(this.unionKeyValuePSDEFieldList)) {
			this.strUnionKeyMode = this.getPSDataEntity().getUnionKeyMode();
			this.strUnionKeyParam = this.getPSDataEntity().getUnionKeyParam();
			if (!StringUtils.hasLength(this.strUnionKeyMode)) {
				this.strUnionKeyMode = DEUnionKeyMode.DIGEST.value;
			}
			if (this.strUnionKeyMode.equals(DEUnionKeyMode.DELIMITER.value)) {
				if (!StringUtils.hasLength(this.strUnionKeyParam)) {
					this.strUnionKeyParam = "-";
				}
			}
		}

		java.util.List<IPSDEField> psDEFields = this.getPSDataEntity().getAllPSDEFields();
		if (!ObjectUtils.isEmpty(psDEFields)) {
			for (IPSDEField iPSDEField : psDEFields) {

				if (iPSDEField.getOnChangePSDEFLogic() != null) {
					this.bEnableEntityOnChangeLogic = true;
				}

				String strQueryExp = calcFieldQueryExp(iPSDEField);
				deFieldQueryExpMap.put(iPSDEField.getName().toUpperCase(), strQueryExp);

				// 判断是否需要进行搜索条件的值处理
				java.util.List<IPSDEFSearchMode> psDEFSearchModes = iPSDEField.getAllPSDEFSearchModes();
				if (psDEFSearchModes != null) {
					boolean bHasValueFunc = false;
					for (IPSDEFSearchMode iPSDEFSearchMode : psDEFSearchModes) {
						if (StringUtils.hasLength(iPSDEFSearchMode.getValueFunc())) {
							ISysValueFuncRuntime iSysValueFuncRuntime = this.getSystemRuntime().getSysValueFuncRuntime(iPSDEFSearchMode.getValueFunc());
							if (iSysValueFuncRuntime == null) {
								throw new Exception(String.format("无法获取指定值函数[%1$s]运行时对象", iPSDEFSearchMode.getValueFunc()));
							}
							bHasValueFunc = true;
							break;
						}
					}
					if (bHasValueFunc) {
						if (this.valueFuncPSDEFieldList == null) {
							this.valueFuncPSDEFieldList = new ArrayList<IPSDEField>();
						}
						this.valueFuncPSDEFieldList.add(iPSDEField);
					}
				}

				if (iPSDEField.isKeyDEField()) {
					this.keyPSDEField = iPSDEField;
					this.strKeyQueryExp = strQueryExp;
				}
				if (iPSDEField.isMajorDEField()) {
					this.majorPSDEField = iPSDEField;
					this.strMajorQueryExp = strQueryExp;
				}
				if (iPSDEField.isKeyNameDEField()) {
					this.keyNamePSDEField = iPSDEField;
				} else {
					this.keyNamePSDEField = this.majorPSDEField;
				}

				if (iPSDEField.isDataTypeDEField()) {
					this.dataTypePSDEField = iPSDEField;
					this.strDataTypeQueryExp = strQueryExp;
				}
				if (iPSDEField.isUniTagField()) {
					this.uniTagPSDEField = iPSDEField;
				}

				if(StringUtils.hasLength(iPSDEField.getFieldTag())) {
					if(this.tagPSDEFieldMap == null) {
						this.tagPSDEFieldMap = new HashMap<String, IPSDEField>();
					}
					this.tagPSDEFieldMap.put(iPSDEField.getFieldTag().toUpperCase(), iPSDEField);
				}
				
				if (StringUtils.hasLength(iPSDEField.getPredefinedType()) && !DEFPredefinedTypes.NONE.equals(iPSDEField.getPredefinedType())) {

					predefinedPSDEFieldMap.put(iPSDEField.getPredefinedType(), iPSDEField);

					if (DEFPredefinedTypes.ORGID.equals(iPSDEField.getPredefinedType())) {
						this.orgIdPSDEField = iPSDEField;
						this.strOrgIdQueryExp = strQueryExp;
						continue;
					}

					if (DEFPredefinedTypes.ORGSECTORID.equals(iPSDEField.getPredefinedType())) {
						this.deptIdPSDEField = iPSDEField;
						this.strDeptIdQueryExp = strQueryExp;
						continue;
					}

					if (DEFPredefinedTypes.PARENTIDPATH.equals(iPSDEField.getPredefinedType())) {
						this.parentIdPathPSDEField = iPSDEField;
						continue;
					}

					if (DEFPredefinedTypes.PARENTNAMEPATH.equals(iPSDEField.getPredefinedType())) {
						this.parentNamePathPSDEField = iPSDEField;
						continue;
					}

					if (DEFPredefinedTypes.ORDERVALUE.equals(iPSDEField.getPredefinedType())) {
						this.orderValuePSDEField = iPSDEField;
						continue;
					}

					if (DEFPredefinedTypes.DYNASTORAGE.equals(iPSDEField.getPredefinedType())) {
						this.dynaStoragePSDEField = iPSDEField;
						continue;
					}
					
					if (DEFPredefinedTypes.CLOSEFLAG.equals(iPSDEField.getPredefinedType())) {
						this.closeFlagPSDEField = iPSDEField;
						continue;
					}
					
					if (DEFPredefinedTypes.LOCKFLAG.equals(iPSDEField.getPredefinedType())) {
						this.lockFlagPSDEField = iPSDEField;
						continue;
					}
					
				}
			}
		}

		if (this.getKeyPSDEField() == null) {
			throw new ModelException(this.getPSDataEntity(), String.format("实体[%1$s][%2$s]未定义主键属性", this.getName(), this.getId()));
		}
		if (this.uniTagPSDEField == null) {
			if (DataTypeUtils.isStringDataType(this.getKeyPSDEField().getStdDataType())) {
				this.uniTagPSDEField = this.getKeyPSDEField();
			}
		}

		if (this.getPSDataEntity().isLogicValid()) {
			this.logicValidPSDEField = predefinedPSDEFieldMap.get(DEFPredefinedTypes.LOGICVALID);
			if (this.logicValidPSDEField == null) {
				throw new ModelException(this.getPSDataEntity(), String.format("实体[%1$s][%2$s]启用逻辑有效，但未指定逻辑有效属性", this.getName(), this.getId()));
			}
			this.bEnableLogicValid = true;
			if (StringUtils.hasLength(this.getPSDataEntity().getValidLogicValue())) {
				this.logicValidValue = this.getSystemRuntime().convertValue(this.logicValidPSDEField.getStdDataType(), this.getPSDataEntity().getValidLogicValue());
			} else {
				this.logicValidValue = this.getSystemRuntime().convertValue(this.logicValidPSDEField.getStdDataType(), "1");
			}
			if (StringUtils.hasLength(this.getPSDataEntity().getInvalidLogicValue())) {
				this.logicInvalidValue = this.getSystemRuntime().convertValue(this.logicValidPSDEField.getStdDataType(), this.getPSDataEntity().getInvalidLogicValue());
			} else {
				this.logicInvalidValue = this.getSystemRuntime().convertValue(this.logicValidPSDEField.getStdDataType(), "0");
			}
		}

		if (this.getDynaInstMode() == DynaInstModes.ENABLEINST && this.getDataTypePSDEField() == null) {
			log.warn(String.format("实体[%1$s][%2$s]启用动态实例副本但未定义数据类型属性，切换至常规实例模式", this.getName(), this.getId()));
			this.nDynaInstMode = DynaInstModes.ENABLE;
		}
		if (this.getDynaInstMode() == DynaInstModes.ENABLEINST) {
			if (this.isInheritMajor()) {
				log.warn(String.format("实体[%1$s][%2$s]启用动态实例副本，忽略继承主实体模式", this.getName(), this.getId()));
				this.bInheritMajor = false;
			}
		}
		if (this.isInheritMajor() && this.getDataTypePSDEField() == null) {
			log.warn(String.format("实体[%1$s][%2$s]启用主实体模式但未定义数据类型属性，忽略继承主实体模式", this.getName(), this.getId()));
			this.bInheritMajor = false;
		}

		// 计算关系
		if (this.nDataAccCtrlMode == DEDataAccCtrlModes.MASTER || this.nDataAccCtrlMode == DEDataAccCtrlModes.MASTER_SELF) {
			this.masterPSDERMap = new HashMap<>();
			this.masterPSDERList = new ArrayList<IPSDERBase>();
		}

		java.util.List<IPSDERBase> psDERBases = this.getPSDataEntity().getMinorPSDERs();
		if (!ObjectUtils.isEmpty(psDERBases)) {

			this.notifyPSDERList = new ArrayList<IPSDERBase>();
			for (IPSDERBase iPSDERBase : psDERBases) {
				if (masterPSDERMap != null) {
					if (iPSDERBase instanceof IPSDER1N) {
						// 包括 DER11
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.DAC) == DER1NMasterRSTypes.DAC) {
							masterPSDERMap.put(iPSDER1N.getMajorPSDataEntityMust().getId(), iPSDER1N);
							masterPSDERMap.put(iPSDER1N.getMajorPSDataEntityMust().getName(), iPSDER1N);

							if (iPSDER1N.getMasterOrder() > 0) {
								this.masterPSDERList.add(iPSDER1N);
//								if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.MAINSTATE) == DER1NMasterRSTypes.MAINSTATE) {
//									this.bEnableParentMainState = true;
//								}
							}
						}
					} else if (iPSDERBase instanceof IPSDERCustom) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
						if (DERSubTypes.DER11.equals(iPSDERCustom.getDERSubType()) || DERSubTypes.DER1N.equals(iPSDERCustom.getDERSubType())) {
							if ((iPSDERCustom.getMasterRS() & DER1NMasterRSTypes.DAC) == DER1NMasterRSTypes.DAC) {
								masterPSDERMap.put(iPSDERCustom.getMajorPSDataEntityMust().getId(), iPSDERCustom);
								masterPSDERMap.put(iPSDERCustom.getMajorPSDataEntityMust().getName(), iPSDERCustom);

								if (iPSDERCustom.getMasterOrder() > 0) {
									this.masterPSDERList.add(iPSDERCustom);
//									if ((iPSDERCustom.getMasterRS() & DER1NMasterRSTypes.MAINSTATE) == DER1NMasterRSTypes.MAINSTATE) {
//										this.bEnableParentMainState = true;
//									}
								}
							}
						}
					}
				}

				if (iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
					if (iPSDER1N.getMajorPSDataEntity().getId().equals(this.getId())) {
						if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RECURSIVE) == DER1NMasterRSTypes.RECURSIVE) {
							this.recursivePSDER1N = iPSDER1N;
						}
					}
					if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.NOTIFY) == DER1NMasterRSTypes.NOTIFY) {
						this.notifyPSDERList.add(iPSDER1N);
					}
				} else if (iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
					if (DERSubTypes.DER11.equals(iPSDERCustom.getDERSubType()) || DERSubTypes.DER1N.equals(iPSDERCustom.getDERSubType())) {
						if ((iPSDERCustom.getMasterRS() & DER1NMasterRSTypes.NOTIFY) == DER1NMasterRSTypes.NOTIFY) {
							this.notifyPSDERList.add(iPSDERCustom);
						}
					}
				}

				if (this.bVirtual) {
					if (DERTypes.DERMULINH.equals(iPSDERBase.getDERType())) {
						this.psDERMultiInheritList.add((IPSDERMultiInherit) iPSDERBase);
						continue;
					}
				}

				if (DERTypes.DERINDEX.equals(iPSDERBase.getDERType())) {
					this.bIndexMinor = true;
					continue;
				}
			}

			if (!ObjectUtils.isEmpty(this.masterPSDERList)) {
				Collections.sort(this.masterPSDERList, new Comparator<IPSDERBase>() {
					@Override
					public int compare(IPSDERBase arg0, IPSDERBase arg1) {
						Integer val0 = -1;
						Integer val1 = -1;
						if (arg0 instanceof IPSDER1N) {
							val0 = ((IPSDER1N) arg0).getMasterOrder();
						} else if (arg0 instanceof IPSDERCustom) {
							val0 = ((IPSDERCustom) arg0).getMasterOrder();
						}

						if (arg1 instanceof IPSDER1N) {
							val1 = ((IPSDER1N) arg1).getMasterOrder();
						} else if (arg1 instanceof IPSDERCustom) {
							val1 = ((IPSDERCustom) arg1).getMasterOrder();
						}

						return val0.compareTo(val1);

					}
				});
			}
			


			// 排序通知次序（占不排序）
			// if(!ObjectUtils.isEmpty(this.notifyPSDERList)) {
			// Collections.sort(this.notifyPSDERList, new
			// Comparator<IPSDERBase>() {
			// @Override
			// public int compare(IPSDERBase arg0, IPSDERBase arg1) {
			// Integer val0 = -1;
			// Integer val1 = -1;
			// if(arg0 instanceof IPSDER1N) {
			// val0 = ((IPSDER1N)arg0).getMasterOrder();
			// }
			// else if(arg0 instanceof IPSDERCustom) {
			// val0 = ((IPSDERCustom)arg0).getMasterOrder();
			// }
			//
			// if(arg1 instanceof IPSDER1N) {
			// val1 = ((IPSDER1N)arg1).getMasterOrder();
			// }
			// else if(arg1 instanceof IPSDERCustom) {
			// val1 = ((IPSDERCustom)arg1).getMasterOrder();
			// }
			//
			// return val0.compareTo(val1);
			//
			// }
			// });
			// }
		}

		java.util.List<IPSDERBase> majorPSDERBases = this.getPSDataEntity().getMajorPSDERs();
		if (!ObjectUtils.isEmpty(majorPSDERBases)) {
			List<IPSDER1NBase> clonePSDER1NList = new ArrayList<IPSDER1NBase>(); 

			for (IPSDERBase iPSDERBase : majorPSDERBases) {
				if (iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
					if(iPSDER1N.getCloneOrder() > 0) {
						clonePSDER1NList.add(iPSDER1N);
					}
				} else if (iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
					if (DERSubTypes.DER11.equals(iPSDERCustom.getDERSubType()) || DERSubTypes.DER1N.equals(iPSDERCustom.getDERSubType())) {
						if(iPSDERCustom.getCloneOrder()>0) {
							clonePSDER1NList.add(iPSDERCustom);
						}
					}
				}
			}
			
			if (!ObjectUtils.isEmpty(clonePSDER1NList)) {
				Collections.sort(clonePSDER1NList, new Comparator<IPSDER1NBase>() {
					@Override
					public int compare(IPSDER1NBase arg0, IPSDER1NBase arg1) {
						return Integer.compare(arg0.getCloneOrder(), arg1.getCloneOrder());
					}
				});
				this.clonePSDER1NList = Collections.unmodifiableList(clonePSDER1NList);
			}
		}
		if (this.bVirtual) {
			if (nVirtualMode == DEVirtualModes.MINHERIT) {
				if (this.psDERMultiInheritList == null || this.psDERMultiInheritList.size() == 0) {
					throw new ModelException(this.getPSDataEntity(), String.format("实体[%1$s][%2$s]启用多继承虚拟实体模式，但未指定多继承关系", this.getName(), this.getId()));
				}
			}
		}

		if (this.parentIdPathPSDEField != null || this.parentNamePathPSDEField != null) {
			if (this.recursivePSDER1N == null) {
				log.warn(String.format("实体[%1$s][%2$s]指定了父值路径或父名称路径属性但未指定实体递归关系，忽略相关属性", this.getName(), this.getId()));
				this.parentIdPathPSDEField = null;
				this.parentNamePathPSDEField = null;
			}
			if (this.parentNamePathPSDEField != null && this.majorPSDEField == null) {
				log.warn(String.format("实体[%1$s][%2$s]指定了父名称路径属性但未指定主信息属性，忽略相关属性", this.getName(), this.getId()));
				this.parentNamePathPSDEField = null;
			}
		}

		java.util.List<IPSDEMainState> psDEMainStates = this.getPSDataEntity().getAllPSDEMainStates();
		if (!ObjectUtils.isEmpty(psDEMainStates)) {
			this.psDEMainStateMap = new HashMap<String, IPSDEMainState>();
			this.psDEActionDenyMainStateMap = new HashMap<String, List<IPSDEMainState>>();
			for (IPSDEMainState iPSDEMainState : psDEMainStates) {
				DEMainStateType deMainStateType = DEMainStateType.from(iPSDEMainState.getMSType());
				switch(deMainStateType) {
				case NORMAL:
				case DEFAULT:
					this.psDEMainStateMap.put(iPSDEMainState.getMSTag(), iPSDEMainState);
					break;
				case CLOSE:
					this.psDEMainStateMap.put(DEMAINSTATE_CLOSE, iPSDEMainState);
					break;
				case LOCK:
					this.psDEMainStateMap.put(DEMAINSTATE_LOCK, iPSDEMainState);
					break;
				default:
					break;
				}
			}
		}

		java.util.List<IPSDEAction> psDEActions = this.getPSDataEntity().getAllPSDEActions();
		if (psDEActions != null) {
			for (IPSDEAction iPSDEAction : psDEActions) {

				IDEActionRuntime iDEActionRuntime = this.createDEActionRuntime(iPSDEAction);
				if (iDEActionRuntime != null) {
					iDEActionRuntime.init(this.getDataEntityRuntimeContext(), iPSDEAction);
					if (this.deActionRuntimeMap == null) {
						this.deActionRuntimeMap = new HashMap<>();
					}
					this.deActionRuntimeMap.put(iPSDEAction.getId(), iDEActionRuntime);
				}

				// 注册行为插件
				// this.registerPSDEActionPlugin(iPSDEAction);

				if (psDEMainStates != null) {

					ArrayList<IPSDEMainState> psDEMainStateList = new ArrayList<IPSDEMainState>();

					for (IPSDEMainState iPSDEMainState : psDEMainStates) {

						boolean bContainsAction = false;
						java.util.List<IPSDEMainStateAction> psDEMainStateActions = iPSDEMainState.getPSDEMainStateActions();
						if (psDEMainStateActions != null) {
							for (IPSDEMainStateAction iPSDEMainStateAction : psDEMainStateActions) {
								if (iPSDEAction.getName().equals(iPSDEMainStateAction.getPSDEAction().getName())) {
									bContainsAction = true;
									break;
								}
							}
						}

						// 允许逻辑反向解释为拒绝其它
						if (iPSDEMainState.isActionAllowMode()) {
							if (!bContainsAction) {
								// 必须对指定行为模式的才进行附加，避免加入GET等操作
								if (MSCtrlActionModeMap.containsKey(iPSDEAction.getActionMode())) {
									psDEMainStateList.add(iPSDEMainState);
								}
							}
						} else {
							if (bContainsAction) {
								psDEMainStateList.add(iPSDEMainState);
							}
						}
					}

					if (psDEMainStateList.size() > 0) {
						psDEActionDenyMainStateMap.put(iPSDEAction.getName(), psDEMainStateList);
					}
				}
			}
		}

		// 获取默认的实体映射，后续增强
		java.util.List<IPSDEMap> psDEMaps = this.getPSDataEntity().getAllPSDEMaps();
		if (psDEMaps != null) {
			for (IPSDEMap iPSDEMap : psDEMaps) {
				if(!iPSDEMap.isEnableBackend()) {
					continue;
				}
				this.defaultPSDEMap = iPSDEMap;
				break;
			}
		}

		// 准备实体的默认用户角色集合
		java.util.List<IPSDEUserRole> psDEUserRoles = this.getPSDataEntity().getAllPSDEUserRoles();
		if (psDEUserRoles != null) {
			for (IPSDEUserRole iPSDEUserRole : psDEUserRoles) {
				if (iPSDEUserRole.isDefaultMode()) {
					if (this.defaultPSDEUserRoleList == null) {
						this.defaultPSDEUserRoleList = new ArrayList<IPSDEUserRole>();
					}
					this.defaultPSDEUserRoleList.add(iPSDEUserRole);
				}
			}
		}
		
		// 获取默认的实体统一状态
		java.util.List<IPSDEUniState> psDEUniStates = this.getPSDataEntity().getAllPSDEUniStates();
		if (psDEUniStates != null) {
			for (IPSDEUniState iPSDEUniState : psDEUniStates) {
				if (iPSDEUniState.isDefault()) {
					this.defaultPSDEUniState = iPSDEUniState;
					break;
				}
			}
		}

		// 获取默认的实体工作流
		java.util.List<IPSDEWF> psDEWFs = this.getPSDataEntity().getAllPSDEWFs();
		if (psDEWFs != null) {
			for (IPSDEWF iPSDEWF : psDEWFs) {
				this.defaultPSDEWF = iPSDEWF;
				if (this.defaultPSDEWF.isDefaultMode()) {
					break;
				}
			}
		}

		if (this.getDefaultPSDEWF() != null) {
			this.udStatePSDEField = this.getDefaultPSDEWF().getUDStatePSDEField();
			if (this.udStatePSDEField != null) {
				String strEntityWFState = this.getDefaultPSDEWF().getEntityWFState();
				if (StringUtils.hasLength(strEntityWFState)) {
					this.objEntityWFState = this.getSystemRuntime().convertValue(this.udStatePSDEField.getStdDataType(), strEntityWFState);
				}
			}
		}

		// 获取默认的异步处理队列
		java.util.List<IPSDEDTSQueue> psDEDTSQueues = this.getPSDataEntity().getAllPSDEDTSQueues();
		if (psDEDTSQueues != null) {
			for (IPSDEDTSQueue iPSDEDTSQueue : psDEDTSQueues) {
				if (iPSDEDTSQueue.isDefault()) {
					this.defaultPSDEDTSQueue = iPSDEDTSQueue;
					break;
				}
			}
		}

		java.util.List<IPSDEDataExport> psDEDataExports = this.getPSDataEntity().getAllPSDEDataExports();
		if (psDEDataExports != null) {
			for (IPSDEDataExport iPSDEDataExport : psDEDataExports) {
				if ("DEFAULT".equalsIgnoreCase(iPSDEDataExport.getCodeName())) {
					this.defaultPSDEDataExport = iPSDEDataExport;
					break;
				}
			}
			if (this.defaultPSDEDataExport == null) {
				// 未能找则默认取第一个
				for (IPSDEDataExport iPSDEDataExport : psDEDataExports) {
					this.defaultPSDEDataExport = iPSDEDataExport;
					break;
				}
			}
		}

		java.util.List<IPSDEDataImport> psDEDataImports = this.getPSDataEntity().getAllPSDEDataImports();
		if (psDEDataImports != null) {
			for (IPSDEDataImport iPSDEDataImport : psDEDataImports) {
				if (iPSDEDataImport.isDefaultMode()) {
					this.defaultPSDEDataImport = iPSDEDataImport;
					break;
				}
			}
			if (this.defaultPSDEDataImport == null) {
				// 未能找则默认取第一个
				for (IPSDEDataImport iPSDEDataImport : psDEDataImports) {
					this.defaultPSDEDataImport = iPSDEDataImport;
					break;
				}
			}
		}

		// 准备实体基础功能组件
		java.util.List<IPSDEUtil> psDEUtils = this.getPSDataEntity().getAllPSDEUtils();
		if (psDEUtils != null) {
			for (IPSDEUtil iPSDEUtil : psDEUtils) {
				registerPSDEUtil(iPSDEUtil);
			}
		}

		// 获取实体的动态存储功能对象
		if (this.isEnableDynaStorage()) {
			IDEUtilRuntime iDEUtilRuntime = this.getDEUtilRuntime(DEUtilTypes.DYNASTORAGE);
			if (iDEUtilRuntime != null) {
				if (iDEUtilRuntime instanceof IDEDynaStorageUtilRuntime) {
					this.iDEDynaStorageUtilRuntime = (IDEDynaStorageUtilRuntime) iDEUtilRuntime;
				} else {
					log.warn(String.format("实体功能运行时对象[%1$s]类型不正确", iDEUtilRuntime.getName()));
				}
			}
			if (this.iDEDynaStorageUtilRuntime == null) {
				this.bEnableDynaStorage = false;
			}
		}

		// 如果实体启用数据审计，获取审计功能对象
		if (this.isEnableDataAudit()) {
			IDEUtilRuntime iDEUtilRuntime = this.getDEUtilRuntime(DEUtilTypes.DATAAUDIT);
			if (iDEUtilRuntime != null) {
				if (iDEUtilRuntime instanceof IDEDataAuditUtilRuntime) {
					iDEDataAuditUtilRuntime = (IDEDataAuditUtilRuntime) iDEUtilRuntime;
				} else {
					log.warn(String.format("实体功能运行时对象[%1$s]类型不正确", iDEUtilRuntime.getName()));
				}
			} else {
				ISysUtilRuntime iSysUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(DEUtilTypes.DATAAUDIT, true);
				if (iSysUtilRuntime != null) {
					if (iSysUtilRuntime instanceof IDEDataAuditUtilRuntime) {
						iDEDataAuditUtilRuntime = (IDEDataAuditUtilRuntime) iSysUtilRuntime;
					} else {
						log.warn(String.format("系统功能运行时对象[%1$s]类型不正确", iSysUtilRuntime.getName()));
					}
				}
			}
			if (iDEDataAuditUtilRuntime == null) {
				log.warn(String.format("实体[%1$s][%2$s]启用数据审计但未定义审计功能对象，忽略启用数据审计", this.getName(), this.getId()));
				this.nDataAuditMode = DEDataAuditModes.NONE;
			}
		}

		// 获取默认及权限使用的数据查询
		psDEDataQueryMap.clear();
		java.util.List<IPSDEDataQuery> psDEDataQueries = this.getPSDataEntity().getAllPSDEDataQueries();
		if (psDEDataQueries != null) {

			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				this.psDEDataQueryMap.put(iPSDEDataQuery.getName().toLowerCase(), iPSDEDataQuery);
			}

			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				if (iPSDEDataQuery.isDefaultMode()) {
					this.defaultPSDEDataQuery = iPSDEDataQuery;
					break;
				}
			}

			if (this.defaultPSDEDataQuery == null) {
				for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
					if ("DEFAULT".equalsIgnoreCase(iPSDEDataQuery.getName())) {
						this.defaultPSDEDataQuery = iPSDEDataQuery;
						break;
					}
				}
			}

			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				if (iPSDEDataQuery.getViewLevel() == DEDataQueryViewLevels.ALL) {
					if ("VIEW".equalsIgnoreCase(iPSDEDataQuery.getName())) {
						this.viewPSDEDataQuery = iPSDEDataQuery;
						break;
					} else {
						this.viewPSDEDataQuery = iPSDEDataQuery;
					}
				}
			}

			if (this.viewPSDEDataQuery == null) {
				log.warn(String.format("实体[%1$s][%2$s]未指定视图级别查询，可能会导致GET行为数据查询不完整", this.getName(), this.getId()));
				this.viewPSDEDataQuery = defaultPSDEDataQuery;
			}

//			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
//				if (iPSDEDataQuery.isPrivQuery()) {
//					this.privPSDEDataQuery = iPSDEDataQuery;
//					break;
//				}
//			}
//
//			if (this.privPSDEDataQuery == null) {
//				this.privPSDEDataQuery = defaultPSDEDataQuery;
//			}

			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				if ("SIMPLE".equalsIgnoreCase(iPSDEDataQuery.getCodeName()) && DEFGroupTypes.BASEFIELDS.equals(iPSDEDataQuery.getDEFGroupType())) {
					this.simplePSDEDataQuery = iPSDEDataQuery;
					break;
				}
			}

			if (this.simplePSDEDataQuery == null) {
				for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
					if (DEFGroupTypes.BASEFIELDS.equals(iPSDEDataQuery.getDEFGroupType())) {
						this.simplePSDEDataQuery = iPSDEDataQuery;
						break;
					}
				}
			}

			// 未指定简单查询时使用默认查询
			if (this.simplePSDEDataQuery == null) {
				this.simplePSDEDataQuery = defaultPSDEDataQuery;
			}

			if (this.isEnableDataAudit()) {
				for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
					if ("AUDIT".equalsIgnoreCase(iPSDEDataQuery.getCodeName()) && DEFGroupTypes.AUDITFIELDS.equals(iPSDEDataQuery.getDEFGroupType())) {
						this.auditPSDEDataQuery = iPSDEDataQuery;
						break;
					}
				}
				if (this.auditPSDEDataQuery == null) {
					for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
						if (DEFGroupTypes.AUDITFIELDS.equals(iPSDEDataQuery.getDEFGroupType())) {
							this.auditPSDEDataQuery = iPSDEDataQuery;
							break;
						}
					}
				}
			}
			// 未指定审计查询时使用默认查询
			if (this.auditPSDEDataQuery == null) {
				this.auditPSDEDataQuery = defaultPSDEDataQuery;
			}

		}
		
	}
	
	@Override
	public List<IPSDEField> getPSDEFields() {
		try {
			return this.getPSDataEntity().getAllPSDEFields();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, ex.getMessage(), ex);
		}
	}

	@Override
	public IDEUtilRuntime getDEUtilRuntime(String strTag) {
		this.prepare();
		
		if (this.deUtilRuntimeMap == null) {
			return null;
		}
		return this.deUtilRuntimeMap.get(strTag);
	}

	protected IDEUtilRuntime registerPSDEUtil(IPSDEUtil iPSDEUtil) throws Exception {

		IDEUtilRuntime iDEUtilRuntime = this.getDEUtilRuntime(iPSDEUtil.getId());
		if (iDEUtilRuntime != null) {
			return iDEUtilRuntime;
		}

		iDEUtilRuntime = this.createDEUtilRuntime(iPSDEUtil);
		if (iDEUtilRuntime == null) {
			return null;
		}
		iDEUtilRuntime.init(this.getDataEntityRuntimeContext(), iPSDEUtil);
		if (this.deUtilRuntimeMap == null) {
			this.deUtilRuntimeMap = new HashMap<>();
		}
		this.deUtilRuntimeMap.put(iPSDEUtil.getId(), iDEUtilRuntime);
		if (DEUtilTypes.USER.equals(iPSDEUtil.getUtilType())) {
			// this.deUtilRuntimeMap.put(iPSDEUtil.getCodeName(),
			// iDEUtilRuntime);
		} else {
			this.deUtilRuntimeMap.put(iPSDEUtil.getUtilType(), iDEUtilRuntime);
		}
		return iDEUtilRuntime;
	}
	
	
	@Override
	public <T> T getDEUtilRuntime(Class<T> cls, boolean bTryMode) {
		
		this.prepare();
		
		if (this.deUtilRuntimeMap != null) {
			for (IDEUtilRuntime iDEUtilRuntime : this.deUtilRuntimeMap.values()) {
				if (cls.isAssignableFrom(iDEUtilRuntime.getClass())) {
					return (T) iDEUtilRuntime;
				}
			}
		}

		if (bTryMode) {
			return null;
		}

		throw new DataEntityRuntimeException(this, String.format("无法获取指定实体功能组件运行时对象[%1$s]", cls.getCanonicalName()));
	}

	@Override
	public synchronized void registerDEActionPluginRuntime(String strAction, IDEActionPluginRuntime iDEActionPluginRuntime) {
		
		Assert.hasLength(strAction, "传入行为标识无效");
		Assert.notNull(iDEActionPluginRuntime, "传入行为插件运行时对象无效");
		
		if (this.deActionPluginRuntimeMap == null) {
			this.deActionPluginRuntimeMap = new ConcurrentHashMap<>();
		}

		IDEActionPluginRuntime last = this.deActionPluginRuntimeMap.put(strAction.toUpperCase(), iDEActionPluginRuntime);
		if(last != null) {
			log.debug(String.format("注册实体[%1$s]行为[%2$s]插件运行时[%3$s]，旧值[%4$s]", this.getFullUniqueTag(), strAction, iDEActionPluginRuntime, last));
		}
		else {
			log.debug(String.format("注册实体[%1$s]行为[%2$s]插件运行时[%3$s]", this.getFullUniqueTag(), strAction, iDEActionPluginRuntime));
		}
		
	}

	@Override
	public synchronized boolean unregisterDEActionPluginRuntime(String strAction, IDEActionPluginRuntime iDEActionPluginRuntime) {
		
		Assert.hasLength(strAction, "传入行为标识无效");
		Assert.notNull(iDEActionPluginRuntime, "传入行为插件运行时对象无效");
		
		if (this.deActionPluginRuntimeMap == null) {
			return false;
		}
		boolean bRet = this.deActionPluginRuntimeMap.remove(strAction.toUpperCase(), iDEActionPluginRuntime);
		if(bRet) {
			log.debug(String.format("注销实体[%1$s]行为[%2$s]插件运行时[%3$s]", this.getFullUniqueTag(), strAction, iDEActionPluginRuntime));
		}
		return bRet;
	}
	
	@Override
	public synchronized boolean containsDEActionPluginRuntime(String strAction) {
		Assert.hasLength(strAction, "传入行为标识无效");
		if (this.deActionPluginRuntimeMap == null) {
			return false;
		}
		return this.deActionPluginRuntimeMap.containsKey(strAction.toUpperCase());
	}

	protected IDEActionPluginRuntime getDEActionPluginRuntime(IPSDEAction iPSDEAction) {
		if (iPSDEAction == null) {
			return null;
		}
		return getDEActionPluginRuntime(iPSDEAction.getName());
	}

	protected IDEActionPluginRuntime getDEActionPluginRuntime(String strAction) {
		if (this.deActionPluginRuntimeMap != null) {
			return this.deActionPluginRuntimeMap.get(strAction.toUpperCase());
		}
		return null;
	}

	@Override
	public synchronized void registerDEDataSetPluginRuntime(String strDataSet, IDEDataSetPluginRuntime iDEDataSetPluginRuntime) {

		Assert.hasLength(strDataSet, "传入数据集标识无效");
		Assert.notNull(iDEDataSetPluginRuntime, "传入数据集插件运行时对象无效");
		
		if (this.deDataSetPluginRuntimeMap == null) {
			this.deDataSetPluginRuntimeMap = new ConcurrentHashMap<>();
		}

		IDEDataSetPluginRuntime last = this.deDataSetPluginRuntimeMap.put(strDataSet.toUpperCase(), iDEDataSetPluginRuntime);
		if(last != null) {
			log.debug(String.format("注册实体[%1$s]数据集[%2$s]插件运行时[%3$s]，旧值[%4$s]", this.getFullUniqueTag(), strDataSet, iDEDataSetPluginRuntime, last));
		}
		else {
			log.debug(String.format("注册实体[%1$s]数据集[%2$s]插件运行时[%3$s]", this.getFullUniqueTag(), strDataSet, iDEDataSetPluginRuntime));
		}
	}

	@Override
	public synchronized boolean unregisterDEDataSetPluginRuntime(String strDataSet, IDEDataSetPluginRuntime iDEDataSetPluginRuntime) {
		
		Assert.hasLength(strDataSet, "传入数据集标识无效");
		Assert.notNull(iDEDataSetPluginRuntime, "传入数据集插件运行时对象无效");
		
		if (this.deDataSetPluginRuntimeMap == null) {
			return false;
		}
		boolean bRet = this.deDataSetPluginRuntimeMap.remove(strDataSet.toUpperCase(), iDEDataSetPluginRuntime);
		if(bRet) {
			log.debug(String.format("注销实体[%1$s]数据集[%2$s]插件运行时[%3$s]", this.getFullUniqueTag(), strDataSet, iDEDataSetPluginRuntime));
		}
		return bRet;
	}
	
	@Override
	public synchronized boolean containsDEDataSetPluginRuntime(String strDataSet) {
		
		Assert.hasLength(strDataSet, "传入数据集标识无效");
		
		if (this.deDataSetPluginRuntimeMap == null) {
			return false;
		}
		return this.deDataSetPluginRuntimeMap.containsKey(strDataSet.toUpperCase());
	}

	protected IDEDataSetPluginRuntime getDEDataSetPluginRuntime(IPSDEDataSet iPSDEDataSet) {
		if (iPSDEDataSet == null) {
			return null;
		}
		return getDEDataSetPluginRuntime(iPSDEDataSet.getName());
	}

	protected IDEDataSetPluginRuntime getDEDataSetPluginRuntime(String strDataSet) {
		if (this.deDataSetPluginRuntimeMap != null) {
			return this.deDataSetPluginRuntimeMap.get(strDataSet.toUpperCase());
		}
		return null;
	}

	protected IDEDataSetRuntime getDEDataSetRuntime(IPSDEDataSet iPSDEDataSet) {
		if (this.deDataSetRuntimeMap == null || iPSDEDataSet == null) {
			return null;
		}
		return this.deDataSetRuntimeMap.get(iPSDEDataSet.getId());
	}

	protected IDEActionRuntime getDEActionRuntime(IPSDEAction iPSDEAction) {
		if (this.deActionRuntimeMap == null || iPSDEAction == null) {
			return null;
		}
		return this.deActionRuntimeMap.get(iPSDEAction.getId());
	}

	protected String getFieldDataSetSortExp(IPSDEField iPSDEField) throws Exception {
		if (!isConvertDataSetSortFieldExp()) {
			return null;
		}
		return getFieldQueryExp(iPSDEField);
	}

	protected boolean isConvertDataSetSortFieldExp() {
		return true;
	}

	protected String calcFieldQueryExp(IPSDEField iPSDEField) throws Exception {
		return this.calcFieldQueryExp(iPSDEField, this.getDBType());
	}

	protected String calcFieldQueryExp(IPSDEField iPSDEField, String strDBType) throws Exception {
		if (StringUtils.hasLength(strDBType) && iPSDEField.getAllPSDEFDTColumns() != null) {
			for (IPSDEFDTColumn iPSDEFDTColumn : iPSDEField.getAllPSDEFDTColumns()) {
				if (this.getDBType().equals(iPSDEFDTColumn.getDBType())) {
					return iPSDEFDTColumn.getQueryCodeExp();
				}
			}
		}
		return null;
	}

	@Override
	final public int getDynaInstMode() {
		return this.nDynaInstMode;
	}

	@Override
	final public String getDynaInstTag() {
		return this.strDynaInstTag;
	}

	@Override
	public int getStorageMode() {
		prepare();
		return this.nStorageMode;
	}

	@Override
	public int getSaaSMode() {
		prepare();
		return this.nSaaSMode;
	}

	@Override
	public int getDEType() {
		prepare();
		return this.nDEType;
	}

	@Override
	public String getLogicName() {
		prepare();
		return this.strLogicName;
	}

	@Override
	public String getDERParentType() {
		//prepare();
		return this.getName();
	}
	
	
	/**
	 * 获取默认的实体映射
	 *
	 * @return
	 */
	public IPSDEMap getDefaultPSDEMap() {
		prepare();
		return this.defaultPSDEMap;
	}

	/**
	 * 获取默认的实体工作流
	 *
	 * @return
	 */
	public IPSDEWF getDefaultPSDEWF() {
		prepare();
		return this.defaultPSDEWF;
	}
	

	public IPSDEWF calcCurrentPSDEWF(Object arg) throws Exception {
		if (arg instanceof IEntity) {
			IEntity iEntity = (IEntity) arg;
			String srfwftag = (String) iEntity.get("srfwftag");
			if (StringUtils.hasLength(srfwftag)) {
				List<IPSDEWF> psDEWFs = this.getPSDataEntity().getAllPSDEWFs();
				List<IPSDEWF> currentPSDEWFs = psDEWFs.stream().filter(obj -> srfwftag.equalsIgnoreCase(obj.getPSWorkflowMust().getCodeName())).collect(java.util.stream.Collectors.toList());
				if (!currentPSDEWFs.isEmpty()) {
					return currentPSDEWFs.get(0);
				}
			}
		}
		return null;
	}

	/**
	 * 获取默认的实体异步处理队列
	 *
	 * @return
	 */
	public IPSDEDTSQueue getDefaultPSDEDTSQueue() {
		prepare();
		return this.defaultPSDEDTSQueue;
	}

	@Override
	public IPSDEDataSet getDefaultPSDEDataSet() {
		prepare();
		return this.defaultPSDEDataSet;
	}

	@Override
	public IPSDEDataQuery getDefaultPSDEDataQuery() {
		prepare();
		return this.defaultPSDEDataQuery;
	}

	@Override
	public IPSDEDataQuery getViewPSDEDataQuery() {
		prepare();
		return this.viewPSDEDataQuery;
	}
	
	@Override
	public IPSDEDataSet getViewPSDEDataSet() {
		prepare();
		return this.viewPSDEDataSet;
	}

//	/**
//	 * 获取权限使用数据查询
//	 *
//	 * @return
//	 */
//
//	public IPSDEDataQuery getPrivPSDEDataQuery() {
//		prepare();
//		return this.privPSDEDataQuery;
//	}

	/**
	 * 获取简单数据查询
	 *
	 * @return
	 */
	@Override
	public IPSDEDataQuery getSimplePSDEDataQuery() {
		prepare();
		return this.simplePSDEDataQuery;
	}

	/**
	 * 获取审计使用数据查询
	 *
	 * @return
	 */
	@Override
	public IPSDEDataQuery getAuditPSDEDataQuery() {
		prepare();
		return this.auditPSDEDataQuery;
	}

	@Override
	public IDEDataAuditUtilRuntime getDEDataAuditUtilRuntime() {
		prepare();
		return this.iDEDataAuditUtilRuntime;
	}

	@Override
	public IDEDynaStorageUtilRuntime getDEDynaStorageUtilRuntime() {
		prepare();
		return this.iDEDynaStorageUtilRuntime;
	}
	
	protected void setDEDynaStorageUtilRuntime(IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime) {
		this.iDEDynaStorageUtilRuntime = iDEDynaStorageUtilRuntime;
		this.bEnableDynaStorage = (this.iDEDynaStorageUtilRuntime!=null);
	}

	/**
	 * 获取默认的用户角色集合
	 *
	 * @return
	 */
	public List<IPSDEUserRole> getDefaultPSDEUserRoles() {
		prepare();
		return this.defaultPSDEUserRoleList;
	}
	
	
	/**
	 * 获取默认的实体统一状态
	 *
	 * @return
	 */
	public IPSDEUniState getDefaultPSDEUniState() {
		prepare();
		return this.defaultPSDEUniState;
	}
	

	@Override
	public String getUnionKeyMode() {
		prepare();
		return this.strUnionKeyMode;
	}

	@Override
	public String getUnionKeyParam() {
		prepare();
		return this.strUnionKeyParam;
	}

	/**
	 * 获取联合键值相关属性集合
	 *
	 * @return
	 */
	@Override
	public List<IPSDEField> getUnionKeyValuePSDEFields() {
		prepare();
		return this.unionKeyValuePSDEFieldList;
	}

	/**
	 * 获取数据主键属性
	 *
	 * @return
	 */
	@Override
	public IPSDEField getKeyPSDEField() {
		prepare();
		return this.keyPSDEField;
	}

	/**
	 * 获取数据主信息属性
	 *
	 * @return
	 */
	@Override
	public IPSDEField getMajorPSDEField() {
		prepare();
		return this.majorPSDEField;
	}

	/**
	 * 获取键名属性
	 *
	 * @return
	 */
	@Override
	public IPSDEField getKeyNamePSDEField() {
		prepare();
		return this.keyNamePSDEField;
	}

	@Override
	public IPSDEField getDataTypePSDEField() {
		prepare();
		return this.dataTypePSDEField;
	}

	@Override
	public IPSDEField getOrgIdPSDEField() {
		prepare();
		return this.orgIdPSDEField;
	}

	@Override
	public IPSDEField getDeptIdPSDEField() {
		prepare();
		return this.deptIdPSDEField;
	}

	public IPSDEField getUDStatePSDEField() {
		prepare();
		return this.udStatePSDEField;
	}

	@Override
	public IPSDEField getParentIdPathPSDEField() {
		prepare();
		return this.parentIdPathPSDEField;
	}

	@Override
	public IPSDEField getParentNamePathPSDEField() {
		prepare();
		return this.parentNamePathPSDEField;
	}

	@Override
	public IPSDEField getOrderValuePSDEField() {
		prepare();
		return this.orderValuePSDEField;
	}
	
	@Override
	public IPSDEDataSet getOrderScopePSDEDataSet() {
		if(this.orderScopePSDEDataSet == null && this.getOrderValuePSDEField()!=null) {
			this.orderScopePSDEDataSet = this.getPSDEDataSetByTag(DATASETTAG_ORDER_SCOPE, true);
			if(this.orderScopePSDEDataSet == null) {
				this.orderScopePSDEDataSet = this.getDefaultPSDEDataSet();
			}
		}
		return this.orderScopePSDEDataSet;
	}
	
	@Override
	public Integer getOrderInitialValue() {
		if(this.orderInitialValue == null && this.getOrderValuePSDEField()!=null) {
			String strPredefinedTypeParam = this.getOrderValuePSDEField().getPredefinedTypeParam();
			if(StringUtils.hasLength(strPredefinedTypeParam)) {
				String[] items = strPredefinedTypeParam.split("[,]");
				if(items.length == 1) {
					this.orderInitialValue = 1;
					this.orderStepValue = DataTypeUtils.asInteger(items[0], 1);
				}
				else {
					this.orderInitialValue = DataTypeUtils.asInteger(items[0], 1);
					this.orderStepValue = DataTypeUtils.asInteger(items[1], 1);
				}
			}
			else {
				this.orderInitialValue = 1;
				this.orderStepValue = 1;
			}
		}
		return this.orderInitialValue;
	}
	
	@Override
	public Integer getOrderStepValue() {
		if(this.orderStepValue == null && this.getOrderValuePSDEField()!=null) {
			String strPredefinedTypeParam = this.getOrderValuePSDEField().getPredefinedTypeParam();
			if(StringUtils.hasLength(strPredefinedTypeParam)) {
				String[] items = strPredefinedTypeParam.split("[,]");
				if(items.length == 1) {
					this.orderInitialValue = 1;
					this.orderStepValue = DataTypeUtils.asInteger(items[0], 1);
				}
				else {
					this.orderInitialValue = DataTypeUtils.asInteger(items[0], 1);
					this.orderStepValue = DataTypeUtils.asInteger(items[1], 1);
				}
			}
			else {
				this.orderInitialValue = 1;
				this.orderStepValue = 1;
			}
		}
		return this.orderStepValue;
	}
	

	@Override
	public IPSDEField getDynaStoragePSDEField() {
		prepare();
		return this.dynaStoragePSDEField;
	}
	
	@Override
	public IPSDEField getCloseFlagPSDEField() {
		prepare();
		return this.closeFlagPSDEField;
	}
	
	@Override
	public IPSDEField getLockFlagPSDEField() {
		prepare();
		return this.lockFlagPSDEField;
	}
	

	@Override
	public IPSDER1N getRecursivePSDER1N() {
		prepare();
		return this.recursivePSDER1N;
	}

	@Override
	public IPSDEDataExport getDefaultPSDEDataExport() {
		prepare();
		return this.defaultPSDEDataExport;
	}

	@Override
	public IPSDEDataImport getDefaultPSDEDataImport() {
		prepare();
		return this.defaultPSDEDataImport;
	}

	/**
	 * 获取OrgId属性的查询表达式
	 *
	 * @return
	 */
	protected String getOrgIdFieldQueryExp() {
		prepare();
		return this.strOrgIdQueryExp;
	}

	/**
	 * 获取DeptId属性的查询表达式
	 *
	 * @return
	 */
	protected String getDeptIdFieldQueryExp() {
		prepare();
		return this.strDeptIdQueryExp;
	}

	protected String getKeyFieldQueryExp() {
		prepare();
		return this.strKeyQueryExp;
	}

	protected String getMajorFieldQueryExp() {
		prepare();
		return this.strMajorQueryExp;
	}

	protected String getDataTypeFieldQueryExp() {
		prepare();
		return this.strDataTypeQueryExp;
	}

	@Override
	public IPSDEField getUniTagPSDEField() {
		prepare();
		return this.uniTagPSDEField;
	}

	/**
	 * 获取传入数据的主状态模型对象
	 *
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	@Override
	public IPSDEMainState getPSDEMainState(Object obj) throws Exception {

		prepare();

		if (obj == null) {
			return null;
		}
		
		if(!ObjectUtils.isEmpty(this.psDEMainStateMap)) {
			IEntityBase objEntity = getLastDEMainStateEntity(obj);
			return this.onGetPSDEMainState(objEntity);	
		}

		return null;
	}
	
	/**
	 * 获取实体主状态数据对象
	 * @param objKey
	 * @return
	 */
	protected IEntityBase getLastDEMainStateEntity(Object objKey) {
		return this.getSimpleEntity(objKey);
	}
	
	protected IPSDEMainState onGetPSDEMainState(IEntityBase objEntity) throws Exception {
		
//		final IPSDEField closeFlagPSDEField = this.getCloseFlagPSDEField();
//		if(closeFlagPSDEField != null) {
//			Object value = this.getFieldValue(objEntity, closeFlagPSDEField);
//			if(DataTypeUtils.asBoolean(value, false)) {
//				IPSDEMainState iPSDEMainState = this.psDEMainStateMap.get(DEMAINSTATE_CLOSE);
//				if(iPSDEMainState != null) {
//					return iPSDEMainState;
//				}
//			}
//		}
//		
//		final IPSDEField lockFlagPSDEField = this.getLockFlagPSDEField();
//		if(lockFlagPSDEField != null) {
//			Object value = this.getFieldValue(objEntity, lockFlagPSDEField);
//			if(DataTypeUtils.asBoolean(value, false)) {
//				IPSDEMainState iPSDEMainState = this.psDEMainStateMap.get(DEMAINSTATE_LOCK);
//				if(iPSDEMainState != null) {
//					return iPSDEMainState;
//				}
//			}
//		}
		
		
		final List<IPSDEField> mainStatePSDEFields = this.getPSDataEntity().getMainStatePSDEFields();
		if(!ObjectUtils.isEmpty(mainStatePSDEFields)) {
			for (IPSDEField iPSDEField : mainStatePSDEFields) {
				if (!this.containsFieldValue(objEntity, iPSDEField)) {
					log.warn(String.format("数据对象不包含属性[%1$s]，可能会发生错误", iPSDEField.getName()));
					break;
				}
			}

			IPSDEMainState iPSDEMainState = null;
			String strTag = "";
			for (int i = 0; i <= 1; i++) {
				strTag = String.format("%1$s", ((i == 0) ? this.getFieldValue(objEntity, mainStatePSDEFields.get(0)) : "*"));
				if (mainStatePSDEFields.size() >= 2) {
					for (int j = 0; j <= 1; j++) {
						String strTag2 = String.format("%1$s__%2$s", strTag, ((j == 0) ? this.getFieldValue(objEntity, mainStatePSDEFields.get(1)) : "*"));
						if (mainStatePSDEFields.size() >= 3) {
							for (int k = 0; k <= 1; k++) {
								String strTag3 = String.format("%1$s__%2$s", strTag2, ((k == 0) ? this.getFieldValue(objEntity, mainStatePSDEFields.get(2)) : "*"));
								// 判断是否存在
								iPSDEMainState = this.psDEMainStateMap.get(strTag3);
								if (iPSDEMainState != null) {
									return iPSDEMainState;
								}
							}
						} else {
							iPSDEMainState = this.psDEMainStateMap.get(strTag2);
							if (iPSDEMainState != null) {
								return iPSDEMainState;
							}
						}
					}
				} else {
					iPSDEMainState = this.psDEMainStateMap.get(strTag);
					if (iPSDEMainState != null) {
						return iPSDEMainState;
					}
				}
			}
		}
		
		return null;
	}

//	@Override
//	public boolean isEnableParentMainState() {
//		this.prepare();
//		return this.bEnableParentMainState;
//	}
	
	@Override
	public boolean testDataAccessAction(Object objKeyOrEntity, String strAccessAction) throws Exception {
		if (!StringUtils.hasLength(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.DENY.equalsIgnoreCase(strAccessAction)) {
			return false;
		}

		if (DataAccessActions.NONE.equalsIgnoreCase(strAccessAction)) {
			return true;
		}
		
		if (DataAccessActions.READ.equalsIgnoreCase(strAccessAction)) {
			return true;
		}

		prepare();

		return this.onTestDataAccessAction(objKeyOrEntity, strAccessAction);

	}

	protected boolean onTestDataAccessAction(Object objKeyOrEntity, String strAccessAction) throws Exception {
		// 映射到统一资源等处理忽略
		IPSDEMainState iPSDEMainState = this.getPSDEMainState(objKeyOrEntity);
		if (iPSDEMainState != null) {
			List<IPSDEMainStateOPPriv> list = iPSDEMainState.getPSDEMainStateOPPrivs();
			if (list != null) {
				for (IPSDEMainStateOPPriv iPSDEMainStateOPPriv : list) {
					if (iPSDEMainStateOPPriv.getPSDEOPPriv() != null) {
						if (strAccessAction.equalsIgnoreCase(iPSDEMainStateOPPriv.getPSDEOPPriv().getName())) {
							return iPSDEMainState.isOPPrivAllowMode();
						}
					}
				}
			}
			return !iPSDEMainState.isOPPrivAllowMode();
		}
		return true;
	}

	/**
	 * 切面环绕实体行为，外部触发
	 *
	 * @param strActionName
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	public Object aroundAction(String strActionName, ProceedingJoinPoint joinPoint) throws Throwable {

		if (DEActions.SYSGET.equalsIgnoreCase(strActionName) || DEActions.SYSUPDATE.equalsIgnoreCase(strActionName)) {
			return joinPoint.proceed();
		}

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

			actionSession.beginLog(this.getName(), strActionName);

			// 后续增强，非主实体使用主实体带入的动态实例
			// if(lastChildDynaInstRuntime != null && this.getDynaInstMode() ==
			// DynaInstModes.ENABLEINST) {
			// //（1）判断当前实体是否为附属或关系实体 （2）判断动态实例标记
			// }
			//

			// Object objRet = this.onAroundAction(strActionName, joinPoint);
			Object objRet = this.onExecuteAction(strActionName, this.getPSDEAction(strActionName), joinPoint.getArgs(), joinPoint);

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
	

	protected void onWFAction(String strActionName, IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		if (DEActions.WFUPDATE.equalsIgnoreCase(strActionName)) {
			this.onWFUpdate(arg0, iPSDEAction, iPSDEWF, actionData);
		} else if (DEActions.WFINIT.equalsIgnoreCase(strActionName)) {
			this.onWFInit(arg0, iPSDEAction, iPSDEWF, actionData);
		} else if (DEActions.WFFINISH.equalsIgnoreCase(strActionName)) {
			this.onWFFinish(arg0, iPSDEAction, iPSDEWF, actionData);
		} else if (DEActions.WFERROR.equalsIgnoreCase(strActionName)) {
			this.onWFError(arg0, iPSDEAction, iPSDEWF, actionData);
		} else if (DEActions.WFROLLBACK.equalsIgnoreCase(strActionName)) {
			this.onWFRollback(arg0, iPSDEAction, iPSDEWF, actionData);
		}
	}

	/**
	 * 工作流初始化触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void onWFInit(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFState())) {
			Object lastValue = this.getFieldValue(arg0, iPSDEWF.getUDStatePSDEField());
			if (lastValue == null) {
				this.setFieldValue(arg0, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFState()));
			}
		}
	}

	/**
	 * 工作流更新触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void onWFUpdate(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {

	}

	/**
	 * 工作流回滚触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void onWFRollback(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {

	}

	/**
	 * 工作流完成触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void onWFFinish(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFFinishState())) {
			this.setFieldValue(arg0, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFFinishState()));
		}
	}

	/**
	 * 工作流错误触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void onWFError(IEntityBase arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, Object actionData) throws Throwable {
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFErrorState())) {
			this.setFieldValue(arg0, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFErrorState()));
		}
	}

	/**
	 * 工作流启动实现
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDEWF
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected abstract void onWFStart(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;

	/**
	 * 工作流注册触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDEWF
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void onWFRegister(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	/**
	 * 工作流注销触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDEWF
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void onWFUnregister(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	/**
	 * 工作流填充标识触发
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDEWF
	 * @param iDynaInstRuntime
	 * @param objRet
	 * @throws Throwable
	 */
	protected void onFillWFTag(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object objRet) throws Throwable {

	}

	/**
	 * 工作流取消执行
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDEWF
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected abstract void onWFCancel(Object arg0, IPSDEAction iPSDEAction, IPSDEWF iPSDEWF, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;


	
	
	/**
	 * 执行实体逻辑
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDELogic
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected Object executeDELogic(Object arg0, IPSDEAction iPSDEAction, IPSDELogic iPSDELogic, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (iPSDELogic.isCustomCode()) {
			return executeDEScriptLogic(arg0, null, iPSDELogic, iDynaInstRuntime, actionData);
		}

		return onExecuteDELogic(arg0, iPSDEAction, iPSDELogic, iDynaInstRuntime, actionData);
	}

	/**
	 * 执行实体逻辑
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDELogic
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected abstract Object onExecuteDELogic(Object arg0, IPSDEAction iPSDEAction, IPSDELogic iPSDELogic, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;

	/**
	 * 是否启用独立的BPMN执行模式
	 *
	 * @return
	 */
	protected boolean isEnableBPMNExecuteMode() {
		return true;
	}
	
	protected Object executeActionLogics(Object[] args, Object ret, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		IEntityBase iEntityBase = null;
		Object arg0 = null;
		if (args != null && args.length > 0) {
			arg0 = args[0];
			if (arg0 instanceof IEntityBase) {
				iEntityBase = (IEntityBase) arg0;
			} 
		}
		
		switch(strAttachMode) {
		case DEActionLogicAttachModes.PREPARE:
			if (iEntityBase != null) {
				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.PREPARE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			} else {
				// 主键模式暂时不支持
			}
			return ret;
		case DEActionLogicAttachModes.CHECK:
			if (iEntityBase != null) {
				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.CHECK, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			} else {
				this.executeActionLogics(arg0, iPSDEAction, DEActionLogicAttachModes.CHECK, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			}
			return ret;
		case DEActionLogicAttachModes.BEFORE:
			if (iEntityBase != null) {
				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.BEFORE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			} else {
				this.executeActionLogics(arg0, iPSDEAction, DEActionLogicAttachModes.BEFORE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			}
			return ret;
		case DEActionLogicAttachModes.AFTER:
			if (ret != null && ret instanceof IEntityBase) {
				this.executeActionLogics((IEntityBase) ret, iPSDEAction, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			} else if (iEntityBase != null) {
				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			} else {
				this.executeActionLogics(arg0, iPSDEAction, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			}
			return ret;
		default:
			throw new Exception(String.format("无法识别的逻辑附加模式[%1$s]", strAttachMode));
		}
	}

	protected void executeActionLogics(Object arg0, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (ObjectUtils.isEmpty(arg0)) {
			return;
		}

		if (arg0 instanceof IEntityBase) {
			this.executeActionLogics((IEntityBase) arg0, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		} else {

			if (arg0 instanceof List) {
				// 未支持
				log.warn(String.format("行为附加逻辑不支持列表参数，忽略处理"));
			} else {
				IEntityBase tempEntity = null;
				try {
					tempEntity = this.createEntity();
					this.setFieldValue(tempEntity, this.getKeyPSDEField(), arg0);
				} catch (Throwable ex) {
					log.error(ex);
					return;
				}
				this.executeActionLogics(tempEntity, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
			}
		}
	}

	protected List<IPSDEActionLogic> getPSDEActionLogics(IPSDEAction iPSDEAction, String strAttachMode) throws Exception {
		if (DEActionLogicAttachModes.PREPARE.equals(strAttachMode)) {
			return iPSDEAction.getPreparePSDEActionLogics();
		} else if (DEActionLogicAttachModes.CHECK.equals(strAttachMode)) {
			return iPSDEAction.getCheckPSDEActionLogics();
		} else if (DEActionLogicAttachModes.BEFORE.equals(strAttachMode)) {
			return iPSDEAction.getBeforePSDEActionLogics();
		} else if (DEActionLogicAttachModes.AFTER.equals(strAttachMode)) {
			return iPSDEAction.getAfterPSDEActionLogics();
		}
		throw new Exception(String.format("无法识别的行为逻辑附加模式[%1$s]", strAttachMode));
	}
	
	/**
	 * 执行实体行为附加逻辑
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param strAttachMode
	 *            net.ibizsys.runtime.dataentity.DEActionLogicAttachModes
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void executeActionLogics(IEntityBase arg0, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		// 判断模式
		List<IPSDEActionLogic> psDEActionLogics = this.getPSDEActionLogics(iPSDEAction, strAttachMode);

		if (!ObjectUtils.isEmpty(psDEActionLogics)) {
			boolean bExecuteBPMNMode = false;
			for (IPSDEActionLogic iPSDEActionLogic : psDEActionLogics) {
				if (!iPSDEActionLogic.isValid() || !iPSDEActionLogic.isEnableBackend()) {
					continue;
				}

				if (onExecuteActionLogic(arg0, iPSDEActionLogic, iPSDEAction, strAttachMode, iDynaInstRuntime, actionData)) {
					continue;
				}

				if (iPSDEActionLogic.getActionLogicType() == DEActionLogicTypes.EXTERNAL) {
					if (isEnableBPMNExecuteMode()) {
						bExecuteBPMNMode = true;
					}

					continue;
				}

				if (iPSDEActionLogic.getActionLogicType() == DEActionLogicTypes.INTERNAL) {
					if (iPSDEActionLogic.getPSDELogic() != null && iPSDEActionLogic.getPSDELogic().isCustomCode()) {
						if (StringUtils.hasLength(iPSDEActionLogic.getPSDELogic().getScriptCode())) {
							IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getPSDELogic().getScriptCode(), iDynaInstRuntime != null);
							if (iDEScriptActionRuntime == null) {
								iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getPSDELogic().getScriptCode());
							}
							iDEScriptActionRuntime.execute(new Object[] { arg0 });
						}
						continue;
					} else {
						if (isEnableBPMNExecuteMode()) {
							bExecuteBPMNMode = true;
						} else {
							// 执行执行逻辑
						}

						continue;
					}
				}

				if (iPSDEActionLogic.getActionLogicType() == DEActionLogicTypes.SCRIPT) {
					if (StringUtils.hasLength(iPSDEActionLogic.getScriptCode())) {
						IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getScriptCode(), iDynaInstRuntime != null);
						if (iDEScriptActionRuntime == null) {
							iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEACTIONLOGIC, iPSDEActionLogic.getScriptCode());
						}
						iDEScriptActionRuntime.execute(new Object[] { arg0 });
					}
					continue;
				}

				if (iPSDEActionLogic.getActionLogicType() == DEActionLogicTypes.NOTIFY) {
					IPSDENotify iPSDENotify = iPSDEActionLogic.getPSDENotify();
					if (iPSDENotify != null) {
						IDENotifyRuntime iDENotifyRuntime = (iDynaInstDataEntityRuntime != null) ? iDynaInstDataEntityRuntime.getDENotifyRuntime(iPSDENotify) : this.getDENotifyRuntime(iPSDENotify);
						iDENotifyRuntime.send(arg0);
					}
					continue;
				}

				log.warn(String.format("行为逻辑类型[%1$s]未支持", iPSDEActionLogic.getActionLogicType()));

			}

			if (bExecuteBPMNMode) {
				onExecuteActionLogics(arg0, iPSDEAction, strAttachMode, iDynaInstRuntime, actionData);
			}
		}

		this.executeActionNotifies(arg0, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
	}

	/**
	 * 执行实体行为附加逻辑
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param strAttachMode
	 *            net.ibizsys.runtime.dataentity.DEActionLogicAttachModes
	 * @param iDynaInstRuntime
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected abstract void onExecuteActionLogics(Object arg0, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable;

	protected boolean onExecuteActionLogic(IEntityBase arg0, IPSDEActionLogic iPSDEActionLogic, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		return false;
	}

	protected Object executeDEScriptLogic(Object arg0, IPSDEScriptAction iPSDEScriptAction, IPSDELogic iPSDELogic, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if (iPSDELogic != null) {
			if (iPSDELogic.isCustomCode()) {
				if (StringUtils.hasLength(iPSDELogic.getScriptCode())) {
					IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DELOGIC, iPSDELogic.getScriptCode(), iDynaInstRuntime != null);
					if (iDEScriptActionRuntime == null) {
						iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DELOGIC, iPSDELogic.getScriptCode());
					}
					return iDEScriptActionRuntime.execute(new Object[] { arg0 });
				}
			}
			log.warn(String.format("无法执行实体逻辑[%1$s]，未指定脚本代码", iPSDELogic.getName()));
		} else {
			if (StringUtils.hasLength(iPSDEScriptAction.getScriptCode())) {
				IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DELOGIC, iPSDEScriptAction.getScriptCode(), iDynaInstRuntime != null);
				if (iDEScriptActionRuntime == null) {
					iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DELOGIC, iPSDEScriptAction.getScriptCode());
				}
				return iDEScriptActionRuntime.execute(new Object[] { arg0 });
			}
			log.warn(String.format("无法执行实体行为[%1$s]，未指定脚本代码", iPSDEScriptAction.getName()));
		}
		return null;
	}

	protected void executeActionNotifies(IEntityBase arg0, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		List<IPSDERBase> notifyPSDERBaseList = this.getNotifyPSDERs();
		IPSDERInherit iPSDERInherit = this.getPSDERInherit();
		if (ObjectUtils.isEmpty(notifyPSDERBaseList)
				&& iPSDERInherit == null) {
			return;
		}

		IEntityBase last = this.getLastEntity();
		Map<String, String> notifyEventMap = (iPSDERInherit != null)? new LinkedHashMap<String, String>() : null;
		if(!ObjectUtils.isEmpty(notifyPSDERBaseList)) {
			for (IPSDERBase iPSDERBase : notifyPSDERBaseList) {
				IPSDEField pickupPSDEField = null;
				if (iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
					pickupPSDEField = iPSDER1N.getPSPickupDEFieldMust();
				} else if (iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
					pickupPSDEField = iPSDERCustom.getPickupPSDEField();
				}
				if (pickupPSDEField == null) {
					continue;
				}

				Object majorKey = null;

				if (this.containsFieldValue(arg0, pickupPSDEField)) {
					majorKey = this.getFieldValue(arg0, pickupPSDEField);
				} else if (last != null) {
					majorKey = this.getFieldValue(last, pickupPSDEField);
				}

				if (ObjectUtils.isEmpty(majorKey)) {
					Object lastMajorKey = last != null ? this.getFieldValue(last, pickupPSDEField) : null;
					if (ObjectUtils.isEmpty(lastMajorKey)) {
						continue;
					}
				}

				IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
				String strEventName = String.format("%1$s:%2$s", PSModelUtils.calcUniqueTag2(iPSDEAction), strAttachMode);
				if(notifyEventMap != null) {
					notifyEventMap.put(strEventName, "");
				}

				majorDataEntityRuntime.notify(majorKey, strEventName, arg0, iPSDERBase, last, iPSDEAction);
			}
		}
		
		
		
		while(iPSDERInherit != null) {
			//忽略逻辑继承
			if(iPSDERInherit.isLogicInherit()) {
				break;
			}
			
			IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERInherit.getMajorPSDataEntityMust().getId());
			IPSDEAction iPSDEAction2 = iDataEntityRuntime.getPSDEAction(iPSDEAction.getName());
			notifyPSDERBaseList = iDataEntityRuntime.getNotifyPSDERs();
			if(iPSDEAction2 != null && !ObjectUtils.isEmpty(notifyPSDERBaseList)) {
				for (IPSDERBase iPSDERBase : notifyPSDERBaseList) {
					IPSDEField pickupPSDEField = null;
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						pickupPSDEField = iPSDER1N.getPSPickupDEFieldMust();
					} else if (iPSDERBase instanceof IPSDERCustom) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
						pickupPSDEField = iPSDERCustom.getPickupPSDEField();
					}
					if (pickupPSDEField == null) {
						continue;
					}

					Object majorKey = null;

					if (this.containsFieldValue(arg0, pickupPSDEField)) {
						majorKey = this.getFieldValue(arg0, pickupPSDEField);
					} else if (last != null) {
						majorKey = this.getFieldValue(last, pickupPSDEField);
					}

					if (ObjectUtils.isEmpty(majorKey)) {
						Object lastMajorKey = last != null ? this.getFieldValue(last, pickupPSDEField) : null;
						if (ObjectUtils.isEmpty(lastMajorKey)) {
							continue;
						}
					}

					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
					String strEventName = String.format("%1$s:%2$s", PSModelUtils.calcUniqueTag2(iPSDEAction2), strAttachMode);
					if(notifyEventMap != null) {
						if(notifyEventMap.containsKey(strEventName)) {
							continue;
						}
						notifyEventMap.put(strEventName, "");
					}

					majorDataEntityRuntime.notify(majorKey, strEventName, arg0, iPSDERBase, last, iPSDEAction2);
				}
			}
			
			iPSDERInherit = iDataEntityRuntime.getPSDERInherit();
		}
		
		
	}

	/**
	 * 是否填充实体的默认值
	 *
	 * @return
	 */
	protected boolean isFillEntityDefaultValues(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}
	

	

	/**
	 * 是否填充实体完整的信息
	 *
	 * @return
	 */
	protected boolean isFillEntityFullInfo(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}
		return false;
	}

	/**
	 * 是否填充实体的主键
	 *
	 * @return
	 */
	protected boolean isFillEntityKeyValue(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	protected boolean isGetDraftOrCreateAction(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在实际操作之前检查数据对象
	 *
	 * @return
	 */
	protected boolean isCheckEntityBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}

			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在实际操作之后检查数据对象
	 * 
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	protected boolean isCheckEntityAfterProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				// 完全填充，则启用前验证
				if (iPSDEAction.getPrepareLastMode() == DEActionPrepareLastMode.FILLED.value) {
					return false;
				}
				return true;
			}
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在实际操作之前转换数据对象
	 *
	 * @return
	 */
	protected boolean isTranslateEntityBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {

		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在实际操作之后转换数据对象
	 *
	 * @return
	 */
	protected boolean isTranslateEntityAfterProceed(String strActionName, IPSDEAction iPSDEAction) {

		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.GET.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	protected boolean isEnableBuildParentPath() {

		if (this.getRecursivePSDER1N() != null && (this.getParentIdPathPSDEField() != null || this.getParentNamePathPSDEField() != null)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在实际操作之后构建数据对象父信息
	 *
	 * @return
	 */
	protected boolean isBuildParentPathAfterProceed(String strActionName, IPSDEAction iPSDEAction) {

		// if (this.getRecursivePSDER1N() == null ||
		// (this.getParentIdPathPSDEField() == null &&
		// this.getParentNamePathPSDEField() == null)) {
		// return false;
		// }

		if (iPSDEAction != null) {
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在实际操作之前构建数据对象父信息
	 *
	 * @return
	 */
	protected boolean isBuildParentPathBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {

		// if (this.getRecursivePSDER1N() == null ||
		// (this.getParentIdPathPSDEField() == null &&
		// this.getParentNamePathPSDEField() == null)) {
		// return false;
		// }

		if (iPSDEAction != null) {

			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}

			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在删除数据之前检查引用
	 *
	 * @return
	 */
	protected boolean isCheckReferenceBeforeRemove(String strActionName, IPSDEAction iPSDEAction) {

		if (iPSDEAction != null) {
			if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	protected boolean isInheritMajorDataEntityCreate(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	protected boolean isInheritMajorDataEntityUpdate(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}
		return false;
	}

	protected boolean isInheritMajorDataEntityRemove(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	protected boolean isIndexMajorDataEntityCreate(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	protected boolean isIndexMajorDataEntityUpdate(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	protected boolean isIndexMajorDataEntityRemove(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之前转换实体主关系数据属性
	 *
	 * @return
	 */
	protected boolean isTranslateEntityNestedDERsBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之后转换实体主关系数据属性
	 *
	 * @return
	 */
	protected boolean isTranslateEntityNestedDERsAfterProceed(String strActionName, IPSDEAction iPSDEAction) {
		
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.GET.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之前审计数据对象
	 *
	 * @return
	 */
	protected boolean isAuditEntityBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {

			if (DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())) {
				return false;
			}

			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return false;
			}

			if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
				return false;
			}

			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}

			if (!iPSDEAction.isEnableAudit()) {
				return false;
			}

			if (DEActionModes.CUSTOM.equals(iPSDEAction.getActionMode())) {
				return true;
			}

			return false;
		}

		if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
			return false;
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return false;
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return false;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之后审计数据对象
	 *
	 * @return
	 */
	protected boolean isAuditEntityAfterProceed(String strActionName, IPSDEAction iPSDEAction) {

		if (iPSDEAction != null) {

			if (DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())) {
				return false;
			}

			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
				return true;
			}

			if (!iPSDEAction.isEnableAudit()) {
				return false;
			}

			if (DEActionModes.CUSTOM.equals(iPSDEAction.getActionMode())) {
				return true;
			}

			return false;
		}

		if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
			return false;
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之后同步数据对象
	 *
	 * @return
	 */
	protected boolean isSyncEntityAfterProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之后向工作流注册数据对象
	 *
	 * @return
	 */
	protected boolean isWFRegisterEntityAfterProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之后向工作流注销数据对象
	 *
	 * @return
	 */
	protected boolean isWFUnregisterEntityAfterProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 是否在处理之后填充wftag
	 *
	 * @return
	 */
	protected boolean isFillWFTagAfterProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.GET.equalsIgnoreCase(strActionName)) {
			return true;
		}
		return false;
	}

	/**
	 * 操作之前 检查数据对象
	 *
	 * @param iPSDEAction
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	protected void checkEntityBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// 如果会在代码中设置属性的值，则该属性需设置为允许空输入
		boolean bCheckEmpty = false;
		boolean bCheckDup = false;
		if (DEActions.CREATE.equals(strActionName) || (iPSDEAction != null && DEActionModes.CREATE.equals(iPSDEAction.getActionMode()))) {
			bCheckEmpty = true;
			bCheckDup = true;
		} else if (iPSDEAction != null && iPSDEAction.getPrepareLastMode() == DEActionPrepareLastMode.FILLED.value) {
			// 完全填充
			bCheckDup = true;
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null && actionSession.isIgnoreDuplicateCheck()) {
			bCheckDup = false;
		}

		this.checkEntity(arg0, bCheckEmpty, bCheckDup, true, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	/**
	 * 操作之前 检查数据对象
	 *
	 * @param iPSDEAction
	 * @param arg0
	 * @param joinPoint
	 * @throws Exception
	 */
	protected void checkEntity(IEntityBase arg0, boolean bCheckEmpty, boolean bCheckDup, boolean bCheckDEFValueRule, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields == null) {
			return;
		}

		EntityError entityError = new EntityError();

		boolean bDynaInstMode = this.getPSDataEntity() != iPSDataEntity;

		String strActionMode = (iPSDEAction != null) ? iPSDEAction.getActionMode() : strActionName;

		for (IPSDEField iPSDEField : psDEFields) {

			if (!isCheckField(strActionName, iPSDEAction, iPSDEField)) {
				continue;
			}

			this.checkFieldValueRule(arg0, iPSDEField, bCheckEmpty, bCheckDup, true, bDynaInstMode, entityError);
		}

		// 执行属性检查逻辑
		for (IPSDEField iPSDEField : psDEFields) {

			IPSDEFLogic iPSDEFLogic = iPSDEField.getCheckPSDEFLogic();
			if (iPSDEFLogic == null) {
				continue;
			}
			if (iPSDEFLogic.isCustomCode()) {
				if (StringUtils.hasLength(iPSDEFLogic.getScriptCode())) {
					IDEScriptLogicRuntime iDEScriptActionRuntime = this.getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFCHECK, iPSDEFLogic.getScriptCode(), iDynaInstRuntime != null);
					if (iDEScriptActionRuntime == null) {
						iDEScriptActionRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId()).getDEScriptLogicRuntime(IDEScriptLogicRuntime.LOGICMODE_DEFCHECK, iPSDEFLogic.getScriptCode());
					}

					Object objValue = iDEScriptActionRuntime.execute(new Object[] { arg0, strActionMode, iPSDEField, iPSDEAction });
					if (objValue != null) {
						boolean bCheckOk = true;
						String strErrorInfo = null;
						if (objValue instanceof Boolean) {
							bCheckOk = (Boolean) objValue;
						} else if (objValue instanceof String) {
							bCheckOk = false;
							strErrorInfo = (String) objValue;
						}

						if (!bCheckOk) {
							EntityFieldError entityFieldError = new EntityFieldError();
							entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
							entityFieldError.setPSDEField(iPSDEField);
							entityFieldError.setErrorInfo(strErrorInfo);
							entityError.register(entityFieldError);
						}
					}
				}

			} else {
				IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(iPSDEFLogic);
				Object objValue = iDELogicRuntime.execute(new Object[] { arg0, strActionMode, iPSDEField, iPSDEAction });
				if (objValue != null) {
					boolean bCheckOk = true;
					String strErrorInfo = null;
					if (objValue instanceof Boolean) {
						bCheckOk = (Boolean) objValue;
					} else if (objValue instanceof String) {
						strErrorInfo = (String) objValue;
						if (StringUtils.hasLength(strErrorInfo)) {
							bCheckOk = false;
						}
					}

					if (!bCheckOk) {
						EntityFieldError entityFieldError = new EntityFieldError();
						entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
						entityFieldError.setPSDEField(iPSDEField);
						entityFieldError.setErrorInfo(strErrorInfo);
						entityError.register(entityFieldError);
					}
				}
			}
		}

		if (entityError.hasError()) {
			throw new EntityException(entityError, this);
		}
	}

	/**
	 * 操作之后 检查数据对象
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void checkEntityAfterProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		// 如果会在代码中设置属性的值，则该属性需设置为允许空输入
		boolean bCheckEmpty = false;
		boolean bCheckDup = false;
		if (DEActions.UPDATE.equals(strActionName) || (iPSDEAction != null && DEActionModes.UPDATE.equals(iPSDEAction.getActionMode()))) {
			bCheckDup = true;
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null && actionSession.isIgnoreDuplicateCheck()) {
			bCheckDup = false;
		}

		this.checkEntity(arg0, bCheckEmpty, bCheckDup, true, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	protected boolean checkFieldValueRule(IEntityBase arg0, IPSDEField iPSDEField, boolean bCheckEmpty, boolean bCheckDup, EntityError entityError) throws Throwable {
		return checkFieldValueRule(arg0, iPSDEField, bCheckEmpty, bCheckDup, true, false, entityError);
	}

	/**
	 * 检查属性基础值规则
	 * 
	 * @param arg0
	 * @param iPSDEField
	 * @param bCheckEmpty
	 * @param bCheckDup
	 * @param bCheckDEFValueRule
	 * @param bDynaInstMode
	 * @param entityError
	 * @return
	 * @throws Throwable
	 */
	protected boolean checkFieldValueRule(IEntityBase arg0, IPSDEField iPSDEField, boolean bCheckEmpty, boolean bCheckDup, boolean bCheckDEFValueRule, boolean bDynaInstMode, EntityError entityError) throws Throwable {
		Object objValue = this.getFieldValue(arg0, iPSDEField);
		if(objValue instanceof String) {
			objValue = ((String)objValue).trim();
			if(ObjectUtils.isEmpty(objValue)) {
				objValue = null;
			}
		}

		/**
		 * 动态实例重复值检查使用核心模型
		 */
		IPSDEField backupPSDEField = null;
		if (bDynaInstMode && bCheckDup && !iPSDEField.isKeyDEField()) {
			backupPSDEField = iPSDEField;
			iPSDEField = this.getPSDEField(iPSDEField.getName());
			if (iPSDEField == null) {
				iPSDEField = backupPSDEField;
				backupPSDEField = null;
			}
		}

		if (bCheckEmpty && iPSDEField.isKeyDEField() && (this.getSaaSMode() == DESaaSModes.STANDARD || this.getSaaSMode() == DESaaSModes.STANDARD2)) {
			if (objValue == null || ObjectUtils.isEmpty(objValue)) {
				EntityFieldError entityFieldError = new EntityFieldError();
				entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
				entityFieldError.setPSDEField(iPSDEField);
				entityError.register(entityFieldError);
				return false;
			}

			ISearchContextBase searchContext = this.createSearchContext();
			this.setSearchCondition(searchContext, iPSDEField, Conditions.EQ, objValue);
			if (this.existsData(searchContext)) {
				EntityFieldError entityFieldError = new EntityFieldError();
				entityFieldError.setErrorType(EntityFieldError.ERROR_DUPLICATE);
				entityFieldError.setPSDEField(iPSDEField);
				entityFieldError.setFieldValue(objValue);
				entityError.register(entityFieldError);
				return false;
			}
		}
		
		if(!bCheckEmpty) {
			bCheckEmpty = this.containsFieldValue(arg0, iPSDEField);
		}

		if (bCheckEmpty && (!iPSDEField.isKeyDEField()) && !iPSDEField.isAllowEmpty()) {
			if (objValue == null || ObjectUtils.isEmpty(objValue)) {
				EntityFieldError entityFieldError = new EntityFieldError();
				entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
				entityFieldError.setPSDEField(iPSDEField);
				entityError.register(entityFieldError);
				return false;
			}
		}

		if (bCheckDup && !iPSDEField.isKeyDEField() && (StringUtils.hasLength(iPSDEField.getDupCheckMode()) && !DEFDupCheckModes.NONE.equals(iPSDEField.getDupCheckMode()))) {

			if (DEFDupCheckModes.NOTNULL.equals(iPSDEField.getDupCheckMode())) {
				if (objValue == null) {
					bCheckDup = false;
				}
			} else if (DEFDupCheckModes.CHECKVALUES.equals(iPSDEField.getDupCheckMode())) {
				bCheckDup = false;
				if (objValue != null && iPSDEField.getDupCheckValues() != null) {
					for (String strDupValue : iPSDEField.getDupCheckValues()) {
						Object objDupValue = this.getSystemRuntime().convertValue(iPSDEField.getStdDataType(), strDupValue);
						if (this.getSystemRuntime().testValueCond(objValue, Conditions.EQ, objDupValue, iPSDEField.getStdDataType())) {
							bCheckDup = true;
							break;
						}
					}
				}
			} else if (DEFDupCheckModes.EXCLUDEVALUES.equals(iPSDEField.getDupCheckMode())) {
				/**
				 * 20210623添加排除值
				 */
				if (objValue == null) {
					bCheckDup = false;
				} else {
					bCheckDup = true;
				}
				if (objValue != null && iPSDEField.getDupCheckValues() != null) {
					for (String strDupValue : iPSDEField.getDupCheckValues()) {
						Object objDupValue = this.getSystemRuntime().convertValue(iPSDEField.getStdDataType(), strDupValue);
						if (this.getSystemRuntime().testValueCond(objValue, Conditions.EQ, objDupValue, iPSDEField.getStdDataType())) {
							bCheckDup = false;
							break;
						}
					}
				}
			}

			if (bCheckDup) {
				if (!checkFieldDuplicateCondition(objValue, arg0, iPSDEField)) {
					EntityFieldError entityFieldError = new EntityFieldError();
					entityFieldError.setErrorType(EntityFieldError.ERROR_DUPLICATE);
					entityFieldError.setPSDEField(iPSDEField);
					entityFieldError.setFieldValue(objValue);
					entityError.register(entityFieldError);
					return false;
				}
			}
		}

		if (backupPSDEField != null) {
			iPSDEField = backupPSDEField;
		}

		boolean bRet = true;
		if (bCheckDEFValueRule) {
			List<IPSDEFValueRule> psDEFValueRules = iPSDEField.getAllPSDEFValueRules();
			if (psDEFValueRules != null) {
				for (IPSDEFValueRule iPSDEFValueRule : psDEFValueRules) {
					if (!iPSDEFValueRule.isCheckDefault() || !iPSDEFValueRule.isEnableBackend()) {
						continue;
					}

					if (!this.checkFieldValueRule(objValue, arg0, iPSDEFValueRule, iPSDEField, iPSDataEntity, entityError)) {
						bRet = false;
					}
				}
			}
		}

		return bRet;

	}

	protected boolean checkFieldDuplicateCondition(Object objValue, IEntityBase arg0, IPSDEField iPSDEField) throws Throwable {

		Object objKeyValue = this.getFieldValue(arg0, this.getKeyPSDEField());
		if (objKeyValue == null) {
			return true;
		}

		return this.onCheckFieldDuplicateCondition(objValue, objKeyValue, arg0, iPSDEField);
	}

	protected boolean onCheckFieldDuplicateCondition(Object objValue, Object objKeyValue, IEntityBase arg0, IPSDEField iPSDEField) throws Throwable {

		ISearchContextBase searchContext = this.createSearchContext();
		// 不等于当前主键
		this.setSearchCondition(searchContext, this.getKeyPSDEField(), Conditions.NOTEQ, objKeyValue);

		if (objValue == null) {
			this.setSearchCondition(searchContext, iPSDEField, Conditions.ISNULL, objValue);
		} else {
			this.setSearchCondition(searchContext, iPSDEField, Conditions.EQ, objValue);
		}

		List<IPSDEField> dupCheckPSDEFields = iPSDEField.getDupCheckPSDEFields();
		if (dupCheckPSDEFields != null) {
			for (IPSDEField dupCheckPSDEField : dupCheckPSDEFields) {
				Object value = this.getFieldValue(arg0, dupCheckPSDEField);
				if (value == null) {
					this.setSearchCondition(searchContext, dupCheckPSDEField, Conditions.ISNULL, null);
				} else {
					this.setSearchCondition(searchContext, dupCheckPSDEField, Conditions.EQ, value);
				}
			}
		}

		return !this.existsData(searchContext);
	}

	/**
	 * 删除之前检查数据引用
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void checkReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		java.util.List<IPSDERBase> psDERBases = (isEnableCustomizedDER1N()) ? iPSDataEntity.getMajorPSDERs() : this.getPSDataEntity().getMajorPSDERs();
		if (psDERBases == null) {
			return;
		}

		for (IPSDERBase iPSDERBase : psDERBases) {
			if (DERTypes.DER1N.equals(iPSDERBase.getDERType())) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				if (iPSDER1N.getRemoveActionType() == DERRemoveActionTypes.REJECT) {
					checkReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDER1N, iPSDataEntity, iDynaInstRuntime, actionData);
				}

				continue;
			}

			if (DERTypes.DER11.equals(iPSDERBase.getDERType())) {
				IPSDER11 iPSDER11 = (IPSDER11) iPSDERBase;
				if (iPSDER11.getRemoveActionType() == DERRemoveActionTypes.REJECT) {
					checkReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDER11, iPSDataEntity, iDynaInstRuntime, actionData);
				}
				continue;
			}

			if (DERTypes.DERCUSTOM.equals(iPSDERBase.getDERType())) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				if (DERSubType.DER11.value.equals(iPSDERCustom.getDERSubType()) || DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
					if (iPSDERCustom.getRemoveActionType() == DERRemoveActionTypes.REJECT) {
						checkReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDERCustom, iPSDataEntity, iDynaInstRuntime, actionData);
					}
				}
				continue;
			}
		}
	}

	/**
	 * 删除之前检查数据引用
	 *
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDER1N
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void checkReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDER1N iPSDER1N, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		IPSDataEntity minorPSDataEntity = iPSDER1N.getMinorPSDataEntity();
		if (minorPSDataEntity == null) {
			throw new ModelException(iPSDER1N, String.format("关系[%1$s]从实体无效", iPSDER1N.getName()));
		}

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getDynaModelFilePath());
		if (minorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("关系从实体[%1$s]运行时对象无效", minorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKey = null;
		if (arg0 instanceof IEntityBase) {
			objKey = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKey = arg0;
		}

		//DTO内存在待更新数据则忽略删除限制
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		String strPendingCacheTag = String.format(DataEntityUtilRuntimeBase.ACTIONSESSIONPARAM_FILLENTITYFULLINFO_X, this.getId(),objKey);

		if (((actionSession != null)?actionSession.containsActionParam(strPendingCacheTag):false)) {
			return;
		}

		if (minorDataEntityRuntime.containsForeignKey(iPSDER1N.getPSPickupDEField(), objKey, iPSDER1N)) {
			if(StringUtils.hasLength(iPSDER1N.getRemoveRejectMsg())) {
				throw new DataEntityRuntimeException(this, iPSDER1N.getRemoveRejectMsg(), Errors.DELETEREJECT);
			}
			else {
				throw new DataEntityRuntimeException(this, String.format("引用数据[%1$s]限制删除", minorDataEntityRuntime.getPSDataEntity().getLogicName()), Errors.DELETEREJECT);
			}
		}
	}

	/**
	 * 删除之前检查数据引用
	 *
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDERCustom
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void checkReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDERCustom iPSDERCustom, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		IPSDataEntity minorPSDataEntity = iPSDERCustom.getMinorPSDataEntity();
		if (minorPSDataEntity == null) {
			throw new ModelException(iPSDERCustom, String.format("关系[%1$s]从实体无效", iPSDERCustom.getName()));
		}

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getDynaModelFilePath());
		if (minorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("关系从实体[%1$s]运行时对象无效", minorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKey = null;
		if (arg0 instanceof IEntityBase) {
			objKey = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKey = arg0;
		}

		if (minorDataEntityRuntime.containsForeignKey(iPSDERCustom.getPickupPSDEField(), objKey, iPSDERCustom)) {
			if(StringUtils.hasLength(iPSDERCustom.getRemoveRejectMsg())) {
				throw new DataEntityRuntimeException(this, iPSDERCustom.getRemoveRejectMsg(), Errors.DELETEREJECT);
			}
			else {
				throw new DataEntityRuntimeException(this, String.format("引用数据[%1$s]限制删除", minorDataEntityRuntime.getPSDataEntity().getLogicName()), Errors.DELETEREJECT);
			}
			
		}
	}

	/**
	 * 重置数据引用
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void resetReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		java.util.List<IPSDERBase> psDERBases = (isEnableCustomizedDER1N()) ? iPSDataEntity.getMajorPSDERs() : this.getPSDataEntity().getMajorPSDERs();
		if (psDERBases == null) {
			return;
		}

		for (IPSDERBase iPSDERBase : psDERBases) {
			if (DERTypes.DER1N.equals(iPSDERBase.getDERType())) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				if (iPSDER1N.getRemoveActionType() == DERRemoveActionTypes.RESET) {
					resetReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDER1N, iPSDataEntity, iDynaInstRuntime, actionData);
				}

				continue;
			}

			if (DERTypes.DERCUSTOM.equals(iPSDERBase.getDERType())) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				if (DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
					if (iPSDERCustom.getRemoveActionType() == DERRemoveActionTypes.RESET) {
						resetReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDERCustom, iPSDataEntity, iDynaInstRuntime, actionData);
					}
				}
				continue;
			}
		}
	}

	/**
	 * 重置数据引用
	 *
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDER1N
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void resetReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDER1N iPSDER1N, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		IPSDataEntity minorPSDataEntity = iPSDER1N.getMinorPSDataEntity();
		if (minorPSDataEntity == null) {
			throw new ModelException(iPSDER1N, String.format("关系[%1$s]从实体无效", iPSDER1N.getName()));
		}

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getDynaModelFilePath());
		if (minorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("关系从实体[%1$s]运行时对象无效", minorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKey = null;
		if (arg0 instanceof IEntityBase) {
			objKey = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKey = arg0;
		}

		minorDataEntityRuntime.resetByForeignKey(iPSDER1N.getPSPickupDEField(), objKey, iPSDER1N);
	}

	/**
	 * 重置数据引用
	 *
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDERCustom
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void resetReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDERCustom iPSDERCustom, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		IPSDataEntity minorPSDataEntity = iPSDERCustom.getMinorPSDataEntity();
		if (minorPSDataEntity == null) {
			throw new ModelException(iPSDERCustom, String.format("关系[%1$s]从实体无效", iPSDERCustom.getName()));
		}

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getDynaModelFilePath());
		if (minorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("关系从实体[%1$s]运行时对象无效", minorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKey = null;
		if (arg0 instanceof IEntityBase) {
			objKey = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKey = arg0;
		}

		minorDataEntityRuntime.resetByForeignKey(iPSDERCustom.getPickupPSDEField(), objKey, iPSDERCustom);
	}

	/**
	 * 删除数据引用
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void removeReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		// 删除值转化相关

		// 删除动态存储

		java.util.List<IPSDERBase> psDERBases = (isEnableCustomizedDER1N()) ? iPSDataEntity.getMajorPSDERs() : this.getPSDataEntity().getMajorPSDERs();
		if (psDERBases == null) {
			return;
		}

		List<IPSDER1NBase> removePSDER1NList = new ArrayList<IPSDER1NBase>();

		for (IPSDERBase iPSDERBase : psDERBases) {
			if (iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				removePSDER1NList.add(iPSDER1N);
			} else if (iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				if (DERSubTypes.DER11.equals(iPSDERCustom.getDERSubType()) || DERSubTypes.DER1N.equals(iPSDERCustom.getDERSubType())) {
					removePSDER1NList.add(iPSDERCustom);
				}
			}
		}
		Collections.sort(removePSDER1NList, new Comparator<IPSDERBase>() {
			public int compare(IPSDERBase arg0, IPSDERBase arg1) {
				Integer val0 = -1;
				Integer val1 = -1;
				if (arg0 instanceof IPSDER1N) {
					val0 = ((IPSDER1N) arg0).getRemoveOrder();
				}else if (arg0 instanceof IPSDERCustom) {
					val0 = ((IPSDERCustom) arg0).getRemoveOrder();
				}

				if (arg1 instanceof IPSDER1N) {
					val1 = ((IPSDER1N) arg1).getRemoveOrder();
				}else if (arg1 instanceof IPSDERCustom) {
					val1 = ((IPSDERCustom) arg1).getRemoveOrder();
				}

				return val0.compareTo(val1);

			}
		});

		for (IPSDERBase iPSDERBase : removePSDER1NList) {
			if (DERTypes.DER1N.equals(iPSDERBase.getDERType())) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				if (iPSDER1N.getRemoveActionType() == DERRemoveActionTypes.DELETE) {
					removeReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDER1N, iPSDataEntity, iDynaInstRuntime, actionData);
				}

				continue;
			}

			if (DERTypes.DER11.equals(iPSDERBase.getDERType())) {
				IPSDER11 iPSDER11 = (IPSDER11) iPSDERBase;
				if (iPSDER11.getRemoveActionType() == DERRemoveActionTypes.DELETE) {
					removeReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDER11, iPSDataEntity, iDynaInstRuntime, actionData);
				}
				continue;
			}

			if (DERTypes.DERCUSTOM.equals(iPSDERBase.getDERType())) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				if (DERSubType.DER11.value.equals(iPSDERCustom.getDERSubType()) || DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
					if (iPSDERCustom.getRemoveActionType() == DERRemoveActionTypes.DELETE) {
						removeReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDERCustom, iPSDataEntity, iDynaInstRuntime, actionData);
					}
				}
				continue;
			}

		}
	}

	/**
	 * 删除数据引用
	 *
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDER1N
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void removeReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDER1N iPSDER1N, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		IPSDataEntity minorPSDataEntity = iPSDER1N.getMinorPSDataEntity();
		if (minorPSDataEntity == null) {
			throw new ModelException(iPSDER1N, String.format("关系[%1$s]从实体无效", iPSDER1N.getName()));
		}

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getDynaModelFilePath());
		if (minorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("关系从实体[%1$s]运行时对象无效", minorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKey = null;
		if (arg0 instanceof IEntityBase) {
			objKey = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKey = arg0;
		}

		minorDataEntityRuntime.removeByForeignKey(iPSDER1N.getPSPickupDEField(), objKey, iPSDER1N);
	}

	/**
	 * 删除数据引用
	 *
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDER1N
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void removeReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDERCustom iPSDERCustom, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		IPSDataEntity minorPSDataEntity = iPSDERCustom.getMinorPSDataEntity();
		if (minorPSDataEntity == null) {
			throw new ModelException(iPSDERCustom, String.format("关系[%1$s]从实体无效", iPSDERCustom.getName()));
		}

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getDynaModelFilePath());
		if (minorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("关系从实体[%1$s]运行时对象无效", minorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKey = null;
		if (arg0 instanceof IEntityBase) {
			objKey = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKey = arg0;
		}

		minorDataEntityRuntime.removeByForeignKey(iPSDERCustom.getPickupPSDEField(), objKey, iPSDERCustom);
	}

	/**
	 * 删除实体动态属性
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void removeEntityDynaFieldsBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	protected boolean isCheckField(String strActionName, IPSDEAction iPSDEAction, IPSDEField iPSDEField) {
		if (!iPSDEField.isPhisicalDEField()) {
			return false;
		}
		// 判断是否为系统预置属性
		if (StringUtils.hasLength(iPSDEField.getPredefinedType())) {
			if (IgnoreCheckDEFPredefinedTypeMap.containsKey(iPSDEField.getPredefinedType())) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 切面环绕实体数据集合，外部触发
	 *
	 * @param strDataSetName
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	public Object aroundDataSet(String strDataSetName, ProceedingJoinPoint joinPoint) throws Throwable {

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
			
			actionSession.beginLog(this.getName(), strDataSetName);

			Object objRet = this.onFetchDataSet(strDataSetName, this.getPSDEDataSet(strDataSetName), joinPoint.getArgs(), joinPoint);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);

			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEDATASET, iActionSessionLog.toString(true), this.getName(), strDataSetName, iActionSessionLog.getTime(), iActionSessionLog);
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
					String strInfo = String.format("实体[%1$s]数据集[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strDataSetName, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEDATASET, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}

			throw ex;
		} finally {
			this.pollDataSource();
		}

	}

	@Override
	public Object fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {

		prepare();

		// 判断行为是否支持
		if (iPSDEDataSet == null) {
			iPSDEDataSet = this.getPSDEDataSet(strDataSetName);
			if (iPSDEDataSet == null) {
				throw new DataEntityRuntimeException(this, String.format("无法获取实体数据集[%1$s]，无法获取对应的数据集模型", strDataSetName));
			}
		}

		if (!isEnableFetchDataSet(strDataSetName, iPSDEDataSet)) {
			throw new DataEntityRuntimeException(this, String.format("无法获取实体数据集[%1$s]，不支持的数据集类型[%2$s]", strDataSetName, iPSDEDataSet.getDataSetType()));
		}

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
			DataEntityRuntimeHolder.pushPSDEDataSet(iPSDEDataSet);
			
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			actionSession.beginLog(this.getName(), strDataSetName);

			Object objRet = this.onFetchDataSet(strDataSetName, iPSDEDataSet, args, null);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);

			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEDATASET, iActionSessionLog.toString(true), this.getName(), strDataSetName, iActionSessionLog.getTime(), iActionSessionLog);
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
					String strInfo = String.format("实体[%1$s]数据集[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strDataSetName, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEDATASET, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}

			throw ex;
		} finally {
			DataEntityRuntimeHolder.pollPSDEDataSet();
			this.pollDataSource();
		}
	}

	/**
	 * 判断传入数据集是否支持直接执行获取
	 *
	 * @param strActionName
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @return
	 */
	protected boolean isEnableFetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet) {
		return false;
	}

	protected Object onFetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		ProceedingJoinPoint joinPoint = null;
		if (actionData != null && actionData instanceof ProceedingJoinPoint) {
			joinPoint = (ProceedingJoinPoint) actionData;
		}

		ISearchContext iSearchContext = null;
		if (args != null && args.length > 0) {
			Object objSearchContext = args[0];
			if (objSearchContext instanceof ISearchContext) {
				iSearchContext = (ISearchContext) objSearchContext;
			}
		}
		// 判断是否需要强行附加查询条件
		if (iSearchContext != null) {
			if (StringUtils.hasLength(this.getDynaInstTag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag2()) && this.getDynaInstTag().equals(actionSession.getUserContext().getDynainsttag())) {
				Object objDataType = this.getSystemRuntime().convertValue(this.getDataTypePSDEField().getStdDataType(), actionSession.getUserContext().getDynainsttag2());
				this.setSearchCondition(iSearchContext, this.getDataTypePSDEField(), Conditions.EQ, objDataType);
			}
			if (this.valueFuncPSDEFieldList != null) {
				for (IPSDEField iPSDEField : this.valueFuncPSDEFieldList) {
					List<IPSDEFSearchMode> psDESearchModes = iPSDEField.getAllPSDEFSearchModes();
					if (psDESearchModes != null) {
						for (IPSDEFSearchMode iPSDEFSearchMode : psDESearchModes) {
							if (!StringUtils.hasLength(iPSDEFSearchMode.getValueFunc())) {
								continue;
							}
							ISysValueFuncRuntime iSysValueFuncRuntime = this.getSystemRuntime().getSysValueFuncRuntime(iPSDEFSearchMode.getValueFunc());
							if (iSysValueFuncRuntime == null) {
								throw new DataEntityRuntimeException(this, String.format("无法获取指定值函数[%1$s]运行时对象", iPSDEFSearchMode.getValueFunc()));
							}
							iSysValueFuncRuntime.convert(iSearchContext, iPSDEFSearchMode, iPSDEField, this);
						}
					}
				}
			}
			
			//递归转化输入值
		}

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
				if (this.getDynaInstMode() == DynaInstModes.ENABLEINST) {
					// 计算对应的实例
					Object objDataType = null;
					if (StringUtils.hasLength(this.getDynaInstTag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag2()) && this.getDynaInstTag().equals(actionSession.getUserContext().getDynainsttag())) {
						objDataType = this.getSystemRuntime().convertValue(this.getDataTypePSDEField().getStdDataType(), actionSession.getUserContext().getDynainsttag2());
					}
					if (objDataType != null) {
						String strChildDynaInstId = iDynaInstRuntime.getChildDynaInstId(this.getDynaInstTag(), objDataType.toString());
						if (StringUtils.hasLength(strChildDynaInstId)) {
							iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strChildDynaInstId);
							// 设置当前会话的子动态实例运行时
							ActionSessionManager.getCurrentSession().setChildDynaInstRuntime(iDynaInstRuntime);
							log.debug(String.format("实体[%1$s][%2$s][%3$s]计算实例=>[%4$s]", this.getName(), this.getDynaInstTag(), objDataType.toString(), strChildDynaInstId));
						}
					}
				}
				if (iDynaInstRuntime != null) {
					iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}

		if (iPSDEDataSet != null && iSearchContext != null) {
			// 判断是否启用数据集参数逻辑
			if (isEnableDataSetParamLogic()) {
				if (iPSDEDataSet.isCustomParam()) {
					this.fillDataSetParams(iSearchContext, iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
				}
			}
		}
		
		if (iPSDEDataSet != null && this.isEnableDataSetLogic(iPSDEDataSet, DEActionLogicAttachModes.PREPARE)) {
			this.executeDataSetLogics(args, null, iPSDEDataSet, DEActionLogicAttachModes.PREPARE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		}
		
			
		if (iPSDEDataSet != null && iSearchContext != null) {
			// 转换查询条件
			Sort sort = iSearchContext.getPageSort();
			List<Sort.Order> list = new ArrayList<Sort.Order>();

			if (sort == null || sort == Sort.unsorted() || ObjectUtils.isEmpty(sort.iterator())) {
				if (iPSDEDataSet.getMajorSortPSDEField() != null || iPSDEDataSet.getMinorSortPSDEField() != null) {
					list = new ArrayList<Sort.Order>();
					// 放入结果集合的默认排序
					if (iPSDEDataSet.getMajorSortPSDEField() != null) {
						String strFieldExp = this.isConvertDataSetSortFieldExp()?getFieldDataSetSortExp(iPSDEDataSet.getMajorSortPSDEField()):null;
						if (!StringUtils.hasLength(strFieldExp)) {
							strFieldExp = iPSDEDataSet.getMajorSortPSDEField().getName();
						}
						if ("DESC".equalsIgnoreCase(iPSDEDataSet.getMajorSortDir())) {
							list.add(Sort.Order.desc(strFieldExp));
						} else {
							list.add(Sort.Order.asc(strFieldExp));
						}
					}

					if (iPSDEDataSet.getMinorSortPSDEField() != null) {
						String strFieldExp = this.isConvertDataSetSortFieldExp()?getFieldDataSetSortExp(iPSDEDataSet.getMinorSortPSDEField()):null;
						if (!StringUtils.hasLength(strFieldExp)) {
							strFieldExp = iPSDEDataSet.getMinorSortPSDEField().getName();
						}
						if ("DESC".equalsIgnoreCase(iPSDEDataSet.getMinorSortDir())) {
							list.add(Sort.Order.desc(strFieldExp));
						} else {
							list.add(Sort.Order.asc(strFieldExp));
						}
					}
				}

			} else {
				if (this.isConvertDataSetSortFieldExp() || iPSDEDataSet.getMajorSortPSDEField() != null || iPSDEDataSet.getMinorSortPSDEField() != null) {
					list = new ArrayList<Sort.Order>();
					Map<String, String> sortFieldMap = new HashMap<String, String>();
					java.util.Iterator<Sort.Order> orders = sort.iterator();
					while (orders.hasNext()) {
						Sort.Order order = orders.next();
						sortFieldMap.put(order.getProperty().toUpperCase(), "");
						IPSDEField iPSDEField = this.isConvertDataSetSortFieldExp()? this.getPSDEField(order.getProperty()):null;
						if (iPSDEField == null) {
							list.add(order);
							continue;
						}

						String strFieldExp = getFieldDataSetSortExp(iPSDEField);
						if (!StringUtils.hasLength(strFieldExp)) {
							list.add(order);
							continue;
						}

						order = order.withProperty(strFieldExp);
						list.add(order);
					}
					
					// 放入结果集合的默认排序，需要排除已经排序的属性
					if (iPSDEDataSet.getMajorSortPSDEField() != null && !sortFieldMap.containsKey(iPSDEDataSet.getMajorSortPSDEField().getName().toUpperCase())) {
						String strFieldExp = this.isConvertDataSetSortFieldExp()?getFieldDataSetSortExp(iPSDEDataSet.getMajorSortPSDEField()):null;
						if (!StringUtils.hasLength(strFieldExp)) {
							strFieldExp = iPSDEDataSet.getMajorSortPSDEField().getName();
						}
						if ("DESC".equalsIgnoreCase(iPSDEDataSet.getMajorSortDir())) {
							list.add(Sort.Order.desc(strFieldExp));
						} else {
							list.add(Sort.Order.asc(strFieldExp));
						}
					}

					if (iPSDEDataSet.getMinorSortPSDEField() != null && !sortFieldMap.containsKey(iPSDEDataSet.getMinorSortPSDEField().getName().toUpperCase())) {
						String strFieldExp = this.isConvertDataSetSortFieldExp()?getFieldDataSetSortExp(iPSDEDataSet.getMinorSortPSDEField()):null;
						if (!StringUtils.hasLength(strFieldExp)) {
							strFieldExp = iPSDEDataSet.getMinorSortPSDEField().getName();
						}
						if ("DESC".equalsIgnoreCase(iPSDEDataSet.getMinorSortDir())) {
							list.add(Sort.Order.desc(strFieldExp));
						} else {
							list.add(Sort.Order.asc(strFieldExp));
						}
					}
					
				} else {
					list = null;
				}
			}

			if (list != null) {
				iSearchContext.setPageSort(Sort.by(list));
			}
		}

		if (iPSDEDataSet != null && this.isEnableDataSetLogic(iPSDEDataSet, DEActionLogicAttachModes.BEFORE)) {
			this.executeDataSetLogics(args, null, iPSDEDataSet, DEActionLogicAttachModes.BEFORE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		}
		
		if (iPSDEDataSet != null && iSearchContext != null) {
			// 转换查询上下文
			this.translateSearchContextBeforeProceed(iSearchContext, iPSDEDataSet.getName(), iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			if (this.isEnableDynaStorage()) {
				this.translateSearchContextDynaFieldsBeforeProceed(iSearchContext, iPSDEDataSet.getName(), iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			}
		}

		IDEDataSetPluginRuntime iDEDataSetPluginRuntime = this.getDEDataSetPluginRuntime(iPSDEDataSet);
		Object ret = null;
		if (joinPoint != null && iDEDataSetPluginRuntime == null) {
			ret = joinPoint.proceed();
		} else {
			if (iDEDataSetPluginRuntime != null) {
				ret = iDEDataSetPluginRuntime.fetch(this.getDataEntityRuntimeContext(), iPSDEDataSet, args, actionData);
			} else {
				ret = onFetchDataSetReal(strDataSetName, iPSDEDataSet, args, actionData);
			}
		}

		if (ret instanceof Page) {
			Page page = (Page) ret;
			if (!ObjectUtils.isEmpty(page.getContent())) {
				if (this.isEnableDynaStorage() && !iPSDEDataSet.isEnableGroup()) {
					this.translateEntityDynaFieldsAfterProceed(iSearchContext, page.getContent(), iPSDEDataSet.getName(), iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
				}
//				for (Object obj : page.getContent()) {
//					if (obj instanceof IEntityBase) {
//						this.translateEntityAfterProceed(obj, strDataSetName, iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
//					}
//				}
				this.translateEntitiesAfterProceed(iSearchContext, page.getContent(), iPSDEDataSet.getName(), iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			}
		}
		
		// 执行后逻辑
		if (iPSDEDataSet != null && this.isEnableDataSetLogic(iPSDEDataSet, DEActionLogicAttachModes.AFTER)) {
			ret = this.executeDataSetLogics(args, ret, iPSDEDataSet, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		}

		return ret;
	}

	protected Object onFetchDataSetReal(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {

		IDEDataSetRuntime iDEDataSetRuntime = getDEDataSetRuntime(iPSDEDataSet);
		if (iDEDataSetRuntime != null && iDEDataSetRuntime.isValid(args)) {
			return iDEDataSetRuntime.fetch(args);
		}
		return null;
	}

	/**
	 * 切面环绕实体数据查询，外部触发
	 *
	 * @param strDataQueryName
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	public Object aroundDataQuery(String strDataQueryName, ProceedingJoinPoint joinPoint) throws Throwable {

		prepare();

		return joinPoint.proceed();
	}

	@Override
	public Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {

		prepare();

		// 判断行为是否支持
		if (iPSDEAction == null) {
			iPSDEAction = this.getPSDEAction(strActionName);
			// if (iPSDEAction == null) {
			// throw new DataEntityRuntimeException(this,
			// String.format("无法执行实体行为[%1$s]，无法获取对应的行为模型", strActionName));
			// }
		}

		//
		if (iPSDEAction != null && !isEnableExecuteAction(strActionName, iPSDEAction)) {
			if (!DEActionTypes.DELOGIC.equals(iPSDEAction.getActionType()) && !DEActionTypes.USERCUSTOM.equals(iPSDEAction.getActionType())) {
				throw new DataEntityRuntimeException(this, String.format("无法执行实体行为[%1$s]，不支持的行为类型[%2$s]", strActionName, iPSDEAction.getActionType()));
			}
		}

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
			
			DataEntityRuntimeHolder.pushPSDEAction(iPSDEAction);
			
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			actionSession.beginLog(this.getName(), strActionName);

			int nTransactionalPropagation = getTransactionalPropagation(strActionName, iPSDEAction);
			final IPSDEAction iPSDEAction2 = iPSDEAction;
			Object objRet = ActionSessionManager.getCurrentSession().execute(this, new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onExecuteAction(strActionName, iPSDEAction2, args, null);
				}
			}, args, nTransactionalPropagation);

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
			
			DataEntityRuntimeHolder.pollPSDEAction();
			this.pollDataSource();
		}
	}

	/**
	 * 判断传入行为是否支持直接执行调用
	 *
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	protected boolean isEnableExecuteAction(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (!DEActionTypes.DELOGIC.equals(iPSDEAction.getActionType()) && !DEActionTypes.USERCUSTOM.equals(iPSDEAction.getActionType())) {
				return false;
			}
		}

		return true;
	}

	protected Object onExecuteAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		ProceedingJoinPoint joinPoint = null;
		if (actionData != null && actionData instanceof ProceedingJoinPoint) {
			joinPoint = (ProceedingJoinPoint) actionData;
		}

		IEntityBase iEntityBase = null;
		Object arg0 = null;
		if (args != null && args.length > 0) {
			arg0 = args[0];
			if (arg0 instanceof IEntityBase) {
				iEntityBase = (IEntityBase) arg0;
			} else if (arg0 instanceof List) {
				if (joinPoint != null) {
					return joinPoint.proceed();
				}
				throw new DataEntityRuntimeException(this, String.format("无法执行实体行为[%1$s]，传入列表参数无效", strActionName), Errors.INPUTERROR);
			}

		} else {
			if (joinPoint != null) {
				return joinPoint.proceed();
			}
			throw new DataEntityRuntimeException(this, String.format("无法执行实体行为[%1$s]，传入参数无效", strActionName), Errors.INPUTERROR);
		}
		IPSDEWF iPSDEWF = null;

		if (iPSDEWF == null) {
			iPSDEWF = this.calcCurrentPSDEWF(args[0]);
		}
		if (iPSDEWF == null) {
			iPSDEWF = this.getDefaultPSDEWF();
		}

		/**
		 * 进行工作流回调行为相关处理
		 */
		if (iEntityBase != null && iPSDEWF != null && strActionName.indexOf("wf") == 0) {
			onWFAction(strActionName, iEntityBase, iPSDEAction, iPSDEWF, joinPoint);
		}

		/**
		 * 计算动态实例实体运行时
		 */
		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
		IDynaInstRuntime iDynaInstRuntime = null;
		if (this.getDynaInstMode() != DynaInstModes.DISABLE) {
			String strDynainstid = getDynaInstId(arg0);
			if (StringUtils.hasLength(strDynainstid)) {
				iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynainstid);
				// 设置当前会话的动态实例运行时
				ActionSessionManager.getCurrentSession().setDynaInstRuntime(iDynaInstRuntime);
				if (this.getDynaInstMode() == DynaInstModes.ENABLEINST) {
					// 计算对应的实例
					IEntityBase objEntity = null;
					if (isGetDraftOrCreateAction(strActionName, iPSDEAction)) {
						if (iEntityBase == null) {
							throw new DataEntityRuntimeException(this, String.format("无法执行实体行为[%1$s]，传入参数无效", strActionName), Errors.INPUTERROR);
						}
						objEntity = iEntityBase;
					} else {
						objEntity = getLastEntity(arg0);
					}
					if (objEntity != null) {
						Object objDataType = this.getFieldValue(objEntity, this.getDataTypePSDEField());
						if (ObjectUtils.isEmpty(objDataType) && isGetDraftOrCreateAction(strActionName, iPSDEAction)) {
							// 没有传入类型值，尝试计算
							if (StringUtils.hasLength(this.getDynaInstTag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag2()) && this.getDynaInstTag().equals(actionSession.getUserContext().getDynainsttag())) {
								objDataType = this.getSystemRuntime().convertValue(this.getDataTypePSDEField().getStdDataType(), actionSession.getUserContext().getDynainsttag2());
								this.setFieldValue(objEntity, this.getDataTypePSDEField(), objDataType);
							}
						}
						if (objDataType != null) {
							String strChildDynaInstId = iDynaInstRuntime.getChildDynaInstId(this.getDynaInstTag(), objDataType.toString());
							if (StringUtils.hasLength(strChildDynaInstId)) {
								iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strChildDynaInstId);
								// 设置当前会话的子动态实例运行时
								ActionSessionManager.getCurrentSession().setChildDynaInstRuntime(iDynaInstRuntime);
								log.debug(String.format("实体[%1$s][%2$s][%3$s]计算实例=>[%4$s]", this.getName(), this.getDynaInstTag(), objDataType.toString(), strChildDynaInstId));
							}
						}
					}
				}
				if (iDynaInstRuntime != null) {
					iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
					// 更替行为
					iPSDEAction = iDynaInstDataEntityRuntime.getPSDEAction(strActionName);
				}
			}
		}

		if (isEnableInheritLogic()) {
			if (this.isInheritMajor()) {
				Object objKeyValue = null;
				if (iEntityBase != null) {
					objKeyValue = this.getFieldValue(iEntityBase, this.getKeyPSDEField());
				} else {
					objKeyValue = arg0;
				}

				// 判断是否为继承主实体，行为需要在子实体约束下
				if (this.isInheritMajorDataEntityCreate(strActionName, iPSDEAction)) {
					if (actionSession.registerRecursion(RECURSION_INHERITACTION, this.getId(), objKeyValue, DEActions.CREATE)) {
						throw new DataEntityRuntimeException(this, String.format("继承主实体不能独立建立数据"));
					}
				} else if (this.isInheritMajorDataEntityUpdate(strActionName, iPSDEAction)) {
					if (actionSession.registerRecursion(RECURSION_INHERITACTION, this.getId(), objKeyValue, DEActions.UPDATE)) {
						throw new DataEntityRuntimeException(this, String.format("继承主实体不能独立更新数据"));
					}
				} else if (this.isInheritMajorDataEntityRemove(strActionName, iPSDEAction)) {
					if (actionSession.registerRecursion(RECURSION_INHERITACTION, this.getId(), objKeyValue, DEActions.REMOVE)) {
						actionSession.unregisterRecursion(RECURSION_INHERITACTION, this.getId(), objKeyValue, DEActions.REMOVE);
						// 中断当前操作
						return inheritMinorDataEntityRemove(arg0, iPSDEAction, this.getPSDataEntity(), iDynaInstRuntime, args);
					}
				}
			}
		}

		// 行为主状态控制检查
		if (iPSDEAction != null) {
			// 进行主状态控制
			checkDEMainState(arg0, iPSDEAction);
		}

		// 填充默认值
		if (iEntityBase != null && isEnableDefaultValueLogic()) {
			if (isFillEntityDefaultValues(strActionName, iPSDEAction)) {
				this.fillEntityDefaultValues(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			}

			if (isFillEntityFullInfo(strActionName, iPSDEAction)) {
				this.fillEntityFullInfo(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			}
		}

		// 判断是否进行实体主关系数据属性值处理，必须在检查值之前处理，关系中可能会定义映射聚合属性处理
		if (iEntityBase != null && isTranslateEntityNestedDERsBeforeProceed(strActionName, iPSDEAction)) {
			this.translateEntityNestedDERsBeforeProceed(iEntityBase, strActionName, iPSDEAction, this.getPSDataEntity(), iDynaInstRuntime, actionData);
		}

		
		// 判断是否做参数额外处理
		if (iEntityBase != null && isEnableActionParamLogic()) {
			if (iPSDEAction != null && iPSDEAction.isCustomParam()) {
				this.fillActionParams(iEntityBase, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			}
		}
		
		// 准备上一次的数据
		if (isPrepareLastBeforeProceed(strActionName, iPSDEAction)) {
			this.prepareLastBeforeProceed(arg0, strActionName, iPSDEAction, this.getPSDataEntity(), iDynaInstRuntime, actionData);
		}
		

		if (iPSDEAction != null && this.isEnableActionLogic(iPSDEAction, DEActionLogicAttachModes.PREPARE)) {// iPSDEAction.getPreparePSDEActionLogics()
//			if (iEntityBase != null) {
//				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.PREPARE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
//			} else {
//				// 主键模式暂时不支持
//			}
			this.executeActionLogics(args, null, iPSDEAction, DEActionLogicAttachModes.PREPARE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		}

		if (iEntityBase != null && isEnableDefaultValueLogic()) {
			if (isFillEntityDefaultValues(strActionName, iPSDEAction)) {
				this.fillEntitySequenceValues(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			}
		}

		// 主键
		if (iEntityBase != null && isEnableKeyValueLogic()) {
			if (isFillEntityKeyValue(strActionName, iPSDEAction)) {
				if (this.getUniTagPSDEField() != null && this.getUnionKeyValuePSDEFields() != null) {
					// if (!this.containsFieldValue(iEntityBase,
					// this.getUniTagPSDEField())) {
					if (true) { // 直接更新
						this.fillEntityKeyValue(iEntityBase);
						String strUniqueTag = (String) this.getFieldValue(iEntityBase, this.getUniTagPSDEField());
						if (StringUtils.hasLength(strUniqueTag)) {
							if (this.checkKeyState(strUniqueTag) != CheckKeyStates.OK) {
								throw new DataEntityRuntimeException(this, Errors.getErrorInfo(Errors.DUPLICATEDATA), Errors.DUPLICATEDATA);
							}
						}
					}
				}

				if (ObjectUtils.isEmpty(this.getFieldValue(iEntityBase, this.getKeyPSDEField()))) {
					if (fillEntityKeyValue(iEntityBase)) {
						Object objKeyValue = this.getFieldValue(iEntityBase, this.getKeyPSDEField());
						if (!ObjectUtils.isEmpty(objKeyValue)) {
							if (this.checkKeyState(objKeyValue) != CheckKeyStates.OK) {
								throw new DataEntityRuntimeException(this, Errors.getErrorInfo(Errors.DUPLICATEKEY), Errors.DUPLICATEKEY);
							}
						}
					}
				}
			}
		}
		
		Object versionData = null;
		if(this.isEnableVersionControl() && this.isCommitVersionBeforeProceed(strActionName, iPSDEAction)) {
			versionData = this.prepareVersionBeforeProceed(arg0, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}

		// 进行删除前检查
		if (isCheckReferenceBeforeRemove(strActionName, iPSDEAction)) {
			this.checkReferenceBeforeRemove(arg0, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}

		// 如需要执行后构建父路径，准备处理前数据
		if (isEnableBuildParentPath() && isBuildParentPathBeforeProceed(strActionName, iPSDEAction)) {
			this.buildParentPathBeforeProceed(arg0, strActionName, iPSDEAction, this.getPSDataEntity(), iDynaInstRuntime, actionData);
		}

		// 进行操作之前值校验
		if (iEntityBase != null && !actionSession.isIgnoreCheck() && isCheckEntityBeforeProceed(strActionName, iPSDEAction)) {
			this.checkEntityBeforeProceed(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			this.checkEntityNestedDERsBeforeProceed(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			if (this.isEnableDynaStorage()) {
				this.checkEntityDynaFieldsBeforeProceed(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			}
		}

		// 执行校验逻辑
		if (iPSDEAction != null && this.isEnableActionLogic(iPSDEAction, DEActionLogicAttachModes.CHECK)) {
//			if (iEntityBase != null) {
//				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.CHECK, iDynaInstDataEntityRuntime, iDynaInstRuntime, joinPoint);
//			} else {
//				this.executeActionLogics(arg0, iPSDEAction, DEActionLogicAttachModes.CHECK, iDynaInstDataEntityRuntime, iDynaInstRuntime, joinPoint);
//			}
			this.executeActionLogics(args, null, iPSDEAction, DEActionLogicAttachModes.CHECK, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		}

		// 执行审计前处理
		if (iEntityBase != null && this.isEnableDataAudit() && this.isAuditEntityBeforeProceed(strActionName, iPSDEAction)) {
			this.auditEntityBeforeProceed(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}

		// 执行前逻辑
		if (iPSDEAction != null && this.isEnableActionLogic(iPSDEAction, DEActionLogicAttachModes.BEFORE)) {
//			if (iEntityBase != null) {
//				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.BEFORE, iDynaInstDataEntityRuntime, iDynaInstRuntime, joinPoint);
//			} else {
//				this.executeActionLogics(arg0, iPSDEAction, DEActionLogicAttachModes.BEFORE, iDynaInstDataEntityRuntime, iDynaInstRuntime, joinPoint);
//			}
			this.executeActionLogics(args, null, iPSDEAction, DEActionLogicAttachModes.BEFORE, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		}

		// 进行值转换处理
		if (iEntityBase != null && this.isTranslateEntityBeforeProceed(strActionName, iPSDEAction)) {
			this.translateEntityBeforeProceed(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			if (this.isEnableDynaStorage()) {
				this.translateEntityDynaFieldsBeforeProceed(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			}
		}

		// 执行继承从实例关系
		if (iEntityBase != null && isEnableInheritLogic()) {
			if (isInheritMinor()) {
				// 判断当前行为是否为建立行为，如是需要先调用主实体
				if (this.isInheritMajorDataEntityCreate(strActionName, iPSDEAction)) {
					inheritMajorDataEntityCreateOrUpdate(iEntityBase, true, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
				} else if (this.isInheritMajorDataEntityUpdate(strActionName, iPSDEAction)) {
					inheritMajorDataEntityCreateOrUpdate(iEntityBase, false, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
				}
			}
		}

		// 重置引用数据的外键值
		if (isCheckReferenceBeforeRemove(strActionName, iPSDEAction)) {
			if (this.isEnableDynaStorage()) {
				this.removeEntityDynaFieldsBeforeRemove(arg0, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			}
			this.resetReferenceBeforeRemove(arg0, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			this.removeReferenceBeforeRemove(arg0, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}
		
		if(versionData!=null) {
			versionData = this.commitVersionBeforeProceed(arg0, versionData, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}

		Object objRet = null;
		IDEActionPluginRuntime iDEActionPluginRuntime = this.getDEActionPluginRuntime(iPSDEAction);
		if (joinPoint != null && iDEActionPluginRuntime == null) {
			// 标准执行
			objRet = joinPoint.proceed();
		} else {
			if (iDEActionPluginRuntime == null) {
				objRet = onExecuteActionReal(strActionName, iPSDEAction, args, actionData);
			} else {
				objRet = iDEActionPluginRuntime.execute(this.getDataEntityRuntimeContext(), iPSDEAction, args, actionData);
			}
		}

		if (isEnableExecutePredefinedAction() && iDEActionPluginRuntime == null) {
			// 其它执行
			if (iPSDEWF != null && DEActions.WFSTART.equalsIgnoreCase(strActionName)) {
				IPSDEWF actionPSDEWF = iPSDEWF;
				if (args.length >= 2 && (args[1] instanceof IPSDEWF)) {
					actionPSDEWF = (IPSDEWF) args[1];
				}
				this.onWFStart(arg0, iPSDEAction, actionPSDEWF, iDynaInstRuntime, joinPoint);
			} else if (iPSDEWF != null && DEActions.WFCANCEL.equalsIgnoreCase(strActionName)) {
				IPSDEWF ActionPSDEWF = iPSDEWF;
				if (args.length >= 2 && (args[1] instanceof IPSDEWF)) {
					iPSDEWF = (IPSDEWF) args[1];
				}
				this.onWFCancel(arg0, iPSDEAction, ActionPSDEWF, iDynaInstRuntime, joinPoint);
			} else if (iEntityBase != null && iPSDEAction != null) {
				if (DEActionTypes.DELOGIC.equals(iPSDEAction.getActionType())) {
					IPSDELogicAction iPSDELogicAction = (IPSDELogicAction) iPSDEAction;
					objRet = this.executeDELogic(iEntityBase, iPSDEAction, iPSDELogicAction.getPSDELogic(), iDynaInstRuntime, joinPoint);
				} else if (DEActionTypes.SCRIPT.equals(iPSDEAction.getActionType())) {
					IPSDEScriptAction iPSDEScriptAction = (IPSDEScriptAction) iPSDEAction;
					objRet = this.executeDEScriptLogic(iEntityBase, iPSDEScriptAction, null, iDynaInstRuntime, joinPoint);
				}
			}
		}
		
//		if(this.isEnableVersionControl() && this.isCommitVersionAfterProceed(strActionName, iPSDEAction)) {
//			this.commitVersionAfterProceed(arg0, objRet, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
//		}

		// 判断是否进行实体主关系数据属性值处理
		if ((iEntityBase != null || objRet instanceof IEntityBase) && !actionSession.isIgnoreTranslateEntityNestedDERsAfterProceed() && isTranslateEntityNestedDERsAfterProceed(strActionName, iPSDEAction)) {
			if (objRet instanceof IEntityBase) {
				this.translateEntityNestedDERsAfterProceed((IEntityBase)objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
			} else if (iEntityBase != null) {
				this.translateEntityNestedDERsAfterProceed(iEntityBase, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}

		// 更新进行值校验
		if (iEntityBase != null && !actionSession.isIgnoreCheck() && isCheckEntityAfterProceed(strActionName, iPSDEAction)) {
			this.checkEntityAfterProceed(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}

		// 构建父路径
		if (this.isEnableBuildParentPath() && this.isBuildParentPathAfterProceed(strActionName, iPSDEAction)) {
			this.buildParentPathAfterProceed(arg0, objRet, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}
		
		// 进行值转换处理
		if (this.isTranslateEntityAfterProceed(strActionName, iPSDEAction)) {
			if (this.isEnableDynaStorage()) {
				this.translateEntityDynaFieldsAfterProceed(arg0, objRet, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
			}
			this.translateEntityAfterProceed(arg0, objRet, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}

		if (iEntityBase != null && this.isEnableEntityOnChangeLogic() && isExecuteEntityOnChangeLogic(strActionName, iPSDEAction)) {
			this.executeEntityOnChangeLogic(iEntityBase, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}
		
		if (this.isEnableDataAudit() && this.isAuditEntityAfterProceed(strActionName, iPSDEAction)) {
			this.auditEntityAfterProceed(arg0, objRet, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
		}

		// 登记或注销工作流工作
		if (iPSDEWF != null) {
			if (this.isWFRegisterEntityAfterProceed(strActionName, iPSDEAction)) {
				this.onWFRegister(arg0, iPSDEAction, iPSDEWF, iDynaInstRuntime, actionData);
			} else if (this.isWFUnregisterEntityAfterProceed(strActionName, iPSDEAction)) {
				this.onWFUnregister(arg0, iPSDEAction, iPSDEWF, iDynaInstRuntime, actionData);
			} else if (this.isFillWFTagAfterProceed(strActionName, iPSDEAction)) {
				this.onFillWFTag(arg0, iPSDEAction, iPSDEWF, iDynaInstRuntime, objRet);
			}
		}

		// 进行索引数据处理
		if (this.isEnableIndexLogic()) {
			if (this.isIndexMinor()) {
				if (iEntityBase != null && isIndexMajorDataEntityCreate(strActionName, iPSDEAction)) {
					indexMajorDataEntityCreateOrUpdate(iEntityBase, true, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
				} else if (iEntityBase != null && isIndexMajorDataEntityUpdate(strActionName, iPSDEAction)) {
					indexMajorDataEntityCreateOrUpdate(iEntityBase, false, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
				} else if (isIndexMajorDataEntityRemove(strActionName, iPSDEAction)) {
					indexMajorDataEntityRemove(arg0, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
				}
			}
		}

		// 放入后续异步处理队列
		if (this.isEnableDTSQueue() && this.getDefaultPSDEDTSQueue() != null) {
			if (isPushDTSQueueAfterProceed(strActionName, iPSDEAction)) {
				this.pushDTSQueueAfterProceed(arg0, objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
			}
		}

		if (isEnableInheritLogic()) {
			// 继承逻辑后续处理
			if (this.isInheritMajor()) {

			} else if (this.isInheritMinor()) {
				if (this.isInheritMajorDataEntityRemove(strActionName, iPSDEAction)) {
					inheritMajorDataEntityRemove(arg0, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, joinPoint);
				}
			}
		}

		// 执行后逻辑
		if (iPSDEAction != null && this.isEnableActionLogic(iPSDEAction, DEActionLogicAttachModes.AFTER)) {
//			if (objRet != null && objRet instanceof IEntityBase) {
//				this.executeActionLogics((IEntityBase) objRet, iPSDEAction, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, joinPoint);
//			} else if (iEntityBase != null) {
//				this.executeActionLogics(iEntityBase, iPSDEAction, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, joinPoint);
//			} else {
//				this.executeActionLogics(arg0, iPSDEAction, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, joinPoint);
//			}
			objRet = this.executeActionLogics(args, objRet, iPSDEAction, DEActionLogicAttachModes.AFTER, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		}

		// 执行数据同步
		if (this.isEnableDataSync()) {
			int nDataSyncEvent = this.getDataSyncEvent(strActionName, iPSDEAction);
			if (nDataSyncEvent != DEDataSyncEvents.NONE) {
				this.syncEntityAfterProceed(nDataSyncEvent, arg0, objRet, strActionName, iPSDEAction, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
			}
		}

		//
		// // 执行数据通知
		// if (this.isEnableNotify()) {
		// this.notifyEntityAfterProceed(arg0, objRet, strActionName,
		// iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
		// }

		return objRet;
	}

	protected Object onExecuteActionReal(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		IDEActionRuntime iDEActionRuntime = getDEActionRuntime(iPSDEAction);
		if (iDEActionRuntime != null && iDEActionRuntime.isValid(args)) {
			return iDEActionRuntime.execute(args);
		}

		if (iPSDEAction != null && iPSDEAction.isAsyncAction()) {
			IPSDEAction realPSDEAction = iPSDEAction.getRealPSDEAction();
			if (realPSDEAction != null) {
//				return this.getSystemRuntime().asyncExecute(new INamedAction() {
//
//					@Override
//					public Object execute(Object[] args) throws Throwable {
//						return executeAction(realPSDEAction.getName(), realPSDEAction, args);
//					}
//
//					@Override
//					public String getName() {
//						if (StringUtils.hasLength(realPSDEAction.getLogicName())) {
//							return realPSDEAction.getLogicName();
//						}
//						return realPSDEAction.getName();
//					}
//				}, args, null);
				return this.doExecuteAsyncAction(strActionName, iPSDEAction, realPSDEAction, args, actionData, null);
			}
		}

		return this.onExecuteActionUnknown(strActionName, iPSDEAction, args, actionData);
	}
	
	protected Object doExecuteAsyncAction(String strActionName, IPSDEAction iPSDEAction, IPSDEAction realPSDEAction, Object[] args, Object actionData, Object asyncTag) throws Throwable {
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
		}, args, asyncTag);
	}
	
	protected Object onExecuteActionUnknown(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		return null;
	}

	protected boolean isEnableExecutePredefinedAction() {
		return true;
	}

	/**
	 * 获取运行时的数据库类型
	 *
	 * @return
	 */
	protected String getDBType() {
		return DBTypes.MYSQL5;
	}

	@Override
	public boolean isInheritMajor() {
		return this.bInheritMajor;
	}

	@Override
	public boolean isInheritMinor() {
		return this.bInheritMinor;
	}

	@Override
	public boolean isIndexMajor() {
		return this.bIndexMajor;
	}

	@Override
	public boolean isIndexMinor() {
		return this.bIndexMinor;
	}

	protected boolean isEnableKeyValueLogic() {
		if (this.getStorageMode() == DEStorageModes.SERVICEAPI) {
			return false;
		}
		return true;
	}

	protected boolean isEnableDefaultValueLogic() {
		// if(this.getStorageMode() == DEStorageModes.SERVICEAPI) {
		// return false;
		// }
		return true;
	}

	protected boolean isEnableActionParamLogic() {
		return true;
	}

	protected boolean isEnableDataSetParamLogic() {
		return true;
	}

	protected boolean isEnableDataAudit() {
		return this.nDataAuditMode != DEDataAuditModes.NONE;
	}

	protected boolean isEnableVersionControl() {
		return false;
	}
	
	protected boolean isEnableDynaStorage() {
		return this.bEnableDynaStorage;
	}

	@Override
	public int getDataAuditMode() {
		prepare();
		return this.nDataAuditMode;
	}

	@Override
	public int getDataAccCtrlMode() {
		prepare();
		return this.nDataAccCtrlMode;
	}

	/**
	 * 是否启用继承逻辑处理
	 *
	 * @return
	 */
	protected boolean isEnableInheritLogic() {
		if (this.isInheritMajor() || this.isInheritMinor()) {
			return true;
		}
		return false;
	}

	/**
	 * 是否启用索引逻辑处理
	 *
	 * @return
	 */
	protected boolean isEnableIndexLogic() {
		// if (this.isIndexMajor() || this.isIndexMinor()) {
		// return true;
		// }
		// return false;
		return true;
	}

	/**
	 * 是否启用数据同步逻辑处理
	 *
	 * @return
	 */
	protected boolean isEnableDataSync() {
		return true;
	}

	/**
	 * 是否启用异步处理队列
	 *
	 * @return
	 */
	protected boolean isEnableDTSQueue() {

		return true;
	}

	// /**
	// * 是否启用通知逻辑处理
	// *
	// * @return
	// */
	// protected boolean isEnableNotify() {
	// return true;
	// }

	/**
	 * 是否支持数据对象变更逻辑
	 * 
	 * @return
	 */
	protected boolean isEnableEntityOnChangeLogic() {
		return this.bEnableEntityOnChangeLogic || !ObjectUtils.isEmpty(this.dataEntityOnChangeLogicSet);
	}
	
	

	/**
	 * 是否支持支持数据对象变更逻辑
	 * 
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	protected boolean isExecuteEntityOnChangeLogic(String strActionName, IPSDEAction iPSDEAction) {

		if (iPSDEAction != null) {
			if (DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	/**
	 * 执行数据对象变更逻辑
	 * 
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected void executeEntityOnChangeLogic(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		IEntityBase lastEntity = this.getLastEntity();
		if (lastEntity == null) {
			log.warn(String.format("未定义上一次的数据，忽略执行实体变更逻辑"));
			return;
		}

		String strActionMode = (iPSDEAction != null) ? iPSDEAction.getActionMode() : strActionName;
		
		List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if(!ObjectUtils.isEmpty(psDEFields)) {
			
			for (IPSDEField iPSDEField : psDEFields) {
				IPSDEFLogic iPSDEFLogic = iPSDEField.getOnChangePSDEFLogic();
				if (iPSDEFLogic == null) {
					continue;
				}

				// 判断数据是否变化
				if (!this.containsFieldValue(arg0, iPSDEField)) {
					continue;
				}

				Object value = this.getFieldValue(arg0, iPSDEField);
				Object last = this.getFieldValue(lastEntity, iPSDEField);
				if (DataTypeUtils.isStringDataType(iPSDEField.getStdDataType())) {
					if (value != null) {
						if (DataTypeUtils.asSimple(value) == null) {
							value = JsonUtils.toString(value);
						}
					}
					if (last != null) {
						if (DataTypeUtils.asSimple(last) == null) {
							last = JsonUtils.toString(last);
						}
					}
				}

				if (DataTypeUtils.compare(iPSDEField.getStdDataType(), value, last) == 0) {
					continue;
				}

				IDELogicRuntime iDELogicRuntime = this.getDELogicRuntime(iPSDEFLogic);
				iDELogicRuntime.execute(new Object[] { arg0, strActionMode, iPSDEField, iPSDEAction});
			}
		}
		
		final Set<IDataEntityOnChangeLogic> dataEntityOnChangeLogicSet = this.dataEntityOnChangeLogicSet;
		if(!ObjectUtils.isEmpty(dataEntityOnChangeLogicSet)) {
			for(IDataEntityOnChangeLogic iDataEntityOnChangeLogic : dataEntityOnChangeLogicSet) {
				Executor executor = iDataEntityOnChangeLogic.getExecutor();
				if(executor != null) {
					executor.execute(new Runnable() {
						@Override
						public void run() {
							try {
								iDataEntityOnChangeLogic.execute(getSelf(), arg0, lastEntity, strActionMode, iPSDEAction);
							}
							catch (Throwable ex) {
								log.error(ex);
							}
						}
					});
				}
				else {
					try {
						iDataEntityOnChangeLogic.execute(getSelf(), arg0, lastEntity, strActionMode, iPSDEAction);
					}
					catch (Throwable ex) {
						log.error(ex);
					}
				}
			}
		}
	}

	/**
	 * 获取实体的继承关系
	 *
	 * @return
	 */
	@Override
	public IPSDERInherit getPSDERInherit() {
		prepare();
		return this.iPSDERInherit;
	}

	/**
	 * 获取继承实体的运行时对象
	 *
	 * @return
	 * @throws Exception
	 */
	@Override
	public IDataEntityRuntime getInheritDataEntityRuntime() {

		if (this.inheritDataEntityRuntime != null || this.getPSDERInherit() == null) {
			return this.inheritDataEntityRuntime;
		}

		IPSDataEntity inheritPSDataEntity = this.getPSDERInherit().getMajorPSDataEntityMust();

		this.inheritDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(inheritPSDataEntity.getDynaModelFilePath());
		return this.inheritDataEntityRuntime;
	}

	/**
	 * 继承实体建立操作
	 */
	protected void inheritMajorDataEntityCreateOrUpdate(IEntityBase arg0, boolean bCreate, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		IDataEntityRuntime inheritDataEntityRuntime = getInheritDataEntityRuntime();
		if (inheritDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("继承实体运行时对象无效"));
		}

		IEntityBase objInherit = inheritDataEntityRuntime.createEntity();
		Object objKeyValue = this.getFieldValue(arg0, this.getKeyPSDEField());
		if (objKeyValue != null) {
			inheritDataEntityRuntime.setFieldValue(objInherit, inheritDataEntityRuntime.getKeyPSDEField(), objKeyValue);
		} else {
			if (!bCreate) {
				throw new DataEntityRuntimeException(this, String.format("更新数据没有传入键值"));
			}
		}

		if (this.getMajorPSDEField() != null) {
			Object objMajorValue = this.getFieldValue(arg0, this.getMajorPSDEField());
			if (objMajorValue != null) {
				if (inheritDataEntityRuntime.getMajorPSDEField() != null) {
					inheritDataEntityRuntime.setFieldValue(objInherit, inheritDataEntityRuntime.getMajorPSDEField(), objMajorValue);
				}
			}
		}

		// 复制其它属性
		List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields != null) {
			for (IPSDEField iPSDEField : psDEFields) {
				if (!iPSDEField.isInheritDEField()) {
					continue;
				}

				IPSInheritDEField iPSInheritDEField = (IPSInheritDEField) iPSDEField;
				if (this.containsFieldValue(arg0, iPSInheritDEField)) {
					Object objValue = this.getFieldValue(arg0, iPSInheritDEField);
					inheritDataEntityRuntime.setFieldValue(objInherit, iPSInheritDEField.getRelatedPSDEField(), objValue);
				}

				if (iPSInheritDEField.getRelatedPSDEField().isDataTypeDEField()) {
					// 强行设置继承类型
					if (StringUtils.hasLength(this.getPSDERInherit().getTypeValue())) {
						Object objValue = this.getSystemRuntime().convertValue(iPSInheritDEField.getRelatedPSDEField().getStdDataType(), this.getPSDERInherit().getTypeValue());
						inheritDataEntityRuntime.setFieldValue(objInherit, iPSInheritDEField.getRelatedPSDEField(), objValue);
					}
				}
			}
		}

		Object[] args = new Object[1];
		args[0] = objInherit;
		if (bCreate) {

			if (actionSession.registerRecursion(RECURSION_INHERITACTION, inheritDataEntityRuntime.getId(), objKeyValue, DEActions.CREATE)) {
				inheritDataEntityRuntime.executeAction(DEActions.CREATE, inheritDataEntityRuntime.getPSDEAction(DEActions.CREATE), args);
				actionSession.unregisterRecursion(RECURSION_INHERITACTION, inheritDataEntityRuntime.getId(), objKeyValue, DEActions.CREATE);
			} else {
				throw new DataEntityRuntimeException(this, String.format("继承主实体正在建立当前数据"));
			}

			// 设置回主键
			objKeyValue = inheritDataEntityRuntime.getFieldValue(objInherit, inheritDataEntityRuntime.getKeyPSDEField());
			if (objKeyValue == null) {
				throw new DataEntityRuntimeException(inheritDataEntityRuntime, String.format("建立数据没有返回键值"));
			}

			this.setFieldValue(arg0, this.getKeyPSDEField(), objKeyValue);

		} else {
			if (actionSession.registerRecursion(RECURSION_INHERITACTION, inheritDataEntityRuntime.getId(), objKeyValue, DEActions.UPDATE)) {
				inheritDataEntityRuntime.executeAction(DEActions.UPDATE, inheritDataEntityRuntime.getPSDEAction(DEActions.UPDATE), args);
				actionSession.unregisterRecursion(RECURSION_INHERITACTION, inheritDataEntityRuntime.getId(), objKeyValue, DEActions.UPDATE);
			} else {
				throw new DataEntityRuntimeException(this, String.format("继承主实体正在更新当前数据"));
			}

		}

	}

	/**
	 * 继承主实体删除操作
	 */
	protected void inheritMajorDataEntityRemove(Object arg0, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		IDataEntityRuntime inheritDataEntityRuntime = getInheritDataEntityRuntime();
		if (inheritDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("继承实体运行时对象无效"));
		}

		Object objInherit = null;
		Object objKeyValue = null;
		if (arg0 instanceof IEntityBase) {
			objInherit = inheritDataEntityRuntime.createEntity();
			objKeyValue = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
			if (objKeyValue != null) {
				inheritDataEntityRuntime.setFieldValue((IEntityBase) objInherit, inheritDataEntityRuntime.getKeyPSDEField(), objKeyValue);
			} else {
				throw new DataEntityRuntimeException(this, String.format("删除数据没有传入键值"));
			}
		} else {
			objInherit = arg0;
			objKeyValue = arg0;
		}

		Object[] args = new Object[1];
		args[0] = objInherit;

		if (actionSession.registerRecursion(RECURSION_INHERITACTION, inheritDataEntityRuntime.getId(), objKeyValue, DEActions.REMOVE)) {
			inheritDataEntityRuntime.executeAction(DEActions.REMOVE, inheritDataEntityRuntime.getPSDEAction(DEActions.REMOVE), args);
			actionSession.unregisterRecursion(RECURSION_INHERITACTION, inheritDataEntityRuntime.getId(), objKeyValue, DEActions.REMOVE);
		} else {
			throw new DataEntityRuntimeException(this, String.format("继承主实体正在删除当前数据"));
		}
	}

	/**
	 * 继承从实体删除操作
	 */
	protected Object inheritMinorDataEntityRemove(Object arg0, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		// 查出数据
		IEntityBase objEntity = this.getLastEntity(arg0);
		Object objDataType = this.getFieldValue(objEntity, this.getDataTypePSDEField());
		if (objDataType == null) {
			throw new DataEntityRuntimeException(this, String.format("删除数据没有指定继承类型"));
		}

		IPSDERInherit removePSDERInherit = null;
		java.util.List<IPSDERBase> psDERBases = this.getPSDataEntity().getMajorPSDERs();
		if (psDERBases != null) {
			for (IPSDERBase iPSDERBase : psDERBases) {
				if (DERTypes.DERINHERIT.equals(iPSDERBase.getDERType())) {
					IPSDERInherit iPSDERInherit = (IPSDERInherit) iPSDERBase;
					if (objDataType.equals(this.getSystemRuntime().convertValue(this.getDataTypePSDEField().getStdDataType(), iPSDERInherit.getTypeValue()))) {
						removePSDERInherit = iPSDERInherit;
						break;
					}
				}
			}
		}

		if (removePSDERInherit == null) {
			throw new DataEntityRuntimeException(this, String.format("无法获取类型值[%1$s]的继承关系", objDataType));
		}

		IPSDataEntity minorPSDataEntity = removePSDERInherit.getMinorPSDataEntity();
		if (minorPSDataEntity == null) {
			throw new ModelException(removePSDERInherit, String.format("继承关系[%1$s]从实体无效", removePSDERInherit.getName()));
		}

		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getDynaModelFilePath());
		if (minorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("继承从实体[%1$s]运行时对象无效", minorPSDataEntity.getDynaModelFilePath()));
		}

		Object objMinor = null;
		Object objKeyValue = null;
		if (arg0 instanceof IEntityBase) {
			objMinor = minorDataEntityRuntime.createEntity();
			objKeyValue = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
			minorDataEntityRuntime.setFieldValue((IEntityBase) objMinor, minorDataEntityRuntime.getKeyPSDEField(), objKeyValue);
		} else {
			objMinor = arg0;
			objKeyValue = arg0;
		}

		Object[] args = new Object[1];
		args[0] = objMinor;

		return minorDataEntityRuntime.executeAction(DEActions.REMOVE, minorDataEntityRuntime.getPSDEAction(DEActions.REMOVE), args);

	}

	/**
	 * 索引主实体建立操作
	 *
	 * @param arg0
	 * @param bCreate
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void indexMajorDataEntityCreateOrUpdate(IEntityBase arg0, boolean bCreate, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// 枚举所有的索引关系
		java.util.List<IPSDERBase> psDERBases = this.getPSDataEntity().getMinorPSDERs();
		if (psDERBases != null) {
			for (IPSDERBase iPSDERBase : psDERBases) {
				if (DERTypes.DERINDEX.equals(iPSDERBase.getDERType())) {
					IPSDERIndex iPSDERIndex = (IPSDERIndex) iPSDERBase;
					this.indexMajorDataEntityCreateOrUpdate(arg0, bCreate, iPSDEAction, iPSDERIndex, iPSDataEntity, iDynaInstRuntime, actionData);
				}
			}
		}
	}

	protected void indexMajorDataEntityCreateOrUpdate(IEntityBase arg0, boolean bCreate, IPSDEAction iPSDEAction, IPSDERIndex iPSDERIndex, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		IPSDataEntity majorPSDataEntity = iPSDERIndex.getMajorPSDataEntity();
		if (majorPSDataEntity == null) {
			throw new ModelException(iPSDERIndex, String.format("索引关系[%1$s]主实体无效", iPSDERIndex.getName()));
		}

		IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(majorPSDataEntity.getDynaModelFilePath());
		if (majorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("索引主实体[%1$s]运行时对象无效", majorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKeyValue = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());

		// 检查数据主键状态
		int nCheckKeyState = majorDataEntityRuntime.checkKeyState(objKeyValue);
		if (nCheckKeyState == CheckKeyStates.DELETE) {
			throw new DataEntityRuntimeException(majorDataEntityRuntime, String.format("数据已经被删除"), Errors.DELETEDDATA);
		}

		IEntityBase objIndexMajor = majorDataEntityRuntime.createEntity();
		// 设置主键
		majorDataEntityRuntime.setFieldValue(objIndexMajor, majorDataEntityRuntime.getKeyPSDEField(), objKeyValue);
		// 设置主属性
		if (this.getMajorPSDEField() != null && majorDataEntityRuntime.getMajorPSDEField() != null) {
			if (this.containsFieldValue(arg0, this.getMajorPSDEField())) {
				majorDataEntityRuntime.setFieldValue(objIndexMajor, majorDataEntityRuntime.getMajorPSDEField(), this.getFieldValue(arg0, this.getMajorPSDEField()));
			}
		}
		// 设置类型
		if (majorDataEntityRuntime.getDataTypePSDEField() != null) {
			if (StringUtils.hasLength(iPSDERIndex.getTypeValue())) {
				Object objValue = this.getSystemRuntime().convertValue(majorDataEntityRuntime.getDataTypePSDEField().getStdDataType(), iPSDERIndex.getTypeValue());
				majorDataEntityRuntime.setFieldValue(objIndexMajor, majorDataEntityRuntime.getDataTypePSDEField(), objValue);
			}
		}

		List<IPSDERIndexDEFieldMap> psDERIndexDEFieldMaps = iPSDERIndex.getPSDERIndexDEFieldMaps();
		if (!ObjectUtils.isEmpty(psDERIndexDEFieldMaps)) {
			for (IPSDERIndexDEFieldMap iPSDERIndexDEFieldMap : psDERIndexDEFieldMaps) {
				if (iPSDERIndexDEFieldMap.getMajorPSDEField() == null) {
					continue;
				}
				if (iPSDERIndexDEFieldMap.getMinorPSDEField() != null) {
					// 拷贝属性
					if (this.containsFieldValue(arg0, iPSDERIndexDEFieldMap.getMinorPSDEField())) {
						majorDataEntityRuntime.setFieldValue(objIndexMajor, iPSDERIndexDEFieldMap.getMajorPSDEField(), this.getFieldValue(arg0, iPSDERIndexDEFieldMap.getMinorPSDEField()));
					}
				} else {
					majorDataEntityRuntime.setFieldValue(objIndexMajor, iPSDERIndexDEFieldMap.getMajorPSDEField(), DataTypeUtils.convert(iPSDERIndexDEFieldMap.getMajorPSDEField().getStdDataType(), iPSDERIndexDEFieldMap.getSrcValue()));
				}
			}
		}

		if (nCheckKeyState == CheckKeyStates.OK) {
			// 新建
			majorDataEntityRuntime.executeAction(DEActions.CREATE, majorDataEntityRuntime.getPSDEAction(DEActions.CREATE), new Object[] { objIndexMajor });
		} else {
			// 更新
			majorDataEntityRuntime.executeAction(DEActions.UPDATE, majorDataEntityRuntime.getPSDEAction(DEActions.UPDATE), new Object[] { objIndexMajor });
		}
	}

	/**
	 * 索引主实体删除操作
	 *
	 * @param arg0
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param joinPoint
	 * @throws Throwable
	 */
	protected void indexMajorDataEntityRemove(Object arg0, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// 枚举所有的索引关系
		java.util.List<IPSDERBase> psDERBases = this.getPSDataEntity().getMinorPSDERs();
		if (psDERBases != null) {
			for (IPSDERBase iPSDERBase : psDERBases) {
				if (DERTypes.DERINDEX.equals(iPSDERBase.getDERType())) {
					IPSDERIndex iPSDERIndex = (IPSDERIndex) iPSDERBase;
					this.indexMajorDataEntityRemove(arg0, iPSDEAction, iPSDERIndex, iPSDataEntity, iDynaInstRuntime, actionData);
				}
			}
		}
	}

	protected void indexMajorDataEntityRemove(Object arg0, IPSDEAction iPSDEAction, IPSDERIndex iPSDERIndex, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		IPSDataEntity majorPSDataEntity = iPSDERIndex.getMajorPSDataEntity();
		if (majorPSDataEntity == null) {
			throw new ModelException(iPSDERIndex, String.format("索引关系[%1$s]主实体无效", iPSDERIndex.getName()));
		}

		IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(majorPSDataEntity.getDynaModelFilePath());
		if (majorDataEntityRuntime == null) {
			throw new DataEntityRuntimeException(this, String.format("索引主实体[%1$s]运行时对象无效", majorPSDataEntity.getDynaModelFilePath()));
		}

		Object objKeyValue = null;
		if (arg0 instanceof IEntityBase) {
			objKeyValue = this.getFieldValue((IEntityBase) arg0, this.getKeyPSDEField());
		} else {
			objKeyValue = arg0;
		}

		// 检查数据主键状态
		int nCheckKeyState = majorDataEntityRuntime.checkKeyState(objKeyValue);
		if (nCheckKeyState == CheckKeyStates.DELETE) {
			return;
		}

		Object objIndexMajor = null;
		if (arg0 instanceof IEntity) {
			objIndexMajor = majorDataEntityRuntime.createEntity();
		} else {
			objIndexMajor = arg0;
		}

		if (nCheckKeyState == CheckKeyStates.EXIST) {
			// 删除
			majorDataEntityRuntime.executeAction(DEActions.REMOVE, majorDataEntityRuntime.getPSDEAction(DEActions.REMOVE), new Object[] { objIndexMajor });
		}
	}

	@Override
	public IDynaInstDataEntityRuntime createDynaInstDataEntityRuntime(IDynaInstRuntime iDynaInstRuntime) {

		Assert.notNull(iDynaInstRuntime, "实体动态实例运行时对象无效");

		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = createDynaInstDataEntityRuntime();
		try {
			iDynaInstDataEntityRuntime.init(iDynaInstRuntime, this.iDataEntityRuntimeContext);
		} catch (Exception e) {
			log.error(String.format("初始化实体动态实例运行时发生异常，%1$s", e.getMessage()), e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体动态实例运行时发生异常，%1$s", e.getMessage()), e);
		}
		return iDynaInstDataEntityRuntime;
	}

	protected IDynaInstDataEntityRuntime createDynaInstDataEntityRuntime() {
		return new DynaInstDataEntityRuntime();
	}

	@Override
	public String getUniTagValue(IEntityBase objEntity, List<IPSDEField> unionKeyValuePSDEFieldList) {

		this.prepare();

		Object[] values = new Object[unionKeyValuePSDEFieldList.size()];
		for (int i = 0; i < unionKeyValuePSDEFieldList.size(); i++) {
			values[i] = this.getFieldValue(objEntity, unionKeyValuePSDEFieldList.get(i));
		}

		String strUnionKeyMode = this.getUnionKeyMode();
		if (!StringUtils.hasLength(strUnionKeyMode) || DEUnionKeyMode.DIGEST.value.equalsIgnoreCase(strUnionKeyMode)) {
			return KeyValueUtils.genUniqueId(values);
		}

		if (DEUnionKeyMode.DELIMITER.value.equalsIgnoreCase(strUnionKeyMode)) {
			String strDelimiter = this.getUnionKeyParam();
			if (!StringUtils.hasLength(strDelimiter)) {
				strDelimiter = "-";
			}
			return StringUtils.arrayToDelimitedString(values, strDelimiter);
		}

		return KeyValueUtils.genUniqueId(values);
	}

	@Override
	public boolean fillEntityKeyValue(IEntityBase objEntity) {
		try {
			return this.onFillEntityKeyValue(objEntity);
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("填充数据对象键值发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected boolean onFillEntityKeyValue(IEntityBase objEntity) throws Throwable {

		if (!ObjectUtils.isEmpty(this.getUnionKeyValuePSDEFields()) && this.getUniTagPSDEField() != null && this.getUniTagPSDEField().isKeyDEField()) {
			String strUniqueTag = this.getUniTagValue(objEntity, this.getUnionKeyValuePSDEFields());
			if (StringUtils.hasLength(strUniqueTag)) {
				this.setFieldValue(objEntity, this.getUniTagPSDEField(), strUniqueTag);
				return true;
			}
		}

		if (DEFDataTypes.GUID.equals(this.getKeyPSDEField().getDataType())) {
			this.setFieldValue(objEntity, this.getKeyPSDEField(), KeyValueUtils.genUniqueId());
			return false;
		}

		if (this.isVirtual()) {
			if (this.getVirtualMode() == DEVirtualModes.MINHERIT) {
				IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDERMultiInherits().get(0).getMajorPSDataEntityMust().getId());
				IEntityBase majorEntity = majorDataEntityRuntime.createEntity();
				majorDataEntityRuntime.fillEntityKeyValue(majorEntity);
				this.setFieldValue(objEntity, this.getKeyPSDEField(), majorDataEntityRuntime.getFieldValue(majorEntity, majorDataEntityRuntime.getKeyPSDEField()));
				return false;
			}
		} else {

		}

		return false;
	}

	@Override
	public String getDynaInstId(Object objEntity) {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null && actionSession.getUserContext() != null) {
			return actionSession.getUserContext().getDynainstid();
		}

		return this.getUserContext().getDynainstid();
	}

	@Override
	public IPSDEDataSet getPSDEDataSet(String strName) {
		Assert.hasLength(strName, "传入数据集标识无效");
		prepare();
		return this.psDEDataSetMap.get(strName.toLowerCase());
	}

	@Override
	public IPSDEDataQuery getPSDEDataQuery(String strName) {
		Assert.hasLength(strName, "传入数据查询标识无效");
		prepare();
		return this.psDEDataQueryMap.get(strName.toLowerCase());
	}

	/**
	 * 是否支持自定义一对多关系
	 *
	 * @return
	 */
	protected boolean isEnableCustomizedDER1N() {
		return false;
	}

	@Override
	public void create(IEntityBase iEntityBase) throws Throwable {
		this.executeAction(DEActions.CREATE, null, new Object[] { iEntityBase });
	}

	@Override
	public void update(IEntityBase iEntityBase) throws Throwable {
		this.executeAction(DEActions.UPDATE, null, new Object[] { iEntityBase });
	}

	@Override
	public void sysUpdate(IEntityBase iEntityBase) throws Throwable {
		this.sysUpdate(iEntityBase, false);
	}

	@Override
	public void sysUpdate(IEntityBase iEntityBase, boolean bUpdateOnly) throws Throwable {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public void sysUpdate(IEntityBase[] entityBases, boolean bUpdateOnly) throws Throwable {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IEntityBase get(Object objKey) throws Throwable {
		Object objRet = this.executeAction(DEActions.GET, null, new Object[] { objKey });
		if (objRet instanceof IEntityBase) {
			return (IEntityBase) objRet;
		}
		return null;
	}

	@Override
	public void remove(Object objKey) throws Throwable {
		this.executeAction(DEActions.REMOVE, null, new Object[] { objKey });
	}

	@Override
	public void wfStart(IEntityBase iEntityBase, IPSDEWF iPSDEWF) throws Throwable {
		if (iPSDEWF == null) {
			this.executeAction(DEActions.WFSTART, null, new Object[] { iEntityBase });
		} else {
			this.executeAction(DEActions.WFSTART, null, new Object[] { iEntityBase, iPSDEWF });
		}
	}
	
	
	

	@Override
	public IEntityBase clone(IEntityBase iEntityBase, boolean bResetUncopyValues) throws Throwable {

		IEntityBase newEntityBase = this.createEntity();

		java.util.List<IPSDEField> psDEFields = iPSDataEntity.getAllPSDEFields();
		if (psDEFields != null) {

			for (IPSDEField iPSDEField : psDEFields) {
				if (bResetUncopyValues) {
					if (iPSDEField.isKeyDEField() || iPSDEField.isUniTagField() || iPSDEField.isPasteReset()) {
						continue;
					}
				}
				this.setFieldValue(newEntityBase, iPSDEField, this.getFieldValue(iEntityBase, iPSDEField));
			}
		}
		return newEntityBase;
	}

	@Override
	public String getFieldQueryExp(String strFieldName) {
		prepare();
		return this.deFieldQueryExpMap.get(strFieldName.toUpperCase());
	}

	@Override
	public String getFieldQueryExp(IPSDEField iPSDEField) {
		return this.getFieldQueryExp(iPSDEField.getName());
	}

	@Override
	public boolean isEnableWF() {
		return this.getDefaultPSDEWF() != null;
	}

	@Override
	public boolean testDataInWF(IEntityBase iEntityBase) {
		try {
			if (this.objEntityWFState == null || this.getDefaultPSDEWF() == null || this.getUDStatePSDEField() == null) {
				if (this.getDefaultPSDEWF() != null) {
					this.getSystemRuntime().log(LogLevels.WARN, LogCats.DEWF, String.format("实体[%1$s]未指定业务状态属性或流程中状态，无法判断数据是否在流程中", this.getName()), null);
				}
				return false;
			}
			Object objValue = null;
			if (this.containsFieldValue(iEntityBase, this.getUDStatePSDEField())) {
				objValue = this.getFieldValue(iEntityBase, this.getUDStatePSDEField());
			} else {
				IEntityBase simpleEntityBase = this.getSimpleEntity(this.getFieldValue(iEntityBase, this.getKeyPSDEField()));
				objValue = this.getFieldValue(simpleEntityBase, this.getUDStatePSDEField());
			}

			return this.getSystemRuntime().testValueCond(objValue, Conditions.EQ, this.objEntityWFState, this.getUDStatePSDEField().getStdDataType());

		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("计算数据是否在流程中发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public void outputReport(String strReportId, OutputStream outputStream, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable {
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

			onOutputReport(strReportId, outputStream, iSearchContextBase, strType, bTestPriv);
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

	protected void onOutputReport(String strReportId, OutputStream outputStream, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable {
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
					iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		IDEReportRuntime iDEReportRuntime = null;
		if (iDynaInstDataEntityRuntime != null) {
			iDEReportRuntime = iDynaInstDataEntityRuntime.getDEReportRuntime(strReportId);
		} else {
			iDEReportRuntime = this.getDEReportRuntime(strReportId);
		}

		iDEReportRuntime.output(outputStream, iSearchContextBase, strType, bTestPriv);
	}

	@Override
	public void outputPrint(String strPrintId, OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
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

			onOutputPrint(strPrintId, outputStream, keys, strType, bTestPriv);

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

	protected void onOutputPrint(String strPrintId, OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
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
					iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		IDEPrintRuntime iDEPrintRuntime = null;
		if (iDynaInstDataEntityRuntime != null) {
			iDEPrintRuntime = iDynaInstDataEntityRuntime.getDEPrintRuntime(strPrintId);
		} else {
			iDEPrintRuntime = this.getDEPrintRuntime(strPrintId);
		}

		iDEPrintRuntime.output(outputStream, keys, strType, bTestPriv);
	}

	@Override
	public Map<Integer, EntityError> importData(String strImportTag, IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
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

			Map<Integer, EntityError> ret = this.onImportData(strImportTag, baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);

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

	protected Map<Integer, EntityError> onImportData(String strImportTag, IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
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
					iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		IDEDataImportRuntime iDEDataImportRuntime = null;
		if (iDynaInstDataEntityRuntime != null) {
			iDEDataImportRuntime = iDynaInstDataEntityRuntime.getDEDataImportRuntime(strImportTag);
		} else {
			iDEDataImportRuntime = this.getDEDataImportRuntime(strImportTag);
		}

		return iDEDataImportRuntime.importStream(baseEntity, inputStream, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	@Override
	public void exportData(String strExportTag, Object objData, OutputStream outputStream) throws Throwable {
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

			actionSession.beginLog(this.getName(), String.format("导出数据[%1$s]", strExportTag));

			this.onExportData(strExportTag, objData, outputStream);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);
			IActionSessionLog iActionSessionLog = actionSession.endLog(null);
			if (bOpenActionSession) {
				if (iActionSessionLog != null) {
					if (iActionSessionLog.getTime() >= ActionSessionManager.getExportDataLogPOTime()) {
						this.getSystemRuntime().logPO(ISystemRuntime.LOGLEVEL_WARN, LogCats.PO_DEDATAEXP, iActionSessionLog.toString(true), this.getName(), String.format("导出数据[%1$s]", strExportTag), iActionSessionLog.getTime(), iActionSessionLog);
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
					String strInfo = String.format("实体[%1$s]数据导出[%2$s]发生异常，%3$s\r\n%4$s", this.getName(), strExportTag, ex.getMessage(), iActionSessionLog.toObjectNode().toString());
					this.getSystemRuntime().log(LogLevels.ERROR, LogCats.DEDATAEXP, strInfo, ex);
				}

				ActionSessionManager.closeSession(false);
			}
			throw ex;
		} finally {
			this.pollDataSource();
		}
	}

	protected void onExportData(String strExportTag, Object objData, OutputStream outputStream) throws Throwable {
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
					iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
				}
			}
		}
		IDEDataExportRuntime iDEDataExportRuntime = null;
		if (iDynaInstDataEntityRuntime != null) {
			iDEDataExportRuntime = iDynaInstDataEntityRuntime.getDEDataExportRuntime(strExportTag);
		} else {
			iDEDataExportRuntime = this.getDEDataExportRuntime(strExportTag);
		}

		iDEDataExportRuntime.exportStream(objData, outputStream);
	}

	
	@Override
	public IPSDEField getPSDEFieldByPredefinedType(PredefinedFieldType predefinedFieldType, boolean bTryMode) {
		return this.getPSDEFieldByPredefinedType(predefinedFieldType.value, bTryMode);
	}
	
	@Override
	public IPSDEField getPSDEFieldByPredefinedType(String strPredefinedType, boolean bTryMode) {
		this.prepare();
		IPSDEField iPSDEField = this.predefinedPSDEFieldMap.get(strPredefinedType);
		if (iPSDEField != null || bTryMode) {
			return iPSDEField;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定预定义类型[%1$s]属性", strPredefinedType));
	}
	
	@Override
	public IPSDEField getPSDEFieldByTag(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag, "未传入属性标记");
		this.prepare();
		IPSDEField iPSDEField = (this.tagPSDEFieldMap == null)?null: this.tagPSDEFieldMap.get(strTag.toUpperCase());
		if(iPSDEField == null) {
			iPSDEField = this.getPSDEField(strTag);
		}
		if (iPSDEField != null || bTryMode) {
			return iPSDEField;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定标记[%1$s]属性", strTag));
	}
	
	@Override
	public IPSDEAction getPSDEActionByTag(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag, "未传入行为标记");
		this.prepare();
		try {
			List<IPSDEAction> list = this.getPSDataEntity().getAllPSDEActions();
			if(!ObjectUtils.isEmpty(list)) {
				for(IPSDEAction iPSDEAction : list) {
					String strActionTag = iPSDEAction.getActionTag();
					if(StringUtils.hasLength(strActionTag)) {
						if(strActionTag.equalsIgnoreCase(strTag)) {
							return iPSDEAction;
						}
					}
				}
			}
		} catch (Exception ex) {
			log.error(ex);
		}
		
		IPSDEAction iPSDEAction = this.getPSDEAction(strTag);
		if (iPSDEAction != null || bTryMode) {
			return iPSDEAction;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定标记[%1$s]行为", strTag));
	}
	
	@Override
	public IPSDEDataSet getPSDEDataSetByTag(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag, "未传入数据集标记");
		this.prepare();
		try {
			List<IPSDEDataSet> list = this.getPSDataEntity().getAllPSDEDataSets();
			if(!ObjectUtils.isEmpty(list)) {
				for(IPSDEDataSet iPSDEDataSet : list) {
					String strDataSetTag = iPSDEDataSet.getDataSetTag();
					if(StringUtils.hasLength(strDataSetTag)) {
						if(strDataSetTag.equalsIgnoreCase(strTag)) {
							return iPSDEDataSet;
						}
					}
				}
			}
		} catch (Exception ex) {
			log.error(ex);
		}
		
		IPSDEDataSet iPSDEDataSet = this.getPSDEDataSet(strTag);
		if (iPSDEDataSet != null || bTryMode) {
			return iPSDEDataSet;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定标记[%1$s]数据集", strTag));
	}

	@Override
	public boolean isEnableLogicValid() {
		this.prepare();
		return this.bEnableLogicValid;
	}

	@Override
	public Object getValidLogicValue() {
		this.prepare();
		return this.logicValidValue;
	}

	@Override
	public Object getInvalidLogicValue() {
		this.prepare();
		return this.logicInvalidValue;
	}

	@Override
	public IPSDEField getLogicValidPSDEField() {
		this.prepare();
		return this.logicValidPSDEField;
	}

	@Override
	public boolean isVirtual() {
		this.prepare();
		return this.bVirtual;
	}

	@Override
	public int getVirtualMode() {
		this.prepare();
		return this.nVirtualMode;
	}

	@Override
	public java.util.List<IPSDERMultiInherit> getPSDERMultiInherits() {
		this.prepare();
		if (this.psDERMultiInheritList == null || this.psDERMultiInheritList.size() == 0) {
			return null;
		}
		return this.psDERMultiInheritList;
	}

	@Override
	public IPSDERBase getMasterPSDER(String strDEIdOrName, boolean bTryMode) {
		this.prepare();
		IPSDERBase iPSDERBase = null;
		if (this.masterPSDERMap != null) {
			iPSDERBase = this.masterPSDERMap.get(strDEIdOrName);
		}
		if (iPSDERBase != null || bTryMode) {
			return iPSDERBase;
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取指定实体[%1$s]访问控制关系", strDEIdOrName));
	}

	@Override
	public IPSDERBase getMasterPSDER(IEntityBase iEntityBase, boolean bTryMode) {
		this.prepare();
		final List<IPSDERBase> masterPSDERList = this.getMasterPSDERs();
		if (!ObjectUtils.isEmpty(masterPSDERList)) {
			for (IPSDERBase iPSDERBase : masterPSDERList) {
				IPSDEField pickupPSDEField = null;
				if (iPSDERBase instanceof IPSDER1N) {
					pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEField();
				} else if (iPSDERBase instanceof IPSDERCustom) {
					pickupPSDEField = ((IPSDERCustom) iPSDERBase).getPickupPSDEField();
					IPSDEField parentTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, true);
					if(parentTypePSDEField!= null){
						String strDERParentType = ((IPSDERCustom) iPSDERBase).getParentType();
						if(!StringUtils.hasLength(strDERParentType)) {
							//strDERParentType = iPSDERBase.getMajorPSDataEntity().getName();
							strDERParentType = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntity().getId(), false).getDERParentType();
						}
						String parentType = (String)this.getFieldValue(iEntityBase, parentTypePSDEField);
						if(!strDERParentType.equalsIgnoreCase(parentType)){
							continue;
						}
						IPSDEField parentSubTypePSDEField = this.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
						if(parentSubTypePSDEField!= null) {
							String parentSubType = (String) this.getFieldValue(iEntityBase, parentSubTypePSDEField);
							if (StringUtils.hasLength(parentSubType)) {
								String strDERParentSubType = ((IPSDERCustom) iPSDERBase).getParentSubType();
								if(!StringUtils.hasLength(strDERParentSubType)) {
									strDERParentSubType = iPSDERBase.getMinorCodeName();
								}
								if(!parentSubType.equals(strDERParentSubType)) {
									continue;
								}
							}
						}
					}
				}
				if (pickupPSDEField != null) {
					Object objValue = this.getFieldValue(iEntityBase, pickupPSDEField);
					if (objValue != null) {
						return iPSDERBase;
					}
				}
			}
		}

		if (bTryMode) {
			return null;
		}

		throw new DataEntityRuntimeException(this, String.format("无法获取指定数据访问控制关系"));
	}
	
	@Override
	public List<IPSDERBase> getMasterPSDERs() {
		this.prepare();
		if (this.masterPSDERList == null || this.masterPSDERList.size() == 0) {
			return null;
		}
		return this.masterPSDERList;
	}

	@Override
	public List<IPSDERBase> getNotifyPSDERs() {
		this.prepare();
		if (this.notifyPSDERList == null || this.notifyPSDERList.size() == 0) {
			return null;
		}
		return this.notifyPSDERList;
	}

	@Override
	public List<IPSDER1NBase> getClonePSDER1Ns() {
		this.prepare();
		return this.clonePSDER1NList;
	}
	
	@Override
	public List<IPSDERBase> getMasterPSDERs(boolean bIncludeInherit) {
		this.prepare();
		final IDataEntityRuntime inheritDataEntityRuntime = bIncludeInherit?this.getInheritDataEntityRuntime():null; 
		if(inheritDataEntityRuntime == null) {
			if (this.masterPSDERList == null || this.masterPSDERList.size() == 0) {
				return null;
			}
			return this.masterPSDERList;
		}
		else {
			if(this.allMasterPSDERList == null) {
				List<IPSDERBase> list = new ArrayList<IPSDERBase>();
				List<IPSDERBase> list2 = this.getMasterPSDERs(false);
				if(!ObjectUtils.isEmpty(list2)) {
					list.addAll(list2);
				}
				List<IPSDERBase> list3 = inheritDataEntityRuntime.getMasterPSDERs(true);
				if(!ObjectUtils.isEmpty(list3)) {
					list.addAll(list3);
				}
				this.allMasterPSDERList = Collections.unmodifiableList(list);
			}
			if(ObjectUtils.isEmpty(this.allMasterPSDERList)) {
				return null;
			}
			return this.allMasterPSDERList;
		}
	}
	
	@Override
	public List<IPSDERBase> getNotifyPSDERs(boolean bIncludeInherit) {
		this.prepare();
		final IDataEntityRuntime inheritDataEntityRuntime = bIncludeInherit?this.getInheritDataEntityRuntime():null; 
		if(inheritDataEntityRuntime == null) {
			if (this.notifyPSDERList == null || this.notifyPSDERList.size() == 0) {
				return null;
			}
			return this.notifyPSDERList;
		}
		else {
			if(this.allNotifyPSDERList == null) {
				List<IPSDERBase> list = new ArrayList<IPSDERBase>();
				List<IPSDERBase> list2 = this.getNotifyPSDERs(false);
				if(!ObjectUtils.isEmpty(list2)) {
					list.addAll(list2);
				}
				List<IPSDERBase> list3 = inheritDataEntityRuntime.getNotifyPSDERs(true);
				if(!ObjectUtils.isEmpty(list3)) {
					list.addAll(list3);
				}
				this.allNotifyPSDERList = Collections.unmodifiableList(list);
			}
			if(ObjectUtils.isEmpty(this.allNotifyPSDERList)) {
				return null;
			}
			return this.allNotifyPSDERList;
		}
	}
	
	@Override
	public List<IPSDER1NBase> getClonePSDER1Ns(boolean bIncludeInherit) {
		this.prepare();
		final IDataEntityRuntime inheritDataEntityRuntime = bIncludeInherit?this.getInheritDataEntityRuntime():null; 
		if(inheritDataEntityRuntime == null) {
			return this.clonePSDER1NList;
		}
		else {
			if(this.allClonePSDER1NList == null) {
				List<IPSDER1NBase> list = new ArrayList<IPSDER1NBase>();
				List<IPSDER1NBase> list2 = this.getClonePSDER1Ns(false);
				if(!ObjectUtils.isEmpty(list2)) {
					list.addAll(list2);
				}
				List<IPSDER1NBase> list3 = inheritDataEntityRuntime.getClonePSDER1Ns(true);
				if(!ObjectUtils.isEmpty(list3)) {
					list.addAll(list3);
				}
				this.allClonePSDER1NList = Collections.unmodifiableList(list);
			}
			return this.allClonePSDER1NList;
		}
	}
	
	@Override
	public List<IPSDERBase> getPSDERBases() {
		try {
			return this.getPSDataEntity().getMinorPSDERs();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体关系发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	@Override
	public List<IPSDERBase> getPSDERBases(boolean bIncludeInherit) {
		final IDataEntityRuntime inheritDataEntityRuntime = bIncludeInherit?this.getInheritDataEntityRuntime():null; 
		if(inheritDataEntityRuntime == null) {
			return this.getPSDERBases();
		}
		else {
			if(this.allPSDERList == null) {
				List<IPSDERBase> list = new ArrayList<IPSDERBase>();
				List<IPSDERBase> list2 = this.getPSDERBases(false);
				if(!ObjectUtils.isEmpty(list2)) {
					list.addAll(list2);
				}
				List<IPSDERBase> list3 = inheritDataEntityRuntime.getPSDERBases(true);
				if(!ObjectUtils.isEmpty(list3)) {
					list.addAll(list3);
				}
				this.allPSDERList = Collections.unmodifiableList(list);
			}
			return this.allPSDERList;
		}
	}
	
	
	/**
	 * 获取行为的事务模式
	 *
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	protected int getTransactionalPropagation(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			String strTSMode = iPSDEAction.getTransactionMode();
			if (!StringUtils.hasLength(strTSMode) || TransactionModes.DEFAULT.equalsIgnoreCase(strTSMode)) {
				if (DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
					return ITransactionalUtil.PROPAGATION_SUPPORTS;
				}
				if (DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode())) {
					return ITransactionalUtil.PROPAGATION_SUPPORTS;
				}

				return ITransactionalUtil.PROPAGATION_REQUIRED;
			}

			if (TransactionModes.REQUIRED.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_REQUIRED;
			}

			if (TransactionModes.MANDATORY.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_MANDATORY;
			}

			if (TransactionModes.NESTED.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_NESTED;
			}

			if (TransactionModes.NONE.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_NEVER;
			}

			if (TransactionModes.NOT_SUPPORTED.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_NOT_SUPPORTED;
			}

			if (TransactionModes.REQUIRES_NEW.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_REQUIRES_NEW;
			}

			if (TransactionModes.SUPPORTS.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_SUPPORTS;
			}

			// 全局事务解释为当前无事务
			if (TransactionModes.GLOBAL.equalsIgnoreCase(strTSMode)) {
				return ITransactionalUtil.PROPAGATION_NOT_SUPPORTED;
			}

			return ITransactionalUtil.PROPAGATION_SUPPORTS;
		}

		if (DEActions.GET.equalsIgnoreCase(strActionName)) {
			return ITransactionalUtil.PROPAGATION_SUPPORTS;
		}

		if (DEActions.GETDRAFT.equalsIgnoreCase(strActionName)) {
			return ITransactionalUtil.PROPAGATION_SUPPORTS;
		}
		return ITransactionalUtil.PROPAGATION_REQUIRED;
	}

	@Override
	public void checkNestedEntities(IEntityBase parentEntity, IEntityBase[] entities, IDynaInstRuntime iDynaInstRuntime) throws Throwable {

	}
	
	@Override
	public void fillNestedEntitiesOrderValue(IEntityBase parentEntity, IEntityBase[] entities, IPSDERBase iPSDERBase, IDynaInstRuntime iDynaInstRuntime) throws Throwable {
		
		IPSDEField orderValuePSDEField = this.getOrderValuePSDEField();
		if(orderValuePSDEField == null) {
			return;
		}
		
		int nOrderValue = 1;

		//填充外键
		for (IEntityBase item : entities) {
			this.setFieldValue((IEntity) item, orderValuePSDEField, nOrderValue);
			nOrderValue ++;
		}
	}
	

	@Override
	public IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IDEMSLogicRuntime createDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic) {
		throw new DataEntityRuntimeException(this, "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IDEDataSetRuntime createDEDataSetRuntime(IPSDEDataSet iPSDEDataSet) {
		return null;
	}

	@Override
	public IDEActionRuntime createDEActionRuntime(IPSDEAction iPSDEAction) {
		return null;
	}

	protected int onGetStorageMode() throws Exception {
		return this.getPSDataEntity().getStorageMode();
	}

	/**
	 * 是否在实际操作之后推入异步处理队列
	 *
	 * @return
	 */
	protected boolean isPushDTSQueueAfterProceed(String strActionName, IPSDEAction iPSDEAction) {

		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	@Override
	public IDEFileUtilRuntime getDEFileUtilRuntime() {
		return this.getSystemRuntime().getSysFileUtilRuntime();
	}

	/**
	 * 压入当前实体数据源
	 */
	protected void pushDataSource() {
		onPushDataSource();
	}

	protected void onPushDataSource() {
		DataEntityRuntimeHolder.push(this);
	}

	/**
	 * 弹出当前实体数据源
	 */
	protected void pollDataSource() {
		onPollDataSource();
	}

	protected void onPollDataSource() {
		DataEntityRuntimeHolder.poll();
	}

	@Override
	public IModelRuntimeSetting getSetting() {
		this.prepare();
		return getSetting(false);
	}

	protected IModelRuntimeSetting getSetting(boolean bTryMode) {
		if (this.iModelRuntimeSetting != null || bTryMode) {
			return this.iModelRuntimeSetting;
		}
		throw new DataEntityRuntimeException(this, String.format("设置对象无效"));
	}

	protected void setSetting(IModelRuntimeSetting iModelRuntimeSetting) {
		this.iModelRuntimeSetting = iModelRuntimeSetting;
	}

	/**
	 * 是否启用行为附加逻辑
	 * 
	 * @param iPSDEAction
	 * @param strAttachMode
	 * @return
	 */
	protected boolean isEnableActionLogic(IPSDEAction iPSDEAction, String strAttachMode) {

		if (!ObjectUtils.isEmpty(this.getNotifyPSDERs())) {
			return true;
		}

		// 判断模式
		try {
			List<IPSDEActionLogic> psDEActionLogics = this.getPSDEActionLogics(iPSDEAction, strAttachMode);
			if (!ObjectUtils.isEmpty(psDEActionLogics)) {
				return true;
			}
		} catch (Exception ex) {
			log.error(ex);
			return false;
		}		
		return false;
	}
	
	protected boolean isEnableDataSetLogic(IPSDEDataSet iPSDEDataSet, String strAttachMode) {
		return false;
	}
	
	protected Object executeDataSetLogics(Object[] args, Object ret, IPSDEDataSet iPSDEDataSet, String strAttachMode, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		return ret;
	}

	@Override
	public void fillEntityFullInfo(IEntityBase iEntityBase, String strActionName) {
		this.prepare();
		try {
			this.fillEntityFullInfo(iEntityBase, strActionName, null, this.getPSDataEntity(), null, null);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("填充数据对象完整信息发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	/**
	 * 获取拒绝行为的主状态集合
	 * 
	 * @param iPSDEAction
	 * @return
	 */
	protected List<IPSDEMainState> getDenyPSDEMainStates(IPSDEAction iPSDEAction) {
		Assert.notNull(iPSDEAction, "传入行为模型对象无效");
		if (this.psDEActionDenyMainStateMap != null) {
			// 判断是否有主状态控制
			return this.psDEActionDenyMainStateMap.get(iPSDEAction.getName());
		}
		return null;
	}

	/**
	 * 检查实体主状态
	 * 
	 * @param arg
	 * @param iPSDEAction
	 * @throws Exception
	 */
	protected void checkDEMainState(Object arg, IPSDEAction iPSDEAction) throws Exception {
		List<IPSDEMainState> psDEMainStateList = this.getDenyPSDEMainStates(iPSDEAction);
		if (psDEMainStateList != null) {
			// 获取数据主键
			Object objKey = null;
			if (arg instanceof IEntityBase) {
				objKey = this.getFieldValue((IEntityBase) arg, this.getKeyPSDEField());
			} else {
				objKey = arg;
			}
			// 计算数据状态
			IPSDEMainState lastPSDEMainState = this.getPSDEMainState(objKey);
			if (lastPSDEMainState != null ) {
				if(!ObjectUtils.isEmpty(lastPSDEMainState.getMSTag())) {
					for (IPSDEMainState iPSDEMainState : psDEMainStateList) {
						if (lastPSDEMainState.getMSTag().equals(iPSDEMainState.getMSTag())) {
							throw new DEMainStateActionDenyException(this, lastPSDEMainState, null);
						}
					}
				}
				else if(!ObjectUtils.isEmpty(lastPSDEMainState.getCodeName())) {
					for (IPSDEMainState iPSDEMainState : psDEMainStateList) {
						if (lastPSDEMainState.getCodeName().equals(iPSDEMainState.getCodeName())) {
							throw new DEMainStateActionDenyException(this, lastPSDEMainState, null);
						}
					}
				}
			}
		}
	}

	/**
	 * 是否准备处理之前的数据对象
	 * 
	 * @return
	 */
	protected boolean isPrepareLastBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null && iPSDEAction.isPrepareLast()) {
			return true;
		}

		// 去除默认值逻辑
		if (this.isGetDraftOrCreateAction(strActionName, iPSDEAction)) {
			return false;
		}

		// 仅支持更新才准备
		if (this.isEnableBuildParentPath() && isBuildParentPathAfterProceed(strActionName, iPSDEAction)) {
			return true;
		}

		if (this.isEnableEntityOnChangeLogic() && isExecuteEntityOnChangeLogic(strActionName, iPSDEAction)) {
			return true;
		}

		if (!ObjectUtils.isEmpty(this.notifyPSDERList)) {
			if (iPSDEAction != null) {
				if (DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
					return true;
				}
			}
			if (DEActions.REMOVE.equalsIgnoreCase(strActionName)) {
				return true;
			}
			return false;
		}

		return false;
	}

	@Override
	protected void fillLastEntity(IEntityBase last, Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// if(arg0 instanceof IEntityBase) {
		//
		// }
		super.fillLastEntity(last, arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	@Override
	public void notify(Object key, String strEvent, Object eventData, Object eventData2, Object eventData3, Object eventData4) throws Throwable {

	}
	
	/**
	 * 是否在处理之后审计数据对象
	 *
	 * @return
	 */
	protected boolean isCommitVersionBeforeProceed(String strActionName, IPSDEAction iPSDEAction) {
		return false;
	}
	
//	/**
//	 * 是否在处理之后审计数据对象
//	 *
//	 * @return
//	 */
//	protected boolean isCommitVersionAfterProceed(String strActionName, IPSDEAction iPSDEAction) {
//		return false;
//	}
	
	/**
	 * 提交版本
	 * @param arg0
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected Object prepareVersionBeforeProceed(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		return null;
	}
	
	
	/**
	 * 提交版本
	 * @param arg0
	 * @param versionData 版本数据
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDynaInstRuntime
	 * @param actionData
	 * @throws Throwable
	 */
	protected Object commitVersionBeforeProceed(Object arg0, Object versionData, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		return null;
	}
	
//	/**
//	 * 提交版本
//	 * @param arg0
//	 * @param objRet
//	 * @param strActionName
//	 * @param iPSDEAction
//	 * @param iPSDataEntity
//	 * @param iDynaInstRuntime
//	 * @param actionData
//	 * @throws Throwable
//	 */
//	protected void commitVersionAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
//
//	}
	
	@Override
	protected void syncEntityAfterProceed(int nEvent, Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		this.fireDataEntityEvent(IDataEntityEventListener.EVENT_SYNCENTITY, new Object[] {nEvent, arg0});
		super.syncEntityAfterProceed(nEvent, arg0, objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}
	
	@Override
	public synchronized void registerDataEntityEventListener(IDataEntityEventListener listener) {
		this.registerDataEntityEventListener(listener, null);
	}
	
	@Override
	public synchronized void registerDataEntityEventListener(IDataEntityEventListener listener, String[] events) {
		Map<IDataEntityEventListener, String[]> map = new LinkedHashMap<IDataEntityEventListener, String[]>();
		map.putAll(this.dataEntityEventListenerMap);
		map.put(listener, events);
		this.dataEntityEventListenerMap = map;
	}

	@Override
	public synchronized void unregisterDataEntityEventListener(IDataEntityEventListener listener) {
		Map<IDataEntityEventListener, String[]> map = new LinkedHashMap<IDataEntityEventListener, String[]>();
		map.putAll(this.dataEntityEventListenerMap);
		map.remove(listener);
		this.dataEntityEventListenerMap = map;
	}

	
	/**
	 * 触发系统事件
	 * @param event
	 * @param params
	 */
	protected void fireDataEntityEvent(String event, Object[] params) {
		if(ObjectUtils.isEmpty(this.dataEntityEventListenerMap)) {
			return;
		}
		
		Map<IDataEntityEventListener, String[]> map = this.dataEntityEventListenerMap;
		for(java.util.Map.Entry<IDataEntityEventListener, String[]> entry : map.entrySet()) {
			boolean match = true;
			if(!ObjectUtils.isEmpty(entry.getValue())) {
				match = false;
				for(String item : entry.getValue()) {
					if(event.equalsIgnoreCase(item)) {
						match = true;
						break;
					}
				}
			}
			if(!match) {
				continue;
			}
			
			Executor executor = entry.getKey().getExecutor();
			if(executor != null) {
				executor.execute(new Runnable() {
					@Override
					public void run() {
						entry.getKey().receiveEvent(getSelf(), event, params);
					}
				});
			}
			else {
				try {
					entry.getKey().receiveEvent(getSelf(), event, params);
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
		}
	}
	
	
	@Override
	public synchronized void registerDataEntityOnChangeLogic(IDataEntityOnChangeLogic logic) {
		Set<IDataEntityOnChangeLogic> set = new LinkedHashSet<IDataEntityOnChangeLogic>();
		set.addAll(this.dataEntityOnChangeLogicSet);
		set.add(logic);
		this.dataEntityOnChangeLogicSet = set;
	}
	

	@Override
	public synchronized void unregisterDataEntityOnChangeLogic(IDataEntityOnChangeLogic logic) {
		Set<IDataEntityOnChangeLogic> set = new LinkedHashSet<IDataEntityOnChangeLogic>();
		set.addAll(this.dataEntityOnChangeLogicSet);
		set.remove(logic);
		this.dataEntityOnChangeLogicSet = set;
	}
	
	@Override
	protected void onShutdown() throws Exception {

		if(!ObjectUtils.isEmpty(this.psDEMainStateMap)) {
			this.psDEMainStateMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.psDEDataSetMap)) {
			this.psDEDataSetMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.psDEDataQueryMap)) {
			this.psDEDataQueryMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.psDEActionDenyMainStateMap)) {
			this.psDEActionDenyMainStateMap.clear();
		}
		
		if(!ObjectUtils.isEmpty(this.defaultPSDEUserRoleList)) {
			this.defaultPSDEUserRoleList.clear();
		}
		if(!ObjectUtils.isEmpty(this.unionKeyValuePSDEFieldList)) {
			this.unionKeyValuePSDEFieldList.clear();
		}
		if(!ObjectUtils.isEmpty(this.valueFuncPSDEFieldList)) {
			this.valueFuncPSDEFieldList.clear();
		}
		if(!ObjectUtils.isEmpty(this.deFieldQueryExpMap)) {
			this.deFieldQueryExpMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.predefinedPSDEFieldMap)) {
			this.predefinedPSDEFieldMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.tagPSDEFieldMap)) {
			this.tagPSDEFieldMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.psDERMultiInheritList)) {
			this.psDERMultiInheritList.clear();
		}
		if(!ObjectUtils.isEmpty(this.masterPSDERMap)) {
			this.masterPSDERMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.masterPSDERList)) {
			this.masterPSDERList.clear();
		}
		if(!ObjectUtils.isEmpty(this.notifyPSDERList)) {
			this.notifyPSDERList.clear();
		}
		if(!ObjectUtils.isEmpty(this.clonePSDER1NList)) {
			this.clonePSDER1NList = null;
		}
		
		if(!ObjectUtils.isEmpty(this.allMasterPSDERList)) {
			this.allMasterPSDERList = null;
		}
		
		if(!ObjectUtils.isEmpty(this.allNotifyPSDERList)) {
			this.allNotifyPSDERList = null;
		}
		
		if(!ObjectUtils.isEmpty(this.allClonePSDER1NList)) {
			this.allClonePSDER1NList = null;
		}	
		
		if(!ObjectUtils.isEmpty(this.dataEntityEventListenerMap)) {
			this.dataEntityEventListenerMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.dataEntityOnChangeLogicSet)) {
			this.dataEntityOnChangeLogicSet.clear();
		}
		this.inheritDataEntityRuntime = null;
		this.iDEDataAuditUtilRuntime = null;
		this.iDEDynaStorageUtilRuntime = null;
		
		
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataSetRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deActionRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deUtilRuntimeMap);
		
		if(!ObjectUtils.isEmpty(this.deActionPluginRuntimeMap)) {
			this.deActionPluginRuntimeMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.deDataSetPluginRuntimeMap)) {
			this.deDataSetPluginRuntimeMap.clear();
		}

		
		super.onShutdown();
	}
	
}
