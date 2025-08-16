package net.ibizsys.model.proxy.dataentity.defield.valuerule;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRangeCondition;
import net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRValueRangeConditionImpl;

@SuppressWarnings("unchecked")
public class PSDEFVRConditionServiceProxyImpl extends PSModelServiceProxyImplBase {

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag){
		if(strTag!=null) {
			if(PSDEFVRValueRangeConditionImpl.ATTR_GETMAJORPSDEDATASET.equals(strTag)) {
				IPSDataEntity majorPSDataEntity = ((IPSDEFVRValueRangeCondition)relatedPSModelObject).getMajorPSDataEntity();
				return (T) majorPSDataEntity.getPSDEDataSet(objNode, false);
			}
			
			if(PSDEFVRValueRangeConditionImpl.ATTR_GETEXTMAJORPSDEFIELD.equals(strTag)) {
				IPSDataEntity majorPSDataEntity = ((IPSDEFVRValueRangeCondition)relatedPSModelObject).getMajorPSDataEntity();
				return (T) majorPSDataEntity.getPSDEField(objNode, false);
			}
			
			
			
//			if(PSLinkDEFieldImpl.ATTR_GETRELATEDPSDEFIELD.equals(strTag)) {
//				//获取关系属性
//				IPSDataEntity majorPSDataEntity = ((IPSLinkDEField)relatedPSModelObject).getPSDER().getMajorPSDataEntity();
//			
//				return (T) majorPSDataEntity.getPSDEField(objNode, false);
//			}
    	}
		return super.getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}
	
}
