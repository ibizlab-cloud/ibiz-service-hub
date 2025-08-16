package net.ibizsys.model.app.control;



public class PSAppPortletImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.control.IPSAppPortlet{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPPORTLETCAT = "getPSAppPortletCat";
	public final static String ATTR_GETPSCONTROL = "getPSControl";
	public final static String ATTR_GETPORTLETPARAMS = "portletParams";
	public final static String ATTR_ISENABLEAPPDASHBOARD = "enableAppDashboard";
	public final static String ATTR_ISENABLEDEDASHBOARD = "enableDEDashboard";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
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

	private net.ibizsys.model.app.control.IPSAppPortletCat psappportletcat;

	public net.ibizsys.model.app.control.IPSAppPortletCat getPSAppPortletCat(){
		if(this.psappportletcat != null) return this.psappportletcat;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPPORTLETCAT);
		if(value == null){
			return null;
		}
		this.psappportletcat = getPSModelObject(net.ibizsys.model.app.control.IPSAppPortletCat.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPPORTLETCAT);
		return this.psappportletcat;
	}

	public net.ibizsys.model.app.control.IPSAppPortletCat getPSAppPortletCatMust(){
		net.ibizsys.model.app.control.IPSAppPortletCat value = this.getPSAppPortletCat();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用门户部件分类");}
		return value;
	}

	public void setPSAppPortletCat(net.ibizsys.model.app.control.IPSAppPortletCat psappportletcat){
		this.psappportletcat = psappportletcat;
	}

	private net.ibizsys.model.control.IPSControl pscontrol;

	public net.ibizsys.model.control.IPSControl getPSControl(){
		if(this.pscontrol != null) return this.pscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROL);
		if(value == null){
			return null;
		}
		this.pscontrol = getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCONTROL);
		return this.pscontrol;
	}

	public net.ibizsys.model.control.IPSControl getPSControlMust(){
		net.ibizsys.model.control.IPSControl value = this.getPSControl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定控件对象");}
		return value;
	}

	public void setPSControl(net.ibizsys.model.control.IPSControl pscontrol){
		this.pscontrol = pscontrol;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getPortletParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public boolean isEnableAppDashboard(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAPPDASHBOARD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDEDashboard(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDEDASHBOARD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}