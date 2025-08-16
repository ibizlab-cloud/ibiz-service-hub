package net.ibizsys.model.dataentity.ds;



/**
 * 实体方法过滤器DTO属性对象接口
 * <P>
 * 扩展父接口类型[DEFSEARCHMODE]
 *
 */
public interface IPSDEFilterDTOField extends net.ibizsys.model.dataentity.service.IPSDEMethodDTOField{

	
	
	/**
	 * 获取实体属性搜索模式
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode();


	/**
	 * 获取实体属性搜索模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust();
}