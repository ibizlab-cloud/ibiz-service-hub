package net.ibizsys.model.control.layout;



/**
 * 布局项模型基础对象接口
 *
 */
public interface IPSLayoutItem{

	
	
	/**
	 * 获取布局位置
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPos();


	/**
	 * 获取布局位置，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPosMust();
}