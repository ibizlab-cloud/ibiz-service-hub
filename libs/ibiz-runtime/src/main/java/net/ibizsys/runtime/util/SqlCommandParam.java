package net.ibizsys.runtime.util;

import java.util.Collection;

/**
 * Sql命令参数对象
 * @author lionlau
 *
 */
public class SqlCommandParam {

	private Collection<SqlParam> valueList = null;
	private Collection<SqlParam> conditionList = null;

	public SqlCommandParam(Collection<SqlParam> valueList, Collection<SqlParam> conditionList) {
		this.valueList = valueList;
		this.conditionList = conditionList;
	}
	
	
	public SqlCommandParam(Collection<SqlParam> valueList) {
		this.valueList = valueList;
	}
	
	
	public Collection<SqlParam> getValues(){
		return this.valueList;
	}
	
	
	public Collection<SqlParam> getConditions(){
		return this.conditionList;
	}
	 
	
}
