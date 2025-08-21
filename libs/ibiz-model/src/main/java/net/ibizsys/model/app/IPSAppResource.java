package net.ibizsys.model.app;



/**
 * 应用预置资源模型对象接口
 *
 */
public interface IPSAppResource extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取资源内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取资源标记
	 * @return
	 */
	java.lang.String getResTag();
	
	
	/**
	 * 获取资源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppResourceType}
	 * @return
	 */
	java.lang.String getResourceType();
}