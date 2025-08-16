package net.ibizsys.model.app.view;



public abstract class PSAppViewEngineImplBase extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.view.IPSAppViewEngine
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETPSUIENGINEPARAMS = "getPSUIEngineParams";

	private java.util.List<net.ibizsys.model.view.IPSUIEngineParam> psuiengineparams = null;
	public java.util.List<net.ibizsys.model.view.IPSUIEngineParam> getPSUIEngineParams(){
		if(this.psuiengineparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIENGINEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.view.IPSUIEngineParam> list = new java.util.ArrayList<net.ibizsys.model.view.IPSUIEngineParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.view.IPSUIEngineParam obj = this.getPSModelObject(net.ibizsys.model.view.IPSUIEngineParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSUIENGINEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psuiengineparams = list;
		}
		return (this.psuiengineparams.size() == 0)? null : this.psuiengineparams;
	}

	public net.ibizsys.model.view.IPSUIEngineParam getPSUIEngineParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.view.IPSUIEngineParam.class, this.getPSUIEngineParams(), objKey, bTryMode);
	}
	public void setPSUIEngineParams(java.util.List<net.ibizsys.model.view.IPSUIEngineParam> list){
		this.psuiengineparams = list;
	}
}