package net.ibizsys.model.util.transpiler.extend.control.layout;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelEnums.LayoutMode;
import net.ibizsys.model.control.layout.PSGrid24LayoutImpl;
import net.ibizsys.model.control.layout.PSLayoutPosImplBase;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSLayoutPosListTranspilerEx extends net.ibizsys.model.util.transpiler.control.layout.PSLayoutPosListTranspiler{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	
		String strLayout = (String)domain.get("layout");
		if(StringUtils.hasLength(strLayout)) {
			if(objectNode.get(PSLayoutPosImplBase.ATTR_GETLAYOUT) == null) {
				objectNode.put(PSLayoutPosImplBase.ATTR_GETLAYOUT, strLayout);
			}
			
			
		}
		
		objectNode.remove(PSLayoutPosImplBase.ATTR_GETID);
		objectNode.remove(PSLayoutPosImplBase.ATTR_GETNAME);
		objectNode.remove(PSLayoutPosImplBase.ATTR_GETCODENAME);
	}
}