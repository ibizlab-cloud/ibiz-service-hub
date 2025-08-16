package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSubViewTypeImpl.*;



public class PSSubViewTypeTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSubViewTypeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSubViewTypeImpl realPSModelObject = (net.ibizsys.model.res.PSSubViewTypeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psviewtypeid", realPSModelObject.getViewType(), realPSModelObject, "getViewType");
		this.setDomainValue(iPSModelTranspileContext, domain, "repdefault", realPSModelObject.isReplaceDefault(), realPSModelObject, "isReplaceDefault");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWTYPE, domain, "psviewtypeid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISREPLACEDEFAULT, domain, "repdefault", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}