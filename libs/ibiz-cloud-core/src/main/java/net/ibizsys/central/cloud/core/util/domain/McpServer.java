package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * McpServer数据对象
 * 
 */
public class McpServer extends EntityBase {

	/**
	 * AI应用标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * AI应用
	 */
	public final static String FIELD_NAME = "name";

	/**
	 *  McpServer类型
	 */
	public final static String FIELD_TYPE = "type";

	/**
	 * AccessKey(AppId)
	 */
	public final static String FIELD_ACCESSKEY = "accesskey";

	/**
	 * SecretKey(AppSecret)
	*/
	public final static String FIELD_SECRETKEY = "secretkey";

	/**
	 * RegionId
	 */
	public final static String FIELD_REGIONID = "regionid";

	/**
	 * 管理账号token
	 */
	public final static String FIELD_ACCESSTOKEN = "accesstoken";

	/**
	 * 管理账号token过期时间
	  */
	public final static String FIELD_EXPIRESTIME = "expirestime";



	/**
	 * EmbeddingUrl
	 */
	public final static String FIELD_EMBEDDINGURL = "embeddingurl";

	/**
	 * ProxyUrl
	 */
	public final static String FIELD_PROXYURL = "proxyurl";
	
	
	/**
	 * ServiceUrl
	 */
	public final static String FIELD_SERVICEURL = "serviceurl";
	
	
	
	/**
	 * Model
	 */
	public final static String FIELD_MODEL = "model";
	
	
	/**
	 * Embedding Model
	 */
	public final static String FIELD_EMBEDDINGMODEL = "embeddingmodel";
	
	
	/**
	 * 启用工具
	 */
	public final static String FIELD_TOOLS = "tools";
	
	
	/**
	 * 是否禁用
	 */
	public final static String FIELD_DISABLED = "disabled";
	
	
	/**
	 * 取值范围: [.0f, 1.0f]。 多样性，越高，多样性越好
	 */
	public final static String FIELD_TEMPERATURE = "temperature";
	
	
	public final static String FIELD_MAXTOKENS = "maxtokens";
	
	
	/**
	 * 流模式： true, false, auto
	 */
	public final static String FIELD_STREAM = "stream";
	
	/**
	 * 思考模式： true, false, auto
	 */
	public final static String FIELD_THINK = "think";
	
	
	/**
	 * 移除Think内容: all;input;output
	 */
	public final static String FIELD_REMOVETHINK = "removethink";
	
	
	
	
	/**
	 * 设置「AI应用标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「AI应用标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「AI应用标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「AI应用标识」
	 *
	 */
	@JsonIgnore
	public McpServer resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「AI应用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「AI应用」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「AI应用」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「AI应用」
	 *
	 */
	@JsonIgnore
	public McpServer resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「McpServer类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「McpServer类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「McpServer类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「McpServer类型」
	 *
	 */
	@JsonIgnore
	public McpServer resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	/**
	 * 设置「AccessKey(AppId)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setAccessKey(String val) {
		this.set(FIELD_ACCESSKEY, val);
		return this;
	}

	/**
	 * 获取「AccessKey(AppId)」值
	 *
	 */
	@JsonIgnore
	public String getAccessKey() {
		return (String) this.get(FIELD_ACCESSKEY);
	}

	/**
	 * 判断 「AccessKey(AppId)」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessKey() {
		return this.contains(FIELD_ACCESSKEY);
	}

	/**
	 * 重置 「AccessKey(AppId)」
	 *
	 */
	@JsonIgnore
	public McpServer resetAccessKey() {
		this.reset(FIELD_ACCESSKEY);
		return this;
	}

	/**
	 * 设置「SecretKey(AppSecret)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setSecretKey(String val) {
		this.set(FIELD_SECRETKEY, val);
		return this;
	}

	/**
	 * 获取「SecretKey(AppSecret)」值
	 *
	 */
	@JsonIgnore
	public String getSecretKey() {
		return (String) this.get(FIELD_SECRETKEY);
	}

	/**
	 * 判断 「SecretKey(AppSecret)」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSecretKey() {
		return this.contains(FIELD_SECRETKEY);
	}

	/**
	 * 重置 「SecretKey(AppSecret)」
	 *
	 */
	@JsonIgnore
	public McpServer resetSecretKey() {
		this.reset(FIELD_SECRETKEY);
		return this;
	}

	/**
	 * 设置「RegionId」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setRegionId(String val) {
		this.set(FIELD_REGIONID, val);
		return this;
	}

	/**
	 * 获取「RegionId」值
	 *
	 */
	@JsonIgnore
	public String getRegionId() {
		return (String) this.get(FIELD_REGIONID);
	}

