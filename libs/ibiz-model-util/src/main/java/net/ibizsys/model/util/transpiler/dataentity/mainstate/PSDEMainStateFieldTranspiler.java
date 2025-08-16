package net.ibizsys.model.util.transpiler.dataentity.mainstate;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.mainstate.PSDEMainStateFieldImpl.*;



public class PSDEMainStateFieldTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.mainstate.PSDEMainStateFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.mainstate.PSDEMainStateFieldImpl realPSModelObject = (net.ibizsys.model.dataentity.mainstate.PSDEMainStateFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultvalue", realPSModelObject.getDefaultValue(), realPSModelObject, "getDefaultValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "dvt", realPSModelObject.getDefaultValueType(), realPSModelObject, "getDefaultValueType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUE, domain, "defaultvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUETYPE, domain, "dvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}