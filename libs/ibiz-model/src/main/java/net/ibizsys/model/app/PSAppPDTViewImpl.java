package net.ibizsys.model.app;



public class PSAppPDTViewImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSAppPDTView{

	public final static String ATTR_GETPSAPPVIEW = "getPSAppView";
	public final static String ATTR_GETPSSYSPDTVIEW = "getPSSysPDTView";
	private net.ibizsys.model.app.view.IPSAppView psappview;

	public net.ibizsys.model.app.view.IPSAppView getPSAppView(){
		if(this.psappview != null) return this.psappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEW);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappview = ipsapplication.getPSAppView(value, false);
		return this.psappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标应用视图");}
		return value;
	}

	public void setPSAppView(net.ibizsys.model.app.view.IPSAppView psappview){
		this.psappview = psappview;
	}

	private net.ibizsys.model.res.IPSSysPDTView pssyspdtview;

	public net.ibizsys.model.res.IPSSysPDTView getPSSysPDTView(){
		if(this.pssyspdtview != null) return this.pssyspdtview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPDTVIEW);
		if(value == null){
			return null;
		}
		net.ibizsys.model.IPSSystem ipssystem = getParentPSModelObject(net.ibizsys.model.IPSSystem.class);
		this.pssyspdtview = ipssystem.getPSSysPDTView(value, false);
		return this.pssyspdtview;
	}

	public net.ibizsys.model.res.IPSSysPDTView getPSSysPDTViewMust(){
		net.ibizsys.model.res.IPSSysPDTView value = this.getPSSysPDTView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统预置视图");}
		return value;
	}

	public void setPSSysPDTView(net.ibizsys.model.res.IPSSysPDTView pssyspdtview){
		this.pssyspdtview = pssyspdtview;
	}

}