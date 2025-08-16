package net.ibizsys.model.dataentity.ds;



public class PSDEDataQueryCodeImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDBTYPE = "dBType";
	public final static String ATTR_GETPSDEDATAQUERYCODECONDS = "getPSDEDataQueryCodeConds";
	public final static String ATTR_GETPSDEDATAQUERYCODEEXPS = "getPSDEDataQueryCodeExps";
	public final static String ATTR_GETQUERYCODE = "queryCode";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDBType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond> psdedataquerycodeconds = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond> getPSDEDataQueryCodeConds(){
		if(this.psdedataquerycodeconds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERYCODECONDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAQUERYCODECONDS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataquerycodeconds = list;
		}
		return (this.psdedataquerycodeconds.size() == 0)? null : this.psdedataquerycodeconds;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond getPSDEDataQueryCodeCond(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond.class, this.getPSDEDataQueryCodeConds(), objKey, bTryMode);
	}
	public void setPSDEDataQueryCodeConds(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond> list){
		this.psdedataquerycodeconds = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp> psdedataquerycodeexps = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp> getPSDEDataQueryCodeExps(){
		if(this.psdedataquerycodeexps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERYCODEEXPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAQUERYCODEEXPS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataquerycodeexps = list;
		}
		return (this.psdedataquerycodeexps.size() == 0)? null : this.psdedataquerycodeexps;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp getPSDEDataQueryCodeExp(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp.class, this.getPSDEDataQueryCodeExps(), objKey, bTryMode);
	}
	public void setPSDEDataQueryCodeExps(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp> list){
		this.psdedataquerycodeexps = list;
	}

	public java.lang.String getQueryCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUERYCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}