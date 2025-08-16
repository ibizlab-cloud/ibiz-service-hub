package net.ibizsys.model.control.grid;



public class PSDEGridEditItemUpdateImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSAPPDEMETHOD = "getPSAppDEMethod";
	public final static String ATTR_GETPSDEGEIUPDATEDETAILS = "getPSDEGEIUpdateDetails";
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


	private java.util.List<net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail> psdegeiupdatedetails = null;
	public java.util.List<net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail> getPSDEGEIUpdateDetails(){
		if(this.psdegeiupdatedetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGEIUPDATEDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail> list = new java.util.ArrayList<net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail obj = this.getPSModelObject(net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGEIUPDATEDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdegeiupdatedetails = list;
		}
		return (this.psdegeiupdatedetails.size() == 0)? null : this.psdegeiupdatedetails;
	}

	public net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail getPSDEGEIUpdateDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail.class, this.getPSDEGEIUpdateDetails(), objKey, bTryMode);
	}
	public void setPSDEGEIUpdateDetails(java.util.List<net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail> list){
		this.psdegeiupdatedetails = list;
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