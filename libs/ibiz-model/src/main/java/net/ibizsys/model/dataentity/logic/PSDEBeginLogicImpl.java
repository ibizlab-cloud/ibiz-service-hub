package net.ibizsys.model.dataentity.logic;



public class PSDEBeginLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEBeginLogic{

	public final static String ATTR_GETMESSAGE = "message";
	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";

	public java.lang.String getMessage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMESSAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl;

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl(){
		if(this.pssysmsgtempl != null) return this.pssysmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMSGTEMPL);
		if(value == null){
			return null;
		}
		this.pssysmsgtempl = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMSGTEMPL);
		return this.pssysmsgtempl;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust(){
		net.ibizsys.model.msg.IPSSysMsgTempl value = this.getPSSysMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息模板");}
		return value;
	}

	public void setPSSysMsgTempl(net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl){
		this.pssysmsgtempl = pssysmsgtempl;
	}

}