package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppViewMsgGroupDetailImpl.*;



public class PSAppViewMsgGroupDetailTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppViewMsgGroupDetailImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppViewMsgGroupDetailImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppViewMsgGroupDetailImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psviewmsgid", realPSModelObject.getPSAppViewMsg(), realPSModelObject, "getPSAppViewMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgpos", realPSModelObject.getPosition(), realPSModelObject, "getPosition");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPVIEWMSG, domain, "psviewmsgid", net.ibizsys.model.app.view.IPSAppViewMsg.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOSITION, domain, "msgpos", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}