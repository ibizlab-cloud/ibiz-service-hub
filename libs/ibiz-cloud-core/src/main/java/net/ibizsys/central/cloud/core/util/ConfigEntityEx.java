package net.ibizsys.central.cloud.core.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.JsonUtils;

public class ConfigEntityEx extends ConfigEntity implements IConfigEntityEx{

	public ConfigEntityEx(Map<String, Object> config) {
		super(config);
	}

	public ConfigEntityEx(String strContent) {
		super(strContent);
	}
	
	public ConfigEntityEx(Map<String, Object> config, boolean bOrigin) {
		super(config, bOrigin);
	}

	public ConfigEntityEx(String strContent, boolean bOrigin) {
		super(strContent, bOrigin);
	}
	
	public ConfigEntityEx(Object object) {
		this(JsonUtils.asMap(object));
	}
	
	public ConfigEntityEx(Object object, boolean bOrigin) {
		this(JsonUtils.asMap(object), bOrigin);
	}
	

	@Override
	public void set(String strName, Object objValue) {
		Assert.hasLength(strName, "传入键名无效");

		if(objValue instanceof Map) {
			load(strName, (Map)objValue);
		}
		else {
			super.set(strName, objValue);
		}
		
		if(this.isRemoveHyphen()) {
			String strName2 = strName.replace("-", "");
			if(!strName.equals(strName2) && StringUtils.hasLength(strName2)) {
				if(objValue instanceof Map) {
					load(strName2, (Map)objValue);
				}
				else {
					super.set(strName2, objValue);
				}
			}
		}
	}

	protected void load(String strPKey, Map<String, Object> map) {
		for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			String strKey = null;
			if (StringUtils.hasLength(strPKey)) {
				strKey = String.format("%1$s.%2$s", strPKey, entry.getKey());
			} else {
				strKey = entry.getKey();
			}
			if(this.isLowerCaseName()) {
				strKey = strKey.toLowerCase();
			}
			set(strKey, entry.getValue());
		}
	}

	

	@Override
	public void setParams(String strPKey, Map<String, Object> params) {
		this.load(strPKey, params);
	}


	@Override
	public Map<String, Object> getParams(String strPKey, Map<String, Object> params) {
		
		Map<String, Object> any = this.any();
		if(any!=null) {
			
			String strPKeyPrefix = (strPKey + ".");
			if(this.isLowerCaseName()) {
				strPKeyPrefix = strPKeyPrefix.toLowerCase();
			}
			int nPKeyLength = strPKeyPrefix.length();
			
			Map<String, Object> paramMap = new LinkedHashMap<String, Object>();
			paramMap.putAll(any);
			
			for (java.util.Map.Entry<String, Object> entry : paramMap.entrySet()) {
				int nPos = entry.getKey().indexOf(strPKeyPrefix);
				if (nPos != 0) {
					continue;
				}
				String strKey = entry.getKey().substring(nPKeyLength);
				if (params == null) {
					params = new LinkedHashMap<>();
				}
				params.put(strKey, entry.getValue());
			}
		}
		
		return params;
	}


	@Override
	public void removeParams(String strPKey) {
		Map<String, Object> params = this.getParams(strPKey, null);
		if(!ObjectUtils.isEmpty(params)) {
			this.removeParams(params.keySet());
		}
	}
	
	@Override
	public void removeParams(Set<String> keys) {
		Assert.notEmpty(keys, "传入键名集合为空");
		for(String strKey : keys) {
			this.reset(strKey);
		}
	}
}
