package net.ibizsys.central.cloud.core.app.util;

import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 应用模板功能对象
 * @author lionlau
 *
 */
public class AppTemplateUtils {

	/**
	 * 进行Url编码
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public String encodeUrl(String value) throws Exception {
		return java.net.URLEncoder.encode(value, "utf-8");
	}
	
	/**
	 * 进行Url解码
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public String decodeUrl(String value) throws Exception {
		return java.net.URLDecoder.decode(value, "utf-8");
	}
	
	
	/**
	 * 生成唯一标识
	 * @param args
	 * @return
	 */
	public String uniqueid(Object... args) {
		if (args != null && args.length > 0) {
			return KeyValueUtils.genUniqueId(args);
		}
		return KeyValueUtils.genUniqueId();
	}
}
