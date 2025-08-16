package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSLanguageResImpl.*;



public class PSLanguageResTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSLanguageResImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSLanguageResImpl realPSModelObject = (net.ibizsys.model.res.PSLanguageResImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "content", realPSModelObject.getDefaultContent(), realPSModelObject, "getDefaultContent");
		this.setDomainValue(iPSModelTranspileContext, domain, "lanrestag", realPSModelObject.getLanResTag(), realPSModelObject, "getLanResTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "lanrestype", realPSModelObject.getLanResType(), realPSModelObject, "getLanResType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTCONTENT, domain, "content", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLANRESTAG, domain, "lanrestag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLANRESTYPE, domain, "lanrestype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}