package net.ibizsys.model.dataentity.der;



/**
 * 实体关系模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDERDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getDERType}
 *
 */
public interface IPSDERBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取关系标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_DERTAG}
	 * @return
	 */
	java.lang.String getDERTag();
	
	
	/**
	 * 获取关系标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_DERTAG2}
	 * @return
	 */
	java.lang.String getDERTag2();
	
	
	/**
	 * 获取关系类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_DERTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DERType}
	 * @return
	 */
	java.lang.String getDERType();
	
	
	/**
	 * 获取逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_LOGICNAME}
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取主实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_MAJORPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntity();


	/**
	 * 获取主实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMajorPSDataEntityMust();
	
	
	/**
	 * 获取关系数据代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_MINORCODENAME}
	 * @return
	 */
	java.lang.String getMinorCodeName();
	
	
	/**
	 * 获取从逻辑名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_MINORLOGICNAME}
	 * @return
	 */
	java.lang.String getMinorLogicName();
	
	
	/**
	 * 获取关系实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_MINORPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMinorPSDataEntity();


	/**
	 * 获取关系实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getMinorPSDataEntityMust();
	
	
	/**
	 * 获取关系数据服务代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_MINORSERVICECODENAME}
	 * @return
	 */
	java.lang.String getMinorServiceCodeName();
	
	
	/**
	 * 获取排序值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_ORDERVALUE}
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取服务代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_SERVICECODENAME}
	 * @return
	 */
	java.lang.String getServiceCodeName();
}