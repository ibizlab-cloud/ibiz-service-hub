package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSFormulaDEFieldImpl.*;



public class PSFormulaDEFieldTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSFormulaDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSFormulaDEFieldImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSFormulaDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "formulafields", realPSModelObject.getFormulaColumns(), realPSModelObject, "getFormulaColumns");
		this.setDomainValue(iPSModelTranspileContext, domain, "formulaformat", realPSModelObject.getFormulaFormat(), realPSModelObject, "getFormulaFormat");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMULACOLUMNS, domain, "formulafields", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFORMULAFORMAT, domain, "formulaformat", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}