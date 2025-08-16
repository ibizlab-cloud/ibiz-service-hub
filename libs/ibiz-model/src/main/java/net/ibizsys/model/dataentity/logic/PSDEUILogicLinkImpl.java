package net.ibizsys.model.dataentity.logic;



public class PSDEUILogicLinkImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEUILogicLink
		,net.ibizsys.model.app.dataentity.IPSAppDEUILogicLink{

	public final static String ATTR_GETDSTPSDEUILOGICNODE = "getDstPSDEUILogicNode";
	public final static String ATTR_GETLINKCOND = "linkCond";
	public final static String ATTR_GETLINKMODE = "linkMode";
	public final static String ATTR_GETPSDEUILOGICLINKGROUPCOND = "getPSDEUILogicLinkGroupCond";
	public final static String ATTR_GETSRCPSDEUILOGICNODE = "getSrcPSDEUILogicNode";
	public final static String ATTR_ISCATCHLINK = "catchLink";
	public final static String ATTR_ISDEFAULTLINK = "defaultLink";
	public final static String ATTR_ISFULFILLEDLINK = "fulfilledLink";
	public final static String ATTR_ISREJECTEDLINK = "rejectedLink";
	public final static String ATTR_ISSUBCALLLINK = "subCallLink";
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicNode dstpsdeuilogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getDstPSDEUILogicNode(){
		if(this.dstpsdeuilogicnode != null) return this.dstpsdeuilogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEUILOGICNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.dstpsdeuilogicnode = ipsdeuilogic.getPSDEUILogicNode(value, false);
		return this.dstpsdeuilogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getDstPSDEUILogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicNode value = this.getDstPSDEUILogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑节点对象");}
		return value;
	}

	public void setDstPSDEUILogicNode(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode dstpsdeuilogicnode){
		this.dstpsdeuilogicnode = dstpsdeuilogicnode;
	}


	public java.lang.String getLinkCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getLinkMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond psdeuilogiclinkgroupcond;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond getPSDEUILogicLinkGroupCond(){
		if(this.psdeuilogiclinkgroupcond != null) return this.psdeuilogiclinkgroupcond;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUILOGICLINKGROUPCOND);
		if(value == null){
			return null;
		}
		this.psdeuilogiclinkgroupcond = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUILOGICLINKGROUPCOND);
		return this.psdeuilogiclinkgroupcond;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond getPSDEUILogicLinkGroupCondMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond value = this.getPSDEUILogicLinkGroupCond();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接条件对象");}
		return value;
	}

	public void setPSDEUILogicLinkGroupCond(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond psdeuilogiclinkgroupcond){
		this.psdeuilogiclinkgroupcond = psdeuilogiclinkgroupcond;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEUILogicNode srcpsdeuilogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getSrcPSDEUILogicNode(){
		if(this.srcpsdeuilogicnode != null) return this.srcpsdeuilogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEUILOGICNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.srcpsdeuilogicnode = ipsdeuilogic.getPSDEUILogicNode(value, false);
		return this.srcpsdeuilogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getSrcPSDEUILogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicNode value = this.getSrcPSDEUILogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑节点对象");}
		return value;
	}

	public void setSrcPSDEUILogicNode(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode srcpsdeuilogicnode){
		this.srcpsdeuilogicnode = srcpsdeuilogicnode;
	}


	public boolean isCatchLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCATCHLINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTLINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFulfilledLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFULFILLEDLINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRejectedLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREJECTEDLINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubCallLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBCALLLINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}