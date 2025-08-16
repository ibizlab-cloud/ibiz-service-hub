package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSOne2ManyDataDEFieldImpl.*;



public class PSOne2ManyDataDEFieldTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSOne2ManyDataDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSOne2ManyDataDEFieldImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSOne2ManyDataDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "o2mpsderid", realPSModelObject.getPSDER(), realPSModelObject, "getPSDER");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDER, domain, "o2mpsderid", net.ibizsys.model.dataentity.der.IPSDERBase.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}