package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl.*;



public class PSDESysAIChatAgentLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param11", realPSModelObject.getCategoryMode(), realPSModelObject, "getCategoryMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "param15", realPSModelObject.getCategoryReRankThreshold(), realPSModelObject, "getCategoryReRankThreshold");
		this.setDomainValue(iPSModelTranspileContext, domain, "param12", realPSModelObject.getChatRequestAppendMode(), realPSModelObject, "getChatRequestAppendMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeactionid", realPSModelObject.getDstPSDEAction(), realPSModelObject, "getDstPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedatasetid", realPSModelObject.getDstPSDEDataSet(), realPSModelObject, "getDstPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSDataEntity(), realPSModelObject, "getDstPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "param8", realPSModelObject.getHistoryCount(), realPSModelObject, "getHistoryCount");
		this.setDomainValue(iPSModelTranspileContext, domain, "param19", realPSModelObject.getKnowledgeBaseCount(), realPSModelObject, "getKnowledgeBaseCount");
		this.setDomainValue(iPSModelTranspileContext, domain, "param20", realPSModelObject.getMaxSmartAttempts(), realPSModelObject, "getMaxSmartAttempts");
		this.setDomainValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getMessage(), realPSModelObject, "getMessage");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysaichatagentid", realPSModelObject.getPSSysAIChatAgent(), realPSModelObject, "getPSSysAIChatAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysaifactoryid", realPSModelObject.getPSSysAIFactory(), realPSModelObject, "getPSSysAIFactory");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getPSSysMsgTempl(), realPSModelObject, "getPSSysMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysserviceapiid", realPSModelObject.getPSSysServiceAPI(), realPSModelObject, "getPSSysServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.getReentryLimit(), realPSModelObject, "getReentryLimit");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDELogicParam(), realPSModelObject, "getRetPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdlparamid", realPSModelObject.getSrcPSDELogicParam(), realPSModelObject, "getSrcPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicnodesubtype", realPSModelObject.getSubType(), realPSModelObject, "getSubType");
		this.setDomainValue(iPSModelTranspileContext, domain, "param3", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCATEGORYMODE, domain, "param11", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCATEGORYRERANKTHRESHOLD, domain, "param15", java.lang.Double.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCHATREQUESTAPPENDMODE, domain, "param12", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEACTION, domain, "dstpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATASET, domain, "dstpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDATAENTITY, domain, "dstpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHISTORYCOUNT, domain, "param8", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETKNOWLEDGEBASECOUNT, domain, "param19", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXSMARTATTEMPTS, domain, "param20", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMESSAGE, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSAICHATAGENT, domain, "pssysaichatagentid", net.ibizsys.model.ai.IPSSysAIChatAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSAIFACTORY, domain, "pssysaifactoryid", net.ibizsys.model.ai.IPSSysAIFactory.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSERVICEAPI, domain, "pssysserviceapiid", net.ibizsys.model.service.IPSSysServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREENTRYLIMIT, domain, "param7", java.lang.Integer.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDELOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDELOGICPARAM, domain, "srcpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTYPE, domain, "logicnodesubtype", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "param3", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}