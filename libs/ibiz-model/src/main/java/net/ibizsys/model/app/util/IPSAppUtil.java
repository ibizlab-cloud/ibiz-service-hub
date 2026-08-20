package net.ibizsys.model.app.util;



/**
 * 应用功能配置模型对象接口
 *
 */
public interface IPSAppUtil extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取功能实体10名称
	 * @return
	 */
	String getUtilPSDE10Name();
	
	
	/**
	 * 获取功能实体2名称
	 * @return
	 */
	String getUtilPSDE2Name();
	
	
	/**
	 * 获取功能实体3名称
	 * @return
	 */
	String getUtilPSDE3Name();
	
	
	/**
	 * 获取功能实体4名称
	 * @return
	 */
	String getUtilPSDE4Name();
	
	
	/**
	 * 获取功能实体5名称
	 * @return
	 */
	String getUtilPSDE5Name();
	
	
	/**
	 * 获取功能实体6名称
	 * @return
	 */
	String getUtilPSDE6Name();
	
	
	/**
	 * 获取功能实体7名称
	 * @return
	 */
	String getUtilPSDE7Name();
	
	
	/**
	 * 获取功能实体8名称
	 * @return
	 */
	String getUtilPSDE8Name();
	
	
	/**
	 * 获取功能实体9名称
	 * @return
	 */
	String getUtilPSDE9Name();
	
	
	/**
	 * 获取功能实体名称
	 * @return
	 */
	String getUtilPSDEName();
	
	
	/**
	 * 获取动态功能参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUtilParams();
	
	
	/**
	 * 获取功能标记
	 * @return
	 */
	String getUtilTag();
	
	
	/**
	 * 获取功能类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppUtilType}
	 * @return
	 */
	String getUtilType();
}