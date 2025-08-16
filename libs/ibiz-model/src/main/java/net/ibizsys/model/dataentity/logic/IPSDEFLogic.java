package net.ibizsys.model.dataentity.logic;



/**
 * 实体属性处理逻辑模型对象接口
 * <P>
 * 扩展父接口类型[DEFIELD]
 *
 */
public interface IPSDEFLogic extends net.ibizsys.model.dataentity.logic.IPSDELogic{

	
	
	/**
	 * 获取属性逻辑模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DEFLOGICMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFLogicMode}
	 * @return
	 */
	java.lang.String getDEFLogicMode();
	
	
	/**
	 * 获取实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
}