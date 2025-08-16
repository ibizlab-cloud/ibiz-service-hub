package net.ibizsys.central.res;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.sysutil.ISysUniStateListener;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.expression.ExpressionUtils;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncEvents;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SysDEUniStateRuntimeBase extends SysUniStateRuntimeBase implements ISysDEUniStateRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDEUniStateRuntimeBase.class);
	private IPSDataEntity iPSDataEntity = null;
	private Map<String, IPSDEField> folderPSDEFieldMap = null;
	private List<IPSDEField> dataPSDEFieldList = null;
	private String strPathFormat = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private boolean bOnChangeListener = false;
	private IPSDEField updateDatePSDEField = null;
	
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
		
		this.setPSDataEntity(this.getPSSysUniState().getPSDataEntityMust());
		Map<String, IPSDEField> folderPSDEFieldMap = new LinkedHashMap<String, IPSDEField>();
		if(this.getPSSysUniState().getFolderPSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER, this.getPSSysUniState().getFolderPSDEField());
		}
		if(this.getPSSysUniState().getFolder2PSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER2, this.getPSSysUniState().getFolder2PSDEField());
		}
		if(this.getPSSysUniState().getFolder3PSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER3, this.getPSSysUniState().getFolder3PSDEField());
		}
		
		if(this.getPSSysUniState().getFolder4PSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER4, this.getPSSysUniState().getFolder4PSDEField());
		}
		
		if(this.getPSSysUniState().getFolder5PSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER5, this.getPSSysUniState().getFolder5PSDEField());
		}
		
		if(this.getPSSysUniState().getFolder6PSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER6, this.getPSSysUniState().getFolder6PSDEField());
		}
		
		if(this.getPSSysUniState().getFolder7PSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER7, this.getPSSysUniState().getFolder7PSDEField());
		}
		
		if(this.getPSSysUniState().getFolder8PSDEField()!=null) {
			folderPSDEFieldMap.put(PARAM_FOLDER8, this.getPSSysUniState().getFolder8PSDEField());
		}
		
		if(ObjectUtils.isEmpty(folderPSDEFieldMap)) {
			throw new Exception(String.format("目录属性无效"));
		}
		this.setFolderPSDEFieldMap(folderPSDEFieldMap);
		
		if(!this.getPSSysUniState().isAllData()) {
			List<IPSDEField> dataPSDEFieldList = new ArrayList<IPSDEField>();
			if(this.getPSSysUniState().getStatePSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getStatePSDEField());
			}
			if(this.getPSSysUniState().getState2PSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getState2PSDEField());
			}
			if(this.getPSSysUniState().getState3PSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getState3PSDEField());
			}
			if(this.getPSSysUniState().getState4PSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getState4PSDEField());
			}
			if(this.getPSSysUniState().getState5PSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getState5PSDEField());
			}
			if(this.getPSSysUniState().getState6PSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getState6PSDEField());
			}
			if(this.getPSSysUniState().getState7PSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getState7PSDEField());
			}
			if(this.getPSSysUniState().getState8PSDEField()!=null) {
				dataPSDEFieldList.add(this.getPSSysUniState().getState8PSDEField());
			}
			
			if(ObjectUtils.isEmpty(dataPSDEFieldList)) {
				throw new Exception(String.format("数据属性无效"));
			}
			this.setDataPSDEFieldList(dataPSDEFieldList);
		}
	
		super.onInit();
		
		
		String strPathFormat = this.getPSSysUniState().getPathFormat();
		if(!StringUtils.hasLength(strPathFormat)) {
			Set<String> set = new LinkedHashSet<String>();
			if(StringUtils.hasLength(getPathPrefix())) {
				set.add(String.format("{%1$s}", PARAM_PREFIX));
			}
			set.add(String.format("{%1$s}", PARAM_UNIQUETAG));
			for(String key : this.getFolderPSDEFieldMap().keySet()) {
				set.add(String.format("{%1$s}", key));
			}
			strPathFormat = this.getSysUniStateUtilRuntimeBase().getPathFormat(set);
		}
		this.setPathFormat(strPathFormat);
		
		if(StringUtils.hasLength(this.getPSSysUniState().getMonitorFormat())) {
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			map.put(PARAM_UNIQUETAG, this.getPSSysUniState().getUniqueTag());
			map.put(PARAM_SYSTEM, this.getSystemRuntime().getDeploySystemId());
			this.setMonitorPath(ExpressionUtils.getValue(this.getPSSysUniState().getMonitorFormat(), map));
		}
		
		//判断是否启动监控
		if(this.getPSSysUniState().getOnChangePSDELogic() != null
				&& StringUtils.hasLength(this.getMonitorPath())) {
			this.getSysUniStateUtilRuntimeBase().registerListener(this.getMonitorPath(), true, this.iSysUniStateListener);
			this.bOnChangeListener = true;
		}
	}
	
	 
	
	protected IPSDataEntity getPSDataEntity() {
		return iPSDataEntity;
	}

	protected void setPSDataEntity(IPSDataEntity iPSDataEntity) {
		this.iPSDataEntity = iPSDataEntity;
	}

	protected IDataEntityRuntime getDataEntityRuntime() {
		if(this.iDataEntityRuntime == null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDataEntity().getId());
		}
		return this.iDataEntityRuntime;
	}
	
	
	
	protected Map<String, IPSDEField> getFolderPSDEFieldMap() {
		return this.folderPSDEFieldMap;
	}

	protected void setFolderPSDEFieldMap(Map<String, IPSDEField> folderPSDEFieldMap) {
		this.folderPSDEFieldMap = folderPSDEFieldMap;
	}

	protected List<IPSDEField> getDataPSDEFieldList() {
		return dataPSDEFieldList;
	}

	protected void setDataPSDEFieldList(List<IPSDEField> dataPSDEFieldList) {
		this.dataPSDEFieldList = dataPSDEFieldList;
	}
	
	protected String getPathFormat() {
		return this.strPathFormat;
	}
	
	protected void setPathFormat(String strPathFormat) {
		this.strPathFormat = strPathFormat;
	}
	
	
	

	protected String getPathPrefix() {
		return null;
	}
	
	protected boolean isThreadMode() {
		return true;
	}
	
	@Override
	public String getPath(IEntity iEntity) {
		Assert.notNull(iEntity, "传入数据对象无效");
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		
		map.put(PARAM_UNIQUETAG, this.getPSSysUniState().getUniqueTag());
		map.put(PARAM_SYSTEM, this.getSystemRuntime().getDeploySystemId());
		map.put(PARAM_KEY, String.valueOf(iEntity.get(this.getPSSysUniState().getPSDataEntityMust().getKeyPSDEFieldMust().getLowerCaseName())));
		
		for(java.util.Map.Entry<String, IPSDEField> entry : this.getFolderPSDEFieldMap().entrySet()) {
			map.put(entry.getKey(), String.valueOf(iEntity.get(entry.getValue().getLowerCaseName())));
		}
		
		return ExpressionUtils.getValue(this.getPathFormat(), map);
	}
	
	
	protected Map<String, Object> getData(IEntity iEntity, boolean bIncludeFolder) {
		Map<String, Object> data = new LinkedHashMap<String, Object>();
		if(this.getPSSysUniState().isAllData()) {
			if(iEntity instanceof IEntityDTO) {
				((IEntityDTO)iEntity).copyTo(data, false);
			}
			else {
				if(!ObjectUtils.isEmpty(iEntity.any())) {
					data.putAll(iEntity.any());
				}
			}
		}
		else {
			
			for(IPSDEField iPSDEField : this.getDataPSDEFieldList()) {
				data.put(iPSDEField.getLowerCaseName(), iEntity.get(iPSDEField.getLowerCaseName()));
			}
			
			if(bIncludeFolder) {
				for(IPSDEField iPSDEField : this.getFolderPSDEFieldMap().values()) {
					data.put(iPSDEField.getLowerCaseName(), iEntity.get(iPSDEField.getLowerCaseName()));
				}
			}
		}
		
		
		return data;
	}
	
	@Override
	public IEntity getEntity(IEntity iEntity) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Map<String, Object> data = this.getSysUniStateUtilRuntimeBase().get(getPath(iEntity), Map.class);
		if(data != null) {
			iEntity.putAll(data);
		}
		return iEntity;
	}
	
	
	@Override
	public IEntity getEntityIf(IEntity iEntity) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Map<String, Object> data = this.getSysUniStateUtilRuntimeBase().get(getPath(iEntity), Map.class);
		if(data != null) {
			iEntity.putAll(data);
		}
		else {
			//没有数据
			Object key = iEntity.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
			if(ObjectUtils.isEmpty(key)) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("获取数据对象发生异常，%1$s", "未传入数据主键"));
			}
			
			try {
				IEntity last = this.getDataEntityRuntime().get(key);
				data = this.getData(last, true);
				this.getSysUniStateUtilRuntimeBase().set(getPath(iEntity), data);
				iEntity.putAll(data);
				
			} catch (Throwable ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("获取数据对象发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		return iEntity;
	}

	@Override
	public void setEntity(IEntity iEntity) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Map<String, Object> data = this.getData(iEntity, true);
		this.getSysUniStateUtilRuntimeBase().set(getPath(iEntity), data);
	}

	@Override
	public void resetEntity(IEntity iEntity){
		Assert.notNull(iEntity, "传入数据对象无效");
		if(this.getPSSysUniState().isDeleteAsUpdate()) {
			Map<String, Object> data = this.getData(iEntity, true);
			//进一步填入更新时间
			if(this.updateDatePSDEField == null) {
				this.updateDatePSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.UPDATEDATE, true);
			}
			if(updateDatePSDEField!=null) {
				data.put(updateDatePSDEField.getLowerCaseName(), new Timestamp(System.currentTimeMillis()));
			}
			
			this.getSysUniStateUtilRuntimeBase().set(getPath(iEntity), data);
		}
		else {
			this.getSysUniStateUtilRuntimeBase().reset(getPath(iEntity));
		}
		
	}
	
	@Override
	public void syncEntity(int nEvent, Object arg0) {
		try {
			IEntityDTO iEntityDTO = null;
			if(arg0 instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO)arg0;
			}
			else if(nEvent == DEDataSyncEvents.REMOVE) {
				iEntityDTO = (IEntityDTO)this.getDataEntityRuntime().getLastEntity();
			}
			if(iEntityDTO == null) {
				throw new Exception("传入数据对象无效");
			}
			if (isThreadMode()) {
				IEntityDTO iEntityDTO2 = iEntityDTO;
				getSystemRuntime().threadRun(new Runnable() {
					@Override
					public void run() {
						try {
							onSyncEntity(nEvent, iEntityDTO2);
						} catch (Throwable ex) {
							log.error(String.format("同步数据对象发生异常，%1$s", ex.getMessage()), ex);
						}
					}
				});
			} else {
				onSyncEntity(nEvent, iEntityDTO);
			}
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("同步数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onSyncEntity(int nEvent, IEntityDTO iEntityDTO) throws Throwable {
		switch (nEvent) {
		case DEDataSyncEvents.CREATE:
		case DEDataSyncEvents.UPDATE: 
			this.setEntity(iEntityDTO);
			break;
		case DEDataSyncEvents.REMOVE:
			this.resetEntity(iEntityDTO);
			break;
		default:
			break;
		}
	}
	
	@Override
	public boolean isEnableListener() {
		return this.isEnableListener(false);
	}

	@Override
	public void registerListener(IEntity iEntity, ISysUniStateListener iSysUniStateListener) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Assert.notNull(iSysUniStateListener, "传入状态侦听对象无效");
		
		getSysUniStateUtilRuntimeBase().registerListener(getPath(iEntity), false, iSysUniStateListener);
	}

	@Override
	public void unregisterListener(IEntity iEntity, ISysUniStateListener iSysUniStateListener) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Assert.notNull(iSysUniStateListener, "传入状态侦听对象无效");
		
		getSysUniStateUtilRuntimeBase().unregisterListener(getPath(iEntity), false, iSysUniStateListener);
		
	}
	
	protected void onUniStateChange(String strPath, String data, String oldData, String strPattern) throws Throwable{
		Map map = null;
		if(StringUtils.hasLength(data)) {
			map = JsonUtils.asMap(data);
		}
		else {
			map = new LinkedHashMap<String, Object>();
		}
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity(map, false);
		iEntityDTO.set(ENTITYFIELD_PATH, strPath);
		iEntityDTO.set(ENTITYFIELD_MONITORPATH, strPattern);
		
		
		boolean bResetUserContext = false;
		IUserContext iUserContext = ActionSessionManager.getUserContext();
		if(iUserContext == null) {
			iUserContext = this.getSystemRuntime().createDefaultUserContext();
			UserContext.setCurrent(iUserContext);
			bResetUserContext = true;
		}
		
		try {
			
			IDELogicRuntime iDELogicRuntime = this.getDataEntityRuntime().getDELogicRuntime(this.getPSSysUniState().getOnChangePSDELogicMust());
			this.getDataEntityRuntime().execute(new INamedAction() {
				
				@Override
				public Object execute(Object[] args) throws Throwable {
					return iDELogicRuntime.execute(args);
				}
				
				@Override
				public String getName() {
					return String.format("主状态[%1$s]监控触发[%2$s]", getPSSysUniState().getName(), iDELogicRuntime.getName());
				}
			}, new Object[] {iEntityDTO});
		}
		finally {
			if(bResetUserContext) {
				UserContext.setCurrent(null);
			}
		}
	}
	
	
	@Override
	protected void onShutdown() throws Exception {
		try {
			if(this.bOnChangeListener) {
				ISysUniStateUtilRuntimeBase iSysUniStateUtilRuntimeBase = this.getSysUniStateUtilRuntimeBase(true);
				if(iSysUniStateUtilRuntimeBase!=null) {
					iSysUniStateUtilRuntimeBase.unregisterListener(this.getMonitorPath(), true, this.iSysUniStateListener);
				}
				this.bOnChangeListener = false;
			}
		}
		catch (Exception ex) {
			log.error(ex);
		}
		
		super.onShutdown();
	}
}
