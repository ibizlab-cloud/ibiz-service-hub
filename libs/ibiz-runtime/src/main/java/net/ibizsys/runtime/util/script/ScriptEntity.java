package net.ibizsys.runtime.util.script;

import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
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
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 脚本实体对象接口实现
 * 
 * @author lionlau
 *
 */
public class ScriptEntity implements IScriptEntity {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ScriptEntity.class);
	
	private IDataEntityRuntime iDataEntityRuntime = null;
	private ISystemRuntime iSystemRuntime = null;
	private IEntityBase iEntityBase = null;
	private IEntity iEntity = null;
	private IScriptEntity lastScriptEntity = null;

	public ScriptEntity(IDataEntityRuntime iDataEntityRuntime, IEntityBase iEntityBase) {
		Assert.notNull(iDataEntityRuntime, "传入实体运行时对象无效");
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.iEntityBase = iEntityBase;
		if (this.iEntityBase == null) {
			this.iEntityBase = this.getDataEntityRuntime().createEntity();
		}
		if (this.iEntityBase instanceof IEntity) {
			this.iEntity = (IEntity) this.iEntityBase;
		}
	}
	
	public ScriptEntity(ISystemRuntime iSystemRuntime, IEntity iEntity) {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		this.iSystemRuntime = iSystemRuntime;
		this.iEntity = iEntity;
		if (this.iEntity == null) {
			this.iEntity = getSystemRuntime().createEntity();
		}
		this.iEntityBase = this.iEntity;
	}
	

	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	
	/**
	 * 获取系统模型对象
	 * @return
	 */
	protected ISystemRuntime getSystemRuntime() {
		if(this.iSystemRuntime == null) {
			return this.getDataEntityRuntime().getSystemRuntime();
		}
		return this.iSystemRuntime;
	}
	
	

	protected IEntityBase getEntityBase() {
		return this.iEntityBase;
	}

	protected IEntity getEntity() {
		return this.iEntity;
	}

	@Override
	public Object getReal() {
		return getEntityBase();
	}

	@Override
	public IScriptEntity set(String strName, Object objValue) {
		objValue = ScriptUtils.getReal(objValue);
		if(this.getDataEntityRuntime() != null) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
			if (iPSDEField != null) {
				this.getDataEntityRuntime().setFieldValue(this.getEntityBase(), iPSDEField, objValue);
			} else {
				log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", this.getDataEntityRuntime().getName(), strName));
				if (this.getEntity() != null) {
					this.getEntity().set(strName, objValue);
				}
			}
		}
		else {
			this.getEntity().set(strName, objValue);
		}
		return this;
	}

	@Override
	public IScriptEntity set(Object[] args) {
		if (args != null && args.length > 0) {
			int nSize = args.length / 2;
			for (int i = 0; i < nSize; i++) {
				Object objKey = args[i * 2];
				Object objValue = args[i * 2 + 1];
				if (ObjectUtils.isEmpty(objKey)) {
					continue;
				}
				if (objKey instanceof String) {
					this.set((String) objKey, objValue);
				} else {
					this.set(objKey.toString(), objValue);
				}
			}
		}
		return this;
	}

	@Override
	public IScriptEntity set(Object params) {
		params = ScriptUtils.getReal(params);
		if(params instanceof Map) {
			Map<String, Object> map = (Map<String, Object>)params;
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				this.set(entry.getKey(), entry.getValue());
			}
			return this;
		}
		exception(String.format("无法识别的参数对象[%1$s]", params));
		return null;
	}
	
	
	

	@Override
	public IScriptEntity field(String strName, Object objValue) {
		objValue = ScriptUtils.getReal(objValue);
		if(this.getDataEntityRuntime() != null) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
			if (iPSDEField != null) {
				this.getDataEntityRuntime().setFieldValue(this.getEntityBase(), iPSDEField, objValue);
			} else {
				exception(String.format("实体[%1$s]无法获取指定属性[%2$s]", this.getDataEntityRuntime().getName(), strName));
			}
		}
		else {
			this.getEntity().set(strName, objValue);
		}
		return this;
	}

	@Override
	public IScriptEntity field(Object[] args) {
		if (args != null && args.length > 0) {
			int nSize = args.length / 2;
			for (int i = 0; i < nSize; i++) {
				Object objKey = args[i * 2];
				Object objValue = args[i * 2 + 1];
				if (ObjectUtils.isEmpty(objKey)) {
					continue;
				}
				if (objKey instanceof String) {
					this.field((String) objKey, objValue);
				} else {
					this.field(objKey.toString(), objValue);
				}
			}
		}
		return this;
	}

	@Override
	public IScriptEntity field(Object params) {
		params = ScriptUtils.getReal(params);
		if(params instanceof Map) {
			Map<String, Object> map = (Map<String, Object>)params;
			for(java.util.Map.Entry<String, Object> entry : map.entrySet()) {
				this.field(entry.getKey(), entry.getValue());
			}
			return this;
		}
		exception(String.format("无法识别的参数对象[%1$s]", params));
		return null;
	}

	@Override
	public Object get(String strName) {
		if(this.getDataEntityRuntime() != null) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
			if (iPSDEField != null) {
				return this.getDataEntityRuntime().getFieldValue(this.getEntityBase(), iPSDEField);
			} else {
				log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", this.getDataEntityRuntime().getName(), strName));
				if (this.getEntity() != null) {
					return this.getEntity().get(strName);
				}
				return null;
			}
		}
		else {
			return this.getEntity().get(strName);
		}
	}
	
	@Override
	public Object get(String strName, Object objDefault) {
		Object value = this.get(strName);
		if(value == null) {
			return objDefault;
		}
		return value;
	}
	

	@Override
	public Object getId() {
		if(this.getDataEntityRuntime() != null) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField("ID");
			if(iPSDEField == null) {
				iPSDEField = this.getDataEntityRuntime().getKeyPSDEField();
			}
			if(iPSDEField == null) {
				return null;
			}
			
			return this.getDataEntityRuntime().getFieldValue(this.getEntityBase(), iPSDEField);
		}
		else {
			if(getEntity().contains(Entity.KEY)) {
				return this.getEntity().get(Entity.KEY);
			}
			return this.getEntity().get("id");
		}
	}
	
	
	@Override
	public Object getName() {
		if(this.getDataEntityRuntime() != null) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField("NAME");
			if(iPSDEField == null) {
				iPSDEField = this.getDataEntityRuntime().getMajorPSDEField();
			}
			if(iPSDEField == null) {
				return null;
			}
			return this.getDataEntityRuntime().getFieldValue(this.getEntityBase(), iPSDEField);
		}
		else {
			return this.getEntity().get("name");
		}
	}

	@Override
	public boolean contains(String strName) {
		if(this.getDataEntityRuntime() != null) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
			if (iPSDEField != null) {
				return this.getDataEntityRuntime().containsFieldValue(this.getEntityBase(), iPSDEField);
			} else {
				log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", this.getDataEntityRuntime().getName(), strName));
				if (this.getEntity() != null) {
					return this.getEntity().contains(strName);
				}
				return false;
			}
		}
		else {
			return this.getEntity().contains(strName);
		}
	}

	@Override
	public IScriptEntity reset(String strName) {
		if(this.getDataEntityRuntime() != null) {
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
			if (iPSDEField != null) {
				this.getDataEntityRuntime().resetFieldValue(this.getEntityBase(), iPSDEField);
			} else {
				log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", this.getDataEntityRuntime().getName(), strName));
				if (this.getEntity() != null) {
					this.getEntity().reset(strName);
				}
			}
		}
		else {
			this.getEntity().reset(strName);
		}
		return this;
	}

	@Override
	public IScriptEntity reset(String[] args) {
		if (args != null && args.length > 0) {
			int nSize = args.length;
			for (int i = 0; i < nSize; i++) {
				Object objKey = args[i];
				if (ObjectUtils.isEmpty(objKey)) {
					continue;
				}

				if (objKey instanceof String) {
					this.reset((String) objKey);
				} else {
					this.reset(objKey.toString());
				}
			}
		}
		return this;
	}

	@Override
	public IScriptEntity parent(String strName) {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		try {
			if (!StringUtils.hasLength(strName)) {
				// 没有指定父名称，计算从关系
				java.util.List<IPSDERBase> psDERBases = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
				if (psDERBases == null) {
					return null;
				}

				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
						IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
						if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
							return this.parent(psDERBase.getMajorPSDataEntity(), iPSDER1N.getPSPickupDEField());
						}
					} else {
						continue;
					}
				}

				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER11.equals(psDERBase.getDERType())) {
						return this.parent(psDERBase.getMajorPSDataEntity(), this.getDataEntityRuntime().getKeyPSDEField());
					} else {
						continue;
					}
				}

				return null;
			} else {
				// 获取属性
				IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
				if (iPSDEField != null) {
					if (iPSDEField instanceof IPSLinkDEField) {
						return parent(((IPSLinkDEField) iPSDEField).getPSDER().getMajorPSDataEntity(), iPSDEField);
					}
					
					//判断是否为预置父标识属性
					if(StringUtils.hasLength(iPSDEField.getPredefinedType())) {
						if(PredefinedFieldType.PARENTID.value.equals(iPSDEField.getPredefinedType())) {
							Object parentId = this.getDataEntityRuntime().getFieldValue(this.getEntityBase(), iPSDEField);
							if(ObjectUtils.isEmpty(parentId)) {
								return null;
							}
							
							java.util.List<IPSDERBase> psDERBases = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
							if (psDERBases == null) {
								return null;
							}
							
							IPSDEField parentTypePSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, false);
							
							Object parentType = this.getDataEntityRuntime().getFieldValue(this.getEntityBase(), parentTypePSDEField);
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
								
								return this.parent(psDERBase.getMajorPSDataEntity(), iPSDEField);
							}
							return null;
						}
					}
				}

				// 直接找实体
				java.util.List<IPSDERBase> psDERBases = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
				if (psDERBases == null) {
					return null;
				}
				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
						IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
						if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
							if (strName.equalsIgnoreCase(psDERBase.getMajorPSDataEntity().getName())) {
								return this.parent(psDERBase.getMajorPSDataEntity(), iPSDER1N.getPSPickupDEField());
							}
						}
					} else {
						continue;
					}
				}
				for (IPSDERBase psDERBase : psDERBases) {
					if (DERTypes.DER11.equals(psDERBase.getDERType())) {
						if (strName.equalsIgnoreCase(psDERBase.getMajorPSDataEntity().getName())) {
							return this.parent(psDERBase.getMajorPSDataEntity(), this.getDataEntityRuntime().getKeyPSDEField());
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
							return this.parent(psDERBase.getMajorPSDataEntity(), iPSDER1N.getPSPickupDEField());
						}
					} else {
						continue;
					}
				}
				return null;
			}
		} catch (Throwable ex) {
			log.error(String.format("实体获取引用数据[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("获取引用数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IScriptEntity parent(IPSDataEntity parentPSDataEntity, IPSDEField iPSDEField) throws Throwable {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		Object objValue = this.getDataEntityRuntime().getFieldValue(this.getEntityBase(), iPSDEField);
		if (ObjectUtils.isEmpty(objValue)) {
			return null;
		}

		IDataEntityRuntime parentDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(parentPSDataEntity.getDynaModelFilePath());
		Object objRet = parentDataEntityRuntime.executeAction(DEActions.GET, null, new Object[] { objValue });
		if (objRet != null && objRet instanceof IEntityBase) {
			return parentDataEntityRuntime.createScriptEntity((IEntityBase)objRet);
		}
		return null;
	}

	@Override
	public IScriptEntity create() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		try {
			this.getDataEntityRuntime().executeAction(DEActions.CREATE, null, new Object[] { this.getEntityBase() });
			return this;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]建立数据发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("建立数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public IScriptEntity update() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		try {
			this.getDataEntityRuntime().executeAction(DEActions.UPDATE, null, new Object[] { this.getEntityBase() });
			return this;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]更新数据发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public void remove() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		try {
			this.getDataEntityRuntime().executeAction(DEActions.REMOVE, null, new Object[] { this.getId() });
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]删除数据发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("删除数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public IScriptEntity wfstart() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		try {
			this.getDataEntityRuntime().executeAction(DEActions.WFSTART, null, new Object[] { this.getEntityBase() });
			return this;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]启动流程发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("启动流程发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	public IScriptEntity call(String strName) {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		try {
			this.getDataEntityRuntime().executeAction(strName, null, new Object[] { this.getEntityBase() });
			return this;
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]自定义调用[%3$s]发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage(), strName), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("自定义调用[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
		}
	}

	@Override
	public void exception(String strErrorInfo) {
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), strErrorInfo);
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), strErrorInfo);
	}
	
	

	@Override
	public void exception(String strErrorInfo, int nErrorCode) {
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), strErrorInfo, nErrorCode);
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), strErrorInfo, nErrorCode);
	}

	@Override
	public IScriptEntity[] children(String strName) {
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		try {
			// 查询子数据集合

			// 获取属性
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
			if (iPSDEField != null) {
				// 判断属性是否为一对多数据存储属性
				if (DEFDataTypes.ONE2MANYDATA.equals(iPSDEField.getDataType())) {
					return null;
				}
			}

			// 直接找实体
			java.util.List<IPSDERBase> psDERBases = this.getDataEntityRuntime().getPSDataEntity().getMajorPSDERs();
			if (psDERBases == null) {
				return null;
			}

			// 判断附属关系代码
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if (StringUtils.hasLength(iPSDER1N.getMinorCodeName()) && iPSDER1N.getMinorCodeName().equalsIgnoreCase(strName)) {
						return this.children(psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField(), psDERBase);
					}
				} else
					if (DERTypes.DERCUSTOM.equals(psDERBase.getDERType())) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) psDERBase;
						if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
							continue;
						}
						if (StringUtils.hasLength(iPSDERCustom.getMinorCodeName())
								&& iPSDERCustom.getMinorCodeName().equalsIgnoreCase(strName)
								&& iPSDERCustom.getPickupPSDEField() != null) {
							return children(psDERBase.getMinorPSDataEntity(), iPSDERCustom.getPickupPSDEField(), psDERBase);
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
							return this.children(psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField(), psDERBase);
						}
					}
				} else
					if (DERTypes.DERCUSTOM.equals(psDERBase.getDERType())) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) psDERBase;
						if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
							continue;
						}
						
						if ((iPSDERCustom.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED
								&& iPSDERCustom.getPickupPSDEField() != null) {
							if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
								return children(psDERBase.getMinorPSDataEntity(), iPSDERCustom.getPickupPSDEField(), psDERBase);
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
						return this.children(psDERBase.getMinorPSDataEntity(), null, psDERBase);
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
						return this.children(psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField(), psDERBase);
					}
				} else
					if (DERTypes.DERCUSTOM.equals(psDERBase.getDERType())) {
						IPSDERCustom iPSDERCustom = (IPSDERCustom) psDERBase;
						if(!DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
							continue;
						}
						
						if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())
								&& iPSDERCustom.getPickupPSDEField() != null) {
							if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
								return children(psDERBase.getMinorPSDataEntity(), iPSDERCustom.getPickupPSDEField(), psDERBase);
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
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("查询子数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IScriptEntity[] children(IPSDataEntity childPSDataEntity, IPSDEField iPSDEField, IPSDERBase psDERBase) throws Throwable {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		Object objValue = this.getId();
		if (ObjectUtils.isEmpty(objValue)) {
			return null;
		}

		IDataEntityRuntime childDataEntityRuntime = this.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(childPSDataEntity.getDynaModelFilePath());
		ISearchContextBase iSearchContextBase = childDataEntityRuntime.createSearchContext();
		if (iPSDEField != null) {
			childDataEntityRuntime.setSearchCondition(iSearchContextBase, iPSDEField, Conditions.EQ, objValue);
		} else {
			childDataEntityRuntime.setSearchCondition(iSearchContextBase, childDataEntityRuntime.getKeyPSDEField(), Conditions.EQ, objValue);
		}

		List<? extends IEntityBase> list = childDataEntityRuntime.select(iSearchContextBase);
		if (list == null) {
			return null;
		}

		IScriptEntity[] arr = new IScriptEntity[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = childDataEntityRuntime.createScriptEntity(list.get(i));
		}
		return arr;
	}

	@Override
	public IScriptEntity child(String strName) {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		try {
			// 直接找实体
			java.util.List<IPSDERBase> psDERBases = this.getDataEntityRuntime().getPSDataEntity().getMajorPSDERs();
			if (psDERBases == null) {
				return null;
			}
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
						if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
							return this.child(psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField());
						}
					}
				} else {
					continue;
				}
			}
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER11.equals(psDERBase.getDERType())) {
					if (strName.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getName())) {
						return this.child(psDERBase.getMinorPSDataEntity(), null);
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
						return this.child(psDERBase.getMinorPSDataEntity(), iPSDER1N.getPSPickupDEField());
					}
				} else {
					continue;
				}
			}

			return null;
		} catch (Throwable ex) {
			log.error(String.format("实体准备子数据[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("准备子数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected IScriptEntity child(IPSDataEntity childPSDataEntity, IPSDEField iPSDEField) throws Throwable {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		Object objValue = this.getId();
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
		return childDataEntityRuntime.createScriptEntity(iEntityBase);
	}

	@Override
	public boolean exists() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		if (ObjectUtils.isEmpty(this.getId())) {
			return false;
		}

		return this.getDataEntityRuntime().checkKeyState(this.getId()) == CheckKeyStates.EXIST;

	}

	@Override
	public IScriptEntity save() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		if (exists()) {
			return this.update();
		} else {
			return this.create();
		}
	}

	@Override
	public IScriptEntity clone(boolean bResetUncopyValues) {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		IEntityBase newEntity = null;
		try {
			newEntity = this.getDataEntityRuntime().clone(this.getEntityBase(), bResetUncopyValues);
		} catch (Throwable ex) {
			log.error(String.format("实体[%1$s]克隆数据对象发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("建立克隆数据对象发生异常，%1$s", ex.getMessage()), ex);
		}
		return this.getDataEntityRuntime().createScriptEntity(newEntity);
	}

	@Override
	public IScriptEntity callEntity() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		IEntityBase newEntity = this.getDataEntityRuntime().createEntity();
		this.getDataEntityRuntime().setFieldValue(newEntity, this.getDataEntityRuntime().getKeyPSDEField(), this.getId());
		return this.getDataEntityRuntime().createScriptEntity(newEntity);
	}

	@Override
	public IScriptEntity last() {
		
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		if (this.lastScriptEntity == null) {
			IEntityBase lastEntityBase = this.getDataEntityRuntime().getLastEntity();
			if (lastEntityBase == null) {
				// 直接获取之前
				try {
					lastEntityBase = this.getDataEntityRuntime().get(this.getId());
				} catch (Throwable ex) {
					log.error(String.format("实体[%1$s]获取数据发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage()), ex);
					throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("获取数据发生异常，%1$s", ex.getMessage()), ex);
				}
			}
			if (lastEntityBase != null) {
				this.lastScriptEntity = this.getDataEntityRuntime().createScriptEntity(lastEntityBase);
			}
		}
		return lastScriptEntity;
	}

	@Override
	public IScriptEntity copy(IScriptEntity srcScriptEntity, String[] fields) {
		if (srcScriptEntity != null) {
			if(fields != null) {
				for (String strField : fields) {
					String[] items = strField.trim().split("[|]");
					if (items.length == 1) {
						this.set(items[0], srcScriptEntity.get(items[0]));
						continue;
					} else if (items.length >= 2) {
						this.set(items[1], srcScriptEntity.get(items[0]));
						continue;
					}
				}
			}
		}
		return this;
	}
	
	@Override
	public IScriptEntity copy(Object objData, String[] fields) {
		if(objData instanceof IScriptEntity) {
			return this.copy((IScriptEntity)objData, fields);
		}
		
		if(fields!=null) {
			if(this.getEntity() == null) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getDataEntityRuntime(), String.format("当前数据对象不支持此操作"));
				//throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("当前数据对象不支持此操作"));
			}
			
			objData = ScriptUtils.getReal(objData);
			if(objData instanceof Map) {
				Map srcEntity = (Map)objData;
				if(fields!=null ) {
					for (String strField : fields) {
						String[] items = strField.trim().split("[|]");
						if (items.length == 1) {
							this.set(items[0], srcEntity.get(items[0]));
							continue;
						} else if (items.length >= 2) {
							this.set(items[1], srcEntity.get(items[0]));
							continue;
						}
					}
				}
				else {
					for(Object objKey : srcEntity.keySet()) {
						Object objValue = srcEntity.get(objKey);
						this.set((String)objKey, objValue);
					}
				}
			}
			else{
				throw new SystemRuntimeException(this.getSystemRuntime(), this.getDataEntityRuntime(), String.format("无法识别的源数据"));
				//throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法识别的源数据"));
			}
		}
		
		return this;
	}

	@Override
	public IScriptEntity notify(String strName) {

		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		if (!StringUtils.hasLength(strName)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("没有指定发送通知名称"));
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		IDynaInstRuntime lastDynaInstRuntime = actionSession.getDynaInstRuntime();
		IDynaInstRuntime lastChildDynaInstRuntime = actionSession.getChildDynaInstRuntime();

		IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
		IPSDataEntity iPSDataEntity = null;
		IPSDENotify iPSDENotify = null;

		try {
			if (lastChildDynaInstRuntime != null) {
				iDynaInstDataEntityRuntime = lastChildDynaInstRuntime.getDynaInstDataEntityRuntime(this.getDataEntityRuntime().getId());
			}
			if (iDynaInstDataEntityRuntime == null && lastDynaInstRuntime != null) {
				iDynaInstDataEntityRuntime = lastDynaInstRuntime.getDynaInstDataEntityRuntime(this.getDataEntityRuntime().getId());
			}
			if (iDynaInstDataEntityRuntime != null) {
				iPSDataEntity = iDynaInstDataEntityRuntime.getPSDataEntity();
			} else {
				iPSDataEntity = this.getDataEntityRuntime().getPSDataEntity();
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
			log.error(String.format("实体[%1$s]获取实体通知[%2$s]发生异常，%3$s", this.getDataEntityRuntime().getName(), strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("获取实体通知[%1$s]发生异常，%2$s", strName, ex.getMessage()), ex);
		}

		if (iPSDENotify == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法获取指定实体通知[%1$s]模型对象", strName), Errors.MODELERROR);
		}

		IDENotifyRuntime iDENotifyRuntime = (iDynaInstDataEntityRuntime != null) ? iDynaInstDataEntityRuntime.getDENotifyRuntime(iPSDENotify) : this.getDataEntityRuntime().getDENotifyRuntime(iPSDENotify);
		iDENotifyRuntime.send(this.getEntityBase());

		return this;
	}

	@Override
	public IScriptEntity from(Object objData) {
		if(ObjectUtils.isEmpty(objData)) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getDataEntityRuntime(), String.format("无法从空数据构建对象"));
		}
		//Assert.notNull(objData, "不能传入空数据");
		
		if(this.getEntity() == null) {
			//throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("当前数据对象不支持此操作"));
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getDataEntityRuntime(), String.format("当前数据对象不支持此操作"));
		}
		
		objData = ScriptUtils.getReal(objData);
		if(objData instanceof IEntity) {
			this.getEntity().resetAll();
			((IEntity)objData).copyTo(this.getEntity());
		}
		else
			if(objData instanceof Map) {
				Map map = (Map)objData;
				this.getEntity().resetAll();
				for(Object objKey : map.keySet()) {
					this.getEntity().set((String)objKey, map.get(objKey));
				}
			}
			else
			{
				if(this.getDataEntityRuntime() != null) {
					IEntityBase iEntityBase = this.getDataEntityRuntime().deserializeEntity(objData);
					if(iEntityBase instanceof IEntity) {
						IEntity srcEntity = (IEntity)iEntityBase;
						this.getEntity().resetAll();
						srcEntity.copyTo(this.getEntity());
					}
					else
						throw new SystemRuntimeException(this.getSystemRuntime(), this.getDataEntityRuntime(), String.format("无法识别的输入数据"));
				}
				else {
					Map map = this.getSystemRuntime().deserialize(objData, Map.class);
					if(map != null) {
						this.getEntity().resetAll();
						for(Object objKey : map.keySet()) {
							this.getEntity().set((String)objKey, map.get(objKey));
						}
					}
					else
						throw new SystemRuntimeException(this.getSystemRuntime(), this.getDataEntityRuntime(), String.format("无法识别的输入数据"));
				}
			}
		
		return this;
	}
	
	
	@Override
	public String codelisttext(String strName) {
		if(this.getDataEntityRuntime() == null) {
			throw new RuntimeException("实体运行时对象无效");
		}
		
		IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
		if(iPSDEField == null) {
			throw new RuntimeException(String.format("属性[%1$s]无效", strName));
		}
		IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
		if(iPSCodeList == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("属性[%1$s]未绑定代码表", iPSDEField.getName()));
		}
		
		ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(iPSCodeList);
		Object objValue = this.get(strName);
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
	
	

	@Override
	public IScriptCodeItem codeitem(String strName) {
		return this.codeitem(strName, false);
	}

	@Override
	public IScriptCodeItem codeitem(String strName, boolean bTryMode) {
		if(this.getDataEntityRuntime() == null) {
			throw new RuntimeException("实体运行时对象无效");
		}
		
		IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
		if(iPSDEField == null) {
			throw new RuntimeException(String.format("属性[%1$s]无效", strName));
		}
		IPSCodeList iPSCodeList = iPSDEField.getPSCodeList();
		if(iPSCodeList == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("属性[%1$s]未绑定代码表", iPSDEField.getName()));
		}
		
		Object objValue = this.get(strName);
		if(ObjectUtils.isEmpty(objValue)) {
			return null;
		}
		
		IScriptCodeList iScriptCodeList = this.getSystemRuntime().getSystemRTScriptContext().codelist(iPSCodeList.getCodeListTag());
		return iScriptCodeList.item(objValue, bTryMode);
	}

	@Override
	public String dump() {
		if(this.getDataEntityRuntime() != null) {
			Object objData = this.getDataEntityRuntime().serializeEntity(this.getEntityBase());
			if(objData == null) {
				return null;
			}
			if(objData instanceof String) {
				return (String)objData;
			}
			return objData.toString();
		}
		else {
			Object objData = this.getSystemRuntime().serialize(this.getEntityBase());
			if(objData == null) {
				return null;
			}
			if(objData instanceof String) {
				return (String)objData;
			}
			return objData.toString();
		}
	}
}
