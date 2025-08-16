package net.ibizsys.central.dataentity.demap;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.datamap.IPSDEMap;
import net.ibizsys.model.dataentity.datamap.PSDEMapImpl;
import net.ibizsys.model.dataentity.der.IPSDERInherit;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.util.JsonUtils;

public class DERInheritDEMapRuntime extends DEMapRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DERInheritDEMapRuntime.class);
	private IPSDERInherit iPSDERInherit = null;

	
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDERInherit iPSDERInherit) throws Exception {
		this.iPSDERInherit = iPSDERInherit;
		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put(PSDEMapImpl.ATTR_GETID, "DERInherit");
		objectNode.put(PSDEMapImpl.ATTR_GETNAME, "继承关系");
		IPSDEMap iPSDEMap = iDataEntityRuntimeContext.getDataEntityRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iDataEntityRuntimeContext.getDataEntityRuntime().getPSDataEntity(), IPSDEMap.class, objectNode);
		super.init(iDataEntityRuntimeContext, iPSDEMap);
	}
	
	
	public IPSDERInherit getPSDERInherit() {
		return this.iPSDERInherit;
	}
}
