package net.ibizsys.central.util;

import net.ibizsys.runtime.util.Conditions;

public class SearchFieldCondHelper {

	private ISearchGroupCondBase iSearchGroupCondBase = null;
	private String strFieldName = null;
	public SearchFieldCondHelper(ISearchGroupCondBase iSearchGroupCondBase, String strFieldName) {
		this.iSearchGroupCondBase = iSearchGroupCondBase;
		this.strFieldName = strFieldName;
	}
	
	/**
	 * 指定属性值等于条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase eq(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.EQ, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值不等于条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase ne(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.NOTEQ, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值大于条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase gt(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.GT, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值大于等于条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase gte(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.GTANDEQ, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值小于条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase lt(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.LT, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值小于等于条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase lte(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.LTANDEQ, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值匹配条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase like(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.LIKE, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值左侧匹配条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase ll(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.LEFTLIKE, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值右侧匹配条件值
	 * @param strFieldName
	 */
	public ISearchGroupCondBase rl(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.RIGHTLIKE, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值为空
	 * @param strFieldName
	 */
	public ISearchGroupCondBase nvl(String strFieldName) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.ISNULL, null);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值不为空
	 * @param strFieldName
	 */
	public ISearchGroupCondBase nn(String strFieldName) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.ISNOTNULL, null);
		return this.iSearchGroupCondBase;
	}

	/**
	 * 指定属性值在值范围中
	 * @param strFieldName
	 */
	public ISearchGroupCondBase in(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.IN, objValue);
		return this.iSearchGroupCondBase;
	}
	
	/**
	 * 指定属性值不在值范围中
	 * @param strFieldName
	 */
	public ISearchGroupCondBase ni(Object objValue) {
		this.iSearchGroupCondBase.setFieldCond(strFieldName, Conditions.NOTIN, objValue);
		return this.iSearchGroupCondBase;
	}
	
}
