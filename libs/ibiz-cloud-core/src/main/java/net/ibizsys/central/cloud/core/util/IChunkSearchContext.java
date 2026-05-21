package net.ibizsys.central.cloud.core.util;

import java.util.List;

import net.ibizsys.central.util.ISearchContext;

/**
 * 资料片段搜索上下文对象接口
 * @author lionlau
 *
 */
public interface IChunkSearchContext extends ISearchContext {

	/**
	 * 文本重排序：禁用
	 */
	public final static int TEXTRERANK_DISABLED = 0;
	
	/**
	 * 文本重排序：启用
	 */
	public final static int TEXTRERANK_ENABLED = 1;
	
	
	/**
	 * 文本重排序：自动（优先使用重排序，如重排序没有结果，则关闭重排序）
	 */
	public final static int TEXTRERANK_AUTO = 2;
	
	
	/**
	 * 知识图谱召回：禁用
	 */
	public final static int GRAPHRAG_DISABLED = 0;
	
	/**
	 * 知识图谱召回：启用
	 */
	public final static int GRAPHRAG_ENABLED = 1;
	
	
	/**
	 * Raptor召回：禁用
	 */
	public final static int RAPTOR_DISABLED = 0;
	
	/**
	 * Raptor召回：启用
	 */
	public final static int RAPTOR_ENABLED = 1;
	
	/**
	 * Raptor召回：启用并移除SOURCE片段
	 */
	public final static int RAPTOR_ENABLEDWITHOUTSOURCE = 2;
	
	/**
	 * Vector召回：禁用
	 */
	public final static int VECTOR_DISABLED = 0;
	
	/**
	 * Vector召回：启用
	 */
	public final static int VECTOR_ENABLED = 1;
	
	
	/**
	 * 页面目录：禁用
	 */
	public final static int PAGEINDEX_DISABLED = 0;
	
	/**
	 * 页面目录：启用
	 */
	public final static int PAGEINDEX_ENABLED = 1;
	
	
	/**
	 * 页面目录：启用，如果未定义则使用默认模式
	 */
	public final static int PAGEINDEX_AUTO = 2;
	
	
	/**
	 * 知识库引导词：禁用
	 */
	public final static int KBGUIDANCE_DISABLED = 0;
	
	/**
	 * 知识库引导词：启用
	 */
	public final static int KBGUIDANCE_ENABLED = 1;
	
	/**
	 * 历史消息集合
	 */
	public final static String PARAM_HISTORIES = "histories";
	
	/**
	 * graphrag的三元组
	{
		"subject": {
	      "name": "主语实体名称（字符串，必填）",
	      "type": "主语类型（如'人物'、'车辆'、'动物'、'证件'、'组织'等；若无法确定则为'未知'）"
	    },
	    "predicate": "主语与目标对象之间的语义关系（如'子女'、'持有'、'接种'、'所属'等；若问题直接询问主语自身属性，则为null）",
	    "object": {
	      "name": "关系所指向的具体对象名称（字符串；若 predicate 为 null 或对象未在对话中明确提及，则为 null）",
	      "type": "关系所指向的对象类型（如'人物'、'疫苗'、'车辆'等；若 predicate 为 null，则此字段也为 null）"
	    },
	    "attribute": "待查询的具体属性字段（如'出生日期'、'有效期'、'必需疫苗列表'、'签发日期'等，必填）"
	 }
	 */
	public final static String PARAM_TRIPLET = "triplet";
	
	/**
	 * 指导信息
	 */
	public final static String PARAM_INSTRUCT = "instruct";
	
	/**
	 * 查询信息数组
	 */
	public final static String PARAM_QUERIES = "queries";
	
	/**
	 * 查询三元组数组
	 */
	public final static String PARAM_TRIPLETS = "triplets";
	
	/**
	 * 资料视图url
	 */
	public final static String PARAM_CHUNKVIEWURL = "chunkviewurl";
	
	/**
	 * 资料序号前缀
	 */
	public final static String PARAM_CHUNKSNPREFIX = "chunksnprefix";
	
	
	/**
	 * 相似度阈值
	 * @return
	 */
	Float getSimilarityThreshold();
	
	
	Float getVectorSimilarityWeight();
	
	/**
	 * 获取是否进行文本重新排序
	 * @return
	 */
	Integer getTextReRank();
	
	
	/**
	 * 获取页面索引模式
	 * @return
	 */
	Integer getPageIndex();
	
	
	/**
	 * 获取是否进行Graph增强召回
	 * @return
	 */
	Integer getGraphRAG();
	
	
	/**
	 * 获取Raptor模式
	 * @return
	 */
	Integer getRaptor();
	
	
	/**
	 * 获取是否返回知识库引导词
	 * @return
	 */
	Integer getKBGuidance();
	
	
	/**
	 * 获取指导信息
	 * @return
	 */
	String getInstruct();
	
	
	/**
	 * 获取查询清单
	 * @return
	 */
	List<String> getQueries();
	
	
	/**
	 * 获取指定文档的标识集合
	 * @return
	 */
	List<String> getDocIds();
	
	
	
	/**
	 * 获取文档分类
	 * @return
	 */
	List<String> getDocCategories();
	
	
	
	/**
	 * 获取指定知识库的标识集合
	 * @return
	 */
	List<String> getKBIds();
	
	
	
	/**
	 * 获取跨语言集合
	 * @return
	 */
	List<String> getLanguages();
	
	
	/**
	 * 获取每个文档优化获取片段数
	 * @return
	 */
	Integer getDocTopK();
	
	
	/**
	 * 获取片段类型集合
	 * @return
	 */
	List<String> getTypes();
	
	
	
	/**
	 * 指定是否根片段，未指定时为全部
	 * @return
	 */
	Integer getRoot();
	
	
	
	/**
	 * 获取文档名称
	 * @return
	 */
	List<String> getDocNames();
	
	
	/**
	 * 获取是否输出ChunkView链接格式，如chunkview://{id}
	 * @return
	 */
	String getChunkViewUrl();
	

	
	/**
	 * 获取资料编号前缀
	 * @return
	 */
	String getChunkSNPrefix();
}