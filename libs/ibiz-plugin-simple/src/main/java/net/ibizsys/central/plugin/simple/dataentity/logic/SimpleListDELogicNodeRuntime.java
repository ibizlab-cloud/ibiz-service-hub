package net.ibizsys.central.plugin.simple.dataentity.logic;

import java.util.List;

import net.ibizsys.central.dataentity.logic.DELogicNodeRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESFPluginLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public class SimpleListDELogicNodeRuntime extends DELogicNodeRuntimeBase {

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		
		if(!(iPSDELogicNode instanceof IPSDESFPluginLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESFPluginLogic iPSDESFPluginLogic = (IPSDESFPluginLogic)iPSDELogicNode;
		
		IDELogicParamRuntime iDELogicParamRuntime = null;
		if(iPSDESFPluginLogic.getDstPSDELogicParam()!=null) {
			iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESFPluginLogic.getDstPSDELogicParamMust().getCodeName(), false);
		}
		
		java.util.Random random = new java.util.Random();
		
		List<IEntityDTO> list = iDELogicRuntimeContext.getDataEntityRuntime().createEntityList();
		for(int i = 0;i<10;i++) {
			IEntityDTO entity = iDELogicRuntimeContext.getDataEntityRuntime().createEntity();
			entity.set("PRICE", 100 * random.nextInt(100));
			entity.set("PRICE2", 100 * random.nextInt(100));
			list.add(entity);
		}
		
		iDELogicSession.setLastReturn(list);
		if(iPSDESFPluginLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESFPluginLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, list);
		}
	}

}