	/**
	 * 判断 「RegionId」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRegionId() {
		return this.contains(FIELD_REGIONID);
	}

	/**
	 * 重置 「RegionId」
	 *
	 */
	@JsonIgnore
	public McpServer resetRegionId() {
		this.reset(FIELD_REGIONID);
		return this;
	}

	/**
	 * 设置「管理账号token」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setAccessToken(String val) {
		this.set(FIELD_ACCESSTOKEN, val);
		return this;
	}

	/**
	 * 获取「管理账号token」值
	 *
	 */
	@JsonIgnore
	public String getAccessToken() {
		return (String) this.get(FIELD_ACCESSTOKEN);
	}

	/**
	 * 判断 「管理账号token」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessToken() {
		return this.contains(FIELD_ACCESSTOKEN);
	}

	/**
	 * 重置 「管理账号token」
	 *
	 */
	@JsonIgnore
	public McpServer resetAccessToken() {
		this.reset(FIELD_ACCESSTOKEN);
		return this;
	}

	/**
	 * 设置「管理账号token过期时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setExpiresTime(Timestamp val) {
		this.set(FIELD_EXPIRESTIME, val);
		return this;
	}

	/**
	 * 获取「管理账号token过期时间」值
	 *
	 */
	@JsonIgnore
	public Timestamp getExpiresTime() {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(FIELD_EXPIRESTIME), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「管理账号token过期时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsExpiresTime() {
		return this.contains(FIELD_EXPIRESTIME);
	}

	/**
	 * 重置 「管理账号token过期时间」
	 *
	 */
	@JsonIgnore
	public McpServer resetExpiresTime() {
		this.reset(FIELD_EXPIRESTIME);
		return this;
	}

	

	/**
	 * 设置「EmbeddingUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setEmbeddingUrl(String val) {
		this.set(FIELD_EMBEDDINGURL, val);
		return this;
	}

	/**
	 * 获取「EmbeddingUrl」值
	 *
	 */
	@JsonIgnore
	public String getEmbeddingUrl() {
		return (String) this.get(FIELD_EMBEDDINGURL);
	}

	/**
	 * 判断 「EmbeddingUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEmbeddingUrl() {
		return this.contains(FIELD_EMBEDDINGURL);
	}

	/**
	 * 重置 「EmbeddingUrl」
	 *
	 */
	@JsonIgnore
	public McpServer resetEmbeddingUrl() {
		this.reset(FIELD_EMBEDDINGURL);
		return this;
	}

	
	
	/**
	 * 设置「ProxyUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setProxyUrl(String val) {
		this.set(FIELD_PROXYURL, val);
		return this;
	}

	/**
	 * 获取「ProxyUrl」值
	 *
	 */
	@JsonIgnore
	public String getProxyUrl() {
		return (String) this.get(FIELD_PROXYURL);
	}

	/**
	 * 判断 「ProxyUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsProxyUrl() {
		return this.contains(FIELD_PROXYURL);
	}

	/**
	 * 重置 「ProxyUrl」
	 *
	 */
	@JsonIgnore
	public McpServer resetProxyUrl() {
		this.reset(FIELD_PROXYURL);
		return this;
	}
	

	/**
	 * 设置「ServiceUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setServiceUrl(String val) {
		this.set(FIELD_SERVICEURL, val);
		return this;
	}

	/**
	 * 获取「ServiceUrl」值
	 *
	 */
	@JsonIgnore
	public String getServiceUrl() {
		return (String) this.get(FIELD_SERVICEURL);
	}

	/**
	 * 判断 「ServiceUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsServiceUrl() {
		return this.contains(FIELD_SERVICEURL);
	}

	/**
	 * 重置 「ServiceUrl」
	 *
	 */
	@JsonIgnore
	public McpServer resetServiceUrl() {
		this.reset(FIELD_SERVICEURL);
		return this;
	}
	
	

	
	

	/**
	 * 设置「Model」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setModel(String val) {
		this.set(FIELD_MODEL, val);
		return this;
	}

	/**
	 * 获取「Model」值
	 *
	 */
	@JsonIgnore
	public String getModel() {
		return (String) this.get(FIELD_MODEL);
	}

	/**
	 * 判断 「Model」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsModel() {
		return this.contains(FIELD_MODEL);
	}

	/**
	 * 重置 「Model」
	 *
	 */
	@JsonIgnore
	public McpServer resetModel() {
		this.reset(FIELD_MODEL);
		return this;
	}
	
	/**
	 * 设置「EmbeddingModel」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setEmbeddingModel(String val) {
		this.set(FIELD_EMBEDDINGMODEL, val);
		return this;
	}

	/**
	 * 获取「EmbeddingModel」值
	 *
	 */
	@JsonIgnore
	public String getEmbeddingModel() {
		return (String) this.get(FIELD_EMBEDDINGMODEL);
	}

	/**
	 * 判断 「EmbeddingModel」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEmbeddingModel() {
		return this.contains(FIELD_EMBEDDINGMODEL);
	}

	/**
	 * 重置 「EmbeddingModel」
	 *
	 */
	@JsonIgnore
	public McpServer resetEmbeddingModel() {
		this.reset(FIELD_EMBEDDINGMODEL);
		return this;
	}
	
	
	/**
	 * 设置「Tools」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setTools(Boolean val) {
		this.set(FIELD_TOOLS, val);
		return this;
	}

	/**
	 * 获取「Tools」值
	 *
	 */
	@JsonIgnore
	public String getTools() {
		return DataTypeUtils.asString(this.get(FIELD_TOOLS), null);
	}

	/**
	 * 判断 「Tools」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTools() {
		return this.contains(FIELD_TOOLS);
	}

	/**
	 * 重置 「Tools」
	 *
	 */
	@JsonIgnore
	public McpServer resetTools() {
		this.reset(FIELD_TOOLS);
		return this;
	}
	
	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setDisabled(Integer val) {
		this.set(FIELD_DISABLED, val);
		return this;
	}

	/**
	 * 获取「是否禁用」值
	 *
	 */
	@JsonIgnore
	public Integer getDisabled() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_DISABLED), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「是否禁用」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDisabled() {
		return this.contains(FIELD_DISABLED);
	}

