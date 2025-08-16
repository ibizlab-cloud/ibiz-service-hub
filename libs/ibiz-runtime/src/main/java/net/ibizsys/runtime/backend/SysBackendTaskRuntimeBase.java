package net.ibizsys.runtime.backend;

import org.aspectj.lang.ProceedingJoinPoint;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionBackup;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 系统后台任务运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysBackendTaskRuntimeBase extends SystemModelRuntimeBase implements ISysBackendTaskRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysBackendTaskRuntimeBase.class);

	private IPSSysBackService iPSSysBackService = null;

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysBackService iPSSysBackService) throws Exception {
		this.iPSSysBackService = iPSSysBackService;
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.onInit();
	}

	@Override
	public final IPSSysBackService getPSSysBackService() {
		if (this.iPSSysBackService == null) {
			return internalGetPSSysBackService();
		}
		return this.iPSSysBackService;
	}

	/**
	 * 内部获取后台任务模型对象
	 * 
	 * @return
	 * @throws Exception
	 */
	protected synchronized IPSSysBackService internalGetPSSysBackService() {
		if (this.iPSSysBackService == null) {
			IPSSysBackService iPSSysBackService = getSystemRuntime().getPSSystem().getPSSysBackService(this.getId(), false);
			this.iPSSysBackService = iPSSysBackService;
			try {
				onInit();
			} catch (Exception ex) {
				this.iPSSysBackService = null;
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("初始化系统后台任务[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()) ,ex);
			}
		}
		return this.iPSSysBackService;
	}

	@Override
	public String getId() {
		return getPSSysBackService().getId();
	}
	
	
	
	@Override
	public String getName() {
		return getPSSysBackService().getName();
	}

	/**
	 * 切面环绕后台作业，外部触发
	 * 
	 * @param strActionName
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	public Object aroundHandler(ProceedingJoinPoint joinPoint) throws Throwable {

		String strDynaInstId = null;
		String strParam = null;

		if (joinPoint.getArgs() != null) {
			if (joinPoint.getArgs().length >= 1) {
				Object objArg = joinPoint.getArgs()[0];
				if (objArg instanceof String) {
					strDynaInstId = (String) objArg;
				}
			}
			if (joinPoint.getArgs().length >= 2) {
				Object objArg = joinPoint.getArgs()[1];
				if (objArg instanceof String) {
					strParam = (String) objArg;
				}
			}
		}

		return execute(strDynaInstId, strParam, joinPoint);

	}

	protected Object execute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		boolean bOpenActionSession = (actionSession == null);
		if (bOpenActionSession) {
			actionSession = ActionSessionManager.openSession();
			actionSession.setName(this.getName());
			actionSession.setUserContext(this.getUserContext());
		}

		try {
			// 备份会话的动态实例运行时
			ActionSessionBackup backup = actionSession.backup();
			actionSession.setSessionId(KeyValueUtils.genGuidEx());

			actionSession.setDefaultDynaInstId(strDynaInstId);

			Object objRet = this.onExecute(strDynaInstId, strParam, joinPoint);

			// 恢复会话的动态实例运行时
			actionSession.restore(backup);

			if (bOpenActionSession) {
				ActionSessionManager.closeSession(true);
			}

			return objRet;

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			actionSession.setDynaInstRuntime(null);
			actionSession.setChildDynaInstRuntime(null);
			if (bOpenActionSession) {
				ActionSessionManager.closeSession(false);
			}

			throw ex;
		}
	}

	protected Object onExecute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		return joinPoint.proceed();
	}

	/**
	 * 获取当前用户上下文
	 * 
	 * @return
	 */
	protected IUserContext getUserContext() {
		throw new SystemRuntimeException(this.getSystemRuntime(), "没有实现", Errors.NOTIMPL);
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysBackService();
	}
}
