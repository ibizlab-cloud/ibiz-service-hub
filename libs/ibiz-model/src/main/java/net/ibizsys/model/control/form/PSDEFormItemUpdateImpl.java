package net.ibizsys.model.control.form;



public class PSDEFormItemUpdateImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.form.IPSDEFormItemUpdate{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMODELSTATE = "modelState";
	public final static String ATTR_GETPSAPPDEMETHOD = "getPSAppDEMethod";
	public final static String ATTR_GETPSDEFIUPDATEDETAILS = "getPSDEFIUpdateDetails";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
	public final static String ATTR_ISSHOWBUSYINDICATOR = "showBusyIndicator";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getModelState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELSTATE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEMethod psappdemethod;

	public net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod(){
		if(this.psappdemethod != null) return this.psappdemethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdemethod = ipsappdataentity.getPSAppDEMethod(value, false);
		return this.psappdemethod;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEMethod value = this.getPSAppDEMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定处理应用实体方法");}
		return value;
	}

	public void setPSAppDEMethod(net.ibizsys.model.app.dataentity.IPSAppDEMethod psappdemethod){
		this.psappdemethod = psappdemethod;
	}


	private java.util.List<net.ibizsys.model.control.form.IPSDEFIUpdateDetail> psdefiupdatedetails = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFIUpdateDetail> getPSDEFIUpdateDetails(){
		if(this.psdefiupdatedetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIUPDATEDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFIUpdateDetail> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFIUpdateDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFIUpdateDetail obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFIUpdateDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFIUPDATEDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdefiupdatedetails = list;
		}
		return (this.psdefiupdatedetails.size() == 0)? null : this.psdefiupdatedetails;
	}

	public net.ibizsys.model.control.form.IPSDEFIUpdateDetail getPSDEFIUpdateDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFIUpdateDetail.class, this.getPSDEFIUpdateDetails(), objKey, bTryMode);
	}
	public void setPSDEFIUpdateDetails(java.util.List<net.ibizsys.model.control.form.IPSDEFIUpdateDetail> list){
		this.psdefiupdatedetails = list;
	}

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowBusyIndicator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWBUSYINDICATOR);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}