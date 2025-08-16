package net.ibizsys.runtime.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeException;

public class ExceptionUtils {

	/**
	 * 重新抛出运行时异常
	 * 
	 * @param ex
	 */
	public static void rethrowException(Throwable ex) throws Exception{
		ex = unwrapThrowable(ex);
		if (ex instanceof Exception) {
			throw (Exception) ex;
		}

		throw new Exception(ex.getMessage(), ex);
	}
	
	/**
	 * 重新抛出运行时异常
	 * 
	 * @param ex
	 */
	public static void rethrowRuntimeException(Throwable ex) {
		ex = unwrapThrowable(ex);
		if (ex instanceof RuntimeException) {
			throw (RuntimeException) ex;
		}

		throw new RuntimeException(ex.getMessage(), ex);
	}

	/**
	 * 判断异常是否为指定运行时对象抛出，判断一致时重新抛出
	 * 
	 * @param ex
	 * @param theClass
	 * @param modelRuntime
	 * @return
	 */
	public static boolean testException(Throwable ex, Class<? extends ISystemRuntimeException> theClass, IModelRuntime modelRuntime) {
		return testException(ex, theClass, modelRuntime, true);
	}

	/**
	 * 判断异常是否为指定运行时对象抛出
	 * 
	 * @param ex
	 * @param theClass
	 * @param modelRuntime
	 * @param rethrow
	 *            判断一致时是否重新抛出
	 * @return
	 */
	public static boolean testException(Throwable ex, Class<? extends ISystemRuntimeException> theClass, IModelRuntime modelRuntime, boolean rethrow) {
		ex = unwrapThrowable(ex);
		if (theClass.isAssignableFrom(ex.getClass())) {
			if (((ISystemRuntimeException) ex).getModelRuntime() == modelRuntime) {
				if (rethrow) {
					throw (RuntimeException) ex;
				}
				return true;
			}
		}
		return false;
	}

	/**
	 * 获取实际异常对象
	 * @param wrapped
	 * @return
	 */
	public static Throwable unwrapThrowable(Throwable wrapped) {
		Throwable unwrapped = wrapped;
		while (true) {
			if (unwrapped instanceof InvocationTargetException) {
				unwrapped = ((InvocationTargetException) unwrapped).getTargetException();
			} else if (unwrapped instanceof UndeclaredThrowableException) {
				unwrapped = ((UndeclaredThrowableException) unwrapped).getUndeclaredThrowable();
			} else {
				return unwrapped;
			}
		}
	}
}
