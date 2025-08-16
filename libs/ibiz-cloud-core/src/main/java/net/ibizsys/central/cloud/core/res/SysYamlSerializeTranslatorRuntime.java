package net.ibizsys.central.cloud.core.res;

import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import net.ibizsys.central.res.SysTranslatorRuntimeBase;

/**
 * 系统Yaml序列化转换器运行时对象，仅支持MAP形式
 * 
 * @author lionlau
 *
 */
public class SysYamlSerializeTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysYamlSerializeTranslatorRuntime.class);
	private static final Yaml yaml = new Yaml();

	@Override
	protected Object onTranslate(Object objValue, boolean bIn) throws Throwable {
		if (objValue == null) {
			return null;
		}
		if (bIn) {
			Map map = null;
			if (objValue instanceof Map) {
				map = (Map) objValue;
			} else {
				objValue = this.getSystemRuntime().serialize(objValue);
				map = this.getSystemRuntime().deserialize(objValue, Map.class);
			}

			return yaml.dumpAsMap(map);
		}
		else {
			String strValue = null;
			if (objValue instanceof String) {
				strValue = (String) objValue;
			} else {
				strValue = objValue.toString();
			}	
			return yaml.loadAs(strValue, Map.class);
		}
	}
}
