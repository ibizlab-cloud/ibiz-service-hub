package net.ibizsys.central.plugin.extension.sysutil.addin;

import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.plugin.extension.dataentity.util.addin.PSAppDEViewDynaToolBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.view.IPSAppDEView;
import net.ibizsys.model.app.view.IPSAppView;

public abstract class PSAppViewDynaToolBase extends PSModelDynaToolBase {

	@Override
	protected ObjectNode onGetModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSModelObject iPSModelObject, Object param) throws Throwable {
		
		if(!(iPSModelObject instanceof IPSAppView)) {
			throw new Exception(String.format("传入模型对象[%1$s]类型不正确", iPSModelObject));
		}
		
		IPSAppView iPSAppView = (IPSAppView)iPSModelObject;
		Assert.hasLength(iPSAppView.getViewType(), "传入应用视图应用模型视图类型无效");
		
		return this.onGetModel(v2SystemExtensionSuite, iPSAppView, param);
	}
	
	protected ObjectNode onGetModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSAppView iPSAppView, Object param) throws Throwable {
		if(iPSAppView instanceof IPSAppDEView) {
			return PSAppDEViewDynaToolBase.getPSAppDEViewModel(v2SystemExtensionSuite, (IPSAppDEView)iPSAppView, param);
		}
		throw new Exception(String.format("未支持的视图类型[%1$s]", iPSAppView.getViewType()));
	}

}
