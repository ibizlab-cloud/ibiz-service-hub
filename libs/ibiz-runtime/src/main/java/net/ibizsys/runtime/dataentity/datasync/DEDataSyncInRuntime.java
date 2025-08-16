package net.ibizsys.runtime.dataentity.datasync;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.SimpleEntity;
import net.ibizsys.runtime.util.domain.DataSyncIn;
import net.ibizsys.runtime.util.script.IScriptEntity;

/**
 * 实体数据同步（输入）运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DEDataSyncInRuntime extends DEDataSyncRuntimeBase implements IDEDataSyncInRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSyncInRuntime.class);
	private Invocable  invocable  = null;
	
	@Override
	protected void onInit() throws Exception {
		
		if(this.getPSDEDataSync().getInPSSysDataSyncAgent() == null) {
			throw new Exception("没有指定输入的数据同步代理");
		}
		
		ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = null;
		
		if(this.getDynaInstRuntime()!=null) {
			iSysDataSyncAgentRuntime = this.getDynaInstRuntime().getSysDataSyncAgentRuntime(this.getPSDEDataSync().getInPSSysDataSyncAgent());
		}
		else {
			iSysDataSyncAgentRuntime = this.getSystemRuntime().getSysDataSyncAgentRuntime(this.getPSDEDataSync().getInPSSysDataSyncAgent());
		}
		
		if(StringUtils.hasLength(this.getPSDEDataSync().getInScriptCode())) {
			//存在输入代码
			ScriptEngineManager manager = new ScriptEngineManager();  
		    ScriptEngine engine = manager.getEngineByName("JavaScript");  
		    String strJSCode = "function main(sys,syncinfo,entity){";
		    strJSCode += this.getPSDEDataSync().getInScriptCode();
		    strJSCode += "}";
		    engine.eval(strJSCode);
		    invocable = (Invocable)engine;
		}
		
		super.onInit();
		
		//注册到输入代理
		iSysDataSyncAgentRuntime.registerDEDataSyncInRuntime(this);
	}

	@Override
	public void recv(DataSyncIn[] dataSyncIns) {
		for (DataSyncIn dataSyncIn : dataSyncIns) {
			if ((dataSyncIn.getEventType() & this.getEventType()) == 0) {
				continue;
			}
			try {
				onRecv(dataSyncIn);
			}
			catch(Throwable ex) {
				this.getSystemRuntime().log(LogLevels.ERROR, LogCats.EAI, String.format("实体[%1$s]数据同步[%2$s]处理输入数据发生异常，%3$s", this.getDataEntityRuntime().getName(), this.getName(), ex.getMessage()), null);
			}
		}
	}
	
	protected void onRecv(DataSyncIn dataSyncIn) throws Throwable{
		
		IEntity iEntity = this.getEntity(dataSyncIn);
		
		if(invocable != null) {
			try {
				IScriptEntity dataSyncInScriptEntity = this.getSystemRuntime().createScriptEntity(dataSyncIn);
				IScriptEntity dataScriptEntity = null;
				if(iEntity != null) {
					dataScriptEntity = this.getSystemRuntime().createScriptEntity(iEntity);
				}
				this.getSystemRuntime().createScriptEntity(dataSyncIn);
				invocable.invokeFunction("main",this.getSystemRuntime().getSystemRTScriptContext(), dataSyncInScriptEntity, dataScriptEntity);
			} catch (NoSuchMethodException | ScriptException ex) {
				log.error(ex);
				//log.error(String.format("执行数据输入脚本[%1$s]发生异常，%2$s",this.getName(), ex.getMessage()), ex);
				this.getSystemRuntime().log(LogLevels.ERROR, LogCats.SCRIPT, String.format("执行实体数据输入脚本[%1$s][%2$s]发生异常，%3$s", this.getDataEntityRuntime().getName(), this.getName(), ex.getMessage()), ex);
				throw new Exception(String.format("执行实体数据输入脚本发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		else {
			IPSDEAction iPSDEAction = this.getPSDEAction(dataSyncIn);
			this.getDataEntityRuntime().executeAction(iPSDEAction.getName(), iPSDEAction, getActionArgs(iPSDEAction, iEntity, dataSyncIn));
		}
	}
	
	
	
	protected IEntity getEntity(DataSyncIn dataSyncIn) throws Throwable{
		String strData = dataSyncIn.getData();
		SimpleEntity simpleEntity = null;
		if(StringUtils.hasLength(strData)) {
			try {
				simpleEntity = JsonUtils.MAPPER.readValue(strData,SimpleEntity.class);
			} catch (Exception ex) {
				//log.error(String.format("反序列数据对象发生异常，%1$s", ex.getMessage()), ex);
				//return;
				throw new Exception(String.format("反序列数据对象发生异常，%1$s", ex.getMessage()), ex);
			} 
		}
		return simpleEntity;
	}
	
	
	protected Object[] getActionArgs(IPSDEAction iPSDEAction, IEntity iEntity, DataSyncIn dataSyncIn) throws Throwable{
		if(iEntity != null) {
			return new Object[] {iEntity};
		}
		else {
			return new Object[] {dataSyncIn.getDataKey()};
		}
	}
	
	protected IPSDEAction getPSDEAction(DataSyncIn dataSyncIn) throws Throwable{
		IPSDEAction iPSDEAction = this.getPSDEDataSync().getImportPSDEAction();
		if(iPSDEAction == null) {
			switch(dataSyncIn.getEventType()) {
			case DEDataSyncEvents.CREATE:
				iPSDEAction = this.getDataEntityRuntime().getPSDEAction(DEActions.CREATE);
				break;
			case DEDataSyncEvents.UPDATE:
				iPSDEAction = this.getDataEntityRuntime().getPSDEAction(DEActions.UPDATE);
				break;
			case DEDataSyncEvents.REMOVE:
				iPSDEAction = this.getDataEntityRuntime().getPSDEAction(DEActions.REMOVE);
				break;
			}
		}
		
		
		if(iPSDEAction != null) {
			return iPSDEAction;
		}

		throw new Exception(String.format("无法获取导入数据行为"));
	}
	

}
