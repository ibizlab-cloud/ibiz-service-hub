package net.ibizsys.model.util.transpiler.dataentity.ds;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ds.PSDEDQFieldConditionImpl.*;



public class PSDEDQFieldConditionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.ds.PSDEDQConditionTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ds.PSDEDQFieldConditionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ds.PSDEDQFieldConditionImpl realPSModelObject = (net.ibizsys.model.dataentity.ds.PSDEDQFieldConditionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdbvalueopid", realPSModelObject.getCondOp(), realPSModelObject, "getCondOp");
		this.setDomainValue(iPSModelTranspileContext, domain, "condvalue", realPSModelObject.getCondValue(), realPSModelObject, "getCondValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psvartypeid", realPSModelObject.getPSVARTypeId(), realPSModelObject, "getPSVARTypeId");
		this.setDomainValue(iPSModelTranspileContext, domain, "ignoreempty", realPSModelObject.isIgnoreEmpty(), realPSModelObject, "isIgnoreEmpty");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDOP, domain, "psdbvalueopid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDVALUE, domain, "condvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSVARTYPEID, domain, "psvartypeid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISIGNOREEMPTY, domain, "ignoreempty", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}