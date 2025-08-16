package net.ibizsys.runtime.util.script;

import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.runtime.codelist.ICodeListRuntime;

public class ScriptCodeItem implements IScriptCodeItem {

	private ICodeListRuntime iCodeListRuntime = null;
	private IPSCodeItem iPSCodeItem = null;
	
	public ScriptCodeItem(ICodeListRuntime iCodeListRuntime, IPSCodeItem iPSCodeItem) {
		this.iCodeListRuntime = iCodeListRuntime;
		this.iPSCodeItem = iPSCodeItem;
	}
	
	protected ICodeListRuntime getCodeListRuntime() {
		return this.iCodeListRuntime;
	}

	protected IPSCodeItem getPSCodeItem() {
		return this.iPSCodeItem;
	}

	@Override
	public String getText() {
		return this.getPSCodeItem().getText();
	}

	@Override
	public String getValue() {
		return this.getPSCodeItem().getValue();
	}

	@Override
	public String getBKColor() {
		return this.getPSCodeItem().getBKColor();
	}

	@Override
	public String getCodeName() {
		return this.getPSCodeItem().getCodeName();
	}

	@Override
	public String getColor() {
		return this.getPSCodeItem().getColor();
	}

	@Override
	public String getData() {
		return this.getPSCodeItem().getData();
	}

	@Override
	public String getIconCls() {
		return this.getPSCodeItem().getIconCls();
	}

	@Override
	public String getTextCls() {
		return this.getPSCodeItem().getTextCls();
	}

	@Override
	public String getTooltip() {
		return this.getPSCodeItem().getTooltip();
	}

	@Override
	public boolean isDefault() {
		return this.getPSCodeItem().isDefault();
	}

	@Override
	public boolean isDisableSelect() {
		return this.getPSCodeItem().isDisableSelect();
	}

	@Override
	public boolean isShowAsEmtpy() {
		return this.getPSCodeItem().isShowAsEmtpy();
	}

	@Override
	public IPSCodeItem getReal() {
		return this.getPSCodeItem();
	}
	
	
}
