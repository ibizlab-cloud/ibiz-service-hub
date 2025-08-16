package net.ibizsys.model.app.view;



public class PSAppViewMsgGroupImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.view.IPSAppViewMsgGroup{

	public final static String ATTR_GETBODYSTYLE = "bodyStyle";
	public final static String ATTR_GETBOTTOMSTYLE = "bottomStyle";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPVIEWMSGGROUPDETAILS = "getPSAppViewMsgGroupDetails";
	public final static String ATTR_GETTOPSTYLE = "topStyle";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";

	public java.lang.String getBodyStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBODYSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getBottomStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBOTTOMSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail> psappviewmsggroupdetails = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail> getPSAppViewMsgGroupDetails(){
		if(this.psappviewmsggroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWMSGGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWMSGGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewmsggroupdetails = list;
		}
		return (this.psappviewmsggroupdetails.size() == 0)? null : this.psappviewmsggroupdetails;
	}

	public net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail getPSAppViewMsgGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail.class, this.getPSAppViewMsgGroupDetails(), objKey, bTryMode);
	}
	public void setPSAppViewMsgGroupDetails(java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail> list){
		this.psappviewmsggroupdetails = list;
	}

	public java.lang.String getTopStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}