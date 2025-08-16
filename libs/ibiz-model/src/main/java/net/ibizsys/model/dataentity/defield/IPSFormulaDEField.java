package net.ibizsys.model.dataentity.defield;



/**
 * 实体公式属性模型对象接口
 *
 */
public interface IPSFormulaDEField extends net.ibizsys.model.dataentity.defield.IPSDEField{

	
	
	/**
	 * 获取公式列参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO#FIELD_FORMULAFIELDS}
	 * @return
	 */
	java.lang.String getFormulaColumns();
	
	
	/**
	 * 获取公式列格式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFieldDTO#FIELD_FORMULAFORMAT}
	 * @return
	 */
	java.lang.String getFormulaFormat();
}