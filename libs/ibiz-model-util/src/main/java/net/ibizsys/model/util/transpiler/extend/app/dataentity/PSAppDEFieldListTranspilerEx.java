package net.ibizsys.model.util.transpiler.extend.app.dataentity;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;

public class PSAppDEFieldListTranspilerEx extends net.ibizsys.model.util.transpiler.app.dataentity.PSAppDEFieldListTranspiler{

	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {
		String id = getRealModelId(iPSModelTranspileContext, fullId);
		//objectNode.put("modelref", true);
		objectNode.put("codeName", id);
		
	}
	
}