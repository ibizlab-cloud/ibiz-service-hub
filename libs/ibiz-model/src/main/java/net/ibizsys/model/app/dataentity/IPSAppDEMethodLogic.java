package net.ibizsys.model.app.dataentity;



/**
 * 应用实体方法附加逻辑对象接口
 *
 */
public interface IPSAppDEMethodLogic extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject{

	
	
	/**
	 * 获取行为逻辑类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionLogicType}
	 * @return
	 */
	int getActionLogicType();
	
	
	/**
	 * 获取附加模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode}
	 * @return
	 */
	java.lang.String getAttachMode();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否忽略异常
	 * @return
	 */
	boolean isIgnoreException();
}