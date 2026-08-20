package net.ibizsys.model.dynamodel;



/**
 * 系统动态模型对象接口
 *
 */
public interface IPSSysDynaModel extends net.ibizsys.model.dynamodel.IPSDynaModel
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取模型内容
	 * @return
	 */
	String getContent();
	
	
	/**
	 * 获取模型标记
	 * @return
	 */
	String getModelTag();
	
	
	/**
	 * 获取模型标记2
	 * @return
	 */
	String getModelTag2();
	
	
	/**
	 * 获取模型标记3
	 * @return
	 */
	String getModelTag3();
	
	
	/**
	 * 获取模型标记4
	 * @return
	 */
	String getModelTag4();
	
	
	/**
	 * 获取模型用途
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaModelUsage}
	 * @return
	 */
	String getUsage();
}