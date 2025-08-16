package net.ibizsys.central.plugin.extension.dataentity.action;

import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.action.DEActionLogicRuntimeBaseBase;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.runtime.dataentity.action.DEActionLogicTypes;

public class AddinDEActionLogicRuntimeBase extends DEActionLogicRuntimeBaseBase {

	private final ISystemRuntime iSystemRuntime;
	private final IPSDEActionLogic iPSDEActionLogic;
	
	public AddinDEActionLogicRuntimeBase(ISystemRuntime iSystemRuntime, IPSDEActionLogic iPSDEActionLogic) throws Exception {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		Assert.notNull(iPSDEActionLogic, "传入实体行为逻辑模型对象无效");
		this.iPSDEActionLogic = iPSDEActionLogic;
		this.iSystemRuntime = iSystemRuntime;
		
//		if(!this.testActionLogicType(iPSDEActionLogic.getActionLogicType())) {
//			throw new Exception(String.format("未支持的插件实体逻辑附加类型[%1$s]", iPSDEActionLogic.getActionLogicType()));
//		}
	}
	
	@Override
	public IPSDEActionLogic getPSDEActionLogic() {
		return this.iPSDEActionLogic;
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	@Override
	protected Object onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, IPSDEActionLogic iPSDEActionLogic, Object[] args, Object ret) throws Throwable {
		if(this.testActionLogicType(iPSDEActionLogic.getActionLogicType())) {
			return super.onExecute(iDataEntityRuntimeContext, iPSDEAction, iPSDEActionLogic, args, ret);
		}
		throw new Exception(String.format("未支持的插件实体逻辑附加类型[%1$s]", iPSDEActionLogic.getActionLogicType()));
	}
	
	protected boolean testActionLogicType(int nActionLogicType) {
		switch(nActionLogicType) {
		case DEActionLogicTypes.EXTERNAL:
		case DEActionLogicTypes.DSTDELOGIC:
			return true;
		default:
			return false;
		}
	}
}
