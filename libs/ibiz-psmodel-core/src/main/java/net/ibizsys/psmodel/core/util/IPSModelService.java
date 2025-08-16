package net.ibizsys.psmodel.core.util;

import java.util.List;

import org.springframework.data.domain.Page;

public interface IPSModelService<M extends IPSModel, F extends IPSModelFilter> {

	public final static String METHOD_CREATE = "CREATE";

	public final static String METHOD_UPDATE = "UPDATE";

	public final static String METHOD_GET = "GET";

	public final static String METHOD_REMOVE = "REMOVE";

	public final static String METHOD_FETCH = "FETCH";
	
	public final static String METHOD_GETDRAFT = "GETDRAFT";
	
	/**
	 * 获取模型名称
	 * @param single
	 * @return
	 */
	String getModelName(boolean single);
	

	/**
	 * 获取数据对象
	 * @return
	 */
	M createDomain();
	
	
	/**
	 * 建立过滤器对象
	 * @return
	 */
	F createFilter();
	
	
	/**
	 * 获取数据对象
	 * @param 参数
	 * @return
	 */
	M getDomain(Object params);
	
	
	/**
	 *  获取过滤器对象
	 * @param 参数
	 * @return
	 */
	F getFilter(Object params);
	
	
	/**
	 * 建立模型
	 * @param m
	 * @param bGet 是否执行返回
	 */
	void create(M m, boolean get) throws Exception;
	
	
	
	/**
	 *  更新模型
	 * @param m
	 * @param bGet
	 */
	void update(M m, boolean get)throws Exception;
	
	
	
	
	/**
	 * 获取模型
	 * @param key
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	M get(String key, boolean tryMode)throws Exception;
	
	
	/**
	 * 删除模型
	 * @param key
	 * @throws Exception
	 */
	void remove(String key)throws Exception;
	
	
	
	
	/**
	 * 删除符合过滤条件的模型
	 * @param f
	 * @throws Exception
	 */
	void remove(F f) throws Exception;
	
	
	/**
	 * 查询符合过滤条件的模型
	 * @param f
	 * @return
	 * @throws Exception
	 */
	List<M> select(F f) throws Exception;
	
	
	
	/**
	 * 查询第一项符合过滤条件的模型
	 * @param f
	 * @return
	 * @throws Exception
	 */
	M selectOne(F f) throws Exception;
	
	
	/**
	 * 查询第一项符合过滤条件的模型
	 * @param f
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	M selectOne(F f, boolean tryMode) throws Exception;
	
	
	/**
	 * 查询符合过滤条件的模型
	 * @param m
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	boolean select(M m, boolean tryMode) throws Exception;
	
	
	
	/**
	 * 操作之前检查数据对象
	 * @param m
	 * @param updateMode
	 * @throws Exception
	 */
	void checkBefore(M m, boolean updateMode) throws Exception;
	
	
	
	/**
	 * 操作之后检查数据对象
	 * @param m
	 * @param updateMode
	 * @throws Exception
	 */
	void checkAfter(M m, boolean updateMode) throws Exception;
	
	
	
	/**
	 * 获取结果集
	 * @param f
	 * @return
	 * @throws Exception
	 */
	Page<M> fetch(F f) throws Exception;
	
	
	/**
	 * 获取结果集
	 * @param dataSetName
	 * @param f
	 * @return
	 * @throws Exception
	 */
	Page<M> fetch(String dataSetName, F f) throws Exception;
	
	
	/**
	 * 获取草稿数
	 * @param 参数
	 * @return
	 */
	M getDraft(M m) throws Exception;
	
	
	/**
	 * 执行自定义方法
	 * @param methodName
	 * @param key
	 * @param param
	 * @return
	 * @throws Exception
	 */
	Object invoke(String methodName, String key, Object param) throws Exception;
}
