package net.ibizsys.model.util.transpiler.database;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.database.PSDEDBConfigImpl.*;



public class PSDEDBConfigTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.database.PSDEDBConfigImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.database.PSDEDBConfigImpl realPSModelObject = (net.ibizsys.model.database.PSDEDBConfigImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "objnamecase", realPSModelObject.getObjNameCase(), realPSModelObject, "getObjNameCase");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOBJNAMECASE, domain, "objnamecase", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}