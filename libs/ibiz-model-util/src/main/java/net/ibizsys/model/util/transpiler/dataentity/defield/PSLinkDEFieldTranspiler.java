package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl.*;



public class PSLinkDEFieldTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psderid", realPSModelObject.getPSDER(), realPSModelObject, "getPSDER");
		this.setDomainValue(iPSModelTranspileContext, domain, "derpsdefid", realPSModelObject.getRelatedPSDEField(), realPSModelObject, "getRelatedPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDER, domain, "psderid", net.ibizsys.model.dataentity.der.IPSDERBase.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRELATEDPSDEFIELD, domain, "derpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}