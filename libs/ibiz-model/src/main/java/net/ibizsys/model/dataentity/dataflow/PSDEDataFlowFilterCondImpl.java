package net.ibizsys.model.dataentity.dataflow;



public abstract class PSDEDataFlowFilterCondImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond{

	public final static String ATTR_ISNESTEDMODEL = "nestedModel";

	public boolean isNestedModel(){
		return true;
	}
}