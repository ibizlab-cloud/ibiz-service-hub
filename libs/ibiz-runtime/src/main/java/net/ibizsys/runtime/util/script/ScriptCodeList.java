package net.ibizsys.runtime.util.script;

import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.runtime.codelist.ICodeListRuntime;

public class ScriptCodeList implements IScriptCodeList {

	private ICodeListRuntime iCodeListRuntime = null;
	public ScriptCodeList(ICodeListRuntime iCodeListRuntime) {
		this.iCodeListRuntime = iCodeListRuntime;
	}
	
	protected ICodeListRuntime getCodeListRuntime() {
		return this.iCodeListRuntime;
	}
	
	@Override
	public ICodeListRuntime getReal() {
		return getCodeListRuntime();
	}

	@Override
	public String text(Object objValue) {
		return getCodeListRuntime().getText(objValue);
	}

	@Override
	public IScriptCodeItem item(Object objValue) {
		return item(objValue, false);
	}

	@Override
	public IScriptCodeItem item(Object objValue, boolean bTryMode) {
		if(objValue == null) {
			throw new RuntimeException("传入代码项值无效");
		}
		IPSCodeItem iPSCodeItem = this.getCodeListRuntime().getPSCodeItem(objValue.toString(), bTryMode);
		if(iPSCodeItem != null) {
			return new ScriptCodeItem(this.getCodeListRuntime(), iPSCodeItem);
		}
		return null;
	}
	
	
	
}
