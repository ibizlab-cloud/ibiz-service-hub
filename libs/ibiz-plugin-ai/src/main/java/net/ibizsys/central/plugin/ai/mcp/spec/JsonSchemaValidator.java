/*
 * Copyright 2024-2024 the original author or authors.
 */

//package net.ibizsys.central.plugin.ai.mcp.spec;
//
//import java.util.Map;
//
///**
// * Interface for validating structured content against a JSON schema. This interface
// * defines a method to validate structured content based on the provided output schema.
// *
// * @author Christian Tzolov
// */
//public interface JsonSchemaValidator {
//
//	/**
//	 * Represents the result of a validation operation.
//	 *
//	 * @param valid Indicates whether the validation was successful.
//	 * @param errorMessage An error message if the validation failed, otherwise null.
//	 * @param jsonStructuredOutput The text structured content in JSON format if the
//	 * validation was successful, otherwise null.
//	 */
//	public record ValidationResponse(boolean valid, String errorMessage, String jsonStructuredOutput) {
//
//		public static ValidationResponse asValid(String jsonStructuredOutput) {
//			return new ValidationResponse(true, null, jsonStructuredOutput);
//		}
//
//		public static ValidationResponse asInvalid(String message) {
//			return new ValidationResponse(false, message, null);
//		}
//	}
//
//	/**
//	 * Validates the structured content against the provided JSON schema.
//	 * @param schema The JSON schema to validate against.
//	 * @param structuredContent The structured content to validate.
//	 * @return A ValidationResponse indicating whether the validation was successful or
//	 * not.
//	 */
//	ValidationResponse validate(Map<String, Object> schema, Map<String, Object> structuredContent);
//
//}
package net.ibizsys.central.plugin.ai.mcp.spec;

import java.util.Map;
import java.util.Objects;

/**
 * Interface for validating structured content against a JSON schema.
 * 
 * @author Christian Tzolov
 */
public interface JsonSchemaValidator {

    /**
     * Represents the result of a validation operation (JDK 8 compatible implementation).
     */
    final class ValidationResponse {
        private final boolean valid;
        private final String errorMessage;
        private final String jsonStructuredOutput;

        // 全参数构造器
        public ValidationResponse(boolean valid, String errorMessage, String jsonStructuredOutput) {
            this.valid = valid;
            this.errorMessage = errorMessage;
            this.jsonStructuredOutput = jsonStructuredOutput;
        }

        // 静态工厂方法：验证成功
        public static ValidationResponse asValid(String jsonStructuredOutput) {
            return new ValidationResponse(true, null, jsonStructuredOutput);
        }

        // 静态工厂方法：验证失败
        public static ValidationResponse asInvalid(String message) {
            return new ValidationResponse(false, message, null);
        }

        // Getter 方法（方法名与原始 record 的访问器一致）
        public boolean valid() {
            return valid;
        }

        public String errorMessage() {
            return errorMessage;
        }

        public String jsonStructuredOutput() {
            return jsonStructuredOutput;
        }

        // 手动实现 equals 和 hashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ValidationResponse that = (ValidationResponse) o;
            return valid == that.valid &&
                   Objects.equals(errorMessage, that.errorMessage) &&
                   Objects.equals(jsonStructuredOutput, that.jsonStructuredOutput);
        }

        @Override
        public int hashCode() {
            return Objects.hash(valid, errorMessage, jsonStructuredOutput);
        }

        // 手动实现 toString
        @Override
        public String toString() {
            return "ValidationResponse{" +
                   "valid=" + valid +
                   ", errorMessage='" + errorMessage + '\'' +
                   ", jsonStructuredOutput='" + jsonStructuredOutput + '\'' +
                   '}';
        }
    }

    /**
     * Validates structured content against a JSON schema.
     * 
     * @param schema JSON schema to validate against
     * @param structuredContent Content to validate
     * @return Validation result
     */
    ValidationResponse validate(Map<String, Object> schema, Map<String, Object> structuredContent);
}