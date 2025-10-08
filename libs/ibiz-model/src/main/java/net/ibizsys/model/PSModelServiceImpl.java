package net.ibizsys.model;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSSysDEGroup;
import net.ibizsys.model.dataentity.PSDataEntityImpl;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.PSDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSFormulaDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSInheritDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSOne2ManyDataDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSOne2ManyObjDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSOne2OneDataDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSOne2OneObjDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSPickupDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSPickupDataDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSPickupObjectDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSPickupTextDEFieldImpl;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition;
import net.ibizsys.model.dataentity.der.IPSDER1NDEFieldMap;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap;
import net.ibizsys.model.dataentity.der.PSDERCustomImpl;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.proxy.app.PSApplicationServiceProxyImpl;
import net.ibizsys.model.proxy.dataentity.defield.PSDEFieldServiceProxyImpl;
import net.ibizsys.model.proxy.dataentity.defield.valuerule.PSDEFVRConditionServiceProxyImpl;
import net.ibizsys.model.proxy.dataentity.der.PSDER1NDEFieldMapServiceProxyImpl;
import net.ibizsys.model.proxy.dataentity.der.PSDERIndexDEFieldMapServiceProxyImpl;
import net.ibizsys.model.proxy.dataentity.der.PSDERServiceProxyImpl;
import net.ibizsys.model.proxy.dataentity.ds.PSDEDQConditionServiceProxyImpl;
import net.ibizsys.model.proxy.dataentity.print.PSDEPrintServiceProxyImpl;
import net.ibizsys.model.proxy.res.PSSysContentImplEx;
import net.ibizsys.model.proxy.res.PSSysSFPluginImplEx;
import net.ibizsys.model.res.IPSSysContentCat;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.model.system.PSSystemModuleImpl;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.model.wf.IPSWorkflow;

/**
 * 模型服务对象默认实现
 * 
 * @author lionlau
 *
 */
public class PSModelServiceImpl extends PSModelServiceImplBase implements IPSDynaInstService, IPSDynaInstServiceRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelServiceImpl.class);
	
	private PSApplicationServiceProxyImpl psApplicationServiceProxyImpl = new PSApplicationServiceProxyImpl();
	private PSDEFieldServiceProxyImpl psDEFieldServiceProxyImpl = new PSDEFieldServiceProxyImpl();
	private PSDERIndexDEFieldMapServiceProxyImpl psDERIndexDEFieldMapServiceProxyImpl = new PSDERIndexDEFieldMapServiceProxyImpl();
	private PSDERServiceProxyImpl psDERServiceProxyImpl = new PSDERServiceProxyImpl();
	private PSDEFVRConditionServiceProxyImpl psDEFVRConditionServiceProxyImpl = new PSDEFVRConditionServiceProxyImpl();
	private PSDER1NDEFieldMapServiceProxyImpl psDER1NDEFieldMapServiceProxyImpl = new PSDER1NDEFieldMapServiceProxyImpl();
	private PSDEDQConditionServiceProxyImpl psDEDQConditionServiceProxyImpl = new PSDEDQConditionServiceProxyImpl();
	private PSDEPrintServiceProxyImpl psDEPrintServiceProxyImpl = new PSDEPrintServiceProxyImpl();
	
    /**
     *  一对多关系数据集合，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ONE2MANYDATA = "ONE2MANYDATA";
    
    /**
     *  一对多关系数据集合（MAP），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ONE2MANYDATA_MAP = "ONE2MANYDATA_MAP";
    
    
    /**
     *  外键值对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PICKUPOBJECT = "PICKUPOBJECT";
    
     /**
     *  一对一关系数据对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ONE2ONEDATA = "ONE2ONEDATA";
    
    /**
     *  一对多动态对象集合，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ONE2MANYOBJ = "ONE2MANYOBJ";
    
    /**
     *  一对多动态对象集合（MAP），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ONE2MANYOBJ_MAP = "ONE2MANYOBJ_MAP";
    
    
     /**
     *  一对一动态对象对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ONE2ONEOBJ = "ONE2ONEOBJ";
    
    /**
     *  外键值，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PICKUP = "PICKUP";
    
	/**
	 * 动态实例标识
	 */
	private String strPSDynaInstId = null;
	
	
	/**
	 * 父动态实例标识
	 */
	private String strPPSDynaInstId = null;
	
	private int nDynaInstMode = 0;
	
	private String strDynaInstTag = null;
	
	private String strDynaInstTag2 = null;
	
	private List<IPSDynaInst> psDynaInstList = new ArrayList<IPSDynaInst>();
	
	private Map<String,Map<String,IPSDynaInst>> psDynaInstMapMap = new HashMap<String, Map<String,IPSDynaInst>>();
	
	private Map<String,IPSDataEntity> psDataEntityMap = new HashMap<String,IPSDataEntity>();
	
	private IPSSystemService iPSSystemService = null;
	
	/**
	 * 未加载的实体对象
	 */
	private final static IPSDataEntity NotLoadPSDataEntity = new PSDataEntityImpl();
	
	private boolean bDataEntityMapCache = false;
	
	private boolean bModelFromResource = false;
	
	private String strModelDigest = null;
	
	private Map<String, Object> psModelObjectCacheMap = new HashMap<String, Object>();
	
	
	
	public void setPSModelFolderPath(String strPSModelFolderPath, boolean bModelFromResource) {
		super.setPSModelFolderPath(strPSModelFolderPath);
		this.bModelFromResource = bModelFromResource;
	}
	
	@Override
	public void setPSDynaInstId(String strPSDynaInstId) {
		this.strPSDynaInstId = strPSDynaInstId;
	}

	@Override
	public String getPSDynaInstId() {
		return this.strPSDynaInstId;
	}
	
