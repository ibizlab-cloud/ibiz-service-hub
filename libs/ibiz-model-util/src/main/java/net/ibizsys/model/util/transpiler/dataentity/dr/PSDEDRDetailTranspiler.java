package net.ibizsys.model.util.transpiler.dataentity.dr;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dr.PSDEDRDetailImpl.*;



public class PSDEDRDetailTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dr.PSDEDRDetailImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dr.PSDEDRDetailImpl realPSModelObject = (net.ibizsys.model.dataentity.dr.PSDEDRDetailImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "countermode", realPSModelObject.getCounterMode(), realPSModelObject, "getCounterMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "data", realPSModelObject.getData(), realPSModelObject, "getData");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtag", realPSModelObject.getDetailTag(), realPSModelObject, "getDetailTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtag2", realPSModelObject.getDetailTag2(), realPSModelObject, "getDetailTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "detailtype", realPSModelObject.getDetailType(), realPSModelObject, "getDetailType");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablemode", realPSModelObject.getEnableMode(), realPSModelObject, "getEnableMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervalue", realPSModelObject.getOrderValue(), realPSModelObject, "getOrderValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getOriginCaption(), realPSModelObject, "getOriginCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedritemid", realPSModelObject.getPSDEDRItem(), realPSModelObject, "getPSDEDRItem");
		this.setDomainValue(iPSModelTranspileContext, domain, "testpsdelogicid", realPSModelObject.getTestPSDELogic(), realPSModelObject, "getTestPSDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeopprivid", realPSModelObject.getTestPSDEOPPriv(), realPSModelObject, "getTestPSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getTestPSSysUniRes(), realPSModelObject, "getTestPSSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "testcustomcode", realPSModelObject.getTestScriptCode(), realPSModelObject, "getTestScriptCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERMODE, domain, "countermode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA, domain, "data", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTAG, domain, "detailtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTAG2, domain, "detailtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILTYPE, domain, "detailtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLEMODE, domain, "enablemode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUE, domain, "ordervalue", int.class, new String[]{"99999"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORIGINCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDRITEM, domain, "psdedritemid", net.ibizsys.model.dataentity.dr.IPSDEDRItem.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTPSDELOGIC, domain, "testpsdelogicid", net.ibizsys.model.dataentity.logic.IPSDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTPSDEOPPRIV, domain, "psdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTPSSYSUNIRES, domain, "pssysuniresid", net.ibizsys.model.security.IPSSysUniRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTSCRIPTCODE, domain, "testcustomcode", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}