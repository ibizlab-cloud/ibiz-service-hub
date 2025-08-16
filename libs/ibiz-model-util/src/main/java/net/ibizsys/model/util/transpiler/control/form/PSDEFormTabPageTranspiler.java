package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEFormTabPageImpl.*;



public class PSDEFormTabPageTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormBaseGroupPanelTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEFormTabPageImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEFormTabPageImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEFormTabPageImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dritemtag", realPSModelObject.getDRItemTag(), realPSModelObject, "getDRItemTag");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDRITEMTAG, domain, "dritemtag", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}