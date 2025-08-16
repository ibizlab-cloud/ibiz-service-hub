package net.ibizsys.model.control.menu;



public class PSAppMenuImpl extends net.ibizsys.model.control.PSAjaxControlImpl implements net.ibizsys.model.control.menu.IPSAppMenu{

	public final static String ATTR_GETAPPMENUSTYLE = "appMenuStyle";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLAYOUTMODE = "layoutMode";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSAPPMENUITEMS = "getPSAppMenuItems";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";

	public java.lang.String getAppMenuStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPMENUSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLayoutMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.psappcounterref = getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCOUNTERREF);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> psappmenuitems = null;
	public java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> getPSAppMenuItems(){
		if(this.psappmenuitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMENUITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> list = new java.util.ArrayList<net.ibizsys.model.control.menu.IPSAppMenuItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.menu.IPSAppMenuItem obj = this.getPSModelObject(net.ibizsys.model.control.menu.IPSAppMenuItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPMENUITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psappmenuitems = list;
		}
		return (this.psappmenuitems.size() == 0)? null : this.psappmenuitems;
	}

	public net.ibizsys.model.control.menu.IPSAppMenuItem getPSAppMenuItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.menu.IPSAppMenuItem.class, this.getPSAppMenuItems(), objKey, bTryMode);
	}
	public void setPSAppMenuItems(java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> list){
		this.psappmenuitems = list;
	}
	private net.ibizsys.model.control.layout.IPSLayout pslayout;

	@Deprecated
	public net.ibizsys.model.control.layout.IPSLayout getPSLayout(){
		if(this.pslayout != null) return this.pslayout;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUT);
		if(value == null){
			return null;
		}
		this.pslayout = getPSModelObject(net.ibizsys.model.control.layout.IPSLayout.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUT);
		return this.pslayout;
	}

	public net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust(){
		net.ibizsys.model.control.layout.IPSLayout value = this.getPSLayout();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSLayout]返回空值");}
		return value;
	}


	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}