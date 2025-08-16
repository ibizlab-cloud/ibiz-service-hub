package net.ibizsys.model.util.transpiler.extend.view;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupDetailImpl;
import net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.view.IPSUIActionGroupDetail;

public class PSUIActionGroupListTranspilerEx extends net.ibizsys.model.util.transpiler.view.PSUIActionGroupListTranspiler{

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
					
					IPSAppDEUIActionGroup iPSAppDEUIActionGroup = null;
					if(!ObjectUtils.isEmpty(iPSAppDataEntity.getAllPSAppDEUIActionGroups())) {
						String strCodeName = PSModelUtils.getSimpleId(fullId);
						for(IPSAppDEUIActionGroup item : iPSAppDataEntity.getAllPSAppDEUIActionGroups()) {
							if(!strCodeName.equalsIgnoreCase(item.getCodeName())) {
								continue;
							}

							iPSAppDEUIActionGroup = item;
							break;
						}
					}
					
					if(iPSAppDEUIActionGroup == null) {
						throw new Exception(String.format("无法获取指定实体界面行为组[%1$s]", fullId));
					}
					
					ObjectNode objectNode2 = iPSAppDEUIActionGroup.getObjectNode().deepCopy();
					objectNode.setAll(objectNode2);

					if(!ObjectUtils.isEmpty(iPSAppDEUIActionGroup.getPSUIActionGroupDetails())) {
						objectNode.remove(PSDEUIActionGroupImpl.ATTR_GETPSUIACTIONGROUPDETAILS);
						ArrayNode detailArrayNode = objectNode.putArray(PSDEUIActionGroupImpl.ATTR_GETPSUIACTIONGROUPDETAILS);
						for(IPSUIActionGroupDetail iPSUIActionGroupDetail : iPSAppDEUIActionGroup.getPSUIActionGroupDetails()) {
							ObjectNode detailNode = iPSUIActionGroupDetail.getObjectNode().deepCopy();
							if(iPSUIActionGroupDetail.getPSUIAction() != null) {
								detailNode.remove(PSDEUIActionGroupDetailImpl.ATTR_GETPSUIACTION);
								detailNode.set(PSDEUIActionGroupDetailImpl.ATTR_GETPSUIACTION, iPSUIActionGroupDetail.getPSUIAction().getObjectNode().deepCopy());
							}
							
							
							detailArrayNode.add(detailNode);
							
						}
					}
				}
				
				return;
			}
		}
		
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
}
