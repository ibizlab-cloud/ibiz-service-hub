package net.ibizsys.model.wf;



public class PSSysWFSettingImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.wf.IPSSysWFSetting{

	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSWFUTILUIACTIONS = "getPSWFUtilUIActions";
	public final static String ATTR_GETREMINDPSSYSMSGTEMPL = "getRemindPSSysMsgTempl";

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFUtilUIAction> pswfutiluiactions = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFUtilUIAction> getPSWFUtilUIActions(){
		if(this.pswfutiluiactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFUTILUIACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFUtilUIAction> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFUtilUIAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFUtilUIAction obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFUtilUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFUTILUIACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.pswfutiluiactions = list;
		}
		return (this.pswfutiluiactions.size() == 0)? null : this.pswfutiluiactions;
	}

	public net.ibizsys.model.wf.IPSWFUtilUIAction getPSWFUtilUIAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFUtilUIAction.class, this.getPSWFUtilUIActions(), objKey, bTryMode);
	}
	public void setPSWFUtilUIActions(java.util.List<net.ibizsys.model.wf.IPSWFUtilUIAction> list){
		this.pswfutiluiactions = list;
	}
	private net.ibizsys.model.msg.IPSSysMsgTempl remindpssysmsgtempl;

	public net.ibizsys.model.msg.IPSSysMsgTempl getRemindPSSysMsgTempl(){
		if(this.remindpssysmsgtempl != null) return this.remindpssysmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMINDPSSYSMSGTEMPL);
		if(value == null){
			return null;
		}
		this.remindpssysmsgtempl = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREMINDPSSYSMSGTEMPL);
		return this.remindpssysmsgtempl;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getRemindPSSysMsgTemplMust(){
		net.ibizsys.model.msg.IPSSysMsgTempl value = this.getRemindPSSysMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定催办消息模板");}
		return value;
	}

}