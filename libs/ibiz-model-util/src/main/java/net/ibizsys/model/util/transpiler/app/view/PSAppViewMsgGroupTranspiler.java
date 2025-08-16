package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppViewMsgGroupImpl.*;



public class PSAppViewMsgGroupTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppViewMsgGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppViewMsgGroupImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppViewMsgGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "bodymsgstyle", realPSModelObject.getBodyStyle(), realPSModelObject, "getBodyStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "bottommsgstyle", realPSModelObject.getBottomStyle(), realPSModelObject, "getBottomStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "topmsgstyle", realPSModelObject.getTopStyle(), realPSModelObject, "getTopStyle");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBODYSTYLE, domain, "bodymsgstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBOTTOMSTYLE, domain, "bottommsgstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOPSTYLE, domain, "topmsgstyle", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}