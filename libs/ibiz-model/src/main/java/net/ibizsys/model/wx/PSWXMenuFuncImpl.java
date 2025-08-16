package net.ibizsys.model.wx;



public class PSWXMenuFuncImpl extends net.ibizsys.model.wx.PSWXAccountObjectImpl implements net.ibizsys.model.wx.IPSWXMenuFunc{

	public final static String ATTR_GETCLICKTAG = "clickTag";
	public final static String ATTR_GETWXMENUFUNCTYPE = "wXMenuFuncType";

	public java.lang.String getClickTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLICKTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWXMenuFuncType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWXMENUFUNCTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}