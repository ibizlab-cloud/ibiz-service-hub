package net.ibizsys.model.dataentity.defield;



/**
 * 实体公式属性模型对象接口
 *
 */
public interface IPSFormulaDEField extends net.ibizsys.model.dataentity.defield.IPSDEField{

	
	
	/**
	 * 获取公式列参数
	 * @return
	 */
	java.lang.String getFormulaColumns();
	
	
	/**
	 * 获取公式列格式
	 * @return
	 */
	java.lang.String getFormulaFormat();
}