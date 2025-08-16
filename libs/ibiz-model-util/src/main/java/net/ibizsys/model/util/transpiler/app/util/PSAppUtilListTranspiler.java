package net.ibizsys.model.util.transpiler.app.util;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppUtilListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSAppUtil createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSAppUtil();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DYNADASHBOARD":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.util.PSAppDynaDashboardUtilImpl.class, false);
			case "FILTERSTORAGE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.util.PSAppFilterStorageUtilImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.app.util.PSAppUtilImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.app.util.IPSAppUtil iPSAppUtil = (net.ibizsys.model.app.util.IPSAppUtil)iPSModelObject;
		Object type = iPSAppUtil.getUtilType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("utiltype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}