package net.ibizsys.model.control.tree;



public class PSDETreeNodeUAColumnImpl extends net.ibizsys.model.control.tree.PSDETreeNodeColumnImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeUAColumn{

	public final static String ATTR_GETDATAITEMNAME = "dataItemName";
	public final static String ATTR_GETPSDEUIACTIONGROUP = "getPSDEUIActionGroup";

	@Deprecated
	public java.lang.String getDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
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

}