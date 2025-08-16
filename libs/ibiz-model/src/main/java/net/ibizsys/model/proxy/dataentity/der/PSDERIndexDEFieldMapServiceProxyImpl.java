package net.ibizsys.model.proxy.dataentity.der;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.dataentity.der.IPSDERIndex;
import net.ibizsys.model.dataentity.der.PSDERIndexDEFieldMapImpl;

@SuppressWarnings("unchecked")
public class PSDERIndexDEFieldMapServiceProxyImpl extends PSModelServiceProxyImplBase {

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag){
		if(strTag!=null) {
			if(PSDERIndexDEFieldMapImpl.ATTR_GETMAJORPSDEFIELD.equals(strTag)) {
				
				IPSDERIndex iPSDERIndex  = this.getParentPSModelObject(relatedPSModelObject, IPSDERIndex.class, false);
//				if(iPSDERIndex.getMajorPSDataEntity() == null) {
//					throw new PSModelException(iPSDERIndex, String.format("索引关系[%1$s]主实体无效", iPSDERIndex.getName()));
//				}
				return (T) iPSDERIndex.getMajorPSDataEntityMust().getPSDEField(objNode, false);
			}
				
			if(PSDERIndexDEFieldMapImpl.ATTR_GETMINORPSDEFIELD.equals(strTag)) {
				
				IPSDERIndex iPSDERIndex  = this.getParentPSModelObject(relatedPSModelObject, IPSDERIndex.class, false);
//				if(iPSDERIndex.getMinorPSDataEntity() == null) {
//					throw new PSModelException(iPSDERIndex, String.format("索引关系[%1$s]从实体无效", iPSDERIndex.getName()));
//				}
				return (T) iPSDERIndex.getMinorPSDataEntityMust().getPSDEField(objNode, false);
			}

    	}
		return super.getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}
	
}
