package net.ibizsys.model.util.transpiler.dynamodel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dynamodel.PSSysDynaModelImpl.*;



public class PSSysDynaModelTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dynamodel.PSSysDynaModelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dynamodel.PSSysDynaModelImpl realPSModelObject = (net.ibizsys.model.dynamodel.PSSysDynaModelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "modeltag", realPSModelObject.getModelTag(), realPSModelObject, "getModelTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "modeltag2", realPSModelObject.getModelTag2(), realPSModelObject, "getModelTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "modeltag3", realPSModelObject.getModelTag3(), realPSModelObject, "getModelTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "modeltag4", realPSModelObject.getModelTag4(), realPSModelObject, "getModelTag4");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODELTAG, domain, "modeltag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODELTAG2, domain, "modeltag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODELTAG3, domain, "modeltag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODELTAG4, domain, "modeltag4", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}