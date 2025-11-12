package net.ibizsys.model.util.transpiler.dataentity.ac;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ac.PSDEACModeImpl.*;



public class PSDEACModeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ac.PSDEACModeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ac.PSDEACModeImpl realPSModelObject = (net.ibizsys.model.dataentity.ac.PSDEACModeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "acparams", realPSModelObject.getACParams(), realPSModelObject, "getACParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "actag", realPSModelObject.getACTag(), realPSModelObject, "getACTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "actag2", realPSModelObject.getACTag2(), realPSModelObject, "getACTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "actag3", realPSModelObject.getACTag3(), realPSModelObject, "getACTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "actag4", realPSModelObject.getACTag4(), realPSModelObject, "getACTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "actype", realPSModelObject.getACType(), realPSModelObject, "getACType");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytextpslanresid", realPSModelObject.getEmptyTextPSLanguageRes(), realPSModelObject, "getEmptyTextPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "historypssysmsgtemplid", realPSModelObject.getHistoryPSSysMsgTempl(), realPSModelObject, "getHistoryPSSysMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "linkpsdeviewid", realPSModelObject.getLinkPSAppView(), realPSModelObject, "getLinkPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortdir", realPSModelObject.getMinorSortDir(), realPSModelObject, "getMinorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortpsdefid", realPSModelObject.getMinorSortPSAppDEField(), realPSModelObject, "getMinorSortPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getPSAppDEDataSet(), realPSModelObject, "getPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSDEUIActionGroup(), realPSModelObject, "getPSDEUIActionGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysaichatagentid", realPSModelObject.getPSSysAIChatAgent(), realPSModelObject, "getPSSysAIChatAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysaifactoryid", realPSModelObject.getPSSysAIFactory(), realPSModelObject, "getPSSysAIFactory");
		this.setDomainValue(iPSModelTranspileContext, domain, "pagingsize", realPSModelObject.getPagingSize(), realPSModelObject, "getPagingSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "pickuppsdeviewid", realPSModelObject.getPickupPSAppView(), realPSModelObject, "getPickupPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "custommode", realPSModelObject.getScriptMode(), realPSModelObject, "getScriptMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSAppDEField(), realPSModelObject, "getTextPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "valuepsdefid", realPSModelObject.getValuePSAppDEField(), realPSModelObject, "getValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultmode", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionholder", realPSModelObject.isEnableBackend(), realPSModelObject, "isEnableBackend");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablepagingbar", realPSModelObject.isEnablePagingBar(), realPSModelObject, "isEnablePagingBar");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACPARAMS, domain, "acparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTAG, domain, "actag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTAG2, domain, "actag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTAG3, domain, "actag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTAG4, domain, "actag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTYPE, domain, "actype", java.lang.String.class, new String[]{"AUTOCOMPLETE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXTPSLANGUAGERES, domain, "emptytextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETHISTORYPSSYSMSGTEMPL, domain, "historypssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKPSAPPVIEW, domain, "linkpsdeviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTDIR, domain, "minorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTPSAPPDEFIELD, domain, "minorsortpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET, domain, "psdedatasetid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSAICHATAGENT, domain, "pssysaichatagentid", net.ibizsys.model.ai.IPSSysAIChatAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSAIFACTORY, domain, "pssysaifactoryid", net.ibizsys.model.ai.IPSSysAIFactory.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPAGINGSIZE, domain, "pagingsize", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPICKUPPSAPPVIEW, domain, "pickuppsdeviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTMODE, domain, "custommode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSAPPDEFIELD, domain, "textpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEPSAPPDEFIELD, domain, "valuepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultmode", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEBACKEND, domain, "actionholder", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPAGINGBAR, domain, "enablepagingbar", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}