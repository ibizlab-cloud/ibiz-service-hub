package net.ibizsys.model.util.transpiler.extend.control.tree;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelEnums.DEGridColHideMode;
import net.ibizsys.model.control.tree.PSDETreeColumnImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDETreeCol;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDETreeColumnListTranspilerEx extends net.ibizsys.model.util.transpiler.control.tree.PSDETreeColumnListTranspiler{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		PSDETreeCol psDETreeCol = (PSDETreeCol)domain;
		if(DataTypeUtils.getIntegerValue(psDETreeCol.getHideDefault(), 0) == DEGridColHideMode.HIDE.value) {
			objectNode.put(PSDETreeColumnImpl.ATTR_ISHIDEDEFAULT, true);
		}
	}
}