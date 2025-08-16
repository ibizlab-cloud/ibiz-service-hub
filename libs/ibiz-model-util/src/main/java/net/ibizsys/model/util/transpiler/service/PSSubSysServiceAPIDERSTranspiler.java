package net.ibizsys.model.util.transpiler.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.service.PSSubSysServiceAPIDERSImpl.*;



public class PSSubSysServiceAPIDERSTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.service.PSSubSysServiceAPIDERSImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.service.PSSubSysServiceAPIDERSImpl realPSModelObject = (net.ibizsys.model.service.PSSubSysServiceAPIDERSImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "ppssubsyssadeid", realPSModelObject.getMajorPSSubSysServiceAPIDE(), realPSModelObject, "getMajorPSSubSysServiceAPIDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervalue", realPSModelObject.getMasterOrder(), realPSModelObject, "getMasterOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "cpssubsyssadeid", realPSModelObject.getMinorPSSubSysServiceAPIDE(), realPSModelObject, "getMinorPSSubSysServiceAPIDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "childfilter", realPSModelObject.getParentFilter(), realPSModelObject, "getParentFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "rstag", realPSModelObject.getRSTag(), realPSModelObject, "getRSTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "rstag2", realPSModelObject.getRSTag2(), realPSModelObject, "getRSTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "arrayflag", realPSModelObject.isArray(), realPSModelObject, "isArray");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSSUBSYSSERVICEAPIDE, domain, "ppssubsyssadeid", net.ibizsys.model.service.IPSSubSysServiceAPIDE.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMASTERORDER, domain, "ordervalue", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPSSUBSYSSERVICEAPIDE, domain, "cpssubsyssadeid", net.ibizsys.model.service.IPSSubSysServiceAPIDE.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARENTFILTER, domain, "childfilter", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRSTAG, domain, "rstag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRSTAG2, domain, "rstag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISARRAY, domain, "arrayflag", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}