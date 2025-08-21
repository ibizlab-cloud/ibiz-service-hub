package net.ibizsys.central.dataentity.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.DEStorageType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;

public abstract class DEDynaStorageUtilRuntimeBase extends DEUtilRuntimeBase implements IDEDynaStorageUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDynaStorageUtilRuntimeBase.class);

	private Map<String, IPSDEField> dynaPSDEFieldMap = null;
	private IDataEntityRuntime storageDataEntityRuntime = null;
	private Map<String, IPSDEField> storagePSDEFieldMap = null;
	private String strDBType = null;
	private boolean bLocalStorageMode = false;
	private boolean bLowerCaseMode = true;
	private boolean bLocalStorageFillLast = false;
	private IPSDEField localStoragePSDEField = null;
	private List<IPSDEField> lastDynaStoragePSDEFieldList = null;

	@Override
	protected void onInit() throws Exception {
		this.setLowerCaseMode(this.getUtilParam("lowercasemode", this.isLowerCaseMode()));
		//修复错别字配置
		this.setLocalStorageFillLast(this.getUtilParam("localstoragfilllast", this.isLocalStorageFillLast()));
		this.setLocalStorageFillLast(this.getUtilParam("localstoragefilllast", this.isLocalStorageFillLast()));
		if(this.getDataEntityRuntime().getSysDBSchemeRuntime()!=null) {
			this.strDBType = this.getDataEntityRuntime().getSysDBSchemeRuntime().getDBType();
		}

		if(this.getStorageDataEntityRuntime(true) == null) {
			this.prepareStorageDataEntityRuntime();
			this.getStorageDataEntityRuntime(false);
		}
		//prepareDynaPSDEFields();
		getDynaPSDEFieldMap();
		super.onInit();
	}


	protected String getDBType() {
		return this.strDBType;
	}


	protected IDBDialect getDBDialect() {
		return this.getStorageDataEntityRuntime().getSysDBSchemeRuntime().getDBDialect();
		//return this.getStorageDataEntityRuntime().getSystemRuntime().getDBDialect(this.getStorageDataEntityRuntime().getSysDBSchemeRuntime().getDBType());
	}

	@Override
	public int getStorageMode() {
		if(isLocalStorageMode()) {
			return STORAGEMODE_EMBEDDED_KEY_VALUE_COLUMN;
		}
		return STORAGEMODE_EXTERNAL_KEY_VALUE_TABLE;
	}


	protected boolean isLocalStorageMode() {
		return this.bLocalStorageMode;
	}

	protected void setLocalStorageMode(boolean bLocalStorageMode) {
		this.bLocalStorageMode = bLocalStorageMode;
	}

	protected boolean isLowerCaseMode() {
		return this.bLowerCaseMode;
	}

	protected void setLowerCaseMode(boolean bLowerCaseMode) {
		this.bLowerCaseMode = bLowerCaseMode;
	}

	protected boolean isLocalStorageFillLast() {
		return this.bLocalStorageFillLast;
	}

	protected void setLocalStorageFillLast(boolean bLocalStorageFillLast) {
		this.bLocalStorageFillLast = bLocalStorageFillLast;
	}

	protected IPSDEField getLocalStoragePSDEField(boolean bTryMode) throws Exception{
		if(this.localStoragePSDEField != null || bTryMode) {
			return this.localStoragePSDEField;
		}
		throw new Exception(String.format("本地存储属性对象无效"));
	}

	protected void setLocalStoragePSDEField(IPSDEField localStoragePSDEField) {
		this.localStoragePSDEField = localStoragePSDEField;
	}


	protected Map<String, IPSDEField> getDynaPSDEFieldMap() {
		final List<IPSDEField> dynaStoragePSDEFields = this.getDataEntityRuntime().getDynaStoragePSDEFields(true);
		if(this.lastDynaStoragePSDEFieldList != dynaStoragePSDEFields) {
			Map<String, IPSDEField> dynaPSDEFieldMap = new LinkedHashMap<String, IPSDEField>();
			if(!ObjectUtils.isEmpty(dynaStoragePSDEFields)) {
				for(IPSDEField iPSDEField : dynaStoragePSDEFields) {
					dynaPSDEFieldMap.put(iPSDEField.getName(), iPSDEField);
				}
			}
			if(!ObjectUtils.isEmpty(dynaPSDEFieldMap)) {
				this.dynaPSDEFieldMap = dynaPSDEFieldMap;
			}
			else {
				this.dynaPSDEFieldMap = null;
			}

			//this.setDynaPSDEFieldMap(dynaPSDEFieldMap);
			this.lastDynaStoragePSDEFieldList = dynaStoragePSDEFields;
		}
		return dynaPSDEFieldMap;
	}

