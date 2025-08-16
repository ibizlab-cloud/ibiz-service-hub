package net.ibizsys.model.util.transpiler.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl.*;



public class PSDEFVRValueRangeConditionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.valuerule.PSDEFVRSingleConditionTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "extmajorpsdefid", realPSModelObject.getExtMajorPSDEField(), realPSModelObject, "getExtMajorPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "extminorpsdefid", realPSModelObject.getExtPSDEField(), realPSModelObject, "getExtPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsdedstid", realPSModelObject.getMajorPSDEDataSet(), realPSModelObject, "getMajorPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsdeid", realPSModelObject.getMajorPSDataEntity(), realPSModelObject, "getMajorPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.isAlwaysCheck(), realPSModelObject, "isAlwaysCheck");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXTMAJORPSDEFIELD, domain, "extmajorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXTPSDEFIELD, domain, "extminorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDEDATASET, domain, "majorpsdedstid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDATAENTITY, domain, "majorpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALWAYSCHECK, domain, "param9", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}