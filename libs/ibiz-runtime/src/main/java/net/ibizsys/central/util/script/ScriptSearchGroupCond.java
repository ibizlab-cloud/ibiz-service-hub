package net.ibizsys.central.util.script;

import org.springframework.util.Assert;

import net.ibizsys.central.util.ISearchGroupCond;

public class ScriptSearchGroupCond implements IScriptSearchGroupCond{

	private ISearchGroupCond searchGroupCond = null;
	public ScriptSearchGroupCond(ISearchGroupCond iSearchGroupCond) {
		this.searchGroupCond = iSearchGroupCond;
		
		Assert.notNull(getSearchGroupCond(), "搜索组条件对象无效");
	}
	
	
	@Override
	public Object getReal() {
		return this.getSearchGroupCond();
	}
	
	protected ISearchGroupCond getSearchGroupCond() {
		return this.searchGroupCond;
	}


	@Override
	public IScriptSearchGroupCond not() {
		getSearchGroupCond().not();
		return this;
	}

	@Override
	public IScriptSearchGroupCond and() {
		return new ScriptSearchGroupCond(getSearchGroupCond().and());
	}

	@Override
	public IScriptSearchGroupCond or() {
		return new ScriptSearchGroupCond(getSearchGroupCond().or());
	}

	@Override
	public IScriptSearchGroupCond field(String strFieldName, String strCondOp, Object objValue) {
		getSearchGroupCond().setFieldCond(strFieldName, strCondOp, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond eq(String strFieldName, Object objValue) {
		getSearchGroupCond().eq(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond ne(String strFieldName, Object objValue) {
		getSearchGroupCond().ne(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond gt(String strFieldName, Object objValue) {
		getSearchGroupCond().gt(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond gte(String strFieldName, Object objValue) {
		getSearchGroupCond().gte(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond lt(String strFieldName, Object objValue) {
		getSearchGroupCond().lt(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond lte(String strFieldName, Object objValue) {
		getSearchGroupCond().lte(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond like(String strFieldName, Object objValue) {
		getSearchGroupCond().like(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond ll(String strFieldName, Object objValue) {
		getSearchGroupCond().ll(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond rl(String strFieldName, Object objValue) {
		getSearchGroupCond().rl(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond nvl(String strFieldName) {
		getSearchGroupCond().nvl(strFieldName);
		return this;
	}

	@Override
	public IScriptSearchGroupCond nn(String strFieldName) {
		getSearchGroupCond().nn(strFieldName);
		return this;
	}

	@Override
	public IScriptSearchGroupCond in(String strFieldName, Object objValue) {
		getSearchGroupCond().in(strFieldName, objValue);
		return this;
	}

	@Override
	public IScriptSearchGroupCond ni(String strFieldName, Object objValue) {
		getSearchGroupCond().ni(strFieldName, objValue);
		return this;
	}



}
