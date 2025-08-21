package net.ibizsys.central.cloud.core.dataentity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import io.jsonwebtoken.lang.Assert;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.dataentity.dataflow.DEDataFlowRuntime;
import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime;
import net.ibizsys.central.cloud.core.dataentity.service.DEServiceInvocationHandler;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.dataentity.wf.IDEWFRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.cloud.core.util.domain.DownloadTicket;
import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.dataentity.dataflow.IDEDataFlowRuntime;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.dataentity.service.IDEMethodDTO;
import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.domain.ExportDataResult;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.DEUtilType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRQueryCountCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.model.dataentity.util.PSDEUtilImpl;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.service.DEMethodDTOFieldTypes;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionBackup;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IActionSessionLog;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;

/**
 * @author lionlau
 *
 */
public class DataEntityRuntime extends net.ibizsys.central.dataentity.DataEntityRuntime implements IDataEntityRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRuntime.class);

	private boolean bEnableRTCodeMode = false;
	
	private Map<Class<?>, Object> proxyDEServiceMap = null;
	private Map<Class<?>, Map<String, String>> rtObjectNameMap = null;
	private IDEService proxyDEService = null;
	private boolean bEnableExtension = false;
	private IDEExtensionUtilRuntime iDEExtensionUtilRuntime = null;
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private String strOSSFolder = null;
	
	
	@Override
	protected void onInit() throws Exception {
		IServiceSystemRuntime iServiceSystemRuntime = null;
		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
    	}
		
		if(iServiceSystemRuntime!=null) {
			this.bEnableRTCodeMode = iServiceSystemRuntime.isEnableRTCodeMode();
			this.strOSSFolder = iServiceSystemRuntime.getOSSFolder();
		}
		
		if(this.isEnableRTCodeMode()) {
			registerRTObjects();
		}
		
		if(DataTypeUtils.getIntegerValue(this.getPSDataEntity().getDynaSysMode(), 0) > 0) {
			this.prepareDEExtensionUtilRuntime();
		}
		
		
		super.onInit();
	}
	
	protected void registerRTObjects() throws Exception{
		
		IPSDataEntity iPSDataEntity = this.getPSDataEntity();
		
		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
			String strDEServiceObjectName = iServiceSystemRuntime.getRTCodeUtils().getDEServiceObjectName(iPSDataEntity);
			if(StringUtils.hasLength(strDEServiceObjectName)) {
				this.registerRTObjectName(IDEService.class, iPSDataEntity.getId(), strDEServiceObjectName);
				Class<?> deServiceCls = RuntimeObjectFactory.getInstance().getObjectClass(IDEService.class, strDEServiceObjectName);
				IDEService proxyDEService = null;
				if(deServiceCls != null) {
					Object objService = this.getProxyDEService(deServiceCls);
					if(objService instanceof IDEService) {
						proxyDEService = (IDEService)objService;
					}
				}
				if(proxyDEService == null) {
					proxyDEService = this.getProxyDEService(IDEService.class);
				}
				this.proxyDEService = proxyDEService;
			}
			
			List<IPSDEMethodDTO> psDEMethodDTOList = iPSDataEntity.getAllPSDEMethodDTOs();
			if(!ObjectUtils.isEmpty(psDEMethodDTOList)) {
				for(IPSDEMethodDTO iPSDEMethodDTO : psDEMethodDTOList) {
					String strRTObjectName = iServiceSystemRuntime.getRTCodeUtils().getRTObjectName(iPSDEMethodDTO);
					if(StringUtils.hasLength(strRTObjectName)) {
						this.registerRTObjectName(IDEMethodDTO.class, iPSDEMethodDTO.getId(), strRTObjectName);
					}
				}
			}
		}
	}
	
	protected boolean registerRTObjectName(Class<?> cls, String strId, String strRTObjectName) {
		if(!StringUtils.hasLength(strId) || !StringUtils.hasLength(strRTObjectName)) {
			return false;
		}
		
		//要先判断外围是否已经注册部件
		if(!RuntimeObjectFactory.getInstance().containsObject(cls, strRTObjectName)) {
			if(!RuntimeObjectFactory.getInstance().registerObjectIf(cls, strRTObjectName, strRTObjectName)) {
				return false;
			}
		}
		
		if(this.rtObjectNameMap == null) {
			this.rtObjectNameMap = new ConcurrentHashMap<Class<?>, Map<String,String>>();
		}
		
		Map<String, String> map = this.rtObjectNameMap.get(cls);
		if(map == null) {
			map = new HashMap<String, String>();
			this.rtObjectNameMap.put(cls, map);
		}
		map.put(strId, strRTObjectName);
		return true;
	}
	
	protected String getRTObjectName(Class<?> cls, String strId) {
		if(this.rtObjectNameMap == null) {
			return null;
		}
		
		Map<String, String> map = this.rtObjectNameMap.get(cls);
		if(map == null) {
			return null;
		}
		
		return map.get(strId);
	}
	
	protected <T> T getRTObject(Class<T> cls, String strId) {
		return this.getRTObject(cls, strId, true);
	}
	
	protected <T> T  getRTObject(Class<T> cls, String strId, boolean bAutowire) {
		String strRTObjectName = this.getRTObjectName(cls, strId);
		if(!StringUtils.hasLength(strRTObjectName)) {
			return null;
		}
		T t = RuntimeObjectFactory.getInstance().getObject(cls, strRTObjectName);
		if(t != null && bAutowire) {
			this.getSystemRuntime().autowareObject(t);
		}
		return t;
	}
	
	
	@Override
	protected boolean isEnableRuntimeServiceMode() {
		return this.isEnableRTCodeMode();
	}
	
	@Override
	protected IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
		Object object = this.getRTObject(IDEMethodDTO.class, iPSDEMethodDTO.getId(), false);
		if(object!=null) {
			return (IEntityDTO)object;
		}
		
		return super.createEntityDTO(iPSDEMethodDTO);
	}
	
	
	@Override
	protected ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
		Object object = this.getRTObject(IDEMethodDTO.class, iPSDEMethodDTO.getId(), false);
		if(object!=null) {
			return (ISearchContextDTO)object;
		}
		return super.createSearchContextDTO(iPSDEMethodDTO);
	}
	
