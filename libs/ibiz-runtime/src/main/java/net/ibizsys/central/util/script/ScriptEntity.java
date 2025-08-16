package net.ibizsys.central.util.script;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

public class ScriptEntity extends net.ibizsys.runtime.util.script.ScriptEntity implements IScriptEntity {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ScriptEntity.class);
	
	public ScriptEntity(IDataEntityRuntime iDataEntityRuntime, IEntityBase iEntityBase) {
		super(iDataEntityRuntime, iEntityBase);
	}
	
	public ScriptEntity(ISystemRuntime iSystemRuntime, IEntity iEntity) {
		super(iSystemRuntime, iEntity);
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	@Override
	protected IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}

	
	@Override
	public Object get(String strName) {
		Object objValue = super.get(strName);
		if(objValue == null) {
			return objValue;
		}
		
		return this.getSystemRuntime().createScriptObject(objValue);
		
	}

//	@Override
//	public Object call(String strName, Object... objects) {
//		if(this.getDataEntityRuntime() == null) {
//			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
//		}
//		
//		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), "没有实现", Errors.NOTIMPL);
////		try {
////			
////			//需要转化入参及出参
////			
////			Object objRet = this.getDataEntityRuntime().executeAction(strName, null, new Object[] { this.getEntityBase() });
////			return objRet;
////		} catch (Throwable ex) {
////			log.error(String.format("实体[%1$s]自定义调用[%3$s]发生异常，%2$s", this.getDataEntityRuntime().getName(), ex.getMessage(), strName), ex);
////			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("自定义调用[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
////		}
//	}
	
	
	@Override
	public Timestamp getTimestamp(String strName, Timestamp def) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getTimestamp(strName, def);			
		}
		try {
			return DataTypeUtils.getDateTimeValue(super.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public BigDecimal getBigDecimal(String strName, BigDecimal fDefault) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getBigDecimal(strName, fDefault);			
		}
		try {
			return DataTypeUtils.getBigDecimalValue(super.get(strName), fDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public BigInteger getBigInteger(String strName, BigInteger nDefault) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getBigInteger(strName, nDefault);			
		}
		try {
			return DataTypeUtils.getBigIntegerValue(super.get(strName), nDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Boolean getBoolean(String strName, Boolean def) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getBoolean(strName, def);			
		}
		
		try {
			return DataTypeUtils.getBooleanValue(super.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Double getDouble(String strName, Double def) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getDouble(strName, def);			
		}
		try {
			return DataTypeUtils.getDoubleValue(super.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Float getFloat(String strName, Float def) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getFloat(strName, def);			
		}
		try {
			return DataTypeUtils.getFloatValue(super.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	
	@Override
	public Integer getInteger(String strName, Integer def) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getInteger(strName, def);			
		}
		try {
			return DataTypeUtils.getIntegerValue(super.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	

	@Override
	public Long getLong(String strName, Long def) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getLong(strName, def);			
		}
		try {
			return DataTypeUtils.getLongValue(super.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public String getString(String strName, String strDefault) {
		if(this.getReal() instanceof IEntityDTO) {
			return ((IEntityDTO)this.getReal()).getString(strName, strDefault);			
		}
		try {
			return DataTypeUtils.getStringValue(super.get(strName), strDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	@Override
	public IScriptEntity[] children(String strName) {
		if(this.getDataEntityRuntime() != null) {
			// 获取属性
			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
			if (iPSDEField != null) {
				Object value = this.getDataEntityRuntime().getFieldValue(this.getEntity(), iPSDEField);
				if(!ObjectUtils.isEmpty(value)) {
					List<IScriptEntity> scriptEntityList = new ArrayList<IScriptEntity>();
					// 判断属性是否为一对多数据存储属性
					if (DEFDataTypes.ONE2MANYDATA.equals(iPSDEField.getDataType())) {
						IPSOne2ManyDataDEField iPSOne2ManyDataDEField = (IPSOne2ManyDataDEField)iPSDEField;
						IDataEntityRuntime childrenDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSOne2ManyDataDEField.getPSDERMust().getMinorPSDataEntityMust().getId());
						List list = null;
						if(iPSOne2ManyDataDEField.isMap()) {
							list = new ArrayList<>();
							Map map = (Map)value;
							list.addAll(map.values());
						}
						else {
							list = (List)value;
						}
						
						if(ObjectUtils.isEmpty(list) ) {
							return null;
						}
						
						for(Object item : list) {
							IScriptEntity iScriptEntity = (IScriptEntity)childrenDataEntityRuntime.createScriptEntity((IEntityBase)item);
							scriptEntityList.add(iScriptEntity);
						}
						
						return scriptEntityList.toArray(new IScriptEntity[scriptEntityList.size()]);
					}
				}	
			}
		}
		
		return (IScriptEntity[])super.children(strName);
	}
	
	@Override
	protected net.ibizsys.runtime.util.script.IScriptEntity[] children(IPSDataEntity childPSDataEntity, IPSDEField iPSDEField, IPSDERBase iPSDERBase) throws Throwable {
		if(this.getDataEntityRuntime() == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), "未指定实体运行时对象，无法支持此操作");
		}
		
		Object objValue = this.getId();
		if (ObjectUtils.isEmpty(objValue)) {
			return null;
		}
		
		IDataEntityRuntime childDataEntityRuntime = this.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(childPSDataEntity.getDynaModelFilePath());
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
					//strParentType = this.getDataEntityRuntime().getName();
					strParentType = this.getDataEntityRuntime().getDERParentType();
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

		net.ibizsys.runtime.util.script.IScriptEntity[] arr = new net.ibizsys.runtime.util.script.IScriptEntity[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = childDataEntityRuntime.createScriptEntity(list.get(i));
		}
		return arr;
	}
	
	
	@Override
	public String toJsonString() {
		return this.toJsonString(false);
	}
	
	
	@Override
	public String toJsonString(boolean bDTO) {
		return this.toJsonString(bDTO, "text");
	}
	
	
	@Override
	public String toJsonString(boolean bDTO, String strSuffix) {
		try {
			Entity entity = new Entity();
			if(bDTO) {
				if(this.getReal() instanceof IEntityDTO) {
					Map<String, Object> any = ((IEntityDTO)this.getReal()).any(true);
					if(any != null) {
						entity.putAll(any);
					}
				}
				else
					if(this.getReal() instanceof IEntity) {
						((IEntity)this.getReal()).copyTo(entity);
					}
			}
			else {
				if(this.getReal() instanceof IEntity) {
					((IEntity)this.getReal()).copyTo(entity);
				}
			}
			
			if(this.getDataEntityRuntime()!=null) {
				this.getDataEntityRuntime().fillEntityCodeListTexts(entity, strSuffix);
			}
			
			return WebClientBase.MAPPER.writeValueAsString(entity);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	@Override
	public String toString() {
		try {
			Entity entity = new Entity();
			if(this.getReal() instanceof IEntity) {
				((IEntity)this.getReal()).copyTo(entity);
			}
			return WebClientBase.MAPPER.writeValueAsString(entity);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
