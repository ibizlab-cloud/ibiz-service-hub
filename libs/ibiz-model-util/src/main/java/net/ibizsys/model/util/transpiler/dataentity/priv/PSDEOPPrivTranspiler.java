package net.ibizsys.model.util.transpiler.dataentity.priv;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.priv.PSDEOPPrivImpl.*;



public class PSDEOPPrivTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.priv.PSDEOPPrivImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.priv.PSDEOPPrivImpl realPSModelObject = (net.ibizsys.model.dataentity.priv.PSDEOPPrivImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "mappsdeopprivname", realPSModelObject.getMapPSDEOPPrivName(), realPSModelObject, "getMapPSDEOPPrivName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psderid", realPSModelObject.getMapPSDER(), realPSModelObject, "getMapPSDER");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getMapPSSysUniRes(), realPSModelObject, "getMapPSSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "opprivtype", realPSModelObject.getOPPrivType(), realPSModelObject, "getOPPrivType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefgroupid", realPSModelObject.getPSDEFGroup(), realPSModelObject, "getPSDEFGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "mapsysuniresmode", realPSModelObject.isMapSysUniRes(), realPSModelObject, "isMapSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "systemflag", realPSModelObject.isSystemReserved(), realPSModelObject, "isSystemReserved");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPPSDEOPPRIVNAME, domain, "mappsdeopprivname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPPSDER, domain, "psderid", net.ibizsys.model.dataentity.der.IPSDERBase.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAPPSSYSUNIRES, domain, "pssysuniresid", net.ibizsys.model.security.IPSSysUniRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOPPRIVTYPE, domain, "opprivtype", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFGROUP, domain, "psdefgroupid", net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMAPSYSUNIRES, domain, "mapsysuniresmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSYSTEMRESERVED, domain, "systemflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}