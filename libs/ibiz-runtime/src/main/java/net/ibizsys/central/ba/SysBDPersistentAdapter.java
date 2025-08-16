package net.ibizsys.central.ba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemPersistentAdapterBase;
import net.ibizsys.central.dataentity.DataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums.DEVirtualMode;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupObjectDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DEStorageModes;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.DEVirtualModes;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.action.CheckKeyStates;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.dataentity.defield.DEFPredefinedTypes;
import net.ibizsys.runtime.dataentity.service.DEMethodDTOFieldTypes;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.SqlParam;

/**
 * 系统大数据持久化视频器对象
 * 
 * @author lionlau
 *
 */
public class SysBDPersistentAdapter extends SystemPersistentAdapterBase implements ISysBDPersistentAdapter {

	private static final Log log = LogFactory.getLog(SysBDPersistentAdapter.class);
	
	private ISysBDSchemeRuntime iSysBDSchemeRuntime = null;

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, ISysBDSchemeRuntime iSysBDSchemeRuntime) throws Exception {
		Assert.notNull(iSysBDSchemeRuntime, "传入系统大数据体系无效");
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
		super.init(iSystemRuntimeContext);
	}

	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		return this.iSysBDSchemeRuntime;
	}

	@Override
	public String getBDType() {
		return getSysBDSchemeRuntime().getBDType();
	}

	@Override
	public Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.onCreate(iDataEntityRuntime, iPSDEAction, datas, inputFields, bGet, outputFields, bSysMode);
	}
	
	protected Object onCreate(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.onCreate(iDataEntityRuntime, iPSDEAction, iEntity, inputFields, bGet, outputFields, bSysMode);
	}

	protected Object onCreate(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		List<IPSDEField> psDEFieldList = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		if (ObjectUtils.isEmpty(psDEFieldList)) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("没有任何属性"));
		}

		Object objKeyValue = iEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
		

		if (!iDataEntityRuntime.isVirtual() || iDataEntityRuntime.getVirtualMode() == DEVirtualModes.MIXMINHERIT || iDataEntityRuntime.getVirtualMode() == DEVirtualModes.MIXMINHERITMERGE) {
			String strTableName = iDataEntityRuntime.getTableName();
			if (!StringUtils.hasLength(strTableName)) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("没有指定数据表名称"));
			}

			Map<String, Object> map = new HashMap<String, Object>();
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!iPSDEField.isPhisicalDEField()) {
					continue;
				}
				if (!iEntity.contains(iPSDEField.getLowerCaseName())) {
					continue;
				}
				Object objValue = iEntity.get(iPSDEField.getLowerCaseName());
				map.put(iPSDEField.getLowerCaseName(), objValue);
			}

			Map<String, Object> extParamMap = null;
			if (!bSysMode) {
				if (extParamMap == null) {
					extParamMap = new HashMap<String, Object>();
				}

				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.CREATEMAN, true);
				if (iPSDEField != null) {
					extParamMap.put(iPSDEField.getLowerCaseName(), this.getUserContext().getUserid());
				}
				iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.CREATEDATE, true);
				if (iPSDEField != null) {
					extParamMap.put(iPSDEField.getLowerCaseName(), new java.sql.Timestamp(System.currentTimeMillis()));
				}

				iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEMAN, true);
				if (iPSDEField != null) {
					extParamMap.put(iPSDEField.getLowerCaseName(), this.getUserContext().getUserid());
				}

				iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEDATE, true);
				if (iPSDEField != null) {
					extParamMap.put(iPSDEField.getLowerCaseName(), new java.sql.Timestamp(System.currentTimeMillis()));
				}
			}

			if (iDataEntityRuntime.isEnableLogicValid()) {
				if (extParamMap == null) {
					extParamMap = new HashMap<String, Object>();
				}
				extParamMap.put(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), iDataEntityRuntime.getValidLogicValue());
			}

			// 虚拟实体、继承实体 都要按照多表进行

			if (iDataEntityRuntime.isInheritMinor()) {
				// 继承从实体，需要先插入主表
				IDataEntityRuntime majorDataEntityRuntime = (IDataEntityRuntime) iDataEntityRuntime.getInheritDataEntityRuntime();

				IEntity majorEntity = majorDataEntityRuntime.createEntity();

				// 主键及主属性
				majorEntity.set(majorDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKeyValue);
				if (majorDataEntityRuntime.getMajorPSDEField() != null && iDataEntityRuntime.getMajorPSDEField() != null) {
					if (iEntity.contains(iDataEntityRuntime.getMajorPSDEField().getLowerCaseName())) {
						majorEntity.set(majorDataEntityRuntime.getMajorPSDEField().getLowerCaseName(), iEntity.get(iDataEntityRuntime.getMajorPSDEField().getLowerCaseName()));
					}
				}

				// 循环放入
				for (IPSDEField iPSDEField : psDEFieldList) {

					if (!iPSDEField.isLinkDEField()) {
						continue;
					}

					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (!DEFDataTypes.INHERIT.equals(iPSLinkDEField.getDataType())) {
						continue;
					}

					if (iEntity.contains(iPSLinkDEField.getLowerCaseName())) {
						majorEntity.set(iPSLinkDEField.getRelatedPSDEFieldMust().getLowerCaseName(), iEntity.get(iPSLinkDEField.getLowerCaseName()));
					}
				}

				// 强行放入类型属性
				if (majorDataEntityRuntime.getDataTypePSDEField() != null) {
					majorEntity.set(majorDataEntityRuntime.getDataTypePSDEField().getLowerCaseName(), this.getSystemRuntimeContext().getSystemRuntime().convertValue(majorDataEntityRuntime.getDataTypePSDEField().getStdDataType(), iDataEntityRuntime.getPSDERInherit().getTypeValue()));
				}

				this.create(majorDataEntityRuntime, null, majorEntity, null, false, null, bSysMode);
				if (objKeyValue == null) {
					objKeyValue = majorEntity.get(majorDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
				}
			}

			Object lastInsertId = this.executeInsert(strTableName, map, extParamMap, iDataEntityRuntime, iEntity, bSysMode);

			if (objKeyValue == null) {
				objKeyValue = map.get(iDataEntityRuntime.getKeyPSDEField().getName());
				if (objKeyValue == null) {
					objKeyValue = lastInsertId;
					// 设置会主键
					iEntity.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKeyValue);
				}
			}

			// 存储DTO成员数据
			if (true) {
				if (iEntity instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) iEntity;
					if (iEntityDTO.getDEMethodDTORuntime() != null) {
						List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
						if (psDEMethodDTOFieldList != null) {
							
							Object objNameValue = (iDataEntityRuntime.getMajorPSDEField()!=null)?iEntityDTO.get(iDataEntityRuntime.getMajorPSDEField().getLowerCaseName()):null;
							
							for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
								
								if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
									
									if(iPSDEMethodDTOField.getRefPSDataEntity() == null) {
										continue;
									}
									
									//进一步判断是外键值对象数据还是子数据
									IPSDEField iPSDEField = iPSDEMethodDTOField.getPSDEField();
									if (iPSDEField instanceof IPSPickupObjectDEField) {
										// 忽略
										continue;
									}

									//判断是否为继承属性
									if(iPSDEField instanceof IPSInheritDEField){
										if(((IPSInheritDEField)iPSDEField).getRealPSDataEntity()!=null && ((IPSInheritDEField)iPSDEField).getRealPSDataEntity().getDEType() != DETypes.ABSTRACT){
											continue;
										}
									}
									
									Object dtoData = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
									if (dtoData != null) {
										IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
										if (refDataEntityRuntime.getStorageMode() == DEStorageModes.NONE  && refDataEntityRuntime.getVirtualMode() != DEVirtualModes.MINHERIT) {
											continue;
										}
										if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
											Collection list = null;
											if( iPSDEMethodDTOField.isListMap()) {
												// MAP模式
												if (!(dtoData instanceof Map)) {
													throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
												
												list = ((Map) dtoData).values();
											}
											else {
												// 列表模式
												if (!(dtoData instanceof List)) {
													throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
												
												list = (List) dtoData;
											}
											IPSDEField pickupPSDEField = null;
//											IPSDEField parentTypePSDEField = null;
//											IPSDEField parentNamePSDEField = null;
//											IPSDEField parentSubTypePSDEField = null;
//											String strParentSubType = null;
											IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
											if (iPSDERBase == null && iPSDEField != null && DEFDataTypes.INHERIT.equals(iPSDEField.getDataType()) && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField() != null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER() != null) {
												iPSDERBase = iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER();
											}
											if (iPSDERBase == null) {
												throw new DataEntityRuntimeException(iDataEntityRuntime,  String.format("属性[%1$s]未指定嵌套数据主关系",iPSDEMethodDTOField.getName()));
											}
											
											if (iPSDERBase instanceof IPSDER1N) {
												pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
											} else if (iPSDERBase instanceof IPSDERCustom) {
												pickupPSDEField = ((IPSDERCustom) iPSDERBase).getPickupPSDEField();
//												if(refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED) {
//													parentTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
//													parentNamePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTNAME.value, true);
//													parentSubTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
//													if(parentSubTypePSDEField != null) {
//														strParentSubType = ((IPSDERCustom) iPSDERBase).getParentSubType();
//														if(!StringUtils.hasLength(strParentSubType)) {
//															strParentSubType = iPSDERBase.getMinorCodeName();
//														}
//													}
//												}
											}
											
											if (pickupPSDEField == null) {
												//throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]没有定义DTO连接属性", iPSDEMethodDTOField.getName()));
												log.warn(String.format("属性[%1$s]没有定义DTO连接属性，忽略默认处理", iPSDEMethodDTOField.getName()));
												continue;
											}
											
//											IPSDEField orderValuePSDEField = refDataEntityRuntime.getOrderValuePSDEField();
//											
//											int nOrderValue = 1;

											for (Object item : list) {
												if (item instanceof IEntity) {
													refDataEntityRuntime.setFieldValue((IEntity) item, pickupPSDEField, objKeyValue);
//													if(orderValuePSDEField!=null) {
//														refDataEntityRuntime.setFieldValue((IEntity) item, orderValuePSDEField, nOrderValue);
//														nOrderValue ++;
//													}
//													if(parentTypePSDEField!=null) {
//														refDataEntityRuntime.setFieldValue((IEntity) item, parentTypePSDEField, iDataEntityRuntime.getName());
//													}
//													if(parentSubTypePSDEField!=null) {
//														refDataEntityRuntime.setFieldValue((IEntity) item, parentSubTypePSDEField, strParentSubType);
//													}
//													if(parentNamePSDEField!=null) {
//														refDataEntityRuntime.setFieldValue((IEntity) item, parentNamePSDEField, objNameValue);
//													}
													
													refDataEntityRuntime.create((IEntity) item);
												} else {
													throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
											}

										} else {
											if (dtoData instanceof IEntity) {
												refDataEntityRuntime.setFieldValue((IEntity) dtoData, refDataEntityRuntime.getKeyPSDEField(), objKeyValue);
												refDataEntityRuntime.create((IEntity) dtoData);
											} else {
												throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (iDataEntityRuntime.isVirtual() && iDataEntityRuntime.getVirtualMode() != DEVirtualMode.MIXMINHERITMERGE.value) {

			java.util.List<IPSDERMultiInherit> psDERMultiInheritList = iDataEntityRuntime.getPSDERMultiInherits();
			for (IPSDERMultiInherit iPSDERMultiInherit : psDERMultiInheritList) {

				// 继承从实体，需要先插入主表
				IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDERMultiInherit.getMajorPSDataEntityMust().getId());

				IEntity majorEntity = majorDataEntityRuntime.createEntity();

				// 主键及主属性
				majorEntity.set(majorDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKeyValue);

				// 循环放入
				for (IPSDEField iPSDEField : psDEFieldList) {

					if (!iPSDEField.isLinkDEField()) {
						continue;
					}

					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (!DEFDataTypes.INHERIT.equals(iPSLinkDEField.getDataType())) {
						continue;
					}

					if (!iPSDERMultiInherit.getId().equals(iPSLinkDEField.getPSDERMust().getId())) {
						continue;
					}

					if (iEntity.contains(iPSLinkDEField.getLowerCaseName())) {
						majorEntity.set(iPSLinkDEField.getRelatedPSDEFieldMust().getLowerCaseName(), iEntity.get(iPSLinkDEField.getLowerCaseName()));
					}
				}

				// 检查主键状态
				boolean bCreate = true;
				if (objKeyValue != null) {
					bCreate = (this.checkKeyState(majorDataEntityRuntime, null, objKeyValue) == CheckKeyStates.OK);
				}
				if (bCreate) {
					this.create(majorDataEntityRuntime, null, majorEntity, null, false, null, bSysMode);
				} else {
					this.update(majorDataEntityRuntime, null, majorEntity, null, false, null, bSysMode);
				}

				if (objKeyValue == null) {
					objKeyValue = majorEntity.get(majorDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
				}
			}

		}

		if (bGet) {

			IPSDEDataQuery iPSDEDataQuery = null;
			if (iPSDEAction != null) {
				iPSDEDataQuery = iPSDEAction.getPSDEActionReturnMust().getPSDEDataQuery();
			}
			if (iPSDEDataQuery == null) {
				iPSDEDataQuery = iDataEntityRuntime.getViewPSDEDataQuery();
			}

			return this.get(iDataEntityRuntime, iPSDEDataQuery, objKeyValue, outputFields, false);
		}

		return null;
	}
	
	@Override
	public Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.onUpdate(iDataEntityRuntime, iPSDEAction, datas, inputFields, bGet, outputFields, bSysMode);
	}
	
	protected Object onUpdate(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.onUpdate(iDataEntityRuntime, iPSDEAction, iEntity, inputFields, bGet, outputFields, bSysMode);
	}

	protected Object onUpdate(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		
		List<IPSDEField> psDEFieldList = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		if (ObjectUtils.isEmpty(psDEFieldList)) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("没有任何属性"));
		}

		Object objKeyValue = iEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
		if (ObjectUtils.isEmpty(objKeyValue)) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法获取更新数据标识"), Errors.INVALIDDATAKEYS);
		}

		if (!iDataEntityRuntime.isVirtual() || iDataEntityRuntime.getVirtualMode() == DEVirtualModes.MIXMINHERIT || iDataEntityRuntime.getVirtualMode() == DEVirtualModes.MIXMINHERITMERGE) {
			String strTableName = iDataEntityRuntime.getTableName();
			if (!StringUtils.hasLength(strTableName)) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("没有指定数据表名称"));
			}

			Map<String, Object> map = new HashMap<>();
			for (IPSDEField iPSDEField : psDEFieldList) {
				if (!iPSDEField.isPhisicalDEField()) {
					continue;
				}
				if (!iEntity.contains(iPSDEField.getLowerCaseName())) {
					continue;
				}
				map.put(iPSDEField.getLowerCaseName(), iEntity.get(iPSDEField.getLowerCaseName()));
			}

			Map<String, Object> extParamMap = null;
			if (!bSysMode) {
				extParamMap = new HashMap<String, Object>();

				// 禁止更新建立人及建立时间
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.CREATEMAN, true);
				if (iPSDEField != null) {
					map.remove(iPSDEField.getLowerCaseName());
				}
				iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.CREATEDATE, true);
				if (iPSDEField != null) {
					map.remove(iPSDEField.getLowerCaseName());
				}

				iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEMAN, true);
				if (iPSDEField != null) {
					extParamMap.put(iPSDEField.getLowerCaseName(), this.getUserContext().getUserid());
				}

				iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEDATE, true);
				if (iPSDEField != null) {
					extParamMap.put(iPSDEField.getLowerCaseName(), new java.sql.Timestamp(System.currentTimeMillis()));
				}
			}

			// 虚拟实体、继承实体 都要按照多表进行

			if (iDataEntityRuntime.isInheritMinor()) {
				// 继承从实体，需要先插入主表
				IDataEntityRuntime majorDataEntityRuntime = (IDataEntityRuntime) iDataEntityRuntime.getInheritDataEntityRuntime();

				String strMajorTableName = majorDataEntityRuntime.getTableName();
				if (!StringUtils.hasLength(strMajorTableName)) {
					throw new DataEntityRuntimeException(majorDataEntityRuntime, String.format("没有指定数据表名称"));
				}

				IEntity majorEntity = majorDataEntityRuntime.createEntity();

				// 主键及主属性
				majorEntity.set(majorDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), iEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName()));
				if (majorDataEntityRuntime.getMajorPSDEField() != null && iDataEntityRuntime.getMajorPSDEField() != null) {
					if (iEntity.contains(iDataEntityRuntime.getMajorPSDEField().getLowerCaseName())) {
						majorEntity.set(majorDataEntityRuntime.getMajorPSDEField().getLowerCaseName(), iEntity.get(iDataEntityRuntime.getMajorPSDEField().getLowerCaseName()));
					}
				}

				// 循环放入
				// List<IPSDEField> psDEFieldList =
				// iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
				for (IPSDEField iPSDEField : psDEFieldList) {

					if (!iPSDEField.isLinkDEField()) {
						continue;
					}

					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (!DEFDataTypes.INHERIT.equals(iPSLinkDEField.getDataType())) {
						continue;
					}

					if (iEntity.contains(iPSLinkDEField.getLowerCaseName())) {
						majorEntity.set(iPSLinkDEField.getRelatedPSDEFieldMust().getLowerCaseName(), iEntity.get(iPSLinkDEField.getLowerCaseName()));
					}
				}

				// 强行放入类型属性
				if (majorDataEntityRuntime.getDataTypePSDEField() != null) {
					majorEntity.set(majorDataEntityRuntime.getDataTypePSDEField().getLowerCaseName(), this.getSystemRuntimeContext().getSystemRuntime().convertValue(majorDataEntityRuntime.getDataTypePSDEField().getStdDataType(), iDataEntityRuntime.getPSDERInherit().getTypeValue()));
				}

				this.update(majorDataEntityRuntime, null, majorEntity, null, false, null, bSysMode);
			}

			// 存储DTO成员数据
			if (true) {
				if (iEntity instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO) iEntity;
					if (iEntityDTO.getDEMethodDTORuntime() != null) {
						List<IPSDEMethodDTOField> psDEMethodDTOFieldList = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTO().getPSDEMethodDTOFields();
						if (psDEMethodDTOFieldList != null) {
							
							Object objNameValue = (iDataEntityRuntime.getMajorPSDEField()!=null)?iEntityDTO.get(iDataEntityRuntime.getMajorPSDEField().getLowerCaseName()):null;
							
							for (IPSDEMethodDTOField iPSDEMethodDTOField : psDEMethodDTOFieldList) {
								if (DEMethodDTOFieldTypes.DTO.equals(iPSDEMethodDTOField.getType()) || DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
									
									if(iPSDEMethodDTOField.getRefPSDataEntity() == null) {
										continue;
									}
									
									//进一步判断是外键值对象数据还是子数据
									IPSDEField iPSDEField = iPSDEMethodDTOField.getPSDEField();
									if (iPSDEField instanceof IPSPickupObjectDEField) {
										// 忽略
										continue;
									}

									//判断是否为继承属性
									if(iPSDEField instanceof IPSInheritDEField){
										if(((IPSInheritDEField)iPSDEField).getRealPSDataEntity()!=null && ((IPSInheritDEField)iPSDEField).getRealPSDataEntity().getDEType() != DETypes.ABSTRACT){
											continue;
										}
									}
									
									if (!iEntityDTO.contains(iPSDEMethodDTOField.getLowerCaseName())) {
										continue;
									}

									IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDEMethodDTOField.getRefPSDataEntityMust().getId());
									if (refDataEntityRuntime.getStorageMode() == DEStorageModes.NONE  && refDataEntityRuntime.getVirtualMode() != DEVirtualModes.MINHERIT) {
										continue;
									}
									// 查出原来的数据
									IPSDEField pickupPSDEField = null;
									IPSDEField parentTypePSDEField = null;
									//IPSDEField parentNamePSDEField = null;
									IPSDEField parentSubTypePSDEField = null;
									String strParentSubType = null;
									String strParentType = null;

									IPSDERBase iPSDERBase = iPSDEMethodDTOField.getPSDER();
									if (iPSDERBase == null && iPSDEField != null && DEFDataTypes.INHERIT.equals(iPSDEField.getDataType()) && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField() != null && iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER() != null) {
										iPSDERBase = iPSDEMethodDTOField.getRelatedPSDEMethodDTOField().getPSDER();
									}
									if (iPSDERBase == null) {
										throw new DataEntityRuntimeException(iDataEntityRuntime,  String.format("属性[%1$s]未指定嵌套数据主关系",iPSDEMethodDTOField.getName()));
									}

									if (iPSDERBase instanceof IPSDER1N) {
										pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
									} else if (iPSDERBase instanceof IPSDERCustom) {
										pickupPSDEField = ((IPSDERCustom) iPSDERBase).getPickupPSDEField();
										parentTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, refDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
										if(parentTypePSDEField != null) {
											strParentType = ((IPSDERCustom) iPSDERBase).getParentType();
											if(!StringUtils.hasLength(strParentType)) {
												//strParentType = iDataEntityRuntime.getName();
												strParentType = iDataEntityRuntime.getDERParentType();
											}
										}
										//parentNamePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTNAME.value, true);
										parentSubTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
										if(parentSubTypePSDEField != null) {
											strParentSubType = ((IPSDERCustom) iPSDERBase).getParentSubType();
											if(!StringUtils.hasLength(strParentSubType)) {
												strParentSubType = iPSDERBase.getMinorCodeName();
											}
										}
									}
									if (pickupPSDEField == null) {
										//throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]没有定义DTO连接属性", iPSDEMethodDTOField.getName()));
										log.warn(String.format("属性[%1$s]没有定义DTO连接属性，忽略默认处理", iPSDEMethodDTOField.getName()));
										continue;
									}
									
//									IPSDEField orderValuePSDEField = refDataEntityRuntime.getOrderValuePSDEField();
//									int nOrderValue = 1;

									// 查出原有数据
									ISearchContextDTO iSearchContextDTO = refDataEntityRuntime.createSearchContext();
									refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, objKeyValue);
									if(parentTypePSDEField != null) {
										refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
									}
									if(parentSubTypePSDEField!=null) {
										if(StringUtils.hasLength(strParentSubType)) {
											refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
										}
										else {
											refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
										}
									}
									
									List<IEntityDTO> lastList = refDataEntityRuntime.select(iSearchContextDTO);
									Map<Object, IEntityDTO> lastMap = new HashMap<>();
									if (lastList != null) {
										for (IEntityDTO item : lastList) {
											Object objKey = refDataEntityRuntime.getFieldValue(item, refDataEntityRuntime.getKeyPSDEField());
											lastMap.put(objKey, item);
										}
									}

									
									List<IEntity> createList = null;
									List<IEntity> updateList = null;
									
									Object dtoData = iEntityDTO.get(iPSDEMethodDTOField.getLowerCaseName());
									if (dtoData != null) {
										if (DEMethodDTOFieldTypes.DTOS.equals(iPSDEMethodDTOField.getType())) {
											Collection list = null;
											if( iPSDEMethodDTOField.isListMap()) {
												// MAP模式
												if (!(dtoData instanceof Map)) {
													throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
												
												list = ((Map) dtoData).values();
											}
											else {
												// 列表模式
												if (!(dtoData instanceof List)) {
													throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
												
												list = (List) dtoData;
											}
											
											for (Object item : list) {
												if (item instanceof IEntity) {
													if (refDataEntityRuntime.getUniTagPSDEField() != null && refDataEntityRuntime.getUnionKeyValuePSDEFields() != null  && refDataEntityRuntime.getUniTagPSDEField().isKeyDEField()) {
														//if (!this.containsFieldValue(iEntityBase, this.getUniTagPSDEField())) {
														if(true) { //直接更新
															String strUniqueTag = refDataEntityRuntime.getUniTagValue((IEntity)item, refDataEntityRuntime.getUnionKeyValuePSDEFields());
															if (StringUtils.hasLength(strUniqueTag)) {
																refDataEntityRuntime.setFieldValue((IEntity)item, refDataEntityRuntime.getUniTagPSDEField(), strUniqueTag);
															}
														}
													}
													Object objKey = refDataEntityRuntime.getFieldValue((IEntity) item, refDataEntityRuntime.getKeyPSDEField());
													IEntity last = lastMap.remove(objKey);
													if (last != null) {
														// 已经存在
														refDataEntityRuntime.setFieldValue((IEntity) item, pickupPSDEField, objKeyValue);
//														if(orderValuePSDEField!=null) {
//															refDataEntityRuntime.setFieldValue((IEntity) item, orderValuePSDEField, nOrderValue);
//															nOrderValue ++;
//														}

														if(updateList == null) {
															updateList = new ArrayList<IEntity>();
														}
														updateList.add((IEntity) item);
													} else {
														// 新建
														refDataEntityRuntime.setFieldValue((IEntity) item, pickupPSDEField, objKeyValue);
//														if(orderValuePSDEField!=null) {
//															refDataEntityRuntime.setFieldValue((IEntity) item, orderValuePSDEField, nOrderValue);
//															nOrderValue ++;
//														}
														
//														if(parentTypePSDEField!=null) {
//															refDataEntityRuntime.setFieldValue((IEntity) item, parentTypePSDEField, iDataEntityRuntime.getName());
//														}
//														if(parentSubTypePSDEField!=null) {
//															refDataEntityRuntime.setFieldValue((IEntity) item, parentSubTypePSDEField, strParentSubType);
//														}
//														if(parentNamePSDEField!=null) {
//															refDataEntityRuntime.setFieldValue((IEntity) item, parentNamePSDEField, objNameValue);
//														}
														
														if(createList == null) {
															createList = new ArrayList<IEntity>();
														}
														createList.add((IEntity) item);
													}
												} else {
													throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
												}
											}

										} else {
											if (dtoData instanceof IEntity) {
												
												Object objKey = refDataEntityRuntime.getFieldValue((IEntity) dtoData, refDataEntityRuntime.getKeyPSDEField());
												IEntity last = lastMap.remove(objKey);
												if (last == null) {
													refDataEntityRuntime.setFieldValue((IEntity) dtoData, refDataEntityRuntime.getKeyPSDEField(), objKeyValue);
													//refDataEntityRuntime.create((IEntity) dtoData);
													if(createList == null) {
														createList = new ArrayList<IEntity>();
													}
													createList.add((IEntity) dtoData);
												} else {
													refDataEntityRuntime.setFieldValue((IEntity) dtoData, refDataEntityRuntime.getKeyPSDEField(), objKeyValue);
													//refDataEntityRuntime.update((IEntity) dtoData);
													if(updateList == null) {
														updateList = new ArrayList<IEntity>();
													}
													updateList.add((IEntity) dtoData);
												}
											} else {
												throw new DataEntityRuntimeException(iDataEntityRuntime, iEntityDTO.getDEMethodDTORuntime(), String.format("属性[%1$s]传入数据类型不正确", iPSDEMethodDTOField.getName()));
											}
										}
									}

									// 执行数据清除处理
									for (java.util.Map.Entry<Object, IEntityDTO> entry : lastMap.entrySet()) {
										refDataEntityRuntime.remove(entry.getKey());
									}
									
									if(updateList!=null) {
										for(IEntity item : updateList) {
											refDataEntityRuntime.update(item);
										}
									}
									
									if(createList!=null) {
										for(IEntity item : createList) {
											refDataEntityRuntime.create(item);
										}
									}
								}
							}
						}
					}
				}
			}

			// getSysDBSchemeRuntime().update(strTableName, map, extParamMap);
			this.executeUpdate(strTableName, map, extParamMap, iDataEntityRuntime, iEntity, bSysMode);
		}
		if (iDataEntityRuntime.isVirtual() && iDataEntityRuntime.getVirtualMode() != DEVirtualMode.MIXMINHERITMERGE.value) {

			java.util.List<IPSDERMultiInherit> psDERMultiInheritList = iDataEntityRuntime.getPSDERMultiInherits();
			for (IPSDERMultiInherit iPSDERMultiInherit : psDERMultiInheritList) {

				// 继承从实体，需要先插入主表
				IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDERMultiInherit.getMajorPSDataEntityMust().getId());

				IEntity majorEntity = majorDataEntityRuntime.createEntity();

				// 主键及主属性
				majorEntity.set(majorDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKeyValue);

				// 循环放入
				for (IPSDEField iPSDEField : psDEFieldList) {

					if (!iPSDEField.isLinkDEField()) {
						continue;
					}

					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					if (!DEFDataTypes.INHERIT.equals(iPSLinkDEField.getDataType())) {
						continue;
					}

					if (!iPSDERMultiInherit.getId().equals(iPSLinkDEField.getPSDERMust().getId())) {
						continue;
					}

					if (iEntity.contains(iPSLinkDEField.getLowerCaseName())) {
						majorEntity.set(iPSLinkDEField.getRelatedPSDEFieldMust().getLowerCaseName(), iEntity.get(iPSLinkDEField.getLowerCaseName()));
					}
				}
				
				boolean bCreate = true;
				if (objKeyValue != null) {
					bCreate = (this.checkKeyState(majorDataEntityRuntime, null, objKeyValue) == CheckKeyStates.OK);
				}
				
				if (bCreate) {
					this.create(majorDataEntityRuntime, null, majorEntity, null, false, null, bSysMode);
				} else {
					this.update(majorDataEntityRuntime, null, majorEntity, null, false, null, bSysMode);
				}
			}
		}

		if (bGet) {

			IPSDEDataQuery iPSDEDataQuery = null;
			if (iPSDEAction != null) {
				iPSDEDataQuery = iPSDEAction.getPSDEActionReturnMust().getPSDEDataQuery();
			}
			if (iPSDEDataQuery == null) {
				iPSDEDataQuery = iDataEntityRuntime.getViewPSDEDataQuery();
			}

			return this.get(iDataEntityRuntime, iPSDEDataQuery, objKeyValue, outputFields, false);
		}

		return null;
	}
	
	@Override
	public List get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, String[] outputFields) throws Throwable {
		return this.onGet(iDataEntityRuntime, iPSDEAction, keys, outputFields);
	}
	
	protected List onGet(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, String[] outputFields) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), "没有实现", Errors.NOTIMPL);
	}

	@Override
	public Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		return this.onGet(iDataEntityRuntime, iPSDEAction, key, outputFields, bTryMode);
	}
	
	protected Object onGet(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		
		IPSDEDataQuery iPSDEDataQuery = null;
		if (iPSDEAction != null) {
			iPSDEDataQuery = iPSDEAction.getPSDEActionReturnMust().getPSDEDataQuery();
		}
		if (iPSDEDataQuery == null) {
			iPSDEDataQuery = iDataEntityRuntime.getViewPSDEDataQuery();
		}

		return this.get(iDataEntityRuntime, iPSDEDataQuery, key, outputFields, bTryMode);
	}
	

	@Override
	public Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		return this.onGet(iDataEntityRuntime, iPSDEDataQuery, key, outputFields, bTryMode);
	}

	protected Object onGet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		Assert.notNull(iPSDEDataQuery, "没有传入数据查询模型对象");
		if (ObjectUtils.isEmpty(key)) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("没有指定数据键值"), Errors.INVALIDDATAKEYS);
		}

		String strKey = String.format("n_%1$s_eq", iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
		ISearchContext iSearchContext = iDataEntityRuntime.createSearchContext(null);
		SearchContextDTO.addSearchFieldCond((ISearchContextDTO) iSearchContext, iDataEntityRuntime.getKeyPSDEField().getName(), Conditions.EQ, key, strKey);

		List list = this.query(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields);
		if (list == null || list.size() == 0) {
			if (bTryMode) {
				return null;
			}
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法获取指定数据[%1$s]", key), Errors.INVALIDDATA);
		}

		return list.get(0);
	}
	
	@Override
	public void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, boolean bSysMode) throws Throwable {
		this.onRemove(iDataEntityRuntime, iPSDEAction, keys, bSysMode);
	}
	
	protected void onRemove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, boolean bSysMode) throws Throwable {
		throw new SystemRuntimeException(this.getSystemRuntime(), "没有实现", Errors.NOTIMPL);
	}
	

	@Override
	public void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, boolean bSysMode) throws Throwable {
		this.onRemove(iDataEntityRuntime, iPSDEAction, key, bSysMode);
	}
	
	protected void onRemove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, boolean bSysMode) throws Throwable {
		if (ObjectUtils.isEmpty(key)) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法指定删除数据标识"), Errors.INVALIDDATAKEYS);
		}
		if (iDataEntityRuntime.isVirtual() && iDataEntityRuntime.getVirtualMode() != DEVirtualMode.MIXMINHERITMERGE.value) {

			java.util.List<IPSDERMultiInherit> psDERMultiInheritList = iDataEntityRuntime.getPSDERMultiInherits();
			IPSDERMultiInherit firstPSDERMultiInherit = null;

			for (IPSDERMultiInherit iPSDERMultiInherit : psDERMultiInheritList) {
				if (firstPSDERMultiInherit == null) {
					firstPSDERMultiInherit = iPSDERMultiInherit;
				} else {
					// 继承从实体，需要先插入主表
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iPSDERMultiInherit.getMajorPSDataEntityMust().getId());
					// this.remove(majorDataEntityRuntime, null, key, bSysMode);
					if(this.checkKeyState(majorDataEntityRuntime, null, key) == CheckKeyStates.EXIST) {
						majorDataEntityRuntime.remove(key);
					}
				}

			}
			if (firstPSDERMultiInherit != null) {
				IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(firstPSDERMultiInherit.getMajorPSDataEntityMust().getId());
				// this.remove(majorDataEntityRuntime, null, key, bSysMode);
				if(this.checkKeyState(majorDataEntityRuntime, null, key) == CheckKeyStates.EXIST) {
					majorDataEntityRuntime.remove(key);
				}
			}

		} 
		if (!iDataEntityRuntime.isVirtual() || iDataEntityRuntime.getVirtualMode() == DEVirtualModes.MIXMINHERIT || iDataEntityRuntime.getVirtualMode() == DEVirtualModes.MIXMINHERITMERGE) {
			String strTableName = iDataEntityRuntime.getTableName();
			if (!StringUtils.hasLength(strTableName)) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("没有指定数据表名称"));
			}

			if (!iDataEntityRuntime.isEnableLogicValid()) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), key);
				//getSysBDSchemeRuntime().delete(strTableName, map, null);
				this.executeDelete(strTableName, map, null, iDataEntityRuntime, key, bSysMode);
			} else {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), key);
				map.put(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName(), iDataEntityRuntime.getInvalidLogicValue());
				if (bSysMode) {
					IPSDEField iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEMAN, true);
					if (iPSDEField != null) {
						map.put(iPSDEField.getLowerCaseName(), SqlParam.value(this.getUserContext().getUserid()));
					}

					iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEDATE, true);
					if (iPSDEField != null) {
						map.put(iPSDEField.getLowerCaseName(), SqlParam.value(new java.sql.Timestamp(System.currentTimeMillis())));
					}
				}
				//getSysBDSchemeRuntime().update(strTableName, map, null);
				this.executeUpdate(strTableName, map, null, iDataEntityRuntime, null, bSysMode);
			}

			// 虚拟实体、继承实体 都要按照多表进行
			if (iDataEntityRuntime.isInheritMinor()) {
				// 删除从实体后再删除主实体

				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				
				IDataEntityRuntime majorDataEntityRuntime = (IDataEntityRuntime) iDataEntityRuntime.getInheritDataEntityRuntime();

				if (actionSession.registerRecursion(DataEntityRuntime.RECURSION_INHERITACTION, majorDataEntityRuntime.getId(), key, DEActions.REMOVE)) {
					majorDataEntityRuntime.remove(key);
					actionSession.unregisterRecursion(DataEntityRuntime.RECURSION_INHERITACTION, majorDataEntityRuntime.getId(), key, DEActions.REMOVE);
				} else {
					throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("继承主实体正在删除当前数据"));
				}
			}
		}
	}
	

	@Override
	public int checkKeyState(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objKey) throws Throwable {
		return this.onCheckKeyState(iDataEntityRuntime, iPSDEAction, objKey);
	}
	
	protected int onCheckKeyState(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objKey) throws Throwable {
		ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
		iSearchContextDTO.eq(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objKey);
		iSearchContextDTO.limit(1);
		List list = this.query(iDataEntityRuntime, iDataEntityRuntime.getSimplePSDEDataQuery(), iSearchContextDTO, null);
		
		if (list == null || list.size() == 0) {
			return CheckKeyStates.OK;
		}

		if (!iDataEntityRuntime.isEnableLogicValid()) {
			return CheckKeyStates.EXIST;
		}

		Object objRow = list.get(0);
		if (!(objRow instanceof Map)) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法识别的返回值对象型[%1$s]", objRow), Errors.INVALIDDATAKEYS);
		}

		Map rowMap = (Map) objRow;
		Object objValue = rowMap.get(iDataEntityRuntime.getLogicValidPSDEField().getLowerCaseName());

		long nRet = this.getSystemRuntimeContext().getSystemRuntime().compareValue(iDataEntityRuntime.getInvalidLogicValue(), objValue, iDataEntityRuntime.getLogicValidPSDEField().getStdDataType());
		if (nRet == 0) {
			return CheckKeyStates.DELETE;
		}

		return CheckKeyStates.EXIST;
	}
	

	@Override
	public List query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return this.onQuery(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields);
	}

	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return getSysBDSchemeRuntime().query(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, null);
	}

	@Override
	public Page query2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return this.onQuery2(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields);
	}

	protected Page onQuery2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return getSysBDSchemeRuntime().query2(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, null);
	}

	
	@Override
	public Page fetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		Page page = this.onFetchDataSet(iDataEntityRuntime, iPSDEDataSet, iSearchContext, outputFields);
		
		return page;
	}
	
	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return this.getSysBDSchemeRuntime().fetchDataSet(iDataEntityRuntime, iPSDEDataSet, iSearchContext, outputFields, null);
	}

	protected Object executeInsert(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, List<? extends IEntity> datas, boolean bSysMode) throws Throwable {
		return this.getSysBDSchemeRuntime().insert(strTableName, args, extParamMap);
	}

	protected Object executeUpdate(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, List<? extends IEntity> datas, boolean bSysMode) throws Throwable {
		
		return this.getSysBDSchemeRuntime().update(strTableName, args, extParamMap, true);
	}

	protected Object executeInsert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, IEntity iEntity, boolean bSysMode) throws Throwable {
		//额外补充主键
		if(iDataEntityRuntime != null) {
			if(!arg.containsKey(Entity.KEY)) {
				Object objKey = arg.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
				if(!ObjectUtils.isEmpty(objKey)) {
					arg.put(Entity.KEY, objKey);
				}
			}
		}
		
		return this.getSysBDSchemeRuntime().insert(strTableName, arg, extParamMap);
	}

	protected Object executeUpdate(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, IEntity iEntity, boolean bSysMode) throws Throwable {
		//额外补充主键
		if(iDataEntityRuntime != null) {
			if(!arg.containsKey(Entity.KEY)) {
				Object objKey = arg.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
				if(!ObjectUtils.isEmpty(objKey)) {
					arg.put(Entity.KEY, objKey);
				}
			}
		}
		return this.getSysBDSchemeRuntime().update(strTableName, arg, extParamMap, true);
	}

	protected Object executeDelete(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, Object key, boolean bSysMode)  throws Throwable {
		if(iDataEntityRuntime != null) {
			if(!arg.containsKey(Entity.KEY)) {
				Object objKey = arg.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName());
				if(!ObjectUtils.isEmpty(objKey)) {
					arg.put(Entity.KEY, objKey);
				}
			}
		}
		return getSysBDSchemeRuntime().delete(strTableName, arg, extParamMap);
	}


}
