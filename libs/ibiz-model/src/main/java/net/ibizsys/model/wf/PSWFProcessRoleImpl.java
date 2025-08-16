package net.ibizsys.model.wf;



public class PSWFProcessRoleImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFProcessRole{

	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";
	public final static String ATTR_GETPSWFROLE = "getPSWFRole";
	public final static String ATTR_GETUDFIELD = "uDField";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_GETWFPROCESSROLETYPE = "wFProcessRoleType";
	public final static String ATTR_ISCCMODE = "cCMode";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定通知消息模板");}
		return value;
	}

	private net.ibizsys.model.wf.IPSWFRole pswfrole;

	public net.ibizsys.model.wf.IPSWFRole getPSWFRole(){
		if(this.pswfrole != null) return this.pswfrole;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFROLE);
		if(value == null){
			return null;
		}
		this.pswfrole = getPSModelObject(net.ibizsys.model.wf.IPSWFRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWFROLE);
		return this.pswfrole;
	}

	public net.ibizsys.model.wf.IPSWFRole getPSWFRoleMust(){
		net.ibizsys.model.wf.IPSWFRole value = this.getPSWFRole();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程角色对象");}
		return value;
	}


	public java.lang.String getUDField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUDFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFProcessRoleType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFPROCESSROLETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCCMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCCMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}