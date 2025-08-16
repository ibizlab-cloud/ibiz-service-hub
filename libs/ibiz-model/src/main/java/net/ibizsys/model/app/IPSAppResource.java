package net.ibizsys.model.app;



/**
 * 应用预置资源模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppResourceDTO}运行时对象
 *
 */
public interface IPSAppResource extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取资源内容
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppResourceDTO#FIELD_CONTENT}
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取资源标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppResourceDTO#FIELD_RESTAG}
	 * @return
	 */
	java.lang.String getResTag();
	
	
	/**
	 * 获取资源类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppResourceDTO#FIELD_RESOURCETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppResourceType}
	 * @return
	 */
	java.lang.String getResourceType();
}