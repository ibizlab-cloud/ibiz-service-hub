package net.ibizsys.central.plugin.extension.psmodel.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSetting;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums.AppMode;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.util.DataTypes;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

public class ExtensionUtils {

	/**
     * 属性: ID
     */
    public final static String FIELD_SCOPE_ID = "id";
    
    
    /**
     * 属性: 扩展作用范围类型
     */
    public final static String FIELD_SCOPE_TYPE = "scope_type";

    /**
     * 属性: 范围标记
     */
    public final static String FIELD_SCOPE_TAG = "scope_tag";

    /**
     * 属性: 范围标记2
     */
    public final static String FIELD_SCOPE_TAG2 = "scope_tag2";

    /**
     * 属性: 范围标记3
     */
    public final static String FIELD_SCOPE_TAG3 = "scope_tag3";

    /**
     * 属性: 范围标记4
     */
    public final static String FIELD_SCOPE_TAG4 = "scope_tag4";
    
    
    /**
     * 属性: 待定扩展模型
     */
    public final static String FIELD_PENDING_EXTENSION_MODEL="pending_extension_model";

    /**
     * 属性: 运行时模型
     */
    public final static String FIELD_RUNTIME_MODEL="runtime_model";
    
    
    /**
     * 属性: 扩展模型
     */
    public final static String FIELD_EXTENSION_MODEL="extension_model";
    
    
    /**
     * 属性: 应用状态
     */
    public final static String FIELD_APPLY_FLAG = "apply_flag";
    
    
    /**
     * 属性: 动态实例标识
     */
    public final static String FIELD_PSDYNAINSTID= "psdynainstid";
    
    
    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 系统扩展标识
     */
    public final static String FIELD_SYSTEM_EXTENSION_ID = "system_extension_id";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";
    
    /**
     * 属性: 启用
     */
    public final static String FIELD_VALID_FLAG = "valid_flag";
    
