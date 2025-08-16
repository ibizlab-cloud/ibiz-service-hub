package net.ibizsys.model.security;



public class PSSysUserRoleDataImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.security.IPSSysUserRoleData{

	public final static String ATTR_GETPSDEUSERROLE = "getPSDEUserRole";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	private net.ibizsys.model.dataentity.priv.IPSDEUserRole psdeuserrole;

	public net.ibizsys.model.dataentity.priv.IPSDEUserRole getPSDEUserRole(){
		if(this.psdeuserrole != null) return this.psdeuserrole;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUSERROLE);
		if(value == null){
			return null;
		}
		this.psdeuserrole = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEUserRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUSERROLE);
		return this.psdeuserrole;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEUserRole getPSDEUserRoleMust(){
		net.ibizsys.model.dataentity.priv.IPSDEUserRole value = this.getPSDEUserRole();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体能力角色");}
		return value;
	}

	public void setPSDEUserRole(net.ibizsys.model.dataentity.priv.IPSDEUserRole psdeuserrole){
		this.psdeuserrole = psdeuserrole;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}

}