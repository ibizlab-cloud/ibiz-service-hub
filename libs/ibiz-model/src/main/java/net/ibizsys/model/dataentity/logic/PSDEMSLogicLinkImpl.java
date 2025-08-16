package net.ibizsys.model.dataentity.logic;



public class PSDEMSLogicLinkImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink{

	public final static String ATTR_GETDSTPSDEMSLOGICNODE = "getDstPSDEMSLogicNode";
	public final static String ATTR_GETPSDEMSLOGICLINKGROUPCOND = "getPSDEMSLogicLinkGroupCond";
	public final static String ATTR_GETSRCPSDEMSLOGICNODE = "getSrcPSDEMSLogicNode";
	public final static String ATTR_ISDEFAULTLINK = "defaultLink";
	private net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode dstpsdemslogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDstPSDEMSLogicNode(){
		if(this.dstpsdemslogicnode != null) return this.dstpsdemslogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEMSLOGICNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEMSLogic ipsdemslogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogic.class);
		this.dstpsdemslogicnode = ipsdemslogic.getPSDEMSLogicNode(value, false);
		return this.dstpsdemslogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDstPSDEMSLogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode value = this.getDstPSDEMSLogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标主状态节点对象");}
		return value;
	}

	public void setDstPSDEMSLogicNode(net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode dstpsdemslogicnode){
		this.dstpsdemslogicnode = dstpsdemslogicnode;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond psdemslogiclinkgroupcond;

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond getPSDEMSLogicLinkGroupCond(){
		if(this.psdemslogiclinkgroupcond != null) return this.psdemslogiclinkgroupcond;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMSLOGICLINKGROUPCOND);
		if(value == null){
			return null;
		}
		this.psdemslogiclinkgroupcond = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEMSLOGICLINKGROUPCOND);
		return this.psdemslogiclinkgroupcond;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond getPSDEMSLogicLinkGroupCondMust(){
		net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond value = this.getPSDEMSLogicLinkGroupCond();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接条件对象");}
		return value;
	}

	public void setPSDEMSLogicLinkGroupCond(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond psdemslogiclinkgroupcond){
		this.psdemslogiclinkgroupcond = psdemslogiclinkgroupcond;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode srcpsdemslogicnode;

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getSrcPSDEMSLogicNode(){
		if(this.srcpsdemslogicnode != null) return this.srcpsdemslogicnode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEMSLOGICNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEMSLogic ipsdemslogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogic.class);
		this.srcpsdemslogicnode = ipsdemslogic.getPSDEMSLogicNode(value, false);
		return this.srcpsdemslogicnode;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getSrcPSDEMSLogicNodeMust(){
		net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode value = this.getSrcPSDEMSLogicNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源主状态节点对象");}
		return value;
	}

	public void setSrcPSDEMSLogicNode(net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode srcpsdemslogicnode){
		this.srcpsdemslogicnode = srcpsdemslogicnode;
	}


	public boolean isDefaultLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTLINK);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}