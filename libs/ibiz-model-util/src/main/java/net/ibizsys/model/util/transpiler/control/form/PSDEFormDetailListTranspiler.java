package net.ibizsys.model.util.transpiler.control.form;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEFormDetailListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDEFormDetail createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDEFormDetail();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "BUTTON":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormButtonImpl.class, false);
			case "BUTTONLIST":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormButtonListImpl.class, false);
			case "DRUIPART":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormDRUIPartImpl.class, false);
			case "FORMITEM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormItemImpl.class, false);
			case "FORMITEMEX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEEditFormItemExImpl.class, false);
			case "FORMPAGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormPageImpl.class, false);
			case "GROUPPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormGroupPanelImpl.class, false);
			case "IFRAME":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormIFrameImpl.class, false);
			case "MDCTRL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormMDCtrlImpl.class, false);
			case "RAWITEM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormRawItemImpl.class, false);
			case "TABPAGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormTabPageImpl.class, false);
			case "TABPANEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormTabPanelImpl.class, false);
			case "USERCONTROL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.form.PSDEFormUserControlImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.form.IPSDEFormDetail iPSDEFormDetail = (net.ibizsys.model.control.form.IPSDEFormDetail)iPSModelObject;
		Object type = iPSDEFormDetail.getDetailType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("detailtype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}