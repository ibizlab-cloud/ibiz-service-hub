package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppDEViewListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDEViewBase createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDEViewBase();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DECALENDAREXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDECalendarExplorerViewImpl.class, false);
			case "DECALENDARVIEW":
			case "DECALENDARVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDECalendarViewImpl.class, false);
			case "DECHARTEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEChartExplorerViewImpl.class, false);
			case "DECHARTVIEW":
			case "DECHARTVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEChartViewImpl.class, false);
			case "DECUSTOMVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDECustomViewImpl.class, false);
			case "DEDATAVIEW":
			case "DEDATAVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEDataViewImpl.class, false);
			case "DEDATAVIEWEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEDataViewExplorerViewImpl.class, false);
			case "DEEDITVIEW":
			case "DEEDITVIEW2":
			case "DEEDITVIEW3":
			case "DEEDITVIEW4":
			case "DEOPTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEEditViewImpl.class, false);
			case "DEEDITVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEEditView9Impl.class, false);
			case "DEFORMPICKUPDATAVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEFormPickupDataViewImpl.class, false);
			case "DEGANTTEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEGanttExplorerViewImpl.class, false);
			case "DEGANTTVIEW":
			case "DEGANTTVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEGanttViewImpl.class, false);
			case "DEGRIDEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEGridExplorerViewImpl.class, false);
			case "DEGRIDVIEW":
			case "DEGRIDVIEW2":
			case "DEGRIDVIEW4":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEGridViewImpl.class, false);
			case "DEGRIDVIEW8":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEGridView8Impl.class, false);
			case "DEGRIDVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEGridView9Impl.class, false);
			case "DEHTMLVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEHtmlViewImpl.class, false);
			case "DEINDEXPICKUPDATAVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEIndexPickupDataViewImpl.class, false);
			case "DEINDEXVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEIndexViewImpl.class, false);
			case "DEKANBANVIEW":
			case "DEKANBANVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEKanbanViewImpl.class, false);
			case "DELISTEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEListExplorerViewImpl.class, false);
			case "DELISTVIEW":
			case "DELISTVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEListViewImpl.class, false);
			case "DEMAPEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMapExplorerViewImpl.class, false);
			case "DEMAPVIEW":
			case "DEMAPVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMapViewImpl.class, false);
			case "DEMDCUSTOMVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMultiDataView2Impl.class, false);
			case "DEMEDITVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMEditViewImpl.class, false);
			case "DEMOBCALENDAREXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobCalendarExplorerViewImpl.class, false);
			case "DEMOBCALENDARVIEW":
			case "DEMOBCALENDARVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobCalendarViewImpl.class, false);
			case "DEMOBCHARTEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobChartExplorerViewImpl.class, false);
			case "DEMOBCHARTVIEW":
			case "DEMOBCHARTVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobChartViewImpl.class, false);
			case "DEMOBCUSTOMVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobCustomViewImpl.class, false);
			case "DEMOBDATAVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobDataViewImpl.class, false);
			case "DEMOBDATAVIEWEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobDataViewExplorerViewImpl.class, false);
			case "DEMOBEDITVIEW":
			case "DEMOBEDITVIEW3":
			case "DEMOBEDITVIEW9":
			case "DEMOBOPTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobEditViewImpl.class, false);
			case "DEMOBFORMPICKUPMDVIEW":
			case "DEMOBINDEXPICKUPMDVIEW":
			case "DEMOBPICKUPMDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobPickupMDViewImpl.class, false);
			case "DEMOBGANTTEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobGanttExplorerViewImpl.class, false);
			case "DEMOBGANTTVIEW":
			case "DEMOBGANTTVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobGanttViewImpl.class, false);
			case "DEMOBHTMLVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobHtmlViewImpl.class, false);
			case "DEMOBLISTEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobListExplorerViewImpl.class, false);
			case "DEMOBLISTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobListViewImpl.class, false);
			case "DEMOBMAPEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobMapExplorerViewImpl.class, false);
			case "DEMOBMAPVIEW":
			case "DEMOBMAPVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobMapViewImpl.class, false);
			case "DEMOBMDVIEW":
			case "DEMOBMDVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobMDViewImpl.class, false);
			case "DEMOBMEDITVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobMEditViewImpl.class, false);
			case "DEMOBMPICKUPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobMPickupViewImpl.class, false);
			case "DEMOBPANELVIEW":
			case "DEMOBPANELVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobPanelViewImpl.class, false);
			case "DEMOBPICKUPLISTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobPickupListViewImpl.class, false);
			case "DEMOBPICKUPTREEVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobPickupTreeViewImpl.class, false);
			case "DEMOBPICKUPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobPickupViewImpl.class, false);
			case "DEMOBPORTALVIEW":
			case "DEMOBPORTALVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobDashboardViewImpl.class, false);
			case "DEMOBREDIRECTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobRedirectViewImpl.class, false);
			case "DEMOBREPORTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobReportViewImpl.class, false);
			case "DEMOBTABEXPVIEW":
			case "DEMOBTABEXPVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobTabExplorerViewImpl.class, false);
			case "DEMOBTABSEARCHVIEW":
			case "DEMOBTABSEARCHVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobTabSearchViewImpl.class, false);
			case "DEMOBTREEEXPVIEW":
			case "DEMOBTREEEXPVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobTreeExplorerViewImpl.class, false);
			case "DEMOBTREEVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobTreeViewImpl.class, false);
			case "DEMOBWFACTIONVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFActionViewImpl.class, false);
			case "DEMOBWFDATAREDIRECTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFDataRedirectViewImpl.class, false);
			case "DEMOBWFDYNAACTIONVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFDynaActionViewImpl.class, false);
			case "DEMOBWFDYNAEDITVIEW":
			case "DEMOBWFDYNAEDITVIEW3":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFDynaEditViewImpl.class, false);
			case "DEMOBWFDYNAEXPMDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFDynaExpMDViewImpl.class, false);
			case "DEMOBWFDYNASTARTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFDynaStartViewImpl.class, false);
			case "DEMOBWFEDITVIEW":
			case "DEMOBWFEDITVIEW3":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFEditViewImpl.class, false);
			case "DEMOBWFMDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFMDViewImpl.class, false);
			case "DEMOBWFPROXYRESULTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFProxyResultViewImpl.class, false);
			case "DEMOBWFPROXYSTARTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFProxyStartViewImpl.class, false);
			case "DEMOBWFSTARTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWFStartViewImpl.class, false);
			case "DEMOBWIZARDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMobWizardViewImpl.class, false);
			case "DEMPICKUPVIEW":
			case "DEMPICKUPVIEW2":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEMPickupViewImpl.class, false);
			case "DEPANELVIEW":
			case "DEPANELVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEPanelViewImpl.class, false);
			case "DEPICKUPDATAVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEPickupDataViewImpl.class, false);
			case "DEPICKUPGRIDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEPickupGridViewImpl.class, false);
			case "DEPICKUPTREEVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEPickupTreeViewImpl.class, false);
			case "DEPICKUPVIEW":
			case "DEPICKUPVIEW2":
			case "DEPICKUPVIEW3":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEPickupViewImpl.class, false);
			case "DEPORTALVIEW":
			case "DEPORTALVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEDashboardViewImpl.class, false);
			case "DEREDIRECTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDERedirectViewImpl.class, false);
			case "DEREPORTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEReportViewImpl.class, false);
			case "DESUBAPPREFVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDESubAppRefViewImpl.class, false);
			case "DETABEXPVIEW":
			case "DETABEXPVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDETabExplorerViewImpl.class, false);
			case "DETABSEARCHVIEW":
			case "DETABSEARCHVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDETabSearchViewImpl.class, false);
			case "DETREEEXPVIEW":
			case "DETREEEXPVIEW3":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDETreeExplorerViewImpl.class, false);
			case "DETREEEXPVIEW2":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDETreeExplorerView2Impl.class, false);
			case "DETREEGRIDEXVIEW":
			case "DETREEGRIDEXVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDETreeGridExViewImpl.class, false);
			case "DETREEGRIDVIEW":
			case "DETREEGRIDVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDETreeGridViewImpl.class, false);
			case "DETREEVIEW":
			case "DETREEVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDETreeViewImpl.class, false);
			case "DEWFACTIONVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFActionViewImpl.class, false);
			case "DEWFDATAREDIRECTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFDataRedirectViewImpl.class, false);
			case "DEWFDYNAACTIONVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFDynaActionViewImpl.class, false);
			case "DEWFDYNAEDITVIEW":
			case "DEWFDYNAEDITVIEW3":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFDynaEditViewImpl.class, false);
			case "DEWFDYNAEXPGRIDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFDynaExpGridViewImpl.class, false);
			case "DEWFDYNASTARTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFDynaStartViewImpl.class, false);
			case "DEWFEDITPROXYDATAVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFEditProxyDataViewImpl.class, false);
			case "DEWFEDITVIEW":
			case "DEWFEDITVIEW2":
			case "DEWFEDITVIEW3":
			case "DEWFEDITVIEW9":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFEditViewImpl.class, false);
			case "DEWFEXPVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFExplorerViewImpl.class, false);
			case "DEWFGRIDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFGridViewImpl.class, false);
			case "DEWFPROXYDATAREDIRECTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFProxyDataRedirectViewImpl.class, false);
			case "DEWFPROXYDATAVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFProxyDataViewImpl.class, false);
			case "DEWFPROXYRESULTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFProxyResultViewImpl.class, false);
			case "DEWFPROXYSTARTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFProxyStartViewImpl.class, false);
			case "DEWFSTARTVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWFStartViewImpl.class, false);
			case "DEWIZARDVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEWizardViewImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.view.PSAppDEViewImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.app.view.IPSAppDEView iPSAppDEView = (net.ibizsys.model.app.view.IPSAppDEView)iPSModelObject;
		Object type = iPSAppDEView.getViewType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("viewtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}