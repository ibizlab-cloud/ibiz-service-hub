package net.ibizsys.model.util.transpiler.app;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.PSApplicationImpl.*;



public class PSApplicationTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.PSApplicationImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.PSApplicationImpl realPSModelObject = (net.ibizsys.model.app.PSApplicationImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "apppkgname", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultpub", realPSModelObject.getDefaultFlag(), realPSModelObject, "getDefaultFlag");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabledynasys", realPSModelObject.getDynaSysMode(), realPSModelObject, "getDynaSysMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pspfstyleid", realPSModelObject.getPFStyle(), realPSModelObject, "getPFStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "pspfid", realPSModelObject.getPFType(), realPSModelObject, "getPFType");
		this.setDomainValue(iPSModelTranspileContext, domain, "apppkgname", realPSModelObject.getPKGCodeName(), realPSModelObject, "getPKGCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "codenamemode", realPSModelObject.getViewCodeNameMode(), realPSModelObject, "getViewCodeNameMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "apppkgname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTFLAG, domain, "defaultpub", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNASYSMODE, domain, "enabledynasys", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPFSTYLE, domain, "pspfstyleid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPFTYPE, domain, "pspfid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPKGCODENAME, domain, "apppkgname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWCODENAMEMODE, domain, "codenamemode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}