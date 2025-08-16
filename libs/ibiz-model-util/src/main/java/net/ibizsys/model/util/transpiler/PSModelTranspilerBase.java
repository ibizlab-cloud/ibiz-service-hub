package net.ibizsys.model.util.transpiler;

import java.util.List;
import java.util.StringJoiner;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSObjectImpl;
import net.ibizsys.model.app.control.IPSAppCounter;
import net.ibizsys.model.app.dataentity.IPSAppDEField;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.control.counter.IPSSysCounter;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.psmodel.core.util.IPSModel;

public abstract class PSModelTranspilerBase implements IPSModelTranspiler{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelTranspilerBase.class);
	
	@Override
	public IPSModel decompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		Assert.notNull(iPSModelTranspileContext, "上下文对象无效");
		Assert.notNull(iPSModelObject, "模型对象无效");
		Assert.notNull(domain, "域对象无效");
		this.onDecompile(iPSModelTranspileContext, iPSModelObject, domain,  bFullMode);
		return domain;
	}
	
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(StringUtils.hasLength(iPSModelObject.getName())) {
			domain.setName(iPSModelObject.getName());
		}
		if(StringUtils.hasLength(iPSModelObject.getMemo())) {
			this.setDomainValue(iPSModelTranspileContext, domain, "memo", iPSModelObject.getMemo(), iPSModelObject, "getMemo");
		}
		if(StringUtils.hasLength(iPSModelObject.getCodeName())) {
			this.setDomainValue(iPSModelTranspileContext, domain, "codename", iPSModelObject.getCodeName(), iPSModelObject, "getCodeName");
		}
		if(StringUtils.hasLength(iPSModelObject.getUserCat())) {
			this.setDomainValue(iPSModelTranspileContext, domain, "usercat", iPSModelObject.getUserCat(), iPSModelObject, "getUserCat");
		}
		if(StringUtils.hasLength(iPSModelObject.getUserTag())) {
			this.setDomainValue(iPSModelTranspileContext, domain, "usertag", iPSModelObject.getUserTag(), iPSModelObject, "getUserTag");
		}
		if(StringUtils.hasLength(iPSModelObject.getUserTag2())) {
			this.setDomainValue(iPSModelTranspileContext, domain, "usertag2", iPSModelObject.getUserTag2(), iPSModelObject, "getUserTag2");
		}
		if(StringUtils.hasLength(iPSModelObject.getUserTag3())) {
			this.setDomainValue(iPSModelTranspileContext, domain, "usertag3", iPSModelObject.getUserTag3(), iPSModelObject, "getUserTag3");
		}
		if(StringUtils.hasLength(iPSModelObject.getUserTag4())) {
			this.setDomainValue(iPSModelTranspileContext, domain, "usertag4", iPSModelObject.getUserTag4(), iPSModelObject, "getUserTag4");
		}
	}
	
	
	protected void setDomainValue(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, String strPropertyName, Object objValue, IPSModelObject iPSModelObject, String strMethodName) throws Exception {
		this.setDomainValue(iPSModelTranspileContext, domain, strPropertyName, objValue, iPSModelObject, strMethodName, null);
	}
	
	
	/**
	 * 设置域对象值
	 * @param domain
	 * @param strPropertyName
	 * @param objValue
	 * @param iPSModelObject
	 * @param strMethodName
	 * @param ignoreValues 忽略设置值
	 * @throws Exception
	 */
	protected void setDomainValue(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, String strPropertyName, Object objValue, IPSModelObject iPSModelObject, String strMethodName, String[] ignoreValues) throws Exception {
		if(objValue == null) {
			return;
		}
		
		if(objValue instanceof Boolean) {
			domain.set(strPropertyName, ((boolean)objValue)?1:0);
			return;
		}
		
		if(objValue instanceof IPSModelObject) {
			IPSModelObject realPSModelObject = getRealPSModelObject((IPSModelObject)objValue);
			if(realPSModelObject!=null) {
				domain.set(strPropertyName, iPSModelTranspileContext.getPSModelUniqueTag(realPSModelObject));
				if(strPropertyName.lastIndexOf("id") == strPropertyName.length()-2) {
					domain.set(strPropertyName.substring(0, strPropertyName.length()-2) + "name", realPSModelObject.getName());
				}
			}
			
			return;
		}
		
		if(ignoreValues!=null) {
			String strValue = objValue.toString();
			for(String strItem : ignoreValues) {
				if(strItem.equals(strValue)) {
					return;
				}
			}
		}
		
		domain.set(strPropertyName, objValue);
	}
	
	protected void setDomainListValue(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, String strPropertyName, Object objValue, IPSModelObject iPSModelObject, String strMethodName, Class<?> cls) throws Exception {
		if(ObjectUtils.isEmpty(objValue)) {
			return;
		}
		
		if(objValue instanceof List) {
			List list = (List)objValue;
			StringJoiner sj = new StringJoiner(";");
			for (Object o : list) {
				sj.add(String.valueOf(o));
			}
			
			domain.set(strPropertyName, sj.toString());
			return;
		}
		
		
		log.error(String.format("无法识别的数组值对象[%1$s]", objValue));
	}
	
	protected IPSModelObject getRealPSModelObject(IPSModelObject iPSModelObject) throws Exception {
		if(iPSModelObject instanceof IPSAppDEField) {
			IPSAppDEField iPSAppDEField = (IPSAppDEField)iPSModelObject;
			IPSAppDataEntity iPSAppDataEntity = iPSModelObject.getParentPSModelObject(IPSAppDataEntity.class, false);
			if(iPSAppDataEntity.getPSDataEntity() != null) {
				if(StringUtils.hasLength(iPSAppDEField.getName()) && iPSAppDataEntity.getPSDataEntity().getAllPSDEFields() != null) {
					for(IPSDEField iPSDEField : iPSAppDataEntity.getPSDataEntity().getAllPSDEFields()) {
						if(iPSAppDEField.getName().equalsIgnoreCase(iPSDEField.getName())) {
							return iPSDEField;
						}
					}
				}
				
				return iPSAppDataEntity.getPSDataEntity().getPSDEField(iPSModelObject.getId(), false);
			}
			return null;
		}
		
		if(iPSModelObject instanceof IPSAppCounter) {
			IPSAppCounter iPSAppCounter = (IPSAppCounter)iPSModelObject;
			IPSSystem iPSSystem = iPSModelObject.getParentPSModelObject(IPSSystem.class, false);
			if(!ObjectUtils.isEmpty(iPSSystem.getAllPSSysCounters())) {
				for(IPSSysCounter iPSSysCounter : iPSSystem.getAllPSSysCounters()) {
					if(!StringUtils.hasLength(iPSSysCounter.getUniqueTag())
							|| !StringUtils.hasLength(iPSAppCounter.getUniqueTag())) {
						continue;
					}
					if(iPSSysCounter.getUniqueTag().equalsIgnoreCase(iPSAppCounter.getUniqueTag())) {
						return iPSSysCounter;
					}
				}
			}
			return null;
		}
		
		
//		if(iPSModelObject instanceof IPSAppCodeList) {
//			IPSAppCodeList iPSAppCodeList = (IPSAppCodeList)iPSModelObject;
//			IPSSystem iPSSystem = iPSModelObject.getParentPSModelObject(IPSSystem.class, false);
//			List<IPSCodeList> psCodeLists = iPSSystem.getAllPSCodeLists();
//			if(!ObjectUtils.isEmpty(psCodeLists)) {
//				for(IPSCodeList iPSCodeList : psCodeLists) {
//					if(!StringUtils.hasLength(iPSCodeList.getCodeListTag())) {
//						continue;
//					}
//					
//					if(iPSCodeList.getCodeListTag().equalsIgnoreCase(iPSAppCodeList.getCodeListTag())) {
//						return iPSCodeList;
//					}
//				}
//			}
//			throw new Exception(String.format("无法获取指定应用代码表[%1$s]对应的系统代码表", iPSAppCodeList.getName()));
//		}
		
		return iPSModelObject;
	}

	@Override
	public ObjectNode compile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		Assert.notNull(iPSModelTranspileContext, "上下文对象无效");
		Assert.notNull(domain, "域对象无效");
		Assert.notNull(objectNode, "模型节点无效");
		this.onCompile(iPSModelTranspileContext, domain,  objectNode);
		return objectNode;
	}
	
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		if(!objectNode.has(PSObjectImpl.ATTR_GETNAME)) {
			String name = domain.getName();
			if(StringUtils.hasLength(name)) {
				objectNode.put(PSObjectImpl.ATTR_GETNAME, name);
			}
		}
		
