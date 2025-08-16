package net.ibizsys.model.ai;



public class PSSysAIPipelineJobImpl extends net.ibizsys.model.ai.PSSysAIPipelineObjectImpl implements net.ibizsys.model.ai.IPSSysAIPipelineJob{

	public final static String ATTR_GETSTEPPSCODELIST = "getStepPSCodeList";
	private net.ibizsys.model.codelist.IPSCodeList steppscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getStepPSCodeList(){
		if(this.steppscodelist != null) return this.steppscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTEPPSCODELIST);
		if(value == null){
			return null;
		}
		this.steppscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSTEPPSCODELIST);
		return this.steppscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getStepPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getStepPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定步骤代码表对象");}
		return value;
	}

	public void setStepPSCodeList(net.ibizsys.model.codelist.IPSCodeList steppscodelist){
		this.steppscodelist = steppscodelist;
	}

}