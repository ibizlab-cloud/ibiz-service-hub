package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysUniStateImpl.*;



public class PSSysUniStateTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysUniStateImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysUniStateImpl realPSModelObject = (net.ibizsys.model.res.PSSysUniStateImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cachecat", realPSModelObject.getCacheCat(), realPSModelObject, "getCacheCat");
		this.setDomainValue(iPSModelTranspileContext, domain, "cachetimeout", realPSModelObject.getCacheTimeout(), realPSModelObject, "getCacheTimeout");
		this.setDomainValue(iPSModelTranspileContext, domain, "monitorformat", realPSModelObject.getMonitorFormat(), realPSModelObject, "getMonitorFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "keyformat", realPSModelObject.getPathFormat(), realPSModelObject, "getPathFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "reloadtimer", realPSModelObject.getReloadTimer(), realPSModelObject, "getReloadTimer");
		this.setDomainValue(iPSModelTranspileContext, domain, "unistatemode", realPSModelObject.getUniStateMode(), realPSModelObject, "getUniStateMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "unistateparams", realPSModelObject.getUniStateParams(), realPSModelObject, "getUniStateParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "unistatetag", realPSModelObject.getUniStateTag(), realPSModelObject, "getUniStateTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "unistatetag2", realPSModelObject.getUniStateTag2(), realPSModelObject, "getUniStateTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "unistatetype", realPSModelObject.getUniStateType(), realPSModelObject, "getUniStateType");
		this.setDomainValue(iPSModelTranspileContext, domain, "uniquetag", realPSModelObject.getUniqueTag(), realPSModelObject, "getUniqueTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "alldataflag", realPSModelObject.isAllData(), realPSModelObject, "isAllData");
		this.setDomainValue(iPSModelTranspileContext, domain, "deleteasupdate", realPSModelObject.isDeleteAsUpdate(), realPSModelObject, "isDeleteAsUpdate");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCACHECAT, domain, "cachecat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCACHETIMEOUT, domain, "cachetimeout", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMONITORFORMAT, domain, "monitorformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPATHFORMAT, domain, "keyformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRELOADTIMER, domain, "reloadtimer", int.class, new String[]{"0","-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNISTATEMODE, domain, "unistatemode", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNISTATEPARAMS, domain, "unistateparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNISTATETAG, domain, "unistatetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNISTATETAG2, domain, "unistatetag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNISTATETYPE, domain, "unistatetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIQUETAG, domain, "uniquetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLDATA, domain, "alldataflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDELETEASUPDATE, domain, "deleteasupdate", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}