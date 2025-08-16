package net.ibizsys.central.util.script;

import org.springframework.data.domain.Page;

import net.ibizsys.central.ISystemRuntime;

public class ScriptPage extends ScriptList implements IScriptPage{

	private Page page = null;
	
	public ScriptPage(ISystemRuntime iSystemRuntime, Page page, boolean bLowerCaseFieldName) {
		super(iSystemRuntime, page.getContent(), bLowerCaseFieldName);
		this.page = page;
	}
	
	protected Page getPage() {
		return this.page;
	}
	
	protected void setPage(Page page) {
		this.page = page;
		this.setList(this.page.getContent());
	}
	
	@Override
	public Object getReal() {
		return getPage();
	}

	@Override
	public long getTotal() {
		return getPage().getTotalElements();
	}

	@Override
	public IScriptPage total(long nTotal) {
		//重建对象
		if(this.getPage() instanceof ScriptPageImpl) {
			((ScriptPageImpl)this.getPage()).setTotalElements(nTotal);
		}
		else {
			//throw new RuntimeException(arg0)
			//重建对象
			this.setPage(new ScriptPageImpl(this.getPage().getContent(), this.getPage().getPageable(), nTotal));
		}
		return this;
	}
	
	
	

}
