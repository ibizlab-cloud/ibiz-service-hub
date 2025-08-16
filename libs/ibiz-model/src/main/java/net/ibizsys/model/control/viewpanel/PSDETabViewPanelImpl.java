package net.ibizsys.model.control.viewpanel;



public class PSDETabViewPanelImpl extends net.ibizsys.model.control.viewpanel.PSDEViewPanelImpl implements net.ibizsys.model.control.viewpanel.IPSDETabViewPanel{

	public final static String ATTR_GETCOUNTERID = "counterId";
	public final static String ATTR_GETNAVFILTER = "navFilter";
	public final static String ATTR_GETNAVPSDER = "getNavPSDER";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSDEOPPRIV = "getPSDEOPPriv";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPARENTDATAJO = "parentDataJO";

	public java.lang.String getCounterId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNavFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.der.IPSDERBase navpsder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDER(){
		if(this.navpsder != null) return this.navpsder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVPSDER);
		if(value == null){
			return null;
		}
		this.navpsder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAVPSDER);
		return this.navpsder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getNavPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导航关系对象");}
		return value;
	}

	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.psappcounterref = getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCOUNTERREF);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定访问操作标识");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题图标");}
		return value;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getParentDataJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTDATAJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
}