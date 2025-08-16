package net.ibizsys.central.cloud.core.wf;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.util.ActionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;

public abstract class WFRoleRuntimeBase extends net.ibizsys.central.wf.WFRoleRuntimeBase implements IWFRoleRuntime {

	@Override
	public List<WFMember> getWFMembers(IEntity iEntity) {
		return ActionUtils.executeAction(this.getSystemRuntime(), this, "获取工作流角色成员", 
				new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onGetWFMembers(iEntity);
					}
				},
				null, new TypeReference<List<WFMember>>(){});
	}

	protected List<WFMember> onGetWFMembers(IEntity iEntity) throws Throwable{
		throw new Exception("没有实现");
	}
	
}
