package net.ibizsys.central.testing;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

public class TestCaseRunResult extends EntityBase{

	public final static String STATUS_PASS = "PASS";
	
	public final static String STATUS_FAILURE = "FAILURE";
	
	public final static String STATUS_BLOCKING = "BLOCKING";
	
	public final static String FIELD_STATUS = "status";
	
	public final static String FIELD_RESULTS = "results";
	
	public final static String FIELD_TAGS = "tags";
	
	public final static String FIELD_DESCRIPTION = "description";

	public final static String FIELD_REMARK = "remark";
	
	public final static String FIELD_ACTUALRESULT = "actualresult";
	
	public final static String FIELD_RESULTS_INPUTTAG = "inputtag";
	
	public final static String FIELD_RESULTS_ACTUALRESULT = "actualresult";
	
	public final static String FIELD_RESULTS_EXECUTERESULT = "executeresult";
	
	public final static String FIELD_TYPE = "type";
	
	public final static String FIELD_DENAME = "dename";
	
	public final static String FIELD_DEACTIONNAME = "deactionname";
	
	public final static String FIELD_TESTCASETAG = "testcasetag";
	
	
	/**
	 * 设置「状态」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setStatus(String val) {
		this.set(FIELD_STATUS, val);

	}

	/**
	 * 获取「状态」值
	 *
	 */
	@JsonIgnore
	public String getStatus() {
		return (String) this.get(FIELD_STATUS);
	}

	/**
	 * 判断 「状态」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsStatus() {
		return this.contains(FIELD_STATUS);
	}

	/**
	 * 重置 「状态」
	 *
	 */
	@JsonIgnore
	public void resetStatus() {
		this.reset(FIELD_STATUS);

	}
	
	
	/**
	 * 设置「结果集合」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setResults(String val) {
		this.set(FIELD_RESULTS, val);

	}

	/**
	 * 获取「结果集合」值
	 *
	 */
	@JsonIgnore
	public String getResults() {
		return (String) this.get(FIELD_RESULTS);
	}

	/**
	 * 判断 「结果集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsResults() {
		return this.contains(FIELD_RESULTS);
	}

	/**
	 * 重置 「结果集合」
	 *
	 */
	@JsonIgnore
	public void resetResults() {
		this.reset(FIELD_RESULTS);

	}
	
	
	/**
	 * 设置「标记集合」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setTags(String val) {
		this.set(FIELD_TAGS, val);

	}

	/**
	 * 获取「标记集合」值
	 *
	 */
	@JsonIgnore
	public String getTags() {
		return (String) this.get(FIELD_TAGS);
	}

	/**
	 * 判断 「标记集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTags() {
		return this.contains(FIELD_TAGS);
	}

	/**
	 * 重置 「标记集合」
	 *
	 */
	@JsonIgnore
	public void resetTags() {
		this.reset(FIELD_TAGS);

	}
	
	/**
	 * 设置「描述」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setDescription(String val) {
		this.set(FIELD_DESCRIPTION, val);

	}

	/**
	 * 获取「描述」值
	 *
	 */
	@JsonIgnore
	public String getDescription() {
		return (String) this.get(FIELD_DESCRIPTION);
	}

	/**
	 * 判断 「描述」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDescription() {
		return this.contains(FIELD_DESCRIPTION);
	}

	/**
	 * 重置 「描述」
	 *
	 */
	@JsonIgnore
	public void resetDescription() {
		this.reset(FIELD_DESCRIPTION);

	}

	

	/**
	 * 设置「备注」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setRemark(String val) {
		this.set(FIELD_REMARK, val);

	}

	/**
	 * 获取「备注」值
	 *
	 */
	@JsonIgnore
	public String getRemark() {
		return (String) this.get(FIELD_REMARK);
	}

	/**
	 * 判断 「备注」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRemark() {
		return this.contains(FIELD_REMARK);
	}

	/**
	 * 重置 「备注」
	 *
	 */
	@JsonIgnore
	public void resetRemark() {
		this.reset(FIELD_REMARK);

	}
	
	
	
	/**
	 * 设置「实际结果」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setActualResult(String val) {
		this.set(FIELD_ACTUALRESULT, val);

	}

	/**
	 * 获取「实际结果」值
	 *
	 */
	@JsonIgnore
	public String getActualResult() {
		return (String) this.get(FIELD_ACTUALRESULT);
	}

	/**
	 * 判断 「实际结果」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsActualResult() {
		return this.contains(FIELD_ACTUALRESULT);
	}

	/**
	 * 重置 「实际结果」
	 *
	 */
	@JsonIgnore
	public void resetActualResult() {
		this.reset(FIELD_ACTUALRESULT);

	}
	
	
	/**
	 * 设置「类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setType(String val) {
		this.set(FIELD_TYPE, val);

	}

	/**
	 * 获取「类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「类型」
	 *
	 */
	@JsonIgnore
	public void resetType() {
		this.reset(FIELD_TYPE);

	}

	
	
	/**
	 * 设置「实体名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setDEName(String val) {
		this.set(FIELD_DENAME, val);

	}

	/**
	 * 获取「实体名称」值
	 *
	 */
	@JsonIgnore
	public String getDEName() {
		return (String) this.get(FIELD_DENAME);
	}

	/**
	 * 判断 「实体名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDEName() {
		return this.contains(FIELD_DENAME);
	}

	/**
	 * 重置 「实体名称」
	 *
	 */
	@JsonIgnore
	public void resetDEName() {
		this.reset(FIELD_DENAME);

	}
	
	
	/**
	 * 设置「实体行为标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setDEActionName(String val) {
		this.set(FIELD_DEACTIONNAME, val);

	}

	/**
	 * 获取「实体行为标识」值
	 *
	 */
	@JsonIgnore
	public String getDEActionName() {
		return (String) this.get(FIELD_DEACTIONNAME);
	}

	/**
	 * 判断 「实体行为标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDEActionName() {
		return this.contains(FIELD_DEACTIONNAME);
	}

	/**
	 * 重置 「实体行为标识」
	 *
	 */
	@JsonIgnore
	public void resetDEActionName() {
		this.reset(FIELD_DEACTIONNAME);

	}
	
	
	
	/**
	 * 设置「测试用例标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setTestCaseTag(String val) {
		this.set(FIELD_TESTCASETAG, val);

	}

	/**
	 * 获取「测试用例标识」值
	 *
	 */
	@JsonIgnore
	public String getTestCaseTag() {
		return (String) this.get(FIELD_TESTCASETAG);
	}

	/**
	 * 判断 「测试用例标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTestCaseTag() {
		return this.contains(FIELD_TESTCASETAG);
	}

	/**
	 * 重置 「测试用例标识」
	 *
	 */
	@JsonIgnore
	public void resetTestCaseTag() {
		this.reset(FIELD_TESTCASETAG);

	}
}
