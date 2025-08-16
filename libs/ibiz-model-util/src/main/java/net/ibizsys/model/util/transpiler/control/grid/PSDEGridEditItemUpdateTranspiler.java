package net.ibizsys.model.util.transpiler.control.grid;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.grid.PSDEGridEditItemUpdateImpl.*;



public class PSDEGridEditItemUpdateTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.grid.PSDEGridEditItemUpdateImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.grid.PSDEGridEditItemUpdateImpl realPSModelObject = (net.ibizsys.model.control.grid.PSDEGridEditItemUpdateImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSAppDEMethod(), realPSModelObject, "getPSAppDEMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcode", realPSModelObject.getScriptCode(), realPSModelObject, "getScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "custommode", realPSModelObject.isCustomCode(), realPSModelObject, "isCustomCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "busyindicator", realPSModelObject.isShowBusyIndicator(), realPSModelObject, "isShowBusyIndicator");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEMETHOD, domain, "psdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEMethod.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCRIPTCODE, domain, "customcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCUSTOMCODE, domain, "custommode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWBUSYINDICATOR, domain, "busyindicator", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}