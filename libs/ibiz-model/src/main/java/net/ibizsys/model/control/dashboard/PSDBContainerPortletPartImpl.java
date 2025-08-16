package net.ibizsys.model.control.dashboard;



public class PSDBContainerPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBContainerPortletPart{

	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	public final static String ATTR_GETPSCONTROLS = "getPSControls";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETPSPORTLETS = "getPSControls";
	public final static String ATTR_GETPORTLETTYPE = "portletType";
	private net.ibizsys.model.control.IPSControl contentpscontrol;

	@Deprecated
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getContentPSControl]返回空值");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.IPSControl> pscontrols = null;
	public java.util.List<net.ibizsys.model.control.IPSControl> getPSControls(){
		if(this.pscontrols == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControl> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControl obj = this.getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrols = list;
		}
		return (this.pscontrols.size() == 0)? null : this.pscontrols;
	}

	public net.ibizsys.model.control.IPSControl getPSControl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControl.class, this.getPSControls(), objKey, bTryMode);
	}
	public void setPSControls(java.util.List<net.ibizsys.model.control.IPSControl> list){
		this.pscontrols = list;
	}
	private net.ibizsys.model.control.layout.IPSLayout pslayout;

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定容器布局");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> psportlets = null;
	public java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> getPSPortlets(){
		if(this.psportlets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPORTLETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> list = new java.util.ArrayList<net.ibizsys.model.control.dashboard.IPSDBPortletPart>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.dashboard.IPSDBPortletPart obj = this.getPSModelObject(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSPORTLETS);
				if(obj!=null)list.add(obj);
			}
			this.psportlets = list;
		}
		return (this.psportlets.size() == 0)? null : this.psportlets;
	}

	public net.ibizsys.model.control.dashboard.IPSDBPortletPart getPSDBPortletPart(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class, this.getPSPortlets(), objKey, bTryMode);
	}
	public void setPSDBPortletParts(java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> list){
		this.psportlets = list;
	}

	public java.lang.String getPortletType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}