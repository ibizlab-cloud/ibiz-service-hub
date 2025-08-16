package net.ibizsys.central.plugin.extension.psmodel.transpiler.app.dataentity;

import java.util.List;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDEMethod;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;

public class PSAppDEDataSetListTranspilerEx extends net.ibizsys.model.util.transpiler.extend.app.dataentity.PSAppDEDataSetListTranspilerEx {

	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {

		if(fullId.indexOf("@")!=-1) {
			fullId = fullId.split("[@]")[1];
		}
		
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
							//获取指定应用方法
							String strSimpleId = getSimpleId(fullId);
							IPSAppDEMethod iPSAppDEMethod = iPSAppDataEntity.getPSAppDEMethod("Fetch"+strSimpleId, true);
							if(iPSAppDEMethod == null) {
								iPSAppDEMethod = iPSAppDataEntity.getPSAppDEMethod("fetch_"+strSimpleId, false);
							}
							super.onGetModelRef(iPSModelTranspileContext, PSModelUtils.calcUniqueTag2(iPSAppDEMethod), childMode, objectNode);
							return;
						}
					}
				}
			}
		}
		
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
	
}
