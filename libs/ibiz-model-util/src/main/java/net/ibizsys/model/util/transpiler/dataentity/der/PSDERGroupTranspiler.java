package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDERGroupImpl.*;



public class PSDERGroupTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDERGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDERGroupImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDERGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag", realPSModelObject.getGroupTag(), realPSModelObject, "getGroupTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag2", realPSModelObject.getGroupTag2(), realPSModelObject, "getGroupTag2");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG, domain, "grouptag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG2, domain, "grouptag2", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}