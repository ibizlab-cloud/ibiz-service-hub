package net.ibizsys.runtime.util;

import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * JsonObject功能对象
 * @author lionlau
 * @deprecated 后续使用  net.ibizsys.runtime.util.JsonUtils 替换
 *
 */
public class ObjectNodeUtils {

	/**
	 * 填充 属性配置对象
	 * @param objectNode
	 * @param properties
	 * @param strFieldPrefix 指定属性前缀，设置到属性集合中的属性将去除前缀
	 */
	public static Properties fillProperties(ObjectNode objectNode, Properties properties, String strFieldPrefix) {
		java.util.Iterator<Entry<String, JsonNode>> fields = objectNode.fields();
		if(fields != null) {
			while(fields.hasNext()) {
				Entry<String, JsonNode> entry = fields.next();
				String strKey = entry.getKey();
				if(StringUtils.hasLength(strFieldPrefix)) {
					if(strKey.indexOf(strFieldPrefix) != 0) {
						continue;
					}
					strKey = strKey.substring(strFieldPrefix.length());
				}
				if(properties == null) {
					properties = new Properties();
				}
				properties.put(strKey, entry.getValue().textValue());
			}
		}
		return properties;
	}
	
	/**
	 * 获取指定属性字符串值
	 * @param objectNode
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	public static String getFieldValue(ObjectNode objectNode, String strKey, String strDefault) {
		JsonNode node = objectNode.get(strKey);
		if(node != null) {
			return node.asText(strDefault);
		}
		return strDefault;
	}

	/**
	 * 获取指定属性整数值
	 * @param objectNode
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	public static int getFieldValue(ObjectNode objectNode, String strKey, int nDefault) {
		JsonNode node = objectNode.get(strKey);
		if(node != null) {
			return node.asInt(nDefault);
		}
		return nDefault;
	}
	
	/**
	 * 获取指定属性长整数值
	 * @param objectNode
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	public static long getFieldValue(ObjectNode objectNode, String strKey, long nDefault) {
		JsonNode node = objectNode.get(strKey);
		if(node != null) {
			return node.asLong(nDefault);
		}
		return nDefault;
	}
	
	/**
	 * 获取指定属性浮点值
	 * @param objectNode
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	public static double getFieldValue(ObjectNode objectNode, String strKey, double fDefault) {
		JsonNode node = objectNode.get(strKey);
		if(node != null) {
			return node.asDouble(fDefault);
		}
		return fDefault;
	}
}