//	@Override
//	protected List<IEntityDTO> createEntityDTOList(IPSDEMethodDTO iPSDEMethodDTO) {
//		return super.createEntityDTOList(iPSDEMethodDTO);
//	}
	
	
  //  private static DefaultIdentifierGenerator defaultIdentifierGenerator = new DefaultIdentifierGenerator();


//    @Override
//    protected IUserContext getUserContext() {
//        return AuthenticationUser.getAuthenticationUser();
//    }

    @Override
    public boolean fillEntityKeyValue(IEntityBase objEntity) {
    	
    	if(DataTypeUtils.isNumberDataType(this.getKeyPSDEField().getStdDataType())) {
    		String strDEFType = this.getKeyPSDEField().getDataType();
    		if (DEFDataTypes.ACID.equals(strDEFType)) {
                this.resetFieldValue(objEntity, this.getKeyPSDEField());
            } else {
            	this.setFieldValue(objEntity, this.getKeyPSDEField(), getNumberId());
            }
            return false;
    	}
//    	if (DEFDataTypes.ACID.equals(strDEFType) || DEFDataTypes.BIGINT.equals(strDEFType)
//                || DEFDataTypes.BIGDECIMAL.equals(strDEFType)) {
//            if (DEFDataTypes.ACID.equals(this.getKeyPSDEField().getDataType()) && this.getSysDBSchemeRuntime().getDBType().equals(DBTypes.MYSQL5)) {
//                this.resetFieldValue(objEntity, this.getKeyPSDEField());
//            } else {
//            	this.setFieldValue(objEntity, this.getKeyPSDEField(), getNumberId());
//            }
//            return false;
//        }
        return super.fillEntityKeyValue(objEntity);
    }
    
    protected Object getNumberId() {
    	String strTableName = this.getTableName();
    	return KeyValueUtils.genNumberId(String.format("%1$s|%2$s", this.getSystemRuntime().getDeploySystemId(), StringUtils.hasLength(strTableName)?strTableName:this.getId()));
    }


    @Override
    public void setSearchCustomCondition(ISearchContextBase iSearchContextBase, String strCustomCondition) {
        Pattern bracketPattern = Pattern.compile("\\[(.*?)]");
        Matcher matcher = bracketPattern.matcher(strCustomCondition);
        if (matcher.find()) {
            ISearchContextDTO iSearchContextDTO = getSearchContextDTO(iSearchContextBase);
            SearchContextDTO.addSearchPredefinedCond(iSearchContextDTO, strCustomCondition, null);
            return;
        }
        super.setSearchCustomCondition(iSearchContextBase, strCustomCondition);
    }

