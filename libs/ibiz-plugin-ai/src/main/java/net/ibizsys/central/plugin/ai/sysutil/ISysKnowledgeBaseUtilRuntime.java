package net.ibizsys.central.plugin.ai.sysutil;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.ai.IKnowledgeBaseUtilRuntimeBase;
import net.ibizsys.central.cloud.core.dataentity.service.ICodeListEnum;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEActionEnum;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEDataSetEnum;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEFieldEnum;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDERuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.plugin.ai.addin.IChunkClusterer;
import net.ibizsys.central.plugin.ai.addin.IChunkGraphExtractor;
import net.ibizsys.central.plugin.ai.addin.IChunkRetriever;
import net.ibizsys.central.plugin.ai.addin.IDocumentSplitter;

/**
 * 系统知识库功能组件运行时接口
 * @author lionlau
 *
 */
public interface ISysKnowledgeBaseUtilRuntime extends ISysUtilRuntime, IKnowledgeBaseUtilRuntimeBase{

	/**
	 * 实体标记：知识库
	 */
	public final static String DE_KNOWLEDGE_BASE = "KNOWLEDGE_BASE";
	
	/**
	 * 实体标记：文档
	 */
	public final static String DE_DOCUMENT = "DOCUMENT";
	
	
	/**
	 * 实体标记：片段
	 */
	public final static String DE_CHUNK = "CHUNK";
	
	/**
	 * 实体标记：标记
	 */
	public final static String DE_TAG = "TAG";
	
	
	/**
	 * 实体标记：图对象
	 */
	public final static String DE_GRAPH_ENTITY = "GRAPH_ENTITY";
	
	
	/**
	 * 实体标记：图对象类型
	 */
	public final static String DE_GRAPH_ENTITY_TYPE = "GRAPH_ENTITY_TYPE";
	
	
	/**
	 * 实体标记：图对象片段
	 */
	public final static String DE_GRAPH_ENTITY_CHUNK = "GRAPH_ENTITY_CHUNK";
	
	/**
	 * 实体标记：图连接
	 */
	public final static String DE_GRAPH_RELATION = "GRAPH_RELATION";
	
	/**
	 * 实体标记：图对象连接片段
	 */
	public final static String DE_GRAPH_RELATION_CHUNK = "GRAPH_RELATION_CHUNK";
	
	/**
	 * 实体标记：知识库成员
	 */
	public final static String DE_MEMBER = "MEMBER";
	
	
//	
//	/**
//	 * 数据集标识：未解析文档
//	 */
//	public final static String DATASET_DOCUMENT_UNPARSED = "UNPARSED";
//	
//	
	
	
	/**
	 * 属性标记：主键
	 */
	public final static String FIELD_ID = "ID";
	
	/**
	 * 属性标记：名称
	 */
	public final static String FIELD_NAME = "NAME";
	
	/**
	 * 知识库可见类型
	 * @author lionlau
	 *
	 */
	public static enum KnowledgeBaseVisibility implements ICodeListEnum{
		PRIVATE("私有"),PUBLIC("公开");
		
		final String _text;
		KnowledgeBaseVisibility(String text) {
			this._text = text;
		}
		
		public String text() {
			return this._text;
		}
	}

	
	/**
	 * 知识库预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum KnowledgeBaseField implements IProxyDEFieldEnum{
		GUIDANCE_PROMPT("资料库引导提示词", true),
		CHUNK_METHOD("切片模式", false),
		PARSER_CONFIG("分析器配置", false),
		TAG_SETS("标记集合", true),
		CHAT_MODEL_ID("交谈模型标识", true),
		EMBEDDING_MODEL_ID("交谈模型标识", true),
		RERANK_MODEL_ID("交谈模型标识", true),
		VISIBILITY("可见范围", true, KnowledgeBaseVisibility.class),
		PAGE_INDEX("页面索引", true),
		RERANK("重排序", true);
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		KnowledgeBaseField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		KnowledgeBaseField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	public static enum KnowledgeBaseAction implements IProxyDEActionEnum{
		UPDATE_STATUS("更新知识库状态", true), LS("列出文档", true);
		
		final String _text;
		final boolean _required;
		
		KnowledgeBaseAction(String text) {
			this(text, false);
		}
		
		KnowledgeBaseAction(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	
	public static enum KnowledgeBaseDataSet implements IProxyDEDataSetEnum{
		VALID("启用知识库", true);
		
		final String _text;
		final boolean _required;
		
		KnowledgeBaseDataSet(String text) {
			this(text, false);
		}
		
		KnowledgeBaseDataSet(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	public static interface IKnowledgeBaseProxyDERuntime extends IProxyDERuntime<KnowledgeBaseField, KnowledgeBaseAction, KnowledgeBaseDataSet>{
		
	}

	/**
	 * 知识库成员类型
	 * @author lionlau
	 *
	 */
	public static enum MemberRoleType implements ICodeListEnum{
		ADMIN("管理员"),USER("普通成员"),READER("只读成员");
		
