package net.ibizsys.central.cloud.core.wf;

import java.util.List;

import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.runtime.util.IEntity;

public interface IWFRoleRuntime extends net.ibizsys.runtime.wf.IWFRoleRuntime {

	/**
	 * 获取工作流角色成员
	 * @param iSearchContext
	 * @return
	 */
	List<WFMember> getWFMembers(IEntity iEntity);
	
}
