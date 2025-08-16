package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.script.ScriptUtils;

public class DELogicScriptNodeRuntimeContext implements IDELogicScriptNodeRuntimeContext {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicScriptNodeRuntimeContext.class);
	private IDELogicNodeRuntime iDELogicNodeRuntime = null;
	
	public DELogicScriptNodeRuntimeContext(IDELogicNodeRuntime iDELogicNodeRuntime) {
		this.iDELogicNodeRuntime = iDELogicNodeRuntime;
	}
	

	public IDELogicSession getDELogicSession() {
		return DELogicSession.getCurrentMust();
	}
	
	public IDELogicNodeRuntime getDELogicNodeRuntime() {
		return this.iDELogicNodeRuntime;
	}
	
	public IDELogicRuntime getDELogicRuntime() {
		return getDELogicSession().getDELogicRuntime();
	}
	
	@Override
	public Object getParam(String strName) {
		
		try {
			IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicRuntime().getDELogicParamRuntime(strName, false);
			return iDELogicParamRuntime.getScriptObject(getDELogicSession());
		}
		catch(Throwable ex) {
			log.error(String.format("实体[%1$s]处理逻辑[%2$s]获取参数[%3$s]发生异常，%4$s", this.getDELogicRuntime().getDataEntityRuntime().getName(), this.getDELogicRuntime().getName(), strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDELogicRuntime().getDataEntityRuntime(), this.getDELogicRuntime(), String.format("获取参数[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
		}
	}

	@Override
	public Object renewParam(String strName) {
		try {
			IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicRuntime().getDELogicParamRuntime(strName, false);
			iDELogicParamRuntime.renew(getDELogicSession());
			return iDELogicParamRuntime.getScriptObject(getDELogicSession());
		}
		catch(Throwable ex) {
			log.error(String.format("实体[%1$s]处理逻辑[%2$s]重新建立参数[%3$s]发生异常，%4$s", this.getDELogicRuntime().getDataEntityRuntime().getName(), this.getDELogicRuntime().getName(), strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDELogicRuntime().getDataEntityRuntime(), this.getDELogicRuntime(), String.format("重新建立参数[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
		}
	}

	@Override
	public IDELogicScriptNodeRuntimeContext resetParam(String strName) {
		try {
			IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicRuntime().getDELogicParamRuntime(strName, false);
			iDELogicParamRuntime.bind(getDELogicSession(), null);
		}
		catch(Throwable ex) {
			log.error(String.format("实体[%1$s]处理逻辑[%2$s]重置参数[%3$s]发生异常，%4$s", this.getDELogicRuntime().getDataEntityRuntime().getName(), this.getDELogicRuntime().getName(), strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDELogicRuntime().getDataEntityRuntime(), this.getDELogicRuntime(), String.format("重置参数[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
		}
		return this;
	}


	@Override
	public IDELogicScriptNodeRuntimeContext setParam(String strName, Object objValue) {
		if(objValue == null) {
			this.resetParam(strName);
			return this;
		}
		try {
			objValue = ScriptUtils.getReal(objValue);
			IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicRuntime().getDELogicParamRuntime(strName, false);
			iDELogicParamRuntime.bind(getDELogicSession(), objValue);
		}
		catch(Throwable ex) {
			log.error(String.format("实体[%1$s]处理逻辑[%2$s]设置参数[%3$s]发生异常，%4$s", this.getDELogicRuntime().getDataEntityRuntime().getName(), this.getDELogicRuntime().getName(), strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDELogicRuntime().getDataEntityRuntime(), this.getDELogicRuntime(), String.format("设置参数[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
		}
		return this;
	}

	
	@Override
	public IDELogicScriptNodeRuntimeContext debugParam(String strName) {
		try {
			IDELogicParamRuntime iDELogicParamRuntime = this.getDELogicRuntime().getDELogicParamRuntime(strName, false);
			getDELogicSession().debugParam(iDELogicParamRuntime);
		}
		catch(Throwable ex) {
			log.error(String.format("实体[%1$s]处理逻辑[%2$s]调试参数[%3$s]发生异常，%4$s", this.getDELogicRuntime().getDataEntityRuntime().getName(), this.getDELogicRuntime().getName(), strName, ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDELogicRuntime().getDataEntityRuntime(), this.getDELogicRuntime(), String.format("调试参数[%2$s]发生异常，%1$s", ex.getMessage(), strName), ex);
		}
		return this;
	}

	@Override
	public IDELogicScriptNodeRuntimeContext debug(String strInfo) {
		getDELogicSession().debugInfo(strInfo);
		return this;
	}

	
	
	
}
