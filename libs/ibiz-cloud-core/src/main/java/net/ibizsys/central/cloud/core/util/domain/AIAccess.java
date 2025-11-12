package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * AI应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/.ibizmodel.index
 */
public class AIAccess extends EntityBase {

	/**
	 * AI应用标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * AI应用
	 */
	public final static String FIELD_NAME = "name";

	/**
	 *  AI应用类型
	 */
	public final static String FIELD_AITYPE = "aitype";

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
	 * 嵌入访问token
	 */
	public final static String FIELD_EMBEDDINGTOKEN = "embeddingtoken";
	

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
	 * McpServer集合
	 */
	public final static String FIELD_MCPSERVERS = "mcpservers";
	
	/**
	 * 最大的工具调用次数
	 */
	public final static String FIELD_TOOLMAXCALLS = "toolmaxcalls";
	
	
	/**
	 * 工具调用超出提示信息
	 */
	public final static String FIELD_TOOLEXCEEDMESSAGE = "toolexceedmessage";
	
	
	/**
	 * 工具调用步骤，1：发送步骤，2：发送步骤并返回成功结果
	 */
	public final static String FIELD_TOOLCALLSTEP = "toolcallstep";
	
	
	/**
	 * 平行工具调用
	 */
	public final static String FIELD_PARALLELTOOLCALL = "paralleltoolcall";
	
	
	/**
	 * 思考预算
	 */
	public final static String FIELD_THINKBUDGET = "thinkbudget";
	
	/**
	 * 最大输入词数
	 */
	public final static String FIELD_MAXINPUTTOKENS = "maxinputtokens";
	
	
	/**
	 * 凭证标识
	 */
	public final static String FIELD_CREDENTIALID = "credentialid";
	
	/**
	 * 扩展参数
	 */
	public final static String FIELD_EXTRAPARAMS = "extraparams";
	
	/**
	 * 文本排序 Model
	 */
	public final static String FIELD_TEXTRERANKMODEL = "textrerankmodel";
	
	/**
	 * 文本排序Url
	 */
	public final static String FIELD_TEXTRERANKURL = "textrerankurl";
	
	
	/**
	 * 工具调用步骤：禁用
	 */
	public final static int TOOLCALLSTEP_DISABLED = 0;
	
	/**
	 * 工具调用步骤：启用
	 */
	public final static int TOOLCALLSTEP_ENABLED = 1;
	
	/**
	 * 工具调用步骤：启动返回成功结果
	 */
	public final static int TOOLCALLSTEP_RESULT = 2;
	
	

	
	/**
	 * 设置「AI应用标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setId(String val) {
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
	public AIAccess resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「AI应用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setName(String val) {
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
	public AIAccess resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「AI应用类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setAIType(String val) {
		this.set(FIELD_AITYPE, val);
		return this;
	}

	/**
	 * 获取「AI应用类型」值
	 *
	 */
	@JsonIgnore
	public String getAIType() {
		return (String) this.get(FIELD_AITYPE);
	}

	/**
	 * 判断 「AI应用类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAIType() {
		return this.contains(FIELD_AITYPE);
	}

	/**
	 * 重置 「AI应用类型」
	 *
	 */
	@JsonIgnore
	public AIAccess resetAIType() {
		this.reset(FIELD_AITYPE);
		return this;
	}

