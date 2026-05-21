package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 文档
 */
public class Document extends EntityBase {

	/**
	 *文档标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 *文档名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 * 文档类型
	 */
	public final static String FIELD_TYPE = "type";
	
	/**
	 * 文档内容
	 */
	public final static String FIELD_CONTENT = "content";
	
	
	/**
	 *  知识库标识
	 */
	public final static String FIELD_KBID = "kbid";
	
	
	/**
	 *  知识库名称
	 */
	public final static String FIELD_KBNAME = "kbname";
	
	
	/**
	 *  文档分类
	 */
	public final static String FIELD_CATEGORIES = "categories";
	
	
	
	/**
	 * 文件类型
	 */
	public final static String FIELD_FILETYPE = "filetype";
	
	
	/**
	 * 设置「文档标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「文档标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「文档标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「文档标识」
	 *
	 */
	@JsonIgnore
	public Document resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「文档名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「文档名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「文档名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「文档名称」
	 *
	 */
	@JsonIgnore
	public Document resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「文档类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「文档类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「文档类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「文档类型」
	 *
	 */
	@JsonIgnore
	public Document resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	
	/**
	 * 设置「文档内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setContent(String val) {
		this.set(FIELD_CONTENT, val);
		return this;
	}

	/**
	 * 获取「文档内容」值
	 *
	 */
	@JsonIgnore
	public String getContent() {
		return (String) this.get(FIELD_CONTENT);
	}

	/**
	 * 判断 「文档内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsContent() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 重置 「文档内容」
	 *
	 */
	@JsonIgnore
	public Document resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

	/**
	 * 设置「 知识库标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setKBId(String val) {
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
	public Document resetKBId() {
		this.reset(FIELD_KBID);
		return this;
	}
	
	
	/**
	 * 设置「 知识库名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setKBName(String val) {
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
	public Document resetKBName() {
		this.reset(FIELD_KBNAME);
		return this;
	}
	
	
	/**
	 * 设置「 文档分类」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setCategories(String val) {
		this.set(FIELD_CATEGORIES, val);
		return this;
	}

	/**
	 * 获取「 文档分类」值
	 *
	 */
	@JsonIgnore
	public String getCategories() {
		return (String) this.get(FIELD_CATEGORIES);
	}

	/**
	 * 判断 「 文档分类」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCategories() {
		return this.contains(FIELD_CATEGORIES);
	}

	/**
	 * 重置 「 文档分类」
	 *
	 */
	@JsonIgnore
	public Document resetCategories() {
		this.reset(FIELD_CATEGORIES);
		return this;
	}
	
	
	/**
	 * 设置「文件类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setFileType(String val) {
		this.set(FIELD_FILETYPE, val);
		return this;
	}

	/**
	 * 获取「文件类型」值
	 *
	 */
	@JsonIgnore
	public String getFileType() {
		return (String) this.get(FIELD_FILETYPE);
	}

	/**
	 * 判断 「文件类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsFileType() {
		return this.contains(FIELD_FILETYPE);
	}

	/**
	 * 重置 「文件类型」
	 *
	 */
	@JsonIgnore
	public Document resetFileType() {
		this.reset(FIELD_FILETYPE);
		return this;
	}
	
}
