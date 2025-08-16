package net.ibizsys.central.cloud.core.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 配置数据数据对象
 * @author lionlau
 *
 */
public class ConfigEntity extends EntityBase implements IConfigEntity {

	private boolean bOrigin = false;
	
	public ConfigEntity(String strContent) {
		this(strContent, false);
	}
	
	public ConfigEntity(Map<String, Object> config) {
		this(config, false);
	}
	
	public ConfigEntity(String strContent, boolean bOrigin) {
		this.bOrigin = bOrigin;
		if(StringUtils.hasLength(strContent)) {
			//判断内容形式
			Map<String, Object> config = null;
			if(strContent.indexOf("{") == 0) {
				config = JsonUtils.MAPPER.convertValue(strContent, Map.class);
			}
			else {
				Yaml yaml = new Yaml();
				config = yaml.loadAs(strContent, Map.class);
			}
			if(config != null) {
				this.putAll(config);
				//进一步处理属性，去除中划线
				if(isRemoveHyphen()) {
					for (java.util.Map.Entry<String, Object> item : config.entrySet()) {
						String strKey = item.getKey().replace("-", "");
						if(strKey.equals(item.getKey())) {
							continue;
						}
						set(strKey, item.getValue());
					}
				}
			}
		}
	}
	
	public ConfigEntity(Map<String, Object> config, boolean bOrigin) {
		this.bOrigin = bOrigin;
		if(!ObjectUtils.isEmpty(config)) {
			this.putAll(config);
			//进一步处理属性，去除中划线
			if(isRemoveHyphen()) {
				for (java.util.Map.Entry<String, Object> item : config.entrySet()) {
					String strKey = item.getKey().replace("-", "");
					if(strKey.equals(item.getKey())) {
						continue;
					}
					set(strKey, item.getValue());
				}
			}
		}
	}
	
	
	@Override
	public Timestamp getTimestamp(String strName, Timestamp def) {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public BigDecimal getBigDecimal(String strName, BigDecimal fDefault) {
		try {
			return DataTypeUtils.getBigDecimalValue(this.get(strName), fDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public BigInteger getBigInteger(String strName, BigInteger nDefault) {
		try {
			return DataTypeUtils.getBigIntegerValue(this.get(strName), nDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Boolean getBoolean(String strName, Boolean def) {
		try {
			return DataTypeUtils.getBooleanValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Double getDouble(String strName, Double def) {
		try {
			return DataTypeUtils.getDoubleValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Float getFloat(String strName, Float def) {
		try {
			return DataTypeUtils.getFloatValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public Integer getInteger(String strName, Integer def) {
		try {
			return DataTypeUtils.getIntegerValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	

	@Override
	public Long getLong(String strName, Long def) {
		try {
			return DataTypeUtils.getLongValue(this.get(strName), def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public String getString(String strName, String strDefault) {
		try {
			return DataTypeUtils.getStringValue(this.get(strName), strDefault);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}


	@Override
	public Object get(String strName, Object def) {
		Object value = this.get(strName);
		if(value == null) {
			if(isRemoveHyphen()) {
				String strName2 = strName.replace("-", "");
				if(!strName2.equals(strName)) {
					 value = this.get(strName2);
					 if(value != null) {
						 return value;
					 }
				}
			}
			return def;
		}
		return value;
	}
	
	
	@Override
	protected boolean isLowerCaseName() {
		return !this.bOrigin;
	}
	
	/**
	 * 移除中划线
	 * @return
	 */
	protected boolean isRemoveHyphen() {
		return !this.bOrigin;
	}

	
}
