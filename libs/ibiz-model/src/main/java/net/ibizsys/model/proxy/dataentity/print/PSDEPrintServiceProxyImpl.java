package net.ibizsys.model.proxy.dataentity.print;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.dataentity.print.PSDEPrintImpl;

public class PSDEPrintServiceProxyImpl extends PSModelServiceProxyImplBase {

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag) {
		if(strTag!=null) {
			if(PSDEPrintImpl.ATTR_GETDETAILPSDEDATASET.equals(strTag)) {
				IPSDEPrint iPSDEPrint  = (IPSDEPrint)relatedPSModelObject;
//				if(iPSDEPrint.getDetailPSDE() == null) {
//					throw new PSModelException(iPSDEPrint, String.format("实体打印[%1$s]成员数据实体无效", iPSDEPrint.getName()));
//				}
				return (T) iPSDEPrint.getDetailPSDEMust().getPSDEDataSet(objNode, false);
			}
			

    	}
		return super.getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}
	
}
