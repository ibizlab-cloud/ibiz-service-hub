package net.ibizsys.central.util.freemarker;

import java.util.List;

import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.script.IScriptCodeItem;
import net.ibizsys.runtime.util.template.ITemplateEntityBase;

public interface ITemplateEntity extends TemplateHashModel, ITemplateEntityBase, IEntityBase{

	
	/**
	 * 获取对应属性的值
	 * 
	 * @param strName 属性名称
	 * @return 返回指定属性名称的值，不存在时返回null
	 */
	TemplateModel get(String key) throws TemplateModelException;
	
	
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
	 * 获取引用的父数据（引用数据）
	 * 
	 * @param  strName 如指定引用数据的名称按照属性名称、引用实体名称（标注附属关系）、引用实体（第一个符合名称）次序依次尝试获取、未指定名称时获取第一个标注为附属关系的引用实体
	 * @return 返回符合条件的引用数据实体脚本对象，不存在返回null
	 */
	ITemplateEntity parent(String strName);

	/**
	 * 获取相关的成员数据
	 * 
	 * @param strName 处理按照 属性名称（属性类型为一对多关系数据存储）、实体名称、关系成员名称 
	 * @return 返回符合条件的数据的实体脚本对象集合，不存在返回null
	 */
	List<ITemplateEntity> children(String strName);

	
	/**
	 * 准备指定实体名称的子实体脚本对象，当前数据对象的键值填充至子实体脚本对象中
	 * 
	 * @param strName 指定子数据的名称，按照实体名称（标注附属关系）、实体（第一个符合名称）次序依次尝试获取
	 * @return 返回准备好的子数据脚本对象，无法确认子数据则返回null
	 */
	ITemplateEntity child(String strName);
	
	
	
	/**
	 * 判断数据是否存在
	 * 
	 * @return
	 */
	boolean exists();
	
	
	/**
	 * 获取操作之前的数据对象，如果当前会话中不存在操作之前数据对象则直接查询当前数据返回
	 * 
	 * @return 返回操作之前的数据对象
	 */
	ITemplateEntity last();


	
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
	
	
	
	/**
	 * 以Json字符串输出（非DTO形式）
	 * @return
	 */
	String toJsonString();
	
	
	
	/**
	 * 以Json字符串输出
	 * @param bDTO DTO 形式
	 * @return
	 */
	String toJsonString(boolean bDTO);
	
	
	/**
	 * 输出Json字符串
	 * @param bDTO
	 * @param strSuffix 代码表文本后缀
	 * @return
	 */
	String toJsonString(boolean bDTO, String strSuffix);
	
	
	
}
