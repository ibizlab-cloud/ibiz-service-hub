package net.ibizsys.model.app;



public class PSAppLanImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSAppLan{

	public final static String ATTR_GETALLPSLANGUAGEITEMS = "getAllPSLanguageItems";
	public final static String ATTR_GETLANGUAGE = "language";
	public final static String ATTR_GETORDERVALUE = "orderValue";

	private java.util.List<net.ibizsys.model.res.IPSLanguageItem> allpslanguageitems = null;
	public java.util.List<net.ibizsys.model.res.IPSLanguageItem> getAllPSLanguageItems(){
		if(this.allpslanguageitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSLANGUAGEITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSLanguageItem> list = new java.util.ArrayList<net.ibizsys.model.res.IPSLanguageItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSLanguageItem obj = this.getPSModelObject(net.ibizsys.model.res.IPSLanguageItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSLANGUAGEITEMS);
				if(obj!=null)list.add(obj);
			}
			this.allpslanguageitems = list;
		}
		return (this.allpslanguageitems.size() == 0)? null : this.allpslanguageitems;
	}

	public net.ibizsys.model.res.IPSLanguageItem getPSLanguageItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSLanguageItem.class, this.getAllPSLanguageItems(), objKey, bTryMode);
	}
	public void setPSLanguageItems(java.util.List<net.ibizsys.model.res.IPSLanguageItem> list){
		this.allpslanguageitems = list;
	}

	public java.lang.String getLanguage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLANGUAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}