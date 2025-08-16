package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUILogicImpl.*;



public class PSDEUILogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUILogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUILogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUILogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "psdelogicname", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}