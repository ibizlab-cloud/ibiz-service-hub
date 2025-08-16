package net.ibizsys.model.util;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonUtils {
	
	public static ObjectMapper MAPPER = new ObjectMapper();
	
	public static ObjectMapper getMapper() {
		return JsonUtils.MAPPER;
	}
	
	public static void setMapper(ObjectMapper mapper) {
		if(mapper != null) {
			JsonUtils.MAPPER = mapper;
		}
		else {
			JsonUtils.MAPPER = new ObjectMapper();
		}
	}
	
	public static ObjectNode createObjectNode() {
		return getMapper().createObjectNode();
	}
	
	public static ArrayNode createArrayNode() {
		return getMapper().createArrayNode();
	}
	
	public static String toString(Object obj) {
		try {
			return getMapper().writeValueAsString(obj);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static JsonNode toJsonNode(Object obj) {
		try {
			if(obj instanceof String) {
				return getMapper().readTree((String)obj);
			}
			if(obj instanceof File) {
				return getMapper().readTree((File)obj);
			}
			return getMapper().convertValue(obj, JsonNode.class);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static ArrayNode toArrayNode(Object obj) {
		try {
			if(obj instanceof String) {
				return (ArrayNode)getMapper().readTree((String)obj);
			}
			if(obj instanceof File) {
				return (ArrayNode)getMapper().readTree((File)obj);
			}
			
			return getMapper().convertValue(obj, ArrayNode.class);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static ObjectNode toObjectNode(Object obj) {
		try {
			if(obj instanceof String) {
				return (ObjectNode)getMapper().readTree((String)obj);
			}
			if(obj instanceof File) {
				return (ObjectNode)getMapper().readTree((File)obj);
			}
			
			return getMapper().convertValue(obj, ObjectNode.class);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	public static Map asMap(Object obj) {
		return as(obj, Map.class);
	}
	
//	public static IEntity asEntity(Object obj) {
//		return as(obj, Entity.class);
//	}
	
	public static List asList(Object obj) {
		return as(obj, List.class);
	}
	
	
	public static <T> T as(Object obj, Class<T> cls) {
		try {
			if(obj instanceof String) {
				return getMapper().readValue((String) obj, cls);
			}
			if(obj instanceof File) {
				return as(getMapper().readTree((File)obj), cls);
			}
			return getMapper().convertValue(obj, cls);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	public static String getField(ObjectNode objectNode, String fieldName, String defaultValue) {
		
		if(objectNode == null) {
			return defaultValue;
		}
		
		JsonNode jsonNode = objectNode.get(fieldName);
		if(jsonNode == null) {
			return defaultValue;
		}
		return jsonNode.asText(defaultValue);
	}
	
	public static boolean getField(ObjectNode objectNode, String fieldName, boolean defaultValue) {
		
		if(objectNode == null) {
			return defaultValue;
		}
		
		JsonNode jsonNode = objectNode.get(fieldName);
		if(jsonNode == null) {
			return defaultValue;
		}
		
		if(jsonNode.isBoolean()) {
			return jsonNode.asBoolean(defaultValue);
		}
		
		return DataTypeUtils.getBooleanValue(jsonNode.asText(), defaultValue);
		
		
	}
	
	public static long getField(ObjectNode objectNode, String fieldName, long defaultValue) {
		
		if(objectNode == null) {
			return defaultValue;
		}
		
		JsonNode jsonNode = objectNode.get(fieldName);
		if(jsonNode == null) {
			return defaultValue;
		}
		return jsonNode.asLong(defaultValue);
	}
	
	public static double getField(ObjectNode objectNode, String fieldName, double defaultValue) {
		
		if(objectNode == null) {
			return defaultValue;
		}
		
		JsonNode jsonNode = objectNode.get(fieldName);
		if(jsonNode == null) {
			return defaultValue;
		}
		return jsonNode.asDouble(defaultValue);
	}
	
	public static int getField(ObjectNode objectNode, String fieldName, int defaultValue) {
		
		if(objectNode == null) {
			return defaultValue;
		}
		
		JsonNode jsonNode = objectNode.get(fieldName);
		if(jsonNode == null) {
			return defaultValue;
		}
		return jsonNode.asInt(defaultValue);
	}
	
	
}
