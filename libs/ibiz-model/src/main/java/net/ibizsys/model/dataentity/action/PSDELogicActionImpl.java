package net.ibizsys.model.dataentity.action;



public class PSDELogicActionImpl extends net.ibizsys.model.dataentity.action.PSDEActionImplBase implements net.ibizsys.model.dataentity.action.IPSDELogicAction{

	public final static String ATTR_GETACTIONHOLDER = "actionHolder";
	public final static String ATTR_GETPSDELOGIC = "getPSDELogic";

	public int getActionHolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONHOLDER);
		if(value == null){
			return 3;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic(){
		if(this.psdelogic != null) return this.psdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.psdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体处理逻辑");}
		return value;
	}

	public void setPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic){
		this.psdelogic = psdelogic;
	}

}