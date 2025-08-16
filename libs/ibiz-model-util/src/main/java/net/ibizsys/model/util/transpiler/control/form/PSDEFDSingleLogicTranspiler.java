package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFDSingleLogicImpl.*;



public class PSDEFDSingleLogicTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFDLogicTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFDSingleLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFDSingleLogicImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFDSingleLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdbvalueopid", realPSModelObject.getCondOP(), realPSModelObject, "getCondOP");
		this.setDomainValue(iPSModelTranspileContext, domain, "fdname", realPSModelObject.getDEFDName(), realPSModelObject, "getDEFDName");
		this.setDomainValue(iPSModelTranspileContext, domain, "condvalue", realPSModelObject.getValue(), realPSModelObject, "getValue");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDOP, domain, "psdbvalueopid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFDNAME, domain, "fdname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUE, domain, "condvalue", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}