package net.ibizsys.runtime;

public abstract class ModelRuntimeContextBase<M extends IModelRuntime> implements IModelRuntimeContext {

	@Override
	public abstract M getModelRuntime();
}
