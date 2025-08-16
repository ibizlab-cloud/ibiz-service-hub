package net.ibizsys.central.dataentity.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.PSModelEnums.DEUtilType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.PSModelEnums.SortDir;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.runtime.dataentity.DEStorageModes;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class DEVersionControlUtilRuntimeBase extends DEUtilRuntimeBase implements IDEVersionControlUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEVersionControlUtilRuntimeBase.class);

	private IDataEntityRuntime versionDataEntityRuntime = null;
	private Map<String, IPSDEField> versionPSDEFieldMap = null;
	private String strInterProcessMutexTag = null;
	private boolean bAutoCommit = false;
	private IPSDEField versionIdPSDEField = null;
	private IPSDEField versionPSDEField = null;

	@Override
	protected void onInit() throws Exception {
		
		this.setAutoCommit(this.getUtilParam(PARAM_AUTOCOMMIT, this.isAutoCommit()));
		
		if (this.getVersionDataEntityRuntime(true) == null) {
			this.prepareVersionDataEntityRuntime();
			this.getVersionDataEntityRuntime(false);
		}

		this.setVersionPSDEField(this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.VERSION, true));
		this.setVersionIdPSDEField(this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.VERSIONID, false));
		this.strInterProcessMutexTag = KeyValueUtils.genUniqueId(DEUtilType.VERSIONCONTROL.value, this.getSystemRuntime().getDeploySystemId(), this.getDataEntityRuntime().getPSDataEntity().getId(), this.getPSDEUtil().getId());

		super.onInit();
	}
	
	protected String getInterProcessMutexTag() {
		return this.strInterProcessMutexTag;
	}

	protected void prepareVersionDataEntityRuntime() throws Exception {
		IPSDataEntity utilPSDataEntity = this.getPSDEUtil().getUtilPSDE();
		if (utilPSDataEntity == null) {
			throw new Exception(String.format("未指定版本实体"));
		}

		IDataEntityRuntime versionDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(utilPSDataEntity.getId());
		this.setVersionDataEntityRuntime(versionDataEntityRuntime);

		this.setVersionPSDEFieldMap(this.fillVersionPSDEFieldMap(null));

		String[] fields = new String[] { PredefinedFieldType.VERSION.value, PREDEFINEDFIELD_DATA, PredefinedFieldType.PARENTID.value };
		for (String strField : fields) {
			this.getVersionPSDEField(strField, false);
		}
	}

	protected Map<String, IPSDEField> fillVersionPSDEFieldMap(Map<String, IPSDEField> versionPSDEFieldMap) throws Exception {
		if (versionPSDEFieldMap == null) {
			versionPSDEFieldMap = new HashMap<String, IPSDEField>();
		}

		String[] fields = new String[] { PREDEFINEDFIELD_NAME, PredefinedFieldType.VERSION.value, PREDEFINEDFIELD_DATA, PREDEFINEDFIELD_MANUAL, PREDEFINEDFIELD_CURRENT, PREDEFINEDFIELD_RESTORABLE, PREDEFINEDFIELD_MESSAGE };
		for (String strField : fields) {
			if (!versionPSDEFieldMap.containsKey(strField)) {
				versionPSDEFieldMap.put(strField, null);
			}
		}

		IDataEntityRuntime versionDataEntityRuntime = this.getVersionDataEntityRuntime();
		IPSDataEntity utilPSDataEntity = versionDataEntityRuntime.getPSDataEntity();

		// 先尝试获取关系
		IPSDERBase iPSDERBase = null;
		java.util.List<IPSDERBase> minorPSDERBaseList = utilPSDataEntity.getMinorPSDERs();
		if (!ObjectUtils.isEmpty(minorPSDERBaseList)) {
			for (IPSDERBase item : minorPSDERBaseList) {
				if (item.getMajorPSDataEntityMust().getId().equalsIgnoreCase(this.getDataEntityRuntime().getPSDataEntity().getId())) {
					if (!DERType.DER1N.value.equalsIgnoreCase(item.getDERType()) && !DERType.DERCUSTOM.value.equalsIgnoreCase(item.getDERType())) {
						continue;
					}
					if (iPSDERBase == null) {
						iPSDERBase = item;
					} else {
						log.warn(String.format("实体[%1$s]与实体[%2$s]存在多个关系，忽略默认计算", this.getDataEntityRuntime().getName(), utilPSDataEntity.getName()));
						iPSDERBase = null;
						break;
					}
				}
			}
		}
		if (iPSDERBase != null) {
			// 根据关系类型展开
			if (iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				versionPSDEFieldMap.put(PredefinedFieldType.PARENTID.value, iPSDER1N.getPSPickupDEFieldMust());
				if (iPSDER1N.getPSPickupTextDEField() != null) {
					versionPSDEFieldMap.put(PredefinedFieldType.PARENTNAME.value, iPSDER1N.getPSPickupTextDEField());
				}
			} else if (iPSDERBase instanceof IPSDERCustom) {
				IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
				if (iPSDERCustom.getPickupPSDEField() != null) {
					versionPSDEFieldMap.put(PredefinedFieldType.PARENTID.value, iPSDERCustom.getPickupPSDEField());
				}
				if (iPSDERCustom.getPickupTextPSDEField() != null) {
					versionPSDEFieldMap.put(PredefinedFieldType.PARENTNAME.value, iPSDERCustom.getPickupTextPSDEField());
				}
				IPSDEField parentType = versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, true);
				if (parentType != null) {
					versionPSDEFieldMap.put(PredefinedFieldType.PARENTTYPE.value, parentType);
				}
			} else
				throw new Exception(String.format("无法识别的关系类型[%1$s]", iPSDERBase.getDERType()));
		} else {
			versionPSDEFieldMap.put(PredefinedFieldType.PARENTID.value, versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID.value, false));
			versionPSDEFieldMap.put(PredefinedFieldType.PARENTTYPE.value, versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false));
			versionPSDEFieldMap.put(PredefinedFieldType.PARENTNAME.value, versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTNAME.value, true));
		}

		versionPSDEFieldMap.put(PredefinedFieldType.VERSION.value, versionDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.VERSION.value, true));

		java.util.List<IPSDEField> psDEFieldList = versionDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		if (!ObjectUtils.isEmpty(psDEFieldList)) {
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!StringUtils.hasLength(iPSDEField.getFieldTag())) {
					continue;
				}
				String strTag = iPSDEField.getFieldTag().toUpperCase();
				if (!versionPSDEFieldMap.containsKey(strTag)) {
					continue;
				}

				if (versionPSDEFieldMap.get(strTag) == null) {
					versionPSDEFieldMap.put(strTag, iPSDEField);
				}
			}

			for (IPSDEField iPSDEField : psDEFieldList) {
				String strTag = iPSDEField.getName().toUpperCase();
				if (!versionPSDEFieldMap.containsKey(strTag)) {
					continue;
				}

				if (versionPSDEFieldMap.get(strTag) == null) {
					versionPSDEFieldMap.put(strTag, iPSDEField);
				}
			}
		}

		if (versionPSDEFieldMap.get(PREDEFINEDFIELD_NAME) == null) {
			if (versionDataEntityRuntime.getMajorPSDEField() != null) {
				versionPSDEFieldMap.put(PREDEFINEDFIELD_NAME, versionDataEntityRuntime.getMajorPSDEField());
			}
		}

		return versionPSDEFieldMap;
	}

	@Override
	public IDataEntityRuntime getVersionDataEntityRuntime() {
		try {
			return this.getVersionDataEntityRuntime(false);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, ex.getMessage(), ex);
		}
	}

	protected IDataEntityRuntime getVersionDataEntityRuntime(boolean tryMode) throws Exception {
		if (this.versionDataEntityRuntime != null || tryMode) {
			return this.versionDataEntityRuntime;
		}
		throw new Exception(String.format("版本实体运行时对象无效"));
	}

	protected void setVersionDataEntityRuntime(IDataEntityRuntime versionDataEntityRuntime) {
		this.versionDataEntityRuntime = versionDataEntityRuntime;
	}

	protected Map<String, IPSDEField> getVersionPSDEFieldMap() {
		return versionPSDEFieldMap;
	}

	protected void setVersionPSDEFieldMap(Map<String, IPSDEField> versionPSDEFieldMap) {
		this.versionPSDEFieldMap = versionPSDEFieldMap;
	}

	@Override
	public Object commit(IEntityBase iEntityBase, Object versionData) {
		return this.commit(iEntityBase, versionData, false);
	}

	@Override
	public Object commit(IEntityBase iEntityBase, Object versionData, boolean bManual) {
		Assert.notNull(iEntityBase, "未传入数据对象");
		Assert.notNull(versionData, "未传入版本数据对象");
		try {
			return onCommit(iEntityBase, versionData, bManual);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("提交版本发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onCommit(IEntityBase iEntityBase, Object versionData, boolean bManual) throws Throwable {

		Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityBase);
		if (ObjectUtils.isEmpty(key)) {
			throw new Exception("数据对象中未包含键值");
		}
		
		Object versionId = this.getVersionDataEntityRuntime().getKeyFieldValue((IEntityBase)versionData);
		if (ObjectUtils.isEmpty(versionId)) {
			throw new Exception("版本数据对象中未包含键值");
		}
		
		IEntityBase last = bManual?iEntityBase:this.getDataEntityRuntime().getLastEntity();
		if(last != null) {
			Object lastVersionId = this.getDataEntityRuntime().getFieldValue(last, this.getVersionIdPSDEField(false));
			if(ObjectUtils.isEmpty(lastVersionId)) {
				//恢复版本
				this.fixCommit(key, iEntityBase, last);
			}
		}
		
		if (true) {
			Object lastVersionId = this.getDataEntityRuntime().getFieldValue(iEntityBase, this.getVersionIdPSDEField(false));

			java.util.List<IPSDERBase> psDERBaseList = this.getDataEntityRuntime().getPSDataEntity().getMajorPSDERs();
			if (!ObjectUtils.isEmpty(psDERBaseList)) {
				for (IPSDERBase iPSDERBase : psDERBaseList) {

					IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId(), false);
					if (refDataEntityRuntime.getStorageMode() == DEStorageModes.NONE) {
						continue;
					}

					IPSDEField pickupPSDEField = null;
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						if ((iPSDER1N.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value) {
							pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
						}
					} else if (iPSDERBase instanceof IPSDERCustom) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
						if (((iPSDERCustom.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value) 
								&& (refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType()))){
							pickupPSDEField = iPSDERCustom.getPickupPSDEField();
						}
					} else
						continue;

					if (pickupPSDEField == null) {
						continue;
					}

					final IDEVersionStorageUtilRuntime iDEVersionStorageUtilRuntime = refDataEntityRuntime.getDEVersionStorageUtilRuntime();
					if(iDEVersionStorageUtilRuntime == null) {
						throw new Exception(String.format("实体[%1$s]未提供版本数据存储功能组件", refDataEntityRuntime.getName()));
					}
					
					iDEVersionStorageUtilRuntime.commit(iEntityBase, iPSDERBase, lastVersionId);
				}
			}
		}

		IEntityDTO versionDTO = (IEntityDTO) ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return doCommitReal(key, iEntityBase, versionData, bManual);
			}
		}, null, this.getInterProcessMutexTag(), key.toString(), ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

		// 写回到iEntityBase
		// IPSDEField versionIdPSDEField = this.getVersionIdPSDEField(true);
		IPSDEField versionPSDEField = this.getMajorVersionPSDEField(true);
		if(bManual) {
			IEntityDTO temp = this.getDataEntityRuntime().createEntity();
			temp.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			temp.set(this.getVersionIdPSDEField(false).getLowerCaseName(), versionId);
			if (versionPSDEField != null) {
				Object version = versionDTO.get(this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false).getLowerCaseName());
				if (versionPSDEField != null) {
					temp.set(versionPSDEField.getLowerCaseName(), version);
				}
			}
			//快速更新
			this.getDataEntityRuntime().rawUpdate(Arrays.asList(temp), false);
		}
		else {
			if (versionPSDEField != null) {
				Object version = versionDTO.get(this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false).getLowerCaseName());
				if (versionPSDEField != null) {
					this.getDataEntityRuntime().setFieldValue(iEntityBase, versionPSDEField, version);
				}
			}
		}
		

		return versionDTO;
	}

	protected Object doCommitReal(Object key, IEntityBase iEntityBase, Object versionData, boolean bManual) throws Throwable {
		IPSDEField versionIdPSDEField = this.getVersionIdPSDEField(true);
		// 当前实体版本号属性
		Object lastVersionId = null;

		IPSDEField parentIdPSDEField = this.getVersionPSDEField(PredefinedFieldType.PARENTID.value, false);
		IPSDEField dataPSDEField = this.getVersionPSDEField(PREDEFINEDFIELD_DATA, false);
		IPSDEField versionPSDEField = this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false);
		IPSDEField typePSDEField = this.getVersionPSDEField(PredefinedFieldType.PARENTTYPE.value, true);
		IPSDEField manualPSDEField = this.getVersionPSDEField(PREDEFINEDFIELD_MANUAL, true);
		IPSDEField namePSDEField = this.getVersionPSDEField(PREDEFINEDFIELD_NAME, true);
		IPSDEField currentPSDEField = this.getVersionPSDEField(PREDEFINEDFIELD_CURRENT, true);

		IEntityBase last = bManual ? iEntityBase : this.getDataEntityRuntime().getLastEntity();

		// 查出当前版本号
		ISearchContextDTO iSearchContextDTO = this.getVersionDataEntityRuntime().createSearchContext();
		iSearchContextDTO.limit(1).count(false);

		iSearchContextDTO.eq(parentIdPSDEField.getLowerCaseName(), key);

		if (typePSDEField != null) {
			iSearchContextDTO.eq(typePSDEField.getLowerCaseName(), this.getDataEntityRuntime().getName());
		}

		this.getVersionDataEntityRuntime().setSearchSort(iSearchContextDTO, versionPSDEField, SortDir.DESC.value);

		List<IEntityDTO> list = this.getVersionDataEntityRuntime().selectDataQuery(this.getVersionDataEntityRuntime().getDefaultPSDEDataQuery(), iSearchContextDTO);
		IEntityDTO item = null;
		if (!ObjectUtils.isEmpty(list)) {
			item = list.get(0);
		}

		int nVer = (item == null) ? 0 : item.getInteger(versionPSDEField.getName(), 0);
		if (nVer < 0) {
			nVer = 0;
		}

		if (last != null) {
			if (versionIdPSDEField != null) {
				lastVersionId = this.getDataEntityRuntime().getFieldValue(last, versionIdPSDEField);
			}
		}
		if (ObjectUtils.isEmpty(lastVersionId) && item != null) {
			lastVersionId = this.getVersionDataEntityRuntime().getKeyFieldValue(item);
		}

		if (!ObjectUtils.isEmpty(lastVersionId) && last != null) {
			// 写入上一次数据
			IEntityDTO iEntityDTO = this.getVersionDataEntityRuntime().createEntity();
			iEntityDTO.set(this.getVersionDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), lastVersionId);
			iEntityDTO.set(dataPSDEField.getName(), this.getDataEntityRuntime().serializeEntity(last));
			if (currentPSDEField != null) {
				iEntityDTO.set(currentPSDEField.getName(), EntityBase.BOOLEAN_FALSE);
			}
			this.getVersionDataEntityRuntime().rawUpdate(Arrays.asList(iEntityDTO), false);
		}

		IEntityDTO iEntityDTO = (IEntityDTO) versionData;
		iEntityDTO.set(versionPSDEField.getName(), nVer + 1);
		if (namePSDEField != null) {
			iEntityDTO.set(namePSDEField.getName(), String.format("v%1$s", nVer + 1));
		}
		this.getVersionDataEntityRuntime().rawCreate(Arrays.asList(iEntityDTO), false);
		return iEntityDTO;
	}
	
	@Override
	public Object fixCommit(IEntityBase iEntityBase, Object versionData, boolean bManual) {
		Assert.notNull(iEntityBase, "未传入数据对象");
		Assert.notNull(versionData, "未传入版本数据对象");
		try {
			return onFixCommit(iEntityBase, versionData, bManual);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("修复提交版本发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Object onFixCommit(IEntityBase iEntityBase, Object versionData, boolean bManual) throws Throwable {
		Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityBase);
		Object fixedVersionId = this.getVersionDataEntityRuntime().getKeyFieldValue((IEntityBase)versionData);
		
		IEntityBase last = bManual?iEntityBase:this.getDataEntityRuntime().getLastEntity();
		if(last != null) {
			Object lastVersionId = this.getDataEntityRuntime().getFieldValue(last, this.getVersionIdPSDEField(false));
			if(!ObjectUtils.isEmpty(lastVersionId)) {
				throw new Exception("数据已存在版本标识");
			}
		}
		
		IEntityDTO temp = this.getDataEntityRuntime().createEntity();
		temp.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
		temp.set(this.getVersionIdPSDEField(false).getLowerCaseName(), fixedVersionId);
		
		IEntityDTO versionDTO = (IEntityDTO) ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return doCommitReal(key, temp, versionData, false);
			}
		}, null, this.getInterProcessMutexTag(), key.toString(), ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
		
		//系统更新主数据
		IPSDEField versionPSDEField = this.getMajorVersionPSDEField(true);
		if (versionPSDEField != null) {
			Object version = versionDTO.get(this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false).getLowerCaseName());
			if (versionPSDEField != null) {
				temp.set(versionPSDEField.getLowerCaseName(), version);
			}
		}
		//快速更新
		this.getDataEntityRuntime().rawUpdate(Arrays.asList(temp), true);
		
		//修改Last数据
		this.getDataEntityRuntime().setFieldValue(last, this.getVersionIdPSDEField(false), fixedVersionId);
		if(last != iEntityBase) {
			this.getDataEntityRuntime().setFieldValue(iEntityBase, this.getVersionIdPSDEField(false), fixedVersionId);
		}
		
		if (versionPSDEField != null) {
			Object version = versionDTO.get(this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false).getLowerCaseName());
			this.getDataEntityRuntime().setFieldValue(last, versionPSDEField, version);
			if(last != iEntityBase) {
				this.getDataEntityRuntime().setFieldValue(iEntityBase, versionPSDEField, version);
			}
		}
		
		return versionData;
	}
	
	protected Object fixCommit(Object key, IEntityBase iEntityBase, IEntityBase last) throws Throwable {
		IEntityDTO fixedVersionDTO = (IEntityDTO)this.prepare(last, DEActions.CREATE, this.getDataEntityRuntime().getPSDEAction(DEActions.CREATE));
		Object fixedVersionId = this.getVersionDataEntityRuntime().getKeyFieldValue(fixedVersionDTO);
		
		IEntityDTO temp = this.getDataEntityRuntime().createEntity();
		temp.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
		temp.set(this.getVersionIdPSDEField(false).getLowerCaseName(), fixedVersionId);
		
		IEntityDTO versionDTO = (IEntityDTO) ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return doCommitReal(key, temp, fixedVersionDTO, false);
			}
		}, null, this.getInterProcessMutexTag(), key.toString(), ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
		
		//系统更新主数据
		IPSDEField versionPSDEField = this.getMajorVersionPSDEField(true);
		if (versionPSDEField != null) {
			Object version = versionDTO.get(this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false).getLowerCaseName());
			if (versionPSDEField != null) {
				temp.set(versionPSDEField.getLowerCaseName(), version);
			}
		}
		//快速更新
		this.getDataEntityRuntime().rawUpdate(Arrays.asList(temp), true);
		
		//修改Last数据
		this.getDataEntityRuntime().setFieldValue(last, this.getVersionIdPSDEField(false), fixedVersionId);
		this.getDataEntityRuntime().setFieldValue(iEntityBase, this.getVersionIdPSDEField(false), fixedVersionId);
		if (versionPSDEField != null) {
			Object version = versionDTO.get(this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false).getLowerCaseName());
			this.getDataEntityRuntime().setFieldValue(last, versionPSDEField, version);
			this.getDataEntityRuntime().setFieldValue(iEntityBase, versionPSDEField, version);
		}
		
		return fixedVersionDTO;
	}

	protected IPSDEField getVersionPSDEField(String strType, boolean tryMode) throws Exception {
		Map<String, IPSDEField> versionPSDEFieldMap = this.getVersionPSDEFieldMap();
		if (versionPSDEFieldMap != null) {
			IPSDEField iPSDEField = versionPSDEFieldMap.get(strType);
			if (iPSDEField != null) {
				return iPSDEField;
			}
		}

		if (tryMode) {
			return null;
		}

		throw new Exception(String.format("无法获取属性标记[%1$s]对应的属性", strType));
	}

	public boolean isAutoCommit() {
		return this.bAutoCommit;
	}
	
	protected void setAutoCommit(boolean bAutoCommit) {
		this.bAutoCommit = bAutoCommit;
	}

	@Override
	public boolean isCommit(String strActionName, IPSDEAction iPSDEAction) {
		if (iPSDEAction != null) {
			if (DEActionModes.CREATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			if (isAutoCommit() && DEActionModes.UPDATE.equals(iPSDEAction.getActionMode())) {
				return true;
			}
			return false;
		}

		if (DEActions.CREATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		if (isAutoCommit() && DEActions.UPDATE.equalsIgnoreCase(strActionName)) {
			return true;
		}

		return false;
	}

	@Override
	public Object prepare(IEntityBase iEntityBase, String strActionName, IPSDEAction iPSDEAction) {
		Assert.notNull(iEntityBase, "未传入数据对象");
		try {
			return onPrepare(iEntityBase, null, strActionName, iPSDEAction, false);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("准备版本发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	@Override
	public Object prepare(IEntityBase iEntityBase, Object versionData) {
		Assert.notNull(iEntityBase, "未传入数据对象");
		Assert.notNull(iEntityBase, "未传入版本数据对象");
		try {
			return onPrepare(iEntityBase, versionData, null, null, true);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("准备版本发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	

	protected Object onPrepare(IEntityBase iEntityBase, Object versionData, String strActionName, IPSDEAction iPSDEAction, boolean bManual) throws Throwable {

		Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityBase);
		if (ObjectUtils.isEmpty(key)) {
			throw new Exception("数据对象中未包含键值");
		}

		IPSDEField versionIdPSDEField = this.getVersionIdPSDEField(false);

		IPSDEField parentIdPSDEField = this.getVersionPSDEField(PredefinedFieldType.PARENTID.value, false);
		IPSDEField typePSDEField = this.getVersionPSDEField(PredefinedFieldType.PARENTTYPE.value, true);
		IPSDEField manualPSDEField = this.getVersionPSDEField(PREDEFINEDFIELD_MANUAL, true);
		IPSDEField currentPSDEField = this.getVersionPSDEField(PREDEFINEDFIELD_CURRENT, true);

		IEntityDTO iEntityDTO = (versionData != null)? (IEntityDTO)versionData: this.getVersionDataEntityRuntime().createEntity();
		iEntityDTO.set(parentIdPSDEField.getName(), key);
		if (typePSDEField != null) {
			iEntityDTO.set(typePSDEField.getName(), this.getDataEntityRuntime().getName());
		}
		if (manualPSDEField != null) {
			iEntityDTO.set(manualPSDEField.getName(), bManual ? EntityBase.BOOLEAN_TRUE : EntityBase.BOOLEAN_FALSE);
		}
		if (currentPSDEField != null) {
			iEntityDTO.set(currentPSDEField.getName(), EntityBase.BOOLEAN_TRUE);
		}

		this.getVersionDataEntityRuntime().fillEntityKeyValue(iEntityDTO);

		if(!bManual) {
			this.getDataEntityRuntime().setFieldValue(iEntityBase, versionIdPSDEField, this.getVersionDataEntityRuntime().getKeyFieldValue(iEntityDTO));
		}

		return iEntityDTO;
	}
	
	@Override
	public Object restore(IEntityBase iEntityBase, Object restoreVersionId, Object versionData) {
		Assert.notNull(iEntityBase, "未传入数据对象");
		Assert.notNull(restoreVersionId, "未传入恢复版本标识");
		Assert.notNull(iEntityBase, "未传入版本数据对象");
		try {
			return onRestore(iEntityBase, restoreVersionId, versionData);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("恢复版本发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onRestore(IEntityBase iEntityBase, Object restoreVersionId, Object versionData) throws Throwable {
		Object key = this.getDataEntityRuntime().getKeyFieldValue(iEntityBase);
		if (ObjectUtils.isEmpty(key)) {
			throw new Exception("数据对象中未包含键值");
		}
		
		Object versionId = this.getVersionDataEntityRuntime().getKeyFieldValue((IEntityBase)versionData);
		if (ObjectUtils.isEmpty(versionId)) {
			throw new Exception("版本数据对象中未包含键值");
		}
		
		java.util.List<IPSDERBase> psDERBaseList = this.getDataEntityRuntime().getPSDataEntity().getMajorPSDERs();
		if (!ObjectUtils.isEmpty(psDERBaseList)) {
			for (IPSDERBase iPSDERBase : psDERBaseList) {

				IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId(), false);
				if (refDataEntityRuntime.getStorageMode() == DEStorageModes.NONE) {
					continue;
				}

				IPSDEField pickupPSDEField = null;
				if (iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
					if ((iPSDER1N.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value) {
						pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
					}
				} else if (iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
					if (((iPSDERCustom.getMasterRS() & DER1NMasterRS.VERSION.value) == DER1NMasterRS.VERSION.value) 
							&& (refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType()))){
						pickupPSDEField = iPSDERCustom.getPickupPSDEField();
					}
				} else
					continue;

				// 查出原有数据
				if (pickupPSDEField == null) {
					continue;
				}
				
				final IDEVersionStorageUtilRuntime iDEVersionStorageUtilRuntime = refDataEntityRuntime.getDEVersionStorageUtilRuntime();
				if(iDEVersionStorageUtilRuntime == null) {
					throw new Exception(String.format("实体[%1$s]未提供版本数据存储功能组件", refDataEntityRuntime.getName()));
				}
				
				iDEVersionStorageUtilRuntime.restore(iEntityBase, iPSDERBase, restoreVersionId);
			}
		}

		IEntityDTO versionDTO = (IEntityDTO) ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return doCommitReal(key, iEntityBase, versionData, true);
			}
		}, null, this.getInterProcessMutexTag(), key.toString(), ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

		
		IEntityDTO restoreEntity = (IEntityDTO)this.get(restoreVersionId);
		
		// 写回到iEntityBase
		IPSDEField versionPSDEField = this.getMajorVersionPSDEField(true);
		IEntityDTO temp = this.getDataEntityRuntime().createEntity();

		restoreEntity.copyTo(temp, true);
		//去除关系数据
		
		temp.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
		temp.set(this.getVersionIdPSDEField(false).getLowerCaseName(), versionId);
		if (versionPSDEField != null) {
			Object version = versionDTO.get(this.getVersionPSDEField(PredefinedFieldType.VERSION.value, false).getLowerCaseName());
			if (versionPSDEField != null) {
				temp.set(versionPSDEField.getLowerCaseName(), version);
			}
		}
		//快速更新
		this.getDataEntityRuntime().rawUpdate(Arrays.asList(temp), false);

		return versionDTO;
	}
	

	
	@Override
	public boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction, Object[] args) {
		if(args!=null && args.length >= 3 && ACTION_ARG_VERSIONID.equals(args[1])) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		Assert.notNull(args, "未传入调用参数");
		try {
			if(args!=null && args.length >= 3 && ACTION_ARG_VERSIONID.equals(args[1])) {
				return onExecuteAction(strActionName, iPSDEAction, args, actionData);
			}
			throw new Exception("调用参数格式无效");
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException) ex;
				if (dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("执行行为发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected Object onExecuteAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final String strRealActionName = iPSDEAction!=null?iPSDEAction.getName():strActionName;
		if(DEActions.GET.equalsIgnoreCase(strRealActionName)) {
			return this.get(args[2]);
		}
		
		throw new Exception(String.format("未支持的行为[%1$s]", strRealActionName));
	}
	
	
	
	@Override
	public IEntityBase get(Object objVersionId) throws Throwable {
		try {
			return this.onGet(objVersionId);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException.rethrow(this, ex);
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取版本数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IEntityBase onGet(Object objVersionId) throws Throwable {
		//获取传入数据
		Object versionId = DataTypeUtils.convert(this.getVersionDataEntityRuntime().getKeyPSDEField().getStdDataType(), objVersionId);
		IEntityDTO versionData = this.getVersionDataEntityRuntime().get(versionId);
		String strData = versionData.getString(this.getVersionPSDEField(PREDEFINEDFIELD_DATA, false).getLowerCaseName(), null);
		if(!StringUtils.hasLength(strData)) {
			//throw new Exception("数据无效");
			//临时调整为直接获取
			Object parentId = versionData.get(this.getVersionPSDEField(PredefinedFieldType.PARENTID.value, false).getLowerCaseName());
			return this.getDataEntityRuntime().get(parentId);
		}
		return this.getDataEntityRuntime().deserializeEntity(strData);
	}
	
	protected IPSDEField getMajorVersionPSDEField(boolean bTryMode) throws Exception {
		if (this.versionPSDEField != null || bTryMode) {
			return this.versionPSDEField;
		}
		throw new Exception(String.format("未定义版本号存储属性"));
	}

	protected void setVersionPSDEField(IPSDEField versionPSDEField) {
		this.versionPSDEField = versionPSDEField;
	}

	protected IPSDEField getVersionIdPSDEField(boolean bTryMode) throws Exception {
		if (this.versionIdPSDEField != null || bTryMode) {
			return this.versionIdPSDEField;
		}
		throw new Exception(String.format("未定义版本标识存储属性"));
	}

	protected void setVersionIdPSDEField(IPSDEField versionIdPSDEField) {
		this.versionIdPSDEField = versionIdPSDEField;
	}
	
	@Override
	public boolean isCurrentVersionId(Object key, Object objVersionId) {
		try {
			return this.onIsCurrentVersionId(key, objVersionId);
		} catch (Throwable ex) {
			if (ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException.rethrow(this, ex);
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("判断是否当前版本发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected boolean onIsCurrentVersionId(Object key, Object objVersionId) throws Throwable {
		//获取传入数据
		Object versionId = DataTypeUtils.convert(this.getVersionDataEntityRuntime().getKeyPSDEField().getStdDataType(), objVersionId);
		IEntityDTO versionData = this.getVersionDataEntityRuntime().get(versionId);
//		IPSDEField currentPSDEField = this.getVersionPSDEField(PREDEFINEDFIELD_CURRENT, true);
//		if(currentPSDEField != null) {
//			return versionData.getBoolean(currentPSDEField.getLowerCaseName(), false);
//		}
		String strData = versionData.getString(this.getVersionPSDEField(PREDEFINEDFIELD_DATA, false).getLowerCaseName(), null);
		return !StringUtils.hasLength(strData);
	}
}
