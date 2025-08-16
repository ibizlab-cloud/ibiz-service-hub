package net.ibizsys.model.dataentity.mainstate;



/**
 * 实体主状态模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO}运行时对象
 *
 */
public interface IPSDEMainState extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取行为拒绝消息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_DEACTIONDENYMSG}
	 * @return
	 */
	java.lang.String getActionDenyMsg();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取进入实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_ENTERPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getEnterPSDEAction();


	/**
	 * 获取进入实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getEnterPSDEActionMust();
	
	
	/**
	 * 获取进入状态模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMSEnterMode}
	 * @return
	 */
	java.lang.String getEnterStateMode();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_PSDEMAINSTATENAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取主状态标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_MSTAG}
	 * @return
	 */
	java.lang.String getMSTag();
	
	
	/**
	 * 获取主状态类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMainStateType}
	 * @return
	 */
	int getMSType();
	
	
	/**
	 * 获取操作标识拒绝消息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_DEOPPRIVDENYMSG}
	 * @return
	 */
	java.lang.String getOPPrivDenyMsg();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取主状态控制行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction> getPSDEMainStateActions();
	
	/**
	 * 获取主状态控制行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction getPSDEMainStateAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置主状态控制行为集合
	 * @param list 主状态控制行为集合
	 */
	void setPSDEMainStateActions(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateAction> list);
	
	
	/**
	 * 获取主状态控制属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField> getPSDEMainStateFields();
	
	/**
	 * 获取主状态控制属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField getPSDEMainStateField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置主状态控制属性集合
	 * @param list 主状态控制属性集合
	 */
	void setPSDEMainStateFields(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateField> list);
	
	
	/**
	 * 获取主状态控制操作标识集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv> getPSDEMainStateOPPrivs();
	
	/**
	 * 获取主状态控制操作标识集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv getPSDEMainStateOPPriv(Object objKey, boolean bTryMode);
	
	/**
	 * 设置主状态控制操作标识集合
	 * @param list 主状态控制操作标识集合
	 */
	void setPSDEMainStateOPPrivs(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainStateOPPriv> list);
	
	
	/**
	 * 获取前序状态集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> getPrevPSDEMainStates();
	
	/**
	 * 获取前序状态集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPrevPSDEMainState(Object objKey, boolean bTryMode);
	
	/**
	 * 设置前序状态集合
	 * @param list 前序状态集合
	 */
	void setPrevPSDEMainStates(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> list);
	
	
	/**
	 * 获取状态2值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_MSVALUE2}
	 * @return
	 */
	java.lang.String getState2Value();
	
	
	/**
	 * 获取状态3值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_MSVALUE3}
	 * @return
	 */
	java.lang.String getState3Value();
	
	
	/**
	 * 获取状态值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_MSVALUE}
	 * @return
	 */
	java.lang.String getStateValue();
	
	
	/**
	 * 获取视图操作控制
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_VIEWACTIONS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEViewAction}
	 * @return
	 */
	long getViewActions();
	
	
	/**
	 * 获取流程状态模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMSWFStateMode}
	 * @return
	 */
	int getWFStateMode();
	
	
	/**
	 * 获取是否行为允许模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_ALLOWMODE}
	 * @return
	 */
	boolean isActionAllowMode();
	
	
	/**
	 * 获取是否默认主状态
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_DEFAULTMODE}
	 * @return
	 */
	boolean isDefault();
	
	
	/**
	 * 获取是否启用视图操作控制
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_ENABLEVIEWACTIONS}
	 * @return
	 */
	boolean isEnableViewActions();
	
	
	/**
	 * 获取是否属性允许模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_FIELDALLOWMODE}
	 * @return
	 */
	boolean isFieldAllowMode();
	
	
	/**
	 * 获取是否操作标识允许模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMainStateDTO#FIELD_OPPRIVALLOWMODE}
	 * @return
	 */
	boolean isOPPrivAllowMode();
}