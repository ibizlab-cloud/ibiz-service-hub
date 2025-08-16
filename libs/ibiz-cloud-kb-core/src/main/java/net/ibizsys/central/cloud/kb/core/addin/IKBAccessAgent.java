package net.ibizsys.central.cloud.kb.core.addin;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.KBAccess;
import net.ibizsys.central.cloud.kb.core.cloudutil.ICloudKBUtilRuntimeContext;

/**
 * KB访问代理
 * @author lionlau
 *
 */
public interface IKBAccessAgent extends ICloudKBUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param aiAccess
	 * @throws Exception
	 */
	void init(ICloudKBUtilRuntimeContext ctx, KBAccess kbAccess) throws Exception;
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
	/**
	 * 获取代理数据
	 * @return
	 */
	KBAccess getAgentData();

	
	/**
	 * 获取KB类型
	 * @return
	 */
	String getKBType();
	
	
	
//	/**
//	 * 建立知识库
//	 * @param knowledgeBase
//	 * @return
//	 */
//	KnowledgeBase createKnowledgeBase(KnowledgeBase knowledgeBase) throws Throwable;
//	
//	
//	/**
//	 * 获取知识库
//	 * @param strKBName
//	 * @return
//	 */
//	KnowledgeBase getKnowledgeBase(String strType, String strKBName) throws Throwable;
//	
//	
//	
//	/**
//	 * 更新知识库
//	 * @param knowledgeBase
//	 * @return
//	 */
//	KnowledgeBase updateKnowledgeBase(KnowledgeBase knowledgeBase) throws Throwable;
//	
//
//	/**
//	 * 删除知识库
//	 * @param strKBName
//	 */
//	void deleteKnowledgeBase(String strKBName) throws Throwable;
//	
//	
//	
//	/**
//	 * 建立数据集
//	 * @param strKBName 知识库名称
//	 * @param collection
//	 * @return
//	 */
//	Collection createCollection(String strKBName, Collection collection) throws Throwable;
//	
//	
//	/**
//	 * 获取数据集
//	 * @param strKBName 知识库名称
//	 * @param strCollectName 数据集名称 
//	 * @return
//	 */
//	Collection getCollection(String strKBName, String strCollectName) throws Throwable;
//	
//	
//	
//	/**
//	 * 更新数据集
//	 * @param strKBName 知识库名称
//	 * @param collection 数据集
//	 * @return
//	 */
//	Collection updateCollection(String strKBName, Collection collection) throws Throwable;
//	
//
//	/**
//	 * 删除数据集
//	 * @param strKBName 知识库名称
//	 * @param strCollectName  数据集名称
//	 */
//	void deleteCollection(String strKBName, String strCollectName) throws Throwable;
	
	
	/**
	 * 查询知识片段
	 * @param iChunkSearchContext
	 * @return
	 * @throws Throwable
	 */
	Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
}
