package net.ibizsys.model.control.dataview;



public class PSDEKanbanImpl extends net.ibizsys.model.control.dataview.PSDEDataViewImpl implements net.ibizsys.model.control.dataview.IPSDEKanban{

	public final static String ATTR_GETUPDATEGROUPPSCONTROLACTION = "getUpdateGroupPSControlAction";
	private net.ibizsys.model.control.IPSControlAction updategrouppscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getUpdateGroupPSControlAction(){
		if(this.updategrouppscontrolaction != null) return this.updategrouppscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEGROUPPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.updategrouppscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.updategrouppscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getUpdateGroupPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getUpdateGroupPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新分组行为");}
		return value;
	}

	public void setUpdateGroupPSControlAction(net.ibizsys.model.control.IPSControlAction updategrouppscontrolaction){
		this.updategrouppscontrolaction = updategrouppscontrolaction;
	}

}