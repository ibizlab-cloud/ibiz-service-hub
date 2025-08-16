package net.ibizsys.model.ba;



public class PSSysBDTableImpl extends net.ibizsys.model.ba.PSSysBDSchemeObjectImpl implements net.ibizsys.model.ba.IPSSysBDTable{

	public final static String ATTR_GETALLPSSYSBDCOLSETS = "getAllPSSysBDColSets";
	public final static String ATTR_GETALLPSSYSBDCOLUMNS = "getAllPSSysBDColumns";
	public final static String ATTR_GETBDTABLETYPE = "bDTableType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETINHERITTYPEVALUE = "inheritTypeValue";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAJORPSSYSBDTABLERSS = "getMajorPSSysBDTableRSs";
	public final static String ATTR_GETMINORPSSYSBDTABLERSS = "getMinorPSSysBDTableRSs";

	private java.util.List<net.ibizsys.model.ba.IPSSysBDColSet> allpssysbdcolsets = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDColSet> getAllPSSysBDColSets(){
		if(this.allpssysbdcolsets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBDCOLSETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDColSet> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDColSet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ba.IPSSysBDColSet obj = this.getPSModelObject(net.ibizsys.model.ba.IPSSysBDColSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBDCOLSETS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbdcolsets = list;
		}
		return (this.allpssysbdcolsets.size() == 0)? null : this.allpssysbdcolsets;
	}

	public net.ibizsys.model.ba.IPSSysBDColSet getPSSysBDColSet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDColSet.class, this.getAllPSSysBDColSets(), objKey, bTryMode);
	}
	public void setPSSysBDColSets(java.util.List<net.ibizsys.model.ba.IPSSysBDColSet> list){
		this.allpssysbdcolsets = list;
	}

	private java.util.List<net.ibizsys.model.ba.IPSSysBDColumn> allpssysbdcolumns = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDColumn> getAllPSSysBDColumns(){
		if(this.allpssysbdcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBDCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDColumn> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ba.IPSSysBDColumn obj = this.getPSModelObject(net.ibizsys.model.ba.IPSSysBDColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBDCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbdcolumns = list;
		}
		return (this.allpssysbdcolumns.size() == 0)? null : this.allpssysbdcolumns;
	}

	public net.ibizsys.model.ba.IPSSysBDColumn getPSSysBDColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDColumn.class, this.getAllPSSysBDColumns(), objKey, bTryMode);
	}
	public void setPSSysBDColumns(java.util.List<net.ibizsys.model.ba.IPSSysBDColumn> list){
		this.allpssysbdcolumns = list;
	}

	public int getBDTableType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBDTABLETYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getInheritTypeValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINHERITTYPEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> majorpssysbdtablerss = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> getMajorPSSysBDTableRSs(){
		if(this.majorpssysbdtablerss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSSYSBDTABLERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDTableRS>();
			net.ibizsys.model.ba.IPSSysBDScheme ipssysbdscheme = this.getParentPSModelObject(net.ibizsys.model.ba.IPSSysBDScheme.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipssysbdscheme.getPSSysBDTableRS((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.majorpssysbdtablerss = list;
		}
		return (this.majorpssysbdtablerss.size() == 0)? null : this.majorpssysbdtablerss;
	}

	public net.ibizsys.model.ba.IPSSysBDTableRS getMajorPSSysBDTableRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDTableRS.class, this.getMajorPSSysBDTableRSs(), objKey, bTryMode);
	}
	
	public void setMajorPSSysBDTableRs(java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list){
		this.majorpssysbdtablerss = list;
	}

	private java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> minorpssysbdtablerss = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> getMinorPSSysBDTableRSs(){
		if(this.minorpssysbdtablerss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSSYSBDTABLERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDTableRS>();
			net.ibizsys.model.ba.IPSSysBDScheme ipssysbdscheme = this.getParentPSModelObject(net.ibizsys.model.ba.IPSSysBDScheme.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipssysbdscheme.getPSSysBDTableRS((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.minorpssysbdtablerss = list;
		}
		return (this.minorpssysbdtablerss.size() == 0)? null : this.minorpssysbdtablerss;
	}

	public net.ibizsys.model.ba.IPSSysBDTableRS getMinorPSSysBDTableRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDTableRS.class, this.getMinorPSSysBDTableRSs(), objKey, bTryMode);
	}
	
	public void setMinorPSSysBDTableRs(java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list){
		this.minorpssysbdtablerss = list;
	}
}