package net.ibizsys.runtime.util;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlUtils {
	
	private static XmlMapper XMLMAPPER = new XmlMapper();
	
	public static XmlMapper getXmlMapper() {
		return XmlUtils.XMLMAPPER;
	}
	
	public static void setXmlMapper(XmlMapper mapper) {
		if(mapper != null) {
			XmlUtils.XMLMAPPER = mapper;
		}
		else {
			XmlUtils.XMLMAPPER = new XmlMapper();
		}
	}
	
	public static String toString(Object obj) {
		try {
			return getXmlMapper().writeValueAsString(obj);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	
	public static JsonNode toJsonNode(Object obj) {
		try {
			if(obj instanceof String) {
				return getXmlMapper().readTree((String)obj);
			}
			if(obj instanceof File) {
				return getXmlMapper().readTree((File)obj);
			}
			return getXmlMapper().convertValue(obj, JsonNode.class);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static ArrayNode toArrayNode(Object obj) {
		try {
			if(obj instanceof String) {
				return (ArrayNode)getXmlMapper().readTree((String)obj);
			}
			if(obj instanceof File) {
				return (ArrayNode)getXmlMapper().readTree((File)obj);
			}
			
			return getXmlMapper().convertValue(obj, ArrayNode.class);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static ObjectNode toObjectNode(Object obj) {
		try {
			if(obj instanceof String) {
				return (ObjectNode)getXmlMapper().readTree((String)obj);
			}
			if(obj instanceof File) {
				return (ObjectNode)getXmlMapper().readTree((File)obj);
			}
			
			return getXmlMapper().convertValue(obj, ObjectNode.class);
		}
		catch (Exception ex) {
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
			if(obj instanceof String) {
				return getXmlMapper().readValue((String) obj, cls);
			}
			if(obj instanceof File) {
				return as(getXmlMapper().readTree((File)obj), cls);
			}
			return getXmlMapper().convertValue(obj, cls);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static <T> T as(Object obj, TypeReference<T> cls) {
		try {
			if(obj instanceof String) {
				return getXmlMapper().readValue((String) obj, cls);
			}
			if(obj instanceof File) {
				return as(getXmlMapper().readTree((File)obj), cls);
			}
			return getXmlMapper().convertValue(obj, cls);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
}
