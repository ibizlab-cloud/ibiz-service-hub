package net.ibizsys.model.res;



/**
 * 系统值序列模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO}运行时对象
 *
 */
public interface IPSSysSequence extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取扩展格式化参数集合
	 * @return
	 */
	java.lang.String[] getExtFormatParams();
	
	
	/**
	 * 获取标识存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_KEYPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField();


	/**
	 * 获取标识存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust();
	
	
	/**
	 * 获取值序列最大值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_MAXVALUE}
	 * @return
	 */
	java.math.BigInteger getMaxValue();
	
	
	/**
	 * 获取值序列最小值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_MINVALUE}
	 * @return
	 */
	java.math.BigInteger getMinValue();
	
	
	/**
	 * 获取实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取后端模板插件对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_PSSYSSFPLUGINID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端模板插件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统模块
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_PSMODULEID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取值序列格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_SEQUENCEFORMAT}
	 * @return
	 */
	java.lang.String getSequenceFormat();
	
	
	/**
	 * 获取序列动态参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_SEQUENCEPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getSequenceParams();
	
	
	/**
	 * 获取值序列标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_SEQUENCETAG}
	 * @return
	 */
	java.lang.String getSequenceTag();
	
	
	/**
	 * 获取值序列标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_SEQUENCETAG2}
	 * @return
	 */
	java.lang.String getSequenceTag2();
	
	
	/**
	 * 获取值序列类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_SEQUENCETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SequenceType}
	 * @return
	 */
	java.lang.String getSequenceType();
	
	
	/**
	 * 获取时间格式化
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_TIMEFORMAT}
	 * @return
	 */
	java.lang.String getTimeFormat();
	
	
	/**
	 * 获取时间存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_TIMEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEField();


	/**
	 * 获取时间存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEFieldMust();
	
	
	/**
	 * 获取类型存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_TYPEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEField();


	/**
	 * 获取类型存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEFieldMust();
	
	
	/**
	 * 获取值存储属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSequenceDTO#FIELD_VALUEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField();


	/**
	 * 获取值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust();
}