	/**
	 * 设置「AccessKey(AppId)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setAccessKey(String val) {
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
	public AIAccess resetAccessKey() {
		this.reset(FIELD_ACCESSKEY);
		return this;
	}

	/**
	 * 设置「SecretKey(AppSecret)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setSecretKey(String val) {
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
	public AIAccess resetSecretKey() {
		this.reset(FIELD_SECRETKEY);
		return this;
	}

	/**
	 * 设置「RegionId」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setRegionId(String val) {
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
	public AIAccess resetRegionId() {
		this.reset(FIELD_REGIONID);
		return this;
	}

	/**
	 * 设置「管理账号token」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setAccessToken(String val) {
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
	public AIAccess resetAccessToken() {
		this.reset(FIELD_ACCESSTOKEN);
		return this;
	}

	/**
	 * 设置「管理账号token过期时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setExpiresTime(Timestamp val) {
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
	public AIAccess resetExpiresTime() {
		this.reset(FIELD_EXPIRESTIME);
		return this;
	}

	

	/**
	 * 设置「EmbeddingUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setEmbeddingUrl(String val) {
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
	public AIAccess resetEmbeddingUrl() {
		this.reset(FIELD_EMBEDDINGURL);
		return this;
	}

	
	
	/**
	 * 设置「EmbeddingToken」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setEmbeddingToken(String val) {
		this.set(FIELD_EMBEDDINGTOKEN, val);
		return this;
	}

	/**
	 * 获取「EmbeddingToken」值
	 *
	 */
	@JsonIgnore
	public String getEmbeddingToken() {
		return (String) this.get(FIELD_EMBEDDINGTOKEN);
	}

	/**
	 * 判断 「EmbeddingToken」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEmbeddingToken() {
		return this.contains(FIELD_EMBEDDINGTOKEN);
	}

	/**
	 * 重置 「EmbeddingToken」
	 *
	 */
	@JsonIgnore
	public AIAccess resetEmbeddingToken() {
		this.reset(FIELD_EMBEDDINGTOKEN);
		return this;
	}
	
	
	
	/**
	 * 设置「ProxyUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setProxyUrl(String val) {
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
	public AIAccess resetProxyUrl() {
		this.reset(FIELD_PROXYURL);
		return this;
	}
	

	/**
	 * 设置「ServiceUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setServiceUrl(String val) {
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
	public AIAccess resetServiceUrl() {
		this.reset(FIELD_SERVICEURL);
		return this;
	}
	
	
	/**
	 * 设置「Model」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setModel(String val) {
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
	public AIAccess resetModel() {
		this.reset(FIELD_MODEL);
		return this;
	}
	
	/**
	 * 设置「EmbeddingModel」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setEmbeddingModel(String val) {
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
	public AIAccess resetEmbeddingModel() {
		this.reset(FIELD_EMBEDDINGMODEL);
		return this;
	}
	
	
	/**
	 * 设置「TextReRankModel」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setTextReRankModel(String val) {
		this.set(FIELD_TEXTRERANKMODEL, val);
		return this;
	}

	/**
	 * 获取「TextReRankModel」值
	 *
	 */
	@JsonIgnore
	public String getTextReRankModel() {
		return (String) this.get(FIELD_TEXTRERANKMODEL);
	}

