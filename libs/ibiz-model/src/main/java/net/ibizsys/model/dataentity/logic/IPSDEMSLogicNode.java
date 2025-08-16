package net.ibizsys.model.dataentity.logic;



/**
 * 实体主状态逻辑节点模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getLogicNodeType}
 *
 */
public interface IPSDEMSLogicNode extends net.ibizsys.model.dataentity.logic.IPSDELogicNodeBase{

	
	
	/**
	 * 获取行为标识集合
	 * @return
	 */
	java.util.List<java.lang.String> getActions();
	
	
	/**
	 * 获取背景颜色
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM13}
	 * @return
	 */
	java.lang.String getBKColor();
	
	
	/**
	 * 获取前景颜色
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM12}
	 * @return
	 */
	java.lang.String getColor();
	
	
	/**
	 * 获取样式表名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM11}
	 * @return
	 */
	java.lang.String getCssClass();
	
	
	/**
	 * 获取属性标识集合
	 * @return
	 */
	java.util.List<java.lang.String> getFields();
	
	
	/**
	 * 获取左侧位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_LEFTPOS}
	 * @return
	 */
	int getLeftPos();
	
	
	/**
	 * 获取操作标识集合
	 * @return
	 */
	java.util.List<java.lang.String> getOPPrivs();
	
	
	/**
	 * 获取排序值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_ORDERVALUE}
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取逻辑节点连出连接集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink> getPSDEMSLogicLinks();
	
	/**
	 * 获取逻辑节点连出连接集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink getPSDEMSLogicLink(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑节点连出连接集合
	 * @param list 逻辑节点连出连接集合
	 */
	void setPSDEMSLogicLinks(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink> list);
	
	
	/**
	 * 获取实体主状态
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainState();


	/**
	 * 获取实体主状态，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainStateMust();
	
	
	/**
	 * 获取状态值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM1}
	 * @return
	 */
	java.lang.String getStateValue();
	
	
	/**
	 * 获取上方位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_TOPPOS}
	 * @return
	 */
	int getTopPos();
	
	
	/**
	 * 获取是否行为允许模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM7}
	 * @return
	 */
	boolean isActionAllowMode();
	
	
	/**
	 * 获取是否默认状态
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM9}
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 获取是否属性允许模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM10}
	 * @return
	 */
	boolean isFieldAllowMode();
	
	
	/**
	 * 获取是否操作标识允许模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM8}
	 * @return
	 */
	boolean isOPPrivAllowMode();
}