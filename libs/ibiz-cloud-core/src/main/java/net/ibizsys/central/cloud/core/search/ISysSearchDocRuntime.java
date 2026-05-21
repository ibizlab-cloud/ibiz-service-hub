package net.ibizsys.central.cloud.core.search;

import java.util.List;

import net.ibizsys.model.search.IPSSysSearchField;

public interface ISysSearchDocRuntime extends net.ibizsys.central.search.ISysSearchDocRuntime {

	/**
	 * 嵌套标记：文本及向量
	 */
	public final static String FIELDTAG_NESTED_TEXT_VECTOR = "TEXT_VECTOR";
	
	/**
	 * 获取嵌套文本向量属性
	 * @return
	 */
	List<IPSSysSearchField> getNestedTextVectorFields();
	
	
	
	/**
	 * 分割嵌套文本
	 * @param iPSSysSearchField
	 * @param strContent
	 * @return
	 */
	List<String> splitNestedText(IPSSysSearchField iPSSysSearchField, String strContent);
}
