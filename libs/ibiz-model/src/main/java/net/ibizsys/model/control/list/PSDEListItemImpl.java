package net.ibizsys.model.control.list;



public class PSDEListItemImpl extends net.ibizsys.model.control.list.PSListItemImpl implements net.ibizsys.model.control.list.IPSDEListItem{

	public final static String ATTR_GETALIGN = "align";
	public final static String ATTR_GETCLCONVERTMODE = "cLConvertMode";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETDATAITEMNAME = "dataItemName";
	public final static String ATTR_GETGROUPITEM = "groupItem";
	public final static String ATTR_GETITEMPRIVID = "itemPrivId";
	public final static String ATTR_GETITEMTYPE = "itemType";
	public final static String ATTR_GETPSCONTROLATTRIBUTES = "getPSControlAttributes";
	public final static String ATTR_GETPSCONTROLLOGICS = "getPSControlLogics";
	public final static String ATTR_GETPSCONTROLRENDERS = "getPSControlRenders";
	public final static String ATTR_GETPSDEUIACTIONGROUP = "getPSDEUIActionGroup";
	public final static String ATTR_GETRENDERPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_GETWIDTHSTRING = "widthString";
	public final static String ATTR_ISENABLEITEMPRIV = "enableItemPriv";
	public final static String ATTR_ISENABLESORT = "enableSort";
	public final static String ATTR_ISHIDDENDATAITEM = "hiddenDataItem";

	public java.lang.String getAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCLConvertMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLCONVERTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}

	public void setCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cappslanguageres){
		this.cappslanguageres = cappslanguageres;
	}


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPITEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemPrivId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPRIVID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.IPSControlAttribute> pscontrolattributes = null;
	public java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes(){
		if(this.pscontrolattributes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLATTRIBUTES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlAttribute> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlAttribute>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlAttribute obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLATTRIBUTES);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolattributes = list;
		}
		return (this.pscontrolattributes.size() == 0)? null : this.pscontrolattributes;
	}

	public net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, this.getPSControlAttributes(), objKey, bTryMode);
	}
	public void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list){
		this.pscontrolattributes = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlLogic> pscontrollogics = null;
	public java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics(){
		if(this.pscontrollogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlLogic> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlLogic obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrollogics = list;
		}
		return (this.pscontrollogics.size() == 0)? null : this.pscontrollogics;
	}

	public net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, this.getPSControlLogics(), objKey, bTryMode);
	}
	public void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list){
		this.pscontrollogics = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlRender> pscontrolrenders = null;
	public java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders(){
		if(this.pscontrolrenders == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLRENDERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlRender> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlRender>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlRender obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLRENDERS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolrenders = list;
		}
		return (this.pscontrolrenders.size() == 0)? null : this.pscontrolrenders;
	}

	public net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, this.getPSControlRenders(), objKey, bTryMode);
	}
	public void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list){
		this.pscontrolrenders = list;
	}
	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup(){
		if(this.psdeuiactiongroup != null) return this.psdeuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP);
		return this.psdeuiactiongroup;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组");}
		return value;
	}

	public void setPSDEUIActionGroup(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup){
		this.psdeuiactiongroup = psdeuiactiongroup;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin renderpssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPlugin(){
		if(this.renderpssyspfplugin != null) return this.renderpssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRENDERPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.renderpssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETRENDERPSSYSPFPLUGIN);
		return this.renderpssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getRenderPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定列前端扩展插件");}
		return value;
	}

	public void setRenderPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin renderpssyspfplugin){
		this.renderpssyspfplugin = renderpssyspfplugin;
	}


	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getWidthString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTHSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableItemPriv(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEITEMPRIV);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSort(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isHiddenDataItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDDENDATAITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}