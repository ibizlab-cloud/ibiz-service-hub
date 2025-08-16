package net.ibizsys.model.control.form;



public class PSDESearchFormItemImpl extends net.ibizsys.model.control.form.PSDEFormItemImpl implements net.ibizsys.model.control.form.IPSDESearchFormItem{

	public final static String ATTR_GETITEMWIDTH = "itemWidth";

	@Deprecated
	public double getItemWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMWIDTH);
		if(value == null){
			return 0.0f;
		}
		return value.asDouble();
	}
}