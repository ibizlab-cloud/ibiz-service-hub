package net.ibizsys.central.cloud.core.util;

import java.util.List;

import net.ibizsys.central.util.ISearchContext;

/**
 * 资料文档搜索上下文对象接口
 * @author lionlau
 *
 */
public interface IDocumentSearchContext extends ISearchContext {
	/**
	 * 知识库引导词：禁用
	 */
	public final static int KBGUIDANCE_DISABLED = 0;
	
	/**
	 * 知识库引导词：启用
	 */
	public final static int KBGUIDANCE_ENABLED = 1;
	

	/**
	 * 指导信息
	 */
	public final static String PARAM_INSTRUCT = "instruct";
	
	/**
	 * 查询信息数组
	 */
	public final static String PARAM_QUERIES = "queries";
	
	
	
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
	List<String> getIds();
	
	
	
	/**
	 * 获取文档分类
	 * @return
	 */
	List<String> getCategories();
	
	
	
	/**
	 * 获取指定知识库的标识集合
	 * @return
	 */
	List<String> getKBIds();
	

}