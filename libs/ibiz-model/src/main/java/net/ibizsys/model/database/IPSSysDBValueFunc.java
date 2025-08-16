package net.ibizsys.model.database;



/**
 *
 */
public interface IPSSysDBValueFunc extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取函数类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBValueFuncType}
	 * @return
	 */
	java.lang.String getDBValueFuncType();
	
	
	/**
	 * 获取输入值数据库类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getInputStdDataType();
	
	
	/**
	 * 获取输出值数据库类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getOutputStdDataType();
	
	
	/**
	 * 获取输出值格式化
	 * @return
	 */
	java.lang.String getOutputValueFormat();
	
	
	/**
	 * 获取后端模板插件对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端模板插件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取值函数标记
	 * @return
	 */
	java.lang.String getValueFuncTag();
	
	
	/**
	 * 获取值函数标记2
	 * @return
	 */
	java.lang.String getValueFuncTag2();
}