package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFProcessImpl.*;



public class PSWFProcessTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFProcessImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFProcessImpl realPSModelObject = (net.ibizsys.model.wf.PSWFProcessImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "leftpos", realPSModelObject.getLeftPos(), realPSModelObject, "getLeftPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "pswfprocessname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "namepslanresid", realPSModelObject.getNamePSLanguageRes(), realPSModelObject, "getNamePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getPSSysMsgTempl(), realPSModelObject, "getPSSysMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "pswfworktimeid", realPSModelObject.getPSWFWorkTime(), realPSModelObject, "getPSWFWorkTime");
		this.setDomainValue(iPSModelTranspileContext, domain, "timeout", realPSModelObject.getTimeout(), realPSModelObject, "getTimeout");
		this.setDomainValue(iPSModelTranspileContext, domain, "timeoutpsdefid", realPSModelObject.getTimeoutField(), realPSModelObject, "getTimeoutField");
		this.setDomainValue(iPSModelTranspileContext, domain, "timeouttype", realPSModelObject.getTimeoutType(), realPSModelObject, "getTimeoutType");
		this.setDomainValue(iPSModelTranspileContext, domain, "toppos", realPSModelObject.getTopPos(), realPSModelObject, "getTopPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata", realPSModelObject.getUserData(), realPSModelObject, "getUserData");
		this.setDomainValue(iPSModelTranspileContext, domain, "userdata2", realPSModelObject.getUserData2(), realPSModelObject, "getUserData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfprocesstype", realPSModelObject.getWFProcessType(), realPSModelObject, "getWFProcessType");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfstepvalue", realPSModelObject.getWFStepValue(), realPSModelObject, "getWFStepValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "enabletimeout", realPSModelObject.isEnableTimeout(), realPSModelObject, "isEnableTimeout");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLEFTPOS, domain, "leftpos", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "pswfprocessname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMEPSLANGUAGERES, domain, "namepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWFWORKTIME, domain, "pswfworktimeid", net.ibizsys.model.wf.IPSWFWorkTime.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEOUT, domain, "timeout", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEOUTFIELD, domain, "timeoutpsdefid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEOUTTYPE, domain, "timeouttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOPPOS, domain, "toppos", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA, domain, "userdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERDATA2, domain, "userdata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFPROCESSTYPE, domain, "wfprocesstype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFSTEPVALUE, domain, "wfstepvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLETIMEOUT, domain, "enabletimeout", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}