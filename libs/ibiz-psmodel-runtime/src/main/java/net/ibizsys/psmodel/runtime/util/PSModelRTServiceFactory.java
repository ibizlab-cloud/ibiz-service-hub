package net.ibizsys.psmodel.runtime.util;

import net.ibizsys.psmodel.core.util.PSModelServiceFactory;
import net.ibizsys.psmodel.core.util.PSModels;

public class PSModelRTServiceFactory extends PSModelServiceFactory {

	private static PSModelRTServiceFactory instance = new PSModelRTServiceFactory();
	
	private static ThreadLocal<PSModelRTServiceFactory> current = new ThreadLocal<PSModelRTServiceFactory>();
	
	public static PSModelRTServiceFactory getCurrent() throws Exception {
		return getCurrent(false);
	}
	
	public static PSModelRTServiceFactory getCurrent(boolean bTryMode) throws Exception {
		PSModelRTServiceFactory psModelRTServiceFactory = current.get();
		if(psModelRTServiceFactory != null || bTryMode) {
			return psModelRTServiceFactory;
		}
		return instance;
	}
	
	public static void setCurrent(PSModelRTServiceFactory instance) {
		current.set(instance);
	}
	
	
	static {
		
		
        
        //以下为用户扩展
//        instance.registerPSModelService(PSModels.PSAPPMODULE, net.ibizsys.psmodel.runtime.service.ex.PSAppModuleRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSCODEITEM, net.ibizsys.psmodel.runtime.service.ex.PSCodeItemRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSDEFVALUERULE, net.ibizsys.psmodel.runtime.service.ex.PSDEFValueRuleRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSDELOGIC, net.ibizsys.psmodel.runtime.service.ex.PSDELogicRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSSYSBDTABLEDE, net.ibizsys.psmodel.runtime.service.ex.PSSysBDTableDERTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSDETBITEM, net.ibizsys.psmodel.runtime.service.ex.PSDETBItemRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSDEUAGROUP, net.ibizsys.psmodel.runtime.service.ex.PSDEUAGroupRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSDEUIACTION, net.ibizsys.psmodel.runtime.service.ex.PSDEUIActionRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSDEUTIL, net.ibizsys.psmodel.runtime.service.ex.PSDEUtilRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSLANGUAGERES, net.ibizsys.psmodel.runtime.service.ex.PSLanguageResRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSSYSDMITEM, net.ibizsys.psmodel.runtime.service.ex.PSSysDMItemRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSSYSEDITORSTYLE, net.ibizsys.psmodel.runtime.service.ex.PSSysEditorStyleRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSSYSPFPITEMPL, net.ibizsys.psmodel.runtime.service.ex.PSSysPFPITemplRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSSYSUTIL, net.ibizsys.psmodel.runtime.service.ex.PSSysUtilRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSWFLINK, net.ibizsys.psmodel.runtime.service.ex.PSWFLinkRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSWFPROCESS, net.ibizsys.psmodel.runtime.service.ex.PSWFProcessRTServiceEx.class);
//        instance.registerPSModelService(PSModels.PSDELISTITEM, net.ibizsys.psmodel.runtime.service.ex.PSDEListItemRTServiceEx.class);

	}
	
