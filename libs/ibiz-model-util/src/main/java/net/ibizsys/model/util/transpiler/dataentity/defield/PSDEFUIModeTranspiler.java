package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSDEFUIModeImpl.*;



public class PSDEFUIModeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSDEFUIModeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSDEFUIModeImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSDEFUIModeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "ftmode", realPSModelObject.getType(), realPSModelObject, "getType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTYPE, domain, "ftmode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}