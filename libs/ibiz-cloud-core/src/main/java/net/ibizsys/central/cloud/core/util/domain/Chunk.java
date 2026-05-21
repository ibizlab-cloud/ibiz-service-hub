package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 数据片段
 */
public class Chunk extends EntityBase {

	/**
	 * 数据片段标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * 父数据片段标识
	 */
	public final static String FIELD_PID = "pid";
	
	/**
	 * 数据片段名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 *  数据片段类型
	 */
	public final static String FIELD_TYPE = "type";

	
	/**
	 *  数据片段内容
	 */
	public final static String FIELD_CONTENT = "content";
	
	
	/**
	 *  相似度
	 */
	public final static String FIELD_SIMILARITY = "similarity";
	
	/**
	 *  原始相似度
	 */
	public final static String FIELD_ORIGINAL = "original";
	
	
	/**
	 *  文档标识
	 */
	public final static String FIELD_DOCID = "docid";
	
	
	/**
	 *  文档名称
	 */
	public final static String FIELD_DOCNAME = "docname";
	
	/**
	 *  文档关键字
	 */
	public final static String FIELD_DOCKEYWORD = "dockeyword";
	
	
	/**
	 *  资料相关问题
	 */
	public final static String FIELD_QUESTION = "question";
	
	
	/**
	 *  资料关键字
	 */
	public final static String FIELD_KEYWORD = "keyword";
	
	
	/**
	 *  资料标记
	 */
	public final static String FIELD_TAG = "tag";
	
	
	/**
	 *  知识库标识
	 */
	public final static String FIELD_KBID = "kbid";
	
	
	/**
	 *  知识库名称
	 */
	public final static String FIELD_KBNAME = "kbname";
	
	
	/**
	 *  序列
	 */
	public final static String FIELD_SEQUENCE = "sequence";
	
	/**
	 *  元数据
	 */
	public final static String FIELD_METADATA = "metadata";
	
	
	
	/**
	 * 设置「 数据片段标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「 数据片段标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「 数据片段标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「 数据片段标识」
	 *
	 */
	@JsonIgnore
	public Chunk resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「 父数据片段标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setPid(String val) {
		this.set(FIELD_PID, val);
		return this;
	}

	/**
	 * 获取「 父数据片段标识」值
	 *
	 */
	@JsonIgnore
	public String getPid() {
		return (String) this.get(FIELD_PID);
	}

	/**
	 * 判断 「 父数据片段标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsPid() {
		return this.contains(FIELD_PID);
	}

	/**
	 * 重置 「 父数据片段标识」
	 *
	 */
	@JsonIgnore
	public Chunk resetPid() {
		this.reset(FIELD_PID);
		return this;
	}
	
	/**
	 * 设置「 数据片段名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「 数据片段名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「 数据片段名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「 数据片段名称」
	 *
	 */
	@JsonIgnore
	public Chunk resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「 数据片段类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「 数据片段类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「 数据片段类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「 数据片段类型」
	 *
	 */
	@JsonIgnore
	public Chunk resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	
	/**
	 * 设置「 数据片段内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setContent(String val) {
		this.set(FIELD_CONTENT, val);
		return this;
	}

	/**
	 * 获取「 数据片段内容」值
	 *
	 */
	@JsonIgnore
	public String getContent() {
		return (String) this.get(FIELD_CONTENT);
	}

	/**
	 * 判断 「 数据片段内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsContent() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 重置 「 数据片段内容」
	 *
	 */
	@JsonIgnore
	public Chunk resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

	
	 /**
     * 设置「相似度」
     *
     * @param val
    */
    @JsonIgnore
    public Chunk setSimilarity(Double val) {
        this.set(FIELD_SIMILARITY, val);
        return this;
    }

