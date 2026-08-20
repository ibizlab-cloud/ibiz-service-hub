package net.ibizsys.model.wx;



/**
 *
 */
public interface IPSWXMenuFunc extends net.ibizsys.model.wx.IPSWXAccountObject{

	
	
	/**
	 * 获取点击标记
	 * @return
	 */
	String getClickTag();
	
	
	/**
	 * 获取功能类型
	 * @return
	 */
	String getWXMenuFuncType();
}