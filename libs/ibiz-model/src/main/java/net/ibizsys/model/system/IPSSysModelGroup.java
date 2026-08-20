package net.ibizsys.model.system;



/**
 * 系统模型组模型对象接口
 *
 */
public interface IPSSysModelGroup extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取分组标记
	 * @return
	 */
	String getGroupTag();
	
	
	/**
	 * 获取分组标记2
	 * @return
	 */
	String getGroupTag2();
	
	
	/**
	 * 获取分组标记3
	 * @return
	 */
	String getGroupTag3();
	
	
	/**
	 * 获取分组标记4
	 * @return
	 */
	String getGroupTag4();
	
	
	/**
	 * 获取包代码名称
	 * @return
	 */
	String getPKGCodeName();
	
	
	/**
	 * 获取运行时类型
	 * @return
	 */
	String getRuntimeType();
}