    /**
     * 获取「相似度」值
     *
    */
    @JsonIgnore
    public Double getSimilarity() {
        try{
            return DataTypeUtils.asDouble(this.get(FIELD_SIMILARITY),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「相似度」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSimilarity() {
        return this.contains(FIELD_SIMILARITY);
    }

    /**
     * 重置 「相似度」
     *
    */
    @JsonIgnore
    public Chunk resetSimilarity() {
        this.reset(FIELD_SIMILARITY);
        return this;
    }
    
    
	/**
	 * 设置「 文档标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setDocId(String val) {
		this.set(FIELD_DOCID, val);
		return this;
	}

	/**
	 * 获取「 文档标识」值
	 *
	 */
	@JsonIgnore
	public String getDocId() {
		return (String) this.get(FIELD_DOCID);
	}

	/**
	 * 判断 「 文档标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDocId() {
		return this.contains(FIELD_DOCID);
	}

	/**
	 * 重置 「 文档标识」
	 *
	 */
	@JsonIgnore
	public Chunk resetDocId() {
		this.reset(FIELD_DOCID);
		return this;
	}
	
	
	/**
	 * 设置「 文档名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setDocName(String val) {
		this.set(FIELD_DOCNAME, val);
		return this;
	}

	/**
	 * 获取「 文档名称」值
	 *
	 */
	@JsonIgnore
	public String getDocName() {
		return (String) this.get(FIELD_DOCNAME);
	}

	/**
	 * 判断 「 文档名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDocName() {
		return this.contains(FIELD_DOCNAME);
	}

	/**
	 * 重置 「 文档名称」
	 *
	 */
	@JsonIgnore
	public Chunk resetDocName() {
		this.reset(FIELD_DOCNAME);
		return this;
	}
	
	
	/**
	 * 设置「 文档关键字」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setDocKeyword(String val) {
		this.set(FIELD_DOCKEYWORD, val);
		return this;
	}

	/**
	 * 获取「 文档关键字」值
	 *
	 */
	@JsonIgnore
	public String getDocKeyword() {
		return (String) this.get(FIELD_DOCKEYWORD);
	}

	/**
	 * 判断 「 文档关键字」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDocKeyword() {
		return this.contains(FIELD_DOCKEYWORD);
	}

	/**
	 * 重置 「 文档关键字」
	 *
	 */
	@JsonIgnore
	public Chunk resetDocKeyword() {
		this.reset(FIELD_DOCKEYWORD);
		return this;
	}
    
	
	
	/**
	 * 设置「 关键字」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setKeyword(String val) {
		this.set(FIELD_KEYWORD, val);
		return this;
	}

	/**
	 * 获取「 关键字」值
	 *
	 */
	@JsonIgnore
	public String getKeyword() {
		return (String) this.get(FIELD_KEYWORD);
	}

	/**
	 * 判断 「 关键字」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsKeyword() {
		return this.contains(FIELD_KEYWORD);
	}

	/**
	 * 重置 「 关键字」
	 *
	 */
	@JsonIgnore
	public Chunk resetKeyword() {
		this.reset(FIELD_KEYWORD);
		return this;
	}
	
	
	/**
	 * 设置「 问题」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setQuestion(String val) {
		this.set(FIELD_QUESTION, val);
		return this;
	}

	/**
	 * 获取「 问题」值
	 *
	 */
	@JsonIgnore
	public String getQuestion() {
		return (String) this.get(FIELD_QUESTION);
	}

	/**
	 * 判断 「 问题」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsQuestion() {
		return this.contains(FIELD_QUESTION);
	}

	/**
	 * 重置 「 问题」
	 *
	 */
	@JsonIgnore
	public Chunk resetQuestion() {
		this.reset(FIELD_QUESTION);
		return this;
	}
	
	
	/**
	 * 设置「 知识库标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setKBId(String val) {
		this.set(FIELD_KBID, val);
		return this;
	}

	/**
	 * 获取「 知识库标识」值
	 *
	 */
	@JsonIgnore
	public String getKBId() {
		return (String) this.get(FIELD_KBID);
	}

	/**
	 * 判断 「 知识库标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsKBId() {
		return this.contains(FIELD_KBID);
	}

	/**
	 * 重置 「 知识库标识」
	 *
	 */
	@JsonIgnore
	public Chunk resetKBId() {
		this.reset(FIELD_KBID);
		return this;
	}
	
	
	/**
	 * 设置「 知识库名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setKBName(String val) {
		this.set(FIELD_KBNAME, val);
		return this;
	}

	/**
	 * 获取「 知识库名称」值
	 *
	 */
	@JsonIgnore
	public String getKBName() {
		return (String) this.get(FIELD_KBNAME);
	}

	/**
	 * 判断 「 知识库名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsKBName() {
		return this.contains(FIELD_KBNAME);
	}

	/**
	 * 重置 「 知识库名称」
	 *
	 */
	@JsonIgnore
	public Chunk resetKBName() {
		this.reset(FIELD_KBNAME);
		return this;
	}
	
	
	/**
	 * 设置「 标记」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setTag(String val) {
		this.set(FIELD_TAG, val);
		return this;
	}

	/**
	 * 获取「 标记」值
	 *
	 */
	@JsonIgnore
	public String getTag() {
		return (String) this.get(FIELD_TAG);
	}

	/**
	 * 判断 「 标记」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTag() {
		return this.contains(FIELD_TAG);
	}

	/**
	 * 重置 「 标记」
	 *
	 */
	@JsonIgnore
	public Chunk resetTag() {
		this.reset(FIELD_TAG);
		return this;
	}
	
	
	
	 /**
     * 设置「原始相似度」
     *
     * @param val
    */
    @JsonIgnore
    public Chunk setOriginal(Double val) {
        this.set(FIELD_ORIGINAL, val);
        return this;
    }

    /**
     * 获取「原始相似度」值
     *
    */
    @JsonIgnore
    public Double getOriginal() {
        try{
            return DataTypeUtils.asDouble(this.get(FIELD_ORIGINAL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「原始相似度」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOriginal() {
        return this.contains(FIELD_ORIGINAL);
    }

    /**
     * 重置 「原始相似度」
     *
    */
    @JsonIgnore
    public Chunk resetOriginal() {
        this.reset(FIELD_ORIGINAL);
        return this;
    }
    
    
    
    /**
     * 设置「序列」
     *
     * @param val
    */
    @JsonIgnore
    public Chunk setSequence(Long val) {
        this.set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「序列」值
     *
    */
    @JsonIgnore
    public Long getSequence() {
        try{
            return DataTypeUtils.asLong(this.get(FIELD_SEQUENCE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「序列」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSequence() {
        return this.contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「序列」
     *
    */
    @JsonIgnore
    public Chunk resetSequence() {
        this.reset(FIELD_SEQUENCE);
        return this;
    }
    
    
    /**
     * 设置「元数据」
     *
     * @param val
    */
    @JsonIgnore
    public Chunk setMetadata(Object val) {
        this.set(FIELD_METADATA, val);
        return this;
    }

    /**
     * 获取「元数据」值
     *
    */
    @JsonIgnore
    public Object getMetadata() {
        try{
            return this.get(FIELD_METADATA);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「元数据」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMetadata() {
        return this.contains(FIELD_METADATA);
    }

    /**
     * 重置 「元数据」
     *
    */
    @JsonIgnore
    public Chunk resetMetadata() {
        this.reset(FIELD_METADATA);
        return this;
    }
}