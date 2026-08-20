package net.ibizsys.model.dataentity.logic;



public class PSDEBeginTransLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEBeginTransLogic{

	public final static String ATTR_GETTRANSACTIONMODE = "transactionMode";

	public int getTransactionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRANSACTIONMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}