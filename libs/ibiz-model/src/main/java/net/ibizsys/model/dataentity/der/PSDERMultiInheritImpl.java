package net.ibizsys.model.dataentity.der;



public class PSDERMultiInheritImpl extends net.ibizsys.model.dataentity.der.PSDERInheritImpl implements net.ibizsys.model.dataentity.der.IPSDERMultiInherit{

	public final static String ATTR_ISSINGLEINHERIT = "singleInherit";

	public boolean isSingleInherit(){
		return false;
	}
}