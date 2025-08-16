package net.ibizsys.central.plugin.groovy.support;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntime;
//import net.ibizsys.runtime.IDynaInstRuntime;
//import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
//import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.runtime.dataentity.action.CheckKeyStates;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.dataentity.der.DER1NMasterRSTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

public class EntityDTOExtension {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(EntityDTOExtension.class);
	
	public static IEntity set(IEntity iEntity, Map<String, Object> map) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Assert.notNull(map, "传入设置值字典无效");
		try {
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				iEntity.set(entry.getKey(), entry.getValue());
			}
		}
		catch (Throwable ex) {
			ExceptionUtils.rethrowRuntimeException(ex);
		}
		return iEntity;
	}
	

	public static IEntity set(IEntity iEntity, Object[] args) {
		Assert.notNull(iEntity, "传入数据对象无效");
		//Assert.notNull(args, "传入设置值数组无效");
		if (args != null && args.length > 0) {
			int nSize = args.length / 2;
			for (int i = 0; i < nSize; i++) {
				Object objKey = args[i * 2];
				Object objValue = args[i * 2 + 1];
				if (ObjectUtils.isEmpty(objKey)) {
					continue;
				}
				if (objKey instanceof String) {
					iEntity.set((String) objKey, objValue);
				} else {
					iEntity.set(objKey.toString(), objValue);
				}
			}
		}
		return iEntity;
	}

	public static IEntity set(IEntity iEntity, Object params) {
		Assert.notNull(iEntity, "传入数据对象无效");
		if(params instanceof Map) {
			Map<String, Object> map = (Map<String, Object>)params;
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				iEntity.set(entry.getKey(), entry.getValue());
			}
			return iEntity;
		}
		exception(iEntity, String.format("无法识别的参数对象[%1$s]", params));
		return null;
	}
	
	
	

	public static IEntityDTO field(IEntityDTO iEntityDTO, String strName, Object objValue) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() != null) {
			IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
			if (iPSDEField != null) {
				iEntityDTO.set(iPSDEField.getLowerCaseName(), objValue);
			} else {
				exception(iEntityDTO, String.format("实体[%1$s]无法获取指定属性[%2$s]", iDataEntityRuntime.getName(), strName));
			}
		}
		else {
			iEntityDTO.set(strName, objValue);
		}
		return iEntityDTO;
	}

	public static IEntityDTO field(IEntityDTO iEntityDTO, Object[] args) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if (args != null && args.length > 0) {
			int nSize = args.length / 2;
			for (int i = 0; i < nSize; i++) {
				Object objKey = args[i * 2];
				Object objValue = args[i * 2 + 1];
				if (ObjectUtils.isEmpty(objKey)) {
					continue;
				}
				if (objKey instanceof String) {
					field(iEntityDTO, (String) objKey, objValue);
				} else {
					field(iEntityDTO, objKey.toString(), objValue);
				}
			}
		}
		return iEntityDTO;
	}

	
	public static IEntityDTO field(IEntityDTO iEntityDTO, Object params) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(params instanceof Map) {
			Map<String, Object> map = (Map<String, Object>)params;
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				field(iEntityDTO, entry.getKey(), entry.getValue());
			}
			return iEntityDTO;
		}
		exception(iEntityDTO, String.format("无法识别的参数对象[%1$s]", params));
		return null;
	}

	
	
	
	public static Object get(IEntity iEntity, String strName, Object objDefault) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Object value = iEntity.get(strName);
		if(value == null) {
			return objDefault;
		}
		return value;
	}
	

	
	public static Object getId(IEntityDTO iEntityDTO) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() != null) {
			IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField("ID");
			if(iPSDEField == null) {
				iPSDEField = iDataEntityRuntime.getKeyPSDEField();
			}
			if(iPSDEField == null) {
				return null;
			}
			return iEntityDTO.get(iPSDEField.getLowerCaseName());
		}
		else {
			if(iEntityDTO.contains(Entity.KEY)) {
				return iEntityDTO.get(Entity.KEY);
			}
			return iEntityDTO.get("id");
		}
	}
	
	
	
	public static Object getName(IEntityDTO iEntityDTO) {
		if(iEntityDTO.getDEMethodDTORuntime() != null) {
			IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField("NAME");
			if(iPSDEField == null) {
				iPSDEField = iDataEntityRuntime.getMajorPSDEField();
			}
			if(iPSDEField == null) {
				return null;
			}
			return iEntityDTO.get(iPSDEField.getLowerCaseName());
		}
		else {
			return iEntityDTO.get("name");
		}
	}
	
	public static void setId(IEntityDTO iEntityDTO, Object id) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() != null) {
			IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField("ID");
			if(iPSDEField == null) {
				iPSDEField = iDataEntityRuntime.getKeyPSDEField();
			}
			if(iPSDEField == null) {
				return;
			}
			iEntityDTO.set(iPSDEField.getLowerCaseName(), id);
		}
		else {
//			if(iEntityDTO.contains(Entity.KEY)) {
//				return iEntityDTO.get(Entity.KEY);
//			}
			iEntityDTO.set("id", id);
		}
	}
	
	
	
	public static void setName(IEntityDTO iEntityDTO, String name) {
		if(iEntityDTO.getDEMethodDTORuntime() != null) {
			IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField("NAME");
			if(iPSDEField == null) {
				iPSDEField = iDataEntityRuntime.getMajorPSDEField();
			}
			if(iPSDEField == null) {
				return;
			}
			iEntityDTO.set(iPSDEField.getLowerCaseName(), name);
		}
		else {
			iEntityDTO.set("name", name);
		}
	}
	
	
