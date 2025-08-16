package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysSFPluginImpl.*;



public class PSSysSFPluginTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysSFPluginImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysSFPluginImpl realPSModelObject = (net.ibizsys.model.res.PSSysSFPluginImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "pluginparams", realPSModelObject.getPluginParams(), realPSModelObject, "getPluginParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "plugintag", realPSModelObject.getPluginTag(), realPSModelObject, "getPluginTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "plugintag2", realPSModelObject.getPluginTag2(), realPSModelObject, "getPluginTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "plugintype", realPSModelObject.getPluginType(), realPSModelObject, "getPluginType");
		this.setDomainValue(iPSModelTranspileContext, domain, "rtobjectname", realPSModelObject.getRTObjectName(), realPSModelObject, "getRTObjectName");
		this.setDomainValue(iPSModelTranspileContext, domain, "rtobjectrepo", realPSModelObject.getRTObjectRepo(), realPSModelObject, "getRTObjectRepo");
		this.setDomainValue(iPSModelTranspileContext, domain, "rtobjectmode", realPSModelObject.getRTObjectSource(), realPSModelObject, "getRTObjectSource");
		this.setDomainValue(iPSModelTranspileContext, domain, "singleinstmode", realPSModelObject.isSingleInstance(), realPSModelObject, "isSingleInstance");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLUGINPARAMS, domain, "pluginparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLUGINTAG, domain, "plugintag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLUGINTAG2, domain, "plugintag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLUGINTYPE, domain, "plugintype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRTOBJECTNAME, domain, "rtobjectname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRTOBJECTREPO, domain, "rtobjectrepo", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRTOBJECTSOURCE, domain, "rtobjectmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSINGLEINSTANCE, domain, "singleinstmode", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}