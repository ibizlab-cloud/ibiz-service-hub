package net.ibizsys.model.control.layout;



/**
 * 布局容器模型基础对象接口
 *
 */
public interface IPSLayoutContainer{

	
	
	/**
	 * 获取看板布局
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayout();


	/**
	 * 获取看板布局，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust();
}