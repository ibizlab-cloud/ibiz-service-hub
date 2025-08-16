package net.ibizsys.model.util.transpiler.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.tree.PSDETreeDataSetNodeImpl.*;



public class PSDETreeDataSetNodeTranspiler extends net.ibizsys.model.util.transpiler.control.tree.PSDETreeNodeTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.tree.PSDETreeDataSetNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.tree.PSDETreeDataSetNodeImpl realPSModelObject = (net.ibizsys.model.control.tree.PSDETreeDataSetNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "childcntpsdefid", realPSModelObject.getChildCntPSAppDEField(), realPSModelObject, "getChildCntPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "clspsdefid", realPSModelObject.getClsPSAppDEField(), realPSModelObject, "getClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcond", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "data2psdefid", realPSModelObject.getData2PSAppDEField(), realPSModelObject, "getData2PSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldname", realPSModelObject.getDataName(), realPSModelObject, "getDataName");
		this.setDomainValue(iPSModelTranspileContext, domain, "datapsdefid", realPSModelObject.getDataPSAppDEField(), realPSModelObject, "getDataPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "datasource", realPSModelObject.getDataSourceType(), realPSModelObject, "getDataSourceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "filterpsdedsid", realPSModelObject.getFilterPSAppDEDataSet(), realPSModelObject, "getFilterPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconpsdefid", realPSModelObject.getIconPSAppDEField(), realPSModelObject, "getIconPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "keypsdefid", realPSModelObject.getIdPSAppDEField(), realPSModelObject, "getIdPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "leafflagpsdefid", realPSModelObject.getLeafFlagPSAppDEField(), realPSModelObject, "getLeafFlagPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "linkpsdefid", realPSModelObject.getLinkPSAppDEField(), realPSModelObject, "getLinkPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxsize", realPSModelObject.getMaxSize(), realPSModelObject, "getMaxSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "movepsdeactionid", realPSModelObject.getMovePSAppDEAction(), realPSModelObject, "getMovePSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "movepsdeopprivid", realPSModelObject.getMovePSDEOPPriv(), realPSModelObject, "getMovePSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSAppDEAction(), realPSModelObject, "getPSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSAppDEDataSet(), realPSModelObject, "getPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSAppDELogic(), realPSModelObject, "getPSAppDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pagesize", realPSModelObject.getPagingSize(), realPSModelObject, "getPagingSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "removepsdeactionid", realPSModelObject.getRemovePSAppDEAction(), realPSModelObject, "getRemovePSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "removepsdeopprivid", realPSModelObject.getRemovePSDEOPPriv(), realPSModelObject, "getRemovePSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "shapeclspsdefid", realPSModelObject.getShapeClsPSAppDEField(), realPSModelObject, "getShapeClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "sortdir", realPSModelObject.getSortDir(), realPSModelObject, "getSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "sortpsdefid", realPSModelObject.getSortPSAppDEField(), realPSModelObject, "getSortPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getTextFormat(), realPSModelObject, "getTextFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSAppDEField(), realPSModelObject, "getTextPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "tipspsdefid", realPSModelObject.getTipsPSAppDEField(), realPSModelObject, "getTipsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatepsdeactionid", realPSModelObject.getUpdatePSAppDEAction(), realPSModelObject, "getUpdatePSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatepsdeopprivid", realPSModelObject.getUpdatePSDEOPPriv(), realPSModelObject, "getUpdatePSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "appendcapflag", realPSModelObject.isAppendCaption(), realPSModelObject, "isAppendCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "distinctmode", realPSModelObject.isDistinctMode(), realPSModelObject, "isDistinctMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablepaging", realPSModelObject.isEnablePaging(), realPSModelObject, "isEnablePaging");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCHILDCNTPSAPPDEFIELD, domain, "childcntpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLSPSAPPDEFIELD, domain, "clspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "customcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA2PSAPPDEFIELD, domain, "data2psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATANAME, domain, "fieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAPSAPPDEFIELD, domain, "datapsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASOURCETYPE, domain, "datasource", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFILTERPSAPPDEDATASET, domain, "filterpsdedsid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONPSAPPDEFIELD, domain, "iconpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIDPSAPPDEFIELD, domain, "keypsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLEAFFLAGPSAPPDEFIELD, domain, "leafflagpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKPSAPPDEFIELD, domain, "linkpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXSIZE, domain, "maxsize", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOVEPSAPPDEACTION, domain, "movepsdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMOVEPSDEOPPRIV, domain, "movepsdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEACTION, domain, "psdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET, domain, "psdedsid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDELOGIC, domain, "psdelogicid", net.ibizsys.model.app.dataentity.IPSAppDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPAGINGSIZE, domain, "pagesize", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEPSAPPDEACTION, domain, "removepsdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEPSDEOPPRIV, domain, "removepsdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHAPECLSPSAPPDEFIELD, domain, "shapeclspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSORTDIR, domain, "sortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSORTPSAPPDEFIELD, domain, "sortpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTFORMAT, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSAPPDEFIELD, domain, "textpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPSPSAPPDEFIELD, domain, "tipspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEPSAPPDEACTION, domain, "updatepsdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEPSDEOPPRIV, domain, "updatepsdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISAPPENDCAPTION, domain, "appendcapflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDISTINCTMODE, domain, "distinctmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPAGING, domain, "enablepaging", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}