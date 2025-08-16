package net.ibizsys.model.util.transpiler.extend.control.grid;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelEnums.DEGridColHideMode;
import net.ibizsys.model.control.grid.PSDEGridColumnImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEGridCol;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEGridColumnListTranspilerEx extends net.ibizsys.model.util.transpiler.control.grid.PSDEGridColumnListTranspiler{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDEGridCol psDEGrodCol = (PSDEGridCol)domain;
		if(DataTypeUtils.getIntegerValue(psDEGrodCol.getHideDefault(), 0) == DEGridColHideMode.HIDE.value) {
			objectNode.put(PSDEGridColumnImpl.ATTR_ISHIDEDEFAULT, true);
		}
		
	}
}