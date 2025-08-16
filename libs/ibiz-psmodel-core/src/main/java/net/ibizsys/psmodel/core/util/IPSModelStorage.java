package net.ibizsys.psmodel.core.util;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 模型存储对象接口
 * @author lionlau
 *
 */
public interface IPSModelStorage {

	/**
	 * 支持模型
	 * @param modelName
	 * @return
	 */
	boolean supportModel(String modelName);
	
	/**
	 * 建立模型
	 * @param modelName 模型名称
	 * @param m
	 * @param bGet 是否执行返回
	 */
	void insert(String modelName, Map<String, Object> data) throws Exception;
	
	
	
	/**
	 * 更新模型
	 * @param modelName 模型名称 
	 * @param m
	 * @param append 是否附加模型
	 */
	void update(String modelName, Map<String, Object> data, boolean append)throws Exception;
	
	
	
	/**
	 * 删除模型
	 * @param modelName 模型名称
	 * @param key
	 * @return
	 * @throws Exception
	 */
	int delete(String modelName, String key)throws Exception;
	
	
	
	
	/**
	 * 删除符合过滤条件的模型
	 * @param modelName 模型名称
	 * @param f
	 * @return
	 * @throws Exception
	 */
	int delete(String modelName, IPSModelFilter f) throws Exception;
	
	
	
	
	/**
	 *  获取模型
	 * @param modelName 模型名称 
	 * @param key
	 * @param tryMode
	 */
	Map<String, Object> get(String modelName, String key, boolean tryMode)throws Exception;
	
	
	/**
	 * 查询符合过滤条件的模型
	 * @param modelName 模型名称
	 * @param f
	 * @return
	 * @throws Exception
	 */
	List<Map<String, Object>> select(String modelName, IPSModelFilter f) throws Exception;
	
	
	
	/**
	 * 查询第一项符合过滤条件的模型
	 * @param modelName 模型名称
	 * @param f
	 * @return
	 * @throws Exception
	 */
	Map<String, Object> selectOne(String modelName, IPSModelFilter f) throws Exception;
	
	
	
	/**
	 * 查询模型的全部数据
	 * @param modelName 模型名称
	 * @return
	 * @throws Exception
	 */
	List<Map<String, Object>> selectAll(String modelName) throws Exception;
	
	
	/**
	 * 清空全部
	 */
	void resetAll() throws Exception;
	
	
	/**
	 * 清空指定模型数据
	 */
	void reset(String modelName) throws Exception;
	
	
	/**
	 * 获取模型的名称集合
	 * @return
	 */
	java.util.Collection<String> modelNames() throws Exception;
	
	
	
	/**
	 * 查询符合过滤条件的模型
	 * @param modelName 模型名称
	 * @param dataSetName
	 * @param f
	 * @return
	 * @throws Exception
	 */
	Page<Map<String, Object>> fetch(String modelName, String dataSetName, IPSModelFilter f) throws Exception;
	
	
	/**
	 * 获取指定模型分页
	 * @param modelName
	 * @param dataSetName
	 * @param f
	 * @param toValueTypeRef
	 * @return
	 * @throws Exception
	 */
	<T> T fetch(String modelName, String dataSetName, IPSModelFilter f, TypeReference<T> toValueTypeRef) throws Exception;
}
