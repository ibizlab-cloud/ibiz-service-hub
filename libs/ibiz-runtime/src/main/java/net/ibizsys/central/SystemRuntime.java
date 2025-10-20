package net.ibizsys.central;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import groovy.lang.GroovySystem;
import net.ibizsys.central.app.ApplicationRuntime;
import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDSchemeRuntime;
import net.ibizsys.central.backend.ISysBackendTaskRuntime;
import net.ibizsys.central.backend.SysAdminBackendTaskRuntime;
import net.ibizsys.central.backend.SysDEActionBackendTaskRuntime;
import net.ibizsys.central.backend.SysDENotifyBackendTaskRuntime;
import net.ibizsys.central.backend.SysDataSyncAgentBackendTaskRuntime;
import net.ibizsys.central.backend.SysUserBackendTaskRuntime;
import net.ibizsys.central.backend.SysWFCallbackBackendTaskRuntime;
import net.ibizsys.central.bi.ISysBICubeCalculatedDimensionParser;
import net.ibizsys.central.bi.ISysBICubeCalculatedMeasureParser;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.bi.SysBISchemeRuntime;
import net.ibizsys.central.codelist.DynamicCodeListRuntime;
import net.ibizsys.central.database.DBDialectUtils;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.database.SysDBSchemeRuntime;
import net.ibizsys.central.dataentity.DataEntityGroupRuntime;
import net.ibizsys.central.dataentity.DataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityGroupRuntime;
import net.ibizsys.central.dataentity.IDataEntityGroupUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.demap.DEMapRuntime;
import net.ibizsys.central.dataentity.demap.IDEMapRuntime;
import net.ibizsys.central.dataentity.ds.IDEDQSQLCustomCondParser;
import net.ibizsys.central.dataentity.ds.IDEDQSQLSelectParser;
import net.ibizsys.central.dataentity.logic.DELogicAppContextParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicAppGlobalParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicAppendParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicBindParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicCommitNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicCopyParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDEActionNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDEDataFlowNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDEDataQueryNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDEDataSetNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDEDataSyncNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDELogicNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDENotifyNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDEPrintNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicDebugParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicEndNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicEntityListParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicEntityMapParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicEntityPageParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicEntityParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicEnvParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicFileListParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicFileParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicFilterParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicLastParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicLastReturnParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicLoopSubCallNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicMergeParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicNodeTypes;
import net.ibizsys.central.dataentity.logic.DELogicPrepareParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicRawSFCodeNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicRawSqlAndLoopCallNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicRawSqlCallNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicRawWebCallNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicRenewParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicResetParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicRollbackNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSFPluginNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSessionParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSimpleListParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSimpleParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSortParamNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicStartWFNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSubSysSAMethodNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSubmitWFNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSysDataSyncAgentOutNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSysLogicNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicSysUtilNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicThrowExceptionNodeRuntime;
import net.ibizsys.central.dataentity.logic.DELogicWebContextParamRuntime;
import net.ibizsys.central.dataentity.logic.DELogicWebResponseParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicNodeRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.SimpleDELogicNodeRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.dataentity.testing.DEActionTestCaseRuntime;
import net.ibizsys.central.eai.SysEAIAgentRuntimeBase;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.msg.SysRTMsgQueueRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.res.ISysUniStateRuntime;
import net.ibizsys.central.res.SysContentCatResourceRuntime;
import net.ibizsys.central.res.SysDEFileResourceRuntime;
import net.ibizsys.central.res.SysResourceRuntime;
import net.ibizsys.central.res.SysUniStateRuntime;
import net.ibizsys.central.res.SysZipFileResourceRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.search.SysSearchSchemeRuntime;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.security.SystemAccessManager;
import net.ibizsys.central.security.UserContextRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIScriptLogicRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntime;
import net.ibizsys.central.service.SubSysServiceAPIScriptLogicRuntime;
import net.ibizsys.central.service.SysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.system.ISysRefRuntime;
import net.ibizsys.central.system.ISystemModuleRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntime;
import net.ibizsys.central.system.SysRefRuntime;
import net.ibizsys.central.system.SystemModuleRuntime;
import net.ibizsys.central.system.SystemModuleUtilTypes;
import net.ibizsys.central.sysutil.DefaultSysFileUtilRuntime;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.SysLogListenerUtilRuntime;
import net.ibizsys.central.testing.ISysTestCaseRuntime;
import net.ibizsys.central.testing.ISysTestDataRuntime;
import net.ibizsys.central.testing.SysTestDataRuntime;
import net.ibizsys.central.testing.TestCaseTargetTypes;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.IWebResponse;
import net.ibizsys.central.util.groovy.ISystemRTGroovyContext;
import net.ibizsys.central.util.groovy.MetaClassCreationHandle;
import net.ibizsys.central.util.groovy.SystemRTGroovyContext;
import net.ibizsys.central.util.script.IScriptList;
import net.ibizsys.central.util.script.IScriptPage;
import net.ibizsys.central.util.script.IScriptWebResponse;
import net.ibizsys.central.util.script.ScriptEntity;
import net.ibizsys.central.util.script.ScriptList;
import net.ibizsys.central.util.script.ScriptPage;
import net.ibizsys.central.util.script.ScriptWebResponse;
import net.ibizsys.central.util.script.SystemRTScriptContext;
import net.ibizsys.model.IPSDynaInstService;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelEnums.BDType;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.PSModelEnums.ReportType;
import net.ibizsys.model.PSModelEnums.ResourceType;
import net.ibizsys.model.PSModelEnums.SearchEngineType;
import net.ibizsys.model.PSModelEnums.SequenceType;
import net.ibizsys.model.PSModelEnums.ServiceType;
import net.ibizsys.model.PSModelEnums.UniStateType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.dataentity.IPSDEGroup;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSSysDEGroup;
import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysResource;
import net.ibizsys.model.res.IPSSysUniState;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.search.IPSSysSearchScheme;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.model.testing.IPSSysTestCase;
import net.ibizsys.model.testing.IPSSysTestData;
import net.ibizsys.runtime.SystemRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.addin.ISystemRTAddin;
import net.ibizsys.runtime.backend.SysBackendTaskPredefinedTypes;
import net.ibizsys.runtime.backend.SysBackendTaskTypes;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DESaaSModes;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncDirs;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncOutRuntime;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.DEReportTypes;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.SysMsgQueueTypes;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;
import net.ibizsys.runtime.res.SysDataSyncAgentTypes;
import net.ibizsys.runtime.res.SysUtilTypes;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.ModelRuntimeUtils;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.ISystemRTScriptContext;

/**
 * 默认的系统运行时对象
 * 
 * @author lionlau
 *
 */
/**
 * @author lionlau
 *
 */
public class SystemRuntime extends SystemRuntimeBase implements ISystemRuntime {

	private static final Log log = LogFactory.getLog(SystemRuntime.class);

	// protected static Map<String, String> SYSTEMMODULEOBJMAP = new
	// HashMap<>();

	static {
		// SYSTEMMODULEOBJMAP.put(SystemModuleUtilTypes.BI,
		// "net.ibizsys.centralutil.bi.system.druid.DruidBISystemModuleUtilRuntime");

		registerRuntimeObjectIf(ISystemModuleUtilRuntime.class, SystemModuleUtilTypes.BI, "net.ibizsys.centralutil.bi.system.druid.DruidBISystemModuleUtilRuntime");

		registerRuntimeObjectIf(ISysDataSyncAgentRuntime.class, SysDataSyncAgentTypes.INTERNAL, "net.ibizsys.central.eai.InternalDataSyncAgentRuntime");

		registerRuntimeObjectIf(ISysUtilRuntime.class, SysUtilTypes.LOGLISTENER, SysLogListenerUtilRuntime.class.getCanonicalName());
		registerRuntimeObjectIf(ISysUtilRuntime.class, SysUtilTypes.FILE, DefaultSysFileUtilRuntime.class.getCanonicalName());

		registerRuntimeObjectIf(IDEPrintRuntime.class, DEReportTypes.POI_TL, "net.ibizsys.central.plugin.poi.dataentity.print.POIDEPrintRuntime");
		registerRuntimeObjectIf(IDEPrintRuntime.class, DEReportTypes.JR, "net.ibizsys.central.plugin.jr.dataentity.print.JRDEPrintRuntime");
		registerRuntimeObjectIf(IDEReportRuntime.class, DEReportTypes.JR, "net.ibizsys.central.plugin.jr.dataentity.report.JRDEReportRuntime");

		registerRuntimeObjectIf(IDEReportRuntime.class, ReportType.SYSBICUBE.value, "net.ibizsys.central.dataentity.report.DEBIReportRuntime");
		registerRuntimeObjectIf(IDEReportRuntime.class, ReportType.DESYSBICUBES.value, "net.ibizsys.central.dataentity.report.DEBIReportRuntime");
		registerRuntimeObjectIf(IDEReportRuntime.class, ReportType.ALLSYSBICUBES.value, "net.ibizsys.central.dataentity.report.DEBIReportRuntime");
		registerRuntimeObjectIf(IDEReportRuntime.class, ReportType.SYSBIREPORT.value, "net.ibizsys.central.dataentity.report.DEBIReportRuntime");
		registerRuntimeObjectIf(IDEReportRuntime.class, ReportType.DESYSBIREPORTS.value, "net.ibizsys.central.dataentity.report.DEBIReportRuntime");
		registerRuntimeObjectIf(IDEReportRuntime.class, ReportType.SYSBICUBEREPORTS.value, "net.ibizsys.central.dataentity.report.DEBIReportRuntime");
		registerRuntimeObjectIf(IDEReportRuntime.class, ReportType.ALLSYSBIREPORTS.value, "net.ibizsys.central.dataentity.report.DEBIReportRuntime");

		registerRuntimeObjectIf(ISysBDSchemeRuntime.class, BDType.MONGODB.value, "net.ibizsys.central.plugin.mongodb.ba.MongoDBSchemeRuntime");
		registerRuntimeObjectIf(ISysBDSchemeRuntime.class, BDType.SOLR.value, "net.ibizsys.central.plugin.solr.ba.SolrBDSchemeRuntime");
		registerRuntimeObjectIf(ISysBDSchemeRuntime.class, BDType.ES.value, "net.ibizsys.central.plugin.es.ba.ESBDSchemeRuntime");
		registerRuntimeObjectIf(ISysBDSchemeRuntime.class, BDType.NEO4J.value, "net.ibizsys.central.plugin.neo4j.ba.Neo4jBDSchemeRuntime");
		registerRuntimeObjectIf(ISysBDSchemeRuntime.class, BDType.MILVUS.value, "net.ibizsys.central.plugin.milvus.ba.MilvusBDSchemeRuntime");

		registerRuntimeObjectIf(ISysSearchSchemeRuntime.class, SearchEngineType.ELASTICSEARCH.value, "net.ibizsys.central.plugin.es.search.ESSearchSchemeRuntime");

		registerRuntimeObjectIf(IDEDataSyncInRuntime.class, net.ibizsys.central.dataentity.datasync.DEDataSyncInRuntime.class.getCanonicalName());
		registerRuntimeObjectIf(IDEDataSyncOutRuntime.class, net.ibizsys.central.dataentity.datasync.DEDataSyncOutRuntime.class.getCanonicalName());

		registerRuntimeObjectIf(ISysResourceRuntime.class, ResourceType.ZIPFILE.value, SysZipFileResourceRuntime.class.getCanonicalName());
		registerRuntimeObjectIf(ISysResourceRuntime.class, ResourceType.GITPROJECT.value, "net.ibizsys.central.plugin.jgit.res.JGitSysGitResourceRuntime");
		registerRuntimeObjectIf(ISysResourceRuntime.class, ResourceType.SYSCONTENTCAT.value, SysContentCatResourceRuntime.class.getCanonicalName());
		registerRuntimeObjectIf(ISysResourceRuntime.class, ResourceType.DEFILE.value, SysDEFileResourceRuntime.class.getCanonicalName());

		registerRuntimeObjectIf(ISysMsgTemplRuntime.class, MsgTemplEngine.FREEMARKER.value, "net.ibizsys.central.msg.SysMsgTemplRuntime");
		registerRuntimeObjectIf(ISysMsgTemplRuntime.class, null, "net.ibizsys.central.msg.SysMsgTemplRuntime");
		registerRuntimeObjectIf(ISysMsgTemplRuntime.class, MsgTemplEngine.GROOVY.value, "net.ibizsys.central.plugin.groovy.msg.GroovySysMsgTemplRuntime");

		registerRuntimeObjectIf(ISysSequenceRuntime.class, SequenceType.DE.value, "net.ibizsys.central.res.SysDESequenceRuntime");

		registerRuntimeObjectIf(ISysUniStateRuntime.class, UniStateType.DE.value, "net.ibizsys.central.res.SysDEUniStateRuntime");

		registerSingleInstanceRuntimeObjectIf(IDEDQSQLCustomCondParser.class, "PQL", "net.ibizsys.central.plugin.calcite.dataentity.ds.CalciteDEDQSQLCustomCondParser");
		registerSingleInstanceRuntimeObjectIf(IDEDQSQLCustomCondParser.class, "BIDRILLDETAIL", "net.ibizsys.central.bi.SysBIDrillDetailDEDQSQLCustomCondParser");
		registerSingleInstanceRuntimeObjectIf(IDEDQSQLSelectParser.class, null, "net.ibizsys.central.plugin.calcite.dataentity.ds.CalciteDEDQSQLSelectParser");

		registerSingleInstanceRuntimeObjectIf(ISysBICubeCalculatedMeasureParser.class, "SQL", "net.ibizsys.central.plugin.calcite.bi.CalciteSysBICubeSQLCalculatedMeasureParser");
		registerSingleInstanceRuntimeObjectIf(ISysBICubeCalculatedDimensionParser.class, "SQL", "net.ibizsys.central.plugin.calcite.bi.CalciteSysBICubeSQLCalculatedDimensionParser");

		GroovySystem.getMetaClassRegistry().setMetaClassCreationHandle(new MetaClassCreationHandle());
	}

	private String strDeploySystemId = null;
	private ISystemGatewayContext iSystemGatewayContext = null;
	private Object data = null;

	private ISystemRuntimeSetting iSystemRuntimeSetting = null;

	private Map<String, IPSDataEntity> psDataEntityMap = new ConcurrentHashMap<String, IPSDataEntity>();
	private Map<String, IDataEntityRuntime> dataEntityRuntimeMap = new ConcurrentHashMap<String, IDataEntityRuntime>();

	private Map<String, ISysResourceRuntime> sysResourceRuntimeMap = null;
	private Map<String, ISysUniStateRuntime> sysUniStateRuntimeMap = null;
	private Map<String, ISysRefRuntime> sysRefRuntimeMap = null;
	private Map<String, ISystemModuleRuntime> systemModuleRuntimeMap = null;
	private Map<String, IDataEntityGroupRuntime> dataEntityGroupRuntimeMap = null;
	private List<IDataEntityGroupUtilRuntime> dataEntityGroupUtilRuntimeList = null;

	private Map<String, ISysServiceAPIRuntime> sysServiceAPIRuntimeMap = null;
	private Map<String, IApplicationRuntime> applicationRuntimeMap = null;
	private Map<String, ISysDBSchemeRuntime> sysDBSchemeRuntimeMap = null;
	private Map<String, ISysBDSchemeRuntime> sysBDSchemeRuntimeMap = null;
	private ISysBDSchemeRuntime defaultSysBDSchemeRuntime = null;

	private Map<String, ISysSearchSchemeRuntime> sysSearchSchemeRuntimeMap = null;

	private Map<String, ISysBISchemeRuntime> sysBISchemeRuntimeMap = null;

	private Map<String, ISysBackendTaskRuntime> sysBackendTaskRuntimeMap = null;

	private Map<String, ISubSysServiceAPIRuntime> subSysServiceAPIRuntimeMap = null;

	private Map<String, IDBDialect> dbDialectMap = new ConcurrentHashMap<String, IDBDialect>();

	private Map<String, ISysTestDataRuntime> sysTestDataRuntimeMap = null;

	private ISystemPersistentAdapter iSystemPersistentAdapter = null;

	private ISystemAccessManager iSystemAccessManager = null;

	private ISystemLogAdapter iSystemLogAdapter = null;

	private Map<String, IDELogicNodeRuntime> deELogicNodeRuntimeMap = new ConcurrentHashMap<>();

	private Map<String, IDEService> deServiceMap = new ConcurrentHashMap<String, IDEService>();

	private Map<String, String> deServiceObjMap = new ConcurrentHashMap<String, String>();

	private Map<String, String> appDataEntityTagMap = new HashMap<String, String>();

	private Map<String, IPSSysContent> resourcePSSysContentMap = new HashMap<String, IPSSysContent>();

	private IWebClient defaultWebClient = null;

	private ISysUniStateUtilRuntime iSysUniStateUtilRuntime = null;

	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;

	private String strDeploySessionId = null;

	private ISystemRTGroovyContext iSystemRTGroovyContext = null;

	private boolean bEnableTenantMode = false;

	private ISystemRuntimeContext iSystemRuntimeContext = new ISystemRuntimeContext() {

		@Override
		public net.ibizsys.central.ISystemRuntime getSystemRuntime() {
			return getSelf();
		}

		@Override
		public ISystemPersistentAdapter getSystemPersistentAdapter(IPSDataEntity iPSDataEntity) throws Exception {
			return internalGetSystemPersistentAdapter(iPSDataEntity);
		}

		@Override
		public IPSSystemService getPSSystemService() {
			return getSelf().getPSSystemService();
		}

		@Override
		public int getStorageMode(IPSDataEntity iPSDataEntity) {
			return getSelf().getDataEntityStorageMode(iPSDataEntity);
		}
	};

	@Override
	public void init(ISystemGatewayContext iSystemGatewayContext, IPSSystemService iPSSystemService, String strDeploySystemId, Object data) throws Exception {
		this.strDeploySystemId = strDeploySystemId;
		this.iSystemGatewayContext = iSystemGatewayContext;
		if (iPSSystemService != null) {
			this.setPSSystemService(iPSSystemService);
		} else {
			this.setPSSystemService(this.createPSSystemService());
		}

		this.strDeploySessionId = KeyValueUtils.genUniqueId(strDeploySystemId, DateUtils.getCurTimeString2(), KeyValueUtils.genUniqueId());
		this.setPSModelEngineVer(this.getPSSystem().getEngineVer());
		if (data instanceof ISystemRuntimeSetting) {
			ISystemRuntimeSetting iSystemRuntimeSetting = (ISystemRuntimeSetting) data;
			this.setSystemRuntimeSetting(iSystemRuntimeSetting);
			this.data = getSystemRuntimeSetting().getParam("data");
		} else if (data instanceof Map) {
			prepareSystemSetting((Map) data);
			this.data = getSystemRuntimeSetting().getParam("data");
		} else {
			this.data = data;
			// 准备系统配置
			if (this.getSystemRuntimeSetting() == null) {
				prepareSystemSetting(null);
			}
		}

		this.prepareSysSFPluginRuntimes();
		this.prepareThreadPoolExecutors();

		this.onInit();
		this.onBeforeStart();
		// 启动计时器相关
		this.onStart();
		this.onAfterStart();
		this.markLoaded();
	}

