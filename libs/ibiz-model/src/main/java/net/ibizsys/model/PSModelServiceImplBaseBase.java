package net.ibizsys.model;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.codelist.IPSAppCodeList;
import net.ibizsys.model.app.control.IPSAppCounterRef;
import net.ibizsys.model.app.dataentity.IPSAppDEUIAction;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.logic.IPSAppUILogic;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.app.view.IPSAppViewEngine;
import net.ibizsys.model.app.view.IPSAppViewLogic;
import net.ibizsys.model.app.view.IPSAppViewUIAction;
import net.ibizsys.model.app.wf.IPSAppWF;
import net.ibizsys.model.app.wf.IPSAppWFVer;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.IPSControlContainer;
import net.ibizsys.model.control.form.IPSDEForm;
import net.ibizsys.model.control.form.IPSDEFormDetail;
import net.ibizsys.model.control.form.IPSDEFormGroupBase;
import net.ibizsys.model.control.form.IPSDEFormTabPanel;
import net.ibizsys.model.control.panel.IPSPanelItem;
import net.ibizsys.model.control.panel.IPSPanelTabPage;
import net.ibizsys.model.control.panel.IPSPanelTabPanel;
import net.ibizsys.model.control.panel.IPSSysPanelContainer;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.priv.IPSDEOPPriv;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.model.view.IPSUIAction;
import net.ibizsys.model.wf.IPSWFLink;
import net.ibizsys.model.wf.IPSWFProcess;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;

/**
 * 模型服务操作会话
 * 
 * @author lionlau
 *
 */
