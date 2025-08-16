package net.ibizsys.model.proxy.dataentity.der;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.PSDER1NDEFieldMapImpl;

@SuppressWarnings("unchecked")
public class PSDER1NDEFieldMapServiceProxyImpl extends PSModelServiceProxyImplBase {

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag){
		if(strTag!=null) {
			if(PSDER1NDEFieldMapImpl.ATTR_GETMAJORPSDEFIELD.equals(strTag)) {
				
				IPSDERBase iPSDERBase  = this.getParentPSModelObject(relatedPSModelObject, IPSDERBase.class, false);
//				if(iPSDERBase.getMajorPSDataEntity() == null) {
//					throw new PSModelException(iPSDERBase, String.format("关系[%1$s]主实体无效", iPSDERBase.getName()));
//				}
				return (T) iPSDERBase.getMajorPSDataEntityMust().getPSDEField(objNode, false);
			}
				
			if(PSDER1NDEFieldMapImpl.ATTR_GETMINORPSDEFIELD.equals(strTag)) {
				
				IPSDERBase iPSDERBase  = this.getParentPSModelObject(relatedPSModelObject, IPSDERBase.class, false);
//				if(iPSDERBase.getMinorPSDataEntity() == null) {
//					throw new PSModelException(iPSDERBase, String.format("关系[%1$s]从实体无效", iPSDERBase.getName()));
//				}
				return (T) iPSDERBase.getMinorPSDataEntityMust().getPSDEField(objNode, false);
			}

    	}
		return super.getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}
}
