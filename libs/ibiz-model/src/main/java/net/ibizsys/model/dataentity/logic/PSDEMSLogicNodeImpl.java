package net.ibizsys.model.dataentity.logic;



public class PSDEMSLogicNodeImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode{

	public final static String ATTR_GETACTIONS = "actions";
	public final static String ATTR_GETBKCOLOR = "bKColor";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOLOR = "color";
	public final static String ATTR_GETCSSCLASS = "cssClass";
	public final static String ATTR_GETFIELDS = "fields";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETLEFTPOS = "leftPos";
	public final static String ATTR_GETLOGICNODETYPE = "logicNodeType";
	public final static String ATTR_GETOPPRIVS = "oPPrivs";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEMSLOGICLINKS = "getPSDEMSLogicLinks";
	public final static String ATTR_GETPSDEMAINSTATE = "getPSDEMainState";
	public final static String ATTR_GETSTATEVALUE = "stateValue";
	public final static String ATTR_GETTOPPOS = "topPos";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISACTIONALLOWMODE = "actionAllowMode";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISFIELDALLOWMODE = "fieldAllowMode";
	public final static String ATTR_ISOPPRIVALLOWMODE = "oPPrivAllowMode";
	public final static String ATTR_ISPARALLELOUTPUT = "parallelOutput";

	private java.util.List<java.lang.String> actions = null;
	public java.util.List<java.lang.String> getActions(){
		if(this.actions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.actions = list;
		}
		return (this.actions.size() == 0)? null : this.actions;
	}

	public java.lang.String getBKColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBKCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCssClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSCLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<java.lang.String> fields = null;
	public java.util.List<java.lang.String> getFields(){
		if(this.fields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.fields = list;
		}
		return (this.fields.size() == 0)? null : this.fields;
	}

	public int getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getLeftPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEFTPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicNodeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNODETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<java.lang.String> opprivs = null;
	public java.util.List<java.lang.String> getOPPrivs(){
		if(this.opprivs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPPRIVS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.opprivs = list;
		}
		return (this.opprivs.size() == 0)? null : this.opprivs;
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink> psdemslogiclinks = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink> getPSDEMSLogicLinks(){
		if(this.psdemslogiclinks == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMSLOGICLINKS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMSLOGICLINKS);
				if(obj!=null)list.add(obj);
			}
			this.psdemslogiclinks = list;
		}
		return (this.psdemslogiclinks.size() == 0)? null : this.psdemslogiclinks;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink getPSDEMSLogicLink(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink.class, this.getPSDEMSLogicLinks(), objKey, bTryMode);
	}
	public void setPSDEMSLogicLinks(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink> list){
		this.psdemslogiclinks = list;
	}
	private net.ibizsys.model.dataentity.mainstate.IPSDEMainState psdemainstate;

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainState(){
		if(this.psdemainstate != null) return this.psdemainstate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAINSTATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdemainstate = ipsdataentity.getPSDEMainState(value, false);
		return this.psdemainstate;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainStateMust(){
		net.ibizsys.model.dataentity.mainstate.IPSDEMainState value = this.getPSDEMainState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体主状态");}
		return value;
	}

	public void setPSDEMainState(net.ibizsys.model.dataentity.mainstate.IPSDEMainState psdemainstate){
		this.psdemainstate = psdemainstate;
	}


	public java.lang.String getStateValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTopPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPPOS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isActionAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISACTIONALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFieldAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFIELDALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isOPPrivAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOPPRIVALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isParallelOutput(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPARALLELOUTPUT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}