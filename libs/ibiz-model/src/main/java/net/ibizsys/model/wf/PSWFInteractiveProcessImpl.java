package net.ibizsys.model.wf;



public class PSWFInteractiveProcessImpl extends net.ibizsys.model.wf.PSWFProcessImpl implements net.ibizsys.model.wf.IPSWFInteractiveProcess{

	public final static String ATTR_GETEDITFIELDS = "editFields";
	public final static String ATTR_GETEDITMODE = "editMode";
	public final static String ATTR_GETFORMCODENAME = "formCodeName";
	public final static String ATTR_GETFORMNAME = "formName";
	public final static String ATTR_GETMEMOFIELD = "memoField";
	public final static String ATTR_GETMOBFORMCODENAME = "mobFormCodeName";
	public final static String ATTR_GETMOBFORMNAME = "mobFormName";
	public final static String ATTR_GETMOBUAGROUPCODENAME = "mobUAGroupCodeName";
	public final static String ATTR_GETMOBUTIL2FORMCODENAME = "mobUtil2FormCodeName";
	public final static String ATTR_GETMOBUTIL2FORMNAME = "mobUtil2FormName";
	public final static String ATTR_GETMOBUTIL3FORMCODENAME = "mobUtil3FormCodeName";
	public final static String ATTR_GETMOBUTIL3FORMNAME = "mobUtil3FormName";
	public final static String ATTR_GETMOBUTIL4FORMCODENAME = "mobUtil4FormCodeName";
	public final static String ATTR_GETMOBUTIL4FORMNAME = "mobUtil4FormName";
	public final static String ATTR_GETMOBUTIL5FORMCODENAME = "mobUtil5FormCodeName";
	public final static String ATTR_GETMOBUTIL5FORMNAME = "mobUtil5FormName";
	public final static String ATTR_GETMOBUTILFORMCODENAME = "mobUtilFormCodeName";
	public final static String ATTR_GETMOBUTILFORMNAME = "mobUtilFormName";
	public final static String ATTR_GETMSGTYPE = "msgType";
	public final static String ATTR_GETMULTIINSTMODE = "multiInstMode";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSWFPROCESSROLES = "getPSWFProcessRoles";
	public final static String ATTR_GETPREDEFINEDACTIONS = "predefinedActions";
	public final static String ATTR_GETUAGROUPCODENAME = "uAGroupCodeName";
	public final static String ATTR_GETUTIL2FORMCODENAME = "util2FormCodeName";
	public final static String ATTR_GETUTIL2FORMNAME = "util2FormName";
	public final static String ATTR_GETUTIL3FORMCODENAME = "util3FormCodeName";
	public final static String ATTR_GETUTIL3FORMNAME = "util3FormName";
	public final static String ATTR_GETUTIL4FORMCODENAME = "util4FormCodeName";
	public final static String ATTR_GETUTIL4FORMNAME = "util4FormName";
	public final static String ATTR_GETUTIL5FORMCODENAME = "util5FormCodeName";
	public final static String ATTR_GETUTIL5FORMNAME = "util5FormName";
	public final static String ATTR_GETUTILFORMCODENAME = "utilFormCodeName";
	public final static String ATTR_GETUTILFORMNAME = "utilFormName";
	public final static String ATTR_ISEDITABLE = "editable";
	public final static String ATTR_ISSENDINFORM = "sendInform";

	private java.util.List<java.lang.String> editfields = null;
	public java.util.List<java.lang.String> getEditFields(){
		if(this.editfields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.editfields = list;
		}
		return (this.editfields.size() == 0)? null : this.editfields;
	}

	public int getEditMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMemoField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMOFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobFormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBFORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUAGroupCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUAGROUPCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil2FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL2FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil2FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL2FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil3FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL3FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil3FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL3FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil4FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL4FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil4FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL4FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil5FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL5FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtil5FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTIL5FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtilFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTILFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobUtilFormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBUTILFORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMsgType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMultiInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMULTIINSTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}


	private java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> pswfprocessroles = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> getPSWFProcessRoles(){
		if(this.pswfprocessroles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFPROCESSROLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFProcessRole>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFProcessRole obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFProcessRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFPROCESSROLES);
				if(obj!=null)list.add(obj);
			}
			this.pswfprocessroles = list;
		}
		return (this.pswfprocessroles.size() == 0)? null : this.pswfprocessroles;
	}

	public net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRole(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFProcessRole.class, this.getPSWFProcessRoles(), objKey, bTryMode);
	}
	public void setPSWFProcessRoles(java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> list){
		this.pswfprocessroles = list;
	}

	private java.util.List<java.lang.String> predefinedactions = null;
	public java.util.List<java.lang.String> getPredefinedActions(){
		if(this.predefinedactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.predefinedactions = list;
		}
		return (this.predefinedactions.size() == 0)? null : this.predefinedactions;
	}

	public java.lang.String getUAGroupCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUAGROUPCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil2FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL2FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil2FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL2FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil3FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL3FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil3FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL3FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil4FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL4FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil4FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL4FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil5FormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL5FORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtil5FormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTIL5FORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilFormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILFORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEditable(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEDITABLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSendInform(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSENDINFORM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}