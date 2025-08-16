package net.ibizsys.model.app.view;



public class PSAppRedirectViewImpl extends net.ibizsys.model.app.view.PSAppViewImpl implements net.ibizsys.model.app.view.IPSAppRedirectView{

	public final static String ATTR_GETREDIRECTPSAPPVIEWREFS = "getRedirectPSAppViewRefs";
	public final static String ATTR_ISENABLEDP = "enableDP";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISREDIRECTVIEW = "redirectView";

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> redirectpsappviewrefs = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> getRedirectPSAppViewRefs(){
		if(this.redirectpsappviewrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREDIRECTPSAPPVIEWREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewRef obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETREDIRECTPSAPPVIEWREFS);
				if(obj!=null)list.add(obj);
			}
			this.redirectpsappviewrefs = list;
		}
		return (this.redirectpsappviewrefs.size() == 0)? null : this.redirectpsappviewrefs;
	}

	public net.ibizsys.model.app.view.IPSAppViewRef getRedirectPSAppViewRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, this.getRedirectPSAppViewRefs(), objKey, bTryMode);
	}
	
	public void setRedirectPSAppViewRefs(java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list){
		this.redirectpsappviewrefs = list;
	}

	@Deprecated
	public boolean isEnableDP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRedirectView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREDIRECTVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}