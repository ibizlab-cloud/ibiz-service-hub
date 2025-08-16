package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysPFPluginImpl.*;



public class PSSysPFPluginTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysPFPluginImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysPFPluginImpl realPSModelObject = (net.ibizsys.model.res.PSSysPFPluginImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pluginparams", realPSModelObject.getPluginParams(), realPSModelObject, "getPluginParams");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLUGINPARAMS, domain, "pluginparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}