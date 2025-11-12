package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 文本排序请求数据对象
 * @author lionlau
 *
 */
public class TextReRankRequest extends EntityBase {

	public final static String FIELD_DOCUMENTS = "documents";

	public final static String FIELD_SESSIONID = "sessionid";
	
	public final static String FIELD_MODEL = "model";
	
	
	/**
	 * 模式
	 */
	public final static String FIELD_MODE = "mode";
	
	/**
	 * 查询内容
	 */
	public final static String FIELD_QUERY = "query";
	
//	/**
//	 * 返回文档
//	 */
//	public final static String FIELD_RETURNDOCUMENTS = "returndocuments";
	
	
	/**
	 * 指导信息
	 */
	public final static String FIELD_INSTRUCT = "instruct";
	
	
	/**
	 * 返回记录数
	 */
	public final static String FIELD_TOPN = "topn";
	
	
	/**
	 * 设置「文档集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_DOCUMENTS)
	public TextReRankRequest setDocuments(List<Document> val) {
		this.set(FIELD_DOCUMENTS, val);
		return this;
	}

	/**
	 * 获取「文档集合」值
	 *
	 */
	@JsonIgnore
	public List<Document> getDocuments() {
		Object objValue = this.get(FIELD_DOCUMENTS);
		if (objValue == null) {
			return null;
		}
		
		return (List<Document>) objValue;
	}

	/**
	 * 判断 「文档集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDocuments() {
		return this.contains(FIELD_DOCUMENTS);
	}

	/**
	 * 重置 「文档集合」
	 *
	 */
	@JsonIgnore
	public TextReRankRequest resetDocuments() {
		this.reset(FIELD_DOCUMENTS);
		return this;
	}
	
	
	
	

	/**
	 * 设置「会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankRequest setSessionId(String val) {
		this.set(FIELD_SESSIONID, val);
		return this;
	}

	/**
	 * 获取「会话标识」值
	 *
	 */
	@JsonIgnore
	public String getSessionId() {
		return (String) this.get(FIELD_SESSIONID);
	}

	/**
	 * 判断 「会话标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSessionId() {
		return this.contains(FIELD_SESSIONID);
	}

	/**
	 * 重置 「会话标识」
	 *
	 */
	@JsonIgnore
	public TextReRankRequest resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}
	
	
	/**
	 * 设置「模型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankRequest setModel(String val) {
		this.set(FIELD_MODEL, val);
		return this;
	}

	/**
	 * 获取「模型」值
	 *
	 */
	@JsonIgnore
	public String getModel() {
		return (String) this.get(FIELD_MODEL);
	}

	/**
	 * 判断 「模型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsModel() {
		return this.contains(FIELD_MODEL);
	}

	/**
	 * 重置 「模型」
	 *
	 */
	@JsonIgnore
	public TextReRankRequest resetModel() {
		this.reset(FIELD_MODEL);
		return this;
	}
	
	

//	
//	/**
//     * 设置「是否返回文档」
//     *
//     * @param val
//    */
//    @JsonIgnore
//    public TextReRankRequest setReturnDocuments(Integer val) {
//        this.set(FIELD_RETURNDOCUMENTS, val);
//        return this;
//    }
//
//    /**
//     * 获取「是否返回文档」值
//     *
//    */
//    @JsonIgnore
//    public Integer getReturnDocuments() {
//        try{
//            return DataTypeUtils.getIntegerValue(this.get(FIELD_RETURNDOCUMENTS),null);
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * 判断 「是否返回文档」是否有值
//     *
//    */
//    @JsonIgnore
//    public boolean containsReturnDocuments() {
//        return this.contains(FIELD_RETURNDOCUMENTS);
//    }
//
//    /**
//     * 重置 「是否返回文档」
//     *
//    */
//    @JsonIgnore
//    public TextReRankRequest resetReturnDocuments() {
//        this.reset(FIELD_RETURNDOCUMENTS);
//        return this;
//    }
    
    
    /**
	 * 设置「返回记录数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankRequest setTopN(Integer val) {
		this.set(FIELD_TOPN, val);
		return this;
	}

	/**
	 * 获取「返回记录数」值
	 *
	 */
	@JsonIgnore
	public Integer getTopN() {
		return DataTypeUtils.asInteger(this.get(FIELD_TOPN), null);
	}

	/**
	 * 判断 「返回记录数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTopN() {
		return this.contains(FIELD_TOPN);
	}

	/**
	 * 重置 「返回记录数」
	 *
	 */
	@JsonIgnore
	public TextReRankRequest resetTopN() {
		this.reset(FIELD_TOPN);
		return this;
	}
	
	
	/**
	 * 设置「模式」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankRequest setMode(String val) {
		this.set(FIELD_MODE, val);
		return this;
	}

	/**
	 * 获取「模式」值
	 *
	 */
	@JsonIgnore
	public String getMode() {
		return (String) this.get(FIELD_MODE);
	}

	/**
	 * 判断 「模式」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMode() {
		return this.contains(FIELD_MODE);
	}

	/**
	 * 重置 「模式」
	 *
	 */
	@JsonIgnore
	public TextReRankRequest resetMode() {
		this.reset(FIELD_MODE);
		return this;
	}
	
	
	/**
	 * 设置「查询内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankRequest setQuery(String val) {
		this.set(FIELD_QUERY, val);
		return this;
	}

	/**
	 * 获取「查询内容」值
	 *
	 */
	@JsonIgnore
	public String getQuery() {
		return (String) this.get(FIELD_QUERY);
	}

	/**
	 * 判断 「查询内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsQuery() {
		return this.contains(FIELD_QUERY);
	}

	/**
	 * 重置 「查询内容」
	 *
	 */
	@JsonIgnore
	public TextReRankRequest resetQuery() {
		this.reset(FIELD_QUERY);
		return this;
	}
	
	/**
	 * 设置「指导信息」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankRequest setInstruct(String val) {
		this.set(FIELD_INSTRUCT, val);
		return this;
	}

	/**
	 * 获取「指导信息」值
	 *
	 */
	@JsonIgnore
	public String getInstruct() {
		return (String) this.get(FIELD_INSTRUCT);
	}

	/**
	 * 判断 「指导信息」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsInstruct() {
		return this.contains(FIELD_INSTRUCT);
	}

	/**
	 * 重置 「指导信息」
	 *
	 */
	@JsonIgnore
	public TextReRankRequest resetInstruct() {
		this.reset(FIELD_INSTRUCT);
		return this;
	}
	
}
