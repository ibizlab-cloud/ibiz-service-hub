package net.ibizsys.model.control.tree;



public class PSDEGanttImpl extends net.ibizsys.model.control.tree.PSDETreeGridExImpl implements net.ibizsys.model.control.tree.IPSDEGantt{

	public final static String ATTR_GETBEGINDATAITEMNAME = "beginDataItemName";
	public final static String ATTR_GETENDDATAITEMNAME = "endDataItemName";
	public final static String ATTR_GETFINISHDATAITEMNAME = "finishDataItemName";
	public final static String ATTR_GETPREVDATAITEMNAME = "prevDataItemName";
	public final static String ATTR_GETSNDATAITEMNAME = "sNDataItemName";
	public final static String ATTR_GETTOTALDATAITEMNAME = "totalDataItemName";

	public java.lang.String getBeginDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEGINDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEndDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENDDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFinishDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPrevDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREVDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSNDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSNDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTotalDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOTALDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}