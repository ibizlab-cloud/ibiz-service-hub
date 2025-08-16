package net.ibizsys.model.dataentity.unistate;



public class PSDEUniStateImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.unistate.IPSDEUniState{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSUNISTATE = "getPSSysUniState";
	public final static String ATTR_ISDEFAULT = "default";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysUniState pssysunistate;

	public net.ibizsys.model.res.IPSSysUniState getPSSysUniState(){
		if(this.pssysunistate != null) return this.pssysunistate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNISTATE);
		if(value == null){
			return null;
		}
		this.pssysunistate = getPSModelObject(net.ibizsys.model.res.IPSSysUniState.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNISTATE);
		return this.pssysunistate;
	}

	public net.ibizsys.model.res.IPSSysUniState getPSSysUniStateMust(){
		net.ibizsys.model.res.IPSSysUniState value = this.getPSSysUniState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统状态协同对象");}
		return value;
	}

	public void setPSSysUniState(net.ibizsys.model.res.IPSSysUniState pssysunistate){
		this.pssysunistate = pssysunistate;
	}


	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}