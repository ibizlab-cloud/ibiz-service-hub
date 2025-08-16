package net.ibizsys.model.dataentity.ba;



/**
 * 实体大数据表关系模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysBDTableDEDTO}运行时对象
 *
 */
public interface IPSDEBDTable extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取大数据表实体类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBDTableDEDTO#FIELD_DEFAULTFLAG}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEBDTableType}
	 * @return
	 */
	int getBDTableDEType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取大数据体系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBDTableDEDTO#FIELD_PSSYSBDSCHEMEID}
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme();


	/**
	 * 获取大数据体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDSchemeMust();
	
	
	/**
	 * 获取大数据表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysBDTableDEDTO#FIELD_PSSYSBDTABLEID}
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTable();


	/**
	 * 获取大数据表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTableMust();
}