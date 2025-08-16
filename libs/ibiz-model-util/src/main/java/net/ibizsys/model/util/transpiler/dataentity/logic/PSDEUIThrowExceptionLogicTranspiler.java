package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUIThrowExceptionLogicImpl.*;



public class PSDEUIThrowExceptionLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEUILogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUIThrowExceptionLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUIThrowExceptionLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUIThrowExceptionLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param8", realPSModelObject.getErrorCode(), realPSModelObject, "getErrorCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "param3", realPSModelObject.getErrorInfo(), realPSModelObject, "getErrorInfo");
		this.setDomainValue(iPSModelTranspileContext, domain, "param11", realPSModelObject.getExceptionObj(), realPSModelObject, "getExceptionObj");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getExceptionParam(), realPSModelObject, "getExceptionParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETERRORCODE, domain, "param8", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETERRORINFO, domain, "param3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXCEPTIONOBJ, domain, "param11", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXCEPTIONPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}