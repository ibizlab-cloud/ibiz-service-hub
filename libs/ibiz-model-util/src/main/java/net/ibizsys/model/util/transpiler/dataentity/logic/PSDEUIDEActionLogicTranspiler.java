package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUIDEActionLogicImpl.*;



public class PSDEUIDEActionLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEUILogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUIDEActionLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUIDEActionLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUIDEActionLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeactionid", realPSModelObject.getDstPSAppDEAction(), realPSModelObject, "getDstPSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSAppDataEntity(), realPSModelObject, "getDstPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDEUILogicParam(), realPSModelObject, "getDstPSDEUILogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDEUILogicParam(), realPSModelObject, "getRetPSDEUILogicParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSAPPDEACTION, domain, "dstpsdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSAPPDATAENTITY, domain, "dstpsdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEUILOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDEUILOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}