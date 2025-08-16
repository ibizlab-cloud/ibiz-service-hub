package net.ibizsys.model.util.transpiler.control;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSRawItemBaseListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "HTML":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.rawitem.PSHtmlItemImpl.class, false);
			case "IMAGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.rawitem.PSImageItemImpl.class, false);
			case "MARKDOWN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.rawitem.PSMarkdownItemImpl.class, false);
			case "PLACEHOLDER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.rawitem.PSPlaceholderItemImpl.class, false);
			case "RAW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.rawitem.PSTextItemImpl.class, false);
			case "VIDEO":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.rawitem.PSVideoItemImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.PSRawItemImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.IPSRawItemBase iPSRawItemBase = (net.ibizsys.model.control.IPSRawItemBase)iPSModelObject;
		Object type = iPSRawItemBase.getContentType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("contenttype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}