//
//	
//	public boolean contains(String strName) {
//		if(iDataEntityRuntime != null) {
//			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
//			if (iPSDEField != null) {
//				return iDataEntityRuntime.containsFieldValue(iEntityDTO, iPSDEField);
//			} else {
//				log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", iDataEntityRuntime.getName(), strName));
//				if (iEntityDTO != null) {
//					return iEntityDTO.contains(strName);
//				}
//				return false;
//			}
//		}
//		else {
//			return iEntityDTO.contains(strName);
//		}
//	}
//
//	
//	public static IEntityDTO reset(String strName) {
//		if(iDataEntityRuntime != null) {
//			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
//			if (iPSDEField != null) {
//				iDataEntityRuntime.resetFieldValue(iEntityDTO, iPSDEField);
//			} else {
//				log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", iDataEntityRuntime.getName(), strName));
//				if (iEntityDTO != null) {
//					iEntityDTO.reset(strName);
//				}
//			}
//		}
//		else {
//			iEntityDTO.reset(strName);
//		}
//		return iEntityDTO;
//	}

	
	public static IEntity reset(IEntity iEntity, String[] args) {
		Assert.notNull(iEntity, "传入数据对象无效");
		if (args != null && args.length > 0) {
			int nSize = args.length;
			for (int i = 0; i < nSize; i++) {
				Object objKey = args[i];
				if (ObjectUtils.isEmpty(objKey)) {
					continue;
				}

				if (objKey instanceof String) {
					iEntity.reset((String)objKey);
				} else {
					iEntity.reset(objKey.toString());
				}
			}
		}
		return iEntity;
	}

	
	public static IEntityDTO parent(IEntityDTO iEntityDTO, String strName) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			if (!StringUtils.hasLength(strName)) {
				// 没有指定父名称，计算从关系
				java.util.List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMinorPSDERs();
				if (psDERBases == null) {
					return null;
				}

				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
						IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
						if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
							return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iPSDER1N.getPSPickupDEField());
						}
					} else {
						continue;
					}
				}

				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER11.equals(psDERBase.getDERType())) {
						return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iDataEntityRuntime.getKeyPSDEField());
					} else {
						continue;
					}
				}

				return null;
			} else {
				// 获取属性
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
				if (iPSDEField != null) {
					if (iPSDEField instanceof IPSLinkDEField) {
						return parent(iEntityDTO, iDataEntityRuntime, ((IPSLinkDEField) iPSDEField).getPSDER().getMajorPSDataEntity(), iPSDEField);
					}
					
					//判断是否为预置父标识属性
					if(StringUtils.hasLength(iPSDEField.getPredefinedType())) {
						if(PredefinedFieldType.PARENTID.value.equals(iPSDEField.getPredefinedType())) {
							Object parentId = iEntityDTO.get(iPSDEField.getLowerCaseName());
							if(ObjectUtils.isEmpty(parentId)) {
								return null;
							}
							
							java.util.List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMinorPSDERs();
							if (psDERBases == null) {
								return null;
							}
							
							IPSDEField parentTypePSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
							
							Object parentType = iEntityDTO.get(parentTypePSDEField.getLowerCaseName());
							if(ObjectUtils.isEmpty(parentType)) {
								//throw new Exception("未指定动态存储父类型");
								return null;
							}
							
							for (IPSDERBase psDERBase : psDERBases) {
								if(!(psDERBase instanceof IPSDERCustom)) {
									continue;
								}
								
								if(DataTypeUtils.compare(psDERBase.getMajorPSDataEntityMust().getName(), String.valueOf(parentType)) != 0) {
									continue;
								}
								
								return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iPSDEField);
							}
							return null;
						}
					}
				}

				// 直接找实体
				java.util.List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMinorPSDERs();
				if (psDERBases == null) {
					return null;
				}
				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
						IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
						if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
							if (strName.equalsIgnoreCase(psDERBase.getMajorPSDataEntity().getName())) {
								return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iPSDER1N.getPSPickupDEField());
							}
						}
					} else {
						continue;
					}
				}
				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER11.equals(psDERBase.getDERType())) {
						if (strName.equalsIgnoreCase(psDERBase.getMajorPSDataEntity().getName())) {
							return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iDataEntityRuntime.getKeyPSDEField());
						}
					} else {
						continue;
					}
				}
				// 不需要判断控制关系类型
				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
						IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
						if (strName.equalsIgnoreCase(psDERBase.getMajorPSDataEntity().getName())) {
							return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iPSDER1N.getPSPickupDEField());
						}
					} else {
						continue;
					}
				}
				return null;
			}
		} catch (Throwable ex) {
			log.error(String.format("实体获取引用数据[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取引用数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected static IEntityDTO parent(IEntityDTO iEntityDTO, IDataEntityRuntime iDataEntityRuntime, IPSDataEntity parentPSDataEntity, IPSDEField iPSDEField) throws Throwable {
		
		Object objValue = iEntityDTO.get(iPSDEField.getLowerCaseName());
		if (ObjectUtils.isEmpty(objValue)) {
			return null;
		}

		IDataEntityRuntime parentDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(parentPSDataEntity.getDynaModelFilePath());
		Object objRet = parentDataEntityRuntime.executeAction(DEActions.GET, null, new Object[] { objValue });
		if (objRet != null && objRet instanceof IEntityDTO) {
			return (IEntityDTO)objRet;
		}
		return null;
	}
	
	/**
	 * 引用数据
	 * @param iEntityDTO
	 * @param strName
	 * @return
	 */
	public static IEntityDTO ref(IEntityDTO iEntityDTO, String strName) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			// 获取属性
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
			if (iPSDEField != null) {
				if (iPSDEField instanceof IPSLinkDEField) {
					//获取实际引用
					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField)iPSDEField;
					IPSDataEntity realPSDataEntity = iPSLinkDEField.getRealPSDataEntity();
					IPSDEField realPSDEField = iPSLinkDEField.getRealPSDEField();
					if(realPSDataEntity != null && realPSDEField != null && realPSDEField.isKeyDEField()) {
						return parent(iEntityDTO, iDataEntityRuntime, realPSDataEntity, iPSDEField);
					}
					//兼容旧功能
					return parent(iEntityDTO, iDataEntityRuntime, ((IPSLinkDEField) iPSDEField).getPSDER().getMajorPSDataEntity(), iPSDEField);
				}
				
				//判断是否为预置父标识属性
				if(StringUtils.hasLength(iPSDEField.getPredefinedType())) {
					if(PredefinedFieldType.PARENTID.value.equals(iPSDEField.getPredefinedType())) {
						Object parentId = iEntityDTO.get(iPSDEField.getLowerCaseName());
						if(ObjectUtils.isEmpty(parentId)) {
							return null;
						}
						
						java.util.List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMinorPSDERs();
						if (psDERBases == null) {
							return null;
						}
						
						IPSDEField parentTypePSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
						
						Object parentType = iEntityDTO.get(parentTypePSDEField.getLowerCaseName());
						if(ObjectUtils.isEmpty(parentType)) {
							//throw new Exception("未指定动态存储父类型");
							return null;
						}
						
						for (IPSDERBase psDERBase : psDERBases) {
							if(!(psDERBase instanceof IPSDERCustom)) {
								continue;
							}
							
							if(DataTypeUtils.compare(psDERBase.getMajorPSDataEntityMust().getName(), String.valueOf(parentType)) != 0) {
								continue;
							}
							
							return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iPSDEField);
						}
						return null;
					}
				}
			}

			// 直接找实体
			java.util.List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMinorPSDERs();
			if (psDERBases == null) {
				return null;
			}
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER11.equals(psDERBase.getDERType())) {
					if (strName.equalsIgnoreCase(psDERBase.getMajorPSDataEntity().getName())) {
						return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iDataEntityRuntime.getKeyPSDEField());
					}
				} else {
					continue;
				}
			}
			// 不需要判断控制关系类型
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if (strName.equalsIgnoreCase(psDERBase.getMajorPSDataEntity().getName())) {
						return parent(iEntityDTO, iDataEntityRuntime, psDERBase.getMajorPSDataEntity(), iPSDER1N.getPSPickupDEField());
					}
				} else {
					continue;
				}
			}
			return null;
		} catch (Throwable ex) {
			log.error(String.format("实体获取引用数据[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取引用数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	
	public static IEntityDTO create(IEntityDTO iEntityDTO) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.executeAction(DEActions.CREATE, null, new Object[] { iEntityDTO });
			return iEntityDTO;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]建立数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("建立数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	public static IEntityDTO create(IEntityDTO iEntityDTO, boolean bGet) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.create(iEntityDTO, bGet);
			return iEntityDTO;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]建立数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("建立数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	public static IEntityDTO update(IEntityDTO iEntityDTO) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.executeAction(DEActions.UPDATE, null, new Object[] { iEntityDTO });
			return iEntityDTO;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]更新数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	public static IEntityDTO update(IEntityDTO iEntityDTO, boolean bGet) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.update(iEntityDTO, bGet);
			return iEntityDTO;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]更新数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	public static void remove(IEntityDTO iEntityDTO) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.executeAction(DEActions.REMOVE, null, new Object[] { getId(iEntityDTO) });
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]删除数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	
	public static IEntityDTO wfstart(IEntityDTO iEntityDTO) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.executeAction(DEActions.WFSTART, null, new Object[] { iEntityDTO });
			return iEntityDTO;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]启动流程发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("启动流程发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	
	public static IEntityDTO call(IEntityDTO iEntityDTO, String strName) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.executeAction(strName, null, new Object[] { iEntityDTO });
			return iEntityDTO;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]自定义调用[%3$s]发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage(), strName), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("自定义调用[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
		}
	}

	public static void exception(IEntity iEntity, String strErrorInfo) {
		Assert.notNull(iEntity, "传入数据对象无效");
		if(iEntity instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)iEntity;
			if(iEntityDTO.getDEMethodDTORuntime()!=null) {
				throw new DataEntityRuntimeException(iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime(), strErrorInfo);
			}
		}
		
		ISystemRuntime iSystemRuntime = SystemRuntimeHolder.peek();
		if(iSystemRuntime != null) {
			throw new SystemRuntimeException(iSystemRuntime, strErrorInfo);
		}
		throw new ErrorException(strErrorInfo);
	}
	
	

	public static void exception(IEntityDTO iEntityDTO, String strErrorInfo, int nErrorCode) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime()!=null) {
			throw new DataEntityRuntimeException(iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime(), strErrorInfo, nErrorCode);
		}
		ISystemRuntime iSystemRuntime = SystemRuntimeHolder.peek();
		if(iSystemRuntime != null) {
			throw new SystemRuntimeException(iSystemRuntime, strErrorInfo, nErrorCode);
		}
		throw new ErrorException(strErrorInfo, nErrorCode);
	}

	
	public static IEntityDTO[] children(IEntityDTO iEntityDTO, String strName) {
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		try {
			
			// 获取属性
			IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
			if (iPSDEField != null) {
				// 判断属性是否为一对多数据存储属性
				if (DEFDataTypes.ONE2MANYDATA.equals(iPSDEField.getDataType())) {
					return null;
				}
			}

			// 直接找实体
			java.util.List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMajorPSDERs();
			if (psDERBases == null) {
				return null;
			}

			// 判断附属关系代码
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if (StringUtils.hasLength(iPSDER1N.getMinorCodeName()) && iPSDER1N.getMinorCodeName().equalsIgnoreCase(strName)) {
						return children(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField(), psDERBase);
					}
				}
				else
					if (DERTypes.DERCUSTOM.equals(psDERBase.getDERType())) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) psDERBase;
						if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
							continue;
						}
						if (StringUtils.hasLength(iPSDERCustom.getMinorCodeName())
								&& iPSDERCustom.getMinorCodeName().equalsIgnoreCase(strName)
								&& iPSDERCustom.getPickupPSDEField() != null) {
							return children(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDERCustom.getPickupPSDEField(), psDERBase);
						}
					}
					else {
						continue;
					}
			}

			// 判断存在关联关系的关系实体
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
						if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
							return children(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField(), psDERBase);
						}
					}
				}
				else
					if (DERTypes.DERCUSTOM.equals(psDERBase.getDERType())) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) psDERBase;
						if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
							continue;
						}
						
						if ((iPSDERCustom.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED
								&& iPSDERCustom.getPickupPSDEField() != null) {
							if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
								return children(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDERCustom.getPickupPSDEField(), psDERBase);
							}
						}
					}
					else {
						continue;
					}
			}

			// 判断 1:1 关系
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER11.equals(psDERBase.getDERType())) {
					if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
						return children(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), null, psDERBase);
					}
				} else {
					continue;
				}
			}

			// 不需要判断控制关系类型
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
						return children(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField(), psDERBase);
					}
				}
				else
					if (DERTypes.DERCUSTOM.equals(psDERBase.getDERType())) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) psDERBase;
						if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
							continue;
						}
						
						if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())
								&& iPSDERCustom.getPickupPSDEField() != null) {
							if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
								return children(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDERCustom.getPickupPSDEField(), psDERBase);
							}
						}
					}
					else {
						continue;
					}
			}

			return null;
		} catch (Throwable ex) {
			log.error(String.format("实体查询子数据[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("查询子数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected static IEntityDTO[] children(IEntityDTO iEntityDTO, IDataEntityRuntime iDataEntityRuntime, IPSDataEntity childPSDataEntity, IPSDEField iPSDEField, IPSDERBase iPSDERBase) throws Throwable {
		
		Object objValue = getId(iEntityDTO);
		if (ObjectUtils.isEmpty(objValue)) {
			return null;
		}

		IDataEntityRuntime childDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(childPSDataEntity.getDynaModelFilePath());
		ISearchContextDTO iSearchContextDTO = childDataEntityRuntime.createSearchContext();
		iSearchContextDTO.all().count(false);
		if (iPSDEField != null) {
			childDataEntityRuntime.setSearchCondition(iSearchContextDTO, iPSDEField, Conditions.EQ, objValue);
		} else {
			childDataEntityRuntime.setSearchCondition(iSearchContextDTO, childDataEntityRuntime.getKeyPSDEField(), Conditions.EQ, objValue);
		}
		
		IPSDEField parentTypePSDEField = null;
		IPSDEField parentSubTypePSDEField = null;
		String strParentType = null;
		String strParentSubType = null;
		
		if(iPSDERBase instanceof IPSDERCustom) {
			parentTypePSDEField = childDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, childDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
			if(parentTypePSDEField != null) {
				strParentType = ((IPSDERCustom) iPSDERBase).getParentType();
				if(!StringUtils.hasLength(strParentType)) {
					//strParentType = iDataEntityRuntime.getName();
					strParentType = iDataEntityRuntime.getDERParentType();
				}
			}
			parentSubTypePSDEField = childDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
			if(parentSubTypePSDEField != null) {
				strParentSubType = ((IPSDERCustom) iPSDERBase).getParentSubType();
				if(!StringUtils.hasLength(strParentSubType)) {
					strParentSubType = iPSDERBase.getMinorCodeName();
				}
			}
		}
		
		if(parentTypePSDEField != null) {
			childDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
		}

		if(parentSubTypePSDEField!=null) {
			if(StringUtils.hasLength(strParentSubType)) {
				childDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
			}
			else {
				childDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
			}
		}
		
		IPSDEDataSet iPSDEDataSet = null;
		if(iPSDERBase instanceof IPSDER1NBase) {
			iPSDEDataSet = ((IPSDER1NBase)iPSDERBase).getNestedPSDEDataSet();
		}
		
		List<? extends IEntityBase> list = iPSDEDataSet!=null? childDataEntityRuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO)
				:childDataEntityRuntime.select(iSearchContextDTO);
		if (list == null) {
			return null;
		}
		
		return list.toArray(new IEntityDTO[list.size()]);
	}

	
	public static IEntityDTO child(IEntityDTO iEntityDTO, String strName) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			// 直接找实体
			java.util.List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMajorPSDERs();
			if (psDERBases == null) {
				return null;
			}
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
						if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
							return child(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField());
						}
					}
				} else {
					continue;
				}
			}
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER11.equals(psDERBase.getDERType())) {
					if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
						return child(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), null);
					}
				} else {
					continue;
				}
			}
			// 不需要判断控制关系类型
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
						return child(iEntityDTO, iDataEntityRuntime, psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField());
					}
				} else {
					continue;
				}
			}

			return null;
		} catch (Throwable ex) {
			log.error(String.format("实体准备子数据[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("准备子数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected static IEntityDTO child(IEntityDTO iEntityDTO, IDataEntityRuntime iDataEntityRuntime, IPSDataEntity childPSDataEntity, IPSDEField iPSDEField) throws Throwable {
		
		Object objValue = getId(iEntityDTO);
		if (ObjectUtils.isEmpty(objValue)) {
			return null;
		}

		IDataEntityRuntime childDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(childPSDataEntity.getDynaModelFilePath());
		IEntityBase iEntityBase = childDataEntityRuntime.createEntity();
		if (iPSDEField != null) {
			childDataEntityRuntime.setFieldValue(iEntityBase, iPSDEField, objValue);
		} else {
			childDataEntityRuntime.setFieldValue(iEntityBase, childDataEntityRuntime.getKeyPSDEField(), objValue);
		}
		childDataEntityRuntime.executeAction(DEActions.GETDRAFT, null, new Object[] { iEntityBase });
		return (IEntityDTO)iEntityBase;
	}

	
	public static boolean exists(IEntityDTO iEntityDTO) {
		
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return false;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		Object objValue = getId(iEntityDTO);
		if (ObjectUtils.isEmpty(objValue)) {
			return false;
		}

		return iDataEntityRuntime.checkKeyState(objValue) == CheckKeyStates.EXIST;

	}

	
	public static IEntityDTO save(IEntityDTO iEntityDTO) {
		if (exists(iEntityDTO)) {
			return update(iEntityDTO);
		} else {
			return create(iEntityDTO);
		}
	}

	
	public static IEntityDTO clone(IEntityDTO iEntityDTO, boolean bResetUncopyValues) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		IEntityBase newEntity = null;
		try {
			newEntity = iDataEntityRuntime.clone(iEntityDTO, bResetUncopyValues);
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]克隆数据对象发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("建立克隆数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
		return (IEntityDTO)newEntity;
	}

	
	public static IEntityDTO callEntity(IEntityDTO iEntityDTO) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		IEntityBase newEntity = iDataEntityRuntime.createEntity();
		iDataEntityRuntime.setFieldValue(newEntity, iDataEntityRuntime.getKeyPSDEField(), getId(iEntityDTO));
		return (IEntityDTO)newEntity;
	}

	
	public static IEntityDTO last(IEntityDTO iEntityDTO) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		IEntityDTO lastEntity = (IEntityDTO)iDataEntityRuntime.getLastEntity();
		if (lastEntity == null) {
			// 直接获取之前
			try {
				lastEntity = iDataEntityRuntime.get(iDataEntityRuntime.getKeyFieldValue(iEntityDTO));
			} catch (Throwable ex) {
				log.error(String.format("实体[%1$s]获取数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取数据发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		return lastEntity;
	}

	
	public static IEntityDTO copy(IEntityDTO iEntityDTO, IEntityDTO srcScriptEntity, String[] fields) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if (srcScriptEntity != null) {
			if(fields != null) {
				for (String strField : fields) {
					String[] items = strField.trim().split("[|]");
					if (items.length == 1) {
						iEntityDTO.set(items[0], srcScriptEntity.get(items[0]));
						continue;
					} else if (items.length >= 2) {
						iEntityDTO.set(items[1], srcScriptEntity.get(items[0]));
						continue;
					}
				}
			}
		}
		return iEntityDTO;
	}
	
	
	public static IEntityDTO copy(IEntityDTO iEntityDTO, Object objData, String[] fields) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		
		if(objData instanceof IEntityDTO) {
			return copy(iEntityDTO, (IEntityDTO)objData, fields);
		}
		
		if(fields!=null) {
			if(objData instanceof Map) {
				Map srcEntity = (Map)objData;
				if(fields!=null ) {
					for (String strField : fields) {
						String[] items = strField.trim().split("[|]");
						if (items.length == 1) {
							iEntityDTO.set(items[0], srcEntity.get(items[0]));
							continue;
						} else if (items.length >= 2) {
							iEntityDTO.set(items[1], srcEntity.get(items[0]));
							continue;
						}
					}
				}
				else {
					for(Object objKey : srcEntity.keySet()) {
						Object objValue = srcEntity.get(objKey);
						iEntityDTO.set((String)objKey, objValue);
					}
				}
			}
			else{
				exception(iEntityDTO, String.format("无法识别的源数据[%1$s]", objData));
				return null;
			}
		}
		
		return iEntityDTO;
	}

	
	public static IEntityDTO notify(IEntityDTO iEntityDTO, String strName) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		if (!StringUtils.hasLength(strName)) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("没有指定发送通知名称"));
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		IDynaInstRuntime lastDynaInstRuntime = actionSession.getDynaInstRuntime();
		IDynaInstRuntime lastChildDynaInstRuntime = actionSession.getChildDynaInstRuntime();

		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
		IPSDataEntity iPSDataEntity = null;
		IPSDENotify iPSDENotify = null;

		try {
			if (lastChildDynaInstRuntime != null) {
				iDynaInstDataEntityRuntime = lastChildDynaInstRuntime.getDynaInstDataEntityRuntime(iDataEntityRuntime.getId());
			}
			if (iDynaInstDataEntityRuntime == null && lastDynaInstRuntime != null) {
				iDynaInstDataEntityRuntime = lastDynaInstRuntime.getDynaInstDataEntityRuntime(iDataEntityRuntime.getId());
			}
			if (iDynaInstDataEntityRuntime != null) {
				iPSDataEntity = iDynaInstDataEntityRuntime.getPSDataEntity();
			} else {
				iPSDataEntity = iDataEntityRuntime.getPSDataEntity();
			}

			java.util.List<IPSDENotify> psDENotifyList = iPSDataEntity.getAllPSDENotifies();
			if (psDENotifyList != null) {
				for (IPSDENotify item : psDENotifyList) {
					if (strName.equalsIgnoreCase(item.getCodeName())) {
						iPSDENotify = item;
						break;
					}
				}
				if (iPSDENotify == null) {
					for (IPSDENotify item : psDENotifyList) {
						if (strName.equalsIgnoreCase(item.getName())) {
							iPSDENotify = item;
							break;
						}
					}
				}
			}
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]获取实体通知[%2$s]发生异常，%3$s", iDataEntityRuntime.getName(), strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取实体通知[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
		}

		if (iPSDENotify == null) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("无法获取指定实体通知[%1$s]模型对象", strName), Errors.MODELERROR);
		}

		IDENotifyRuntime iDENotifyRuntime = (iDynaInstDataEntityRuntime != null) ? iDynaInstDataEntityRuntime.getDENotifyRuntime(iPSDENotify) : iDataEntityRuntime.getDENotifyRuntime(iPSDENotify);
		iDENotifyRuntime.send(iEntityDTO);

		return iEntityDTO;
	}

	
	public static boolean canTransition(IEntityDTO iEntityDTO, IEntityDTO dst, boolean tryMode) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return false;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		IDEMSLogicRuntime iDEMSLogicRuntime = iDataEntityRuntime.getDEMSLogicRuntime(iEntityDTO, tryMode);
		if(iDEMSLogicRuntime == null) {
			return false;
		}
		
		return iDEMSLogicRuntime.canTransition(iEntityDTO, dst, tryMode);
		
	}

	/**
	 * 拷贝目标数据属性至当前数据对象
	 * @param iEntityDTO
	 * @param src
	 * @return
	 */
	public static IEntity putAll(IEntity iEntity, IEntity src) {
		Assert.notNull(iEntity, "传入数据对象无效");
		Assert.notNull(src, "传入源数据对象无效");
		if(src instanceof IEntityDTO) {
			((IEntityDTO)src).copyTo(iEntity, true);
		}
		else {
			src.copyTo(iEntity);
		}
		return iEntity;
	}
	
	public static IEntity from(IEntity iEntity, Object objData) {
		Assert.notNull(iEntity, "传入数据对象无效");
		if(ObjectUtils.isEmpty(objData)) {
			exception(iEntity, String.format("无法从空数据构建对象"));
			return null;
		}
		
		if(objData instanceof IEntity) {
			iEntity.resetAll();
			((IEntity)objData).copyTo(iEntity);
		}
		else
			if(objData instanceof Map) {
				Map map = (Map)objData;
				iEntity.resetAll();
				for(Object objKey : map.keySet()) {
					iEntity.set((String)objKey, map.get(objKey));
				}
			}
			else
			{
				IDataEntityRuntime iDataEntityRuntime = null;
				IEntityDTO iEntityDTO = null;
				if(iEntity instanceof IEntityDTO) {
					iEntityDTO = (IEntityDTO)iEntity;
					if(iEntityDTO.getDEMethodDTORuntime() != null) {
						iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
					}
				}
				
				if(iDataEntityRuntime != null) {
					IEntityBase iEntityBase = iDataEntityRuntime.deserializeEntity(objData);
					if(iEntityBase instanceof IEntity) {
						IEntity srcEntity = (IEntity)iEntityBase;
						iEntityDTO.resetAll();
						srcEntity.copyTo(iEntityDTO);
					}
					else {
							exception(iEntityDTO, String.format("无法识别的输入数据"));
							return null;
						}
				}
				else {
					Map map = JsonUtils.asMap(objData);
					if(map != null) {
						iEntity.resetAll();
						for(Object objKey : map.keySet()) {
							iEntity.set((String)objKey, map.get(objKey));
						}
					}
					else {
						exception(iEntity, String.format("无法识别的输入数据"));
						return null;
					}
				}
			}
		
		return iEntity;
	}
	
	
	
	public static String codelisttext(IEntityDTO iEntityDTO, String strName) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
		if(iPSDEField == null) {
			throw new RuntimeException(String.format("属性[%1$s]无效", strName));
		}
		IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
		if(iPSCodeList == null) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("属性[%1$s]未绑定代码表", iPSDEField.getName()));
		}
		
		ICodeListRuntime iCodeListRuntime = iDataEntityRuntime.getSystemRuntime().getCodeListRuntime(iPSCodeList);
		Object objValue = iEntityDTO.get(strName);
		try {
			if(ObjectUtils.isEmpty(objValue)) {
				return iCodeListRuntime.getEmptyText();
			}
			else {
				return iCodeListRuntime.getText(objValue);
			}
		}
		catch (Throwable ex) {
			log.error(String.format("获取代码表[%1$s]值[%2$s]文本发生异常，%3$s", iPSCodeList.getId(), objValue, ex.getMessage()));
			return ex.getMessage();
		}
	}
	
	

	
	public static IPSCodeItem codeitem(IEntityDTO iEntityDTO, String strName) {
		return codeitem(iEntityDTO, strName, false);
	}

	
	public static IPSCodeItem codeitem(IEntityDTO iEntityDTO, String strName, boolean bTryMode) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strName);
		if(iPSDEField == null) {
			throw new RuntimeException(String.format("属性[%1$s]无效", strName));
		}
		IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
		if(iPSCodeList == null) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("属性[%1$s]未绑定代码表", iPSDEField.getName()));
		}
		
		Object objValue = iEntityDTO.get(strName);
		if(ObjectUtils.isEmpty(objValue)) {
			return null;
		}
		
		return iDataEntityRuntime.getSystemRuntime().getCodeListRuntime(iPSCodeList.getCodeListTag()).getPSCodeItem(String.valueOf(objValue), bTryMode);
	}

	public static String dump(IEntity iEntity) {
		return iEntity.toString();
	}
	
	public static IEntityDTO rawUpdate(IEntityDTO iEntityDTO) {
		return rawUpdate(iEntityDTO, false);
	}
	

	public static IEntityDTO rawUpdate(IEntityDTO iEntityDTO, boolean sysMode) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			iDataEntityRuntime.rawUpdate(Arrays.asList(iEntityDTO), sysMode);
			return iEntityDTO;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]直接更新数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			DataEntityRuntimeException.rethrow(iDataEntityRuntime, ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("直接更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	public static boolean rawSelect(IEntityDTO iEntityDTO, boolean tryMode) {
		Assert.notNull(iEntityDTO, "传入数据对象无效");
		if(iEntityDTO.getDEMethodDTORuntime() == null) {
			exception(iEntityDTO, "未指定实体运行时对象，无法支持此操作");
			return false;
		}
		
		IDataEntityRuntime iDataEntityRuntime = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
		
		try {
			return iDataEntityRuntime.rawSelect(iEntityDTO, tryMode);
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]直接查询数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
			DataEntityRuntimeException.rethrow(iDataEntityRuntime, ex);
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("直接查询数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	public static IEntityDTO rawSelect(IEntityDTO iEntityDTO) {
		rawSelect(iEntityDTO, false);
		return iEntityDTO;
	}
}