    /**
     * 动态实例预置标识：父标识
     */
    public final static String DYNAINSTID_PARENT= "_PARENT_";
    
    
    static Map<String, Integer> SystemExtensionScopeTypeMap = new LinkedHashMap<String, Integer>();
    static {
    	SystemExtensionScopeTypeMap.put(V2SystemExtensionScopeType.SYSTEM.value, 100);
    	SystemExtensionScopeTypeMap.put(V2SystemExtensionScopeType.MODELGROUP.value, 200);
    	
    	SystemExtensionScopeTypeMap.put(V2SystemExtensionScopeType.MODULE.value, 300);
    	SystemExtensionScopeTypeMap.put(V2SystemExtensionScopeType.DATAENTITY.value, 400);
    	SystemExtensionScopeTypeMap.put(V2SystemExtensionScopeType.DATA.value, 500);
    }
    
    
    public static <T extends IPSModel> List<T> replacePSModelList(List<T> srcPSModelList, List<T> replacePSModelList, Class<T> psModelCls) throws Exception{
    	if(replacePSModelList == null) {
    		return srcPSModelList;
    	}
    	if(srcPSModelList == null) {
    		return replacePSModelList;
    	}
    	
    	Map<String, T> psModelMap = new LinkedHashMap<String, T>();
    	
    	for(T srcPSModel : srcPSModelList) {
    		if(!StringUtils.hasLength(srcPSModel.getId())) {
    			continue;
    		}
    		psModelMap.put(srcPSModel.getId(), srcPSModel);
    	}
    	
    	for(T replacePSModel : replacePSModelList) {
    		if(!StringUtils.hasLength(replacePSModel.getId())) {
    			continue;
    		}
    		psModelMap.put(replacePSModel.getId(), replacePSModel);
    	}
    	
    	List<T> list = new ArrayList<T>();
    	list.addAll(psModelMap.values());
    	return list;
    }
    
    
    public static <T extends IPSModel> List<T> toPSModelList(List<? extends IEntity> extensionEntityList, String strPSModelTagField, Class<T> psModelCls) throws Exception{
    	return toPSModelList(extensionEntityList, strPSModelTagField, psModelCls, null);
    }
    
	
	public static <T extends IPSModel> List<T> toPSModelList(List<? extends IEntity> extensionEntityList, String strPSModelTagField, Class<T> psModelCls, Object data) throws Exception{
		if(ObjectUtils.isEmpty(extensionEntityList)) {
			return null;
		}
		
		java.util.Map<String, IEntity> extensionEntityMap = new LinkedHashMap<String, IEntity>();
		for(IEntity extensionEntity : extensionEntityList) {
			String strPSModelTag = DataTypeUtils.getStringValue(extensionEntity.get(strPSModelTagField), null);
			if(!StringUtils.hasLength(strPSModelTag)) {
				continue;
			}
			
			String strPSModelModel = DataTypeUtils.getStringValue(extensionEntity.get(FIELD_PENDING_EXTENSION_MODEL), null);
			if(!StringUtils.hasLength(strPSModelModel)) {
				 strPSModelModel = DataTypeUtils.getStringValue(extensionEntity.get(FIELD_EXTENSION_MODEL), null);
				 if(!StringUtils.hasLength(strPSModelModel)) {
					 continue;
				 }
				
			}
			
			
			IEntity lastEntity = extensionEntityMap.get(strPSModelTag);
			if(lastEntity != null) {
				if(replaceExtension(extensionEntity, lastEntity, data)) {
					extensionEntityMap.put(strPSModelTag, extensionEntity);
				}
			}
			else {
				extensionEntityMap.put(strPSModelTag, extensionEntity);
			}
		}
		
		List<T> list = new ArrayList<T>();
		for(IEntity extensionEntity : extensionEntityMap.values()) {
			String strPSModelTag = DataTypeUtils.getStringValue(extensionEntity.get(strPSModelTagField), null);
			if(!StringUtils.hasLength(strPSModelTag)) {
				continue;
			}
			
			String strPSModelModel = DataTypeUtils.getStringValue(extensionEntity.get(FIELD_PENDING_EXTENSION_MODEL), null);
			if(!StringUtils.hasLength(strPSModelModel)) {
				strPSModelModel = DataTypeUtils.getStringValue(extensionEntity.get(FIELD_EXTENSION_MODEL), null);
				if(!StringUtils.hasLength(strPSModelModel)) {
					continue;
				}
			}
			
			T t = JsonUtils.as(strPSModelModel, psModelCls);
			t.setId(strPSModelTag);
			t.set("dynamodelflag", 1);
			t.set("psdynainstid", extensionEntity.get(FIELD_SCOPE_ID));
			t.set("psdynainsttype", extensionEntity.get(FIELD_SCOPE_TYPE));
			t.set("createman", extensionEntity.get(FIELD_CREATE_MAN));
			t.set("updateman", extensionEntity.get(FIELD_UPDATE_MAN));
			t.set("createdate", extensionEntity.get(FIELD_CREATE_TIME));
			t.set("updatedate", extensionEntity.get(FIELD_UPDATE_TIME));
			
			t.set("applyflag", DataTypeUtils.getIntegerValue(extensionEntity.get(FIELD_APPLY_FLAG), 0));
			
			//设置启用标记
			
			t.set("validflag", DataTypeUtils.getIntegerValue(extensionEntity.get(FIELD_VALID_FLAG), 1));
			
			list.add(t);
		}
		return list;
	}
	
	public static boolean replaceExtension(IEntity curEntity, IEntity lastEntity, Object data) {
		String strCurScopeType = DataTypeUtils.getStringValue(curEntity.get(FIELD_SCOPE_TYPE), V2SystemExtensionScopeType.SYSTEM.value);
		String strLastScopeType = DataTypeUtils.getStringValue(lastEntity.get(FIELD_SCOPE_TYPE), V2SystemExtensionScopeType.SYSTEM.value);
	
		Integer nCurScopeLevel = SystemExtensionScopeTypeMap.get(strCurScopeType);
		Integer nLastScopeLevel = SystemExtensionScopeTypeMap.get(strLastScopeType);
		
		return DataTypeUtils.compare(DataTypes.INT, nCurScopeLevel, nLastScopeLevel) >0;
	}
	
