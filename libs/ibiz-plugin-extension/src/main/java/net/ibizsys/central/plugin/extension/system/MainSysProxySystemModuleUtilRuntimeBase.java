package net.ibizsys.central.plugin.extension.system;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.system.SystemModuleUtilRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.extension.system.util.IMainSysModelRuntimeProxy;
import net.ibizsys.central.plugin.extension.system.util.MainSysDataEntityRuntimeProxy;
import net.ibizsys.central.plugin.extension.system.util.MainSysModelRuntimeProxy;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.security.ISysUniResRuntime;
import net.ibizsys.central.security.ISysUserRoleRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.PSModelEnums.DEVirtualMode;
import net.ibizsys.model.PSModelEnums.ModuleUtilType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.database.IPSSysDBValueFunc;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysResource;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.search.IPSSysSearchScheme;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.ISysValueFuncRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

public class MainSysProxySystemModuleUtilRuntimeBase extends SystemModuleUtilRuntimeBase implements IMainSysProxySystemModuleUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ExtensionSystemModuleUtilRuntimeBase.class);
	
	private IServiceSystemRuntime mainSystemRuntime = null;
	
	private List<IMainSysModelRuntimeProxy<?>> mainSysModelRuntimeProxyList = new ArrayList<>();
	
	@Override
	protected IMainSysProxySystemModuleUtilRuntimeContext createModelRuntimeContext() {
		return new MainSysProxySystemModuleUtilRuntimeContextBase<IMainSysProxySystemModuleUtilRuntime, ISystemModuleUtilRuntimeContext>(super.createModelRuntimeContext()) {
		};
	}

	@Override
	protected IMainSysProxySystemModuleUtilRuntimeContext getModelRuntimeContext() {
		return (IMainSysProxySystemModuleUtilRuntimeContext)super.getModelRuntimeContext();
	}
	
	@Override
	protected void onInit() throws Exception {
		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			this.mainSystemRuntime = ((IServiceSystemRuntime)this.getSystemRuntime()).getMainSystemRuntime(true);
		}
		super.onInit();
	}
	
	protected IServiceSystemRuntime getMainSystemRuntime(boolean bTryMode) throws Exception {
		if(this.mainSystemRuntime != null || bTryMode) {
			return this.mainSystemRuntime;
		}
		throw new Exception("未指定主系统运行时对象");
	}
	
	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
		prepareDataEntityRuntimes();
	}
	
	protected void prepareDataEntityRuntimes() throws Exception {
		IServiceSystemRuntime mainSystemRuntime = this.getMainSystemRuntime(true);
		if(mainSystemRuntime == null) {
			return;
		}
		
		//安装动态属性
		List<IPSDataEntity> psDataEntityList = this.getPSSystemModule().getAllPSDataEntities();
		if(!ObjectUtils.isEmpty(psDataEntityList)) {
			for(IPSDataEntity iPSDataEntity : psDataEntityList) {
//				IDataEntityRuntime iDataEntityRuntime = mainSystemRuntime.getDataEntityRuntime(iPSDataEntity.getId(), true);
//				if(iDataEntityRuntime != null ) {
//					
//					
//				}
				
//				if(StringUtils.hasLength(strExtensionId)) {
//					IDataEntityRuntime iDataEntityRuntime = mainSystemRuntime.getDataEntityRuntime(iPSDataEntity.getId(), true);
//					if(iDataEntityRuntime != null && iDataEntityRuntime.isEnableDynaStorage()) {
//						List<IPSDEField> psDEFields2 = iPSDataEntity.getAllPSDEFields();
//						if(!ObjectUtils.isEmpty(psDEFields2)) {
//							List<IPSDEField> psDEFields = iDataEntityRuntime.getPSDEFields(true);
//							Map<String, IPSDEField> psDEFieldMap = new LinkedHashMap<String, IPSDEField>();
//							if(!ObjectUtils.isEmpty(psDEFields)) {
//								for(IPSDEField iPSDEField : psDEFields) {
//									psDEFieldMap.put(iPSDEField.getName().toUpperCase(), iPSDEField);
//								}
//							}
//							
//							for(IPSDEField iPSDEField2 : psDEFields2) {
//								IPSDEField iPSDEField = psDEFieldMap.get(iPSDEField2.getName().toUpperCase());  
//								if(iPSDEField != null) {
//									continue;
//								}
//								
//								if(iPSDEField2.getDEFType() != DEFType.DYNASTORAGE.value && iPSDEField2.getDEFType() != DEFType.PHISICAL.value) {
//									continue;
//								}
//								
//								//属性不存在，新建
//								PSDEField psDEField = new PSDEField();
//								psDEField.setPSDEId(iDataEntityRuntime.getFullUniqueTag());
//								psDEField.setPSDEName(iDataEntityRuntime.getName());
//								
//								String strPSDEFieldName = iPSDEField2.getName().toUpperCase();
//								
//								
//								String strFieldId = String.format("%1$s.%2$s", psDEField.getPSDEId(), strPSDEFieldName.toLowerCase());
//								
//								psDEField.setPSDEFieldId(strFieldId);
//								psDEField.setPSDEFieldName(strPSDEFieldName.toUpperCase());
//								psDEField.setDEFType(DEFType.DYNASTORAGE.value);
//								
//								psDEField.setCodeName(strPSDEFieldName.toLowerCase());
//								
//								psDEField.setPSDataTypeId(iPSDEField2.getDataType());
//								DEFDataType dEFDataType = DEFDataType.from(iPSDEField2.getDataType());
//								psDEField.setPSDataTypeName(dEFDataType.text);
//	
//								V2SystemExtensionField v2SystemExtensionField = new V2SystemExtensionField();
//								v2SystemExtensionField.setScopeType(V2SystemExtensionScopeType.DATAENTITY.value);
//								v2SystemExtensionField.setScopeTag(psDEField.getPSDEId());
//								v2SystemExtensionField.setFieldTag(psDEField.getPSDEFieldId());
//								v2SystemExtensionField.setDataEntityTag(psDEField.getPSDEId());
//								v2SystemExtensionField.setPendingExtensionModel(ExtensionUtils.toExtensionModel(psDEField));
//								v2SystemExtensionField.setApplyFlag(0);
//
//								V2SystemExtensionField ret = iHubSysExtensionUtilRuntime.getCloudExtensionClient().createSystemExtensionField(strExtensionId, v2SystemExtensionField);
//								String strPSDynaInstId = ret.getId();
//								if(!StringUtils.hasLength(strPSDynaInstId)) {
//									continue;
//								}
//
//								ObjectNode objectNode = iPSDEField2.getObjectNode().deepCopy();
//
//								V2SystemExtensionField v2SystemExtensionField2 = new V2SystemExtensionField();
//								v2SystemExtensionField2.setExtensionModel(ExtensionUtils.toExtensionModel(psDEField));
//								v2SystemExtensionField2.setRuntimeModel(JsonUtils.toString(objectNode));
//								v2SystemExtensionField2.setPendingExtensionModel(null);
//								v2SystemExtensionField2.setApplyFlag(1);
//
//								iHubSysExtensionUtilRuntime.getCloudExtensionClient().updateSystemExtensionField(strExtensionId, strPSDynaInstId, v2SystemExtensionField2);
//							}
//						}
//					}
//				}
		
				
				//判断行为是否包括行为附加逻辑
				boolean bHasLogic = this.hasExtendedLogic(iPSDataEntity);
				if(bHasLogic) {
					this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
				}
			}
		}
	}
	
	
	
	protected boolean hasExtendedLogic(IPSDataEntity iPSDataEntity) {
		List<IPSDEAction> psDEActionList = iPSDataEntity.getAllPSDEActions();
		if(!ObjectUtils.isEmpty(psDEActionList)) {
			for(IPSDEAction iPSDEAction : psDEActionList) {
				if(!ObjectUtils.isEmpty(iPSDEAction.getPreparePSDEActionLogics())
						|| !ObjectUtils.isEmpty(iPSDEAction.getCheckPSDEActionLogics())
						|| !ObjectUtils.isEmpty(iPSDEAction.getBeforePSDEActionLogics())
						|| !ObjectUtils.isEmpty(iPSDEAction.getAfterPSDEActionLogics())) {
					return true;
				}
			}
		}
		
		List<IPSDEField> psDEFieldList = iPSDataEntity.getAllPSDEFields();
		if(!ObjectUtils.isEmpty(psDEFieldList)) {
			for(IPSDEField iPSDEField : psDEFieldList) {
				if(!ObjectUtils.isEmpty(iPSDEField.getAllPSDEFValueRules())) {
					for(IPSDEFValueRule iPSDEFValueRule : iPSDEField.getAllPSDEFValueRules()) {
						if(!iPSDEFValueRule.isDefaultMode() && iPSDEFValueRule.isCheckDefault()) {
							return true;
						}
					}
				}
			}
		}
		
		//实体主关系
		List<IPSDERBase> psDERBaseList = iPSDataEntity.getMajorPSDERs();
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				
				//判断从实体非主系统代理
				IPSDataEntity minorPSDataEntity = iPSDERBase.getMinorPSDataEntityMust();
				if(ModuleUtilType.MAINSYSPROXY.value.equals(minorPSDataEntity.getPSSystemModuleMust().getUtilType())) {
					continue;
				}
				
				//判断关系类型
				if(DERType.DER1N.value.equals(iPSDERBase.getDERType())) {
					return true;
				}
				
				if(DERType.DER11.value.equals(iPSDERBase.getDERType())) {
					return true;
				}
				
				if(DERType.DERCUSTOM.value.equals(iPSDERBase.getDERType())) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
					if(DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())
							|| DERSubType.DER11.value.equals(iPSDERCustom.getDERSubType())) {
						return true;
					}
					continue;
				}
				
				if(DERType.DERMULINH.value.equals(iPSDERBase.getDERType())) {
					if(minorPSDataEntity.getVirtualMode() == DEVirtualMode.MIXMINHERITMERGE.value) {
						return true;
					}
				}
				
				continue;
			}
		}
		
		
		return false;
	}
	
	protected IMainSysModelRuntimeProxy<?> createMainSysModelRuntimeProxy(IMainSysProxySystemModuleUtilRuntimeContext iMainSysProxySystemModuleUtilRuntimeContext, IPSModelObject iPSModelObject, IModelRuntime realObject) throws Exception {
		if(iPSModelObject instanceof IPSDataEntity) {
			return new MainSysDataEntityRuntimeProxy(this.getModelRuntimeContext(), (IPSDataEntity)iPSModelObject, (IDataEntityRuntime)realObject);
		}
		return new MainSysModelRuntimeProxy(iMainSysProxySystemModuleUtilRuntimeContext, iPSModelObject, realObject);
	}
	
	@Override
	public IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		IServiceSystemRuntime mainSystemRuntime = null;
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			IDataEntityRuntime iDataEntityRuntime = mainSystemRuntime.getDataEntityRuntime(iPSDataEntity.getId(), true);
			if(iDataEntityRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSDataEntity, iDataEntityRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]实体[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSDataEntity)));
					return (IDataEntityRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统实体运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createDataEntityRuntime(iPSDataEntity);
	}
	
	
	
	@Override
	public ISysValueRuleRuntime createSysValueRuleRuntime(IPSSysValueRule iPSSysValueRule) {
		IServiceSystemRuntime mainSystemRuntime = null;
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysValueRuleRuntime iSysValueRuleRuntime = mainSystemRuntime.getSysValueRuleRuntime(iPSSysValueRule.getId(), true);
			if(iSysValueRuleRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysValueRule, iSysValueRuleRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统值规则 [%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysValueRule)));
					return (ISysValueRuleRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统值规则运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysValueRuleRuntime(iPSSysValueRule);
	}

	@Override
	public ISysSequenceRuntime createSysSequenceRuntime(IPSSysSequence iPSSysSequence) {
		IServiceSystemRuntime mainSystemRuntime = null;
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysSequenceRuntime iSysSequenceRuntime = mainSystemRuntime.getSysSequenceRuntime(iPSSysSequence.getId(), true);
			if(iSysSequenceRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysSequence, iSysSequenceRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统值序列 [%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysSequence)));
					return (ISysSequenceRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统值序列运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysSequenceRuntime(iPSSysSequence);
	}

	@Override
	public ISysTranslatorRuntime createSysTranslatorRuntime(IPSSysTranslator iPSSysTranslator) {
		IServiceSystemRuntime mainSystemRuntime = null;
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysTranslatorRuntime iSysTranslatorRuntime = mainSystemRuntime.getSysTranslatorRuntime(iPSSysTranslator.getId(), true);
			if(iSysTranslatorRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysTranslator, iSysTranslatorRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统值转换器 [%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysTranslator)));
					return (ISysTranslatorRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统值转换器运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysTranslatorRuntime(iPSSysTranslator);
	}

	@Override
	public ISysUtilRuntime createSysUtilRuntime(IPSSysUtil iPSSysUtil) {
		IServiceSystemRuntime mainSystemRuntime = null;
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysUtilRuntime iSysUtilRuntime = mainSystemRuntime.getSysUtilRuntime(iPSSysUtil.getId(), true);
			if(iSysUtilRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysUtil, iSysUtilRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统功能组件 [%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysUtil)));
					return (ISysUtilRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统预置功能运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysUtilRuntime(iPSSysUtil);
	}

	@Override
	public ICodeListRuntime createCodeListRuntime(IPSCodeList iPSCodeList) {
		IServiceSystemRuntime mainSystemRuntime = null;
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ICodeListRuntime iCodeListRuntime = mainSystemRuntime.getCodeListRuntime(iPSCodeList.getId(), true);
			if(iCodeListRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSCodeList, iCodeListRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]代码表[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSCodeList)));
					return (ICodeListRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统代码表运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createCodeListRuntime(iPSCodeList);
	}

	@Override
	public ISysDataSyncAgentRuntime createSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = mainSystemRuntime.getSysDataSyncAgentRuntime(iPSSysDataSyncAgent.getId(), true);
			if(iSysDataSyncAgentRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysDataSyncAgent, iSysDataSyncAgentRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]数据同步代理[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysDataSyncAgent)));
					return (ISysDataSyncAgentRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统数据同步代理运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysDataSyncAgentRuntime(iPSSysDataSyncAgent);
	}

	@Override
	public ISysMsgQueueRuntime createSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysMsgQueueRuntime iSysMsgQueueRuntime = mainSystemRuntime.getSysMsgQueueRuntime(iPSSysMsgQueue.getId(), true);
			if(iSysMsgQueueRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysMsgQueue, iSysMsgQueueRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统消息队列[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysMsgQueue)));
					return (ISysMsgQueueRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统消息队列运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysMsgQueueRuntime(iPSSysMsgQueue);
	}

	@Override
	public ISysMsgTemplRuntime createSysMsgTemplRuntime(IPSSysMsgTempl iPSSysMsgTempl) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysMsgTemplRuntime iSysMsgTemplRuntime = mainSystemRuntime.getSysMsgTemplRuntime(iPSSysMsgTempl.getId(), true);
			if(iSysMsgTemplRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysMsgTempl, iSysMsgTemplRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统消息目标[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysMsgTempl)));
					return (ISysMsgTemplRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统消息模板运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysMsgTemplRuntime(iPSSysMsgTempl);
	}

	@Override
	public ISysMsgTargetRuntime createSysMsgTargetRuntime(IPSSysMsgTarget iPSSysMsgTarget) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysMsgTargetRuntime iSysMsgTargetRuntime = mainSystemRuntime.getSysMsgTargetRuntime(iPSSysMsgTarget.getId(), true);
			if(iSysMsgTargetRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysMsgTarget, iSysMsgTargetRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统消息目标[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysMsgTarget)));
					return (ISysMsgTargetRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统消息目标运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysMsgTargetRuntime(iPSSysMsgTarget);
	}

	@Override
	public ISysValueFuncRuntime createSysValueFuncRuntime(IPSSysDBValueFunc iPSSysDBValueFunc) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysValueFuncRuntime iSysValueFuncRuntime = mainSystemRuntime.getSysValueFuncRuntime(iPSSysDBValueFunc.getId());
			if(iSysValueFuncRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysDBValueFunc, iSysValueFuncRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统值函数 [%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysDBValueFunc)));
					return (ISysValueFuncRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统值函数运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysValueFuncRuntime(iPSSysDBValueFunc);
	}

	@Override
	public ISysLogicRuntime createSysLogicRuntime(IPSSysLogic iPSSysLogic) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysLogicRuntime iSysLogicRuntime = mainSystemRuntime.getSysLogicRuntime(iPSSysLogic.getId(), true);
			if(iSysLogicRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysLogic, iSysLogicRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统逻辑[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysLogic)));
					return (ISysLogicRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统预置逻辑运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysLogicRuntime(iPSSysLogic);
	}

	@Override
	public IWFRoleRuntime createWFRoleRuntime(IPSWFRole iPSWFRole) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			IWFRoleRuntime iWFRoleRuntime = mainSystemRuntime.getWFRoleRuntime(iPSWFRole.getId(), true);
			if(iWFRoleRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSWFRole, iWFRoleRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统工作流角色 [%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSWFRole)));
					return (IWFRoleRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统工作流角色运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createWFRoleRuntime(iPSWFRole);
	}

	@Override
	public ISysAIFactoryRuntime createSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysAIFactoryRuntime iSysAIFactoryRuntime = mainSystemRuntime.getSysAIFactoryRuntime(iPSSysAIFactory.getId(), true);
			if(iSysAIFactoryRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysAIFactory, iSysAIFactoryRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]AI工厂[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysAIFactory)));
					return (ISysAIFactoryRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统AI工厂运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysAIFactoryRuntime(iPSSysAIFactory);
	}
	
	@Override
	public ISysBDSchemeRuntime createSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysBDSchemeRuntime iSysBDSchemeRuntime = mainSystemRuntime.getSysBDSchemeRuntime(iPSSysBDScheme.getId(), true);
			if(iSysBDSchemeRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysBDScheme, iSysBDSchemeRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]大数据体系[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysBDScheme)));
					return (ISysBDSchemeRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统大数据体系运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysBDSchemeRuntime(iPSSysBDScheme);
	}
	
	@Override
	public ISysBISchemeRuntime createSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysBISchemeRuntime iSysBISchemeRuntime = mainSystemRuntime.getSysBISchemeRuntime(iPSSysBIScheme.getId(), true);
			if(iSysBISchemeRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysBIScheme, iSysBISchemeRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]智能报表体系[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysBIScheme)));
					return (ISysBISchemeRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统智能报表运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysBISchemeRuntime(iPSSysBIScheme);
	}
	
	@Override
	public ISysResourceRuntime createSysResourceRuntime(IPSSysResource iPSSysResource) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysResourceRuntime iSysResourceRuntime = mainSystemRuntime.getSysResourceRuntime(iPSSysResource.getId(), true);
			if(iSysResourceRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysResource, iSysResourceRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统资源[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysResource)));
					return (ISysResourceRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统资源运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysResourceRuntime(iPSSysResource);
	}
	
	@Override
	public ISysSearchSchemeRuntime createSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			ISysSearchSchemeRuntime iSysSearchSchemeRuntime = mainSystemRuntime.getSysSearchSchemeRuntime(iPSSysSearchScheme.getId(), true);
			if(iSysSearchSchemeRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysSearchScheme, iSysSearchSchemeRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统检索体系[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysSearchScheme)));
					return (ISysSearchSchemeRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统检索体系运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysSearchSchemeRuntime(iPSSysSearchScheme);
	}
	
	@Override
	public ISysUserRoleRuntime createSysUserRoleRuntime(IPSSysUserRole iPSSysUserRole) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			//使用角色标记
			ISysUserRoleRuntime iSysUserRoleRuntime = mainSystemRuntime.getSystemAccessManager().getSysUserRoleRuntime(iPSSysUserRole.getRoleTag(), true);
			if(iSysUserRoleRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysUserRole, iSysUserRoleRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统用户角色[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysUserRole)));
					return (ISysUserRoleRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统用户角色运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysUserRoleRuntime(iPSSysUserRole);
	}
	
	@Override
	public ISysUniResRuntime createSysUniResRuntime(IPSSysUniRes iPSSysUniRes) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			//使用统一资源标识
			ISysUniResRuntime iSysUniResRuntime = mainSystemRuntime.getSystemAccessManager().getSysUniResRuntime(iPSSysUniRes.getResCode(), true);
			if(iSysUniResRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSysUniRes, iSysUniResRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统统一资源[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSysUniRes)));
					return (ISysUniResRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统统一资源运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSysUniResRuntime(iPSSysUniRes);
	}
	
	@Override
	public ISubSysServiceAPIRuntime createSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI) {
		try {
			mainSystemRuntime = this.getMainSystemRuntime(true);
		} catch (Exception ex) {
			log.error(ex);
		}
		if(mainSystemRuntime != null) {
			//使用统一资源标识
			ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = mainSystemRuntime.getSubSysServiceAPIRuntime(iPSSubSysServiceAPI.getId(), true);
			if(iSubSysServiceAPIRuntime != null) {
				try {
					IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy = createMainSysModelRuntimeProxy(this.getModelRuntimeContext(), iPSSubSysServiceAPI, iSubSysServiceAPIRuntime);
					synchronized (this.mainSysModelRuntimeProxyList) {
						this.mainSysModelRuntimeProxyList.add(iMainSysModelRuntimeProxy);
					}
					log.info(String.format("插件系统[%1$s]系统外部接口[%2$s]使用主系统代理", this.getSystemRuntime().getName(), PSModelUtils.calcFullUniqueTag2(iPSSubSysServiceAPI)));
					return (ISubSysServiceAPIRuntime)iMainSysModelRuntimeProxy.getProxyObject();
				} catch (Exception ex) {
					throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("建立主系统外部接口运行时代理对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}
		return super.createSubSysServiceAPIRuntime(iPSSubSysServiceAPI);
	}
	
	
	@Override
	protected void onUninstall() throws Throwable {
		synchronized (this.mainSysModelRuntimeProxyList) {
			for(IMainSysModelRuntimeProxy<?> iMainSysModelRuntimeProxy : this.mainSysModelRuntimeProxyList) {
				try {
					iMainSysModelRuntimeProxy.stop();
				}
				catch (Exception ex) {
					log.debug(ex);
				}
			}
			this.mainSysModelRuntimeProxyList.clear();
		}
		super.onUninstall();
	}
}