//		if(!objectNode.has(PSObjectImpl.ATTR_GETID)) {
//			String id = domain.getId();
//			if(StringUtils.hasLength(id)) {
//				objectNode.put(PSObjectImpl.ATTR_GETID, id);
//			}
//		}
		
		if(!objectNode.has(PSObjectImpl.ATTR_GETCODENAME)) {
			String codeName = (String)domain.get("codename");
			if(StringUtils.hasLength(codeName)) {
				objectNode.put(PSObjectImpl.ATTR_GETCODENAME, codeName);
			}
		}
		
		if(!objectNode.has(PSObjectImpl.ATTR_GETUSERCAT)) {
			String value = (String)domain.get("usercat");
			if(StringUtils.hasLength(value)) {
				objectNode.put(PSObjectImpl.ATTR_GETUSERCAT, value);
			}
		}
		
		if(!objectNode.has(PSObjectImpl.ATTR_GETUSERTAG)) {
			String value = (String)domain.get("usertag");
			if(StringUtils.hasLength(value)) {
				objectNode.put(PSObjectImpl.ATTR_GETUSERTAG, value);
			}
		}
		
		if(!objectNode.has(PSObjectImpl.ATTR_GETUSERTAG2)) {
			String value = (String)domain.get("usertag2");
			if(StringUtils.hasLength(value)) {
				objectNode.put(PSObjectImpl.ATTR_GETUSERTAG2, value);
			}
		}

		if(!objectNode.has(PSObjectImpl.ATTR_GETUSERTAG3)) {
			String value = (String)domain.get("usertag3");
			if(StringUtils.hasLength(value)) {
				objectNode.put(PSObjectImpl.ATTR_GETUSERTAG3, value);
			}
		}
		
		if(!objectNode.has(PSObjectImpl.ATTR_GETUSERTAG4)) {
			String value = (String)domain.get("usertag4");
			if(StringUtils.hasLength(value)) {
				objectNode.put(PSObjectImpl.ATTR_GETUSERTAG4, value);
			}
		}
		
		
		
	}
	
	protected void setModelValue(IPSModelTranspileContext iPSModelTranspileContext, ObjectNode objectNode, String strPropertyName, IPSModel iPSModel, String strFieldName, Class<?> cls) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, strPropertyName, iPSModel, strFieldName, cls, null);
	}

	protected void setModelValue(IPSModelTranspileContext iPSModelTranspileContext, ObjectNode objectNode, String strPropertyName, IPSModel iPSModel, String strFieldName, Class<?> cls, String[] ignoreValues) throws Exception {
		Object objValue = iPSModel.get(strFieldName);
		this.setModelValue(iPSModelTranspileContext, objectNode, strPropertyName, objValue, cls, ignoreValues);
		
	}
	
	protected void setModelValue(IPSModelTranspileContext iPSModelTranspileContext, ObjectNode objectNode, String strPropertyName, Object objValue, Class<?> cls, String[] ignoreValues) throws Exception {
		if(ObjectUtils.isEmpty(objValue)) {
			return;
		}
		
		if(ignoreValues!=null) {
			if(Boolean.class.isAssignableFrom(cls) || boolean.class.isAssignableFrom(cls)) {
				objValue = DataTypeUtils.getBooleanValue(objValue, null);
			}
			
			
			String strValue = objValue.toString();
			for(String strItem : ignoreValues) {
				if(strItem.equals(strValue)) {
					return;
				}
			}
		}
		
		if(String.class.isAssignableFrom(cls)) {
			objValue = DataTypeUtils.getStringValue(objValue, null);
			objectNode.put(strPropertyName, (String)objValue);
			return;
		}
		
		if(Integer.class.isAssignableFrom(cls) || int.class.isAssignableFrom(cls)) {
			objValue = DataTypeUtils.getIntegerValue(objValue, null);
			objectNode.put(strPropertyName, (Integer)objValue);
			return;
		}
		
		if(Boolean.class.isAssignableFrom(cls) || boolean.class.isAssignableFrom(cls)) {
			objValue = DataTypeUtils.getBooleanValue(objValue, null);
			objectNode.put(strPropertyName, (Boolean)objValue);
			return;
		}
		
		if(Double.class.isAssignableFrom(cls) || double.class.isAssignableFrom(cls)) {
			objValue = DataTypeUtils.getDoubleValue(objValue, null);
			objectNode.put(strPropertyName, (Double)objValue);
			return;
		}
		
		if(Float.class.isAssignableFrom(cls) || float.class.isAssignableFrom(cls)) {
			objValue = DataTypeUtils.getFloatValue(objValue, null);
			objectNode.put(strPropertyName, (Float)objValue);
			return;
		}
		
//		if(ObjectNode.class.isAssignableFrom(cls)) {
//			
//		}
		
		objectNode.put(strPropertyName, objValue.toString());
		
		log.error(String.format("无法识别的值对象[%1$s]", objValue));
		
	}
	
	protected void setModelValue(IPSModelTranspileContext iPSModelTranspileContext, ObjectNode objectNode, String strPropertyName, IPSModel iPSModel, String strFieldName, Class<? extends IPSModelObject> cls, boolean childMode) throws Exception {
		Object objValue = iPSModel.get(strFieldName);
		if(ObjectUtils.isEmpty(objValue)) {
			return;
		}
		
		iPSModelTranspileContext.getPSModelListTranspiler(cls, false).getModelRef(iPSModelTranspileContext, objValue.toString(), childMode, objectNode.putObject(strPropertyName));
	}
	
	protected void setModelListValue(IPSModelTranspileContext iPSModelTranspileContext, ObjectNode objectNode, String strPropertyName, IPSModel iPSModel, String strFieldName, Class<?> cls) throws Exception {
		Object objValue = iPSModel.get(strFieldName);
		if(ObjectUtils.isEmpty(objValue)) {
			return;
		}
		
		String strValue = objValue.toString();
		String[] items = strValue.split("[;,]");
		
		if(String.class.isAssignableFrom(cls)) {
			ArrayNode arrayNode = objectNode.putArray(strPropertyName);
			for(String item : items) {
				arrayNode.add(item);
			}
			return;
		}
		
		if(Integer.class.isAssignableFrom(cls) || int.class.isAssignableFrom(cls)) {
			ArrayNode arrayNode = objectNode.putArray(strPropertyName);
			for(String item : items) {
				arrayNode.add(Integer.parseInt(item));
			}
			return;
		}
		
		log.error(String.format("无法识别的数组值对象[%1$s]", objValue));
		
	}
	
	protected <T extends IPSModelObject> T getPSModelObject(IPSModelTranspileContext iPSModelTranspileContext, Class<T> cls, List<T> list, String strTag, boolean bTryMode) throws Exception {
//		if(cls.equals(IPSDataEntity.class)) {
//			if(strTag.indexOf("@") != -1) {
//				strTag = strTag.split("[@]")[1];
//			}
//		}
		if (list != null) {
			for (T item : list) {
				String strFullTag = iPSModelTranspileContext.getPSModelUniqueTag(item);
				if (StringUtils.hasLength(strFullTag) && strFullTag.equalsIgnoreCase(strTag)) {
					return item;
				}
			}
		}
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定模型对象[%1$s]", strTag));
	}
	
	public static String getParentId(String strId) {
		String[] items = strId.split("[.]");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < items.length - 1; i++) {
			if (i != 0) {
				sb.append(".");
			}
			sb.append(items[i]);
		}
		return sb.toString();
	}
	
	public static String getSimpleId(String strId) {
		String[] items = strId.split("[.]");
		return items[items.length - 1];
	}
}
