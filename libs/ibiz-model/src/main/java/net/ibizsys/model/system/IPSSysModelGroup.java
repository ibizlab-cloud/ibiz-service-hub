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
	java.lang.String getCodeName();
	
	
	/**
	 * 获取分组标记
	 * @return
	 */
	java.lang.String getGroupTag();
	
	
	/**
	 * 获取分组标记2
	 * @return
	 */
	java.lang.String getGroupTag2();
	
	
	/**
	 * 获取分组标记3
	 * @return
	 */
	java.lang.String getGroupTag3();
	
	
	/**
	 * 获取分组标记4
	 * @return
	 */
	java.lang.String getGroupTag4();
	
	
	/**
	 * 获取包代码名称
	 * @return
	 */
	java.lang.String getPKGCodeName();
	
	
	/**
	 * 获取运行时类型
	 * @return
	 */
	java.lang.String getRuntimeType();
}