package net.ibizsys.model.util.transpiler.dataentity.dr;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dr.PSDEDRSysDER1NItemImpl.*;



public class PSDEDRSysDER1NItemTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dr.PSDEDRItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dr.PSDEDRSysDER1NItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dr.PSDEDRSysDER1NItemImpl realPSModelObject = (net.ibizsys.model.dataentity.dr.PSDEDRSysDER1NItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psderid", realPSModelObject.getPSDER(), realPSModelObject, "getPSDER");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDER, domain, "psderid", net.ibizsys.model.dataentity.der.IPSDERBase.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}