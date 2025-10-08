package net.ibizsys.model;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.model.wf.IPSWFLink;

public class PSModelUtils {

	
	
	/**
	 * 计算模型唯一标记
	 * @param strTag
	 * @return
	 */
	public static String calcUniqueTag(String strTag) {
		if(!StringUtils.hasLength(strTag)) {
			return null;
		}
		return strTag.toLowerCase();
	}
	
	
	/**
	 * 计算模型唯一标记
	 * @param iPSSystemModule
	 * @param strTag
	 * @return
	 */
	public static String calcUniqueTag(IPSSystemModule iPSSystemModule, String strTag) {
		if(!StringUtils.hasLength(strTag)) {
			return null;
		}
		if(iPSSystemModule == null) {
			return strTag.toLowerCase();
		}
		
		if(iPSSystemModule.getPSSysModelGroup() != null) {
			return String.format("%1$s.%2$s.%3$s", iPSSystemModule.getPSSysModelGroup().getCodeName(), iPSSystemModule.getCodeName(), strTag).toLowerCase();
		}
		else {
			return String.format("%1$s.%2$s", iPSSystemModule.getCodeName(), strTag).toLowerCase();
		}
	}
	
	
	/**
	 * 计算模型唯一标记
	 * @param iPSSysModelGroup
	 * @param strTag
	 * @return
	 */
	public static String calcUniqueTag(IPSSysModelGroup iPSSysModelGroup, String strTag) {
		if(!StringUtils.hasLength(strTag)) {
			return null;
		}
		if(iPSSysModelGroup == null) {
			return strTag.toLowerCase();
		}
		
		return String.format("%1$s.%2$s", iPSSysModelGroup.getCodeName(), strTag).toLowerCase();
	}
	
	
	/**
	 * 计算模型唯一标记
	 * @param iPSModelObject
	 * @return
	 */
	public static String calcUniqueTag(IPSModelObject iPSModelObject) {
		return calcUniqueTag(iPSModelObject, false);
	}
	
	/**
	 * 计算模型唯一标记
	 * @param iPSModelObject
	 * @param bSimple
	 * @return
	 */
	public static String calcUniqueTag(IPSModelObject iPSModelObject, boolean bSimple) {
		String strId = calcUniqueTag2(iPSModelObject, bSimple);
		if(!StringUtils.hasLength(strId)) {
			return null;
		}
		return strId.toLowerCase();
	}
	
	/**
	 * 计算模型唯一标记
	 * @param iPSModelObject
	 * @return
	 */
	public static String calcUniqueTag2(IPSModelObject iPSModelObject) {
		return calcUniqueTag2(iPSModelObject, false);
	}
	
	/**
	 * 计算模型唯一标记
	 * @param iPSModelObject
	 * @param bSimple
	 * @return
	 */
	public static String calcUniqueTag2(IPSModelObject iPSModelObject, boolean bSimple) {
		String strId = iPSModelObject.getId();
		if(!StringUtils.hasLength(strId)) {
			return null;
		}
		
		int nPos = strId.indexOf(".json");
		if(nPos != -1 && nPos == (strId.length() - 5)) {
			strId = strId.substring(0, strId.length() - 5);
			if(iPSModelObject instanceof IPSApplication) {
				strId = strId.substring(0, strId.length() - 9);
			}
		}
		
		if(!StringUtils.hasLength(strId)) {
			return null;
		}
		
		
		String[] ids = strId.split("[/]");
		if(ids.length > 1) {
			if(bSimple) {
				//return ids[ids.length -1].toLowerCase();
				return ids[ids.length -1];
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 1;i<ids.length;i++) {
				if(i%2 == 0) {
					sb.append(".");
				}
				else {
					sb.append(ids[i]);
				}
			}
			return sb.toString();
		}
		else {
			return strId;
		}
	}
	
	
	public static String calcFullUniqueTag(IPSModelObject iPSModelObject) {
		return calcFullUniqueTag(iPSModelObject, false);
	}
	
