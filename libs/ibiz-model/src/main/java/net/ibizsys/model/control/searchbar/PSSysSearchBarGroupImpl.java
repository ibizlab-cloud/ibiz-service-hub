package net.ibizsys.model.control.searchbar;



public class PSSysSearchBarGroupImpl extends net.ibizsys.model.control.searchbar.PSSysSearchBarItemImplBase implements net.ibizsys.model.control.searchbar.IPSSearchBarGroup{

	public final static String ATTR_GETFILTERPSDEDQCONDITIONS = "getFilterPSDEDQConditions";
	public final static String ATTR_GETTOOLTIP = "tooltip";
	public final static String ATTR_GETTOOLTIPPSLANGUAGERES = "getTooltipPSLanguageRes";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISADDSEPARATOR = "addSeparator";
	public final static String ATTR_ISDEFAULTGROUP = "defaultGroup";

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> filterpsdedqconditions = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> getFilterPSDEDQConditions(){
		if(this.filterpsdedqconditions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILTERPSDEDQCONDITIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDQCondition>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDQCondition obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETFILTERPSDEDQCONDITIONS);
				if(obj!=null)list.add(obj);
			}
			this.filterpsdedqconditions = list;
		}
		return (this.filterpsdedqconditions.size() == 0)? null : this.filterpsdedqconditions;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQCondition getFilterPSDEDQCondition(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, this.getFilterPSDEDQConditions(), objKey, bTryMode);
	}
	
	public void setFilterPSDEDQConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list){
		this.filterpsdedqconditions = list;
	}

	public java.lang.String getTooltip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIP);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes(){
		if(this.tooltippslanguageres != null) return this.tooltippslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.tooltippslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTOOLTIPPSLANGUAGERES);
		return this.tooltippslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTooltipPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组提示信息多语言资源");}
		return value;
	}


	public double getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0.0f;
		}
		return value.asDouble();
	}

	public boolean isAddSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISADDSEPARATOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}