	@Override
	protected void onInit() throws Exception {

		// 建立系统日志适配器
		if (this.getSystemLogAdapter() == null) {
			try {
				this.prepareSystemLogAdapter();
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("准备系统日志适配器对象发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		// 准备系统文件夹
		try {
			prepareSystemFolders();
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("准备系统文件夹发生异常，%1$s", ex.getMessage()), ex);
		}

		// 准备系统资源内容
		java.util.List<IPSSysContentCat> psSysContentCats = this.getPSSystem().getAllPSSysContentCats();
		if (!ObjectUtils.isEmpty(psSysContentCats)) {
			for (IPSSysContentCat iPSSysContentCat : psSysContentCats) {
				if (!RESOURCES_PSSYSCONTENTCAT.equalsIgnoreCase(iPSSysContentCat.getCodeName())) {
					continue;
				}

				List<IPSSysContent> psSysContentList = iPSSysContentCat.getPSSysContents();
				if (!ObjectUtils.isEmpty(psSysContentList)) {
					for (IPSSysContent iPSSysContent : psSysContentList) {
						String strPath = iPSSysContent.getContentPath();
						if (!StringUtils.hasLength(strPath)) {
							strPath = iPSSysContent.getName();
						}
						if (this.resourcePSSysContentMap.containsKey(strPath)) {
							log.warn(String.format("忽略注册资源内容[%1$s][%2$s]，键名已存在", strPath, iPSSysContent.getId()));
							continue;
						}
						this.resourcePSSysContentMap.put(strPath, iPSSysContent);
					}
				}
			}
		}

		// 缓存应用实体和实体的对应关系
		java.util.List<IPSApplication> psApplicationList = this.getPSSystem().getAllPSApps();
		if (!ObjectUtils.isEmpty(psApplicationList)) {
			for (IPSApplication iPSApplication : psApplicationList) {
				if (!StringUtils.hasLength(iPSApplication.getPKGCodeName())) {
					continue;
				}

				java.util.List<IPSAppDataEntity> psAppDataEntityList = iPSApplication.getAllPSAppDataEntities();
				if (!ObjectUtils.isEmpty(psAppDataEntityList)) {
					for (IPSAppDataEntity item : psAppDataEntityList) {
						if (!StringUtils.hasLength(item.getCodeName())) {
							continue;
						}

						if (item.getPSDataEntity() == null) {
							continue;
						}

						this.appDataEntityTagMap.put(String.format("%1$s:%2$s", iPSApplication.getPKGCodeName(), item.getCodeName()).toLowerCase(), item.getPSDataEntity().getId());
					}
				}
			}
		}

		// 缓存实体模型
		java.util.List<IPSDataEntity> psDataEntityList = this.getPSSystem().getAllPSDataEntities();
		if (psDataEntityList != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntityList) {

				if (!this.bEnableTenantMode) {
					this.bEnableTenantMode = iPSDataEntity.getSaaSMode() != DESaaSModes.NONE;
				}

				if (StringUtils.hasLength(iPSDataEntity.getId())) {
					psDataEntityMap.put(iPSDataEntity.getId(), iPSDataEntity);
				}
				if (StringUtils.hasLength(iPSDataEntity.getName())) {
					psDataEntityMap.put(iPSDataEntity.getName().toLowerCase(), iPSDataEntity);
					if (iPSDataEntity.getPSSystemModule() != null) {
						psDataEntityMap.put(PSModelUtils.calcUniqueTag(iPSDataEntity.getPSSystemModule(), iPSDataEntity.getName()), iPSDataEntity);
					}
				}
				String strTag = PSModelUtils.calcFullUniqueTag2(iPSDataEntity);
				if (StringUtils.hasLength(strTag)) {
					if(!psDataEntityMap.containsKey(strTag)) {
						psDataEntityMap.put(strTag, iPSDataEntity);
					}
					strTag = strTag.toLowerCase();
					if(!psDataEntityMap.containsKey(strTag)) {
						psDataEntityMap.put(strTag, iPSDataEntity);
					}
				}
			}
		}

		// 准备系统引用
		java.util.List<IPSSysRef> psSysRefs = this.getPSSystem().getAllPSSysRefs();
		if (!ObjectUtils.isEmpty(psSysRefs)) {
			for (IPSSysRef iPSSysRef : psSysRefs) {
				this.registerPSSysRef(iPSSysRef);
			}
		}

		// 准备系统资源
		java.util.List<IPSSysResource> psSysResources = this.getPSSystem().getAllPSSysResources();
		if (!ObjectUtils.isEmpty(psSysResources)) {
			for (IPSSysResource iPSSysResource : psSysResources) {
				this.registerPSSysResource(iPSSysResource);
			}
		}

		// 准备系统基础功能组件
		java.util.List<IPSSysUtil> psSysUtils = this.getPSSystem().getAllPSSysUtils();
		if (psSysUtils != null) {
			for (IPSSysUtil iPSSysUtil : psSysUtils) {
				// 处理排序值小于 100
				if (iPSSysUtil.getOrderValue() >= 0 && iPSSysUtil.getOrderValue() < 100) {
					this.registerPSSysUtil(iPSSysUtil);
				}
			}
		}

		// 准备系统模块
		java.util.List<IPSSystemModule> psSystemModules = this.getPSSystem().getAllPSSystemModules();
		if (psSystemModules != null) {
			for (IPSSystemModule iPSSystemModule : psSystemModules) {
				this.registerPSSystemModule(iPSSystemModule);
			}
		}

		// 准备系统实体组
		java.util.List<IPSSysDEGroup> psDEGroups = this.getPSSystem().getAllPSSysDEGroups();
		if (psDEGroups != null) {
			for (IPSDEGroup iPSDEGroup : psDEGroups) {
				this.registerPSDEGroup(iPSDEGroup);
			}
		}

		// 准备系统数据库体系
		java.util.List<IPSSysDBScheme> psSysDBSchemes = this.getPSSystem().getAllPSSysDBSchemes();
		if (psSysDBSchemes != null) {
			for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
				this.registerPSSysDBScheme(iPSSysDBScheme);
			}
		}

		// 准备系统大数据体系
		java.util.List<IPSSysBDScheme> psSysBDSchemes = this.getPSSystem().getAllPSSysBDSchemes();
		if (psSysBDSchemes != null) {
			for (IPSSysBDScheme iPSSysBDScheme : psSysBDSchemes) {
				ISysBDSchemeRuntime iSysBDSchemeRuntime = this.registerPSSysBDScheme(iPSSysBDScheme);
				if (iSysBDSchemeRuntime != null) {
					if (iSysBDSchemeRuntime.isDefaultMode() && this.getDefaultSysBDSchemeRuntime() == null) {
						this.setDefaultSysBDSchemeRuntime(iSysBDSchemeRuntime);
					}
				}
			}
		}

		// 准备系统默认大数据体系
		if (this.getDefaultSysBDSchemeRuntime() == null) {
			try {
				this.prepareDefaultSysBDSchemeRuntime();
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("准备系统默认大数据体系运行时对象发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		// 准备系统检索体系
		java.util.List<IPSSysSearchScheme> psSysSearchSchemes = this.getPSSystem().getAllPSSysSearchSchemes();
		if (psSysSearchSchemes != null) {
			for (IPSSysSearchScheme iPSSysSearchScheme : psSysSearchSchemes) {
				ISysSearchSchemeRuntime iSysSearchSchemeRuntime = this.registerPSSysSearchScheme(iPSSysSearchScheme);
			}
		}

		// 准备系统智能报表体系
		java.util.List<IPSSysBIScheme> psSysBISchemes = this.getPSSystem().getAllPSSysBISchemes();
		if (psSysBISchemes != null) {
			for (IPSSysBIScheme iPSSysBIScheme : psSysBISchemes) {
				ISysBISchemeRuntime iSysBISchemeRuntime = this.registerPSSysBIScheme(iPSSysBIScheme);
			}
		}

		// 准备系统外部服务接口
		java.util.List<IPSSubSysServiceAPI> psSubSysServiceAPIs = this.getPSSystem().getAllPSSubSysServiceAPIs();
		if (psSubSysServiceAPIs != null) {
			for (IPSSubSysServiceAPI iPSSubSysServiceAPI : psSubSysServiceAPIs) {
				this.registerPSSubSysServiceAPI(iPSSubSysServiceAPI);
			}
		}

		// 建立系统持久化适配器
		ISystemPersistentAdapter iSystemPersistentAdapter = this.createSystemPersistentAdapter();
		if (iSystemPersistentAdapter != null) {
			iSystemPersistentAdapter.init(this.getSystemRuntimeContext());
			this.iSystemPersistentAdapter = iSystemPersistentAdapter;
		}

		ISystemAccessManager iSystemAccessManager = this.createSystemAccessManager();
		if (iSystemAccessManager != null) {
			iSystemAccessManager.init(this.getSystemRuntimeContext());
			this.iSystemAccessManager = iSystemAccessManager;
		}

		super.onInit();

		// 准备系统统一状态
		java.util.List<IPSSysUniState> psSysUniStates = this.getPSSystem().getAllPSSysUniStates();
		if (!ObjectUtils.isEmpty(psSysUniStates)) {
			for (IPSSysUniState iPSSysUniState : psSysUniStates) {
				this.registerPSSysUniState(iPSSysUniState);
			}
		}

		// 准备系统数据同步代理
		java.util.List<IPSSysDataSyncAgent> psSysDataSyncAgents = this.getPSSystem().getAllPSSysDataSyncAgents();
		if (psSysDataSyncAgents != null) {
			// 先注册输出
			for (IPSSysDataSyncAgent iPSSysDataSyncAgent : psSysDataSyncAgents) {
				String strSyncDir = iPSSysDataSyncAgent.getSyncDir();
				if (SysDataSyncAgentDirs.INOUT.equals(strSyncDir) || SysDataSyncAgentDirs.OUT.equals(strSyncDir)) {
					this.getSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
				}
			}
			// 再注册输入
			for (IPSSysDataSyncAgent iPSSysDataSyncAgent : psSysDataSyncAgents) {
				String strSyncDir = iPSSysDataSyncAgent.getSyncDir();
				// 先输出
				if (SysDataSyncAgentDirs.IN.equals(strSyncDir)) {
					this.getSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
				}
			}
		}

		// 预载实体模型
		if (psDataEntityList != null) {
			for (IPSDataEntity iPSDataEntity : psDataEntityList) {
				try {
					if (testPreloadPSDataEntity(iPSDataEntity)) {
						IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntime(iPSDataEntity.getId());
						// 调用该语句执行预载
						iDataEntityRuntime.getKeyPSDEField();
					}
				} catch (Exception ex) {
					throw new SystemRuntimeException(this, String.format("预载实体[%1$s]运行时对象发生异常，%2$s", iPSDataEntity.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 准备系统服务接口
		java.util.List<IPSSysServiceAPI> psSysServiceAPIs = this.getPSSystem().getAllPSSysServiceAPIs();
		if (psSysServiceAPIs != null) {
			Map<String, String> enableAPIMap = null;
			String strEnableAPIs = this.getSystemRuntimeSetting().getEnableAPIs();
			if (StringUtils.hasLength(strEnableAPIs)) {
				enableAPIMap = new HashMap<String, String>();
				String[] apis = strEnableAPIs.toLowerCase().split("[;]");
				for (String api : apis) {
					enableAPIMap.put(api, "");
				}
			}

			for (IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIs) {
				boolean bEnable = true;

				/**
				 * 非本地服务类型接口检查是否部署
				 */
				if (!ServiceType.LOCAL.value.equals(iPSSysServiceAPI.getServiceType())) {

					if (enableAPIMap != null) {
						bEnable = false;
						// 判断是否注册接口，判断代码标识及名称
						if (StringUtils.hasLength(iPSSysServiceAPI.getCodeName())) {
							bEnable = enableAPIMap.containsKey(iPSSysServiceAPI.getCodeName().toLowerCase());
						}
						if (!bEnable) {
							if (StringUtils.hasLength(iPSSysServiceAPI.getName())) {
								bEnable = enableAPIMap.containsKey(iPSSysServiceAPI.getName().toLowerCase());
							}
						}
					}
				}

				if (!bEnable) {
					log.warn(String.format("系统[%1$s]服务接口[%2$s]未启用，忽略加载", this.getDeploySystemId(), iPSSysServiceAPI.getName()));
					continue;
				}

				this.registerPSSysServiceAPI(iPSSysServiceAPI);
			}
		}
		// 准备系统前端应用
		if (isEnableAppGateway()) {
			java.util.List<IPSApplication> psApplications = this.getPSSystem().getAllPSApps();
			if (psApplications != null) {
				for (IPSApplication iPSApplication : psApplications) {
					this.registerPSApplication(iPSApplication);
				}
			}
		}

		// 准备系统后台任务
		java.util.List<IPSSysBackService> psSysBackServices = this.getPSSystem().getAllPSSysBackServices();
		if (psSysBackServices != null) {
			for (IPSSysBackService iPSSysBackService : psSysBackServices) {
				this.registerPSSysBackService(iPSSysBackService);
			}
		}

	}

	protected boolean isEnableAppGateway() {
		return this.getSystemGatewayContext().isEnableAppGateway();
	}

	@Override
	protected void onStart() throws Exception {
		
		// 启动数据库体系
		java.util.List<IPSSysDBScheme> psSysDBSchemes = this.getPSSystem().getAllPSSysDBSchemes();
		if (psSysDBSchemes != null) {
			for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
				ISysDBSchemeRuntime iSysDBSchemeRuntime = this.getSysDBSchemeRuntime(iPSSysDBScheme.getId(), false);
				try {
					iSysDBSchemeRuntime.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统数据库体系[%1$s]发生异常，%2$s", iSysDBSchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		// 启动系统引用
		java.util.List<IPSSysRef> psSysRefs = this.getPSSystem().getAllPSSysRefs();
		if (psSysRefs != null) {
			for (IPSSysRef iPSSysRef : psSysRefs) {
				ISysRefRuntime iSysRefRuntime = this.getSysRefRuntime(iPSSysRef.getId(), false);
				try {
					iSysRefRuntime.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统引用[%1$s]发生异常，%2$s", iSysRefRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 启动模块功能
		java.util.List<IPSSystemModule> psSystemModules = this.getPSSystem().getAllPSSystemModules();
		if (psSystemModules != null) {
			for (IPSSystemModule iPSSystemModule : psSystemModules) {
				ISystemModuleRuntime iSystemModuleRuntime = this.getSystemModuleRuntime(iPSSystemModule.getId(), false);
				if (!(iSystemModuleRuntime instanceof ISystemModuleUtilRuntime)) {
					continue;
				}
				ISystemModuleUtilRuntime iSystemModuleUtilRuntime = (ISystemModuleUtilRuntime) iSystemModuleRuntime;
				try {
					iSystemModuleUtilRuntime.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统模块功能[%1$s]发生异常，%2$s", iSystemModuleRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		// 启动消息模板
		java.util.List<IPSSysMsgTempl> psSysMsgTempls = this.getPSSystem().getAllPSSysMsgTempls();
		if (psSysMsgTempls != null) {
			for (IPSSysMsgTempl iPSSysMsgTempl : psSysMsgTempls) {
				net.ibizsys.runtime.msg.ISysMsgTemplRuntime iSysMsgTemplRuntime = this.getSysMsgTemplRuntime(iPSSysMsgTempl);
				if (!(iSysMsgTemplRuntime instanceof ISysMsgTemplRuntime)) {
					continue;
				}
				ISysMsgTemplRuntime iSysMsgTemplRuntime2 = (ISysMsgTemplRuntime) iSysMsgTemplRuntime;
				try {
					iSysMsgTemplRuntime2.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统消息模板[%1$s]发生异常，%2$s", iSysMsgTemplRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 启动大数据体系
		java.util.List<IPSSysBDScheme> psSysBDSchemes = this.getPSSystem().getAllPSSysBDSchemes();
		if (psSysBDSchemes != null) {
			for (IPSSysBDScheme iPSSysBDScheme : psSysBDSchemes) {
				ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(iPSSysBDScheme.getId(), false);
				try {
					iSysBDSchemeRuntime.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统大数据体系[%1$s]发生异常，%2$s", iSysBDSchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

	
		// 启动搜索体系
		java.util.List<IPSSysSearchScheme> psSysSearchSchemes = this.getPSSystem().getAllPSSysSearchSchemes();
		if (psSysSearchSchemes != null) {
			for (IPSSysSearchScheme iPSSysSearchScheme : psSysSearchSchemes) {
				ISysSearchSchemeRuntime iSysSearchSchemeRuntime = this.getSysSearchSchemeRuntime(iPSSysSearchScheme.getId(), false);
				try {
					iSysSearchSchemeRuntime.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统搜索体系[%1$s]发生异常，%2$s", iSysSearchSchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 启动智能报表体系
		java.util.List<IPSSysBIScheme> psSysBISchemes = this.getPSSystem().getAllPSSysBISchemes();
		if (psSysBISchemes != null) {
			for (IPSSysBIScheme iPSSysBIScheme : psSysBISchemes) {
				ISysBISchemeRuntime iSysBISchemeRuntime = this.getSysBISchemeRuntime(iPSSysBIScheme.getId(), false);
				try {
					iSysBISchemeRuntime.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统智能报表体系[%1$s]发生异常，%2$s", iSysBISchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 启动系统功能
		java.util.List<IPSSysUtil> psSysUtils = this.getPSSystem().getAllPSSysUtils();
		if (psSysUtils != null) {
			for (IPSSysUtil iPSSysUtil : psSysUtils) {
				ISysUtilRuntime iSysUtilRuntime = this.getSysUtilRuntime(iPSSysUtil.getId(), false);
				if (!(iSysUtilRuntime instanceof net.ibizsys.central.sysutil.ISysUtilRuntime)) {
					continue;
				}
				net.ibizsys.central.sysutil.ISysUtilRuntime iSysUtilRuntime2 = (net.ibizsys.central.sysutil.ISysUtilRuntime) iSysUtilRuntime;
				try {
					iSysUtilRuntime2.install();
				} catch (Throwable ex) {
					throw new Exception(String.format("安装系统功能组件[%1$s]发生异常，%2$s", iSysUtilRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		super.onStart();
	}

	@Override
	public void installData(String strMode) throws Exception {
		this.onInstallData(strMode);
	}

	protected void onInstallData(String strMode) throws Exception {
		// // 系统引用安装数据
		// java.util.List<IPSSysRef> psSysRefs =
		// this.getPSSystem().getAllPSSysRefs();
		// if (psSysRefs != null) {
		// for (IPSSysRef iPSSysRef : psSysRefs) {
		// ISysRefRuntime iSysRefRuntime =
		// this.getSysRefRuntime(iPSSysRef.getId(), false);
		// try {
		// iSysRefRuntime.installData(strMode);
		// } catch (Throwable ex) {
		// throw new Exception(String.format("系统引用[%1$s]安装数据发生异常，%2$s",
		// iSysRefRuntime.getName(), ex.getMessage()), ex);
		// }
		// }
		// }
		//

		// 模块功能安装数据
		java.util.List<IPSSystemModule> psSystemModules = this.getPSSystem().getAllPSSystemModules();
		if (psSystemModules != null) {
			for (IPSSystemModule iPSSystemModule : psSystemModules) {
				ISystemModuleRuntime iSystemModuleRuntime = this.getSystemModuleRuntime(iPSSystemModule.getId(), false);
				if (!(iSystemModuleRuntime instanceof ISystemModuleUtilRuntime)) {
					continue;
				}
				ISystemModuleUtilRuntime iSystemModuleUtilRuntime = (ISystemModuleUtilRuntime) iSystemModuleRuntime;
				try {
					iSystemModuleUtilRuntime.installData(strMode);
				} catch (Throwable ex) {
					throw new Exception(String.format("系统模块功能[%1$s]安装数据发生异常，%2$s", iSystemModuleRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		// 消息模板安装数据
		java.util.List<IPSSysMsgTempl> psSysMsgTempls = this.getPSSystem().getAllPSSysMsgTempls();
		if (psSysMsgTempls != null) {
			for (IPSSysMsgTempl iPSSysMsgTempl : psSysMsgTempls) {
				net.ibizsys.runtime.msg.ISysMsgTemplRuntime iSysMsgTemplRuntime = this.getSysMsgTemplRuntime(iPSSysMsgTempl);
				if (!(iSysMsgTemplRuntime instanceof ISysMsgTemplRuntime)) {
					continue;
				}
				ISysMsgTemplRuntime iSysMsgTemplRuntime2 = (ISysMsgTemplRuntime) iSysMsgTemplRuntime;
				try {
					iSysMsgTemplRuntime2.installData(strMode);
				} catch (Throwable ex) {
					throw new Exception(String.format("系统消息模板[%1$s]安装数据发生异常，%2$s", iSysMsgTemplRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// // 数据库体系安装数据
		// java.util.List<IPSSysDBScheme> psSysDBSchemes =
		// this.getPSSystem().getAllPSSysDBSchemes();
		// if (psSysDBSchemes != null) {
		// for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
		// ISysDBSchemeRuntime iSysDBSchemeRuntime =
		// this.getSysDBSchemeRuntime(iPSSysDBScheme.getId(), false);
		// try {
		// iSysDBSchemeRuntime.install();
		// } catch (Throwable ex) {
		// throw new Exception(String.format("系统数据库体系[%1$s]安装数据发生异常，%2$s",
		// iSysDBSchemeRuntime.getName(), ex.getMessage()), ex);
		// }
		// }
		// }

		// // 大数据体系安装数据
		// java.util.List<IPSSysBDScheme> psSysBDSchemes =
		// this.getPSSystem().getAllPSSysBDSchemes();
		// if (psSysBDSchemes != null) {
		// for (IPSSysBDScheme iPSSysBDScheme : psSysBDSchemes) {
		// ISysBDSchemeRuntime iSysBDSchemeRuntime =
		// this.getSysBDSchemeRuntime(iPSSysBDScheme.getId(), false);
		// try {
		// iSysBDSchemeRuntime.install();
		// } catch (Throwable ex) {
		// throw new Exception(String.format("系统大数据体系[%1$s]安装数据发生异常，%2$s",
		// iSysBDSchemeRuntime.getName(), ex.getMessage()), ex);
		// }
		// }
		// }
		//
		// // 搜索体系安装数据
		// java.util.List<IPSSysSearchScheme> psSysSearchSchemes =
		// this.getPSSystem().getAllPSSysSearchSchemes();
		// if (psSysSearchSchemes != null) {
		// for (IPSSysSearchScheme iPSSysSearchScheme : psSysSearchSchemes) {
		// ISysSearchSchemeRuntime iSysSearchSchemeRuntime =
		// this.getSysSearchSchemeRuntime(iPSSysSearchScheme.getId(), false);
		// try {
		// iSysSearchSchemeRuntime.install();
		// } catch (Throwable ex) {
		// throw new Exception(String.format("系统搜索体系[%1$s]安装数据发生异常，%2$s",
		// iSysSearchSchemeRuntime.getName(), ex.getMessage()), ex);
		// }
		// }
		// }
		//
		// // 智能报表体系安装数据
		// java.util.List<IPSSysBIScheme> psSysBISchemes =
		// this.getPSSystem().getAllPSSysBISchemes();
		// if (psSysBISchemes != null) {
		// for (IPSSysBIScheme iPSSysBIScheme : psSysBISchemes) {
		// ISysBISchemeRuntime iSysBISchemeRuntime =
		// this.getSysBISchemeRuntime(iPSSysBIScheme.getId(), false);
		// try {
		// iSysBISchemeRuntime.install();
		// } catch (Throwable ex) {
		// throw new Exception(String.format("系统智能报表体系[%1$s]安装数据发生异常，%2$s",
		// iSysBISchemeRuntime.getName(), ex.getMessage()), ex);
		// }
		// }
		// }

		// 系统功能安装数据
		java.util.List<IPSSysUtil> psSysUtils = this.getPSSystem().getAllPSSysUtils();
		if (psSysUtils != null) {
			for (IPSSysUtil iPSSysUtil : psSysUtils) {
				ISysUtilRuntime iSysUtilRuntime = this.getSysUtilRuntime(iPSSysUtil.getId(), false);
				if (!(iSysUtilRuntime instanceof net.ibizsys.central.sysutil.ISysUtilRuntime)) {
					continue;
				}
				net.ibizsys.central.sysutil.ISysUtilRuntime iSysUtilRuntime2 = (net.ibizsys.central.sysutil.ISysUtilRuntime) iSysUtilRuntime;
				try {
					iSysUtilRuntime2.installData(strMode);
				} catch (Throwable ex) {
					throw new Exception(String.format("系统功能组件[%1$s]安装数据发生异常，%2$s", iSysUtilRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

	}

	@Override
	public Object getGlobalParam(String strKey) {
		return super.getGlobalParam(strKey);
	}

	private SystemRuntime getSelf() {
		return this;
	}

	@Override
	public String getServiceId() {
		return this.getDeploySystemId();
	}

	@Override
	public String getContextId() {
		return this.getDeploySystemId();
	}

	@Override
	public boolean isEnableTenantMode() {
		return this.bEnableTenantMode;
	}

	@Override
	protected net.ibizsys.central.ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	protected ISystemPersistentAdapter getSystemPersistentAdapter() {
		return this.iSystemPersistentAdapter;
	}

	protected ISystemPersistentAdapter internalGetSystemPersistentAdapter(IPSDataEntity iPSDataEntity) {
		return this.iSystemPersistentAdapter;
	}

	protected ISystemPersistentAdapter createSystemPersistentAdapter() {
		ISystemPersistentAdapter iSystemPersistentAdapter = this.getRuntimeObject(GLOBALPLUGIN_PERSISTENTADAPTER, ISystemPersistentAdapter.class, true, true);
		if (iSystemPersistentAdapter != null) {
			return iSystemPersistentAdapter;
		}

		iSystemPersistentAdapter = this.getRuntimeObject(ISystemPersistentAdapter.class, null);
		if (iSystemPersistentAdapter != null) {
			return iSystemPersistentAdapter;
		}

		return this.createDefaultSystemPersistentAdapter();
	}

	protected ISystemPersistentAdapter createDefaultSystemPersistentAdapter() {
		return new SystemPersistentAdapter();
	}

	protected ISystemLogAdapter getSystemLogAdapter() {
		return this.iSystemLogAdapter;
	}

	protected void setSystemLogAdapter(ISystemLogAdapter iSystemLogAdapter) {
		this.iSystemLogAdapter = iSystemLogAdapter;
	}

	protected void prepareSystemLogAdapter() throws Exception {
		ISystemLogAdapter iSystemLogAdapter = this.createSystemLogAdapter();
		if (iSystemLogAdapter != null) {
			iSystemLogAdapter.init(this.getSystemRuntimeContext());
			this.setSystemLogAdapter(iSystemLogAdapter);
		}
	}

	protected ISystemLogAdapter createSystemLogAdapter() {
		ISystemLogAdapter iSystemLogAdapter = this.getRuntimeObject(GLOBALPLUGIN_LOGADAPTER, ISystemLogAdapter.class, true, true);
		if (iSystemLogAdapter != null) {
			return iSystemLogAdapter;
		}

		iSystemLogAdapter = this.getRuntimeObject(ISystemLogAdapter.class, null);
		if (iSystemLogAdapter != null) {
			return iSystemLogAdapter;
		}

		return createDefaultSystemLogAdapter();
	}

	protected ISystemLogAdapter createDefaultSystemLogAdapter() {
		return new DefaultSystemLogAdapter();
	}

	@Override
	protected void setPSDynaInstServiceGlobal() {
		// 忽略设置动态实例服务全局对象
		// super.setPSDynaInstServiceGlobal();
	}

	@Override
	public String getDeploySystemId() {
		return this.strDeploySystemId;
	}

	@Override
	protected ISystemRTScriptContext createSystemRTScriptContext() {
		return new SystemRTScriptContext(this.getSystemRuntimeContext());
	}

	@Override
	public net.ibizsys.central.util.script.ISystemRTScriptContext getSystemRTScriptContext() {
		return (net.ibizsys.central.util.script.ISystemRTScriptContext) super.getSystemRTScriptContext();
	}

	protected ISystemRTGroovyContext createSystemRTGroovyContext() {
		return new SystemRTGroovyContext(this.getSystemRuntimeContext());
	}

	@Override
	public ISystemRTGroovyContext getSystemRTGroovyContext() {
		if (this.iSystemRTGroovyContext == null) {
			this.iSystemRTGroovyContext = createSystemRTGroovyContext();
		}
		return this.iSystemRTGroovyContext;
	}

	/**
	 * 准备系统设置
	 * 
	 * @throws Exception
	 */
	protected void prepareSystemSetting(Map<String, Object> map) throws Exception {
		this.setSystemRuntimeSetting(new SystemRuntimeSetting(this.getSystemRuntimeContext(), map));
	}

	/**
	 * 准备系统相关文件夹
	 * 
	 * @throws Exception
	 */
	protected void prepareSystemFolders() throws Exception {

		if (!StringUtils.hasLength(this.getFileFolder())) {
			if (StringUtils.hasLength(this.getSystemGatewayContext().getFileFolder())) {
				String strSystemFolder = this.getDeploySystemId();
				if (!StringUtils.hasLength(strSystemFolder)) {
					strSystemFolder = "default";
				}
				String strFileFolder = String.format("%1$s%2$s%3$s", this.getSystemGatewayContext().getFileFolder(), File.separator, strSystemFolder);
				File fileFolder = new File(strFileFolder);
				fileFolder.mkdirs();

				this.setFileFolder(strFileFolder);
			}
		}

		if (!StringUtils.hasLength(this.getTempFolder())) {
			if (StringUtils.hasLength(this.getSystemGatewayContext().getTempFolder())) {
				String strSystemFolder = this.getDeploySystemId();
				if (!StringUtils.hasLength(strSystemFolder)) {
					strSystemFolder = "default";
				}
				String strTempFolder = String.format("%1$s%2$s%3$s", this.getSystemGatewayContext().getTempFolder(), File.separator, strSystemFolder);
				File fileFolder = new File(strTempFolder);
				fileFolder.mkdirs();

				this.setTempFolder(strTempFolder);
			}
		}

		if (!StringUtils.hasLength(this.getReportFolder())) {
			if (StringUtils.hasLength(this.getSystemGatewayContext().getReportFolder())) {
				this.setReportFolder(this.getSystemGatewayContext().getReportFolder());
			}
		}

		if (!StringUtils.hasLength(this.getFontFolder())) {
			if (StringUtils.hasLength(this.getSystemGatewayContext().getFontFolder())) {
				this.setFontFolder(this.getSystemGatewayContext().getFontFolder());
			}
		}

	}

	protected Object getData() {
		return this.data;
	}

	protected ISystemGatewayContext getSystemGatewayContext() {
		return this.iSystemGatewayContext;
	}

	@Override
	protected IPSSystemService createPSSystemService() throws Exception {
		throw new Exception("没有实现");
	}

	@Override
	protected IPSDynaInstService createPSDynaInstService(String strPSDynaInstId) throws Exception {
		return null;
	}

	/**
	 * 建立实体运行时对象
	 * 
	 * @param iPSDataEntity
	 * @return
	 * @throws Exception
	 */
	protected IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity) {

		Assert.notNull(iPSDataEntity, "实体模型对象无效");

		IDataEntityRuntime iDataEntityRuntime = this.getRuntimeObject(iPSDataEntity.getPSSysSFPlugin(), IDataEntityRuntime.class, true);
		if (iDataEntityRuntime != null) {
			return iDataEntityRuntime;
		}

		if (iPSDataEntity.getPSSystemModule() != null) {
			ISystemModuleRuntime iSystemModuleRuntime = this.getSystemModuleRuntime(iPSDataEntity.getPSSystemModule().getId(), false);
			if (iSystemModuleRuntime instanceof ISystemModuleUtilRuntime) {
				iDataEntityRuntime = ((ISystemModuleUtilRuntime) iSystemModuleRuntime).createDataEntityRuntime(iPSDataEntity);
				if (iDataEntityRuntime != null) {
					return iDataEntityRuntime;
				}
			}
		}

		// 获取运行时模型提供器
		Map<String, IModelRuntimeProvider> providers = this.getAddins(IModelRuntimeProvider.class, ADDIN_MODELRUNTIMEPROVIDER_PREFIX);
		if (!ObjectUtils.isEmpty(providers)) {
			for (IModelRuntimeProvider iModelRuntimeProvider : providers.values()) {
				iDataEntityRuntime = iModelRuntimeProvider.createDataEntityRuntime(iPSDataEntity);
				if (iDataEntityRuntime != null) {
					return iDataEntityRuntime;
				}
			}
		}

		iDataEntityRuntime = this.getRuntimeObject(GLOBALPLUGIN_DATAENTITYRUNTIME, IDataEntityRuntime.class, true, true);
		if (iDataEntityRuntime != null) {
			return iDataEntityRuntime;
		}

		return createDefaultDataEntityRuntime(iPSDataEntity);
	}

	/**
	 * 建立默认实体运行时对象
	 * 
	 * @param iPSDataEntity
	 * @return
	 */
	protected IDataEntityRuntime createDefaultDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		return this.createDefaultDataEntityRuntime();
	}

	/**
	 * 建立默认实体运行时对象
	 * 
	 * @return
	 */
	protected IDataEntityRuntime createDefaultDataEntityRuntime() {
		return new DataEntityRuntime();
	}

	@Override
	protected ISysMsgQueueRuntime onCreateSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue) {
		if (SysMsgQueueTypes.RUNTIME.equals(iPSSysMsgQueue.getMsgQueueType())) {
			return new SysRTMsgQueueRuntime();
		}
		return super.onCreateSysMsgQueueRuntime(iPSSysMsgQueue);
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime(String strIdOrName, boolean bTryMode) {
		Assert.hasLength(strIdOrName, "传入实体标识无效");
		net.ibizsys.runtime.dataentity.IDataEntityRuntime iDataEntityRuntime = this.dataEntityRuntimeMap.get(strIdOrName);
		if (iDataEntityRuntime != null) {
			return (IDataEntityRuntime) iDataEntityRuntime;
		}

		iDataEntityRuntime = this.dataEntityRuntimeMap.get(strIdOrName.toLowerCase());
		if (iDataEntityRuntime != null) {
			return (IDataEntityRuntime) iDataEntityRuntime;
		}

		IPSDataEntity iPSDataEntity = psDataEntityMap.get(strIdOrName);
		if (iPSDataEntity == null) {
			iPSDataEntity = psDataEntityMap.get(strIdOrName.toLowerCase());
			if (iPSDataEntity == null) {
				if (bTryMode) {
					return null;
				}
				throw new SystemRuntimeException(this, String.format("无法获取指定实体[%1$s]模型对象", strIdOrName));
			}
		}

		IDataEntityRuntime centralDataEntityRuntime = this.createDataEntityRuntime(iPSDataEntity);
		try {
			centralDataEntityRuntime.init(this.getSystemRuntimeContext(), iPSDataEntity, null);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化实体[%1$s]运行时对象发生异常，%2$s", iPSDataEntity.getName(), ex.getMessage()), ex);
		}

		registerDataEntityRuntime(centralDataEntityRuntime, iPSDataEntity);
		return centralDataEntityRuntime;

	}

	protected void registerDataEntityRuntime(IDataEntityRuntime iDataEntity, IPSDataEntity iPSDataEntity) {
		this.registerDataEntityRuntime(iDataEntity);
		if (StringUtils.hasLength(iDataEntity.getId())) {
			this.dataEntityRuntimeMap.put(iDataEntity.getId(), iDataEntity);
		}

		if (StringUtils.hasLength(iDataEntity.getName())) {
			this.dataEntityRuntimeMap.put(iDataEntity.getName().toLowerCase(), iDataEntity);
			if (iPSDataEntity.getPSSystemModule() != null) {
				this.dataEntityRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSDataEntity.getPSSystemModule(), iPSDataEntity.getName()), iDataEntity);
			}
		}

		if (StringUtils.hasLength(iPSDataEntity.getCodeName())) {
			if (!this.dataEntityRuntimeMap.containsKey(iPSDataEntity.getCodeName().toLowerCase())) {
				this.dataEntityRuntimeMap.put(iPSDataEntity.getCodeName().toLowerCase(), iDataEntity);
			}
		}
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime(String strIdOrName) {
		return (IDataEntityRuntime) super.getDataEntityRuntime(strIdOrName);
	}

	@Override
	public Object invokeDEMethod(String strDataEntityName, String strMethodName, Object objArg, IUserContext iUserContext, Object objTag) throws Throwable {

		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getDataEntityRuntime(strDataEntityName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iDataEntityRuntime.invokeMethod(strMethodName, objArg, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIImportData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEImportData(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIImportData2(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEImportData2(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIGetImportTemplate(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEGetImportTemplate(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIExportData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIExportData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIPrintData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEPrintData(strScope, strParentDEName, strParentKey, strDataEntityName, strPrintTag, strPrintType, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIWFStart(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEWFStart(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIWFCancel(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEWFCancel(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIDownloadFile(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEDownloadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAPIUploadFile(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEUploadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public ISysServiceAPIRuntime getSysServiceAPIRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入服务接口标记无效");
		ISysServiceAPIRuntime iSysServiceAPIRuntime = null;
		if (this.sysServiceAPIRuntimeMap != null) {
			iSysServiceAPIRuntime = this.sysServiceAPIRuntimeMap.get(strTag);
			if (iSysServiceAPIRuntime == null) {
				iSysServiceAPIRuntime = this.sysServiceAPIRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iSysServiceAPIRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定系统服务接口[%1$s]运行时对象", strTag));
		}
		return iSysServiceAPIRuntime;
	}

	protected ISysServiceAPIRuntime registerPSSysServiceAPI(IPSSysServiceAPI iPSSysServiceAPI) {

		if (this.sysServiceAPIRuntimeMap != null) {
			ISysServiceAPIRuntime iSysServiceAPIRuntime = this.sysServiceAPIRuntimeMap.get(iPSSysServiceAPI.getId());
			if (iSysServiceAPIRuntime != null) {
				return iSysServiceAPIRuntime;
			}
		}

		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.createSysServiceAPIRuntime(iPSSysServiceAPI);
		if (iSysServiceAPIRuntime == null) {
			return null;
		}
		try {
			iSysServiceAPIRuntime.init(this.getSystemRuntimeContext(), iPSSysServiceAPI);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统服务接口[%1$s]运行时对象发生异常，%2$s", iPSSysServiceAPI.getName(), ex.getMessage()), ex);
		}
		if (this.sysServiceAPIRuntimeMap == null) {
			this.sysServiceAPIRuntimeMap = new HashMap<>();
		}
		this.sysServiceAPIRuntimeMap.put(iPSSysServiceAPI.getCodeName().toUpperCase(), iSysServiceAPIRuntime);
		this.sysServiceAPIRuntimeMap.put(iPSSysServiceAPI.getId(), iSysServiceAPIRuntime);
		return iSysServiceAPIRuntime;
	}

	@Override
	public ISysServiceAPIRuntime createSysServiceAPIRuntime(IPSSysServiceAPI iPSSysServiceAPI) {
		Assert.notNull(iPSSysServiceAPI, "传入系统服务接口模型对象无效");
		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.getRuntimeObject(iPSSysServiceAPI.getPSSysSFPlugin(), ISysServiceAPIRuntime.class, true);
		if (iSysServiceAPIRuntime != null) {
			return iSysServiceAPIRuntime;
		}

		return createDefaultSysServiceAPIRuntime(iPSSysServiceAPI);
	}

	protected ISysServiceAPIRuntime createDefaultSysServiceAPIRuntime(IPSSysServiceAPI iPSSysServiceAPI) {
		return createDefaultSysServiceAPIRuntime();
	}

	protected ISysServiceAPIRuntime createDefaultSysServiceAPIRuntime() {
		return new SysServiceAPIRuntime();
	}

	@Override
	public IApplicationRuntime getApplicationRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入前端应用标记无效");
		IApplicationRuntime iApplicationRuntime = null;
		if (this.applicationRuntimeMap != null) {
			iApplicationRuntime = this.applicationRuntimeMap.get(strTag);
			if (iApplicationRuntime == null) {
				iApplicationRuntime = this.applicationRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iApplicationRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定系统前端应用[%1$s]运行时对象", strTag));
		}
		return iApplicationRuntime;
	}

	protected IApplicationRuntime registerPSApplication(IPSApplication iPSApplication) {
		if (this.applicationRuntimeMap != null) {
			IApplicationRuntime iApplicationRuntime = this.applicationRuntimeMap.get(iPSApplication.getId());
			if (iApplicationRuntime != null) {
				return iApplicationRuntime;
			}
		}

		IApplicationRuntime iApplicationRuntime = this.createApplicationRuntime(iPSApplication);
		if (iApplicationRuntime == null) {
			return null;
		}
		try {
			iApplicationRuntime.init(this.getSystemRuntimeContext(), iPSApplication);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统前端应用[%1$s]运行时对象发生异常，%2$s", iPSApplication.getName(), ex.getMessage()), ex);
		}
		if (this.applicationRuntimeMap == null) {
			this.applicationRuntimeMap = new HashMap<>();
		}
		this.applicationRuntimeMap.put(iPSApplication.getCodeName().toUpperCase(), iApplicationRuntime);
		this.applicationRuntimeMap.put(iPSApplication.getId(), iApplicationRuntime);
		return iApplicationRuntime;
	}

	protected IApplicationRuntime createApplicationRuntime(IPSApplication iPSApplication) {

		IApplicationRuntime iApplicationRuntime = this.getRuntimeObject(iPSApplication.getPSSysSFPlugin(), IApplicationRuntime.class, true);
		if (iApplicationRuntime != null) {
			return iApplicationRuntime;
		}

		return createDefaultApplicationRuntime(iPSApplication);
	}

	/**
	 * 建立应用运行时对象
	 * 
	 * @param iPSApplication
	 * @return
	 */
	protected IApplicationRuntime createDefaultApplicationRuntime(IPSApplication iPSApplication) {
		return this.createDefaultApplicationRuntime();
	}

	/**
	 * 建立应用运行时对象
	 * 
	 * @return
	 */
	protected IApplicationRuntime createDefaultApplicationRuntime() {
		return new ApplicationRuntime();
	}

	@Override
	public ISysBackendTaskRuntime getSysBackendTaskRuntime(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag, "传入后台任务标记无效");
		ISysBackendTaskRuntime iSysBackendTaskRuntime = null;
		if (this.sysBackendTaskRuntimeMap != null) {
			iSysBackendTaskRuntime = this.sysBackendTaskRuntimeMap.get(strTag);
			if (iSysBackendTaskRuntime == null) {
				iSysBackendTaskRuntime = this.sysBackendTaskRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iSysBackendTaskRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定系统后台任务[%1$s]运行时对象", strTag));
		}
		return iSysBackendTaskRuntime;
	}

	@Override
	public ISysBackendTaskRuntime getSysBackendTaskRuntime(IPSSysBackService iPSSysBackService) {
		Assert.notNull(iPSSysBackService, "传入后台任务模型对象无效");
		return registerPSSysBackService(iPSSysBackService);
	}

	protected ISysBackendTaskRuntime registerPSSysBackService(IPSSysBackService iPSSysBackService) {
		if (this.sysBackendTaskRuntimeMap != null) {
			ISysBackendTaskRuntime iSysBackendTaskRuntime = this.sysBackendTaskRuntimeMap.get(iPSSysBackService.getId());
			if (iSysBackendTaskRuntime != null) {
				return iSysBackendTaskRuntime;
			}
		}
		ISysBackendTaskRuntime iSysBackendTaskRuntime = this.createSysBackendTaskRuntime(iPSSysBackService);
		if (iSysBackendTaskRuntime == null) {
			return null;
		}
		try {
			iSysBackendTaskRuntime.init(this.getSystemRuntimeContext(), iPSSysBackService);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统后台任务[%1$s]运行时对象发生异常，%2$s", iPSSysBackService.getName(), ex.getMessage()), ex);
		}
		if (this.sysBackendTaskRuntimeMap == null) {
			this.sysBackendTaskRuntimeMap = new HashMap<>();
		}

		if (StringUtils.hasLength(iPSSysBackService.getTaskType())) {
			if (SysBackendTaskTypes.PREDEFINED.equals(iPSSysBackService.getTaskType())) {
				this.sysBackendTaskRuntimeMap.put(String.format("%1$s|%2$s", iPSSysBackService.getTaskType(), iPSSysBackService.getPredefinedType()).toUpperCase(), iSysBackendTaskRuntime);
			} else {
				this.sysBackendTaskRuntimeMap.put(String.format("%1$s|%2$s", iPSSysBackService.getTaskType(), iPSSysBackService.getCodeName()).toUpperCase(), iSysBackendTaskRuntime);
			}
		}
		this.sysBackendTaskRuntimeMap.put(iPSSysBackService.getId(), iSysBackendTaskRuntime);
		return iSysBackendTaskRuntime;
	}

	@Override
	public ISysBackendTaskRuntime createSysBackendTaskRuntime(IPSSysBackService iPSSysBackService) {
		Assert.notNull(iPSSysBackService, "传入后台任务模型对象无效");
		ISysBackendTaskRuntime iSysBackendTaskRuntime = this.getRuntimeObject(iPSSysBackService.getPSSysSFPlugin(), ISysBackendTaskRuntime.class, true);
		if (iSysBackendTaskRuntime != null) {
			return iSysBackendTaskRuntime;
		}
		
//		if(iPSSysBackService.getPSSystemModule()!=null) {
//			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysBDScheme.getPSSystemModuleMust().getId(), true);
//			if(iSystemModuleUtilRuntime != null) {
//				iSysBDSchemeRuntime = iSystemModuleUtilRuntime.createSysBDSchemeRuntime(iPSSysBDScheme);
//				if (iSysBDSchemeRuntime != null) {
//					return iSysBDSchemeRuntime;
//				}
//			}
//		}

		return onCreateSysBackendTaskRuntime(iPSSysBackService);

	}

	protected ISysBackendTaskRuntime onCreateSysBackendTaskRuntime(IPSSysBackService iPSSysBackService) {

		if (StringUtils.hasLength(iPSSysBackService.getTaskType())) {
			if (SysBackendTaskTypes.PREDEFINED.equals(iPSSysBackService.getTaskType())) {
				String strType = String.format("%1$s:%2$s", SysBackendTaskTypes.PREDEFINED, iPSSysBackService.getPredefinedType());
				ISysBackendTaskRuntime iSysBackendTaskRuntime = this.getRuntimeObject(ISysBackendTaskRuntime.class, strType);
				if (iSysBackendTaskRuntime != null) {
					return iSysBackendTaskRuntime;
				}
			}
			ISysBackendTaskRuntime iSysBackendTaskRuntime = this.getRuntimeObject(ISysBackendTaskRuntime.class, iPSSysBackService.getTaskType());
			if (iSysBackendTaskRuntime != null) {
				return iSysBackendTaskRuntime;
			}
		}
		
		if (StringUtils.hasLength(iPSSysBackService.getTaskType())) {
			if (SysBackendTaskTypes.PREDEFINED.equals(iPSSysBackService.getTaskType())) {
				if (SysBackendTaskPredefinedTypes.DENOTIFY.equals(iPSSysBackService.getPredefinedType())) {
					return new SysDENotifyBackendTaskRuntime();
				}

				if (SysBackendTaskPredefinedTypes.SYSADMIN.equals(iPSSysBackService.getPredefinedType())) {
					return new SysAdminBackendTaskRuntime();
				}

				if (SysBackendTaskPredefinedTypes.SYSDATASYNCAGENT.equals(iPSSysBackService.getPredefinedType())) {
					return new SysDataSyncAgentBackendTaskRuntime();
				}

				if (SysBackendTaskPredefinedTypes.WFCALLBACK.equals(iPSSysBackService.getPredefinedType())) {
					return new SysWFCallbackBackendTaskRuntime();
				}

				throw new SystemRuntimeException(this, String.format("无法识别的系统后台任务[%1$s]预定义类型[%2$s]", iPSSysBackService.getName(), iPSSysBackService.getPredefinedType()));
			}

			if (SysBackendTaskTypes.DEACTION.equals(iPSSysBackService.getTaskType())) {
				return new SysDEActionBackendTaskRuntime();
			}
		}

		return createDefaultSysBackendTaskRuntime(iPSSysBackService);
	}

	/**
	 * 建立默认系统后台作业运行时对象
	 * 
	 * @param iPSSysBackService
	 * @return
	 */
	protected ISysBackendTaskRuntime createDefaultSysBackendTaskRuntime(IPSSysBackService iPSSysBackService) {
		return this.createDefaultSysBackendTaskRuntime();
	}

	/**
	 * 建立默认系统后台作业运行时对象
	 * 
	 * @return
	 */
	protected ISysBackendTaskRuntime createDefaultSysBackendTaskRuntime() {
		return new SysUserBackendTaskRuntime();
	}

	@Override
	public ISysDBSchemeRuntime getSysDBSchemeRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入数据库体系标记无效");
		ISysDBSchemeRuntime iSysDBSchemeRuntime = null;
		if (this.sysDBSchemeRuntimeMap != null) {
			iSysDBSchemeRuntime = this.sysDBSchemeRuntimeMap.get(strTag);
			if (iSysDBSchemeRuntime == null) {
				iSysDBSchemeRuntime = this.sysDBSchemeRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysDBSchemeRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定数据库体系[%1$s]运行时对象", strTag));
		}
		return iSysDBSchemeRuntime;
	}

	@Override
	public ISysDBSchemeRuntime getSysDBSchemeRuntime(IPSSysDBScheme iPSSysDBScheme) {
		Assert.notNull(iPSSysDBScheme, "传入数据库体系模型对象无效");
		return getSysDBSchemeRuntime(iPSSysDBScheme.getId(), false);
	}

	protected ISysDBSchemeRuntime registerPSSysDBScheme(IPSSysDBScheme iPSSysDBScheme) {

		if (this.sysDBSchemeRuntimeMap != null) {
			ISysDBSchemeRuntime iSysDBSchemeRuntime = this.sysDBSchemeRuntimeMap.get(iPSSysDBScheme.getId());
			if (iSysDBSchemeRuntime != null) {
				return iSysDBSchemeRuntime;
			}
		}

		ISysDBSchemeRuntime iSysDBSchemeRuntime = this.createSysDBSchemeRuntime(iPSSysDBScheme);
		if (iSysDBSchemeRuntime == null) {
			return null;
		}
		try {
			iSysDBSchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysDBScheme);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化数据库体系[%1$s]运行时对象发生异常，%2$s", iPSSysDBScheme.getName(), ex.getMessage()), ex);
		}
		if (this.sysDBSchemeRuntimeMap == null) {
			this.sysDBSchemeRuntimeMap = new HashMap<>();
		}
		this.sysDBSchemeRuntimeMap.put(iPSSysDBScheme.getId(), iSysDBSchemeRuntime);
		if (StringUtils.hasLength(iPSSysDBScheme.getCodeName())) {
			this.sysDBSchemeRuntimeMap.put(iPSSysDBScheme.getCodeName().toLowerCase(), iSysDBSchemeRuntime);
			// if (iPSSysDBScheme.getPSSystemModule() != null) {
			// this.sysDBSchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysDBScheme.getPSSystemModule(),
			// iPSSysDBScheme.getCodeName()), iSysDBSchemeRuntime);
			// }
			if (iPSSysDBScheme.getPSSysModelGroup() != null) {
				this.sysDBSchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysDBScheme.getPSSysModelGroup(), iPSSysDBScheme.getCodeName()), iSysDBSchemeRuntime);
			}
		}
		return iSysDBSchemeRuntime;
	}

	@Override
	public ISysDBSchemeRuntime createSysDBSchemeRuntime(IPSSysDBScheme iPSSysDBScheme) {
		
		Assert.notNull(iPSSysDBScheme, "系统大数据体系模型对象无效");
		
		ISysDBSchemeRuntime iSysDBSchemeRuntime = this.getRuntimeObject(iPSSysDBScheme.getPSSysSFPlugin(), ISysDBSchemeRuntime.class, true);
		if (iSysDBSchemeRuntime != null) {
			return iSysDBSchemeRuntime;
		}

		return this.onCreateSysDBSchemeRuntime(iPSSysDBScheme);		
	}
	
	protected ISysDBSchemeRuntime onCreateSysDBSchemeRuntime(IPSSysDBScheme iPSSysDBScheme) {
		return createDefaultSysDBSchemeRuntime(iPSSysDBScheme);
	}
	
	protected ISysDBSchemeRuntime createDefaultSysDBSchemeRuntime(IPSSysDBScheme iPSSysDBScheme) {
		return this.createDefaultSysDBSchemeRuntime();
	}

	protected ISysDBSchemeRuntime createDefaultSysDBSchemeRuntime() {
		return new SysDBSchemeRuntime();
	}

	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme) {
		Assert.notNull(iPSSysBDScheme, "传入大数据体系模型对象无效");
		return registerPSSysBDScheme(iPSSysBDScheme);
	}

	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入大数据体系标记无效");
		ISysBDSchemeRuntime iSysBDSchemeRuntime = null;
		if (this.sysBDSchemeRuntimeMap != null) {
			iSysBDSchemeRuntime = this.sysBDSchemeRuntimeMap.get(strTag);
			if (iSysBDSchemeRuntime == null) {
				iSysBDSchemeRuntime = this.sysBDSchemeRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysBDSchemeRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定大数据体系[%1$s]运行时对象", strTag));
		}
		return iSysBDSchemeRuntime;
	}

	protected ISysBDSchemeRuntime registerPSSysBDScheme(IPSSysBDScheme iPSSysBDScheme) {

		if (this.sysBDSchemeRuntimeMap != null) {
			ISysBDSchemeRuntime iSysBDSchemeRuntime = this.sysBDSchemeRuntimeMap.get(iPSSysBDScheme.getId());
			if (iSysBDSchemeRuntime != null) {
				return iSysBDSchemeRuntime;
			}
		}

		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.createSysBDSchemeRuntime(iPSSysBDScheme);
		if (iSysBDSchemeRuntime == null) {
			return null;
		}
		try {
			iSysBDSchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysBDScheme);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化大数据体系[%1$s]运行时对象发生异常，%2$s", iPSSysBDScheme.getName(), ex.getMessage()), ex);
		}
		if (this.sysBDSchemeRuntimeMap == null) {
			this.sysBDSchemeRuntimeMap = new HashMap<>();
		}
		this.sysBDSchemeRuntimeMap.put(iPSSysBDScheme.getId(), iSysBDSchemeRuntime);
		if (StringUtils.hasLength(iPSSysBDScheme.getCodeName())) {
			this.sysBDSchemeRuntimeMap.put(iPSSysBDScheme.getCodeName().toLowerCase(), iSysBDSchemeRuntime);
			if (iPSSysBDScheme.getPSSystemModule() != null) {
				this.sysBDSchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysBDScheme.getPSSystemModule(), iPSSysBDScheme.getCodeName()), iSysBDSchemeRuntime);
				// 注册模块默认大数据体系
				this.sysBDSchemeRuntimeMap.put(iPSSysBDScheme.getPSSystemModule().getId(), iSysBDSchemeRuntime);
			} else if (iPSSysBDScheme.getPSSysModelGroup() != null) {
				this.sysBDSchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysBDScheme.getPSSysModelGroup(), iPSSysBDScheme.getCodeName()), iSysBDSchemeRuntime);
				// 注册模型组默认大数据体系
				this.sysBDSchemeRuntimeMap.put(iPSSysBDScheme.getPSSysModelGroup().getId(), iSysBDSchemeRuntime);
			}
		}
		return iSysBDSchemeRuntime;
	}

	@Override
	public ISysBDSchemeRuntime createSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme) {
		Assert.notNull(iPSSysBDScheme, "传入大数据体系模型对象无效");
		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getRuntimeObject(iPSSysBDScheme.getPSSysSFPlugin(), ISysBDSchemeRuntime.class, true);
		if (iSysBDSchemeRuntime != null) {
			return iSysBDSchemeRuntime;
		}
		
		if(iPSSysBDScheme.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysBDScheme.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysBDSchemeRuntime = iSystemModuleUtilRuntime.createSysBDSchemeRuntime(iPSSysBDScheme);
				if (iSysBDSchemeRuntime != null) {
					return iSysBDSchemeRuntime;
				}
			}
		}

		return this.onCreateSysBDSchemeRuntime(iPSSysBDScheme);

	}
	
	protected ISysBDSchemeRuntime onCreateSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme) {
		// 判断数据库类型
		String strConfigFolder = SysBDSchemeRuntime.getConfigFolder(iPSSysBDScheme);
		String strBDType = this.getSystemRuntimeSetting().getParam(strConfigFolder + ".bdtype", iPSSysBDScheme.getBDType());

		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getRuntimeObject(ISysBDSchemeRuntime.class, strBDType);
		if (iSysBDSchemeRuntime != null) {
			return iSysBDSchemeRuntime;
		}

		return createDefaultSysBDSchemeRuntime(iPSSysBDScheme);
	}

	protected ISysBDSchemeRuntime createDefaultSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme) {
		return this.createDefaultSysBDSchemeRuntime();
	}

	protected ISysBDSchemeRuntime createDefaultSysBDSchemeRuntime() {
		return new SysBDSchemeRuntime();
	}

	protected void prepareDefaultSysBDSchemeRuntime() throws Exception {
		// 准备默认大数据体系，判断是否存在配置
		IPSSysBDScheme iPSSysBDScheme = SysBDSchemeRuntime.getDefaultPSSysBDScheme(this.getSystemRuntimeContext());
		String strConfigFolder = SysBDSchemeRuntime.getConfigFolder(iPSSysBDScheme);
		String strBDType = this.getSystemRuntimeSetting().getParam(strConfigFolder + ".bdtype", iPSSysBDScheme.getBDType());
		if (!StringUtils.hasLength(strBDType)) {
			return;
		}

		ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getRuntimeObject(ISysBDSchemeRuntime.class, strBDType);
		if (iSysBDSchemeRuntime == null) {
			return;
		}

		try {
			iSysBDSchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysBDScheme);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化大数据体系[%1$s]运行时对象发生异常，%2$s", iPSSysBDScheme.getName(), ex.getMessage()), ex);
		}

		this.setDefaultSysBDSchemeRuntime(iSysBDSchemeRuntime);
	}

	@Override
	public ISysBDSchemeRuntime getDefaultSysBDSchemeRuntime() {
		return this.defaultSysBDSchemeRuntime;
	}

	protected void setDefaultSysBDSchemeRuntime(ISysBDSchemeRuntime defaultSysBDSchemeRuntime) {
		this.defaultSysBDSchemeRuntime = defaultSysBDSchemeRuntime;
	}

	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntime(IDataEntityRuntime iDataEntityRuntime) {

		try {
			IPSSystemModule iPSSystemModule = iDataEntityRuntime.getPSDataEntity().getPSSystemModuleMust();
			ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(iPSSystemModule.getId(), true);
			if (iSysBDSchemeRuntime != null) {
				return iSysBDSchemeRuntime;
			}

			if (iPSSystemModule.getPSSysModelGroup() != null) {
				iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(iPSSystemModule.getPSSysModelGroup().getId(), true);
				if (iSysBDSchemeRuntime != null) {
					return iSysBDSchemeRuntime;
				}
			}
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("计算实体[%1$s]大数据库运行时对象发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
		}

		return getDefaultSysBDSchemeRuntime();
	}

	@Override
	public ISystemModuleRuntime getSystemModuleRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入系统模块标记无效");
		ISystemModuleRuntime iSystemModuleRuntime = null;
		if (this.systemModuleRuntimeMap != null) {
			iSystemModuleRuntime = this.systemModuleRuntimeMap.get(strTag);
			if (iSystemModuleRuntime == null) {
				iSystemModuleRuntime = this.systemModuleRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iSystemModuleRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定系统模块[%1$s]运行时对象", strTag));
		}
		return iSystemModuleRuntime;
	}

	protected ISystemModuleRuntime registerPSSystemModule(IPSSystemModule iPSSystemModule) {

		if (this.systemModuleRuntimeMap != null) {
			ISystemModuleRuntime iSystemModuleRuntime = this.systemModuleRuntimeMap.get(iPSSystemModule.getId());
			if (iSystemModuleRuntime != null) {
				return iSystemModuleRuntime;
			}
		}

		ISystemModuleRuntime iSystemModuleRuntime = this.createSystemModuleRuntime(iPSSystemModule);
		if (iSystemModuleRuntime == null) {
			return null;
		}
		try {
			iSystemModuleRuntime.init(this.getSystemRuntimeContext(), iPSSystemModule);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统模块[%1$s]运行时对象发生异常，%2$s", iPSSystemModule.getName(), ex.getMessage()), ex);
		}
		if (this.systemModuleRuntimeMap == null) {
			this.systemModuleRuntimeMap = new HashMap<>();
		}
		this.systemModuleRuntimeMap.put(iPSSystemModule.getId(), iSystemModuleRuntime);
		return iSystemModuleRuntime;
	}

	protected ISystemModuleRuntime createSystemModuleRuntime(IPSSystemModule iPSSystemModule) {

		ISystemModuleRuntime iSystemModuleRuntime = this.getRuntimeObject(iPSSystemModule.getPSSysSFPlugin(), ISystemModuleRuntime.class, true);
		if (iSystemModuleRuntime != null) {
			return iSystemModuleRuntime;
		}

		if (StringUtils.hasLength(iPSSystemModule.getUtilType())) {
			iSystemModuleRuntime = createSystemModuleUtilRuntime(iPSSystemModule);
			if (iSystemModuleRuntime != null) {
				return iSystemModuleRuntime;
			}
		}

		return createDefaultSystemModuleRuntime(iPSSystemModule);
	}

	protected ISystemModuleRuntime createSystemModuleUtilRuntime(IPSSystemModule iPSSystemModule) {

		ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getRuntimeObject(ISystemModuleUtilRuntime.class, iPSSystemModule.getUtilType());
		if (iSystemModuleUtilRuntime == null) {
			throw new SystemRuntimeException(this, String.format("无法指定类型[%1$s]系统模块功能运行时", iPSSystemModule.getUtilType()));
		}

		return (ISystemModuleRuntime) iSystemModuleUtilRuntime;
	}

	protected ISystemModuleRuntime createDefaultSystemModuleRuntime(IPSSystemModule iPSSystemModule) {
		return this.createDefaultSystemModuleRuntime();
	}

	protected ISystemModuleRuntime createDefaultSystemModuleRuntime() {
		return new SystemModuleRuntime();
	}

	protected ISysResourceRuntime registerPSSysResource(IPSSysResource iPSSysResource) {
		Assert.notNull(iPSSysResource, "传入预置资源模型对象无效");
		if (this.sysResourceRuntimeMap != null) {
			ISysResourceRuntime iSysResourceRuntime = this.sysResourceRuntimeMap.get(iPSSysResource.getId());
			if (iSysResourceRuntime != null) {
				return iSysResourceRuntime;
			}
		}

		ISysResourceRuntime iSysResourceRuntime = this.createSysResourceRuntime(iPSSysResource);
		if (iSysResourceRuntime == null) {
			return null;
		}
		try {
			iSysResourceRuntime.init(this.getSystemRuntimeContext(), iPSSysResource);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统资源[%1$s]运行时对象发生异常，%2$s", iPSSysResource.getName(), ex.getMessage()), ex);
		}
		if (this.sysResourceRuntimeMap == null) {
			this.sysResourceRuntimeMap = new HashMap<>();
		}
		this.sysResourceRuntimeMap.put(iPSSysResource.getId(), iSysResourceRuntime);
		String strCodeName = iPSSysResource.getResTag();
		if (StringUtils.hasLength(strCodeName)) {
			this.sysResourceRuntimeMap.put(strCodeName.toLowerCase(), iSysResourceRuntime);
			if (iPSSysResource.getPSSystemModule() != null) {
				this.sysResourceRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysResource.getPSSystemModule(), strCodeName), iSysResourceRuntime);
			}
		}
		return iSysResourceRuntime;
	}

	@Override
	public ISysResourceRuntime createSysResourceRuntime(IPSSysResource iPSSysResource) {
		Assert.notNull(iPSSysResource, "传入预置资源模型对象无效");
		ISysResourceRuntime iSysResourceRuntime = this.getRuntimeObject(iPSSysResource.getPSSysSFPlugin(), ISysResourceRuntime.class, true);
		if (iSysResourceRuntime != null) {
			return iSysResourceRuntime;
		}
		
		if(iPSSysResource.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysResource.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysResourceRuntime = iSystemModuleUtilRuntime.createSysResourceRuntime(iPSSysResource);
				if (iSysResourceRuntime != null) {
					return iSysResourceRuntime;
				}
			}
		}
		
		return this.onCreateSysResourceRuntime(iPSSysResource);
	}
	
	protected ISysResourceRuntime onCreateSysResourceRuntime(IPSSysResource iPSSysResource) {
		// 判断资源类型
		String strConfigFolder = SysResourceRuntime.getConfigFolder(iPSSysResource);
		String strResourceType = this.getSystemRuntimeSetting().getParam(strConfigFolder + ".resourcetype", iPSSysResource.getResourceType());

		ISysResourceRuntime iSysResourceRuntime = this.getRuntimeObject(ISysResourceRuntime.class, strResourceType);
		if (iSysResourceRuntime != null) {
			return iSysResourceRuntime;
		}

		return createDefaultSysResourceRuntime(iPSSysResource);
	}

	protected ISysResourceRuntime createDefaultSysResourceRuntime(IPSSysResource iPSSysResource) {
		return this.createDefaultSysResourceRuntime();
	}

	protected ISysResourceRuntime createDefaultSysResourceRuntime() {
		return new SysResourceRuntime();
	}

	@Override
	public ISysResourceRuntime getSysResourceRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入预置资源模型标记无效");
		ISysResourceRuntime iSysResourceRuntime = null;
		if (this.sysResourceRuntimeMap != null) {
			iSysResourceRuntime = this.sysResourceRuntimeMap.get(strTag);
			if (iSysResourceRuntime == null) {
				iSysResourceRuntime = this.sysResourceRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysResourceRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定预置资源[%1$s]运行时对象", strTag));
		}
		return iSysResourceRuntime;
	}

	@Override
	public ISysResourceRuntime getSysResourceRuntime(IPSSysResource iPSSysResource) {
		// Assert.notNull(iPSSysResource, "传入预置资源模型对象无效");
		// return getSysResourceRuntime(iPSSysResource.getId(), false);
		return this.registerPSSysResource(iPSSysResource);
	}

	protected ISysUniStateRuntime registerPSSysUniState(IPSSysUniState iPSSysUniState) {
		Assert.notNull(iPSSysUniState, "传入统一状态模型对象无效");
		if (this.sysUniStateRuntimeMap != null) {
			ISysUniStateRuntime iSysUniStateRuntime = this.sysUniStateRuntimeMap.get(iPSSysUniState.getId());
			if (iSysUniStateRuntime != null) {
				return iSysUniStateRuntime;
			}
		}

		ISysUniStateRuntime iSysUniStateRuntime = this.createSysUniStateRuntime(iPSSysUniState);
		if (iSysUniStateRuntime == null) {
			return null;
		}
		try {
			iSysUniStateRuntime.init(this.getSystemRuntimeContext(), iPSSysUniState);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统统一状态[%1$s]运行时对象发生异常，%2$s", iPSSysUniState.getName(), ex.getMessage()), ex);
		}
		if (this.sysUniStateRuntimeMap == null) {
			this.sysUniStateRuntimeMap = new HashMap<>();
		}
		this.sysUniStateRuntimeMap.put(iPSSysUniState.getId(), iSysUniStateRuntime);
		String strCodeName = iPSSysUniState.getUniqueTag();
		if (StringUtils.hasLength(strCodeName)) {
			this.sysUniStateRuntimeMap.put(strCodeName.toLowerCase(), iSysUniStateRuntime);
			if (iPSSysUniState.getPSSystemModule() != null) {
				this.sysUniStateRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysUniState.getPSSystemModule(), strCodeName), iSysUniStateRuntime);
			}
		}
		return iSysUniStateRuntime;
	}

	protected ISysUniStateRuntime createSysUniStateRuntime(IPSSysUniState iPSSysUniState) {

		ISysUniStateRuntime iSysUniStateRuntime = this.getRuntimeObject(iPSSysUniState.getPSSysSFPlugin(), ISysUniStateRuntime.class, true);
		if (iSysUniStateRuntime != null) {
			return iSysUniStateRuntime;
		}

		iSysUniStateRuntime = this.getRuntimeObject(ISysUniStateRuntime.class, iPSSysUniState.getUniStateType());
		if (iSysUniStateRuntime != null) {
			return iSysUniStateRuntime;
		}

		return createDefaultSysUniStateRuntime();
	}

	protected ISysUniStateRuntime createDefaultSysUniStateRuntime() {
		return new SysUniStateRuntime();
	}

	@Override
	public ISysUniStateRuntime getSysUniStateRuntime(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag, "传入统一状态模型标记无效");
		ISysUniStateRuntime iSysUniStateRuntime = null;
		if (this.sysUniStateRuntimeMap != null) {
			iSysUniStateRuntime = this.sysUniStateRuntimeMap.get(strTag);
			if (iSysUniStateRuntime == null) {
				iSysUniStateRuntime = this.sysUniStateRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysUniStateRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定统一状态[%1$s]运行时对象", strTag));
		}
		return iSysUniStateRuntime;
	}

	@Override
	public ISysUniStateRuntime getSysUniStateRuntime(IPSSysUniState iPSSysUniState) {
		// Assert.notNull(iPSSysUniState, "传入统一状态模型对象无效");
		// return getSysUniStateRuntime(iPSSysUniState.getId(), false);
		return this.registerPSSysUniState(iPSSysUniState);
	}

	protected ISysRefRuntime registerPSSysRef(IPSSysRef iPSSysRef) {

		if (this.sysRefRuntimeMap != null) {
			ISysRefRuntime iSysRefRuntime = this.sysRefRuntimeMap.get(iPSSysRef.getId());
			if (iSysRefRuntime != null) {
				return iSysRefRuntime;
			}
		}

		ISysRefRuntime iSysRefRuntime = this.createSysRefRuntime(iPSSysRef);
		if (iSysRefRuntime == null) {
			return null;
		}
		try {
			iSysRefRuntime.init(this.getSystemRuntimeContext(), iPSSysRef);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统引用[%1$s]运行时对象发生异常，%2$s", iPSSysRef.getName(), ex.getMessage()), ex);
		}
		if (this.sysRefRuntimeMap == null) {
			this.sysRefRuntimeMap = new HashMap<>();
		}
		this.sysRefRuntimeMap.put(iPSSysRef.getId(), iSysRefRuntime);
		String strCodeName = iPSSysRef.getSysRefTag();
		if (StringUtils.hasLength(strCodeName)) {
			this.sysRefRuntimeMap.put(strCodeName.toLowerCase(), iSysRefRuntime);
		}
		return iSysRefRuntime;
	}

	@Override
	public ISysRefRuntime createSysRefRuntime(IPSSysRef iPSSysRef) {
		Assert.notNull(iPSSysRef, "传入系统引用模型对象无效");
		ISysRefRuntime iSysRefRuntime = this.getRuntimeObject(iPSSysRef.getPSSysSFPlugin(), ISysRefRuntime.class, true);
		if (iSysRefRuntime != null) {
			return iSysRefRuntime;
		}

		if (StringUtils.hasLength(iPSSysRef.getSysRefType())) {
			iSysRefRuntime = this.getRuntimeObject(ISysRefRuntime.class, iPSSysRef.getSysRefType());
			if (iSysRefRuntime != null) {
				return iSysRefRuntime;
			}
		}

		return createDefaultSysRefRuntime(iPSSysRef);
	}

	protected ISysRefRuntime createDefaultSysRefRuntime(IPSSysRef iPSSysRef) {
		return this.createDefaultSysRefRuntime();
	}

	protected ISysRefRuntime createDefaultSysRefRuntime() {
		return new SysRefRuntime();
	}

	@Override
	public ISysRefRuntime getSysRefRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入系统引用模型标记无效");
		ISysRefRuntime iSysRefRuntime = null;
		if (this.sysRefRuntimeMap != null) {
			iSysRefRuntime = this.sysRefRuntimeMap.get(strTag);
			if (iSysRefRuntime == null) {
				iSysRefRuntime = this.sysRefRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysRefRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定系统引用[%1$s]运行时对象", strTag));
		}
		return iSysRefRuntime;
	}

	@Override
	public ISysRefRuntime getSysRefRuntime(IPSSysRef iPSSysRef) {
		Assert.notNull(iPSSysRef, "传入系统引用模型对象无效");
		return getSysRefRuntime(iPSSysRef.getId(), false);
	}

	@Override
	public net.ibizsys.central.sysutil.ISysUtilRuntime getSysUtilRuntime(IPSSysUtil iPSSysUtil) {
		Assert.notNull(iPSSysUtil, "传入系统预置功能模型对象无效");
		return (net.ibizsys.central.sysutil.ISysUtilRuntime) getSysUtilRuntime(iPSSysUtil.getId(), false);
	}

	@Override
	protected ISysDataSyncAgentRuntime onCreateSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		String strConfigFolder = SysEAIAgentRuntimeBase.getConfigFolder(iPSSysDataSyncAgent);
		String strAgentType = this.getSystemRuntimeSetting().getParam(strConfigFolder + ".agenttype", iPSSysDataSyncAgent.getAgentType());

		ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = this.getRuntimeObject(ISysDataSyncAgentRuntime.class, strAgentType);
		if (iSysDataSyncAgentRuntime != null) {
			return iSysDataSyncAgentRuntime;
		}
		
		return super.onCreateSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
	}
	
	

	@Override
	public IDataEntityGroupRuntime getDataEntityGroupRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入实体组标记无效");
		IDataEntityGroupRuntime iDataEntityGroupRuntime = null;
		if (this.dataEntityGroupRuntimeMap != null) {
			iDataEntityGroupRuntime = this.dataEntityGroupRuntimeMap.get(strTag);
			if (iDataEntityGroupRuntime == null) {
				iDataEntityGroupRuntime = this.dataEntityGroupRuntimeMap.get(strTag.toUpperCase());
			}
		}
		if (iDataEntityGroupRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定实体组[%1$s]运行时对象", strTag));
		}
		return iDataEntityGroupRuntime;
	}

	protected IDataEntityGroupRuntime registerPSDEGroup(IPSDEGroup iPSDEGroup) {

		if (this.dataEntityGroupRuntimeMap != null) {
			IDataEntityGroupRuntime iDataEntityGroupRuntime = this.dataEntityGroupRuntimeMap.get(iPSDEGroup.getId());
			if (iDataEntityGroupRuntime != null) {
				return iDataEntityGroupRuntime;
			}
		}

		IDataEntityGroupRuntime iDataEntityGroupRuntime = this.createDataEntityGroupRuntime(iPSDEGroup);
		if (iDataEntityGroupRuntime == null) {
			return null;
		}
		try {
			iDataEntityGroupRuntime.init(this.getSystemRuntimeContext(), iPSDEGroup);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化实体组[%1$s]运行时对象发生异常，%2$s", iPSDEGroup.getName(), ex.getMessage()), ex);
		}
		if (this.dataEntityGroupRuntimeMap == null) {
			this.dataEntityGroupRuntimeMap = new HashMap<>();
		}

		this.dataEntityGroupRuntimeMap.put(iPSDEGroup.getId(), iDataEntityGroupRuntime);
		if (iDataEntityGroupRuntime instanceof IDataEntityGroupUtilRuntime) {
			if (this.dataEntityGroupUtilRuntimeList == null) {
				this.dataEntityGroupUtilRuntimeList = new ArrayList<>();
			}
			this.dataEntityGroupUtilRuntimeList.add((IDataEntityGroupUtilRuntime) iDataEntityGroupRuntime);
		}

		return iDataEntityGroupRuntime;
	}

	protected IDataEntityGroupRuntime createDataEntityGroupRuntime(IPSDEGroup iPSDEGroup) {

		IDataEntityGroupRuntime iDataEntityGroupRuntime = this.getRuntimeObject(iPSDEGroup.getPSSysSFPlugin(), IDataEntityGroupRuntime.class, true);
		if (iDataEntityGroupRuntime != null) {
			return iDataEntityGroupRuntime;
		}

		if (StringUtils.hasLength(iPSDEGroup.getLogicMode())) {
			iDataEntityGroupRuntime = createDataEntityGroupUtilRuntime(iPSDEGroup);
			if (iDataEntityGroupRuntime != null) {
				return iDataEntityGroupRuntime;
			}
		}

		return createDefaultDataEntityGroupRuntime(iPSDEGroup);
	}

	/**
	 * 建立实体组功能对象对象
	 * 
	 * @param iPSDEGroup
	 * @return
	 */
	protected IDataEntityGroupRuntime createDataEntityGroupUtilRuntime(IPSDEGroup iPSDEGroup) {
		// String strObjectName =
		// SYSTEMMODULEOBJMAP.get(iPSDEGroup.getUtilType());
		// if(!StringUtils.hasLength(strObjectName)) {
		// throw new SystemRuntimeException(this,
		// String.format("无法指定类型[%1$s]实体组功能运行时",iPSDEGroup.getUtilType()));
		// }
		// try {
		// Object objInstance = SysSFPluginRuntime.createObject(strObjectName);
		// if((objInstance instanceof IDataEntityGroupRuntime)
		// && (objInstance instanceof IDataEntityGroupUtilRuntime)){
		// return (IDataEntityGroupRuntime)objInstance;
		// }
		// throw new Exception("类型不正确");
		// }
		// catch(Exception ex) {
		// throw new SystemRuntimeException(this,
		// String.format("建立实体组功能运行时对象[%1$s]发生异常，%2$s", strObjectName,
		// ex.getMessage()), ex);
		// }
		return null;
	}

	/**
	 * 建立默认实体组运行时对象
	 * 
	 * @param iPSDEGroup
	 * @return
	 */
	protected IDataEntityGroupRuntime createDefaultDataEntityGroupRuntime(IPSDEGroup iPSDEGroup) {
		return this.createDefaultDataEntityGroupRuntime();
	}

	/**
	 * 建立默认实体组运行时对象
	 * 
	 * @return
	 */
	protected IDataEntityGroupRuntime createDefaultDataEntityGroupRuntime() {
		return new DataEntityGroupRuntime();
	}

	/**
	 * 获取实体组运行时集合
	 * 
	 * @return
	 */
	@Override
	public List<IDataEntityGroupUtilRuntime> getDataEntityGroupUtilRuntimes() {
		if (this.dataEntityGroupUtilRuntimeList == null || this.dataEntityGroupUtilRuntimeList.size() == 0) {
			return null;
		}
		return this.dataEntityGroupUtilRuntimeList;
	}

	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入外部服务接口标记无效");
		ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = null;
		if (this.subSysServiceAPIRuntimeMap != null) {
			iSubSysServiceAPIRuntime = this.subSysServiceAPIRuntimeMap.get(strTag);
			if (iSubSysServiceAPIRuntime == null) {
				iSubSysServiceAPIRuntime = this.subSysServiceAPIRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSubSysServiceAPIRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定外部服务接口[%1$s]运行时对象", strTag));
		}
		return iSubSysServiceAPIRuntime;
	}

	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI) {
		Assert.notNull(iPSSubSysServiceAPI, "传入外部服务接口模型对象无效");
		return getSubSysServiceAPIRuntime(iPSSubSysServiceAPI.getId(), false);
	}

	protected ISubSysServiceAPIRuntime registerPSSubSysServiceAPI(IPSSubSysServiceAPI iPSSubSysServiceAPI) {

		if (this.subSysServiceAPIRuntimeMap != null) {
			ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = this.subSysServiceAPIRuntimeMap.get(iPSSubSysServiceAPI.getId());
			if (iSubSysServiceAPIRuntime != null) {
				return iSubSysServiceAPIRuntime;
			}
		}

		ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = this.createSubSysServiceAPIRuntime(iPSSubSysServiceAPI);
		if (iSubSysServiceAPIRuntime == null) {
			return null;
		}
		try {
			iSubSysServiceAPIRuntime.init(this.getSystemRuntimeContext(), iPSSubSysServiceAPI);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化外部服务接口[%1$s]运行时对象发生异常，%2$s", iPSSubSysServiceAPI.getName(), ex.getMessage()), ex);
		}
		if (this.subSysServiceAPIRuntimeMap == null) {
			this.subSysServiceAPIRuntimeMap = new HashMap<>();
		}
		this.subSysServiceAPIRuntimeMap.put(iPSSubSysServiceAPI.getId(), iSubSysServiceAPIRuntime);
		String strCodeName = iPSSubSysServiceAPI.getCodeName();
		if (StringUtils.hasLength(strCodeName)) {
			this.subSysServiceAPIRuntimeMap.put(strCodeName.toLowerCase(), iSubSysServiceAPIRuntime);
			if (iPSSubSysServiceAPI.getPSSystemModule() != null) {
				this.subSysServiceAPIRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSubSysServiceAPI.getPSSystemModule(), strCodeName), iSubSysServiceAPIRuntime);
			}
		}
		return iSubSysServiceAPIRuntime;
	}

	@Override
	public ISubSysServiceAPIRuntime createSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI) {
		Assert.notNull(iPSSubSysServiceAPI, "传入外部服务接口模型对象无效");
		ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = this.getRuntimeObject(iPSSubSysServiceAPI.getPSSysSFPlugin(), ISubSysServiceAPIRuntime.class, true);
		if (iSubSysServiceAPIRuntime != null) {
			return iSubSysServiceAPIRuntime;
		}
		
		if(iPSSubSysServiceAPI.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSubSysServiceAPI.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSubSysServiceAPIRuntime = iSystemModuleUtilRuntime.createSubSysServiceAPIRuntime(iPSSubSysServiceAPI);
				if (iSubSysServiceAPIRuntime != null) {
					return iSubSysServiceAPIRuntime;
				}
			}
		}

		return this.onCreateSubSysServiceAPIRuntime(iPSSubSysServiceAPI);
	}
	
	protected ISubSysServiceAPIRuntime onCreateSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI) {
		// 先尝试带类型
		if (StringUtils.hasLength(iPSSubSysServiceAPI.getAPIType())) {
			ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = this.getRuntimeObject(ISubSysServiceAPIRuntime.class, iPSSubSysServiceAPI.getAPIType());
			if (iSubSysServiceAPIRuntime != null) {
				return iSubSysServiceAPIRuntime;
			}
		}

		// 无类型
		ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = this.getRuntimeObject(ISubSysServiceAPIRuntime.class, null);
		if (iSubSysServiceAPIRuntime != null) {
			return iSubSysServiceAPIRuntime;
		}

		return createDefaultSubSysServiceAPIRuntime(iPSSubSysServiceAPI);
	}

	/**
	 * 建立外部服务接口运行时对象
	 * 
	 * @param iPSSubSysServiceAPI
	 * @return
	 */
	protected ISubSysServiceAPIRuntime createDefaultSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI) {
		return this.createDefaultSubSysServiceAPIRuntime();
	}

	/**
	 * 建立外部服务接口运行时对象
	 * 
	 * @return
	 */
	protected ISubSysServiceAPIRuntime createDefaultSubSysServiceAPIRuntime() {
		return new SubSysServiceAPIRuntime();
	}

	@Override
	public ISystemRuntimeSetting getSystemRuntimeSetting() {
		return this.iSystemRuntimeSetting;
	}

	protected void setSystemRuntimeSetting(ISystemRuntimeSetting iSystemRuntimeSetting) {
		this.iSystemRuntimeSetting = iSystemRuntimeSetting;
	}

	@Override
	public Object invokeAPIMethod(String strAPICodeName, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		return invokeAPIMethod(strAPICodeName, null, null, strDataEntityName, strMethodName, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAPIMethod(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAPICodeName)) {
			throw new SystemRuntimeException(this, String.format("传入接口标识无效"));
		}
		int nPos = strAPICodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAPICodeName.substring(nPos + 1);
			strAPICodeName = strAPICodeName.substring(0, nPos);
		}
		ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime) this.getSysServiceAPIRuntime(strAPICodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysServiceAPIRuntime.invokeDEMethod(strScope, strParentDEName, strParentKey, strDataEntityName, strMethodName, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public IDBDialect getDBDialect(String strDBType) {
		IDBDialect iDBDialect = dbDialectMap.get(strDBType);
		if (iDBDialect != null) {
			return iDBDialect;
		}

		iDBDialect = this.getRuntimeObject(GLOBALPLUGIN_DBDIALECT + "_" + strDBType, IDBDialect.class, true, true);
		if (iDBDialect == null) {
			iDBDialect = createDBDialect(strDBType);
		}

		if (iDBDialect == null) {
			throw new SystemRuntimeException(this, String.format("无法建立数据库[%1$s]设配器", strDBType));
		}

		dbDialectMap.put(strDBType, iDBDialect);
		return iDBDialect;
	}

	protected IDBDialect createDBDialect(String strDBType) {
		return DBDialectUtils.getInstance().get(strDBType);
		// if (DBTypes.MYSQL5.equals(strDBType)) {
		// return new MySQL5Dialect();
		// }
		//
		// return new SimpleDBDialect(strDBType);

		// throw new SystemRuntimeException(this,
		// String.format("无法获取指定数据库[%1$s]适配层", strDBType));
	}

	@Override
	public ISystemAccessManager getSystemAccessManager() {
		return this.iSystemAccessManager;
	}

	/**
	 * 设置系统访问控制管理对象
	 * 
	 * @param iSystemAccessManager
	 */
	protected void setSystemAccessManager(ISystemAccessManager iSystemAccessManager) {
		this.iSystemAccessManager = iSystemAccessManager;
	}

	protected ISystemAccessManager createSystemAccessManager() {
		ISystemAccessManager iSystemAccessManager = this.getRuntimeObject(GLOBALPLUGIN_ACCESSMANAGER, ISystemAccessManager.class, true, true);
		if (iSystemAccessManager != null) {
			return iSystemAccessManager;
		}
		return createDefaultSystemAccessManager();
	}

	protected ISystemAccessManager createDefaultSystemAccessManager() {
		return new SystemAccessManager();
	}

	@Override
	public void log(int nLogLevel, String strCat, String strInfo, Object objData) {
		if (this.getSystemLogAdapter() != null) {
			this.getSystemLogAdapter().log(nLogLevel, strCat, strInfo, objData);
		}

	}

	@Override
	public void logAudit(int nLogLevel, String strCat, String strInfo, String strPersonId, String strAddress, Object objData) {
		if (this.getSystemLogAdapter() != null) {
			this.getSystemLogAdapter().logAudit(nLogLevel, strCat, strInfo, strPersonId, strAddress, objData);
		}
	}

	@Override
	public void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {
		if (this.getSystemLogAdapter() != null) {
			this.getSystemLogAdapter().logEvent(nLogLevel, strCat, strInfo, objData);
		}

	}

	@Override
	public void logPO(int nLogLevel, String strCat, String strInfo, String strDEName, String strAction, long nTime, Object objData) {
		if (this.getSystemLogAdapter() != null) {
			this.getSystemLogAdapter().logPO(nLogLevel, strCat, strInfo, strDEName, strAction, nTime, objData);
		}
	}

	@Override
	public IDELogicNodeRuntime getDELogicNodeRuntime(IPSDELogicNode iPSDELogicNode, boolean bNewInstance) {
		String strLogicNodeType = iPSDELogicNode.getLogicNodeType();
		if (bNewInstance) {
			return this.createDELogicNodeRuntime(iPSDELogicNode);
		} else {
			IDELogicNodeRuntime iDELogicNodeRuntime = this.deELogicNodeRuntimeMap.get(strLogicNodeType);
			if (iDELogicNodeRuntime == null) {
				iDELogicNodeRuntime = this.createDELogicNodeRuntime(iPSDELogicNode);
				this.deELogicNodeRuntimeMap.put(strLogicNodeType, iDELogicNodeRuntime);
			}
			return iDELogicNodeRuntime;
		}
	}

	protected IDELogicNodeRuntime createDELogicNodeRuntime(IPSDELogicNode iPSDELogicNode) {
		String strLogicNodeType = iPSDELogicNode.getLogicNodeType();

		if (this.isEnableAddins(ADDIN_DELOGICNODERUNTIME_PREFIX)) {
			String strType = String.format("%1$s%2$s", ADDIN_DELOGICNODERUNTIME_PREFIX, strLogicNodeType);
			IDELogicNodeRuntime iDELogicNodeRuntime = this.getAddinRepo().getAddin(IDELogicNodeRuntime.class, strType, true);
			if (iDELogicNodeRuntime != null) {
				return iDELogicNodeRuntime;
			}
		}

		try {
			IDELogicNodeRuntime iDELogicNodeRuntime = this.onCreateDELogicNodeRuntime(strLogicNodeType);
			if (iDELogicNodeRuntime instanceof ISystemRTAddin) {
				((ISystemRTAddin) iDELogicNodeRuntime).init(this.getSystemRuntimeContext(), null);
			}
			return iDELogicNodeRuntime;
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("建立实体逻辑节点运行时对象发生异常，%1$s", ex.getMessage()));
		}
	}

	protected IDELogicNodeRuntime onCreateDELogicNodeRuntime(String strLogicNodeType) throws Exception {

		if (DELogicNodeTypes.PREPAREPARAM.equals(strLogicNodeType)) {
			return new DELogicPrepareParamNodeRuntime();
		}
		if (DELogicNodeTypes.BEGIN.equals(strLogicNodeType)) {
			return new SimpleDELogicNodeRuntime();
		}
		if (DELogicNodeTypes.DEACTION.equals(strLogicNodeType)) {
			return new DELogicDEActionNodeRuntime();
		}
		if (DELogicNodeTypes.RAWSQLANDLOOPCALL.equals(strLogicNodeType)) {
			return new DELogicRawSqlAndLoopCallNodeRuntime();
		}
		if (DELogicNodeTypes.RAWSQLCALL.equals(strLogicNodeType)) {
			return new DELogicRawSqlCallNodeRuntime();
		}
		if (DELogicNodeTypes.STARTWF.equals(strLogicNodeType)) {
			return new DELogicStartWFNodeRuntime();
		}
		if (DELogicNodeTypes.SUBMITWF.equals(strLogicNodeType)) {
			return new DELogicSubmitWFNodeRuntime();
		}
		if (DELogicNodeTypes.SYSLOGIC.equals(strLogicNodeType)) {
			return new DELogicSysLogicNodeRuntime();
		}
		if (DELogicNodeTypes.THROWEXCEPTION.equals(strLogicNodeType)) {
			return new DELogicThrowExceptionNodeRuntime();
		}
		if (DELogicNodeTypes.SFPLUGIN.equals(strLogicNodeType)) {
			return new DELogicSFPluginNodeRuntime();
		}
		if (DELogicNodeTypes.RAWSFCODE.equals(strLogicNodeType)) {
			return new DELogicRawSFCodeNodeRuntime();
		}
		if (DELogicNodeTypes.DEDATASET.equals(strLogicNodeType)) {
			return new DELogicDEDataSetNodeRuntime();
		}
		if (DELogicNodeTypes.DELOGIC.equals(strLogicNodeType)) {
			return new DELogicDELogicNodeRuntime();
		}
		if (DELogicNodeTypes.END.equals(strLogicNodeType)) {
			return new DELogicEndNodeRuntime();
		}
		if (DELogicNodeTypes.DENOTIFY.equals(strLogicNodeType)) {
			return new DELogicDENotifyNodeRuntime();
		}
		if (DELogicNodeTypes.COMMIT.equals(strLogicNodeType)) {
			return new DELogicCommitNodeRuntime();
		}
		if (DELogicNodeTypes.ROLLBACK.equals(strLogicNodeType)) {
			return new DELogicRollbackNodeRuntime();
		}
		if (DELogicNodeTypes.DEDATAQUERY.equals(strLogicNodeType)) {
			return new DELogicDEDataQueryNodeRuntime();
		}
		if (DELogicNodeTypes.DEBUGPARAM.equals(strLogicNodeType)) {
			return new DELogicDebugParamNodeRuntime();
		}
		if (DELogicNodeTypes.SUBSYSSAMETHOD.equals(strLogicNodeType)) {
			return new DELogicSubSysSAMethodNodeRuntime();
		}
		if (DELogicNodeTypes.DEDATASYNC.equals(strLogicNodeType)) {
			return new DELogicDEDataSyncNodeRuntime();
		}
		if (DELogicNodeTypes.APPENDPARAM.equals(strLogicNodeType)) {
			return new DELogicAppendParamNodeRuntime();
		}
		if (DELogicNodeTypes.BINDPARAM.equals(strLogicNodeType)) {
			return new DELogicBindParamNodeRuntime();
		}
		if (DELogicNodeTypes.COPYPARAM.equals(strLogicNodeType)) {
			return new DELogicCopyParamNodeRuntime();
		}
		if (DELogicNodeTypes.RENEWPARAM.equals(strLogicNodeType)) {
			return new DELogicRenewParamNodeRuntime();
		}
		if (DELogicNodeTypes.RESETPARAM.equals(strLogicNodeType)) {
			return new DELogicResetParamNodeRuntime();
		}
		if (DELogicNodeTypes.SORTPARAM.equals(strLogicNodeType)) {
			return new DELogicSortParamNodeRuntime();
		}
		if (DELogicNodeTypes.MERGEPARAM.equals(strLogicNodeType)) {
			return new DELogicMergeParamNodeRuntime();
		}
		if (DELogicNodeTypes.RAWWEBCALL.equals(strLogicNodeType)) {
			return new DELogicRawWebCallNodeRuntime();
		}
		if (DELogicNodeTypes.DEPRINT.equals(strLogicNodeType)) {
			return new DELogicDEPrintNodeRuntime();
		}
		if (DELogicNodeTypes.LOOPSUBCALL.equals(strLogicNodeType)) {
			return new DELogicLoopSubCallNodeRuntime();
		}
		if (DELogicNodeTypes.SYSDATASYNCAGENTOUT.equals(strLogicNodeType)) {
			return new DELogicSysDataSyncAgentOutNodeRuntime();
		}
		if (DELogicNodeTypes.SYSUTIL.equals(strLogicNodeType)) {
			return new DELogicSysUtilNodeRuntime();
		}
		if (DELogicNodeTypes.DEDATAFLOW.equals(strLogicNodeType)) {
			return new DELogicDEDataFlowNodeRuntime();
		}
		throw new Exception(String.format("无法识别的处理逻辑节点类型[%1$s]", strLogicNodeType));
	}

	@Override
	public IDELogicParamRuntime getDELogicParamRuntime(IPSDELogicParam iPSDELogicParam) {

		if (iPSDELogicParam.isEntityParam()) {
			return new DELogicEntityParamRuntime();
		}

		if (iPSDELogicParam.isEntityListParam()) {
			return new DELogicEntityListParamRuntime();
		}

		if (iPSDELogicParam.isEntityPageParam()) {
			return new DELogicEntityPageParamRuntime();
		}
		
		if (iPSDELogicParam.isEntityMapParam()) {
			return new DELogicEntityMapParamRuntime();
		}

		if (iPSDELogicParam.isFilterParam()) {
			return new DELogicFilterParamRuntime();
		}

		if (iPSDELogicParam.isLastReturnParam()) {
			return new DELogicLastReturnParamRuntime();
		}

		if (iPSDELogicParam.isLastParam()) {
			return new DELogicLastParamRuntime();
		}

		if (iPSDELogicParam.isEnvParam()) {
			return new DELogicEnvParamRuntime();
		}

		if (iPSDELogicParam.isSessionParam()) {
			return new DELogicSessionParamRuntime();
		}

		if (iPSDELogicParam.isFileParam()) {
			return new DELogicFileParamRuntime();
		}

		if (iPSDELogicParam.isFileListParam()) {
			return new DELogicFileListParamRuntime();
		}

		if (iPSDELogicParam.isSimpleParam()) {
			return new DELogicSimpleParamRuntime();
		}

		if (iPSDELogicParam.isSimpleListParam()) {
			return new DELogicSimpleListParamRuntime();
		}

		if (iPSDELogicParam.isAppContextParam()) {
			return new DELogicAppContextParamRuntime();
		}

		if (iPSDELogicParam.isWebContextParam()) {
			return new DELogicWebContextParamRuntime();
		}

		if (iPSDELogicParam.isWebResponseParam()) {
			return new DELogicWebResponseParamRuntime();
		}

		if (iPSDELogicParam.isAppGlobalParam()) {
			return new DELogicAppGlobalParamRuntime();
		}

		//return new DELogicParamRuntime();
		return new DELogicEntityParamRuntime();
	}

	@Override
	public ISysTestCaseRuntime createSysTestCaseRuntime(IPSSysTestCase iPSSysTestCase) {
		String strTestCaseType = iPSSysTestCase.getTestCaseType();
		if (TestCaseTargetTypes.DEACTION.equals(strTestCaseType)) {
			return new DEActionTestCaseRuntime();
		}

		throw new SystemRuntimeException(this, String.format("无法识别的测试用例类型[%1$s]", strTestCaseType));
	}

	@Override
	public ISysTestDataRuntime createSysTestDataRuntime(IPSSysTestData iPSSysTestData) {
		return new SysTestDataRuntime();
	}

	@Override
	public Object invokeBackendTask(String strTaskType, String strTaskTag, String strDynaInstId, String strParam, IUserContext iUserContext, Object objTag) throws Throwable {
		String strTag = String.format("%1$s|%2$s", strTaskType, strTaskTag).toUpperCase();
		ISysBackendTaskRuntime iSysBackendTaskRuntime = (ISysBackendTaskRuntime) this.getSysBackendTaskRuntime(strTag, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iSysBackendTaskRuntime.execute(strDynaInstId, strParam);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public boolean isEnableDEService(IPSDataEntity iPSDataEntity) {
		return this.deServiceObjMap.containsKey(iPSDataEntity.getId());
	}

	// protected void registerDEService(String strDataEntityId, IDEService
	// iDEService) {
	// if(!this.getSystemGatewayContext().isMultiSystemMode()) {
	// //单系统运行模式忽略外部注册实体服务对象
	// return;
	// }
	// this.deServiceMap.put(strDataEntityId, iDEService);
	// }

	protected IDEService createDEService(IDataEntityRuntime iDataEntityRuntime) {
		String strDEServiceObj = this.deServiceObjMap.get(iDataEntityRuntime.getId());
		if (!StringUtils.hasLength(strDEServiceObj)) {
			throw new SystemRuntimeException(this, String.format("无法获取实体[%1$s]服务对象组件", iDataEntityRuntime.getId()));
		}

		try {
			Object objDEService = Class.forName(strDEServiceObj).newInstance();
			if (!(objDEService instanceof IDEService)) {
				throw new Exception("类型不正确");
			}
			return (IDEService) objDEService;
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("建立实体[%1$s]发生异常，%2$s", iDataEntityRuntime.getId(), ex.getMessage()), ex);
		}
	}

	/**
	 * 注册实体服务对象
	 * 
	 * @param strDataEntityId
	 * @param strDEServiceObj
	 */
	protected void registerDEServiceObj(String strDataEntityId, String strDEServiceObj) {
		this.deServiceObjMap.put(strDataEntityId, strDEServiceObj);
	}

	@Override
	public IDEService getDEService(String strDataEntityId) {
		return this.getDEService(this.getDataEntityRuntime(strDataEntityId));
	}

	@Override
	public IDEService getDEService(IDataEntityRuntime iDataEntityRuntime) {
		if (!this.getSystemGatewayContext().isMultiSystemMode()) {
			IDEService iDEService = this.getSystemGatewayContext().getDEService(this.getDeploySystemId(), iDataEntityRuntime.getId());
			return iDEService;
		} else {
			IDEService iDEService = this.deServiceMap.get(iDataEntityRuntime.getId());
			if (iDEService == null) {
				synchronized (this.deServiceMap) {
					iDEService = this.deServiceMap.get(iDataEntityRuntime.getId());
					if (iDEService == null) {
						iDEService = this.createDEService(iDataEntityRuntime);
						try {
							iDEService.init(this, iDataEntityRuntime);
						} catch (Exception ex) {
							throw new SystemRuntimeException(this, String.format("初始化实体[%1$s]服务对象发生异常，%2$s", iDataEntityRuntime.getId(), ex.getMessage()), ex);
						}
						this.deServiceMap.put(iDataEntityRuntime.getId(), iDEService);
					}
				}

			}
			return iDEService;
		}
	}

	@Override
	public Object getDeploySystemTag() {
		return this.getData();
	}

	@Override
	public Object invokeAppMethod(String strAppCodeName, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		return invokeAppMethod(strAppCodeName, null, null, strDataEntityName, strMethodName, objBody, strKey, iUserContext, objTag);
	}

	@Override
	public Object invokeAppMethod(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEMethod(strScope, strParentDEName, strParentKey, strDataEntityName, strMethodName, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}

	}

	@Override
	public Object invokeAppImportData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEImportData(strScope, strParentDEName, strParentKey, strDataEntityName, strImportTag, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAppExportData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAppExportData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEExportData(strScope, strParentDEName, strParentKey, strDataEntityName, strExportTag, strMethodName, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAppPrintData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEPrintData(strScope, strParentDEName, strParentKey, strDataEntityName, strPrintTag, strPrintType, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAppWFStart(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEWFStart(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAppWFCancel(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEWFCancel(strScope, strParentDEName, strParentKey, strDataEntityName, strWFTag, objBody, strKey, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAppDownloadFile(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEDownloadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	@Override
	public Object invokeAppUploadFile(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable {
		if (!StringUtils.hasLength(strAppCodeName)) {
			throw new SystemRuntimeException(this, String.format("传入前端应用标识无效"));
		}
		int nPos = strAppCodeName.indexOf("-");
		String strScope = null;
		if (nPos != -1) {
			strScope = strAppCodeName.substring(nPos + 1);
			strAppCodeName = strAppCodeName.substring(0, nPos);
		}
		IApplicationRuntime iApplicationRuntime = this.getApplicationRuntime(strAppCodeName, false);
		IUserContext last = UserContext.getCurrent();
		try {
			UserContext.setCurrent(iUserContext);
			Object ret = iApplicationRuntime.invokeDEUploadFile(strScope, strParentDEName, strParentKey, strDataEntityName, strKey, strStorageField, file, objBody, objTag);
			UserContext.setCurrent(last);
			return ret;
		} catch (Throwable ex) {
			UserContext.setCurrent(last);
			throw ex;
		}
	}

	// @Override
	// protected IUserContext getThreadTaskUserContext(IUserContext
	// iUserContext) {
	// if (iUserContext == null) {
	// return null;
	// }
	// return new SystemUserContext(iUserContext);
	// }

	@Override
	public Object serialize(Object obj) {
		Assert.notNull(obj, "不能传入空对象");
		try {
			return JsonUtils.MAPPER.writeValueAsString(obj);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public <T> T deserialize(Object objData, Class<T> cls) {
		if (!(objData instanceof String)) {
			throw new SystemRuntimeException(this, String.format("无法识别的输入数据"));
		}
		Assert.hasLength((String) objData, "不能传入空数据");
		try {
			return (T) JsonUtils.MAPPER.readValue((String) objData, cls);

		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("反序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public <T> T deserialize(Object objData, TypeReference<T> type) {
		if (!(objData instanceof String)) {
			throw new SystemRuntimeException(this, String.format("无法识别的输入数据"));
		}
		Assert.hasLength((String) objData, "不能传入空数据");
		try {
			return (T) JsonUtils.MAPPER.readValue((String) objData, type);

		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("反序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public IWebClient getDefaultWebClient() {
		if (this.defaultWebClient == null) {
			IWebClient iWebClient = this.createWebClient(null);
			try {
				iWebClient.init(this);
			} catch (Exception ex) {
				throw new SystemRuntimeException(this, String.format("初始化默认Web客户端对象发生异常，%1$s", ex.getMessage()), ex);
			}
			this.defaultWebClient = iWebClient;
		}
		return this.defaultWebClient;
	}

	@Override
	public IWebClient createWebClient(Object data) {
		return this.getRuntimeObject(GLOBALPLUGIN_WEBCLIENT, IWebClient.class, true, false);
	}

	@Override
	public IScriptPage createScriptPage(Page<?> page) {
		return this.createScriptPage(page, true);
	}

	@Override
	public IScriptPage createScriptPage(Page<?> page, boolean bLowerCaseFieldName) {
		return new ScriptPage(this, page, bLowerCaseFieldName);
	}

	@Override
	public IScriptWebResponse createScriptWebResponse(IWebResponse iWebResponse) {
		Assert.notNull(iWebResponse, "未传入Web反馈对象");
		return new ScriptWebResponse(this, iWebResponse);
	}

	@Override
	public IScriptEntity createScriptEntity(IEntity iEntity) {
		return new ScriptEntity(this, iEntity);
	}

	@Override
	public IScriptList createScriptList(List<?> list) {
		return new ScriptList(this, list);
	}

	@Override
	public IScriptList createScriptList(List<?> list, boolean bLowerCaseFieldName) {
		return new ScriptList(this, list, bLowerCaseFieldName);
	}

	@Override
	public Object createScriptObject(Object objValue) {

		if (objValue instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) objValue;
			if (iEntityDTO.getDEMethodDTORuntime() != null) {
				return iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity(iEntityDTO);
			}
		}

		if (objValue instanceof IEntity) {
			return this.createScriptEntity((IEntity) objValue);
		}

		if (objValue instanceof List) {
			return this.createScriptList((List) objValue);
		}

		return objValue;
	}

	@Override
	public ISubSysServiceAPIScriptLogicRuntime createSubSysServiceAPIScriptLogicRuntime(String strLogicMode) {
		return new SubSysServiceAPIScriptLogicRuntime();
	}

	@Override
	protected ISysUtilRuntime onCreateSysUtilRuntime(IPSSysUtil iPSSysUtil) {
		String strUtilType = iPSSysUtil.getUtilType();
		if (StringUtils.hasLength(strUtilType)) {
			if (SysUtilTypes.LOGLISTENER.equals(strUtilType)) {
				return new SysLogListenerUtilRuntime();
			}
		}
		return super.onCreateSysUtilRuntime(iPSSysUtil);
	}

	@Override
	public void registerSystemLogListener(ISystemLogListener iSystemLogListener) {
		if (!(this.getSystemLogAdapter() instanceof ISystemLogListenerProxy)) {
			throw new SystemRuntimeException(this, "当前系统日志适配器不支持此操作");
		}
		((ISystemLogListenerProxy) this.getSystemLogAdapter()).registerSystemLogListener(iSystemLogListener);
	}

	@Override
	public void unregisterSystemLogListener(ISystemLogListener iSystemLogListener) {
		if (!(this.getSystemLogAdapter() instanceof ISystemLogListenerProxy)) {
			throw new SystemRuntimeException(this, "当前系统日志适配器不支持此操作");
		}
		((ISystemLogListenerProxy) this.getSystemLogAdapter()).unregisterSystemLogListener(iSystemLogListener);
	}

	/**
	 * 判断传入实体预载
	 * 
	 * @param iPSDataEntity
	 * @throws Exception
	 */
	protected boolean testPreloadPSDataEntity(IPSDataEntity iPSDataEntity) {
		if (iPSDataEntity.getAllPSDEDataSyncs() != null) {
			List<IPSDEDataSync> psDEDataSyncs = iPSDataEntity.getAllPSDEDataSyncs();
			for (IPSDEDataSync iPSDEDataSync : psDEDataSyncs) {

				if (!iPSDEDataSync.isValid()) {
					continue;
				}
				if (DEDataSyncDirs.IN.equals(iPSDEDataSync.getSyncDir())) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public IUserContext createDefaultUserContext() {
		UserContextRuntime userContextRuntime = new UserContextRuntime();
		userContextRuntime.setUserid("SYSTEM");
		userContextRuntime.setUsername("系统内置用户");
		return userContextRuntime;
	}

	@Override
	public IUserContext createAnonymousUserContext() {
		UserContextRuntime userContextRuntime = new UserContextRuntime();
		userContextRuntime.setUserid("ANONYMOUSUSER");
		userContextRuntime.setUsername("匿名用户");
		userContextRuntime.setAnonymoususer(true);
		return userContextRuntime;
	}

	@Override
	protected ISysUtilRuntime registerPSSysUtil(IPSSysUtil iPSSysUtil) throws Exception {
		ISysUtilRuntime iSysUtilRuntime = super.registerPSSysUtil(iPSSysUtil);
		if (iSysUtilRuntime != null) {
			if (iSysUtilRuntime instanceof ISysUniStateUtilRuntime) {
				if (this.getSysUniStateUtilRuntime(true) == null) {
					this.setSysUniStateUtilRuntime((ISysUniStateUtilRuntime) iSysUtilRuntime);
				}
			} else if (iSysUtilRuntime instanceof ISysCacheUtilRuntime) {
				if (this.getSysCacheUtilRuntime(true) == null) {
					this.setSysCacheUtilRuntime((ISysCacheUtilRuntime) iSysUtilRuntime);
				}
			}
		}

		return iSysUtilRuntime;
	}

	@Override
	public ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode) {
		if (this.iSysUniStateUtilRuntime != null || bTryMode) {
			return this.iSysUniStateUtilRuntime;
		}
		throw new SystemRuntimeException(this, String.format("系统未定义统一状态功能组件"));
	}

	protected void setSysUniStateUtilRuntime(ISysUniStateUtilRuntime iSysUniStateUtilRuntime) {
		this.iSysUniStateUtilRuntime = iSysUniStateUtilRuntime;
	}

	@Override
	public ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode) {
		if (this.iSysCacheUtilRuntime != null || bTryMode) {
			return this.iSysCacheUtilRuntime;
		}
		throw new SystemRuntimeException(this, String.format("系统未定义缓存功能组件"));
	}

	protected void setSysCacheUtilRuntime(ISysCacheUtilRuntime iSysCacheUtilRuntime) {
		this.iSysCacheUtilRuntime = iSysCacheUtilRuntime;
	}

	@Override
	public ISysTestDataRuntime getSysTestDataRuntime(IPSSysTestData iPSSysTestData) {
		Assert.notNull(iPSSysTestData, "传入测试数据模型对象无效");
		return this.registerPSSysTestData(iPSSysTestData);
	}

	protected ISysTestDataRuntime registerPSSysTestData(IPSSysTestData iPSSysTestData) {
		if (this.sysTestDataRuntimeMap != null) {
			ISysTestDataRuntime iSysTestDataRuntime = this.sysTestDataRuntimeMap.get(iPSSysTestData.getId());
			if (iSysTestDataRuntime != null) {
				return iSysTestDataRuntime;
			}
		}

		ISysTestDataRuntime iSysTestDataRuntime = this.createSysTestDataRuntime(iPSSysTestData);
		if (iSysTestDataRuntime == null) {
			return null;
		}
		try {
			iSysTestDataRuntime.init(this.getSystemRuntimeContext(), iPSSysTestData);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化系统测试数据[%1$s]运行时对象发生异常，%2$s", iPSSysTestData.getName(), ex.getMessage()), ex);
		}
		if (this.sysTestDataRuntimeMap == null) {
			this.sysTestDataRuntimeMap = new HashMap<>();
		}

		this.sysTestDataRuntimeMap.put(iPSSysTestData.getId(), iSysTestDataRuntime);
		return iSysTestDataRuntime;
	}

	@Override
	public String getDeploySessionId() {
		return this.strDeploySessionId;
	}

	@Override
	public DataSource getDefaultDataSource() {
		return this.getSystemGatewayContext().getDefaultDataSource();
	}

	@Override
	public DataSource getDataSource(String strDSTag, boolean bTryMode) {
		return this.getSystemGatewayContext().getDataSource(strDSTag, bTryMode);
	}

	@Override
	public IDEMapRuntime createDefaultDEMapRuntime() {
		return new DEMapRuntime();
	}

	@Override
	protected ICodeListRuntime createDefaultDynamicCodeListRuntime() {
		return new DynamicCodeListRuntime();
	}

	@Override
	public ISysSearchSchemeRuntime getSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme) {
		Assert.notNull(iPSSysSearchScheme, "传入系统检索体系模型对象无效");
		return getSysSearchSchemeRuntime(iPSSysSearchScheme.getId(), false);
	}

	@Override
	public ISysSearchSchemeRuntime getSysSearchSchemeRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入检索体系标记无效");
		ISysSearchSchemeRuntime iSysSearchSchemeRuntime = null;
		if (this.sysSearchSchemeRuntimeMap != null) {
			iSysSearchSchemeRuntime = this.sysSearchSchemeRuntimeMap.get(strTag);
			if (iSysSearchSchemeRuntime == null) {
				iSysSearchSchemeRuntime = this.sysSearchSchemeRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysSearchSchemeRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定检索体系[%1$s]运行时对象", strTag));
		}
		return iSysSearchSchemeRuntime;
	}

	protected ISysSearchSchemeRuntime registerPSSysSearchScheme(IPSSysSearchScheme iPSSysSearchScheme) {

		if (this.sysSearchSchemeRuntimeMap != null) {
			ISysSearchSchemeRuntime iSysSearchSchemeRuntime = this.sysSearchSchemeRuntimeMap.get(iPSSysSearchScheme.getId());
			if (iSysSearchSchemeRuntime != null) {
				return iSysSearchSchemeRuntime;
			}
		}

		ISysSearchSchemeRuntime iSysSearchSchemeRuntime = this.createSysSearchSchemeRuntime(iPSSysSearchScheme);
		if (iSysSearchSchemeRuntime == null) {
			return null;
		}
		try {
			iSysSearchSchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysSearchScheme);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化检索体系[%1$s]运行时对象发生异常，%2$s", iPSSysSearchScheme.getName(), ex.getMessage()), ex);
		}
		if (this.sysSearchSchemeRuntimeMap == null) {
			this.sysSearchSchemeRuntimeMap = new HashMap<>();
		}
		this.sysSearchSchemeRuntimeMap.put(iPSSysSearchScheme.getId(), iSysSearchSchemeRuntime);
		if (StringUtils.hasLength(iPSSysSearchScheme.getCodeName())) {
			this.sysSearchSchemeRuntimeMap.put(iPSSysSearchScheme.getCodeName().toLowerCase(), iSysSearchSchemeRuntime);
			if (iPSSysSearchScheme.getPSSystemModule() != null) {
				this.sysSearchSchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysSearchScheme.getPSSystemModule(), iPSSysSearchScheme.getCodeName()), iSysSearchSchemeRuntime);
				// 注册模块默认检索体系
				this.sysSearchSchemeRuntimeMap.put(iPSSysSearchScheme.getPSSystemModule().getId(), iSysSearchSchemeRuntime);
			} else if (iPSSysSearchScheme.getPSSysModelGroup() != null) {
				this.sysSearchSchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysSearchScheme.getPSSysModelGroup(), iPSSysSearchScheme.getCodeName()), iSysSearchSchemeRuntime);
				// 注册模型组默认检索体系
				this.sysSearchSchemeRuntimeMap.put(iPSSysSearchScheme.getPSSysModelGroup().getId(), iSysSearchSchemeRuntime);
			}
		}
		return iSysSearchSchemeRuntime;
	}

	@Override
	public ISysSearchSchemeRuntime createSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme) {
		Assert.notNull(iPSSysSearchScheme, "传入系统检索体系模型对象无效");
		ISysSearchSchemeRuntime iSysSearchSchemeRuntime = this.getRuntimeObject(iPSSysSearchScheme.getPSSysSFPlugin(), ISysSearchSchemeRuntime.class, true);
		if (iSysSearchSchemeRuntime != null) {
			return iSysSearchSchemeRuntime;
		}
		
		if(iPSSysSearchScheme.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysSearchScheme.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysSearchSchemeRuntime = iSystemModuleUtilRuntime.createSysSearchSchemeRuntime(iPSSysSearchScheme);
				if (iSysSearchSchemeRuntime != null) {
					return iSysSearchSchemeRuntime;
				}
			}
		}
		
		return this.onCreateSysSearchSchemeRuntime(iPSSysSearchScheme);
	}
	
	protected ISysSearchSchemeRuntime onCreateSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme) {
		// 判断搜索引擎类型
		String strConfigFolder = SysSearchSchemeRuntime.getConfigFolder(iPSSysSearchScheme);
		String strSEType = this.getSystemRuntimeSetting().getParam(strConfigFolder + ".setype", iPSSysSearchScheme.getSearchEngineType());

		ISysSearchSchemeRuntime iSysSearchSchemeRuntime = this.getRuntimeObject(ISysSearchSchemeRuntime.class, strSEType);
		if (iSysSearchSchemeRuntime != null) {
			return iSysSearchSchemeRuntime;
		}

		return createDefaultSysSearchSchemeRuntime(iPSSysSearchScheme);
	}
	

	protected ISysSearchSchemeRuntime createDefaultSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme) {
		return this.createDefaultSysSearchSchemeRuntime();
	}

	protected ISysSearchSchemeRuntime createDefaultSysSearchSchemeRuntime() {
		return new SysSearchSchemeRuntime();
	}

	@Override
	public ISysBISchemeRuntime getSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme) {
		Assert.notNull(iPSSysBIScheme, "传入系统智能报表体系模型对象无效");
		return getSysBISchemeRuntime(iPSSysBIScheme.getId(), false);
	}

	@Override
	public ISysBISchemeRuntime getSysBISchemeRuntime(String strTag, boolean bTryMode) {
		Assert.notNull(strTag, "传入智能报表体系标记无效");
		ISysBISchemeRuntime iSysBISchemeRuntime = null;
		if (this.sysBISchemeRuntimeMap != null) {
			iSysBISchemeRuntime = this.sysBISchemeRuntimeMap.get(strTag);
			if (iSysBISchemeRuntime == null) {
				iSysBISchemeRuntime = this.sysBISchemeRuntimeMap.get(strTag.toLowerCase());
			}
		}
		if (iSysBISchemeRuntime == null && !bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定智能报表体系[%1$s]运行时对象", strTag));
		}
		return iSysBISchemeRuntime;
	}

	protected ISysBISchemeRuntime registerPSSysBIScheme(IPSSysBIScheme iPSSysBIScheme) {

		if (this.sysBISchemeRuntimeMap != null) {
			ISysBISchemeRuntime iSysBISchemeRuntime = this.sysBISchemeRuntimeMap.get(iPSSysBIScheme.getId());
			if (iSysBISchemeRuntime != null) {
				return iSysBISchemeRuntime;
			}
		}

		ISysBISchemeRuntime iSysBISchemeRuntime = this.createSysBISchemeRuntime(iPSSysBIScheme);
		if (iSysBISchemeRuntime == null) {
			return null;
		}
		try {
			iSysBISchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysBIScheme);
		} catch (Exception ex) {
			throw new SystemRuntimeException(this, String.format("初始化智能报表体系[%1$s]运行时对象发生异常，%2$s", iPSSysBIScheme.getName(), ex.getMessage()), ex);
		}
		if (this.sysBISchemeRuntimeMap == null) {
			this.sysBISchemeRuntimeMap = new HashMap<>();
		}
		this.sysBISchemeRuntimeMap.put(iPSSysBIScheme.getId(), iSysBISchemeRuntime);
		if (StringUtils.hasLength(iPSSysBIScheme.getCodeName())) {
			this.sysBISchemeRuntimeMap.put(iPSSysBIScheme.getCodeName().toLowerCase(), iSysBISchemeRuntime);
			if (iPSSysBIScheme.getPSSystemModule() != null) {
				this.sysBISchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysBIScheme.getPSSystemModule(), iPSSysBIScheme.getCodeName()), iSysBISchemeRuntime);
			}
//			else if (iPSSysBIScheme.getPSSysModelGroup() != null) {
//				this.sysBISchemeRuntimeMap.put(PSModelUtils.calcUniqueTag(iPSSysBIScheme.getPSSysModelGroup(), iPSSysBIScheme.getCodeName()), iSysBISchemeRuntime);
//			}
		}
		if (StringUtils.hasLength(iPSSysBIScheme.getUniqueTag())) {
			this.sysBISchemeRuntimeMap.put(iPSSysBIScheme.getUniqueTag().toLowerCase(), iSysBISchemeRuntime);
		}
		return iSysBISchemeRuntime;
	}

	@Override
	public ISysBISchemeRuntime createSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme) {
		Assert.notNull(iPSSysBIScheme, "传入系统智能报表体系模型对象无效");
		ISysBISchemeRuntime iSysBISchemeRuntime = this.getRuntimeObject(iPSSysBIScheme.getPSSysSFPlugin(), ISysBISchemeRuntime.class, true);
		if (iSysBISchemeRuntime != null) {
			return iSysBISchemeRuntime;
		}

		if(iPSSysBIScheme.getPSSystemModule()!=null) {
			ISystemModuleUtilRuntime iSystemModuleUtilRuntime = this.getSystemModuleUtilRuntime(iPSSysBIScheme.getPSSystemModuleMust().getId(), true);
			if(iSystemModuleUtilRuntime != null) {
				iSysBISchemeRuntime = iSystemModuleUtilRuntime.createSysBISchemeRuntime(iPSSysBIScheme);
				if (iSysBISchemeRuntime != null) {
					return iSysBISchemeRuntime;
				}
			}
		}
		
		return this.onCreateSysBISchemeRuntime(iPSSysBIScheme);		
	}
	
	protected ISysBISchemeRuntime onCreateSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme) {
		// 判断智能报表引擎类型
		String strConfigFolder = SysBISchemeRuntime.getConfigFolder(iPSSysBIScheme);
		String strBEType = this.getSystemRuntimeSetting().getParam(strConfigFolder + ".betype", iPSSysBIScheme.getBIEngineType());

		ISysBISchemeRuntime iSysBISchemeRuntime = this.getRuntimeObject(ISysBISchemeRuntime.class, strBEType);
		if (iSysBISchemeRuntime != null) {
			return iSysBISchemeRuntime;
		}
		return createDefaultSysBISchemeRuntime(iPSSysBIScheme);
	}

	protected ISysBISchemeRuntime createDefaultSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme) {
		return this.createDefaultSysBISchemeRuntime();
	}

	protected ISysBISchemeRuntime createDefaultSysBISchemeRuntime() {
		return new SysBISchemeRuntime();
	}

	@Override
	public ISystemModuleUtilRuntime getSystemModuleUtilRuntime(String strTag, boolean bTryMode) {

		ISystemModuleRuntime iSystemModuleRuntime = this.getSystemModuleRuntime(strTag, bTryMode);
		if (iSystemModuleRuntime instanceof ISystemModuleUtilRuntime) {
			return (ISystemModuleUtilRuntime) iSystemModuleRuntime;
		}

		if (!bTryMode) {
			throw new SystemRuntimeException(this, String.format("无法获取指定系统模块功能运行时对象[%1$s]", strTag));
		}

		return null;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntimeByAppDataEntityTag(String strAppTag, String strAppDataEntityTag, boolean bTryMode) {
		Assert.hasLength(strAppTag, "未传入应用标识");
		Assert.hasLength(strAppDataEntityTag, "未传入应用实体标识");
		String strFullTag = String.format("%1$s:%2$s", strAppTag, strAppDataEntityTag);
		String strPSDEId = this.appDataEntityTagMap.get(strFullTag.toLowerCase());
		if (StringUtils.hasLength(strPSDEId)) {
			return this.getDataEntityRuntime(strPSDEId, bTryMode);
		}
		if (bTryMode) {
			return null;
		}
		throw new SystemRuntimeException(this, String.format("无法获取指定应用实体[%1$s]对应的实体运行时对象", strFullTag));
	}

	@Override
	public IPSSysContent getResourcePSSysContent(String strPath, boolean bTryMode) {
		Assert.hasLength(strPath, "未传入资源路径标识");
		IPSSysContent iPSSysContent = this.resourcePSSysContentMap.get(strPath);
		if (iPSSysContent != null) {
			return iPSSysContent;
		}
		if (bTryMode) {
			return null;
		}
		throw new SystemRuntimeException(this, String.format("无法获取指定资源路径[%1$s]对应的系统资源模型对象", strPath));
	}

	@Override
	public String getResourceContent(String strPath, String strDefault) {
		IPSSysContent iPSSysContent = this.getResourcePSSysContent(strPath, true);
		if (iPSSysContent != null && StringUtils.hasLength(iPSSysContent.getContent())) {
			return iPSSysContent.getContent();
		}
		return strDefault;
	}

	protected void onShutdown() throws Exception {

		// 卸载系统功能
		java.util.List<IPSSysUtil> psSysUtils = this.getPSSystem().getAllPSSysUtils();
		if (psSysUtils != null) {
			for (IPSSysUtil iPSSysUtil : psSysUtils) {
				ISysUtilRuntime iSysUtilRuntime = this.getSysUtilRuntime(iPSSysUtil.getId(), false);
				if (!(iSysUtilRuntime instanceof net.ibizsys.central.sysutil.ISysUtilRuntime)) {
					continue;
				}
				net.ibizsys.central.sysutil.ISysUtilRuntime iSysUtilRuntime2 = (net.ibizsys.central.sysutil.ISysUtilRuntime) iSysUtilRuntime;
				try {
					iSysUtilRuntime2.uninstall();
				} catch (Throwable ex) {
					log.error(String.format("卸载系统功能组件[%1$s]发生异常，%2$s", iSysUtilRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 卸载数据库体系
		java.util.List<IPSSysDBScheme> psSysDBSchemes = this.getPSSystem().getAllPSSysDBSchemes();
		if (psSysDBSchemes != null) {
			for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
				ISysDBSchemeRuntime iSysDBSchemeRuntime = this.getSysDBSchemeRuntime(iPSSysDBScheme.getId(), false);
				try {
					iSysDBSchemeRuntime.uninstall();
				} catch (Throwable ex) {
					throw new Exception(String.format("卸载系统数据库体系[%1$s]发生异常，%2$s", iSysDBSchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 卸载大数据体系
		java.util.List<IPSSysBDScheme> psSysBDSchemes = this.getPSSystem().getAllPSSysBDSchemes();
		if (psSysBDSchemes != null) {
			for (IPSSysBDScheme iPSSysBDScheme : psSysBDSchemes) {
				ISysBDSchemeRuntime iSysBDSchemeRuntime = this.getSysBDSchemeRuntime(iPSSysBDScheme.getId(), false);
				try {
					iSysBDSchemeRuntime.uninstall();
				} catch (Throwable ex) {
					throw new Exception(String.format("卸载系统大数据体系[%1$s]发生异常，%2$s", iSysBDSchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 卸载智能报表体系
		java.util.List<IPSSysBIScheme> psSysBISchemes = this.getPSSystem().getAllPSSysBISchemes();
		if (psSysBISchemes != null) {
			for (IPSSysBIScheme iPSSysBIScheme : psSysBISchemes) {
				ISysBISchemeRuntime iSysBISchemeRuntime = this.getSysBISchemeRuntime(iPSSysBIScheme.getId(), false);
				try {
					iSysBISchemeRuntime.uninstall();
				} catch (Throwable ex) {
					throw new Exception(String.format("卸载系统智能报表体系[%1$s]发生异常，%2$s", iSysBISchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 卸载搜索体系
		java.util.List<IPSSysSearchScheme> psSysSearchSchemes = this.getPSSystem().getAllPSSysSearchSchemes();
		if (psSysSearchSchemes != null) {
			for (IPSSysSearchScheme iPSSysSearchScheme : psSysSearchSchemes) {
				ISysSearchSchemeRuntime iSysSearchSchemeRuntime = this.getSysSearchSchemeRuntime(iPSSysSearchScheme.getId(), false);
				try {
					iSysSearchSchemeRuntime.uninstall();
				} catch (Throwable ex) {
					throw new Exception(String.format("卸载系统搜索体系[%1$s]发生异常，%2$s", iSysSearchSchemeRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		// 卸载消息模板
		java.util.List<IPSSysMsgTempl> psSysMsgTempls = this.getPSSystem().getAllPSSysMsgTempls();
		if (psSysMsgTempls != null) {
			for (IPSSysMsgTempl iPSSysMsgTempl : psSysMsgTempls) {
				net.ibizsys.runtime.msg.ISysMsgTemplRuntime iSysMsgTemplRuntime = this.getSysMsgTemplRuntime(iPSSysMsgTempl);
				if (!(iSysMsgTemplRuntime instanceof ISysMsgTemplRuntime)) {
					continue;
				}
				ISysMsgTemplRuntime iSysMsgTemplRuntime2 = (ISysMsgTemplRuntime) iSysMsgTemplRuntime;
				try {
					iSysMsgTemplRuntime2.uninstall();
				} catch (Throwable ex) {
					throw new Exception(String.format("卸载系统消息模板[%1$s]发生异常，%2$s", iSysMsgTemplRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 卸载模块功能
		java.util.List<IPSSystemModule> psSystemModules = this.getPSSystem().getAllPSSystemModules();
		if (psSystemModules != null) {
			for (IPSSystemModule iPSSystemModule : psSystemModules) {
				ISystemModuleRuntime iSystemModuleRuntime = this.getSystemModuleRuntime(iPSSystemModule.getId(), false);
				if (!(iSystemModuleRuntime instanceof ISystemModuleUtilRuntime)) {
					continue;
				}
				ISystemModuleUtilRuntime iSystemModuleUtilRuntime = (ISystemModuleUtilRuntime) iSystemModuleRuntime;
				try {
					iSystemModuleUtilRuntime.uninstall();
				} catch (Throwable ex) {
					log.error(String.format("卸载系统模块功能[%1$s]发生异常，%2$s", iSystemModuleRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}

		// 卸载系统引用
		java.util.List<IPSSysRef> psSysRefs = this.getPSSystem().getAllPSSysRefs();
		if (psSysRefs != null) {
			for (IPSSysRef iPSSysRef : psSysRefs) {
				ISysRefRuntime iSysRefRuntime = this.getSysRefRuntime(iPSSysRef.getId(), false);
				try {
					iSysRefRuntime.uninstall();
				} catch (Throwable ex) {
					log.error(String.format("卸载系统引用[%1$s]发生异常，%2$s", iSysRefRuntime.getName(), ex.getMessage()), ex);
				}
			}
		}
		
		if(!ObjectUtils.isEmpty(this.psDataEntityMap)) {
			this.psDataEntityMap.clear();
		}

		ModelRuntimeUtils.shutdownModelRuntimes(this.sysRefRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.systemModuleRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.dataEntityRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.dataEntityGroupRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysResourceRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysServiceAPIRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.applicationRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysDBSchemeRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysBDSchemeRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysSearchSchemeRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysBISchemeRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysBackendTaskRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.subSysServiceAPIRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysTestDataRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.sysUniStateRuntimeMap);

		super.onShutdown();
		
		this.defaultWebClient = null;
		
	}

}
