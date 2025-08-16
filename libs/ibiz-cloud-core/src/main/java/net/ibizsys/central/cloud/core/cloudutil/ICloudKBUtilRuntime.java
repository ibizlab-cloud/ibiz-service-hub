package net.ibizsys.central.cloud.core.cloudutil;

import java.util.Map;

import org.springframework.data.domain.Page;

/**
 * 云体系KB功能组件接口
 * @author lionlau
 *
 */
public interface ICloudKBUtilRuntime extends ICloudUtilRuntime{

	
	/**
	 * KB平台插件前缀
	 */
	public final static String ADDIN_KBPLATFORM_PREFIX = "KBPLATFORM:";
	
	/**
	 * KB平台：milvus
	 */
	public final static String KBPLATFORM_MILVUS = "MILVUS";
	
	
	/**
	 * KB平台：elasticsearch
	 */
	public final static String KBPLATFORM_ES = "ES";
	
	/**
	 * KB平台：RagFlow
	 */
	public final static String KBPLATFORM_RAGFLOW = "RAGFLOW";
	
	
	/**
	 * KB平台：默认
	 */
	public final static String KBPLATFORM_DEFAULT = "DEFAULT";
	

	
	
//	/**
//	 * 建立知识库
//	 * @param strType 知识库类型
//	 * @param knowledgeBase
//	 * @return
//	 */
//	KnowledgeBase createKnowledgeBase(String strType, KnowledgeBase knowledgeBase);
//	
//	
//	/**
//	 * 获取知识库
//	 * @param strType 知识库类型
//	 * @param strKBName
//	 * @return
//	 */
//	KnowledgeBase getKnowledgeBase(String strType, String strKBName);
//	
//	
//	
//	/**
//	 * 更新知识库
//	 * @param strType 知识库类型
//	 * @param knowledgeBase
//	 * @return
//	 */
//	KnowledgeBase updateKnowledgeBase(String strType, KnowledgeBase knowledgeBase);
//	
//
//	/**
//	 * 删除知识库
//	 * @param strType 知识库类型
//	 * @param strKBName
//	 */
//	void deleteKnowledgeBase(String strType, String strKBName);
//	
//	
//	
//	/**
//	 * 建立数据集
//	 * @param strType 知识库类型
//	 * @param strKBName 知识库名称
//	 * @param collection
//	 * @return
//	 */
//	Collection createCollection(String strType, String strKBName, Collection collection);
//	
//	
//	/**
//	 * 获取数据集
//	 * @param strType 知识库类型
//	 * @param strKBName 知识库名称
//	 * @return
//	 */
//	Collection getCollection(String strType, String strKBName, String strCollectName);
//	
//	
//	
//	/**
//	 * 更新数据集
//	  * @param strType 知识库类型
//	 * @param strKBName 知识库名称
//	 * @param collection 数据集
//	 * @return
//	 */
//	Collection updateCollection(String strType, String strKBName, Collection collection);
//	
//
//	/**
//	 * 删除数据集
//	 * @param strType 知识库类型
//	 * @param strKBName 知识库名称
//	 * @param strCollectName  数据集名称
//	 */
//	void deleteCollection(String strType, String strKBName, String strCollectName);
	
	
	
	/**
	 * 查询知识块
	 * @param strType
	 * @param data
	 * @return
	 */
	Page fetchChunks(String strType, Map<String, Object> data);
}



