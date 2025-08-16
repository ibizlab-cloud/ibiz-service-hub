package net.ibizsys.model.dataentity.logic;



public class PSDELogicLinkImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDELogicLink
		,net.ibizsys.model.app.dataentity.IPSAppDELogicLink{

	public final static String ATTR_GETDSTPSDELOGICNODE = "getDstPSDELogicNode";
	public final static String ATTR_GETPSDELOGICLINKGROUPCOND = "getPSDELogicLinkGroupCond";
	public final static String ATTR_GETSRCPSDELOGICNODE = "getSrcPSDELogicNode";
	public final static String ATTR_ISCATCHLINK = "catchLink";
	public final static String ATTR_ISDEFAULTLINK = "defaultLink";
	public final static String ATTR_ISSUBCALLLINK = "subCallLink";
	private net.ibizsys.model.dataentity.logic.IPSDELogicNode dstpsdelogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDELogicNode getDstPSDELogicNode(){
		if(this.dstpsdelogicnode != null) return this.dstpsdelogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGICNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.dstpsdelogicnode = ipsdelogic.getPSDELogicNode(value, false);
		return this.dstpsdelogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicNode getDstPSDELogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicNode value = this.getDstPSDELogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑节点对象");}
		return value;
	}

	public void setDstPSDELogicNode(net.ibizsys.model.dataentity.logic.IPSDELogicNode dstpsdelogicnode){
		this.dstpsdelogicnode = dstpsdelogicnode;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond psdelogiclinkgroupcond;

	public net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond getPSDELogicLinkGroupCond(){
		if(this.psdelogiclinkgroupcond != null) return this.psdelogiclinkgroupcond;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGICLINKGROUPCOND);
		if(value == null){
			return null;
		}
		this.psdelogiclinkgroupcond = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDELOGICLINKGROUPCOND);
		return this.psdelogiclinkgroupcond;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond getPSDELogicLinkGroupCondMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond value = this.getPSDELogicLinkGroupCond();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接条件对象");}
		return value;
	}

	public void setPSDELogicLinkGroupCond(net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond psdelogiclinkgroupcond){
		this.psdelogiclinkgroupcond = psdelogiclinkgroupcond;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogicNode srcpsdelogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDELogicNode getSrcPSDELogicNode(){
		if(this.srcpsdelogicnode != null) return this.srcpsdelogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDELOGICNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.srcpsdelogicnode = ipsdelogic.getPSDELogicNode(value, false);
		return this.srcpsdelogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicNode getSrcPSDELogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicNode value = this.getSrcPSDELogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑节点对象");}
		return value;
	}

	public void setSrcPSDELogicNode(net.ibizsys.model.dataentity.logic.IPSDELogicNode srcpsdelogicnode){
		this.srcpsdelogicnode = srcpsdelogicnode;
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

	public boolean isSubCallLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBCALLLINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}