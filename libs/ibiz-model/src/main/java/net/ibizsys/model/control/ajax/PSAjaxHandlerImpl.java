package net.ibizsys.model.control.ajax;



public class PSAjaxHandlerImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.ajax.IPSAjaxHandler{

	public final static String ATTR_GETHANDLEROBJ = "handlerObj";
	public final static String ATTR_GETHANDLERTAG = "handlerTag";
	public final static String ATTR_GETHANDLERTAG2 = "handlerTag2";
	public final static String ATTR_GETPSHANDLERACTIONS = "getPSHandlerActions";
	public final static String ATTR_GETUSERTAG = "userTag";
	public final static String ATTR_GETUSERTAG2 = "userTag2";
	public final static String ATTR_GETUSERTAG3 = "userTag3";
	public final static String ATTR_GETUSERTAG4 = "userTag4";

	public java.lang.String getHandlerObj(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHANDLEROBJ);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHandlerTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHANDLERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHandlerTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHANDLERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.IPSControlHandlerAction> pshandleractions = null;
	public java.util.List<net.ibizsys.model.control.IPSControlHandlerAction> getPSHandlerActions(){
		if(this.pshandleractions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSHANDLERACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlHandlerAction> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlHandlerAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlHandlerAction obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlHandlerAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSHANDLERACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.pshandleractions = list;
		}
		return (this.pshandleractions.size() == 0)? null : this.pshandleractions;
	}

	public net.ibizsys.model.control.IPSControlHandlerAction getPSControlHandlerAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlHandlerAction.class, this.getPSHandlerActions(), objKey, bTryMode);
	}
	public void setPSControlHandlerActions(java.util.List<net.ibizsys.model.control.IPSControlHandlerAction> list){
		this.pshandleractions = list;
	}

	public java.lang.String getUserTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}