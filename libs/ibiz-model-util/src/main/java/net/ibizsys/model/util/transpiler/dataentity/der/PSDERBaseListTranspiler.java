package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDERBaseListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDER createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDER();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DER11":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDER11Impl.class, false);
			case "DER1N":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDER1NImpl.class, false);
			case "DERAGGDATA":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDERAggDataImpl.class, false);
			case "DERCUSTOM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDERCustomImpl.class, false);
			case "DERINDEX":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDERIndexImpl.class, false);
			case "DERINHERIT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDERInheritImpl.class, false);
			case "DERMULINH":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDERMultiInheritImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.der.PSDERBaseImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.der.IPSDERBase iPSDERBase = (net.ibizsys.model.dataentity.der.IPSDERBase)iPSModelObject;
		Object type = iPSDERBase.getDERType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("dertype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}