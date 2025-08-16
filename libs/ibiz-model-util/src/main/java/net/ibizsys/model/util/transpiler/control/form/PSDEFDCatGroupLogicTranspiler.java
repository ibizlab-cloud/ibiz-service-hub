package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFDCatGroupLogicImpl.*;



public class PSDEFDCatGroupLogicTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFDGroupLogicTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFDCatGroupLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFDCatGroupLogicImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFDCatGroupLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "logiccat", realPSModelObject.getLogicCat(), realPSModelObject, "getLogicCat");
		this.setDomainValue(iPSModelTranspileContext, domain, "condvalue", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICCAT, domain, "logiccat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "condvalue", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}