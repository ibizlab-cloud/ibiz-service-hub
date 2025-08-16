package net.ibizsys.model.util.transpiler.dataentity.util;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.util.PSDEUtilImpl.*;



public class PSDEUtilTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.util.PSDEUtilImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.util.PSDEUtilImpl realPSModelObject = (net.ibizsys.model.dataentity.util.PSDEUtilImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "utilparams", realPSModelObject.getUtilParams(), realPSModelObject, "getUtilParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "utiltype", realPSModelObject.getUtilType(), realPSModelObject, "getUtilType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILPARAMS, domain, "utilparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUTILTYPE, domain, "utiltype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}