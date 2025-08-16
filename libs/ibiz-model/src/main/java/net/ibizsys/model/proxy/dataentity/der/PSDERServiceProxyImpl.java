package net.ibizsys.model.proxy.dataentity.der;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.dataentity.der.IPSDER11;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.PSDER11Impl;
import net.ibizsys.model.dataentity.der.PSDER1NImpl;

public class PSDERServiceProxyImpl extends PSModelServiceProxyImplBase {

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag) {
		if(strTag!=null) {
			if(PSDER1NImpl.ATTR_GETPSPICKUPDEFIELD.equals(strTag)) {
				
				IPSDER1N iPSDER1N  = (IPSDER1N)relatedPSModelObject;
//				if(iPSDER1N.getMinorPSDataEntityMust() == null) {
//					throw new PSModelException(iPSDER1N, String.format("关系[%1$s]从实体无效", iPSDER1N.getName()));
//				}
				return (T) iPSDER1N.getMinorPSDataEntityMust().getPSDEField(objNode, false);
			}
			
			if(PSDER1NImpl.ATTR_GETPSPICKUPTEXTDEFIELD.equals(strTag)) {
				
				IPSDER1N iPSDER1N  = (IPSDER1N)relatedPSModelObject;
//				if(iPSDER1N.getMinorPSDataEntityMust() == null) {
//					throw new PSModelException(iPSDER1N, String.format("关系[%1$s]从实体无效", iPSDER1N.getName()));
//				}
				return (T) iPSDER1N.getMinorPSDataEntityMust().getPSDEField(objNode, false);
			}
			
//			if(PSDER1NImpl.ATTR_GETVERSIONPSDEFIELD.equals(strTag)) {
//				
//				IPSDER1N iPSDER1N  = (IPSDER1N)relatedPSModelObject;
////				if(iPSDER1N.getMinorPSDataEntityMust() == null) {
////					throw new PSModelException(iPSDER1N, String.format("关系[%1$s]从实体无效", iPSDER1N.getName()));
////				}
//				return (T) iPSDER1N.getMinorPSDataEntityMust().getPSDEField(objNode, false);
//			}
			
//			if(PSDER1NImpl.ATTR_GETVERSIONIDPSDEFIELD.equals(strTag)) {
//				
//				IPSDER1N iPSDER1N  = (IPSDER1N)relatedPSModelObject;
////				if(iPSDER1N.getMinorPSDataEntityMust() == null) {
////					throw new PSModelException(iPSDER1N, String.format("关系[%1$s]从实体无效", iPSDER1N.getName()));
////				}
//				return (T) iPSDER1N.getMinorPSDataEntityMust().getPSDEField(objNode, false);
//			}


			if(PSDER1NImpl.ATTR_GETPSONE2MANYDATADEFIELD.equals(strTag)) {
				
				IPSDER1N iPSDER1N  = (IPSDER1N)relatedPSModelObject;
//				if(iPSDER1N.getMajorPSDataEntityMust() == null) {
//					throw new PSModelException(iPSDER1N, String.format("关系[%1$s]主实体无效", iPSDER1N.getName()));
//				}
				return (T) iPSDER1N.getMajorPSDataEntityMust().getPSDEField(objNode, false);
			}
			
			if(PSDER11Impl.ATTR_GETPSONE2ONEDATADEFIELD.equals(strTag)) {
				
				IPSDER11 iPSDER1N  = (IPSDER11)relatedPSModelObject;
//				if(iPSDER1N.getMajorPSDataEntityMust() == null) {
//					throw new PSModelException(iPSDER1N, String.format("关系[%1$s]主实体无效", iPSDER1N.getName()));
//				}
				return (T) iPSDER1N.getMajorPSDataEntityMust().getPSDEField(objNode, false);
			}

    	}
		return super.getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}
	
}
