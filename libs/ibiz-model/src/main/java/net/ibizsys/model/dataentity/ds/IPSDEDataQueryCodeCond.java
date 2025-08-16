package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询代码条件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDQCodeCondDTO}运行时对象
 *
 */
public interface IPSDEDataQueryCodeCond extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取条件类型，恒为自定义(CUSTOM)
	 * @return
	 */
	java.lang.String getCondType();
	
	
	/**
	 * 获取查询条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取自定义类型
	 * @return
	 */
	java.lang.String getCustomType();
}