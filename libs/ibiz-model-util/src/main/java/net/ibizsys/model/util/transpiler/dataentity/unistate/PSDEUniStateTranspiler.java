package net.ibizsys.model.util.transpiler.dataentity.unistate;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.unistate.PSDEUniStateImpl.*;



public class PSDEUniStateTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.unistate.PSDEUniStateImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.unistate.PSDEUniStateImpl realPSModelObject = (net.ibizsys.model.dataentity.unistate.PSDEUniStateImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "uniquetag", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "dedefaultflag", realPSModelObject.isDefault(), realPSModelObject, "isDefault");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "uniquetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULT, domain, "dedefaultflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}