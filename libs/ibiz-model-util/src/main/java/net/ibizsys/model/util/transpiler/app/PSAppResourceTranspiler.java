package net.ibizsys.model.util.transpiler.app;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.PSAppResourceImpl.*;



public class PSAppResourceTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.PSAppResourceImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.PSAppResourceImpl realPSModelObject = (net.ibizsys.model.app.PSAppResourceImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "content", realPSModelObject.getContent(), realPSModelObject, "getContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "restag", realPSModelObject.getResTag(), realPSModelObject, "getResTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "resourcetype", realPSModelObject.getResourceType(), realPSModelObject, "getResourceType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENT, domain, "content", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRESTAG, domain, "restag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRESOURCETYPE, domain, "resourcetype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}