package net.ibizsys.model.dataentity.ds;



public class PSDEFilterDTOImpl extends net.ibizsys.model.dataentity.service.PSDEMethodDTOImpl implements net.ibizsys.model.dataentity.ds.IPSDEFilterDTO
		,net.ibizsys.model.dataentity.ds.IPSDEDataSetInputDTO{

	public final static String ATTR_GETPSDEFILTERDTOFIELDS = "getPSDEFilterDTOFields";

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField> psdefilterdtofields = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField> getPSDEFilterDTOFields(){
		if(this.psdefilterdtofields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFILTERDTOFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFILTERDTOFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.psdefilterdtofields = list;
		}
		return (this.psdefilterdtofields.size() == 0)? null : this.psdefilterdtofields;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField getPSDEFilterDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField.class, this.getPSDEFilterDTOFields(), objKey, bTryMode);
	}
	public void setPSDEFilterDTOFields(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField> list){
		this.psdefilterdtofields = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> psdemethoddtofields = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> getPSDEMethodDTOFields(){
		if(this.psdemethoddtofields == null){
			if(this.getPSDEFilterDTOFields() == null)
				return null;;
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField>();
			list.addAll(this.getPSDEFilterDTOFields());
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