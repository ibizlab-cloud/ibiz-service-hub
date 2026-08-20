package net.ibizsys.runtime.util;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonUtils {

	/**
	 * public 是为了兼容早期代码
	 */
	public static ObjectMapper MAPPER = new ObjectMapper();

	public static ObjectMapper getMapper() {
		return JsonUtils.MAPPER;
	}

	public static void setMapper(ObjectMapper mapper) {
		if (mapper != null) {
			JsonUtils.MAPPER = mapper;
		} else {
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
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static JsonNode toJsonNode(Object obj) {
		try {
			if (obj instanceof String) {
				return getMapper().readTree((String) obj);
			}
			if (obj instanceof File) {
				return getMapper().readTree((File) obj);
			}
			if (obj instanceof InputStream) {
				return getMapper().readTree((InputStream) obj);
			}
			return getMapper().convertValue(obj, JsonNode.class);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static ArrayNode toArrayNode(Object obj) {
		try {
			if (obj instanceof String) {
				return (ArrayNode) getMapper().readTree((String) obj);
			}
			if (obj instanceof File) {
				return (ArrayNode) getMapper().readTree((File) obj);
			}
			if (obj instanceof InputStream) {
				return (ArrayNode) getMapper().readTree((InputStream) obj);
			}

			return getMapper().convertValue(obj, ArrayNode.class);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static ObjectNode toObjectNode(Object obj) {
		try {
			if (obj instanceof String) {
				return (ObjectNode) getMapper().readTree((String) obj);
			}
			if (obj instanceof File) {
				return (ObjectNode) getMapper().readTree((File) obj);
			}
			if (obj instanceof InputStream) {
				return (ObjectNode) getMapper().readTree((InputStream) obj);
			}

			return getMapper().convertValue(obj, ObjectNode.class);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static Map asMap(Object obj) {
		return as(obj, Map.class);
	}

	public static IEntity asEntity(Object obj) {
		return as(obj, Entity.class);
	}

	public static List asList(Object obj) {
		return as(obj, List.class);
	}

	public static <T> T as(Object obj, Class<T> cls) {
		try {
			if (obj instanceof String) {
				return getMapper().readValue((String) obj, cls);
			}
			if (obj instanceof File) {
				return as(getMapper().readTree((File) obj), cls);
			}
			if (obj instanceof InputStream) {
				return as(getMapper().readTree((InputStream) obj), cls);
			}
			return getMapper().convertValue(obj, cls);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static <T> T as(Object obj, TypeReference<T> cls) {
		try {
			if (obj instanceof String) {
				return getMapper().readValue((String) obj, cls);
			}
			if (obj instanceof File) {
				return as(getMapper().readTree((File) obj), cls);
			}
			if (obj instanceof InputStream) {
				return as(getMapper().readTree((InputStream) obj), cls);
			}
			return getMapper().convertValue(obj, cls);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	// public static String getField(ObjectNode objectNode, String fieldName,
	// String defaultValue) {
	//
	// if(objectNode == null) {
	// return defaultValue;
	// }
	//
	// JsonNode jsonNode = objectNode.get(fieldName);
	// if(jsonNode == null) {
	// return defaultValue;
	// }
	// return jsonNode.asText(defaultValue);
	// }
	//
	// public static boolean getField(ObjectNode objectNode, String fieldName,
	// boolean defaultValue) {
	//
	// if(objectNode == null) {
	// return defaultValue;
	// }
	//
	// JsonNode jsonNode = objectNode.get(fieldName);
	// if(jsonNode == null) {
	// return defaultValue;
	// }
	//
	// if(jsonNode.isBoolean()) {
	// return jsonNode.asBoolean(defaultValue);
	// }
	//
	// return DataTypeUtils.getBooleanValue(jsonNode.asText(), defaultValue);
	//
	//
	// }
	//
	// public static long getField(ObjectNode objectNode, String fieldName, long
	// defaultValue) {
	//
	// if(objectNode == null) {
	// return defaultValue;
	// }
	//
	// JsonNode jsonNode = objectNode.get(fieldName);
	// if(jsonNode == null) {
	// return defaultValue;
	// }
	// return jsonNode.asLong(defaultValue);
	// }
	//
	// public static double getField(ObjectNode objectNode, String fieldName,
	// double defaultValue) {
	//
	// if(objectNode == null) {
	// return defaultValue;
	// }
	//
	// JsonNode jsonNode = objectNode.get(fieldName);
	// if(jsonNode == null) {
	// return defaultValue;
	// }
	// return jsonNode.asDouble(defaultValue);
	// }
	//
	// public static int getField(ObjectNode objectNode, String fieldName, int
	// defaultValue) {
	//
	// if(objectNode == null) {
	// return defaultValue;
	// }
	//
	// JsonNode jsonNode = objectNode.get(fieldName);
	// if(jsonNode == null) {
	// return defaultValue;
	// }
	// return jsonNode.asInt(defaultValue);
	// }

	public static String getField(ObjectNode objectNode, String fieldName, String defaultValue) {
		return getField(objectNode, fieldName, false, defaultValue);
	}

	public static boolean getField(ObjectNode objectNode, String fieldName, boolean defaultValue) {
		return getField(objectNode, fieldName, false, defaultValue);
	}

	public static long getField(ObjectNode objectNode, String fieldName, long defaultValue) {
		return getField(objectNode, fieldName, false, defaultValue);
	}

	public static double getField(ObjectNode objectNode, String fieldName, double defaultValue) {
		return getField(objectNode, fieldName, false, defaultValue);
	}

	public static int getField(ObjectNode objectNode, String fieldName, int defaultValue) {
		return getField(objectNode, fieldName, false, defaultValue);
	}

	public static String getField(ObjectNode objectNode, String fieldName, boolean normalize, String defaultValue) {
		if (objectNode == null)
			return defaultValue;
		JsonNode jsonNode = findField(objectNode, fieldName, normalize);
		return jsonNode == null ? defaultValue : jsonNode.asText(defaultValue);
	}

	public static boolean getField(ObjectNode objectNode, String fieldName, boolean normalize, boolean defaultValue) {
		if (objectNode == null)
			return defaultValue;
		JsonNode jsonNode = findField(objectNode, fieldName, normalize);
		if (jsonNode == null)
			return defaultValue;
		if (jsonNode.isBoolean()) {
			return jsonNode.asBoolean(defaultValue);
		}
		return DataTypeUtils.getBooleanValue(jsonNode.asText(), defaultValue);
	}

	public static long getField(ObjectNode objectNode, String fieldName, boolean normalize, long defaultValue) {
		if (objectNode == null)
			return defaultValue;
		JsonNode jsonNode = findField(objectNode, fieldName, normalize);
		return jsonNode == null ? defaultValue : jsonNode.asLong(defaultValue);
	}

	public static double getField(ObjectNode objectNode, String fieldName, boolean normalize, double defaultValue) {
		if (objectNode == null)
			return defaultValue;
		JsonNode jsonNode = findField(objectNode, fieldName, normalize);
		return jsonNode == null ? defaultValue : jsonNode.asDouble(defaultValue);
	}

	public static int getField(ObjectNode objectNode, String fieldName, boolean normalize, int defaultValue) {
		if (objectNode == null)
			return defaultValue;
		JsonNode jsonNode = findField(objectNode, fieldName, normalize);
		return jsonNode == null ? defaultValue : jsonNode.asInt(defaultValue);
	}

	private static JsonNode findField(ObjectNode objectNode, String fieldName, boolean normalize) {
		if (fieldName == null)
			return null;

		// 1. 精确匹配（始终优先）
		JsonNode node = objectNode.get(fieldName);
		if (node != null)
			return node;

		// 2. 如果启用归一化，则进行模糊匹配
		if (normalize) {
			Iterator<Map.Entry<String, JsonNode>> fields = objectNode.fields();
			if(fields != null) {
				String normalizedTarget = normalizeFieldName(fieldName);
				while (fields.hasNext()) {
					Map.Entry<String, JsonNode> entry = fields.next();
					String key = entry.getKey();
					if(fieldName.equalsIgnoreCase(key)) {
						//优先大小写
						return entry.getValue();
					}
					String normalizedKey = normalizeFieldName(key);
					if (normalizedKey.equals(normalizedTarget)) {
						return entry.getValue();
					}
				}
			}
		}
		return null;
	}

	/**
	 * 归一化：转为小写，并移除 '-' 和 '_'
	 */
	private static String normalizeFieldName(String str) {
		if (str == null)
			return null;
		return str.replace("-", "").replace("_", "").toLowerCase();
	}

	/**
	 * 填充 属性配置对象
	 * 
	 * @param objectNode
	 * @param properties
	 * @param strFieldPrefix
	 *            指定属性前缀，设置到属性集合中的属性将去除前缀
	 */
	public static Properties fillProperties(ObjectNode objectNode, Properties properties, String strFieldPrefix) {
		java.util.Iterator<Entry<String, JsonNode>> fields = objectNode.fields();
		if (fields != null) {
			while (fields.hasNext()) {
				Entry<String, JsonNode> entry = fields.next();
				String strKey = entry.getKey();
				if (StringUtils.hasLength(strFieldPrefix)) {
					if (strKey.indexOf(strFieldPrefix) != 0) {
						continue;
					}
					strKey = strKey.substring(strFieldPrefix.length());
				}
				if (properties == null) {
					properties = new Properties();
				}
				properties.put(strKey, entry.getValue().textValue());
			}
		}
		return properties;
	}
}
