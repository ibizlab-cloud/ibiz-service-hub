package cn.ibizlab.central.plugin.groovy.dataentity.logic

import net.ibizsys.central.ISystemRuntime
import net.ibizsys.central.cloud.core.util.annotation.DELogicNode
import net.ibizsys.central.cloud.core.util.annotation.DELogicParam
import net.ibizsys.central.cloud.core.util.annotation.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime
import net.ibizsys.central.dataentity.logic.IDELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.central.plugin.groovy.dataentity.logic.GroovyDELogicRuntimeBase
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

@DELogicRuntime("AA.BB.CC")
class SimpleDELogicRuntime2 extends GroovyDELogicRuntimeBase{
	
	@DELogicParam("Default")
	IDELogicParamRuntime defaultParam = null;
	
	
	@DELogicNode("OutoutStep")
	void onExecuteCodeOutputStep(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		this.executeRawGroovyCode(iDELogicSession, iPSDELogicNode, {ISystemRuntime sys, IDELogicRuntime logic, Object entity, Object data, IDELogicParamRuntime param ->
			def _default = logic.param("Default")
			
			this.getDataEntityRuntime().executeLogic("AA", [_default] as Object[])
		});
	}
	
}