	public static String toExtensionModel(IPSModel iPSModel) {
		
		Map map = JsonUtils.as(iPSModel, Map.class);
		map.remove("dynamodelflag");
		map.remove("psdynainstid");
		map.remove("psdynainsttype");
		map.remove("applyflag");
		return JsonUtils.toString(map);
	}
	
	
	public static void notifySystemExtensionChanged(String strSystemExtensionId, String strInfo) {
		String strSystemExtensionConfigId = String.format("%1$s%2$s", NacosServiceHubSetting.DATAID_SYSTEMEXTENSION_PREFIX, strSystemExtensionId);
		if(!StringUtils.hasLength(strInfo)) {
			strInfo = String.format("#%1$s", DateUtils.getCurTimeString2());
		}
		ServiceHub.getInstance().publishConfig(strSystemExtensionConfigId, strInfo);
		return;
	}
	
	
	public static String getApplyPSDynaInstId(IPSModel iPSModel, boolean bTryMode) throws Exception{
		String strPSDynaInstId = (String)iPSModel.get("psdynainstid");
		if(!StringUtils.hasLength(strPSDynaInstId)){
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("无法应用默认实例模型")); 
		}
		
		if(DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			if(bTryMode) {
				return null;
			}
			throw new Exception(String.format("无法应用父实例模型")); 
		}
		
