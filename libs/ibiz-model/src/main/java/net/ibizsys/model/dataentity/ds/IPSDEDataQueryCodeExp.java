package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询代码表达式模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDQCodeExpDTO}运行时对象
 *
 */
public interface IPSDEDataQueryCodeExp extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取表达式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDQCodeExpDTO#FIELD_EXPCODE}
	 * @return
	 */
	java.lang.String getExpression();
}