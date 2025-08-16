package net.ibizsys.model.control.editor;



public class PSHtmlImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.editor.IPSHtml{

	public final static String ATTR_GETPSAPPDEACMODE = "getPSAppDEACMode";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPICKUPPSAPPVIEW = "getPickupPSAppView";
	public final static String ATTR_ISENABLEAC = "enableAC";
	public final static String ATTR_ISENABLEPICKUPVIEW = "enablePickupView";
	private net.ibizsys.model.app.dataentity.IPSAppDEACMode psappdeacmode;

	public net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode(){
		if(this.psappdeacmode != null) return this.psappdeacmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEACMODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdeacmode = ipsappdataentity.getPSAppDEACMode(value, false);
		return this.psappdeacmode;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEACMode value = this.getPSAppDEACMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体自填模式对象");}
		return value;
	}

	public void setPSAppDEACMode(net.ibizsys.model.app.dataentity.IPSAppDEACMode psappdeacmode){
		this.psappdeacmode = psappdeacmode;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(){
		if(this.psappdedataset != null) return this.psappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体结果集对象");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体对象");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
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


	public boolean isEnableAC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAC);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnablePickupView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPICKUPVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}