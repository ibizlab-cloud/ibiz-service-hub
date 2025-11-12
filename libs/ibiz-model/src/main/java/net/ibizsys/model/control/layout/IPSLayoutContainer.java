package net.ibizsys.model.control.layout;



/**
 * 布局容器模型基础对象接口
 *
 */
public interface IPSLayoutContainer{

	
	
	/**
	 * 获取菜单布局对象
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayout();


	/**
	 * 获取菜单布局对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust();
}