package net.ibizsys.runtime.security;

/**
 * 用户上下文类工厂对象
 * @author lionlau
 *
 */
public class UserContext {

	private static ThreadLocal<IUserContext> current =  new ThreadLocal<IUserContext>();
	
	
	public static IUserContext getCurrent() {
		return current.get();
	}
	
	public static void setCurrent(IUserContext iUserContext) {
		current.set(iUserContext);
	}
	
	/**
	 * 获取当前会话，必须存在
	 * 
	 * @return
	 */
	static public IUserContext getCurrentMust() {
		IUserContext iUserContext = getCurrent();
		if(iUserContext==null) {
			throw new RuntimeException("当前用户上下文无效"); 
		}	
		return iUserContext;
	}
}
