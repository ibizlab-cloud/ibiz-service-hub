package net.ibizsys.central.util;

import java.util.Map;

import net.ibizsys.central.dataentity.ds.IDEFilterDTORuntime;
import net.ibizsys.central.dataentity.service.IDEMethodDTO;

/**
 * 搜索上下文对象接口
 * @author lionlau
 *
 */
public interface ISearchContextDTO extends ISearchContext,IDEMethodDTO,ISearchGroupCondBase{
	
	/**
	 * 获取实体过滤器对象运行时
	 * @return
	 */
	IDEFilterDTORuntime getDEMethodDTORuntime();
	
	
	/**
	 * 设置实体方法DTO运行时对象
	 * @param iDEFilterDTORuntime
	 */
	void setDEMethodDTORuntime(IDEFilterDTORuntime iDEFilterDTORuntime);
	
	
	/**
	 * 直接获取原始数据Map对象
	 * @return
	 */
	Map<String, Object> any();
	
	

	/**
	 * 设置属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @return
	 */
	ISearchContextDTO setFieldCond(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContextDTO eq(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchContextDTO ne(String strFieldName, Object objValue);
	 
	 
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContextDTO gt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContextDTO gte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContextDTO lt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContextDTO lte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContextDTO like(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	ISearchContextDTO ll(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 * @param objValue
	 */
	 ISearchContextDTO rl(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	ISearchContextDTO nvl(String strFieldName);
	
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	ISearchContextDTO nn(String strFieldName);

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	ISearchContextDTO in(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	ISearchContextDTO ni(String strFieldName, Object objValue);
	
	/**
	 * 添加自定义条件
	 * @param strCustomCond
	 */
	ISearchContextDTO custom(String strCustomCond);
	
	
	/**
	 * 加入预定义条件
	 * @param strPredefinedCond
	 * @param strPredefinedType
	 * @return
	 */
	ISearchContextDTO predefined(String strPredefinedCond, String strPredefinedType);
	
	
	
	/**
	 * 设置当前搜索是否计数
	 * @param bCount
	 * @return
	 */
	ISearchContextDTO count(boolean bCount);
	
	
	/**
	 * 设置搜索排序信息
	 * @param strSortInfo
	 * @return
	 */
	ISearchContextDTO sort(String strSortInfo);
	
	/**
	 * 设置搜索返回全部数据
	 * @return
	 */
	ISearchContextDTO all();
	

	/**
	 * 设置搜索数据范围
	 * @return
	 */
	ISearchContextDTO limit(int nSize);
	

	
	/**
	 * 设置搜索数据范围
	 * @param nStart
	 * @param nSize
	 * @return
	 */
	ISearchContextDTO limit(int nStart, int nSize);
	
	
	
	/**
	 * 增加直接变量
	 * @param strName
	 * @param objValue
	 * @return
	 */
	ISearchContextDTO param(String strName, Object objValue);
	
	
	/**
	 * 增加一个子逻辑组（AND）
	 * @return
	 */
	ISearchGroupCond and();

	
	/**
	 * 增加一个子逻辑组（OR）
	 * @return
	 */
	ISearchGroupCond or();
	
	
	/**
	 * 通过分组分类获取分组条件
	 * @param strCat
	 * @return
	 */
	ISearchGroupCond getSearchGroupCondByCat(String strCat);
	
	
	/**
	 * 通过分组分类获取分组数据分组条件
	 * @param strCat
	 * @return
	 */
	ISearchGroupCond getGroupDataGroupCondByCat(String strCat);
	
	
	/**
	 * 填充嵌套数据
	 * @param bFillNestedFields
	 * @return
	 */
	ISearchContextDTO nestedfields(boolean bFillNestedFields);
	
	
	/**
	 * 填充动态属性数据
	 * @param bFillDynaFields
	 * @return
	 */
	ISearchContextDTO dynafields(boolean bFillDynaFields);
	
	
	/**
	 * 填充计算属性数据
	 * @param bFillDynaFields
	 * @return
	 */
	ISearchContextDTO computedfields(boolean bFillComputedFields);
	
	
	/**
	 * 转化属性值
	 * @param bTranslateFields
	 * @return
	 */
	ISearchContextDTO translatefields(boolean bTranslateFields);
	
	
	/**
	 * 设置直接查询模式
	 * @return
	 */
	ISearchContextDTO raw();
}
