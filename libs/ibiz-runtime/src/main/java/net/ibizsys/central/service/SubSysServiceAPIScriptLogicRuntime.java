package net.ibizsys.central.service;

import org.springframework.util.Assert;

import net.ibizsys.central.util.script.ScriptLogicRuntimeBase;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.SystemRuntimeException;

public class SubSysServiceAPIScriptLogicRuntime extends ScriptLogicRuntimeBase implements ISubSysServiceAPIScriptLogicRuntime{

	@Override
	protected void onInit() throws Exception {
		if(!(this.getModelRuntime() instanceof ISubSysServiceAPIRuntime)) {
			throw new Exception("模型运行时对象类型不正确");
		}
		super.onInit();
	}
	
	protected ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return (ISubSysServiceAPIRuntime)this.getModelRuntime();
	}
	
	
	protected ISubSysServiceAPIRTScriptContext getSubSysServiceAPIRTScriptContext() {
		return this.getSubSysServiceAPIRuntime().getSubSysServiceAPIRTScriptContext();
	}
	
	
	@Override
	protected String onPrepreScriptCode(String strScript) {
		if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
			if(LOGICMODE_AUTH.equalsIgnoreCase(this.getLogicMode())) {
				String strJSCode = "def main(";
				strJSCode += "sys,api";
				strJSCode += "){";
				strJSCode += strScript;
				strJSCode += "}";
				return strJSCode;
			}
			else
			if(LOGICMODE_METHOD.equalsIgnoreCase(this.getLogicMode())) {
				String strJSCode = "def main(";
				strJSCode += "sys,api,apide,method,param";
				strJSCode += "){";
				strJSCode += strScript;
				strJSCode += "}";
				return strJSCode;
			}
			else
			if(LOGICMODE_METHODPARAM.equalsIgnoreCase(this.getLogicMode())) {
				String strJSCode = "def main(";
				strJSCode += "sys";
				strJSCode += "){";
				strJSCode += strScript;
				strJSCode += "}";
				return strJSCode;
			}
		}
		else {
			if(LOGICMODE_AUTH.equalsIgnoreCase(this.getLogicMode())) {
				String strJSCode = "function main(";
				strJSCode += "sys,api";
				strJSCode += "){";
				strJSCode += strScript;
				strJSCode += "}";
				return strJSCode;
			}
			else
			if(LOGICMODE_METHOD.equalsIgnoreCase(this.getLogicMode())) {
				String strJSCode = "function main(";
				strJSCode += "sys,api,method,param";
				strJSCode += "){";
				strJSCode += strScript;
				strJSCode += "}";
				return strJSCode;
			}
			else
			if(LOGICMODE_METHODPARAM.equalsIgnoreCase(this.getLogicMode())) {
				String strJSCode = "function main(";
				strJSCode += "sys";
				strJSCode += "){";
				strJSCode += strScript;
				strJSCode += "}";
				return strJSCode;
			}
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getModelRuntime(), String.format("无法识别的逻辑模式[%1$s]", this.getLogicMode()));
	}
	
	@Override
	public Object execute(Object[] args) {
		if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(this.getScriptEngine())) {
			if(LOGICMODE_METHOD.equalsIgnoreCase(this.getLogicMode())) {
				Assert.isTrue(args!=null && args.length == 3, "传入参数无效");
				return super.execute(new Object[] {getSubSysServiceAPIRuntime(), args[0], args[1], args[2]});
			}
			if(LOGICMODE_AUTH.equalsIgnoreCase(this.getLogicMode())) {
				return super.execute(new Object[] {getSubSysServiceAPIRuntime()});
			}
			if(LOGICMODE_METHODPARAM.equalsIgnoreCase(this.getLogicMode())) {
				return super.execute(new Object[] {});
			}
		}
		else {
			if(LOGICMODE_METHOD.equalsIgnoreCase(this.getLogicMode())) {
				Assert.isTrue(args!=null && args.length == 2, "传入参数无效");
				return super.execute(new Object[] {getSubSysServiceAPIRTScriptContext(), args[0], args[1]});
			}
			if(LOGICMODE_AUTH.equalsIgnoreCase(this.getLogicMode())) {
				return super.execute(new Object[] {getSubSysServiceAPIRTScriptContext()});
			}
			if(LOGICMODE_METHODPARAM.equalsIgnoreCase(this.getLogicMode())) {
				return super.execute(new Object[] {});
			}
		}
		
		return super.execute(args);
	}

	
}
