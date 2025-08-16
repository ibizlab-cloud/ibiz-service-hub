package net.ibizsys.model.app.control;



public class PSAppPortletContainerViewImpl extends net.ibizsys.model.app.view.PSAppPortalViewImpl{

	public final static String ATTR_GETPSAPPMODULE = "getPSAppModule";
	private net.ibizsys.model.app.IPSAppModule psappmodule;

	@Deprecated
	public net.ibizsys.model.app.IPSAppModule getPSAppModule(){
		if(this.psappmodule != null) return this.psappmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMODULE);
		if(value == null){
			return null;
		}
		this.psappmodule = getPSModelObject(net.ibizsys.model.app.IPSAppModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPMODULE);
		return this.psappmodule;
	}

	public net.ibizsys.model.app.IPSAppModule getPSAppModuleMust(){
		net.ibizsys.model.app.IPSAppModule value = this.getPSAppModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSAppModule]返回空值");}
		return value;
	}

	public void setPSAppModule(net.ibizsys.model.app.IPSAppModule psappmodule){
		this.psappmodule = psappmodule;
	}

}