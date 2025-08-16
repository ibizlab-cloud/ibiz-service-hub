package net.ibizsys.model.control.grid;



public class PSDEFGridColumnImpl extends net.ibizsys.model.dataentity.defield.PSDEFUIItemImpl implements net.ibizsys.model.control.grid.IPSDEFGridColumn{

	public final static String ATTR_GETCLCONVERTMODE = "cLConvertMode";
	public final static String ATTR_GETCOLUMNALIGN = "columnAlign";
	public final static String ATTR_GETCOLUMNWIDTH = "columnWidth";
	public final static String ATTR_GETENABLECOND = "enableCond";
	public final static String ATTR_GETRENDERPSSYSPFPLUGIN = "getRenderPSSysPFPlugin";
	public final static String ATTR_ISENABLESORT = "enableSort";

	public java.lang.String getCLConvertMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLCONVERTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getColumnWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getEnableCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLECOND);
		if(value == null){
			return 0;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定列绘制前端模板插件");}
		return value;
	}

	public void setRenderPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin renderpssyspfplugin){
		this.renderpssyspfplugin = renderpssyspfplugin;
	}


	public boolean isEnableSort(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}