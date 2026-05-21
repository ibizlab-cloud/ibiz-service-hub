package net.ibizsys.runtime.util;

import java.util.concurrent.Executor;

public interface INamedAction extends IAction{

	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
	default Executor getExecutor() {
		return null;
	}
}
