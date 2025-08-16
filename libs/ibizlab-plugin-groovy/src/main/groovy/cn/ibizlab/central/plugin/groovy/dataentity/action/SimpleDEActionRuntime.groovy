package cn.ibizlab.central.plugin.groovy.dataentity.action

import groovy.transform.CompileStatic
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase
import net.ibizsys.central.util.IEntityDTO

@CompileStatic
class SimpleDEActionRuntime extends DEActionRuntimeBase{

	@Override
	protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
		// 重写入参为DTO对象
		return super.onExecute(iEntityDTO);
	}

	@Override
	protected Object onExecute(Object obj) throws Throwable {
		// 重写入参为键值
		return super.onExecute(obj);
	}
	
	
}
