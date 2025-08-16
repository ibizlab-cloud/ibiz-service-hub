package net.ibizsys.model.util.transpiler.dataentity.action;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEActionListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDEAction createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDEAction();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "BUILTIN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEBuiltinActionImpl.class, false);
			case "DELOGIC":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDELogicActionImpl.class, false);
			case "REMOTE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDERemoteActionImpl.class, false);
			case "SCRIPT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEScriptActionImpl.class, false);
			case "SELECTBYKEY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDESelectByKeyActionImpl.class, false);
			case "USERCREATE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEUserCreateActionImpl.class, false);
			case "USERCUSTOM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEUserCustomActionImpl.class, false);
			case "USERSYSUPDATE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEUserSysUpdateActionImpl.class, false);
			case "USERUPDATE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEUserUpdateActionImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.action.PSDEUserCustomActionImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.action.IPSDEAction iPSDEAction = (net.ibizsys.model.dataentity.action.IPSDEAction)iPSModelObject;
		Object type = iPSDEAction.getActionType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("actiontype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}