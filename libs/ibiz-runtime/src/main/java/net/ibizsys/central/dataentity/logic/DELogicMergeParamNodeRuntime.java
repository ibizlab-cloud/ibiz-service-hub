package net.ibizsys.central.dataentity.logic;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.AggMode;
import net.ibizsys.model.PSModelEnums.DELNMergeParamMode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.model.dataentity.logic.IPSDEMergeParamLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 实体合并逻辑数组参数节点运行时对象
 * @author lionlau
 *
 */
public class DELogicMergeParamNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDEMergeParamLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDEMergeParamLogic iPSDEMergeParamLogic = (IPSDEMergeParamLogic)iPSDELogicNode;
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEMergeParamLogic.getSrcPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDEMergeParamLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		//获取源参数
		Object objParam = srcDELogicParamRuntime.getReal(iDELogicSession);
		List srcList = DELogicParamRuntime.asList(objParam);
		if(srcList == null) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定列表参数[%2$s]类型不正确", iPSDELogicNode.getName(), iPSDEMergeParamLogic.getSrcPSDELogicParamMust().getCodeName()));
		}
		objParam = dstDELogicParamRuntime.getReal(iDELogicSession);
		List dstList = DELogicParamRuntime.asList(objParam);
		if(dstList == null) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定列表参数[%2$s]类型不正确", iPSDELogicNode.getName(), iPSDEMergeParamLogic.getDstPSDELogicParamMust().getCodeName()));
		}
		
		Map<String, String> groupFieldMap = new LinkedHashMap<String, String>();
		List<IPSDELogicNodeParam> psDELogicNodeParamList = iPSDEMergeParamLogic.getPSDELogicNodeParams();
		if(!ObjectUtils.isEmpty(psDELogicNodeParamList)) {
			for(IPSDELogicNodeParam psDELogicNodeParam : psDELogicNodeParamList) {
				if(!DELogicNodeParamTypes.MERGEMAPPARAM.equals(psDELogicNodeParam.getParamAction())) {
					continue;
				}
				
				if(StringUtils.hasLength(psDELogicNodeParam.getAggMode()) 
						&& !psDELogicNodeParam.getAggMode().equals(AggMode.GROUP)) {
					continue;
				}
				
				String strSrcField = psDELogicNodeParam.getSrcFieldName();
				if(!StringUtils.hasLength(strSrcField)) {
					throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]合并映射参数[%2$s]未指定源属性", iPSDELogicNode.getName(), psDELogicNodeParam.getName()));
				}
				String strDstField = psDELogicNodeParam.getDstFieldName();
				if(!StringUtils.hasLength(strDstField)) {
					strDstField = strSrcField;
				}
				
				groupFieldMap.put(strSrcField, strDstField);
			}
		}
		
		if(ObjectUtils.isEmpty(groupFieldMap)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]未指定合并映射参数", iPSDELogicNode.getName()));
		}
		
		Map<String, IEntity> srcMap = new LinkedHashMap<>();
		Map<String, IEntity> dstMap = new LinkedHashMap<>();
		
		for(Object item : srcList) {
			
			if(!(item instanceof IEntity)) {
				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]列表参数[%2$s]项类型不正确", iPSDELogicNode.getName(), iPSDEMergeParamLogic.getSrcPSDELogicParamMust().getCodeName()));
			}
			
			IEntity iEntity = (IEntity)item;
			
			//计算分组项
			Object[] keys = new Object[groupFieldMap.size()];
			int nIndex = 0;
			for(java.util.Map.Entry<String, String> groupItem : groupFieldMap.entrySet()) {
				keys[nIndex] = DataTypeUtils.getStringValue(iEntity.get(groupItem.getKey()), null);
				nIndex ++;
			}
			
			String strGroupKey = KeyValueUtils.genUniqueId(keys);
			if(srcMap.containsKey(strGroupKey)) {
				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]列表参数[%2$s]出现重复分组项", iPSDELogicNode.getName(), iPSDEMergeParamLogic.getSrcPSDELogicParamMust().getCodeName()));
			}
			
			srcMap.put(strGroupKey, iEntity);
			
		}
		
		for(Object item : dstList) {
			
			if(!(item instanceof IEntity)) {
				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]列表参数[%2$s]项类型不正确", iPSDELogicNode.getName(), iPSDEMergeParamLogic.getDstPSDELogicParamMust().getCodeName()));
			}
			
			IEntity iEntity = (IEntity)item;
			
			//计算分组项
			Object[] keys = new Object[groupFieldMap.size()];
			int nIndex = 0;
			for(java.util.Map.Entry<String, String> groupItem : groupFieldMap.entrySet()) {
				keys[nIndex] = DataTypeUtils.getStringValue(iEntity.get(groupItem.getValue()), null);
				nIndex ++;
			}
			
			String strGroupKey = KeyValueUtils.genUniqueId(keys);
			if(dstMap.containsKey(strGroupKey)) {
				throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]列表参数[%2$s]出现重复分组项", iPSDELogicNode.getName(), iPSDEMergeParamLogic.getDstPSDELogicParamMust().getCodeName()));
			}
			
			dstMap.put(strGroupKey, iEntity);
			
		}
		
		//根据合并模式进行处理
		String strMergeMode = iPSDEMergeParamLogic.getMergeMode();
		if(DELNMergeParamMode.DEFAULT.equals(strMergeMode)) {
			
		}

		
