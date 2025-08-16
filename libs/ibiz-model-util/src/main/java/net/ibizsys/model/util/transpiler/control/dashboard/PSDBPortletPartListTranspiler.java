package net.ibizsys.model.util.transpiler.control.dashboard;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDBPortletPartListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSSysDBPart createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSSysDBPart();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "APPMENU":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBAppMenuPortletPartImpl.class, false);
			case "CHART":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBChartPortletPartImpl.class, false);
			case "CONTAINER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBContainerPortletPartImpl.class, false);
			case "CUSTOM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBCustomPortletPartImpl.class, false);
			case "FILTER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBFilterPortletPartImpl.class, false);
			case "HTML":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBHtmlPortletPartImpl.class, false);
			case "LIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBListPortletPartImpl.class, false);
			case "RAWITEM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBRawItemPortletPartImpl.class, false);
			case "REPORT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBReportPortletPartImpl.class, false);
			case "TOOLBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBToolbarPortletPartImpl.class, false);
			case "VIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBPortletPartImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.dashboard.IPSDBPortletPart iPSDBPortletPart = (net.ibizsys.model.control.dashboard.IPSDBPortletPart)iPSModelObject;
		Object type = iPSDBPortletPart.getPortletType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("portlettype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}