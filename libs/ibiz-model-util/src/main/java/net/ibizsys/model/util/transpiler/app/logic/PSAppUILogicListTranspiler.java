package net.ibizsys.model.util.transpiler.app.logic;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppUILogicListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "APP_NEWDATA":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.logic.BuiltinPSAppUINewDataLogicImpl.class, false);
			case "APP_OPENDATA":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.logic.BuiltinPSAppUIOpenDataLogicImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.logic.PSAppUILogicImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.app.logic.IPSAppUILogic iPSAppUILogic = (net.ibizsys.model.app.logic.IPSAppUILogic)iPSModelObject;
		Object type = iPSAppUILogic.getViewLogicType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("viewlogictype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}