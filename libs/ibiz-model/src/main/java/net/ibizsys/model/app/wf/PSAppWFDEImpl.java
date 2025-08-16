package net.ibizsys.model.app.wf;



public class PSAppWFDEImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.wf.IPSAppWFDE{

	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETENTITYWFSTATE = "entityWFState";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPWF = "getPSAppWF";
	public final static String ATTR_GETWFSTATEPSAPPDEFIELD = "getWFStatePSAppDEField";

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEntityWFState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFSTATE);
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
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappdataentity = ipsapplication.getPSAppDataEntity(value, false);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.app.wf.IPSAppWF psappwf;

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWF(){
		if(this.psappwf != null) return this.psappwf;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWF);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappwf = ipsapplication.getPSAppWF(value, false);
		return this.psappwf;
	}

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWFMust(){
		net.ibizsys.model.app.wf.IPSAppWF value = this.getPSAppWF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用工作流");}
		return value;
	}

	public void setPSAppWF(net.ibizsys.model.app.wf.IPSAppWF psappwf){
		this.psappwf = psappwf;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField wfstatepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getWFStatePSAppDEField(){
		if(this.wfstatepsappdefield != null) return this.wfstatepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTATEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.wfstatepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.wfstatepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getWFStatePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getWFStatePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程状态应用应用属性");}
		return value;
	}

	public void setWFStatePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField wfstatepsappdefield){
		this.wfstatepsappdefield = wfstatepsappdefield;
	}

}