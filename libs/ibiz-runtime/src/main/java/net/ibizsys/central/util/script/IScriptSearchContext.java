package net.ibizsys.central.util.script;

import net.ibizsys.runtime.util.script.IScriptEntity;

/**
 * 用于脚本调用的搜索上下文对象
 * @author lionlau
 *
 */
public interface IScriptSearchContext extends net.ibizsys.runtime.util.script.IScriptSearchContext,IScriptSearchGroupCondBase {

	
	/**
	 * 设置分页信息
	 * @param nPageNumber
	 * @param nPageSize
	 */
	IScriptSearchContext pageable(int nPageNumber, int nPageSize);
	
	
	/**
	 * 设置分页排序
	 * @param strPageSort
	 */
	IScriptSearchContext sort(String strPageSort);
	
	
	/**
	 * 获取页号
	 * @return
	 */
	long getPageNo();
	
	
	/**
	 * 获取分页大小
	 * @return
	 */
	long getPageSize();
	
	
	/**
	 * 设置是否计数
	 * @param bCount
	 * @return
	 */
	IScriptSearchContext count(boolean bCount);
	
	/**
	 * 建立子组（AND）逻辑
	 * @return
	 */
	IScriptSearchGroupCond and();
	
	/**
	 * 建立子组（OR）逻辑
	 * @return
	 */
	IScriptSearchGroupCond or();
	
	
	/**
	 * 设置属性条件
	 * @param strFieldName
	 * @param strCondOp
	 * @param objValue
	 * @return
	 */
	IScriptSearchContext field(String strFieldName, String strCondOp, Object objValue);
	
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 */
	IScriptSearchContext eq(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	IScriptSearchContext ne(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	IScriptSearchContext gt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	IScriptSearchContext gte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	IScriptSearchContext lt(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	IScriptSearchContext lte(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchContext like(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchContext ll(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	IScriptSearchContext rl(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	IScriptSearchContext nvl(String strFieldName);
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	IScriptSearchContext nn(String strFieldName) ;

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	IScriptSearchContext in(String strFieldName, Object objValue);
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	IScriptSearchContext ni(String strFieldName, Object objValue);
	
	
	/**
	 * 设置自定义条件
	 * @param strCustomCond
	 * @return
	 */
	IScriptSearchContext custom(String strCustomCond);
	
	
	
	/**
	 * 设置预定义条件
	 * @param strPredefinedType
	 * @param strPredefinedCond 
	 * @return
	 */
	IScriptSearchContext predefined(String strPredefinedType, String strPredefinedCond);
	
	
	/**
	 * 设置快速搜索条件
	 * @param strValue 
	 */
	IScriptSearchContext quick(String strValue);
	
	
	/**
	 * 查询返回数据
	 * @return
	 */
	IScriptList select();
	
	
	/**
	 * 查询返回数据
	 * @param strDEDataQueryName 数据查询名称
	 * @return
	 */
	IScriptList select(String strDEDataQueryName);
	
	
	/**
	 * 查询简单数据查询对象
	 * @return
	 */
	IScriptList selectSimple();
	
	/**
	 * 查询简单数据查询对象（等同 selectSimple）
	 * @return
	 */
	IScriptList selectsimple();
	
//	/**
//	 * 查询默认数据查询对象
//	 * @return
//	 */
//	IScriptEntityList selectDefault();
//	
	
	
	/**
	 * 查询结果集
	 * @param strDEDataSetName 数据集名称
	 * @return
	 */
	IScriptPage fetch(String strDEDataSetName);
	
	
	/**
	 * 查询默认数据集
	 * @return
	 */
	IScriptPage fetch();
	
	
	
	/**
	 * 删除符合条件的数据
	 * @return
	 */
	int remove();
	
	
	/**
	 * 更新符合条件的数据
	 * @param data
	 * @return
	 */
	IScriptList update(Object data);
	
	
	/**
	 * 返回脚本调用的分页结果对象
	 * @return
	 */
	IScriptPage page();
	
	
	
	/**
	 * 查询一行数据
	 * @param bTryMode 是否为尝试模式
	 * @return
	 */
	IScriptEntity selectOne(boolean bTryMode);
	
	
	/**
	 * 查询一行数据（等同 selectOne）
	 * @param bTryMode 是否为尝试模式
	 * @return
	 */
	IScriptEntity selectone(boolean bTryMode);
	
	
	/**
	 * 查询一行数据，必须存在
	 * @return
	 */
	IScriptEntity selectOne();
	
	
	/**
	 * 查询一行数据（等同 selectOne），必须存在
	 * @return
	 */
	IScriptEntity selectone();
	
	
	
	/**
	 * 是否存在数据
	 * @return
	 */
	boolean exists();
	
	
	/**
	 * 获取指定分类条件
	 * @param strCat
	 * @return
	 */
	IScriptSearchGroupCond cat(String strCat);
	
	/**
	 * 获取指定分类条件
	 * @param strCat
	 * @param bCreateIf
	 * @return
	 */
	IScriptSearchGroupCond cat(String strCat, boolean bCreateIf);
	
}
