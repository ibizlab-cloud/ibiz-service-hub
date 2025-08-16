package net.ibizsys.central.dataentity.search;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.search.IPSDESearch;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.search.IPSSysSearchDEField;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchField;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.datasync.DEDataSyncEvents;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class DESearchRuntimeBase extends DataEntityModelRuntimeBase implements IDESearchRuntime  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DESearchRuntimeBase.class);
	
	private IPSDESearch iPSDESearch = null;
	private ISysSearchSchemeRuntime iSysSearchSchemeRuntime = null;
	//private ISysSearchDocRuntime iSysSearchDocRuntime  = null;
	private boolean bThreadMode = true;
	private IPSSysSearchDoc iPSSysSearchDoc = null;
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDESearch iPSDESearch) throws Exception {
		this.setDataEntityRuntimeBase(iDataEntityRuntimeContext.getDataEntityRuntime());
		this.setPSDESearch(iPSDESearch);
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		this.iPSSysSearchDoc = this.getPSDESearch().getPSSysSearchDEMust().getPSSysSearchDocMust();
		if(ObjectUtils.isEmpty(this.getPSDESearch().getPSSysSearchDEMust().getAllPSSysSearchDEFields())) {
			throw new Exception(String.format("未定义检索实体属性"));
		}
		this.iSysSearchSchemeRuntime = this.getSystemRuntime().getSysSearchSchemeRuntime(this.getPSDESearch().getPSSysSearchSchemeMust());
		//this.iSysSearchDocRuntime = this.getSysSearchSchemeRuntime().getSysSearchDocRuntime(this.getPSDESearch().getPSSysSearchDocMust());
		super.onInit();
	}
	
	
	@Override
	public IPSDESearch getPSDESearch() {
		return this.iPSDESearch;
	}
	
	protected void setPSDESearch(IPSDESearch iPSDESearch) {
		this.iPSDESearch = iPSDESearch;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDESearch();
	}


	@Override
	public ISysSearchSchemeRuntime getSysSearchSchemeRuntime() {
		return this.iSysSearchSchemeRuntime;
	}

	protected IPSSysSearchDoc getPSSysSearchDoc() {
		return this.iPSSysSearchDoc;
	}

