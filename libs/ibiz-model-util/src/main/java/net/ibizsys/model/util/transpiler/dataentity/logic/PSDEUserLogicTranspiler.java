package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl.*;



public class PSDEUserLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeactionid", realPSModelObject.getDstPSDEAction(), realPSModelObject, "getDstPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedataqueryid", realPSModelObject.getDstPSDEDataQuery(), realPSModelObject, "getDstPSDEDataQuery");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedatasetid", realPSModelObject.getDstPSDEDataSet(), realPSModelObject, "getDstPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdelogicid", realPSModelObject.getDstPSDELogic(), realPSModelObject, "getDstPSDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSDataEntity(), realPSModelObject, "getDstPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getParam1(), realPSModelObject, "getParam1");
		this.setDomainValue(iPSModelTranspileContext, domain, "param10", realPSModelObject.getParam10(), realPSModelObject, "getParam10");
		this.setDomainValue(iPSModelTranspileContext, domain, "param11", realPSModelObject.getParam11(), realPSModelObject, "getParam11");
		this.setDomainValue(iPSModelTranspileContext, domain, "param12", realPSModelObject.getParam12(), realPSModelObject, "getParam12");
		this.setDomainValue(iPSModelTranspileContext, domain, "param13", realPSModelObject.getParam13(), realPSModelObject, "getParam13");
		this.setDomainValue(iPSModelTranspileContext, domain, "param14", realPSModelObject.getParam14(), realPSModelObject, "getParam14");
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getParam2(), realPSModelObject, "getParam2");
		this.setDomainValue(iPSModelTranspileContext, domain, "param3", realPSModelObject.getParam3(), realPSModelObject, "getParam3");
		this.setDomainValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getParam4(), realPSModelObject, "getParam4");
		this.setDomainValue(iPSModelTranspileContext, domain, "param5", realPSModelObject.getParam5(), realPSModelObject, "getParam5");
		this.setDomainValue(iPSModelTranspileContext, domain, "param6", realPSModelObject.getParam6(), realPSModelObject, "getParam6");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.getParam7(), realPSModelObject, "getParam7");
		this.setDomainValue(iPSModelTranspileContext, domain, "param8", realPSModelObject.getParam8(), realPSModelObject, "getParam8");
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.getParam9(), realPSModelObject, "getParam9");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDELogicParam(), realPSModelObject, "getRetPSDELogicParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEACTION, domain, "dstpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATAQUERY, domain, "dstpsdedataqueryid", net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATASET, domain, "dstpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGIC, domain, "dstpsdelogicid", net.ibizsys.model.dataentity.logic.IPSDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDATAENTITY, domain, "dstpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM1, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM10, domain, "param10", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM11, domain, "param11", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM12, domain, "param12", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM13, domain, "param13", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM14, domain, "param14", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM2, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM3, domain, "param3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM4, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM5, domain, "param5", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM6, domain, "param6", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM7, domain, "param7", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM8, domain, "param8", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAM9, domain, "param9", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDELOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}