	public static String calcFullUniqueTag(IPSModelObject iPSModelObject, boolean bAppendParentIf) {
		String strId = calcFullUniqueTag2(iPSModelObject, bAppendParentIf);
		if(StringUtils.hasLength(strId)) {
			return strId.toLowerCase();
		}
		return strId;
	}
	
	
	public static String calcFullUniqueTag2(IPSModelObject iPSModelObject) {
		return calcFullUniqueTag2(iPSModelObject, false);
	}
	
	
	public static String calcFullUniqueTag2(IPSModelObject iPSModelObject, boolean bAppendParentIf) {
		String strId = iPSModelObject.getId();
		if(!StringUtils.hasLength(strId)) {
			return null;
		}
		
		int nPos = strId.indexOf(".json");
		if(nPos != -1 && nPos == (strId.length() - 5)) {
			strId = strId.substring(0, strId.length() - 5);
			if(iPSModelObject instanceof IPSApplication) {
				strId = strId.substring(0, strId.length() - 9);
			}
		}
		else {
			
			strId = strId.replace(" ", "_").replace(".", "_");
			
			if(iPSModelObject instanceof IPSWFLink) {
				IPSWFLink iPSWFLink = (IPSWFLink)iPSModelObject;
				if(StringUtils.hasLength(iPSWFLink.getFromPSWFProcessMust().getId())) {
					strId = String.format("%1$s.%2$s",iPSWFLink.getFromPSWFProcessMust().getId().replace(" ", "_").replace(".", "_"), strId);
				}
				
			}
//			else
//				if(iPSModelObject instanceof IPSDELogicLink) {
//					IPSDELogicLink iPSDELogicLink = (IPSDELogicLink)iPSModelObject;
//					strId = String.format("%1$s.%2$s",iPSDELogicLink.getParentPSModelObject().getId(), strId);
//				}
			String strParentId = null;
			if(bAppendParentIf) {
				IPSModelObject parentPSModelObject = iPSModelObject.getParentPSModelObject();
				IPSModelObject lastPSModelObject = iPSModelObject;
				while(parentPSModelObject != null) {
					String strId2 = parentPSModelObject.getId();
					if(StringUtils.hasLength(strId2)) {
						int nPos2 = strId2.indexOf(".json");
						if(nPos2 != -1) {
							strParentId = calcUniqueTag2(parentPSModelObject);
							break;
						}
					}
					if(StringUtils.hasLength(parentPSModelObject.getId())) {
						strId = String.format("%1$s.%2$s",parentPSModelObject.getId().replace(" ", "_").replace(".", "_"), strId);
					}
					
					lastPSModelObject = parentPSModelObject;
					parentPSModelObject = parentPSModelObject.getParentPSModelObject();
				}
			}
			
			if(!StringUtils.hasLength(strParentId)) {
				return strId;
			}
			else {
				return String.format("%1$s.%2$s", strParentId, strId);
			}
		}
		
		if(!StringUtils.hasLength(strId)) {
			return null;
		}
		
		String[] ids = strId.split("[/]");
		if(ids.length > 1) {
			StringBuilder sb = new StringBuilder();
			for(int i = 1;i<ids.length;i++) {
				if(i%2 == 0) {
					sb.append(".");
				}
				else {
					sb.append(ids[i]);
				}
			}
			return sb.toString();
		}
		else {
			return strId;
		}
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
	
	
	/**
	 * 写入引用模型节点
	 * @param parentNode
	 * @param strAttrName
	 * @param refModelObject
	 * @return
	 */
	public static ObjectNode putRefPSModelObject(ObjectNode parentNode, String strAttrName, IPSModelObject refModelObject) {
		ObjectNode refPSModelObject = parentNode.putObject(strAttrName);
		refPSModelObject.put("modelref", true);
		if(StringUtils.hasLength(refModelObject.getDynaModelFilePath())) {
			refPSModelObject.put("path", refModelObject.getDynaModelFilePath());
		}
		else {
			refPSModelObject.put("id", refModelObject.getId());
		}
		return refPSModelObject;
	}

}