//	@Override
//	public ISysSearchDocRuntime getSysSearchDocRuntime() {
//		return this.iSysSearchDocRuntime;
//	}

	
	protected boolean isThreadMode() {
		return this.bThreadMode;
	}
	

	@Override
	public void syncEntity(int nEvent, Object arg0) {
		try {
			if(isThreadMode()) {
				getSystemRuntime().threadRun(new Runnable() {
					@Override
					public void run() {
						try {
							onSyncEntity(nEvent, arg0);
						}
						catch (Throwable ex) {
							log.error(String.format("同步数据对象发生异常，%1$s", ex.getMessage()), ex);
						}
					}
				});
			}
			else {
				onSyncEntity(nEvent, arg0);
			}
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("同步数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onSyncEntity(int nEvent, Object arg0) throws Throwable {
		
		switch(nEvent) {
		case DEDataSyncEvents.CREATE:
		{
			IEntityDTO iEntityDTO = null;
			if(arg0 instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO)arg0;
			}
			if(iEntityDTO == null) {
				throw new Exception(String.format("传入数据对象类型不正确"));
			}
			
			this.onCreateEntity(iEntityDTO);
			
		}
			break;
		case DEDataSyncEvents.UPDATE:{
			
			IEntityDTO iEntityDTO = null;
			if(arg0 instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO)arg0;
			}
			if(iEntityDTO == null) {
				throw new Exception(String.format("传入数据对象类型不正确"));
			}
			
			this.onUpdateEntity(iEntityDTO);
			
		}
			break;
		case DEDataSyncEvents.REMOVE:
		{
			this.onRemoveEntity(arg0);
		}
			break;
		default:
			break;
		}
		
	}
	
	protected void onCreateEntity(IEntityDTO iEntityDTO) throws Throwable {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		List<IPSSysSearchDEField> psSysSearchDEFieldList = this.getPSDESearch().getPSSysSearchDEMust().getAllPSSysSearchDEFields();
		if(ObjectUtils.isEmpty(psSysSearchDEFieldList)) {
			return;
		}
		
		for(IPSSysSearchDEField iPSSysSearchDEField : psSysSearchDEFieldList) {
			IPSSysSearchField iPSSysSearchField = iPSSysSearchDEField.getPSSysSearchFieldMust();
			IPSDEField iPSDEField = iPSSysSearchDEField.getPSDEField();
			Object value = null;
			if(iPSDEField != null) {
				if(iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
					value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				}
				else {
					if(StringUtils.hasLength(iPSSysSearchDEField.getDefaultValueType())
							|| StringUtils.hasLength(iPSSysSearchDEField.getDefaultValue())) {
						value = this.getDataEntityRuntime().getDefaultValue(iPSSysSearchDEField.getDefaultValueType(), iPSSysSearchDEField.getDefaultValue(), iEntityDTO, iPSSysSearchField.getStdDataType());
					}
				}
			}
			else {
				if(StringUtils.hasLength(iPSSysSearchDEField.getDefaultValueType())
						|| StringUtils.hasLength(iPSSysSearchDEField.getDefaultValue())) {
					value = this.getDataEntityRuntime().getDefaultValue(iPSSysSearchDEField.getDefaultValueType(), iPSSysSearchDEField.getDefaultValue(), iEntityDTO, iPSSysSearchField.getStdDataType());
				}
			}
			final IPSSysTranslator iPSSysTranslator = iPSSysSearchDEField.getPSSysTranslator();
			if(iPSSysTranslator!=null) {
				value = this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator).translate(value, false, iEntityDTO, iPSDEField, this.getDataEntityRuntime());
			}
			map.put(iPSSysSearchField.getName(), value);
		}
		
		if(!map.containsKey(EntityBase.KEY)) {
			Object value = iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
			map.put(EntityBase.KEY, getUniqueId(value));
		}
		
		this.getSysSearchSchemeRuntime().insert(this.getPSSysSearchDoc().getName(), map, null);
	}
	
	
	protected void onUpdateEntity(IEntityDTO iEntityDTO) throws Throwable {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		List<IPSSysSearchDEField> psSysSearchDEFieldList = this.getPSDESearch().getPSSysSearchDEMust().getAllPSSysSearchDEFields();
		if(ObjectUtils.isEmpty(psSysSearchDEFieldList)) {
			return;
		}
		
		for(IPSSysSearchDEField iPSSysSearchDEField : psSysSearchDEFieldList) {
			IPSSysSearchField iPSSysSearchField = iPSSysSearchDEField.getPSSysSearchFieldMust();
			IPSDEField iPSDEField = iPSSysSearchDEField.getPSDEField();
			Object value = null;
			if(iPSDEField != null) {
				if(iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
					value = iEntityDTO.get(iPSDEField.getLowerCaseName());
				}
				else {
					continue;
				}
			}
			else {
				continue;
			}
			
			final IPSSysTranslator iPSSysTranslator = iPSSysSearchDEField.getPSSysTranslator();
			if(iPSSysTranslator!=null) {
				value = this.getSystemRuntime().getSysTranslatorRuntime(iPSSysTranslator).translate(value, false, iEntityDTO, iPSDEField, this.getDataEntityRuntime());
			}
			map.put(iPSSysSearchField.getName(), value);
		}
		
		if(!map.containsKey(EntityBase.KEY)) {
			Object value = iEntityDTO.get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
			map.put(EntityBase.KEY, getUniqueId(value));
		}
		
		this.getSysSearchSchemeRuntime().update(this.getPSSysSearchDoc().getName(), map, null, true);
	}
	
	protected void onRemoveEntity(Object obj) throws Throwable {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		Object key = null;
		if(obj instanceof IEntityDTO) {
			key = ((IEntityDTO)obj).get(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName());
		}
		else {
			key = obj;
		}
		
		if(ObjectUtils.isEmpty(key)) {
			return;
		}
		
		List<IPSSysSearchDEField> psSysSearchDEFieldList = this.getPSDESearch().getPSSysSearchDEMust().getAllPSSysSearchDEFields();
		if(!ObjectUtils.isEmpty(psSysSearchDEFieldList)) {
			for(IPSSysSearchDEField iPSSysSearchDEField : psSysSearchDEFieldList) {
				IPSSysSearchField iPSSysSearchField = iPSSysSearchDEField.getPSSysSearchFieldMust();
				if(iPSSysSearchField.isPKey()) {
					map.put(iPSSysSearchField.getName(), key);
				}
				else {
					IPSDEField iPSDEField = iPSSysSearchDEField.getPSDEField();
					if(iPSDEField!=null && iPSDEField.isKeyDEField()) {
						map.put(iPSSysSearchField.getName(), key);
					}
				}
			}
		}
		
		if(!map.containsKey(EntityBase.KEY)) {
			map.put(EntityBase.KEY, getUniqueId(key));
		}
		
		this.getSysSearchSchemeRuntime().delete(this.getPSSysSearchDoc().getName(), map, null);
	}
	
	
	protected String getUniqueId(Object id) {
		return KeyValueUtils.genUniqueId(this.getDataEntityRuntime().getName(), id);
	}
}
