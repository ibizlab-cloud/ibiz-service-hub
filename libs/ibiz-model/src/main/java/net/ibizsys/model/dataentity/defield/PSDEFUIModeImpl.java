package net.ibizsys.model.dataentity.defield;



public class PSDEFUIModeImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldObjectImpl implements net.ibizsys.model.dataentity.defield.IPSDEFUIMode
		,net.ibizsys.model.app.dataentity.IPSAppDEFUIMode{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEFFORMITEM = "getPSDEFFormItem";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISMOBILEMODE = "mobileMode";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.form.IPSDEFFormItem psdefformitem;

	public net.ibizsys.model.control.form.IPSDEFFormItem getPSDEFFormItem(){
		if(this.psdefformitem != null) return this.psdefformitem;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFFORMITEM);
		if(value == null){
			return null;
		}
		this.psdefformitem = getPSModelObject(net.ibizsys.model.control.form.IPSDEFFormItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEFFORMITEM);
		return this.psdefformitem;
	}

	public net.ibizsys.model.control.form.IPSDEFFormItem getPSDEFFormItemMust(){
		net.ibizsys.model.control.form.IPSDEFFormItem value = this.getPSDEFFormItem();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性表单项模式");}
		return value;
	}

	public void setPSDEFFormItem(net.ibizsys.model.control.form.IPSDEFFormItem psdefformitem){
		this.psdefformitem = psdefformitem;
	}


	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isMobileMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMOBILEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}