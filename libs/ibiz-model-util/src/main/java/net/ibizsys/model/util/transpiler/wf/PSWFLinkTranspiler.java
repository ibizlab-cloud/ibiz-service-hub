package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFLinkImpl.*;



public class PSWFLinkTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFLinkImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFLinkImpl realPSModelObject = (net.ibizsys.model.wf.PSWFLinkImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "customcond", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstendpoint", realPSModelObject.getDstEndPoint(), realPSModelObject, "getDstEndPoint");
		this.setDomainValue(iPSModelTranspileContext, domain, "frompswfprocid", realPSModelObject.getFromPSWFProcess(), realPSModelObject, "getFromPSWFProcess");
		this.setDomainValue(iPSModelTranspileContext, domain, "lnpslanresid", realPSModelObject.getLNPSLanguageRes(), realPSModelObject, "getLNPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcendpoint", realPSModelObject.getSrcEndPoint(), realPSModelObject, "getSrcEndPoint");
		this.setDomainValue(iPSModelTranspileContext, domain, "topswfprocid", realPSModelObject.getToPSWFProcess(), realPSModelObject, "getToPSWFProcess");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata", realPSModelObject.getUserData(), realPSModelObject, "getUserData");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata2", realPSModelObject.getUserData2(), realPSModelObject, "getUserData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "wflinktype", realPSModelObject.getWFLinkType(), realPSModelObject, "getWFLinkType");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcondflag", realPSModelObject.isEnableCustomCond(), realPSModelObject, "isEnableCustomCond");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "customcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTENDPOINT, domain, "dstendpoint", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFROMPSWFPROCESS, domain, "frompswfprocid", net.ibizsys.model.wf.IPSWFProcess.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLNPSLANGUAGERES, domain, "lnpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCENDPOINT, domain, "srcendpoint", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOPSWFPROCESS, domain, "topswfprocid", net.ibizsys.model.wf.IPSWFProcess.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA, domain, "userdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA2, domain, "userdata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFLINKTYPE, domain, "wflinktype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECUSTOMCOND, domain, "customcondflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}