package net.ibizsys.central.plugin.util.dataentity.action;

import net.ibizsys.model.dataentity.action.IPSDELogicAction;

public abstract class BatchDELogicActionRuntimeBase extends DEActionRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(BatchDELogicActionRuntimeBase.class);
	
	@Override
	protected void onInit() throws Exception {
		
		if(!(super.getPSDEAction() instanceof IPSDELogicAction)){
			throw new Exception("实体行为类型不正确");
		}
		
		getPSDEAction().getPSDELogicMust();
		
		super.onInit();
	}
	
	@Override
	public IPSDELogicAction getPSDEAction() {
		return (IPSDELogicAction)super.getPSDEAction();
	}

	@Override
	protected Object onExecute(Object[] args) throws Throwable {
		return this.getDataEntityRuntime().executeLogic(getPSDEAction().getPSDELogicMust(), args);
	}
}
