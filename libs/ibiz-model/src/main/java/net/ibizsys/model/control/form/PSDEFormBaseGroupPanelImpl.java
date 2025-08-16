package net.ibizsys.model.control.form;



public class PSDEFormBaseGroupPanelImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.layout.IPSLayoutContainer
		,net.ibizsys.model.control.form.IPSDEFormGroupBase{

	public final static String ATTR_GETCAPTIONITEMNAME = "captionItemName";
	public final static String ATTR_GETITEMIGNOREINPUT = "itemIgnoreInput";
	public final static String ATTR_GETPSDEFORMDETAILS = "getPSDEFormDetails";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETSUBCAPTION = "subCaption";
	public final static String ATTR_GETTITLEBARCLOSEMODE = "titleBarCloseMode";
	public final static String ATTR_ISENABLEANCHOR = "enableAnchor";
	public final static String ATTR_ISHIDEEMPTYITEMS = "hideEmptyItems";
	public final static String ATTR_ISINFOGROUPMODE = "infoGroupMode";

	public java.lang.String getCaptionItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTIONITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getItemIgnoreInput(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMIGNOREINPUT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> psdeformdetails = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> getPSDEFormDetails(){
		if(this.psdeformdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormDetail obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdeformdetails = list;
		}
		return (this.psdeformdetails.size() == 0)? null : this.psdeformdetails;
	}

	public net.ibizsys.model.control.form.IPSDEFormDetail getPSDEFormDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormDetail.class, this.getPSDEFormDetails(), objKey, bTryMode);
	}
	public void setPSDEFormDetails(java.util.List<net.ibizsys.model.control.form.IPSDEFormDetail> list){
		this.psdeformdetails = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定布局设置");}
		return value;
	}


	public java.lang.String getSubCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getTitleBarCloseMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEBARCLOSEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isEnableAnchor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEANCHOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isHideEmptyItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDEEMPTYITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isInfoGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINFOGROUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}