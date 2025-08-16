package net.ibizsys.model.control.grid;



public class PSDEGridGroupColumnImpl extends net.ibizsys.model.control.grid.PSDEGridColumnImpl implements net.ibizsys.model.control.grid.IPSDEGridGroupColumn{

	public final static String ATTR_GETPSDEGRIDCOLUMNS = "getPSDEGridColumns";

	private java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> psdegridcolumns = null;
	public java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> getPSDEGridColumns(){
		if(this.psdegridcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGRIDCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> list = new java.util.ArrayList<net.ibizsys.model.control.grid.IPSDEGridColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.grid.IPSDEGridColumn obj = this.getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGRIDCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.psdegridcolumns = list;
		}
		return (this.psdegridcolumns.size() == 0)? null : this.psdegridcolumns;
	}

	public net.ibizsys.model.control.grid.IPSDEGridColumn getPSDEGridColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridColumn.class, this.getPSDEGridColumns(), objKey, bTryMode);
	}
	public void setPSDEGridColumns(java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> list){
		this.psdegridcolumns = list;
	}
}