//    @Override
//    public IDEPrintRuntime createDEPrintRuntime(IPSDEPrint iPSDEPrint) {
//        try {
//            IDEPrintRuntime iDEPrintRuntime = SpringContextHolder.getBean(String.format("%s_DEPRINT_%s", this.getName(), iPSDEPrint.getCodeName().toUpperCase()));
//            log.debug(String.format("[%s]导入模式[%s]使用[%s]进行导入处理", this.getName(), iPSDEPrint.getCodeName().toUpperCase(), iPSDEPrint.getClass()));
//            return iDEPrintRuntime;
//        } catch (NoSuchBeanDefinitionException e) {
//
//        }
//        Assert.notNull(iPSDEPrint, "实体打印模型对象无效");
//        if (DEReportTypes.JR.equals(iPSDEPrint.getReportType())) {
//            return new R8DEJRPrintRuntime();
//        }
//        return super.createDEPrintRuntime(iPSDEPrint);
//    }
//
//    @Override
//    public IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport) {
//        try {
//            IDEDataImportRuntime iDEDataImportRuntime = SpringContextHolder.getBean(String.format("%s_DEDATAIMPORT_%s", this.getName(), iPSDEDataImport.getCodeName().toUpperCase()));
//            log.debug(String.format("[%s]导入模式[%s]使用[%s]进行导入处理", this.getName(), iPSDEDataImport.getCodeName().toUpperCase(), iDEDataImportRuntime.getClass()));
//            return iDEDataImportRuntime;
//        } catch (NoSuchBeanDefinitionException e) {
//
//        }
//        log.debug(String.format("[%s]未指定导入模式[%s]处理，使用默认导入处理", this.getName(), iPSDEDataImport.getCodeName().toUpperCase()));
//        return super.createDEDataImportRuntime(iPSDEDataImport);
//    }


