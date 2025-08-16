package net.ibizsys.model.util.transpiler.extend.app.view;

import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppIndexView;
import net.ibizsys.model.app.view.IPSAppPanelView;
import net.ibizsys.model.app.view.IPSAppPortalView;
import net.ibizsys.model.app.view.IPSAppUtilView;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.control.dashboard.IPSDashboard;
import net.ibizsys.model.control.menu.IPSAppMenu;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSAppDEView;
import net.ibizsys.psmodel.core.domain.PSAppIndexView;
import net.ibizsys.psmodel.core.domain.PSAppPVPart;
import net.ibizsys.psmodel.core.domain.PSAppPanelView;
import net.ibizsys.psmodel.core.domain.PSAppPortalView;
import net.ibizsys.psmodel.core.domain.PSAppUtilView;
import net.ibizsys.psmodel.core.domain.PSAppView;
import net.ibizsys.psmodel.core.domain.PSSysDBPart;
import net.ibizsys.psmodel.core.domain.PSSysDashboard;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppViewListTranspilerEx extends net.ibizsys.model.util.transpiler.app.view.PSAppViewListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		PSAppView psAppView = (PSAppView)domain;
		if(StringUtils.hasLength(psAppView.getPSAppViewType())) {
			if(psAppView.getPSAppViewType().indexOf("DE") == 0) {
				psAppView.set("psdeviewtype", psAppView.getPSAppViewType());
				psAppView.setPSAppViewType("APPDEVIEW");
			}
		}
		
		if(iPSModelObject instanceof IPSAppIndexView) {
			PSAppIndexView psAppIndexView = (PSAppIndexView)domain;
			IPSAppIndexView iPSAppIndexView = (IPSAppIndexView)iPSModelObject;
			if(iPSAppIndexView.getPSControls()!=null) {
				IPSAppMenu iPSAppMenu = null;
				for(IPSControl item : iPSAppIndexView.getPSControls()) {
					if(item instanceof IPSAppMenu) {
						iPSAppMenu = (IPSAppMenu)item;
						break;
					}
				}
				if(iPSAppMenu!=null) {
					psAppIndexView.setPSAppMenuId(iPSModelTranspileContext.getPSModelUniqueTag(iPSAppMenu));
					psAppIndexView.setPSAppMenuName(iPSAppMenu.getLogicName());
				}
			}
		}
		
		
		if(iPSModelObject instanceof IPSAppDEView) {
			IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSModelObject;
			PSAppDEView psAppDEView = (PSAppDEView)domain;
			if(iPSAppDEView.getPSAppDataEntity()!=null && iPSAppDEView.getPSAppDataEntity().getPSDataEntity() != null) {
				String strPSDEViewBaseId = String.format("%1$s.%2$s", iPSModelTranspileContext.getPSModelUniqueTag(iPSAppDEView.getPSAppDataEntity().getPSDataEntity()), iPSAppDEView.getPSDEViewCodeName()).toLowerCase();
				psAppDEView.setPSDEViewBaseId(strPSDEViewBaseId);
				psAppDEView.setPSDEViewBaseName(iPSAppDEView.getTitle());
				
			}
		}
		
		if(!bFullMode) {
			return;
		}
		if(iPSModelObject instanceof IPSAppPortalView) {
			//获取默认数据看板部件
			IPSAppPortalView iPSAppPortalView  = (IPSAppPortalView)iPSModelObject;
			PSAppPortalView psAppPortalView = (PSAppPortalView)domain;
			if(iPSAppPortalView.getPSControls()!=null) {
				IPSDashboard iPSDashboard = null;
				for(IPSControl item : iPSAppPortalView.getPSControls()) {
					if(item instanceof IPSDashboard) {
						iPSDashboard = (IPSDashboard)item;
						break;
					}
				}
				if(iPSDashboard != null) {
					PSSysDashboard psSysDashboard = new PSSysDashboard();
					iPSModelTranspileContext.getPSModelTranspiler(IPSControl.class, false).decompile(iPSModelTranspileContext, iPSDashboard, psSysDashboard, bFullMode);
					//进行翻译
					if(psSysDashboard.getPSSysDBParts()!=null) {
						for(PSSysDBPart item : psSysDashboard.getPSSysDBParts()) {
							PSAppPVPart child = convertPSAppPVPart(item);
							psAppPortalView.getPSAppPVPartsIf().add(child);
						}
					}
					
				}
			}
			return;
		}
		
	}
	
	@Override
	protected PSAppView createDomain(IPSModelObject iPSModelObject) throws Exception {
		
		if(iPSModelObject instanceof IPSAppDEView) {
			return new PSAppDEView();
		}
		
		
		if(iPSModelObject instanceof IPSAppIndexView) {
			return new PSAppIndexView();
		}
		
		if(iPSModelObject instanceof IPSAppPortalView) {
			return new PSAppPortalView();
		}
		
		if(iPSModelObject instanceof IPSAppPanelView) {
			return new PSAppPanelView();
		}
		
		
		if(iPSModelObject instanceof IPSAppUtilView) {
			return new PSAppUtilView();
		}
		
		return super.createDomain(iPSModelObject);
	}
	
	public static PSAppPVPart convertPSAppPVPart(PSSysDBPart psSysDBPart) throws Exception {
		PSAppPVPart psAppPVPart = new PSAppPVPart();
		psAppPVPart.putAll(psSysDBPart.any());
		psAppPVPart.setId(psSysDBPart.getId());
		psAppPVPart.setName(psSysDBPart.getName());
		
		
		if(psSysDBPart.getPSSysDBParts()!=null) {
			for(PSSysDBPart item : psSysDBPart.getPSSysDBParts()) {
				PSAppPVPart child = convertPSAppPVPart(item);
				child.setPPSAppPVPartId(psAppPVPart.getId());
				child.setPPSAppPVPartName(psAppPVPart.getName());
				psAppPVPart.getPSAppPVPartsIf().add(child);
			}
		}
		return psAppPVPart;
	}
	
	public static String getPSDEViewBaseId(IPSModelTranspileContext iPSModelTranspileContext, IPSAppDEView iPSAppDEView) throws Exception {
		if(iPSAppDEView.getPSAppDataEntity() == null || iPSAppDEView.getPSAppDataEntity().getPSDataEntity() == null) {
			return null;
		}
		return String.format("%1$s.%2$s", iPSModelTranspileContext.getPSModelUniqueTag((IPSModelObject)iPSAppDEView.getPSAppDataEntity().getPSDataEntity()), iPSAppDEView.getPSDEViewCodeName()).toLowerCase();
		
	}
	
	
	protected String getRealAppDEViewId(IPSModelTranspileContext iPSModelTranspileContext, String fullId) throws Exception {
		return getRealModelId(iPSModelTranspileContext, fullId, new String[] {"PSSYSAPPS", "PSAPPDEVIEWS"});
	}
	
	protected String getRealModelId(IPSModelTranspileContext iPSModelTranspileContext, String fullId, String[] folders) throws Exception {
		String[] items = fullId.split("[.]");
		if(folders == null || folders.length == 0) {
			return items[items.length-1];
		}
		if(items.length> folders.length) {
			throw new Exception(String.format("项[%1$s]有误", fullId));
		}
		
		StringBuilder sb = new StringBuilder();
		int offset = folders.length - items.length;
		for(int i = 0;i<items.length;i++) {
			if(i!=0) {
				sb.append("/");
			}
			sb.append(folders[i+offset]);
			sb.append("/");
			sb.append(items[i]);
		}
		sb.append(".json");
		return sb.toString();
	}
	
}