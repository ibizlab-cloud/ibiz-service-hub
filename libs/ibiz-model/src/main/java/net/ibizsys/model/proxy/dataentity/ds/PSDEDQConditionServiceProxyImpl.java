package net.ibizsys.model.proxy.dataentity.ds;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.dataentity.ds.IPSDEDQJoin;
import net.ibizsys.model.dataentity.ds.PSDEDQFieldConditionImpl;

@SuppressWarnings("unchecked")
public class PSDEDQConditionServiceProxyImpl extends PSModelServiceProxyImplBase {

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag) {
		if(strTag!=null) {
			if(PSDEDQFieldConditionImpl.ATTR_GETPSDEFIELD.equals(strTag)) {
				IPSDEDQJoin iPSDEDQJoin  = this.getParentPSModelObject(relatedPSModelObject, IPSDEDQJoin.class, false);
//				if(iPSDEDQJoin.getJoinPSDataEntity() == null) {
//					throw new PSModelException(iPSDEDQJoin, String.format("查询连接[%1$s]实体无效", iPSDEDQJoin.getName()));
//				}
				return (T) iPSDEDQJoin.getJoinPSDataEntityMust().getPSDEField(objNode, false);
			}
    	}
		return super.getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}
	
}