//    @Override
//    protected IDEDataImportRuntime createDefaultDEDataImportRuntime() {
//        return new R8DEDataImportRuntime();
//    }
//
//    @Override
//    public IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport) {
//        try {
//            IDEDataExportRuntime iDEDataExportRuntime = SpringContextHolder.getBean(String.format("%s_DEDATAEXPORT_%s", this.getName(), iPSDEDataExport.getCodeName().toUpperCase()));
//            log.debug(String.format("[%s]导出模式[%s]使用[%s]进行导出处理", this.getName(), iPSDEDataExport.getCodeName().toUpperCase(), iDEDataExportRuntime.getClass()));
//            return iDEDataExportRuntime;
//        } catch (NoSuchBeanDefinitionException e) {
//
//        }
//        log.debug(String.format("[%s]未指定导出模式[%s]处理，使用默认导出处理", this.getName(), iPSDEDataExport.getCodeName().toUpperCase()));
//        return super.createDEDataExportRuntime(iPSDEDataExport);
//    }
//
//    @Override
//    protected IDEDataExportRuntime createDefaultDEDataExportRuntime() {
//        return new R8DEDataExportRuntime();
//    }
//
//    @Override
//    public IDENotifyRuntime createDENotifyRuntime(IPSDENotify iPSDENotify) {
//        try {
//            IDENotifyRuntime iDENotifyRuntime = SpringContextHolder.getBean(String.format("%s_DENOTIFY_%s", this.getName(), iPSDENotify.getCodeName().toUpperCase()));
//            log.debug(String.format("[%s]实体通知模式[%s]使用[%s]进行导入处理", this.getName(), iPSDENotify.getCodeName().toUpperCase(), iDENotifyRuntime.getClass()));
//            return iDENotifyRuntime;
//        } catch (NoSuchBeanDefinitionException e) {
//
//        }
//        log.debug(String.format("[%s]未指定导入模式[%s]处理，使用默认导入处理", this.getName(), iPSDENotify.getCodeName().toUpperCase()));
//        return new R8DENotifyRuntime();
//    }

    @Override
    protected boolean checkFieldQueryCountCondition(Object objValue, IEntityBase arg0, IPSDEFVRQueryCountCondition iPSDEFVRQueryCountCondition, IPSDEField iPSDEField) throws Throwable {
        String strRuleInfo = iPSDEFVRQueryCountCondition.getRuleInfo();
        IPSDEDataQuery iPSDEDataQuery = iPSDEFVRQueryCountCondition.getPSDEDataQuery();
        ISearchContextDTO searchContext = this.createSearchContext();
        searchContext.setCount(true);
        //设置上下文
        EntityBase datacontext = (EntityBase) arg0;
		//保留原始，避免影响旧代码
        if (datacontext != null) {
			searchContext.putAll(datacontext.any());
            searchContext.set("datacontext", datacontext.any());
        }
        searchContext.set("sessioncontext",  ActionSessionManager.getUserContextMust().getSessionParams());
        java.util.List result = this.selectDataQuery(iPSDEDataQuery, searchContext);

        Integer nMinValue = iPSDEFVRQueryCountCondition.getMinValue();
        Integer nMaxValue = iPSDEFVRQueryCountCondition.getMaxValue();
        boolean bIncMinValue = iPSDEFVRQueryCountCondition.isIncludeMinValue();
        boolean bIncMaxValue = iPSDEFVRQueryCountCondition.isIncludeMaxValue();
        boolean bTryMode = !iPSDEFVRQueryCountCondition.isKeyCond();
        int nSize = result.size();
        if (nMinValue != null) {
            if (bIncMinValue) {
                if (nSize < nMinValue) {
                    if (bTryMode)
                        return false;
                    throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
                }
            } else {
                if (nSize <= nMinValue) {
                    if (bTryMode)
                        return false;
                    throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
                }
            }
        }

        if (nMaxValue != null) {
            if (bIncMaxValue) {
                if (nSize > nMaxValue) {
                    if (bTryMode)
                        return false;
                    throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
                }
            } else {
                if (nSize >= nMaxValue) {
                    if (bTryMode)
                        return false;
                    throw createDEFVRConditionException(iPSDEFVRQueryCountCondition, strRuleInfo, null, iPSDEField);
                }
            }
        }

        return true;
    }
    
    @Override
    public IDEWFRuntime getDefaultDEWFRuntime() {
    	return (IDEWFRuntime)super.getDefaultDEWFRuntime();
    }
    
    @Override
    public IDEWFRuntime getDEWFRuntime(IPSDEWF iPSDEWF) {
    	return (IDEWFRuntime)super.getDEWFRuntime(iPSDEWF);
    }
    
    
    @Override
    public IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic) {
    	if(isEnableRTCodeMode() && iPSDELogic.getPSSysSFPlugin()==null) {
    		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
    			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
    			try {
    				String strRTObjectName = iServiceSystemRuntime.getRTCodeUtils().getRTObjectName(iPSDELogic);
    				this.registerRTObjectName(IDELogicRuntime.class, iPSDELogic.getId(), strRTObjectName);
    				IDELogicRuntime iDELogicRuntime = this.getRTObject(IDELogicRuntime.class, iPSDELogic.getId(), true);
    				if(iDELogicRuntime != null) {
    					return iDELogicRuntime;
    				}
    			}
    			catch (Exception ex) {
    				throw new DataEntityRuntimeException(this, String.format("获取实体逻辑[%1$s]运行时对象发生异常，%2$s", iPSDELogic.getName(), ex.getMessage()), ex);
    			}
    		}
    	}
    	return super.createDELogicRuntime(iPSDELogic);
    }
    
    
    @Override
    protected IDELogicRuntime createDefaultDELogicRuntime(IPSDELogic iPSDELogic) {
    	return new DELogicRuntime();
    }
    
    
    @Override
    protected IDEDataFlowRuntime createDefaultDEDataFlowRuntime(IPSDEDataFlow iPSDEDataFlow) {
    	return new DEDataFlowRuntime();
    }
    
    /**
     * 实体是否启用运行时代码模式
     * @return
     */
    public boolean isEnableRTCodeMode() {
    	this.prepare();
    	return this.bEnableRTCodeMode;
    }
    
    public String getOSSFolder() {
    	this.prepare();
    	return this.strOSSFolder;
    }
    
    @Override
    public IDEService getDEService() {
    	if(isEnableRTCodeMode()) {
    		if(this.proxyDEService == null) {
    			this.prepare();
    		}
    		return this.proxyDEService;
    	}
    	return super.getDEService();
    }

	@Override
	public <T> T getProxyDEService(Class<?> cls) {
		try {
			if(this.proxyDEServiceMap == null) {
				this.proxyDEServiceMap = new ConcurrentHashMap<Class<?>, Object>();
			}
			Object serviceObject = this.proxyDEServiceMap.get(cls);
			if(serviceObject == null) {
				serviceObject = this.createProxyDEService(cls);
				this.proxyDEServiceMap.put(cls, serviceObject);
			}
			return (T)serviceObject;
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this, String.format("获取实体代理服务对象[%1$s]发生异常，%2$s", cls.getName(), ex.getMessage()), ex);
		}
		
	}
	
	protected  <T> T createProxyDEService(Class<?> cls) throws Exception {
		DEServiceInvocationHandler<T> deServiceInvocationHandler = new DEServiceInvocationHandler(this.getDataEntityRuntimeContext(), cls);
		return deServiceInvocationHandler.getProxyDEService();
	}
	
	@Override
	protected IDataEntityAccessManager createDataEntityAccessManager() {
		if(isEnableRTCodeMode() ) {
			if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
    			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
    			
	    		try {
	 				String strRTObjectName = iServiceSystemRuntime.getRTCodeUtils().getDEAccessManagerObjectName(this.getPSDataEntity());
					this.registerRTObjectName(IDataEntityAccessManager.class, getPSDataEntity().getId(), strRTObjectName);
					IDataEntityAccessManager iDataEntityAccessManager = this.getRTObject(IDataEntityAccessManager.class, getPSDataEntity().getId(), true);
					if(iDataEntityAccessManager != null) {
						return iDataEntityAccessManager;
					}
				}
				catch (Exception ex) {
					throw new DataEntityRuntimeException(this, String.format("获取实体访问控制运行时对象发生异常，%1$s", ex.getMessage()), ex);
				}
			}
    	}

		return super.createDataEntityAccessManager();
	}
	
	@Override
	public ImportDataResult importData2(String strImportTag, IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			this.pushDataSource();
			
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());
			
			actionSession.beginLog(this.getName(), String.format("导入数据[%1$s]", strImportTag));

			ImportDataResult ret = this.onImportData2(strImportTag, baseEntity, inputStream, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);

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

	protected ImportDataResult onImportData2(String strImportTag, IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		IDEDataImportRuntime iDEDataImportRuntime = this.getDEDataImportRuntime(strImportTag);
		if (iDEDataImportRuntime instanceof net.ibizsys.central.cloud.core.dataentity.dataimport.IDEDataImportRuntime) {
			return ((net.ibizsys.central.cloud.core.dataentity.dataimport.IDEDataImportRuntime) iDEDataImportRuntime).importStream2(baseEntity, inputStream, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);
		}

		throw new Exception(String.format("对象[%1$s]未支持增强导入数据", iDEDataImportRuntime));
	}

	@Override
	public Map<Integer, EntityError> importData(String strImportTag, IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
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

			Map<Integer, EntityError> ret = this.onImportData(strImportTag, baseEntity, inputStream, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);

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
	
	protected Map<Integer, EntityError> onImportData(String strImportTag, IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		IDEDataImportRuntime iDEDataImportRuntime = this.getDEDataImportRuntime(strImportTag);
		if (iDEDataImportRuntime instanceof net.ibizsys.central.cloud.core.dataentity.dataimport.IDEDataImportRuntime) {
			return ((net.ibizsys.central.cloud.core.dataentity.dataimport.IDEDataImportRuntime) iDEDataImportRuntime).importStream(baseEntity, inputStream, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);
		}

		throw new Exception(String.format("对象[%1$s]未支持增强导入数据", iDEDataImportRuntime));
	}
	
	
	@Override
	public ExportDataResult exportData2(String strExportTag, Object objData, OutputStream outputStream) throws Throwable {
		prepare();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			this.pushDataSource();
			
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());
			
			actionSession.beginLog(this.getName(), String.format("导出数据[%1$s]", strExportTag));

			ExportDataResult ret = this.onExportData2(strExportTag, objData, outputStream);

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

			return ret;

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
	

	protected ExportDataResult onExportData2(String strExportTag, Object objData, OutputStream outputStream) throws Throwable {
		IDEDataExportRuntime iDEDataExportRuntime = this.getDEDataExportRuntime(strExportTag);
		if (iDEDataExportRuntime instanceof net.ibizsys.central.cloud.core.dataentity.dataexport.IDEDataExportRuntime) {
			return ((net.ibizsys.central.cloud.core.dataentity.dataexport.IDEDataExportRuntime) iDEDataExportRuntime).exportStream2(objData, outputStream);
		}

		throw new Exception(String.format("对象[%1$s]未支持增强导出数据", iDEDataExportRuntime));
	}
	

	@Override
	public boolean isEnableExtension() {
		this.prepare();
		return this.bEnableExtension;
	}
	
	protected void prepareDEExtensionUtilRuntime() throws Exception{
		if(this.iDEExtensionUtilRuntime != null) {
			return;
		}
		//从预置实体功能中加载
		java.util.List<IPSDEUtil> psDEUtils = this.getPSDataEntity().getAllPSDEUtils();
		if(!ObjectUtils.isEmpty(psDEUtils)) {
			for(IPSDEUtil iPSDEUtil : psDEUtils) {
				if(!DEUtilType.EXTENSION.value.equals(iPSDEUtil.getUtilType())) {
					continue;
				}
				IDEUtilRuntime iDEUtilRuntime = this.registerPSDEUtil(iPSDEUtil);
				if(iDEUtilRuntime instanceof IDEExtensionUtilRuntime) {
					this.iDEExtensionUtilRuntime = (IDEExtensionUtilRuntime)iDEUtilRuntime;
					break;
				}
			}
		}
		if(this.iDEExtensionUtilRuntime == null) {
			IDEExtensionUtilRuntime iDEExtensionUtilRuntime = null;
			//从系统扩展功能中加载
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
			if(iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				iDEExtensionUtilRuntime = ((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).createDEExtensionUtilRuntime(this);
			}
			else {
				iDEExtensionUtilRuntime =  iSysExtensionUtilRuntime.createDEExtensionUtilRuntime(this);
			}
			if(iDEExtensionUtilRuntime != null) {
				ObjectNode objectNode = JsonUtils.createObjectNode();
				objectNode.put(PSDEUtilImpl.ATTR_GETUTILTYPE, DEUtilType.EXTENSION.value);
				objectNode.put(PSDEUtilImpl.ATTR_GETID, DEUtilType.EXTENSION.value);
				objectNode.put(PSDEUtilImpl.ATTR_GETNAME, DEUtilType.EXTENSION.value);
				
				IPSDEUtil iPSDEUtil = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSDataEntity(), IPSDEUtil.class, objectNode);
				iDEExtensionUtilRuntime.init(this.getDataEntityRuntimeContext(), iPSDEUtil);
				this.iDEExtensionUtilRuntime = iDEExtensionUtilRuntime;
			}
			
		}
		
		this.bEnableExtension = this.iDEExtensionUtilRuntime!=null;
	}
	
	@Override
	public IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		if(isEnableExtension()) {
			if(this.iDEExtensionUtilRuntime == null) {
				throw new DataEntityRuntimeException(this, String.format("启用实体扩展但未指定扩展组件对象"));
			}
			return this.iDEExtensionUtilRuntime;
		}
		else
			return null;
	}
	
	@Override
	public void reloadExtension(V2SystemExtensionSuite v2SystemExtensionSuite) {
		this.prepare();
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			iDEExtensionUtilRuntime.reloadExtension(v2SystemExtensionSuite);
		}
	}
	
	@Override
	protected IDELogicRuntime getDELogicRuntime(IPSDELogic iPSDELogic, boolean bTryMode) {
		IDELogicRuntime iDELogicRuntime = super.getDELogicRuntime(iPSDELogic, bTryMode);
		if(iDELogicRuntime != null) {
			final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
			if(iDEExtensionUtilRuntime != null) {
				return iDEExtensionUtilRuntime.getDELogicRuntime((net.ibizsys.central.dataentity.logic.IDELogicRuntime)iDELogicRuntime);
			}
		}
		return iDELogicRuntime;
	}
	
	@Override
	protected IDEMSLogicRuntime getDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic, boolean bTryMode) {
		IDEMSLogicRuntime iDEMSLogicRuntime = super.getDEMSLogicRuntime(iPSDEMSLogic, bTryMode);
		if(iDEMSLogicRuntime != null ) {
			final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
			if(iDEExtensionUtilRuntime != null) {
				return iDEExtensionUtilRuntime.getDEMSLogicRuntime((net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime)iDEMSLogicRuntime);
			}
		}
		return iDEMSLogicRuntime;
	}
	
	
	@Override
	protected boolean isEnableActionLogic(IPSDEAction iPSDEAction, String strAttachMode) {
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			if(iDEExtensionUtilRuntime.isEnableActionLogic(iPSDEAction, strAttachMode)) {
				return true;
			}
		}
		return super.isEnableActionLogic(iPSDEAction, strAttachMode);
	}
	
	@Override
	protected void executeActionLogics(IEntityBase arg0, IPSDEAction iPSDEAction, String strAttachMode, IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		super.executeActionLogics(arg0, iPSDEAction, strAttachMode, iDynaInstDataEntityRuntime, iDynaInstRuntime, actionData);
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			iDEExtensionUtilRuntime.executeActionLogics(arg0, iPSDEAction, strAttachMode);
		}
	}
	
	
	@Override
	public V2SystemExtensionLogic[] getExtensionLogics(String strLogicType) {
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			return iDEExtensionUtilRuntime.getExtensionLogics(strLogicType);
		}
		return null;
	}

	@Override
	public Object executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData) throws Throwable {
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			return iDEExtensionUtilRuntime.executeExtensionLogic(v2SystemExtensionLogic, objData);
		}
		throw new DataEntityRuntimeException(this, String.format("未支持实体扩展"));
	}
	
	@Override
	public void notify(Object key, String strEvent, Object eventData, Object eventData2, Object eventData3, Object eventData4) throws Throwable {
		super.notify(key, strEvent, eventData, eventData2, eventData3, eventData4);
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			iDEExtensionUtilRuntime.notify(key, strEvent, eventData, eventData2, eventData3, eventData4);
		}
	}
	
	@Override
	public net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime getDEMSLogicRuntime(IEntity iEntity, boolean bTryMode) {
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime iDEMSLogicRuntime = iDEExtensionUtilRuntime.getDEMSLogicRuntime(iEntity, true);
			if(iDEMSLogicRuntime != null) {
				return iDEMSLogicRuntime;
			}
		}
		return super.getDEMSLogicRuntime(iEntity, bTryMode);
	}
	
	@Override
	protected void checkDEMainState(Object arg, IPSDEAction iPSDEAction) throws Exception {
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			iDEExtensionUtilRuntime.checkDEMainState(arg, iPSDEAction);
		}
		super.checkDEMainState(arg, iPSDEAction);
	}
	
	@Override
	protected boolean onTestDataAccessAction(Object dataOrKey, String strAccessAction) throws Exception {
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			if(!iDEExtensionUtilRuntime.testDataAccessAction(dataOrKey, strAccessAction)) {
				return false;
			}
		}
		return super.onTestDataAccessAction(dataOrKey, strAccessAction);
	}

	@Override
	public String getExtensionSessionId() {
		final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
		if(iDEExtensionUtilRuntime != null) {
			return iDEExtensionUtilRuntime.getExtensionSessionId();
		}
		return null;
	}
	
	@Override
	public List<IPSDEField> getPSDEFields(boolean bExtension) {
		if(bExtension) {
			final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
			if(iDEExtensionUtilRuntime != null) {
				List<IPSDEField> extendPSDEFields = iDEExtensionUtilRuntime.getPSDEFields(null);
				if(!ObjectUtils.isEmpty(extendPSDEFields)) {
					List<IPSDEField> allList = new ArrayList<IPSDEField>();
					List<IPSDEField> orginList = super.getPSDEFields(bExtension);
					if(!ObjectUtils.isEmpty(orginList)) {
						allList.addAll(orginList);
					}
					allList.addAll(extendPSDEFields);
					return allList;
				}
			}
		}
		return super.getPSDEFields(bExtension);
	}
	
	
	@Override
	public IPSDEField getPSDEField(boolean bExtension, String strName, boolean bTryMode) {
		if(bExtension) {
			final IDEExtensionUtilRuntime iDEExtensionUtilRuntime = this.getDEExtensionUtilRuntime();
			if(iDEExtensionUtilRuntime != null) {
				IPSDEField iPSDEField = super.getPSDEField(bExtension, strName, true);
				if(iPSDEField != null) {
					return iPSDEField;
				}
				
				List<IPSDEField> extendPSDEFields = iDEExtensionUtilRuntime.getPSDEFields(null);
				if(!ObjectUtils.isEmpty(extendPSDEFields)) {
					for(IPSDEField item : extendPSDEFields) {
						if(strName.equalsIgnoreCase(item.getName()) ) {
							return item;
						}
					}
				}

				if(!bTryMode) {
					//抛出异常
					return super.getPSDEField(bExtension, strName, bTryMode);
				}
				return null;
			}
		}
		
		return super.getPSDEField(bExtension, strName, bTryMode);
	}
	
	@Override
	protected void translateSearchContextBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		//补充数据集自身数据权限
		if(iPSDEDataSet.isEnableUserDR() || iPSDEDataSet.isEnableOrgDR() || iPSDEDataSet.isEnableSecDR() || iPSDEDataSet.isEnableSecBC() || !ObjectUtils.isEmpty(iPSDEDataSet.getCustomDRMode()) || !ObjectUtils.isEmpty(iPSDEDataSet.getCustomDRMode2())) {
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
			ISearchContextDTO iSearchContextDTO = this.getSearchContextDTO(arg0);
			this.getDataEntityAccessManager().addAuthorityConditions(iEmployeeContext, iSearchContextDTO, iPSDEDataSet);
		}
		
		super.translateSearchContextBeforeProceed(arg0, strDataSetName, iPSDEDataSet, iPSDataEntity, iDynaInstRuntime, actionData);
	}
	
	@Override
	public net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager getDataEntityAccessManager() {
		return (net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager)super.getDataEntityAccessManager();
	}
	
	@Override
	public DownloadTicket createDownloadTicket(Object keyOrEntity, String strStorageField, String strOSSFileId, boolean bTryMode) throws Throwable {
		//Assert.hasLength(strStorageField, "未传入存储属性");
		Assert.hasLength(strOSSFileId, "未传入OSS文件标识");
		try {
			return this.onCreateDownloadTicket(keyOrEntity, strStorageField, strOSSFileId, bTryMode);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this, String.format("获取数据附件下载凭证发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected DownloadTicket onCreateDownloadTicket(Object keyOrEntity, String strStorageField, String strOSSFileId, boolean bTryMode) throws Throwable {
		IEntityDTO iEntityDTO = null;
		if(keyOrEntity instanceof IEntityDTO) {
			iEntityDTO = (IEntityDTO)keyOrEntity;
		}
		else {
			iEntityDTO = this.get(keyOrEntity);
		}
		
		IDEMethodDTORuntime iDEMethodDTORuntime = iEntityDTO.getDEMethodDTORuntime();
		if(iDEMethodDTORuntime == null) {
			throw new Exception("方法DTO运行时对象无效");
		}
		
		if(StringUtils.hasLength(strStorageField)) {
			Object value = iEntityDTO.get(strStorageField.toLowerCase());
			if(value == null) {
				if(bTryMode) {
					return null;
				}
				throw new Exception(String.format("属性[%1$s]存储数据无效", strStorageField));
			}
			
			List list = JsonUtils.asList(value);
			if(ObjectUtils.isEmpty(list)) {
				if(bTryMode) {
					return null;
				}
				throw new Exception(String.format("属性[%1$s]存储数据无效", strStorageField));
			}

			for(Object item : list) {
				if(!(item instanceof Map)){
					continue;
				}

				Map map = (Map)item;
				String id = DataTypeUtils.asString(map.get("id"));
				String name = DataTypeUtils.asString(map.get("name"));
				int size = DataTypeUtils.asInteger(map.get("size"), -1);
				String ext = DataTypeUtils.asString(map.get("ext"));
				String cat = DataTypeUtils.asString(map.get("folder"));
				if(ObjectUtils.isEmpty(cat)) {
					cat = getOSSFolder();
				}

				if(strOSSFileId.equals(id)) {
					ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
					if(StringUtils.hasLength(cat)) {
						return iCloudOSSClient.createDownloadTicket(cat, strOSSFileId);
					}
					else {
						return iCloudOSSClient.createDownloadTicket(strOSSFileId);
					}
				}
			}
		}
		else {
			List<IPSDEField> attachmentPSDEFieldList = this.getAttachmentPSDEFields(true);
			if(!ObjectUtils.isEmpty(attachmentPSDEFieldList)) {
				for(IPSDEField iPSDEField : attachmentPSDEFieldList) {
					Object value = iEntityDTO.get(iPSDEField.getLowerCaseName());
					if(value == null) {
						continue;
					}
					
					List list = JsonUtils.asList(value);
					if(ObjectUtils.isEmpty(list)) {
						continue;
					}

					for(Object item : list) {
						if(!(item instanceof Map)){
							continue;
						}

						Map map = (Map)item;
						String id = DataTypeUtils.asString(map.get("id"));
						String name = DataTypeUtils.asString(map.get("name"));
						int size = DataTypeUtils.asInteger(map.get("size"), -1);
						String ext = DataTypeUtils.asString(map.get("ext"));
						String cat = DataTypeUtils.asString(map.get("folder"));
						if(ObjectUtils.isEmpty(cat)) {
							cat = getOSSFolder();
						}

						if(strOSSFileId.equals(id)) {
							ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
							if(StringUtils.hasLength(cat)) {
								return iCloudOSSClient.createDownloadTicket(cat, strOSSFileId);
							}
							else {
								return iCloudOSSClient.createDownloadTicket(strOSSFileId);
							}
						}
					}
				}
			}
			
			//获取DTO属性
			List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iDEMethodDTORuntime.getPSDEMethodDTOFields();
			if(!ObjectUtils.isEmpty(psDEMethodDTOFieldList)) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
					if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

						if (iPSDEMethodDTOField.getRefPSDataEntity() == null) {
							continue;
						}

						Object dtoData = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
						if (dtoData != null) {
							IDataEntityRuntime refDataEntityRuntime = (IDataEntityRuntime)this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
							if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {

								Collection collection = null;
								if (iPSDEMethodDTOField.isListMap()) {
									if (!(dtoData instanceof Map)) {
										throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
									}
									
									collection = ((Map)dtoData).values();
									
								} else {
									// 列表模式
									if (!(dtoData instanceof List)) {
										throw new DataEntityRuntimeException(this, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
									}
									
									collection = (List)dtoData;
								}
								
								if(!ObjectUtils.isEmpty(collection)) {
									for(Object item : collection) {
										DownloadTicket downloadTicket = refDataEntityRuntime.createDownloadTicket(item, null, strOSSFileId, true);
										if(downloadTicket != null) {
											return downloadTicket;
										}
									}
								}
							}
							else {
								DownloadTicket downloadTicket = refDataEntityRuntime.createDownloadTicket(dtoData, null, strOSSFileId, true);
								if(downloadTicket != null) {
									return downloadTicket;
								}
							}
						}
					}
				}
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("指定OSS文件数据[%1$s]不存在", strOSSFileId));
	}
	
	public ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
	
	
	@Override
	protected void onShutdown() throws Exception {
		if(!ObjectUtils.isEmpty(this.proxyDEServiceMap)) {
			this.proxyDEServiceMap.clear();
		}
		if(!ObjectUtils.isEmpty(this.rtObjectNameMap)) {
			this.rtObjectNameMap.clear();
		}
		this.proxyDEService = null;
		this.iDEExtensionUtilRuntime = null;
		super.onShutdown();
	}
	
}
