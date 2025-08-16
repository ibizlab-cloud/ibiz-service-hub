package net.ibizsys.model.util.transpiler.dataentity.dr;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dr.PSDEDRItemImpl.*;



public class PSDEDRItemTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dr.PSDEDRItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dr.PSDEDRItemImpl realPSModelObject = (net.ibizsys.model.dataentity.dr.PSDEDRItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "countermode", realPSModelObject.getCounterMode(), realPSModelObject, "getCounterMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablemode", realPSModelObject.getEnableMode(), realPSModelObject, "getEnableMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "dritemtype", realPSModelObject.getItemType(), realPSModelObject, "getItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "testpsdelogicid", realPSModelObject.getTestPSDELogic(), realPSModelObject, "getTestPSDELogic");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeopprivid", realPSModelObject.getTestPSDEOPPriv(), realPSModelObject, "getTestPSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getTestPSSysUniRes(), realPSModelObject, "getTestPSSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "testcustomcode", realPSModelObject.getTestScriptCode(), realPSModelObject, "getTestScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewcodename", realPSModelObject.getViewCodeName(), realPSModelObject, "getViewCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewpsdeid", realPSModelObject.getViewPSDataEntity(), realPSModelObject, "getViewPSDataEntity");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERMODE, domain, "countermode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLEMODE, domain, "enablemode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTYPE, domain, "dritemtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTPSDELOGIC, domain, "testpsdelogicid", net.ibizsys.model.dataentity.logic.IPSDELogic.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTPSDEOPPRIV, domain, "psdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTPSSYSUNIRES, domain, "pssysuniresid", net.ibizsys.model.security.IPSSysUniRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTESTSCRIPTCODE, domain, "testcustomcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWCODENAME, domain, "viewcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWPSDATAENTITY, domain, "viewpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}