		final String _text;
		MemberRoleType(String text) {
			this._text = text;
		}
		
		public String text() {
			return this._text;
		}
	}

	
	/**
	 * 知识库成员预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum MemberField implements IProxyDEFieldEnum{
		KNOWLEDGE_BASE_ID("知识库标识", false),
		ROLE_TYPE("角色类型", false, MemberRoleType.class ),
		USER_ID("内容", false);
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		MemberField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		MemberField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	public static enum MemberDataSet implements IProxyDEDataSetEnum{
		VALID("启用成员", true);
		
		final String _text;
		final boolean _required;
		
		MemberDataSet(String text) {
			this(text, false);
		}
		
		MemberDataSet(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	public static interface IMemberProxyDERuntime extends IProxyDERuntime<MemberField, IProxyDEActionEnum, MemberDataSet>{
		
	}
	
	
	/**
	 * 文档状态
	 * @author lionlau
	 *
	 */
	public static enum DocumentStatus implements ICodeListEnum{
		UNPARSED("未解析"), READY("准备"),PARSING("解析中"), CHUNK_PENDING("待切片"), CHUNKING("切片中"),FAILED("失败");
		
		final String _text;
		DocumentStatus(String text) {
			this._text = text;
		}
		
		public String text() {
			return this._text;
		}
	}
	
	
	/**
	 * 文档预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum DocumentField implements IProxyDEFieldEnum{
		KNOWLEDGE_BASE_ID("知识库标识", false),
		TYPE("类型", true),
		CONTENT("内容", false),
		RESULT("结果", true),
		STATUS("状态", false, DocumentStatus.class),
		FILE("文件", true),
		FILE_TYPE("文件类型", true),
		CUSTOM_CHUNK("自定义切片", false),
		CHUNK_METHOD("切片模式", false),
		PARSER_CONFIG("分析器配置", false),
		TAG_SETS("标记集合", true),
		CATEGORIES("目录", true),
		USER_TAG("用户标记", true),
		USER_TAG2("用户标记", true);
		
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		DocumentField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		DocumentField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	public static interface IDocumentProxyDERuntime extends IProxyDERuntime<DocumentField, DocumentAction, DocumentDataSet>{
		
	}
	
	/**
	 * 片段类型
	 * @author lionlau
	 *
	 */
	public static enum ChunkType implements ICodeListEnum{
		ORIGINAL("原始文本"),CLUSTER("聚合文本"),MANUAL("手动文本"),INDEX("页面索引"),PAGE("页面");
		
		final String _text;
		ChunkType(String text) {
			this._text = text;
		}
		
		public String text() {
			return this._text;
		}
	}
	

	/**
	 * 片段预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum ChunkField implements IProxyDEFieldEnum{
		
		DOCUMENT_ID("文档标识", false),
		DOCUMENT_NAME("文档名称", true),
		CONTENT("内容", false),
		CONTENT_VECTOR("内容向量", false),
		QUESTIONS("问题", true),
		QUESTIONS_VECTOR("问题向量", true),
		KEYWORDS("关键字", true),
		TAGS("标记", true),
		PID("父标识", true),
		PATH("路径", true),
		SEQUENCE("序列", true),
		TYPE("类型", true, ChunkType.class),
		ACTIVE("启用", true),
		METADATA("元数据", true),
		USER_TAG("用户标记", true),
		USER_TAG2("用户标记2", true),
		USER_TAG3("用户标记3", true),
		USER_TAG4("用户标记4", true);
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		ChunkField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		ChunkField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	

	public static enum ChunkDataSet implements IProxyDEDataSetEnum{
		VALID("启用片段", true);
		
		final String _text;
		final boolean _required;
		
		ChunkDataSet(String text) {
			this(text, false);
		}
		
		ChunkDataSet(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	
	public static interface IChunkProxyDERuntime extends IProxyDERuntime<ChunkField, IProxyDEActionEnum, ChunkDataSet>{
		
	}
	
	
	/**
	 * 图实体引用类型
	 * @author lionlau
	 *
	 */
	public static enum GraphEntityReferenceType implements ICodeListEnum{
		GENERIC("泛指"),SPECIFIC("特指");
		
