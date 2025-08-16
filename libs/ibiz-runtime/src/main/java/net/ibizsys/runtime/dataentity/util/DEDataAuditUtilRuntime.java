package net.ibizsys.runtime.dataentity.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.dataentity.defield.DEFPredefinedTypes;
import net.ibizsys.runtime.dataentity.security.DEDataAuditModes;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.DataAudit;
import net.ibizsys.runtime.util.domain.DataAuditDetail;

/**
 * 实体审计功能运行时对象实现
 * @author lionlau
 *
 */
public class DEDataAuditUtilRuntime extends DEUtilRuntimeBase implements IDEDataAuditUtilRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataAuditUtilRuntime.class);
	
	private static Map<String,String> IgnoreAuditDEFPredefinedTypeMap = new HashMap<String,String>();
	private static String[] DataAuditFields = new String[] {DataAudit.FIELD_AUDITINFO,DataAudit.FIELD_AUDITTYPE,DataAudit.FIELD_IPADDRESS,DataAudit.FIELD_IPADDRESS
			,DataAudit.FIELD_OBJECTID,DataAudit.FIELD_OBJECTTYPE,DataAudit.FIELD_OPPERSONID,DataAudit.FIELD_OPPERSONNAME,DataAudit.FIELD_SESSIONID};
	static {
		IgnoreAuditDEFPredefinedTypeMap.put(DEFPredefinedTypes.LOGICVALID, "");
		IgnoreAuditDEFPredefinedTypeMap.put(DEFPredefinedTypes.CREATEMAN, "");
		IgnoreAuditDEFPredefinedTypeMap.put(DEFPredefinedTypes.CREATEMANNAME, "");
		IgnoreAuditDEFPredefinedTypeMap.put(DEFPredefinedTypes.CREATEDATE, "");
		IgnoreAuditDEFPredefinedTypeMap.put(DEFPredefinedTypes.UPDATEMAN, "");
		IgnoreAuditDEFPredefinedTypeMap.put(DEFPredefinedTypes.UPDATEMANNAME, "");
		IgnoreAuditDEFPredefinedTypeMap.put(DEFPredefinedTypes.UPDATEDATE, "");
	}
	
	private IDataEntityRuntime dataAuditDataEntityRuntime = null;
	
	private Map<String, IPSDEField> dataAuditPSDEFieldMap = null;
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	
	@Override
	public void auditAction(Object curData, IEntityBase lastEntityBase, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDataEntityRuntime iDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData) {
		
		Assert.notNull(iDataEntityRuntime, "传入实体运行时对象无效");
		
		if(iDataEntityRuntime.getDataAuditMode() == DEDataAuditModes.NONE) {
			log.warn(String.format("实体[%1$s]没有启用数据审计模式，忽略审计作业",iPSDataEntity.getName()));
			return;
		}
		
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		
		Object objKey = null;
		IEntityBase curEntityBase  = null;
		if(curData instanceof IEntityBase) {
			curEntityBase = (IEntityBase)curData;
			objKey = iDataEntityRuntime.getFieldValue(curEntityBase, iDataEntityRuntime.getKeyPSDEField());
		}
		else {
			objKey = curData;
		}
		
		String strAction = strActionName;
		String strActionLogicName = null;
		if(iPSDEAction != null) {
			strActionLogicName = iPSDEAction.getLogicName();
		}
		if(!StringUtils.hasLength(strActionLogicName)) {
			strActionLogicName = strAction;
		}
		
		
		DataAudit dataAudit = new DataAudit();
		
		dataAudit.setOpPersonId(actionSession.getUserContext().getUserid());
		dataAudit.setOpPersonName(actionSession.getUserContext().getUsername());
		dataAudit.setIPAddress(actionSession.getUserContext().getRemoteaddress());
		dataAudit.setObjectType(iDataEntityRuntime.getName());
		dataAudit.setObjectId(DataTypeUtils.getStringValue(objKey, null));
		dataAudit.setAuditType(strAction);
		String strInfo = String.format("%1$s %2$s %3$s", DateUtils.getCurTimeString(), actionSession.getUserContext().getUsername(), strActionLogicName);
		dataAudit.setDataAuditName(strInfo);
		
		if(iDataEntityRuntime.getDataAuditMode()  == DEDataAuditModes.ADVANCE
				&& curEntityBase != null) {
			List<DataAuditDetail> dataAudtiDetails = getDataAuditDetails(curEntityBase, lastEntityBase, iPSDataEntity, iDataEntityRuntime, iDynaInstRuntime);
			if(dataAudtiDetails != null) {
				dataAudit.setDataauditdetails(dataAudtiDetails);
				//序列化为Json数组
				ArrayNode arrayNode = JsonUtils.createArrayNode();
				for(DataAuditDetail dataAuditDetail : dataAudtiDetails) {
					try {
						JsonNode jsonNode;
						jsonNode = JsonUtils.MAPPER.readTree(JsonUtils.MAPPER.writeValueAsString(dataAuditDetail));
						arrayNode.add(jsonNode);
					} catch (JsonProcessingException ex) {
						throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]序列化审计记录发生异常，%2$s",iDataEntityRuntime.getName(),ex.getMessage()), ex);
					} catch (IOException ex) {
						throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]序列化审计记录发生异常，%2$s",iDataEntityRuntime.getName(),ex.getMessage()), ex);
					}
				}
				dataAudit.setAuditInfo(arrayNode.toString());
			}
		}
		
		logDataAudit(dataAudit, curEntityBase, lastEntityBase, iPSDataEntity, iDataEntityRuntime, iDynaInstRuntime);
	}
	
	protected void logDataAudit(DataAudit dataAudit, IEntityBase curEntityBase,IEntityBase lastEntityBase, IPSDataEntity iPSDataEntity, IDataEntityRuntime iDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime) {
		IDataEntityRuntime dataAuditDataEntityRuntime = getDataAuditDataEntityRuntime();
		
		IEntityBase dataAuditEntity = dataAuditDataEntityRuntime.createEntity();
		IPSDEField iPSDEField = dataAuditDataEntityRuntime.getPSDEField(DataAudit.FIELD_DATAAUDITNAME);
		if(iPSDEField == null) {
			iPSDEField = dataAuditDataEntityRuntime.getMajorPSDEField();
		}
		//设置主属性
		if(iPSDEField != null) {
			dataAuditDataEntityRuntime.setFieldValue(dataAuditEntity, iPSDEField, dataAudit.getDataAuditName());
		}
		
		
		//执行建立操作
		try {
			
			Map<String, IPSDEField> dataAuditPSDEFieldMap = this.getDataAuditPSDEFieldMap();
			if(dataAuditPSDEFieldMap == null) {
				throw new Exception("审计实体属性映射无效");
			}
			
			for(String strField : DataAuditFields) {
				iPSDEField = dataAuditPSDEFieldMap.get(strField);
				if(iPSDEField != null) {
					dataAuditDataEntityRuntime.setFieldValue(dataAuditEntity, iPSDEField, dataAudit.get(strField));
				}
			}
			
			dataAuditDataEntityRuntime.create(dataAuditEntity);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]日志审计信息发生异常，%2$s",iDataEntityRuntime.getName(), ex.getMessage()), ex);
		}
	}
	

	
	public static List<DataAuditDetail> getDataAuditDetails(IEntityBase curEntityBase,IEntityBase lastEntityBase, IPSDataEntity iPSDataEntity, IDataEntityRuntime iDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime) {
		
		List<DataAuditDetail> list = new ArrayList<DataAuditDetail>();
		java.util.List<IPSDEField> psDEFields;
		try {
			psDEFields = iDataEntityRuntime.getPSDataEntity().getAllPSDEFields();
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]获取属性集合发生异常，%2$s",iDataEntityRuntime.getName(), ex.getMessage()), Errors.MODELERROR, ex);
		}
		for(IPSDEField iPSDEField:psDEFields) {
			if (!iPSDEField.isEnableAudit()) {
				continue;
			}
			
			if(iPSDEField.isKeyDEField() || iPSDEField.isUniTagField()) {
				continue;
			}
			
			if(StringUtils.hasLength(iPSDEField.getPredefinedType())) {
				if(IgnoreAuditDEFPredefinedTypeMap.containsKey(iPSDEField.getPredefinedType())) {
					continue;
				}
			}
			
			// 对比两个值
			if(!iDataEntityRuntime.containsFieldValue(curEntityBase, iPSDEField)) {
				continue;
			}
			
			if(lastEntityBase!=null) {
				if(!iDataEntityRuntime.containsFieldValue(lastEntityBase, iPSDEField)) {
					continue;
				}
			}

			Object objNewValue = iDataEntityRuntime.getFieldValue(curEntityBase, iPSDEField);
			Object objOldValue = null;
			
			if(lastEntityBase!=null) {
				objOldValue = iDataEntityRuntime.getFieldValue(lastEntityBase, iPSDEField);
			}
			
			if(objNewValue != null) {
				Object simpleValue = DataTypeUtils.asSimple(objNewValue);
				if(simpleValue == null) {
					objNewValue = JsonUtils.toString(objNewValue);
				}
			}
			
			if(objOldValue != null) {
				Object simpleValue = DataTypeUtils.asSimple(objOldValue);
				if(simpleValue == null) {
					objOldValue = JsonUtils.toString(objOldValue);
				}
			}
			
			if (objNewValue == null && objOldValue == null) {
				continue;
			}

			if (objNewValue != null && objOldValue != null) {
				if(iDataEntityRuntime.getSystemRuntime().compareValue(objNewValue, objOldValue, iPSDEField.getStdDataType()) == 0) {
					continue;
				}
			}
			
			DataAuditDetail dataAuditDetail = new DataAuditDetail();
			dataAuditDetail.setDataAuditDetailName(iPSDEField.getName());
			dataAuditDetail.setLogicName(iPSDEField.getLogicName());
			if(objNewValue != null) {
				if(objNewValue instanceof String) {
					dataAuditDetail.setNewValue((String)objNewValue);
				}
				else {
					if(StringUtils.hasLength(iPSDEField.getValueFormat())) {
						try {
							dataAuditDetail.setNewValue(String.format(iPSDEField.getValueFormat(), objNewValue));
						}
						catch (Exception ex) {
							log.error(ex);
							dataAuditDetail.setNewValue(objNewValue.toString());
						}
					}
					else {
						dataAuditDetail.setNewValue(objNewValue.toString());
					}
				}
			}
			if(objOldValue != null) {
				if(objOldValue instanceof String) {
					dataAuditDetail.setOldValue((String)objOldValue);
				}
				else {
					if(StringUtils.hasLength(iPSDEField.getValueFormat())) {
						try {
							dataAuditDetail.setOldValue(String.format(iPSDEField.getValueFormat(), objOldValue));
						}
						catch (Exception ex) {
							log.error(ex);
							dataAuditDetail.setOldValue(objOldValue.toString());
						}
					}
					else {
						dataAuditDetail.setOldValue(objOldValue.toString());
					}
				}
			}
			
			//添加到列表中
			list.add(dataAuditDetail);
			
			IPSCodeList iPSCodeList = null;
			try {
				iPSCodeList = iPSDEField.getPSCodeList();
			} catch (Exception ex) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]属性[%2$s]获取代码表对象发生异常，%3$s",iDataEntityRuntime.getName(), iPSDEField.getName(), ex.getMessage()),Errors.MODELERROR);
			}
			ICodeListRuntime iCodeListRuntime = null;
			if(iPSCodeList != null) {
				if(iDynaInstRuntime != null) {
					iCodeListRuntime = iDynaInstRuntime.getCodeListRuntime(iPSCodeList);
				}
				else {
					iCodeListRuntime = iDataEntityRuntime.getSystemRuntime().getCodeListRuntime(iPSCodeList);
				}
				if(objNewValue != null) {
					try {
						dataAuditDetail.setNewText(iCodeListRuntime.getText(objNewValue));
					} catch (Throwable ex) {
						throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]属性[%2$s]计算代码值文本发生异常，%3$s",iDataEntityRuntime.getName(), iPSDEField.getName(), ex.getMessage()),Errors.MODELERROR,ex);
					}
				}
				if(objOldValue != null) {
					try {
						dataAuditDetail.setOldText(iCodeListRuntime.getText(objOldValue));
					} catch (Throwable ex) {
						dataAuditDetail.setOldText(String.valueOf(objOldValue));
						log.error(ex);
						//throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]属性[%2$s]计算代码值文本发生异常，%3$s",iDataEntityRuntime.getName(), iPSDEField.getName(), ex.getMessage()),Errors.MODELERROR, ex);
					}
				}
			}
			else {
				//判断属性是否为外键值属性，如果是则从外键值文本中获取显示内容
				IPSDEField pickupTextPSDEField = null;
				if(DEFDataTypes.PICKUP.equals(iPSDEField.getDataType())) {
					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField)iPSDEField;
					try {
						pickupTextPSDEField = ((IPSDER1N)iPSLinkDEField.getPSDER()).getPSPickupTextDEField();
					} catch (Exception ex) {
						throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]属性[%2$s]获取外键值文本属性发生异常，%3$s",iDataEntityRuntime.getName(), iPSDEField.getName(), ex.getMessage()),Errors.MODELERROR,ex);
					}
				}
				else
					if(iPSDEField.isInheritDEField()) {
						IPSLinkDEField iPSLinkDEField = (IPSLinkDEField)iPSDEField;
						try {
							IPSDEField relatedPSDEField = iPSLinkDEField.getRelatedPSDEField();
							if(DEFDataTypes.PICKUP.equals(relatedPSDEField.getDataType())) {
								iPSLinkDEField = (IPSLinkDEField)relatedPSDEField;
								pickupTextPSDEField = ((IPSDER1N)iPSLinkDEField.getPSDER()).getPSPickupTextDEField();
								if(pickupTextPSDEField != null) {
									//转为为当前实体的属性
									pickupTextPSDEField = iDataEntityRuntime.getPSDEField(pickupTextPSDEField.getName());
								}
							}
						} catch (Exception ex) {
							throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体[%1$s]属性[%2$s]获取外键值文本属性发生异常，%3$s",iDataEntityRuntime.getName(), iPSDEField.getName(), ex.getMessage()),Errors.MODELERROR, ex);
						}
					}
				
				if(pickupTextPSDEField != null) {
					Object newText = iDataEntityRuntime.getFieldValue(curEntityBase, pickupTextPSDEField);
					Object oldText = null;
					if(lastEntityBase != null) {
						oldText = iDataEntityRuntime.getFieldValue(lastEntityBase, pickupTextPSDEField);
					}
					
					if(newText instanceof String) {
						dataAuditDetail.setNewText((String)newText);
					}
					else {
						if(newText != null) {
							dataAuditDetail.setNewText(newText.toString());
						}
					}
					
					if(oldText instanceof String) {
						dataAuditDetail.setOldText((String)oldText);
					}
					else {
						if(oldText != null) {
							dataAuditDetail.setOldText(oldText.toString());
						}
					}
				}
			}
		}
		
		if(list.size() == 0) {
			return null;
		}
		
		return list;
	}
	

	/**
	 * 获取数据审计记录实体运行时
	 * @return
	 */
	protected IDataEntityRuntime getDataAuditDataEntityRuntime() {
		if(this.dataAuditDataEntityRuntime == null) {
			IPSDataEntity dataAuditPSDataEntity = getDataAuditPSDataEntity();
			Assert.notNull(dataAuditPSDataEntity, "数据审计记录实体无效");
			try {
				this.dataAuditDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(dataAuditPSDataEntity.getDynaModelFilePath());
			} catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取指定实体[%1$s]运行时对象发生异常，%2$s",dataAuditPSDataEntity.getName(),ex.getMessage()),ex);
			}
		}
		
		return this.dataAuditDataEntityRuntime;
	}
	
	protected Map<String, IPSDEField> getDataAuditPSDEFieldMap() throws Exception {
		if(this.dataAuditPSDEFieldMap == null) {
			Map<String, IPSDEField> psDEFieldMap = new LinkedHashMap<String, IPSDEField>();
			for(String strTag : DataAuditFields) {
				psDEFieldMap.put(strTag, null);
			}
			java.util.List<IPSDEField> psDEFieldList = this.getDataAuditPSDataEntity().getAllPSDEFields();
			if(!ObjectUtils.isEmpty(psDEFieldList)) {
				for(IPSDEField iPSDEField : psDEFieldList) {
					String strTag = iPSDEField.getFieldTag();
					if(!StringUtils.hasLength(strTag)) {
						continue;
					}
					
					strTag = strTag.toLowerCase();
					if(!psDEFieldMap.containsKey(strTag)) {
						continue;
					}
					
					if(psDEFieldMap.get(strTag) == null) {
						psDEFieldMap.put(strTag, iPSDEField);
					}
				}
				
				for(IPSDEField iPSDEField : psDEFieldList) {
					String strTag = iPSDEField.getName().toLowerCase();
					if(!psDEFieldMap.containsKey(strTag)) {
						continue;
					}
					
					if(psDEFieldMap.get(strTag) == null) {
						psDEFieldMap.put(strTag, iPSDEField);
					}
				}
			}
			
			if(this.dataAuditPSDEFieldMap == null) {
				this.dataAuditPSDEFieldMap = psDEFieldMap;
			}
			
		}
		return this.dataAuditPSDEFieldMap;
	}
	
	
	/**
	 * 获取数据审计记录实体
	 * @return
	 */
	protected IPSDataEntity getDataAuditPSDataEntity() {

		IPSDataEntity iPSDataEntity = null;
		if(this.getPSDEUtil()!=null) {
			try {
				iPSDataEntity = this.getPSDEUtil().getUtilPSDE();
				if(iPSDataEntity == null) {
					throw new Exception("未指定审计实体");
				}
			} catch (Exception ex) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("实体功能[%1$s]获取审计记录实体发生异常，%2$s",this.getName(),ex.getMessage()),Errors.MODELERROR, ex);
			}
		}
		
		if(this.getPSSysUtil()!=null) {
			try {
				iPSDataEntity = this.getPSSysUtil().getUtilPSDE();
				if(iPSDataEntity == null) {
					throw new Exception("没有指定");
				}
			} catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("系统功能[%1$s]获取审计记录实体发生异常，%2$s",this.getName(),ex.getMessage()),Errors.MODELERROR,ex);
			}
		}
	
		return iPSDataEntity;
	}

}
