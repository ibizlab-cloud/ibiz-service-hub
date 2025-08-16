package net.ibizsys.model.util.transpiler.dataentity.action;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.action.PSDEActionGroupDetailImpl.*;



public class PSDEActionGroupDetailTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.action.PSDEActionGroupDetailImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.action.PSDEActionGroupDetailImpl realPSModelObject = (net.ibizsys.model.dataentity.action.PSDEActionGroupDetailImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtype", realPSModelObject.getDetailType(), realPSModelObject, "getDetailType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSDEAction(), realPSModelObject, "getPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTYPE, domain, "detailtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEACTION, domain, "psdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}