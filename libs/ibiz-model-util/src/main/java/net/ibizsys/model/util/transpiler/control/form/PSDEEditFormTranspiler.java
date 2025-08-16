package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.form.PSDEEditFormImpl.*;



public class PSDEEditFormTranspiler extends net.ibizsys.model.util.transpiler.control.form.PSDEFormTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.form.PSDEEditFormImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.form.PSDEEditFormImpl realPSModelObject = (net.ibizsys.model.control.form.PSDEEditFormImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "enableautosave", realPSModelObject.getAutoSaveMode(), realPSModelObject, "getAutoSaveMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "datatype", realPSModelObject.getDataType(), realPSModelObject, "getDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "navbarpssyscssid", realPSModelObject.getNavBarPSSysCss(), realPSModelObject, "getNavBarPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "navbarpos", realPSModelObject.getNavBarPos(), realPSModelObject, "getNavBarPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "navbarstyle", realPSModelObject.getNavBarStyle(), realPSModelObject, "getNavBarStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "navbarwidth", realPSModelObject.getNavBarWidth(), realPSModelObject, "getNavBarWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "navbarheight", realPSModelObject.getNavbarHeight(), realPSModelObject, "getNavbarHeight");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscounterid", realPSModelObject.getPSAppCounterRef(), realPSModelObject, "getPSAppCounterRef");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam5", realPSModelObject.isEnableAutoSave(), realPSModelObject, "isEnableAutoSave");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecustomized", realPSModelObject.isEnableCustomized(), realPSModelObject, "isEnableCustomized");
		this.setDomainValue(iPSModelTranspileContext, domain, "infoformflag", realPSModelObject.isInfoFormMode(), realPSModelObject, "isInfoFormMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "formnavbar", realPSModelObject.isShowFormNavBar(), realPSModelObject, "isShowFormNavBar");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUTOSAVEMODE, domain, "enableautosave", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATATYPE, domain, "datatype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVBARPSSYSCSS, domain, "navbarpssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVBARPOS, domain, "navbarpos", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVBARSTYLE, domain, "navbarstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVBARWIDTH, domain, "navbarwidth", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVBARHEIGHT, domain, "navbarheight", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCOUNTERREF, domain, "pssyscounterid", net.ibizsys.model.app.control.IPSAppCounterRef.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEAUTOSAVE, domain, "ctrlparam5", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECUSTOMIZED, domain, "enablecustomized", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINFOFORMMODE, domain, "infoformflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWFORMNAVBAR, domain, "formnavbar", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}