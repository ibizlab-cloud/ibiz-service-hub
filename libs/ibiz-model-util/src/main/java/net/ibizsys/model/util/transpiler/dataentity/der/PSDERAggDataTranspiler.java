package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDERAggDataImpl.*;



public class PSDERAggDataTranspiler extends net.ibizsys.model.util.transpiler.dataentity.der.PSDERBaseTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDERAggDataImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDERAggDataImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDERAggDataImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdedsid", realPSModelObject.getSourcePSDEDataSet(), realPSModelObject, "getSourcePSDEDataSet");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSOURCEPSDEDATASET, domain, "minorpsdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}