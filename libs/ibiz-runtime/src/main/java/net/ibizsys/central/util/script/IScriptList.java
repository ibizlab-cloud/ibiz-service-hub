package net.ibizsys.central.util.script;

import net.ibizsys.runtime.util.script.IScriptObject;

public interface IScriptList extends IScriptObject {

	/**
	 * 获取列表长度
	 * @return
	 */
	int size();
	
	/**
	 * 获取列表长度
	 * @return
	 */
	int getLength();
	
	/**
	 * 添加项到列表尾部
	 * @param objValue
	 */
	IScriptList add(Object objValue);
	
	/**
	 * 添加传入列表内容到列表尾部
	 * @param iScriptListBase
	 */
	IScriptList addAll(Object list);
	
	/**
	 * 添加传入列表内容到列表尾部（等同 addAll）
	 * @param iScriptListBase
	 */
	IScriptList addall(Object list);
	
	/**
	 * 添加项到列表到指定位置
	 * @param nIndex 位置
	 * @param objValue
	 */
	IScriptList add(int nIndex, Object objValue);
	
	
	
	/**
	 * 获取指定位置项
	 * @param nIndex
	 * @return
	 */
	Object get(int nIndex);
	
	
	
	/**
	 * 移除指定位置项
	 * @param nIndex
	 * @return
	 */
	Object remove(int nIndex);
	
	
	
	/**
	 * 清空列表
	 * @return
	 */
	IScriptList clear();
	
	
	/**
	 * 排序
	 * @param strSortInfo
	 * @return
	 */
	IScriptObject sort(String strSortInfo);
	
	
	/**
	 * 计算列表指定属性的最大值
	 * @param strField
	 * @return
	 */
	Object max(String strField);
	
	
	/**
	 * 计算列表指定属性的最小值
	 * @param strField
	 * @return
	 */
	Object min(String strField);
	
	
	
	/**
	 * 计算列表指定属性的平均值
	 * @param strField
	 * @return
	 */
	Object avg(String strField);
	
	
	/**
	 * 计算列表指定属性的平均值
	 * @param strField
	 * @return
	 */
	Object sum(String strField);
	
	
	/**
	 * 从传入数据构建对象
	 * @param strData
	 * @return
	 */
	IScriptList from(Object obj);
	
	
	/**
	 * 导出
	 * @return
	 */
	String dump();
//	/**
//	 * 转换数据输出
//	 * @return
//	 */
//	Object[] array();
}
