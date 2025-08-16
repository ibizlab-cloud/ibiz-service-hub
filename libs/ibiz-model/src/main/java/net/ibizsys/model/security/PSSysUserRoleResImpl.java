package net.ibizsys.model.security;



public class PSSysUserRoleResImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.security.IPSSysUserRoleRes{

	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETSYSUNIRESCODE = "sysUniResCode";
	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统统一资源");}
		return value;
	}

	public void setPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes pssysunires){
		this.pssysunires = pssysunires;
	}


	public java.lang.String getSysUniResCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSUNIRESCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}