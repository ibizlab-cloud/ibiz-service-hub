package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑节点参数模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO}运行时对象
 *
 */
public interface IPSDEUILogicParam extends net.ibizsys.model.dataentity.logic.IPSDELogicParamBase{

	
	
	/**
	 * 获取默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_DEFAULTVALUE}
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取默认值类型
	 * @return
	 */
	java.lang.String getDefaultValueType();
	
	
	/**
	 * 获取参数属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_REFFIELDNAME}
	 * @return
	 */
	java.lang.String getParamFieldName();
	
	
	/**
	 * 获取参数标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_PARAMTAG}
	 * @return
	 */
	java.lang.String getParamTag();
	
	
	/**
	 * 获取参数标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_PARAMTAG2}
	 * @return
	 */
	java.lang.String getParamTag2();
	
	
	/**
	 * 获取简单数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicParamDTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否当前容器对象
	 * @return
	 */
	boolean isActiveContainerParam();
	
	
	/**
	 * 获取是否当前部件对象
	 * @return
	 */
	boolean isActiveCtrlParam();
	
	
	/**
	 * 获取是否当前视图对象
	 * @return
	 */
	boolean isActiveViewParam();
	
	
	/**
	 * 获取是否应用全局参数绑定参数
	 * @return
	 */
	boolean isAppGlobalParam();
	
	
	/**
	 * 获取是否应用程序变量
	 * @return
	 */
	boolean isApplicationParam();
	
	
	/**
	 * 获取是否指定部件对象
	 * @return
	 */
	boolean isCtrlParam();
	
	
	/**
	 * 获取是否数据对象列表变量
	 * @return
	 */
	boolean isEntityListParam();
	
	
	/**
	 * 获取是否数据对象字典变量
	 * @return
	 */
	boolean isEntityMapParam();
	
	
	/**
	 * 获取是否分页查询结果变量
	 * @return
	 */
	boolean isEntityPageParam();
	
	
	/**
	 * 获取是否数据对象变量
	 * @return
	 */
	boolean isEntityParam();
	
	
	/**
	 * 获取是否应用环境变量
	 * @return
	 */
	boolean isEnvParam();
	
	
	/**
	 * 获取是否过滤器对象变量
	 * @return
	 */
	boolean isFilterParam();
	
	
	/**
	 * 获取是否上一次调用返回变量
	 * @return
	 */
	boolean isLastReturnParam();
	
	
	/**
	 * 获取是否导航上下文绑定参数
	 * @return
	 */
	boolean isNavContextParam();
	
	
	/**
	 * 获取是否导航视图参数绑定参数
	 * @return
	 */
	boolean isNavViewParamParam();
	
	
	/**
	 * 获取是否顶级视图会话共享参数绑定参数
	 * @return
	 */
	boolean isRouteViewSessionParam();
	
	
	/**
	 * 获取是否操作会话变量
	 * @return
	 */
	boolean isSessionParam();
	
	
	/**
	 * 获取是否简单数据列表变量
	 * @return
	 */
	boolean isSimpleListParam();
	
	
	/**
	 * 获取是否简单数据变量
	 * @return
	 */
	boolean isSimpleParam();
	
	
	/**
	 * 获取是否导航数据参数绑定参数
	 * @return
	 */
	boolean isViewNavDataParam();
	
	
	/**
	 * 获取是否当前视图会话共享参数绑定参数
	 * @return
	 */
	boolean isViewSessionParam();
}