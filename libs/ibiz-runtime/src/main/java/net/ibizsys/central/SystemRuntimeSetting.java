package net.ibizsys.central;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统运行时设置
 * 
 * @author lionlau
 *
 */
public class SystemRuntimeSetting implements ISystemRuntimeSetting {

	private static final Log log = LogFactory.getLog(SystemRuntimeSetting.class);
	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private Map<String, Object> paramMap = new ConcurrentHashMap<String, Object>();

	public SystemRuntimeSetting(ISystemRuntimeContext iSystemRuntimeContext, Map<String, Object> map) {
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		if (map != null) {
			reload(map);
		}
	}

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	protected ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntime();
	}

	protected void reload(Map<String, Object> map) {
		this.paramMap.clear();
		this.load("", map, true);
	}

	protected void load(String strPKey, Map<String, Object> map, boolean bOverwrite) {
		for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
			String strKey = null;
			if (StringUtils.hasLength(strPKey)) {
				strKey = String.format("%1$s.%2$s", strPKey, entry.getKey()).toLowerCase();
			} else {
				strKey = entry.getKey().toLowerCase();
			}
			if (entry.getValue() instanceof Map) {
				load(strKey, (Map) entry.getValue(), bOverwrite);
			} else {
				if (!bOverwrite) {
					if(containsParam(strKey)) {
						continue;
					}
				}
				setParam(strKey, entry.getValue());
			}
		}
	}

	@Override
	public void setParams(String strPKey, Map<String, Object> params) {
		this.load(strPKey, params, true);
	}

	@Override
	public void setParamsIf(String strPKey, Map<String, Object> params) {
		this.load(strPKey, params, false);
	}

	@Override
	public String getDEActionCodeNameFormat() {

		return null;
	}

	@Override
	public String getDEDataSetCodeNameFormat() {
		return "Fetch%1$s";
	}

	@Override
	public boolean isDTOFieldNameLowerCase() {
		return true;
	}

	@Override
	public void setParam(String strKey, Object objValue) {
		Assert.hasLength(strKey, "传入键名为空");
		if (objValue != null) {
			this.paramMap.put(strKey.toLowerCase(), objValue);
		} else {
			this.paramMap.remove(strKey.toLowerCase());
		}

	}

	@Override
	public String getParam(String strKey, String strDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			if (objValue instanceof String) {
				if (!ObjectUtils.isEmpty(objValue)) {
					return (String) objValue;
				}
			} else {
				return objValue.toString();
			}
		}
		return strDefault;
	}
	
	

	@Override
	public int getParam(String strKey, int nDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			try {
				return DataTypeUtils.getIntegerValue(objValue, nDefault);
			} catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取运行配置[%1$s]发生异常，%2$s", strKey, ex.getMessage()), ex);
			}
		}
		return nDefault;
	}

	@Override
	public long getParam(String strKey, long nDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			try {
				return DataTypeUtils.getLongValue(objValue, nDefault);
			} catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取运行配置[%1$s]发生异常，%2$s", strKey, ex.getMessage()), ex);
			}
		}
		return nDefault;
	}
	

	@Override
	public double getParam(String strKey, double fDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			try {
				return DataTypeUtils.getDoubleValue(objValue, fDefault);
			} catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取运行配置[%1$s]发生异常，%2$s", strKey, ex.getMessage()), ex);
			}
		}
		return fDefault;
	}
	
	@Override
	public boolean getParam(String strKey, boolean bDefault) {
		Object objValue = this.getParam(strKey);
		if (objValue != null) {
			try {
				return DataTypeUtils.getBooleanValue(objValue, bDefault);
			} catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), String.format("获取运行配置[%1$s]发生异常，%2$s", strKey, ex.getMessage()), ex);
			}
		}
		return bDefault;
	}
	

	@Override
	public Object getParam(String strKey) {
		Assert.hasLength(strKey, "传入键名为空");
		return this.paramMap.get(strKey.toLowerCase());
	}

	@Override
	public boolean containsParam(String strKey) {
		Assert.hasLength(strKey, "传入键名为空");
		return this.paramMap.containsKey(strKey.toLowerCase());
	}

	@Override
	public Map<String, Object> getParams(String strPKey, Map<String, Object> params) {
		String strPKeyPrefix = (strPKey + ".").toLowerCase();
		int nPKeyLength = strPKeyPrefix.length();
		for (java.util.Map.Entry<String, Object> entry : this.paramMap.entrySet()) {
			int nPos = entry.getKey().indexOf(strPKeyPrefix);
			if (nPos != 0) {
				continue;
			}
			String strKey = entry.getKey().substring(nPKeyLength);
			if (params == null) {
				params = new HashMap<>();
			}
			params.put(strKey, entry.getValue());
		}
		return params;
	}

	@Override
	public void removeParam(String strKey) {
		Assert.hasLength(strKey, "传入键名为空");
		this.paramMap.remove(strKey.toLowerCase());
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
			this.removeParam(strKey);
		}
	}

	@Override
	public String getEnableAPIs() {
		return this.getParam(PARAM_ENABLEAPIS, null);
	}
	

}