//		if(list != null) {
//			for(Object item : list) {
//				
//				iDELogicSession.setLastReturn(null);
//				
//				//将子项绑定至目标参数
//				dstDELogicParamRuntime.bind(iDELogicSession, item);
//				
//				List<IPSDELogicLink> psDELogicLinkList = iPSDELogicNode.getPSDELogicLinks();
//				Object lastReturn = iDELogicSession.getLastReturn();
//				boolean bBreak = false;
//				if(psDELogicLinkList != null && psDELogicLinkList.size() > 0) {
//					for(IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
//						if(!iPSDELogicLink.isSubCallLink()) {
//							continue;
//						}
//						
//						if(iPSDELogicLink.getPSDELogicLinkGroupCond() == null 
//								|| iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds() == null) {
//							iDELogicSession.debugEnterLink(this, iPSDELogicNode, iPSDELogicLink);
//							iDELogicSession.setLastReturn(lastReturn);
//							iDELogicRuntimeContext.executeNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
//							if(iDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
//								bBreak = true;
//								break;
//							}
//						}
//						else if(iDELogicRuntimeContext.testLinkCond(iDELogicSession, iPSDELogicLink.getPSDELogicLinkGroupCond())){
//							iDELogicSession.debugEnterLink(this, iPSDELogicNode, iPSDELogicLink);
//							iDELogicSession.setLastReturn(lastReturn);
//							iDELogicRuntimeContext.executeNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
//							if(iDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
//								bBreak = true;
//								break;
//							}
//						}
//					}
//				}
//				
//				if(bBreak) {
//					break;
//				}
//			}
//		}
//		else {
//			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定列表参数[%2$s]类型不正确", iPSDELogicNode.getName(), iPSDELoopSubCallLogic.getSrcPSDELogicParamMust().getCodeName()));
//		}
//		
//		
//		srcDELogicParamRuntime.copyTo(iDELogicSession, dstDELogicParamRuntime.getParamObject(iDELogicSession));
//		
//		if(iDELogicRuntimeContext.getDELogicRuntime().isOutputDebugInfo()) {
//			iDELogicSession.debugInfo(String.format("拷贝参数[%1$s] ==> %2$s", srcDELogicParamRuntime.getCodeName(), dstDELogicParamRuntime.getCodeName()));
//		}
//		
		iDELogicSession.setLastReturn(null);
	}
	
}