@SuppressWarnings("unchecked")
public abstract class PSModelServiceImplBaseBase implements IPSModelService {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelServiceImplBaseBase.class);
	
	/**
	 * 动态实例模式，不启用
	 */
	public final static int DYNAINSTMODE_DISABLE = 0;

	/**
	 * 动态实例模式，启用
	 */
	public final static int DYNAINSTMODE_ENABLE = 1;

	/**
	 * 动态实例模式，启用副本模式
	 */
	public final static int DYNAINSTMODE_ENABLEINST = 2;

	protected static ObjectMapper MAPPER = new ObjectMapper();

	protected Map<Class<?>, IPSModelService> psModelServiceMap = new ConcurrentHashMap<Class<?>, IPSModelService>();

	/**
	 * 模型目录路径
	 */
	private String strPSModelFolderPath = null;
	
	
	private String strGroovyFolderPath = null;
	
	private String strLibraryFolderPath = null;

	//
	// /**
	// * 父模型服务对象
	// */
	// private IPSModelService parentPSModelService = null;

	private Map<String, IPSModelObject> psModelObjectMap = new ConcurrentHashMap<String, IPSModelObject>();

	private IPSSystem iPSSystem = null;
	
	private boolean bHttpMode = false;

	//@Override
	public void setPSModelFolderPath(String strPSModelFolderPath) {
		this.strPSModelFolderPath = strPSModelFolderPath;
		this.strGroovyFolderPath = null;
		this.strLibraryFolderPath = null;
		this.bHttpMode = false;
		if(StringUtils.hasLength(strPSModelFolderPath)) {
			String strHeader = strPSModelFolderPath.toLowerCase();
			if((strHeader.indexOf("http://") == 0) || (strHeader.indexOf("https://") == 0)) {
				this.bHttpMode = true;
			}
			if(!this.bHttpMode) {
				this.setLibraryFolderPath(String.format("%1$s/%2$s", strPSModelFolderPath, "lib"));
			}
		}
	}

	//@Override
	public String getPSModelFolderPath() {
		return this.strPSModelFolderPath;
	}
	
	public void setGroovyFolderPath(String strGroovyFolderPath) {
		this.strGroovyFolderPath = strGroovyFolderPath;
	}

	//@Override
	public String getGroovyFolderPath() {
		return this.strGroovyFolderPath;
	}
		
	public void setLibraryFolderPath(String strLibraryFolderPath) {
		this.strLibraryFolderPath = strLibraryFolderPath;
	}

	//@Override
	public String getLibraryFolderPath() {
		return this.strLibraryFolderPath;
	}
	

	// @Override
	public IPSSystem getPSSystem() {

		if (this.iPSSystem == null) {
			//String strPath = this.getPSModelFolderPath() + File.separator + "PSSYSTEM.json";
			String strPath = "PSSYSTEM.json";
			IPSModelObject iPSModelObject = psModelObjectMap.get(strPath);
			if (iPSModelObject == null) {
				ObjectNode realNode;
				
				try {
					realNode = getObjectNode(strPath);
				}
				catch(Exception ex) {
					log.error(String.format("加载系统模型文件[%1$s]发生异常，%2$s",strPath,ex.getMessage()),ex);
					throw new PSModelServiceException(this, String.format("加载系统模型文件[%1$s]发生异常，%2$s",strPath,ex.getMessage()), ex);
				}
				
				IPSSystem t = createIPSSystem();
				psModelObjectMap.put(strPath, (IPSModelObject) t);
				// 初始化
				if (t instanceof IPSModelObjectRuntime) {
					((IPSModelObjectRuntime) t).init(getPSModelService(t.getClass(), t), null, realNode);
				}
				onInit(t, realNode);
				this.iPSSystem = t;
				return t;
			}
		}

		return this.iPSSystem;
	}
	
	protected void onInit(IPSSystem t,ObjectNode realNode){
		
	}
	
	/**
	 * 建立系统模型对象
	 * @return
	 * @throws Exception
	 */
	protected IPSSystem createIPSSystem(){
		return new PSSystemImpl();
	}
	

	public <T> T getPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode, String strTag){
		boolean bModelRef = false;
		JsonNode jv = objNode.get("modelref");
		if (jv != null) {
			bModelRef = jv.asBoolean();
		}

		if (bModelRef) {
			jv = objNode.get("path");
			if (jv != null) {
				String strPath = jv.asText();
				
				return this.getPSModelObject(parentPSModelObject, cls, strPath);

			} else {
				
				// 相对父模型
				if (parentPSModelObject == null) {
					//throw new Exception("父对象无效");
					throw new PSModelServiceException(this, "父对象无效");
				}
				
				//优化处理
				if(cls.equals(IPSDEOPPriv.class)){
					IPSDataEntity iPSDataEntity = this.getParentPSModelObject(parentPSModelObject, IPSDataEntity.class, true);
					if(iPSDataEntity == null) {
						IPSAppDataEntity iPSAppDataEntity = this.getParentPSModelObject(parentPSModelObject, IPSAppDataEntity.class, true);
						if(iPSAppDataEntity!=null) {
							iPSDataEntity = iPSAppDataEntity.getPSDataEntity();
							if(iPSDataEntity == null) {
								return null;
							}
						}
					}
					if(iPSDataEntity!=null) {
						IPSDEOPPriv iPSDEOPPriv = iPSDataEntity.getPSDEOPPriv(objNode,true);
						if(iPSDEOPPriv!=null) {
							return (T)iPSDEOPPriv;
						}
					}
					return (T)this.getPSSystem().getPSSysDEOPPriv(objNode, false);
				}
				if(IPSUIAction.class.isAssignableFrom(cls)) {
				//if(cls.isAssignableFrom(IPSUIAction.class)){
				//	if(cls.equals(IPSUIAction.class)){
					JsonNode jsonNode = objNode.get("getPSAppDataEntity");
					if(jsonNode!=null) {
						IPSApplication iPSApplication = this.getParentPSModelObject(parentPSModelObject, IPSApplication.class, false);
						IPSAppDataEntity iPSAppDataEntity = iPSApplication.getPSAppDataEntity(jsonNode, false);
						return (T) iPSAppDataEntity.getPSAppDEUIAction(objNode, false);
					}
					
					jsonNode = objNode.get("getPSAppWF");
					if(jsonNode!=null) {
						IPSApplication iPSApplication = this.getParentPSModelObject(parentPSModelObject, IPSApplication.class, false);
						IPSAppWF iPSAppWF = iPSApplication.getPSAppWF(jsonNode, false);
						
						jsonNode = objNode.get("getPSAppWFVer");
						if(jsonNode!=null) {
							IPSAppWFVer iPSAppWFVer = iPSAppWF.getPSAppWFVer(jsonNode, false);
							return (T) iPSAppWFVer.getPSAppWFUIAction(objNode, false);
						}
						
						return (T) iPSAppWF.getPSAppWFUIAction(objNode, false);
					}
					
//					if(parentPSModelObject instanceof IPSAppViewUIAction) {
//						IPSAppViewUIAction iPSAppViewUIAction = (IPSAppViewUIAction)parentPSModelObject;
//						if(iPSAppViewUIAction.getPSAppDataEntity()!=null) {
//							return (T)iPSAppViewUIAction.getPSAppDataEntity().getPSAppDEUIAction(objNode, false);
//						}
//						IPSApplication iPSApplication = this.getParentPSModelObject(parentPSModelObject, IPSApplication.class, false);
//						return (T)iPSApplication.getPSAppDEUIAction(objNode, false);
//					}
					IPSApplication iPSApplication = this.getParentPSModelObject(parentPSModelObject, IPSApplication.class, false);
					IPSAppDEUIAction iPSAppDEUIAction = iPSApplication.getPSAppDEUIAction(objNode, true);
					if(iPSAppDEUIAction!=null) {
						return (T)iPSAppDEUIAction;
					}
					
					if("getNextPSUIAction".equals(strTag)
							&& objNode.get("id").asText("").indexOf("@")!=-1) {
						return null;
					}
					//return (T)iPSApplication.getPSAppDEUIAction(objNode, false);
					throw new PSModelServiceException(this, String.format("应用[%1$s]无法获取指定界面行为[%2$s]",iPSApplication.getName(),objNode.get("id").textValue()), iPSApplication);
				}
				
				if(cls.equals(IPSAppUILogic.class)){
					IPSApplication iPSApplication = this.getParentPSModelObject(parentPSModelObject, IPSApplication.class, false);
					return (T)iPSApplication.getPSAppUILogic(objNode, false);
				}
				
				if(cls.equals(IPSAppViewEngine.class)) {
					IPSControlContainer iPSControlContainer = null;
					if(parentPSModelObject instanceof IPSControlContainer) {
						iPSControlContainer = (IPSControlContainer)parentPSModelObject;
					}
					else {
						iPSControlContainer = this.getParentPSModelObject(parentPSModelObject, IPSControlContainer.class, true);
					}
					while(iPSControlContainer!=null) {
						IPSAppViewEngine iPSAppViewEngine = iPSControlContainer.getPSAppViewEngine(objNode, true);
						if(iPSAppViewEngine!=null) {
							return (T)iPSAppViewEngine;
						}
						iPSControlContainer = this.getParentPSModelObject((IPSModelObjectRuntime)iPSControlContainer, IPSControlContainer.class, true);
					}
				}

				if(cls.equals(IPSAppViewLogic.class)) {
					IPSControlContainer iPSControlContainer = null;
					if(parentPSModelObject instanceof IPSControlContainer) {
						iPSControlContainer = (IPSControlContainer)parentPSModelObject;
					}
					else {
						iPSControlContainer = this.getParentPSModelObject(parentPSModelObject, IPSControlContainer.class, true);
					}
					while(iPSControlContainer!=null) {
						IPSAppViewLogic iPSAppViewLogic = iPSControlContainer.getPSAppViewLogic(objNode, true);
						if(iPSAppViewLogic!=null) {
							return (T)iPSAppViewLogic;
						}
						iPSControlContainer = this.getParentPSModelObject((IPSModelObjectRuntime)iPSControlContainer, IPSControlContainer.class, true);
					}
				}
				
				
				if(cls.equals(IPSAppViewUIAction.class)) {
					
					IPSControlContainer iPSControlContainer = null;
					if(parentPSModelObject instanceof IPSControlContainer) {
						iPSControlContainer = (IPSControlContainer)parentPSModelObject;
					}
					else {
						iPSControlContainer = this.getParentPSModelObject(parentPSModelObject, IPSControlContainer.class, true);
					}
					while(iPSControlContainer!=null) {
						IPSAppViewUIAction iPSAppViewUIAction = iPSControlContainer.getPSAppViewUIAction(objNode, true);
						if(iPSAppViewUIAction!=null) {
							return (T)iPSAppViewUIAction;
						}
						iPSControlContainer = this.getParentPSModelObject((IPSModelObjectRuntime)iPSControlContainer, IPSControlContainer.class, true);
					}
					
					if(parentPSModelObject instanceof IPSAppViewUIAction) {
						return (T)parentPSModelObject;
					}
						
				}
				
				if(cls.equals(IPSAppCounterRef.class)) {
					IPSControlContainer iPSControlContainer = null;
					if(parentPSModelObject instanceof IPSControlContainer) {
						iPSControlContainer = (IPSControlContainer)parentPSModelObject;
					}
					else {
						iPSControlContainer = this.getParentPSModelObject(parentPSModelObject, IPSControlContainer.class, true);
					}
					while(iPSControlContainer!=null) {
						IPSAppCounterRef iPSAppCounterRef = iPSControlContainer.getPSAppCounterRef(objNode, true);
						if(iPSAppCounterRef!=null) {
							return (T)iPSAppCounterRef;
						}
						iPSControlContainer = this.getParentPSModelObject((IPSModelObjectRuntime)iPSControlContainer, IPSControlContainer.class, true);
					}
				}
				
				
				if(cls.equals(IPSDEField.class)){
					IPSDataEntity iPSDataEntity = this.getParentPSModelObject(parentPSModelObject, IPSDataEntity.class, false);
					return (T)iPSDataEntity.getPSDEField(objNode,false);
				}
				if(cls.equals(IPSDataEntity.class)){
					IPSAppDataEntity iPSAppDataEntity = this.getParentPSModelObject(parentPSModelObject, IPSAppDataEntity.class, true);
					if(iPSAppDataEntity != null) {
						return (T)iPSAppDataEntity.getPSDataEntityMust();
					}
				}
				if(cls.equals(IPSSysUniRes.class)) {
					return (T)this.getPSSystem().getPSSysUniRes(objNode, false);
				}
				if(cls.equals(IPSWFLink.class)){
					if(parentPSModelObject instanceof IPSWFProcess) {
						IPSWFVersion iPSWFVersion = this.getParentPSModelObject(parentPSModelObject, IPSWFVersion.class, false);
						java.util.List<IPSWFLink> psWFLinks = iPSWFVersion.getPSWFLinks();
						if(psWFLinks!=null) {
							for(IPSWFLink iPSWFLink : psWFLinks) {
								if(iPSWFLink.getFromPSWFProcessMust() == parentPSModelObject) {
									if(iPSWFLink.getId().equals(objNode.get("id").textValue())) {
										return (T)iPSWFLink;
									}
								}
							}
						}
						throw new PSModelServiceException(this,String.format("无法获取指定流程版本连接[%1$s]", objNode.get("id")));
					}
				}
				
				if(IPSDEFormDetail.class.isAssignableFrom(cls)){
					IPSDEForm iPSDEForm = this.getParentPSModelObject(parentPSModelObject, IPSDEForm.class, false);
					String strTag2 = getPSModelTag(cls, objNode);
					IPSDEFormDetail dst = getPSDEFormDetail(iPSDEForm, strTag2);
					if(dst!=null) {
						return (T)dst;
					}
					throw new PSModelServiceException(this,String.format("无法获取指定表单成员[%1$s]", strTag2));
				}
				
				IPSModelObjectRuntime iPSModelObjectRuntime = (IPSModelObjectRuntime) parentPSModelObject;
				return iPSModelObjectRuntime.getChildPSModelObject(cls, objNode, strTag, false);
			}
		} else {
			jv = objNode.get("dynaModelFilePath");
			if(jv!=null) {
				if(cls.equals(IPSDEActionLogic.class)){
					//脏数据
					return null;
				}
			}
			//应用部件将排除
			
			if (jv != null) {
				String strPath = jv.asText();
				//strPath = this.getPSModelFolderPath() + File.separator + strPath;
				IPSModelObject iPSModelObject = psModelObjectMap.get(strPath);
				if (iPSModelObject == null) {
					T t = createPSModelObject(parentPSModelObject, cls, objNode);
					if(!(t instanceof IPSControl)){
						psModelObjectMap.put(strPath, (IPSModelObject) t);
					}
					
					// 初始化
					if (t instanceof IPSModelObjectRuntime) {
						if(!(t instanceof IPSControl)){
							((IPSModelObjectRuntime) t).init(this.getPSModelService(t.getClass(), t), null, objNode);
						}
						else {
							((IPSModelObjectRuntime) t).init(this.getPSModelService(t.getClass(), t), parentPSModelObject, objNode);
						}
					}
					return t;
				}
				return (T) iPSModelObject;
			} else {
				T t = createPSModelObject(parentPSModelObject, cls, objNode);
				if (t instanceof IPSModelObjectRuntime) {
					((IPSModelObjectRuntime) t).init(this.getPSModelService(t.getClass(), t), parentPSModelObject, objNode);
				}
				return t;
			}
		}
	}
	
	protected IPSDEFormDetail getPSDEFormDetail(IPSDEForm iPSDEForm,String strTag) {
		if(iPSDEForm.getPSDEFormPages()!=null) {
			for(IPSDEFormDetail item : iPSDEForm.getPSDEFormPages() ) {
				IPSDEFormDetail dst = getPSDEFormDetail(item, strTag);
				if(dst!=null) {
					return dst;
				}
			}
		}
		return null;
	}
	
	protected IPSDEFormDetail getPSDEFormDetail(IPSDEFormDetail parentFormDetail,String strTag) {
		if(strTag.equals(parentFormDetail.getId())){
			return parentFormDetail;
		}
		
		if(parentFormDetail instanceof IPSDEFormGroupBase) {
			IPSDEFormGroupBase iPSDEFormGroupBase = (IPSDEFormGroupBase)parentFormDetail;
			if(iPSDEFormGroupBase.getPSDEFormDetails()!=null) {
				for(IPSDEFormDetail item : iPSDEFormGroupBase.getPSDEFormDetails() ) {
					IPSDEFormDetail dst = getPSDEFormDetail(item, strTag);
					if(dst!=null) {
						return dst;
					}
				}
			}
		}
		if(parentFormDetail instanceof IPSDEFormTabPanel) {
			IPSDEFormTabPanel iPSDEFormTabPanel = (IPSDEFormTabPanel)parentFormDetail;
			if(iPSDEFormTabPanel.getPSDEFormTabPages()!=null) {
				for(IPSDEFormDetail item : iPSDEFormTabPanel.getPSDEFormTabPages() ) {
					IPSDEFormDetail dst = getPSDEFormDetail(item, strTag);
					if(dst!=null) {
						return dst;
					}
				}
			}
		}
		return null;
	}
	
	protected IPSPanelItem getPSPanelItem(IPSPanelItem parentPanelItem,String strTag) {
		if(strTag.equals(parentPanelItem.getId())){
			return parentPanelItem;
		}
		
		if(parentPanelItem instanceof IPSSysPanelContainer) {
			IPSSysPanelContainer iPSSysPanelContainer = (IPSSysPanelContainer)parentPanelItem;
			if(iPSSysPanelContainer.getPSPanelItems()!=null) {
				for(IPSPanelItem item : iPSSysPanelContainer.getPSPanelItems() ) {
					IPSPanelItem dst = getPSPanelItem(item, strTag);
					if(dst!=null) {
						return dst;
					}
				}
			}
		}
		if(parentPanelItem instanceof IPSPanelTabPanel) {
			IPSPanelTabPanel iPSPanelTabPanel = (IPSPanelTabPanel)parentPanelItem;
			if(iPSPanelTabPanel.getPSPanelTabPages()!=null) {
				for(IPSPanelTabPage item : iPSPanelTabPanel.getPSPanelTabPages() ) {
					IPSPanelItem dst = getPSPanelItem(item, strTag);
					if(dst!=null) {
						return dst;
					}
				}
			}
		}
		return null;
	}
	

	public <T> T createPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		return onCreatePSModelObject(parentPSModelObject, cls, objNode);
	}

	protected <T> T onCreatePSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode) {
		return null;
	}

	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, java.util.List<T> list, Object objKey, boolean bTryMode) {
		if (list == null || objKey == null) {
			if (!bTryMode) {
				if (objKey != null) {
					String strTag = getPSModelTag(cls, objKey);
					throw new PSModelServiceException(this, String.format("无法获取指定模型[%1$s]，标识为[%2$s]", cls.getSimpleName(), strTag), relatedPSModelObject);
				}
				throw new PSModelServiceException(this, String.format("无法获取指定模型[%1$s]，没有指定标识", cls.getSimpleName()), relatedPSModelObject);
			}
			return null;
		}
		String strTag = getPSModelTag(cls, objKey);
		for (T t : list) {
			if (testPSModel(cls, t, strTag, objKey)) {
				return t;
			}
		}
		if (!bTryMode) {
			throw new PSModelServiceException(this, String.format("无法获取指定模型[%1$s]，标识为[%2$s]", cls.getSimpleName(), strTag), relatedPSModelObject);
		}
		return null;
	}

	protected <T> boolean testPSModel(Class<T> cls, T t, String strTag, Object objKey){
		IPSModelObjectRuntime iPSModelObjectRuntime = (IPSModelObjectRuntime) t;
		String strModelTag = iPSModelObjectRuntime.getDynaModelFilePath();
		
		if(t instanceof IPSControl) {
			if(strTag.equals(((IPSControl)t).getName())) {
				return true;
			}
		}
		
		boolean bUniqueKey = strTag.length() == 32;
		if (StringUtils.hasLength(strModelTag)) {
			if(strModelTag.equals(strTag)) {
				return true;
			}
			else
				if(bUniqueKey) {
					return genMD5Ex(strModelTag).equals(strTag);
				}
			return false;
		}
		
		strModelTag = iPSModelObjectRuntime.getId();
		if (StringUtils.hasLength(strModelTag)) {
			//return strModelTag.equals(strTag);
			if(strModelTag.equals(strTag)) {
				return true;
			}
			else
				if(bUniqueKey) {
					return genMD5Ex(strModelTag).equals(strTag);
				}
			return false;
		}

		strModelTag = iPSModelObjectRuntime.getCodeName();
		if (StringUtils.hasLength(strModelTag)) {
			return strModelTag.equals(strTag);
		}

		strModelTag = iPSModelObjectRuntime.getName();
		if (StringUtils.hasLength(strModelTag)) {
			return strModelTag.equals(strTag);
		}

		throw new PSModelServiceException(this, String.format("无法计算模型[%1$s][%2$s]标识", cls.getSimpleName(), t));
	}

	protected <T> String getPSModelTag(Class<T> cls, Object objKey){
		if (objKey instanceof String) {
			return (String) objKey;
		}

		if (objKey instanceof ObjectNode) {
			ObjectNode objectNode = (ObjectNode) objKey;
			if (PSObjectImplBase.getBoolean(objectNode, "modelref", false)) {
				String strTag = PSObjectImplBase.getString(objectNode, "path", null);
				if (!StringUtils.hasLength(strTag)) {
					strTag = PSObjectImplBase.getString(objectNode, "id", null);
					if (!StringUtils.hasLength(strTag)) {
						throw new PSModelServiceException(this, String.format("无法计算模型[%1$s]标识", cls.getSimpleName()));
					}
				}
				return strTag;
			} else {
				String strTag = PSObjectImplBase.getString(objectNode, "dynaModelFilePath", null);
				if (StringUtils.hasLength(strTag)) {
					return strTag;
				}
				strTag = PSObjectImplBase.getString(objectNode, "codeName", null);
				if (StringUtils.hasLength(strTag)) {
					return strTag;
				}
				strTag = PSObjectImplBase.getString(objectNode, "name", null);
				if (StringUtils.hasLength(strTag)) {
					return strTag;
				}
				throw new PSModelServiceException(this, String.format("无法计算模型[%1$s]标识", cls.getSimpleName()));
			}
		}

		throw new PSModelServiceException(this, String.format("无法计算模型[%1$s]标识", cls.getSimpleName()));
	}

	protected IPSModelService getPSModelService(Class<?> cls, Object objPSModel){

		IPSModelService iPSModelService = psModelServiceMap.get(cls);
		if (iPSModelService == null) {
			IPSModelServiceProxy iPSModelServiceProxy = createPSModelServiceProxy(cls, objPSModel);
			if (iPSModelServiceProxy != null) {
				iPSModelServiceProxy.init(this, null);
				psModelServiceMap.put(cls, iPSModelServiceProxy);
				return iPSModelServiceProxy;
			}
			psModelServiceMap.put(cls, this);
			return this;
		}

		return iPSModelService;
	}

	protected IPSModelServiceProxy createPSModelServiceProxy(Class<?> cls, Object objPSModel){
		return null;
	}

	@Override
	public ObjectNode getRealObjectNode(ObjectNode objectNode){
		return objectNode;
	}

	@Override
	public <T> T getChildPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag, boolean bTryMode){
		if (bTryMode) {
			return null;
		}
		throw new PSModelServiceException(this, String.format("无法从模型[%1$s]获取指定类型[%2$s]子模型，标识为[%3$s]", relatedPSModelObject, cls, objNode) ,relatedPSModelObject);
	}
	
	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, boolean bTryMode){
		if (cls.isAssignableFrom(relatedPSModelObject.getClass())) {
			return (T) relatedPSModelObject;
		}
		return getParentPSModelObject(relatedPSModelObject, cls, bTryMode);
	}

	@Override
	public <T> T getParentPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, boolean bTryMode){
		if (cls.equals(IPSSystem.class)) {
			return (T) this.getPSSystem();
		}

		T t = getParentPSModelObject(relatedPSModelObject, cls);
		if( t == null) {
			if(IPSApplication.class.equals(cls)) {
				if(relatedPSModelObject instanceof IPSApplication) {
					return (T)relatedPSModelObject;
				}
//				IPSAppDataEntity iPSAppDataEntity = this.getParentPSModelObject(relatedPSModelObject, IPSAppDataEntity.class, true);
//				if(iPSAppDataEntity!=null) {
//					return (T)iPSAppDataEntity.getParentPSModelObject();
//				}
				String strFilePath = getFirstPSModelFilePath(relatedPSModelObject);
				if(StringUtils.hasLength(strFilePath)) {
					int nPos = strFilePath.indexOf("PSSYSAPPS/");
					if(nPos != -1) {
						int nPos2 = strFilePath.indexOf("/", nPos + "PSSYSAPPS/".length());
						if(nPos2!=-1) {
							strFilePath = strFilePath.substring(0,nPos2) + "/PSSYSAPP.json";
							t = (T)this.getCachePSModelObject(strFilePath);
						}
					}
				}
			}
			else
				if(IPSDataEntity.class.equals(cls)) {
					if(relatedPSModelObject instanceof IPSDataEntity) {
						return (T)relatedPSModelObject;
					}
					IPSAppDataEntity iPSAppDataEntity = this.getParentPSModelObject(relatedPSModelObject, IPSAppDataEntity.class, true);
					if(iPSAppDataEntity!=null) {
						return (T)iPSAppDataEntity.getPSDataEntity();
					}
					
					String strFilePath = getFirstPSModelFilePath(relatedPSModelObject);
					if(StringUtils.hasLength(strFilePath)) {
						int nPos = strFilePath.indexOf("PSDATAENTITIES/");
						if(nPos != -1) {
							int nPos2 = strFilePath.indexOf("/", nPos + "PSDATAENTITIES/".length());
							if(nPos2!=-1) {
								strFilePath = strFilePath.substring(0,nPos2) + ".json";
								t = (T)this.getCachePSModelObject(strFilePath);
							}
						}
					}
				}
				else
					if(IPSWorkflow.class.equals(cls)) {
							if(relatedPSModelObject instanceof IPSWorkflow) {
								return (T)relatedPSModelObject;
							}
							
							String strFilePath = getFirstPSModelFilePath(relatedPSModelObject);
							if(StringUtils.hasLength(strFilePath)) {
								int nPos = strFilePath.indexOf("PSWORKFLOWS/");
								if(nPos != -1) {
									int nPos2 = strFilePath.indexOf("/", nPos + "PSWORKFLOWS/".length());
									if(nPos2!=-1) {
										strFilePath = strFilePath.substring(0,nPos2) + ".json";
										t = (T)this.getCachePSModelObject(strFilePath);
									}
								}
							}
						}
					else
						if(IPSAppDataEntity.class.equals(cls)) {
							if(relatedPSModelObject instanceof IPSAppDataEntity) {
								return (T)relatedPSModelObject;
							}
							if(relatedPSModelObject instanceof IPSControl) {
								return (T)((IPSControl)relatedPSModelObject).getPSAppDataEntity();
							}
							if(relatedPSModelObject instanceof IPSAppView) {
								return (T)((IPSAppView)relatedPSModelObject).getPSAppDataEntity();
							}
							IPSControl iPSControl = this.getParentPSModelObject(relatedPSModelObject, IPSControl.class, true);
							if(iPSControl!=null) {
								return (T)iPSControl.getPSAppDataEntity();
							}
							IPSAppView iPSAppView = this.getParentPSModelObject(relatedPSModelObject, IPSAppView.class, true);
							if(iPSAppView!=null) {
								return (T)iPSAppView.getPSAppDataEntity();
							}
						}
						else
							if(IPSDEServiceAPI.class.equals(cls)) {
							IPSDEServiceAPIRS iPSDEServiceAPIRS = this.getParentPSModelObject(relatedPSModelObject, IPSDEServiceAPIRS.class, true);
							if(iPSDEServiceAPIRS!=null) {
								return (T)iPSDEServiceAPIRS.getMinorPSDEServiceAPI();
							}
							if(relatedPSModelObject instanceof IPSDEServiceAPIMethod) {
								if(relatedPSModelObject.getParentPSModelObject() instanceof IPSDEServiceAPIRS) {
									t = (T) ((IPSDEServiceAPIRS)relatedPSModelObject.getParentPSModelObject()).getMinorPSDEServiceAPI();
								}
							}
					}
						
		}
		
		if (t != null || bTryMode) {
			return t;
		}
		throw new PSModelServiceException(this, String.format("无法从模型[%1$s]获取指定类型[%2$s]父模型", relatedPSModelObject, cls), relatedPSModelObject);
	}

	public <T> T getParentPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls){

		if (relatedPSModelObject.getParentPSModelObject() != null) {
			if (cls.isAssignableFrom(relatedPSModelObject.getParentPSModelObject().getClass())) {
				return (T) relatedPSModelObject.getParentPSModelObject();
			}
			return getParentPSModelObject(relatedPSModelObject.getParentPSModelObject(), cls);
		}
		return null;
	}

	public String getFirstPSModelFilePath(IPSModelObjectRuntime relatedPSModelObject){

		String strFilePath = relatedPSModelObject.getDynaModelFilePath();
		if(StringUtils.hasLength(strFilePath)) {
			return strFilePath;
		}
		
		if (relatedPSModelObject.getParentPSModelObject() != null) {
			return getFirstPSModelFilePath(relatedPSModelObject.getParentPSModelObject());
		}
		return null;
	}
	
	
	/**
	 * 获取指定路径的JSON对象
	 * @param strPath
	 * @return
	 * @throws Exception
	 */
	protected ObjectNode getObjectNode(String strPath) throws Exception{
		
		if(this.isModelFromHttp()) {
			String strFullModelPath = this.getPSModelFolderPath() + "/" + strPath.replace("\\", "/");
			
			long nTime = System.currentTimeMillis();
			URL remoteUrl = new URL(strFullModelPath);
			
			ObjectNode objNode =  (ObjectNode) MAPPER.readTree(remoteUrl.openStream());
			
			log.debug(String.format("获取远程资源[%1$s]耗时[%2$s]",strFullModelPath,System.currentTimeMillis() - nTime));
			
			return objNode;
			
		}
		else {
			String strFullModelPath = this.getPSModelFolderPath() + File.separator + strPath;
			return  (ObjectNode) MAPPER.readTree(new File(strFullModelPath));
		}
		
	}
	
	public String getRawContent(String strPath, boolean bTryMode) throws Exception{
		if(this.isModelFromHttp()) {
//			String strFullModelPath = this.getPSModelFolderPath() + "/" + strPath.replace("\\", "/");
//			
//			long nTime = System.currentTimeMillis();
//			URL remoteUrl = new URL(strFullModelPath);
//			
//			ObjectNode objNode =  (ObjectNode) MAPPER.readTree(remoteUrl.openStream());
//			
//			log.debug(String.format("获取远程资源[%1$s]耗时[%2$s]",strFullModelPath,System.currentTimeMillis() - nTime));
//			
//			return objNode;
			throw new Exception("不支持从远程路径直接获取内容");
		}
		else {
			String strFullModelPath = this.getPSModelFolderPath() + File.separator + strPath;
			File file = new File(strFullModelPath);
			if(file.exists()) {
				return FileUtils.readFileToString(file, "UTF-8");
			}
			
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("指定文件[%1$s]不存在", strFullModelPath));
			//return  (ObjectNode) MAPPER.readTree(new File(strFullModelPath));
		}
	}
	
	
	/**
	 * 判断指定路径是否存在
	 * @param strPath
	 * @return
	 */
	protected boolean containsObjectNode(String strPath) {
		
		if(this.isModelFromHttp()) {
			String strFullModelPath = this.getPSModelFolderPath() + "/" + strPath.replace("\\", "/");
			try {
				long nTime = System.currentTimeMillis();
				
				URL remoteUrl = new URL(strFullModelPath);
			    HttpURLConnection urlcon = (HttpURLConnection) remoteUrl.openConnection();
			    String message = urlcon.getHeaderField(0);
			    
			    log.debug(String.format("判断远程资源是否存在[%1$s]耗时[%2$s]",strFullModelPath,System.currentTimeMillis() - nTime));
			    
			    
			   if (StringUtils.hasText(message) && message.startsWith("HTTP/1.1 200")) {
			    	return true;
			    }
		    	return false;
			}
			catch(Exception ex) {
				log.error(String.format("判断资源文件[%1$s]是否存在发生异常，%2$s",strFullModelPath,ex.getMessage()),ex);
				return false;
			}
		}
		else {
			String strFullModelPath = this.getPSModelFolderPath() + File.separator + strPath;
			return (new File(strFullModelPath)).exists();
		}
	}
	
	
	/**
	 * 获取指定路径的模型对象
	 * @param parentPSModelObject
	 * @param cls
	 * @param strModelPath
	 * @return
	 * @throws Exception
	 */
	protected <T> T getPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, String strModelPath) {
		
		IPSModelObject iPSModelObject = psModelObjectMap.get(strModelPath);
		if (iPSModelObject == null) {
			
			ObjectNode realNode = null;
			try {
				realNode = getObjectNode(strModelPath);
			}
			catch(Exception ex) {
				log.error(String.format("加载模型文件[%1$s]发生异常，%2$s",strModelPath,ex.getMessage()),ex);
				throw new PSModelServiceException(this, String.format("加载资源文件[%1$s]发生异常，%2$s",strModelPath,ex.getMessage()), ex);
			}
			
			if(cls.getSimpleName().equals("IPSCodeList")) {
				if(strModelPath.indexOf("PSSYSAPPS/") == 0) {
					IPSAppCodeList t = createPSModelObject(parentPSModelObject, IPSAppCodeList.class, realNode);
					psModelObjectMap.put(strModelPath, (IPSModelObject) t);
					if (t instanceof IPSModelObjectRuntime) {
						((IPSModelObjectRuntime) t).init(this.getPSModelService(t.getClass(), t), parentPSModelObject, realNode);
					}
					return (T)t;
				}
			}
			
			T t = createPSModelObject(parentPSModelObject, cls, realNode);
			if(!(t instanceof IPSControl)) {
				psModelObjectMap.put(strModelPath, (IPSModelObject) t);
			}
			
			// 初始化
			if (t instanceof IPSModelObjectRuntime) {
				if(!(t instanceof IPSControl)) {
					((IPSModelObjectRuntime) t).init(this.getPSModelService(t.getClass(), t), null, realNode);
				}
				else {
					((IPSModelObjectRuntime) t).init(this.getPSModelService(t.getClass(), t), parentPSModelObject, realNode);
				}
				
			}
			return t;
		}
		return (T)iPSModelObject;
	}
	
	
	/**
	 * 获取缓存的模型对象
	 * @param strModelPath
	 * @return
	 */
	protected IPSModelObject getCachePSModelObject(String strModelPath) {
		return psModelObjectMap.get(strModelPath);
	}
	
	
	protected void setCachePSModelObject(String strModelPath, IPSModelObject iPSModelObject) {
		this.psModelObjectMap.put(strModelPath, iPSModelObject);
	}
	
	
	protected boolean isModelFromHttp() {
		return this.bHttpMode;
	}
	
	
	/**
	 * 获取指定文本的MD5字符串
	 * 
	 * @param text
	 * @return
	 */
	final public static String genMD5Ex(String text) {
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("MD5");
			byte[] md5hash = new byte[32];
			md.update(text.getBytes("utf-8"));
			md5hash = md.digest();
			return convertToHex(md5hash);
		} catch (Exception ex) {
			return "";
		}
	}
	
	final private static String convertToHex(byte[] data) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			int halfbyte = (data[i] >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))
					buf.append((char) ('0' + halfbyte));
				else
					buf.append((char) ('a' + (halfbyte - 10)));
				halfbyte = data[i] & 0x0F;
			} while (two_halfs++ < 1);
		}
		return buf.toString();
	}
}
