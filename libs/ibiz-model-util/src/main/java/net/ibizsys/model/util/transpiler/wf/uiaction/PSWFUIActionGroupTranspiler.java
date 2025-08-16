package net.ibizsys.model.util.transpiler.wf.uiaction;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.uiaction.PSWFUIActionGroupImpl.*;



public class PSWFUIActionGroupTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.uiaction.PSWFUIActionGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.uiaction.PSWFUIActionGroupImpl realPSModelObject = (net.ibizsys.model.wf.uiaction.PSWFUIActionGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag", realPSModelObject.getGroupTag(), realPSModelObject, "getGroupTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag2", realPSModelObject.getGroupTag2(), realPSModelObject, "getGroupTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag3", realPSModelObject.getGroupTag3(), realPSModelObject, "getGroupTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag4", realPSModelObject.getGroupTag4(), realPSModelObject, "getGroupTag4");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG, domain, "uagtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG2, domain, "uagtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG3, domain, "uagtag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG4, domain, "uagtag4", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}