package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSOne2OneDataDEFieldImpl.*;



public class PSOne2OneDataDEFieldTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSOne2OneDataDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSOne2OneDataDEFieldImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSOne2OneDataDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "o2opsderid", realPSModelObject.getPSDER(), realPSModelObject, "getPSDER");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDER, domain, "o2opsderid", net.ibizsys.model.dataentity.der.IPSDERBase.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}