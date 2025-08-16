package net.ibizsys.central.plugin.ai.agent;

import groovy.lang.Closure;
import groovy.lang.DelegatesTo;
import net.ibizsys.runtime.plugin.ModelRTScriptBase;

public abstract class AIWorkerAgentScriptBase extends ModelRTScriptBase {

	@Override
	public void before(@DelegatesTo(IAIWorkerAgent.class) Closure<?> closure) {
		super.before(closure);
	}

	@Override
	public void after(@DelegatesTo(IAIWorkerAgent.class) Closure<?> closure) {
		super.after(closure);
	}

	@Override
	public void execute(@DelegatesTo(IAIWorkerAgent.class) Closure<?> closure) {
		super.execute(closure);
	}

	@Override
	public void before(String strMethodName, @DelegatesTo(IAIWorkerAgent.class) Closure<?> closure) {
		super.before(strMethodName, closure);
	}

	@Override
	public void after(String strMethodName, @DelegatesTo(IAIWorkerAgent.class) Closure<?> closure) {
		super.after(strMethodName, closure);
	}

	@Override
	public void execute(String strMethodName, @DelegatesTo(IAIWorkerAgent.class) Closure<?> closure) {
		super.execute(strMethodName, closure);
	}

}
