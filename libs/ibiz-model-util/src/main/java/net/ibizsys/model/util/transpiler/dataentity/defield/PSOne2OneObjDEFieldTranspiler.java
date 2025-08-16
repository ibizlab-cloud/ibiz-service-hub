package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSOne2OneObjDEFieldImpl.*;



public class PSOne2OneObjDEFieldTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSOne2OneObjDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSOne2OneObjDEFieldImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSOne2OneObjDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "refpssysdynamodelid", realPSModelObject.getRefPSSysDynaModel(), realPSModelObject, "getRefPSSysDynaModel");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSSYSDYNAMODEL, domain, "refpssysdynamodelid", net.ibizsys.model.dynamodel.IPSSysDynaModel.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}