package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSViewType;
import net.ibizsys.psmodel.core.filter.PSViewTypeFilter;
import net.ibizsys.psmodel.core.domain.PSVTCtrl;
import net.ibizsys.psmodel.core.service.IPSViewTypeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSViewTypeRTService extends PSModelRTServiceBase<PSViewType, PSViewTypeFilter> implements IPSViewTypeService{
    private static final Log log = LogFactory.getLog(PSViewTypeRTService.class);

    private static List<PSViewType> PSViewTypes = new ArrayList<PSViewType>(); 
    
    static {
    	Map<String, PSViewType> map = new HashMap<String, PSViewType>();
    	
    	map.put("APPINDEXVIEW", new PSViewType().id("APPINDEXVIEW").validflag(1).name("应用首页视图").codename("AppIndexView").deviewmode(0));
    	map.put("APPPANELVIEW", new PSViewType().id("APPPANELVIEW").validflag(1).name("应用面板视图").codename("AppPanelView").deviewmode(0));
    	map.put("APPPORTALVIEW", new PSViewType().id("APPPORTALVIEW").validflag(1).name("应用看板视图").codename("AppPortalView").deviewmode(0));
    	map.put("DEGRIDVIEW", new PSViewType().id("DEGRIDVIEW").validflag(1).name("实体表格视图").codename("GridView").deviewmode(1));
    	map.put("DETREEVIEW", new PSViewType().id("DETREEVIEW").validflag(1).name("实体树视图").codename("TreeView").deviewmode(1));
    	map.put("DEGRIDVIEW2", new PSViewType().id("DEGRIDVIEW2").validflag(1).name("实体表格视图（左右关系）").codename("GridView2").deviewmode(1));
    	map.put("DEGRIDVIEW4", new PSViewType().id("DEGRIDVIEW4").validflag(1).name("实体表格视图（上下关系）").codename("GridView4").deviewmode(1));
    	map.put("DEGRIDVIEW8", new PSViewType().id("DEGRIDVIEW8").validflag(1).name("实体关系数据表格视图（嵌入）").codename("GridView8").deviewmode(1));
    	map.put("DEGRIDVIEW9", new PSViewType().id("DEGRIDVIEW9").validflag(1).name("实体表格视图（部件视图）").codename("GridView9").deviewmode(1));
    	map.put("DETREEVIEW9", new PSViewType().id("DETREEVIEW9").validflag(1).name("实体树视图（部件视图）").codename("TreeView9").deviewmode(1));
    	map.put("DEWFEXPVIEW", new PSViewType().id("DEWFEXPVIEW").validflag(1).name("实体工作流导航视图").codename("WFExpView").deviewmode(1));
    	map.put("DEMAPEXPVIEW", new PSViewType().id("DEMAPEXPVIEW").validflag(1).name("实体地图导航视图").codename("MapExpView").deviewmode(1));
    	map.put("DEMEDITVIEW9", new PSViewType().id("DEMEDITVIEW9").validflag(1).name("实体多表单编辑视图（部件视图）").codename("MEditView9").deviewmode(1));
    	map.put("DEPICKUPVIEW", new PSViewType().id("DEPICKUPVIEW").validflag(1).name("实体数据选择视图").codename("PickupView").deviewmode(1));
    	map.put("DETABEXPVIEW", new PSViewType().id("DETABEXPVIEW").validflag(1).name("实体分页导航视图").codename("TabExpView").deviewmode(1));
    	map.put("DEWFGRIDVIEW", new PSViewType().id("DEWFGRIDVIEW").validflag(1).name("实体工作流表格视图").codename("WFGridView").deviewmode(1));
    	map.put("DEGRIDEXPVIEW", new PSViewType().id("DEGRIDEXPVIEW").validflag(1).name("实体表格导航视图").codename("GridExpView").deviewmode(1));
    	map.put("DELISTEXPVIEW", new PSViewType().id("DELISTEXPVIEW").validflag(1).name("实体列表导航视图").codename("ListExpView").deviewmode(1));
    	map.put("DEMOBWFMDVIEW", new PSViewType().id("DEMOBWFMDVIEW").validflag(1).name("实体移动端工作流多数据视图").codename("MobWFMDView").deviewmode(1));
    	map.put("DEMPICKUPVIEW", new PSViewType().id("DEMPICKUPVIEW").validflag(1).name("实体数据多项选择视图").codename("MPickupView").deviewmode(1));
    	map.put("DEPICKUPVIEW2", new PSViewType().id("DEPICKUPVIEW2").validflag(1).name("实体数据选择视图（左右关系）").codename("PickupView2").deviewmode(1));
    	map.put("DETABEXPVIEW9", new PSViewType().id("DETABEXPVIEW9").validflag(1).name("实体分页导航视图（部件视图）").codename("TabExpView9").deviewmode(1));
    	map.put("DETREEEXPVIEW", new PSViewType().id("DETREEEXPVIEW").validflag(1).name("实体树导航视图").codename("TreeExpView").deviewmode(1));
    	map.put("DECHARTEXPVIEW", new PSViewType().id("DECHARTEXPVIEW").validflag(1).name("实体图表导航视图").codename("ChartExpView").deviewmode(1));
    	map.put("DEGANTTEXPVIEW", new PSViewType().id("DEGANTTEXPVIEW").validflag(1).name("实体甘特图导航视图").codename("GanttExpView").deviewmode(1));
    	map.put("DEMPICKUPVIEW2", new PSViewType().id("DEMPICKUPVIEW2").validflag(1).name("实体多项数据选择视图（左右关系）").codename("MPickupView2").deviewmode(1));
    	map.put("DETREEEXPVIEW2", new PSViewType().id("DETREEEXPVIEW2").validflag(1).name("实体树导航视图（IFrame）").codename("TreeExpView2").deviewmode(1));
    	map.put("DETREEEXPVIEW3", new PSViewType().id("DETREEEXPVIEW3").validflag(1).name("实体树导航视图（菜单模式）").codename("TreeExpView3").deviewmode(1));
    	map.put("DETREEGRIDVIEW", new PSViewType().id("DETREEGRIDVIEW").validflag(1).name("实体树表格视图").codename("TreeGridView").deviewmode(1));
    	map.put("DYNADEGRIDVIEW", new PSViewType().id("DYNADEGRIDVIEW").validflag(1).name("动态实体表格视图").codename("DynaGridView").deviewmode(0));
    	map.put("DEMOBMAPEXPVIEW", new PSViewType().id("DEMOBMAPEXPVIEW").validflag(1).name("实体移动端地图导航视图").codename("MobMapExpView").deviewmode(1));
    	map.put("DEMOBMEDITVIEW9", new PSViewType().id("DEMOBMEDITVIEW9").validflag(1).name("实体移动端多表单编辑视图（部件视图）").codename("MobMEditView9").deviewmode(1));
    	map.put("DEMOBPICKUPVIEW", new PSViewType().id("DEMOBPICKUPVIEW").validflag(1).name("实体移动端数据选择视图").codename("MobPickupView").deviewmode(1));
    	map.put("DETREEGRIDVIEW9", new PSViewType().id("DETREEGRIDVIEW9").validflag(1).name("实体树表格视图（部件视图）").codename("TreeGridView9").deviewmode(1));
    	map.put("DYNADEWFEXPVIEW", new PSViewType().id("DYNADEWFEXPVIEW").validflag(1).name("动态实体工作流导航视图").codename("DynaWFExpView").deviewmode(0));
    	map.put("DEMOBLISTEXPVIEW", new PSViewType().id("DEMOBLISTEXPVIEW").validflag(1).name("实体移动端列表导航视图").codename("MobListExpView").deviewmode(1));
    	map.put("DEMOBMPICKUPVIEW", new PSViewType().id("DEMOBMPICKUPVIEW").validflag(1).name("实体移动端多数据选择视图").codename("MobMPickupView").deviewmode(1));
    	map.put("DEMOBTREEEXPVIEW", new PSViewType().id("DEMOBTREEEXPVIEW").validflag(1).name("实体移动端树导航视图").codename("MobTreeExpView").deviewmode(1));
    	map.put("DEPICKUPGRIDVIEW", new PSViewType().id("DEPICKUPGRIDVIEW").validflag(1).name("实体选择表格视图（部件视图）").codename("PickupGridView").deviewmode(1));
    	map.put("DEPICKUPTREEVIEW", new PSViewType().id("DEPICKUPTREEVIEW").validflag(1).name("实体选择树视图（部件视图）").codename("PickupTreeView").deviewmode(1));
    	map.put("DETREEGRIDEXVIEW", new PSViewType().id("DETREEGRIDEXVIEW").validflag(1).name("实体树表格视图（增强）").codename("TreeGridExView").deviewmode(1));
    	map.put("DYNADEPICKUPVIEW", new PSViewType().id("DYNADEPICKUPVIEW").validflag(1).name("动态实体数据选择视图").codename("DynaPickupView").deviewmode(0));
    	map.put("DYNADEWFGRIDVIEW", new PSViewType().id("DYNADEWFGRIDVIEW").validflag(1).name("动态实体工作流表格视图").codename("DynaWFGridView").deviewmode(0));
    	map.put("DECALENDAREXPVIEW", new PSViewType().id("DECALENDAREXPVIEW").validflag(1).name("实体日历导航视图").codename("CalendarExpView").deviewmode(1));
    	map.put("DEDATAVIEWEXPVIEW", new PSViewType().id("DEDATAVIEWEXPVIEW").validflag(1).name("实体卡片视图导航视图").codename("DataViewExpView").deviewmode(1));
    	map.put("DEMOBCHARTEXPVIEW", new PSViewType().id("DEMOBCHARTEXPVIEW").validflag(1).name("实体移动端图表导航视图").codename("MobChartExpView").deviewmode(1));
    	map.put("DEMOBGANTTEXPVIEW", new PSViewType().id("DEMOBGANTTEXPVIEW").validflag(1).name("实体移动端甘特图导航视图").codename("MobGanttExpView").deviewmode(1));
    	map.put("DEMOBTREEEXPVIEW9", new PSViewType().id("DEMOBTREEEXPVIEW9").validflag(1).name("实体移动端树导航视图（部件视图）").codename("MobTreeExpView9").deviewmode(1));
    	map.put("DETREEGRIDEXVIEW9", new PSViewType().id("DETREEGRIDEXVIEW9").validflag(1).name("实体树表格视图（增强）（部件视图）").codename("TreeGridExView9").deviewmode(1));
    	map.put("DYNADEMPICKUPVIEW", new PSViewType().id("DYNADEMPICKUPVIEW").validflag(1).name("动态实体数据多项选择视图").codename("DynaMPickupView").deviewmode(0));
    	map.put("DYNADEPICKUPVIEW2", new PSViewType().id("DYNADEPICKUPVIEW2").validflag(1).name("动态实体数据选择视图（左右关系）").codename("DynaPickupView2").deviewmode(0));
    	map.put("DYNADEMPICKUPVIEW2", new PSViewType().id("DYNADEMPICKUPVIEW2").validflag(1).name("动态实体多项数据选择视图（左右关系）").codename("DynaMPickupView2").deviewmode(0));
    	map.put("DEWFDYNAEXPGRIDVIEW", new PSViewType().id("DEWFDYNAEXPGRIDVIEW").validflag(1).name("实体工作流动态导航表格视图").codename("WFDynaExpGridView").deviewmode(1));
    	map.put("DEMOBCALENDAREXPVIEW", new PSViewType().id("DEMOBCALENDAREXPVIEW").validflag(1).name("实体移动端日历导航视图").codename("MobCalendarExpView").deviewmode(1));
    	map.put("DEMOBDATAVIEWEXPVIEW", new PSViewType().id("DEMOBDATAVIEWEXPVIEW").validflag(1).name("实体移动端卡片视图导航视图").codename("MobDataViewExpView").deviewmode(1));
    	map.put("DEMOBWFDYNAEXPMDVIEW", new PSViewType().id("DEMOBWFDYNAEXPMDVIEW").validflag(1).name("实体移动端工作流动态导航多数据视图").codename("MobWFDynaExpMDView").deviewmode(1));
    	map.put("DYNADEPICKUPGRIDVIEW", new PSViewType().id("DYNADEPICKUPGRIDVIEW").validflag(1).name("动态实体选择表格视图（部件视图）").codename("DynaPickupGridView").deviewmode(0));
    	map.put("DETABSEARCHVIEW", new PSViewType().id("DETABSEARCHVIEW").validflag(1).name("实体分页搜索视图").codename("TabSearchView").deviewmode(1));
    	map.put("DETABSEARCHVIEW9", new PSViewType().id("DETABSEARCHVIEW9").validflag(1).name("实体分页搜索视图（部件视图）").codename("TabSearchView9").deviewmode(1));
    	map.put("DEMOBTABSEARCHVIEW", new PSViewType().id("DEMOBTABSEARCHVIEW").validflag(1).name("实体移动端分页搜索视图").codename("MobTabSearchView").deviewmode(1));
    	map.put("DEMOBTABSEARCHVIEW9", new PSViewType().id("DEMOBTABSEARCHVIEW9").validflag(1).name("实体移动端分页搜索视图（部件视图）").codename("MobTabSearchView9").deviewmode(1));
    	map.put("DEMOBTABEXPVIEW", new PSViewType().id("DEMOBTABEXPVIEW").validflag(1).name("实体移动端分页导航视图").codename("MobTabExpView").deviewmode(1));
    	map.put("DEMOBTABEXPVIEW9", new PSViewType().id("DEMOBTABEXPVIEW9").validflag(1).name("实体移动端分页导航视图（部件视图）").codename("MobTabExpView9").deviewmode(1));
    	map.put("DEMOBPICKUPMDVIEW", new PSViewType().id("DEMOBPICKUPMDVIEW").validflag(1).name("实体移动端选择多数据视图（部件视图）").codename("MobPickupMDView").deviewmode(1));
    	map.put("DEMOBPICKUPLISTVIEW", new PSViewType().id("DEMOBPICKUPLISTVIEW").validflag(1).name("实体移动端选择列表视图（部件视图）").codename("MobPickupListView").deviewmode(1));
    	map.put("DEMOBPICKUPTREEVIEW", new PSViewType().id("DEMOBPICKUPTREEVIEW").validflag(1).name("实体移动端选择树视图（部件视图）").codename("MobPickupTreeView").deviewmode(1));
    	map.put("DEMOBFORMPICKUPMDVIEW", new PSViewType().id("DEMOBFORMPICKUPMDVIEW").validflag(1).name("实体移动端表单类型选择多数据视图（部件视图）").codename("MobFormPickupMDView").deviewmode(1));
    	map.put("DEMOBINDEXPICKUPMDVIEW", new PSViewType().id("DEMOBINDEXPICKUPMDVIEW").validflag(1).name("实体移动端索引类型选择多数据视图（部件视图）").codename("MobIndexPickupMDView").deviewmode(1));
    	map.put("DEOPTVIEW", new PSViewType().id("DEOPTVIEW").validflag(1).name("实体选项操作视图").codename("OptionView").deviewmode(1));
    	map.put("DEEDITVIEW", new PSViewType().id("DEEDITVIEW").validflag(1).name("实体编辑视图").codename("EditView").deviewmode(1));
    	map.put("DEHTMLVIEW", new PSViewType().id("DEHTMLVIEW").validflag(1).name("实体HTML视图").codename("HtmlView").deviewmode(1));
    	map.put("DECHARTVIEW", new PSViewType().id("DECHARTVIEW").validflag(1).name("实体图表视图").codename("ChartView").deviewmode(1));
    	map.put("DEINDEXVIEW", new PSViewType().id("DEINDEXVIEW").validflag(1).name("实体首页视图").codename("IndexView").deviewmode(1));
    	map.put("DEMOBMDVIEW", new PSViewType().id("DEMOBMDVIEW").validflag(1).name("实体移动端多数据视图").codename("MobMDView").deviewmode(1));
    	map.put("APPERRORVIEW", new PSViewType().id("APPERRORVIEW").validflag(1).name("应用错误显示视图").codename("AppErrorView").deviewmode(0));
    	map.put("APPLOGINVIEW", new PSViewType().id("APPLOGINVIEW").validflag(1).name("应用登录视图").codename("AppLoginView").deviewmode(0));
    	map.put("APPSTARTVIEW", new PSViewType().id("APPSTARTVIEW").validflag(1).name("应用启动视图").codename("AppStartView").deviewmode(0));
    	map.put("DECHARTVIEW9", new PSViewType().id("DECHARTVIEW9").validflag(1).name("实体图表视图（部件视图）").codename("ChartView9").deviewmode(1));
    	map.put("DECUSTOMVIEW", new PSViewType().id("DECUSTOMVIEW").validflag(1).name("实体自定义视图").codename("CustomView").deviewmode(1));
    	map.put("DEMOBMDVIEW9", new PSViewType().id("DEMOBMDVIEW9").validflag(1).name("实体移动端多数据视图（部件视图）").codename("MobMDView9").deviewmode(1));
    	map.put("DEMOBOPTVIEW", new PSViewType().id("DEMOBOPTVIEW").validflag(1).name("实体移动端选项操作视图").codename("MobOptionView").deviewmode(1));
    	map.put("DEPORTALVIEW", new PSViewType().id("DEPORTALVIEW").validflag(1).name("实体数据看板视图").codename("DashboardView").deviewmode(1));
    	map.put("DEREPORTVIEW", new PSViewType().id("DEREPORTVIEW").validflag(1).name("实体报表视图").codename("ReportView").deviewmode(1));
    	map.put("APPLOGOUTVIEW", new PSViewType().id("APPLOGOUTVIEW").validflag(1).name("应用注销视图").codename("AppLogoutView").deviewmode(0));
    	map.put("DEMOBDATAVIEW", new PSViewType().id("DEMOBDATAVIEW").validflag(1).name("实体移动端卡片视图").codename("MobDataView").deviewmode(1));
    	map.put("DEMOBEDITVIEW", new PSViewType().id("DEMOBEDITVIEW").validflag(1).name("实体移动端编辑视图").codename("MobEditView").deviewmode(1));
    	map.put("DEMOBHTMLVIEW", new PSViewType().id("DEMOBHTMLVIEW").validflag(1).name("实体移动端HTML视图").codename("MobHtmlView").deviewmode(1));
    	map.put("DEMOBLISTVIEW", new PSViewType().id("DEMOBLISTVIEW").validflag(1).name("实体移动端列表视图").codename("MobListView").deviewmode(1));
    	map.put("DEMOBTREEVIEW", new PSViewType().id("DEMOBTREEVIEW").validflag(1).name("实体移动端树视图").codename("MobTreeView").deviewmode(1));
    	map.put("DEPICKUPVIEW3", new PSViewType().id("DEPICKUPVIEW3").validflag(1).name("实体数据选择视图（分页关系）").codename("PickupView3").deviewmode(1));
    	map.put("DEPORTALVIEW9", new PSViewType().id("DEPORTALVIEW9").validflag(1).name("实体数据看板视图（部件视图）").codename("DashboardView9").deviewmode(1));
    	map.put("DEWFSTARTVIEW", new PSViewType().id("DEWFSTARTVIEW").validflag(1).name("实体工作流启动视图").codename("WFStartView").deviewmode(1));
    	map.put("APPWELCOMEVIEW", new PSViewType().id("APPWELCOMEVIEW").validflag(1).name("应用欢迎视图").codename("AppWelcomeView").deviewmode(0));
    	map.put("DEMDCUSTOMVIEW", new PSViewType().id("DEMDCUSTOMVIEW").validflag(1).name("实体多数据自定义视图").codename("MDCustomView").deviewmode(1));
    	map.put("DEMOBCHARTVIEW", new PSViewType().id("DEMOBCHARTVIEW").validflag(1).name("实体移动端图表视图").codename("MobChartView").deviewmode(1));
    	map.put("DEMOBEDITVIEW3", new PSViewType().id("DEMOBEDITVIEW3").validflag(1).name("实体移动端编辑视图（分页关系）").codename("MobEditView3").deviewmode(1));
    	map.put("DEMOBEDITVIEW9", new PSViewType().id("DEMOBEDITVIEW9").validflag(1).name("实体移动端编辑视图（部件视图）").codename("MobEditView9").deviewmode(1));
    	map.put("DEREDIRECTVIEW", new PSViewType().id("DEREDIRECTVIEW").validflag(1).name("实体数据重定向视图").codename("RedirectView").deviewmode(1));
    	map.put("DEWFACTIONVIEW", new PSViewType().id("DEWFACTIONVIEW").validflag(1).name("实体工作流操作视图").codename("WFActionView").deviewmode(1));
    	map.put("DYNADEEDITVIEW", new PSViewType().id("DYNADEEDITVIEW").validflag(1).name("动态实体编辑视图").codename("DynaEditView").deviewmode(0));
    	map.put("APPREDIRECTVIEW", new PSViewType().id("APPREDIRECTVIEW").validflag(1).name("应用全局数据重定向视图").codename("AppRedirectView").deviewmode(0));
    	map.put("DEMOBCHARTVIEW9", new PSViewType().id("DEMOBCHARTVIEW9").validflag(1).name("实体移动端图表视图（部件视图）").codename("MobChartView9").deviewmode(1));
    	map.put("DEMOBCUSTOMVIEW", new PSViewType().id("DEMOBCUSTOMVIEW").validflag(1).name("实体移动端自定义视图").codename("MobCustomView").deviewmode(1));
    	map.put("DEMOBPORTALVIEW", new PSViewType().id("DEMOBPORTALVIEW").validflag(1).name("实体移动端数据看板视图").codename("MobDashboardView").deviewmode(1));
    	map.put("DEMOBREPORTVIEW", new PSViewType().id("DEMOBREPORTVIEW").validflag(1).name("实体移动端报表视图").codename("MobReportView").deviewmode(1));
    	map.put("DEMOBWFEDITVIEW", new PSViewType().id("DEMOBWFEDITVIEW").validflag(1).name("实体移动端工作流编辑视图").codename("MobWFEditView").deviewmode(1));
    	map.put("DYNADEEDITVIEW2", new PSViewType().id("DYNADEEDITVIEW2").validflag(1).name("动态实体编辑视图（左右关系）").codename("DynaEditView2").deviewmode(0));
    	map.put("APPPICUPLOADVIEW", new PSViewType().id("APPPICUPLOADVIEW").validflag(1).name("应用图片上传视图").codename("AppPicUploadView").deviewmode(0));
    	map.put("DEMOBPORTALVIEW9", new PSViewType().id("DEMOBPORTALVIEW9").validflag(1).name("实体移动端数据看板视图（部件视图）").codename("MobDashboardView9").deviewmode(1));
    	map.put("DEMOBWFEDITVIEW3", new PSViewType().id("DEMOBWFEDITVIEW3").validflag(1).name("实体移动端工作流编辑视图（分页关系）").codename("MobWFEditView3").deviewmode(1));
    	map.put("DEMOBWFSTARTVIEW", new PSViewType().id("DEMOBWFSTARTVIEW").validflag(1).name("实体移动端工作流启动视图").codename("MobWFStartView").deviewmode(1));
    	map.put("DYNADEWFEDITVIEW", new PSViewType().id("DYNADEWFEDITVIEW").validflag(1).name("动态实体工作流编辑视图").codename("DynaWFEditView").deviewmode(0));
    	map.put("APPDATAUPLOADVIEW", new PSViewType().id("APPDATAUPLOADVIEW").validflag(1).name("应用数据导入视图").codename("AppDataUploadView").deviewmode(0));
    	map.put("APPFILEUPLOADVIEW", new PSViewType().id("APPFILEUPLOADVIEW").validflag(1).name("应用文件上传视图").codename("AppFileUploadView").deviewmode(0));
    	map.put("APPFUNCPICKUPVIEW", new PSViewType().id("APPFUNCPICKUPVIEW").validflag(1).name("应用功能选择视图").codename("AppFuncPickupView").deviewmode(0));
    	map.put("APPWFREDIRECTVIEW", new PSViewType().id("APPWFREDIRECTVIEW").validflag(1).name("应用全局流程工作重定向视图").codename("AppWFRedirectView").deviewmode(0));
    	map.put("APPWFSENDBACKVIEW", new PSViewType().id("APPWFSENDBACKVIEW").validflag(1).name("应用流程回退操作视图").codename("AppWFSendBackView").deviewmode(0));
    	map.put("APPWFSTEPDATAVIEW", new PSViewType().id("APPWFSTEPDATAVIEW").validflag(1).name("应用流程处理记录视图").codename("AppWFStepDataView").deviewmode(0));
    	map.put("DEMOBREDIRECTVIEW", new PSViewType().id("DEMOBREDIRECTVIEW").validflag(1).name("实体移动端数据重定向视图").codename("MobRedirectView").deviewmode(1));
    	map.put("DEMOBWFACTIONVIEW", new PSViewType().id("DEMOBWFACTIONVIEW").validflag(1).name("实体移动端工作流操作视图").codename("MobWFActionView").deviewmode(1));
    	map.put("DEWFDYNASTARTVIEW", new PSViewType().id("DEWFDYNASTARTVIEW").validflag(1).name("实体工作流动态启动视图").codename("WFDynaStartView").deviewmode(1));
    	map.put("DEWFPROXYDATAVIEW", new PSViewType().id("DEWFPROXYDATAVIEW").validflag(1).name("实体工作流代理数据视图").codename("WFProxyDataView").deviewmode(1));
    	map.put("DYNADEWFEDITVIEW2", new PSViewType().id("DYNADEWFEDITVIEW2").validflag(1).name("动态实体工作流编辑视图（左右关系）").codename("DynaWFEditView2").deviewmode(0));
    	map.put("DYNADEWFEDITVIEW3", new PSViewType().id("DYNADEWFEDITVIEW3").validflag(1).name("动态实体工作流视图（分页关系）").codename("DynaWFEditView3").deviewmode(0));
    	map.put("DYNADEWFSTARTVIEW", new PSViewType().id("DYNADEWFSTARTVIEW").validflag(1).name("动态实体工作流启动视图").codename("DynaWFStartView").deviewmode(0));
    	map.put("APPWFSTEPACTORVIEW", new PSViewType().id("APPWFSTEPACTORVIEW").validflag(1).name("应用流程当前处理人视图").codename("AppWFStepActorView").deviewmode(0));
    	map.put("APPWFSTEPTRACEVIEW", new PSViewType().id("APPWFSTEPTRACEVIEW").validflag(1).name("应用流程跟踪视图").codename("AppWFStepTraceView").deviewmode(0));
    	map.put("DEWFDYNAACTIONVIEW", new PSViewType().id("DEWFDYNAACTIONVIEW").validflag(1).name("实体工作流动态操作视图").codename("WFDynaActionView").deviewmode(1));
    	map.put("DEWFPROXYSTARTVIEW", new PSViewType().id("DEWFPROXYSTARTVIEW").validflag(1).name("实体工作流代理应用启动视图").codename("WFProxyStartView").deviewmode(1));
    	map.put("DYNADEREDIRECTVIEW", new PSViewType().id("DYNADEREDIRECTVIEW").validflag(1).name("动态实体数据重定向视图").codename("DynaRedirectView").deviewmode(0));
    	map.put("DYNADEWFACTIONVIEW", new PSViewType().id("DYNADEWFACTIONVIEW").validflag(1).name("动态实体工作流操作视图").codename("DynaWFActionView").deviewmode(0));
    	map.put("APPWFSUPPLYINFOVIEW", new PSViewType().id("APPWFSUPPLYINFOVIEW").validflag(1).name("应用流程补充信息操作视图").codename("AppWFSupplyInfoView").deviewmode(0));
    	map.put("APPWFTAKEADVICEVIEW", new PSViewType().id("APPWFTAKEADVICEVIEW").validflag(1).name("应用流程征求意见操作视图").codename("AppWFTakeAdviceView").deviewmode(0));
    	map.put("DEMOBWFDYNAEDITVIEW", new PSViewType().id("DEMOBWFDYNAEDITVIEW").validflag(1).name("实体移动端工作流动态编辑视图").codename("MobWFDynaEditView").deviewmode(1));
    	map.put("DEWFPROXYRESULTVIEW", new PSViewType().id("DEWFPROXYRESULTVIEW").validflag(1).name("实体工作流代理应用结果视图").codename("WFProxyResultView").deviewmode(1));
    	map.put("DEMOBWFDYNAEDITVIEW3", new PSViewType().id("DEMOBWFDYNAEDITVIEW3").validflag(1).name("实体移动端工作流动态编辑视图（分页关系）").codename("MobWFDynaEditView3").deviewmode(1));
    	map.put("DEMOBWFDYNASTARTVIEW", new PSViewType().id("DEMOBWFDYNASTARTVIEW").validflag(1).name("实体移动端工作流动态启动视图").codename("MobWFDynaStartView").deviewmode(1));
    	map.put("DEWFDATAREDIRECTVIEW", new PSViewType().id("DEWFDATAREDIRECTVIEW").validflag(1).name("实体全局流程数据重定向视图").codename("WFDataRedirectView").deviewmode(1));
    	map.put("APPWFADDSTEPAFTERVIEW", new PSViewType().id("APPWFADDSTEPAFTERVIEW").validflag(1).name("应用流程后加签操作视图").codename("AppWFAddStepAfterView").deviewmode(0));
    	map.put("DEMOBWFDYNAACTIONVIEW", new PSViewType().id("DEMOBWFDYNAACTIONVIEW").validflag(1).name("实体移动端工作流动态操作视图").codename("MobWFDynaActionView").deviewmode(1));
    	map.put("DEMOBWFPROXYSTARTVIEW", new PSViewType().id("DEMOBWFPROXYSTARTVIEW").validflag(1).name("实体移动端工作流代理应用启动视图").codename("MobWFProxyStartView").deviewmode(1));
    	map.put("DEWFEDITPROXYDATAVIEW", new PSViewType().id("DEWFEDITPROXYDATAVIEW").validflag(1).name("实体工作流编辑代理数据视图").codename("WFEditProxyDataView").deviewmode(1));
    	map.put("DYNADEWFPROXYDATAVIEW", new PSViewType().id("DYNADEWFPROXYDATAVIEW").validflag(1).name("动态实体流程代理数据视图").codename("DynaWFProxyDataView").deviewmode(0));
    	map.put("APPWFADDSTEPBEFOREVIEW", new PSViewType().id("APPWFADDSTEPBEFOREVIEW").validflag(1).name("应用流程前加签操作视图").codename("AppWFAddStepBeforeView").deviewmode(0));
    	map.put("DEMOBWFPROXYRESULTVIEW", new PSViewType().id("DEMOBWFPROXYRESULTVIEW").validflag(1).name("实体移动端工作流代理应用结果视图").codename("MobWFProxyResultView").deviewmode(1));
    	map.put("DEMOBWFDATAREDIRECTVIEW", new PSViewType().id("DEMOBWFDATAREDIRECTVIEW").validflag(1).name("移动端实体全局流程数据重定向视图").codename("MobWFDataRedirectView").deviewmode(1));
    	map.put("DYNADEWFDATAREDIRECTVIEW", new PSViewType().id("DYNADEWFDATAREDIRECTVIEW").validflag(1).name("动态实体流程数据重定向视图").codename("DynaWFDataRedirectView").deviewmode(0));
    	map.put("DEEDITVIEW2", new PSViewType().id("DEEDITVIEW2").validflag(1).name("实体编辑视图（左右关系）").codename("EditView2").deviewmode(1));
    	map.put("DEEDITVIEW3", new PSViewType().id("DEEDITVIEW3").validflag(1).name("实体编辑视图（分页关系）").codename("EditView3").deviewmode(1));
    	map.put("DEEDITVIEW4", new PSViewType().id("DEEDITVIEW4").validflag(1).name("实体编辑视图（上下关系）").codename("EditView4").deviewmode(1));
    	map.put("DEEDITVIEW9", new PSViewType().id("DEEDITVIEW9").validflag(1).name("实体编辑视图（部件视图）").codename("EditView9").deviewmode(1));
    	map.put("DEWFEDITVIEW", new PSViewType().id("DEWFEDITVIEW").validflag(1).name("实体工作流编辑视图").codename("WFEditView").deviewmode(1));
    	map.put("DEWFDYNAEDITVIEW", new PSViewType().id("DEWFDYNAEDITVIEW").validflag(1).name("实体工作流动态编辑视图").codename("WFDynaEditView").deviewmode(1));
    	map.put("DEWFEDITVIEW2", new PSViewType().id("DEWFEDITVIEW2").validflag(1).name("实体工作流编辑视图（左右关系）").codename("WFEditView2").deviewmode(1));
    	map.put("DEWFEDITVIEW3", new PSViewType().id("DEWFEDITVIEW3").validflag(1).name("实体工作流视图（分页关系）").codename("WFEditView3").deviewmode(1));
    	map.put("DEWFDYNAEDITVIEW3", new PSViewType().id("DEWFDYNAEDITVIEW3").validflag(1).name("实体工作流动态视图（分页关系）").codename("WFDynaEditView3").deviewmode(1));
    	map.put("DEWFEDITVIEW9", new PSViewType().id("DEWFEDITVIEW9").validflag(1).name("实体工作流视图（嵌入视图）").codename("WFEditView9").deviewmode(1));
    	map.put("DESUBAPPREFVIEW", new PSViewType().id("DESUBAPPREFVIEW").validflag(1).name("实体子应用引用视图").codename("DESubAppRefView").deviewmode(1));
    	map.put("DEDATAVIEW", new PSViewType().id("DEDATAVIEW").validflag(1).name("实体数据视图").codename("DataView").deviewmode(1));
    	map.put("DELISTVIEW", new PSViewType().id("DELISTVIEW").validflag(1).name("实体列表视图").codename("ListView").deviewmode(1));
    	map.put("DEDATAVIEW9", new PSViewType().id("DEDATAVIEW9").validflag(1).name("实体数据视图（部件视图）").codename("DataView9").deviewmode(1));
    	map.put("DELISTVIEW9", new PSViewType().id("DELISTVIEW9").validflag(1).name("实体列表视图（部件视图）").codename("ListView9").deviewmode(1));
    	map.put("DEKANBANVIEW", new PSViewType().id("DEKANBANVIEW").validflag(1).name("实体看板视图").codename("KanbanView").deviewmode(1));
    	map.put("DEKANBANVIEW9", new PSViewType().id("DEKANBANVIEW9").validflag(1).name("实体看板视图（部件视图）").codename("KanbanView9").deviewmode(1));
    	map.put("DEPICKUPDATAVIEW", new PSViewType().id("DEPICKUPDATAVIEW").validflag(1).name("实体选择数据视图（部件视图）").codename("PickupDataView").deviewmode(1));
    	map.put("DEFORMPICKUPDATAVIEW", new PSViewType().id("DEFORMPICKUPDATAVIEW").validflag(1).name("实体表单选择数据视图（部件视图）").codename("FormPickupDataView").deviewmode(1));
    	map.put("DEINDEXPICKUPDATAVIEW", new PSViewType().id("DEINDEXPICKUPDATAVIEW").validflag(1).name("实体索引关系选择数据视图（部件视图）").codename("IndexPickupDataView").deviewmode(1));
    	map.put("DEWIZARDVIEW", new PSViewType().id("DEWIZARDVIEW").validflag(1).name("实体向导视图").codename("WizardView").deviewmode(1));
    	map.put("DEMOBWIZARDVIEW", new PSViewType().id("DEMOBWIZARDVIEW").validflag(1).name("实体移动端向导视图").codename("MobWizardView").deviewmode(1));
    	map.put("DECALENDARVIEW", new PSViewType().id("DECALENDARVIEW").validflag(1).name("实体日历视图").codename("CalendarView").deviewmode(1));
    	map.put("DECALENDARVIEW9", new PSViewType().id("DECALENDARVIEW9").validflag(1).name("实体日历视图（部件视图）").codename("CalendarView9").deviewmode(1));
    	map.put("DEMOBCALENDARVIEW", new PSViewType().id("DEMOBCALENDARVIEW").validflag(1).name("实体移动端日历视图").codename("MobCalendarView").deviewmode(1));
    	map.put("DEMOBCALENDARVIEW9", new PSViewType().id("DEMOBCALENDARVIEW9").validflag(1).name("实体移动端日历视图（部件视图）").codename("MobCalendarView9").deviewmode(1));
    	map.put("DEMAPVIEW", new PSViewType().id("DEMAPVIEW").validflag(1).name("实体地图视图").codename("MapView").deviewmode(1));
    	map.put("DEMAPVIEW9", new PSViewType().id("DEMAPVIEW9").validflag(1).name("实体地图视图（部件视图）").codename("MapView9").deviewmode(1));
    	map.put("DEGANTTVIEW", new PSViewType().id("DEGANTTVIEW").validflag(1).name("实体甘特视图").codename("GanttView").deviewmode(1));
    	map.put("DEGANTTVIEW9", new PSViewType().id("DEGANTTVIEW9").validflag(1).name("实体甘特视图（部件视图）").codename("GanttView9").deviewmode(1));
    	map.put("DEMOBMAPVIEW", new PSViewType().id("DEMOBMAPVIEW").validflag(1).name("实体移动端地图视图").codename("MobMapView").deviewmode(1));
    	map.put("DEMOBMAPVIEW9", new PSViewType().id("DEMOBMAPVIEW9").validflag(1).name("实体移动端地图视图（部件视图）").codename("MobMapView9").deviewmode(1));
    	map.put("DEMOBGANTTVIEW", new PSViewType().id("DEMOBGANTTVIEW").validflag(1).name("实体移动端甘特视图").codename("MobGanttView").deviewmode(1));
    	map.put("DEMOBGANTTVIEW9", new PSViewType().id("DEMOBGANTTVIEW9").validflag(1).name("实体移动端甘特视图（部件视图）").codename("MobGanttView9").deviewmode(1));
    	map.put("DEPANELVIEW", new PSViewType().id("DEPANELVIEW").validflag(1).name("实体面板视图").codename("PanelView").deviewmode(1));
    	map.put("DEPANELVIEW9", new PSViewType().id("DEPANELVIEW9").validflag(1).name("实体面板视图（部件视图）").codename("PanelView9").deviewmode(1));
    	map.put("DEMOBPANELVIEW", new PSViewType().id("DEMOBPANELVIEW").validflag(1).name("实体移动端面板视图").codename("MobPanelView").deviewmode(1));
    	map.put("DEMOBPANELVIEW9", new PSViewType().id("DEMOBPANELVIEW9").validflag(1).name("实体移动端面板视图（部件视图）").codename("MobPanelView9").deviewmode(1));
    	
    	map.get("DECALENDARVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("CALENDAR").validflag(1).name("CALENDAR").ctrltype("CALENDAR"));
    	map.get("DECALENDARVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("CALENDAR").validflag(1).name("CALENDAR").ctrltype("CALENDAR"));
    	map.get("DEGANTTVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("GANTT").validflag(1).name("GANTT").ctrltype("GANTT"));
    	map.get("DEGANTTVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("GANTT").validflag(1).name("GANTT").ctrltype("GANTT"));
    	map.get("DEGRIDVIEW2").getPSVTCtrlsIf().add(new PSVTCtrl().id("TOOLBAR").validflag(1).name("TOOLBAR").ctrltype("TOOLBAR"));
    	map.get("DEGRIDVIEW2").getPSVTCtrlsIf().add(new PSVTCtrl().id("GRID").validflag(1).name("GRID").ctrltype("GRID"));
    	map.get("DEGRIDVIEW2").getPSVTCtrlsIf().add(new PSVTCtrl().id("SEARCHFORM").validflag(1).name("SEARCHFORM").ctrltype("SEARCHFORM"));
    	map.get("DEGRIDVIEW2").getPSVTCtrlsIf().add(new PSVTCtrl().id("DRTAB").validflag(1).name("DRTAB").ctrltype("DRTAB"));
    	map.get("DEGRIDVIEW4").getPSVTCtrlsIf().add(new PSVTCtrl().id("GRID").validflag(1).name("GRID").ctrltype("GRID"));
    	map.get("DEGRIDVIEW4").getPSVTCtrlsIf().add(new PSVTCtrl().id("SEARCHFORM").validflag(1).name("SEARCHFORM").ctrltype("SEARCHFORM"));
    	map.get("DEGRIDVIEW4").getPSVTCtrlsIf().add(new PSVTCtrl().id("DRTAB").validflag(1).name("DRTAB").ctrltype("DRTAB"));
    	map.get("DEGRIDVIEW4").getPSVTCtrlsIf().add(new PSVTCtrl().id("TOOLBAR").validflag(1).name("TOOLBAR").ctrltype("TOOLBAR"));
    	map.get("DEGRIDVIEW8").getPSVTCtrlsIf().add(new PSVTCtrl().id("GRID").validflag(1).name("GRID").ctrltype("GRID"));
    	map.get("DEGRIDVIEW8").getPSVTCtrlsIf().add(new PSVTCtrl().id("TOTALGRID").validflag(1).name("TOTALGRID").ctrltype("GRID"));
    	map.get("DEMAPVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("MAP").validflag(1).name("MAP").ctrltype("MAP"));
    	map.get("DEMAPVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("MAP").validflag(1).name("MAP").ctrltype("MAP"));
    	map.get("DEMOBCALENDARVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("CALENDAR").validflag(1).name("CALENDAR").ctrltype("CALENDAR"));
    	map.get("DEMOBCALENDARVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("CALENDAR").validflag(1).name("CALENDAR").ctrltype("CALENDAR"));
    	map.get("DEMOBFORMPICKUPMDVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("MDCTRL").validflag(1).name("MDCTRL").ctrltype("MOBMDCTRL"));
    	map.get("DEMOBGANTTVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("GANTT").validflag(1).name("GANTT").ctrltype("GANTT"));
    	map.get("DEMOBGANTTVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("GANTT").validflag(1).name("GANTT").ctrltype("GANTT"));
    	map.get("DEMOBINDEXPICKUPMDVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("MDCTRL").validflag(1).name("MDCTRL").ctrltype("MOBMDCTRL"));
    	map.get("DEMOBMAPVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("MAP").validflag(1).name("MAP").ctrltype("MAP"));
    	map.get("DEMOBMAPVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("MAP").validflag(1).name("MAP").ctrltype("MAP"));
    	map.get("DEMOBMPICKUPVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("PICKUPVIEWPANEL").validflag(1).name("PICKUPVIEWPANEL").ctrltype("PICKUPVIEWPANEL"));
    	map.get("DEMOBPANELVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("PANEL").validflag(1).name("PANEL").ctrltype("PANEL"));
    	map.get("DEMOBPANELVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("PANEL").validflag(1).name("PANEL").ctrltype("PANEL"));
    	map.get("DEMOBPICKUPLISTVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("MDCTRL").validflag(1).name("MDCTRL").ctrltype("MOBMDCTRL"));
    	map.get("DEMOBPICKUPMDVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("MDCTRL").validflag(1).name("MDCTRL").ctrltype("MOBMDCTRL"));
    	map.get("DEMOBPICKUPTREEVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("TREE").validflag(1).name("TREE").ctrltype("TREEVIEW"));
    	map.get("DEMOBPICKUPVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("PICKUPVIEWPANEL").validflag(1).name("PICKUPVIEWPANEL").ctrltype("PICKUPVIEWPANEL"));
    	map.get("DEMOBPORTALVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("DASHBOARD").validflag(1).name("DASHBOARD").ctrltype("DASHBOARD"));
    	map.get("DEMOBPORTALVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("DASHBOARD").validflag(1).name("DASHBOARD").ctrltype("DASHBOARD"));
    	map.get("DEMOBTABSEARCHVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("SEARCHBAR").validflag(1).name("SEARCHBAR").ctrltype("SEARCHBAR"));
    	map.get("DEMOBTABSEARCHVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("SEARCHBAR").validflag(1).name("SEARCHBAR").ctrltype("SEARCHBAR"));
    	map.get("DEMOBTREEVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("RIGHTTOOLBAR").validflag(1).name("RIGHTTOOLBAR").ctrltype("TOOLBAR"));
    	map.get("DEMOBTREEVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("TREE").validflag(1).name("TREE").ctrltype("TREEVIEW"));
    	map.get("DEPANELVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("PANEL").validflag(1).name("PANEL").ctrltype("PANEL"));
    	map.get("DEPANELVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("PANEL").validflag(1).name("PANEL").ctrltype("PANEL"));
    	map.get("DEPORTALVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("DASHBOARD").validflag(1).name("DASHBOARD").ctrltype("DASHBOARD"));
    	map.get("DEPORTALVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("DASHBOARD").validflag(1).name("DASHBOARD").ctrltype("DASHBOARD"));
    	map.get("DETABSEARCHVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("SEARCHBAR").validflag(1).name("SEARCHBAR").ctrltype("SEARCHBAR"));
    	map.get("DETABSEARCHVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("SEARCHBAR").validflag(1).name("SEARCHBAR").ctrltype("SEARCHBAR"));
    	map.get("DETREEGRIDEXVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("TREEGRIDEX").validflag(1).name("TREEGRIDEX").ctrltype("TREEGRIDEX"));
    	map.get("DETREEGRIDEXVIEW9").getPSVTCtrlsIf().add(new PSVTCtrl().id("TREEGRIDEX").validflag(1).name("TREEGRIDEX").ctrltype("TREEGRIDEX"));
    	map.get("DETREEGRIDVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("TREEGRID").validflag(1).name("TREEGRID").ctrltype("TREEGRID"));
    	map.get("DETREEVIEW").getPSVTCtrlsIf().add(new PSVTCtrl().id("TREE").validflag(1).name("TREE").ctrltype("TREEVIEW"));
    	
    	PSViewTypes.addAll(map.values());
    }
    
    @Override
    public PSViewType createDomain(){
        return new PSViewType();
    }

    @Override
    public PSViewTypeFilter createFilter(){
        return new PSViewTypeFilter();
	}

	@Override
	public PSViewType getDomain(Object params) {
		if(params instanceof PSViewType) {
			return (PSViewType)params;
		}
		return getMapper().convertValue(params, PSViewType.class);
	}

	@Override
	public PSViewTypeFilter getFilter(Object params) {
		if(params instanceof PSViewTypeFilter) {
			return (PSViewTypeFilter)params;
		}
		return getMapper().convertValue(params, PSViewTypeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSVIEWTYPE";
        }
        else{
            return "PSVIEWTYPES";
        }
	}
    
    
    protected List<PSViewType> getDomainList(String strDataSetName, PSViewTypeFilter f) throws Exception {
  		// 执行过滤操作
  		return filterDomainList(PSViewTypes, strDataSetName, f);
  	}
      
      
}
