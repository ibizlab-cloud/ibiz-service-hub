package net.ibizsys.model.util.transpiler.extend.control.layout;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelEnums.LayoutMode;
import net.ibizsys.model.control.layout.PSGrid12LayoutImpl;
import net.ibizsys.model.control.layout.PSGrid24LayoutImpl;
import net.ibizsys.model.control.layout.PSLayoutImplBase;
import net.ibizsys.model.control.layout.PSLayoutPosImplBase;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSLayoutListTranspilerEx extends net.ibizsys.model.util.transpiler.control.layout.PSLayoutListTranspiler{
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
		
		
		String strLayout = (String)domain.get("layout");
		if(StringUtils.hasLength(strLayout)) {
			if(objectNode.get(PSLayoutPosImplBase.ATTR_GETLAYOUT) == null) {
				objectNode.put(PSLayoutPosImplBase.ATTR_GETLAYOUT, strLayout);
			}
			
			if(LayoutMode.TABLE_24COL.value.equals(strLayout)) {
				objectNode.put(PSGrid24LayoutImpl.ATTR_GETCOLUMNCOUNT, 24);
			}
			else
				if(LayoutMode.TABLE_12COL.value.equals(strLayout)) {
					objectNode.put(PSGrid12LayoutImpl.ATTR_GETCOLUMNCOUNT, 12);
				}
		}
		
		objectNode.remove(PSLayoutImplBase.ATTR_GETID);
		objectNode.remove(PSLayoutImplBase.ATTR_GETNAME);
		objectNode.remove(PSLayoutImplBase.ATTR_GETCODENAME);
	}
}