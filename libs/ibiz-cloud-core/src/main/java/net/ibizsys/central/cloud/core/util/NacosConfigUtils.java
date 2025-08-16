package net.ibizsys.central.cloud.core.util;

import org.springframework.util.StringUtils;

import com.alibaba.nacos.client.config.utils.ParamUtils;

public class NacosConfigUtils {

	public static String getDataId(String strDataId) {
		if(!StringUtils.hasLength(strDataId)) {
			return strDataId;
		}
		if(ParamUtils.isValid(strDataId)) {
			return strDataId;
		}
		
		String strNewDataId = "";
        int length = strDataId.length();
        
        for (int i = 0; i < length ; i++) {
        	String strPart = strDataId.substring(i, i + 1);
        	if(ParamUtils.isValid(strPart)) {
        		strNewDataId += strPart;
        	}
        	else {
        		//strNewDataId += strPart;
        	
        	}
        }
        return strNewDataId;
	}
	
}
