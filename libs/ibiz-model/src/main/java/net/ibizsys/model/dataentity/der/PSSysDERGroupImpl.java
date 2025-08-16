package net.ibizsys.model.dataentity.der;



public class PSSysDERGroupImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dataentity.der.IPSSysDERGroup{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETGROUPTAG = "groupTag";
	public final static String ATTR_GETGROUPTAG2 = "groupTag2";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDERGROUPDETAILS = "getPSDERGroupDetails";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getGroupTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroupDetail> psdergroupdetails = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroupDetail> getPSDERGroupDetails(){
		if(this.psdergroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDERGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSDERGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSDERGroupDetail obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDERGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdergroupdetails = list;
		}
		return (this.psdergroupdetails.size() == 0)? null : this.psdergroupdetails;
	}

	public net.ibizsys.model.dataentity.der.IPSDERGroupDetail getPSDERGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERGroupDetail.class, this.getPSDERGroupDetails(), objKey, bTryMode);
	}
	public void setPSDERGroupDetails(java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroupDetail> list){
		this.psdergroupdetails = list;
	}
}