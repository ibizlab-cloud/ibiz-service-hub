package net.ibizsys.model.util.transpiler.extend.app.control;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DashboardScope;
import net.ibizsys.model.app.control.IPSAppPortlet;
import net.ibizsys.model.control.dashboard.IPSDBPortletPart;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSAppPortlet;
import net.ibizsys.psmodel.core.domain.PSSysPortlet;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppPortletListTranspilerEx extends net.ibizsys.model.util.transpiler.app.control.PSAppPortletListTranspiler{

	public final static String FIELD_CATUNIQUETAG = "catuniquetag";
	
	public final static String FIELD_CONTROLMODEL = "controlmodel";
	
	public final static String FIELD_PORTLETTYPE = "portlettype";
	
	/**
	 * 部件模型摘要
	 */
	public final static String FIELD_CONTROLMODELDIGEST = "controlmodeldigest";
	
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		PSAppPortlet psAppPortlet = (PSAppPortlet)domain;
		IPSAppPortlet iPSAppPortlet = (IPSAppPortlet)iPSModelObject;
		
		if(iPSAppPortlet.getPSAppPortletCatMust()!=null) {
			psAppPortlet.set(FIELD_CATUNIQUETAG, iPSAppPortlet.getPSAppPortletCatMust().getUniqueTag());
		}
		
		int nScope = 0;
		if(iPSAppPortlet.isEnableAppDashboard()) {
			nScope |= DashboardScope.APP.value;
		}
		if(iPSAppPortlet.isEnableDEDashboard()) {
			nScope |= DashboardScope.DE.value;
		}
		
		psAppPortlet.set(PSSysPortlet.FIELD_DASHBOARDSCOPE, nScope);
		
		if(iPSAppPortlet.getPSControl() instanceof IPSDBPortletPart) {
			psAppPortlet.set(FIELD_PORTLETTYPE, ((IPSDBPortletPart)iPSAppPortlet.getPSControl()).getPortletType());
			
		}
//		if(bFullMode) {
//			if(iPSAppPortlet.getPSControl() != null) {
//				psAppPortlet.set(FIELD_CONTROLMODEL, iPSAppPortlet.getPSControl().getObjectNode().toString());
//			}
//		}
	}
}