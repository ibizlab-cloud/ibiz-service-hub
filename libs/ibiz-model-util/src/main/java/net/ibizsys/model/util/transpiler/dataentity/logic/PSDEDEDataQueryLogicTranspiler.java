package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEDEDataQueryLogicImpl.*;



public class PSDEDEDataQueryLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEDEDataQueryLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEDEDataQueryLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEDEDataQueryLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedataqueryid", realPSModelObject.getDstPSDEDataQuery(), realPSModelObject, "getDstPSDEDataQuery");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSDataEntity(), realPSModelObject, "getDstPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDELogicParam(), realPSModelObject, "getRetPSDELogicParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATAQUERY, domain, "dstpsdedataqueryid", net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDATAENTITY, domain, "dstpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDELOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}