		final String _text;
		GraphEntityReferenceType(String text) {
			this._text = text;
		}
		
		public String text() {
			return this._text;
		}
	}
	
	
	
	/**
	 * 图实体对象预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum GraphEntityField implements IProxyDEFieldEnum{
		CONFIDENCE("置信度", true),
		KNOWLEDGE_BASE_ID("知识库标识", false),
		TYPE("类型", false),
		NORMALIZED_NAME("规范名称", true),
		DESCRIPTION("描述", true), 
		DESCRIPTION_VECTOR("描述向量", true),
		CONTEXT("上下文", true),
		CONTEXT_VECTOR("上下文向量", true),
		REFERENCE_TYPE("引用类型", true, GraphEntityReferenceType.class);
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		GraphEntityField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		GraphEntityField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	

	public static interface IGraphEntityProxyDERuntime extends IProxyDERuntime<GraphEntityField, IProxyDEActionEnum, IProxyDEDataSetEnum>{
		
	}
	
	/**
	 * 图实体对象资料片段预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum GraphEntityChunkField implements IProxyDEFieldEnum{
		ENTITY_ID("实体标识", false),
		CHUNK_ID("资料片段标识", false);
		
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		GraphEntityChunkField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		GraphEntityChunkField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	/**
	 * 图连线对象预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum GraphRelationField implements IProxyDEFieldEnum{
		CONFIDENCE("置信度", true),
		KNOWLEDGE_BASE_ID("知识库标识", false),
		SOURCE_ID("源标识", false),
		TARGET_ID("源标识", false),
		NORMALIZED_NAME("规范名称", true),
		DESCRIPTION("描述", true),
		DESCRIPTION_VECTOR("描述向量", true);
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		GraphRelationField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		GraphRelationField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	public static interface IGraphRelationProxyDERuntime extends IProxyDERuntime<GraphRelationField, IProxyDEActionEnum, IProxyDEDataSetEnum>{
		
	}

	
	/**
	 * 图实体对象资料片段预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum GraphRelationChunkField implements IProxyDEFieldEnum{
		RELATION_ID("实体标识", false),
		CHUNK_ID("资料片段标识", false);
		
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		GraphRelationChunkField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		GraphRelationChunkField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	public static interface IGraphRelationChunkProxyDERuntime extends IProxyDERuntime<GraphRelationChunkField, IProxyDEActionEnum, IProxyDEDataSetEnum>{
		
	}

	
	/**
	 * 标记预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum TagField implements IProxyDEFieldEnum{
		SET_ID("集合标识", false),
		VALUE("标记值", false),
		DESCRIPTION("标记说明", false);
		
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		TagField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		TagField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	public static enum TagDataSet implements IProxyDEDataSetEnum{
		VALID("启用", true);
		
		final String _text;
		final boolean _required;
		
		TagDataSet(String text) {
			this(text, false);
		}
		
		TagDataSet(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	public static interface ITagProxyDERuntime extends IProxyDERuntime<TagField, IProxyDEActionEnum, TagDataSet>{
		
	}
	
	
	/**
	 * 图实体类型预置属性枚举
	 * @author lionlau
	 *
	 */
	public static enum GraphEntityTypeField implements IProxyDEFieldEnum{
		VALUE("标记值", false),
		DESCRIPTION("标记说明", false);
		
		
		final String _text;
		final boolean _required;
		final Class<? extends ICodeListEnum> _enum;
		GraphEntityTypeField(String text, boolean required) {
			this._text = text;
			this._required = required;
			this._enum = null;
		}
		
		GraphEntityTypeField(String text, boolean required, Class<? extends ICodeListEnum> _enum) {
			this._text = text;
			this._required = required;
			this._enum = _enum;
		}
		
		public String text() {
			return this._text;
		}
		
		public boolean required() {
			return this._required;
		}
		
		public Class<? extends ICodeListEnum> codelist() {
			return this._enum;
		}
	}
	
	public static enum GraphEntityTypeDataSet implements IProxyDEDataSetEnum{
		VALID("启用", true);
		
