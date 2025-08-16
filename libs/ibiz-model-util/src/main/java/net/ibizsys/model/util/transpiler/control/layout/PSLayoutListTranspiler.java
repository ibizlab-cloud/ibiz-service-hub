package net.ibizsys.model.util.transpiler.control.layout;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSLayoutListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "ABSOLUTE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.layout.PSAbsoluteLayoutImpl.class, false);
			case "BORDER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.layout.PSBorderLayoutImpl.class, false);
			case "FLEX":
			case "SIMPLEFLEX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.layout.PSFlexLayoutImpl.class, false);
			case "TABLE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.layout.PSTableLayoutImpl.class, false);
			case "TABLE_12COL":
			case "TABLE_24COL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.control.layout.PSGrid12LayoutImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.control.layout.IPSLayout iPSLayout = (net.ibizsys.model.control.layout.IPSLayout)iPSModelObject;
		Object type = iPSLayout.getLayout();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("layout");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}