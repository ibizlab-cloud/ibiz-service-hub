package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEUILogicNodeListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDELogicNode createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDELogicNode();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "APPENDPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIAppendParamLogicImpl.class, false);
			case "BEGIN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIBeginLogicImpl.class, false);
			case "BINDPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIBindParamLogicImpl.class, false);
			case "COPYPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUICopyParamLogicImpl.class, false);
			case "DEACTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIDEActionLogicImpl.class, false);
			case "DEBUGPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIDebugParamLogicImpl.class, false);
			case "DEDATASET":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIDEDataSetLogicImpl.class, false);
			case "DELOGIC":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIDELogicLogicImpl.class, false);
			case "DEUIACTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIActionLogicImpl.class, false);
			case "END":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIEndLogicImpl.class, false);
			case "LOOPSUBCALL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUILoopSubCallLogicImpl.class, false);
			case "MSGBOX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIMsgBoxLogicImpl.class, false);
			case "PFPLUGIN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIPFPluginLogicImpl.class, false);
			case "RAWJSCODE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIRawCodeLogicImpl.class, false);
			case "RENEWPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIRenewParamLogicImpl.class, false);
			case "RESETPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIResetParamLogicImpl.class, false);
			case "SORTPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUISortParamLogicImpl.class, false);
			case "THROWEXCEPTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUIThrowExceptionLogicImpl.class, false);
			case "VIEWCTRLFIREEVENT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUICtrlFireEventLogicImpl.class, false);
			case "VIEWCTRLINVOKE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUICtrlInvokeLogicImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.logic.IPSDEUILogicNode iPSDEUILogicNode = (net.ibizsys.model.dataentity.logic.IPSDEUILogicNode)iPSModelObject;
		Object type = iPSDEUILogicNode.getLogicNodeType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("logicnodetype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}