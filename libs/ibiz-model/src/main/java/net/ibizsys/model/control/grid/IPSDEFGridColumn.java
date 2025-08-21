package net.ibizsys.model.control.grid;



/**
 * 实体属性表格列配置模型对象接口
 *
 */
public interface IPSDEFGridColumn extends net.ibizsys.model.dataentity.defield.IPSDEFUIItem{

	
	
	/**
	 * 获取代码表输出模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeListConvertMode}
	 * @return
	 */
	java.lang.String getCLConvertMode();
	
	
	/**
	 * 获取表格列对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getColumnAlign();
	
	
	/**
	 * 获取列宽度
	 * @return
	 */
	int getColumnWidth();
	
	
	/**
	 * 获取启用条件
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditItemEnableCond}
	 * @return
	 */
	int getEnableCond();
	
	
	/**
	 * 获取列绘制前端模板插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPlugin();


	/**
	 * 获取列绘制前端模板插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getRenderPSSysPFPluginMust();
	
	
	/**
	 * 获取是否支持排序
	 * @return
	 */
	boolean isEnableSort();
}