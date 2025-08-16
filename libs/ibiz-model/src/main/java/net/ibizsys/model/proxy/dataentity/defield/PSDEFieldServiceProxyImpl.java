package net.ibizsys.model.proxy.dataentity.defield;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.PSDEFieldImpl;
import net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl;


@SuppressWarnings("unchecked")
public class PSDEFieldServiceProxyImpl extends PSModelServiceProxyImplBase {

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag){
		if(strTag!=null) {
			
			if(PSDEFieldImpl.ATTR_GETDEFAULTVALUEPSDEFLOGIC.equals(strTag)
					||PSDEFieldImpl.ATTR_GETCOMPUTEPSDEFLOGIC.equals(strTag)
					||PSDEFieldImpl.ATTR_GETONCHANGEPSDEFLOGIC.equals(strTag)) {
				IPSDataEntity iPSDataEntity = (IPSDataEntity)this.getParentPSModelObject(relatedPSModelObject, IPSDataEntity.class, false);
				return (T)iPSDataEntity.getPSDELogic(objNode, false);
			}
			
			if(PSLinkDEFieldImpl.ATTR_GETRELATEDPSDEFIELD.equals(strTag)) {
				//获取关系属性
				IPSDataEntity majorPSDataEntity = ((IPSLinkDEField)relatedPSModelObject).getPSDERMust().getMajorPSDataEntityMust();
			
				return (T) majorPSDataEntity.getPSDEField(objNode, false);
			}
    	}
		return super.getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}
}
