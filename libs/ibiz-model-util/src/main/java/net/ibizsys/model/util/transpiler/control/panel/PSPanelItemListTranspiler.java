package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSPanelItemListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSSysViewPanelItem createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSSysViewPanelItem();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "BUTTON":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelButtonImpl.class, false);
			case "BUTTONLIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelButtonListImpl.class, false);
			case "CONTAINER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelContainerImpl.class, false);
			case "CONTROL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelControlImpl.class, false);
			case "CTRLPOS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelCtrlPosImpl.class, false);
			case "FIELD":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelFieldImpl.class, false);
			case "RAWITEM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelRawItemImpl.class, false);
			case "TABPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelTabPanelImpl.class, false);
			case "TAGPAGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelTabPageImpl.class, false);
			case "USERCONTROL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.panel.PSSysPanelUserControlImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.panel.IPSPanelItem iPSPanelItem = (net.ibizsys.model.control.panel.IPSPanelItem)iPSModelObject;
		Object type = iPSPanelItem.getItemType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("itemtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}