package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 运行测试结果
 * @author lionlau
 *
 */
public class RunTestResult extends EntityBase {

	public final static String FIELD_NAME = "name";
    public final static String FIELD_TESTS_FOUND_COUNT = "tests_found_count";
    public final static String FIELD_TESTS_SUCCEEDED_COUNT = "tests_succeeded_count";
    public final static String FIELD_TESTS_FAILED_COUNT = "tests_failed_count";
    public final static String FIELD_TESTS_SKIPPED_COUNT = "tests_skipped_count";
    public final static String FIELD_FAILURES = "failures";

    
    @JsonProperty(FIELD_NAME)
    public RunTestResult setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return (String) this.get(FIELD_NAME);
    }

    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    @JsonIgnore
    public RunTestResult resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    // ---------- tests_found_count ----------
    @JsonProperty(FIELD_TESTS_FOUND_COUNT)
    public RunTestResult setTestsFoundCount(Integer val) {
        this.set(FIELD_TESTS_FOUND_COUNT, val);
        return this;
    }

    @JsonIgnore
    public Integer getTestsFoundCount() {
      	return DataTypeUtils.asInteger(this.get(FIELD_TESTS_FOUND_COUNT), 0);
    }

    @JsonIgnore
    public boolean containsTestsFoundCount() {
        return this.contains(FIELD_TESTS_FOUND_COUNT);
    }

    @JsonIgnore
    public RunTestResult resetTestsFoundCount() {
        this.reset(FIELD_TESTS_FOUND_COUNT);
        return this;
    }

    // ---------- tests_succeeded_count ----------
    @JsonProperty(FIELD_TESTS_SUCCEEDED_COUNT)
    public RunTestResult setTestsSucceededCount(Integer val) {
        this.set(FIELD_TESTS_SUCCEEDED_COUNT, val);
        return this;
    }

    @JsonIgnore
    public Integer getTestsSucceededCount() {
    	return DataTypeUtils.asInteger(this.get(FIELD_TESTS_SUCCEEDED_COUNT), 0);
    }

    @JsonIgnore
    public boolean containsTestsSucceededCount() {
        return this.contains(FIELD_TESTS_SUCCEEDED_COUNT);
    }

    @JsonIgnore
    public RunTestResult resetTestsSucceededCount() {
        this.reset(FIELD_TESTS_SUCCEEDED_COUNT);
        return this;
    }

    // ---------- tests_failed_count ----------
    @JsonProperty(FIELD_TESTS_FAILED_COUNT)
    public RunTestResult setTestsFailedCount(Integer val) {
        this.set(FIELD_TESTS_FAILED_COUNT, val);
        return this;
    }

    @JsonIgnore
    public Integer getTestsFailedCount() {
        Integer val = (Integer) this.get(FIELD_TESTS_FAILED_COUNT);
        return val != null ? val : 0;
    }

    @JsonIgnore
    public boolean containsTestsFailedCount() {
        return this.contains(FIELD_TESTS_FAILED_COUNT);
    }

    @JsonIgnore
    public RunTestResult resetTestsFailedCount() {
        this.reset(FIELD_TESTS_FAILED_COUNT);
        return this;
    }

    // ---------- tests_skipped_count ----------
    @JsonProperty(FIELD_TESTS_SKIPPED_COUNT)
    public RunTestResult setTestsSkippedCount(Integer val) {
        this.set(FIELD_TESTS_SKIPPED_COUNT, val);
        return this;
    }

    @JsonIgnore
    public Integer getTestsSkippedCount() {
    	return DataTypeUtils.asInteger(this.get(FIELD_TESTS_SKIPPED_COUNT), 0);
    }

    @JsonIgnore
    public boolean containsTestsSkippedCount() {
        return this.contains(FIELD_TESTS_SKIPPED_COUNT);
    }

    @JsonIgnore
    public RunTestResult resetTestsSkippedCount() {
        this.reset(FIELD_TESTS_SKIPPED_COUNT);
        return this;
    }

    // ---------- failures ----------
    @SuppressWarnings("unchecked")
    @JsonProperty(FIELD_FAILURES)
    public RunTestResult setFailures(List<Map<String, Object>> val) {
        this.set(FIELD_FAILURES, val);
        return this;
    }

    @JsonIgnore
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> getFailures() {
        return (List<Map<String, Object>>) this.get(FIELD_FAILURES);
    }

    @JsonIgnore
    public boolean containsFailures() {
        return this.contains(FIELD_FAILURES);
    }

    @JsonIgnore
    public RunTestResult resetFailures() {
        this.reset(FIELD_FAILURES);
        return this;
    }

}