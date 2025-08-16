package net.ibizsys.model.dataentity.action;



public class PSDEActionInputDTOImpl extends net.ibizsys.model.dataentity.service.PSDEMethodDTOImpl implements net.ibizsys.model.dataentity.action.IPSDEActionInputDTO{

	public final static String ATTR_GETPSDEACTIONINPUTDTOFIELDS = "getPSDEActionInputDTOFields";

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField> psdeactioninputdtofields = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField> getPSDEActionInputDTOFields(){
		if(this.psdeactioninputdtofields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTIONINPUTDTOFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEACTIONINPUTDTOFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psdeactioninputdtofields = list;
		}
		return (this.psdeactioninputdtofields.size() == 0)? null : this.psdeactioninputdtofields;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField getPSDEActionInputDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField.class, this.getPSDEActionInputDTOFields(), objKey, bTryMode);
	}
	public void setPSDEActionInputDTOFields(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionInputDTOField> list){
		this.psdeactioninputdtofields = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> psdemethoddtofields = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> getPSDEMethodDTOFields(){
		if(this.psdemethoddtofields == null){
			if(this.getPSDEActionInputDTOFields() == null)
				return null;;
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField>();
			list.addAll(this.getPSDEActionInputDTOFields());
			this.psdemethoddtofields = list;
		}
		return (this.psdemethoddtofields.size() == 0)? null : this.psdemethoddtofields;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTOField getPSDEMethodDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEMethodDTOField.class, this.getPSDEMethodDTOFields(), objKey, bTryMode);
	}
	public void setPSDEMethodDTOFields(java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> list){
		this.psdemethoddtofields = list;
	}
}