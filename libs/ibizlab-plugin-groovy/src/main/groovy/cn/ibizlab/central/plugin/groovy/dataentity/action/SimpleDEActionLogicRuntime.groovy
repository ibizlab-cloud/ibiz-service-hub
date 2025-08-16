package cn.ibizlab.central.plugin.groovy.dataentity.action

import groovy.transform.CompileStatic
import net.ibizsys.central.dataentity.action.DEActionLogicRuntimeBase
import net.ibizsys.central.util.IEntityDTO

@CompileStatic
class SimpleDEActionLogicRuntime extends DEActionLogicRuntimeBase{

	@Override
	protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
		
		iEntityDTO.set("field1", "新值")
		
		return null;
	}
	
	
}
