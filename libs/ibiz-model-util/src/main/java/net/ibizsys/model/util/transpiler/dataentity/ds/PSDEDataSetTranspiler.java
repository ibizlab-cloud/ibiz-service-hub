package net.ibizsys.model.util.transpiler.dataentity.ds;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ds.PSDEDataSetImpl.*;



public class PSDEDataSetTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ds.PSDEDataSetImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ds.PSDEDataSetImpl realPSModelObject = (net.ibizsys.model.dataentity.ds.PSDEDataSetImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dsoption", realPSModelObject.getDataSetOption(), realPSModelObject, "getDataSetOption");
		this.setDomainValue(iPSModelTranspileContext, domain, "datasetparams", realPSModelObject.getDataSetParams(), realPSModelObject, "getDataSetParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstag", realPSModelObject.getDataSetTag(), realPSModelObject, "getDataSetTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstag2", realPSModelObject.getDataSetTag2(), realPSModelObject, "getDataSetTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstag3", realPSModelObject.getDataSetTag3(), realPSModelObject, "getDataSetTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstag4", realPSModelObject.getDataSetTag4(), realPSModelObject, "getDataSetTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablegroup", realPSModelObject.getGroupMode(), realPSModelObject, "getGroupMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorsortdir", realPSModelObject.getMajorSortDir(), realPSModelObject, "getMajorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsdefid", realPSModelObject.getMajorSortPSDEField(), realPSModelObject, "getMajorSortPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortdir", realPSModelObject.getMinorSortDir(), realPSModelObject, "getMinorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdefid", realPSModelObject.getMinorSortPSDEField(), realPSModelObject, "getMinorSortPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "potime", realPSModelObject.getPOTime(), realPSModelObject, "getPOTime");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSCodeList(), realPSModelObject, "getPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "aggdatapsderid", realPSModelObject.getPSDERAggData(), realPSModelObject, "getPSDERAggData");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysunistateid", realPSModelObject.getPSSysUniState(), realPSModelObject, "getPSSysUniState");
		this.setDomainValue(iPSModelTranspileContext, domain, "pagesize", realPSModelObject.getPageSize(), realPSModelObject, "getPageSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtype", realPSModelObject.getParamMode(), realPSModelObject, "getParamMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "unionmode", realPSModelObject.getUnionMode(), realPSModelObject, "getUnionMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtype", realPSModelObject.isCustomParam(), realPSModelObject, "isCustomParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultmode", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableaudit", realPSModelObject.isEnableAudit(), realPSModelObject, "isEnableAudit");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablegroup", realPSModelObject.isEnableGroup(), realPSModelObject, "isEnableGroup");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASETOPTION, domain, "dsoption", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASETPARAMS, domain, "datasetparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASETTAG, domain, "dstag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASETTAG2, domain, "dstag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASETTAG3, domain, "dstag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATASETTAG4, domain, "dstag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPMODE, domain, "enablegroup", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORSORTDIR, domain, "majorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORSORTPSDEFIELD, domain, "majorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTDIR, domain, "minorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTPSDEFIELD, domain, "minorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOTIME, domain, "potime", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSCODELIST, domain, "pscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDERAGGDATA, domain, "aggdatapsderid", net.ibizsys.model.dataentity.der.IPSDERAggData.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUNISTATE, domain, "pssysunistateid", net.ibizsys.model.res.IPSSysUniState.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPAGESIZE, domain, "pagesize", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMMODE, domain, "paramtype", int.class, new String[]{"1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIONMODE, domain, "unionmode", java.lang.String.class, new String[]{"UNION"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCUSTOMPARAM, domain, "paramtype", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEAUDIT, domain, "enableaudit", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEGROUP, domain, "enablegroup", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}