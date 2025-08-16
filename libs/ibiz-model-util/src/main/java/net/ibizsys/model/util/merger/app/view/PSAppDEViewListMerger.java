package net.ibizsys.model.util.merger.app.view;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSAppDEViewListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.app.view.IPSAppDEView.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.app.view.IPSAppDEView.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.app.view.IPSAppDEView.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.app.view.IPSAppDEView.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("viewType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "DECALENDAREXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDECalendarExplorerViewImpl.class, false);
			case "DECALENDARVIEW":
			case "DECALENDARVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDECalendarViewImpl.class, false);
			case "DECHARTEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEChartExplorerViewImpl.class, false);
			case "DECHARTVIEW":
			case "DECHARTVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEChartViewImpl.class, false);
			case "DECUSTOMVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDECustomViewImpl.class, false);
			case "DEDATAVIEW":
			case "DEDATAVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEDataViewImpl.class, false);
			case "DEDATAVIEWEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEDataViewExplorerViewImpl.class, false);
			case "DEEDITVIEW":
			case "DEEDITVIEW2":
			case "DEEDITVIEW3":
			case "DEEDITVIEW4":
			case "DEOPTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEEditViewImpl.class, false);
			case "DEEDITVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEEditView9Impl.class, false);
			case "DEFORMPICKUPDATAVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEFormPickupDataViewImpl.class, false);
			case "DEGANTTEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEGanttExplorerViewImpl.class, false);
			case "DEGANTTVIEW":
			case "DEGANTTVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEGanttViewImpl.class, false);
			case "DEGRIDEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEGridExplorerViewImpl.class, false);
			case "DEGRIDVIEW":
			case "DEGRIDVIEW2":
			case "DEGRIDVIEW4":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEGridViewImpl.class, false);
			case "DEGRIDVIEW8":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEGridView8Impl.class, false);
			case "DEGRIDVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEGridView9Impl.class, false);
			case "DEHTMLVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEHtmlViewImpl.class, false);
			case "DEINDEXPICKUPDATAVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEIndexPickupDataViewImpl.class, false);
			case "DEINDEXVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEIndexViewImpl.class, false);
			case "DEKANBANVIEW":
			case "DEKANBANVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEKanbanViewImpl.class, false);
			case "DELISTEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEListExplorerViewImpl.class, false);
			case "DELISTVIEW":
			case "DELISTVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEListViewImpl.class, false);
			case "DEMAPEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMapExplorerViewImpl.class, false);
			case "DEMAPVIEW":
			case "DEMAPVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMapViewImpl.class, false);
			case "DEMDCUSTOMVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMultiDataView2Impl.class, false);
			case "DEMEDITVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMEditViewImpl.class, false);
			case "DEMOBCALENDAREXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobCalendarExplorerViewImpl.class, false);
			case "DEMOBCALENDARVIEW":
			case "DEMOBCALENDARVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobCalendarViewImpl.class, false);
			case "DEMOBCHARTEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobChartExplorerViewImpl.class, false);
			case "DEMOBCHARTVIEW":
			case "DEMOBCHARTVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobChartViewImpl.class, false);
			case "DEMOBCUSTOMVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobCustomViewImpl.class, false);
			case "DEMOBDATAVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobDataViewImpl.class, false);
			case "DEMOBDATAVIEWEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobDataViewExplorerViewImpl.class, false);
			case "DEMOBEDITVIEW":
			case "DEMOBEDITVIEW3":
			case "DEMOBEDITVIEW9":
			case "DEMOBOPTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobEditViewImpl.class, false);
			case "DEMOBFORMPICKUPMDVIEW":
			case "DEMOBINDEXPICKUPMDVIEW":
			case "DEMOBPICKUPMDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobPickupMDViewImpl.class, false);
			case "DEMOBGANTTEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobGanttExplorerViewImpl.class, false);
			case "DEMOBGANTTVIEW":
			case "DEMOBGANTTVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobGanttViewImpl.class, false);
			case "DEMOBHTMLVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobHtmlViewImpl.class, false);
			case "DEMOBLISTEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobListExplorerViewImpl.class, false);
			case "DEMOBLISTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobListViewImpl.class, false);
			case "DEMOBMAPEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobMapExplorerViewImpl.class, false);
			case "DEMOBMAPVIEW":
			case "DEMOBMAPVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobMapViewImpl.class, false);
			case "DEMOBMDVIEW":
			case "DEMOBMDVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobMDViewImpl.class, false);
			case "DEMOBMEDITVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobMEditViewImpl.class, false);
			case "DEMOBMPICKUPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobMPickupViewImpl.class, false);
			case "DEMOBPANELVIEW":
			case "DEMOBPANELVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobPanelViewImpl.class, false);
			case "DEMOBPICKUPLISTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobPickupListViewImpl.class, false);
			case "DEMOBPICKUPTREEVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobPickupTreeViewImpl.class, false);
			case "DEMOBPICKUPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobPickupViewImpl.class, false);
			case "DEMOBPORTALVIEW":
			case "DEMOBPORTALVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobDashboardViewImpl.class, false);
			case "DEMOBREDIRECTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobRedirectViewImpl.class, false);
			case "DEMOBREPORTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobReportViewImpl.class, false);
			case "DEMOBTABEXPVIEW":
			case "DEMOBTABEXPVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobTabExplorerViewImpl.class, false);
			case "DEMOBTABSEARCHVIEW":
			case "DEMOBTABSEARCHVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobTabSearchViewImpl.class, false);
			case "DEMOBTREEEXPVIEW":
			case "DEMOBTREEEXPVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobTreeExplorerViewImpl.class, false);
			case "DEMOBTREEVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobTreeViewImpl.class, false);
			case "DEMOBWFACTIONVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFActionViewImpl.class, false);
			case "DEMOBWFDATAREDIRECTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFDataRedirectViewImpl.class, false);
			case "DEMOBWFDYNAACTIONVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFDynaActionViewImpl.class, false);
			case "DEMOBWFDYNAEDITVIEW":
			case "DEMOBWFDYNAEDITVIEW3":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFDynaEditViewImpl.class, false);
			case "DEMOBWFDYNAEXPMDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFDynaExpMDViewImpl.class, false);
			case "DEMOBWFDYNASTARTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFDynaStartViewImpl.class, false);
			case "DEMOBWFEDITVIEW":
			case "DEMOBWFEDITVIEW3":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFEditViewImpl.class, false);
			case "DEMOBWFMDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFMDViewImpl.class, false);
			case "DEMOBWFPROXYRESULTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFProxyResultViewImpl.class, false);
			case "DEMOBWFPROXYSTARTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFProxyStartViewImpl.class, false);
			case "DEMOBWFSTARTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWFStartViewImpl.class, false);
			case "DEMOBWIZARDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMobWizardViewImpl.class, false);
			case "DEMPICKUPVIEW":
			case "DEMPICKUPVIEW2":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEMPickupViewImpl.class, false);
			case "DEPANELVIEW":
			case "DEPANELVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEPanelViewImpl.class, false);
			case "DEPICKUPDATAVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEPickupDataViewImpl.class, false);
			case "DEPICKUPGRIDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEPickupGridViewImpl.class, false);
			case "DEPICKUPTREEVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEPickupTreeViewImpl.class, false);
			case "DEPICKUPVIEW":
			case "DEPICKUPVIEW2":
			case "DEPICKUPVIEW3":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEPickupViewImpl.class, false);
			case "DEPORTALVIEW":
			case "DEPORTALVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEDashboardViewImpl.class, false);
			case "DEREDIRECTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDERedirectViewImpl.class, false);
			case "DEREPORTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEReportViewImpl.class, false);
			case "DESUBAPPREFVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDESubAppRefViewImpl.class, false);
			case "DETABEXPVIEW":
			case "DETABEXPVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDETabExplorerViewImpl.class, false);
			case "DETABSEARCHVIEW":
			case "DETABSEARCHVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDETabSearchViewImpl.class, false);
			case "DETREEEXPVIEW":
			case "DETREEEXPVIEW3":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDETreeExplorerViewImpl.class, false);
			case "DETREEEXPVIEW2":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDETreeExplorerView2Impl.class, false);
			case "DETREEGRIDEXVIEW":
			case "DETREEGRIDEXVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDETreeGridExViewImpl.class, false);
			case "DETREEGRIDVIEW":
			case "DETREEGRIDVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDETreeGridViewImpl.class, false);
			case "DETREEVIEW":
			case "DETREEVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDETreeViewImpl.class, false);
			case "DEWFACTIONVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFActionViewImpl.class, false);
			case "DEWFDATAREDIRECTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFDataRedirectViewImpl.class, false);
			case "DEWFDYNAACTIONVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFDynaActionViewImpl.class, false);
			case "DEWFDYNAEDITVIEW":
			case "DEWFDYNAEDITVIEW3":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFDynaEditViewImpl.class, false);
			case "DEWFDYNAEXPGRIDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFDynaExpGridViewImpl.class, false);
			case "DEWFDYNASTARTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFDynaStartViewImpl.class, false);
			case "DEWFEDITPROXYDATAVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFEditProxyDataViewImpl.class, false);
			case "DEWFEDITVIEW":
			case "DEWFEDITVIEW2":
			case "DEWFEDITVIEW3":
			case "DEWFEDITVIEW9":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFEditViewImpl.class, false);
			case "DEWFEXPVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFExplorerViewImpl.class, false);
			case "DEWFGRIDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFGridViewImpl.class, false);
			case "DEWFPROXYDATAREDIRECTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFProxyDataRedirectViewImpl.class, false);
			case "DEWFPROXYDATAVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFProxyDataViewImpl.class, false);
			case "DEWFPROXYRESULTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFProxyResultViewImpl.class, false);
			case "DEWFPROXYSTARTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFProxyStartViewImpl.class, false);
			case "DEWFSTARTVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWFStartViewImpl.class, false);
			case "DEWIZARDVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEWizardViewImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEViewImpl.class, false);
		}
	}
}