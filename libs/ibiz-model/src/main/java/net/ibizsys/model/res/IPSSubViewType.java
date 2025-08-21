package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSubViewType extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取视图命名模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SubViewTypeNameMode}
	 * @return
	 */
	java.lang.String getNameMode();
	
	
	/**
	 * 获取类型代码
	 * @return
	 */
	java.lang.String getTypeCode();
	
	
	/**
	 * 获取视图模型
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getViewModel();
	
	
	/**
	 * 获取标准视图类型
	 * @return
	 */
	java.lang.String getViewType();
	
	
	/**
	 * 获取是否仅扩展界面样式
	 * @return
	 */
	boolean isExtendStyleOnly();
	
	
	/**
	 * 获取是否全局默认替换
	 * @return
	 */
	boolean isReplaceDefault();
}