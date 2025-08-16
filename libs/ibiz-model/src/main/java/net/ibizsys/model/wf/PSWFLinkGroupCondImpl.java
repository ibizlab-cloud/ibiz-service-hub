package net.ibizsys.model.wf;



public class PSWFLinkGroupCondImpl extends net.ibizsys.model.wf.PSWFLinkCondImpl implements net.ibizsys.model.wf.IPSWFLinkGroupCond{

	public final static String ATTR_GETGROUPOP = "groupOP";
	public final static String ATTR_GETPSWFLINKCONDS = "getPSWFLinkConds";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getGroupOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFLinkCond> pswflinkconds = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFLinkCond> getPSWFLinkConds(){
		if(this.pswflinkconds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFLINKCONDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFLinkCond> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFLinkCond>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFLinkCond obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFLinkCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFLINKCONDS);
				if(obj!=null)list.add(obj);
			}
			this.pswflinkconds = list;
		}
		return (this.pswflinkconds.size() == 0)? null : this.pswflinkconds;
	}

	public net.ibizsys.model.wf.IPSWFLinkCond getPSWFLinkCond(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFLinkCond.class, this.getPSWFLinkConds(), objKey, bTryMode);
	}
	public void setPSWFLinkConds(java.util.List<net.ibizsys.model.wf.IPSWFLinkCond> list){
		this.pswflinkconds = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}