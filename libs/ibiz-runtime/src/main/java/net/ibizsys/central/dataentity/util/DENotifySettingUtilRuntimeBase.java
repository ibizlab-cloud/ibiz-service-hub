package net.ibizsys.central.dataentity.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.res.ISysDEUniStateRuntime;
import net.ibizsys.central.sysutil.ISysUniStateListener;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DENotifySettingUtilRuntimeBase extends DEUtilRuntimeBase implements IDENotifySettingUtilRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DENotifySettingUtilRuntimeBase.class);

	private Map<String, Map<String, Integer>> notitySettingMapMap = new ConcurrentHashMap<String, Map<String,Integer>>();
	//private Map<String, Map<String, Integer>> notitySettingMapMap = new ConcurrentHashMap<String, Map<String,Integer>>();
	
	
	private IDataEntityRuntime settingDataEntityRuntime = null;
	private ISysDEUniStateRuntime settingSysDEUniStateRuntime = null;
	
	
	private IPSDEDataSet settingPSDEDataSet = null;
	private IPSDEField settingSystemTagPSDEField = null;
	private IPSDEField settingOwnerTypePSDEField = null;
	private IPSDEField settingOwnerIdPSDEField = null;
	private IPSDEField settingModelPSDEField = null;
	private Map<String, ISysUniStateListener> sysUniStateListenerMap = new ConcurrentHashMap<String, ISysUniStateListener>();
	private Map<String, Map<String, Object>> pathDataMap = new ConcurrentHashMap<>();
	
	private IModelRuntimeShutdownable iModelRuntimeShutdownable = new IModelRuntimeShutdownable() {
		@Override
		public void shutdown() throws Exception {
			onShutdown();
		}
	};
	
	private ISysUniStateListener iSysUniStateListener = new ISysUniStateListener() {

		@Override
		public void change(String strPath, String data, String oldData, String strPattern) {
			try {
				log.debug(String.format(String.format("统一状态[%1$s]变更触发", strPath)));
				onUniStateChange(strPath, data, oldData, strPattern);
			}
			catch (Throwable ex) {
				log.error(String.format("统一状态[%1$s]变更处理发生异常，%2$s", strPath, ex.getMessage()), ex);
			}
		}
	};

	@Override
	protected void onInit() throws Exception {
		
		if (this.getSettingDataEntityRuntime(true) == null) {
			this.prepareSettingDataEntityRuntime();
			this.getSettingDataEntityRuntime(false);
		}
		
		super.onInit();
		
		//注册运行时平台可关闭
		this.getSystemRuntime().registerModelRuntimeShutdownable(iModelRuntimeShutdownable);
	}
	

	protected void prepareSettingDataEntityRuntime() throws Exception {
		IPSDataEntity utilPSDataEntity = this.getPSDEUtil().getUtilPSDE();
		if (utilPSDataEntity == null) {
			throw new Exception(String.format("未指定通知设置存储实体"));
		}

		IDataEntityRuntime settingDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(utilPSDataEntity.getId());
		this.setSettingDataEntityRuntime(settingDataEntityRuntime);

		//this.setSettingPSDEDataSet(settingDataEntityRuntime.getPSDEDataSetByTag(PREDEFINEDDATASET_CUR_USER, false));
		this.setSettingModelPSDEField(settingDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_SETTING_MODEL, false));
		this.setSettingSystemTagPSDEField(settingDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_SYSTEM_TAG, false));
		this.setSettingOwnerTypePSDEField(settingDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_OWNER_TYPE, false));
		this.setSettingOwnerIdPSDEField(settingDataEntityRuntime.getPSDEFieldByTag(PREDEFINEDFIELD_OWNER_ID, false));
		
		this.setSettingSysDEUniStateRuntime(this.getSettingDataEntityRuntime().getDefaultSysDEUniStateRuntime(true));
	}

	

	@Override
	public IDataEntityRuntime getSettingDataEntityRuntime() {
		try {
			return this.getSettingDataEntityRuntime(false);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, ex.getMessage(), ex);
		}
	}
	
	
	protected IPSDEDataSet getSettingPSDEDataSet() {
		return settingPSDEDataSet;
	}


	protected void setSettingPSDEDataSet(IPSDEDataSet settingPSDEDataSet) {
		this.settingPSDEDataSet = settingPSDEDataSet;
	}
	

	protected IPSDEField getSettingSystemTagPSDEField() {
		return settingSystemTagPSDEField;
	}


	protected void setSettingSystemTagPSDEField(IPSDEField settingSystemTagPSDEField) {
		this.settingSystemTagPSDEField = settingSystemTagPSDEField;
	}


	protected IPSDEField getSettingOwnerTypePSDEField() {
		return settingOwnerTypePSDEField;
	}


	protected void setSettingOwnerTypePSDEField(IPSDEField settingOwnerTypePSDEField) {
		this.settingOwnerTypePSDEField = settingOwnerTypePSDEField;
	}


	protected IPSDEField getSettingOwnerIdPSDEField() {
		return settingOwnerIdPSDEField;
	}


	protected void setSettingOwnerIdPSDEField(IPSDEField settingOwnerIdPSDEField) {
		this.settingOwnerIdPSDEField = settingOwnerIdPSDEField;
	}


	protected IPSDEField getSettingModelPSDEField() {
		return settingModelPSDEField;
	}


	protected void setSettingModelPSDEField(IPSDEField settingModelPSDEField) {
		this.settingModelPSDEField = settingModelPSDEField;
	}


	protected IDataEntityRuntime getSettingDataEntityRuntime(boolean tryMode) throws Exception {
		if (this.settingDataEntityRuntime != null || tryMode) {
			return this.settingDataEntityRuntime;
		}
		throw new Exception(String.format("设置实体运行时对象无效"));
	}

	protected void setSettingDataEntityRuntime(IDataEntityRuntime settingDataEntityRuntime) {
		this.settingDataEntityRuntime = settingDataEntityRuntime;
	}

	protected ISysDEUniStateRuntime getSettingSysDEUniStateRuntime() {
		return settingSysDEUniStateRuntime;
	}


	protected void setSettingSysDEUniStateRuntime(ISysDEUniStateRuntime settingSysDEUniStateRuntime) {
		this.settingSysDEUniStateRuntime = settingSysDEUniStateRuntime;
	}


	@Override
	public Map<String, Integer> getSettings(IEntity iEntity, String strNotifyTag, int nMsgType, Set<String> personIdSet) {
		Assert.hasLength(strNotifyTag, "传入通知标记无效");
		Assert.isTrue(nMsgType>0, "传入消息类型无效");
		Assert.notEmpty(personIdSet, "传入人员标识集合无效");
		try {
			return this.onGetSettings(iEntity, strNotifyTag, nMsgType, personIdSet);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取通知设置发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Map<String, Integer> onGetSettings(IEntity iEntity, String strNotifyTag, int nMsgType, Set<String> personIdSet) throws Throwable {
		Map<String, Integer> settings = new LinkedHashMap<String, Integer>();
		
		List<String> fetchPersonIdList = new ArrayList<String>();
		
		for(String strPersonId : personIdSet) {
			Map<String, Integer> map = this.notitySettingMapMap.get(String.format("%1$s|%2$s", OWNER_TYPE_PERSONAL, strPersonId));
			if(map == null) {
				//没有指定人
				fetchPersonIdList.add(strPersonId);
			}
		}
		
		if(!ObjectUtils.isEmpty(fetchPersonIdList)) {
			//此处有最大查询数量限制问题
			ISearchContextDTO searchContextDTO = this.getSettingDataEntityRuntime().createSearchContext();
			searchContextDTO.setCount(false);
			searchContextDTO.all();
			searchContextDTO.eq(this.getSettingSystemTagPSDEField().getLowerCaseName(), this.getSystemRuntime().getDeploySystemId());
			searchContextDTO.eq(this.getSettingOwnerTypePSDEField().getLowerCaseName(), OWNER_TYPE_PERSONAL);
			searchContextDTO.in(this.getSettingOwnerIdPSDEField().getLowerCaseName(), fetchPersonIdList);
		
			List<IEntityDTO> list =	this.getSettingDataEntityRuntime().selectDataSet(this.getSettingDataEntityRuntime().getViewPSDEDataSet(), searchContextDTO);
			if(!ObjectUtils.isEmpty(list)) {
				for(IEntityDTO iEntityDTO : list) {
					updateSetting(iEntityDTO, true);
				}
			}
		}
		
		//填入默认
		for(String strPersonId : personIdSet) {
			Map<String, Integer> map = this.notitySettingMapMap.get(String.format("%1$s|%2$s", OWNER_TYPE_PERSONAL, strPersonId));
			if(map == null) {
				IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
				iEntityDTO.set(this.getSettingOwnerIdPSDEField().getLowerCaseName(), strPersonId);
				iEntityDTO.set(this.getSettingOwnerTypePSDEField().getLowerCaseName(), OWNER_TYPE_PERSONAL);
				iEntityDTO.set(this.getSettingSystemTagPSDEField().getLowerCaseName(), this.getSystemRuntime().getDeploySystemId());
				
				updateSetting(iEntityDTO, true);
			}
		}
		
		//判断是否有默认
		Map<String, Integer> defaultMap = this.notitySettingMapMap.get(String.format("%1$s|%2$s", OWNER_TYPE_SYSTEM, null));
		if(defaultMap == null) {
			ISearchContextDTO searchContextDTO = this.getSettingDataEntityRuntime().createSearchContext();
			searchContextDTO.setCount(false);
			searchContextDTO.all();
			searchContextDTO.eq(this.getSettingSystemTagPSDEField().getLowerCaseName(), this.getSystemRuntime().getDeploySystemId());
			searchContextDTO.eq(this.getSettingOwnerTypePSDEField().getLowerCaseName(), OWNER_TYPE_SYSTEM);
			searchContextDTO.nvl(this.getSettingOwnerIdPSDEField().getLowerCaseName());
		
			List<IEntityDTO> list =	this.getSettingDataEntityRuntime().selectDataSet(this.getSettingDataEntityRuntime().getViewPSDEDataSet(), searchContextDTO);
			if(!ObjectUtils.isEmpty(list)) {
				for(IEntityDTO iEntityDTO : list) {
					updateSetting(iEntityDTO, true);
				}
			}
			else {
				IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
				iEntityDTO.set(this.getSettingOwnerTypePSDEField().getLowerCaseName(), OWNER_TYPE_SYSTEM);
				iEntityDTO.set(this.getSettingSystemTagPSDEField().getLowerCaseName(), this.getSystemRuntime().getDeploySystemId());
				updateSetting(iEntityDTO, true);
			}
			
			defaultMap = this.notitySettingMapMap.get(String.format("%1$s|%2$s", OWNER_TYPE_SYSTEM, null));
		}
		
		
		for(String strPersonId : personIdSet) {
			Map<String, Integer> map = this.notitySettingMapMap.get(String.format("%1$s|%2$s", OWNER_TYPE_PERSONAL, strPersonId));
			if(map == null && defaultMap == null) {
				settings.put(strPersonId, nMsgType);
			}
			else {
				Integer nValue = null;
				if(map != null) {
					nValue = map.get(strNotifyTag);
				}
				if(nValue == null && defaultMap!=null) {
					nValue= defaultMap.get(strNotifyTag);
				}
				if(nValue == null) {
					nValue = nMsgType;
				}
				else {
					nValue = (nValue & nMsgType);
				}
				settings.put(strPersonId, nValue);
			}
		}
		return settings;
	}
	
	
	protected void updateSetting(IEntityDTO iEntityDTO, boolean bHook) throws Throwable {
		String strPersonId = iEntityDTO.getString(this.getSettingOwnerIdPSDEField().getLowerCaseName(), null);
		Object model = iEntityDTO.get(this.getSettingModelPSDEField().getLowerCaseName());
		String strOwnerType = iEntityDTO.getString(this.getSettingOwnerTypePSDEField().getLowerCaseName(), null);
		
		//解出模型，放入设置
		if(!ObjectUtils.isEmpty(model)){
			Map<String, Integer> settings = new HashMap<String, Integer>();
			List list = null;
			if(model instanceof List){
				list = (List)model;
			}
			else{
				list = JsonUtils.asList(model);
			}
			
			for(Object item : list) {
				if((item instanceof Map)) {
					Map map = (Map)item;
					String strNotifyTag = DataTypeUtils.asString(map.get(MODEL_FIELD_NOTIFY_TAG), null);
					if(!StringUtils.hasLength(strNotifyTag)) {
						continue;
					}
					
					Integer nMsgType = DataTypeUtils.asInteger(map.get(MODEL_FIELD_MSG_TYPE), null);
					if(nMsgType == null) {
						continue;
					}
					
					settings.put(strNotifyTag, nMsgType);
					continue;
				}
				else
					if((item instanceof IEntity)) {
						IEntity map = (IEntity)item;
						String strNotifyTag = DataTypeUtils.asString(map.get(MODEL_FIELD_NOTIFY_TAG), null);
						if(!StringUtils.hasLength(strNotifyTag)) {
							continue;
						}
						
						Integer nMsgType = DataTypeUtils.asInteger(map.get(MODEL_FIELD_MSG_TYPE), null);
						if(nMsgType == null) {
							continue;
						}
						
						settings.put(strNotifyTag, nMsgType);
						continue;
					}
				
				
			}
			notitySettingMapMap.put(String.format("%1$s|%2$s", strOwnerType, strPersonId), settings);
		}
		else {
			notitySettingMapMap.put(String.format("%1$s|%2$s", strOwnerType, strPersonId), new HashMap<String, Integer>());
		}
		
		if(!bHook) {
			return;
		}
		
		final ISysDEUniStateRuntime iSysDEUniStateRuntime = this.getSettingSysDEUniStateRuntime();
		if(iSysDEUniStateRuntime != null) {
			//写入数据
			iSysDEUniStateRuntime.setEntity(iEntityDTO);
			//执行变更监控
			if(iSysDEUniStateRuntime.isEnableListener()) {
				String strPath = iSysDEUniStateRuntime.getPath(iEntityDTO);
				if(!this.sysUniStateListenerMap.containsKey(strPath)) {
					iSysDEUniStateRuntime.registerListener(strPath, false, this.iSysUniStateListener);
					this.sysUniStateListenerMap.put(strPath, this.iSysUniStateListener);
					Map<String, Object> data = new LinkedHashMap<String, Object>();
					iEntityDTO.copyTo(data, false);
					
					data.remove(this.getSettingModelPSDEField().getLowerCaseName());					
					this.pathDataMap.put(strPath, data);
					
				}
			}
		}
	}
	
	protected void onUniStateChange(String strPath, String data, String oldData, String strPattern) throws Throwable{
		Map<String, Object> map = null;
		if(StringUtils.hasLength(data)) {
			map = JsonUtils.asMap(data);
		}
		else
			if(StringUtils.hasLength(oldData)) {
				map = JsonUtils.asMap(oldData);
			}
			else {
				map = this.pathDataMap.get(strPath);
			}
		if(map == null) {
			return;
		}
		
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity(map, false);
		if(!StringUtils.hasLength(data)) {
			//移除模型
			iEntityDTO.reset(this.getSettingModelPSDEField().getLowerCaseName());
		}
		
		this.updateSetting(iEntityDTO, false);
	}
	
	protected void onShutdown() throws Exception {
		final ISysDEUniStateRuntime iSysDEUniStateRuntime = this.getSettingSysDEUniStateRuntime();
		if(iSysDEUniStateRuntime != null && !ObjectUtils.isEmpty(this.sysUniStateListenerMap)) {
			for(java.util.Map.Entry<String, ISysUniStateListener> entry : this.sysUniStateListenerMap.entrySet()) {
				iSysDEUniStateRuntime.unregisterListener(entry.getKey(), false, entry.getValue());
			}
			this.sysUniStateListenerMap.clear();
		}
	}
	
}
