package net.ibizsys.runtime.util.script;

import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体脚本对象，在实体数据对象的基础上提供行为能力
 * 
 * @author lionlau
 *
 */
public interface IScriptEntity extends IEntityBase,IScriptObject{

	/**
	 * 设置数据对象的值
	 * 
	 * @param strName 属性名称
	 * @param objValue 属性值
	 * @return 返回当前脚本对象
	 */
	IScriptEntity set(String strName, Object objValue);

	/**
	 * 设置参数集合
	 * 
	 * @param args 使用名称、值的连续数组，['key',value,'key2',value,...]
	 * @return 返回当前脚本对象
	 */
	IScriptEntity set(Object[] args);
	
	/**
	 * 设置脚本参数对象
	 * 
	 * @return 返回当前脚本对象
	 */
	IScriptEntity set(Object params);
	

	/**
	 * 设置数据对象的值，必须为属性
	 * 
	 * @param strName 属性名称
	 * @param objValue 属性值
	 * @return 返回当前脚本对象
	 */
	IScriptEntity field(String strName, Object objValue);

	/**
	 * 设置参数集合，必须为属性
	 * 
	 * @param args 使用名称、值的连续数组，['key',value,'key2',value,...]
	 * @return 返回当前脚本对象
	 */
	IScriptEntity field(Object[] args);
	
	/**
	 * 设置属性值，必须为属性
	 * 
	 * @return 返回当前脚本对象
	 */
	IScriptEntity field(Object params);
	
	
	/**
	 * 获取对应属性的值
	 * 
	 * @param strName 属性名称
	 * @return 返回指定属性名称的值，不存在时返回null
	 */
	Object get(String strName);
	
	
	/**
	 * 获取对应属性的值
	 * 
	 * @param strName 属性名称
	 * @param objDefault 默认值
	 * @return 返回指定属性名称的值，值为空时返回默认值
	 */
	Object get(String strName, Object objDefault);
	

	/**
	 * 获取数据对象的标识
	 * 
	 * @return
	 */
	Object getId();
	
	
	
	
	/**
	 * 获取主属性名称
	 * @return
	 */
	Object getName();

	
	
	/**
	 * 判断是否包含指定属性
	 * 
	 * @param strName
	 * @return
	 */
	boolean contains(String strName);

	
	/**
	 * 重置指定属性
	 * 
	 * @param strName
	 * @return 返回当前脚本对象
	 */
	IScriptEntity reset(String strName);

	
	/**
	 * 重置属性集合
	 * 
	 * @param args 属性名称的连续数组，['key','key2',...]
	 * @return 返回当前脚本对象
	 */
	IScriptEntity reset(String[] args);


	/**
	 * 获取引用的父数据（引用数据）
	 * 
	 * @param  strName 如指定引用数据的名称按照属性名称、引用实体名称（标注附属关系）、引用实体（第一个符合名称）次序依次尝试获取、未指定名称时获取第一个标注为附属关系的引用实体
	 * @return 返回符合条件的引用数据实体脚本对象，不存在返回null
	 */
	IScriptEntity parent(String strName);

	/**
	 * 获取相关的成员数据
	 * 
	 * @param strName 处理按照 属性名称（属性类型为一对多关系数据存储）、实体名称、关系成员名称 
	 * @return 返回符合条件的数据的实体脚本对象集合，不存在返回null
	 */
	IScriptEntity[] children(String strName);

	/**
	 * 建立当前数据对象
	 * 
	 * @return 返回当前脚本对象
	 */
	IScriptEntity create();

	/**
	 * 更新当前数据对象
	 * 
	 * @return 返回当前脚本对象
	 */
	IScriptEntity update();

	/**
	 * 移除当前数据对象
	 * 
	 * @return
	 */
	void remove();

	/**
	 * 工作流启动
	 * 
	 * @return 返回当前脚本对象
	 */
	IScriptEntity wfstart();

	
	
	
	/**
	 * 自定义调用
	 * 
	 * @param strName 指定行为名称
	 * @return 返回当前脚本对象
	 */
	IScriptEntity call(String strName);
	
	
	/**
	 * 抛出实体运行时错误信息，停止处理
	 * 
	 * @param strErrorInfo
	 */
	void exception(String strErrorInfo);
	
	/**
	 * 抛出实体运行时错误信息，停止处理
	 * 
	 * @param strErrorInfo
	 * @param nErrorCode 错误代码
	 */
	void exception(String strErrorInfo, int nErrorCode);
	
	
	
	/**
	 * 准备指定实体名称的子实体脚本对象，当前数据对象的键值填充至子实体脚本对象中
	 * 
	 * @param strName 指定子数据的名称，按照实体名称（标注附属关系）、实体（第一个符合名称）次序依次尝试获取
	 * @return 返回准备好的子数据脚本对象，无法确认子数据则返回null
	 */
	IScriptEntity child(String strName);
	
	
	
	/**
	 * 判断数据是否存在
	 * 
	 * @return
	 */
	boolean exists();
	
	
	
	/**
	 * 根据当前数据对象的键值状态自动判断执行建立或是更新操作
	 * 
	 * @return 返回当前脚本对象
	 */
	IScriptEntity save();
	
	
	
	/**
	 * 克隆当前数据对象
	 * @param 是否重置不拷贝的数据
	 * @return 返回克隆得到的新脚本对象
	 */
	IScriptEntity clone(boolean bResetUncopyValues);
	
	
	
	/**
	 * 获取用于方法调用的数据对象，默认只有主键
	 * @return 返回用于方法调用的新脚本对象
	 */
	IScriptEntity callEntity();
	
	
	
	/**
	 * 获取操作之前的数据对象，如果当前会话中不存在操作之前数据对象则直接查询当前数据返回
	 * 
	 * @return 返回操作之前的数据对象
	 */
	IScriptEntity last();
	
	
	/**
	 * 从源数据对象拷贝指定属性
	 * 
	 * @param srcScriptEntity
	 * @param fields 属性数组，如需拷贝至新属性，可使用 srcfield|dstfield 定义
	 * @return
	 */
	IScriptEntity copy(IScriptEntity srcScriptEntity,String[] fields);
	


	/**
	 * 从源数据对象拷贝指定属性
	 * @param srcObject
	 * @param fields 属性数组，如需拷贝至新属性，可使用 srcfield|dstfield 定义
	 * @return
	 */
	IScriptEntity copy(Object srcObject, String[] fields);
	
	/**
	 * 触发实体通知
	 * 
	 * @param strName 指定通知标识
	 */
	IScriptEntity notify(String strName);
	
	
	
	/**
	 * 从传入数据构建对象
	 * @param objData
	 * @return
	 */
	IScriptEntity from(Object objData);
	
	
	
	/**
	 * 将对象导出为字符串
	 * @return
	 */
	String dump();
	
	
	
	/**
	 * 获取指定属性的值代码项
	 * @param strName
	 * @return
	 */
	IScriptCodeItem codeitem(String strName);
	
	/**
	 * 获取指定属性的值代码项
	 * @param strName
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IScriptCodeItem codeitem(String strName,  boolean bTryMode);
	
	
	
	/**
	 * 获取代码表文本
	 * @param strName
	 * @return
	 */
	String codelisttext(String strName);
}