		final String _text;
		final boolean _required;
		
		GraphEntityTypeDataSet(String text) {
			this(text, false);
		}
		
		GraphEntityTypeDataSet(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	public static interface IGraphEntityTypeProxyDERuntime extends IProxyDERuntime<GraphEntityTypeField, IProxyDEActionEnum, GraphEntityTypeDataSet>{
		
	}
	
	
	/**
	 * 文档分隔器插件前缀
	 */
	public final static String ADDIN_SPLITTER_PREFIX = "SPLITTER:";
	
	
	/**
	 *片段聚合器插件前缀
	 */
	public final static String ADDIN_CLUSTERER_PREFIX = "CLUSTERER:";
	
	
	/**
	 *图展开器插件前缀
	 */
	public final static String ADDIN_GRAPHEXTRACTOR_PREFIX = "GRAPHEXTRACTOR:";
	
	
	/**
	 *召回器插件前缀
	 */
	public final static String ADDIN_RETRIEVER_PREFIX = "RETRIEVER:";
	
	
	
	
	/**
	 * 聚合器：默认
	 */
	public final static String CLUSTERER_DEFAULT = "DEFAULT";
	
	
	/**
	 * 聚合器：默认
	 */
	public final static String CLUSTERER_KMEANSPLUSPLUS = "KMEANSPLUSPLUS";
	
	/**
	 * 聚合器：DensityBased
	 */
	public final static String CLUSTERER_DENSITYBASED = "DENSITYBASED";
	
	
	/**
	 * 图展开器：默认
	 */
	public final static String GRAPHEXTRACTOR_GENERAL = "GENERAL";
	
	
	/**
	 * 图展开器：轻量
	 */
	public final static String GRAPHEXTRACTOR_LIGHT = "LIGHT";
	
	/**
	 * 识别器：默认
	 */
	public final static String RECOGNIZER_GENERAL = "GENERAL";
	
	/**
	 * 召回器：默认
	 */
	public final static String RETRIEVER_GENERAL = "GENERAL";
	
	
	/**
	 * 召回器：图rag
	 */
	public final static String RETRIEVER_GRAPHRAG = "GRAPHRAG";
	
	
	public static enum DocumentAction implements IProxyDEActionEnum{
		CHUNK("切片"), RECHUNK("重新切片"),
		REINDEX("重新索引"),
		PARSE("解析", true),
		GET_FULL_TEXT("获取文档完整文本", true),
		GET_PAGE_INDEX("获取文档页面目录", true),
		UPDATE_STATUS("更新文档状态", true);
		
		final String _text;
		final boolean _required;
		
		DocumentAction(String text) {
			this(text, false);
		}
		
		DocumentAction(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	public static enum DocumentDataSet implements IProxyDEDataSetEnum{
		UNPARSED("未切片", true);
		
		final String _text;
		final boolean _required;
		
		DocumentDataSet(String text) {
			this(text, false);
		}
		
		DocumentDataSet(String text, boolean _required) {
			this._text = text;
			this._required = _required;
		}
		
		public String text() {
			return this._text;
		}

		@Override
		public boolean required() {
			return this._required;
		}
	}
	
	
	
	
	/**
	 * 是否存在指定文档分割器对象
	 * @param strSplitterName
	 * @return
	 */
	boolean containsDocumentSplitter(String strSplitterName);
	
	
	/**
	 * 注册文档分割器对象
	 * @param strSplitterName
	 * @param iSplitter
	 */
	void registerDocumentSplitter(String strSplitterName, IDocumentSplitter iSplitter);
	
	
	/**
	 * 注销文档分割器对象
	 * @param strSplitterName
	 * @param iSplitter
	 * @return
	 */
	boolean unregisterDocumentSplitter(String strSplitterName, IDocumentSplitter iSplitter);
	
	/**
	 * 是否存在指定资料片段聚合器对象
	 * @param strClustererName
	 * @return
	 */
	boolean containsChunkClusterer(String strClustererName);
	
	
	/**
	 * 注册资料片段聚合器对象
	 * @param strClustererName
	 * @param iClusterer
	 */
	void registerChunkClusterer(String strClustererName, IChunkClusterer iClusterer);
	
	
	/**
	 * 注销资料片段聚合器对象
	 * @param strClustererName
	 * @param iClusterer
	 * @return
	 */
	boolean unregisterChunkClusterer(String strClustererName, IChunkClusterer iClusterer);
	
	
	/**
	 * 是否存在指定资料片段图展开器对象
	 * @param strGraphExtractorName
	 * @return
	 */
	boolean containsChunkGraphExtractor(String strGraphExtractorName);
	
	
	/**
	 * 注册资料片段图展开器对象
	 * @param strGraphExtractorName
	 * @param iGraphExtractor
	 */
	void registerChunkGraphExtractor(String strGraphExtractorName, IChunkGraphExtractor iGraphExtractor);
	
	
	/**
	 * 注销资料片段图展开器对象
	 * @param strGraphExtractorName
	 * @param iGraphExtractor
	 * @return
	 */
	boolean unregisterChunkGraphExtractor(String strGraphExtractorName, IChunkGraphExtractor iGraphExtractor);
	
	/**
	 * 是否存在指定资料片段召回器对象
	 * @param strRetrieverName
	 * @return
	 */
	boolean containsChunkRetriever(String strRetrieverName);
	
	
	/**
	 * 注册资料片段召回器对象
	 * @param strRetrieverName
	 * @param iRetriever
	 */
	void registerChunkRetriever(String strRetrieverName, IChunkRetriever iRetriever);
	
	
	/**
	 * 注销资料片段召回器对象
	 * @param strRetrieverName
	 * @param iRetriever
	 * @return
	 */
	boolean unregisterChunkRetriever(String strRetrieverName, IChunkRetriever iRetriever);
	
	
	/**
	 * 查询知识块
	 * @param strType
	 * @param data
	 * @return
	 */
	Page fetchChunks(String strType, Map<String, Object> data);
	
	
	/**
	 * 查询知识块
	 * @param strType
	 * @param chatCompletionRequest
	 * @return
	 */
	Page fetchChunksByHistories(String strType, Map<String, Object> data);
	
	
//	/**
//	 * 查询文档
//	 * @param strType
//	 * @param data
//	 * @return
//	 */
//	Page fetchDocuments(String strType, Map<String, Object> data);
	
	
	List listFiles(String kb_id, Map<String, Object> params);
	
	/**
	 * 建立文档
	 * @param kb_id
	 * @param document
	 * @return
	 */
	Document createDocument(String kb_id, Document document);

	/**
	 * 更新文档
	 * @param kb_id
	 * @param document_id
	 * @param document
	 * @return
	 */
	Document updateDocument(String typekb_id, String document_id, Document document);
	
	/**
	 * 保存文档
	 * @param kb_id
	 * @param document_id
	 * @param document
	 * @return
	 */
	Document saveDocument(String typekb_id, String document_id, Document document);
	

	/**
	 * 获取文档
	 * @param kb_id
	 * @param document_id
	 * @return
	 */
	Document getDocument(String kb_id, String document_id);

	
	/**
	 * 删除文档
	 * @param kb_id
	 * @param document_id
	 * @return
	 */
	Integer deleteDocument(String kb_id, String document_id);
	
	
	
	/**
	 * 下载文档
	 * @param kb_id
	 * @param document_id
	 * @param request
	 * @param response
	 * @return
	 */
	void downloadDocument(String kb_id, String document_id, HttpServletRequest request, HttpServletResponse response);
	
	

	
	/**
	 * 建立片段
	 * @param kb_id
	 * @param document_id
	 * @param chunk
	 * @return
	 */
	Chunk createChunk(String kb_id, String document_id, Chunk chunk);

	/**
	 * 更新片段
	 * @param kb_id
	 * @param document_id
	 * @param chunk_id
	 * @param chunk
	 * @return
	 */
	Chunk updateChunk(String kb_id, String document_id, String chunk_id, Chunk chunk);
	
	
	/**
	 * 保存片段
	 * @param kb_id
	 * @param document_id
	 * @param chunk_id
	 * @param chunk
	 * @return
	 */
	Chunk saveChunk(String kb_id, String document_id, String chunk_id, Chunk chunk);

	/**
	 * 获取知识片段
	 * @param kb_id
	 * @param document_id
	 * @param chunk_id
	 * @return
	 */
	Chunk getChunk(String kb_id, String document_id, String chunk_id);

	/**
	 * 删除知识片段
	 * @param kb_id
	 * @param document_id
	 * @param chunk_id
	 * @return
	 */
	Integer deleteChunk(String kb_id, String document_id, String chunk_id);
}
