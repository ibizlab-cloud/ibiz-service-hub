package net.ibizsys.model.util.merger.control.form;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDEFormDetailListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.form.IPSDEFormDetail.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.form.IPSDEFormDetail.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.form.IPSDEFormDetail.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.form.IPSDEFormDetail.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("detailType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "BUTTON":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormButtonImpl.class, false);
			case "BUTTONLIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormButtonListImpl.class, false);
			case "DRUIPART":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormDRUIPartImpl.class, false);
			case "FORMITEM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormItemImpl.class, false);
			case "FORMITEMEX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEEditFormItemExImpl.class, false);
			case "FORMPAGE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormPageImpl.class, false);
			case "GROUPPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormGroupPanelImpl.class, false);
			case "IFRAME":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormIFrameImpl.class, false);
			case "MDCTRL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormMDCtrlImpl.class, false);
			case "RAWITEM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormRawItemImpl.class, false);
			case "TABPAGE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormTabPageImpl.class, false);
			case "TABPANEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormTabPanelImpl.class, false);
			case "USERCONTROL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.form.PSDEFormUserControlImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
}