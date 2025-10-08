package net.ibizsys.runtime.util;

import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class YamlUtils {
	
	private static Yaml YAML = new Yaml();
	
	public static Yaml getYaml() {
		return YamlUtils.YAML;
	}
	
	public static void setYaml(Yaml yaml) {
		if(yaml != null) {
			YamlUtils.YAML = yaml;
		}
		else {
			YamlUtils.YAML = new Yaml();
		}
	}

	
	public static String toString(Map map) {
		try {
			return getYaml().dumpAsMap(map);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	public static Map asMap(String obj) {
		return getYaml().loadAs(obj, Map.class);
	}
}
