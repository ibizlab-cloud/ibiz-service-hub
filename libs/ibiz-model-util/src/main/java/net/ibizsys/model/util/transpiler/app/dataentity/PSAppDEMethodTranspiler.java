package net.ibizsys.model.util.transpiler.app.dataentity;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.dataentity.PSAppDEMethodImpl.*;



public class PSAppDEMethodTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.dataentity.PSAppDEMethodImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.dataentity.PSAppDEMethodImpl realPSModelObject = (net.ibizsys.model.app.dataentity.PSAppDEMethodImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aftercode", realPSModelObject.getAfterCode(), realPSModelObject, "getAfterCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "beforecode", realPSModelObject.getBeforeCode(), realPSModelObject, "getBeforeCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAFTERCODE, domain, "aftercode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBEFORECODE, domain, "beforecode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}