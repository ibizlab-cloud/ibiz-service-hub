package net.ibizsys.central.util.script;

public interface IScriptPage extends IScriptList{

	/**
	 * 获取总记录数
	 * @return
	 */
	long getTotal();
	
	
	
	/**
	 * 设置总记录数
	 * @param nTotal
	 */
	IScriptPage total(long nTotal);
	
}
