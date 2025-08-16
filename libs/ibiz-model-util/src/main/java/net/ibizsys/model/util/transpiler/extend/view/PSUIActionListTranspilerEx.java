package net.ibizsys.model.util.transpiler.extend.view;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.dataentity.IPSAppDEUIAction;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.extend.app.view.PSAppViewListTranspilerEx;
import net.ibizsys.psmodel.core.domain.PSDEUIAction;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSUIActionListTranspilerEx extends net.ibizsys.model.util.transpiler.view.PSUIActionListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		PSDEUIAction psDEUIAction = (PSDEUIAction)domain;
		IPSAppDEUIAction iPSAppDEUIAction = (IPSAppDEUIAction)iPSModelObject;
		if(iPSAppDEUIAction.getFrontPSAppView() instanceof IPSAppDEView) {
			psDEUIAction.setPSDEViewBaseId(PSAppViewListTranspilerEx.getPSDEViewBaseId(iPSModelTranspileContext, (IPSAppDEView)iPSAppDEUIAction.getFrontPSAppView()));
			psDEUIAction.setPSDEViewBaseName(iPSAppDEUIAction.getFrontPSAppView().getTitle());
			
		}
	}
	
	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode,
			ObjectNode objectNode) throws Exception {
		if(childMode) {
			if(iPSModelTranspileContext.getPSApplication() != null) {
				String strParentId = PSModelUtils.getParentId(fullId);
				if(StringUtils.hasLength(strParentId)) {
					IPSAppDataEntity iPSAppDataEntity = null;
					if(!ObjectUtils.isEmpty(iPSModelTranspileContext.getPSApplication().getAllPSAppDataEntities())) {
						for(IPSAppDataEntity item : iPSModelTranspileContext.getPSApplication().getAllPSAppDataEntities()) {
							if(item.getPSDataEntity() == null) {
								continue;
							}
							
							String strPSDEId = PSModelUtils.calcFullUniqueTag2(item.getPSDataEntity());
							if(!strParentId.equalsIgnoreCase(strPSDEId)) {
								continue;
							}

							iPSAppDataEntity = item;
							break;
						}
					}
					if(iPSAppDataEntity == null) {
						throw new Exception(String.format("无法获取指定实体[%1$s]对应的应用实体", strParentId));
					}
					
					IPSAppDEUIAction iPSAppDEUIAction = null;
					if(!ObjectUtils.isEmpty(iPSAppDataEntity.getAllPSAppDEUIActions())) {
						String strCodeName = PSModelUtils.getSimpleId(fullId);
						for(IPSAppDEUIAction item : iPSAppDataEntity.getAllPSAppDEUIActions()) {
							if(!strCodeName.equalsIgnoreCase(item.getCodeName())) {
								continue;
							}

							iPSAppDEUIAction = item;
							break;
						}
					}
					
					if(iPSAppDEUIAction == null) {
						throw new Exception(String.format("无法获取指定实体界面行为[%1$s]", fullId));
					}
					
					ObjectNode objectNode2 = iPSAppDEUIAction.getObjectNode().deepCopy();
					objectNode.setAll(objectNode2);
					
				}
				
				return;
			}
		}
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
	
}

