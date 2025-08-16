package cn.ibizlab.central.plugin.groovy.dataentity.logic

import org.springframework.beans.factory.annotation.Qualifier

import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.dataentity.logic.DELogicNodeRuntimeBase
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.central.util.IEntity
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

class SimpleDELogicNodeRuntime extends DELogicNodeRuntimeBase {

	@Qualifier("dataentity")
	IDataEntityRuntime PSTEMPLATE_SCENARIO_OPTION
	
	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime("Name1", false);
		IDELogicParamRuntime dstDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime("Name2", false);
		
		List srcList = (List) srcDELogicParamRuntime.getReal(iDELogicSession);
		List dstList = new ArrayList();
		for(Object item : srcList) {
			IEntity iEntity = (IEntity)item;
			
			IEntity dstEntity = PSTEMPLATE_SCENARIO_OPTION.createEntity();
			dstEntity.set("psscenario_option_id", iEntity.get("id"));
			
			//设置另一个变量
			
			dstList.add(dstEntity);
		}
		
		dstDELogicParamRuntime.bind(iDELogicSession, dstList);
		
	}
}
