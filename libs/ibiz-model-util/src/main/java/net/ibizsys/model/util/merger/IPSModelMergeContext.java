package net.ibizsys.model.util.merger;


/**
 * 模型合并上下文
 * @author lionlau
 *
 */
public interface IPSModelMergeContext {

	String getPSModelFolderPath();
	
	
	String getMergePSModelFolderPath();
	
	
	String getDstPSModelFolderPath();
	
	
	String getPSModelTagField(Class<?> cls);
	
	/**
	 * 是否支持合并指定类型成员
	 * @param cls
	 * @return
	 */
	Boolean isEnableMergeChild(Class<?> cls);
	
	
	/**
	 * 是否支持合并指定类型
	 * @param cls
	 * @return
	 */
	Boolean isAppendChildOnly(Class<?> cls);
	
	
	/**
	 * 是否支持合并指定类型成员
	 * @param cls
	 * @param strFieldName
	 * @return
	 */
	Boolean isEnableMergeChild(Class<?> cls, String strFieldName);
	
	
	/**
	 * 是否支持合并指定类型成员
	 * @param cls
	 * @return
	 */
	Boolean isEnableMergeSingle(Class<?> cls);
	
	/**
	 * 获取参数
	 * @param strKey
	 * @return
	 */
	Object getParam(String strKey);
	
	
	/**
	 * 设置参数
	 * @param strKey
	 * @param objValue
	 */
	void setParam(String strKey, Object objValue);
	
	
	
	/**
	 * 获取模型合并器
	 * @param cls
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IPSModelMerger getPSModelMerger(Class<?> cls, boolean bTryMode) throws Exception;
	
	/**
	 * 获取模型列表合并器
	 * @param cls
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IPSModelListMerger getPSModelListMerger(Class<?> cls, boolean bTryMode) throws Exception;
	
	
	
	/**
	 * 记录合并
	 * @param object
	 * @param strFieldName
	 * @return
	 */
	boolean logMerge(Object object, String strFieldName);
	
	
	void registerIgnoreMergeModel(String strPSModelPath);
	
	
	boolean unregisterIgnoreMergeModel(String strPSModelPath);
	
	
	boolean isIgnoreMergeModel(String strPSModelPath);
}
