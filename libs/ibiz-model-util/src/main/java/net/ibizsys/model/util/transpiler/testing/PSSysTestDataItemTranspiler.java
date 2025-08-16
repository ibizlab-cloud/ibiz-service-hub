package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.testing.PSSysTestDataItemImpl.*;



public class PSSysTestDataItemTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.testing.PSSysTestDataItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.testing.PSSysTestDataItemImpl realPSModelObject = (net.ibizsys.model.testing.PSSysTestDataItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSCodeList(), realPSModelObject, "getPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "refpsdedatasetid", realPSModelObject.getRefPSDEDataSet(), realPSModelObject, "getRefPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "refpsdeid", realPSModelObject.getRefPSDataEntity(), realPSModelObject, "getRefPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "value", realPSModelObject.getValue(), realPSModelObject, "getValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "valuetype", realPSModelObject.getValueType(), realPSModelObject, "getValueType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSCODELIST, domain, "pscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDEDATASET, domain, "refpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDATAENTITY, domain, "refpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUE, domain, "value", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUETYPE, domain, "valuetype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}