	/**
	 * 重置 「是否禁用」
	 *
	 */
	@JsonIgnore
	public McpServer resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}
	
	
    /**
     * 设置「多样性参数」
     *
     * @param val
    */
    @JsonIgnore
    public McpServer setTemperature(Float val) {
        this.set(FIELD_TEMPERATURE, val);
        return this;
    }

    /**
     * 获取「多样性参数」值
     *
    */
    @JsonIgnore
    public Float getTemperature() {
        try{
            return DataTypeUtils.getFloatValue(this.get(FIELD_TEMPERATURE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「多样性参数」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTemperature() {
        return this.contains(FIELD_TEMPERATURE);
    }

    /**
     * 重置 「多样性参数」
     *
    */
    @JsonIgnore
    public McpServer resetTemperature() {
        this.reset(FIELD_TEMPERATURE);
        return this;
    }
    
    /**
	 * 设置「最大词量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setMaxTokens(Integer val) {
		this.set(FIELD_MAXTOKENS, val);
		return this;
	}

	/**
	 * 获取「最大词量」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXTOKENS), null);
	}

	/**
	 * 判断 「最大词量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxTokens() {
		return this.contains(FIELD_MAXTOKENS);
	}

	/**
	 * 重置 「最大词量」
	 *
	 */
	@JsonIgnore
	public McpServer resetMaxTokens() {
		this.reset(FIELD_MAXTOKENS);
		return this;
	}
	
	
	/**
	 * 设置「Stream」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setStream(String val) {
		this.set(FIELD_STREAM, val);
		return this;
	}

	/**
	 * 获取「Stream」值
	 *
	 */
	@JsonIgnore
	public String getStream() {
		return DataTypeUtils.asString(this.get(FIELD_STREAM), null);
	}

	/**
	 * 判断 「Stream」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsStream() {
		return this.contains(FIELD_STREAM);
	}

	/**
	 * 重置 「Stream」
	 *
	 */
	@JsonIgnore
	public McpServer resetStream() {
		this.reset(FIELD_STREAM);
		return this;
	}
	
	
	/**
	 * 设置「RemoveThink」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setRemoveThink(String val) {
		this.set(FIELD_REMOVETHINK, val);
		return this;
	}

	/**
	 * 获取「RemoveThink」值
	 *
	 */
	@JsonIgnore
	public String getRemoveThink() {
		return DataTypeUtils.asString(this.get(FIELD_REMOVETHINK), null);
	}

	/**
	 * 判断 「RemoveThink」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRemoveThink() {
		return this.contains(FIELD_REMOVETHINK);
	}

	/**
	 * 重置 「RemoveThink」
	 *
	 */
	@JsonIgnore
	public McpServer resetRemoveThink() {
		this.reset(FIELD_REMOVETHINK);
		return this;
	}
	
	
	
	/**
	 * 设置「Think」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setThink(String val) {
		this.set(FIELD_THINK, val);
		return this;
	}

	/**
	 * 获取「Think」值
	 *
	 */
	@JsonIgnore
	public String getThink() {
		return DataTypeUtils.asString(this.get(FIELD_THINK), null);
	}

	/**
	 * 判断 「Think」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsThink() {
		return this.contains(FIELD_THINK);
	}

	/**
	 * 重置 「Think」
	 *
	 */
	@JsonIgnore
	public McpServer resetThink() {
		this.reset(FIELD_THINK);
		return this;
	}
	
}
