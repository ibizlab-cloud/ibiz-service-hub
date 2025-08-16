package net.ibizsys.model.control.form;



public class PSDEFormTabPanelImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.form.IPSDEFormTabPanel{

	public final static String ATTR_GETDATARELATIONTAG = "dataRelationTag";
	public final static String ATTR_GETINSERTPOS = "insertPos";
	public final static String ATTR_GETPSDEFORMTABPAGES = "getPSDEFormTabPages";
	public final static String ATTR_ISSHOWCAPTION = "showCaption";

	public java.lang.String getDataRelationTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATARELATIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getInsertPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINSERTPOS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEFormTabPage> psdeformtabpages = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEFormTabPage> getPSDEFormTabPages(){
		if(this.psdeformtabpages == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMTABPAGES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEFormTabPage> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEFormTabPage>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEFormTabPage obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEFormTabPage.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFORMTABPAGES);
				if(obj!=null)list.add(obj);
			}
			this.psdeformtabpages = list;
		}
		return (this.psdeformtabpages.size() == 0)? null : this.psdeformtabpages;
	}

	public net.ibizsys.model.control.form.IPSDEFormTabPage getPSDEFormTabPage(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEFormTabPage.class, this.getPSDEFormTabPages(), objKey, bTryMode);
	}
	public void setPSDEFormTabPages(java.util.List<net.ibizsys.model.control.form.IPSDEFormTabPage> list){
		this.psdeformtabpages = list;
	}

	@Deprecated
	public boolean isShowCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}