	public PSModelRTServiceFactory() {
		registerPSModelRTServices(this);
	}
	
	
	private static void registerPSModelRTServices(PSModelRTServiceFactory instance) {
		instance.registerPSModelService(PSModels.PSSYSTEM, net.ibizsys.psmodel.runtime.service.PSSystemRTService.class);
        instance.registerPSModelService("PSSYSTEMS", net.ibizsys.psmodel.runtime.service.PSSystemRTService.class);
        
        instance.registerPSModelService(PSModels.PSMODULE, net.ibizsys.psmodel.runtime.service.PSModuleRTService.class);
        instance.registerPSModelService("PSMODULES", net.ibizsys.psmodel.runtime.service.PSModuleRTService.class);
        
        instance.registerPSModelService(PSModels.PSDATAENTITY, net.ibizsys.psmodel.runtime.service.PSDataEntityRTService.class);
        instance.registerPSModelService("PSDATAENTITIES", net.ibizsys.psmodel.runtime.service.PSDataEntityRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFIELD, net.ibizsys.psmodel.runtime.service.PSDEFieldRTService.class);
        instance.registerPSModelService("PSDEFIELDS", net.ibizsys.psmodel.runtime.service.PSDEFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSDER, net.ibizsys.psmodel.runtime.service.PSDERRTService.class);
        instance.registerPSModelService("PSDERS", net.ibizsys.psmodel.runtime.service.PSDERRTService.class);
        
        instance.registerPSModelService(PSModels.PSACHANDLER, net.ibizsys.psmodel.runtime.service.PSACHandlerRTService.class);
        instance.registerPSModelService("PSACHANDLERS", net.ibizsys.psmodel.runtime.service.PSACHandlerRTService.class);
        
        instance.registerPSModelService(PSModels.PSACHANDLERACTION, net.ibizsys.psmodel.runtime.service.PSACHandlerActionRTService.class);
        instance.registerPSModelService("PSACHANDLERACTIONS", net.ibizsys.psmodel.runtime.service.PSACHandlerActionRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPDERS, net.ibizsys.psmodel.runtime.service.PSAppDERSRTService.class);
        instance.registerPSModelService("PSAPPDERS", net.ibizsys.psmodel.runtime.service.PSAppDERSRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPVIEW, net.ibizsys.psmodel.runtime.service.PSAppViewRTService.class);
        instance.registerPSModelService("PSAPPVIEWS", net.ibizsys.psmodel.runtime.service.PSAppViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPDEVIEW, net.ibizsys.psmodel.runtime.service.PSAppDEViewRTService.class);
        instance.registerPSModelService("PSAPPDEVIEWS", net.ibizsys.psmodel.runtime.service.PSAppDEViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPDYNADEVIEW, net.ibizsys.psmodel.runtime.service.PSAppDynaDEViewRTService.class);
        instance.registerPSModelService("PSAPPDYNADEVIEWS", net.ibizsys.psmodel.runtime.service.PSAppDynaDEViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPFUNC, net.ibizsys.psmodel.runtime.service.PSAppFuncRTService.class);
        instance.registerPSModelService("PSAPPFUNCS", net.ibizsys.psmodel.runtime.service.PSAppFuncRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPINDEXVIEW, net.ibizsys.psmodel.runtime.service.PSAppIndexViewRTService.class);
        instance.registerPSModelService("PSAPPINDEXVIEWS", net.ibizsys.psmodel.runtime.service.PSAppIndexViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPLAN, net.ibizsys.psmodel.runtime.service.PSAppLanRTService.class);
        instance.registerPSModelService("PSAPPLANS", net.ibizsys.psmodel.runtime.service.PSAppLanRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPDATAENTITY, net.ibizsys.psmodel.runtime.service.PSAppDataEntityRTService.class);
        instance.registerPSModelService("PSAPPDATAENTITIES", net.ibizsys.psmodel.runtime.service.PSAppDataEntityRTService.class);
        instance.registerPSModelService("PSAPPLOCALDE", net.ibizsys.psmodel.runtime.service.PSAppDataEntityRTService.class);
        instance.registerPSModelService("PSAPPLOCALDES", net.ibizsys.psmodel.runtime.service.PSAppDataEntityRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPLOGIC, net.ibizsys.psmodel.runtime.service.PSAppLogicRTService.class);
        instance.registerPSModelService("PSAPPLOGICS", net.ibizsys.psmodel.runtime.service.PSAppLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPMENU, net.ibizsys.psmodel.runtime.service.PSAppMenuRTService.class);
        instance.registerPSModelService("PSAPPMENUS", net.ibizsys.psmodel.runtime.service.PSAppMenuRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPMENUITEM, net.ibizsys.psmodel.runtime.service.PSAppMenuItemRTService.class);
        instance.registerPSModelService("PSAPPMENUITEMS", net.ibizsys.psmodel.runtime.service.PSAppMenuItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPMENULOGIC, net.ibizsys.psmodel.runtime.service.PSAppMenuLogicRTService.class);
        instance.registerPSModelService("PSAPPMENULOGICS", net.ibizsys.psmodel.runtime.service.PSAppMenuLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPMODULE, net.ibizsys.psmodel.runtime.service.PSAppModuleRTService.class);
        instance.registerPSModelService("PSAPPMODULES", net.ibizsys.psmodel.runtime.service.PSAppModuleRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPDTVIEW, net.ibizsys.psmodel.runtime.service.PSAppPDTViewRTService.class);
        instance.registerPSModelService("PSAPPPDTVIEWS", net.ibizsys.psmodel.runtime.service.PSAppPDTViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPVPART, net.ibizsys.psmodel.runtime.service.PSAppPVPartRTService.class);
        instance.registerPSModelService("PSAPPPVPARTS", net.ibizsys.psmodel.runtime.service.PSAppPVPartRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPANELVIEW, net.ibizsys.psmodel.runtime.service.PSAppPanelViewRTService.class);
        instance.registerPSModelService("PSAPPPANELVIEWS", net.ibizsys.psmodel.runtime.service.PSAppPanelViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPKG, net.ibizsys.psmodel.runtime.service.PSAppPkgRTService.class);
        instance.registerPSModelService("PSAPPPKGS", net.ibizsys.psmodel.runtime.service.PSAppPkgRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPORTALVIEW, net.ibizsys.psmodel.runtime.service.PSAppPortalViewRTService.class);
        instance.registerPSModelService("PSAPPPORTALVIEWS", net.ibizsys.psmodel.runtime.service.PSAppPortalViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPORTLET, net.ibizsys.psmodel.runtime.service.PSAppPortletRTService.class);
        instance.registerPSModelService("PSAPPPORTLETS", net.ibizsys.psmodel.runtime.service.PSAppPortletRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPRESOURCE, net.ibizsys.psmodel.runtime.service.PSAppResourceRTService.class);
        instance.registerPSModelService("PSAPPRESOURCES", net.ibizsys.psmodel.runtime.service.PSAppResourceRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPSBITEM, net.ibizsys.psmodel.runtime.service.PSAppSBItemRTService.class);
        instance.registerPSModelService("PSAPPSBITEMS", net.ibizsys.psmodel.runtime.service.PSAppSBItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPSBITEMRS, net.ibizsys.psmodel.runtime.service.PSAppSBItemRSRTService.class);
        instance.registerPSModelService("PSAPPSBITEMRS", net.ibizsys.psmodel.runtime.service.PSAppSBItemRSRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPSTORYBOARD, net.ibizsys.psmodel.runtime.service.PSAppStoryBoardRTService.class);
        instance.registerPSModelService("PSAPPSTORYBOARDS", net.ibizsys.psmodel.runtime.service.PSAppStoryBoardRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPTITLEBAR, net.ibizsys.psmodel.runtime.service.PSAppTitleBarRTService.class);
        instance.registerPSModelService("PSAPPTITLEBARS", net.ibizsys.psmodel.runtime.service.PSAppTitleBarRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPUISTYLE, net.ibizsys.psmodel.runtime.service.PSAppUIStyleRTService.class);
        instance.registerPSModelService("PSAPPUISTYLES", net.ibizsys.psmodel.runtime.service.PSAppUIStyleRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPUITHEME, net.ibizsys.psmodel.runtime.service.PSAppUIThemeRTService.class);
        instance.registerPSModelService("PSAPPUITHEMES", net.ibizsys.psmodel.runtime.service.PSAppUIThemeRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPUSERMODE, net.ibizsys.psmodel.runtime.service.PSAppUserModeRTService.class);
        instance.registerPSModelService("PSAPPUSERMODES", net.ibizsys.psmodel.runtime.service.PSAppUserModeRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPUTIL, net.ibizsys.psmodel.runtime.service.PSAppUtilRTService.class);
        instance.registerPSModelService("PSAPPUTILS", net.ibizsys.psmodel.runtime.service.PSAppUtilRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPUTILPAGE, net.ibizsys.psmodel.runtime.service.PSAppUtilPageRTService.class);
        instance.registerPSModelService("PSAPPUTILPAGES", net.ibizsys.psmodel.runtime.service.PSAppUtilPageRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPUTILVIEW, net.ibizsys.psmodel.runtime.service.PSAppUtilViewRTService.class);
        instance.registerPSModelService("PSAPPUTILVIEWS", net.ibizsys.psmodel.runtime.service.PSAppUtilViewRTService.class);
        
        
        instance.registerPSModelService(PSModels.PSAPPWF, net.ibizsys.psmodel.runtime.service.PSAppWFRTService.class);
        instance.registerPSModelService("PSAPPWFS", net.ibizsys.psmodel.runtime.service.PSAppWFRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPWFVER, net.ibizsys.psmodel.runtime.service.PSAppWFVerRTService.class);
        instance.registerPSModelService("PSAPPWFVERS", net.ibizsys.psmodel.runtime.service.PSAppWFVerRTService.class);
        
        instance.registerPSModelService(PSModels.PSCODEITEM, net.ibizsys.psmodel.runtime.service.PSCodeItemRTService.class);
        instance.registerPSModelService("PSCODEITEMS", net.ibizsys.psmodel.runtime.service.PSCodeItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSCODELIST, net.ibizsys.psmodel.runtime.service.PSCodeListRTService.class);
        instance.registerPSModelService("PSCODELISTS", net.ibizsys.psmodel.runtime.service.PSCodeListRTService.class);
        
        instance.registerPSModelService(PSModels.PSCTRLLOGICGROUP, net.ibizsys.psmodel.runtime.service.PSCtrlLogicGroupRTService.class);
        instance.registerPSModelService("PSCTRLLOGICGROUPS", net.ibizsys.psmodel.runtime.service.PSCtrlLogicGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSCTRLLOGICGRPDETAIL, net.ibizsys.psmodel.runtime.service.PSCtrlLogicGrpDetailRTService.class);
        instance.registerPSModelService("PSCTRLLOGICGRPDETAILS", net.ibizsys.psmodel.runtime.service.PSCtrlLogicGrpDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSCTRLMSG, net.ibizsys.psmodel.runtime.service.PSCtrlMsgRTService.class);
        instance.registerPSModelService("PSCTRLMSGS", net.ibizsys.psmodel.runtime.service.PSCtrlMsgRTService.class);
        
        instance.registerPSModelService(PSModels.PSCTRLMSGITEM, net.ibizsys.psmodel.runtime.service.PSCtrlMsgItemRTService.class);
        instance.registerPSModelService("PSCTRLMSGITEMS", net.ibizsys.psmodel.runtime.service.PSCtrlMsgItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACMODE, net.ibizsys.psmodel.runtime.service.PSDEACModeRTService.class);
        instance.registerPSModelService("PSDEACMODES", net.ibizsys.psmodel.runtime.service.PSDEACModeRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACMODEITEM, net.ibizsys.psmodel.runtime.service.PSDEACModeItemRTService.class);
        instance.registerPSModelService("PSDEACMODEITEMS", net.ibizsys.psmodel.runtime.service.PSDEACModeItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEAGDETAIL, net.ibizsys.psmodel.runtime.service.PSDEAGDetailRTService.class);
        instance.registerPSModelService("PSDEAGDETAILS", net.ibizsys.psmodel.runtime.service.PSDEAGDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACTION, net.ibizsys.psmodel.runtime.service.PSDEActionRTService.class);
        instance.registerPSModelService("PSDEACTIONS", net.ibizsys.psmodel.runtime.service.PSDEActionRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACTIONGROUP, net.ibizsys.psmodel.runtime.service.PSDEActionGroupRTService.class);
        instance.registerPSModelService("PSDEACTIONGROUPS", net.ibizsys.psmodel.runtime.service.PSDEActionGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACTIONLOGIC, net.ibizsys.psmodel.runtime.service.PSDEActionLogicRTService.class);
        instance.registerPSModelService("PSDEACTIONLOGICS", net.ibizsys.psmodel.runtime.service.PSDEActionLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACTIONPARAM, net.ibizsys.psmodel.runtime.service.PSDEActionParamRTService.class);
        instance.registerPSModelService("PSDEACTIONPARAMS", net.ibizsys.psmodel.runtime.service.PSDEActionParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACTIONTEMPL, net.ibizsys.psmodel.runtime.service.PSDEActionTemplRTService.class);
        instance.registerPSModelService("PSDEACTIONTEMPLS", net.ibizsys.psmodel.runtime.service.PSDEActionTemplRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEACTIONVR, net.ibizsys.psmodel.runtime.service.PSDEActionVRRTService.class);
        instance.registerPSModelService("PSDEACTIONVRS", net.ibizsys.psmodel.runtime.service.PSDEActionVRRTService.class);
        
        instance.registerPSModelService(PSModels.PSDECHART, net.ibizsys.psmodel.runtime.service.PSDEChartRTService.class);
        instance.registerPSModelService("PSDECHARTS", net.ibizsys.psmodel.runtime.service.PSDEChartRTService.class);
        
        instance.registerPSModelService(PSModels.PSDECHARTAXES, net.ibizsys.psmodel.runtime.service.PSDEChartAxesRTService.class);
        instance.registerPSModelService("PSDECHARTAXES", net.ibizsys.psmodel.runtime.service.PSDEChartAxesRTService.class);
        
        instance.registerPSModelService(PSModels.PSDECHARTLOGIC, net.ibizsys.psmodel.runtime.service.PSDEChartLogicRTService.class);
        instance.registerPSModelService("PSDECHARTLOGICS", net.ibizsys.psmodel.runtime.service.PSDEChartLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDECHARTPARAM, net.ibizsys.psmodel.runtime.service.PSDEChartParamRTService.class);
        instance.registerPSModelService("PSDECHARTPARAMS", net.ibizsys.psmodel.runtime.service.PSDEChartParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDBCFG, net.ibizsys.psmodel.runtime.service.PSDEDBCfgRTService.class);
        instance.registerPSModelService("PSDEDBCFGS", net.ibizsys.psmodel.runtime.service.PSDEDBCfgRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDBIDXFIELD, net.ibizsys.psmodel.runtime.service.PSDEDBIdxFieldRTService.class);
        instance.registerPSModelService("PSDEDBIDXFIELDS", net.ibizsys.psmodel.runtime.service.PSDEDBIdxFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDBINDEX, net.ibizsys.psmodel.runtime.service.PSDEDBIndexRTService.class);
        instance.registerPSModelService("PSDEDBINDICES", net.ibizsys.psmodel.runtime.service.PSDEDBIndexRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDQCODE, net.ibizsys.psmodel.runtime.service.PSDEDQCodeRTService.class);
        instance.registerPSModelService("PSDEDQCODES", net.ibizsys.psmodel.runtime.service.PSDEDQCodeRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDQCODECOND, net.ibizsys.psmodel.runtime.service.PSDEDQCodeCondRTService.class);
        instance.registerPSModelService("PSDEDQCODECONDS", net.ibizsys.psmodel.runtime.service.PSDEDQCodeCondRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDQCODEEXP, net.ibizsys.psmodel.runtime.service.PSDEDQCodeExpRTService.class);
        instance.registerPSModelService("PSDEDQCODEEXPS", net.ibizsys.psmodel.runtime.service.PSDEDQCodeExpRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDQCOND, net.ibizsys.psmodel.runtime.service.PSDEDQCondRTService.class);
        instance.registerPSModelService("PSDEDQCONDS", net.ibizsys.psmodel.runtime.service.PSDEDQCondRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDQJOIN, net.ibizsys.psmodel.runtime.service.PSDEDQJoinRTService.class);
        instance.registerPSModelService("PSDEDQJOINS", net.ibizsys.psmodel.runtime.service.PSDEDQJoinRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDRDETAIL, net.ibizsys.psmodel.runtime.service.PSDEDRDetailRTService.class);
        instance.registerPSModelService("PSDEDRDETAILS", net.ibizsys.psmodel.runtime.service.PSDEDRDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDRGROUP, net.ibizsys.psmodel.runtime.service.PSDEDRGroupRTService.class);
        instance.registerPSModelService("PSDEDRGROUPS", net.ibizsys.psmodel.runtime.service.PSDEDRGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDRITEM, net.ibizsys.psmodel.runtime.service.PSDEDRItemRTService.class);
        instance.registerPSModelService("PSDEDRITEMS", net.ibizsys.psmodel.runtime.service.PSDEDRItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDSDQ, net.ibizsys.psmodel.runtime.service.PSDEDSDQRTService.class);
        instance.registerPSModelService("PSDEDSDQS", net.ibizsys.psmodel.runtime.service.PSDEDSDQRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDSGRPPARAM, net.ibizsys.psmodel.runtime.service.PSDEDSGrpParamRTService.class);
        instance.registerPSModelService("PSDEDSGRPPARAMS", net.ibizsys.psmodel.runtime.service.PSDEDSGrpParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDSPARAM, net.ibizsys.psmodel.runtime.service.PSDEDSParamRTService.class);
        instance.registerPSModelService("PSDEDSPARAMS", net.ibizsys.psmodel.runtime.service.PSDEDSParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDTSQUEUE, net.ibizsys.psmodel.runtime.service.PSDEDTSQueueRTService.class);
        instance.registerPSModelService("PSDEDTSQUEUES", net.ibizsys.psmodel.runtime.service.PSDEDTSQueueRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATAEXP, net.ibizsys.psmodel.runtime.service.PSDEDataExpRTService.class);
        instance.registerPSModelService("PSDEDATAEXPS", net.ibizsys.psmodel.runtime.service.PSDEDataExpRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATAIMP, net.ibizsys.psmodel.runtime.service.PSDEDataImpRTService.class);
        instance.registerPSModelService("PSDEDATAIMPS", net.ibizsys.psmodel.runtime.service.PSDEDataImpRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATAIMPITEM, net.ibizsys.psmodel.runtime.service.PSDEDataImpItemRTService.class);
        instance.registerPSModelService("PSDEDATAIMPITEMS", net.ibizsys.psmodel.runtime.service.PSDEDataImpItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATAQUERY, net.ibizsys.psmodel.runtime.service.PSDEDataQueryRTService.class);
        instance.registerPSModelService("PSDEDATAQUERIES", net.ibizsys.psmodel.runtime.service.PSDEDataQueryRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATARELATION, net.ibizsys.psmodel.runtime.service.PSDEDataRelationRTService.class);
        instance.registerPSModelService("PSDEDATARELATIONS", net.ibizsys.psmodel.runtime.service.PSDEDataRelationRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATASET, net.ibizsys.psmodel.runtime.service.PSDEDataSetRTService.class);
        instance.registerPSModelService("PSDEDATASETS", net.ibizsys.psmodel.runtime.service.PSDEDataSetRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATASYNC, net.ibizsys.psmodel.runtime.service.PSDEDataSyncRTService.class);
        instance.registerPSModelService("PSDEDATASYNCS", net.ibizsys.psmodel.runtime.service.PSDEDataSyncRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATAVIEW, net.ibizsys.psmodel.runtime.service.PSDEDataViewRTService.class);
        instance.registerPSModelService("PSDEDATAVIEWS", net.ibizsys.psmodel.runtime.service.PSDEDataViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDATAVIEWLOGIC, net.ibizsys.psmodel.runtime.service.PSDEDataViewLogicRTService.class);
        instance.registerPSModelService("PSDEDATAVIEWLOGICS", net.ibizsys.psmodel.runtime.service.PSDEDataViewLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFDLOGIC, net.ibizsys.psmodel.runtime.service.PSDEFDLogicRTService.class);
        instance.registerPSModelService("PSDEFDLOGICS", net.ibizsys.psmodel.runtime.service.PSDEFDLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFDTCOL, net.ibizsys.psmodel.runtime.service.PSDEFDTColRTService.class);
        instance.registerPSModelService("PSDEFDTCOLS", net.ibizsys.psmodel.runtime.service.PSDEFDTColRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFGROUP, net.ibizsys.psmodel.runtime.service.PSDEFGroupRTService.class);
        instance.registerPSModelService("PSDEFGROUPS", net.ibizsys.psmodel.runtime.service.PSDEFGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFGROUPDETAIL, net.ibizsys.psmodel.runtime.service.PSDEFGroupDetailRTService.class);
        instance.registerPSModelService("PSDEFGROUPDETAILS", net.ibizsys.psmodel.runtime.service.PSDEFGroupDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFIUDETAIL, net.ibizsys.psmodel.runtime.service.PSDEFIUDetailRTService.class);
        instance.registerPSModelService("PSDEFIUDETAILS", net.ibizsys.psmodel.runtime.service.PSDEFIUDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFIUPDATE, net.ibizsys.psmodel.runtime.service.PSDEFIUpdateRTService.class);
        instance.registerPSModelService("PSDEFIUPDATES", net.ibizsys.psmodel.runtime.service.PSDEFIUpdateRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFIVR, net.ibizsys.psmodel.runtime.service.PSDEFIVRRTService.class);
        instance.registerPSModelService("PSDEFIVRS", net.ibizsys.psmodel.runtime.service.PSDEFIVRRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFINPUTTIP, net.ibizsys.psmodel.runtime.service.PSDEFInputTipRTService.class);
        instance.registerPSModelService("PSDEFINPUTTIPS", net.ibizsys.psmodel.runtime.service.PSDEFInputTipRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFINPUTTIPSET, net.ibizsys.psmodel.runtime.service.PSDEFInputTipSetRTService.class);
        instance.registerPSModelService("PSDEFINPUTTIPSETS", net.ibizsys.psmodel.runtime.service.PSDEFInputTipSetRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFSFITEM, net.ibizsys.psmodel.runtime.service.PSDEFSFItemRTService.class);
        instance.registerPSModelService("PSDEFSFITEMS", net.ibizsys.psmodel.runtime.service.PSDEFSFItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFUIMODE, net.ibizsys.psmodel.runtime.service.PSDEFUIModeRTService.class);
        instance.registerPSModelService("PSDEFUIMODES", net.ibizsys.psmodel.runtime.service.PSDEFUIModeRTService.class);
        instance.registerPSModelService("PSDEFFORMITEM", net.ibizsys.psmodel.runtime.service.PSDEFUIModeRTService.class);
        instance.registerPSModelService("PSDEFFORMITEMS", net.ibizsys.psmodel.runtime.service.PSDEFUIModeRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFVRCOND, net.ibizsys.psmodel.runtime.service.PSDEFVRCondRTService.class);
        instance.registerPSModelService("PSDEFVRCONDS", net.ibizsys.psmodel.runtime.service.PSDEFVRCondRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFVALUERULE, net.ibizsys.psmodel.runtime.service.PSDEFValueRuleRTService.class);
        instance.registerPSModelService("PSDEFVALUERULES", net.ibizsys.psmodel.runtime.service.PSDEFValueRuleRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFORM, net.ibizsys.psmodel.runtime.service.PSDEFormRTService.class);
        instance.registerPSModelService("PSDEFORMS", net.ibizsys.psmodel.runtime.service.PSDEFormRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFORMDETAIL, net.ibizsys.psmodel.runtime.service.PSDEFormDetailRTService.class);
        instance.registerPSModelService("PSDEFORMDETAILS", net.ibizsys.psmodel.runtime.service.PSDEFormDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFORMLOGIC, net.ibizsys.psmodel.runtime.service.PSDEFormLogicRTService.class);
        instance.registerPSModelService("PSDEFORMLOGICS", net.ibizsys.psmodel.runtime.service.PSDEFormLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEFORMRF, net.ibizsys.psmodel.runtime.service.PSDEFormRFRTService.class);
        instance.registerPSModelService("PSDEFORMRVES", net.ibizsys.psmodel.runtime.service.PSDEFormRFRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGEIUDETAIL, net.ibizsys.psmodel.runtime.service.PSDEGEIUDetailRTService.class);
        instance.registerPSModelService("PSDEGEIUDETAILS", net.ibizsys.psmodel.runtime.service.PSDEGEIUDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGEIUPDATE, net.ibizsys.psmodel.runtime.service.PSDEGEIUpdateRTService.class);
        instance.registerPSModelService("PSDEGEIUPDATES", net.ibizsys.psmodel.runtime.service.PSDEGEIUpdateRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGEIVR, net.ibizsys.psmodel.runtime.service.PSDEGEIVRRTService.class);
        instance.registerPSModelService("PSDEGEIVRS", net.ibizsys.psmodel.runtime.service.PSDEGEIVRRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGRID, net.ibizsys.psmodel.runtime.service.PSDEGridRTService.class);
        instance.registerPSModelService("PSDEGRIDS", net.ibizsys.psmodel.runtime.service.PSDEGridRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGRIDCOL, net.ibizsys.psmodel.runtime.service.PSDEGridColRTService.class);
        instance.registerPSModelService("PSDEGRIDCOLS", net.ibizsys.psmodel.runtime.service.PSDEGridColRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGRIDLOGIC, net.ibizsys.psmodel.runtime.service.PSDEGridLogicRTService.class);
        instance.registerPSModelService("PSDEGRIDLOGICS", net.ibizsys.psmodel.runtime.service.PSDEGridLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGROUP, net.ibizsys.psmodel.runtime.service.PSDEGroupRTService.class);
        instance.registerPSModelService("PSDEGROUPS", net.ibizsys.psmodel.runtime.service.PSDEGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEGROUPDETAIL, net.ibizsys.psmodel.runtime.service.PSDEGroupDetailRTService.class);
        instance.registerPSModelService("PSDEGROUPDETAILS", net.ibizsys.psmodel.runtime.service.PSDEGroupDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELLCOND, net.ibizsys.psmodel.runtime.service.PSDELLCondRTService.class);
        instance.registerPSModelService("PSDELLCONDS", net.ibizsys.psmodel.runtime.service.PSDELLCondRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELNPARAM, net.ibizsys.psmodel.runtime.service.PSDELNParamRTService.class);
        instance.registerPSModelService("PSDELNPARAMS", net.ibizsys.psmodel.runtime.service.PSDELNParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELIST, net.ibizsys.psmodel.runtime.service.PSDEListRTService.class);
        instance.registerPSModelService("PSDELISTS", net.ibizsys.psmodel.runtime.service.PSDEListRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELISTITEM, net.ibizsys.psmodel.runtime.service.PSDEListItemRTService.class);
        instance.registerPSModelService("PSDELISTITEMS", net.ibizsys.psmodel.runtime.service.PSDEListItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELISTLOGIC, net.ibizsys.psmodel.runtime.service.PSDEListLogicRTService.class);
        instance.registerPSModelService("PSDELISTLOGICS", net.ibizsys.psmodel.runtime.service.PSDEListLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELOGIC, net.ibizsys.psmodel.runtime.service.PSDELogicRTService.class);
        instance.registerPSModelService("PSDELOGICS", net.ibizsys.psmodel.runtime.service.PSDELogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELOGICLINK, net.ibizsys.psmodel.runtime.service.PSDELogicLinkRTService.class);
        instance.registerPSModelService("PSDELOGICLINKS", net.ibizsys.psmodel.runtime.service.PSDELogicLinkRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELOGICNODE, net.ibizsys.psmodel.runtime.service.PSDELogicNodeRTService.class);
        instance.registerPSModelService("PSDELOGICNODES", net.ibizsys.psmodel.runtime.service.PSDELogicNodeRTService.class);
        
        instance.registerPSModelService(PSModels.PSDELOGICPARAM, net.ibizsys.psmodel.runtime.service.PSDELogicParamRTService.class);
        instance.registerPSModelService("PSDELOGICPARAMS", net.ibizsys.psmodel.runtime.service.PSDELogicParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMSACTION, net.ibizsys.psmodel.runtime.service.PSDEMSActionRTService.class);
        instance.registerPSModelService("PSDEMSACTIONS", net.ibizsys.psmodel.runtime.service.PSDEMSActionRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMSFIELD, net.ibizsys.psmodel.runtime.service.PSDEMSFieldRTService.class);
        instance.registerPSModelService("PSDEMSFIELDS", net.ibizsys.psmodel.runtime.service.PSDEMSFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMSOPPRIV, net.ibizsys.psmodel.runtime.service.PSDEMSOPPrivRTService.class);
        instance.registerPSModelService("PSDEMSOPPRIVS", net.ibizsys.psmodel.runtime.service.PSDEMSOPPrivRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMAINSTATE, net.ibizsys.psmodel.runtime.service.PSDEMainStateRTService.class);
        instance.registerPSModelService("PSDEMAINSTATES", net.ibizsys.psmodel.runtime.service.PSDEMainStateRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMAINSTATERS, net.ibizsys.psmodel.runtime.service.PSDEMainStateRSRTService.class);
        instance.registerPSModelService("PSDEMAINSTATERS", net.ibizsys.psmodel.runtime.service.PSDEMainStateRSRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMAP, net.ibizsys.psmodel.runtime.service.PSDEMapRTService.class);
        instance.registerPSModelService("PSDEMAPS", net.ibizsys.psmodel.runtime.service.PSDEMapRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMAPACTION, net.ibizsys.psmodel.runtime.service.PSDEMapActionRTService.class);
        instance.registerPSModelService("PSDEMAPACTIONS", net.ibizsys.psmodel.runtime.service.PSDEMapActionRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMAPDQ, net.ibizsys.psmodel.runtime.service.PSDEMapDQRTService.class);
        instance.registerPSModelService("PSDEMAPDQS", net.ibizsys.psmodel.runtime.service.PSDEMapDQRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMAPDS, net.ibizsys.psmodel.runtime.service.PSDEMapDSRTService.class);
        instance.registerPSModelService("PSDEMAPDS", net.ibizsys.psmodel.runtime.service.PSDEMapDSRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEMAPDETAIL, net.ibizsys.psmodel.runtime.service.PSDEMapDetailRTService.class);
        instance.registerPSModelService("PSDEMAPDETAILS", net.ibizsys.psmodel.runtime.service.PSDEMapDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDENOTIFY, net.ibizsys.psmodel.runtime.service.PSDENotifyRTService.class);
        instance.registerPSModelService("PSDENOTIFIES", net.ibizsys.psmodel.runtime.service.PSDENotifyRTService.class);
        
        instance.registerPSModelService(PSModels.PSDENOTIFYTARGET, net.ibizsys.psmodel.runtime.service.PSDENotifyTargetRTService.class);
        instance.registerPSModelService("PSDENOTIFYTARGETS", net.ibizsys.psmodel.runtime.service.PSDENotifyTargetRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEOPPRIV, net.ibizsys.psmodel.runtime.service.PSDEOPPrivRTService.class);
        instance.registerPSModelService("PSDEOPPRIVS", net.ibizsys.psmodel.runtime.service.PSDEOPPrivRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEOPPRIVROLE, net.ibizsys.psmodel.runtime.service.PSDEOPPrivRoleRTService.class);
        instance.registerPSModelService("PSDEOPPRIVROLES", net.ibizsys.psmodel.runtime.service.PSDEOPPrivRoleRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEPRINT, net.ibizsys.psmodel.runtime.service.PSDEPrintRTService.class);
        instance.registerPSModelService("PSDEPRINTS", net.ibizsys.psmodel.runtime.service.PSDEPrintRTService.class);
        
        instance.registerPSModelService(PSModels.PSDERDEFMAP, net.ibizsys.psmodel.runtime.service.PSDERDEFMapRTService.class);
        instance.registerPSModelService("PSDERDEFMAPS", net.ibizsys.psmodel.runtime.service.PSDERDEFMapRTService.class);
        
        instance.registerPSModelService(PSModels.PSDERGROUP, net.ibizsys.psmodel.runtime.service.PSDERGroupRTService.class);
        instance.registerPSModelService("PSDERGROUPS", net.ibizsys.psmodel.runtime.service.PSDERGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSDERGROUPDETAIL, net.ibizsys.psmodel.runtime.service.PSDERGroupDetailRTService.class);
        instance.registerPSModelService("PSDERGROUPDETAILS", net.ibizsys.psmodel.runtime.service.PSDERGroupDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEREPITEM, net.ibizsys.psmodel.runtime.service.PSDERepItemRTService.class);
        instance.registerPSModelService("PSDEREPITEMS", net.ibizsys.psmodel.runtime.service.PSDERepItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEREPORT, net.ibizsys.psmodel.runtime.service.PSDEReportRTService.class);
        instance.registerPSModelService("PSDEREPORTS", net.ibizsys.psmodel.runtime.service.PSDEReportRTService.class);
        
        instance.registerPSModelService(PSModels.PSDESADETAIL, net.ibizsys.psmodel.runtime.service.PSDESADetailRTService.class);
        instance.registerPSModelService("PSDESADETAILS", net.ibizsys.psmodel.runtime.service.PSDESADetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDESADETAILPARAM, net.ibizsys.psmodel.runtime.service.PSDESADetailParamRTService.class);
        instance.registerPSModelService("PSDESADETAILPARAMS", net.ibizsys.psmodel.runtime.service.PSDESADetailParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSDESARS, net.ibizsys.psmodel.runtime.service.PSDESARSRTService.class);
        instance.registerPSModelService("PSDESARS", net.ibizsys.psmodel.runtime.service.PSDESARSRTService.class);
        
        instance.registerPSModelService(PSModels.PSDESAVR, net.ibizsys.psmodel.runtime.service.PSDESAVRRTService.class);
        instance.registerPSModelService("PSDESAVRS", net.ibizsys.psmodel.runtime.service.PSDESAVRRTService.class);
        
        instance.registerPSModelService(PSModels.PSDESAMPLEDATA, net.ibizsys.psmodel.runtime.service.PSDESampleDataRTService.class);
        instance.registerPSModelService("PSDESAMPLEDATA", net.ibizsys.psmodel.runtime.service.PSDESampleDataRTService.class);
        
        instance.registerPSModelService(PSModels.PSDESERVICEAPI, net.ibizsys.psmodel.runtime.service.PSDEServiceAPIRTService.class);
        instance.registerPSModelService("PSDESERVICEAPIS", net.ibizsys.psmodel.runtime.service.PSDEServiceAPIRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETBITEM, net.ibizsys.psmodel.runtime.service.PSDETBItemRTService.class);
        instance.registerPSModelService("PSDETBITEMS", net.ibizsys.psmodel.runtime.service.PSDETBItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEDBTABLE, net.ibizsys.psmodel.runtime.service.PSDEDBTableRTService.class);
        instance.registerPSModelService("PSDEDBTABLES", net.ibizsys.psmodel.runtime.service.PSDEDBTableRTService.class);
        instance.registerPSModelService("PSDETABLE", net.ibizsys.psmodel.runtime.service.PSDEDBTableRTService.class);
        instance.registerPSModelService("PSDETABLES", net.ibizsys.psmodel.runtime.service.PSDEDBTableRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETOOLBAR, net.ibizsys.psmodel.runtime.service.PSDEToolbarRTService.class);
        instance.registerPSModelService("PSDETOOLBARS", net.ibizsys.psmodel.runtime.service.PSDEToolbarRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETOOLBARLOGIC, net.ibizsys.psmodel.runtime.service.PSDEToolbarLogicRTService.class);
        instance.registerPSModelService("PSDETOOLBARLOGICS", net.ibizsys.psmodel.runtime.service.PSDEToolbarLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETREECOL, net.ibizsys.psmodel.runtime.service.PSDETreeColRTService.class);
        instance.registerPSModelService("PSDETREECOLS", net.ibizsys.psmodel.runtime.service.PSDETreeColRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETREELOGIC, net.ibizsys.psmodel.runtime.service.PSDETreeLogicRTService.class);
        instance.registerPSModelService("PSDETREELOGICS", net.ibizsys.psmodel.runtime.service.PSDETreeLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETREENODE, net.ibizsys.psmodel.runtime.service.PSDETreeNodeRTService.class);
        instance.registerPSModelService("PSDETREENODES", net.ibizsys.psmodel.runtime.service.PSDETreeNodeRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETREENODECOL, net.ibizsys.psmodel.runtime.service.PSDETreeNodeColRTService.class);
        instance.registerPSModelService("PSDETREENODECOLS", net.ibizsys.psmodel.runtime.service.PSDETreeNodeColRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETREENODERS, net.ibizsys.psmodel.runtime.service.PSDETreeNodeRSRTService.class);
        instance.registerPSModelService("PSDETREENODERS", net.ibizsys.psmodel.runtime.service.PSDETreeNodeRSRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETREENODERV, net.ibizsys.psmodel.runtime.service.PSDETreeNodeRVRTService.class);
        instance.registerPSModelService("PSDETREENODERVS", net.ibizsys.psmodel.runtime.service.PSDETreeNodeRVRTService.class);
        
        instance.registerPSModelService(PSModels.PSDETREEVIEW, net.ibizsys.psmodel.runtime.service.PSDETreeViewRTService.class);
        instance.registerPSModelService("PSDETREEVIEWS", net.ibizsys.psmodel.runtime.service.PSDETreeViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEUAGROUP, net.ibizsys.psmodel.runtime.service.PSDEUAGroupRTService.class);
        instance.registerPSModelService("PSDEUAGROUPS", net.ibizsys.psmodel.runtime.service.PSDEUAGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEUAGROUPDETAIL, net.ibizsys.psmodel.runtime.service.PSDEUAGroupDetailRTService.class);
        instance.registerPSModelService("PSDEUAGROUPDETAILS", net.ibizsys.psmodel.runtime.service.PSDEUAGroupDetailRTService.class);
        instance.registerPSModelService("PSDEUAGRPDETAIL", net.ibizsys.psmodel.runtime.service.PSDEUAGroupDetailRTService.class);
        instance.registerPSModelService("PSDEUAGRPDETAILS", net.ibizsys.psmodel.runtime.service.PSDEUAGroupDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEUIACTION, net.ibizsys.psmodel.runtime.service.PSDEUIActionRTService.class);
        instance.registerPSModelService("PSDEUIACTIONS", net.ibizsys.psmodel.runtime.service.PSDEUIActionRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEUSERROLE, net.ibizsys.psmodel.runtime.service.PSDEUserRoleRTService.class);
        instance.registerPSModelService("PSDEUSERROLES", net.ibizsys.psmodel.runtime.service.PSDEUserRoleRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEUTIL, net.ibizsys.psmodel.runtime.service.PSDEUtilRTService.class);
        instance.registerPSModelService("PSDEUTILS", net.ibizsys.psmodel.runtime.service.PSDEUtilRTService.class);
        instance.registerPSModelService("PSDEUTILDE", net.ibizsys.psmodel.runtime.service.PSDEUtilRTService.class);
        instance.registerPSModelService("PSDEUTILDES", net.ibizsys.psmodel.runtime.service.PSDEUtilRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEVRGROUP, net.ibizsys.psmodel.runtime.service.PSDEVRGroupRTService.class);
        instance.registerPSModelService("PSDEVRGROUPS", net.ibizsys.psmodel.runtime.service.PSDEVRGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEVRGRPDETAIL, net.ibizsys.psmodel.runtime.service.PSDEVRGrpDetailRTService.class);
        instance.registerPSModelService("PSDEVRGRPDETAILS", net.ibizsys.psmodel.runtime.service.PSDEVRGrpDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEVIEWBASE, net.ibizsys.psmodel.runtime.service.PSDEViewBaseRTService.class);
        instance.registerPSModelService("PSDEVIEWBASES", net.ibizsys.psmodel.runtime.service.PSDEViewBaseRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEVIEWCTRL, net.ibizsys.psmodel.runtime.service.PSDEViewCtrlRTService.class);
        instance.registerPSModelService("PSDEVIEWCTRLS", net.ibizsys.psmodel.runtime.service.PSDEViewCtrlRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEVIEWENGINE, net.ibizsys.psmodel.runtime.service.PSDEViewEngineRTService.class);
        instance.registerPSModelService("PSDEVIEWENGINES", net.ibizsys.psmodel.runtime.service.PSDEViewEngineRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEVIEWLOGIC, net.ibizsys.psmodel.runtime.service.PSDEViewLogicRTService.class);
        instance.registerPSModelService("PSDEVIEWLOGICS", net.ibizsys.psmodel.runtime.service.PSDEViewLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEVIEWRV, net.ibizsys.psmodel.runtime.service.PSDEViewRVRTService.class);
        instance.registerPSModelService("PSDEVIEWRVS", net.ibizsys.psmodel.runtime.service.PSDEViewRVRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEWIZARD, net.ibizsys.psmodel.runtime.service.PSDEWizardRTService.class);
        instance.registerPSModelService("PSDEWIZARDS", net.ibizsys.psmodel.runtime.service.PSDEWizardRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEWIZARDFORM, net.ibizsys.psmodel.runtime.service.PSDEWizardFormRTService.class);
        instance.registerPSModelService("PSDEWIZARDFORMS", net.ibizsys.psmodel.runtime.service.PSDEWizardFormRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEWIZARDLOGIC, net.ibizsys.psmodel.runtime.service.PSDEWizardLogicRTService.class);
        instance.registerPSModelService("PSDEWIZARDLOGICS", net.ibizsys.psmodel.runtime.service.PSDEWizardLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEWIZARDSTEP, net.ibizsys.psmodel.runtime.service.PSDEWizardStepRTService.class);
        instance.registerPSModelService("PSDEWIZARDSTEPS", net.ibizsys.psmodel.runtime.service.PSDEWizardStepRTService.class);
        
        instance.registerPSModelService(PSModels.PSLANGUAGE, net.ibizsys.psmodel.runtime.service.PSLanguageRTService.class);
        instance.registerPSModelService("PSLANGUAGES", net.ibizsys.psmodel.runtime.service.PSLanguageRTService.class);
        
        instance.registerPSModelService(PSModels.PSLANGUAGEITEM, net.ibizsys.psmodel.runtime.service.PSLanguageItemRTService.class);
        instance.registerPSModelService("PSLANGUAGEITEMS", net.ibizsys.psmodel.runtime.service.PSLanguageItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSLANGUAGERES, net.ibizsys.psmodel.runtime.service.PSLanguageResRTService.class);
        instance.registerPSModelService("PSLANGUAGERES", net.ibizsys.psmodel.runtime.service.PSLanguageResRTService.class);
        
        instance.registerPSModelService(PSModels.PSMOBAPPPACK, net.ibizsys.psmodel.runtime.service.PSMobAppPackRTService.class);
        instance.registerPSModelService("PSMOBAPPPACKS", net.ibizsys.psmodel.runtime.service.PSMobAppPackRTService.class);
        
        instance.registerPSModelService(PSModels.PSMOBAPPSTARTPAGE, net.ibizsys.psmodel.runtime.service.PSMobAppStartPageRTService.class);
        instance.registerPSModelService("PSMOBAPPSTARTPAGES", net.ibizsys.psmodel.runtime.service.PSMobAppStartPageRTService.class);
        
        instance.registerPSModelService(PSModels.PSPANELENGINE, net.ibizsys.psmodel.runtime.service.PSPanelEngineRTService.class);
        instance.registerPSModelService("PSPANELENGINES", net.ibizsys.psmodel.runtime.service.PSPanelEngineRTService.class);
        
        instance.registerPSModelService(PSModels.PSPANELITEMLOGIC, net.ibizsys.psmodel.runtime.service.PSPanelItemLogicRTService.class);
        instance.registerPSModelService("PSPANELITEMLOGICS", net.ibizsys.psmodel.runtime.service.PSPanelItemLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSSUBSYSSADE, net.ibizsys.psmodel.runtime.service.PSSubSysSADERTService.class);
        instance.registerPSModelService("PSSUBSYSSADES", net.ibizsys.psmodel.runtime.service.PSSubSysSADERTService.class);
        
        instance.registerPSModelService(PSModels.PSSUBSYSSADEFIELD, net.ibizsys.psmodel.runtime.service.PSSubSysSADEFieldRTService.class);
        instance.registerPSModelService("PSSUBSYSSADEFIELDS", net.ibizsys.psmodel.runtime.service.PSSubSysSADEFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSSUBSYSSADERS, net.ibizsys.psmodel.runtime.service.PSSubSysSADERSRTService.class);
        instance.registerPSModelService("PSSUBSYSSADERS", net.ibizsys.psmodel.runtime.service.PSSubSysSADERSRTService.class);
        
        instance.registerPSModelService(PSModels.PSSUBSYSSADETAIL, net.ibizsys.psmodel.runtime.service.PSSubSysSADetailRTService.class);
        instance.registerPSModelService("PSSUBSYSSADETAILS", net.ibizsys.psmodel.runtime.service.PSSubSysSADetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSSUBSYSSADETAILPARAM, net.ibizsys.psmodel.runtime.service.PSSubSysSADetailParamRTService.class);
        instance.registerPSModelService("PSSUBSYSSADETAILPARAMS", net.ibizsys.psmodel.runtime.service.PSSubSysSADetailParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSSUBSYSSERVICEAPI, net.ibizsys.psmodel.runtime.service.PSSubSysServiceAPIRTService.class);
        instance.registerPSModelService("PSSUBSYSSERVICEAPIS", net.ibizsys.psmodel.runtime.service.PSSubSysServiceAPIRTService.class);
        
        instance.registerPSModelService(PSModels.PSSUBVIEWTYPE, net.ibizsys.psmodel.runtime.service.PSSubViewTypeRTService.class);
        instance.registerPSModelService("PSSUBVIEWTYPES", net.ibizsys.psmodel.runtime.service.PSSubViewTypeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSACTOR, net.ibizsys.psmodel.runtime.service.PSSysActorRTService.class);
        instance.registerPSModelService("PSSYSACTORS", net.ibizsys.psmodel.runtime.service.PSSysActorRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSAPP, net.ibizsys.psmodel.runtime.service.PSSysAppRTService.class);
        instance.registerPSModelService("PSSYSAPPS", net.ibizsys.psmodel.runtime.service.PSSysAppRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDCOLSET, net.ibizsys.psmodel.runtime.service.PSSysBDColSetRTService.class);
        instance.registerPSModelService("PSSYSBDCOLSETS", net.ibizsys.psmodel.runtime.service.PSSysBDColSetRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDCOLUMN, net.ibizsys.psmodel.runtime.service.PSSysBDColumnRTService.class);
        instance.registerPSModelService("PSSYSBDCOLUMNS", net.ibizsys.psmodel.runtime.service.PSSysBDColumnRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDINSTCFG, net.ibizsys.psmodel.runtime.service.PSSysBDInstCfgRTService.class);
        instance.registerPSModelService("PSSYSBDINSTCFGS", net.ibizsys.psmodel.runtime.service.PSSysBDInstCfgRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDMODULE, net.ibizsys.psmodel.runtime.service.PSSysBDModuleRTService.class);
        instance.registerPSModelService("PSSYSBDMODULES", net.ibizsys.psmodel.runtime.service.PSSysBDModuleRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDPART, net.ibizsys.psmodel.runtime.service.PSSysBDPartRTService.class);
        instance.registerPSModelService("PSSYSBDPARTS", net.ibizsys.psmodel.runtime.service.PSSysBDPartRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDSCHEME, net.ibizsys.psmodel.runtime.service.PSSysBDSchemeRTService.class);
        instance.registerPSModelService("PSSYSBDSCHEMES", net.ibizsys.psmodel.runtime.service.PSSysBDSchemeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDTABLE, net.ibizsys.psmodel.runtime.service.PSSysBDTableRTService.class);
        instance.registerPSModelService("PSSYSBDTABLES", net.ibizsys.psmodel.runtime.service.PSSysBDTableRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDTABLEDE, net.ibizsys.psmodel.runtime.service.PSSysBDTableDERTService.class);
        instance.registerPSModelService("PSSYSBDTABLEDES", net.ibizsys.psmodel.runtime.service.PSSysBDTableDERTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDTABLEDER, net.ibizsys.psmodel.runtime.service.PSSysBDTableDERRTService.class);
        instance.registerPSModelService("PSSYSBDTABLEDERS", net.ibizsys.psmodel.runtime.service.PSSysBDTableDERRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBDTABLERS, net.ibizsys.psmodel.runtime.service.PSSysBDTableRSRTService.class);
        instance.registerPSModelService("PSSYSBDTABLERS", net.ibizsys.psmodel.runtime.service.PSSysBDTableRSRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBIAGGCOLUMN, net.ibizsys.psmodel.runtime.service.PSSysBIAggColumnRTService.class);
        instance.registerPSModelService("PSSYSBIAGGCOLUMNS", net.ibizsys.psmodel.runtime.service.PSSysBIAggColumnRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBIAGGTABLE, net.ibizsys.psmodel.runtime.service.PSSysBIAggTableRTService.class);
        instance.registerPSModelService("PSSYSBIAGGTABLES", net.ibizsys.psmodel.runtime.service.PSSysBIAggTableRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBICUBE, net.ibizsys.psmodel.runtime.service.PSSysBICubeRTService.class);
        instance.registerPSModelService("PSSYSBICUBES", net.ibizsys.psmodel.runtime.service.PSSysBICubeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBICUBEDIMENSION, net.ibizsys.psmodel.runtime.service.PSSysBICubeDimensionRTService.class);
        instance.registerPSModelService("PSSYSBICUBEDIMENSIONS", net.ibizsys.psmodel.runtime.service.PSSysBICubeDimensionRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBICUBELEVEL, net.ibizsys.psmodel.runtime.service.PSSysBICubeLevelRTService.class);
        instance.registerPSModelService("PSSYSBICUBELEVELS", net.ibizsys.psmodel.runtime.service.PSSysBICubeLevelRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBICUBEMEASURE, net.ibizsys.psmodel.runtime.service.PSSysBICubeMeasureRTService.class);
        instance.registerPSModelService("PSSYSBICUBEMEASURES", net.ibizsys.psmodel.runtime.service.PSSysBICubeMeasureRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBIDIMENSION, net.ibizsys.psmodel.runtime.service.PSSysBIDimensionRTService.class);
        instance.registerPSModelService("PSSYSBIDIMENSIONS", net.ibizsys.psmodel.runtime.service.PSSysBIDimensionRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBIHIERARCHY, net.ibizsys.psmodel.runtime.service.PSSysBIHierarchyRTService.class);
        instance.registerPSModelService("PSSYSBIHIERARCHIES", net.ibizsys.psmodel.runtime.service.PSSysBIHierarchyRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBILEVEL, net.ibizsys.psmodel.runtime.service.PSSysBILevelRTService.class);
        instance.registerPSModelService("PSSYSBILEVELS", net.ibizsys.psmodel.runtime.service.PSSysBILevelRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBISCHEME, net.ibizsys.psmodel.runtime.service.PSSysBISchemeRTService.class);
        instance.registerPSModelService("PSSYSBISCHEMES", net.ibizsys.psmodel.runtime.service.PSSysBISchemeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSBACKSERVICE, net.ibizsys.psmodel.runtime.service.PSSysBackServiceRTService.class);
        instance.registerPSModelService("PSSYSBACKSERVICES", net.ibizsys.psmodel.runtime.service.PSSysBackServiceRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCALENDAR, net.ibizsys.psmodel.runtime.service.PSSysCalendarRTService.class);
        instance.registerPSModelService("PSSYSCALENDARS", net.ibizsys.psmodel.runtime.service.PSSysCalendarRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCALENDARITEM, net.ibizsys.psmodel.runtime.service.PSSysCalendarItemRTService.class);
        instance.registerPSModelService("PSSYSCALENDARITEMS", net.ibizsys.psmodel.runtime.service.PSSysCalendarItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCALENDARITEMRV, net.ibizsys.psmodel.runtime.service.PSSysCalendarItemRVRTService.class);
        instance.registerPSModelService("PSSYSCALENDARITEMRVS", net.ibizsys.psmodel.runtime.service.PSSysCalendarItemRVRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCALENDARLOGIC, net.ibizsys.psmodel.runtime.service.PSSysCalendarLogicRTService.class);
        instance.registerPSModelService("PSSYSCALENDARLOGICS", net.ibizsys.psmodel.runtime.service.PSSysCalendarLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCANVAS, net.ibizsys.psmodel.runtime.service.PSSysCanvasRTService.class);
        instance.registerPSModelService("PSSYSCANVAS", net.ibizsys.psmodel.runtime.service.PSSysCanvasRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCANVASMODEL, net.ibizsys.psmodel.runtime.service.PSSysCanvasModelRTService.class);
        instance.registerPSModelService("PSSYSCANVASMODELS", net.ibizsys.psmodel.runtime.service.PSSysCanvasModelRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCHARTTHEME, net.ibizsys.psmodel.runtime.service.PSSysChartThemeRTService.class);
        instance.registerPSModelService("PSSYSCHARTTHEMES", net.ibizsys.psmodel.runtime.service.PSSysChartThemeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCODESNIPPET, net.ibizsys.psmodel.runtime.service.PSSysCodeSnippetRTService.class);
        instance.registerPSModelService("PSSYSCODESNIPPETS", net.ibizsys.psmodel.runtime.service.PSSysCodeSnippetRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCONTENT, net.ibizsys.psmodel.runtime.service.PSSysContentRTService.class);
        instance.registerPSModelService("PSSYSCONTENTS", net.ibizsys.psmodel.runtime.service.PSSysContentRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCONTENTCAT, net.ibizsys.psmodel.runtime.service.PSSysContentCatRTService.class);
        instance.registerPSModelService("PSSYSCONTENTCATS", net.ibizsys.psmodel.runtime.service.PSSysContentCatRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCOUNTER, net.ibizsys.psmodel.runtime.service.PSSysCounterRTService.class);
        instance.registerPSModelService("PSSYSCOUNTERS", net.ibizsys.psmodel.runtime.service.PSSysCounterRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCOUNTERITEM, net.ibizsys.psmodel.runtime.service.PSSysCounterItemRTService.class);
        instance.registerPSModelService("PSSYSCOUNTERITEMS", net.ibizsys.psmodel.runtime.service.PSSysCounterItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCSS, net.ibizsys.psmodel.runtime.service.PSSysCssRTService.class);
        instance.registerPSModelService("PSSYSCSSES", net.ibizsys.psmodel.runtime.service.PSSysCssRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSCSSCAT, net.ibizsys.psmodel.runtime.service.PSSysCssCatRTService.class);
        instance.registerPSModelService("PSSYSCSSCATS", net.ibizsys.psmodel.runtime.service.PSSysCssCatRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDBCOLUMN, net.ibizsys.psmodel.runtime.service.PSSysDBColumnRTService.class);
        instance.registerPSModelService("PSSYSDBCOLUMNS", net.ibizsys.psmodel.runtime.service.PSSysDBColumnRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDBPART, net.ibizsys.psmodel.runtime.service.PSSysDBPartRTService.class);
        instance.registerPSModelService("PSSYSDBPARTS", net.ibizsys.psmodel.runtime.service.PSSysDBPartRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDBPROC, net.ibizsys.psmodel.runtime.service.PSSysDBProcRTService.class);
        instance.registerPSModelService("PSSYSDBPROCS", net.ibizsys.psmodel.runtime.service.PSSysDBProcRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDBPROCPARAM, net.ibizsys.psmodel.runtime.service.PSSysDBProcParamRTService.class);
        instance.registerPSModelService("PSSYSDBPROCPARAMS", net.ibizsys.psmodel.runtime.service.PSSysDBProcParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDBSCHEME, net.ibizsys.psmodel.runtime.service.PSSysDBSchemeRTService.class);
        instance.registerPSModelService("PSSYSDBSCHEMES", net.ibizsys.psmodel.runtime.service.PSSysDBSchemeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDBTABLE, net.ibizsys.psmodel.runtime.service.PSSysDBTableRTService.class);
        instance.registerPSModelService("PSSYSDBTABLES", net.ibizsys.psmodel.runtime.service.PSSysDBTableRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDBVF, net.ibizsys.psmodel.runtime.service.PSSysDBVFRTService.class);
        instance.registerPSModelService("PSSYSDBVFS", net.ibizsys.psmodel.runtime.service.PSSysDBVFRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDEFTYPE, net.ibizsys.psmodel.runtime.service.PSSysDEFTypeRTService.class);
        instance.registerPSModelService("PSSYSDEFTYPES", net.ibizsys.psmodel.runtime.service.PSSysDEFTypeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDELOGICNODE, net.ibizsys.psmodel.runtime.service.PSSysDELogicNodeRTService.class);
        instance.registerPSModelService("PSSYSDELOGICNODES", net.ibizsys.psmodel.runtime.service.PSSysDELogicNodeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDMITEM, net.ibizsys.psmodel.runtime.service.PSSysDMItemRTService.class);
        instance.registerPSModelService("PSSYSDMITEMS", net.ibizsys.psmodel.runtime.service.PSSysDMItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDMVER, net.ibizsys.psmodel.runtime.service.PSSysDMVerRTService.class);
        instance.registerPSModelService("PSSYSDMVERS", net.ibizsys.psmodel.runtime.service.PSSysDMVerRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDASHBOARD, net.ibizsys.psmodel.runtime.service.PSSysDashboardRTService.class);
        instance.registerPSModelService("PSSYSDASHBOARDS", net.ibizsys.psmodel.runtime.service.PSSysDashboardRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDASHBOARDLOGIC, net.ibizsys.psmodel.runtime.service.PSSysDashboardLogicRTService.class);
        instance.registerPSModelService("PSSYSDASHBOARDLOGICS", net.ibizsys.psmodel.runtime.service.PSSysDashboardLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDATASYNCAGENT, net.ibizsys.psmodel.runtime.service.PSSysDataSyncAgentRTService.class);
        instance.registerPSModelService("PSSYSDATASYNCAGENTS", net.ibizsys.psmodel.runtime.service.PSSysDataSyncAgentRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDICTCAT, net.ibizsys.psmodel.runtime.service.PSSysDictCatRTService.class);
        instance.registerPSModelService("PSSYSDICTCATS", net.ibizsys.psmodel.runtime.service.PSSysDictCatRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDYNAMODEL, net.ibizsys.psmodel.runtime.service.PSSysDynaModelRTService.class);
        instance.registerPSModelService("PSSYSDYNAMODELS", net.ibizsys.psmodel.runtime.service.PSSysDynaModelRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDYNAMODELATTR, net.ibizsys.psmodel.runtime.service.PSSysDynaModelAttrRTService.class);
        instance.registerPSModelService("PSSYSDYNAMODELATTRS", net.ibizsys.psmodel.runtime.service.PSSysDynaModelAttrRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSDYNAMODELCAT, net.ibizsys.psmodel.runtime.service.PSSysDynaModelCatRTService.class);
        instance.registerPSModelService("PSSYSDYNAMODELCATS", net.ibizsys.psmodel.runtime.service.PSSysDynaModelCatRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIDE, net.ibizsys.psmodel.runtime.service.PSSysEAIDERTService.class);
        instance.registerPSModelService("PSSYSEAIDES", net.ibizsys.psmodel.runtime.service.PSSysEAIDERTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIDEFIELD, net.ibizsys.psmodel.runtime.service.PSSysEAIDEFieldRTService.class);
        instance.registerPSModelService("PSSYSEAIDEFIELDS", net.ibizsys.psmodel.runtime.service.PSSysEAIDEFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIDER, net.ibizsys.psmodel.runtime.service.PSSysEAIDERRTService.class);
        instance.registerPSModelService("PSSYSEAIDERS", net.ibizsys.psmodel.runtime.service.PSSysEAIDERRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIDATATYPE, net.ibizsys.psmodel.runtime.service.PSSysEAIDataTypeRTService.class);
        instance.registerPSModelService("PSSYSEAIDATATYPES", net.ibizsys.psmodel.runtime.service.PSSysEAIDataTypeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIDATATYPEITEM, net.ibizsys.psmodel.runtime.service.PSSysEAIDataTypeItemRTService.class);
        instance.registerPSModelService("PSSYSEAIDATATYPEITEMS", net.ibizsys.psmodel.runtime.service.PSSysEAIDataTypeItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIELEMENT, net.ibizsys.psmodel.runtime.service.PSSysEAIElementRTService.class);
        instance.registerPSModelService("PSSYSEAIELEMENTS", net.ibizsys.psmodel.runtime.service.PSSysEAIElementRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIELEMENTATTR, net.ibizsys.psmodel.runtime.service.PSSysEAIElementAttrRTService.class);
        instance.registerPSModelService("PSSYSEAIELEMENTATTRS", net.ibizsys.psmodel.runtime.service.PSSysEAIElementAttrRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAIELEMENTRE, net.ibizsys.psmodel.runtime.service.PSSysEAIElementRERTService.class);
        instance.registerPSModelService("PSSYSEAIELEMENTRES", net.ibizsys.psmodel.runtime.service.PSSysEAIElementRERTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEAISCHEME, net.ibizsys.psmodel.runtime.service.PSSysEAISchemeRTService.class);
        instance.registerPSModelService("PSSYSEAISCHEMES", net.ibizsys.psmodel.runtime.service.PSSysEAISchemeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSERMAP, net.ibizsys.psmodel.runtime.service.PSSysERMapRTService.class);
        instance.registerPSModelService("PSSYSERMAPS", net.ibizsys.psmodel.runtime.service.PSSysERMapRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSERMAPNODE, net.ibizsys.psmodel.runtime.service.PSSysERMapNodeRTService.class);
        instance.registerPSModelService("PSSYSERMAPNODES", net.ibizsys.psmodel.runtime.service.PSSysERMapNodeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSEDITORSTYLE, net.ibizsys.psmodel.runtime.service.PSSysEditorStyleRTService.class);
        instance.registerPSModelService("PSSYSEDITORSTYLES", net.ibizsys.psmodel.runtime.service.PSSysEditorStyleRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSIMAGE, net.ibizsys.psmodel.runtime.service.PSSysImageRTService.class);
        instance.registerPSModelService("PSSYSIMAGES", net.ibizsys.psmodel.runtime.service.PSSysImageRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSMAPITEM, net.ibizsys.psmodel.runtime.service.PSSysMapItemRTService.class);
        instance.registerPSModelService("PSSYSMAPITEMS", net.ibizsys.psmodel.runtime.service.PSSysMapItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSMAPLOGIC, net.ibizsys.psmodel.runtime.service.PSSysMapLogicRTService.class);
        instance.registerPSModelService("PSSYSMAPLOGICS", net.ibizsys.psmodel.runtime.service.PSSysMapLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSMAPVIEW, net.ibizsys.psmodel.runtime.service.PSSysMapViewRTService.class);
        instance.registerPSModelService("PSSYSMAPVIEWS", net.ibizsys.psmodel.runtime.service.PSSysMapViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSMODELGROUP, net.ibizsys.psmodel.runtime.service.PSSysModelGroupRTService.class);
        instance.registerPSModelService("PSSYSMODELGROUPS", net.ibizsys.psmodel.runtime.service.PSSysModelGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSMSGQUEUE, net.ibizsys.psmodel.runtime.service.PSSysMsgQueueRTService.class);
        instance.registerPSModelService("PSSYSMSGQUEUES", net.ibizsys.psmodel.runtime.service.PSSysMsgQueueRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSMSGTARGET, net.ibizsys.psmodel.runtime.service.PSSysMsgTargetRTService.class);
        instance.registerPSModelService("PSSYSMSGTARGETS", net.ibizsys.psmodel.runtime.service.PSSysMsgTargetRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSMSGTEMPL, net.ibizsys.psmodel.runtime.service.PSSysMsgTemplRTService.class);
        instance.registerPSModelService("PSSYSMSGTEMPLS", net.ibizsys.psmodel.runtime.service.PSSysMsgTemplRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUSERROLE, net.ibizsys.psmodel.runtime.service.PSSysUserRoleRTService.class);
        instance.registerPSModelService("PSSYSUSERROLES", net.ibizsys.psmodel.runtime.service.PSSysUserRoleRTService.class);
        instance.registerPSModelService("PSSYSOPPRIV", net.ibizsys.psmodel.runtime.service.PSSysUserRoleRTService.class);
        instance.registerPSModelService("PSSYSOPPRIVS", net.ibizsys.psmodel.runtime.service.PSSysUserRoleRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSPDTVIEW, net.ibizsys.psmodel.runtime.service.PSSysPDTViewRTService.class);
        instance.registerPSModelService("PSSYSPDTVIEWS", net.ibizsys.psmodel.runtime.service.PSSysPDTViewRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSPFPITEMPL, net.ibizsys.psmodel.runtime.service.PSSysPFPITemplRTService.class);
        instance.registerPSModelService("PSSYSPFPITEMPLS", net.ibizsys.psmodel.runtime.service.PSSysPFPITemplRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSPFPLUGIN, net.ibizsys.psmodel.runtime.service.PSSysPFPluginRTService.class);
        instance.registerPSModelService("PSSYSPFPLUGINS", net.ibizsys.psmodel.runtime.service.PSSysPFPluginRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSPORTLET, net.ibizsys.psmodel.runtime.service.PSSysPortletRTService.class);
        instance.registerPSModelService("PSSYSPORTLETS", net.ibizsys.psmodel.runtime.service.PSSysPortletRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSPORTLETCAT, net.ibizsys.psmodel.runtime.service.PSSysPortletCatRTService.class);
        instance.registerPSModelService("PSSYSPORTLETCATS", net.ibizsys.psmodel.runtime.service.PSSysPortletCatRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSREF, net.ibizsys.psmodel.runtime.service.PSSysRefRTService.class);
        instance.registerPSModelService("PSSYSREFS", net.ibizsys.psmodel.runtime.service.PSSysRefRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSREQITEM, net.ibizsys.psmodel.runtime.service.PSSysReqItemRTService.class);
        instance.registerPSModelService("PSSYSREQITEMS", net.ibizsys.psmodel.runtime.service.PSSysReqItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSREQITEMDATA, net.ibizsys.psmodel.runtime.service.PSSysReqItemDataRTService.class);
        instance.registerPSModelService("PSSYSREQITEMDATA", net.ibizsys.psmodel.runtime.service.PSSysReqItemDataRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSREQITEMHIS, net.ibizsys.psmodel.runtime.service.PSSysReqItemHisRTService.class);
        instance.registerPSModelService("PSSYSREQITEMHIS", net.ibizsys.psmodel.runtime.service.PSSysReqItemHisRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSREQMODULE, net.ibizsys.psmodel.runtime.service.PSSysReqModuleRTService.class);
        instance.registerPSModelService("PSSYSREQMODULES", net.ibizsys.psmodel.runtime.service.PSSysReqModuleRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSRESOURCE, net.ibizsys.psmodel.runtime.service.PSSysResourceRTService.class);
        instance.registerPSModelService("PSSYSRESOURCES", net.ibizsys.psmodel.runtime.service.PSSysResourceRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSAHANDLER, net.ibizsys.psmodel.runtime.service.PSSysSAHandlerRTService.class);
        instance.registerPSModelService("PSSYSSAHANDLERS", net.ibizsys.psmodel.runtime.service.PSSysSAHandlerRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSFPITEMPL, net.ibizsys.psmodel.runtime.service.PSSysSFPITemplRTService.class);
        instance.registerPSModelService("PSSYSSFPITEMPLS", net.ibizsys.psmodel.runtime.service.PSSysSFPITemplRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSFPLUGIN, net.ibizsys.psmodel.runtime.service.PSSysSFPluginRTService.class);
        instance.registerPSModelService("PSSYSSFPLUGINS", net.ibizsys.psmodel.runtime.service.PSSysSFPluginRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSFPUB, net.ibizsys.psmodel.runtime.service.PSSysSFPubRTService.class);
        instance.registerPSModelService("PSSYSSFPUBS", net.ibizsys.psmodel.runtime.service.PSSysSFPubRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSFPUBPKG, net.ibizsys.psmodel.runtime.service.PSSysSFPubPkgRTService.class);
        instance.registerPSModelService("PSSYSSFPUBPKGS", net.ibizsys.psmodel.runtime.service.PSSysSFPubPkgRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSAMPLEVALUE, net.ibizsys.psmodel.runtime.service.PSSysSampleValueRTService.class);
        instance.registerPSModelService("PSSYSSAMPLEVALUES", net.ibizsys.psmodel.runtime.service.PSSysSampleValueRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHBAR, net.ibizsys.psmodel.runtime.service.PSSysSearchBarRTService.class);
        instance.registerPSModelService("PSSYSSEARCHBARS", net.ibizsys.psmodel.runtime.service.PSSysSearchBarRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHBARITEM, net.ibizsys.psmodel.runtime.service.PSSysSearchBarItemRTService.class);
        instance.registerPSModelService("PSSYSSEARCHBARITEMS", net.ibizsys.psmodel.runtime.service.PSSysSearchBarItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHBARLOGIC, net.ibizsys.psmodel.runtime.service.PSSysSearchBarLogicRTService.class);
        instance.registerPSModelService("PSSYSSEARCHBARLOGICS", net.ibizsys.psmodel.runtime.service.PSSysSearchBarLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHDE, net.ibizsys.psmodel.runtime.service.PSSysSearchDERTService.class);
        instance.registerPSModelService("PSSYSSEARCHDES", net.ibizsys.psmodel.runtime.service.PSSysSearchDERTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHDEFIELD, net.ibizsys.psmodel.runtime.service.PSSysSearchDEFieldRTService.class);
        instance.registerPSModelService("PSSYSSEARCHDEFIELDS", net.ibizsys.psmodel.runtime.service.PSSysSearchDEFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHDOC, net.ibizsys.psmodel.runtime.service.PSSysSearchDocRTService.class);
        instance.registerPSModelService("PSSYSSEARCHDOCS", net.ibizsys.psmodel.runtime.service.PSSysSearchDocRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHFIELD, net.ibizsys.psmodel.runtime.service.PSSysSearchFieldRTService.class);
        instance.registerPSModelService("PSSYSSEARCHFIELDS", net.ibizsys.psmodel.runtime.service.PSSysSearchFieldRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEARCHSCHEME, net.ibizsys.psmodel.runtime.service.PSSysSearchSchemeRTService.class);
        instance.registerPSModelService("PSSYSSEARCHSCHEMES", net.ibizsys.psmodel.runtime.service.PSSysSearchSchemeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSEQUENCE, net.ibizsys.psmodel.runtime.service.PSSysSequenceRTService.class);
        instance.registerPSModelService("PSSYSSEQUENCES", net.ibizsys.psmodel.runtime.service.PSSysSequenceRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSSERVICEAPI, net.ibizsys.psmodel.runtime.service.PSSysServiceAPIRTService.class);
        instance.registerPSModelService("PSSYSSERVICEAPIS", net.ibizsys.psmodel.runtime.service.PSSysServiceAPIRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTCASSERT, net.ibizsys.psmodel.runtime.service.PSSysTCAssertRTService.class);
        instance.registerPSModelService("PSSYSTCASSERTS", net.ibizsys.psmodel.runtime.service.PSSysTCAssertRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTCINPUT, net.ibizsys.psmodel.runtime.service.PSSysTCInputRTService.class);
        instance.registerPSModelService("PSSYSTCINPUTS", net.ibizsys.psmodel.runtime.service.PSSysTCInputRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTDITEM, net.ibizsys.psmodel.runtime.service.PSSysTDItemRTService.class);
        instance.registerPSModelService("PSSYSTDITEMS", net.ibizsys.psmodel.runtime.service.PSSysTDItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTESTCASE, net.ibizsys.psmodel.runtime.service.PSSysTestCaseRTService.class);
        instance.registerPSModelService("PSSYSTESTCASES", net.ibizsys.psmodel.runtime.service.PSSysTestCaseRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTESTDATA, net.ibizsys.psmodel.runtime.service.PSSysTestDataRTService.class);
        instance.registerPSModelService("PSSYSTESTDATA", net.ibizsys.psmodel.runtime.service.PSSysTestDataRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTESTMODULE, net.ibizsys.psmodel.runtime.service.PSSysTestModuleRTService.class);
        instance.registerPSModelService("PSSYSTESTMODULES", net.ibizsys.psmodel.runtime.service.PSSysTestModuleRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTESTPRJ, net.ibizsys.psmodel.runtime.service.PSSysTestPrjRTService.class);
        instance.registerPSModelService("PSSYSTESTPRJS", net.ibizsys.psmodel.runtime.service.PSSysTestPrjRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTRANSLATOR, net.ibizsys.psmodel.runtime.service.PSSysTranslatorRTService.class);
        instance.registerPSModelService("PSSYSTRANSLATORS", net.ibizsys.psmodel.runtime.service.PSSysTranslatorRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUCMAP, net.ibizsys.psmodel.runtime.service.PSSysUCMapRTService.class);
        instance.registerPSModelService("PSSYSUCMAPS", net.ibizsys.psmodel.runtime.service.PSSysUCMapRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUCMAPNODE, net.ibizsys.psmodel.runtime.service.PSSysUCMapNodeRTService.class);
        instance.registerPSModelService("PSSYSUCMAPNODES", net.ibizsys.psmodel.runtime.service.PSSysUCMapNodeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUNIRES, net.ibizsys.psmodel.runtime.service.PSSysUniResRTService.class);
        instance.registerPSModelService("PSSYSUNIRES", net.ibizsys.psmodel.runtime.service.PSSysUniResRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUNISTATE, net.ibizsys.psmodel.runtime.service.PSSysUniStateRTService.class);
        instance.registerPSModelService("PSSYSUNISTATES", net.ibizsys.psmodel.runtime.service.PSSysUniStateRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUNIT, net.ibizsys.psmodel.runtime.service.PSSysUnitRTService.class);
        instance.registerPSModelService("PSSYSUNITS", net.ibizsys.psmodel.runtime.service.PSSysUnitRTService.class);
        
//        instance.registerPSModelService(PSModels.PSSYSUSECASECAT, net.ibizsys.psmodel.runtime.service.PSSysUseCaseCatRTService.class);
//        instance.registerPSModelService("PSSYSUSECASECATS", net.ibizsys.psmodel.runtime.service.PSSysUseCaseCatRTService.class);
//        
//        instance.registerPSModelService(PSModels.PSSYSUSECASE, net.ibizsys.psmodel.runtime.service.PSSysUseCaseRTService.class);
//        instance.registerPSModelService("PSSYSUSECASES", net.ibizsys.psmodel.runtime.service.PSSysUseCaseRTService.class);
//        instance.registerPSModelService("PSSYSUSERCASE", net.ibizsys.psmodel.runtime.service.PSSysUseCaseRTService.class);
//        instance.registerPSModelService("PSSYSUSERCASES", net.ibizsys.psmodel.runtime.service.PSSysUseCaseRTService.class);
//        
//        instance.registerPSModelService(PSModels.PSSYSUSECASERS, net.ibizsys.psmodel.runtime.service.PSSysUseCaseRSRTService.class);
//        instance.registerPSModelService("PSSYSUSECASERS", net.ibizsys.psmodel.runtime.service.PSSysUseCaseRSRTService.class);
//        instance.registerPSModelService("PSSYSUSERCASERS", net.ibizsys.psmodel.runtime.service.PSSysUseCaseRSRTService.class);
//        instance.registerPSModelService("PSSYSUSERCASERS", net.ibizsys.psmodel.runtime.service.PSSysUseCaseRSRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUSERDR, net.ibizsys.psmodel.runtime.service.PSSysUserDRRTService.class);
        instance.registerPSModelService("PSSYSUSERDRS", net.ibizsys.psmodel.runtime.service.PSSysUserDRRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUSERMODE, net.ibizsys.psmodel.runtime.service.PSSysUserModeRTService.class);
        instance.registerPSModelService("PSSYSUSERMODES", net.ibizsys.psmodel.runtime.service.PSSysUserModeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUSERROLEDATA, net.ibizsys.psmodel.runtime.service.PSSysUserRoleDataRTService.class);
        instance.registerPSModelService("PSSYSUSERROLEDATA", net.ibizsys.psmodel.runtime.service.PSSysUserRoleDataRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUSERROLERES, net.ibizsys.psmodel.runtime.service.PSSysUserRoleResRTService.class);
        instance.registerPSModelService("PSSYSUSERROLERES", net.ibizsys.psmodel.runtime.service.PSSysUserRoleResRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSUTIL, net.ibizsys.psmodel.runtime.service.PSSysUtilRTService.class);
        instance.registerPSModelService("PSSYSUTILS", net.ibizsys.psmodel.runtime.service.PSSysUtilRTService.class);
        instance.registerPSModelService("PSSYSUTILDE", net.ibizsys.psmodel.runtime.service.PSSysUtilRTService.class);
        instance.registerPSModelService("PSSYSUTILDES", net.ibizsys.psmodel.runtime.service.PSSysUtilRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSVALUERULE, net.ibizsys.psmodel.runtime.service.PSSysValueRuleRTService.class);
        instance.registerPSModelService("PSSYSVALUERULES", net.ibizsys.psmodel.runtime.service.PSSysValueRuleRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSVIEWLOGIC, net.ibizsys.psmodel.runtime.service.PSSysViewLogicRTService.class);
        instance.registerPSModelService("PSSYSVIEWLOGICS", net.ibizsys.psmodel.runtime.service.PSSysViewLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSVIEWLOGICPARAM, net.ibizsys.psmodel.runtime.service.PSSysViewLogicParamRTService.class);
        instance.registerPSModelService("PSSYSVIEWLOGICPARAMS", net.ibizsys.psmodel.runtime.service.PSSysViewLogicParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSVIEWPANEL, net.ibizsys.psmodel.runtime.service.PSSysViewPanelRTService.class);
        instance.registerPSModelService("PSSYSVIEWPANELS", net.ibizsys.psmodel.runtime.service.PSSysViewPanelRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSVIEWPANELITEM, net.ibizsys.psmodel.runtime.service.PSSysViewPanelItemRTService.class);
        instance.registerPSModelService("PSSYSVIEWPANELITEMS", net.ibizsys.psmodel.runtime.service.PSSysViewPanelItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSVIEWPANELLOGIC, net.ibizsys.psmodel.runtime.service.PSSysViewPanelLogicRTService.class);
        instance.registerPSModelService("PSSYSVIEWPANELLOGICS", net.ibizsys.psmodel.runtime.service.PSSysViewPanelLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSVIEWPANELMODEL, net.ibizsys.psmodel.runtime.service.PSSysViewPanelModelRTService.class);
        instance.registerPSModelService("PSSYSVIEWPANELMODELS", net.ibizsys.psmodel.runtime.service.PSSysViewPanelModelRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSWFCAT, net.ibizsys.psmodel.runtime.service.PSSysWFCatRTService.class);
        instance.registerPSModelService("PSSYSWFCATS", net.ibizsys.psmodel.runtime.service.PSSysWFCatRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSWFMODE, net.ibizsys.psmodel.runtime.service.PSSysWFModeRTService.class);
        instance.registerPSModelService("PSSYSWFMODES", net.ibizsys.psmodel.runtime.service.PSSysWFModeRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSWFSETTING, net.ibizsys.psmodel.runtime.service.PSSysWFSettingRTService.class);
        instance.registerPSModelService("PSSYSWFSETTINGS", net.ibizsys.psmodel.runtime.service.PSSysWFSettingRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTEMDBCFG, net.ibizsys.psmodel.runtime.service.PSSystemDBCfgRTService.class);
        instance.registerPSModelService("PSSYSTEMDBCFGS", net.ibizsys.psmodel.runtime.service.PSSystemDBCfgRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSTEMRUN, net.ibizsys.psmodel.runtime.service.PSSystemRunRTService.class);
        instance.registerPSModelService("PSSYSTEMRUNS", net.ibizsys.psmodel.runtime.service.PSSystemRunRTService.class);
        
        instance.registerPSModelService(PSModels.PSTHRESHOLD, net.ibizsys.psmodel.runtime.service.PSThresholdRTService.class);
        instance.registerPSModelService("PSTHRESHOLDS", net.ibizsys.psmodel.runtime.service.PSThresholdRTService.class);
        
        instance.registerPSModelService(PSModels.PSTHRESHOLDGROUP, net.ibizsys.psmodel.runtime.service.PSThresholdGroupRTService.class);
        instance.registerPSModelService("PSTHRESHOLDGROUPS", net.ibizsys.psmodel.runtime.service.PSThresholdGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSVIEWMSG, net.ibizsys.psmodel.runtime.service.PSViewMsgRTService.class);
        instance.registerPSModelService("PSVIEWMSGS", net.ibizsys.psmodel.runtime.service.PSViewMsgRTService.class);
        
        instance.registerPSModelService(PSModels.PSVIEWMSGGROUP, net.ibizsys.psmodel.runtime.service.PSViewMsgGroupRTService.class);
        instance.registerPSModelService("PSVIEWMSGGROUPS", net.ibizsys.psmodel.runtime.service.PSViewMsgGroupRTService.class);
        
        instance.registerPSModelService(PSModels.PSVIEWMSGGRPDETAIL, net.ibizsys.psmodel.runtime.service.PSViewMsgGrpDetailRTService.class);
        instance.registerPSModelService("PSVIEWMSGGRPDETAILS", net.ibizsys.psmodel.runtime.service.PSViewMsgGrpDetailRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFDE, net.ibizsys.psmodel.runtime.service.PSWFDERTService.class);
        instance.registerPSModelService("PSWFDES", net.ibizsys.psmodel.runtime.service.PSWFDERTService.class);
        
        instance.registerPSModelService(PSModels.PSWFLINK, net.ibizsys.psmodel.runtime.service.PSWFLinkRTService.class);
        instance.registerPSModelService("PSWFLINKS", net.ibizsys.psmodel.runtime.service.PSWFLinkRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFLINKCOND, net.ibizsys.psmodel.runtime.service.PSWFLinkCondRTService.class);
        instance.registerPSModelService("PSWFLINKCONDS", net.ibizsys.psmodel.runtime.service.PSWFLinkCondRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFLINKROLE, net.ibizsys.psmodel.runtime.service.PSWFLinkRoleRTService.class);
        instance.registerPSModelService("PSWFLINKROLES", net.ibizsys.psmodel.runtime.service.PSWFLinkRoleRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFPROCPARAM, net.ibizsys.psmodel.runtime.service.PSWFProcParamRTService.class);
        instance.registerPSModelService("PSWFPROCPARAMS", net.ibizsys.psmodel.runtime.service.PSWFProcParamRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFPROCROLE, net.ibizsys.psmodel.runtime.service.PSWFProcRoleRTService.class);
        instance.registerPSModelService("PSWFPROCROLES", net.ibizsys.psmodel.runtime.service.PSWFProcRoleRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFPROCSUBWF, net.ibizsys.psmodel.runtime.service.PSWFProcSubWFRTService.class);
        instance.registerPSModelService("PSWFPROCSUBWFS", net.ibizsys.psmodel.runtime.service.PSWFProcSubWFRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFPROCESS, net.ibizsys.psmodel.runtime.service.PSWFProcessRTService.class);
        instance.registerPSModelService("PSWFPROCESSES", net.ibizsys.psmodel.runtime.service.PSWFProcessRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFROLE, net.ibizsys.psmodel.runtime.service.PSWFRoleRTService.class);
        instance.registerPSModelService("PSWFROLES", net.ibizsys.psmodel.runtime.service.PSWFRoleRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFUTILUIACTION, net.ibizsys.psmodel.runtime.service.PSWFUtilUIActionRTService.class);
        instance.registerPSModelService("PSWFUTILUIACTIONS", net.ibizsys.psmodel.runtime.service.PSWFUtilUIActionRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFVERSION, net.ibizsys.psmodel.runtime.service.PSWFVersionRTService.class);
        instance.registerPSModelService("PSWFVERSIONS", net.ibizsys.psmodel.runtime.service.PSWFVersionRTService.class);
        
        instance.registerPSModelService(PSModels.PSWFWORKTIME, net.ibizsys.psmodel.runtime.service.PSWFWorkTimeRTService.class);
        instance.registerPSModelService("PSWFWORKTIMES", net.ibizsys.psmodel.runtime.service.PSWFWorkTimeRTService.class);
        
        instance.registerPSModelService(PSModels.PSWXACCOUNT, net.ibizsys.psmodel.runtime.service.PSWXAccountRTService.class);
        instance.registerPSModelService("PSWXACCOUNTS", net.ibizsys.psmodel.runtime.service.PSWXAccountRTService.class);
        
        instance.registerPSModelService(PSModels.PSWXENTAPP, net.ibizsys.psmodel.runtime.service.PSWXEntAppRTService.class);
        instance.registerPSModelService("PSWXENTAPPS", net.ibizsys.psmodel.runtime.service.PSWXEntAppRTService.class);
        
        instance.registerPSModelService(PSModels.PSWXLOGIC, net.ibizsys.psmodel.runtime.service.PSWXLogicRTService.class);
        instance.registerPSModelService("PSWXLOGICS", net.ibizsys.psmodel.runtime.service.PSWXLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSWXMENU, net.ibizsys.psmodel.runtime.service.PSWXMenuRTService.class);
        instance.registerPSModelService("PSWXMENUS", net.ibizsys.psmodel.runtime.service.PSWXMenuRTService.class);
        
        instance.registerPSModelService(PSModels.PSWXMENUFUNC, net.ibizsys.psmodel.runtime.service.PSWXMenuFuncRTService.class);
        instance.registerPSModelService("PSWXMENUFUNCS", net.ibizsys.psmodel.runtime.service.PSWXMenuFuncRTService.class);
        
        instance.registerPSModelService(PSModels.PSWXMENUITEM, net.ibizsys.psmodel.runtime.service.PSWXMenuItemRTService.class);
        instance.registerPSModelService("PSWXMENUITEMS", net.ibizsys.psmodel.runtime.service.PSWXMenuItemRTService.class);
        
        instance.registerPSModelService(PSModels.PSWORKFLOW, net.ibizsys.psmodel.runtime.service.PSWorkflowRTService.class);
        instance.registerPSModelService("PSWORKFLOWS", net.ibizsys.psmodel.runtime.service.PSWorkflowRTService.class);
        
        instance.registerPSModelService(PSModels.PSEDITORTYPE, net.ibizsys.psmodel.runtime.service.PSEditorTypeRTService.class);
        instance.registerPSModelService("PSEDITORTYPES", net.ibizsys.psmodel.runtime.service.PSEditorTypeRTService.class);
        
        instance.registerPSModelService(PSModels.PSVIEWTYPE, net.ibizsys.psmodel.runtime.service.PSViewTypeRTService.class);
        instance.registerPSModelService("PSVIEWTYPES", net.ibizsys.psmodel.runtime.service.PSViewTypeRTService.class);
        
        instance.registerPSModelService(PSModels.PSDEJOINTYPE, net.ibizsys.psmodel.runtime.service.PSDEJoinTypeRTService.class);
        instance.registerPSModelService("PSDEJOINTYPES", net.ibizsys.psmodel.runtime.service.PSDEJoinTypeRTService.class);
        
        instance.registerPSModelService("PSDEVSLNSYS", net.ibizsys.psmodel.runtime.service.PSSystemRTService.class);
        instance.registerPSModelService("PSDEVSLNSYSES", net.ibizsys.psmodel.runtime.service.PSSystemRTService.class);
        
        
        
        instance.registerPSModelService("PSDEDATAFLOW", net.ibizsys.psmodel.runtime.service.PSDEDataFlowRTService.class);
        instance.registerPSModelService("PSDEDATAFLOWS", net.ibizsys.psmodel.runtime.service.PSDEDataFlowRTService.class);
        
        instance.registerPSModelService("PSDEMSLOGIC", net.ibizsys.psmodel.runtime.service.PSDEMSLogicRTService.class);
        instance.registerPSModelService("PSDEMSLOGICS", net.ibizsys.psmodel.runtime.service.PSDEMSLogicRTService.class);
        
        instance.registerPSModelService(PSModels.PSAPPPFPLUGIN, net.ibizsys.psmodel.runtime.service.PSAppPFPluginRTService.class);
        instance.registerPSModelService("PSAPPPFPLUGINS", net.ibizsys.psmodel.runtime.service.PSAppPFPluginRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSAICHATAGENT, net.ibizsys.psmodel.runtime.service.PSSysAIChatAgentRTService.class);
        instance.registerPSModelService("PSSYSAICHATAGENTS", net.ibizsys.psmodel.runtime.service.PSSysAIChatAgentRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSAIFACTORY, net.ibizsys.psmodel.runtime.service.PSSysAIFactoryRTService.class);
        instance.registerPSModelService("PSSYSAIFACTORIES", net.ibizsys.psmodel.runtime.service.PSSysAIFactoryRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSAIPIPELINEAGENT, net.ibizsys.psmodel.runtime.service.PSSysAIPipelineAgentRTService.class);
        instance.registerPSModelService("PSSYSAIPIPELINEAGENTS", net.ibizsys.psmodel.runtime.service.PSSysAIPipelineAgentRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSAIPIPELINEJOB, net.ibizsys.psmodel.runtime.service.PSSysAIPipelineJobRTService.class);
        instance.registerPSModelService("PSSYSAIPIPELINEJOBS", net.ibizsys.psmodel.runtime.service.PSSysAIPipelineJobRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSAIPIPELINEWORKER, net.ibizsys.psmodel.runtime.service.PSSysAIPipelineWorkerRTService.class);
        instance.registerPSModelService("PSSYSAIPIPELINEWORKERS", net.ibizsys.psmodel.runtime.service.PSSysAIPipelineWorkerRTService.class);
        
        instance.registerPSModelService(PSModels.PSSYSAIWORKERAGENT, net.ibizsys.psmodel.runtime.service.PSSysAIWorkerAgentRTService.class);
        instance.registerPSModelService("PSSYSAIWORKERAGENTS", net.ibizsys.psmodel.runtime.service.PSSysAIWorkerAgentRTService.class);
	}
	
	public static PSModelRTServiceFactory getInstance() {
		return PSModelRTServiceFactory.instance;
	}
}