//	protected void setDynaPSDEFieldMap(Map<String, IPSDEField> dynaPSDEFieldMap) {
//		this.dynaPSDEFieldMap = dynaPSDEFieldMap;
//	}

	protected void prepareStorageDataEntityRuntime() throws Exception {
		IPSDataEntity utilPSDataEntity = this.getPSDEUtil().getUtilPSDE();
		if(utilPSDataEntity == null) {
			throw new Exception(String.format("未指定存储实体"));
		}

		if(this.getDataEntityRuntime().getId().equals(utilPSDataEntity.getId())) {
			this.setStorageDataEntityRuntime(this.getDataEntityRuntime());
			this.setLocalStoragePSDEField(this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.DYNASTORAGE, false));
			this.setLocalStorageMode(true);
		}
		else {
			IDataEntityRuntime storageDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(utilPSDataEntity.getId());
			this.setStorageDataEntityRuntime(storageDataEntityRuntime);
			if(isPrepareStoragePSDEFields()) {
				Map<String, IPSDEField> storagePSDEFieldMap = new HashMap<String, IPSDEField>();
				storagePSDEFieldMap.put(PREDEFINEDFIELD_NAME, null);
				storagePSDEFieldMap.put(PREDEFINEDFIELD_STRING_VALUE, null);
				storagePSDEFieldMap.put(PREDEFINEDFIELD_LONGSTRING_VALUE, null);
				storagePSDEFieldMap.put(PREDEFINEDFIELD_DOUBLE_VALUE, null);
				storagePSDEFieldMap.put(PREDEFINEDFIELD_DATETIME_VALUE, null);
				storagePSDEFieldMap.put(PREDEFINEDFIELD_DECIMAL_VALUE, null);
				storagePSDEFieldMap.put(PREDEFINEDFIELD_INT_VALUE, null);
				storagePSDEFieldMap.put(PREDEFINEDFIELD_BIGINT_VALUE, null);


				storagePSDEFieldMap.put(PredefinedFieldType.PARENTID.value, storageDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID.value, false));
				storagePSDEFieldMap.put(PredefinedFieldType.PARENTTYPE.value, storageDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false));
				storagePSDEFieldMap.put(PredefinedFieldType.PARENTNAME.value, storageDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTNAME.value, true));


				java.util.List<IPSDEField> psDEFieldList = storageDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					for(IPSDEField iPSDEField : psDEFieldList) {
						if(!StringUtils.hasLength(iPSDEField.getFieldTag())) {
							continue;
						}
						String strTag = iPSDEField.getFieldTag().toUpperCase();
						if(!storagePSDEFieldMap.containsKey(strTag)) {
							continue;
						}

						if(storagePSDEFieldMap.get(strTag) == null) {
							storagePSDEFieldMap.put(strTag, iPSDEField);
						}
					}

					for(IPSDEField iPSDEField : psDEFieldList) {
						String strTag = iPSDEField.getName().toUpperCase();
						if(!storagePSDEFieldMap.containsKey(strTag)) {
							continue;
						}

						if(storagePSDEFieldMap.get(strTag) == null) {
							storagePSDEFieldMap.put(strTag, iPSDEField);
						}
					}
				}

				if(storagePSDEFieldMap.get(PREDEFINEDFIELD_NAME) == null) {
					if(storageDataEntityRuntime.getMajorPSDEField() == null) {
						throw new Exception("存储实体未定义主属性");
					}
					storagePSDEFieldMap.put(PREDEFINEDFIELD_NAME, storageDataEntityRuntime.getMajorPSDEField());
				}

				this.setStoragePSDEFieldMap(storagePSDEFieldMap);
			}
		}
	}

	protected boolean isPrepareStoragePSDEFields() {
		return true;
	}

	@Override
	public IDataEntityRuntime getStorageDataEntityRuntime(){
		try {
			return getStorageDataEntityRuntime(false);
		}
		catch (Exception ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, ex.getMessage(), ex);
		}
	}

	protected IDataEntityRuntime getStorageDataEntityRuntime(boolean tryMode) throws Exception{
		if(this.storageDataEntityRuntime != null || tryMode) {
			return this.storageDataEntityRuntime;
		}
		throw new Exception(String.format("存储实体运行时对象无效"));
	}

	protected void setStorageDataEntityRuntime(IDataEntityRuntime storageDataEntityRuntime) {
		this.storageDataEntityRuntime = storageDataEntityRuntime;
	}

	protected Map<String, IPSDEField> getStoragePSDEFieldMap() {
		return storagePSDEFieldMap;
	}

	protected void setStoragePSDEFieldMap(Map<String, IPSDEField> storagePSDEFieldMap) {
		this.storagePSDEFieldMap = storagePSDEFieldMap;
	}

	protected  Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Exception {
		//获取传入数据的动态属性
		return this.getDynaPSDEFieldMap();
	}

	protected  Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Exception {
		//获取传入数据的动态属性
		//return this.dynaPSDEFieldMap;
		return this.getDynaPSDEFieldMap();
	}

	protected  Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery) throws Exception {
		//获取传入数据的动态属性
		//return this.dynaPSDEFieldMap;
		return this.getDynaPSDEFieldMap();
	}


	@Override
	public void checkEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		try {
			this.onCheckEntityDynaFieldsBeforeProceed(arg0, strActionName, iPSDEAction);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("行为[%1$s]处理前检查动态属性发生异常，%2$s", iPSDEAction!=null?iPSDEAction.getName():strActionName, ex.getMessage()), ex);
		}
	}

	protected void onCheckEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		//当前实体不实现
	}


	@Override
	public void translateEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		try {
			this.onTranslateEntityDynaFieldsBeforeProceed(arg0, strActionName, iPSDEAction);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("行为[%1$s]处理前转换动态属性发生异常，%2$s", iPSDEAction!=null?iPSDEAction.getName():strActionName, ex.getMessage()), ex);
		}
	}

	protected void onTranslateEntityDynaFieldsBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		Map<String, Object> dynaFieldValueMap = null;
		//备份
		Map<String, IPSDEField> dynaPSDEFieldMap = this.getDynaPSDEFields(arg0, strActionName, iPSDEAction);
		if(!ObjectUtils.isEmpty(dynaPSDEFieldMap)) {
			// 判断添加的属性
			for (IPSDEField iPSDEField : dynaPSDEFieldMap.values()) {

				if (!this.getDataEntityRuntime().containsFieldValue(arg0, iPSDEField)) {
					continue;
				}

				if (dynaFieldValueMap == null) {
					if (isLocalStorageMode() && isLocalStorageFillLast() && iPSDEAction != null && iPSDEAction.isPrepareLast()) {
						//不使用getLast模式，保护动态存储属性原始数据
						ISearchContextDTO searchContextDTO = this.getStorageDataEntityRuntime().createSearchContext();
						Object objKey = this.getDataEntityRuntime().getFieldValue(arg0, this.getDataEntityRuntime().getKeyPSDEField());
						if (!ObjectUtils.isEmpty(objKey)) {
							this.getDataEntityRuntime().setSearchCondition(searchContextDTO, this.getDataEntityRuntime().getKeyPSDEField(), Conditions.EQ, objKey);
							IEntityBase last = this.getDataEntityRuntime().selectOne(searchContextDTO,true);
							if (last != null) {
								Object dynaStorage = this.getDataEntityRuntime().getFieldValue(last, this.getLocalStoragePSDEField(false));
								if (dynaStorage != null) {
									dynaFieldValueMap = JsonUtils.asMap(dynaStorage);
								}
							}
						}
					}
					if (dynaFieldValueMap == null) {
						dynaFieldValueMap = new HashMap<String, Object>();
					}
				}
				if(isLowerCaseMode() && this.isLocalStorageMode()) {
					dynaFieldValueMap.put(iPSDEField.getLowerCaseName(), this.getDataEntityRuntime().getFieldValue(arg0, iPSDEField));
				}else {
					dynaFieldValueMap.put(iPSDEField.getName(), this.getDataEntityRuntime().getFieldValue(arg0, iPSDEField));
				}
			}

			String strParamKey = String.format("%1$s_%2$s", ACTIONSESSION_DYNAFIELDS_PREFIX, actionSession.getSessionId());
			actionSession.setActionParam(strParamKey, dynaFieldValueMap);
		}

		if(!this.isLocalStorageMode()) {
			return;
		}

		if(ObjectUtils.isEmpty(dynaFieldValueMap)) {
			this.getDataEntityRuntime().setFieldValue(arg0, this.getLocalStoragePSDEField(false), null);
		}
		else {
			this.getDataEntityRuntime().setFieldValue(arg0, this.getLocalStoragePSDEField(false), JsonUtils.toString(dynaFieldValueMap));
		}
	}

	@Override
	public void translateEntityDynaFieldsAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		try {
			this.onTranslateEntityDynaFieldsAfterProceed(arg0, objRet, strActionName, iPSDEAction);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("行为[%1$s]处理后转换动态属性发生异常，%2$s", iPSDEAction!=null?iPSDEAction.getName():strActionName, ex.getMessage()), ex);
		}
	}

	protected void onTranslateEntityDynaFieldsAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction) throws Throwable {

		Map<String, IPSDEField> dynaPSDEFieldMap;
		if (DEActionModes.READ.equals(iPSDEAction.getActionMode())) {
			dynaPSDEFieldMap = this.getDynaPSDEFields(objRet, strActionName, iPSDEAction);
		}
		else {
			dynaPSDEFieldMap = this.getDynaPSDEFields(arg0, strActionName, iPSDEAction);
		}
		if(ObjectUtils.isEmpty(dynaPSDEFieldMap)) {
			return;
		}

		IEntityBase iEntityBase = null;
		if(objRet instanceof IEntityBase) {
			iEntityBase = (IEntityBase)objRet;
		}
		else
		if(arg0 instanceof IEntityBase) {
			iEntityBase = (IEntityBase)arg0;
		}

		if(iEntityBase == null) {
			return;
		}

		if(this.isLocalStorageMode()) {
			Object dynaStorage = this.getDataEntityRuntime().getFieldValue(iEntityBase, this.getLocalStoragePSDEField(false));
			Map<String, Object> dynaFieldValueMap = null;
			if(dynaStorage != null) {
				dynaFieldValueMap = JsonUtils.asMap(dynaStorage);
			}
			for(java.util.Map.Entry<String, IPSDEField> entry : dynaPSDEFieldMap.entrySet()) {
				Object value = null;
				if(isLowerCaseMode()){
					value = (dynaFieldValueMap != null) ? dynaFieldValueMap.get(entry.getValue().getLowerCaseName()) : null;
					if (ObjectUtils.isEmpty(value)) {
						value = (dynaFieldValueMap != null) ? dynaFieldValueMap.get(entry.getKey()) : null;
					}
				}else {
					value = (dynaFieldValueMap != null)?dynaFieldValueMap.get(entry.getKey()):null;
				}
				
				value = this.getDataEntityRuntime().convertEntityDTOFieldValue(entry.getKey().toLowerCase(), value);
				this.getDataEntityRuntime().setFieldValue(iEntityBase, entry.getValue(), value);
				
//				IPSDEMethodDTOField iPSDEMethodDTOField = this.getDataEntityRuntime().getDefaultPSDEMethodDTO().getPSDEMethodDTOField(entry.getKey().toLowerCase(),true);
//				if(iPSDEMethodDTOField !=null && (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType())
//						||DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType()))) {
//					if(value != null) {
//						if(iPSDEMethodDTOField.getRefPSDataEntity() != null) {
//							IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
//							if(DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
//								if(iPSDEMethodDTOField.isListMap()) {
//
//									if(!(value instanceof Map)) {
//										//执行序列化，此处代码有问题
//										value = refDataEntityRuntime.getSystemRuntime().deserialize(value, Map.class);
//									}
//
//									Map srcMap = (Map)value;
//									Map dtoMap = new LinkedHashMap();
//									for(Object key : srcMap.keySet()) {
//										IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), srcMap.get(key));
//										dtoMap.put(key, iDEMethodDTO);
//									}
//
//									this.getDataEntityRuntime().setFieldValue(iEntityBase, entry.getValue(), dtoMap);
//								}
//								else {
//									//列表模式
//									if(!(value instanceof List)) {
//										value = refDataEntityRuntime.getSystemRuntime().deserialize(value, List.class);
//										//throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
//									}
//
//									List list = (List)value;
//									List dtoList=  new ArrayList();
//									for(Object item : list) {
//										IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), item);
//										dtoList.add(iDEMethodDTO);
//
//									}
//									this.getDataEntityRuntime().setFieldValue(iEntityBase, entry.getValue(), dtoList);
//								}
//							}
//							else {
//
//								if(!(value instanceof Map) && !(value instanceof IEntity)) {
//									//执行序列化，此处代码有问题
//									value = refDataEntityRuntime.getSystemRuntime().deserialize(value, Map.class);
//								}
//
//
//								IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), value);
//								this.getDataEntityRuntime().setFieldValue(iEntityBase, entry.getValue(), iDEMethodDTO);
//							}
//						}
//					}
//
//				}else {
//					this.getDataEntityRuntime().setFieldValue(iEntityBase, entry.getValue(), value);
//				}
			}

			this.getDataEntityRuntime().resetFieldValue(iEntityBase, this.getLocalStoragePSDEField(false));
		}
		else {
			Object key = this.getDataEntityRuntime().getFieldValue(iEntityBase, this.getDataEntityRuntime().getKeyPSDEField());
			Object name = null;
			if(this.getDataEntityRuntime().getMajorPSDEField()!=null) {
				name = this.getDataEntityRuntime().getFieldValue(iEntityBase, this.getDataEntityRuntime().getMajorPSDEField());
			}

			//进行存储
			ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
			String strParamKey = String.format("%1$s_%2$s", ACTIONSESSION_DYNAFIELDS_PREFIX, actionSession.getSessionId());
			Object dynaFields = actionSession.getActionParam(strParamKey);
			Map<String, Object> dynaFieldValueMap = null;
			if(dynaFields instanceof Map) {
				dynaFieldValueMap = (Map)dynaFields;
			}
			if(dynaFieldValueMap != null) {
				List<IEntityDTO> storageEntityList = new ArrayList<IEntityDTO>();
				for (IPSDEField iPSDEField : dynaPSDEFieldMap.values()) {
					if(!dynaFieldValueMap.containsKey(iPSDEField.getName())) {
						continue;
					}
					IEntityDTO storageEntity = this.getStorageDataEntityRuntime().createEntity();
					storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_NAME), iPSDEField.getName());
					storageEntity.set(getStorageEntityFieldName(PredefinedFieldType.PARENTID.value), key);
					storageEntity.set(getStorageEntityFieldName(PredefinedFieldType.PARENTTYPE.value), this.getDataEntityRuntime().getName());
					if(name != null) {
						storageEntity.set(getStorageEntityFieldName(PredefinedFieldType.PARENTNAME.value), name);
					}
					Object value = dynaFieldValueMap.get(iPSDEField.getName());
					this.setStorageEntityFieldValue(storageEntity, iPSDEField, value);
					storageEntityList.add(storageEntity);
				}
				if(!ObjectUtils.isEmpty(storageEntityList)) {
					try {
						this.getStorageDataEntityRuntime().rawSave(storageEntityList, false);
					}
					catch (Throwable ex) {
						throw new Exception(String.format("保存动态属性发生异常，%1$s", ex.getMessage()), ex);
					}
				}
			}

			//提取数据
			ISearchContextDTO searchContextDTO = this.getStorageDataEntityRuntime().createSearchContext();
			IPSDEField parentIdPSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID.value, false);
			searchContextDTO.eq(parentIdPSDEField.getName(), key);

			IPSDEField parentTypePSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
			searchContextDTO.eq(parentTypePSDEField.getName(), this.getDataEntityRuntime().getName());


			String strFieldName = getStorageEntityFieldName(PREDEFINEDFIELD_NAME);

			List<IEntityDTO> list = this.getStorageDataEntityRuntime().rawSelect(searchContextDTO);
			if(!ObjectUtils.isEmpty(list)) {
				for(IEntityDTO iEntityDTO : list) {

					String strName =  iEntityDTO.getString(strFieldName, null);
					if(ObjectUtils.isEmpty(strName)) {
						continue;
					}

					IPSDEField iPSDEField = dynaPSDEFieldMap.get(strName);
					if(iPSDEField == null) {
						this.getDataEntityRuntime().setFieldValue(iEntityBase, strName.toLowerCase(), this.getStorageEntityFieldValue(iEntityDTO));
					}else {
						this.getDataEntityRuntime().setFieldValue(iEntityBase, iPSDEField, this.getStorageEntityFieldValue(iEntityDTO, iPSDEField));
					}
				}
			}
		}
	}

	protected void setStorageEntityFieldValue(IEntityDTO storageEntity, IPSDEField iPSDEField, Object value) throws Exception {
		int nStdDataType = iPSDEField.getStdDataType();
		if(DataTypeUtils.isLongStringDataType(nStdDataType)) {
			storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_LONGSTRING_VALUE), DataTypeUtils.asString(value, null));
			return;
		}
		if(DataTypeUtils.isStringDataType(nStdDataType)) {
			storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_STRING_VALUE), DataTypeUtils.asString(value, null));
			return;
		}
		if(DataTypeUtils.isDateTimeDataType(nStdDataType)) {
			storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_DATETIME_VALUE), DataTypeUtils.asDateTime(value, null));
			return;
		}

		if(DataTypeUtils.isBigIntDataType(nStdDataType)) {
			storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_BIGINT_VALUE), DataTypeUtils.asBigInteger(value, null));
			return;
		}
		if(DataTypeUtils.isBigDecimalDataType(nStdDataType)) {
			storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_DECIMAL_VALUE), DataTypeUtils.asBigDecimal(value, null));
			return;
		}
		if(DataTypeUtils.isIntDataType(nStdDataType)) {
			storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_INT_VALUE), DataTypeUtils.asInteger(value, null));
			return;
		}
		if(DataTypeUtils.isDoubleDataType(nStdDataType)) {
			storageEntity.set(getStorageEntityFieldName(PREDEFINEDFIELD_DOUBLE_VALUE), DataTypeUtils.asDouble(value, null));
			return;
		}

		throw new Exception(String.format("未支持的数据类型[%1$s]", nStdDataType));
	}

	protected Object getStorageEntityFieldValue(IEntityDTO storageEntity, IPSDEField iPSDEField) throws Exception {
		int nStdDataType = iPSDEField.getStdDataType();
		if(DataTypeUtils.isLongStringDataType(nStdDataType)) {
			return storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_LONGSTRING_VALUE));
		}
		if(DataTypeUtils.isStringDataType(nStdDataType)) {
			return storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_STRING_VALUE));
		}
		if(DataTypeUtils.isDateTimeDataType(nStdDataType)) {
			return storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_DATETIME_VALUE));
		}

		if(DataTypeUtils.isBigIntDataType(nStdDataType)) {
			return storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_BIGINT_VALUE));
		}
		if(DataTypeUtils.isBigDecimalDataType(nStdDataType)) {
			return storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_DECIMAL_VALUE));
		}
		if(DataTypeUtils.isIntDataType(nStdDataType)) {
			return storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_INT_VALUE));
		}
		if(DataTypeUtils.isDoubleDataType(nStdDataType)) {
			return storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_DOUBLE_VALUE));
		}

		throw new Exception(String.format("未支持的数据类型[%1$s]", nStdDataType));
	}

	//缺省属性类型获取属性值
	protected Object getStorageEntityFieldValue(IEntityDTO storageEntity) throws Exception {
		Object objvalue = null;
		objvalue = storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_LONGSTRING_VALUE));
		if(!ObjectUtils.isEmpty(objvalue)) {
			return objvalue;
		}
		objvalue = storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_STRING_VALUE));
		if(!ObjectUtils.isEmpty(objvalue)) {
			return objvalue;
		}
		objvalue = storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_DATETIME_VALUE));
		if(!ObjectUtils.isEmpty(objvalue)) {
			return objvalue;
		}
		objvalue = storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_BIGINT_VALUE));
		if(!ObjectUtils.isEmpty(objvalue)) {
			return objvalue;
		}
		objvalue = storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_DECIMAL_VALUE));
		if(!ObjectUtils.isEmpty(objvalue)) {
			return objvalue;
		}
		objvalue = storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_INT_VALUE));
		if(!ObjectUtils.isEmpty(objvalue)) {
			return objvalue;
		}
		objvalue = storageEntity.get(getStorageEntityFieldName(PREDEFINEDFIELD_DOUBLE_VALUE));
		if(!ObjectUtils.isEmpty(objvalue)) {
			return objvalue;
		}
		return objvalue;
	}

	protected String getStorageEntityFieldName(String strType) {
		Map<String, IPSDEField> storagePSDEFieldMap = this.getStoragePSDEFieldMap();
		if(storagePSDEFieldMap != null) {
			IPSDEField iPSDEField = storagePSDEFieldMap.get(strType);
			if(iPSDEField!=null) {
				return iPSDEField.getName();
			}
		}

		return strType;
	}

	@Override
	public IPSDEField getStoragePSDEField(IPSDEField iPSDEField) throws Exception{
		int nStdDataType = iPSDEField.getStdDataType();
		if(DataTypeUtils.isLongStringDataType(nStdDataType)) {
			return getStoragePSDEField(PREDEFINEDFIELD_LONGSTRING_VALUE, false);
		}
		if(DataTypeUtils.isStringDataType(nStdDataType)) {
			return getStoragePSDEField(PREDEFINEDFIELD_STRING_VALUE, false);
		}
		if(DataTypeUtils.isDateTimeDataType(nStdDataType)) {
			return getStoragePSDEField(PREDEFINEDFIELD_DATETIME_VALUE, false);
		}

		if(DataTypeUtils.isBigIntDataType(nStdDataType)) {
			return getStoragePSDEField(PREDEFINEDFIELD_BIGINT_VALUE, false);
		}
		if(DataTypeUtils.isBigDecimalDataType(nStdDataType)) {
			return getStoragePSDEField(PREDEFINEDFIELD_DECIMAL_VALUE, false);
		}
		if(DataTypeUtils.isIntDataType(nStdDataType)) {
			return getStoragePSDEField(PREDEFINEDFIELD_INT_VALUE, false);
		}
		if(DataTypeUtils.isDoubleDataType(nStdDataType)) {
			return getStoragePSDEField(PREDEFINEDFIELD_DOUBLE_VALUE, false);
		}

		throw new Exception(String.format("未支持的数据类型[%1$s]", nStdDataType));
	}

	@Override
	public IPSDEField getStoragePSDEField(String strType, boolean tryMode) throws Exception{
		Map<String, IPSDEField> storagePSDEFieldMap = this.getStoragePSDEFieldMap();
		if(storagePSDEFieldMap != null) {
			IPSDEField iPSDEField = storagePSDEFieldMap.get(strType);
			if(iPSDEField!=null) {
				return iPSDEField;
			}
		}

		if(tryMode) {
			return null;
		}

		throw new Exception(String.format("无法获取动态存储类型[%1$s]对应的属性", strType));
	}


	@Override
	public void removeEntityDynaFieldsBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		try {
			this.onRemoveEntityDynaFieldsBeforeRemove(arg0, strActionName, iPSDEAction);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("行为[%1$s]处理后异常动态属性发生异常，%2$s", iPSDEAction!=null?iPSDEAction.getName():strActionName, ex.getMessage()), ex);
		}
	}

	protected void onRemoveEntityDynaFieldsBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {

		if(this.isLocalStorageMode()) {
			return;
		}

		Object key = null;
		if(arg0 instanceof IEntityBase) {
			key = this.getDataEntityRuntime().getFieldValue((IEntityBase)arg0, this.getDataEntityRuntime().getKeyPSDEField());
		}
		else
			key = arg0;

		//提取数据
		ISearchContextDTO searchContextDTO = this.getStorageDataEntityRuntime().createSearchContext();
		IPSDEField parentIdPSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID.value, false);
		searchContextDTO.eq(parentIdPSDEField.getName(), key);

		IPSDEField parentTypePSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
		searchContextDTO.eq(parentTypePSDEField.getName(), this.getDataEntityRuntime().getName());


		List<IEntityDTO> list = this.getStorageDataEntityRuntime().rawSelect(searchContextDTO);
		if(!ObjectUtils.isEmpty(list)) {
			List<Object> keyList = new ArrayList<Object>();
			for(IEntityDTO iEntityDTO : list) {
				keyList.add(iEntityDTO.get(this.getStorageDataEntityRuntime().getKeyPSDEField().getName()));
			}
			try {
				this.getStorageDataEntityRuntime().rawRemove(keyList, false);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("删除动态属性发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}


	@Override
	public void translateSearchContextDynaFieldsBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		try {
			this.onTranslateSearchContextDynaFieldsBeforeProceed(arg0, strDataSetName, iPSDEDataSet);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("数据集[%1$s]处理前转换动态属性发生异常，%2$s", iPSDEDataSet!=null?iPSDEDataSet.getName():strDataSetName, ex.getMessage()), ex);
		}
	}

	protected void onTranslateSearchContextDynaFieldsBeforeProceed(ISearchContextBase arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {

		Map<String, IPSDEField> dynaPSDEFieldMap = this.getDynaPSDEFields(arg0, strDataSetName, iPSDEDataSet);
		if(ObjectUtils.isEmpty(dynaPSDEFieldMap)) {
			return;
		}

		if(this.getDataEntityRuntime().getStorageMode() != DEStorageType.SQL.value
				|| this.getStorageDataEntityRuntime().getStorageMode()  != DEStorageType.SQL.value) {
			return;
		}

		ISearchContextDTO iSearchContextDTO = (ISearchContextDTO)arg0;

		this.translateSearchContextDynaFields(iSearchContextDTO, iSearchContextDTO, dynaPSDEFieldMap);
	}

	protected void translateSearchContextDynaFields(ISearchContextDTO iSearchContextDTO, ISearchGroupCond iSearchGroupCond, Map<String, IPSDEField> dynaPSDEFieldMap) throws Throwable {
		List<ISearchCond> searchCondList = iSearchGroupCond.getSearchConds();
		if(ObjectUtils.isEmpty(searchCondList)) {
			return;
		}

		if(this.isLocalStorageMode()) {
			String strKeyExpCode = this.getDataEntityRuntime().getFieldQueryExp(this.getLocalStoragePSDEField(false));

			List<ISearchCond> newSearchCondList = new ArrayList<ISearchCond>();
			for(ISearchCond iSearchCond : searchCondList) {
				if(iSearchCond instanceof ISearchFieldCond) {
					//判断是否为动态属性
					ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
					if(StringUtils.hasLength(iSearchFieldCond.getFieldName())) {
						IPSDEField dynaPSDEField = dynaPSDEFieldMap.get(iSearchFieldCond.getFieldName().toUpperCase());
						if(dynaPSDEField!=null) {

							//动态属性，替换为自定义查询
							SearchCustomCond searchCustomCond = new SearchCustomCond();

							//附加条件
							Object value = iSearchFieldCond.getValue();
							if(iSearchFieldCond.isParamMode() && value != null) {
								value = iSearchContextDTO.get(value.toString());
							}

							String strSql = getDBDialect().getConditionSQL(getDBDialect().getJsonExtractSQL(strKeyExpCode, this.isLowerCaseMode()?dynaPSDEField.getLowerCaseName():dynaPSDEField.getName())
									, dynaPSDEField.getStdDataType(), iSearchFieldCond.getCondOp(), value, false, null);

							searchCustomCond.setCustomCond(strSql);

							newSearchCondList.add(searchCustomCond);
							continue;
						}
					}
					newSearchCondList.add(iSearchCond);
					continue;
				}
				newSearchCondList.add(iSearchCond);
				if(iSearchCond instanceof ISearchGroupCond) {
					translateSearchContextDynaFields(iSearchContextDTO, (ISearchGroupCond)iSearchCond, dynaPSDEFieldMap);
					continue;
				}
			}

			iSearchGroupCond.getSearchConds().clear();
			iSearchGroupCond.getSearchConds().addAll(newSearchCondList);

		}
		else
		{
			String strKeyExpCode = this.getDataEntityRuntime().getFieldQueryExp(this.getDataEntityRuntime().getKeyPSDEField());
			IPSDEField parentIdPSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID.value, false);
			IPSDEField parentTypePSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);

			List<ISearchCond> newSearchCondList = new ArrayList<ISearchCond>();
			for(ISearchCond iSearchCond : searchCondList) {
				if(iSearchCond instanceof ISearchFieldCond) {
					//判断是否为动态属性
					ISearchFieldCond iSearchFieldCond = (ISearchFieldCond)iSearchCond;
					if(StringUtils.hasLength(iSearchFieldCond.getFieldName())) {
						IPSDEField dynaPSDEField = dynaPSDEFieldMap.get(iSearchFieldCond.getFieldName().toUpperCase());
						if(dynaPSDEField!=null) {

							IPSDEField storagePSDEField = getStoragePSDEField(dynaPSDEField);

							//动态属性，替换为自定义查询
							SearchCustomCond searchCustomCond = new SearchCustomCond();

							String strSql = String.format("SELECT 1 FROM %1$s WHERE %2$s = %1$s.%3$s AND %1$s.%4$s ='%5$s' AND ",
									getDBDialect().getDBObjStandardName(this.getStorageDataEntityRuntime().getTableName()),
									strKeyExpCode, getDBDialect().getDBObjStandardName(parentIdPSDEField.getName()),
									getDBDialect().getDBObjStandardName(parentTypePSDEField.getName()), this.getDataEntityRuntime().getName());

							//附加条件
							Object value = iSearchFieldCond.getValue();
							if(iSearchFieldCond.isParamMode() && value != null) {
								value = iSearchContextDTO.get(value.toString());
							}

							strSql += getDBDialect().getConditionSQL(String.format("%1$s.%2$s", this.getStorageDataEntityRuntime().getTableName(), getDBDialect().getDBObjStandardName(storagePSDEField.getName()))
									, storagePSDEField.getStdDataType(), iSearchFieldCond.getCondOp(), value, false, null);

							searchCustomCond.setCustomCond(String.format("EXISTS(%1$s)", strSql));

							newSearchCondList.add(searchCustomCond);
							continue;
						}
					}
					newSearchCondList.add(iSearchCond);
					continue;
				}
				newSearchCondList.add(iSearchCond);
				if(iSearchCond instanceof ISearchGroupCond) {
					translateSearchContextDynaFields(iSearchContextDTO, (ISearchGroupCond)iSearchCond, dynaPSDEFieldMap);
					continue;
				}
			}

			iSearchGroupCond.getSearchConds().clear();
			iSearchGroupCond.getSearchConds().addAll(newSearchCondList);
		}
	}


	@Override
	public void translateEntityDynaFieldsAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		try {
			this.onTranslateEntityDynaFieldsAfterProceed(arg0, list, strDataSetName, iPSDEDataSet);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("数据集[%1$s]处理后转换动态属性发生异常，%2$s", iPSDEDataSet!=null?iPSDEDataSet.getName():strDataSetName, ex.getMessage()), ex);
		}
	}

	protected void onTranslateEntityDynaFieldsAfterProceed(ISearchContextBase arg0, List<? extends IEntityBase> list, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		Map<String, IPSDEField> dynaPSDEFieldMap = this.getDynaPSDEFields(arg0, strDataSetName, iPSDEDataSet);
		if(ObjectUtils.isEmpty(dynaPSDEFieldMap)) {
			dynaPSDEFieldMap = new HashMap<>();
		}
		this.fillEntityDTODynaFields(arg0, (List<IEntityDTO>)list, dynaPSDEFieldMap);

	}



	protected void fillEntityDTODynaFields(ISearchContextBase arg0, List<? extends IEntityDTO> list, Map<String, IPSDEField> dynaPSDEFieldMap) throws Throwable {

		if(ObjectUtils.isEmpty(list)) {
			return;
		}

		if(this.isLocalStorageMode()) {
			for(IEntityDTO iEntityDTO : list) {

				Object dynaStorage = this.getDataEntityRuntime().getFieldValue(iEntityDTO, this.getLocalStoragePSDEField(false));
				Map<String, Object> dynaFieldValueMap = null;
				if(dynaStorage != null) {
					dynaFieldValueMap = JsonUtils.asMap(dynaStorage);
				}
				for(java.util.Map.Entry<String, IPSDEField> entry : dynaPSDEFieldMap.entrySet()) {
					Object value = null ;
					if (isLowerCaseMode()){
						value = (dynaFieldValueMap != null)?dynaFieldValueMap.get(entry.getValue().getLowerCaseName()):null;
						if(value == null) {
							value = (dynaFieldValueMap != null)?dynaFieldValueMap.get(entry.getKey()):null;
						}
					}else {
						value = (dynaFieldValueMap != null)?dynaFieldValueMap.get(entry.getKey()):null;
					}
					value = this.getDataEntityRuntime().convertEntityDTOFieldValue(entry.getKey().toLowerCase(), value);
					this.getDataEntityRuntime().setFieldValue(iEntityDTO, entry.getValue(), value);
					
//					IPSDEMethodDTOField iPSDEMethodDTOField = this.getDataEntityRuntime().getDefaultPSDEMethodDTO().getPSDEMethodDTOField(entry.getKey().toLowerCase(),true);
//					if(iPSDEMethodDTOField !=null && (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType())
//							||DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType()))) {
//						if(value != null) {
//							if(iPSDEMethodDTOField.getRefPSDataEntity() != null) {
//								IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
//								if(DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
//									if(iPSDEMethodDTOField.isListMap()) {
//
//										if(!(value instanceof Map)) {
//											//执行序列化，此处代码有问题
//											value = refDataEntityRuntime.getSystemRuntime().deserialize(value, Map.class);
//										}
//
//										Map srcMap = (Map)value;
//										Map dtoMap = new LinkedHashMap();
//										for(Object key : srcMap.keySet()) {
//											IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), srcMap.get(key));
//											dtoMap.put(key, iDEMethodDTO);
//										}
//
//										this.getDataEntityRuntime().setFieldValue(iEntityDTO, entry.getValue(), dtoMap);
//									}
//									else {
//										//列表模式
//										if(!(value instanceof List)) {
//											value = refDataEntityRuntime.getSystemRuntime().deserialize(value, List.class);
//											//throw new DataEntityRuntimeException(this.getDEMethodDTORuntime().getDataEntityRuntime(), this.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
//										}
//
//										List srclist = (List)value;
//										List dtoList=  new ArrayList();
//										for(Object item : srclist) {
//											IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), item);
//											dtoList.add(iDEMethodDTO);
//
//										}
//										this.getDataEntityRuntime().setFieldValue(iEntityDTO, entry.getValue(), dtoList);
//									}
//								}
//								else {
//
//									if(!(value instanceof Map) && !(value instanceof IEntity)) {
//										//执行序列化，此处代码有问题
//										value = refDataEntityRuntime.getSystemRuntime().deserialize(value, Map.class);
//									}
//
//
//									IDEMethodDTO iDEMethodDTO = refDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTOField.getRefPSDEMethodDTOMust(), value);
//									this.getDataEntityRuntime().setFieldValue(iEntityDTO, entry.getValue(), iDEMethodDTO);
//								}
//							}
//						}
//
//					}else {
//						this.getDataEntityRuntime().setFieldValue(iEntityDTO, entry.getValue(), value);
//					}

				}
				this.getDataEntityRuntime().resetFieldValue(iEntityDTO, this.getLocalStoragePSDEField(false));
			}
		}
		else {
			String strKeyName = this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName();

			Map<Object, IEntityDTO> entityDTOMap = new LinkedHashMap<Object, IEntityDTO>();
			for(IEntityDTO iEntityDTO : list) {
				Object objKeyValue = iEntityDTO.get(strKeyName);
				if(ObjectUtils.isEmpty(objKeyValue)) {
					//throw new Exception(String.format("传入数据未指定主键"));
					continue;
				}
				entityDTOMap.put(objKeyValue, iEntityDTO);
			}

			if(ObjectUtils.isEmpty(entityDTOMap)) {
				return;
			}

			IPSDEField parentIdPSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID.value, false);
			IPSDEField parentTypePSDEField = this.getStorageDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);

			ISearchContextDTO iSearchContextDTO = this.getStorageDataEntityRuntime().createSearchContext();
			iSearchContextDTO.all().count(false);
			if(entityDTOMap.size()==1) {
				this.getStorageDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentIdPSDEField, Conditions.EQ, entityDTOMap.keySet().iterator().next());
			}
			else {
				this.getStorageDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentIdPSDEField, Conditions.IN, entityDTOMap.keySet());
			}

			if(parentTypePSDEField != null) {
				this.getStorageDataEntityRuntime().setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, this.getDataEntityRuntime().getName());
			}

			String strFieldName = getStorageEntityFieldName(PREDEFINEDFIELD_NAME);

			List<IEntityDTO> allList = this.getStorageDataEntityRuntime().rawSelect(iSearchContextDTO);
			if(!ObjectUtils.isEmpty(allList)) {
				for(IEntityDTO iEntityDTO : allList) {

					String strName =  iEntityDTO.getString(strFieldName, null);
					if(ObjectUtils.isEmpty(strName)) {
						continue;
					}

					IPSDEField iPSDEField = dynaPSDEFieldMap.get(strName);
//					if(iPSDEField == null) {
//						continue;
//					}

					IEntityBase iEntityBase = entityDTOMap.get(iEntityDTO.get(parentIdPSDEField.getLowerCaseName()));
					if(iEntityBase == null) {
						continue;
					}
					if(iPSDEField == null){
						this.getDataEntityRuntime().setFieldValue(iEntityBase, strName.toLowerCase(), this.getStorageEntityFieldValue(iEntityDTO));
					}else {
						this.getDataEntityRuntime().setFieldValue(iEntityBase, iPSDEField, this.getStorageEntityFieldValue(iEntityDTO, iPSDEField));
					}
				}
			}
		}
	}
}
