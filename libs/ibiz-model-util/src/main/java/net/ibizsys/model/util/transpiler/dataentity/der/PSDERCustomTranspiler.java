package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDERCustomImpl.*;



public class PSDERCustomTranspiler extends net.ibizsys.model.util.transpiler.dataentity.der.PSDERBaseTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDERCustomImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDERCustomImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDERCustomImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cloneordervalue", realPSModelObject.getCloneOrder(), realPSModelObject, "getCloneOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "exportscope", realPSModelObject.getCustomExportOrder(), realPSModelObject, "getCustomExportOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "exportscope2", realPSModelObject.getCustomExportOrder2(), realPSModelObject, "getCustomExportOrder2");
		this.setDomainValue(iPSModelTranspileContext, domain, "dersubtype", realPSModelObject.getDERSubType(), realPSModelObject, "getDERSubType");
		this.setDomainValue(iPSModelTranspileContext, domain, "masterordervalue", realPSModelObject.getMasterOrder(), realPSModelObject, "getMasterOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "masterrs", realPSModelObject.getMasterRS(), realPSModelObject, "getMasterRS");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdedsid", realPSModelObject.getNestedPSDEDataSet(), realPSModelObject, "getNestedPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "derfieldname", realPSModelObject.getPickupDEFName(), realPSModelObject, "getPickupDEFName");
		this.setDomainValue(iPSModelTranspileContext, domain, "removerejectpslanresid", realPSModelObject.getRRMPSLanguageRes(), realPSModelObject, "getRRMPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getRefPSDEDataSet(), realPSModelObject, "getRefPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefgroupid", realPSModelObject.getRefPSDEFGroup(), realPSModelObject, "getRefPSDEFGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "removeactiontype", realPSModelObject.getRemoveActionType(), realPSModelObject, "getRemoveActionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "removeorder", realPSModelObject.getRemoveOrder(), realPSModelObject, "getRemoveOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "removerejectmsg", realPSModelObject.getRemoveRejectMsg(), realPSModelObject, "getRemoveRejectMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "indexvalue", realPSModelObject.getTypeValue(), realPSModelObject, "getTypeValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatephysicaldefield", realPSModelObject.isEnablePhysicalDEFieldUpdate(), realPSModelObject, "isEnablePhysicalDEFieldUpdate");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLONEORDER, domain, "cloneordervalue", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMEXPORTORDER, domain, "exportscope", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMEXPORTORDER2, domain, "exportscope2", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDERSUBTYPE, domain, "dersubtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASTERORDER, domain, "masterordervalue", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASTERRS, domain, "masterrs", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNESTEDPSDEDATASET, domain, "minorpsdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPICKUPDEFNAME, domain, "derfieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRRMPSLANGUAGERES, domain, "removerejectpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDEDATASET, domain, "psdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDEFGROUP, domain, "psdefgroupid", net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEACTIONTYPE, domain, "removeactiontype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEORDER, domain, "removeorder", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEREJECTMSG, domain, "removerejectmsg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTYPEVALUE, domain, "indexvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPHYSICALDEFIELDUPDATE, domain, "updatephysicaldefield", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}