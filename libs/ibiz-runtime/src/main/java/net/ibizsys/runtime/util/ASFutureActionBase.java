package net.ibizsys.runtime.util;

/**
 * 行为会话后续操作对象基础实现
 * @author lionlau
 *
 */
public abstract class ASFutureActionBase implements IASFutureAction {

	@Override
	public String getId() {
		return null;
	}

	@Override
	public Object getTag() {
		return null;
	}

	@Override
	public void rollback() {
		
	}

}
