package net.ibizsys.model.util.transpiler.dataentity.priv;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.priv.PSDEOPPrivRoleImpl.*;



public class PSDEOPPrivRoleTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.priv.PSDEOPPrivRoleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.priv.PSDEOPPrivRoleImpl realPSModelObject = (net.ibizsys.model.dataentity.priv.PSDEOPPrivRoleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "customcond", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedqid", realPSModelObject.getPSDEDataQuery(), realPSModelObject, "getPSDEDataQuery");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeopprivid", realPSModelObject.getPSDEOPPriv(), realPSModelObject, "getPSDEOPPriv");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "customcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATAQUERY, domain, "psdedqid", net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEOPPRIV, domain, "psdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}