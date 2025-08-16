package net.ibizsys.model.util.transpiler.extend.control.form;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelEnums.CtrlType;
import net.ibizsys.model.PSModelEnums.FormType;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.extend.control.PSControlListTranspilerEx;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEEditFormListTranspilerEx extends PSControlListTranspilerEx{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		
		
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}