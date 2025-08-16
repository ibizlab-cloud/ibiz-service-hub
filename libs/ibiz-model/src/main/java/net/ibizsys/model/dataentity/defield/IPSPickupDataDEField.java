package net.ibizsys.model.dataentity.defield;



/**
 * 实体外键附加数据属性模型对象接口
 *
 */
public interface IPSPickupDataDEField extends net.ibizsys.model.dataentity.defield.IPSLinkDEField{

	
	
	/**
	 * 获取是否支持回写
	 * @return
	 */
	boolean isEnableWriteBack();
	
	
	/**
	 * 获取是否忽略刷新引用属性值
	 * @return
	 */
	boolean isIgnoreRefresh();
}