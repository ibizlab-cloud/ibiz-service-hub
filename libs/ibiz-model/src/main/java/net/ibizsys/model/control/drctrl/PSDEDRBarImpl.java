package net.ibizsys.model.control.drctrl;



public class PSDEDRBarImpl extends net.ibizsys.model.control.drctrl.PSDEDRCtrlImpl implements net.ibizsys.model.control.drctrl.IPSDEDRBar{

	public final static String ATTR_GETPSDEDRBARGROUPS = "getPSDEDRBarGroups";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";
	public final static String ATTR_ISSHOWTITLE = "showTitle";

	private java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRBarGroup> psdedrbargroups = null;
	public java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRBarGroup> getPSDEDRBarGroups(){
		if(this.psdedrbargroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDRBARGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRBarGroup> list = new java.util.ArrayList<net.ibizsys.model.control.drctrl.IPSDEDRBarGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.drctrl.IPSDEDRBarGroup obj = this.getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRBarGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDRBARGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.psdedrbargroups = list;
		}
		return (this.psdedrbargroups.size() == 0)? null : this.psdedrbargroups;
	}

	public net.ibizsys.model.control.drctrl.IPSDEDRBarGroup getPSDEDRBarGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRBarGroup.class, this.getPSDEDRBarGroups(), objKey, bTryMode);
	}
	public void setPSDEDRBarGroups(java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRBarGroup> list){
		this.psdedrbargroups = list;
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes titlepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes(){
		if(this.titlepslanguageres != null) return this.titlepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.titlepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTITLEPSLANGUAGERES);
		return this.titlepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTitlePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头语言资源");}
		return value;
	}

	public void setTitlePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes titlepslanguageres){
		this.titlepslanguageres = titlepslanguageres;
	}


	public boolean isShowTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWTITLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}