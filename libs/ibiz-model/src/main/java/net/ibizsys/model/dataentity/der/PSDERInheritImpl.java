package net.ibizsys.model.dataentity.der;



public class PSDERInheritImpl extends net.ibizsys.model.dataentity.der.PSDERIndexImpl implements net.ibizsys.model.dataentity.der.IPSDERInherit{

	public final static String ATTR_GETINHERITMODE = "inheritMode";
	public final static String ATTR_ISINHERIT = "inherit";
	public final static String ATTR_ISLOGICINHERIT = "logicInherit";
	public final static String ATTR_ISSAMESTORAGE = "sameStorage";
	public final static String ATTR_ISSINGLEINHERIT = "singleInherit";
	public final static String ATTR_ISSTORAGEINHERIT = "storageInherit";

	public int getInheritMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINHERITMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isInherit(){
		return true;
	}

	public boolean isLogicInherit(){
		return this.getInheritMode() == net.ibizsys.model.PSModelEnums.DERInheritMode.LOGIC.value;
	}

	public boolean isSameStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSAMESTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSingleInherit(){
		return true;
	}

	public boolean isStorageInherit(){
		return this.getInheritMode() == net.ibizsys.model.PSModelEnums.DERInheritMode.STORAGE.value;
	}
}