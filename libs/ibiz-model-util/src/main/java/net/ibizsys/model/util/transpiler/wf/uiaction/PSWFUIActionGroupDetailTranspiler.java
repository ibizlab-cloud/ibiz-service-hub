package net.ibizsys.model.util.transpiler.wf.uiaction;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.uiaction.PSWFUIActionGroupDetailImpl.*;



public class PSWFUIActionGroupDetailTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.uiaction.PSWFUIActionGroupDetailImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.uiaction.PSWFUIActionGroupDetailImpl realPSModelObject = (net.ibizsys.model.wf.uiaction.PSWFUIActionGroupDetailImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "enablelogic", realPSModelObject.getEnableScriptCode(), realPSModelObject, "getEnableScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "visiblelogic", realPSModelObject.getVisibleScriptCode(), realPSModelObject, "getVisibleScriptCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLESCRIPTCODE, domain, "enablelogic", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVISIBLESCRIPTCODE, domain, "visiblelogic", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}