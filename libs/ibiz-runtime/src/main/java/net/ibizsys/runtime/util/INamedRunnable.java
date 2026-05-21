package net.ibizsys.runtime.util;

import java.util.concurrent.Executor;

/**
 * 命名的可运行对象
 * @author lionlau
 *
 */
public interface INamedRunnable extends Runnable {

	default String getName() {
		return null;
	}
	
	default Executor getExecutor() {
		return null;
	}
}
