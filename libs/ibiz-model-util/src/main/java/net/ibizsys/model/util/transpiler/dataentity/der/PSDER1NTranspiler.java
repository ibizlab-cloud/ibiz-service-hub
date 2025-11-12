package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDER1NImpl.*;



public class PSDER1NTranspiler extends net.ibizsys.model.util.transpiler.dataentity.der.PSDERBaseTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDER1NImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDER1NImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDER1NImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cloneordervalue", realPSModelObject.getCloneOrder(), realPSModelObject, "getCloneOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "exportscope", realPSModelObject.getCustomExportOrder(), realPSModelObject, "getCustomExportOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "exportscope2", realPSModelObject.getCustomExportOrder2(), realPSModelObject, "getCustomExportOrder2");
		this.setDomainValue(iPSModelTranspileContext, domain, "extmajorpsdefid", realPSModelObject.getERMajorPSDEF(), realPSModelObject, "getERMajorPSDEF");
		this.setDomainValue(iPSModelTranspileContext, domain, "extminorpsdefid", realPSModelObject.getERMinorPSDEF(), realPSModelObject, "getERMinorPSDEF");
		this.setDomainValue(iPSModelTranspileContext, domain, "exportmajormodel", realPSModelObject.getExportMajorModel(), realPSModelObject, "getExportMajorModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "fkeyname", realPSModelObject.getFKeyName(), realPSModelObject, "getFKeyName");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsderid", realPSModelObject.getMajorPPSDER1N(), realPSModelObject, "getMajorPPSDER1N");
		this.setDomainValue(iPSModelTranspileContext, domain, "masterordervalue", realPSModelObject.getMasterOrder(), realPSModelObject, "getMasterOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "masterrs", realPSModelObject.getMasterRS(), realPSModelObject, "getMasterRS");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsderid", realPSModelObject.getMinorPPSDER1N(), realPSModelObject, "getMinorPPSDER1N");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdedsid", realPSModelObject.getNestedPSDEDataSet(), realPSModelObject, "getNestedPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "derfieldname", realPSModelObject.getPickupDEFName(), realPSModelObject, "getPickupDEFName");
		this.setDomainValue(iPSModelTranspileContext, domain, "removerejectpslanresid", realPSModelObject.getRRMPSLanguageRes(), realPSModelObject, "getRRMPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getRefPSDEDataSet(), realPSModelObject, "getRefPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefgroupid", realPSModelObject.getRefPSDEFGroup(), realPSModelObject, "getRefPSDEFGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "removeactiontype", realPSModelObject.getRemoveActionType(), realPSModelObject, "getRemoveActionType");
		this.setDomainValue(iPSModelTranspileContext, domain, "removeorder", realPSModelObject.getRemoveOrder(), realPSModelObject, "getRemoveOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "removerejectmsg", realPSModelObject.getRemoveRejectMsg(), realPSModelObject, "getRemoveRejectMsg");
		this.setDomainValue(iPSModelTranspileContext, domain, "syncexportmodel", realPSModelObject.getSyncDataMode(), realPSModelObject, "getSyncDataMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "tempordervalue", realPSModelObject.getTempDataOrder(), realPSModelObject, "getTempDataOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableclone", realPSModelObject.isCloneRS(), realPSModelObject, "isCloneRS");
		this.setDomainValue(iPSModelTranspileContext, domain, "enaextrange", realPSModelObject.isEnableExtRestrict(), realPSModelObject, "isEnableExtRestrict");
		this.setDomainValue(iPSModelTranspileContext, domain, "foreignkey", realPSModelObject.isEnableFKey(), realPSModelObject, "isEnableFKey");
		this.setDomainValue(iPSModelTranspileContext, domain, "enapdereq", realPSModelObject.isEnablePDEREQ(), realPSModelObject, "isEnablePDEREQ");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatephysicaldefield", realPSModelObject.isEnablePhysicalDEFieldUpdate(), realPSModelObject, "isEnablePhysicalDEFieldUpdate");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLONEORDER, domain, "cloneordervalue", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMEXPORTORDER, domain, "exportscope", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMEXPORTORDER2, domain, "exportscope2", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETERMAJORPSDEF, domain, "extmajorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETERMINORPSDEF, domain, "extminorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXPORTMAJORMODEL, domain, "exportmajormodel", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFKEYNAME, domain, "fkeyname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPPSDER1N, domain, "majorpsderid", net.ibizsys.model.dataentity.der.IPSDER1N.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASTERORDER, domain, "masterordervalue", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASTERRS, domain, "masterrs", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPPSDER1N, domain, "minorpsderid", net.ibizsys.model.dataentity.der.IPSDER1N.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNESTEDPSDEDATASET, domain, "minorpsdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPICKUPDEFNAME, domain, "derfieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRRMPSLANGUAGERES, domain, "removerejectpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDEDATASET, domain, "psdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDEFGROUP, domain, "psdefgroupid", net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEACTIONTYPE, domain, "removeactiontype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEORDER, domain, "removeorder", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEREJECTMSG, domain, "removerejectmsg", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYNCDATAMODE, domain, "syncexportmodel", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEMPDATAORDER, domain, "tempordervalue", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCLONERS, domain, "enableclone", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEEXTRESTRICT, domain, "enaextrange", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEFKEY, domain, "foreignkey", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPDEREQ, domain, "enapdereq", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPHYSICALDEFIELDUPDATE, domain, "updatephysicaldefield", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}