		return strPSDynaInstId;
	}
	
	public static boolean compareExtensions(Map<String, ? extends IEntity> curData, Map<String,  ? extends IEntity> lastData) {
		if(ObjectUtils.isEmpty(curData) && ObjectUtils.isEmpty(lastData)) {
			return true;
		}
		
		if(ObjectUtils.isEmpty(curData) || ObjectUtils.isEmpty(lastData)) {
			return false;
		}
		
		if(curData.size() != lastData.size()) {
			return false;
		}
		
		for(java.util.Map.Entry<String,  ? extends IEntity> entry : curData.entrySet()) {
			IEntity lastItem = lastData.get(entry.getKey());
			if(lastItem == null) {
				return false;
			}
			
			String curModel =  DataTypeUtils.getStringValue(entry.getValue().get(FIELD_RUNTIME_MODEL), null);
			String lastModel =  DataTypeUtils.getStringValue(lastItem.get(FIELD_RUNTIME_MODEL), null);
			if(DataTypeUtils.compare(curModel, lastModel)!=0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static IPSApplication getPSApplicationByDataEntityTag(IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession, IPSSystem iPSSystem, String strDataEntityTag, boolean bMobFlag, boolean bTryMode) throws Exception{
		
		IPSApplication iPSApplication = null;
		List<IPSApplication> psApplications = iPSSystem.getAllPSApps();
		if(!ObjectUtils.isEmpty(psApplications)) {
			for(IPSApplication item : psApplications) {
				if(item.isMobileApp() != bMobFlag) {
					continue;
				}
				
				//判断是否包含指定实体标记
				List<IPSAppDataEntity> psAppDataEntities = item.getAllPSAppDataEntities();
				if(ObjectUtils.isEmpty(psAppDataEntities)) {
					continue;
				}
				
				for(IPSAppDataEntity iPSAppDataEntity : psAppDataEntities) {
					
					String strTag = iExtensionPSModelRTServiceSession.getPSModelUniqueTag(iPSAppDataEntity.getPSDataEntityMust());
					if(!strDataEntityTag.equalsIgnoreCase(strTag)) {
						continue;
					}
					
					if(StringUtils.hasLength(item.getAppMode())) {
						if(AppMode.CLOUDHUBAPP.value.equals(item.getAppMode())
								|| AppMode.CLOUDHUBSUBAPP.value.equals(item.getAppMode())) {
							return item;
						}
					}
					
					iPSApplication = item;
					break;
				}
			}
		}
		
		if(iPSApplication != null || bTryMode) {
			return iPSApplication;
		}
		
		throw new Exception(String.format("无法获取承载指定实体[%1$s]的应用[%2$s]", strDataEntityTag, bMobFlag));
	}
	
	public static IPSApplication getPSApplication(IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession, IPSSystem iPSSystem, String strAppTag, boolean bTryMode) throws Exception{
		return getPSApplication(iExtensionPSModelRTServiceSession, iPSSystem, strAppTag, false, bTryMode);
	}
	
	public static IPSApplication getPSApplication(IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession, IPSSystem iPSSystem, String strAppTag, boolean bExtension, boolean bTryMode) throws Exception{
		List<IPSApplication> psApplications = iPSSystem.getAllPSApps();
		if(!ObjectUtils.isEmpty(psApplications)) {
			for(IPSApplication item : psApplications) {
				if(strAppTag.equalsIgnoreCase(item.getCodeName())) {
					return item;
				}
			}
		}
		
		if(bExtension && iExtensionPSModelRTServiceSession.getSystemRuntime() instanceof IServiceSystemRuntime){
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iExtensionPSModelRTServiceSession.getSystemRuntime();
			Collection<IExtensionSysRefRuntime> extensionSysRefRuntimeList = iServiceSystemRuntime.getExtensionSysRefRuntimes(true);
			if(!ObjectUtils.isEmpty(extensionSysRefRuntimeList)) {
				for(IExtensionSysRefRuntime iExtensionSysRefRuntime : extensionSysRefRuntimeList) {
					IPSApplication iPSApplication = iExtensionSysRefRuntime.getPSApplication(strAppTag, true);
					if(iPSApplication != null) {
						return iPSApplication;
					}
				}
			}
		}
		
		
		if (bTryMode) {
			return null;
		}		
		
		throw new Exception(String.format("无法获取指定应用[%1$s]", strAppTag));
	}

	public static <T extends IPSModelObject> T getPSModelObject(IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession, Class<T> cls, List<T> list, String strTag, boolean bTryMode) throws Exception {
		if(cls.equals(IPSDataEntity.class)) {
			if(strTag.indexOf("@") != -1) {
				strTag = strTag.split("[@]")[1];
			}
		}
		if (list != null) {
			for (T item : list) {
				String strFullTag = iExtensionPSModelRTServiceSession.getPSModelUniqueTag(item);
				if (StringUtils.hasLength(strFullTag) && strFullTag.equalsIgnoreCase(strTag)) {
					return item;
				}
			}
		}
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定模型对象[%1$s]", strTag));
	}
	
	public static IPSAppDataEntity getPSAppDataEntity(IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession, IPSApplication iPSApplication, IPSDataEntity iPSDataEntity, boolean bTryMode) throws Exception{
		List<IPSAppDataEntity> psAppDataEntityList = iPSApplication.getAllPSAppDataEntities();
		if(!ObjectUtils.isEmpty(psAppDataEntityList)) {
			for(IPSAppDataEntity iPSAppDataEntity : psAppDataEntityList) {
				if(iPSDataEntity.getId().equals(iPSAppDataEntity.getPSDataEntityMust().getId())) {
					return iPSAppDataEntity;
				}
			}
		}
		
		if (bTryMode) {
			return null;
		}		
		
		throw new Exception(String.format("无法获取指定应用实体[%1$s]", iPSDataEntity.getName()));
	}
	
	/**
	 * 替换应用相关运行时模型
	 * @param strRuntimeModel
	 * @param iPSApplication
	 * @param bToAny
	 * @return
	 * @throws Exception
	 */
	public static String replaceRuntimeModel(String strRuntimeModel, IPSApplication iPSApplication, boolean bToAny) throws Exception{
		String strAppContent = String.format("\"PSSYSAPPS/%1$s/", iPSApplication.getCodeName());
		String strReplaceContent = String.format("\"PSSYSAPPS/%1$s/", "__REPLACE-APPCODENAME__");
		if(bToAny) {
			return strRuntimeModel.replace(strAppContent, strReplaceContent);
		}
		else {
			return strRuntimeModel.replace(strReplaceContent, strAppContent);
		}
	}
}
