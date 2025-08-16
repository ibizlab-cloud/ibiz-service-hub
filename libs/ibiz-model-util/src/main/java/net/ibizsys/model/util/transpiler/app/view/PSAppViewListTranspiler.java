package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppViewListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSAppView createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSAppView();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "APPDATAUPLOADVIEW":
			case "APPERRORVIEW":
			case "APPFILEUPLOADVIEW":
			case "APPFUNCPICKUPVIEW":
			case "APPLOGINVIEW":
			case "APPLOGOUTVIEW":
			case "APPPICUPLOADVIEW":
			case "APPREDIRECTVIEW":
			case "APPSTARTVIEW":
			case "APPUTILVIEW":
			case "APPWELCOMEVIEW":
			case "APPWFADDSTEPBEFOREVIEW":
			case "APPWFREDIRECTVIEW":
			case "APPWFSENDBACKVIEW":
			case "APPWFSTEPACTORVIEW":
			case "APPWFSTEPDATAVIEW":
			case "APPWFSTEPTRACEVIEW":
			case "APPWFSUPPLYINFOVIEW":
			case "APPWFTAKEADVICEVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppUtilViewImpl.class, false);
			case "APPDEVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEViewImpl.class, false);
			case "APPINDEXVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppIndexViewImpl.class, false);
			case "APPPANELVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppPanelViewImpl.class, false);
			case "APPPORTALVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppPortalViewImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEViewImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.app.view.IPSAppView iPSAppView = (net.ibizsys.model.app.view.IPSAppView)iPSModelObject;
		Object type = iPSAppView.getViewType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("viewtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}