	/**
	 * 判断 「TextReRankModel」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTextReRankModel() {
		return this.contains(FIELD_TEXTRERANKMODEL);
	}

	/**
	 * 重置 「TextReRankModel」
	 *
	 */
	@JsonIgnore
	public AIAccess resetTextReRankModel() {
		this.reset(FIELD_TEXTRERANKMODEL);
		return this;
	}
	
	
	/**
	 * 设置「Tools」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setTools(Boolean val) {
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
	public AIAccess resetTools() {
		this.reset(FIELD_TOOLS);
		return this;
	}
	
	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setDisabled(Integer val) {
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
	public AIAccess resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}
	
	
    /**
     * 设置「多样性参数」
     *
     * @param val
    */
    @JsonIgnore
    public AIAccess setTemperature(Float val) {
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
    public AIAccess resetTemperature() {
        this.reset(FIELD_TEMPERATURE);
        return this;
    }
    
    /**
	 * 设置「最大词量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setMaxTokens(Integer val) {
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
	public AIAccess resetMaxTokens() {
		this.reset(FIELD_MAXTOKENS);
		return this;
	}
	
	
	/**
	 * 设置「Stream」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setStream(String val) {
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
	public AIAccess resetStream() {
		this.reset(FIELD_STREAM);
		return this;
	}
	
	
	/**
	 * 设置「RemoveThink」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setRemoveThink(String val) {
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
	public AIAccess resetRemoveThink() {
		this.reset(FIELD_REMOVETHINK);
		return this;
	}
	
	
	
	/**
	 * 设置「Think」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setThink(String val) {
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
	public AIAccess resetThink() {
		this.reset(FIELD_THINK);
		return this;
	}
	
	
	
	/**
	 * 设置「McpServers」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setMcpServers(List<String> val) {
		this.set(FIELD_MCPSERVERS, val);
		return this;
	}

	/**
	 * 获取「McpServers」值
	 *
	 */
	@JsonIgnore
	public List<String> getMcpServers() {
		Object objValue = this.get(FIELD_MCPSERVERS);
		if (objValue == null) {
			return null;
		}
		
		if(objValue instanceof String) {
			List list = Arrays.asList(objValue.toString().split("[,]"));
			this.set(FIELD_MCPSERVERS, list);
			return list;
		}
		
		return (List<String>) objValue;
	}

	/**
	 * 判断 「McpServers」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMcpServers() {
		return this.contains(FIELD_MCPSERVERS);
	}

	/**
	 * 重置 「McpServers」
	 *
	 */
	@JsonIgnore
	public AIAccess resetMcpServers() {
		this.reset(FIELD_MCPSERVERS);
		return this;
	}
	
	
	/**
	 * 设置「ToolMaxCalls」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setToolMaxCalls(String val) {
		this.set(FIELD_TOOLMAXCALLS, val);
		return this;
	}

	/**
	 * 获取「ToolMaxCalls」值
	 *
	 */
	@JsonIgnore
	public String getToolMaxCalls() {
		return DataTypeUtils.asString(this.get(FIELD_TOOLMAXCALLS), null);
	}

	/**
	 * 判断 「ToolMaxCalls」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsToolMaxCalls() {
		return this.contains(FIELD_TOOLMAXCALLS);
	}

	/**
	 * 重置 「ToolMaxCalls」
	 *
	 */
	@JsonIgnore
	public AIAccess resetToolMaxCalls() {
		this.reset(FIELD_TOOLMAXCALLS);
		return this;
	}
	
	
	/**
	 * 设置「ToolExceedMessages」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setToolExceedMessages(String val) {
		this.set(FIELD_TOOLEXCEEDMESSAGE, val);
		return this;
	}

	/**
	 * 获取「ToolExceedMessages」值
	 *
	 */
	@JsonIgnore
	public String getToolExceedMessages() {
		return DataTypeUtils.asString(this.get(FIELD_TOOLEXCEEDMESSAGE), null);
	}

	/**
	 * 判断 「ToolExceedMessages」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsToolExceedMessages() {
		return this.contains(FIELD_TOOLEXCEEDMESSAGE);
	}

	/**
	 * 重置 「ToolExceedMessages」
	 *
	 */
	@JsonIgnore
	public AIAccess resetToolExceedMessages() {
		this.reset(FIELD_TOOLEXCEEDMESSAGE);
		return this;
	}
	
	
	/**
	 * 设置「ToolCallStep」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setToolCallStep(String val) {
		this.set(FIELD_TOOLCALLSTEP, val);
		return this;
	}

	/**
	 * 获取「ToolCallStep」值
	 *
	 */
	@JsonIgnore
	public String getToolCallStep() {
		return DataTypeUtils.asString(this.get(FIELD_TOOLCALLSTEP), null);
	}

	/**
	 * 判断 「ToolCallStep」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsToolCallStep() {
		return this.contains(FIELD_TOOLCALLSTEP);
	}

	/**
	 * 重置 「ToolCallStep」
	 *
	 */
	@JsonIgnore
	public AIAccess resetToolCallStep() {
		this.reset(FIELD_TOOLCALLSTEP);
		return this;
	}
	
	
	/**
	 * 设置「ParallelToolCall」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setParallelToolCall(String val) {
		this.set(FIELD_PARALLELTOOLCALL, val);
		return this;
	}

	/**
	 * 获取「ParallelToolCall」值
	 *
	 */
	@JsonIgnore
	public String getParallelToolCall() {
		return DataTypeUtils.asString(this.get(FIELD_PARALLELTOOLCALL), null);
	}

	/**
	 * 判断 「ParallelToolCall」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsParallelToolCall() {
		return this.contains(FIELD_PARALLELTOOLCALL);
	}

	/**
	 * 重置 「ParallelToolCall」
	 *
	 */
	@JsonIgnore
	public AIAccess resetParallelToolCall() {
		this.reset(FIELD_PARALLELTOOLCALL);
		return this;
	}
	
	
    /**
	 * 设置「思考预算」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setThinkBudget(Integer val) {
		this.set(FIELD_THINKBUDGET, val);
		return this;
	}

	/**
	 * 获取「思考预算」值
	 *
	 */
	@JsonIgnore
	public Integer getThinkBudget() {
		return DataTypeUtils.asInteger(this.get(FIELD_THINKBUDGET), null);
	}

	/**
	 * 判断 「思考预算」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsThinkBudget() {
		return this.contains(FIELD_THINKBUDGET);
	}

	/**
	 * 重置 「思考预算」
	 *
	 */
	@JsonIgnore
	public AIAccess resetThinkBudget() {
		this.reset(FIELD_THINKBUDGET);
		return this;
	}
	
	
    /**
	 * 设置「最大输入词量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setMaxInputTokens(Integer val) {
		this.set(FIELD_MAXINPUTTOKENS, val);
		return this;
	}

	/**
	 * 获取「最大输入词量」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxInputTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXINPUTTOKENS), null);
	}

	/**
	 * 判断 「最大输入词量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxInputTokens() {
		return this.contains(FIELD_MAXINPUTTOKENS);
	}

	/**
	 * 重置 「最大输入词量」
	 *
	 */
	@JsonIgnore
	public AIAccess resetMaxInputTokens() {
		this.reset(FIELD_MAXINPUTTOKENS);
		return this;
	}
	
	
	/**
	 * 设置「CredentialId」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setCredentialId(String val) {
		this.set(FIELD_CREDENTIALID, val);
		return this;
	}

	/**
	 * 获取「CredentialId」值
	 *
	 */
	@JsonIgnore
	public String getCredentialId() {
		return (String) this.get(FIELD_CREDENTIALID);
	}

	/**
	 * 判断 「CredentialId」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCredentialId() {
		return this.contains(FIELD_CREDENTIALID);
	}

	/**
	 * 重置 「CredentialId」
	 *
	 */
	@JsonIgnore
	public AIAccess resetCredentialId() {
		this.reset(FIELD_CREDENTIALID);
		return this;
	}
	

	/**
	 * 设置「扩展参数」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_EXTRAPARAMS)
	public AIAccess setExtraParams(Map<String, Object> val) {
		this.set(FIELD_EXTRAPARAMS, val);
		return this;
	}

	/**
	 * 获取「扩展参数」值
	 *
	 */
	@JsonIgnore
	public Map<String, Object> getExtraParams() {
		Object value = this.get(FIELD_EXTRAPARAMS);
		if(value == null) {
			return null;
		}
		if(value instanceof Map) {
			return (Map)value;
		}
		
		Map map = JsonUtils.as(value, Map.class);
		this.setExtraParams(map);
		
		return map;
	}

	/**
	 * 判断 「扩展参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsExtraParams() {
		return this.contains(FIELD_EXTRAPARAMS);
	}

	/**
	 * 重置 「扩展参数」
	 *
	 */
	@JsonIgnore
	public AIAccess resetExtraParams() {
		this.reset(FIELD_EXTRAPARAMS);
		return this;
	}
	
	/**
	 * 设置「TextReRankUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AIAccess setTextReRankUrl(String val) {
		this.set(FIELD_TEXTRERANKURL, val);
		return this;
	}

	/**
	 * 获取「TextReRankUrl」值
	 *
	 */
	@JsonIgnore
	public String getTextReRankUrl() {
		return (String) this.get(FIELD_TEXTRERANKURL);
	}

	/**
	 * 判断 「TextReRankUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTextReRankUrl() {
		return this.contains(FIELD_TEXTRERANKURL);
	}

	/**
	 * 重置 「TextReRankUrl」
	 *
	 */
	@JsonIgnore
	public AIAccess resetTextReRankUrl() {
		this.reset(FIELD_TEXTRERANKURL);
		return this;
	}
	
}
