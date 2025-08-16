package net.ibizsys.model.control.editor;



public class PSPickupViewImpl extends net.ibizsys.model.control.editor.PSValueItemEditorImpl implements net.ibizsys.model.control.editor.IPSPickupView{

	public final static String ATTR_GETCONTEXTJOSTRING = "contextJOString";
	public final static String ATTR_GETITEMPARAMJO = "itemParamJO";
	public final static String ATTR_GETPARAMJOSTRING = "paramJOString";
	public final static String ATTR_GETPICKUPPSAPPVIEW = "getPickupPSAppView";
	public final static String ATTR_ISENABLEPICKUPVIEW = "enablePickupView";

	public java.lang.String getContextJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTEXTJOSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getItemParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getParamJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMJOSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView pickuppsappview;

	public net.ibizsys.model.app.view.IPSAppView getPickupPSAppView(){
		if(this.pickuppsappview != null) return this.pickuppsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPICKUPPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.pickuppsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPICKUPPSAPPVIEW);
		return this.pickuppsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPickupPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPickupPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定选择视图");}
		return value;
	}

	public void setPickupPSAppView(net.ibizsys.model.app.view.IPSAppView pickuppsappview){
		this.pickuppsappview = pickuppsappview;
	}


	@Deprecated
	public boolean isEnablePickupView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPICKUPVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}