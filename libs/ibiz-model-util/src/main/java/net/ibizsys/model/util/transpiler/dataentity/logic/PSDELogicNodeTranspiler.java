package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl.*;



public class PSDELogicNodeTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "leftpos", realPSModelObject.getLeftPos(), realPSModelObject, "getLeftPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicnodetype", realPSModelObject.getLogicNodeType(), realPSModelObject, "getLogicNodeType");
		this.setDomainValue(iPSModelTranspileContext, domain, "nodeparams", realPSModelObject.getNodeParams(), realPSModelObject, "getNodeParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "toppos", realPSModelObject.getTopPos(), realPSModelObject, "getTopPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "paralleloutput", realPSModelObject.isParallelOutput(), realPSModelObject, "isParallelOutput");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLEFTPOS, domain, "leftpos", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNODETYPE, domain, "logicnodetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNODEPARAMS, domain, "nodeparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOPPOS, domain, "toppos", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISPARALLELOUTPUT, domain, "paralleloutput", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}