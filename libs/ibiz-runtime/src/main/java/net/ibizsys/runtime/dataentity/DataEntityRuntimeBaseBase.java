package net.ibizsys.runtime.dataentity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.dataentity.dts.IPSDEDTSQueue;
import net.ibizsys.model.dataentity.logic.IPSDEFLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.runtime.DynaInstModes;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncDirs;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncOutRuntime;
import net.ibizsys.runtime.dataentity.defield.DEFSequenceModes;
import net.ibizsys.runtime.dataentity.defield.DEFTranslatorModes;
import net.ibizsys.runtime.dataentity.defield.IDEFValueRuleRuntime;
import net.ibizsys.runtime.dataentity.dts.DEDTSQueueRuntime;
import net.ibizsys.runtime.dataentity.dts.IDEDTSQueueRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.ModelRuntimeUtils;

/**
 * 实体运行时功能基类
 * 
 * @author lionlau
 *
 */
public abstract class DataEntityRuntimeBaseBase extends net.ibizsys.runtime.ModelRuntimeBase implements IDataEntityRuntimeBase, IModelRuntimeShutdownable {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRuntimeBaseBase.class);

	private Map<String, IPSDEAction> psDEActionMap = new HashMap<String, IPSDEAction>();
	private Map<String, IPSDEField> psDEFieldMap = new HashMap<String, IPSDEField>();

	private Map<String, Object> dataEntityModelRuntimeMap =  new ConcurrentHashMap<String, Object>();
	
	private static Object EMPTY = new Object();
	
	
	private Map<String,IDEScriptLogicRuntime> deScriptLogicRuntimeMap = new ConcurrentHashMap<String,IDEScriptLogicRuntime>();
	
	private List<IDEDataSyncOutRuntime> deDataSyncOutRuntimeList = null;
	
	private List<IDEDataSyncInRuntime> deDataSyncInRuntimeList = null;
	
	private Map<String, IDENotifyRuntime> deNotifyRuntimeMap = null;
	
	private Map<String, IDEPrintRuntime> dePrintRuntimeMap = null;
	
	private Map<String, IDEReportRuntime> deReportRuntimeMap = null;
	
	private Map<String, IDELogicRuntime> deLogicRuntimeMap = new ConcurrentHashMap<String,IDELogicRuntime>();
	
	private Map<String, IDEDataImportRuntime> deDataImportRuntimeMap = null;
	
	private Map<String, IDEDataExportRuntime> deDataExportRuntimeMap = null;
	
	private Map<String, IDEDTSQueueRuntime> deDTSQueueRuntimeMap = null;
	
	private Map<String, IDEDataSyncOutRuntime> deDataSyncOutRuntimeMap = null;
	
	private Map<String, IPSDELogic> psDELogicMap = null;
	
	private Map<String, IDEMSLogicRuntime> deMSLogicRuntimeMap = new ConcurrentHashMap<String,IDEMSLogicRuntime>();
	
	private Map<String, IPSDEMSLogic> psDEMSLogicMap = null;
	
	private boolean bTranslateField = false;
	
	private boolean bComputeField = false;
	

	public abstract ISystemRuntime getSystemRuntime();
	
	private int nDynaInstMode = DynaInstModes.DISABLE;
	
	protected abstract IDataEntityRuntimeBaseContext getDataEntityRuntimeBaseContext();
	
	private boolean bHasMainStatePSDEFields = false;
	
	/**
	 * 获取当前实体运行时所处的动态实例模式
	 * @return
	 */
	public int getDynaInstMode() {
		return this.nDynaInstMode;
	}
	
	
	/**
	 * 设置是否需要转换属性
	 * @param bTranslateField
	 */
	protected void setTranslateField(boolean bTranslateField) {
		this.bTranslateField = bTranslateField;
	}
	
	
	protected boolean isTranslateField() {
		return this.bTranslateField;
	}
	
	/**
	 * 设置是否需要计算属性
	 * @param bComputeField
	 */
	protected void setComputeField(boolean bComputeField) {
		this.bComputeField = bComputeField;
	}
	
	
	protected boolean isComputeField() {
		return this.bComputeField;
	}
	
	
	protected ISystemRuntimeBase getCurrentSystemRuntimeBase(boolean bAllowChildDynaInst) {
		ISystemRuntimeBase iSystemRuntimeBase = null;
		if(ActionSessionManager.getCurrentSession()!=null) {
			if(bAllowChildDynaInst) {
				iSystemRuntimeBase = ActionSessionManager.getCurrentSession().getChildDynaInstRuntime();
				if(iSystemRuntimeBase!=null) {
					return iSystemRuntimeBase;
				}
			}
			iSystemRuntimeBase = ActionSessionManager.getCurrentSession().getDynaInstRuntime();
		}
		return (iSystemRuntimeBase != null) ?iSystemRuntimeBase:getSystemRuntime();
	}
	

	protected void onInit() throws Exception {

		if(this instanceof IDynaInstDataEntityRuntime) {
			if(((IDynaInstDataEntityRuntime)this).getDynaInstRuntime().getDynaInstMode() == DynaInstModes.ENABLEINST) {
				nDynaInstMode = DynaInstModes.ENABLEINST;
			}
			else {
				nDynaInstMode = DynaInstModes.ENABLE;
			}
		}
		
		
		this.psDEFieldMap.clear();
		java.util.List<IPSDEField> psDEFields = this.getPSDataEntity().getAllPSDEFields();
		if (psDEFields != null) {
			for (IPSDEField iPSDEField : psDEFields) {
				
				if(true) {
					String strSequenceMode = iPSDEField.getSequenceMode();
					if(StringUtils.hasLength(strSequenceMode) 
							&& !DEFSequenceModes.NONE.equals(strSequenceMode)
							&& ( DEFSequenceModes.CREATE.equals(strSequenceMode)
								|| DEFSequenceModes.GETDRAFT.equals(strSequenceMode))) {
						IPSSysSequence iPSSysSequence = iPSDEField.getPSSysSequence();
						if(iPSSysSequence == null) {
							throw new ModelException(iPSDEField, String.format("实体属性[%1$s]启用值序列却未指定值序列对象",iPSDEField.getName()));
						}
					}
				}
				
				if(true) {
					String strTranslatorMode = iPSDEField.getTranslatorMode();
					if(StringUtils.hasLength(strTranslatorMode) 
							&& !DEFTranslatorModes.NONE.equals(strTranslatorMode)) {
						this.setTranslateField(true);
						if(DEFTranslatorModes.TRANSLATE.equals(strTranslatorMode)
									|| DEFTranslatorModes.TRANSLATE2.equals(strTranslatorMode)) {
							IPSSysTranslator iPSSysTranslator = iPSDEField.getPSSysTranslator();
							if(iPSSysTranslator == null) {
								throw new ModelException(iPSDEField, String.format("实体属性[%1$s]启用值转换却未指定值转换器对象",iPSDEField.getName()));
							}
						}
					}
				}
				
				if(true) {
					IPSDEFLogic iPSDEFLogic = iPSDEField.getComputePSDEFLogic();
					if(iPSDEFLogic != null) {
						this.setComputeField(true);
					}
				}
				
				
				psDEFieldMap.put(iPSDEField.getName().toUpperCase(), iPSDEField);
			}
		}
		
		this.psDEActionMap.clear();
		java.util.List<IPSDEAction> psDEActions = this.getPSDataEntity().getAllPSDEActions();
		if (psDEActions != null) {
			for (IPSDEAction iPSDEAction : psDEActions) {
				// 准备行为参数
				iPSDEAction.getPSDEActionParams();
				//this.psDEActionMap.put(iPSDEAction.getName(), iPSDEAction);
				this.psDEActionMap.put(iPSDEAction.getName().toLowerCase(), iPSDEAction);
			}
		}
		
		/**
		 * 准备实体处理逻辑
		 */
		this.psDELogicMap = null;
		java.util.List<IPSDELogic> psDELogics = this.getPSDataEntity().getAllPSDELogics();
		if(psDELogics != null) {
			this.psDELogicMap = new HashMap<String, IPSDELogic>();
			for(IPSDELogic iPSDELogic : psDELogics) {
				this.psDELogicMap.put(iPSDELogic.getId(), iPSDELogic);
				if(StringUtils.hasLength(iPSDELogic.getCodeName())) {
					this.psDELogicMap.put(iPSDELogic.getCodeName().toUpperCase(), iPSDELogic);
				}
			}
		}
		
		this.bHasMainStatePSDEFields = !ObjectUtils.isEmpty(this.getPSDataEntity().getMainStatePSDEFields());
		/**
		 * 准备实体主状态逻辑
		 */
		this.psDEMSLogicMap = null;
		java.util.List<IPSDEMSLogic> psDEMSLogics = this.getPSDataEntity().getAllPSDEMSLogics();
		if(psDEMSLogics != null) {
			this.psDEMSLogicMap = new HashMap<String, IPSDEMSLogic>();
			for(IPSDEMSLogic iPSDEMSLogic : psDEMSLogics) {
				this.psDEMSLogicMap.put(iPSDEMSLogic.getId(), iPSDEMSLogic);
				if(StringUtils.hasLength(iPSDEMSLogic.getCodeName())) {
					this.psDEMSLogicMap.put(iPSDEMSLogic.getCodeName().toUpperCase(), iPSDEMSLogic);
				}
				String strMSTag = null;
				if(StringUtils.hasLength(iPSDEMSLogic.getLogicTag2())) {
					if(StringUtils.hasLength(iPSDEMSLogic.getLogicTag())) {
						strMSTag = String.format("%1$s__%2$s__%3$s", iPSDEMSLogic.getLogicTag(), iPSDEMSLogic.getLogicTag2(), "*");
					}
					else {
						strMSTag = String.format("%1$s__%2$s__%3$s", "*", iPSDEMSLogic.getLogicTag2(), "*");
					}
				}
				else {
					if(StringUtils.hasLength(iPSDEMSLogic.getLogicTag())) {
						strMSTag = String.format("%1$s__%2$s", iPSDEMSLogic.getLogicTag(), "*");
					}
				}
				if(!StringUtils.hasLength(strMSTag)) {
					log.warn(String.format("主状态逻辑[%1$s]未定义逻辑标记", iPSDEMSLogic.getName()));
				}
				else {
					this.psDEMSLogicMap.put(strMSTag, iPSDEMSLogic);
				}
			}
		}
		
		if(getDynaInstMode() == DynaInstModes.ENABLE || this.getDynaInstMode() == DynaInstModes.DISABLE) {
			//准备实体数据同步
			java.util.List<IPSDEDataSync> psDEDataSyncs = this.getPSDataEntity().getAllPSDEDataSyncs();
			if (psDEDataSyncs != null) {
				for (IPSDEDataSync iPSDEDataSync : psDEDataSyncs) {
					if(!iPSDEDataSync.isValid()) {
						continue;
					}
					if(DEDataSyncDirs.OUT.equals(iPSDEDataSync.getSyncDir())) {
						IDEDataSyncOutRuntime iDEDataSynOutRuntime = this.getDataEntityRuntime().createDEDataSyncOutRuntime(iPSDEDataSync);
						if(iDEDataSynOutRuntime == null) {
							throw new Exception(String.format("无法建立实体数据同步（输出）[%1$s]运行时对象", iPSDEDataSync.getName()));
						}
						iDEDataSynOutRuntime.init(this, iPSDEDataSync);
						if(this.deDataSyncOutRuntimeList == null) {
							this.deDataSyncOutRuntimeList = new ArrayList<IDEDataSyncOutRuntime>();
						}
						this.deDataSyncOutRuntimeList.add(iDEDataSynOutRuntime);
						
						if(this.deDataSyncOutRuntimeMap == null) {
							this.deDataSyncOutRuntimeMap = new HashMap<String, IDEDataSyncOutRuntime>();
						}
						this.deDataSyncOutRuntimeMap.put(iPSDEDataSync.getId(), iDEDataSynOutRuntime);
						
						continue;
					}
					
					if(DEDataSyncDirs.IN.equals(iPSDEDataSync.getSyncDir())) {
						IDEDataSyncInRuntime iDEDataSynInRuntime = this.getDataEntityRuntime().createDEDataSyncInRuntime(iPSDEDataSync);
						if(iDEDataSynInRuntime == null) {
							throw new Exception(String.format("无法建立实体数据同步（输入）[%1$s]运行时对象", iPSDEDataSync.getName()));
						}
						iDEDataSynInRuntime.init(this, iPSDEDataSync);
						if(this.deDataSyncInRuntimeList == null) {
							this.deDataSyncInRuntimeList = new ArrayList<IDEDataSyncInRuntime>();
						}
						this.deDataSyncInRuntimeList.add(iDEDataSynInRuntime);
						continue;
					}
					
				}
			}
		}
		
		//准备实体通知
		java.util.List<IPSDENotify> psDENotifies = this.getPSDataEntity().getAllPSDENotifies();
		if (psDENotifies != null) {
			this.deNotifyRuntimeMap = new HashMap<String, IDENotifyRuntime>();
			for (IPSDENotify iPSDENotify : psDENotifies) {
				IDENotifyRuntime iDEDataSyncRuntime = this.getDataEntityRuntime().createDENotifyRuntime(iPSDENotify);
				if(iDEDataSyncRuntime == null) {
					throw new Exception(String.format("无法建立实体通知[%1$s]运行时对象", iPSDENotify.getName()));
				}
				iDEDataSyncRuntime.init(this, iPSDENotify);
				this.deNotifyRuntimeMap.put(iPSDENotify.getId(),iDEDataSyncRuntime);
			}
		}
		
		//准备实体打印
		java.util.List<IPSDEPrint> psDEPrints = this.getPSDataEntity().getAllPSDEPrints();
		if (psDEPrints != null) {
			this.dePrintRuntimeMap = new HashMap<String, IDEPrintRuntime>();
			for (IPSDEPrint iPSDEPrint : psDEPrints) {
				IDEPrintRuntime iDEPrintRuntime = this.getDataEntityRuntime().createDEPrintRuntime(iPSDEPrint);
				if(iDEPrintRuntime == null) {
					throw new Exception(String.format("无法建立实体打印[%1$s]运行时对象", iPSDEPrint.getName()));
				}
				iDEPrintRuntime.init(this, iPSDEPrint);
				this.dePrintRuntimeMap.put(iPSDEPrint.getId(),iDEPrintRuntime);
				if(StringUtils.hasLength(iPSDEPrint.getCodeName())) {
					this.dePrintRuntimeMap.put(iPSDEPrint.getCodeName(),iDEPrintRuntime);
					this.dePrintRuntimeMap.put(iPSDEPrint.getCodeName().toUpperCase(),iDEPrintRuntime);
				}
			}
		}
		
		//准备实体报表
		java.util.List<IPSDEReport> psDEReports = this.getPSDataEntity().getAllPSDEReports();
		if (psDEReports != null) {
			this.deReportRuntimeMap = new HashMap<String, IDEReportRuntime>();
			for (IPSDEReport iPSDEReport : psDEReports) {
				IDEReportRuntime iDEReportRuntime = this.getDataEntityRuntime().createDEReportRuntime(iPSDEReport);
				if(iDEReportRuntime == null) {
					throw new Exception(String.format("无法建立实体报表[%1$s]运行时对象", iPSDEReport.getName()));
				}
				iDEReportRuntime.init(this, iPSDEReport);
				this.deReportRuntimeMap.put(iPSDEReport.getId(),iDEReportRuntime);
				if(StringUtils.hasLength(iPSDEReport.getCodeName())) {
					this.deReportRuntimeMap.put(iPSDEReport.getCodeName(),iDEReportRuntime);
					this.deReportRuntimeMap.put(iPSDEReport.getCodeName().toUpperCase(),iDEReportRuntime);
				}
			}
		}
	}
	
	protected abstract void prepare();

	@Override
	public IPSDEField getPSDEField(String strName) {
		prepare();
		return this.psDEFieldMap.get(strName.toUpperCase());
	}

	@Override
	public IPSDEAction getPSDEAction(String strName) {
		prepare();
		return this.psDEActionMap.get(strName.toLowerCase());
	}
	
	
	@Override
	public IPSDELogic getPSDELogic(String strName) {
		prepare();
		if(!ObjectUtils.isEmpty(this.psDELogicMap)) {
			//ID，直接获取
			IPSDELogic iPSDELogic = this.psDELogicMap.get(strName);
			if(iPSDELogic != null) {
				return iPSDELogic;
			}
			return this.psDELogicMap.get(strName.toUpperCase());
		}
		return null;
	}


	@Override
	public IDEScriptLogicRuntime getDEScriptLogicRuntime(String strLogicMode, String strScriptCode) {
		return getDEScriptLogicRuntime(strLogicMode, strScriptCode, false);
	}
	
	protected IDEScriptLogicRuntime getDEScriptLogicRuntime(String strLogicMode, String strScriptCode,boolean bTryMode) {
		String strLogicTag = String.format("%1$s|%2$s", strLogicMode, strScriptCode);
		IDEScriptLogicRuntime iDEScriptActionRuntime = this.deScriptLogicRuntimeMap.get(strLogicTag);
		if(iDEScriptActionRuntime != null || bTryMode ) {
			return iDEScriptActionRuntime;
		}
			
		iDEScriptActionRuntime = createDEScriptLogicRuntime(strLogicMode, strScriptCode);
		try {
			iDEScriptActionRuntime.init(this.getSystemRuntime().getSystemRTScriptContext(), getDataEntityRuntime(),strLogicMode, strScriptCode);
		} catch (Exception e) {
			log.error(String.format("初始化实体脚本逻辑运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体脚本逻辑运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		this.deScriptLogicRuntimeMap.put(strLogicTag, iDEScriptActionRuntime);
		return iDEScriptActionRuntime;
	}
	
	/**
	 * 获取当前的实体运行时对象
	 * @return
	 */
	public abstract IDataEntityRuntime getDataEntityRuntime();
	
	/**
	 * 建立实体脚本逻辑运行时对象
	 * @param strLogicMode 逻辑模式
	 * @param strScriptCode
	 * @return
	 */
	public abstract IDEScriptLogicRuntime createDEScriptLogicRuntime(String strLogicMode, String strScriptCode);
	
	
	@Override
	public List<IDEDataSyncOutRuntime> getDEDataSyncOutRuntimes() {
		prepare();
		return this.deDataSyncOutRuntimeList;
	}
	
	@Override
	public IDEDataSyncOutRuntime getDEDataSyncOutRuntime(IPSDEDataSync iPSDEDataSync) {
		prepare();
		if(this.deDataSyncOutRuntimeMap != null) {
			IDEDataSyncOutRuntime iDEDataSyncOutRuntime = this.deDataSyncOutRuntimeMap.get(iPSDEDataSync.getId());
			if(iDEDataSyncOutRuntime != null) {
				return iDEDataSyncOutRuntime;
			}
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取实体数据同步输出[%1$s]运行时对象",iPSDEDataSync.getName()));
	}
	
	
	
	@Override
	public IDENotifyRuntime getDENotifyRuntime(IPSDENotify iPSDENotify) {
		prepare();
		if(this.deNotifyRuntimeMap != null) {
			IDENotifyRuntime iDENotifyRuntime = this.deNotifyRuntimeMap.get(iPSDENotify.getId());
			if(iDENotifyRuntime != null) {
				return iDENotifyRuntime;
			}
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取实体通知[%1$s]运行时对象",iPSDENotify.getName()));
	}
	
	@Override
	public IDEPrintRuntime getDEPrintRuntime(IPSDEPrint iPSDEPrint) {
		prepare();
		if(this.dePrintRuntimeMap != null) {
			IDEPrintRuntime iDEPrintRuntime = this.dePrintRuntimeMap.get(iPSDEPrint.getId());
			if(iDEPrintRuntime != null) {
				return iDEPrintRuntime;
			}
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取实体打印[%1$s]运行时对象",iPSDEPrint.getName()));
	}
	
	@Override
	public IDEReportRuntime getDEReportRuntime(IPSDEReport iPSDEReport) {
		prepare();
		if(this.deReportRuntimeMap != null) {
			IDEReportRuntime iDEReportRuntime = this.deReportRuntimeMap.get(iPSDEReport.getId());
			if(iDEReportRuntime != null) {
				return iDEReportRuntime;
			}
		}
		throw new DataEntityRuntimeException(this, String.format("无法获取实体报表[%1$s]运行时对象",iPSDEReport.getName()));
	}
	
	

	
	@Override
	public IDEPrintRuntime getDEPrintRuntime(String strId) {
		return this.getDEPrintRuntime(strId, false);
	}
	
	@Override
	public IDEPrintRuntime getDEPrintRuntime(String strId, boolean bTryMode) {
		Assert.hasLength(strId, "未指定实体打印标识");
		
		prepare();
		if(this.dePrintRuntimeMap != null) {
			IDEPrintRuntime iDEPrintRuntime = this.dePrintRuntimeMap.get(strId);
			if(iDEPrintRuntime == null) {
				iDEPrintRuntime = this.dePrintRuntimeMap.get(strId.toUpperCase());
			}
			if(iDEPrintRuntime != null) {
				return iDEPrintRuntime;
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new DataEntityRuntimeException(this, String.format("无法获取实体打印[%1$s]运行时对象",strId));
	}
	
	@Override
	public IDEReportRuntime getDEReportRuntime(String strId) {
		return this.getDEReportRuntime(strId, false);
	}
	
	@Override
	public IDEReportRuntime getDEReportRuntime(String strId, boolean bTryMode) {
		Assert.hasLength(strId, "未指定实体报表标识");
		
		prepare();
		if(this.deReportRuntimeMap != null) {
			IDEReportRuntime iDEReportRuntime = this.deReportRuntimeMap.get(strId);
			if(iDEReportRuntime == null) {
				iDEReportRuntime = this.deReportRuntimeMap.get(strId.toUpperCase());
			}
			if(iDEReportRuntime != null) {
				return iDEReportRuntime;
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new DataEntityRuntimeException(this, String.format("无法获取实体报表[%1$s]运行时对象",strId));
	}
	
	
	
	@Override
	public IPSModelObject getPSModelObject() {
		try {
			return this.getPSDataEntity();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体模型发生异常，%1$s", ex.getMessage()) ,ex);
		}
	}
	
	
	@Override
	public IDELogicRuntime getDELogicRuntime(IPSDELogic iPSDELogic) {
		return getDELogicRuntime(iPSDELogic, false);
	}
	
	protected IDELogicRuntime getDELogicRuntime(IPSDELogic iPSDELogic, boolean bTryMode) {
		IDELogicRuntime iDELogicRuntime = this.deLogicRuntimeMap.get(iPSDELogic.getId());
		if(iDELogicRuntime != null || bTryMode ) {
			return iDELogicRuntime;
		}
			
		iDELogicRuntime = createDELogicRuntime(iPSDELogic);
		try {
			iDELogicRuntime.init(this.getDataEntityRuntimeBaseContext(), iPSDELogic);
		} catch (Exception e) {
			log.error(String.format("初始化实体逻辑运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体逻辑运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		this.deLogicRuntimeMap.put(iPSDELogic.getId(), iDELogicRuntime);
		return iDELogicRuntime;
	}
	
	@Override
	public IDELogicRuntime getDELogicRuntime(String strId) {
		return this.getDELogicRuntime(strId, false);
	}
	
	@Override
	public IDELogicRuntime getDELogicRuntime(String strId, boolean bTryMode) {
		
		Assert.hasLength(strId, "未指定实体处理逻辑标识");
		
		prepare();
		
		IPSDELogic iPSDELogic = null;
		if(this.psDELogicMap != null) {
			iPSDELogic = this.psDELogicMap.get(strId);
			if(iPSDELogic == null) {
				iPSDELogic =  this.psDELogicMap.get(strId.toUpperCase());
			}
			
			if(iPSDELogic != null) {
				return getDELogicRuntime(iPSDELogic);
			}
		}		
		
		if(bTryMode) {
			return null;
		}
		
		throw new DataEntityRuntimeException(this, String.format("无法获取实体处理逻辑[%1$s]运行时对象",strId));
	}
	
	@Override
	public IDEMSLogicRuntime getDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic) {
		return getDEMSLogicRuntime(iPSDEMSLogic, false);
	}
	
	protected IDEMSLogicRuntime getDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic, boolean bTryMode) {
		IDEMSLogicRuntime iDEMSLogicRuntime = this.deMSLogicRuntimeMap.get(iPSDEMSLogic.getId());
		if(iDEMSLogicRuntime != null || bTryMode ) {
			return iDEMSLogicRuntime;
		}
			
		iDEMSLogicRuntime = createDEMSLogicRuntime(iPSDEMSLogic);
		try {
			iDEMSLogicRuntime.init(this.getDataEntityRuntimeBaseContext(), iPSDEMSLogic);
		} catch (Exception e) {
			log.error(String.format("初始化实体主状态逻辑运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体主状态逻辑运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		this.deMSLogicRuntimeMap.put(iPSDEMSLogic.getId(), iDEMSLogicRuntime);
		return iDEMSLogicRuntime;
	}
	

	@Override
	public IDEMSLogicRuntime getDEMSLogicRuntime(String strId) {
		return this.getDEMSLogicRuntime(strId, false);
	}
	
	@Override
	public IDEMSLogicRuntime getDEMSLogicRuntime(String strId, boolean bTryMode) {
		
		Assert.hasLength(strId, "未指定实体主状态逻辑标识");
		
		prepare();
		
		IPSDEMSLogic iPSDEMSLogic = null;
		if(this.psDEMSLogicMap != null) {
			iPSDEMSLogic = this.psDEMSLogicMap.get(strId);
			if(iPSDEMSLogic == null) {
				iPSDEMSLogic =  this.psDEMSLogicMap.get(strId.toUpperCase());
			}
			
			if(iPSDEMSLogic != null) {
				return getDEMSLogicRuntime(iPSDEMSLogic);
			}
		}		
		
		if(bTryMode) {
			return null;
		}
		
		throw new DataEntityRuntimeException(this, String.format("无法获取实体主状态逻辑[%1$s]运行时对象",strId));
	}
	
	/**
	 * 是否支持实体主状态逻辑
	 * @return
	 */
	protected boolean isEnableDEMSLogic() {
		prepare();
		return !ObjectUtils.isEmpty(this.psDEMSLogicMap) && this.bHasMainStatePSDEFields;
	}
	
	@Override
	public IDEDataImportRuntime getDEDataImportRuntime(String strId) {
		
		prepare();
		IPSDEDataImport iPSDEDataImport = null;
		java.util.List<IPSDEDataImport> list;
		try {
			list = this.getPSDataEntity().getAllPSDEDataImports();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体全部数据导入发生异常，%1$s",ex.getMessage()),ex);
		}
		if(list != null) {
			for(IPSDEDataImport item : list) {
				if(StringUtils.isEmpty(strId)) {
					if(item.isDefaultMode()) {
						iPSDEDataImport = item;
						break;
					}
				}
				else if(strId.equals(item.getId()) || strId.equalsIgnoreCase(item.getCodeName())) {
					iPSDEDataImport = item;
					break;
				}
			}
		}
		
		if(iPSDEDataImport != null) {
			return getDEDataImportRuntime(iPSDEDataImport);
		}
		
		throw new DataEntityRuntimeException(this, String.format("无法获取实体导入[%1$s]运行时对象",strId));
	}
	
	@Override
	public IDEDataImportRuntime getDEDataImportRuntime(IPSDEDataImport iPSDEDataImport) {
		prepare();
		IDEDataImportRuntime iDEDataImportRuntime = null;
		if(this.deDataImportRuntimeMap != null) {
			iDEDataImportRuntime = this.deDataImportRuntimeMap.get(iPSDEDataImport.getId());
			if(iDEDataImportRuntime != null) {
				return iDEDataImportRuntime;
			}
		}
		iDEDataImportRuntime = createDEDataImportRuntime(iPSDEDataImport);
		try {
			iDEDataImportRuntime.init(this.getDataEntityRuntimeBaseContext(), iPSDEDataImport);
		} catch (Exception e) {
			log.error(String.format("初始化实体数据导入运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体数据导入运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		if(this.deDataImportRuntimeMap == null) {
			this.deDataImportRuntimeMap = new ConcurrentHashMap<>();
		}
		this.deDataImportRuntimeMap.put(iPSDEDataImport.getId(), iDEDataImportRuntime);
		return iDEDataImportRuntime;
	}
	
	@Override
	public IDEDataExportRuntime getDEDataExportRuntime(String strId) {
		
		Assert.hasLength(strId, "未指定实体数据导出标识");
		
		prepare();
		IPSDEDataExport iPSDEDataExport = null;
		java.util.List<IPSDEDataExport> list;
		try {
			list = this.getPSDataEntity().getAllPSDEDataExports();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体全部数据导出发生异常，%1$s",ex.getMessage()),ex);
		}
		if(list != null) {
			for(IPSDEDataExport item : list) {
				if(strId.equals(item.getId()) || strId.equalsIgnoreCase(item.getCodeName())) {
					iPSDEDataExport = item;
					break;
				}
			}
		}
		
		if(iPSDEDataExport != null) {
			return getDEDataExportRuntime(iPSDEDataExport);
		}
		
		throw new DataEntityRuntimeException(this, String.format("无法获取实体导出[%1$s]运行时对象",strId));
	}
	
	@Override
	public IDEDataExportRuntime getDEDataExportRuntime(IPSDEDataExport iPSDEDataExport) {
		prepare();
		IDEDataExportRuntime iDEDataExportRuntime = null;
		if(this.deDataExportRuntimeMap != null) {
			iDEDataExportRuntime = this.deDataExportRuntimeMap.get(iPSDEDataExport.getId());
			if(iDEDataExportRuntime != null) {
				return iDEDataExportRuntime;
			}
		}
		iDEDataExportRuntime = createDEDataExportRuntime(iPSDEDataExport);
		try {
			iDEDataExportRuntime.init(this.getDataEntityRuntimeBaseContext(), iPSDEDataExport);
		} catch (Exception e) {
			log.error(String.format("初始化实体数据导出运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体数据导出运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		if(this.deDataExportRuntimeMap == null) {
			this.deDataExportRuntimeMap = new ConcurrentHashMap<>();
		}
		this.deDataExportRuntimeMap.put(iPSDEDataExport.getId(), iDEDataExportRuntime);
		return iDEDataExportRuntime;
	}
	
	
	
	@Override
	public IDEDTSQueueRuntime getDEDTSQueueRuntime(IPSDEDTSQueue iPSDEDTSQueue) {
		prepare();
		IDEDTSQueueRuntime iDEDTSQueueRuntime = null;
		if(this.deDTSQueueRuntimeMap != null) {
			iDEDTSQueueRuntime = this.deDTSQueueRuntimeMap.get(iPSDEDTSQueue.getId());
			if(iDEDTSQueueRuntime != null) {
				return iDEDTSQueueRuntime;
			}
		}
		iDEDTSQueueRuntime = createDEDTSQueueRuntime(iPSDEDTSQueue);
		try {
			iDEDTSQueueRuntime.init(this.getDataEntityRuntimeBaseContext(), iPSDEDTSQueue);
		} catch (Exception e) {
			log.error(String.format("初始化实体数据同步运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体数据同步运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		if(this.deDTSQueueRuntimeMap == null) {
			this.deDTSQueueRuntimeMap = new ConcurrentHashMap<>();
		}
		this.deDTSQueueRuntimeMap.put(iPSDEDTSQueue.getId(), iDEDTSQueueRuntime);
		return iDEDTSQueueRuntime;
	}
	
	
	@Override
	public IDEDTSQueueRuntime getDEDTSQueueRuntime(String strId) {
		
		Assert.hasLength(strId, "未指定实体异步处理对象标识");
		
		prepare();
		IPSDEDTSQueue iPSDEDTSQueue = null;
		java.util.List<IPSDEDTSQueue> list;
		try {
			list = this.getPSDataEntity().getAllPSDEDTSQueues();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体全部异步处理对象发生异常，%1$s",ex.getMessage()),ex);
		}
		if(list != null) {
			for(IPSDEDTSQueue item : list) {
				if(strId.equals(item.getId()) || strId.equalsIgnoreCase(item.getCodeName())) {
					iPSDEDTSQueue = item;
					break;
				}
			}
		}
		
		if(iPSDEDTSQueue != null) {
			return getDEDTSQueueRuntime(iPSDEDTSQueue);
		}
		
		throw new DataEntityRuntimeException(this, String.format("无法获取实体异步处理对象[%1$s]运行时对象",strId));
	}
	
	/**
	 * 建立实体逻辑运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	public abstract IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic);
	
	
	/**
	 * 建立实体主状态逻辑运行时对象
	 * @param iPSDEMSLogic
	 * @return
	 */
	public abstract IDEMSLogicRuntime createDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic);
	
	
	/**
	 * 建立实体数据导入运行时对象
	 * @param iPSDEDataImport
	 * @return
	 */
	public abstract IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport);
	
	
	/**
	 * 建立实体数据导出运行时对象
	 * @param iPSDEDataExport
	 * @return
	 */
	public abstract IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport);
	
	
	
	/**
	 * 建立实体异步处理运行时对象
	 * @param iPSDEDTSQueue
	 * @return
	 */
	public IDEDTSQueueRuntime createDEDTSQueueRuntime(IPSDEDTSQueue iPSDEDTSQueue) {
		return new DEDTSQueueRuntime();
	}
	
	
	public IDEFValueRuleRuntime getDEFValueRuleRuntime(IPSDEFValueRule iPSDEFValueRule) {
		IPSSysSFPlugin iPSSysSFPlugin = iPSDEFValueRule.getPSSysSFPlugin();
		if(iPSSysSFPlugin == null) {
			return null;
		}
		
		String strTag = String.format("PSDEFVALUERULE|%1$s|%2$s", iPSDEFValueRule.getParentPSModelObject(IPSDEField.class).getName(), iPSDEFValueRule.getCodeName());
		Object objDataEntityModelRuntime = this.dataEntityModelRuntimeMap.get(strTag);
		if(objDataEntityModelRuntime != null) {
			if(objDataEntityModelRuntime == EMPTY) {
				return null;
			}
			return (IDEFValueRuleRuntime)objDataEntityModelRuntime;
		}
		
		IDEFValueRuleRuntime iDEFValueRuleRuntime = this.getSystemRuntime().getRuntimeObject(iPSSysSFPlugin, IDEFValueRuleRuntime.class, true);
		if(iDEFValueRuleRuntime == null) {
			this.dataEntityModelRuntimeMap.put(strTag, EMPTY);
			return iDEFValueRuleRuntime;
		}
		
		try {
			iDEFValueRuleRuntime.init(this.getDataEntityRuntimeBaseContext(), iPSDEFValueRule);
		} catch (Exception e) {
			log.error(String.format("初始化实体属性值规则运行时对象发生异常，%1$s",e.getMessage()),e);
			throw new DataEntityRuntimeException(this, String.format("初始化实体属性值规则运行时对象发生异常，%1$s",e.getMessage()), e);
		}
		this.dataEntityModelRuntimeMap.put(strTag, iDEFValueRuleRuntime);
		return iDEFValueRuleRuntime;
	}
	
	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		if(!ObjectUtils.isEmpty(this.psDEActionMap)) {
			this.psDEActionMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.psDEFieldMap)) {
			this.psDEFieldMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.dataEntityModelRuntimeMap)) {
			this.dataEntityModelRuntimeMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.psDELogicMap)) {
			this.psDELogicMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.psDEMSLogicMap)) {
			this.psDEMSLogicMap.clear();
		}
		
		ModelRuntimeUtils.shutdownModelRuntimes(this.deScriptLogicRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataSyncOutRuntimeList);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataSyncInRuntimeList);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deNotifyRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.dePrintRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deReportRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deLogicRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataImportRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataExportRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDTSQueueRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deDataSyncOutRuntimeMap);
		ModelRuntimeUtils.shutdownModelRuntimes(this.deMSLogicRuntimeMap);
	}
	
	
//	public IDEActionLogicRuntime getDEActionLogicRuntime(IPSDEActionLogic iPSDEActionLogic) {
//		IPSSysSFPlugin iPSSysSFPlugin = iPSDEActionLogic.getPSSysSFPlugin();
//		if(iPSSysSFPlugin == null) {
//			return null;
//		}
//		
//		String strTag = String.format("PSDEFVALUERULE|%1$s|%2$s", iPSDEActionLogic.getParentPSModelObject(IPSDEField.class).getName(), iPSDEActionLogic.getCodeName());
//		Object objDataEntityModelRuntime = this.dataEntityModelRuntimeMap.get(strTag);
//		if(objDataEntityModelRuntime != null) {
//			if(objDataEntityModelRuntime == EMPTY) {
//				return null;
//			}
//			return (IDEActionLogicRuntime)objDataEntityModelRuntime;
//		}
//		
//		IDEActionLogicRuntime iDEActionLogicRuntime = this.getSystemRuntime().getRuntimeObject(iPSSysSFPlugin, IDEActionLogicRuntime.class, true);
//		if(iDEActionLogicRuntime == null) {
//			this.dataEntityModelRuntimeMap.put(strTag, EMPTY);
//			return iDEActionLogicRuntime;
//		}
//		
//		try {
//			iDEActionLogicRuntime.init(this.getDataEntityRuntimeBaseContext(), iPSDEActionLogic);
//		} catch (Exception e) {
//			log.error(String.format("初始化实体属性值规则运行时对象发生异常，%1$s",e.getMessage()),e);
//			throw new DataEntityRuntimeException(this, String.format("初始化实体属性值规则运行时对象发生异常，%1$s",e.getMessage()), e);
//		}
//		this.dataEntityModelRuntimeMap.put(strTag, iDEActionLogicRuntime);
//		return iDEActionLogicRuntime;
//	}
	
}
