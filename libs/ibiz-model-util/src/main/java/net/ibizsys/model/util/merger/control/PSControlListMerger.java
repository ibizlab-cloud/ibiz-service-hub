package net.ibizsys.model.util.merger.control;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSControlListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.IPSControl.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.IPSControl.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.IPSControl.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.IPSControl.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("controlType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "APPMENU":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.menu.PSAppMenuImpl.class, false);
			case "CALENDAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.calendar.PSSysCalendarImpl.class, false);
			case "CALENDAREXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSCalendarExpBarImpl.class, false);
			case "CAPTIONBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.captionbar.PSCaptionBarImpl.class, false);
			case "CHART":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.chart.PSDEChartImpl.class, false);
			case "CHARTEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSChartExpBarImpl.class, false);
			case "CONTEXTMENU":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.toolbar.PSDEContextMenuImpl.class, false);
			case "CUSTOM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.custom.PSCustomControlImpl.class, false);
			case "DASHBOARD":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSSysDashboardImpl.class, false);
			case "DATAINFOBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.datainfobar.PSDataInfoBarImpl.class, false);
			case "DATAVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dataview.PSDEDataViewImpl.class, false);
			case "DATAVIEWEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSDataViewExpBarImpl.class, false);
			case "DRBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.drctrl.PSDEDRBarImpl.class, false);
			case "DRTAB":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.drctrl.PSDEDRTabImpl.class, false);
			case "EXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSExpBarImpl.class, false);
			case "FORM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEEditFormImpl.class, false);
			case "GANTT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.tree.PSDEGanttImpl.class, false);
			case "GANTTEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSGanttExpBarImpl.class, false);
			case "GRID":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.grid.PSDEGridImpl.class, false);
			case "GRIDEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSGridExpBarImpl.class, false);
			case "KANBAN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dataview.PSDEKanbanImpl.class, false);
			case "LIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.list.PSDEListImpl.class, false);
			case "LISTEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSListExpBarImpl.class, false);
			case "MAP":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.map.PSSysMapImpl.class, false);
			case "MAPEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSMapExpBarImpl.class, false);
			case "MOBMDCTRL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.list.PSDEMobMDCtrlImpl.class, false);
			case "MULTIEDITVIEWPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.grid.PSDEMultiEditViewPanelImpl.class, false);
			case "PANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelImpl.class, false);
			case "PICKUPVIEWPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.viewpanel.PSDEPickupViewPanelImpl.class, false);
			case "PORTLET":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBPortletPartImpl.class, false);
			case "REPORTPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.reportpanel.PSDEReportPanelImpl.class, false);
			case "SEARCHBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.searchbar.PSSysSearchBarImpl.class, false);
			case "SEARCHFORM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDESearchFormImpl.class, false);
			case "STATEWIZARDPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.wizardpanel.PSDEStateWizardPanelImpl.class, false);
			case "TABEXPPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSTabExpPanelImpl.class, false);
			case "TABVIEWPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl.class, false);
			case "TOOLBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.toolbar.PSDEToolbarImpl.class, false);
			case "TREEEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSTreeExpBarImpl.class, false);
			case "TREEGRID":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.grid.PSDETreeGridImpl.class, false);
			case "TREEGRIDEX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.tree.PSDETreeGridExImpl.class, false);
			case "TREEVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.tree.PSDETreeImpl.class, false);
			case "VIEWLAYOUTPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl.class, false);
			case "VIEWPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.viewpanel.PSDEViewPanelImpl.class, false);
			case "WFEXPBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.expbar.PSWFExpBarImpl.class, false);
			case "WIZARDPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
}