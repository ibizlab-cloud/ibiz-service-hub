package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEMSLogicImpl.*;



public class PSDEMSLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEMSLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEMSLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEMSLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag", realPSModelObject.getLogicTag(), realPSModelObject, "getLogicTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag2", realPSModelObject.getLogicTag2(), realPSModelObject, "getLogicTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag3", realPSModelObject.getLogicTag3(), realPSModelObject, "getLogicTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "logictag4", realPSModelObject.getLogicTag4(), realPSModelObject, "getLogicTag4");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG, domain, "logictag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG2, domain, "logictag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG3, domain, "logictag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICTAG4, domain, "logictag4", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}