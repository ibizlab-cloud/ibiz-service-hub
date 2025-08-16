package net.ibizsys.model.control.list;



/**
 * 列表部件数据项模型对象基础接口
 *
 */
public interface IPSListDataItem extends net.ibizsys.model.data.IPSDataItem{

	
	
	/**
	 * 获取前端代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeList();


	/**
	 * 获取前端代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeListMust();
	
	
	/**
	 * 获取数据分组项
	 * @return
	 */
	java.lang.String getGroupItem();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否脚本代码模式
	 * @return
	 */
	boolean isCustomCode();
}