package net.ibizsys.model.app.view;



public class PSAppViewMsgGroupDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail{

	public final static String ATTR_GETPSAPPVIEWMSG = "getPSAppViewMsg";
	public final static String ATTR_GETPOSITION = "position";
	private net.ibizsys.model.app.view.IPSAppViewMsg psappviewmsg;

	public net.ibizsys.model.app.view.IPSAppViewMsg getPSAppViewMsg(){
		if(this.psappviewmsg != null) return this.psappviewmsg;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWMSG);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappviewmsg = ipsapplication.getPSAppViewMsg(value, false);
		return this.psappviewmsg;
	}

	public net.ibizsys.model.app.view.IPSAppViewMsg getPSAppViewMsgMust(){
		net.ibizsys.model.app.view.IPSAppViewMsg value = this.getPSAppViewMsg();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用视图消息");}
		return value;
	}

	public void setPSAppViewMsg(net.ibizsys.model.app.view.IPSAppViewMsg psappviewmsg){
		this.psappviewmsg = psappviewmsg;
	}


	public java.lang.String getPosition(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPOSITION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}