package net.ibizsys.model.util.transpiler.control.menu;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.menu.PSAppMenuImpl.*;



public class PSAppMenuTranspiler extends net.ibizsys.model.util.transpiler.control.PSAjaxControlTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.menu.PSAppMenuImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.menu.PSAppMenuImpl realPSModelObject = (net.ibizsys.model.control.menu.PSAppMenuImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "appmenustyle", realPSModelObject.getAppMenuStyle(), realPSModelObject, "getAppMenuStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "layoutmode", realPSModelObject.getLayoutMode(), realPSModelObject, "getLayoutMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscounterid", realPSModelObject.getPSAppCounterRef(), realPSModelObject, "getPSAppCounterRef");
		this.setDomainValue(iPSModelTranspileContext, domain, "customizedflag", realPSModelObject.isEnableCustomized(), realPSModelObject, "isEnableCustomized");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPPMENUSTYLE, domain, "appmenustyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLAYOUTMODE, domain, "layoutmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPCOUNTERREF, domain, "pssyscounterid", net.ibizsys.model.app.control.IPSAppCounterRef.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECUSTOMIZED, domain, "customizedflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}