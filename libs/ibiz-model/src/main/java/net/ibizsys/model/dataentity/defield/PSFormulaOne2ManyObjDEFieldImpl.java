package net.ibizsys.model.dataentity.defield;



public class PSFormulaOne2ManyObjDEFieldImpl extends net.ibizsys.model.dataentity.defield.PSFormulaDEFieldImpl implements net.ibizsys.model.dataentity.defield.IPSOne2ManyObjDEField{

	public final static String ATTR_GETREFPSSYSDYNAMODEL = "getRefPSSysDynaModel";
	public final static String ATTR_ISMAP = "map";
	private net.ibizsys.model.dynamodel.IPSSysDynaModel refpssysdynamodel;

	public net.ibizsys.model.dynamodel.IPSSysDynaModel getRefPSSysDynaModel(){
		if(this.refpssysdynamodel != null) return this.refpssysdynamodel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSSYSDYNAMODEL);
		if(value == null){
			return null;
		}
		this.refpssysdynamodel = getPSModelObject(net.ibizsys.model.dynamodel.IPSSysDynaModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREFPSSYSDYNAMODEL);
		return this.refpssysdynamodel;
	}

	public net.ibizsys.model.dynamodel.IPSSysDynaModel getRefPSSysDynaModelMust(){
		net.ibizsys.model.dynamodel.IPSSysDynaModel value = this.getRefPSSysDynaModel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定引用动态模型");}
		return value;
	}

	public void setRefPSSysDynaModel(net.ibizsys.model.dynamodel.IPSSysDynaModel refpssysdynamodel){
		this.refpssysdynamodel = refpssysdynamodel;
	}


	public boolean isMap(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}