//	@Override
//	public void setParentPSModelService(IPSModelService iPSModelService) {
//		this.parentPSModelService = iPSModelService;
//	}
//
//	@Override
//	public IPSModelService getParentPSModelService() {
//		return this.parentPSModelService;
//	}
//	

	public IPSModelObject getPSModelObject(String strPath) {
		// String strFullTag = String.format("%1$s|%2$s",strType,strTag);
		// return psModelMap.get(strFullTag);

		return null;
	}

	
	
	protected void onInit(IPSSystem t,ObjectNode realNode){
		//进行模型预载

		this.psDynaInstList.clear();
		this.psDynaInstMapMap.clear();
		this.psDataEntityMap.clear();
		
		if(realNode.has("getPSDynaInstId")) {
			strPSDynaInstId = realNode.get("getPSDynaInstId").asText();
		}
		
		if(realNode.has("getPPSDynaInstId")) {
			strPPSDynaInstId = realNode.get("getPPSDynaInstId").asText();
		}
		
		if(realNode.has("dynaInstMode")) {
			nDynaInstMode = realNode.get("dynaInstMode").asInt();
		}
		
		if(realNode.has("dynaInstTag")) {
			strDynaInstTag = realNode.get("dynaInstTag").asText();
		}
		
		if(realNode.has("dynaInstTag2")) {
			strDynaInstTag2 = realNode.get("dynaInstTag2").asText();
		}
		
		//获取子实例集合
		if(true) {
			com.fasterxml.jackson.databind.JsonNode value = realNode.get("getPSDynaInsts");
			if(value != null){
				com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
				if(arrayNode.size() > 0){
					for(int i = 0;i<arrayNode.size();i++) {
						PSDynaInstImpl psDynaInstImpl = new PSDynaInstImpl();
						psDynaInstImpl.init(this,(IPSModelObjectRuntime) t, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i));
						psDynaInstList.add(psDynaInstImpl);
						
						if(StringUtils.hasLength(psDynaInstImpl.getInstTag()) && StringUtils.hasLength(psDynaInstImpl.getInstTag2())) {
							Map<String,IPSDynaInst> psDynaInstMap = this.psDynaInstMapMap.get(psDynaInstImpl.getInstTag());
							if(psDynaInstMap == null) {
								psDynaInstMap = new HashMap<String,IPSDynaInst>();
								this.psDynaInstMapMap.put(psDynaInstImpl.getInstTag(), psDynaInstMap);
							}
							psDynaInstMap.put(psDynaInstImpl.getInstTag2(),psDynaInstImpl);
						}
					}
				}
			}
		}
		
		//进行系统模型预载
		t.getAllPSSysModelGroups();
		t.getAllPSSysRefs();
		t.getAllPSSystemModules();
		t.getAllPSSysSFPlugins();
		t.getAllPSSysDEGroups();
		t.getAllPSSysUtils();
		t.getAllPSSysDataSyncAgents();
		t.getAllPSSysMsgQueues();
		t.getAllPSSysMsgTempls();
		t.getAllPSSysMsgTargets();
		t.getAllPSSysLogics();
		t.getAllPSSysUserRoles();
		t.getAllPSSysUniReses();
		t.getAllPSSysDynaModels();
		t.getAllPSSysDTSQueues();
		t.getAllPSSysResources();
		t.getAllPSSysUniStates();
		t.getAllPSSysCounters();
		
		
		//从模块中加载实体
		List<IPSSystemModule> psSystemModuleList = t.getAllPSSystemModules();
		if(psSystemModuleList!=null) {
			for(IPSSystemModule iPSSystemModule:psSystemModuleList) {
				if(this.isModelFromHttp()) {
					
					com.fasterxml.jackson.databind.JsonNode value = iPSSystemModule.getObjectNode().get(PSSystemModuleImpl.ATTR_GETALLPSDATAENTITIES);
					if(value != null){
						com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
						for(int i = 0;i<arrayNode.size();i++) {
							ObjectNode dataEntityNode = (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i);
							JsonNode jsonNode = dataEntityNode.get("path");
							if(jsonNode != null) {
								this.psDataEntityMap.put(jsonNode.asText(), NotLoadPSDataEntity);
							}
						}
					}
				}
				else {
					List<IPSDataEntity> psDataEntityList = iPSSystemModule.getAllPSDataEntities();
					if(psDataEntityList!=null) {
						for(IPSDataEntity iPSDataEntity:psDataEntityList) {
							
							IPSModelObjectRuntime iPSModelObjectRuntime = (IPSModelObjectRuntime)iPSDataEntity;
							if(StringUtils.hasLength(iPSModelObjectRuntime.getDynaModelFilePath())) {
								this.psDataEntityMap.put(iPSModelObjectRuntime.getDynaModelFilePath(), iPSDataEntity);
							}
							if(StringUtils.hasLength(iPSDataEntity.getName())) {
								this.psDataEntityMap.put(iPSDataEntity.getName(), iPSDataEntity);
							}
						}
						
						//预载关系
						for(IPSDataEntity iPSDataEntity:psDataEntityList) {
							iPSDataEntity.getMinorPSDERs();
							iPSDataEntity.getMajorPSDERs();
							iPSDataEntity.getAllPSDEActions();
							iPSDataEntity.getAllPSDELogics();
						}
					}
				}
			}
		}
		this.bDataEntityMapCache = true;
	}

	
	@Override
	public IPSSystemService getPSSystemService() {
		return this.iPSSystemService;
	}
	
	@Override
	public void setPSSystemService(IPSSystemService iPSSystemService) {
		this.iPSSystemService = iPSSystemService;
	}
	
	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode, String strTag){


		return super.getPSModelObject(parentPSModelObject, cls, objNode, strTag);
	}

	@Override
	protected <T> T createIPSAppView(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode){
		T t = super.createIPSAppView(parentPSModelObject, cls, objNode);
		if (t != null) {
			return t;
		}
		return this.createIPSAppDEView(parentPSModelObject, cls, objNode);
	}

	@Override
	protected <T> T createIPSDEField(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode){

		String strDataType = PSObjectImplBase.getString(objNode, PSDEFieldImpl.ATTR_GETDATATYPE,null);

		if(StringUtils.hasLength(strDataType)) {
			if(strDataType.equals(ONE2ONEDATA)) {
				return (T) new PSOne2OneDataDEFieldImpl();
			}
			
			if(strDataType.equals(ONE2MANYDATA)
					|| strDataType.equals(ONE2MANYDATA_MAP)) {
				return (T) new PSOne2ManyDataDEFieldImpl();
			}
			
			if(strDataType.equals(ONE2ONEOBJ)) {
				return (T) new PSOne2OneObjDEFieldImpl();
			}
			
			if(strDataType.equals(ONE2MANYOBJ)
					|| strDataType.equals(ONE2MANYOBJ_MAP)) {
				return (T) new PSOne2ManyObjDEFieldImpl();
			}
			
			
			if(strDataType.equals(PICKUP)) {
				return (T) new PSPickupDEFieldImpl();
			}
			
			if(strDataType.equals(PICKUPOBJECT)) {
				return (T) new PSPickupObjectDEFieldImpl();
			}
			
		}
		boolean bLink = PSObjectImplBase.getBoolean(objNode, PSDEFieldImpl.ATTR_ISLINKDEFIELD, false);
		if (bLink) {
			if(PSObjectImplBase.getBoolean(objNode, PSDEFieldImpl.ATTR_ISINHERITDEFIELD, false)) {
				return (T) new PSInheritDEFieldImpl();
			}
			
			if(strDataType.equals(DEFDataType.PICKUPDATA.value)) {
				return (T) new PSPickupDataDEFieldImpl();
			}
			
			if(strDataType.equals(DEFDataType.PICKUPTEXT.value)) {
				return (T) new PSPickupTextDEFieldImpl();
			}
			
			return (T) new PSLinkDEFieldImpl();
		}
		boolean bFormula = PSObjectImplBase.getBoolean(objNode, PSDEFieldImpl.ATTR_ISFORMULADEFIELD, false);
		if(bFormula) {
			return (T)new PSFormulaDEFieldImpl();
		}
		
		return super.createIPSDEField(parentPSModelObject, cls, objNode);
	}

	@Override
	protected IPSModelServiceProxy createPSModelServiceProxy(Class<?> cls, Object objPSModel){
		if (objPSModel != null) {
			if (objPSModel instanceof IPSApplication) {
				return psApplicationServiceProxyImpl;
			}
			if (objPSModel instanceof IPSDEField) {
				return psDEFieldServiceProxyImpl;
			}
			if (objPSModel instanceof IPSDERBase) {
				return psDERServiceProxyImpl;
			}
			if(objPSModel instanceof IPSDERIndexDEFieldMap) {
				return psDERIndexDEFieldMapServiceProxyImpl;
			}
			if (objPSModel instanceof IPSDEFVRCondition) {
				return psDEFVRConditionServiceProxyImpl;
			}
			if(objPSModel instanceof IPSDER1NDEFieldMap) {
				return psDER1NDEFieldMapServiceProxyImpl;
			}
			if(objPSModel instanceof IPSDEDQCondition) {
				return psDEDQConditionServiceProxyImpl;
			}
			if(objPSModel instanceof IPSDEPrint) {
				return psDEPrintServiceProxyImpl;
			}
		}

		return super.createPSModelServiceProxy(cls, objPSModel);
	}

	@Override
	public IPSDataEntity getPSDataEntity(String strName, boolean bTryMode){
		IPSDataEntity iPSDataEntity = this.psDataEntityMap.get(strName);
		if(iPSDataEntity != null && iPSDataEntity == NotLoadPSDataEntity) {
			//实体未加载
			iPSDataEntity = super.getPSModelObject(null, IPSDataEntity.class, strName);
			if(iPSDataEntity != null) {
				iPSDataEntity.getMinorPSDERs();
				iPSDataEntity.getMajorPSDERs();
				iPSDataEntity.getAllPSDEActions();
				iPSDataEntity.getAllPSDELogics();
				this.psDataEntityMap.put(strName , iPSDataEntity);
			}
		}
		if(iPSDataEntity == null && !bTryMode) {
			throw new PSModelServiceException(this, String.format("无法获取指定实体模型，标识为[%1$s]",strName));
		}
		return iPSDataEntity;
	}

	@Override
	public IPSDataEntity getPSDataEntity(String strName, String strDynaInstTag, String strDynaInstTag2, boolean bTryMode){
		//获取指定动态实例
		IPSDynaInstService iPSDynaInstService = this.getChildPSDynaInstService(strDynaInstTag, strDynaInstTag2);
		IPSDataEntity iPSDataEntity = iPSDynaInstService.getPSDataEntity(strName, true);
		if(iPSDataEntity != null) {
			return iPSDataEntity;
		}
		return getPSDataEntity(strName,bTryMode);
	}
	
	@Override
	public <T> T getPSModelObject(Class<T> cls, String strModelPath) {
		return this.getPSModelObject(null, cls, strModelPath);
	}
	
	protected <T> T getPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, String strModelPath){
		//判断是否为实体
		if(this.bDataEntityMapCache && IPSDataEntity.class.isAssignableFrom(cls)) {
			//从当前缓存判断
			IPSDataEntity iPSDataEntity = this.getPSDataEntity(strModelPath,true);
			if(iPSDataEntity != null) {
				return (T)iPSDataEntity;
			}
			
			if(this.getDynaInstMode() == DYNAINSTMODE_ENABLEINST) {
				IPSDynaInstService parentPSDynaInstService = this.getParentPSDynaInstService();
				if(parentPSDynaInstService!=null) {
					iPSDataEntity = parentPSDynaInstService.getPSDataEntity(strModelPath,false);
					if(iPSDataEntity != null) {
						return (T)iPSDataEntity;
					}
				}
			}
			
			return null;
		}
		
		
		if(this.getDynaInstMode() == DYNAINSTMODE_ENABLEINST) {
			//需要判断指定文件是否存在
			IPSModelObject iPSModelObject = this.getCachePSModelObject(strModelPath);
			if(iPSModelObject != null) {
				return (T)iPSModelObject;
			}
			
			//判断文件是否存在
			if(!this.containsObjectNode(strModelPath)) {
				IPSDynaInstService parentPSDynaInstService = this.getParentPSDynaInstService();
				if(parentPSDynaInstService!=null) {
					//从父实例中获取
					iPSModelObject = (IPSModelObject)parentPSDynaInstService.getPSModelObject(cls, strModelPath);
					this.setCachePSModelObject(strModelPath, iPSModelObject);
					
					return (T)iPSModelObject;
				}
				else {
					throw new PSModelServiceException(this,"无法获取副本实例的默认实例");
				}
			}
		}
		else
			if(getPSSystemService() != null) {
				IPSModelObject iPSModelObject = this.getCachePSModelObject(strModelPath);
				if(iPSModelObject != null) {
					return (T)iPSModelObject;
				}
				
				//判断文件是否存在
				if(!this.containsObjectNode(strModelPath)) {
					iPSModelObject = (IPSModelObject)this.getPSSystemService().getPSModelObject(cls, strModelPath);
					this.setCachePSModelObject(strModelPath, iPSModelObject);
					return (T)iPSModelObject;
				}
			}
		
		return super.getPSModelObject(parentPSModelObject, cls, strModelPath);
	}
	
	public IPSDynaInstService getChildPSDynaInstService(String strDynaInstTag, String strDynaInstTag2){
		Map<String,IPSDynaInst> psDynaInstMap = this.psDynaInstMapMap.get(strDynaInstTag);
		IPSDynaInst iPSDynaInst = null;
		if(psDynaInstMap != null) {
			iPSDynaInst = psDynaInstMap.get(strDynaInstTag2);
		}
		if(iPSDynaInst == null) {
			throw new PSModelServiceException(this, String.format("无法获取指定子动态实例[%1$s][%2$s]",strDynaInstTag,strDynaInstTag2));
		}
		try {
			return PSDynaInstServiceGlobal.getInstance().getPSDynaInstService(iPSDynaInst.getId(), false);}
		catch(Exception ex) {
			throw new PSModelServiceException(this, String.format("获取子实例[%1$s]模型服务对象发生异常, %2$s",iPSDynaInst.getId(),ex.getMessage()), ex);
		}
	}

	public IPSDynaInstService getParentPSDynaInstService() {
		if(StringUtils.hasLength(getPPSDynaInstId())) {
			try {
				return PSDynaInstServiceGlobal.getInstance().getPSDynaInstService(getPPSDynaInstId(), false);
			}
			catch(Exception ex) {
				throw new PSModelServiceException(this, String.format("获取父实例[%1$s]模型服务对象发生异常, %2$s",this.getPPSDynaInstId(),ex.getMessage()), ex);
			}
		}
		return null;
	}

	@Override
	public String getPPSDynaInstId() {
		return this.strPPSDynaInstId;
	}
	
	
	@Override
	public int getDynaInstMode() {
		return this.nDynaInstMode;
	}

	@Override
	public String getDynaInstTag() {
		return this.strDynaInstTag;
	}

	@Override
	public String getDynaInstTag2() {
		return this.strDynaInstTag2;
	}
	
	
	/**
	 * 获取子动态实例
	 */
	public IPSDynaInst getChildPSDynaInst(String strDynaInstTag, String strDynaInstTag2) {
		Map<String,IPSDynaInst> psDynaInstMap = this.psDynaInstMapMap.get(strDynaInstTag);
		IPSDynaInst iPSDynaInst = null;
		if(psDynaInstMap != null) {
			iPSDynaInst = psDynaInstMap.get(strDynaInstTag2);
		}
		return iPSDynaInst;
	}
	

	@Override
	public String getInstallTag() {
		if(this.isModelFromHttp()) {
			String strFullModelPath = this.getPSModelFolderPath() + "/upload.log";
			try {
				URL remoteUrl = new URL(strFullModelPath);
				
				InputStream inputStream = remoteUrl.openStream();
				ByteArrayOutputStream result = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				int length;
				while ((length = inputStream.read(buffer)) != -1) {
				    result.write(buffer, 0, length);
				}
				String str = result.toString();
				return str;
			}
			catch(Exception ex) {
				//log.error(String.format("获取资源文件[%1$s]发生异常，%2$s",strFullModelPath,ex.getMessage()),ex);
				return null;
			}
		}
		return null;
	}
	
	@Override
	public <T> T createAndInitPSModelObject(Class<T> cls, ObjectNode objNode) {
		if(this.getPSSystem() == null) {
			throw new PSModelServiceException(this, String.format("系统模型无效"));
		}
		return createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSSystem(), cls, objNode);
	}
	

	@Override
	public <T> T createAndInitPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		T t = this.createPSModelObject(parentPSModelObject, cls, objNode);
		
		((IPSModelObjectRuntime)t).init(this.getPSModelService(t.getClass(), t), parentPSModelObject, objNode);
		
		return t;
	}
	
	@Override
	public IPSCodeList getPSCodeList(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSCodeList.class.getSimpleName(), strTag).toLowerCase();
		IPSCodeList iPSCodeList = (IPSCodeList)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSCodeList == null) {
			iPSCodeList = this.doGetPSCodeList(strTag, bTryMode);
			if(iPSCodeList != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSCodeList);
			}
		}
		return iPSCodeList;
	}
	
	protected IPSCodeList doGetPSCodeList(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSCodeList> list = getPSSystem().getAllPSCodeLists();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSCodeList iPSCodeList : list) {
				if(bUniqueTag) {
					if(iPSCodeList.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSCodeList.getPSSystemModule(), iPSCodeList.getCodeName()))) {
							return iPSCodeList;
						}
					}
				}
				else {
					//优先使用代码表全局标记
					if(strTag.equalsIgnoreCase(iPSCodeList.getCodeListTag())) {
						return iPSCodeList;
					}
				}
			}
			
			if(!bUniqueTag) {
				for(IPSCodeList iPSCodeList : list) {
					if(strTag.equalsIgnoreCase(iPSCodeList.getCodeName())) {
						return iPSCodeList;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统代码表模型对象[%1$s]", strTag));
	}
	
	
	@Override
	public IPSSysSequence getPSSysSequence(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysSequence.class.getSimpleName(), strTag).toLowerCase();
		IPSSysSequence iPSSysSequence = (IPSSysSequence)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysSequence == null) {
			iPSSysSequence = this.doGetPSSysSequence(strTag, bTryMode);
			if(iPSSysSequence != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysSequence);
			}
		}
		return iPSSysSequence;
	}
	
	
	protected IPSSysSequence doGetPSSysSequence(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSSysSequence> list = getPSSystem().getAllPSSysSequences();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysSequence iPSSysSequence : list) {
				if(bUniqueTag) {
					if(iPSSysSequence.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysSequence.getPSSystemModule(), iPSSysSequence.getCodeName()))) {
							return iPSSysSequence;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysSequence.getCodeName())) {
						return iPSSysSequence;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统值序列模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysTranslator getPSSysTranslator(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysTranslator.class.getSimpleName(), strTag).toLowerCase();
		IPSSysTranslator iPSSysTranslator = (IPSSysTranslator)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysTranslator == null) {
			iPSSysTranslator = this.doGetPSSysTranslator(strTag, bTryMode);
			if(iPSSysTranslator != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysTranslator);
			}
		}
		return iPSSysTranslator;
	}
	
	protected IPSSysTranslator doGetPSSysTranslator(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSSysTranslator> list = getPSSystem().getAllPSSysTranslators();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysTranslator iPSSysTranslator : list) {
				if(bUniqueTag) {
					if(iPSSysTranslator.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysTranslator.getPSSystemModule(), iPSSysTranslator.getCodeName()))) {
							return iPSSysTranslator;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysTranslator.getCodeName())) {
						return iPSSysTranslator;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统值转换器模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysServiceAPI getPSSysServiceAPI(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysServiceAPI.class.getSimpleName(), strTag).toLowerCase();
		IPSSysServiceAPI iPSSysServiceAPI = (IPSSysServiceAPI)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysServiceAPI == null) {
			iPSSysServiceAPI = this.doGetPSSysServiceAPI(strTag, bTryMode);
			if(iPSSysServiceAPI != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysServiceAPI);
			}
		}
		return iPSSysServiceAPI;
	}
	
	protected IPSSysServiceAPI doGetPSSysServiceAPI(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSSysServiceAPI> list = getPSSystem().getAllPSSysServiceAPIs();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysServiceAPI iPSSysSysServiceAPI : list) {
				if(bUniqueTag) {
					if(iPSSysSysServiceAPI.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysSysServiceAPI.getPSSystemModule(), iPSSysSysServiceAPI.getCodeName()))) {
							return iPSSysSysServiceAPI;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysSysServiceAPI.getCodeName())) {
						return iPSSysSysServiceAPI;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统服务接口模型对象[%1$s]", strTag));
	}
	
	
	
	@Override
	public IPSSubSysServiceAPI getPSSysSubSysServiceAPI(String strTag, boolean bTryMode) {
		return this.getPSSubSysServiceAPI(strTag, bTryMode);
	}
	
	@Override
	public IPSSubSysServiceAPI getPSSubSysServiceAPI(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSubSysServiceAPI.class.getSimpleName(), strTag).toLowerCase();
		IPSSubSysServiceAPI iPSSubSysServiceAPI = (IPSSubSysServiceAPI)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSubSysServiceAPI == null) {
			iPSSubSysServiceAPI = this.doGetPSSubSysServiceAPI(strTag, bTryMode);
			if(iPSSubSysServiceAPI != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSubSysServiceAPI);
			}
		}
		return iPSSubSysServiceAPI;
	}
	
	
	protected IPSSubSysServiceAPI doGetPSSubSysServiceAPI(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSSubSysServiceAPI> list = getPSSystem().getAllPSSubSysServiceAPIs();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSubSysServiceAPI iPSSysSubSysServiceAPI : list) {
				if(bUniqueTag) {
					if(iPSSysSubSysServiceAPI.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysSubSysServiceAPI.getPSSystemModule(), iPSSysSubSysServiceAPI.getCodeName()))) {
							return iPSSysSubSysServiceAPI;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysSubSysServiceAPI.getCodeName())) {
						return iPSSysSubSysServiceAPI;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统外部服务接口模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysContentCat getPSSysContentCat(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysContentCat.class.getSimpleName(), strTag).toLowerCase();
		IPSSysContentCat iPSSysContentCat = (IPSSysContentCat)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysContentCat == null) {
			iPSSysContentCat = this.doGetPSSysContentCat(strTag, bTryMode);
			if(iPSSysContentCat != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysContentCat);
			}
		}
		return iPSSysContentCat;
	}
	
	protected IPSSysContentCat doGetPSSysContentCat(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSSysContentCat> list = getPSSystem().getAllPSSysContentCats();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysContentCat iPSSysSysContentCat : list) {
				if(bUniqueTag) {
					if(iPSSysSysContentCat.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysSysContentCat.getPSSystemModule(), iPSSysSysContentCat.getCodeName()))) {
							return iPSSysSysContentCat;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysSysContentCat.getCodeName())) {
						return iPSSysSysContentCat;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统预置内容分类模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysValueRule getPSSysValueRule(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysValueRule.class.getSimpleName(), strTag).toLowerCase();
		IPSSysValueRule iPSSysValueRule = (IPSSysValueRule)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysValueRule == null) {
			iPSSysValueRule = this.doGetPSSysValueRule(strTag, bTryMode);
			if(iPSSysValueRule != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysValueRule);
			}
		}
		return iPSSysValueRule;
	}
	
	
	protected IPSSysValueRule doGetPSSysValueRule(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSSysValueRule> list = getPSSystem().getAllPSSysValueRules();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysValueRule iPSSysSysValueRule : list) {
				if(bUniqueTag) {
					if(iPSSysSysValueRule.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysSysValueRule.getPSSystemModule(), iPSSysSysValueRule.getCodeName()))) {
							return iPSSysSysValueRule;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysSysValueRule.getCodeName())) {
						return iPSSysSysValueRule;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统值规则模型对象[%1$s]", strTag));
	}
	
	
	
	@Override
	public IPSSysLogic getPSSysLogic(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysLogic.class.getSimpleName(), strTag).toLowerCase();
		IPSSysLogic iPSSysLogic = (IPSSysLogic)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysLogic == null) {
			iPSSysLogic = this.doGetPSSysLogic(strTag, bTryMode);
			if(iPSSysLogic != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysLogic);
			}
		}
		return iPSSysLogic;
	}
	
	protected IPSSysLogic doGetPSSysLogic(String strTag, boolean bTryMode) {
		
		List<IPSSysLogic> list = getPSSystem().getAllPSSysLogics();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysLogic iPSSysLogic : list) {
				if(bUniqueTag) {
					if(iPSSysLogic.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysLogic.getPSSystemModule(), iPSSysLogic.getCodeName()))) {
							return iPSSysLogic;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysLogic.getCodeName())) {
						return iPSSysLogic;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统预置逻辑模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysDataSyncAgent getPSSysDataSyncAgent(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysDataSyncAgent.class.getSimpleName(), strTag).toLowerCase();
		IPSSysDataSyncAgent iPSSysDataSyncAgent = (IPSSysDataSyncAgent)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysDataSyncAgent == null) {
			iPSSysDataSyncAgent = this.doGetPSSysDataSyncAgent(strTag, bTryMode);
			if(iPSSysDataSyncAgent != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysDataSyncAgent);
			}
		}
		return iPSSysDataSyncAgent;
	}
	
	
	protected IPSSysDataSyncAgent doGetPSSysDataSyncAgent(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		List<IPSSysDataSyncAgent> list = getPSSystem().getAllPSSysDataSyncAgents();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysDataSyncAgent iPSSysDataSyncAgent : list) {
				if(bUniqueTag) {
					if(iPSSysDataSyncAgent.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysDataSyncAgent.getPSSystemModule(), iPSSysDataSyncAgent.getCodeName()))) {
							return iPSSysDataSyncAgent;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysDataSyncAgent.getCodeName())) {
						return iPSSysDataSyncAgent;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统数据同步代理模型对象[%1$s]", strTag));
	}
	
	
	@Override
	public IPSSysMsgTarget getPSSysMsgTarget(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysMsgTarget.class.getSimpleName(), strTag).toLowerCase();
		IPSSysMsgTarget iPSSysMsgTarget = (IPSSysMsgTarget)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysMsgTarget == null) {
			iPSSysMsgTarget = this.doGetPSSysMsgTarget(strTag, bTryMode);
			if(iPSSysMsgTarget != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysMsgTarget);
			}
		}
		return iPSSysMsgTarget;
	}
	
	protected IPSSysMsgTarget doGetPSSysMsgTarget(String strTag, boolean bTryMode) {
		
		List<IPSSysMsgTarget> list = getPSSystem().getAllPSSysMsgTargets();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysMsgTarget iPSSysMsgTarget : list) {
				if(bUniqueTag) {
					if(iPSSysMsgTarget.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysMsgTarget.getPSSystemModule(), iPSSysMsgTarget.getCodeName()))) {
							return iPSSysMsgTarget;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysMsgTarget.getCodeName())) {
						return iPSSysMsgTarget;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统消息目标模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysMsgTempl getPSSysMsgTempl(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysMsgTempl.class.getSimpleName(), strTag).toLowerCase();
		IPSSysMsgTempl iPSSysMsgTempl = (IPSSysMsgTempl)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysMsgTempl == null) {
			iPSSysMsgTempl = this.doGetPSSysMsgTempl(strTag, bTryMode);
			if(iPSSysMsgTempl != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysMsgTempl);
			}
		}
		return iPSSysMsgTempl;
	}
	
	protected IPSSysMsgTempl doGetPSSysMsgTempl(String strTag, boolean bTryMode) {
		
		List<IPSSysMsgTempl> list = getPSSystem().getAllPSSysMsgTempls();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysMsgTempl iPSSysMsgTempl : list) {
				if(bUniqueTag) {
					if(iPSSysMsgTempl.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysMsgTempl.getPSSystemModule(), iPSSysMsgTempl.getCodeName()))) {
							return iPSSysMsgTempl;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysMsgTempl.getCodeName())) {
						return iPSSysMsgTempl;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统消息模板模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysMsgQueue getPSSysMsgQueue(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysMsgQueue.class.getSimpleName(), strTag).toLowerCase();
		IPSSysMsgQueue iPSSysMsgQueue = (IPSSysMsgQueue)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysMsgQueue == null) {
			iPSSysMsgQueue = this.doGetPSSysMsgQueue(strTag, bTryMode);
			if(iPSSysMsgQueue != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysMsgQueue);
			}
		}
		return iPSSysMsgQueue;
	}
	
	protected IPSSysMsgQueue doGetPSSysMsgQueue(String strTag, boolean bTryMode) {
		
		List<IPSSysMsgQueue> list = getPSSystem().getAllPSSysMsgQueues();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysMsgQueue iPSSysMsgQueue : list) {
				if(bUniqueTag) {
					if(iPSSysMsgQueue.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysMsgQueue.getPSSystemModule(), iPSSysMsgQueue.getCodeName()))) {
							return iPSSysMsgQueue;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysMsgQueue.getCodeName())) {
						return iPSSysMsgQueue;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统消息队列模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSWFRole getPSWFRole(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSWFRole.class.getSimpleName(), strTag).toLowerCase();
		IPSWFRole iPSWFRole = (IPSWFRole)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSWFRole == null) {
			iPSWFRole = this.doGetPSWFRole(strTag, bTryMode);
			if(iPSWFRole != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSWFRole);
			}
		}
		return iPSWFRole;
	}
	
	protected IPSWFRole doGetPSWFRole(String strTag, boolean bTryMode) {
		
		List<IPSWFRole> list = getPSSystem().getAllPSWFRoles();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSWFRole iPSWFRole : list) {
				if(bUniqueTag) {
					if(iPSWFRole.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSWFRole.getPSSystemModule(), iPSWFRole.getCodeName()))) {
							return iPSWFRole;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSWFRole.getCodeName())) {
						return iPSWFRole;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统工作流角色模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSWorkflow getPSWorkflow(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSWorkflow.class.getSimpleName(), strTag).toLowerCase();
		IPSWorkflow iPSWorkflow = (IPSWorkflow)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSWorkflow == null) {
			iPSWorkflow = this.doGetPSWorkflow(strTag, bTryMode);
			if(iPSWorkflow != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSWorkflow);
			}
		}
		return iPSWorkflow;
	}
	
	protected IPSWorkflow doGetPSWorkflow(String strTag, boolean bTryMode) {
		
		List<IPSWorkflow> list = getPSSystem().getAllPSWorkflows();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSWorkflow iPSWorkflow : list) {
				if(bUniqueTag) {
					if(iPSWorkflow.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSWorkflow.getPSSystemModule(), iPSWorkflow.getCodeName()))) {
							return iPSWorkflow;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSWorkflow.getCodeName())) {
						return iPSWorkflow;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统工作流模型对象[%1$s]", strTag));
	}
	
	@Override
	public IPSSysDEGroup getPSSysDEGroup(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag,"传入模型标记无效");
		
		String strUniqueKey = String.format("%1$s:%2$s",IPSSysDEGroup.class.getSimpleName(), strTag).toLowerCase();
		IPSSysDEGroup iPSSysDEGroup = (IPSSysDEGroup)this.psModelObjectCacheMap.get(strUniqueKey);
		if(iPSSysDEGroup == null) {
			iPSSysDEGroup = this.doGetPSSysDEGroup(strTag, bTryMode);
			if(iPSSysDEGroup != null) {
				this.psModelObjectCacheMap.put(strUniqueKey, iPSSysDEGroup);
			}
		}
		return iPSSysDEGroup;
	}
	
	protected IPSSysDEGroup doGetPSSysDEGroup(String strTag, boolean bTryMode) {
		
		List<IPSSysDEGroup> list = getPSSystem().getAllPSSysDEGroups();
		if(list != null) {
			boolean bUniqueTag = strTag.indexOf(".") != -1;
			for(IPSSysDEGroup iPSSysDEGroup : list) {
				if(bUniqueTag) {
					if(iPSSysDEGroup.getPSSystemModule()!=null) {
						if(strTag.equalsIgnoreCase(PSModelUtils.calcUniqueTag(iPSSysDEGroup.getPSSystemModule(), iPSSysDEGroup.getCodeName()))) {
							return iPSSysDEGroup;
						}
					}
				}
				else {
					if(strTag.equalsIgnoreCase(iPSSysDEGroup.getCodeName())) {
						return iPSSysDEGroup;
					}
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定系统实体组模型对象[%1$s]", strTag));
	}
	
	
	protected boolean isModelFromResource() {
		return this.bModelFromResource;
	}
	
	protected boolean isModelFromHttp() {
		if(isModelFromResource()) {
			return false;
		}
		return super.isModelFromHttp();
	}
	
	@Override
	protected ObjectNode getObjectNode(String strPath) throws Exception {
		if(isModelFromResource()) {
			String strFullModelPath = this.getPSModelFolderPath() + "/" + strPath.replace("\\", "/");
			return (ObjectNode)MAPPER.readTree(this.getClass().getResourceAsStream(strFullModelPath));
		}
		return super.getObjectNode(strPath);
	}
	
	@Override
	public String getRawContent(String strPath, boolean bTryMode) throws Exception{
		if(isModelFromResource()) {
			String strFullModelPath = this.getPSModelFolderPath() + "/" + strPath.replace("\\", "/");
			InputStream is = this.getClass().getResourceAsStream(strFullModelPath);
			if(is != null) {
				return IOUtils.toString(is, "UTF-8");
			}
			
			if(bTryMode) {
				return null;
			}
			
			throw new Exception(String.format("指定文件[%1$s]不存在", strFullModelPath));
		}
		return super.getRawContent(strPath, bTryMode);
	}

	@Override
	public String getModelDigest() {
		return this.strModelDigest;
	}
	
	public void setModelDigest(String strModelDigest) {
		this.strModelDigest = strModelDigest;
	}
	
	@Override
	protected <T> T createIPSSysContent(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(parentPSModelObject instanceof IPSSysContentCat) {
			return (T) new PSSysContentImplEx();
		}
		return super.createIPSSysContent(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSSysSFPlugin(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		//return super.createIPSSysSFPlugin(parentPSModelObject, cls, objNode);
		return (T) new PSSysSFPluginImplEx();
	}
	
	@Override
	protected <T> T createIPSAppDEMethodDTOField(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSAppDEMethodDTOField(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSDEMethodDTOField(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSDEMethodDTOField(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSDEFilterDTOField(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSDEFilterDTOField(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSDEActionInputDTOField(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSDEActionInputDTOField(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSDEMethodDTO(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSDEMethodDTO(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSAppDEMethodDTO(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSAppDEMethodDTO(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSDEFilterDTO(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSDEFilterDTO(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSDEActionInputDTO(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		if(!objNode.has("codeName")) {
			objNode.set("codeName", objNode.get("name"));
		}
		return super.createIPSDEActionInputDTO(parentPSModelObject, cls, objNode);
	}
	
	@Override
	protected <T> T createIPSDERCustom(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		JsonNode jsonNode = objNode.get(PSDERCustomImpl.ATTR_GETTYPEVALUE);
		if(jsonNode!=null && !(jsonNode instanceof NullNode)) {
			String strTypeValue = jsonNode.asText();
			if(StringUtils.hasLength(strTypeValue)) {
				String[] items = strTypeValue.split("[:]");
				jsonNode = objNode.get(PSDERCustomImpl.ATTR_GETPARENTTYPE);
				if(jsonNode==null) {
					if(items.length == 2) {
						objNode.put(PSDERCustomImpl.ATTR_GETPARENTTYPE, items[0]);
					}
				}
				
				jsonNode = objNode.get(PSDERCustomImpl.ATTR_GETPARENTSUBTYPE);
				if(jsonNode==null) {
					if(items.length == 2) {
						objNode.put(PSDERCustomImpl.ATTR_GETPARENTSUBTYPE, items[1]);
					}
					else {
						objNode.put(PSDERCustomImpl.ATTR_GETPARENTSUBTYPE, items[0]);
					}
				}
			}
		}
		return super.createIPSDERCustom(parentPSModelObject, cls, objNode);
	}

	@Override
	public IPSModelObject getPSModelObject(String strPSModelType, String strPSModelId, boolean bTryMode) {
		Assert.hasLength(strPSModelType,"传入模型类型无效");
		if(PSSYSTEM.equals(strPSModelType)) {
			return this.getPSSystem();
		}
		
		Assert.hasLength(strPSModelId,"传入模型标记无效");
		if(PSDATAENTITY.equals(strPSModelType)) {
			java.util.List<IPSDataEntity> psDataEntityList = this.getPSSystem().getAllPSDataEntities();
			if(!ObjectUtils.isEmpty(psDataEntityList)) {
				for(IPSDataEntity iPSDataEntity : psDataEntityList) {
					String strModelTag = PSModelUtils.calcUniqueTag(iPSDataEntity.getPSSystemModule(), iPSDataEntity.getCodeName());
					if(strPSModelId.equalsIgnoreCase(strModelTag)) {
						return iPSDataEntity;
					}
				}
			}
			
		}
		
		if(bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法获取指定模型对象[%1$s][%2$s]", strPSModelType, strPSModelId));
	}
	
}
