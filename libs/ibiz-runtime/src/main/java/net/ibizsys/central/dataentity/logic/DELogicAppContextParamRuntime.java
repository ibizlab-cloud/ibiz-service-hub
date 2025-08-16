package net.ibizsys.central.dataentity.logic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.IAppContext;

/**
 * 处理逻辑应用上下文参数对象
 * 
 * @author lionlau
 *
 */
public class DELogicAppContextParamRuntime extends DELogicSysParamRuntimeBase {

	private static final Log log = LogFactory.getLog(DELogicAppContextParamRuntime.class);
	
	@Override
	protected void onBeginSession(IDELogicSession iDELogicSession) throws Throwable {
		if(this.getPSDELogicParam().isCloneParam()) {
			IAppContext backupAppContext = null;
			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			if(actionSession != null) {
				backupAppContext = actionSession.getAppContext(true);
			}
			else {
				backupAppContext = UserContext.getCurrentMust().getAppContext();
			}
			//备份参数
			iDELogicSession.setParamObject("_BACKUP_" + this.getCodeName(), backupAppContext);
			
			//新建变量
			IAppContext iAppContext = AppContext.newInstance(backupAppContext);
			if(actionSession != null) {
				actionSession.setAppContext(iAppContext);
			}
			else {
				UserContext.getCurrentMust().setAppContext(iAppContext);
			}
		}
		else {
			IAppContext backupAppContext = null;
			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			if(actionSession != null) {
				backupAppContext = actionSession.getAppContext(true);
			}
			else {
				backupAppContext = UserContext.getCurrentMust().getAppContext();
			}
			
			if(backupAppContext == null) {
				IAppContext iAppContext = AppContext.newInstance(null);
				if(actionSession != null) {
					actionSession.setAppContext(iAppContext);
				}
				else {
					UserContext.getCurrentMust().setAppContext(iAppContext);
				}
			}
			
		}
		super.onBeginSession(iDELogicSession);
	}

	@Override
	protected void onEndSession(IDELogicSession iDELogicSession) {
		if(this.getPSDELogicParam().isCloneParam()) {
			try {
				Object objAppContext = iDELogicSession.getParamObject("_BACKUP_" + this.getCodeName(), true);
				IAppContext backupAppContext = null;
				if(objAppContext instanceof IAppContext) {
					backupAppContext = (IAppContext)objAppContext;
				}
				ActionSession actionSession = ActionSessionManager.getCurrentSession();
				if(actionSession != null) {
					actionSession.setAppContext(backupAppContext);
				}
				else {
					UserContext.getCurrentMust().setAppContext(backupAppContext);
				}
			}
			catch(Throwable ex) {
				log.error(ex);
			}
		}
		super.onEndSession(iDELogicSession);
	}

	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		return iDELogicSession.getAppContext();
	}

}
