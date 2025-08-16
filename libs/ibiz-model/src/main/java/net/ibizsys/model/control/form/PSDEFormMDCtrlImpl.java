package net.ibizsys.model.control.form;



public class PSDEFormMDCtrlImpl extends net.ibizsys.model.control.form.PSDEFormBaseGroupPanelImpl implements net.ibizsys.model.control.form.IPSDEFormMDCtrl{

	public final static String ATTR_GETACTIONGROUPEXTRACTMODE = "actionGroupExtractMode";
	public final static String ATTR_GETBUILDINACTIONS = "buildInActions";
	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETCTRLPARAMS = "ctrlParams";
	public final static String ATTR_GETFIELDNAME = "fieldName";
	public final static String ATTR_GETPSAPPDEFIELD = "getPSAppDEField";
	public final static String ATTR_GETPSDEFORMITEMUPDATE = "getPSDEFormItemUpdate";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_GETRESETITEMNAME = "resetItemName";
	public final static String ATTR_GETRESETITEMNAMES = "resetItemNames";
	public final static String ATTR_GETTITLEBARCLOSEMODE = "titleBarCloseMode";
	public final static String ATTR_ISONE2ONEFORM = "one2OneForm";

	public java.lang.String getActionGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONGROUPEXTRACTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getBuildInActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUILDINACTIONS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.IPSControl contentpscontrol;

	public net.ibizsys.model.control.IPSControl getContentPSControl(){
		if(this.contentpscontrol != null) return this.contentpscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSCONTROL);
		if(value == null){
			return null;
		}
		this.contentpscontrol = getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCONTENTPSCONTROL);
		return this.contentpscontrol;
	}

	public net.ibizsys.model.control.IPSControl getContentPSControlMust(){
		net.ibizsys.model.control.IPSControl value = this.getContentPSControl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容部件");}
		return value;
	}


	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getCtrlParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCTRLPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(){
		if(this.psappdefield != null) return this.psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.psappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEFIELD);
		return this.psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体属性");}
		return value;
	}

	private net.ibizsys.model.control.form.IPSDEFormItemUpdate psdeformitemupdate;

	public net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate(){
		if(this.psdeformitemupdate != null) return this.psdeformitemupdate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMUPDATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.form.IPSDEForm ipsdeform = getParentPSModelObject(net.ibizsys.model.control.form.IPSDEForm.class);
		this.psdeformitemupdate = ipsdeform.getPSDEFormItemUpdate(value, false);
		return this.psdeformitemupdate;
	}

	public net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdateMust(){
		net.ibizsys.model.control.form.IPSDEFormItemUpdate value = this.getPSDEFormItemUpdate();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用表单项更新");}
		return value;
	}

	private net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup;

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup(){
		if(this.psuiactiongroup != null) return this.psuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psuiactiongroup = getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTIONGROUP);
		return this.psuiactiongroup;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust(){
		net.ibizsys.model.view.IPSUIActionGroup value = this.getPSUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组对象");}
		return value;
	}


	public java.lang.String getResetItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESETITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<java.lang.String> resetitemnames = null;
	public java.util.List<java.lang.String> getResetItemNames(){
		if(this.resetitemnames == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRESETITEMNAMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.resetitemnames = list;
		}
		return (this.resetitemnames.size() == 0)? null : this.resetitemnames;
	}

	public int getTitleBarCloseMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEBARCLOSEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isOne2OneForm(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISONE2ONEFORM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}