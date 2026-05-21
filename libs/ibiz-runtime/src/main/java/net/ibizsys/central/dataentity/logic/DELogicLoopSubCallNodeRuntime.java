package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.PSModelEnums.DELogicNodeThreadRunMode;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELoopSubCallLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IAction;

/**
 * 实体循环子调用节点运行时对象
 * 
 * @author lionlau
 *
 */
public class DELogicLoopSubCallNodeRuntime extends DELogicNodeRuntimeBase {

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {

		if (!(iPSDELogicNode instanceof IPSDELoopSubCallLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}

		IPSDELoopSubCallLogic iPSDELoopSubCallLogic = (IPSDELoopSubCallLogic) iPSDELogicNode;
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELoopSubCallLogic.getSrcPSDELogicParamMust().getCodeName(), false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELoopSubCallLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		
		List retList = new ArrayList();

		// 获取源参数
		Object objParam = srcDELogicParamRuntime.getReal(iDELogicSession);
		List list = DELogicParamRuntime.asList(objParam);
		if (list != null) {
			if (DELogicNodeThreadRunMode.THREAD.value == iPSDELoopSubCallLogic.getThreadMode()) {
				if(!ObjectUtils.isEmpty(list)) {
					IDELogicNodeRuntime self = this;
					List<IAction> actionList = new ArrayList<IAction>();
					for (Object item : list) {
						
						IDELogicSession cloneDELogicSession = iDELogicSession.clone();
						cloneDELogicSession.setLastReturn(null);
						// 将子项绑定至目标参数
						dstDELogicParamRuntime.bind(cloneDELogicSession, item);
						
						actionList.add(new IAction() {
							@Override
							public Object execute(Object[] args) throws Throwable {
								IDELogicSession lastDELogicSession = DELogicSession.getCurrent();
								try {
									DELogicSession.setCurrent(cloneDELogicSession);
									List<IPSDELogicLink> psDELogicLinkList = iPSDELogicNode.getPSDELogicLinks();
									Object lastReturn = cloneDELogicSession.getLastReturn();
									if (psDELogicLinkList != null && psDELogicLinkList.size() > 0) {
										for (IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
											if (!iPSDELogicLink.isSubCallLink()) {
												continue;
											}

											if (iPSDELogicLink.getPSDELogicLinkGroupCond() == null || iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds() == null) {
												cloneDELogicSession.debugEnterLink(self, iPSDELogicNode, iPSDELogicLink);
												cloneDELogicSession.setLastReturn(lastReturn);
												iDELogicRuntimeContext.executeNode(cloneDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
												if (cloneDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
													break;
												}
											} else if (iDELogicRuntimeContext.testLinkCond(cloneDELogicSession, iPSDELogicLink.getPSDELogicLinkGroupCond())) {
												cloneDELogicSession.debugEnterLink(self, iPSDELogicNode, iPSDELogicLink);
												cloneDELogicSession.setLastReturn(lastReturn);
												iDELogicRuntimeContext.executeNode(cloneDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
												if (cloneDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
													break;
												}
											}
										}
									}
									return cloneDELogicSession.getLastReturn();
								}
								finally {
									DELogicSession.setCurrent(lastDELogicSession);
								}
							}
						});
						
					}
					Map<String, Object> ret = iDELogicRuntimeContext.getSystemRuntime().threadRunAllOf(actionList, false);
					if(!ObjectUtils.isEmpty(ret)) {
						for(Object value : ret.values()) {
							if(value == null || value == DELogicReturnTypes.BREAK_VALUE) {
								continue;
							}
							retList.add(value);
						}
					}
				}
				
			} else {
				for (Object item : list) {

					iDELogicSession.setLastReturn(null);

					// 将子项绑定至目标参数
					dstDELogicParamRuntime.bind(iDELogicSession, item);

					List<IPSDELogicLink> psDELogicLinkList = iPSDELogicNode.getPSDELogicLinks();
					Object lastReturn = iDELogicSession.getLastReturn();
					boolean bBreak = false;
					if (psDELogicLinkList != null && psDELogicLinkList.size() > 0) {
						for (IPSDELogicLink iPSDELogicLink : psDELogicLinkList) {
							if (!iPSDELogicLink.isSubCallLink()) {
								continue;
							}

							if (iPSDELogicLink.getPSDELogicLinkGroupCond() == null || iPSDELogicLink.getPSDELogicLinkGroupCond().getPSDELogicLinkConds() == null) {
								iDELogicSession.debugEnterLink(this, iPSDELogicNode, iPSDELogicLink);
								iDELogicSession.setLastReturn(lastReturn);
								iDELogicRuntimeContext.executeNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
								if (iDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
									bBreak = true;
									break;
								}
							} else if (iDELogicRuntimeContext.testLinkCond(iDELogicSession, iPSDELogicLink.getPSDELogicLinkGroupCond())) {
								iDELogicSession.debugEnterLink(this, iPSDELogicNode, iPSDELogicLink);
								iDELogicSession.setLastReturn(lastReturn);
								iDELogicRuntimeContext.executeNode(iDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
								if (iDELogicSession.getLastReturn() == DELogicReturnTypes.BREAK_VALUE) {
									bBreak = true;
									break;
								}
							}
						}
					}
					
					Object value = iDELogicSession.getLastReturn();
					if(value != null && value != DELogicReturnTypes.BREAK_VALUE) {
						retList.add(value);
					}
					
					if (bBreak) {
						break;
					}
				}
			}
		} else {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]指定列表参数[%2$s]类型不正确", iPSDELogicNode.getName(), iPSDELoopSubCallLogic.getSrcPSDELogicParamMust().getCodeName()));
		}

		iDELogicSession.setLastReturn(retList);

		if (iPSDELoopSubCallLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELoopSubCallLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, retList);
		}
	}

}
