package net.ibizsys.model.dataentity.mainstate;



public class PSDEMainStateOPPrivImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv{

	public final static String ATTR_GETPSDEOPPRIV = "getPSDEOPPriv";
	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv(){
		if(this.psdeoppriv != null) return this.psdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.psdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEOPPRIV);
		return this.psdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getPSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体操作标识");}
		return value;
	}

	public void setPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv){
		this.psdeoppriv = psdeoppriv;
	}

}