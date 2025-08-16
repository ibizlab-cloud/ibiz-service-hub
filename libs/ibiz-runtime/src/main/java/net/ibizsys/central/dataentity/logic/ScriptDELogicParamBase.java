package net.ibizsys.central.dataentity.logic;



import org.springframework.util.Assert;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public abstract class ScriptDELogicParamBase implements IScriptDELogicParam {

	private IDELogicParamRuntime iDELogicParamRuntime = null;
	
	public ScriptDELogicParamBase(IDELogicParamRuntime iDELogicParamRuntime) {
		Assert.notNull(iDELogicParamRuntime, "传入实体逻辑参数运行时对象无效");
		setDELogicParamRuntime(iDELogicParamRuntime);
	}
	
	
	protected IDELogicParamRuntime getDELogicParamRuntime() {
		return this.iDELogicParamRuntime;
	}
	
	protected void setDELogicParamRuntime(IDELogicParamRuntime iDELogicParamRuntime) {
		this.iDELogicParamRuntime = iDELogicParamRuntime;
	}
	
	protected IDataEntityRuntime getDataEntityRuntime() {
		return getDELogicRuntime().getDataEntityRuntime();
	}
	
	protected IDELogicRuntime getDELogicRuntime() {
		return this.getDELogicParamRuntime().getDELogicRuntime();
	}
	
	
	@Override
	public Object getReal() {
		try {
			return this.getDELogicParamRuntime().getParamObject(DELogicSession.getCurrentMust());
		}
		catch(Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this.getDELogicParamRuntime().getDELogicRuntime(), String.format("获取参数[%1$s]实际值发生异常，%2$s", getDELogicParamRuntime().getCodeName(), ex.getMessage()), ex);
		}
	}
	
	
}
