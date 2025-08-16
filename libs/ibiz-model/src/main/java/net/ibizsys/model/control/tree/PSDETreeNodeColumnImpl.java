package net.ibizsys.model.control.tree;



public class PSDETreeNodeColumnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeColumn{

	public final static String ATTR_GETCELLPSSYSCSS = "getCellPSSysCss";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOLUMNSTYLE = "columnStyle";
	public final static String ATTR_GETCOLUMNTYPE = "columnType";
	public final static String ATTR_GETDATAITEMNAME = "dataItemName";
	public final static String ATTR_GETNOPRIVDISPLAYMODE = "noPrivDisplayMode";
	public final static String ATTR_GETPSCONTROLATTRIBUTES = "getPSControlAttributes";
	public final static String ATTR_GETPSCONTROLLOGICS = "getPSControlLogics";
	public final static String ATTR_GETPSCONTROLRENDERS = "getPSControlRenders";
	public final static String ATTR_GETPSDETREECOLUMN = "getPSDETreeColumn";
	public final static String ATTR_GETRENDERPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_ISENABLEROWEDIT = "enableRowEdit";
	private net.ibizsys.model.res.IPSSysCss cellpssyscss;

	public net.ibizsys.model.res.IPSSysCss getCellPSSysCss(){
		if(this.cellpssyscss != null) return this.cellpssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCELLPSSYSCSS);
		if(value == null){
			return null;
		}
		this.cellpssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCELLPSSYSCSS);
		return this.cellpssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getCellPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getCellPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定单元格样式对象");}
		return value;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getColumnType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOPRIVDISPLAYMODE);
		if(value == null){
			return 1;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.control.IPSControlAttribute> pscontrolattributes = null;
	public java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes(){
		if(this.pscontrolattributes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLATTRIBUTES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlAttribute> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlAttribute>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlAttribute obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLATTRIBUTES);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolattributes = list;
		}
		return (this.pscontrolattributes.size() == 0)? null : this.pscontrolattributes;
	}

	public net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlAttribute.class, this.getPSControlAttributes(), objKey, bTryMode);
	}
	public void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list){
		this.pscontrolattributes = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlLogic> pscontrollogics = null;
	public java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics(){
		if(this.pscontrollogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlLogic> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlLogic obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrollogics = list;
		}
		return (this.pscontrollogics.size() == 0)? null : this.pscontrollogics;
	}

	public net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlLogic.class, this.getPSControlLogics(), objKey, bTryMode);
	}
	public void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list){
		this.pscontrollogics = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlRender> pscontrolrenders = null;
	public java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders(){
		if(this.pscontrolrenders == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLRENDERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlRender> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlRender>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlRender obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLRENDERS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolrenders = list;
		}
		return (this.pscontrolrenders.size() == 0)? null : this.pscontrolrenders;
	}

	public net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlRender.class, this.getPSControlRenders(), objKey, bTryMode);
	}
	public void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list){
		this.pscontrolrenders = list;
	}
	private net.ibizsys.model.control.tree.IPSDETreeColumn psdetreecolumn;

	public net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumn(){
		if(this.psdetreecolumn != null) return this.psdetreecolumn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETREECOLUMN);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.tree.IPSDETree ipsdetree = getParentPSModelObject(net.ibizsys.model.control.tree.IPSDETree.class);
		this.psdetreecolumn = ipsdetree.getPSDETreeColumn(value, false);
		return this.psdetreecolumn;
	}

	public net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumnMust(){
		net.ibizsys.model.control.tree.IPSDETreeColumn value = this.getPSDETreeColumn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定树视图列");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定列前端扩展插件");}
		return value;
	}


	@Deprecated
	public boolean isEnableRowEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}