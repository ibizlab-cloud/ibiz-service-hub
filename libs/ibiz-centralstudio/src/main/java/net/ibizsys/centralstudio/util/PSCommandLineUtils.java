package net.ibizsys.centralstudio.util;

import java.util.Map;

import org.springframework.util.StringUtils;

public class PSCommandLineUtils {

	public void parse(Map<String, String> argMap, String... args) {
		
		String strKey = null;

		for (int i = 0; i < args.length; i++) {
			if (StringUtils.hasLength(strKey)) {
				argMap.put(strKey, args[i]);
				strKey = null;
			} else {

				if (!argMap.containsKey(args[i])) {
					strKey = args[i];
				} else {
					// 放入内容
					argMap.put("", args[i]);
				}
			}
		}
		
		for(java.util.Map.Entry<String, String> entry : argMap.entrySet()) {
			String strValue = entry.getValue();
			if(!StringUtils.hasLength(strValue)) {
				continue;
			}
			
			try {
				strValue = new String(java.util.Base64.getDecoder().decode(strValue));
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			argMap.put(entry.getKey(), strValue);
		}
		
		
	}
}
