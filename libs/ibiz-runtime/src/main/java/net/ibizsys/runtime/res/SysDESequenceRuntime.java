package net.ibizsys.runtime.res;

import java.math.BigInteger;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 系统实体值序列运行时对象
 * 
 * @author lionlau
 *
 */
public class SysDESequenceRuntime extends SysSequenceRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDESequenceRuntime.class);
	
	private IDataEntityRuntime iDataEntityRuntime = null;
	private IPSDEField valuePSDEField = null;
	private IPSDEField keyPSDEField = null;
	private IPSDEField typePSDEField = null;
	private IPSDEField timePSDEField = null;
	
	
	private String strTag = null;
	
	private String strInterProcessMutexTag = null;
	
	@Override
	protected void onInit() throws Exception {
		IPSDataEntity iPSDataEntity = this.getPSSysSequence().getPSDataEntity();
		if (iPSDataEntity == null) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("系统值序列[%1$s]没有指定实体对象", this.getName()));
		}
		
		this.valuePSDEField = this.getPSSysSequence().getValuePSDEField();
		if (this.valuePSDEField == null) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("系统值序列[%1$s]没有指定值存储属性", this.getName()));
		}
		
		this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getDynaModelFilePath());
		
		this.keyPSDEField = this.getPSSysSequence().getKeyPSDEField();
		if(this.keyPSDEField == null) {
			this.keyPSDEField = this.getDataEntityRuntime().getKeyPSDEField();
		}
		
		this.strTag = this.getPSSysSequence().getSequenceTag();
		if(!StringUtils.hasLength(this.strTag)) {
			this.strTag = this.getPSSysSequence().getCodeName();
		}
		
		this.typePSDEField = this.getPSSysSequence().getTypePSDEField();
		this.timePSDEField = this.getPSSysSequence().getTimePSDEField();
		
		
		this.strInterProcessMutexTag = KeyValueUtils.genUniqueId(this.getSystemRuntime().getDeploySystemId(), iPSDataEntity.getId(), this.strTag);
		
		super.onInit();
	}
	
	
	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	public synchronized Object get(IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable{
		
		return ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGet( iEntityBase, iPSDEField, entityDataEntityRuntime);
			}
		}, null, this.strInterProcessMutexTag, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
		
		
	}

	
	protected Object onGet(IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable{
	
		ISearchContextBase searchContext = this.getDataEntityRuntime().createSearchContext();
		this.getDataEntityRuntime().setSearchCondition(searchContext, this.keyPSDEField, Conditions.EQ, this.strTag);
		//类型处理
		Object objTypeValue = null;
		if(this.typePSDEField != null && iEntityBase != null) {
			if(this.getPSSysSequence().getExtFormatParams()!=null
					&& this.getPSSysSequence().getExtFormatParams().length > 0) {
				if(entityDataEntityRuntime!=null) {
					IPSDEField paramDEField = entityDataEntityRuntime.getPSDEField(this.getPSSysSequence().getExtFormatParams()[0]);
					if(paramDEField != null) {
						objTypeValue = entityDataEntityRuntime.getFieldValue(iEntityBase, paramDEField);
					}
					else {
						objTypeValue = ((IEntity)iEntityBase).get(this.getPSSysSequence().getExtFormatParams()[0]); 
					}
				}
				else {	
					objTypeValue = ((IEntity)iEntityBase).get(this.getPSSysSequence().getExtFormatParams()[0]); 
				}
				this.getDataEntityRuntime().setSearchCondition(searchContext, this.typePSDEField, Conditions.EQ, objTypeValue);
			}
		}
		
		//时间处理
		String strTimeString = null;
		if(this.timePSDEField != null) {
			if(StringUtils.hasLength(this.getPSSysSequence().getTimeFormat())) {
				strTimeString = String.format(this.getPSSysSequence().getTimeFormat(), new java.util.Date());
			}
			else {
				strTimeString = String.format("%1$tY", new java.util.Date());
			}
			this.getDataEntityRuntime().setSearchCondition(searchContext, this.timePSDEField, Conditions.EQ, strTimeString);
		}
		
		long nValue = 1;
		IEntityBase data = null;
		try {
			data = this.getDataEntityRuntime().selectOne(searchContext);
		}
		catch(DataEntityRuntimeException ex) {
			if(ex.getErrorCode() != Errors.INVALIDDATA) {
				throw ex;
			}
		}
		
		//IEntityBase data = this.getDataEntityRuntime().selectOne(searchContext);
		if(data == null) {
			//数据还未建立
			if(this.getPSSysSequence().getMinValue()!=null) {
				nValue = this.getPSSysSequence().getMinValue().longValue();
			}
			else {
				nValue = 1;
			}
			
			data = this.getDataEntityRuntime().createEntity();
			this.getDataEntityRuntime().setFieldValue(data, this.keyPSDEField, this.strTag);
			this.getDataEntityRuntime().setFieldValue(data, this.valuePSDEField,  nValue);
			if(this.typePSDEField != null) {
				this.getDataEntityRuntime().setFieldValue(data, this.typePSDEField, objTypeValue);
			}
			if(this.timePSDEField != null) {
				this.getDataEntityRuntime().setFieldValue(data, this.timePSDEField, strTimeString);
			}
			
			this.getDataEntityRuntime().executeAction(DEActions.CREATE, null, new Object[] {data});	
		}
		else {
			Object objValue = this.getDataEntityRuntime().getFieldValue(data, this.valuePSDEField);
			if(objValue == null) {
				if(this.getPSSysSequence().getMinValue()!=null) {
					nValue = this.getPSSysSequence().getMinValue().longValue();
				}
				else {
					nValue = 1;
				}
				
			}
			else {
				nValue =  DataTypeUtils.getBigIntegerValue(objValue, BigInteger.valueOf(nValue)).longValue();
				nValue += 1;
			}
			
			Object objKeyValue = this.getDataEntityRuntime().getFieldValue(data, this.getDataEntityRuntime().getKeyPSDEField());
			
			//更新回数据
			data = this.getDataEntityRuntime().createEntity();
			this.getDataEntityRuntime().setFieldValue(data, this.getDataEntityRuntime().getKeyPSDEField(), objKeyValue);
			this.getDataEntityRuntime().setFieldValue(data, this.keyPSDEField, this.strTag);
			this.getDataEntityRuntime().setFieldValue(data, this.valuePSDEField,  nValue );
			this.getDataEntityRuntime().executeAction(DEActions.UPDATE, null, new Object[] {data});	
			
		}
		
		//判断是否有格式
		if(StringUtils.hasLength(this.getPSSysSequence().getSequenceFormat())) {
		
			int nLength = 2;
			if(this.getPSSysSequence().getExtFormatParams()!=null) {
				nLength += this.getPSSysSequence().getExtFormatParams().length;
			}
			
			Object[] arr = new Object[nLength];
			arr[0] = nValue;
			arr[1] = new java.util.Date();
			
			if(this.getPSSysSequence().getExtFormatParams()!=null && iEntityBase!=null) {
				int nIndex = 2;
				for(String strParam : this.getPSSysSequence().getExtFormatParams()) {
					if(entityDataEntityRuntime != null) {
						IPSDEField paramDEField = entityDataEntityRuntime.getPSDEField(strParam);
						if(paramDEField != null) {
							arr[nIndex] = entityDataEntityRuntime.getFieldValue(iEntityBase, paramDEField);
						}
						else {
							arr[nIndex] = ((IEntity)iEntityBase).get(strParam); 
						}
					}
					else {
						arr[nIndex] = ((IEntity)iEntityBase).get(strParam); 
					}
					nIndex ++;
				}
			}
			
			return DataTypeUtils.format(this.getPSSysSequence().getSequenceFormat(), arr);
		}
		
		return nValue;
		
	}
}