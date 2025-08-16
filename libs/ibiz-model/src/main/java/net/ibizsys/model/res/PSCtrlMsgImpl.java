package net.ibizsys.model.res;



public class PSCtrlMsgImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSCtrlMsg{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMSGMODEL = "msgModel";
	public final static String ATTR_GETPSCTRLMSGITEMS = "getPSCtrlMsgItems";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMsgModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.res.IPSCtrlMsgItem> psctrlmsgitems = null;
	public java.util.List<net.ibizsys.model.res.IPSCtrlMsgItem> getPSCtrlMsgItems(){
		if(this.psctrlmsgitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCTRLMSGITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSCtrlMsgItem> list = new java.util.ArrayList<net.ibizsys.model.res.IPSCtrlMsgItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSCtrlMsgItem obj = this.getPSModelObject(net.ibizsys.model.res.IPSCtrlMsgItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCTRLMSGITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psctrlmsgitems = list;
		}
		return (this.psctrlmsgitems.size() == 0)? null : this.psctrlmsgitems;
	}

	public net.ibizsys.model.res.IPSCtrlMsgItem getPSCtrlMsgItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSCtrlMsgItem.class, this.getPSCtrlMsgItems(), objKey, bTryMode);
	}
	public void setPSCtrlMsgItems(java.util.List<net.ibizsys.model.res.IPSCtrlMsgItem> list){
		this.psctrlmsgitems = list;
	}
}