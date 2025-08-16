package net.ibizsys.central.dataentity.logic;

import java.util.List;

import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELoopSubCallLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 实体循环子调用节点运行时对象
 * @author lionlau
 *
 */
public class DELogicLoopSubCallNodeRuntime extends DELogicNodeRuntimeBase{

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDELoopSubCallLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDELoopSubCallLogic iPSDELoopSubCallLogic = (IPSDELoopSubCallLogic)iPSDELogicNode;
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELoopSubCallLogic.getSrcPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELoopSubCallLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		//获取源参数
		Object objParam = srcDELogicParamRuntime.getReal(iDELogicSession);
		List list = DELogicParamRuntime.asList(objParam);
		if(list != null) {
			for(Object item : list) {
				
				iDELogicSession.setLastReturn(null);
				
				//将子项绑定至目标参数
				dstDELogicParamRuntime.bind(iDELogicSession, item);
				
				List<IPSDELogicLink> psDELogicLinkList = iPSDELogicNode.getPSDELogicLinks();
				Object lastReturn = iDELogicSession.getLastReturn();
				boolean bBreak = false;
				if(psDELogicLinkList != null && psDELogicLinkList.size() > 0) {
					for(IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
						if(!iPSDELogicLink.isSubCallLink()) {
							continue;
						}
						
						if(iPSDELogicLink.getPSDELogicLinkGroupCond() == null 
								|| iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds() == null) {
							iDELogicSession.debugEnterLink(this, iPSDELogicNode, iPSDELogicLink);
							iDELogicSession.setLastReturn(lastReturn);
							iDELogicRuntimeContext.executeNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
							if(iDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
								bBreak = true;
								break;
							}
						}
						else if(iDELogicRuntimeContext.testLinkCond(iDELogicSession, iPSDELogicLink.getPSDELogicLinkGroupCond())){
							iDELogicSession.debugEnterLink(this, iPSDELogicNode, iPSDELogicLink);
							iDELogicSession.setLastReturn(lastReturn);
							iDELogicRuntimeContext.executeNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
							if(iDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
								bBreak = true;
								break;
							}
						}
					}
				}
				
				if(bBreak) {
					break;
				}
			}
		}
		else {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定列表参数[%2$s]类型不正确", iPSDELogicNode.getName(), iPSDELoopSubCallLogic.getSrcPSDELogicParamMust().getCodeName()));
		}
		
		iDELogicSession.setLastReturn(null);
	}
	
}
