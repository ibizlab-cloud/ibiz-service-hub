package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDER1NDEFieldMapImpl.*;



public class PSDER1NDEFieldMapTranspiler extends net.ibizsys.model.util.transpiler.dataentity.der.PSDERDEFieldMapTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDER1NDEFieldMapImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDER1NDEFieldMapImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDER1NDEFieldMapImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsdefid", realPSModelObject.getMajorPSDEField(), realPSModelObject, "getMajorPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "maptype", realPSModelObject.getMapType(), realPSModelObject, "getMapType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedqid", realPSModelObject.getMinorPSDEDataQuery(), realPSModelObject, "getMinorPSDEDataQuery");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdefid", realPSModelObject.getMinorPSDEField(), realPSModelObject, "getMinorPSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDEFIELD, domain, "majorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPTYPE, domain, "maptype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPSDEDATAQUERY, domain, "psdedqid", net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPSDEFIELD, domain, "minorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}