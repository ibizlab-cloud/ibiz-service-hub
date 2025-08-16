package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑连接模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO}运行时对象
 *
 */
public interface IPSDEUILogicLink extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkBase{

	
	
	/**
	 * 获取目标逻辑节点对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DSTPSDELOGICNODEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getDstPSDEUILogicNode();


	/**
	 * 获取目标逻辑节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getDstPSDEUILogicNodeMust();
	
	
	/**
	 * 获取连接条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_LINKCOND}
	 * @return
	 */
	java.lang.String getLinkCond();
	
	
	/**
	 * 获取连接模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEUILogicLinkMode}
	 * @return
	 */
	int getLinkMode();
	
	
	/**
	 * 获取连接条件对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond getPSDEUILogicLinkGroupCond();


	/**
	 * 获取连接条件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond getPSDEUILogicLinkGroupCondMust();
	
	
	/**
	 * 获取源逻辑节点对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_SRCPSDELOGICNODEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getSrcPSDEUILogicNode();


	/**
	 * 获取源逻辑节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getSrcPSDEUILogicNodeMust();
	
	
	/**
	 * 获取是否异常处理连接，{@link #getLinkMode}等于异常处理(9)
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isCatchLink();
	
	
	/**
	 * 获取是否默认连接，{@link #getLinkMode}等于默认连接(1)
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isDefaultLink();
	
	
	/**
	 * 获取是否异步完成连接，{@link #getLinkMode}等于异步结束(2)
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isFulfilledLink();
	
	
	/**
	 * 获取是否异步拒绝连接，{@link #getLinkMode}等于异步拒绝(3)
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isRejectedLink();
	
	
	/**
	 * 获取是否子调用连接，{@link #getLinkMode}等于异常处理(10)
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isSubCallLink();
}