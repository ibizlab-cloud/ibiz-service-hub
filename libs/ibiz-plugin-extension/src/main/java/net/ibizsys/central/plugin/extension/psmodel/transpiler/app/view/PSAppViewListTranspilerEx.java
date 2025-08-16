package net.ibizsys.central.plugin.extension.psmodel.transpiler.app.view;

import java.util.List;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;

public class PSAppViewListTranspilerEx extends net.ibizsys.model.util.transpiler.extend.app.view.PSAppViewListTranspilerEx {

	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {

		if(iPSModelTranspileContext instanceof IExtensionPSModelRTServiceSession) {
			IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)iPSModelTranspileContext;
			IPSApplication iPSApplication = iExtensionPSModelRTServiceSession.getPSApplication();
			if(iPSApplication!=null) {
				//获取应用实体
				String strParentId = getParentId(fullId);
				List<IPSAppDataEntity> psAppDataEntities = iPSApplication.getAllPSAppDataEntities();
				if(!ObjectUtils.isEmpty(psAppDataEntities)) {
					for(IPSAppDataEntity iPSAppDataEntity : psAppDataEntities) {
						String strDETag = iExtensionPSModelRTServiceSession.getPSModelUniqueTag(iPSAppDataEntity.getPSDataEntityMust());
						if(strDETag.equalsIgnoreCase(strParentId)) {
							String strSimpleId = getSimpleId(fullId);
							List<IPSAppView> psAppViews = iPSApplication.getAllPSAppViews();
							if(!ObjectUtils.isEmpty(psAppViews)) {
								for(IPSAppView iPSAppView : psAppViews) {
									if(!(iPSAppView instanceof IPSAppDEView)) {
										continue;
									}
									
									IPSAppDEView iPSAppDEView = (IPSAppDEView)iPSAppView;
									if(!iPSAppDEView.getPSAppDataEntityMust().getId().equals(iPSAppDataEntity.getId())) {
										continue;
									}
									
									if(strSimpleId.equalsIgnoreCase(iPSAppDEView.getPSDEViewCodeName())) {
										objectNode.put("modelref", true);
										objectNode.put("path", getRealAppDEViewId(iPSModelTranspileContext, PSModelUtils.calcUniqueTag2(iPSAppDEView)));
										objectNode.put("viewType", iPSAppDEView.getViewType());
										return;
									}
								}
							}
							
							break;
						}
					}
				}
			}
		}
		
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
	
	
}
