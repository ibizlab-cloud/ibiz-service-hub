package net.ibizsys.model.util.merger.control.panel;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSPanelItemListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.panel.IPSPanelItem.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.panel.IPSPanelItem.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.panel.IPSPanelItem.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.panel.IPSPanelItem.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("itemType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "BUTTON":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelButtonImpl.class, false);
			case "BUTTONLIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelButtonListImpl.class, false);
			case "CONTAINER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelContainerImpl.class, false);
			case "CONTROL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelControlImpl.class, false);
			case "CTRLPOS":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelCtrlPosImpl.class, false);
			case "FIELD":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelFieldImpl.class, false);
			case "RAWITEM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelRawItemImpl.class, false);
			case "TABPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelTabPanelImpl.class, false);
			case "TAGPAGE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelTabPageImpl.class, false);
			case "USERCONTROL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.panel.PSSysPanelUserControlImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
}