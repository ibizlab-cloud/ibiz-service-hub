package net.ibizsys.model.util.transpiler.dataentity.ds;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeImpl.*;



public class PSDEDataQueryCodeTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeImpl realPSModelObject = (net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dbtype", realPSModelObject.getDBType(), realPSModelObject, "getDBType");
		this.setDomainValue(iPSModelTranspileContext, domain, "userquerycode", realPSModelObject.getQueryCode(), realPSModelObject, "getQueryCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDBTYPE, domain, "dbtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETQUERYCODE, domain, "userquerycode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}