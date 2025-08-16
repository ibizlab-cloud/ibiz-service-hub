package net.ibizsys.model.util.transpiler.control;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSControlListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "APPMENU":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.menu.PSAppMenuImpl.class, false);
			case "CALENDAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.calendar.PSSysCalendarImpl.class, false);
			case "CALENDAREXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSCalendarExpBarImpl.class, false);
			case "CAPTIONBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.captionbar.PSCaptionBarImpl.class, false);
			case "CHART":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.chart.PSDEChartImpl.class, false);
			case "CHARTEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSChartExpBarImpl.class, false);
			case "CONTEXTMENU":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.toolbar.PSDEContextMenuImpl.class, false);
			case "CUSTOM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.custom.PSCustomControlImpl.class, false);
			case "DASHBOARD":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSSysDashboardImpl.class, false);
			case "DATAINFOBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.datainfobar.PSDataInfoBarImpl.class, false);
			case "DATAVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dataview.PSDEDataViewImpl.class, false);
			case "DATAVIEWEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSDataViewExpBarImpl.class, false);
			case "DRBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.drctrl.PSDEDRBarImpl.class, false);
			case "DRTAB":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.drctrl.PSDEDRTabImpl.class, false);
			case "EXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSExpBarImpl.class, false);
			case "FORM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEEditFormImpl.class, false);
			case "GANTT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.tree.PSDEGanttImpl.class, false);
			case "GANTTEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSGanttExpBarImpl.class, false);
			case "GRID":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.grid.PSDEGridImpl.class, false);
			case "GRIDEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSGridExpBarImpl.class, false);
			case "KANBAN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dataview.PSDEKanbanImpl.class, false);
			case "LIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.list.PSDEListImpl.class, false);
			case "LISTEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSListExpBarImpl.class, false);
			case "MAP":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.map.PSSysMapImpl.class, false);
			case "MAPEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSMapExpBarImpl.class, false);
			case "MOBMDCTRL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.list.PSDEMobMDCtrlImpl.class, false);
			case "MULTIEDITVIEWPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.grid.PSDEMultiEditViewPanelImpl.class, false);
			case "PANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelImpl.class, false);
			case "PICKUPVIEWPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.viewpanel.PSDEPickupViewPanelImpl.class, false);
			case "PORTLET":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.dashboard.PSDBPortletPartImpl.class, false);
			case "REPORTPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.reportpanel.PSDEReportPanelImpl.class, false);
			case "SEARCHBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.searchbar.PSSysSearchBarImpl.class, false);
			case "SEARCHFORM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDESearchFormImpl.class, false);
			case "STATEWIZARDPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.wizardpanel.PSDEStateWizardPanelImpl.class, false);
			case "TABEXPPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSTabExpPanelImpl.class, false);
			case "TABVIEWPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl.class, false);
			case "TOOLBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.toolbar.PSDEToolbarImpl.class, false);
			case "TREEEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSTreeExpBarImpl.class, false);
			case "TREEGRID":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.grid.PSDETreeGridImpl.class, false);
			case "TREEGRIDEX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.tree.PSDETreeGridExImpl.class, false);
			case "TREEVIEW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.tree.PSDETreeImpl.class, false);
			case "VIEWLAYOUTPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl.class, false);
			case "VIEWPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.viewpanel.PSDEViewPanelImpl.class, false);
			case "WFEXPBAR":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.expbar.PSWFExpBarImpl.class, false);
			case "WIZARDPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.IPSControl iPSControl = (net.ibizsys.model.control.IPSControl)iPSModelObject;
		Object type = iPSControl.getControlType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("controltype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}