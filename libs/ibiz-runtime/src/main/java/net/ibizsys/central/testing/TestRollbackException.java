package net.ibizsys.central.testing;

/**
 * 测试回滚异常
 * @author lionlau
 *
 */
public class TestRollbackException extends RuntimeException{

	@Override
	public String getMessage() {
		return "测试用例回滚";
	}
}
