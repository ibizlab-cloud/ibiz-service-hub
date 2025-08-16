package net.ibizsys.central.plugin.extension.psmodel.transpiler.app.codelist;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;

public class PSAppCodeListListTranspilerEx extends net.ibizsys.model.util.transpiler.extend.app.codelist.PSAppCodeListListTranspilerEx {

	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {
		if(iPSModelTranspileContext instanceof IExtensionPSModelRTServiceSession) {
			IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)iPSModelTranspileContext;
			IPSApplication iPSApplication = iExtensionPSModelRTServiceSession.getPSApplication();
			if(iPSApplication!=null) {
				IPSCodeList iPSCodeList = null;
				java.util.List<IPSCodeList> psCodeLists = iExtensionPSModelRTServiceSession.getPSSystem().getAllPSCodeLists();
				if(!ObjectUtils.isEmpty(psCodeLists)) {
					for(IPSCodeList item : psCodeLists) {
						String strTag = iPSModelTranspileContext.getPSModelUniqueTag(item);
						if(fullId.equalsIgnoreCase(strTag)) {
							iPSCodeList = item;
							break;
						}
					}
				}
				
				if(iPSCodeList == null) {
					throw new Exception(String.format("无法获取指定系统代码表[%1$s]", fullId));
				}
				
				
				objectNode.put("modelref", true);
				objectNode.put("path", String.format("PSSYSAPPS/%1$s/PSAPPCODELISTS/%2$s.json", iPSApplication.getCodeName(), iPSCodeList.getCodeListTag()));
				return;
			}
		}
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
}
