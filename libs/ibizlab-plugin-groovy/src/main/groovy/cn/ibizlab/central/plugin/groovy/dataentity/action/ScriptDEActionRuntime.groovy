package cn.ibizlab.central.plugin.groovy.dataentity.action

import net.ibizsys.central.dataentity.action.DEActionRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.DataTypeUtils

class ScriptDEActionRuntime extends DEActionRuntimeBase{
	
	@Override
	protected Object onExecute(Object[] args) throws Throwable {
		IEntityDTO iEntityDTO = null;
		if (args[0] instanceof IEntityDTO) {
			iEntityDTO = (IEntityDTO)args[0];
		} else {
			Object key = DataTypeUtils.asSimple(args[0]);
			if (key != null) {
				iEntityDTO = this.getDataEntityRuntime().createEntity();
				iEntityDTO.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			else
				throw new Exception("传入参数无效");
		}		
		
		
		Closure closure = { sys,entity ->
			
		}
		
		return closure.call(this.getSystemRuntime(), iEntityDTO);
	}
}
