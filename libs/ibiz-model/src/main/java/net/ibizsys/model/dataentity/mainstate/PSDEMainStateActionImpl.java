package net.ibizsys.model.dataentity.mainstate;



public class PSDEMainStateActionImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction{

	public final static String ATTR_GETPSDEACTION = "getPSDEAction";
	public final static String ATTR_ISALLOWMODE = "allowMode";
	private net.ibizsys.model.dataentity.action.IPSDEAction psdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(){
		if(this.psdeaction != null) return this.psdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.psdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体行为");}
		return value;
	}

	public void setPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction psdeaction){
		this.psdeaction = psdeaction;
	}


	public boolean isAllowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}