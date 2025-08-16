package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.testing.PSSysTestModuleImpl.*;



public class PSSysTestModuleTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.testing.PSSysTestModuleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.testing.PSSysTestModuleImpl realPSModelObject = (net.ibizsys.model.testing.PSSysTestModuleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "moduletag", realPSModelObject.getModuleTag(), realPSModelObject, "getModuleTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "moduletag2", realPSModelObject.getModuleTag2(), realPSModelObject, "getModuleTag2");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODULETAG, domain, "moduletag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODULETAG2, domain, "moduletag2", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}