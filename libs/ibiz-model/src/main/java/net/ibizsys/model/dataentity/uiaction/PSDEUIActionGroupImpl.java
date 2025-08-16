package net.ibizsys.model.dataentity.uiaction;



public class PSDEUIActionGroupImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup
		,net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETGROUPTAG = "groupTag";
	public final static String ATTR_GETGROUPTAG2 = "groupTag2";
	public final static String ATTR_GETGROUPTAG3 = "groupTag3";
	public final static String ATTR_GETGROUPTAG4 = "groupTag4";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSUIACTIONGROUPDETAILS = "getPSUIActionGroupDetails";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
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

	public java.lang.String getGroupTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG4);
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
	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}


	private java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> psuiactiongroupdetails = null;
	public java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> getPSUIActionGroupDetails(){
		if(this.psuiactiongroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.view.IPSUIActionGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.view.IPSUIActionGroupDetail obj = this.getPSModelObject(net.ibizsys.model.view.IPSUIActionGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSUIACTIONGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psuiactiongroupdetails = list;
		}
		return (this.psuiactiongroupdetails.size() == 0)? null : this.psuiactiongroupdetails;
	}

	public net.ibizsys.model.view.IPSUIActionGroupDetail getPSUIActionGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.view.IPSUIActionGroupDetail.class, this.getPSUIActionGroupDetails(), objKey, bTryMode);
	}
	public void setPSUIActionGroupDetails(java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> list){
		this.psuiactiongroupdetails = list;
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}